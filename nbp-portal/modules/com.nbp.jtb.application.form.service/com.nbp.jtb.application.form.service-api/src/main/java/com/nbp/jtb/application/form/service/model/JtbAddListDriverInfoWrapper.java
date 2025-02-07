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
 * This class is a wrapper for {@link JtbAddListDriverInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListDriverInfo
 * @generated
 */
public class JtbAddListDriverInfoWrapper
	extends BaseModelWrapper<JtbAddListDriverInfo>
	implements JtbAddListDriverInfo, ModelWrapper<JtbAddListDriverInfo> {

	public JtbAddListDriverInfoWrapper(
		JtbAddListDriverInfo jtbAddListDriverInfo) {

		super(jtbAddListDriverInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jtbAddListDriverInfoId", getJtbAddListDriverInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("counter", getCounter());
		attributes.put("driverName", getDriverName());
		attributes.put("driverLicence", getDriverLicence());
		attributes.put("driverExpiryDate", getDriverExpiryDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jtbAddListDriverInfoId = (Long)attributes.get(
			"jtbAddListDriverInfoId");

		if (jtbAddListDriverInfoId != null) {
			setJtbAddListDriverInfoId(jtbAddListDriverInfoId);
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

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		String driverName = (String)attributes.get("driverName");

		if (driverName != null) {
			setDriverName(driverName);
		}

		String driverLicence = (String)attributes.get("driverLicence");

		if (driverLicence != null) {
			setDriverLicence(driverLicence);
		}

		Date driverExpiryDate = (Date)attributes.get("driverExpiryDate");

		if (driverExpiryDate != null) {
			setDriverExpiryDate(driverExpiryDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public JtbAddListDriverInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jtb add list driver info.
	 *
	 * @return the company ID of this jtb add list driver info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this jtb add list driver info.
	 *
	 * @return the counter of this jtb add list driver info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this jtb add list driver info.
	 *
	 * @return the create date of this jtb add list driver info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the driver expiry date of this jtb add list driver info.
	 *
	 * @return the driver expiry date of this jtb add list driver info
	 */
	@Override
	public Date getDriverExpiryDate() {
		return model.getDriverExpiryDate();
	}

	/**
	 * Returns the driver licence of this jtb add list driver info.
	 *
	 * @return the driver licence of this jtb add list driver info
	 */
	@Override
	public String getDriverLicence() {
		return model.getDriverLicence();
	}

	/**
	 * Returns the driver name of this jtb add list driver info.
	 *
	 * @return the driver name of this jtb add list driver info
	 */
	@Override
	public String getDriverName() {
		return model.getDriverName();
	}

	/**
	 * Returns the group ID of this jtb add list driver info.
	 *
	 * @return the group ID of this jtb add list driver info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb add list driver info ID of this jtb add list driver info.
	 *
	 * @return the jtb add list driver info ID of this jtb add list driver info
	 */
	@Override
	public long getJtbAddListDriverInfoId() {
		return model.getJtbAddListDriverInfoId();
	}

	/**
	 * Returns the jtb application ID of this jtb add list driver info.
	 *
	 * @return the jtb application ID of this jtb add list driver info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this jtb add list driver info.
	 *
	 * @return the modified date of this jtb add list driver info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jtb add list driver info.
	 *
	 * @return the primary key of this jtb add list driver info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jtb add list driver info.
	 *
	 * @return the user ID of this jtb add list driver info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb add list driver info.
	 *
	 * @return the user name of this jtb add list driver info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb add list driver info.
	 *
	 * @return the user uuid of this jtb add list driver info
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
	 * Sets the company ID of this jtb add list driver info.
	 *
	 * @param companyId the company ID of this jtb add list driver info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this jtb add list driver info.
	 *
	 * @param counter the counter of this jtb add list driver info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this jtb add list driver info.
	 *
	 * @param createDate the create date of this jtb add list driver info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the driver expiry date of this jtb add list driver info.
	 *
	 * @param driverExpiryDate the driver expiry date of this jtb add list driver info
	 */
	@Override
	public void setDriverExpiryDate(Date driverExpiryDate) {
		model.setDriverExpiryDate(driverExpiryDate);
	}

	/**
	 * Sets the driver licence of this jtb add list driver info.
	 *
	 * @param driverLicence the driver licence of this jtb add list driver info
	 */
	@Override
	public void setDriverLicence(String driverLicence) {
		model.setDriverLicence(driverLicence);
	}

	/**
	 * Sets the driver name of this jtb add list driver info.
	 *
	 * @param driverName the driver name of this jtb add list driver info
	 */
	@Override
	public void setDriverName(String driverName) {
		model.setDriverName(driverName);
	}

	/**
	 * Sets the group ID of this jtb add list driver info.
	 *
	 * @param groupId the group ID of this jtb add list driver info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb add list driver info ID of this jtb add list driver info.
	 *
	 * @param jtbAddListDriverInfoId the jtb add list driver info ID of this jtb add list driver info
	 */
	@Override
	public void setJtbAddListDriverInfoId(long jtbAddListDriverInfoId) {
		model.setJtbAddListDriverInfoId(jtbAddListDriverInfoId);
	}

	/**
	 * Sets the jtb application ID of this jtb add list driver info.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb add list driver info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this jtb add list driver info.
	 *
	 * @param modifiedDate the modified date of this jtb add list driver info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jtb add list driver info.
	 *
	 * @param primaryKey the primary key of this jtb add list driver info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jtb add list driver info.
	 *
	 * @param userId the user ID of this jtb add list driver info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb add list driver info.
	 *
	 * @param userName the user name of this jtb add list driver info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb add list driver info.
	 *
	 * @param userUuid the user uuid of this jtb add list driver info
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
	protected JtbAddListDriverInfoWrapper wrap(
		JtbAddListDriverInfo jtbAddListDriverInfo) {

		return new JtbAddListDriverInfoWrapper(jtbAddListDriverInfo);
	}

}