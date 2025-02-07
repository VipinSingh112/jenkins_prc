/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismApplicationPayment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationPayment
 * @generated
 */
public class TourismApplicationPaymentWrapper
	extends BaseModelWrapper<TourismApplicationPayment>
	implements ModelWrapper<TourismApplicationPayment>,
			   TourismApplicationPayment {

	public TourismApplicationPaymentWrapper(
		TourismApplicationPayment tourismApplicationPayment) {

		super(tourismApplicationPayment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"TourismApplicationPaymentId", getTourismApplicationPaymentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("paymentMethod", getPaymentMethod());
		attributes.put("paymentDocId", getPaymentDocId());
		attributes.put("paymentStatus", getPaymentStatus());
		attributes.put("paymentFee", getPaymentFee());
		attributes.put("amountPaid", getAmountPaid());
		attributes.put("amountCurrency", getAmountCurrency());
		attributes.put("transactionNumber", getTransactionNumber());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long TourismApplicationPaymentId = (Long)attributes.get(
			"TourismApplicationPaymentId");

		if (TourismApplicationPaymentId != null) {
			setTourismApplicationPaymentId(TourismApplicationPaymentId);
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

		String paymentDocId = (String)attributes.get("paymentDocId");

		if (paymentDocId != null) {
			setPaymentDocId(paymentDocId);
		}

		String paymentStatus = (String)attributes.get("paymentStatus");

		if (paymentStatus != null) {
			setPaymentStatus(paymentStatus);
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

		String transactionNumber = (String)attributes.get("transactionNumber");

		if (transactionNumber != null) {
			setTransactionNumber(transactionNumber);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismApplicationPayment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount currency of this tourism application payment.
	 *
	 * @return the amount currency of this tourism application payment
	 */
	@Override
	public String getAmountCurrency() {
		return model.getAmountCurrency();
	}

	/**
	 * Returns the amount paid of this tourism application payment.
	 *
	 * @return the amount paid of this tourism application payment
	 */
	@Override
	public String getAmountPaid() {
		return model.getAmountPaid();
	}

	/**
	 * Returns the company ID of this tourism application payment.
	 *
	 * @return the company ID of this tourism application payment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism application payment.
	 *
	 * @return the create date of this tourism application payment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism application payment.
	 *
	 * @return the group ID of this tourism application payment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism application payment.
	 *
	 * @return the modified date of this tourism application payment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment doc ID of this tourism application payment.
	 *
	 * @return the payment doc ID of this tourism application payment
	 */
	@Override
	public String getPaymentDocId() {
		return model.getPaymentDocId();
	}

	/**
	 * Returns the payment fee of this tourism application payment.
	 *
	 * @return the payment fee of this tourism application payment
	 */
	@Override
	public String getPaymentFee() {
		return model.getPaymentFee();
	}

	/**
	 * Returns the payment method of this tourism application payment.
	 *
	 * @return the payment method of this tourism application payment
	 */
	@Override
	public String getPaymentMethod() {
		return model.getPaymentMethod();
	}

	/**
	 * Returns the payment status of this tourism application payment.
	 *
	 * @return the payment status of this tourism application payment
	 */
	@Override
	public String getPaymentStatus() {
		return model.getPaymentStatus();
	}

	/**
	 * Returns the primary key of this tourism application payment.
	 *
	 * @return the primary key of this tourism application payment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the tourism application ID of this tourism application payment.
	 *
	 * @return the tourism application ID of this tourism application payment
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism application payment ID of this tourism application payment.
	 *
	 * @return the tourism application payment ID of this tourism application payment
	 */
	@Override
	public long getTourismApplicationPaymentId() {
		return model.getTourismApplicationPaymentId();
	}

	/**
	 * Returns the transaction number of this tourism application payment.
	 *
	 * @return the transaction number of this tourism application payment
	 */
	@Override
	public String getTransactionNumber() {
		return model.getTransactionNumber();
	}

	/**
	 * Returns the user ID of this tourism application payment.
	 *
	 * @return the user ID of this tourism application payment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism application payment.
	 *
	 * @return the user name of this tourism application payment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism application payment.
	 *
	 * @return the user uuid of this tourism application payment
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
	 * Sets the amount currency of this tourism application payment.
	 *
	 * @param amountCurrency the amount currency of this tourism application payment
	 */
	@Override
	public void setAmountCurrency(String amountCurrency) {
		model.setAmountCurrency(amountCurrency);
	}

	/**
	 * Sets the amount paid of this tourism application payment.
	 *
	 * @param amountPaid the amount paid of this tourism application payment
	 */
	@Override
	public void setAmountPaid(String amountPaid) {
		model.setAmountPaid(amountPaid);
	}

	/**
	 * Sets the company ID of this tourism application payment.
	 *
	 * @param companyId the company ID of this tourism application payment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism application payment.
	 *
	 * @param createDate the create date of this tourism application payment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism application payment.
	 *
	 * @param groupId the group ID of this tourism application payment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism application payment.
	 *
	 * @param modifiedDate the modified date of this tourism application payment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment doc ID of this tourism application payment.
	 *
	 * @param paymentDocId the payment doc ID of this tourism application payment
	 */
	@Override
	public void setPaymentDocId(String paymentDocId) {
		model.setPaymentDocId(paymentDocId);
	}

	/**
	 * Sets the payment fee of this tourism application payment.
	 *
	 * @param paymentFee the payment fee of this tourism application payment
	 */
	@Override
	public void setPaymentFee(String paymentFee) {
		model.setPaymentFee(paymentFee);
	}

	/**
	 * Sets the payment method of this tourism application payment.
	 *
	 * @param paymentMethod the payment method of this tourism application payment
	 */
	@Override
	public void setPaymentMethod(String paymentMethod) {
		model.setPaymentMethod(paymentMethod);
	}

	/**
	 * Sets the payment status of this tourism application payment.
	 *
	 * @param paymentStatus the payment status of this tourism application payment
	 */
	@Override
	public void setPaymentStatus(String paymentStatus) {
		model.setPaymentStatus(paymentStatus);
	}

	/**
	 * Sets the primary key of this tourism application payment.
	 *
	 * @param primaryKey the primary key of this tourism application payment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the tourism application ID of this tourism application payment.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism application payment
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism application payment ID of this tourism application payment.
	 *
	 * @param TourismApplicationPaymentId the tourism application payment ID of this tourism application payment
	 */
	@Override
	public void setTourismApplicationPaymentId(
		long TourismApplicationPaymentId) {

		model.setTourismApplicationPaymentId(TourismApplicationPaymentId);
	}

	/**
	 * Sets the transaction number of this tourism application payment.
	 *
	 * @param transactionNumber the transaction number of this tourism application payment
	 */
	@Override
	public void setTransactionNumber(String transactionNumber) {
		model.setTransactionNumber(transactionNumber);
	}

	/**
	 * Sets the user ID of this tourism application payment.
	 *
	 * @param userId the user ID of this tourism application payment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism application payment.
	 *
	 * @param userName the user name of this tourism application payment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism application payment.
	 *
	 * @param userUuid the user uuid of this tourism application payment
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
	protected TourismApplicationPaymentWrapper wrap(
		TourismApplicationPayment tourismApplicationPayment) {

		return new TourismApplicationPaymentWrapper(tourismApplicationPayment);
	}

}