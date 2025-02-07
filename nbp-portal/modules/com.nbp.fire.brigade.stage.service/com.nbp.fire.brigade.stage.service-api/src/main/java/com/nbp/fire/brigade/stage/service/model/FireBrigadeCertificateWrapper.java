/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeCertificate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificate
 * @generated
 */
public class FireBrigadeCertificateWrapper
	extends BaseModelWrapper<FireBrigadeCertificate>
	implements FireBrigadeCertificate, ModelWrapper<FireBrigadeCertificate> {

	public FireBrigadeCertificateWrapper(
		FireBrigadeCertificate fireBrigadeCertificate) {

		super(fireBrigadeCertificate);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadeCertificateId", getFireBrigadeCertificateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfOwner", getNameOfOwner());
		attributes.put("typeOfPremises", getTypeOfPremises());
		attributes.put("issueDate", getIssueDate());
		attributes.put("expirationDate", getExpirationDate());
		attributes.put("docFileEntry", getDocFileEntry());
		attributes.put("caseId", getCaseId());
		attributes.put("certificateNumber", getCertificateNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeCertificateId = (Long)attributes.get(
			"fireBrigadeCertificateId");

		if (fireBrigadeCertificateId != null) {
			setFireBrigadeCertificateId(fireBrigadeCertificateId);
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

		String nameOfOwner = (String)attributes.get("nameOfOwner");

		if (nameOfOwner != null) {
			setNameOfOwner(nameOfOwner);
		}

		String typeOfPremises = (String)attributes.get("typeOfPremises");

		if (typeOfPremises != null) {
			setTypeOfPremises(typeOfPremises);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Date expirationDate = (Date)attributes.get("expirationDate");

		if (expirationDate != null) {
			setExpirationDate(expirationDate);
		}

		Long docFileEntry = (Long)attributes.get("docFileEntry");

		if (docFileEntry != null) {
			setDocFileEntry(docFileEntry);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String certificateNumber = (String)attributes.get("certificateNumber");

		if (certificateNumber != null) {
			setCertificateNumber(certificateNumber);
		}
	}

	@Override
	public FireBrigadeCertificate cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this fire brigade certificate.
	 *
	 * @return the case ID of this fire brigade certificate
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the certificate number of this fire brigade certificate.
	 *
	 * @return the certificate number of this fire brigade certificate
	 */
	@Override
	public String getCertificateNumber() {
		return model.getCertificateNumber();
	}

	/**
	 * Returns the company ID of this fire brigade certificate.
	 *
	 * @return the company ID of this fire brigade certificate
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade certificate.
	 *
	 * @return the create date of this fire brigade certificate
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc file entry of this fire brigade certificate.
	 *
	 * @return the doc file entry of this fire brigade certificate
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the expiration date of this fire brigade certificate.
	 *
	 * @return the expiration date of this fire brigade certificate
	 */
	@Override
	public Date getExpirationDate() {
		return model.getExpirationDate();
	}

	/**
	 * Returns the fire brigade certificate ID of this fire brigade certificate.
	 *
	 * @return the fire brigade certificate ID of this fire brigade certificate
	 */
	@Override
	public long getFireBrigadeCertificateId() {
		return model.getFireBrigadeCertificateId();
	}

	/**
	 * Returns the group ID of this fire brigade certificate.
	 *
	 * @return the group ID of this fire brigade certificate
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this fire brigade certificate.
	 *
	 * @return the issue date of this fire brigade certificate
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the modified date of this fire brigade certificate.
	 *
	 * @return the modified date of this fire brigade certificate
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of owner of this fire brigade certificate.
	 *
	 * @return the name of owner of this fire brigade certificate
	 */
	@Override
	public String getNameOfOwner() {
		return model.getNameOfOwner();
	}

	/**
	 * Returns the primary key of this fire brigade certificate.
	 *
	 * @return the primary key of this fire brigade certificate
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of premises of this fire brigade certificate.
	 *
	 * @return the type of premises of this fire brigade certificate
	 */
	@Override
	public String getTypeOfPremises() {
		return model.getTypeOfPremises();
	}

	/**
	 * Returns the user ID of this fire brigade certificate.
	 *
	 * @return the user ID of this fire brigade certificate
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade certificate.
	 *
	 * @return the user name of this fire brigade certificate
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade certificate.
	 *
	 * @return the user uuid of this fire brigade certificate
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
	 * Sets the case ID of this fire brigade certificate.
	 *
	 * @param caseId the case ID of this fire brigade certificate
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the certificate number of this fire brigade certificate.
	 *
	 * @param certificateNumber the certificate number of this fire brigade certificate
	 */
	@Override
	public void setCertificateNumber(String certificateNumber) {
		model.setCertificateNumber(certificateNumber);
	}

	/**
	 * Sets the company ID of this fire brigade certificate.
	 *
	 * @param companyId the company ID of this fire brigade certificate
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade certificate.
	 *
	 * @param createDate the create date of this fire brigade certificate
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc file entry of this fire brigade certificate.
	 *
	 * @param docFileEntry the doc file entry of this fire brigade certificate
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the expiration date of this fire brigade certificate.
	 *
	 * @param expirationDate the expiration date of this fire brigade certificate
	 */
	@Override
	public void setExpirationDate(Date expirationDate) {
		model.setExpirationDate(expirationDate);
	}

	/**
	 * Sets the fire brigade certificate ID of this fire brigade certificate.
	 *
	 * @param fireBrigadeCertificateId the fire brigade certificate ID of this fire brigade certificate
	 */
	@Override
	public void setFireBrigadeCertificateId(long fireBrigadeCertificateId) {
		model.setFireBrigadeCertificateId(fireBrigadeCertificateId);
	}

	/**
	 * Sets the group ID of this fire brigade certificate.
	 *
	 * @param groupId the group ID of this fire brigade certificate
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this fire brigade certificate.
	 *
	 * @param issueDate the issue date of this fire brigade certificate
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the modified date of this fire brigade certificate.
	 *
	 * @param modifiedDate the modified date of this fire brigade certificate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of owner of this fire brigade certificate.
	 *
	 * @param nameOfOwner the name of owner of this fire brigade certificate
	 */
	@Override
	public void setNameOfOwner(String nameOfOwner) {
		model.setNameOfOwner(nameOfOwner);
	}

	/**
	 * Sets the primary key of this fire brigade certificate.
	 *
	 * @param primaryKey the primary key of this fire brigade certificate
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of premises of this fire brigade certificate.
	 *
	 * @param typeOfPremises the type of premises of this fire brigade certificate
	 */
	@Override
	public void setTypeOfPremises(String typeOfPremises) {
		model.setTypeOfPremises(typeOfPremises);
	}

	/**
	 * Sets the user ID of this fire brigade certificate.
	 *
	 * @param userId the user ID of this fire brigade certificate
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade certificate.
	 *
	 * @param userName the user name of this fire brigade certificate
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade certificate.
	 *
	 * @param userUuid the user uuid of this fire brigade certificate
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
	protected FireBrigadeCertificateWrapper wrap(
		FireBrigadeCertificate fireBrigadeCertificate) {

		return new FireBrigadeCertificateWrapper(fireBrigadeCertificate);
	}

}