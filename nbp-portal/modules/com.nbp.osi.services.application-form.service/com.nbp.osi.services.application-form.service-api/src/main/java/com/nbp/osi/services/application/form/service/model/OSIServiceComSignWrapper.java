/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OSIServiceComSign}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceComSign
 * @generated
 */
public class OSIServiceComSignWrapper
	extends BaseModelWrapper<OSIServiceComSign>
	implements ModelWrapper<OSIServiceComSign>, OSIServiceComSign {

	public OSIServiceComSignWrapper(OSIServiceComSign osiServiceComSign) {
		super(osiServiceComSign);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiComSignId", getOsiComSignId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("comSignDate", getComSignDate());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiComSignId = (Long)attributes.get("osiComSignId");

		if (osiComSignId != null) {
			setOsiComSignId(osiComSignId);
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

		Date comSignDate = (Date)attributes.get("comSignDate");

		if (comSignDate != null) {
			setComSignDate(comSignDate);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OSIServiceComSign cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi service com sign.
	 *
	 * @return the company ID of this osi service com sign
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the com sign date of this osi service com sign.
	 *
	 * @return the com sign date of this osi service com sign
	 */
	@Override
	public Date getComSignDate() {
		return model.getComSignDate();
	}

	/**
	 * Returns the create date of this osi service com sign.
	 *
	 * @return the create date of this osi service com sign
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi service com sign.
	 *
	 * @return the group ID of this osi service com sign
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi service com sign.
	 *
	 * @return the modified date of this osi service com sign
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi com sign ID of this osi service com sign.
	 *
	 * @return the osi com sign ID of this osi service com sign
	 */
	@Override
	public long getOsiComSignId() {
		return model.getOsiComSignId();
	}

	/**
	 * Returns the osi services application ID of this osi service com sign.
	 *
	 * @return the osi services application ID of this osi service com sign
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the primary key of this osi service com sign.
	 *
	 * @return the primary key of this osi service com sign
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this osi service com sign.
	 *
	 * @return the user ID of this osi service com sign
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi service com sign.
	 *
	 * @return the user name of this osi service com sign
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi service com sign.
	 *
	 * @return the user uuid of this osi service com sign
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
	 * Sets the company ID of this osi service com sign.
	 *
	 * @param companyId the company ID of this osi service com sign
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the com sign date of this osi service com sign.
	 *
	 * @param comSignDate the com sign date of this osi service com sign
	 */
	@Override
	public void setComSignDate(Date comSignDate) {
		model.setComSignDate(comSignDate);
	}

	/**
	 * Sets the create date of this osi service com sign.
	 *
	 * @param createDate the create date of this osi service com sign
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi service com sign.
	 *
	 * @param groupId the group ID of this osi service com sign
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi service com sign.
	 *
	 * @param modifiedDate the modified date of this osi service com sign
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi com sign ID of this osi service com sign.
	 *
	 * @param osiComSignId the osi com sign ID of this osi service com sign
	 */
	@Override
	public void setOsiComSignId(long osiComSignId) {
		model.setOsiComSignId(osiComSignId);
	}

	/**
	 * Sets the osi services application ID of this osi service com sign.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi service com sign
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the primary key of this osi service com sign.
	 *
	 * @param primaryKey the primary key of this osi service com sign
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this osi service com sign.
	 *
	 * @param userId the user ID of this osi service com sign
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi service com sign.
	 *
	 * @param userName the user name of this osi service com sign
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi service com sign.
	 *
	 * @param userUuid the user uuid of this osi service com sign
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
	protected OSIServiceComSignWrapper wrap(
		OSIServiceComSign osiServiceComSign) {

		return new OSIServiceComSignWrapper(osiServiceComSign);
	}

}