package com.nbp.wra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFileVersion;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.document.library.kernel.service.DLFileVersionLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.expando.kernel.model.ExpandoColumn;
import com.liferay.expando.kernel.model.ExpandoTable;
import com.liferay.expando.kernel.model.ExpandoTableConstants;
import com.liferay.expando.kernel.service.ExpandoColumnLocalServiceUtil;
import com.liferay.expando.kernel.service.ExpandoTableLocalServiceUtil;
import com.liferay.expando.kernel.service.ExpandoValueLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
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
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.io.File;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name="  + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/add/Wra/Upload/Document/Url" }, service = MVCResourceCommand.class)
public class SupportedDocumentResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "WRA Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "WRA Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(SupportedDocumentResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("File upload started-----------------------");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String fileID = ParamUtil.getString(resourceRequest, "fileID");
		long wraApplicationId = ParamUtil.getLong(resourceRequest, "wraApplicationId");
		String documentNumber = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "documentNumber"));
		String documentuploadCounter = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "documentuploadCounter"));
		String issueDate = ParamUtil.getString(resourceRequest, "issueDate");
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

			InputStream inputStream = uploadPortletRequest.getFileAsStream(fileID);
			if (Validator.isNotNull(inputStream)) {
				mimeType = MimeTypesUtil.getContentType(fileName);
				title = documentName;
				serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), resourceRequest);
				DLFolder dlFolder = createFolder(themeDisplay.getUserId(), wraApplicationId,
						themeDisplay.getScopeGroupId());
				/* commonsUtil.updateFolderPermission(dlFolder); */
				commonsUtil.updateFolderPermissionGuest(dlFolder);
				FileEntry fileEntry = _dlAppLocalService.addFileEntry(String.valueOf(CounterLocalServiceUtil.increment(DLFileEntry.class.getName())) 
						+ wraApplicationId,
						themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName,
						mimeType, title, StringPool.BLANK, StringPool.BLANK, fileName, inputStream, files.length(),
						formattedExpiryDate, null, null, serviceContext);
				if (Validator.isNotNull(formattedExpiryDate)) {
					DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.getFileEntry(fileEntry.getFileEntryId());
					dlFileEntry.setExpirationDate(formattedExpiryDate);
					if (Validator.isNotNull(formattedIssueDate)) {
						dlFileEntry.setLastPublishDate(formattedIssueDate);
					}
					DLFileEntryLocalServiceUtil.updateDLFileEntry(dlFileEntry);
					DLFileVersion dlFileVersion = DLFileVersionLocalServiceUtil
							.getFileVersion(fileEntry.getFileEntryId(), fileEntry.getVersion());
					dlFileVersion.setExpirationDate(formattedExpiryDate);
					dlFileVersion.setLastPublishDate(formattedIssueDate);
					DLFileVersionLocalServiceUtil.updateDLFileVersion(dlFileVersion);
				}
				long classNameId = ClassNameLocalServiceUtil.getClassNameId(DLFileEntry.class.getName());
				ExpandoTable expandoTable = ExpandoTableLocalServiceUtil.getTable(themeDisplay.getCompanyId(),
						classNameId, ExpandoTableConstants.DEFAULT_TABLE_NAME);
				ExpandoColumn docNoExpandoColumn = ExpandoColumnLocalServiceUtil.getColumn(expandoTable.getTableId(),
						WRAApplicationFormPortletKeys.DOC_NO);
				if (docNoExpandoColumn == null) {
					docNoExpandoColumn = ExpandoColumnLocalServiceUtil.getColumn(themeDisplay.getCompanyId(),
							classNameId, expandoTable.getName(), WRAApplicationFormPortletKeys.DOC_NO);
				}
				ExpandoValueLocalServiceUtil.addValue(classNameId, expandoTable.getTableId(),
						docNoExpandoColumn.getColumnId(), fileEntry.getFileEntryId(), documentNumber);

				resourceRequest.setAttribute("fileUrl", DLURLHelperUtil.getDownloadURL(fileEntry,
						fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true));
				resourceRequest.setAttribute("fileSize",
						HtmlUtil.escape(LanguageUtil.formatStorageSize(fileEntry.getSize(), themeDisplay.getLocale())));
				resourceRequest.setAttribute("previewUrl", DLURLHelperUtil.getPreviewURL(fileEntry,
						fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true));
				resourceRequest.setAttribute("fileEntryId", fileEntry.getFileEntryId());
				
				resourceRequest.setAttribute("issueDate", issueDate);
				resourceRequest.setAttribute("documentuploadCounter", documentuploadCounter);
				resourceRequest.setAttribute("expiryDate", expiryDate);
				resourceRequest.setAttribute("documentNumber", documentNumber);
				resourceRequest.setAttribute("fileName", fileEntry.getFileName());
				resourceRequest.getPortletContext()
						.getRequestDispatcher("/supporting-documents/wra-supporting-document-info.jsp")
						.include(resourceRequest, resourceResponse);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		_log.info("File upload end-----------------------");
		return true;
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
				_log.error("No folder exist with name " + userId);
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(wraApplicationId), ROOT_FOLDER_DESCRIPTION, false,
						serviceContext);
			}
		} catch (PortalException e1) {
			e1.printStackTrace();
		} catch (SystemException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dlFolder;
	}

	@Reference
	DLFileEntryLocalService _dlFileEntryLocalService;

	@Reference
	DLFileVersionLocalService _dlFileVersionLocalService;

	@Reference
	DLAppLocalService _dlAppLocalService;
	@Reference
	private CommonsUtil commonsUtil;

}
