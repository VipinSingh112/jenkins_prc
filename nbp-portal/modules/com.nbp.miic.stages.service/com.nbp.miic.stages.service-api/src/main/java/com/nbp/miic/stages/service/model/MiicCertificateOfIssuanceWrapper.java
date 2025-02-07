/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicCertificateOfIssuance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuance
 * @generated
 */
public class MiicCertificateOfIssuanceWrapper
	extends BaseModelWrapper<MiicCertificateOfIssuance>
	implements MiicCertificateOfIssuance,
			   ModelWrapper<MiicCertificateOfIssuance> {

	public MiicCertificateOfIssuanceWrapper(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		super(miicCertificateOfIssuance);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miicCertificateOfIssuanceId", getMiicCertificateOfIssuanceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("dateCertificateIssued", getDateCertificateIssued());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("documentFileEntryId", getDocumentFileEntryId());
		attributes.put("caseId", getCaseId());
		attributes.put("nameOfLicensedTrustee", getNameOfLicensedTrustee());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miicCertificateOfIssuanceId = (Long)attributes.get(
			"miicCertificateOfIssuanceId");

		if (miicCertificateOfIssuanceId != null) {
			setMiicCertificateOfIssuanceId(miicCertificateOfIssuanceId);
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

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		Date dateCertificateIssued = (Date)attributes.get(
			"dateCertificateIssued");

		if (dateCertificateIssued != null) {
			setDateCertificateIssued(dateCertificateIssued);
		}

		Date dateOfExpiration = (Date)attributes.get("dateOfExpiration");

		if (dateOfExpiration != null) {
			setDateOfExpiration(dateOfExpiration);
		}

		Long documentFileEntryId = (Long)attributes.get("documentFileEntryId");

		if (documentFileEntryId != null) {
			setDocumentFileEntryId(documentFileEntryId);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String nameOfLicensedTrustee = (String)attributes.get(
			"nameOfLicensedTrustee");

		if (nameOfLicensedTrustee != null) {
			setNameOfLicensedTrustee(nameOfLicensedTrustee);
		}
	}

	@Override
	public MiicCertificateOfIssuance cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this miic certificate of issuance.
	 *
	 * @return the case ID of this miic certificate of issuance
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the certificate number of this miic certificate of issuance.
	 *
	 * @return the certificate number of this miic certificate of issuance
	 */
	@Override
	public String getCertificateNumber() {
		return model.getCertificateNumber();
	}

	/**
	 * Returns the company ID of this miic certificate of issuance.
	 *
	 * @return the company ID of this miic certificate of issuance
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this miic certificate of issuance.
	 *
	 * @return the create date of this miic certificate of issuance
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date certificate issued of this miic certificate of issuance.
	 *
	 * @return the date certificate issued of this miic certificate of issuance
	 */
	@Override
	public Date getDateCertificateIssued() {
		return model.getDateCertificateIssued();
	}

	/**
	 * Returns the date of expiration of this miic certificate of issuance.
	 *
	 * @return the date of expiration of this miic certificate of issuance
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the document file entry ID of this miic certificate of issuance.
	 *
	 * @return the document file entry ID of this miic certificate of issuance
	 */
	@Override
	public long getDocumentFileEntryId() {
		return model.getDocumentFileEntryId();
	}

	/**
	 * Returns the group ID of this miic certificate of issuance.
	 *
	 * @return the group ID of this miic certificate of issuance
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the miic certificate of issuance ID of this miic certificate of issuance.
	 *
	 * @return the miic certificate of issuance ID of this miic certificate of issuance
	 */
	@Override
	public long getMiicCertificateOfIssuanceId() {
		return model.getMiicCertificateOfIssuanceId();
	}

	/**
	 * Returns the modified date of this miic certificate of issuance.
	 *
	 * @return the modified date of this miic certificate of issuance
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of licensed trustee of this miic certificate of issuance.
	 *
	 * @return the name of licensed trustee of this miic certificate of issuance
	 */
	@Override
	public String getNameOfLicensedTrustee() {
		return model.getNameOfLicensedTrustee();
	}

	/**
	 * Returns the primary key of this miic certificate of issuance.
	 *
	 * @return the primary key of this miic certificate of issuance
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this miic certificate of issuance.
	 *
	 * @return the user ID of this miic certificate of issuance
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic certificate of issuance.
	 *
	 * @return the user name of this miic certificate of issuance
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic certificate of issuance.
	 *
	 * @return the user uuid of this miic certificate of issuance
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
	 * Sets the case ID of this miic certificate of issuance.
	 *
	 * @param caseId the case ID of this miic certificate of issuance
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the certificate number of this miic certificate of issuance.
	 *
	 * @param certificateNumber the certificate number of this miic certificate of issuance
	 */
	@Override
	public void setCertificateNumber(String certificateNumber) {
		model.setCertificateNumber(certificateNumber);
	}

	/**
	 * Sets the company ID of this miic certificate of issuance.
	 *
	 * @param companyId the company ID of this miic certificate of issuance
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this miic certificate of issuance.
	 *
	 * @param createDate the create date of this miic certificate of issuance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date certificate issued of this miic certificate of issuance.
	 *
	 * @param dateCertificateIssued the date certificate issued of this miic certificate of issuance
	 */
	@Override
	public void setDateCertificateIssued(Date dateCertificateIssued) {
		model.setDateCertificateIssued(dateCertificateIssued);
	}

	/**
	 * Sets the date of expiration of this miic certificate of issuance.
	 *
	 * @param dateOfExpiration the date of expiration of this miic certificate of issuance
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the document file entry ID of this miic certificate of issuance.
	 *
	 * @param documentFileEntryId the document file entry ID of this miic certificate of issuance
	 */
	@Override
	public void setDocumentFileEntryId(long documentFileEntryId) {
		model.setDocumentFileEntryId(documentFileEntryId);
	}

	/**
	 * Sets the group ID of this miic certificate of issuance.
	 *
	 * @param groupId the group ID of this miic certificate of issuance
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the miic certificate of issuance ID of this miic certificate of issuance.
	 *
	 * @param miicCertificateOfIssuanceId the miic certificate of issuance ID of this miic certificate of issuance
	 */
	@Override
	public void setMiicCertificateOfIssuanceId(
		long miicCertificateOfIssuanceId) {

		model.setMiicCertificateOfIssuanceId(miicCertificateOfIssuanceId);
	}

	/**
	 * Sets the modified date of this miic certificate of issuance.
	 *
	 * @param modifiedDate the modified date of this miic certificate of issuance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of licensed trustee of this miic certificate of issuance.
	 *
	 * @param nameOfLicensedTrustee the name of licensed trustee of this miic certificate of issuance
	 */
	@Override
	public void setNameOfLicensedTrustee(String nameOfLicensedTrustee) {
		model.setNameOfLicensedTrustee(nameOfLicensedTrustee);
	}

	/**
	 * Sets the primary key of this miic certificate of issuance.
	 *
	 * @param primaryKey the primary key of this miic certificate of issuance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this miic certificate of issuance.
	 *
	 * @param userId the user ID of this miic certificate of issuance
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic certificate of issuance.
	 *
	 * @param userName the user name of this miic certificate of issuance
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic certificate of issuance.
	 *
	 * @param userUuid the user uuid of this miic certificate of issuance
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
	protected MiicCertificateOfIssuanceWrapper wrap(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return new MiicCertificateOfIssuanceWrapper(miicCertificateOfIssuance);
	}

}