/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the NcbjApplication service. Represents a row in the &quot;nbp_ncbj_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplication
 * @generated
 */
@ProviderType
public interface NcbjApplicationModel
	extends BaseModel<NcbjApplication>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ncbj application model instance should use the {@link NcbjApplication} interface instead.
	 */

	/**
	 * Returns the primary key of this ncbj application.
	 *
	 * @return the primary key of this ncbj application
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ncbj application.
	 *
	 * @param primaryKey the primary key of this ncbj application
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this ncbj application.
	 *
	 * @return the uuid of this ncbj application
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this ncbj application.
	 *
	 * @param uuid the uuid of this ncbj application
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the ncbj application ID of this ncbj application.
	 *
	 * @return the ncbj application ID of this ncbj application
	 */
	public long getNcbjApplicationId();

	/**
	 * Sets the ncbj application ID of this ncbj application.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj application
	 */
	public void setNcbjApplicationId(long ncbjApplicationId);

	/**
	 * Returns the group ID of this ncbj application.
	 *
	 * @return the group ID of this ncbj application
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ncbj application.
	 *
	 * @param groupId the group ID of this ncbj application
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ncbj application.
	 *
	 * @return the company ID of this ncbj application
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ncbj application.
	 *
	 * @param companyId the company ID of this ncbj application
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ncbj application.
	 *
	 * @return the user ID of this ncbj application
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ncbj application.
	 *
	 * @param userId the user ID of this ncbj application
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ncbj application.
	 *
	 * @return the user uuid of this ncbj application
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ncbj application.
	 *
	 * @param userUuid the user uuid of this ncbj application
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ncbj application.
	 *
	 * @return the user name of this ncbj application
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ncbj application.
	 *
	 * @param userName the user name of this ncbj application
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ncbj application.
	 *
	 * @return the create date of this ncbj application
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ncbj application.
	 *
	 * @param createDate the create date of this ncbj application
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ncbj application.
	 *
	 * @return the modified date of this ncbj application
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ncbj application.
	 *
	 * @param modifiedDate the modified date of this ncbj application
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the type of certification of this ncbj application.
	 *
	 * @return the type of certification of this ncbj application
	 */
	@AutoEscape
	public String getTypeOfCertification();

	/**
	 * Sets the type of certification of this ncbj application.
	 *
	 * @param typeOfCertification the type of certification of this ncbj application
	 */
	public void setTypeOfCertification(String typeOfCertification);

	/**
	 * Returns the type of transaction of this ncbj application.
	 *
	 * @return the type of transaction of this ncbj application
	 */
	@AutoEscape
	public String getTypeOfTransaction();

	/**
	 * Sets the type of transaction of this ncbj application.
	 *
	 * @param typeOfTransaction the type of transaction of this ncbj application
	 */
	public void setTypeOfTransaction(String typeOfTransaction);

	/**
	 * Returns the type of services of this ncbj application.
	 *
	 * @return the type of services of this ncbj application
	 */
	@AutoEscape
	public String getTypeOfServices();

	/**
	 * Sets the type of services of this ncbj application.
	 *
	 * @param typeOfServices the type of services of this ncbj application
	 */
	public void setTypeOfServices(String typeOfServices);

	/**
	 * Returns the sub category services of this ncbj application.
	 *
	 * @return the sub category services of this ncbj application
	 */
	@AutoEscape
	public String getSubCategoryServices();

	/**
	 * Sets the sub category services of this ncbj application.
	 *
	 * @param subCategoryServices the sub category services of this ncbj application
	 */
	public void setSubCategoryServices(String subCategoryServices);

	/**
	 * Returns the iso9001 certification value of this ncbj application.
	 *
	 * @return the iso9001 certification value of this ncbj application
	 */
	@AutoEscape
	public String getIso9001CertificationValue();

	/**
	 * Sets the iso9001 certification value of this ncbj application.
	 *
	 * @param iso9001CertificationValue the iso9001 certification value of this ncbj application
	 */
	public void setIso9001CertificationValue(String iso9001CertificationValue);

	/**
	 * Returns the number of site of this ncbj application.
	 *
	 * @return the number of site of this ncbj application
	 */
	@AutoEscape
	public String getNumberOfSite();

	/**
	 * Sets the number of site of this ncbj application.
	 *
	 * @param numberOfSite the number of site of this ncbj application
	 */
	public void setNumberOfSite(String numberOfSite);

	/**
	 * Returns the iso22000 certification value of this ncbj application.
	 *
	 * @return the iso22000 certification value of this ncbj application
	 */
	@AutoEscape
	public String getIso22000CertificationValue();

	/**
	 * Sets the iso22000 certification value of this ncbj application.
	 *
	 * @param iso22000CertificationValue the iso22000 certification value of this ncbj application
	 */
	public void setIso22000CertificationValue(
		String iso22000CertificationValue);

	/**
	 * Returns the status of this ncbj application.
	 *
	 * @return the status of this ncbj application
	 */
	public int getStatus();

	/**
	 * Sets the status of this ncbj application.
	 *
	 * @param status the status of this ncbj application
	 */
	public void setStatus(int status);

	/**
	 * Returns the application number of this ncbj application.
	 *
	 * @return the application number of this ncbj application
	 */
	@AutoEscape
	public String getApplicationNumber();

	/**
	 * Sets the application number of this ncbj application.
	 *
	 * @param applicationNumber the application number of this ncbj application
	 */
	public void setApplicationNumber(String applicationNumber);

	/**
	 * Returns the transfer reason of this ncbj application.
	 *
	 * @return the transfer reason of this ncbj application
	 */
	@AutoEscape
	public String getTransferReason();

	/**
	 * Sets the transfer reason of this ncbj application.
	 *
	 * @param transferReason the transfer reason of this ncbj application
	 */
	public void setTransferReason(String transferReason);

	/**
	 * Returns the expired license app number of this ncbj application.
	 *
	 * @return the expired license app number of this ncbj application
	 */
	@AutoEscape
	public String getExpiredLicenseAppNumber();

	/**
	 * Sets the expired license app number of this ncbj application.
	 *
	 * @param expiredLicenseAppNumber the expired license app number of this ncbj application
	 */
	public void setExpiredLicenseAppNumber(String expiredLicenseAppNumber);

	/**
	 * Returns the case ID of this ncbj application.
	 *
	 * @return the case ID of this ncbj application
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this ncbj application.
	 *
	 * @param caseId the case ID of this ncbj application
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the icm documents path of this ncbj application.
	 *
	 * @return the icm documents path of this ncbj application
	 */
	@AutoEscape
	public String getIcmDocumentsPath();

	/**
	 * Sets the icm documents path of this ncbj application.
	 *
	 * @param icmDocumentsPath the icm documents path of this ncbj application
	 */
	public void setIcmDocumentsPath(String icmDocumentsPath);

	/**
	 * Returns the pdf file entry ID of this ncbj application.
	 *
	 * @return the pdf file entry ID of this ncbj application
	 */
	public long getPdfFileEntryId();

	/**
	 * Sets the pdf file entry ID of this ncbj application.
	 *
	 * @param pdfFileEntryId the pdf file entry ID of this ncbj application
	 */
	public void setPdfFileEntryId(long pdfFileEntryId);

	/**
	 * Returns the date of expiration of this ncbj application.
	 *
	 * @return the date of expiration of this ncbj application
	 */
	public Date getDateOfExpiration();

	/**
	 * Sets the date of expiration of this ncbj application.
	 *
	 * @param dateOfExpiration the date of expiration of this ncbj application
	 */
	public void setDateOfExpiration(Date dateOfExpiration);

	/**
	 * Returns the app current stage name of this ncbj application.
	 *
	 * @return the app current stage name of this ncbj application
	 */
	@AutoEscape
	public String getAppCurrentStageName();

	/**
	 * Sets the app current stage name of this ncbj application.
	 *
	 * @param appCurrentStageName the app current stage name of this ncbj application
	 */
	public void setAppCurrentStageName(String appCurrentStageName);

	@Override
	public NcbjApplication cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}