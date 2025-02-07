/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjLicenceCertificate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificate
 * @generated
 */
public class NcbjLicenceCertificateWrapper
	extends BaseModelWrapper<NcbjLicenceCertificate>
	implements ModelWrapper<NcbjLicenceCertificate>, NcbjLicenceCertificate {

	public NcbjLicenceCertificateWrapper(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		super(ncbjLicenceCertificate);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncbjLicenceCertificateId", getNcbjLicenceCertificateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("licenceCertificate", getLicenceCertificate());
		attributes.put("NameOfApplicant", getNameOfApplicant());
		attributes.put("nameOfCertification", getNameOfCertification());
		attributes.put("scopeOfCertification", getScopeOfCertification());
		attributes.put("issueDate", getIssueDate());
		attributes.put("expirationDate", getExpirationDate());
		attributes.put("status", getStatus());
		attributes.put("docFileEntry", getDocFileEntry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjLicenceCertificateId = (Long)attributes.get(
			"ncbjLicenceCertificateId");

		if (ncbjLicenceCertificateId != null) {
			setNcbjLicenceCertificateId(ncbjLicenceCertificateId);
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

		String licenceCertificate = (String)attributes.get(
			"licenceCertificate");

		if (licenceCertificate != null) {
			setLicenceCertificate(licenceCertificate);
		}

		String NameOfApplicant = (String)attributes.get("NameOfApplicant");

		if (NameOfApplicant != null) {
			setNameOfApplicant(NameOfApplicant);
		}

		String nameOfCertification = (String)attributes.get(
			"nameOfCertification");

		if (nameOfCertification != null) {
			setNameOfCertification(nameOfCertification);
		}

		String scopeOfCertification = (String)attributes.get(
			"scopeOfCertification");

		if (scopeOfCertification != null) {
			setScopeOfCertification(scopeOfCertification);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long docFileEntry = (Long)attributes.get("docFileEntry");

		if (docFileEntry != null) {
			setDocFileEntry(docFileEntry);
		}
	}

	@Override
	public NcbjLicenceCertificate cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this ncbj licence certificate.
	 *
	 * @return the case ID of this ncbj licence certificate
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this ncbj licence certificate.
	 *
	 * @return the company ID of this ncbj licence certificate
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj licence certificate.
	 *
	 * @return the create date of this ncbj licence certificate
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc file entry of this ncbj licence certificate.
	 *
	 * @return the doc file entry of this ncbj licence certificate
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the expiration date of this ncbj licence certificate.
	 *
	 * @return the expiration date of this ncbj licence certificate
	 */
	@Override
	public Date getExpirationDate() {
		return model.getExpirationDate();
	}

	/**
	 * Returns the group ID of this ncbj licence certificate.
	 *
	 * @return the group ID of this ncbj licence certificate
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this ncbj licence certificate.
	 *
	 * @return the issue date of this ncbj licence certificate
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the licence certificate of this ncbj licence certificate.
	 *
	 * @return the licence certificate of this ncbj licence certificate
	 */
	@Override
	public String getLicenceCertificate() {
		return model.getLicenceCertificate();
	}

	/**
	 * Returns the modified date of this ncbj licence certificate.
	 *
	 * @return the modified date of this ncbj licence certificate
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this ncbj licence certificate.
	 *
	 * @return the name of applicant of this ncbj licence certificate
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the name of certification of this ncbj licence certificate.
	 *
	 * @return the name of certification of this ncbj licence certificate
	 */
	@Override
	public String getNameOfCertification() {
		return model.getNameOfCertification();
	}

	/**
	 * Returns the ncbj licence certificate ID of this ncbj licence certificate.
	 *
	 * @return the ncbj licence certificate ID of this ncbj licence certificate
	 */
	@Override
	public long getNcbjLicenceCertificateId() {
		return model.getNcbjLicenceCertificateId();
	}

	/**
	 * Returns the primary key of this ncbj licence certificate.
	 *
	 * @return the primary key of this ncbj licence certificate
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the scope of certification of this ncbj licence certificate.
	 *
	 * @return the scope of certification of this ncbj licence certificate
	 */
	@Override
	public String getScopeOfCertification() {
		return model.getScopeOfCertification();
	}

	/**
	 * Returns the status of this ncbj licence certificate.
	 *
	 * @return the status of this ncbj licence certificate
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this ncbj licence certificate.
	 *
	 * @return the user ID of this ncbj licence certificate
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj licence certificate.
	 *
	 * @return the user name of this ncbj licence certificate
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj licence certificate.
	 *
	 * @return the user uuid of this ncbj licence certificate
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
	 * Sets the case ID of this ncbj licence certificate.
	 *
	 * @param caseId the case ID of this ncbj licence certificate
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this ncbj licence certificate.
	 *
	 * @param companyId the company ID of this ncbj licence certificate
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj licence certificate.
	 *
	 * @param createDate the create date of this ncbj licence certificate
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc file entry of this ncbj licence certificate.
	 *
	 * @param docFileEntry the doc file entry of this ncbj licence certificate
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the expiration date of this ncbj licence certificate.
	 *
	 * @param expirationDate the expiration date of this ncbj licence certificate
	 */
	@Override
	public void setExpirationDate(Date expirationDate) {
		model.setExpirationDate(expirationDate);
	}

	/**
	 * Sets the group ID of this ncbj licence certificate.
	 *
	 * @param groupId the group ID of this ncbj licence certificate
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this ncbj licence certificate.
	 *
	 * @param issueDate the issue date of this ncbj licence certificate
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the licence certificate of this ncbj licence certificate.
	 *
	 * @param licenceCertificate the licence certificate of this ncbj licence certificate
	 */
	@Override
	public void setLicenceCertificate(String licenceCertificate) {
		model.setLicenceCertificate(licenceCertificate);
	}

	/**
	 * Sets the modified date of this ncbj licence certificate.
	 *
	 * @param modifiedDate the modified date of this ncbj licence certificate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this ncbj licence certificate.
	 *
	 * @param NameOfApplicant the name of applicant of this ncbj licence certificate
	 */
	@Override
	public void setNameOfApplicant(String NameOfApplicant) {
		model.setNameOfApplicant(NameOfApplicant);
	}

	/**
	 * Sets the name of certification of this ncbj licence certificate.
	 *
	 * @param nameOfCertification the name of certification of this ncbj licence certificate
	 */
	@Override
	public void setNameOfCertification(String nameOfCertification) {
		model.setNameOfCertification(nameOfCertification);
	}

	/**
	 * Sets the ncbj licence certificate ID of this ncbj licence certificate.
	 *
	 * @param ncbjLicenceCertificateId the ncbj licence certificate ID of this ncbj licence certificate
	 */
	@Override
	public void setNcbjLicenceCertificateId(long ncbjLicenceCertificateId) {
		model.setNcbjLicenceCertificateId(ncbjLicenceCertificateId);
	}

	/**
	 * Sets the primary key of this ncbj licence certificate.
	 *
	 * @param primaryKey the primary key of this ncbj licence certificate
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the scope of certification of this ncbj licence certificate.
	 *
	 * @param scopeOfCertification the scope of certification of this ncbj licence certificate
	 */
	@Override
	public void setScopeOfCertification(String scopeOfCertification) {
		model.setScopeOfCertification(scopeOfCertification);
	}

	/**
	 * Sets the status of this ncbj licence certificate.
	 *
	 * @param status the status of this ncbj licence certificate
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this ncbj licence certificate.
	 *
	 * @param userId the user ID of this ncbj licence certificate
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj licence certificate.
	 *
	 * @param userName the user name of this ncbj licence certificate
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj licence certificate.
	 *
	 * @param userUuid the user uuid of this ncbj licence certificate
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
	protected NcbjLicenceCertificateWrapper wrap(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return new NcbjLicenceCertificateWrapper(ncbjLicenceCertificate);
	}

}