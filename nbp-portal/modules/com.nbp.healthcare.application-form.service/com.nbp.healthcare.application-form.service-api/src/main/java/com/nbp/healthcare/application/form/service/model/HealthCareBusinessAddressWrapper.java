/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link HealthCareBusinessAddress}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBusinessAddress
 * @generated
 */
public class HealthCareBusinessAddressWrapper
	extends BaseModelWrapper<HealthCareBusinessAddress>
	implements HealthCareBusinessAddress,
			   ModelWrapper<HealthCareBusinessAddress> {

	public HealthCareBusinessAddressWrapper(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		super(healthCareBusinessAddress);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"healthCareBusinessAddressId", getHealthCareBusinessAddressId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bussinessAddress", getBussinessAddress());
		attributes.put("healthCareApplicationId", getHealthCareApplicationId());
		attributes.put(
			"healthCareBussinessInfoId", getHealthCareBussinessInfoId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthCareBusinessAddressId = (Long)attributes.get(
			"healthCareBusinessAddressId");

		if (healthCareBusinessAddressId != null) {
			setHealthCareBusinessAddressId(healthCareBusinessAddressId);
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

		String bussinessAddress = (String)attributes.get("bussinessAddress");

		if (bussinessAddress != null) {
			setBussinessAddress(bussinessAddress);
		}

		Long healthCareApplicationId = (Long)attributes.get(
			"healthCareApplicationId");

		if (healthCareApplicationId != null) {
			setHealthCareApplicationId(healthCareApplicationId);
		}

		Long healthCareBussinessInfoId = (Long)attributes.get(
			"healthCareBussinessInfoId");

		if (healthCareBussinessInfoId != null) {
			setHealthCareBussinessInfoId(healthCareBussinessInfoId);
		}
	}

	@Override
	public HealthCareBusinessAddress cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bussiness address of this health care business address.
	 *
	 * @return the bussiness address of this health care business address
	 */
	@Override
	public String getBussinessAddress() {
		return model.getBussinessAddress();
	}

	/**
	 * Returns the company ID of this health care business address.
	 *
	 * @return the company ID of this health care business address
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this health care business address.
	 *
	 * @return the create date of this health care business address
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this health care business address.
	 *
	 * @return the group ID of this health care business address
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health care application ID of this health care business address.
	 *
	 * @return the health care application ID of this health care business address
	 */
	@Override
	public long getHealthCareApplicationId() {
		return model.getHealthCareApplicationId();
	}

	/**
	 * Returns the health care business address ID of this health care business address.
	 *
	 * @return the health care business address ID of this health care business address
	 */
	@Override
	public long getHealthCareBusinessAddressId() {
		return model.getHealthCareBusinessAddressId();
	}

	/**
	 * Returns the health care bussiness info ID of this health care business address.
	 *
	 * @return the health care bussiness info ID of this health care business address
	 */
	@Override
	public long getHealthCareBussinessInfoId() {
		return model.getHealthCareBussinessInfoId();
	}

	/**
	 * Returns the modified date of this health care business address.
	 *
	 * @return the modified date of this health care business address
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this health care business address.
	 *
	 * @return the primary key of this health care business address
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this health care business address.
	 *
	 * @return the user ID of this health care business address
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care business address.
	 *
	 * @return the user name of this health care business address
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care business address.
	 *
	 * @return the user uuid of this health care business address
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
	 * Sets the bussiness address of this health care business address.
	 *
	 * @param bussinessAddress the bussiness address of this health care business address
	 */
	@Override
	public void setBussinessAddress(String bussinessAddress) {
		model.setBussinessAddress(bussinessAddress);
	}

	/**
	 * Sets the company ID of this health care business address.
	 *
	 * @param companyId the company ID of this health care business address
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this health care business address.
	 *
	 * @param createDate the create date of this health care business address
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this health care business address.
	 *
	 * @param groupId the group ID of this health care business address
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health care application ID of this health care business address.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care business address
	 */
	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		model.setHealthCareApplicationId(healthCareApplicationId);
	}

	/**
	 * Sets the health care business address ID of this health care business address.
	 *
	 * @param healthCareBusinessAddressId the health care business address ID of this health care business address
	 */
	@Override
	public void setHealthCareBusinessAddressId(
		long healthCareBusinessAddressId) {

		model.setHealthCareBusinessAddressId(healthCareBusinessAddressId);
	}

	/**
	 * Sets the health care bussiness info ID of this health care business address.
	 *
	 * @param healthCareBussinessInfoId the health care bussiness info ID of this health care business address
	 */
	@Override
	public void setHealthCareBussinessInfoId(long healthCareBussinessInfoId) {
		model.setHealthCareBussinessInfoId(healthCareBussinessInfoId);
	}

	/**
	 * Sets the modified date of this health care business address.
	 *
	 * @param modifiedDate the modified date of this health care business address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this health care business address.
	 *
	 * @param primaryKey the primary key of this health care business address
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this health care business address.
	 *
	 * @param userId the user ID of this health care business address
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care business address.
	 *
	 * @param userName the user name of this health care business address
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care business address.
	 *
	 * @param userUuid the user uuid of this health care business address
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
	protected HealthCareBusinessAddressWrapper wrap(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		return new HealthCareBusinessAddressWrapper(healthCareBusinessAddress);
	}

}