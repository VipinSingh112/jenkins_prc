package com.nbp.miic.upload.document.commands;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
		"mvc.command.name=delte/doc/afer/save/con" }, service = MVCResourceCommand.class)
public class MiicDeleteSaveAndConDocumentsResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Miic Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		long miicApplicationId = ParamUtil.getLong(resourceRequest, "miicApplicationId");
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
	                    String.valueOf(miicApplicationId));
	        } catch (Exception e) {
	            System.out.println("Application folder does not exist.");
	        }

	        // Try to get the "Generic Documents" folder inside the root folder.
	        DLFolder subDlFolder = null;
	        try {
	            subDlFolder = DLFolderLocalServiceUtil.getFolder(
	                    themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), "Generic Documents");
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
