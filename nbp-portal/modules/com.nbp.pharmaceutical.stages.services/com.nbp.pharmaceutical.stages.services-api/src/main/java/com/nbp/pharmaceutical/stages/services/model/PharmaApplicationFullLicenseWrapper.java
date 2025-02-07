/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PharmaApplicationFullLicense}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicense
 * @generated
 */
public class PharmaApplicationFullLicenseWrapper
	extends BaseModelWrapper<PharmaApplicationFullLicense>
	implements ModelWrapper<PharmaApplicationFullLicense>,
			   PharmaApplicationFullLicense {

	public PharmaApplicationFullLicenseWrapper(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		super(pharmaApplicationFullLicense);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pharmaFullLicenseId", getPharmaFullLicenseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("licenseNumber", getLicenseNumber());
		attributes.put("dateOfIssue", getDateOfIssue());
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
		Long pharmaFullLicenseId = (Long)attributes.get("pharmaFullLicenseId");

		if (pharmaFullLicenseId != null) {
			setPharmaFullLicenseId(pharmaFullLicenseId);
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
	public PharmaApplicationFullLicense cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this pharma application full license.
	 *
	 * @return the case ID of this pharma application full license
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this pharma application full license.
	 *
	 * @return the company ID of this pharma application full license
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma application full license.
	 *
	 * @return the create date of this pharma application full license
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of issue of this pharma application full license.
	 *
	 * @return the date of issue of this pharma application full license
	 */
	@Override
	public Date getDateOfIssue() {
		return model.getDateOfIssue();
	}

	/**
	 * Returns the due date of this pharma application full license.
	 *
	 * @return the due date of this pharma application full license
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the fee paid amount of this pharma application full license.
	 *
	 * @return the fee paid amount of this pharma application full license
	 */
	@Override
	public String getFeePaidAmount() {
		return model.getFeePaidAmount();
	}

	/**
	 * Returns the group ID of this pharma application full license.
	 *
	 * @return the group ID of this pharma application full license
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the lead time of this pharma application full license.
	 *
	 * @return the lead time of this pharma application full license
	 */
	@Override
	public String getLeadTime() {
		return model.getLeadTime();
	}

	/**
	 * Returns the license doc ID of this pharma application full license.
	 *
	 * @return the license doc ID of this pharma application full license
	 */
	@Override
	public String getLicenseDocId() {
		return model.getLicenseDocId();
	}

	/**
	 * Returns the license number of this pharma application full license.
	 *
	 * @return the license number of this pharma application full license
	 */
	@Override
	public String getLicenseNumber() {
		return model.getLicenseNumber();
	}

	/**
	 * Returns the modified date of this pharma application full license.
	 *
	 * @return the modified date of this pharma application full license
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pharma full license ID of this pharma application full license.
	 *
	 * @return the pharma full license ID of this pharma application full license
	 */
	@Override
	public long getPharmaFullLicenseId() {
		return model.getPharmaFullLicenseId();
	}

	/**
	 * Returns the primary key of this pharma application full license.
	 *
	 * @return the primary key of this pharma application full license
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receipt number of this pharma application full license.
	 *
	 * @return the receipt number of this pharma application full license
	 */
	@Override
	public String getReceiptNumber() {
		return model.getReceiptNumber();
	}

	/**
	 * Returns the user ID of this pharma application full license.
	 *
	 * @return the user ID of this pharma application full license
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma application full license.
	 *
	 * @return the user name of this pharma application full license
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma application full license.
	 *
	 * @return the user uuid of this pharma application full license
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
	 * Sets the case ID of this pharma application full license.
	 *
	 * @param caseId the case ID of this pharma application full license
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this pharma application full license.
	 *
	 * @param companyId the company ID of this pharma application full license
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma application full license.
	 *
	 * @param createDate the create date of this pharma application full license
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of issue of this pharma application full license.
	 *
	 * @param dateOfIssue the date of issue of this pharma application full license
	 */
	@Override
	public void setDateOfIssue(Date dateOfIssue) {
		model.setDateOfIssue(dateOfIssue);
	}

	/**
	 * Sets the due date of this pharma application full license.
	 *
	 * @param dueDate the due date of this pharma application full license
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the fee paid amount of this pharma application full license.
	 *
	 * @param feePaidAmount the fee paid amount of this pharma application full license
	 */
	@Override
	public void setFeePaidAmount(String feePaidAmount) {
		model.setFeePaidAmount(feePaidAmount);
	}

	/**
	 * Sets the group ID of this pharma application full license.
	 *
	 * @param groupId the group ID of this pharma application full license
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the lead time of this pharma application full license.
	 *
	 * @param leadTime the lead time of this pharma application full license
	 */
	@Override
	public void setLeadTime(String leadTime) {
		model.setLeadTime(leadTime);
	}

	/**
	 * Sets the license doc ID of this pharma application full license.
	 *
	 * @param licenseDocId the license doc ID of this pharma application full license
	 */
	@Override
	public void setLicenseDocId(String licenseDocId) {
		model.setLicenseDocId(licenseDocId);
	}

	/**
	 * Sets the license number of this pharma application full license.
	 *
	 * @param licenseNumber the license number of this pharma application full license
	 */
	@Override
	public void setLicenseNumber(String licenseNumber) {
		model.setLicenseNumber(licenseNumber);
	}

	/**
	 * Sets the modified date of this pharma application full license.
	 *
	 * @param modifiedDate the modified date of this pharma application full license
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pharma full license ID of this pharma application full license.
	 *
	 * @param pharmaFullLicenseId the pharma full license ID of this pharma application full license
	 */
	@Override
	public void setPharmaFullLicenseId(long pharmaFullLicenseId) {
		model.setPharmaFullLicenseId(pharmaFullLicenseId);
	}

	/**
	 * Sets the primary key of this pharma application full license.
	 *
	 * @param primaryKey the primary key of this pharma application full license
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receipt number of this pharma application full license.
	 *
	 * @param receiptNumber the receipt number of this pharma application full license
	 */
	@Override
	public void setReceiptNumber(String receiptNumber) {
		model.setReceiptNumber(receiptNumber);
	}

	/**
	 * Sets the user ID of this pharma application full license.
	 *
	 * @param userId the user ID of this pharma application full license
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma application full license.
	 *
	 * @param userName the user name of this pharma application full license
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma application full license.
	 *
	 * @param userUuid the user uuid of this pharma application full license
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
	protected PharmaApplicationFullLicenseWrapper wrap(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return new PharmaApplicationFullLicenseWrapper(
			pharmaApplicationFullLicense);
	}

}