/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QueryLicenceCertificate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificate
 * @generated
 */
public class QueryLicenceCertificateWrapper
	extends BaseModelWrapper<QueryLicenceCertificate>
	implements ModelWrapper<QueryLicenceCertificate>, QueryLicenceCertificate {

	public QueryLicenceCertificateWrapper(
		QueryLicenceCertificate queryLicenceCertificate) {

		super(queryLicenceCertificate);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"queryLicenceCertificateId", getQueryLicenceCertificateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("licenceCertificate", getLicenceCertificate());
		attributes.put("category", getCategory());
		attributes.put("issueDate", getIssueDate());
		attributes.put("expirationDate", getExpirationDate());
		attributes.put("status", getStatus());
		attributes.put("docFileEntry", getDocFileEntry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long queryLicenceCertificateId = (Long)attributes.get(
			"queryLicenceCertificateId");

		if (queryLicenceCertificateId != null) {
			setQueryLicenceCertificateId(queryLicenceCertificateId);
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

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
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
	public QueryLicenceCertificate cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this query licence certificate.
	 *
	 * @return the case ID of this query licence certificate
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the category of this query licence certificate.
	 *
	 * @return the category of this query licence certificate
	 */
	@Override
	public String getCategory() {
		return model.getCategory();
	}

	/**
	 * Returns the company ID of this query licence certificate.
	 *
	 * @return the company ID of this query licence certificate
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this query licence certificate.
	 *
	 * @return the create date of this query licence certificate
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the doc file entry of this query licence certificate.
	 *
	 * @return the doc file entry of this query licence certificate
	 */
	@Override
	public long getDocFileEntry() {
		return model.getDocFileEntry();
	}

	/**
	 * Returns the expiration date of this query licence certificate.
	 *
	 * @return the expiration date of this query licence certificate
	 */
	@Override
	public Date getExpirationDate() {
		return model.getExpirationDate();
	}

	/**
	 * Returns the group ID of this query licence certificate.
	 *
	 * @return the group ID of this query licence certificate
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the issue date of this query licence certificate.
	 *
	 * @return the issue date of this query licence certificate
	 */
	@Override
	public Date getIssueDate() {
		return model.getIssueDate();
	}

	/**
	 * Returns the licence certificate of this query licence certificate.
	 *
	 * @return the licence certificate of this query licence certificate
	 */
	@Override
	public String getLicenceCertificate() {
		return model.getLicenceCertificate();
	}

	/**
	 * Returns the modified date of this query licence certificate.
	 *
	 * @return the modified date of this query licence certificate
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this query licence certificate.
	 *
	 * @return the primary key of this query licence certificate
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the query licence certificate ID of this query licence certificate.
	 *
	 * @return the query licence certificate ID of this query licence certificate
	 */
	@Override
	public long getQueryLicenceCertificateId() {
		return model.getQueryLicenceCertificateId();
	}

	/**
	 * Returns the status of this query licence certificate.
	 *
	 * @return the status of this query licence certificate
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this query licence certificate.
	 *
	 * @return the user ID of this query licence certificate
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this query licence certificate.
	 *
	 * @return the user name of this query licence certificate
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this query licence certificate.
	 *
	 * @return the user uuid of this query licence certificate
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
	 * Sets the case ID of this query licence certificate.
	 *
	 * @param caseId the case ID of this query licence certificate
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the category of this query licence certificate.
	 *
	 * @param category the category of this query licence certificate
	 */
	@Override
	public void setCategory(String category) {
		model.setCategory(category);
	}

	/**
	 * Sets the company ID of this query licence certificate.
	 *
	 * @param companyId the company ID of this query licence certificate
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this query licence certificate.
	 *
	 * @param createDate the create date of this query licence certificate
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the doc file entry of this query licence certificate.
	 *
	 * @param docFileEntry the doc file entry of this query licence certificate
	 */
	@Override
	public void setDocFileEntry(long docFileEntry) {
		model.setDocFileEntry(docFileEntry);
	}

	/**
	 * Sets the expiration date of this query licence certificate.
	 *
	 * @param expirationDate the expiration date of this query licence certificate
	 */
	@Override
	public void setExpirationDate(Date expirationDate) {
		model.setExpirationDate(expirationDate);
	}

	/**
	 * Sets the group ID of this query licence certificate.
	 *
	 * @param groupId the group ID of this query licence certificate
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the issue date of this query licence certificate.
	 *
	 * @param issueDate the issue date of this query licence certificate
	 */
	@Override
	public void setIssueDate(Date issueDate) {
		model.setIssueDate(issueDate);
	}

	/**
	 * Sets the licence certificate of this query licence certificate.
	 *
	 * @param licenceCertificate the licence certificate of this query licence certificate
	 */
	@Override
	public void setLicenceCertificate(String licenceCertificate) {
		model.setLicenceCertificate(licenceCertificate);
	}

	/**
	 * Sets the modified date of this query licence certificate.
	 *
	 * @param modifiedDate the modified date of this query licence certificate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this query licence certificate.
	 *
	 * @param primaryKey the primary key of this query licence certificate
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the query licence certificate ID of this query licence certificate.
	 *
	 * @param queryLicenceCertificateId the query licence certificate ID of this query licence certificate
	 */
	@Override
	public void setQueryLicenceCertificateId(long queryLicenceCertificateId) {
		model.setQueryLicenceCertificateId(queryLicenceCertificateId);
	}

	/**
	 * Sets the status of this query licence certificate.
	 *
	 * @param status the status of this query licence certificate
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this query licence certificate.
	 *
	 * @param userId the user ID of this query licence certificate
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this query licence certificate.
	 *
	 * @param userName the user name of this query licence certificate
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this query licence certificate.
	 *
	 * @param userUuid the user uuid of this query licence certificate
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
	protected QueryLicenceCertificateWrapper wrap(
		QueryLicenceCertificate queryLicenceCertificate) {

		return new QueryLicenceCertificateWrapper(queryLicenceCertificate);
	}

}