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
 * This class is a wrapper for {@link SezOccupantShareHoldingInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantShareHoldingInfo
 * @generated
 */
public class SezOccupantShareHoldingInfoWrapper
	extends BaseModelWrapper<SezOccupantShareHoldingInfo>
	implements ModelWrapper<SezOccupantShareHoldingInfo>,
			   SezOccupantShareHoldingInfo {

	public SezOccupantShareHoldingInfoWrapper(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		super(sezOccupantShareHoldingInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccShareHolderId", getSezOccShareHolderId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occAuthorised", getOccAuthorised());
		attributes.put("occSubscribed", getOccSubscribed());
		attributes.put("occShareHolderCounter", getOccShareHolderCounter());
		attributes.put("occPaidCapital", getOccPaidCapital());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccShareHolderId = (Long)attributes.get("sezOccShareHolderId");

		if (sezOccShareHolderId != null) {
			setSezOccShareHolderId(sezOccShareHolderId);
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

		String occAuthorised = (String)attributes.get("occAuthorised");

		if (occAuthorised != null) {
			setOccAuthorised(occAuthorised);
		}

		String occSubscribed = (String)attributes.get("occSubscribed");

		if (occSubscribed != null) {
			setOccSubscribed(occSubscribed);
		}

		String occShareHolderCounter = (String)attributes.get(
			"occShareHolderCounter");

		if (occShareHolderCounter != null) {
			setOccShareHolderCounter(occShareHolderCounter);
		}

		String occPaidCapital = (String)attributes.get("occPaidCapital");

		if (occPaidCapital != null) {
			setOccPaidCapital(occPaidCapital);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantShareHoldingInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant share holding info.
	 *
	 * @return the company ID of this sez occupant share holding info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant share holding info.
	 *
	 * @return the create date of this sez occupant share holding info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant share holding info.
	 *
	 * @return the group ID of this sez occupant share holding info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant share holding info.
	 *
	 * @return the modified date of this sez occupant share holding info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ authorised of this sez occupant share holding info.
	 *
	 * @return the occ authorised of this sez occupant share holding info
	 */
	@Override
	public String getOccAuthorised() {
		return model.getOccAuthorised();
	}

	/**
	 * Returns the occ paid capital of this sez occupant share holding info.
	 *
	 * @return the occ paid capital of this sez occupant share holding info
	 */
	@Override
	public String getOccPaidCapital() {
		return model.getOccPaidCapital();
	}

	/**
	 * Returns the occ share holder counter of this sez occupant share holding info.
	 *
	 * @return the occ share holder counter of this sez occupant share holding info
	 */
	@Override
	public String getOccShareHolderCounter() {
		return model.getOccShareHolderCounter();
	}

	/**
	 * Returns the occ subscribed of this sez occupant share holding info.
	 *
	 * @return the occ subscribed of this sez occupant share holding info
	 */
	@Override
	public String getOccSubscribed() {
		return model.getOccSubscribed();
	}

	/**
	 * Returns the primary key of this sez occupant share holding info.
	 *
	 * @return the primary key of this sez occupant share holding info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ share holder ID of this sez occupant share holding info.
	 *
	 * @return the sez occ share holder ID of this sez occupant share holding info
	 */
	@Override
	public long getSezOccShareHolderId() {
		return model.getSezOccShareHolderId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant share holding info.
	 *
	 * @return the sez status application ID of this sez occupant share holding info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant share holding info.
	 *
	 * @return the user ID of this sez occupant share holding info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant share holding info.
	 *
	 * @return the user name of this sez occupant share holding info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant share holding info.
	 *
	 * @return the user uuid of this sez occupant share holding info
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
	 * Sets the company ID of this sez occupant share holding info.
	 *
	 * @param companyId the company ID of this sez occupant share holding info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant share holding info.
	 *
	 * @param createDate the create date of this sez occupant share holding info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant share holding info.
	 *
	 * @param groupId the group ID of this sez occupant share holding info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant share holding info.
	 *
	 * @param modifiedDate the modified date of this sez occupant share holding info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ authorised of this sez occupant share holding info.
	 *
	 * @param occAuthorised the occ authorised of this sez occupant share holding info
	 */
	@Override
	public void setOccAuthorised(String occAuthorised) {
		model.setOccAuthorised(occAuthorised);
	}

	/**
	 * Sets the occ paid capital of this sez occupant share holding info.
	 *
	 * @param occPaidCapital the occ paid capital of this sez occupant share holding info
	 */
	@Override
	public void setOccPaidCapital(String occPaidCapital) {
		model.setOccPaidCapital(occPaidCapital);
	}

	/**
	 * Sets the occ share holder counter of this sez occupant share holding info.
	 *
	 * @param occShareHolderCounter the occ share holder counter of this sez occupant share holding info
	 */
	@Override
	public void setOccShareHolderCounter(String occShareHolderCounter) {
		model.setOccShareHolderCounter(occShareHolderCounter);
	}

	/**
	 * Sets the occ subscribed of this sez occupant share holding info.
	 *
	 * @param occSubscribed the occ subscribed of this sez occupant share holding info
	 */
	@Override
	public void setOccSubscribed(String occSubscribed) {
		model.setOccSubscribed(occSubscribed);
	}

	/**
	 * Sets the primary key of this sez occupant share holding info.
	 *
	 * @param primaryKey the primary key of this sez occupant share holding info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ share holder ID of this sez occupant share holding info.
	 *
	 * @param sezOccShareHolderId the sez occ share holder ID of this sez occupant share holding info
	 */
	@Override
	public void setSezOccShareHolderId(long sezOccShareHolderId) {
		model.setSezOccShareHolderId(sezOccShareHolderId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant share holding info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant share holding info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant share holding info.
	 *
	 * @param userId the user ID of this sez occupant share holding info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant share holding info.
	 *
	 * @param userName the user name of this sez occupant share holding info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant share holding info.
	 *
	 * @param userUuid the user uuid of this sez occupant share holding info
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
	protected SezOccupantShareHoldingInfoWrapper wrap(
		SezOccupantShareHoldingInfo sezOccupantShareHoldingInfo) {

		return new SezOccupantShareHoldingInfoWrapper(
			sezOccupantShareHoldingInfo);
	}

}