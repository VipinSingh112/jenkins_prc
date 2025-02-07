/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisLicensePayment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePayment
 * @generated
 */
public class CannabisLicensePaymentWrapper
	extends BaseModelWrapper<CannabisLicensePayment>
	implements CannabisLicensePayment, ModelWrapper<CannabisLicensePayment> {

	public CannabisLicensePaymentWrapper(
		CannabisLicensePayment cannabisLicensePayment) {

		super(cannabisLicensePayment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"cannabisLicensePaymentId", getCannabisLicensePaymentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bondAmtDue", getBondAmtDue());
		attributes.put("licenseFeeDue", getLicenseFeeDue());
		attributes.put("feeIssuanceDue", getFeeIssuanceDue());
		attributes.put("feeOption", getFeeOption());
		attributes.put("deferredPaymentType", getDeferredPaymentType());
		attributes.put("feePaymentdDate", getFeePaymentdDate());
		attributes.put("paymentOption", getPaymentOption());
		attributes.put("paymentAmtRecieved", getPaymentAmtRecieved());
		attributes.put("paymentStatus", getPaymentStatus());
		attributes.put("updatedBySource", getUpdatedBySource());
		attributes.put("status", getStatus());
		attributes.put("caseId", getCaseId());
		attributes.put("amountCurrency", getAmountCurrency());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cannabisLicensePaymentId = (Long)attributes.get(
			"cannabisLicensePaymentId");

		if (cannabisLicensePaymentId != null) {
			setCannabisLicensePaymentId(cannabisLicensePaymentId);
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

		String bondAmtDue = (String)attributes.get("bondAmtDue");

		if (bondAmtDue != null) {
			setBondAmtDue(bondAmtDue);
		}

		String licenseFeeDue = (String)attributes.get("licenseFeeDue");

		if (licenseFeeDue != null) {
			setLicenseFeeDue(licenseFeeDue);
		}

		String feeIssuanceDue = (String)attributes.get("feeIssuanceDue");

		if (feeIssuanceDue != null) {
			setFeeIssuanceDue(feeIssuanceDue);
		}

		String feeOption = (String)attributes.get("feeOption");

		if (feeOption != null) {
			setFeeOption(feeOption);
		}

		String deferredPaymentType = (String)attributes.get(
			"deferredPaymentType");

		if (deferredPaymentType != null) {
			setDeferredPaymentType(deferredPaymentType);
		}

		Date feePaymentdDate = (Date)attributes.get("feePaymentdDate");

		if (feePaymentdDate != null) {
			setFeePaymentdDate(feePaymentdDate);
		}

		String paymentOption = (String)attributes.get("paymentOption");

		if (paymentOption != null) {
			setPaymentOption(paymentOption);
		}

		String paymentAmtRecieved = (String)attributes.get(
			"paymentAmtRecieved");

		if (paymentAmtRecieved != null) {
			setPaymentAmtRecieved(paymentAmtRecieved);
		}

		String paymentStatus = (String)attributes.get("paymentStatus");

		if (paymentStatus != null) {
			setPaymentStatus(paymentStatus);
		}

		String updatedBySource = (String)attributes.get("updatedBySource");

		if (updatedBySource != null) {
			setUpdatedBySource(updatedBySource);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String amountCurrency = (String)attributes.get("amountCurrency");

		if (amountCurrency != null) {
			setAmountCurrency(amountCurrency);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisLicensePayment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount currency of this cannabis license payment.
	 *
	 * @return the amount currency of this cannabis license payment
	 */
	@Override
	public String getAmountCurrency() {
		return model.getAmountCurrency();
	}

	/**
	 * Returns the bond amt due of this cannabis license payment.
	 *
	 * @return the bond amt due of this cannabis license payment
	 */
	@Override
	public String getBondAmtDue() {
		return model.getBondAmtDue();
	}

	/**
	 * Returns the cannabis application ID of this cannabis license payment.
	 *
	 * @return the cannabis application ID of this cannabis license payment
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis license payment ID of this cannabis license payment.
	 *
	 * @return the cannabis license payment ID of this cannabis license payment
	 */
	@Override
	public long getCannabisLicensePaymentId() {
		return model.getCannabisLicensePaymentId();
	}

	/**
	 * Returns the case ID of this cannabis license payment.
	 *
	 * @return the case ID of this cannabis license payment
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this cannabis license payment.
	 *
	 * @return the company ID of this cannabis license payment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this cannabis license payment.
	 *
	 * @return the create date of this cannabis license payment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the deferred payment type of this cannabis license payment.
	 *
	 * @return the deferred payment type of this cannabis license payment
	 */
	@Override
	public String getDeferredPaymentType() {
		return model.getDeferredPaymentType();
	}

	/**
	 * Returns the fee issuance due of this cannabis license payment.
	 *
	 * @return the fee issuance due of this cannabis license payment
	 */
	@Override
	public String getFeeIssuanceDue() {
		return model.getFeeIssuanceDue();
	}

	/**
	 * Returns the fee option of this cannabis license payment.
	 *
	 * @return the fee option of this cannabis license payment
	 */
	@Override
	public String getFeeOption() {
		return model.getFeeOption();
	}

	/**
	 * Returns the fee paymentd date of this cannabis license payment.
	 *
	 * @return the fee paymentd date of this cannabis license payment
	 */
	@Override
	public Date getFeePaymentdDate() {
		return model.getFeePaymentdDate();
	}

	/**
	 * Returns the group ID of this cannabis license payment.
	 *
	 * @return the group ID of this cannabis license payment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the license fee due of this cannabis license payment.
	 *
	 * @return the license fee due of this cannabis license payment
	 */
	@Override
	public String getLicenseFeeDue() {
		return model.getLicenseFeeDue();
	}

	/**
	 * Returns the modified date of this cannabis license payment.
	 *
	 * @return the modified date of this cannabis license payment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment amt recieved of this cannabis license payment.
	 *
	 * @return the payment amt recieved of this cannabis license payment
	 */
	@Override
	public String getPaymentAmtRecieved() {
		return model.getPaymentAmtRecieved();
	}

	/**
	 * Returns the payment option of this cannabis license payment.
	 *
	 * @return the payment option of this cannabis license payment
	 */
	@Override
	public String getPaymentOption() {
		return model.getPaymentOption();
	}

	/**
	 * Returns the payment status of this cannabis license payment.
	 *
	 * @return the payment status of this cannabis license payment
	 */
	@Override
	public String getPaymentStatus() {
		return model.getPaymentStatus();
	}

	/**
	 * Returns the primary key of this cannabis license payment.
	 *
	 * @return the primary key of this cannabis license payment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this cannabis license payment.
	 *
	 * @return the status of this cannabis license payment
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the updated by source of this cannabis license payment.
	 *
	 * @return the updated by source of this cannabis license payment
	 */
	@Override
	public String getUpdatedBySource() {
		return model.getUpdatedBySource();
	}

	/**
	 * Returns the user ID of this cannabis license payment.
	 *
	 * @return the user ID of this cannabis license payment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis license payment.
	 *
	 * @return the user name of this cannabis license payment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis license payment.
	 *
	 * @return the user uuid of this cannabis license payment
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
	 * Sets the amount currency of this cannabis license payment.
	 *
	 * @param amountCurrency the amount currency of this cannabis license payment
	 */
	@Override
	public void setAmountCurrency(String amountCurrency) {
		model.setAmountCurrency(amountCurrency);
	}

	/**
	 * Sets the bond amt due of this cannabis license payment.
	 *
	 * @param bondAmtDue the bond amt due of this cannabis license payment
	 */
	@Override
	public void setBondAmtDue(String bondAmtDue) {
		model.setBondAmtDue(bondAmtDue);
	}

	/**
	 * Sets the cannabis application ID of this cannabis license payment.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis license payment
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis license payment ID of this cannabis license payment.
	 *
	 * @param cannabisLicensePaymentId the cannabis license payment ID of this cannabis license payment
	 */
	@Override
	public void setCannabisLicensePaymentId(long cannabisLicensePaymentId) {
		model.setCannabisLicensePaymentId(cannabisLicensePaymentId);
	}

	/**
	 * Sets the case ID of this cannabis license payment.
	 *
	 * @param caseId the case ID of this cannabis license payment
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this cannabis license payment.
	 *
	 * @param companyId the company ID of this cannabis license payment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this cannabis license payment.
	 *
	 * @param createDate the create date of this cannabis license payment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the deferred payment type of this cannabis license payment.
	 *
	 * @param deferredPaymentType the deferred payment type of this cannabis license payment
	 */
	@Override
	public void setDeferredPaymentType(String deferredPaymentType) {
		model.setDeferredPaymentType(deferredPaymentType);
	}

	/**
	 * Sets the fee issuance due of this cannabis license payment.
	 *
	 * @param feeIssuanceDue the fee issuance due of this cannabis license payment
	 */
	@Override
	public void setFeeIssuanceDue(String feeIssuanceDue) {
		model.setFeeIssuanceDue(feeIssuanceDue);
	}

	/**
	 * Sets the fee option of this cannabis license payment.
	 *
	 * @param feeOption the fee option of this cannabis license payment
	 */
	@Override
	public void setFeeOption(String feeOption) {
		model.setFeeOption(feeOption);
	}

	/**
	 * Sets the fee paymentd date of this cannabis license payment.
	 *
	 * @param feePaymentdDate the fee paymentd date of this cannabis license payment
	 */
	@Override
	public void setFeePaymentdDate(Date feePaymentdDate) {
		model.setFeePaymentdDate(feePaymentdDate);
	}

	/**
	 * Sets the group ID of this cannabis license payment.
	 *
	 * @param groupId the group ID of this cannabis license payment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the license fee due of this cannabis license payment.
	 *
	 * @param licenseFeeDue the license fee due of this cannabis license payment
	 */
	@Override
	public void setLicenseFeeDue(String licenseFeeDue) {
		model.setLicenseFeeDue(licenseFeeDue);
	}

	/**
	 * Sets the modified date of this cannabis license payment.
	 *
	 * @param modifiedDate the modified date of this cannabis license payment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment amt recieved of this cannabis license payment.
	 *
	 * @param paymentAmtRecieved the payment amt recieved of this cannabis license payment
	 */
	@Override
	public void setPaymentAmtRecieved(String paymentAmtRecieved) {
		model.setPaymentAmtRecieved(paymentAmtRecieved);
	}

	/**
	 * Sets the payment option of this cannabis license payment.
	 *
	 * @param paymentOption the payment option of this cannabis license payment
	 */
	@Override
	public void setPaymentOption(String paymentOption) {
		model.setPaymentOption(paymentOption);
	}

	/**
	 * Sets the payment status of this cannabis license payment.
	 *
	 * @param paymentStatus the payment status of this cannabis license payment
	 */
	@Override
	public void setPaymentStatus(String paymentStatus) {
		model.setPaymentStatus(paymentStatus);
	}

	/**
	 * Sets the primary key of this cannabis license payment.
	 *
	 * @param primaryKey the primary key of this cannabis license payment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this cannabis license payment.
	 *
	 * @param status the status of this cannabis license payment
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the updated by source of this cannabis license payment.
	 *
	 * @param updatedBySource the updated by source of this cannabis license payment
	 */
	@Override
	public void setUpdatedBySource(String updatedBySource) {
		model.setUpdatedBySource(updatedBySource);
	}

	/**
	 * Sets the user ID of this cannabis license payment.
	 *
	 * @param userId the user ID of this cannabis license payment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis license payment.
	 *
	 * @param userName the user name of this cannabis license payment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis license payment.
	 *
	 * @param userUuid the user uuid of this cannabis license payment
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
	protected CannabisLicensePaymentWrapper wrap(
		CannabisLicensePayment cannabisLicensePayment) {

		return new CannabisLicensePaymentWrapper(cannabisLicensePayment);
	}

}