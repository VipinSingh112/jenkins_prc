/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquirePaymentPlan}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlan
 * @generated
 */
public class AcquirePaymentPlanWrapper
	extends BaseModelWrapper<AcquirePaymentPlan>
	implements AcquirePaymentPlan, ModelWrapper<AcquirePaymentPlan> {

	public AcquirePaymentPlanWrapper(AcquirePaymentPlan acquirePaymentPlan) {
		super(acquirePaymentPlan);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquirePaymentPlanId", getAcquirePaymentPlanId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("paymentMethod", getPaymentMethod());
		attributes.put("amountPaid", getAmountPaid());
		attributes.put("paymentCurrencySelected", getPaymentCurrencySelected());
		attributes.put("paymentMethodOther", getPaymentMethodOther());
		attributes.put("paymentDocId", getPaymentDocId());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquirePaymentPlanId = (Long)attributes.get(
			"acquirePaymentPlanId");

		if (acquirePaymentPlanId != null) {
			setAcquirePaymentPlanId(acquirePaymentPlanId);
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

		String paymentMethod = (String)attributes.get("paymentMethod");

		if (paymentMethod != null) {
			setPaymentMethod(paymentMethod);
		}

		String amountPaid = (String)attributes.get("amountPaid");

		if (amountPaid != null) {
			setAmountPaid(amountPaid);
		}

		String paymentCurrencySelected = (String)attributes.get(
			"paymentCurrencySelected");

		if (paymentCurrencySelected != null) {
			setPaymentCurrencySelected(paymentCurrencySelected);
		}

		String paymentMethodOther = (String)attributes.get(
			"paymentMethodOther");

		if (paymentMethodOther != null) {
			setPaymentMethodOther(paymentMethodOther);
		}

		String paymentDocId = (String)attributes.get("paymentDocId");

		if (paymentDocId != null) {
			setPaymentDocId(paymentDocId);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquirePaymentPlan cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire payment plan.
	 *
	 * @return the acquire application ID of this acquire payment plan
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the acquire payment plan ID of this acquire payment plan.
	 *
	 * @return the acquire payment plan ID of this acquire payment plan
	 */
	@Override
	public long getAcquirePaymentPlanId() {
		return model.getAcquirePaymentPlanId();
	}

	/**
	 * Returns the amount paid of this acquire payment plan.
	 *
	 * @return the amount paid of this acquire payment plan
	 */
	@Override
	public String getAmountPaid() {
		return model.getAmountPaid();
	}

	/**
	 * Returns the company ID of this acquire payment plan.
	 *
	 * @return the company ID of this acquire payment plan
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire payment plan.
	 *
	 * @return the create date of this acquire payment plan
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire payment plan.
	 *
	 * @return the group ID of this acquire payment plan
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire payment plan.
	 *
	 * @return the modified date of this acquire payment plan
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment currency selected of this acquire payment plan.
	 *
	 * @return the payment currency selected of this acquire payment plan
	 */
	@Override
	public String getPaymentCurrencySelected() {
		return model.getPaymentCurrencySelected();
	}

	/**
	 * Returns the payment doc ID of this acquire payment plan.
	 *
	 * @return the payment doc ID of this acquire payment plan
	 */
	@Override
	public String getPaymentDocId() {
		return model.getPaymentDocId();
	}

	/**
	 * Returns the payment method of this acquire payment plan.
	 *
	 * @return the payment method of this acquire payment plan
	 */
	@Override
	public String getPaymentMethod() {
		return model.getPaymentMethod();
	}

	/**
	 * Returns the payment method other of this acquire payment plan.
	 *
	 * @return the payment method other of this acquire payment plan
	 */
	@Override
	public String getPaymentMethodOther() {
		return model.getPaymentMethodOther();
	}

	/**
	 * Returns the primary key of this acquire payment plan.
	 *
	 * @return the primary key of this acquire payment plan
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire payment plan.
	 *
	 * @return the user ID of this acquire payment plan
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire payment plan.
	 *
	 * @return the user name of this acquire payment plan
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire payment plan.
	 *
	 * @return the user uuid of this acquire payment plan
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
	 * Sets the acquire application ID of this acquire payment plan.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire payment plan
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the acquire payment plan ID of this acquire payment plan.
	 *
	 * @param acquirePaymentPlanId the acquire payment plan ID of this acquire payment plan
	 */
	@Override
	public void setAcquirePaymentPlanId(long acquirePaymentPlanId) {
		model.setAcquirePaymentPlanId(acquirePaymentPlanId);
	}

	/**
	 * Sets the amount paid of this acquire payment plan.
	 *
	 * @param amountPaid the amount paid of this acquire payment plan
	 */
	@Override
	public void setAmountPaid(String amountPaid) {
		model.setAmountPaid(amountPaid);
	}

	/**
	 * Sets the company ID of this acquire payment plan.
	 *
	 * @param companyId the company ID of this acquire payment plan
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire payment plan.
	 *
	 * @param createDate the create date of this acquire payment plan
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire payment plan.
	 *
	 * @param groupId the group ID of this acquire payment plan
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire payment plan.
	 *
	 * @param modifiedDate the modified date of this acquire payment plan
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment currency selected of this acquire payment plan.
	 *
	 * @param paymentCurrencySelected the payment currency selected of this acquire payment plan
	 */
	@Override
	public void setPaymentCurrencySelected(String paymentCurrencySelected) {
		model.setPaymentCurrencySelected(paymentCurrencySelected);
	}

	/**
	 * Sets the payment doc ID of this acquire payment plan.
	 *
	 * @param paymentDocId the payment doc ID of this acquire payment plan
	 */
	@Override
	public void setPaymentDocId(String paymentDocId) {
		model.setPaymentDocId(paymentDocId);
	}

	/**
	 * Sets the payment method of this acquire payment plan.
	 *
	 * @param paymentMethod the payment method of this acquire payment plan
	 */
	@Override
	public void setPaymentMethod(String paymentMethod) {
		model.setPaymentMethod(paymentMethod);
	}

	/**
	 * Sets the payment method other of this acquire payment plan.
	 *
	 * @param paymentMethodOther the payment method other of this acquire payment plan
	 */
	@Override
	public void setPaymentMethodOther(String paymentMethodOther) {
		model.setPaymentMethodOther(paymentMethodOther);
	}

	/**
	 * Sets the primary key of this acquire payment plan.
	 *
	 * @param primaryKey the primary key of this acquire payment plan
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire payment plan.
	 *
	 * @param userId the user ID of this acquire payment plan
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire payment plan.
	 *
	 * @param userName the user name of this acquire payment plan
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire payment plan.
	 *
	 * @param userUuid the user uuid of this acquire payment plan
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
	protected AcquirePaymentPlanWrapper wrap(
		AcquirePaymentPlan acquirePaymentPlan) {

		return new AcquirePaymentPlanWrapper(acquirePaymentPlan);
	}

}