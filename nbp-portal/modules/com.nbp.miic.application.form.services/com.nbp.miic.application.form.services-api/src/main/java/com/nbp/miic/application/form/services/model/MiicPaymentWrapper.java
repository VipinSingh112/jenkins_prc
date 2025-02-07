/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicPayment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicPayment
 * @generated
 */
public class MiicPaymentWrapper
	extends BaseModelWrapper<MiicPayment>
	implements MiicPayment, ModelWrapper<MiicPayment> {

	public MiicPaymentWrapper(MiicPayment miicPayment) {
		super(miicPayment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("miicPaymentId", getMiicPaymentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("miicApplicationId", getMiicApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miicPaymentId = (Long)attributes.get("miicPaymentId");

		if (miicPaymentId != null) {
			setMiicPaymentId(miicPaymentId);
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

		Long miicApplicationId = (Long)attributes.get("miicApplicationId");

		if (miicApplicationId != null) {
			setMiicApplicationId(miicApplicationId);
		}
	}

	@Override
	public MiicPayment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this miic payment.
	 *
	 * @return the company ID of this miic payment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this miic payment.
	 *
	 * @return the create date of this miic payment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this miic payment.
	 *
	 * @return the group ID of this miic payment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the miic application ID of this miic payment.
	 *
	 * @return the miic application ID of this miic payment
	 */
	@Override
	public long getMiicApplicationId() {
		return model.getMiicApplicationId();
	}

	/**
	 * Returns the miic payment ID of this miic payment.
	 *
	 * @return the miic payment ID of this miic payment
	 */
	@Override
	public long getMiicPaymentId() {
		return model.getMiicPaymentId();
	}

	/**
	 * Returns the modified date of this miic payment.
	 *
	 * @return the modified date of this miic payment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this miic payment.
	 *
	 * @return the primary key of this miic payment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this miic payment.
	 *
	 * @return the user ID of this miic payment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic payment.
	 *
	 * @return the user name of this miic payment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic payment.
	 *
	 * @return the user uuid of this miic payment
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
	 * Sets the company ID of this miic payment.
	 *
	 * @param companyId the company ID of this miic payment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this miic payment.
	 *
	 * @param createDate the create date of this miic payment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this miic payment.
	 *
	 * @param groupId the group ID of this miic payment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the miic application ID of this miic payment.
	 *
	 * @param miicApplicationId the miic application ID of this miic payment
	 */
	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		model.setMiicApplicationId(miicApplicationId);
	}

	/**
	 * Sets the miic payment ID of this miic payment.
	 *
	 * @param miicPaymentId the miic payment ID of this miic payment
	 */
	@Override
	public void setMiicPaymentId(long miicPaymentId) {
		model.setMiicPaymentId(miicPaymentId);
	}

	/**
	 * Sets the modified date of this miic payment.
	 *
	 * @param modifiedDate the modified date of this miic payment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this miic payment.
	 *
	 * @param primaryKey the primary key of this miic payment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this miic payment.
	 *
	 * @param userId the user ID of this miic payment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic payment.
	 *
	 * @param userName the user name of this miic payment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic payment.
	 *
	 * @param userUuid the user uuid of this miic payment
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
	protected MiicPaymentWrapper wrap(MiicPayment miicPayment) {
		return new MiicPaymentWrapper(miicPayment);
	}

}