/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezDevShareholdingInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareholdingInfo
 * @generated
 */
public class SezDevShareholdingInfoWrapper
	extends BaseModelWrapper<SezDevShareholdingInfo>
	implements ModelWrapper<SezDevShareholdingInfo>, SezDevShareholdingInfo {

	public SezDevShareholdingInfoWrapper(
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		super(sezDevShareholdingInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezDevShareholdingInfoId", getSezDevShareholdingInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("authorised", getAuthorised());
		attributes.put("subscribed", getSubscribed());
		attributes.put("paidUpShareCapital", getPaidUpShareCapital());
		attributes.put("directorBankrupts", getDirectorBankrupts());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezDevShareholdingInfoId = (Long)attributes.get(
			"sezDevShareholdingInfoId");

		if (sezDevShareholdingInfoId != null) {
			setSezDevShareholdingInfoId(sezDevShareholdingInfoId);
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

		String authorised = (String)attributes.get("authorised");

		if (authorised != null) {
			setAuthorised(authorised);
		}

		String subscribed = (String)attributes.get("subscribed");

		if (subscribed != null) {
			setSubscribed(subscribed);
		}

		String paidUpShareCapital = (String)attributes.get(
			"paidUpShareCapital");

		if (paidUpShareCapital != null) {
			setPaidUpShareCapital(paidUpShareCapital);
		}

		String directorBankrupts = (String)attributes.get("directorBankrupts");

		if (directorBankrupts != null) {
			setDirectorBankrupts(directorBankrupts);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezDevShareholdingInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the authorised of this sez dev shareholding info.
	 *
	 * @return the authorised of this sez dev shareholding info
	 */
	@Override
	public String getAuthorised() {
		return model.getAuthorised();
	}

	/**
	 * Returns the company ID of this sez dev shareholding info.
	 *
	 * @return the company ID of this sez dev shareholding info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez dev shareholding info.
	 *
	 * @return the create date of this sez dev shareholding info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the director bankrupts of this sez dev shareholding info.
	 *
	 * @return the director bankrupts of this sez dev shareholding info
	 */
	@Override
	public String getDirectorBankrupts() {
		return model.getDirectorBankrupts();
	}

	/**
	 * Returns the group ID of this sez dev shareholding info.
	 *
	 * @return the group ID of this sez dev shareholding info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez dev shareholding info.
	 *
	 * @return the modified date of this sez dev shareholding info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the paid up share capital of this sez dev shareholding info.
	 *
	 * @return the paid up share capital of this sez dev shareholding info
	 */
	@Override
	public String getPaidUpShareCapital() {
		return model.getPaidUpShareCapital();
	}

	/**
	 * Returns the primary key of this sez dev shareholding info.
	 *
	 * @return the primary key of this sez dev shareholding info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez dev shareholding info ID of this sez dev shareholding info.
	 *
	 * @return the sez dev shareholding info ID of this sez dev shareholding info
	 */
	@Override
	public long getSezDevShareholdingInfoId() {
		return model.getSezDevShareholdingInfoId();
	}

	/**
	 * Returns the sez status application ID of this sez dev shareholding info.
	 *
	 * @return the sez status application ID of this sez dev shareholding info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the subscribed of this sez dev shareholding info.
	 *
	 * @return the subscribed of this sez dev shareholding info
	 */
	@Override
	public String getSubscribed() {
		return model.getSubscribed();
	}

	/**
	 * Returns the user ID of this sez dev shareholding info.
	 *
	 * @return the user ID of this sez dev shareholding info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez dev shareholding info.
	 *
	 * @return the user name of this sez dev shareholding info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez dev shareholding info.
	 *
	 * @return the user uuid of this sez dev shareholding info
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
	 * Sets the authorised of this sez dev shareholding info.
	 *
	 * @param authorised the authorised of this sez dev shareholding info
	 */
	@Override
	public void setAuthorised(String authorised) {
		model.setAuthorised(authorised);
	}

	/**
	 * Sets the company ID of this sez dev shareholding info.
	 *
	 * @param companyId the company ID of this sez dev shareholding info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez dev shareholding info.
	 *
	 * @param createDate the create date of this sez dev shareholding info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the director bankrupts of this sez dev shareholding info.
	 *
	 * @param directorBankrupts the director bankrupts of this sez dev shareholding info
	 */
	@Override
	public void setDirectorBankrupts(String directorBankrupts) {
		model.setDirectorBankrupts(directorBankrupts);
	}

	/**
	 * Sets the group ID of this sez dev shareholding info.
	 *
	 * @param groupId the group ID of this sez dev shareholding info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez dev shareholding info.
	 *
	 * @param modifiedDate the modified date of this sez dev shareholding info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the paid up share capital of this sez dev shareholding info.
	 *
	 * @param paidUpShareCapital the paid up share capital of this sez dev shareholding info
	 */
	@Override
	public void setPaidUpShareCapital(String paidUpShareCapital) {
		model.setPaidUpShareCapital(paidUpShareCapital);
	}

	/**
	 * Sets the primary key of this sez dev shareholding info.
	 *
	 * @param primaryKey the primary key of this sez dev shareholding info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez dev shareholding info ID of this sez dev shareholding info.
	 *
	 * @param sezDevShareholdingInfoId the sez dev shareholding info ID of this sez dev shareholding info
	 */
	@Override
	public void setSezDevShareholdingInfoId(long sezDevShareholdingInfoId) {
		model.setSezDevShareholdingInfoId(sezDevShareholdingInfoId);
	}

	/**
	 * Sets the sez status application ID of this sez dev shareholding info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez dev shareholding info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the subscribed of this sez dev shareholding info.
	 *
	 * @param subscribed the subscribed of this sez dev shareholding info
	 */
	@Override
	public void setSubscribed(String subscribed) {
		model.setSubscribed(subscribed);
	}

	/**
	 * Sets the user ID of this sez dev shareholding info.
	 *
	 * @param userId the user ID of this sez dev shareholding info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez dev shareholding info.
	 *
	 * @param userName the user name of this sez dev shareholding info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez dev shareholding info.
	 *
	 * @param userUuid the user uuid of this sez dev shareholding info
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
	protected SezDevShareholdingInfoWrapper wrap(
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		return new SezDevShareholdingInfoWrapper(sezDevShareholdingInfo);
	}

}