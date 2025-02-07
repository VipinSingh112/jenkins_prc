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
 * This class is a wrapper for {@link HealthCareBussinessInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBussinessInfo
 * @generated
 */
public class HealthCareBussinessInfoWrapper
	extends BaseModelWrapper<HealthCareBussinessInfo>
	implements HealthCareBussinessInfo, ModelWrapper<HealthCareBussinessInfo> {

	public HealthCareBussinessInfoWrapper(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		super(healthCareBussinessInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"healthCareBussinessInfoId", getHealthCareBussinessInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("email", getEmail());
		attributes.put("parish", getParish());
		attributes.put("companyNumber", getCompanyNumber());
		attributes.put("trnNumber", getTrnNumber());
		attributes.put("healthCareApplicationId", getHealthCareApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long healthCareBussinessInfoId = (Long)attributes.get(
			"healthCareBussinessInfoId");

		if (healthCareBussinessInfoId != null) {
			setHealthCareBussinessInfoId(healthCareBussinessInfoId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String companyNumber = (String)attributes.get("companyNumber");

		if (companyNumber != null) {
			setCompanyNumber(companyNumber);
		}

		String trnNumber = (String)attributes.get("trnNumber");

		if (trnNumber != null) {
			setTrnNumber(trnNumber);
		}

		Long healthCareApplicationId = (Long)attributes.get(
			"healthCareApplicationId");

		if (healthCareApplicationId != null) {
			setHealthCareApplicationId(healthCareApplicationId);
		}
	}

	@Override
	public HealthCareBussinessInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this health care bussiness info.
	 *
	 * @return the company ID of this health care bussiness info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company number of this health care bussiness info.
	 *
	 * @return the company number of this health care bussiness info
	 */
	@Override
	public String getCompanyNumber() {
		return model.getCompanyNumber();
	}

	/**
	 * Returns the create date of this health care bussiness info.
	 *
	 * @return the create date of this health care bussiness info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this health care bussiness info.
	 *
	 * @return the email of this health care bussiness info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this health care bussiness info.
	 *
	 * @return the group ID of this health care bussiness info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the health care application ID of this health care bussiness info.
	 *
	 * @return the health care application ID of this health care bussiness info
	 */
	@Override
	public long getHealthCareApplicationId() {
		return model.getHealthCareApplicationId();
	}

	/**
	 * Returns the health care bussiness info ID of this health care bussiness info.
	 *
	 * @return the health care bussiness info ID of this health care bussiness info
	 */
	@Override
	public long getHealthCareBussinessInfoId() {
		return model.getHealthCareBussinessInfoId();
	}

	/**
	 * Returns the modified date of this health care bussiness info.
	 *
	 * @return the modified date of this health care bussiness info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this health care bussiness info.
	 *
	 * @return the name of this health care bussiness info
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the parish of this health care bussiness info.
	 *
	 * @return the parish of this health care bussiness info
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this health care bussiness info.
	 *
	 * @return the primary key of this health care bussiness info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone number of this health care bussiness info.
	 *
	 * @return the telephone number of this health care bussiness info
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the trn number of this health care bussiness info.
	 *
	 * @return the trn number of this health care bussiness info
	 */
	@Override
	public String getTrnNumber() {
		return model.getTrnNumber();
	}

	/**
	 * Returns the user ID of this health care bussiness info.
	 *
	 * @return the user ID of this health care bussiness info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this health care bussiness info.
	 *
	 * @return the user name of this health care bussiness info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this health care bussiness info.
	 *
	 * @return the user uuid of this health care bussiness info
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
	 * Sets the company ID of this health care bussiness info.
	 *
	 * @param companyId the company ID of this health care bussiness info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company number of this health care bussiness info.
	 *
	 * @param companyNumber the company number of this health care bussiness info
	 */
	@Override
	public void setCompanyNumber(String companyNumber) {
		model.setCompanyNumber(companyNumber);
	}

	/**
	 * Sets the create date of this health care bussiness info.
	 *
	 * @param createDate the create date of this health care bussiness info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this health care bussiness info.
	 *
	 * @param email the email of this health care bussiness info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this health care bussiness info.
	 *
	 * @param groupId the group ID of this health care bussiness info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the health care application ID of this health care bussiness info.
	 *
	 * @param healthCareApplicationId the health care application ID of this health care bussiness info
	 */
	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		model.setHealthCareApplicationId(healthCareApplicationId);
	}

	/**
	 * Sets the health care bussiness info ID of this health care bussiness info.
	 *
	 * @param healthCareBussinessInfoId the health care bussiness info ID of this health care bussiness info
	 */
	@Override
	public void setHealthCareBussinessInfoId(long healthCareBussinessInfoId) {
		model.setHealthCareBussinessInfoId(healthCareBussinessInfoId);
	}

	/**
	 * Sets the modified date of this health care bussiness info.
	 *
	 * @param modifiedDate the modified date of this health care bussiness info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this health care bussiness info.
	 *
	 * @param name the name of this health care bussiness info
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the parish of this health care bussiness info.
	 *
	 * @param parish the parish of this health care bussiness info
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this health care bussiness info.
	 *
	 * @param primaryKey the primary key of this health care bussiness info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone number of this health care bussiness info.
	 *
	 * @param telephoneNumber the telephone number of this health care bussiness info
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the trn number of this health care bussiness info.
	 *
	 * @param trnNumber the trn number of this health care bussiness info
	 */
	@Override
	public void setTrnNumber(String trnNumber) {
		model.setTrnNumber(trnNumber);
	}

	/**
	 * Sets the user ID of this health care bussiness info.
	 *
	 * @param userId the user ID of this health care bussiness info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this health care bussiness info.
	 *
	 * @param userName the user name of this health care bussiness info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this health care bussiness info.
	 *
	 * @param userUuid the user uuid of this health care bussiness info
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
	protected HealthCareBussinessInfoWrapper wrap(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		return new HealthCareBussinessInfoWrapper(healthCareBussinessInfo);
	}

}