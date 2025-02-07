package com.agriculture.remote.services.internal.resource.v1_0;

import com.agriculture.application.form.service.model.AgricultureApplication;
import com.agriculture.application.form.service.service.AgricultureApplicationLocalServiceUtil;
import com.agriculture.remote.services.dto.v1_0.AgricultureApplicationPermit;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationPermitResource;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.vulcan.multipart.BinaryFile;
import com.liferay.portal.vulcan.multipart.MultipartBody;
import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureApplicationStagesException;
import com.nbp.agriculture.stages.services.model.AgriculturePermit;
import com.nbp.agriculture.stages.services.service.AgriculturePermitLocalService;
import com.nbp.agriculture.stages.services.service.AgriculturePermitLocalServiceUtil;
import com.nbp.commons.util.api.CommonsUtil;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.ws.rs.BadRequestException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Yogesh Chandra
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/agriculture-application-permit.properties",
	scope = ServiceScope.PROTOTYPE,
	service = AgricultureApplicationPermitResource.class
)
public class AgricultureApplicationPermitResourceImpl
	extends BaseAgricultureApplicationPermitResourceImpl {
	@Override
	public AgricultureApplicationPermit updateAgricultureApplicationPermit(@NotNull String caseId,
			String pirPermtNumber, Date dateofIssue, Date dateOfExpiration, String durationOfPermit,
			MultipartBody multipartBody) throws Exception {
		AgricultureApplication agricultureApplication=null;
		try {
			agricultureApplication=AgricultureApplicationLocalServiceUtil.getAgricultureBy_CI(caseId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(agricultureApplication)) {
		com.nbp.agriculture.stages.services.model.AgriculturePermit agriculturePermit=_agriculturePermitLocalService.updateAgriculturePermit(caseId, pirPermtNumber, dateofIssue, dateOfExpiration, durationOfPermit);
		if (Validator.isNotNull(multipartBody.getBinaryFile("file"))) {
		DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
				agricultureApplication.getGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
				"Agriculture Supported Documents");
		DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(agricultureApplication.getGroupId(),
				supportingDocumentsParentFolder.getFolderId(),
				String.valueOf(agricultureApplication.getAgricultureApplicationId()));
		
		_addDocument(supportingDocumentsFolder.getRepositoryId(), supportingDocumentsFolder.getFolderId(), multipartBody, agricultureApplication.getAgricultureApplicationId());
		}
		return _toAgricultureApplicationPermit(agriculturePermit);
		}else {
			throw new NoSuchAgricultureApplicationStagesException("Case Id Not Exist");
		}
		
	}
	private void _addDocument(Long repositoryId, Long documentFolderId, MultipartBody multipartBody,
			Long agricultureApplicationId) throws Exception {

		if (documentFolderId == null) {
			documentFolderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		}

		BinaryFile binaryFile = multipartBody.getBinaryFile("file");

		if (binaryFile == null) {
			throw new BadRequestException("No file found in body");
		}

		String title = null;
		String description = null;

		if (title == null) {
			title = binaryFile.getFileName();
		}
		FileEntry fileEntry =_dlAppService.addFileEntry(title + agricultureApplicationId, repositoryId, documentFolderId,
				binaryFile.getFileName(), binaryFile.getContentType(), title, null, description, null,
				binaryFile.getInputStream(), binaryFile.getSize(), null, null, null, new ServiceContext());
		DLFileEntry dlFileEntry = null;
		AgricultureApplication agricultureApplication=AgricultureApplicationLocalServiceUtil.getAgricultureApplication(agricultureApplicationId);
		dlFileEntry = DLFileEntryLocalServiceUtil.getFileEntryByExternalReferenceCode(title + agricultureApplicationId,
				agricultureApplication.getGroupId());
		fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
		com.nbp.agriculture.stages.services.model.AgriculturePermit agriculturePermit=AgriculturePermitLocalServiceUtil.getAgricultureBy_CI(agricultureApplication.getCaseId());
		agriculturePermit.setPirCertificateNUmber(fileEntry.getFileEntryId());
		AgriculturePermitLocalServiceUtil.updateAgriculturePermit(agriculturePermit);
		commonsUtil.filePermissionForDownload(fileEntry);
	}

	
	
	
	protected AgricultureApplicationPermit _toAgricultureApplicationPermit(com.nbp.agriculture.stages.services.model.AgriculturePermit agriculturePermit) {
		return new AgricultureApplicationPermit() {{
			caseId=agriculturePermit.getCaseId();
		}};
	}
	@Reference
	AgriculturePermitLocalService  _agriculturePermitLocalService;
	@Reference
	DLAppService _dlAppService;
	@Reference
	private CommonsUtil commonsUtil;
}