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
 * This class is a wrapper for {@link SecuredCreditor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecuredCreditor
 * @generated
 */
public class SecuredCreditorWrapper
	extends BaseModelWrapper<SecuredCreditor>
	implements ModelWrapper<SecuredCreditor>, SecuredCreditor {

	public SecuredCreditorWrapper(SecuredCreditor securedCreditor) {
		super(securedCreditor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("securedCreditorId", getSecuredCreditorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("securedCreditorName", getSecuredCreditorName());
		attributes.put("securedCreditorAsset", getSecuredCreditorAsset());
		attributes.put(
			"securedCreditorLiability", getSecuredCreditorLiability());
		attributes.put("securedCreditorPayment", getSecuredCreditorPayment());
		attributes.put("securedCreditorCounter", getSecuredCreditorCounter());
		attributes.put("securedCreditorDate", getSecuredCreditorDate());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long securedCreditorId = (Long)attributes.get("securedCreditorId");

		if (securedCreditorId != null) {
			setSecuredCreditorId(securedCreditorId);
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

		String securedCreditorName = (String)attributes.get(
			"securedCreditorName");

		if (securedCreditorName != null) {
			setSecuredCreditorName(securedCreditorName);
		}

		String securedCreditorAsset = (String)attributes.get(
			"securedCreditorAsset");

		if (securedCreditorAsset != null) {
			setSecuredCreditorAsset(securedCreditorAsset);
		}

		String securedCreditorLiability = (String)attributes.get(
			"securedCreditorLiability");

		if (securedCreditorLiability != null) {
			setSecuredCreditorLiability(securedCreditorLiability);
		}

		String securedCreditorPayment = (String)attributes.get(
			"securedCreditorPayment");

		if (securedCreditorPayment != null) {
			setSecuredCreditorPayment(securedCreditorPayment);
		}

		String securedCreditorCounter = (String)attributes.get(
			"securedCreditorCounter");

		if (securedCreditorCounter != null) {
			setSecuredCreditorCounter(securedCreditorCounter);
		}

		Date securedCreditorDate = (Date)attributes.get("securedCreditorDate");

		if (securedCreditorDate != null) {
			setSecuredCreditorDate(securedCreditorDate);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public SecuredCreditor cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this secured creditor.
	 *
	 * @return the company ID of this secured creditor
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this secured creditor.
	 *
	 * @return the create date of this secured creditor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this secured creditor.
	 *
	 * @return the group ID of this secured creditor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this secured creditor.
	 *
	 * @return the modified date of this secured creditor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this secured creditor.
	 *
	 * @return the osi insolvency ID of this secured creditor
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this secured creditor.
	 *
	 * @return the primary key of this secured creditor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secured creditor asset of this secured creditor.
	 *
	 * @return the secured creditor asset of this secured creditor
	 */
	@Override
	public String getSecuredCreditorAsset() {
		return model.getSecuredCreditorAsset();
	}

	/**
	 * Returns the secured creditor counter of this secured creditor.
	 *
	 * @return the secured creditor counter of this secured creditor
	 */
	@Override
	public String getSecuredCreditorCounter() {
		return model.getSecuredCreditorCounter();
	}

	/**
	 * Returns the secured creditor date of this secured creditor.
	 *
	 * @return the secured creditor date of this secured creditor
	 */
	@Override
	public Date getSecuredCreditorDate() {
		return model.getSecuredCreditorDate();
	}

	/**
	 * Returns the secured creditor ID of this secured creditor.
	 *
	 * @return the secured creditor ID of this secured creditor
	 */
	@Override
	public long getSecuredCreditorId() {
		return model.getSecuredCreditorId();
	}

	/**
	 * Returns the secured creditor liability of this secured creditor.
	 *
	 * @return the secured creditor liability of this secured creditor
	 */
	@Override
	public String getSecuredCreditorLiability() {
		return model.getSecuredCreditorLiability();
	}

	/**
	 * Returns the secured creditor name of this secured creditor.
	 *
	 * @return the secured creditor name of this secured creditor
	 */
	@Override
	public String getSecuredCreditorName() {
		return model.getSecuredCreditorName();
	}

	/**
	 * Returns the secured creditor payment of this secured creditor.
	 *
	 * @return the secured creditor payment of this secured creditor
	 */
	@Override
	public String getSecuredCreditorPayment() {
		return model.getSecuredCreditorPayment();
	}

	/**
	 * Returns the user ID of this secured creditor.
	 *
	 * @return the user ID of this secured creditor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this secured creditor.
	 *
	 * @return the user name of this secured creditor
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this secured creditor.
	 *
	 * @return the user uuid of this secured creditor
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
	 * Sets the company ID of this secured creditor.
	 *
	 * @param companyId the company ID of this secured creditor
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this secured creditor.
	 *
	 * @param createDate the create date of this secured creditor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this secured creditor.
	 *
	 * @param groupId the group ID of this secured creditor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this secured creditor.
	 *
	 * @param modifiedDate the modified date of this secured creditor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this secured creditor.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this secured creditor
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this secured creditor.
	 *
	 * @param primaryKey the primary key of this secured creditor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secured creditor asset of this secured creditor.
	 *
	 * @param securedCreditorAsset the secured creditor asset of this secured creditor
	 */
	@Override
	public void setSecuredCreditorAsset(String securedCreditorAsset) {
		model.setSecuredCreditorAsset(securedCreditorAsset);
	}

	/**
	 * Sets the secured creditor counter of this secured creditor.
	 *
	 * @param securedCreditorCounter the secured creditor counter of this secured creditor
	 */
	@Override
	public void setSecuredCreditorCounter(String securedCreditorCounter) {
		model.setSecuredCreditorCounter(securedCreditorCounter);
	}

	/**
	 * Sets the secured creditor date of this secured creditor.
	 *
	 * @param securedCreditorDate the secured creditor date of this secured creditor
	 */
	@Override
	public void setSecuredCreditorDate(Date securedCreditorDate) {
		model.setSecuredCreditorDate(securedCreditorDate);
	}

	/**
	 * Sets the secured creditor ID of this secured creditor.
	 *
	 * @param securedCreditorId the secured creditor ID of this secured creditor
	 */
	@Override
	public void setSecuredCreditorId(long securedCreditorId) {
		model.setSecuredCreditorId(securedCreditorId);
	}

	/**
	 * Sets the secured creditor liability of this secured creditor.
	 *
	 * @param securedCreditorLiability the secured creditor liability of this secured creditor
	 */
	@Override
	public void setSecuredCreditorLiability(String securedCreditorLiability) {
		model.setSecuredCreditorLiability(securedCreditorLiability);
	}

	/**
	 * Sets the secured creditor name of this secured creditor.
	 *
	 * @param securedCreditorName the secured creditor name of this secured creditor
	 */
	@Override
	public void setSecuredCreditorName(String securedCreditorName) {
		model.setSecuredCreditorName(securedCreditorName);
	}

	/**
	 * Sets the secured creditor payment of this secured creditor.
	 *
	 * @param securedCreditorPayment the secured creditor payment of this secured creditor
	 */
	@Override
	public void setSecuredCreditorPayment(String securedCreditorPayment) {
		model.setSecuredCreditorPayment(securedCreditorPayment);
	}

	/**
	 * Sets the user ID of this secured creditor.
	 *
	 * @param userId the user ID of this secured creditor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this secured creditor.
	 *
	 * @param userName the user name of this secured creditor
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this secured creditor.
	 *
	 * @param userUuid the user uuid of this secured creditor
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
	protected SecuredCreditorWrapper wrap(SecuredCreditor securedCreditor) {
		return new SecuredCreditorWrapper(securedCreditor);
	}

}