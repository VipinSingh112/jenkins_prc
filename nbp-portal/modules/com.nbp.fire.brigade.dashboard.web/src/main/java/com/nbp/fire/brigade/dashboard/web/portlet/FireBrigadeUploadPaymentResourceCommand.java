package com.nbp.fire.brigade.dashboard.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalService;
import com.liferay.document.library.kernel.service.DLFileVersionLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.fire.brigade.dashboard.web.constants.FireBrigadeDashbaordPortletKeys;

import java.io.File;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + FireBrigadeDashbaordPortletKeys.FIREBRIGADEDASHBAORD,
		"mvc.command.name=/fee/detail" }, service = MVCResourceCommand.class)
public class FireBrigadeUploadPaymentResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Fire Brigade Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "Fire Brigade Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(FireBrigadeUploadPaymentResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("File upload started-----------------------");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String fileID = ParamUtil.getString(resourceRequest, "fileID");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");
		String folderName = ParamUtil.getString(resourceRequest, "folderName");
		String mimeType = StringPool.BLANK;
		String title = StringPool.BLANK;
		ServiceContext serviceContext = new ServiceContext();
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		String[] fileNames = uploadPortletRequest.getFileNames(fileID);
		String fileName = StringPool.BLANK;
		File[] fileList = uploadPortletRequest.getFiles(fileID);
		DLFolder dlFolder = null;
		int counter = 0;
		if (Validator.isNotNull(fileList) && fileList.length > 0) {
			dlFolder = createFolder(themeDisplay.getUserId(), fireBrigadeApplicationId, themeDisplay.getScopeGroupId(),
					folderName, "Fire Brigade Forms Documents");
			for (File fileItem : fileList) {
				try {
					fileName = fileNames[counter];
					if (Validator.isNotNull(fileItem) && Validator.isNotNull(fileName)) {
						mimeType = MimeTypesUtil.getContentType(fileNames[counter]);
						title = fileNames[counter];
						serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(),
								resourceRequest);
						_dlAppLocalService.addFileEntry(fileName + dlFolder.getFolderId(), themeDisplay.getUserId(),
								themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), fileName, mimeType, title,
								StringPool.BLANK, StringPool.BLANK, fileName, fileItem, null, null, null, serviceContext);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				counter = counter + 1;
			}
		}

		_log.info("File upload end-----------------------");
		return true;
	}

	private DLFolder createFolder(long userId, long fireBrigadeApplicationId, long groupId, String folderName,
			String folderDesc) {
		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = createFolder(userId, fireBrigadeApplicationId, groupId);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(), folderName);
			} catch (Exception e) {
				_log.error("No folder exist with name " + userId);
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()),userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), folderName, folderName, false, serviceContext);
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

	private static DLFolder createFolder(long userId, long fireBrigadeApplicationId, long groupId) {
		DLFolder dlFolder = null;
		long repositoryId = groupId;
		try {
			ServiceContext serviceContext = new ServiceContext();
			DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),
						String.valueOf(fireBrigadeApplicationId));
			} catch (Exception e) {
				_log.error("No folder exist with name " + userId);
			}
			if (Validator.isNull(dlFolder)) {
				dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()),userId, groupId, repositoryId, false,
						rootFolder.getFolderId(), String.valueOf(fireBrigadeApplicationId), ROOT_FOLDER_DESCRIPTION,
						false, serviceContext);
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
}
