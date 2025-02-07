/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MedicalCertificateIssuance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuance
 * @generated
 */
public class MedicalCertificateIssuanceWrapper
	extends BaseModelWrapper<MedicalCertificateIssuance>
	implements MedicalCertificateIssuance,
			   ModelWrapper<MedicalCertificateIssuance> {

	public MedicalCertificateIssuanceWrapper(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		super(medicalCertificateIssuance);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"medicalCertificateIssuanceId", getMedicalCertificateIssuanceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("licenceNumber", getLicenceNumber());
		attributes.put("status", getStatus());
		attributes.put("medicalCategory", getMedicalCategory());
		attributes.put("dateOfLicIssuance", getDateOfLicIssuance());
		attributes.put("dateOfLicenseExpiration", getDateOfLicenseExpiration());
		attributes.put("docLicFileEntryId", getDocLicFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long medicalCertificateIssuanceId = (Long)attributes.get(
			"medicalCertificateIssuanceId");

		if (medicalCertificateIssuanceId != null) {
			setMedicalCertificateIssuanceId(medicalCertificateIssuanceId);
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

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String medicalCategory = (String)attributes.get("medicalCategory");

		if (medicalCategory != null) {
			setMedicalCategory(medicalCategory);
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
	public MedicalCertificateIssuance cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this medical certificate issuance.
	 *
	 * @return the case ID of this medical certificate issuance
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this medical certificate issuance.
	 *
	 * @return the company ID of this medical certificate issuance
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this medical certificate issuance.
	 *
	 * @return the create date of this medical certificate issuance
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of license expiration of this medical certificate issuance.
	 *
	 * @return the date of license expiration of this medical certificate issuance
	 */
	@Override
	public Date getDateOfLicenseExpiration() {
		return model.getDateOfLicenseExpiration();
	}

	/**
	 * Returns the date of lic issuance of this medical certificate issuance.
	 *
	 * @return the date of lic issuance of this medical certificate issuance
	 */
	@Override
	public Date getDateOfLicIssuance() {
		return model.getDateOfLicIssuance();
	}

	/**
	 * Returns the doc lic file entry ID of this medical certificate issuance.
	 *
	 * @return the doc lic file entry ID of this medical certificate issuance
	 */
	@Override
	public long getDocLicFileEntryId() {
		return model.getDocLicFileEntryId();
	}

	/**
	 * Returns the group ID of this medical certificate issuance.
	 *
	 * @return the group ID of this medical certificate issuance
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the licence number of this medical certificate issuance.
	 *
	 * @return the licence number of this medical certificate issuance
	 */
	@Override
	public String getLicenceNumber() {
		return model.getLicenceNumber();
	}

	/**
	 * Returns the medical category of this medical certificate issuance.
	 *
	 * @return the medical category of this medical certificate issuance
	 */
	@Override
	public String getMedicalCategory() {
		return model.getMedicalCategory();
	}

	/**
	 * Returns the medical certificate issuance ID of this medical certificate issuance.
	 *
	 * @return the medical certificate issuance ID of this medical certificate issuance
	 */
	@Override
	public long getMedicalCertificateIssuanceId() {
		return model.getMedicalCertificateIssuanceId();
	}

	/**
	 * Returns the modified date of this medical certificate issuance.
	 *
	 * @return the modified date of this medical certificate issuance
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this medical certificate issuance.
	 *
	 * @return the primary key of this medical certificate issuance
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this medical certificate issuance.
	 *
	 * @return the status of this medical certificate issuance
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this medical certificate issuance.
	 *
	 * @return the user ID of this medical certificate issuance
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical certificate issuance.
	 *
	 * @return the user name of this medical certificate issuance
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical certificate issuance.
	 *
	 * @return the user uuid of this medical certificate issuance
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this medical certificate issuance.
	 *
	 * @param caseId the case ID of this medical certificate issuance
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this medical certificate issuance.
	 *
	 * @param companyId the company ID of this medical certificate issuance
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this medical certificate issuance.
	 *
	 * @param createDate the create date of this medical certificate issuance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of license expiration of this medical certificate issuance.
	 *
	 * @param dateOfLicenseExpiration the date of license expiration of this medical certificate issuance
	 */
	@Override
	public void setDateOfLicenseExpiration(Date dateOfLicenseExpiration) {
		model.setDateOfLicenseExpiration(dateOfLicenseExpiration);
	}

	/**
	 * Sets the date of lic issuance of this medical certificate issuance.
	 *
	 * @param dateOfLicIssuance the date of lic issuance of this medical certificate issuance
	 */
	@Override
	public void setDateOfLicIssuance(Date dateOfLicIssuance) {
		model.setDateOfLicIssuance(dateOfLicIssuance);
	}

	/**
	 * Sets the doc lic file entry ID of this medical certificate issuance.
	 *
	 * @param docLicFileEntryId the doc lic file entry ID of this medical certificate issuance
	 */
	@Override
	public void setDocLicFileEntryId(long docLicFileEntryId) {
		model.setDocLicFileEntryId(docLicFileEntryId);
	}

	/**
	 * Sets the group ID of this medical certificate issuance.
	 *
	 * @param groupId the group ID of this medical certificate issuance
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the licence number of this medical certificate issuance.
	 *
	 * @param licenceNumber the licence number of this medical certificate issuance
	 */
	@Override
	public void setLicenceNumber(String licenceNumber) {
		model.setLicenceNumber(licenceNumber);
	}

	/**
	 * Sets the medical category of this medical certificate issuance.
	 *
	 * @param medicalCategory the medical category of this medical certificate issuance
	 */
	@Override
	public void setMedicalCategory(String medicalCategory) {
		model.setMedicalCategory(medicalCategory);
	}

	/**
	 * Sets the medical certificate issuance ID of this medical certificate issuance.
	 *
	 * @param medicalCertificateIssuanceId the medical certificate issuance ID of this medical certificate issuance
	 */
	@Override
	public void setMedicalCertificateIssuanceId(
		long medicalCertificateIssuanceId) {

		model.setMedicalCertificateIssuanceId(medicalCertificateIssuanceId);
	}

	/**
	 * Sets the modified date of this medical certificate issuance.
	 *
	 * @param modifiedDate the modified date of this medical certificate issuance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this medical certificate issuance.
	 *
	 * @param primaryKey the primary key of this medical certificate issuance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this medical certificate issuance.
	 *
	 * @param status the status of this medical certificate issuance
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this medical certificate issuance.
	 *
	 * @param userId the user ID of this medical certificate issuance
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical certificate issuance.
	 *
	 * @param userName the user name of this medical certificate issuance
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical certificate issuance.
	 *
	 * @param userUuid the user uuid of this medical certificate issuance
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected MedicalCertificateIssuanceWrapper wrap(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		return new MedicalCertificateIssuanceWrapper(
			medicalCertificateIssuance);
	}

}