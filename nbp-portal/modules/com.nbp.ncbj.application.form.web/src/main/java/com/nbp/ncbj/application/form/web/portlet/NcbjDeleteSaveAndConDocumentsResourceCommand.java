package com.nbp.ncbj.application.form.web.portlet;

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
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=delte/doc/afer/save/con"
		},
		service = MVCResourceCommand.class
	)
public class NcbjDeleteSaveAndConDocumentsResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "NCBJ Supported Documents";
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		String fileName=ParamUtil.getString(resourceRequest, "fileName");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		DLFolder dlFolder =null;
		
	      DLFolder rootFolder = null;
		try {
			rootFolder = DLFolderLocalServiceUtil.getFolder(
			            themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (PortalException e1) {
		}
	        try {
	            dlFolder = DLFolderLocalServiceUtil.getFolder(
	                    themeDisplay.getScopeGroupId(), rootFolder.getFolderId(),
	                    String.valueOf(ncbjApplicationId));
	        } catch (Exception e) {
	        }

	        DLFolder subDlFolder = null;
	        try {
	            subDlFolder = DLFolderLocalServiceUtil.getFolder(
	                    themeDisplay.getScopeGroupId(), dlFolder.getFolderId(), "Generic Documents");
	        } catch (Exception e) {
	        }
		try {

			FileEntry entryData=_dlAppLocalService.getFileEntry(themeDisplay.getScopeGroupId(), subDlFolder.getFolderId(), fileName);
			_dlAppLocalService.deleteFileEntry(entryData.getFileEntryId());
		} catch (PortalException e) {
		}
		return false;
	}
	@Reference
	DLAppLocalService _dlAppLocalService;
}
