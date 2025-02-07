package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.model.DLVersionNumberIncrease;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;
import com.nbp.jtb.application.util.JTBApplicationUtil;

import java.io.File;
import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
	(immediate = true,
	property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/jtb/download/Pdf" 
		}, service = MVCResourceCommand.class
)

public class JTBDownloadPdfRsourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JTBDownloadPdfRsourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "JTB Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "JTB Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String checkPdfDownloadWithoutDocument = ParamUtil.getString(resourceRequest, "checkPdfDownloadWithoutDocument");
		DLFileEntry dlFileEntry = null;
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		JTBApplication jtbApplication= null;
		try {
		jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		}catch (Exception e) {
		}
		try {
			String pdfTemplate = commonsUtil.replaceJtbPdfVar(jtbApplication.getTypeOfApplication(), jtbApplication.getCategoryTypeValAccomo(),
					jtbApplication.getOtherCategories(), jtbApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
//		 it converted template into file
			File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
					"other-crafttrader", pdfTemplate);
		System.out.println("wenbjh");
			String fileNameContentDisp = "JTBApplicationPDF.pdf";
			mimeType = MimeTypesUtil.getContentType(file);
			title = fileNameContentDisp;
			ServiceContext serviceContext = new ServiceContext();
			serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
			  DLFolder dlFolder = createFolder(themeDisplay.getUserId(), jtbApplicationId, themeDisplay.getScopeGroupId()); 
			  DLFolder jtbAppDlFolder=null;
			  jtbAppDlFolder= JTBApplicationUtil.createSubFolder(themeDisplay.getUserId(), jtbApplicationId, themeDisplay.getScopeGroupId(),
					  "JTB Application Form PDF", "JTB Application Form PDF");
			commonsUtil.updateFolderPermission(jtbAppDlFolder);
			FileEntry docFileEntry = null;
			FileEntry entry=null;
			long fileEntryId=0;
			String titleofPdf="";
			DLVersionNumberIncrease dlVersionNumberIncrease=null;
			String fileName="";
			String pdfDownloadURL = "";
			try {
			entry=DLAppLocalServiceUtil.getFileEntryByFileName(themeDisplay.getScopeGroupId(), jtbAppDlFolder.getFolderId(), fileNameContentDisp);
			titleofPdf=entry.getTitle();
			fileName=entry.getFileName();
			fileEntryId=entry.getFileEntryId();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(entry==null) {
			try {
				docFileEntry=	_dlAppService.addFileEntry("JTBApplicationPDF" + jtbApplicationId, jtbAppDlFolder.getRepositoryId(),
						jtbAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
						StringPool.BLANK, file, null, null, null, serviceContext);
				commonsUtil.filePermissionForDownload(docFileEntry);
				pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("JTBApplicationPDF" + jtbApplicationId,
						jtbApplication.getGroupId());
				docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				jtbApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
				JTBApplicationLocalServiceUtil.updateJTBApplication(jtbApplication);
				_log.info("************Download Pdf URL New File Added*************" + pdfDownloadURL);
				jsonOBJ.put("fileUrl", pdfDownloadURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}else {
				_dlAppService.deleteFileEntry(fileEntryId);
				docFileEntry=	_dlAppService.addFileEntry("JTBApplicationPDF" + jtbApplicationId, jtbAppDlFolder.getRepositoryId(),
						jtbAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
						StringPool.BLANK, file, null, null, null, serviceContext);
				pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				commonsUtil.filePermissionForDownload(docFileEntry);				
				dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("JTBApplicationPDF" + jtbApplicationId,
						jtbApplication.getGroupId());
				docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				jtbApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
				JTBApplicationLocalServiceUtil.updateJTBApplication(jtbApplication);
				jsonOBJ.put("fileUrl", pdfDownloadURL);
			}
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
            
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
		return false;
	}
	private DLFolder createFolder(long userId, long jtbApplicationId, long groupId) {

		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(jtbApplicationId));
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(jtbApplicationId), ROOT_FOLDER_DESCRIPTION, false,
						serviceContext);
			}else {
				 dlFolder=DLFolderLocalServiceUtil.getDLFolder(jtbApplicationId);
			}
		} catch (PortalException e1) {
		} catch (SystemException e1) {
		} catch (Exception e) {
			e.printStackTrace();
		}

		return dlFolder;
	}
	@Reference
	private CommonsUtil commonsUtil;
	@Reference
	private Portal _portal;
	@Reference
	DLAppService _dlAppService;

	@Reference
	DLAppLocalService _dlAppLocalService;
}
