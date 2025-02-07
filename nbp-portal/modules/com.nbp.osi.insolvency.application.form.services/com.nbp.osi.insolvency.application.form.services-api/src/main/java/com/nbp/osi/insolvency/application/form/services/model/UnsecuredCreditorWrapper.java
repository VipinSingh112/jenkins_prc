/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UnsecuredCreditor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnsecuredCreditor
 * @generated
 */
public class UnsecuredCreditorWrapper
	extends BaseModelWrapper<UnsecuredCreditor>
	implements ModelWrapper<UnsecuredCreditor>, UnsecuredCreditor {

	public UnsecuredCreditorWrapper(UnsecuredCreditor unsecuredCreditor) {
		super(unsecuredCreditor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("unsecuredCreditorId", getUnsecuredCreditorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("unsecuredCreditorName", getUnsecuredCreditorName());
		attributes.put("unsecuredCreditorDebt", getUnsecuredCreditorDebt());
		attributes.put("unsecuredCreditorAmount", getUnsecuredCreditorAmount());
		attributes.put(
			"unsecuredCreditorPayment", getUnsecuredCreditorPayment());
		attributes.put(
			"unsecuredCreditorCounter", getUnsecuredCreditorCounter());
		attributes.put("unsecuredCreditorDate", getUnsecuredCreditorDate());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long unsecuredCreditorId = (Long)attributes.get("unsecuredCreditorId");

		if (unsecuredCreditorId != null) {
			setUnsecuredCreditorId(unsecuredCreditorId);
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

		String unsecuredCreditorName = (String)attributes.get(
			"unsecuredCreditorName");

		if (unsecuredCreditorName != null) {
			setUnsecuredCreditorName(unsecuredCreditorName);
		}

		String unsecuredCreditorDebt = (String)attributes.get(
			"unsecuredCreditorDebt");

		if (unsecuredCreditorDebt != null) {
			setUnsecuredCreditorDebt(unsecuredCreditorDebt);
		}

		String unsecuredCreditorAmount = (String)attributes.get(
			"unsecuredCreditorAmount");

		if (unsecuredCreditorAmount != null) {
			setUnsecuredCreditorAmount(unsecuredCreditorAmount);
		}

		String unsecuredCreditorPayment = (String)attributes.get(
			"unsecuredCreditorPayment");

		if (unsecuredCreditorPayment != null) {
			setUnsecuredCreditorPayment(unsecuredCreditorPayment);
		}

		String unsecuredCreditorCounter = (String)attributes.get(
			"unsecuredCreditorCounter");

		if (unsecuredCreditorCounter != null) {
			setUnsecuredCreditorCounter(unsecuredCreditorCounter);
		}

		Date unsecuredCreditorDate = (Date)attributes.get(
			"unsecuredCreditorDate");

		if (unsecuredCreditorDate != null) {
			setUnsecuredCreditorDate(unsecuredCreditorDate);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public UnsecuredCreditor cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this unsecured creditor.
	 *
	 * @return the company ID of this unsecured creditor
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this unsecured creditor.
	 *
	 * @return the create date of this unsecured creditor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this unsecured creditor.
	 *
	 * @return the group ID of this unsecured creditor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this unsecured creditor.
	 *
	 * @return the modified date of this unsecured creditor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this unsecured creditor.
	 *
	 * @return the osi insolvency ID of this unsecured creditor
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this unsecured creditor.
	 *
	 * @return the primary key of this unsecured creditor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the unsecured creditor amount of this unsecured creditor.
	 *
	 * @return the unsecured creditor amount of this unsecured creditor
	 */
	@Override
	public String getUnsecuredCreditorAmount() {
		return model.getUnsecuredCreditorAmount();
	}

	/**
	 * Returns the unsecured creditor counter of this unsecured creditor.
	 *
	 * @return the unsecured creditor counter of this unsecured creditor
	 */
	@Override
	public String getUnsecuredCreditorCounter() {
		return model.getUnsecuredCreditorCounter();
	}

	/**
	 * Returns the unsecured creditor date of this unsecured creditor.
	 *
	 * @return the unsecured creditor date of this unsecured creditor
	 */
	@Override
	public Date getUnsecuredCreditorDate() {
		return model.getUnsecuredCreditorDate();
	}

	/**
	 * Returns the unsecured creditor debt of this unsecured creditor.
	 *
	 * @return the unsecured creditor debt of this unsecured creditor
	 */
	@Override
	public String getUnsecuredCreditorDebt() {
		return model.getUnsecuredCreditorDebt();
	}

	/**
	 * Returns the unsecured creditor ID of this unsecured creditor.
	 *
	 * @return the unsecured creditor ID of this unsecured creditor
	 */
	@Override
	public long getUnsecuredCreditorId() {
		return model.getUnsecuredCreditorId();
	}

	/**
	 * Returns the unsecured creditor name of this unsecured creditor.
	 *
	 * @return the unsecured creditor name of this unsecured creditor
	 */
	@Override
	public String getUnsecuredCreditorName() {
		return model.getUnsecuredCreditorName();
	}

	/**
	 * Returns the unsecured creditor payment of this unsecured creditor.
	 *
	 * @return the unsecured creditor payment of this unsecured creditor
	 */
	@Override
	public String getUnsecuredCreditorPayment() {
		return model.getUnsecuredCreditorPayment();
	}

	/**
	 * Returns the user ID of this unsecured creditor.
	 *
	 * @return the user ID of this unsecured creditor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this unsecured creditor.
	 *
	 * @return the user name of this unsecured creditor
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this unsecured creditor.
	 *
	 * @return the user uuid of this unsecured creditor
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
	 * Sets the company ID of this unsecured creditor.
	 *
	 * @param companyId the company ID of this unsecured creditor
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this unsecured creditor.
	 *
	 * @param createDate the create date of this unsecured creditor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this unsecured creditor.
	 *
	 * @param groupId the group ID of this unsecured creditor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this unsecured creditor.
	 *
	 * @param modifiedDate the modified date of this unsecured creditor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this unsecured creditor.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this unsecured creditor
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this unsecured creditor.
	 *
	 * @param primaryKey the primary key of this unsecured creditor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the unsecured creditor amount of this unsecured creditor.
	 *
	 * @param unsecuredCreditorAmount the unsecured creditor amount of this unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditorAmount(String unsecuredCreditorAmount) {
		model.setUnsecuredCreditorAmount(unsecuredCreditorAmount);
	}

	/**
	 * Sets the unsecured creditor counter of this unsecured creditor.
	 *
	 * @param unsecuredCreditorCounter the unsecured creditor counter of this unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditorCounter(String unsecuredCreditorCounter) {
		model.setUnsecuredCreditorCounter(unsecuredCreditorCounter);
	}

	/**
	 * Sets the unsecured creditor date of this unsecured creditor.
	 *
	 * @param unsecuredCreditorDate the unsecured creditor date of this unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditorDate(Date unsecuredCreditorDate) {
		model.setUnsecuredCreditorDate(unsecuredCreditorDate);
	}

	/**
	 * Sets the unsecured creditor debt of this unsecured creditor.
	 *
	 * @param unsecuredCreditorDebt the unsecured creditor debt of this unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditorDebt(String unsecuredCreditorDebt) {
		model.setUnsecuredCreditorDebt(unsecuredCreditorDebt);
	}

	/**
	 * Sets the unsecured creditor ID of this unsecured creditor.
	 *
	 * @param unsecuredCreditorId the unsecured creditor ID of this unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditorId(long unsecuredCreditorId) {
		model.setUnsecuredCreditorId(unsecuredCreditorId);
	}

	/**
	 * Sets the unsecured creditor name of this unsecured creditor.
	 *
	 * @param unsecuredCreditorName the unsecured creditor name of this unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditorName(String unsecuredCreditorName) {
		model.setUnsecuredCreditorName(unsecuredCreditorName);
	}

	/**
	 * Sets the unsecured creditor payment of this unsecured creditor.
	 *
	 * @param unsecuredCreditorPayment the unsecured creditor payment of this unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditorPayment(String unsecuredCreditorPayment) {
		model.setUnsecuredCreditorPayment(unsecuredCreditorPayment);
	}

	/**
	 * Sets the user ID of this unsecured creditor.
	 *
	 * @param userId the user ID of this unsecured creditor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this unsecured creditor.
	 *
	 * @param userName the user name of this unsecured creditor
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this unsecured creditor.
	 *
	 * @param userUuid the user uuid of this unsecured creditor
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
	protected UnsecuredCreditorWrapper wrap(
		UnsecuredCreditor unsecuredCreditor) {

		return new UnsecuredCreditorWrapper(unsecuredCreditor);
	}

}