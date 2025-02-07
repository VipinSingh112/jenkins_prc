/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireAdvertising}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireAdvertising
 * @generated
 */
public class AcquireAdvertisingWrapper
	extends BaseModelWrapper<AcquireAdvertising>
	implements AcquireAdvertising, ModelWrapper<AcquireAdvertising> {

	public AcquireAdvertisingWrapper(AcquireAdvertising acquireAdvertising) {
		super(acquireAdvertising);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("acquireAdvertisingId", getAcquireAdvertisingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("dateFrom", getDateFrom());
		attributes.put("dateTo", getDateTo());
		attributes.put("advertisingMediaStatus", getAdvertisingMediaStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireAdvertisingId = (Long)attributes.get(
			"acquireAdvertisingId");

		if (acquireAdvertisingId != null) {
			setAcquireAdvertisingId(acquireAdvertisingId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		Date dateFrom = (Date)attributes.get("dateFrom");

		if (dateFrom != null) {
			setDateFrom(dateFrom);
		}

		Date dateTo = (Date)attributes.get("dateTo");

		if (dateTo != null) {
			setDateTo(dateTo);
		}

		String advertisingMediaStatus = (String)attributes.get(
			"advertisingMediaStatus");

		if (advertisingMediaStatus != null) {
			setAdvertisingMediaStatus(advertisingMediaStatus);
		}
	}

	@Override
	public AcquireAdvertising cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire advertising ID of this acquire advertising.
	 *
	 * @return the acquire advertising ID of this acquire advertising
	 */
	@Override
	public long getAcquireAdvertisingId() {
		return model.getAcquireAdvertisingId();
	}

	/**
	 * Returns the advertising media status of this acquire advertising.
	 *
	 * @return the advertising media status of this acquire advertising
	 */
	@Override
	public String getAdvertisingMediaStatus() {
		return model.getAdvertisingMediaStatus();
	}

	/**
	 * Returns the case ID of this acquire advertising.
	 *
	 * @return the case ID of this acquire advertising
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this acquire advertising.
	 *
	 * @return the company ID of this acquire advertising
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire advertising.
	 *
	 * @return the create date of this acquire advertising
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date from of this acquire advertising.
	 *
	 * @return the date from of this acquire advertising
	 */
	@Override
	public Date getDateFrom() {
		return model.getDateFrom();
	}

	/**
	 * Returns the date to of this acquire advertising.
	 *
	 * @return the date to of this acquire advertising
	 */
	@Override
	public Date getDateTo() {
		return model.getDateTo();
	}

	/**
	 * Returns the group ID of this acquire advertising.
	 *
	 * @return the group ID of this acquire advertising
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this acquire advertising.
	 *
	 * @return the modified date of this acquire advertising
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire advertising.
	 *
	 * @return the primary key of this acquire advertising
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire advertising.
	 *
	 * @return the user ID of this acquire advertising
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire advertising.
	 *
	 * @return the user name of this acquire advertising
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire advertising.
	 *
	 * @return the user uuid of this acquire advertising
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
	 * Sets the acquire advertising ID of this acquire advertising.
	 *
	 * @param acquireAdvertisingId the acquire advertising ID of this acquire advertising
	 */
	@Override
	public void setAcquireAdvertisingId(long acquireAdvertisingId) {
		model.setAcquireAdvertisingId(acquireAdvertisingId);
	}

	/**
	 * Sets the advertising media status of this acquire advertising.
	 *
	 * @param advertisingMediaStatus the advertising media status of this acquire advertising
	 */
	@Override
	public void setAdvertisingMediaStatus(String advertisingMediaStatus) {
		model.setAdvertisingMediaStatus(advertisingMediaStatus);
	}

	/**
	 * Sets the case ID of this acquire advertising.
	 *
	 * @param caseId the case ID of this acquire advertising
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this acquire advertising.
	 *
	 * @param companyId the company ID of this acquire advertising
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire advertising.
	 *
	 * @param createDate the create date of this acquire advertising
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date from of this acquire advertising.
	 *
	 * @param dateFrom the date from of this acquire advertising
	 */
	@Override
	public void setDateFrom(Date dateFrom) {
		model.setDateFrom(dateFrom);
	}

	/**
	 * Sets the date to of this acquire advertising.
	 *
	 * @param dateTo the date to of this acquire advertising
	 */
	@Override
	public void setDateTo(Date dateTo) {
		model.setDateTo(dateTo);
	}

	/**
	 * Sets the group ID of this acquire advertising.
	 *
	 * @param groupId the group ID of this acquire advertising
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this acquire advertising.
	 *
	 * @param modifiedDate the modified date of this acquire advertising
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire advertising.
	 *
	 * @param primaryKey the primary key of this acquire advertising
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire advertising.
	 *
	 * @param userId the user ID of this acquire advertising
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire advertising.
	 *
	 * @param userName the user name of this acquire advertising
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire advertising.
	 *
	 * @param userUuid the user uuid of this acquire advertising
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
	protected AcquireAdvertisingWrapper wrap(
		AcquireAdvertising acquireAdvertising) {

		return new AcquireAdvertisingWrapper(acquireAdvertising);
	}

}