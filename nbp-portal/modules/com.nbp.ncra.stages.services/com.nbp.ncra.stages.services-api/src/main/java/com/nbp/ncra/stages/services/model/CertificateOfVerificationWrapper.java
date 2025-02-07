/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CertificateOfVerification}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CertificateOfVerification
 * @generated
 */
public class CertificateOfVerificationWrapper
	extends BaseModelWrapper<CertificateOfVerification>
	implements CertificateOfVerification,
			   ModelWrapper<CertificateOfVerification> {

	public CertificateOfVerificationWrapper(
		CertificateOfVerification certificateOfVerification) {

		super(certificateOfVerification);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"certificateOfVerificationId", getCertificateOfVerificationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("productName", getProductName());
		attributes.put("dateCertificateIssued", getDateCertificateIssued());
		attributes.put("dateOfExpiration", getDateOfExpiration());
		attributes.put("certificateNumber", getCertificateNumber());
		attributes.put("caseId", getCaseId());
		attributes.put("documentFileEntryId", getDocumentFileEntryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long certificateOfVerificationId = (Long)attributes.get(
			"certificateOfVerificationId");

		if (certificateOfVerificationId != null) {
			setCertificateOfVerificationId(certificateOfVerificationId);
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

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
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

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Long documentFileEntryId = (Long)attributes.get("documentFileEntryId");

		if (documentFileEntryId != null) {
			setDocumentFileEntryId(documentFileEntryId);
		}
	}

	@Override
	public CertificateOfVerification cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this certificate of verification.
	 *
	 * @return the case ID of this certificate of verification
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the certificate number of this certificate of verification.
	 *
	 * @return the certificate number of this certificate of verification
	 */
	@Override
	public String getCertificateNumber() {
		return model.getCertificateNumber();
	}

	/**
	 * Returns the certificate of verification ID of this certificate of verification.
	 *
	 * @return the certificate of verification ID of this certificate of verification
	 */
	@Override
	public long getCertificateOfVerificationId() {
		return model.getCertificateOfVerificationId();
	}

	/**
	 * Returns the company ID of this certificate of verification.
	 *
	 * @return the company ID of this certificate of verification
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this certificate of verification.
	 *
	 * @return the create date of this certificate of verification
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date certificate issued of this certificate of verification.
	 *
	 * @return the date certificate issued of this certificate of verification
	 */
	@Override
	public Date getDateCertificateIssued() {
		return model.getDateCertificateIssued();
	}

	/**
	 * Returns the date of expiration of this certificate of verification.
	 *
	 * @return the date of expiration of this certificate of verification
	 */
	@Override
	public Date getDateOfExpiration() {
		return model.getDateOfExpiration();
	}

	/**
	 * Returns the document file entry ID of this certificate of verification.
	 *
	 * @return the document file entry ID of this certificate of verification
	 */
	@Override
	public long getDocumentFileEntryId() {
		return model.getDocumentFileEntryId();
	}

	/**
	 * Returns the group ID of this certificate of verification.
	 *
	 * @return the group ID of this certificate of verification
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this certificate of verification.
	 *
	 * @return the modified date of this certificate of verification
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this certificate of verification.
	 *
	 * @return the name of applicant of this certificate of verification
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the primary key of this certificate of verification.
	 *
	 * @return the primary key of this certificate of verification
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product name of this certificate of verification.
	 *
	 * @return the product name of this certificate of verification
	 */
	@Override
	public String getProductName() {
		return model.getProductName();
	}

	/**
	 * Returns the user ID of this certificate of verification.
	 *
	 * @return the user ID of this certificate of verification
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this certificate of verification.
	 *
	 * @return the user name of this certificate of verification
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this certificate of verification.
	 *
	 * @return the user uuid of this certificate of verification
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
	 * Sets the case ID of this certificate of verification.
	 *
	 * @param caseId the case ID of this certificate of verification
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the certificate number of this certificate of verification.
	 *
	 * @param certificateNumber the certificate number of this certificate of verification
	 */
	@Override
	public void setCertificateNumber(String certificateNumber) {
		model.setCertificateNumber(certificateNumber);
	}

	/**
	 * Sets the certificate of verification ID of this certificate of verification.
	 *
	 * @param certificateOfVerificationId the certificate of verification ID of this certificate of verification
	 */
	@Override
	public void setCertificateOfVerificationId(
		long certificateOfVerificationId) {

		model.setCertificateOfVerificationId(certificateOfVerificationId);
	}

	/**
	 * Sets the company ID of this certificate of verification.
	 *
	 * @param companyId the company ID of this certificate of verification
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this certificate of verification.
	 *
	 * @param createDate the create date of this certificate of verification
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date certificate issued of this certificate of verification.
	 *
	 * @param dateCertificateIssued the date certificate issued of this certificate of verification
	 */
	@Override
	public void setDateCertificateIssued(Date dateCertificateIssued) {
		model.setDateCertificateIssued(dateCertificateIssued);
	}

	/**
	 * Sets the date of expiration of this certificate of verification.
	 *
	 * @param dateOfExpiration the date of expiration of this certificate of verification
	 */
	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		model.setDateOfExpiration(dateOfExpiration);
	}

	/**
	 * Sets the document file entry ID of this certificate of verification.
	 *
	 * @param documentFileEntryId the document file entry ID of this certificate of verification
	 */
	@Override
	public void setDocumentFileEntryId(long documentFileEntryId) {
		model.setDocumentFileEntryId(documentFileEntryId);
	}

	/**
	 * Sets the group ID of this certificate of verification.
	 *
	 * @param groupId the group ID of this certificate of verification
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this certificate of verification.
	 *
	 * @param modifiedDate the modified date of this certificate of verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this certificate of verification.
	 *
	 * @param nameOfApplicant the name of applicant of this certificate of verification
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the primary key of this certificate of verification.
	 *
	 * @param primaryKey the primary key of this certificate of verification
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product name of this certificate of verification.
	 *
	 * @param productName the product name of this certificate of verification
	 */
	@Override
	public void setProductName(String productName) {
		model.setProductName(productName);
	}

	/**
	 * Sets the user ID of this certificate of verification.
	 *
	 * @param userId the user ID of this certificate of verification
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this certificate of verification.
	 *
	 * @param userName the user name of this certificate of verification
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this certificate of verification.
	 *
	 * @param userUuid the user uuid of this certificate of verification
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
	protected CertificateOfVerificationWrapper wrap(
		CertificateOfVerification certificateOfVerification) {

		return new CertificateOfVerificationWrapper(certificateOfVerification);
	}

}