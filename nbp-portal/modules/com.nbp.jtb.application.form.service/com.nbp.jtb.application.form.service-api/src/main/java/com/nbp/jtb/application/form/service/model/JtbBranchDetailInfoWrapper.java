/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JtbBranchDetailInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbBranchDetailInfo
 * @generated
 */
public class JtbBranchDetailInfoWrapper
	extends BaseModelWrapper<JtbBranchDetailInfo>
	implements JtbBranchDetailInfo, ModelWrapper<JtbBranchDetailInfo> {

	public JtbBranchDetailInfoWrapper(JtbBranchDetailInfo jtbBranchDetailInfo) {
		super(jtbBranchDetailInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("jtbBranchDetailInfoId", getJtbBranchDetailInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("counter", getCounter());
		attributes.put("branchOfficeDetails", getBranchOfficeDetails());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jtbBranchDetailInfoId = (Long)attributes.get(
			"jtbBranchDetailInfoId");

		if (jtbBranchDetailInfoId != null) {
			setJtbBranchDetailInfoId(jtbBranchDetailInfoId);
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

		String branchOfficeDetails = (String)attributes.get(
			"branchOfficeDetails");

		if (branchOfficeDetails != null) {
			setBranchOfficeDetails(branchOfficeDetails);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public JtbBranchDetailInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the branch office details of this jtb branch detail info.
	 *
	 * @return the branch office details of this jtb branch detail info
	 */
	@Override
	public String getBranchOfficeDetails() {
		return model.getBranchOfficeDetails();
	}

	/**
	 * Returns the company ID of this jtb branch detail info.
	 *
	 * @return the company ID of this jtb branch detail info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this jtb branch detail info.
	 *
	 * @return the counter of this jtb branch detail info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this jtb branch detail info.
	 *
	 * @return the create date of this jtb branch detail info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jtb branch detail info.
	 *
	 * @return the group ID of this jtb branch detail info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this jtb branch detail info.
	 *
	 * @return the jtb application ID of this jtb branch detail info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the jtb branch detail info ID of this jtb branch detail info.
	 *
	 * @return the jtb branch detail info ID of this jtb branch detail info
	 */
	@Override
	public long getJtbBranchDetailInfoId() {
		return model.getJtbBranchDetailInfoId();
	}

	/**
	 * Returns the modified date of this jtb branch detail info.
	 *
	 * @return the modified date of this jtb branch detail info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jtb branch detail info.
	 *
	 * @return the primary key of this jtb branch detail info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jtb branch detail info.
	 *
	 * @return the user ID of this jtb branch detail info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb branch detail info.
	 *
	 * @return the user name of this jtb branch detail info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb branch detail info.
	 *
	 * @return the user uuid of this jtb branch detail info
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
	 * Sets the branch office details of this jtb branch detail info.
	 *
	 * @param branchOfficeDetails the branch office details of this jtb branch detail info
	 */
	@Override
	public void setBranchOfficeDetails(String branchOfficeDetails) {
		model.setBranchOfficeDetails(branchOfficeDetails);
	}

	/**
	 * Sets the company ID of this jtb branch detail info.
	 *
	 * @param companyId the company ID of this jtb branch detail info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this jtb branch detail info.
	 *
	 * @param counter the counter of this jtb branch detail info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this jtb branch detail info.
	 *
	 * @param createDate the create date of this jtb branch detail info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jtb branch detail info.
	 *
	 * @param groupId the group ID of this jtb branch detail info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this jtb branch detail info.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb branch detail info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the jtb branch detail info ID of this jtb branch detail info.
	 *
	 * @param jtbBranchDetailInfoId the jtb branch detail info ID of this jtb branch detail info
	 */
	@Override
	public void setJtbBranchDetailInfoId(long jtbBranchDetailInfoId) {
		model.setJtbBranchDetailInfoId(jtbBranchDetailInfoId);
	}

	/**
	 * Sets the modified date of this jtb branch detail info.
	 *
	 * @param modifiedDate the modified date of this jtb branch detail info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jtb branch detail info.
	 *
	 * @param primaryKey the primary key of this jtb branch detail info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jtb branch detail info.
	 *
	 * @param userId the user ID of this jtb branch detail info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb branch detail info.
	 *
	 * @param userName the user name of this jtb branch detail info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb branch detail info.
	 *
	 * @param userUuid the user uuid of this jtb branch detail info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected JtbBranchDetailInfoWrapper wrap(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		return new JtbBranchDetailInfoWrapper(jtbBranchDetailInfo);
	}

}