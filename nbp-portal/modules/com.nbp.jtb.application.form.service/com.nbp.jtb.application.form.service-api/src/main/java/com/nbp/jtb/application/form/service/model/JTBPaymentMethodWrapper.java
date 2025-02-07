/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JTBPaymentMethod}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBPaymentMethod
 * @generated
 */
public class JTBPaymentMethodWrapper
	extends BaseModelWrapper<JTBPaymentMethod>
	implements JTBPaymentMethod, ModelWrapper<JTBPaymentMethod> {

	public JTBPaymentMethodWrapper(JTBPaymentMethod jtbPaymentMethod) {
		super(jtbPaymentMethod);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jTBPaymentMethodId", getJTBPaymentMethodId());
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
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jTBPaymentMethodId = (Long)attributes.get("jTBPaymentMethodId");

		if (jTBPaymentMethodId != null) {
			setJTBPaymentMethodId(jTBPaymentMethodId);
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

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public JTBPaymentMethod cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the amount currency of this jtb payment method.
	 *
	 * @return the amount currency of this jtb payment method
	 */
	@Override
	public String getAmountCurrency() {
		return model.getAmountCurrency();
	}

	/**
	 * Returns the amount paid of this jtb payment method.
	 *
	 * @return the amount paid of this jtb payment method
	 */
	@Override
	public String getAmountPaid() {
		return model.getAmountPaid();
	}

	/**
	 * Returns the company ID of this jtb payment method.
	 *
	 * @return the company ID of this jtb payment method
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jtb payment method.
	 *
	 * @return the create date of this jtb payment method
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jtb payment method.
	 *
	 * @return the group ID of this jtb payment method
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this jtb payment method.
	 *
	 * @return the jtb application ID of this jtb payment method
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the j tb payment method ID of this jtb payment method.
	 *
	 * @return the j tb payment method ID of this jtb payment method
	 */
	@Override
	public long getJTBPaymentMethodId() {
		return model.getJTBPaymentMethodId();
	}

	/**
	 * Returns the modified date of this jtb payment method.
	 *
	 * @return the modified date of this jtb payment method
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment doc ID of this jtb payment method.
	 *
	 * @return the payment doc ID of this jtb payment method
	 */
	@Override
	public String getPaymentDocId() {
		return model.getPaymentDocId();
	}

	/**
	 * Returns the payment fee of this jtb payment method.
	 *
	 * @return the payment fee of this jtb payment method
	 */
	@Override
	public String getPaymentFee() {
		return model.getPaymentFee();
	}

	/**
	 * Returns the payment method of this jtb payment method.
	 *
	 * @return the payment method of this jtb payment method
	 */
	@Override
	public String getPaymentMethod() {
		return model.getPaymentMethod();
	}

	/**
	 * Returns the payment status of this jtb payment method.
	 *
	 * @return the payment status of this jtb payment method
	 */
	@Override
	public String getPaymentStatus() {
		return model.getPaymentStatus();
	}

	/**
	 * Returns the primary key of this jtb payment method.
	 *
	 * @return the primary key of this jtb payment method
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the transaction number of this jtb payment method.
	 *
	 * @return the transaction number of this jtb payment method
	 */
	@Override
	public String getTransactionNumber() {
		return model.getTransactionNumber();
	}

	/**
	 * Returns the user ID of this jtb payment method.
	 *
	 * @return the user ID of this jtb payment method
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb payment method.
	 *
	 * @return the user name of this jtb payment method
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb payment method.
	 *
	 * @return the user uuid of this jtb payment method
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
	 * Sets the amount currency of this jtb payment method.
	 *
	 * @param amountCurrency the amount currency of this jtb payment method
	 */
	@Override
	public void setAmountCurrency(String amountCurrency) {
		model.setAmountCurrency(amountCurrency);
	}

	/**
	 * Sets the amount paid of this jtb payment method.
	 *
	 * @param amountPaid the amount paid of this jtb payment method
	 */
	@Override
	public void setAmountPaid(String amountPaid) {
		model.setAmountPaid(amountPaid);
	}

	/**
	 * Sets the company ID of this jtb payment method.
	 *
	 * @param companyId the company ID of this jtb payment method
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jtb payment method.
	 *
	 * @param createDate the create date of this jtb payment method
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jtb payment method.
	 *
	 * @param groupId the group ID of this jtb payment method
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this jtb payment method.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb payment method
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the j tb payment method ID of this jtb payment method.
	 *
	 * @param jTBPaymentMethodId the j tb payment method ID of this jtb payment method
	 */
	@Override
	public void setJTBPaymentMethodId(long jTBPaymentMethodId) {
		model.setJTBPaymentMethodId(jTBPaymentMethodId);
	}

	/**
	 * Sets the modified date of this jtb payment method.
	 *
	 * @param modifiedDate the modified date of this jtb payment method
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment doc ID of this jtb payment method.
	 *
	 * @param paymentDocId the payment doc ID of this jtb payment method
	 */
	@Override
	public void setPaymentDocId(String paymentDocId) {
		model.setPaymentDocId(paymentDocId);
	}

	/**
	 * Sets the payment fee of this jtb payment method.
	 *
	 * @param paymentFee the payment fee of this jtb payment method
	 */
	@Override
	public void setPaymentFee(String paymentFee) {
		model.setPaymentFee(paymentFee);
	}

	/**
	 * Sets the payment method of this jtb payment method.
	 *
	 * @param paymentMethod the payment method of this jtb payment method
	 */
	@Override
	public void setPaymentMethod(String paymentMethod) {
		model.setPaymentMethod(paymentMethod);
	}

	/**
	 * Sets the payment status of this jtb payment method.
	 *
	 * @param paymentStatus the payment status of this jtb payment method
	 */
	@Override
	public void setPaymentStatus(String paymentStatus) {
		model.setPaymentStatus(paymentStatus);
	}

	/**
	 * Sets the primary key of this jtb payment method.
	 *
	 * @param primaryKey the primary key of this jtb payment method
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the transaction number of this jtb payment method.
	 *
	 * @param transactionNumber the transaction number of this jtb payment method
	 */
	@Override
	public void setTransactionNumber(String transactionNumber) {
		model.setTransactionNumber(transactionNumber);
	}

	/**
	 * Sets the user ID of this jtb payment method.
	 *
	 * @param userId the user ID of this jtb payment method
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb payment method.
	 *
	 * @param userName the user name of this jtb payment method
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb payment method.
	 *
	 * @param userUuid the user uuid of this jtb payment method
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
	protected JTBPaymentMethodWrapper wrap(JTBPaymentMethod jtbPaymentMethod) {
		return new JTBPaymentMethodWrapper(jtbPaymentMethod);
	}

}