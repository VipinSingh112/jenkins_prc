package com.nbp.wra.application.form.web.portlet;

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
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;
import com.nbp.wra.application.util.WRAApplicationUtil;

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
		"javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/wra/download/Pdf" 
		}, service = MVCResourceCommand.class
)

public class WRADownloadPdfRsourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(WRADownloadPdfRsourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "WRA Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "WRA Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long wraApplicationId = ParamUtil.getLong(resourceRequest, "wraApplicationId");
		String checkPdfDownloadWithoutDocument = ParamUtil.getString(resourceRequest, "checkPdfDownloadWithoutDocument");
		DLFileEntry dlFileEntry = null;
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		WRAApplication wraApplication= null;
		try {
		wraApplication = 	WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
		}catch (Exception e) {
		}
		try {
			String pdfTemplate = commonsUtil.replaceWraApplicationPdfVar(wraApplication.getTypeOfApplication(), wraApplication.getTypeOfTransaction(), wraApplication.getTypeOfPermit(),
					wraApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);
//		 it converted template into file
			File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
					"other-crafttrader", pdfTemplate);
			String fileNameContentDisp = "WRAApplicationPDF.pdf";
			mimeType = MimeTypesUtil.getContentType(file);
			title = fileNameContentDisp;
			ServiceContext serviceContext = new ServiceContext();
			serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
			  DLFolder dlFolder = createFolder(themeDisplay.getUserId(), wraApplicationId, themeDisplay.getScopeGroupId()); 
			  DLFolder medicalAppDlFolder=null;
			  medicalAppDlFolder= WRAApplicationUtil.createSubFolder(themeDisplay.getUserId(), wraApplicationId, themeDisplay.getScopeGroupId(),
					  "WRA Application Form PDF", "WRA Application Form PDF");
			commonsUtil.updateFolderPermission(medicalAppDlFolder);
			FileEntry docFileEntry = null;
			FileEntry entry=null;
			long fileEntryId=0;
			String titleofPdf="";
			DLVersionNumberIncrease dlVersionNumberIncrease=null;
			String fileName="";
			String pdfDownloadURL = "";
			try {
				System.out.println("themeDisplay.getScopeGroupId()-----------------------"+themeDisplay.getScopeGroupId());
				System.out.println("medicalAppDlFolder.getFolderId()----------"+medicalAppDlFolder.getFolderId());
				System.out.println("fileNameContentDisp----------"+fileNameContentDisp);
			entry=DLAppLocalServiceUtil.getFileEntryByFileName(themeDisplay.getScopeGroupId(), medicalAppDlFolder.getFolderId(), fileNameContentDisp);
			System.out.println("entry----------"+entry);
			titleofPdf=entry.getTitle();
			fileName=entry.getFileName();
			fileEntryId=entry.getFileEntryId();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(entry==null) {
			try {
				docFileEntry=	_dlAppService.addFileEntry("WRAApplicationPDF" + wraApplicationId, medicalAppDlFolder.getRepositoryId(),
						medicalAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
						StringPool.BLANK, file, null, null, null, serviceContext);
				commonsUtil.filePermissionForDownload(docFileEntry);
				pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("WRAApplicationPDF" + wraApplicationId,
						wraApplication.getGroupId());
				docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				wraApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
				WRAApplicationLocalServiceUtil.updateWRAApplication(wraApplication);
				_log.info("************Download Pdf URL New File Added*************" + pdfDownloadURL);
				jsonOBJ.put("fileUrl", pdfDownloadURL);
			} catch (Exception e) {
			}
			}else {
				_dlAppService.deleteFileEntry(fileEntryId);
				docFileEntry=	_dlAppService.addFileEntry("WRAApplicationPDF" + wraApplicationId, medicalAppDlFolder.getRepositoryId(),
						medicalAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
						StringPool.BLANK, file, null, null, null, serviceContext);
				pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				commonsUtil.filePermissionForDownload(docFileEntry);				
				dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("WRAApplicationPDF" + wraApplicationId,
						wraApplication.getGroupId());
				docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				wraApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
				WRAApplicationLocalServiceUtil.updateWRAApplication(wraApplication);
				jsonOBJ.put("fileUrl", pdfDownloadURL);
			}
			wraApplication = WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
            
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
	private DLFolder createFolder(long userId, long wraApplicationId, long groupId) {

		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(wraApplicationId));
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(wraApplicationId), ROOT_FOLDER_DESCRIPTION, false,
						serviceContext);
			}else {
				 dlFolder=DLFolderLocalServiceUtil.getDLFolder(wraApplicationId);
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
