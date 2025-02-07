package com.nbp.janaac.upload.document.commands;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.List;

public class GettingUploadDoccumentData {
	public static DLFolder getDocumentLibraryParentAndSubFolder(long groupId, long applicationId) {
		DLFolder supportingDocumentsParentFolder=null;
		DLFolder supportingDocumentsFolder =null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(groupId,
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JANAAC Supported Documents");
			
			  supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(groupId,
			  supportingDocumentsParentFolder.getFolderId(),
			  String.valueOf(applicationId));
			 
		} catch (PortalException e) {
		}

		return supportingDocumentsFolder;
	}
	public static String getSignaturePreviewUrl(ThemeDisplay themeDisplay, String folderName, long groupId,
	        long applicationId) throws PortalException {
	    try {
	        DLFolder documentLibraryParentAndSubFolder = getDocumentLibraryParentAndSubFolder(groupId, applicationId);
	        DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(groupId,
	                documentLibraryParentAndSubFolder.getFolderId(), folderName);
	        List<DLFileEntry> supportingGenDocFileEntries = DLFileEntryLocalServiceUtil
	                .getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());

	        JSONObject jsonResponse = JSONFactoryUtil.createJSONObject();

	        for (DLFileEntry genricDocs : supportingGenDocFileEntries) {
	            FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(genricDocs.getFileEntryId());
	            String fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
	                    StringPool.BLANK, false, true);
	            String fileName = genricDocs.getFileName();

	            // Add plain file name to JSON
	            jsonResponse.put("fileName", fileName);
	            // Add file name as a clickable download link to JSON
	            jsonResponse.put("downloadLink", "<a href='" + fileUrl + "' target='_blank' download>" + fileName + "</a>");

	            // Break after the first file (if you want multiple files, adapt accordingly)
	            break;
	        }

	        return jsonResponse.toString();
	    } catch (PortalException e) {
	    }
	    return null; // Return null if no file is found or an error occurs
	}
	public static String getSignPreviewUrl(ThemeDisplay themeDisplay, String folderName, long groupId,
			long applicationId) throws PortalException {
		try {
			DLFolder documentLibraryParentAndSubFolder = getDocumentLibraryParentAndSubFolder(groupId, applicationId);
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(groupId,
					documentLibraryParentAndSubFolder.getFolderId(), folderName);
			List<DLFileEntry> supportingGenDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			FileEntry fileEntry = null;
			long fileEntryId = 0;
			String fileUrl = "";
			String fileName = "";
			for (DLFileEntry genricDocs : supportingGenDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(genricDocs.getFileEntryId());
				fileEntryId = fileEntry.getFileEntryId();
//				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
//						StringPool.BLANK, false, true);
				fileUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				fileName =genricDocs.getFileName();
				
			}
			return fileUrl;
		} catch (PortalException e) {
		}
		
		return null;
	}
	public static String getDocName(ThemeDisplay themeDisplay, String folderName, long groupId,
			long applicationId) throws PortalException {
		try {
			DLFolder documentLibraryParentAndSubFolder = getDocumentLibraryParentAndSubFolder(groupId, applicationId);
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(groupId,
					documentLibraryParentAndSubFolder.getFolderId(), folderName);
			List<DLFileEntry> supportingGenDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			FileEntry fileEntry = null;
			long fileEntryId = 0;
			String fileUrl = "";
			String fileName = "";
			for (DLFileEntry genricDocs : supportingGenDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(genricDocs.getFileEntryId());
				fileEntryId = fileEntry.getFileEntryId();
//				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
//						StringPool.BLANK, false, true);
				fileUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				fileName =genricDocs.getFileName();
				
			}
			return fileName;
		} catch (PortalException e) {
		}
		
		return null;
	}
	public static String getDocUrl(ThemeDisplay themeDisplay, String folderName, long groupId,
			long applicationId) throws PortalException {
		try {
			DLFolder documentLibraryParentAndSubFolder = getDocumentLibraryParentAndSubFolder(groupId, applicationId);
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(groupId,
					documentLibraryParentAndSubFolder.getFolderId(), folderName);
			List<DLFileEntry> supportingGenDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			FileEntry fileEntry = null;
			long fileEntryId = 0;
			String fileUrl = "";
			String fileName = "";
			String downloadLink = "";
			for (DLFileEntry genricDocs : supportingGenDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(genricDocs.getFileEntryId());
				fileEntryId = fileEntry.getFileEntryId();
				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
				fileName =genricDocs.getFileName();
				downloadLink= "<a href='" + fileUrl + "' target='_blank' download>" + fileName + "</a>";
			}
			return downloadLink;
		} catch (PortalException e) {
		}
		
		return null;
	}

}