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
 * This class is a wrapper for {@link PreferredCreditor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreferredCreditor
 * @generated
 */
public class PreferredCreditorWrapper
	extends BaseModelWrapper<PreferredCreditor>
	implements ModelWrapper<PreferredCreditor>, PreferredCreditor {

	public PreferredCreditorWrapper(PreferredCreditor preferredCreditor) {
		super(preferredCreditor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("preferredCreditorId", getPreferredCreditorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("preferredCreditorName", getPreferredCreditorName());
		attributes.put(
			"preferredCreditorLiability", getPreferredCreditorLiability());
		attributes.put("preferredCreditorAmount", getPreferredCreditorAmount());
		attributes.put(
			"preferredCreditorPayment", getPreferredCreditorPayment());
		attributes.put(
			"preferredCreditorCounter", getPreferredCreditorCounter());
		attributes.put("preferredCreditorDate", getPreferredCreditorDate());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long preferredCreditorId = (Long)attributes.get("preferredCreditorId");

		if (preferredCreditorId != null) {
			setPreferredCreditorId(preferredCreditorId);
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

		String preferredCreditorName = (String)attributes.get(
			"preferredCreditorName");

		if (preferredCreditorName != null) {
			setPreferredCreditorName(preferredCreditorName);
		}

		String preferredCreditorLiability = (String)attributes.get(
			"preferredCreditorLiability");

		if (preferredCreditorLiability != null) {
			setPreferredCreditorLiability(preferredCreditorLiability);
		}

		String preferredCreditorAmount = (String)attributes.get(
			"preferredCreditorAmount");

		if (preferredCreditorAmount != null) {
			setPreferredCreditorAmount(preferredCreditorAmount);
		}

		String preferredCreditorPayment = (String)attributes.get(
			"preferredCreditorPayment");

		if (preferredCreditorPayment != null) {
			setPreferredCreditorPayment(preferredCreditorPayment);
		}

		String preferredCreditorCounter = (String)attributes.get(
			"preferredCreditorCounter");

		if (preferredCreditorCounter != null) {
			setPreferredCreditorCounter(preferredCreditorCounter);
		}

		Date preferredCreditorDate = (Date)attributes.get(
			"preferredCreditorDate");

		if (preferredCreditorDate != null) {
			setPreferredCreditorDate(preferredCreditorDate);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public PreferredCreditor cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this preferred creditor.
	 *
	 * @return the company ID of this preferred creditor
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this preferred creditor.
	 *
	 * @return the create date of this preferred creditor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this preferred creditor.
	 *
	 * @return the group ID of this preferred creditor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this preferred creditor.
	 *
	 * @return the modified date of this preferred creditor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this preferred creditor.
	 *
	 * @return the osi insolvency ID of this preferred creditor
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the preferred creditor amount of this preferred creditor.
	 *
	 * @return the preferred creditor amount of this preferred creditor
	 */
	@Override
	public String getPreferredCreditorAmount() {
		return model.getPreferredCreditorAmount();
	}

	/**
	 * Returns the preferred creditor counter of this preferred creditor.
	 *
	 * @return the preferred creditor counter of this preferred creditor
	 */
	@Override
	public String getPreferredCreditorCounter() {
		return model.getPreferredCreditorCounter();
	}

	/**
	 * Returns the preferred creditor date of this preferred creditor.
	 *
	 * @return the preferred creditor date of this preferred creditor
	 */
	@Override
	public Date getPreferredCreditorDate() {
		return model.getPreferredCreditorDate();
	}

	/**
	 * Returns the preferred creditor ID of this preferred creditor.
	 *
	 * @return the preferred creditor ID of this preferred creditor
	 */
	@Override
	public long getPreferredCreditorId() {
		return model.getPreferredCreditorId();
	}

	/**
	 * Returns the preferred creditor liability of this preferred creditor.
	 *
	 * @return the preferred creditor liability of this preferred creditor
	 */
	@Override
	public String getPreferredCreditorLiability() {
		return model.getPreferredCreditorLiability();
	}

	/**
	 * Returns the preferred creditor name of this preferred creditor.
	 *
	 * @return the preferred creditor name of this preferred creditor
	 */
	@Override
	public String getPreferredCreditorName() {
		return model.getPreferredCreditorName();
	}

	/**
	 * Returns the preferred creditor payment of this preferred creditor.
	 *
	 * @return the preferred creditor payment of this preferred creditor
	 */
	@Override
	public String getPreferredCreditorPayment() {
		return model.getPreferredCreditorPayment();
	}

	/**
	 * Returns the primary key of this preferred creditor.
	 *
	 * @return the primary key of this preferred creditor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this preferred creditor.
	 *
	 * @return the user ID of this preferred creditor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this preferred creditor.
	 *
	 * @return the user name of this preferred creditor
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this preferred creditor.
	 *
	 * @return the user uuid of this preferred creditor
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
	 * Sets the company ID of this preferred creditor.
	 *
	 * @param companyId the company ID of this preferred creditor
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this preferred creditor.
	 *
	 * @param createDate the create date of this preferred creditor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this preferred creditor.
	 *
	 * @param groupId the group ID of this preferred creditor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this preferred creditor.
	 *
	 * @param modifiedDate the modified date of this preferred creditor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this preferred creditor.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this preferred creditor
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the preferred creditor amount of this preferred creditor.
	 *
	 * @param preferredCreditorAmount the preferred creditor amount of this preferred creditor
	 */
	@Override
	public void setPreferredCreditorAmount(String preferredCreditorAmount) {
		model.setPreferredCreditorAmount(preferredCreditorAmount);
	}

	/**
	 * Sets the preferred creditor counter of this preferred creditor.
	 *
	 * @param preferredCreditorCounter the preferred creditor counter of this preferred creditor
	 */
	@Override
	public void setPreferredCreditorCounter(String preferredCreditorCounter) {
		model.setPreferredCreditorCounter(preferredCreditorCounter);
	}

	/**
	 * Sets the preferred creditor date of this preferred creditor.
	 *
	 * @param preferredCreditorDate the preferred creditor date of this preferred creditor
	 */
	@Override
	public void setPreferredCreditorDate(Date preferredCreditorDate) {
		model.setPreferredCreditorDate(preferredCreditorDate);
	}

	/**
	 * Sets the preferred creditor ID of this preferred creditor.
	 *
	 * @param preferredCreditorId the preferred creditor ID of this preferred creditor
	 */
	@Override
	public void setPreferredCreditorId(long preferredCreditorId) {
		model.setPreferredCreditorId(preferredCreditorId);
	}

	/**
	 * Sets the preferred creditor liability of this preferred creditor.
	 *
	 * @param preferredCreditorLiability the preferred creditor liability of this preferred creditor
	 */
	@Override
	public void setPreferredCreditorLiability(
		String preferredCreditorLiability) {

		model.setPreferredCreditorLiability(preferredCreditorLiability);
	}

	/**
	 * Sets the preferred creditor name of this preferred creditor.
	 *
	 * @param preferredCreditorName the preferred creditor name of this preferred creditor
	 */
	@Override
	public void setPreferredCreditorName(String preferredCreditorName) {
		model.setPreferredCreditorName(preferredCreditorName);
	}

	/**
	 * Sets the preferred creditor payment of this preferred creditor.
	 *
	 * @param preferredCreditorPayment the preferred creditor payment of this preferred creditor
	 */
	@Override
	public void setPreferredCreditorPayment(String preferredCreditorPayment) {
		model.setPreferredCreditorPayment(preferredCreditorPayment);
	}

	/**
	 * Sets the primary key of this preferred creditor.
	 *
	 * @param primaryKey the primary key of this preferred creditor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this preferred creditor.
	 *
	 * @param userId the user ID of this preferred creditor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this preferred creditor.
	 *
	 * @param userName the user name of this preferred creditor
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this preferred creditor.
	 *
	 * @param userUuid the user uuid of this preferred creditor
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
	protected PreferredCreditorWrapper wrap(
		PreferredCreditor preferredCreditor) {

		return new PreferredCreditorWrapper(preferredCreditor);
	}

}