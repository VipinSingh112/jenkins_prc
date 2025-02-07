/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezStatusLicenseIssuance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuance
 * @generated
 */
public class SezStatusLicenseIssuanceWrapper
	extends BaseModelWrapper<SezStatusLicenseIssuance>
	implements ModelWrapper<SezStatusLicenseIssuance>,
			   SezStatusLicenseIssuance {

	public SezStatusLicenseIssuanceWrapper(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		super(sezStatusLicenseIssuance);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sezStatusLicIssuedId", getSezStatusLicIssuedId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("licenceNumber", getLicenceNumber());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("sezStatus", getSezStatus());
		attributes.put("sezDeveloperNumber", getSezDeveloperNumber());
		attributes.put("dateOfLicIssuance", getDateOfLicIssuance());
		attributes.put("dateOfLicenseExpiration", getDateOfLicenseExpiration());
		attributes.put("docLicFileEntryId", getDocLicFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sezStatusLicIssuedId = (Long)attributes.get(
			"sezStatusLicIssuedId");

		if (sezStatusLicIssuedId != null) {
			setSezStatusLicIssuedId(sezStatusLicIssuedId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String licenceNumber = (String)attributes.get("licenceNumber");

		if (licenceNumber != null) {
			setLicenceNumber(licenceNumber);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String sezStatus = (String)attributes.get("sezStatus");

		if (sezStatus != null) {
			setSezStatus(sezStatus);
		}

		String sezDeveloperNumber = (String)attributes.get(
			"sezDeveloperNumber");

		if (sezDeveloperNumber != null) {
			setSezDeveloperNumber(sezDeveloperNumber);
		}

		Date dateOfLicIssuance = (Date)attributes.get("dateOfLicIssuance");

		if (dateOfLicIssuance != null) {
			setDateOfLicIssuance(dateOfLicIssuance);
		}

		Date dateOfLicenseExpiration = (Date)attributes.get(
			"dateOfLicenseExpiration");

		if (dateOfLicenseExpiration != null) {
			setDateOfLicenseExpiration(dateOfLicenseExpiration);
		}

		Long docLicFileEntryId = (Long)attributes.get("docLicFileEntryId");

		if (docLicFileEntryId != null) {
			setDocLicFileEntryId(docLicFileEntryId);
		}
	}

	@Override
	public SezStatusLicenseIssuance cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this sez status license issuance.
	 *
	 * @return the case ID of this sez status license issuance
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this sez status license issuance.
	 *
	 * @return the company ID of this sez status license issuance
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez status license issuance.
	 *
	 * @return the create date of this sez status license issuance
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of license expiration of this sez status license issuance.
	 *
	 * @return the date of license expiration of this sez status license issuance
	 */
	@Override
	public Date getDateOfLicenseExpiration() {
		return model.getDateOfLicenseExpiration();
	}

	/**
	 * Returns the date of lic issuance of this sez status license issuance.
	 *
	 * @return the date of lic issuance of this sez status license issuance
	 */
	@Override
	public Date getDateOfLicIssuance() {
		return model.getDateOfLicIssuance();
	}

	/**
	 * Returns the doc lic file entry ID of this sez status license issuance.
	 *
	 * @return the doc lic file entry ID of this sez status license issuance
	 */
	@Override
	public long getDocLicFileEntryId() {
		return model.getDocLicFileEntryId();
	}

	/**
	 * Returns the group ID of this sez status license issuance.
	 *
	 * @return the group ID of this sez status license issuance
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the licence number of this sez status license issuance.
	 *
	 * @return the licence number of this sez status license issuance
	 */
	@Override
	public String getLicenceNumber() {
		return model.getLicenceNumber();
	}

	/**
	 * Returns the modified date of this sez status license issuance.
	 *
	 * @return the modified date of this sez status license issuance
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this sez status license issuance.
	 *
	 * @return the name of applicant of this sez status license issuance
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the primary key of this sez status license issuance.
	 *
	 * @return the primary key of this sez status license issuance
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez developer number of this sez status license issuance.
	 *
	 * @return the sez developer number of this sez status license issuance
	 */
	@Override
	public String getSezDeveloperNumber() {
		return model.getSezDeveloperNumber();
	}

	/**
	 * Returns the sez status of this sez status license issuance.
	 *
	 * @return the sez status of this sez status license issuance
	 */
	@Override
	public String getSezStatus() {
		return model.getSezStatus();
	}

	/**
	 * Returns the sez status lic issued ID of this sez status license issuance.
	 *
	 * @return the sez status lic issued ID of this sez status license issuance
	 */
	@Override
	public long getSezStatusLicIssuedId() {
		return model.getSezStatusLicIssuedId();
	}

	/**
	 * Returns the user ID of this sez status license issuance.
	 *
	 * @return the user ID of this sez status license issuance
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez status license issuance.
	 *
	 * @return the user name of this sez status license issuance
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez status license issuance.
	 *
	 * @return the user uuid of this sez status license issuance
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this sez status license issuance.
	 *
	 * @return the uuid of this sez status license issuance
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this sez status license issuance.
	 *
	 * @param caseId the case ID of this sez status license issuance
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this sez status license issuance.
	 *
	 * @param companyId the company ID of this sez status license issuance
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez status license issuance.
	 *
	 * @param createDate the create date of this sez status license issuance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of license expiration of this sez status license issuance.
	 *
	 * @param dateOfLicenseExpiration the date of license expiration of this sez status license issuance
	 */
	@Override
	public void setDateOfLicenseExpiration(Date dateOfLicenseExpiration) {
		model.setDateOfLicenseExpiration(dateOfLicenseExpiration);
	}

	/**
	 * Sets the date of lic issuance of this sez status license issuance.
	 *
	 * @param dateOfLicIssuance the date of lic issuance of this sez status license issuance
	 */
	@Override
	public void setDateOfLicIssuance(Date dateOfLicIssuance) {
		model.setDateOfLicIssuance(dateOfLicIssuance);
	}

	/**
	 * Sets the doc lic file entry ID of this sez status license issuance.
	 *
	 * @param docLicFileEntryId the doc lic file entry ID of this sez status license issuance
	 */
	@Override
	public void setDocLicFileEntryId(long docLicFileEntryId) {
		model.setDocLicFileEntryId(docLicFileEntryId);
	}

	/**
	 * Sets the group ID of this sez status license issuance.
	 *
	 * @param groupId the group ID of this sez status license issuance
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the licence number of this sez status license issuance.
	 *
	 * @param licenceNumber the licence number of this sez status license issuance
	 */
	@Override
	public void setLicenceNumber(String licenceNumber) {
		model.setLicenceNumber(licenceNumber);
	}

	/**
	 * Sets the modified date of this sez status license issuance.
	 *
	 * @param modifiedDate the modified date of this sez status license issuance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this sez status license issuance.
	 *
	 * @param nameOfApplicant the name of applicant of this sez status license issuance
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the primary key of this sez status license issuance.
	 *
	 * @param primaryKey the primary key of this sez status license issuance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez developer number of this sez status license issuance.
	 *
	 * @param sezDeveloperNumber the sez developer number of this sez status license issuance
	 */
	@Override
	public void setSezDeveloperNumber(String sezDeveloperNumber) {
		model.setSezDeveloperNumber(sezDeveloperNumber);
	}

	/**
	 * Sets the sez status of this sez status license issuance.
	 *
	 * @param sezStatus the sez status of this sez status license issuance
	 */
	@Override
	public void setSezStatus(String sezStatus) {
		model.setSezStatus(sezStatus);
	}

	/**
	 * Sets the sez status lic issued ID of this sez status license issuance.
	 *
	 * @param sezStatusLicIssuedId the sez status lic issued ID of this sez status license issuance
	 */
	@Override
	public void setSezStatusLicIssuedId(long sezStatusLicIssuedId) {
		model.setSezStatusLicIssuedId(sezStatusLicIssuedId);
	}

	/**
	 * Sets the user ID of this sez status license issuance.
	 *
	 * @param userId the user ID of this sez status license issuance
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez status license issuance.
	 *
	 * @param userName the user name of this sez status license issuance
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez status license issuance.
	 *
	 * @param userUuid the user uuid of this sez status license issuance
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this sez status license issuance.
	 *
	 * @param uuid the uuid of this sez status license issuance
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected SezStatusLicenseIssuanceWrapper wrap(
		SezStatusLicenseIssuance sezStatusLicenseIssuance) {

		return new SezStatusLicenseIssuanceWrapper(sezStatusLicenseIssuance);
	}

}