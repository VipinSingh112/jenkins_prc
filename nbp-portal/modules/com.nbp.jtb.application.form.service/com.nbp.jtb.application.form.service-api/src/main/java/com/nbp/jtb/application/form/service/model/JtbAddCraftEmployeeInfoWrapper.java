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
 * This class is a wrapper for {@link JtbAddCraftEmployeeInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftEmployeeInfo
 * @generated
 */
public class JtbAddCraftEmployeeInfoWrapper
	extends BaseModelWrapper<JtbAddCraftEmployeeInfo>
	implements JtbAddCraftEmployeeInfo, ModelWrapper<JtbAddCraftEmployeeInfo> {

	public JtbAddCraftEmployeeInfoWrapper(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {

		super(jtbAddCraftEmployeeInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"jtbAddCraftEmployeeInfoId", getJtbAddCraftEmployeeInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("counter", getCounter());
		attributes.put("empName", getEmpName());
		attributes.put("empAddress", getEmpAddress());
		attributes.put("empPhoneNo", getEmpPhoneNo());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jtbAddCraftEmployeeInfoId = (Long)attributes.get(
			"jtbAddCraftEmployeeInfoId");

		if (jtbAddCraftEmployeeInfoId != null) {
			setJtbAddCraftEmployeeInfoId(jtbAddCraftEmployeeInfoId);
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

		String empName = (String)attributes.get("empName");

		if (empName != null) {
			setEmpName(empName);
		}

		String empAddress = (String)attributes.get("empAddress");

		if (empAddress != null) {
			setEmpAddress(empAddress);
		}

		String empPhoneNo = (String)attributes.get("empPhoneNo");

		if (empPhoneNo != null) {
			setEmpPhoneNo(empPhoneNo);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public JtbAddCraftEmployeeInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jtb add craft employee info.
	 *
	 * @return the company ID of this jtb add craft employee info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this jtb add craft employee info.
	 *
	 * @return the counter of this jtb add craft employee info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this jtb add craft employee info.
	 *
	 * @return the create date of this jtb add craft employee info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the emp address of this jtb add craft employee info.
	 *
	 * @return the emp address of this jtb add craft employee info
	 */
	@Override
	public String getEmpAddress() {
		return model.getEmpAddress();
	}

	/**
	 * Returns the emp name of this jtb add craft employee info.
	 *
	 * @return the emp name of this jtb add craft employee info
	 */
	@Override
	public String getEmpName() {
		return model.getEmpName();
	}

	/**
	 * Returns the emp phone no of this jtb add craft employee info.
	 *
	 * @return the emp phone no of this jtb add craft employee info
	 */
	@Override
	public String getEmpPhoneNo() {
		return model.getEmpPhoneNo();
	}

	/**
	 * Returns the group ID of this jtb add craft employee info.
	 *
	 * @return the group ID of this jtb add craft employee info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb add craft employee info ID of this jtb add craft employee info.
	 *
	 * @return the jtb add craft employee info ID of this jtb add craft employee info
	 */
	@Override
	public long getJtbAddCraftEmployeeInfoId() {
		return model.getJtbAddCraftEmployeeInfoId();
	}

	/**
	 * Returns the jtb application ID of this jtb add craft employee info.
	 *
	 * @return the jtb application ID of this jtb add craft employee info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this jtb add craft employee info.
	 *
	 * @return the modified date of this jtb add craft employee info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jtb add craft employee info.
	 *
	 * @return the primary key of this jtb add craft employee info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jtb add craft employee info.
	 *
	 * @return the user ID of this jtb add craft employee info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb add craft employee info.
	 *
	 * @return the user name of this jtb add craft employee info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb add craft employee info.
	 *
	 * @return the user uuid of this jtb add craft employee info
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
	 * Sets the company ID of this jtb add craft employee info.
	 *
	 * @param companyId the company ID of this jtb add craft employee info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this jtb add craft employee info.
	 *
	 * @param counter the counter of this jtb add craft employee info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this jtb add craft employee info.
	 *
	 * @param createDate the create date of this jtb add craft employee info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the emp address of this jtb add craft employee info.
	 *
	 * @param empAddress the emp address of this jtb add craft employee info
	 */
	@Override
	public void setEmpAddress(String empAddress) {
		model.setEmpAddress(empAddress);
	}

	/**
	 * Sets the emp name of this jtb add craft employee info.
	 *
	 * @param empName the emp name of this jtb add craft employee info
	 */
	@Override
	public void setEmpName(String empName) {
		model.setEmpName(empName);
	}

	/**
	 * Sets the emp phone no of this jtb add craft employee info.
	 *
	 * @param empPhoneNo the emp phone no of this jtb add craft employee info
	 */
	@Override
	public void setEmpPhoneNo(String empPhoneNo) {
		model.setEmpPhoneNo(empPhoneNo);
	}

	/**
	 * Sets the group ID of this jtb add craft employee info.
	 *
	 * @param groupId the group ID of this jtb add craft employee info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb add craft employee info ID of this jtb add craft employee info.
	 *
	 * @param jtbAddCraftEmployeeInfoId the jtb add craft employee info ID of this jtb add craft employee info
	 */
	@Override
	public void setJtbAddCraftEmployeeInfoId(long jtbAddCraftEmployeeInfoId) {
		model.setJtbAddCraftEmployeeInfoId(jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Sets the jtb application ID of this jtb add craft employee info.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb add craft employee info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this jtb add craft employee info.
	 *
	 * @param modifiedDate the modified date of this jtb add craft employee info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jtb add craft employee info.
	 *
	 * @param primaryKey the primary key of this jtb add craft employee info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jtb add craft employee info.
	 *
	 * @param userId the user ID of this jtb add craft employee info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb add craft employee info.
	 *
	 * @param userName the user name of this jtb add craft employee info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb add craft employee info.
	 *
	 * @param userUuid the user uuid of this jtb add craft employee info
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
	protected JtbAddCraftEmployeeInfoWrapper wrap(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {

		return new JtbAddCraftEmployeeInfoWrapper(jtbAddCraftEmployeeInfo);
	}

}