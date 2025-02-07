/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeAppPayment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppPayment
 * @generated
 */
public class FireBrigadeAppPaymentWrapper
	extends BaseModelWrapper<FireBrigadeAppPayment>
	implements FireBrigadeAppPayment, ModelWrapper<FireBrigadeAppPayment> {

	public FireBrigadeAppPaymentWrapper(
		FireBrigadeAppPayment fireBrigadeAppPayment) {

		super(fireBrigadeAppPayment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fireBrigadeAppPaymentId", getFireBrigadeAppPaymentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("paymentMethod", getPaymentMethod());
		attributes.put("paymentFee", getPaymentFee());
		attributes.put("amountPaid", getAmountPaid());
		attributes.put("amountCurrency", getAmountCurrency());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeAppPaymentId = (Long)attributes.get(
			"fireBrigadeAppPaymentId");

		if (fireBrigadeAppPaymentId != null) {
			setFireBrigadeAppPaymentId(fireBrigadeAppPaymentId);
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

		String paymentFee = (String)attributes.get("paymentFee");

		if (paymentFee != null) {
			setPaymentFee(paymentFee);
		}

		String amountPaid = (String)attributes.get("amountPaid");

		if (amountPaid != null) {
			setAmountPaid(amountPaid);
		}

		String amountCurrency = (String)attributes.get("amountCurrency");

		if (amountCurrency != null) {
			setAmountCurrency(amountCurrency);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
		}
	}

	@Override
	public FireBrigadeAppPayment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount currency of this fire brigade app payment.
	 *
	 * @return the amount currency of this fire brigade app payment
	 */
	@Override
	public String getAmountCurrency() {
		return model.getAmountCurrency();
	}

	/**
	 * Returns the amount paid of this fire brigade app payment.
	 *
	 * @return the amount paid of this fire brigade app payment
	 */
	@Override
	public String getAmountPaid() {
		return model.getAmountPaid();
	}

	/**
	 * Returns the company ID of this fire brigade app payment.
	 *
	 * @return the company ID of this fire brigade app payment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade app payment.
	 *
	 * @return the create date of this fire brigade app payment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade app payment.
	 *
	 * @return the fire brigade application ID of this fire brigade app payment
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade app payment ID of this fire brigade app payment.
	 *
	 * @return the fire brigade app payment ID of this fire brigade app payment
	 */
	@Override
	public long getFireBrigadeAppPaymentId() {
		return model.getFireBrigadeAppPaymentId();
	}

	/**
	 * Returns the group ID of this fire brigade app payment.
	 *
	 * @return the group ID of this fire brigade app payment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this fire brigade app payment.
	 *
	 * @return the modified date of this fire brigade app payment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment fee of this fire brigade app payment.
	 *
	 * @return the payment fee of this fire brigade app payment
	 */
	@Override
	public String getPaymentFee() {
		return model.getPaymentFee();
	}

	/**
	 * Returns the payment method of this fire brigade app payment.
	 *
	 * @return the payment method of this fire brigade app payment
	 */
	@Override
	public String getPaymentMethod() {
		return model.getPaymentMethod();
	}

	/**
	 * Returns the primary key of this fire brigade app payment.
	 *
	 * @return the primary key of this fire brigade app payment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fire brigade app payment.
	 *
	 * @return the user ID of this fire brigade app payment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade app payment.
	 *
	 * @return the user name of this fire brigade app payment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade app payment.
	 *
	 * @return the user uuid of this fire brigade app payment
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
	 * Sets the amount currency of this fire brigade app payment.
	 *
	 * @param amountCurrency the amount currency of this fire brigade app payment
	 */
	@Override
	public void setAmountCurrency(String amountCurrency) {
		model.setAmountCurrency(amountCurrency);
	}

	/**
	 * Sets the amount paid of this fire brigade app payment.
	 *
	 * @param amountPaid the amount paid of this fire brigade app payment
	 */
	@Override
	public void setAmountPaid(String amountPaid) {
		model.setAmountPaid(amountPaid);
	}

	/**
	 * Sets the company ID of this fire brigade app payment.
	 *
	 * @param companyId the company ID of this fire brigade app payment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade app payment.
	 *
	 * @param createDate the create date of this fire brigade app payment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade app payment.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade app payment
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade app payment ID of this fire brigade app payment.
	 *
	 * @param fireBrigadeAppPaymentId the fire brigade app payment ID of this fire brigade app payment
	 */
	@Override
	public void setFireBrigadeAppPaymentId(long fireBrigadeAppPaymentId) {
		model.setFireBrigadeAppPaymentId(fireBrigadeAppPaymentId);
	}

	/**
	 * Sets the group ID of this fire brigade app payment.
	 *
	 * @param groupId the group ID of this fire brigade app payment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this fire brigade app payment.
	 *
	 * @param modifiedDate the modified date of this fire brigade app payment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment fee of this fire brigade app payment.
	 *
	 * @param paymentFee the payment fee of this fire brigade app payment
	 */
	@Override
	public void setPaymentFee(String paymentFee) {
		model.setPaymentFee(paymentFee);
	}

	/**
	 * Sets the payment method of this fire brigade app payment.
	 *
	 * @param paymentMethod the payment method of this fire brigade app payment
	 */
	@Override
	public void setPaymentMethod(String paymentMethod) {
		model.setPaymentMethod(paymentMethod);
	}

	/**
	 * Sets the primary key of this fire brigade app payment.
	 *
	 * @param primaryKey the primary key of this fire brigade app payment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fire brigade app payment.
	 *
	 * @param userId the user ID of this fire brigade app payment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade app payment.
	 *
	 * @param userName the user name of this fire brigade app payment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade app payment.
	 *
	 * @param userUuid the user uuid of this fire brigade app payment
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
	protected FireBrigadeAppPaymentWrapper wrap(
		FireBrigadeAppPayment fireBrigadeAppPayment) {

		return new FireBrigadeAppPaymentWrapper(fireBrigadeAppPayment);
	}

}