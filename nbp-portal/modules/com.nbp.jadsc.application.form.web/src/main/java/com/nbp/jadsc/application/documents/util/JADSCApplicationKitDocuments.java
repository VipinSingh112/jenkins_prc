package com.nbp.jadsc.application.documents.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

public class JADSCApplicationKitDocuments {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String PARENT_FOLDER_NAME = "JADSC Supported Documents";
	private static String APPLICATION_KIT_FOLDER = "JADSC APPLICATION KIT";
	private static Log _log = LogFactoryUtil.getLog(JADSCApplicationKitDocuments.class.getName());

	public synchronized static String getApplciationKitDownloadUrl(long groupId, String kitFolderName,
			ThemeDisplay themeDisplay) {
		DLFolder parentDocumentFolder = null;
		DLFolder applicationKitFolder = null;
		DLFolder specificKitFolder = null;
		List<DLFileEntry> kitDocumentFileEntry = new ArrayList<DLFileEntry>();
		com.liferay.portal.kernel.repository.model.FileEntry kitFolderDocumentFileEntry = null;
		String downloadUrlOfApplicationKit = StringPool.BLANK;
		// getting root folder

		try {
			parentDocumentFolder = DLFolderLocalServiceUtil.getFolder(groupId, PARENT_FOLDER_ID, PARENT_FOLDER_NAME);
		} catch (PortalException e) {
			_log.info("SUPPORTING DOC FOLDER IS NOT AVAILABLE");
			_log.error(e.getMessage());
		}
		// getting applicationKit folder
		if (parentDocumentFolder != null) {
			try {
				applicationKitFolder = DLFolderLocalServiceUtil.getFolder(groupId, parentDocumentFolder.getFolderId(),
						APPLICATION_KIT_FOLDER);
			} catch (PortalException e) {
				_log.info("APPLICATION KIT FOLDER NOT AVAILABLE IN SUPPORTING DOC FOLDER");
				_log.error(e.getMessage());
			}
		}
		// getting specific kit folder
		if (applicationKitFolder != null) {
			try {
				specificKitFolder = DLFolderLocalServiceUtil.getFolder(groupId, applicationKitFolder.getFolderId(),
						kitFolderName);
			} catch (PortalException e) {
				_log.info("KIT FOLDER NOT AVAILABLE PLEASE CHECK NAME OF FOLDER");
				_log.error(e.getMessage());
			}
		}
		// getting all the file entries which is in specific kit folder
		if (specificKitFolder != null) {
			kitDocumentFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					specificKitFolder.getFolderId());
		}
		// itterating over list which obtain from specific kit folder
		if (kitDocumentFileEntry != null) {
			for (DLFileEntry dlFileEntry : kitDocumentFileEntry) {
				try {
					kitFolderDocumentFileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				} catch (PortalException e) {
				}
				try {
					downloadUrlOfApplicationKit = DLURLHelperUtil.getDownloadURL(kitFolderDocumentFileEntry,
							kitFolderDocumentFileEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				} catch (PortalException e) {
				}
			}
		}

		return downloadUrlOfApplicationKit;

	}

}
