package com.nbp.wra.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.NoSuchResourcePermissionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.ResourceAction;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ResourceActionLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
public class WRAApplicationUtil {
	private static Log _log = LogFactoryUtil.getLog(WRAApplicationUtil.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "WRA Supported Documents";
	private static String ROOT_FOLDER_DESCRIPTION = "WRA Supported Documents";
	public synchronized static DLFolder createSubFolder(long userId,long wraApplicationId,long groupId,String folderName,String folderDesc) {
		DLFolder dlFolder = null;
			long repositoryId = groupId;
			try {
				ServiceContext serviceContext = new ServiceContext();
				DLFolder rootFolder = createFolder(userId,wraApplicationId,groupId);
				try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),folderName);
				}catch (Exception e) {
					_log.error("No folder exist with name "+userId);
				}
				 if(Validator.isNull(dlFolder)){
					 dlFolder = DLFolderLocalServiceUtil.addFolder
							 (String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false, rootFolder.getFolderId(), folderName, folderName, false, serviceContext);
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
	private static DLFolder createFolder(long userId,long wraApplicationId,long groupId) {
		DLFolder dlFolder = null;
			long repositoryId = groupId;
			try {
				ServiceContext serviceContext = new ServiceContext();
				DLFolder rootFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
				try {
				dlFolder = DLFolderLocalServiceUtil.getFolder(repositoryId, rootFolder.getFolderId(),String.valueOf(wraApplicationId));
				}catch (Exception e) {
					_log.error("No folder exist with name "+userId);
				}
				 if(Validator.isNull(dlFolder)){
					 dlFolder = DLFolderLocalServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), userId, groupId, repositoryId, false, rootFolder.getFolderId(), String.valueOf(wraApplicationId), ROOT_FOLDER_DESCRIPTION, false, serviceContext);
				 }		
				 updatePermission(dlFolder);
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
	public static List<DLFileEntry> getFormsDocumentList(ThemeDisplay themeDisplay, long wraApplicationId,String folderName) {
		DLFolder supportingDocumentsParentFolder;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"WRA Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(wraApplicationId));
		DLFolder supportingGenericDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder.getFolderId(),
				folderName);
		List<DLFileEntry> supportingGenDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingGenericDocumentsFolder.getFolderId());
		return supportingGenDocFileEntries;
		} catch (PortalException e) {
		}
		return null;

	}
	public static String getValidationIssueDate() {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		Date oneDayBefore = cal.getTime();
	    SimpleDateFormat minDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String minDate = minDateFormat.format(oneDayBefore);
		return minDate;
	}


	public static String getValidationExpiryDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date oneDayAfter = cal.getTime();
		SimpleDateFormat maxDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String maxDate= maxDateFormat.format(oneDayAfter);
		return maxDate;
	}
	private static DLFolder updatePermission(DLFolder  dlFolder) throws PortalException {
		ResourcePermission resourcePermission = null;
		final Role siteMemberRole = RoleLocalServiceUtil.getRole(dlFolder.getCompanyId(), RoleConstants.USER);
		ResourceAction resourceAction = ResourceActionLocalServiceUtil.getResourceAction(DLFolder.class.getName(),
				ActionKeys.VIEW);
		try {
			resourcePermission = ResourcePermissionLocalServiceUtil.getResourcePermission(dlFolder.getCompanyId(),
					DLFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
					String.valueOf(dlFolder.getPrimaryKey()), siteMemberRole.getRoleId());

			if (Validator.isNotNull(resourcePermission)) {

				resourcePermission.setActionIds(resourceAction.getBitwiseValue());
				ResourcePermissionLocalServiceUtil.updateResourcePermission(resourcePermission);
			}
		} catch (NoSuchResourcePermissionException e) {

			resourcePermission = ResourcePermissionLocalServiceUtil
					.createResourcePermission(CounterLocalServiceUtil.increment());
			resourcePermission.setCompanyId(dlFolder.getCompanyId());
			resourcePermission.setName(DLFolder.class.getName());
			resourcePermission.setScope(ResourceConstants.SCOPE_INDIVIDUAL);
			resourcePermission.setPrimKey(String.valueOf(dlFolder.getPrimaryKey()));
			resourcePermission.setRoleId(siteMemberRole.getRoleId());
			resourcePermission.setActionIds(resourceAction.getBitwiseValue());// (ActionKeys.VIEW);
			ResourcePermissionLocalServiceUtil.addResourcePermission(resourcePermission);
		}
		return null;
	}
}
