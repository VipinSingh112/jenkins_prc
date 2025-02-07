package com.nbp.ncra.application.form.web.portlet;

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
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicationUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;
import com.nbp.ncra.application.upload.documents.util.NCRAApplicationUtil;

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
		"javax.portlet.name=" + NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
		"mvc.command.name=/ncra/download/Pdf" 
		}, service = MVCResourceCommand.class
)

public class NCRADownloadPdfRsourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NCRADownloadPdfRsourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "NCRA Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "NCRA Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
		String checkPdfDownloadWithoutDocument = ParamUtil.getString(resourceRequest, "checkPdfDownloadWithoutDocument");
		DLFileEntry dlFileEntry = null;
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		com.nbp.ncra.application.form.service.model.NcraApplication ncraApplication= null;
		try {
		ncraApplication = NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
		System.out.println("catergory"+ncraApplication.getDoYouWant());
		}catch (Exception e) {
		}
		try {
			String pdfTemplate = commonsUtil.replaceNCRAApplicationPdfVar(ncraApplication.getDoYouWant(),ncraApplication.getNcraApplicationId(),
					themeDisplay, checkPdfDownloadWithoutDocument);
//		 it converted template into file
			File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
					"weighing-device-1", pdfTemplate);
		System.out.println("wenbjh");
			String fileNameContentDisp = "NCRAApplicationForm.pdf";
			mimeType = MimeTypesUtil.getContentType(file);
			title = fileNameContentDisp;
			ServiceContext serviceContext = new ServiceContext();
			serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
			  DLFolder dlFolder = createFolder(themeDisplay.getUserId(), ncraApplicationId, themeDisplay.getScopeGroupId()); 
			  DLFolder ncraAppDlFolder=null;
			  ncraAppDlFolder= NCRAApplicationUtil.createSubFolder(themeDisplay.getUserId(), ncraApplicationId, themeDisplay.getScopeGroupId(),
					  "NCRA Application Form PDF", "NCRA Application Form PDF");
			commonsUtil.updateFolderPermission(ncraAppDlFolder);
			FileEntry docFileEntry = null;
			FileEntry entry=null;
			long fileEntryId=0;
			String titleofPdf="";
			DLVersionNumberIncrease dlVersionNumberIncrease=null;
			String fileName="";
			String pdfDownloadURL = "";
			try {
			entry=DLAppLocalServiceUtil.getFileEntryByFileName(themeDisplay.getScopeGroupId(), ncraAppDlFolder.getFolderId(), fileNameContentDisp);
			titleofPdf=entry.getTitle();
			fileName=entry.getFileName();
			fileEntryId=entry.getFileEntryId();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(entry==null) {
			try {
				docFileEntry=	_dlAppService.addFileEntry("NCRAApplicationPDF" + ncraApplicationId, ncraAppDlFolder.getRepositoryId(),
						ncraAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
						StringPool.BLANK, file, null, null, null, serviceContext);
				commonsUtil.filePermissionForDownload(docFileEntry);
				pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("NCRAApplicationPDF" + ncraApplicationId,
						ncraApplication.getGroupId());
				docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				ncraApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
				NcraApplicationLocalServiceUtil.updateNcraApplication(ncraApplication);
				jsonOBJ.put("fileUrl", pdfDownloadURL);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}else {
				_dlAppService.deleteFileEntry(fileEntryId);
				docFileEntry=	_dlAppService.addFileEntry("NCRAApplicationPDF" + ncraApplicationId, ncraAppDlFolder.getRepositoryId(),
						ncraAppDlFolder.getFolderId(), fileNameContentDisp, mimeType, title, null, StringPool.BLANK,
						StringPool.BLANK, file, null, null, null, serviceContext);
				pdfDownloadURL = DLURLHelperUtil.getDownloadURL(docFileEntry, docFileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				commonsUtil.filePermissionForDownload(docFileEntry);				
				dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntryByExternalReferenceCode("NCRAApplicationPDF" + ncraApplicationId,
						ncraApplication.getGroupId());
				docFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				ncraApplication.setPdfFileEntryId(dlFileEntry.getFileEntryId());
				NcraApplicationLocalServiceUtil.updateNcraApplication(ncraApplication);
				jsonOBJ.put("fileUrl", pdfDownloadURL);
			}
			_log.info("************Download Pdf URL New File Added*************" + pdfDownloadURL);
			ncraApplication = NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
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
	private DLFolder createFolder(long userId, long ncraApplicationId, long groupId) {

		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(ncraApplicationId));
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(ncraApplicationId), ROOT_FOLDER_DESCRIPTION, false,
						serviceContext);
			}else {
				 dlFolder=DLFolderLocalServiceUtil.getDLFolder(ncraApplicationId);
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
