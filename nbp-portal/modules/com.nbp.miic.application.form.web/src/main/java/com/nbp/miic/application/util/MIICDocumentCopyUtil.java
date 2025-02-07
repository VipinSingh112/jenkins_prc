package com.nbp.miic.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.exception.NoSuchFileException;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFileEntryMetadata;
import com.liferay.document.library.kernel.model.DLFileEntryType;
import com.liferay.document.library.kernel.model.DLFileVersion;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryMetadataLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryTypeLocalServiceUtil;
import com.liferay.document.library.kernel.store.DLStoreUtil;
import com.liferay.dynamic.data.mapping.kernel.DDMFormValues;
import com.liferay.dynamic.data.mapping.kernel.DDMStructure;
import com.liferay.dynamic.data.mapping.kernel.DDMStructureManagerUtil;
import com.liferay.dynamic.data.mapping.kernel.StorageEngineManagerUtil;
import com.liferay.expando.kernel.util.ExpandoBridgeUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.io.InputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MIICDocumentCopyUtil {
	private static Log _log = LogFactoryUtil.getLog(MIICDocumentCopyUtil.class.getName());

	public static void copyFolder(long repositoryId, long sourceFolderId, long parentFolderId, String name,
			String description, ServiceContext serviceContext, long folderId, long userId,
			long miicApplicationId) {
		Folder sourceDlFolder = null;
		try {
			sourceDlFolder = DLAppServiceUtil.getFolder(folderId);
		} catch (PortalException e) {
			_log.error("Error*******" + e.getMessage());
		}

		Folder destFolder = null;
		try {
			destFolder = DLAppServiceUtil.addFolder(String.valueOf(CounterLocalServiceUtil.increment()), repositoryId,
					parentFolderId, String.valueOf(miicApplicationId), "Document Folder", serviceContext);
		} catch (PortalException e) {
			_log.error("Error*******" + e.getMessage());
		}

		try {
			copyFolder(sourceDlFolder, destFolder, serviceContext, userId, repositoryId, miicApplicationId);
		} catch (PortalException e) {

		}

	}

	protected static void copyFolder(Folder srcFolder, Folder destFolder, ServiceContext serviceContext, long userId,
			long groupId, long miicApplicationId) throws PortalException {

		new LinkedList<>();
		Folder curSrcFolder = srcFolder;
		Folder curDestFolder = destFolder;

		
		List<FileEntry> srcFileEntries = DLAppServiceUtil.getFileEntries(groupId, srcFolder.getFolderId());

		for (FileEntry srcFileEntry : srcFileEntries) {
			try {

				copyFileEntry(userId, groupId, groupId, srcFileEntry.getFileEntryId(), curDestFolder.getFolderId(),
						srcFileEntry.getFileName(), srcFileEntry.getTitle(), serviceContext);

			} catch (Exception exception) {
				_log.error(exception);
			}
		}
		List<Folder> srcSubfolders = null;
		try {

			srcSubfolders = DLAppServiceUtil.getFolders(groupId, curSrcFolder.getFolderId());
		} catch (Exception e) {
			_log.error("Error*******" + e.getMessage());
		}
		for (Folder srcSubfolder : srcSubfolders) {
			Folder destSubfolder = DLAppServiceUtil.addFolder(
					String.valueOf(CounterLocalServiceUtil.increment()),
					srcSubfolder.getGroupId(), curDestFolder.getFolderId(), srcSubfolder.getName(),
					srcSubfolder.getDescription(), serviceContext);

			List<FileEntry> srcSubFileEntries = DLAppServiceUtil.getFileEntries(groupId, srcSubfolder.getFolderId());
			for (FileEntry srcSubFileEntry : srcSubFileEntries) {
				try {
					copyFileEntry(userId, groupId, groupId, srcSubFileEntry.getFileEntryId(),
							destSubfolder.getFolderId(), srcSubFileEntry.getFileName(), srcSubFileEntry.getTitle(),
							serviceContext);
				} catch (Exception exception) {
					_log.error(exception);
				}
			}
		}

	}

	public static DLFileEntry copyFileEntry(long userId, long groupId, long repositoryId, long fileEntryId,
			long destFolderId, String fileName, String title, ServiceContext serviceContext) throws PortalException {

		DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(fileEntryId);

		String sourceFileName = "A";

		if (!Validator.isBlank(fileName)) {
			sourceFileName = fileName;
		}

		String extension = dlFileEntry.getExtension();

		if (Validator.isNotNull(extension)) {
			sourceFileName = StringBundler.concat(sourceFileName, StringPool.PERIOD, extension);
		}

		DLFileVersion dlFileVersion = dlFileEntry.getFileVersion();

		InputStream inputStream = _getInputStream(dlFileEntry, dlFileVersion);
		int workFlowStatus = WorkflowConstants.STATUS_APPROVED;

		DLFileEntry newDLFileEntry =null;
		try {
		newDLFileEntry=	DLFileEntryLocalServiceUtil.addFileEntry(null, userId, groupId, repositoryId,
				destFolderId, sourceFileName, dlFileEntry.getMimeType(), title, title, dlFileEntry.getDescription(),
				null, dlFileEntry.getFileEntryTypeId(), null, null, inputStream, dlFileEntry.getSize(),
				dlFileEntry.getExpirationDate(), dlFileEntry.getCreateDate(), null, serviceContext);
		}catch (Exception e) {
			e.printStackTrace();
		}
		DLFileEntry dlFileEntryadd = DLFileEntryLocalServiceUtil.getDLFileEntry(newDLFileEntry.getFileEntryId());
		dlFileEntryadd.setLastPublishDate(dlFileEntry.getLastPublishDate());
		DLFileEntryLocalServiceUtil.updateDLFileEntry(dlFileEntryadd);
		DLFileVersion newDLFileVersion = newDLFileEntry.getFileVersion();
		dlFileEntryadd = DLFileEntryLocalServiceUtil.updateStatus(userId,
				newDLFileEntry.getFileVersion().getFileVersionId(), workFlowStatus, serviceContext,
				new HashMap<String, Serializable>());
		
		ExpandoBridgeUtil.copyExpandoBridgeAttributes(dlFileVersion.getExpandoBridge(),
				newDLFileVersion.getExpandoBridge());

		copyFileEntryMetadata(dlFileVersion.getCompanyId(), dlFileVersion.getFileEntryTypeId(), fileEntryId,
				dlFileVersion.getFileVersionId(), newDLFileVersion.getFileVersionId(), serviceContext);

		return newDLFileEntry;
	}

	private static InputStream _getInputStream(DLFileEntry dlFileEntry, DLFileVersion dlFileVersion)
			throws PortalException {

		try {
			return DLStoreUtil.getFileAsStream(dlFileEntry.getCompanyId(), dlFileEntry.getDataRepositoryId(),
					dlFileEntry.getName(), null);
		} catch (NoSuchFileException noSuchFileException) {
			if (_log.isDebugEnabled()) {
				_log.debug("Using version label as file name for file version " + dlFileVersion, noSuchFileException);
			}

			return DLStoreUtil.getFileAsStream(dlFileEntry.getCompanyId(), dlFileEntry.getDataRepositoryId(),
					dlFileEntry.getName(), null);
		}
	}

	public static void copyFileEntryMetadata(long companyId, long fileEntryTypeId, long fileEntryId,
			long fromFileVersionId, long toFileVersionId, ServiceContext serviceContext) throws PortalException {

		Map<String, DDMFormValues> ddmFormValuesMap = new HashMap<>();

		List<DDMStructure> ddmStructures;

		if (fileEntryTypeId > 0) {
			DLFileEntryType dlFileEntryType = DLFileEntryTypeLocalServiceUtil.getFileEntryType(fileEntryTypeId);

			ddmStructures = dlFileEntryType.getDDMStructures();
		} else {
			ddmStructures = DDMStructureManagerUtil.getClassStructures(companyId,
					ClassNameLocalServiceUtil.getClassNameId(DLFileEntryMetadata.class));
		}

		_copyFileEntryMetadata(companyId, fileEntryId, fromFileVersionId, toFileVersionId, serviceContext,
				ddmFormValuesMap, ddmStructures);
	}

	private static void _copyFileEntryMetadata(long companyId, long fileEntryId, long fromFileVersionId,
			long toFileVersionId, ServiceContext serviceContext, Map<String, DDMFormValues> ddmFormValuesMap,
			List<DDMStructure> ddmStructures) throws PortalException {

		for (DDMStructure ddmStructure : ddmStructures) {
			DLFileEntryMetadata dlFileEntryMetadata = DLFileEntryMetadataLocalServiceUtil
					.fetchFileEntryMetadata(ddmStructure.getStructureId(), fromFileVersionId);

			if (dlFileEntryMetadata == null) {
				continue;
			}

			ddmFormValuesMap.put(ddmStructure.getStructureKey(),
					StorageEngineManagerUtil.getDDMFormValues(dlFileEntryMetadata.getDDMStorageId()));
		}

		if (!ddmFormValuesMap.isEmpty()) {
			DLFileEntryMetadataLocalServiceUtil.updateFileEntryMetadata(String.valueOf(CounterLocalServiceUtil.increment()), companyId, ddmStructures, fileEntryId,
					toFileVersionId, ddmFormValuesMap, serviceContext);
		}
	}
}
