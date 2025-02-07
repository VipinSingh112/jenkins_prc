package com.nbp.fire.brigade.dashboard.web.portlet;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.fire.brigade.dashboard.web.constants.FireBrigadeDashbaordPortletKeys;

import java.io.File;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
	(
		immediate = true,
		property = {
		"javax.portlet.name=" + FireBrigadeDashbaordPortletKeys.FIREBRIGADEDASHBAORD,
		"mvc.command.name=fire/expired/document" 
		},
		service = MVCResourceCommand.class)
public class SupportedDocumentExpiredResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static Log _log = LogFactoryUtil.getLog(SupportedDocumentExpiredResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("File upload started-----------------------");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String fileID = ParamUtil.getString(resourceRequest, "fileID");
		long fireBrigadeAppId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");
		_log.info("fireBrigadeAppId-----------------------[]"+fireBrigadeAppId);
		String documentNumber = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "documentNumber"));
		String issueDate = ParamUtil.getString(resourceRequest, "issueDate");
		String documentuploadCounter = ParamUtil.getString(resourceRequest, "documentuploadCounter");
		Date formattedIssueDate = null;
		try {
			formattedIssueDate = dateFormat.parse(issueDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			_log.error(e1.getMessage());
		}
		String expiryDate = ParamUtil.getString(resourceRequest, "expiryDate");
		Date formattedExpiryDate = null;
		try {
			formattedExpiryDate = dateFormat.parse(expiryDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			_log.error(e1.getMessage());
		}
		String documentName = ParamUtil.getString(resourceRequest, "documentName");
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		File files = null;
		ServiceContext serviceContext = new ServiceContext();
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		String fileName = uploadPortletRequest.getFileName(fileID);
		files = uploadPortletRequest.getFile(fileID);
		try {
			FileEntry fileEntry = null;
			InputStream inputStream = uploadPortletRequest.getFileAsStream(fileID);
			if (Validator.isNotNull(inputStream)) {
				mimeType = MimeTypesUtil.getContentType(fileName);
				title = documentName;
				serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
				DLFolder supportingDocumentParentFolder = null;
				DLFolder supportingDocumentsParentFolder = null;
				DLFolder supportingDocumentsSubFolder = null;
				List<DLFileEntry> dlFileEntries = null;
				FileEntry dlFileEntry = null;
				ArrayList<String> fileEntryNew = new ArrayList<String>();
				try {
					supportingDocumentParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Fire Brigade Supported Documents");
					supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
							supportingDocumentParentFolder.getFolderId(), String.valueOf(fireBrigadeAppId));
					dlFileEntry = DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(),
							supportingDocumentsParentFolder.getFolderId(), title);
					fileEntry =_dlAppLocalService.updateFileEntry(themeDisplay.getUserId(), dlFileEntry.getFileEntryId(),
							fileName, mimeType, title, "", "", "", null, inputStream, files.length(),
							formattedExpiryDate, formattedExpiryDate, null, serviceContext);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			resourceRequest.setAttribute("fileUrl",DLURLHelperUtil.getDownloadURL(fileEntry,
	  				  fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true));
	  		resourceRequest.setAttribute("fileSize", HtmlUtil.escape(LanguageUtil.formatStorageSize(fileEntry.getSize(),
					  themeDisplay.getLocale())));
	  		resourceRequest.setAttribute("previewUrl",DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(),
					  themeDisplay, StringPool.BLANK, false, true));
	  		resourceRequest.setAttribute("fileEntryId", fileEntry.getFileEntryId());
	  		resourceRequest.setAttribute("issueDate",issueDate);
	  		resourceRequest.setAttribute("expiryDate",expiryDate);
	  		resourceRequest.setAttribute("documentuploadCounter",documentuploadCounter);
	  		resourceRequest.setAttribute("documentNumber",documentNumber);
	  		resourceRequest.setAttribute("fileName",fileEntry.getFileName());
	  		resourceRequest.getPortletContext().getRequestDispatcher("/expired-document-updated-info.jsp").include(resourceRequest, resourceResponse);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Reference
	DLFileEntryLocalService _dlFileEntryLocalService;

	@Reference
	DLFileVersionLocalService _dlFileVersionLocalService;

	@Reference
	DLAppLocalService _dlAppLocalService;
}
