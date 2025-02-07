/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HSRAApplicationLicenseIssuance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationLicenseIssuance
 * @generated
 */
public class HSRAApplicationLicenseIssuanceWrapper
	extends BaseModelWrapper<HSRAApplicationLicenseIssuance>
	implements HSRAApplicationLicenseIssuance,
			   ModelWrapper<HSRAApplicationLicenseIssuance> {

	public HSRAApplicationLicenseIssuanceWrapper(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		super(hsraApplicationLicenseIssuance);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("hsraFullLicenseId", getHsraFullLicenseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("licenseNumber", getLicenseNumber());
		attributes.put("dateOfIssue", getDateOfIssue());
		attributes.put("dateOfExpiry", getDateOfExpiry());
		attributes.put("status", getStatus());
		attributes.put("feePaidAmount", getFeePaidAmount());
		attributes.put("receiptNumber", getReceiptNumber());
		attributes.put("dueDate", getDueDate());
		attributes.put("leadTime", getLeadTime());
		attributes.put("caseId", getCaseId());
		attributes.put("licenseDocId", getLicenseDocId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long hsraFullLicenseId = (Long)attributes.get("hsraFullLicenseId");

		if (hsraFullLicenseId != null) {
			setHsraFullLicenseId(hsraFullLicenseId);
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

		String licenseNumber = (String)attributes.get("licenseNumber");

		if (licenseNumber != null) {
			setLicenseNumber(licenseNumber);
		}

		Date dateOfIssue = (Date)attributes.get("dateOfIssue");

		if (dateOfIssue != null) {
			setDateOfIssue(dateOfIssue);
		}

		Date dateOfExpiry = (Date)attributes.get("dateOfExpiry");

		if (dateOfExpiry != null) {
			setDateOfExpiry(dateOfExpiry);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String feePaidAmount = (String)attributes.get("feePaidAmount");

		if (feePaidAmount != null) {
			setFeePaidAmount(feePaidAmount);
		}

		String receiptNumber = (String)attributes.get("receiptNumber");

		if (receiptNumber != null) {
			setReceiptNumber(receiptNumber);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
		}

		String leadTime = (String)attributes.get("leadTime");

		if (leadTime != null) {
			setLeadTime(leadTime);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String licenseDocId = (String)attributes.get("licenseDocId");

		if (licenseDocId != null) {
			setLicenseDocId(licenseDocId);
		}
	}

	@Override
	public HSRAApplicationLicenseIssuance cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this hsra application license issuance.
	 *
	 * @return the case ID of this hsra application license issuance
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this hsra application license issuance.
	 *
	 * @return the company ID of this hsra application license issuance
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this hsra application license issuance.
	 *
	 * @return the create date of this hsra application license issuance
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of expiry of this hsra application license issuance.
	 *
	 * @return the date of expiry of this hsra application license issuance
	 */
	@Override
	public Date getDateOfExpiry() {
		return model.getDateOfExpiry();
	}

	/**
	 * Returns the date of issue of this hsra application license issuance.
	 *
	 * @return the date of issue of this hsra application license issuance
	 */
	@Override
	public Date getDateOfIssue() {
		return model.getDateOfIssue();
	}

	/**
	 * Returns the due date of this hsra application license issuance.
	 *
	 * @return the due date of this hsra application license issuance
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the fee paid amount of this hsra application license issuance.
	 *
	 * @return the fee paid amount of this hsra application license issuance
	 */
	@Override
	public String getFeePaidAmount() {
		return model.getFeePaidAmount();
	}

	/**
	 * Returns the group ID of this hsra application license issuance.
	 *
	 * @return the group ID of this hsra application license issuance
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra full license ID of this hsra application license issuance.
	 *
	 * @return the hsra full license ID of this hsra application license issuance
	 */
	@Override
	public long getHsraFullLicenseId() {
		return model.getHsraFullLicenseId();
	}

	/**
	 * Returns the lead time of this hsra application license issuance.
	 *
	 * @return the lead time of this hsra application license issuance
	 */
	@Override
	public String getLeadTime() {
		return model.getLeadTime();
	}

	/**
	 * Returns the license doc ID of this hsra application license issuance.
	 *
	 * @return the license doc ID of this hsra application license issuance
	 */
	@Override
	public String getLicenseDocId() {
		return model.getLicenseDocId();
	}

	/**
	 * Returns the license number of this hsra application license issuance.
	 *
	 * @return the license number of this hsra application license issuance
	 */
	@Override
	public String getLicenseNumber() {
		return model.getLicenseNumber();
	}

	/**
	 * Returns the modified date of this hsra application license issuance.
	 *
	 * @return the modified date of this hsra application license issuance
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this hsra application license issuance.
	 *
	 * @return the primary key of this hsra application license issuance
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receipt number of this hsra application license issuance.
	 *
	 * @return the receipt number of this hsra application license issuance
	 */
	@Override
	public String getReceiptNumber() {
		return model.getReceiptNumber();
	}

	/**
	 * Returns the status of this hsra application license issuance.
	 *
	 * @return the status of this hsra application license issuance
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this hsra application license issuance.
	 *
	 * @return the user ID of this hsra application license issuance
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this hsra application license issuance.
	 *
	 * @return the user name of this hsra application license issuance
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this hsra application license issuance.
	 *
	 * @return the user uuid of this hsra application license issuance
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
	 * Sets the case ID of this hsra application license issuance.
	 *
	 * @param caseId the case ID of this hsra application license issuance
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this hsra application license issuance.
	 *
	 * @param companyId the company ID of this hsra application license issuance
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this hsra application license issuance.
	 *
	 * @param createDate the create date of this hsra application license issuance
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of expiry of this hsra application license issuance.
	 *
	 * @param dateOfExpiry the date of expiry of this hsra application license issuance
	 */
	@Override
	public void setDateOfExpiry(Date dateOfExpiry) {
		model.setDateOfExpiry(dateOfExpiry);
	}

	/**
	 * Sets the date of issue of this hsra application license issuance.
	 *
	 * @param dateOfIssue the date of issue of this hsra application license issuance
	 */
	@Override
	public void setDateOfIssue(Date dateOfIssue) {
		model.setDateOfIssue(dateOfIssue);
	}

	/**
	 * Sets the due date of this hsra application license issuance.
	 *
	 * @param dueDate the due date of this hsra application license issuance
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the fee paid amount of this hsra application license issuance.
	 *
	 * @param feePaidAmount the fee paid amount of this hsra application license issuance
	 */
	@Override
	public void setFeePaidAmount(String feePaidAmount) {
		model.setFeePaidAmount(feePaidAmount);
	}

	/**
	 * Sets the group ID of this hsra application license issuance.
	 *
	 * @param groupId the group ID of this hsra application license issuance
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra full license ID of this hsra application license issuance.
	 *
	 * @param hsraFullLicenseId the hsra full license ID of this hsra application license issuance
	 */
	@Override
	public void setHsraFullLicenseId(long hsraFullLicenseId) {
		model.setHsraFullLicenseId(hsraFullLicenseId);
	}

	/**
	 * Sets the lead time of this hsra application license issuance.
	 *
	 * @param leadTime the lead time of this hsra application license issuance
	 */
	@Override
	public void setLeadTime(String leadTime) {
		model.setLeadTime(leadTime);
	}

	/**
	 * Sets the license doc ID of this hsra application license issuance.
	 *
	 * @param licenseDocId the license doc ID of this hsra application license issuance
	 */
	@Override
	public void setLicenseDocId(String licenseDocId) {
		model.setLicenseDocId(licenseDocId);
	}

	/**
	 * Sets the license number of this hsra application license issuance.
	 *
	 * @param licenseNumber the license number of this hsra application license issuance
	 */
	@Override
	public void setLicenseNumber(String licenseNumber) {
		model.setLicenseNumber(licenseNumber);
	}

	/**
	 * Sets the modified date of this hsra application license issuance.
	 *
	 * @param modifiedDate the modified date of this hsra application license issuance
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this hsra application license issuance.
	 *
	 * @param primaryKey the primary key of this hsra application license issuance
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receipt number of this hsra application license issuance.
	 *
	 * @param receiptNumber the receipt number of this hsra application license issuance
	 */
	@Override
	public void setReceiptNumber(String receiptNumber) {
		model.setReceiptNumber(receiptNumber);
	}

	/**
	 * Sets the status of this hsra application license issuance.
	 *
	 * @param status the status of this hsra application license issuance
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this hsra application license issuance.
	 *
	 * @param userId the user ID of this hsra application license issuance
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this hsra application license issuance.
	 *
	 * @param userName the user name of this hsra application license issuance
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this hsra application license issuance.
	 *
	 * @param userUuid the user uuid of this hsra application license issuance
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
	protected HSRAApplicationLicenseIssuanceWrapper wrap(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		return new HSRAApplicationLicenseIssuanceWrapper(
			hsraApplicationLicenseIssuance);
	}

}