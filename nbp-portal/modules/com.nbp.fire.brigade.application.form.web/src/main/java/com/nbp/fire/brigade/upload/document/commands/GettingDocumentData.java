package com.nbp.fire.brigade.upload.document.commands;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.List;

public class GettingDocumentData {
	public static DLFolder getDocumentLibraryParentAndSubFolder(long groupId, long applicationId) {
		DLFolder supportingDocumentsParentFolder=null;
		DLFolder supportingDocumentsFolder =null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(groupId,
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Fire Brigade Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(groupId,
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(applicationId));
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
			FileEntry fileEntry = null;
			long fileEntryId = 0;
			String fileUrl = "";
			for (DLFileEntry genricDocs : supportingGenDocFileEntries) {
				fileEntry = DLAppLocalServiceUtil.getFileEntry(genricDocs.getFileEntryId());
				fileEntryId = fileEntry.getFileEntryId();
				fileUrl = DLURLHelperUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
						StringPool.BLANK, false, true);
			}
			return fileUrl;
		} catch (PortalException e) {
		}

		return null;
	}
}
