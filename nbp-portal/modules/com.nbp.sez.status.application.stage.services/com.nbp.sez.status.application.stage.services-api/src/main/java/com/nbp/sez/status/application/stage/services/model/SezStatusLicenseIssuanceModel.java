/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SezStatusLicenseIssuance service. Represents a row in the &quot;nbp_sez_status_licence_issu&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusLicenseIssuanceImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuance
 * @generated
 */
@ProviderType
public interface SezStatusLicenseIssuanceModel
	extends BaseModel<SezStatusLicenseIssuance>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez status license issuance model instance should use the {@link SezStatusLicenseIssuance} interface instead.
	 */

	/**
	 * Returns the primary key of this sez status license issuance.
	 *
	 * @return the primary key of this sez status license issuance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez status license issuance.
	 *
	 * @param primaryKey the primary key of this sez status license issuance
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this sez status license issuance.
	 *
	 * @return the uuid of this sez status license issuance
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this sez status license issuance.
	 *
	 * @param uuid the uuid of this sez status license issuance
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the sez status lic issued ID of this sez status license issuance.
	 *
	 * @return the sez status lic issued ID of this sez status license issuance
	 */
	public long getSezStatusLicIssuedId();

	/**
	 * Sets the sez status lic issued ID of this sez status license issuance.
	 *
	 * @param sezStatusLicIssuedId the sez status lic issued ID of this sez status license issuance
	 */
	public void setSezStatusLicIssuedId(long sezStatusLicIssuedId);

	/**
	 * Returns the group ID of this sez status license issuance.
	 *
	 * @return the group ID of this sez status license issuance
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez status license issuance.
	 *
	 * @param groupId the group ID of this sez status license issuance
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez status license issuance.
	 *
	 * @return the company ID of this sez status license issuance
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez status license issuance.
	 *
	 * @param companyId the company ID of this sez status license issuance
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez status license issuance.
	 *
	 * @return the user ID of this sez status license issuance
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez status license issuance.
	 *
	 * @param userId the user ID of this sez status license issuance
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez status license issuance.
	 *
	 * @return the user uuid of this sez status license issuance
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez status license issuance.
	 *
	 * @param userUuid the user uuid of this sez status license issuance
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez status license issuance.
	 *
	 * @return the user name of this sez status license issuance
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez status license issuance.
	 *
	 * @param userName the user name of this sez status license issuance
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez status license issuance.
	 *
	 * @return the create date of this sez status license issuance
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez status license issuance.
	 *
	 * @param createDate the create date of this sez status license issuance
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez status license issuance.
	 *
	 * @return the modified date of this sez status license issuance
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez status license issuance.
	 *
	 * @param modifiedDate the modified date of this sez status license issuance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this sez status license issuance.
	 *
	 * @return the case ID of this sez status license issuance
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this sez status license issuance.
	 *
	 * @param caseId the case ID of this sez status license issuance
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the licence number of this sez status license issuance.
	 *
	 * @return the licence number of this sez status license issuance
	 */
	@AutoEscape
	public String getLicenceNumber();

	/**
	 * Sets the licence number of this sez status license issuance.
	 *
	 * @param licenceNumber the licence number of this sez status license issuance
	 */
	public void setLicenceNumber(String licenceNumber);

	/**
	 * Returns the name of applicant of this sez status license issuance.
	 *
	 * @return the name of applicant of this sez status license issuance
	 */
	@AutoEscape
	public String getNameOfApplicant();

	/**
	 * Sets the name of applicant of this sez status license issuance.
	 *
	 * @param nameOfApplicant the name of applicant of this sez status license issuance
	 */
	public void setNameOfApplicant(String nameOfApplicant);

	/**
	 * Returns the sez status of this sez status license issuance.
	 *
	 * @return the sez status of this sez status license issuance
	 */
	@AutoEscape
	public String getSezStatus();

	/**
	 * Sets the sez status of this sez status license issuance.
	 *
	 * @param sezStatus the sez status of this sez status license issuance
	 */
	public void setSezStatus(String sezStatus);

	/**
	 * Returns the sez developer number of this sez status license issuance.
	 *
	 * @return the sez developer number of this sez status license issuance
	 */
	@AutoEscape
	public String getSezDeveloperNumber();

	/**
	 * Sets the sez developer number of this sez status license issuance.
	 *
	 * @param sezDeveloperNumber the sez developer number of this sez status license issuance
	 */
	public void setSezDeveloperNumber(String sezDeveloperNumber);

	/**
	 * Returns the date of lic issuance of this sez status license issuance.
	 *
	 * @return the date of lic issuance of this sez status license issuance
	 */
	public Date getDateOfLicIssuance();

	/**
	 * Sets the date of lic issuance of this sez status license issuance.
	 *
	 * @param dateOfLicIssuance the date of lic issuance of this sez status license issuance
	 */
	public void setDateOfLicIssuance(Date dateOfLicIssuance);

	/**
	 * Returns the date of license expiration of this sez status license issuance.
	 *
	 * @return the date of license expiration of this sez status license issuance
	 */
	public Date getDateOfLicenseExpiration();

	/**
	 * Sets the date of license expiration of this sez status license issuance.
	 *
	 * @param dateOfLicenseExpiration the date of license expiration of this sez status license issuance
	 */
	public void setDateOfLicenseExpiration(Date dateOfLicenseExpiration);

	/**
	 * Returns the doc lic file entry ID of this sez status license issuance.
	 *
	 * @return the doc lic file entry ID of this sez status license issuance
	 */
	public long getDocLicFileEntryId();

	/**
	 * Sets the doc lic file entry ID of this sez status license issuance.
	 *
	 * @param docLicFileEntryId the doc lic file entry ID of this sez status license issuance
	 */
	public void setDocLicFileEntryId(long docLicFileEntryId);

	@Override
	public SezStatusLicenseIssuance cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}