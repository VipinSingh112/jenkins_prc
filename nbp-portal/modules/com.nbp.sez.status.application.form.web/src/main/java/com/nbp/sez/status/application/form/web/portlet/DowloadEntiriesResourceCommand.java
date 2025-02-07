package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.InvalidRepositoryException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileShortcut;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.zip.ZipWriter;
import com.liferay.portal.kernel.zip.ZipWriterFactory;
import com.liferay.portal.util.RepositoryUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/documents/download_folder"
		},
		service = MVCResourceCommand.class
		)
public class DowloadEntiriesResourceCommand implements MVCResourceCommand {
   public static String typeOfStatus="";
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		try {
			
			_downloadFolder(resourceRequest, resourceResponse);
		} catch (PortalException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private void _downloadFolder(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws IOException, PortalException {

		ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
		Integer check=ParamUtil.getInteger(resourceRequest, "check");
		if(check==1) {
			String documentKitType=ParamUtil.getString(resourceRequest, "typeOfSezStatus");	
			typeOfStatus=documentKitType;
		}
		Folder folder = null;
		if (check!=1) {
			if(typeOfStatus.equals("SEZ Developer")) {
				 folder =  _dlAppService.getFolder(themeDisplay.getScopeGroupId(), 0, SezStatusApplicationFormPortletKeys.SEZ_DEV_KIT);
			}else if (typeOfStatus.equals("SEZ Occupant")) {
				 folder =  _dlAppService.getFolder(themeDisplay.getScopeGroupId(), 0, SezStatusApplicationFormPortletKeys.SEZ_OCCU_KIT);
			}else if (typeOfStatus.equals("SEZ Zone User")) {
				folder =  _dlAppService.getFolder(themeDisplay.getScopeGroupId(), 0, SezStatusApplicationFormPortletKeys.SEZ_ZONE_KIT);
			}
		}
		if(folder!=null) {
		_checkFolder(folder.getFolderId());
		}

		ZipWriter zipWriter = _zipWriterFactory.getZipWriter();

		try {
			String zipFileName = _getZipFileName(folder.getFolderId(), themeDisplay);

			long repositoryId = themeDisplay.getScopeGroupId();

			_zipFolder(
				repositoryId, folder.getFolderId(), StringPool.SLASH,
				themeDisplay.getPermissionChecker(), zipWriter);

			try (InputStream inputStream = new FileInputStream(
					zipWriter.getFile())) {

				PortletResponseUtil.sendFile(
					resourceRequest, resourceResponse, zipFileName, inputStream,
					ContentTypes.APPLICATION_ZIP);
			}
		}
		finally {
			File file = zipWriter.getFile();

			file.delete();
		}
	}

	private String _getZipFileName(long folderId, ThemeDisplay themeDisplay)
		throws PortalException {

		if (folderId != DLFolderConstants.DEFAULT_PARENT_FOLDER_ID) {
			Folder folder = _dlAppService.getFolder(folderId);

			return folder.getName() + ".zip";
		}

		return themeDisplay.getScopeGroupName() + ".zip";
	}

	private boolean _isExternalRepositoryFolder(Folder folder) {
		if ((folder.isMountPoint() ||
			 (folder.getGroupId() != folder.getRepositoryId())) &&
			RepositoryUtil.isExternalRepository(folder.getRepositoryId())) {

			return true;
		}

		return false;
	}
	private void _zipFileEntry(
			FileEntry fileEntry, String path,
			PermissionChecker permissionChecker, ZipWriter zipWriter)
		throws IOException, PortalException {

			zipWriter.addEntry(
				path + StringPool.SLASH + fileEntry.getFileName(),
				fileEntry.getContentStream());
	}
	private void _zipFolder(
			long repositoryId, long folderId, String path,
			PermissionChecker permissionChecker, ZipWriter zipWriter)
		throws IOException, PortalException {

		List<Object> foldersAndFileEntriesAndFileShortcuts =
			_dlAppService.getFoldersAndFileEntriesAndFileShortcuts(
				repositoryId, folderId, WorkflowConstants.STATUS_APPROVED,
				false, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		for (Object entry : foldersAndFileEntriesAndFileShortcuts) {
			if (entry instanceof Folder) {
				Folder folder = (Folder)entry;

				_zipFolder(
					folder.getRepositoryId(), folder.getFolderId(),
					StringBundler.concat(
						path, StringPool.SLASH, folder.getName()),
					permissionChecker, zipWriter);
			}
			else if (entry instanceof FileEntry) {
				_zipFileEntry(
					(FileEntry)entry, path, permissionChecker, zipWriter);
			}
			else if (entry instanceof FileShortcut) {
				FileShortcut fileShortcut = (FileShortcut)entry;

				_zipFileEntry(
					_dlAppService.getFileEntry(fileShortcut.getToFileEntryId()),
					path, permissionChecker, zipWriter);
			}
		}
	}
	private void _checkFolder(long folderId) throws PortalException {
		if (_isExternalRepositoryFolder(folderId)) {
			throw new InvalidRepositoryException(
				"Tried to download Folder " + folderId +
					" belonging to an external repository");
		}
	}
	private boolean _isExternalRepositoryFolder(long folderId)
			throws PortalException {

			if (folderId == DLFolderConstants.DEFAULT_PARENT_FOLDER_ID) {
				return false;
			}

			if (_isExternalRepositoryFolder(_dlAppService.getFolder(folderId))) {
				return true;
			}

			return false;
		}
	@Reference
	private DLAppService _dlAppService;

	@Reference
	private ZipWriterFactory _zipWriterFactory;

}
