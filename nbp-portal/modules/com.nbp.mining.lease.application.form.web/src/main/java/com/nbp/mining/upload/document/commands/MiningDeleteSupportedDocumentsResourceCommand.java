package com.nbp.mining.upload.document.commands;

import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=/mining/document/delete" }, service = MVCResourceCommand.class)

public class MiningDeleteSupportedDocumentsResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(MiningDeleteSupportedDocumentsResourceCommand.class.getName());
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Mining Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		long miningApplicationId = ParamUtil.getLong(resourceRequest, "miningApplicationId");
		String fileName=ParamUtil.getString(resourceRequest, "fileName");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		DLFolder dlFolder =null;
		
	      DLFolder rootFolder = null;
		try {
			rootFolder = DLFolderLocalServiceUtil.getFolder(
			            themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	        try {
	            dlFolder = DLFolderLocalServiceUtil.getFolder(
	                    themeDisplay.getScopeGroupId(), rootFolder.getFolderId(),
	                    String.valueOf(miningApplicationId));
	        } catch (Exception e) {
	            System.out.println("Application folder does not exist.");
	        }

	        // Try to get the "Generic Documents" folder inside the root folder.
	        DLFolder subDlFolder = null;
	        try {
	            subDlFolder = DLFolderLocalServiceUtil.getFolder(
	                    themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), "generic Documents");
	        } catch (Exception e) {
	            System.out.println("The folder 'Generic Documents' does not exist.");
	        }
		try {
			System.out.println("FIle Entry- search start---------");

			FileEntry entryData=_dlAppLocalService.getFileEntry(themeDisplay.getScopeGroupId(), subDlFolder.getFolderId(), fileName);
			System.out.println("FIle Entry----------"+entryData);
			_dlAppLocalService.deleteFileEntry(entryData.getFileEntryId());
			System.out.println("FIle Entry- DELETED---------");


		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	@Reference
	DLAppLocalService _dlAppLocalService;
}
