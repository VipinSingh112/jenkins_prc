/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcraVerifyWeighingDate}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDate
 * @generated
 */
public class NcraVerifyWeighingDateWrapper
	extends BaseModelWrapper<NcraVerifyWeighingDate>
	implements ModelWrapper<NcraVerifyWeighingDate>, NcraVerifyWeighingDate {

	public NcraVerifyWeighingDateWrapper(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		super(ncraVerifyWeighingDate);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncraVerifyWeighingDateId", getNcraVerifyWeighingDateId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("weighingDate", getWeighingDate());
		attributes.put("ncraApplicationId", getNcraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncraVerifyWeighingDateId = (Long)attributes.get(
			"ncraVerifyWeighingDateId");

		if (ncraVerifyWeighingDateId != null) {
			setNcraVerifyWeighingDateId(ncraVerifyWeighingDateId);
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

		Date weighingDate = (Date)attributes.get("weighingDate");

		if (weighingDate != null) {
			setWeighingDate(weighingDate);
		}

		Long ncraApplicationId = (Long)attributes.get("ncraApplicationId");

		if (ncraApplicationId != null) {
			setNcraApplicationId(ncraApplicationId);
		}
	}

	@Override
	public NcraVerifyWeighingDate cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncra verify weighing date.
	 *
	 * @return the company ID of this ncra verify weighing date
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncra verify weighing date.
	 *
	 * @return the create date of this ncra verify weighing date
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncra verify weighing date.
	 *
	 * @return the group ID of this ncra verify weighing date
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncra verify weighing date.
	 *
	 * @return the modified date of this ncra verify weighing date
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncra application ID of this ncra verify weighing date.
	 *
	 * @return the ncra application ID of this ncra verify weighing date
	 */
	@Override
	public long getNcraApplicationId() {
		return model.getNcraApplicationId();
	}

	/**
	 * Returns the ncra verify weighing date ID of this ncra verify weighing date.
	 *
	 * @return the ncra verify weighing date ID of this ncra verify weighing date
	 */
	@Override
	public long getNcraVerifyWeighingDateId() {
		return model.getNcraVerifyWeighingDateId();
	}

	/**
	 * Returns the primary key of this ncra verify weighing date.
	 *
	 * @return the primary key of this ncra verify weighing date
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncra verify weighing date.
	 *
	 * @return the user ID of this ncra verify weighing date
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncra verify weighing date.
	 *
	 * @return the user name of this ncra verify weighing date
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncra verify weighing date.
	 *
	 * @return the user uuid of this ncra verify weighing date
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the weighing date of this ncra verify weighing date.
	 *
	 * @return the weighing date of this ncra verify weighing date
	 */
	@Override
	public Date getWeighingDate() {
		return model.getWeighingDate();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this ncra verify weighing date.
	 *
	 * @param companyId the company ID of this ncra verify weighing date
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncra verify weighing date.
	 *
	 * @param createDate the create date of this ncra verify weighing date
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncra verify weighing date.
	 *
	 * @param groupId the group ID of this ncra verify weighing date
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncra verify weighing date.
	 *
	 * @param modifiedDate the modified date of this ncra verify weighing date
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncra application ID of this ncra verify weighing date.
	 *
	 * @param ncraApplicationId the ncra application ID of this ncra verify weighing date
	 */
	@Override
	public void setNcraApplicationId(long ncraApplicationId) {
		model.setNcraApplicationId(ncraApplicationId);
	}

	/**
	 * Sets the ncra verify weighing date ID of this ncra verify weighing date.
	 *
	 * @param ncraVerifyWeighingDateId the ncra verify weighing date ID of this ncra verify weighing date
	 */
	@Override
	public void setNcraVerifyWeighingDateId(long ncraVerifyWeighingDateId) {
		model.setNcraVerifyWeighingDateId(ncraVerifyWeighingDateId);
	}

	/**
	 * Sets the primary key of this ncra verify weighing date.
	 *
	 * @param primaryKey the primary key of this ncra verify weighing date
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncra verify weighing date.
	 *
	 * @param userId the user ID of this ncra verify weighing date
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncra verify weighing date.
	 *
	 * @param userName the user name of this ncra verify weighing date
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncra verify weighing date.
	 *
	 * @param userUuid the user uuid of this ncra verify weighing date
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the weighing date of this ncra verify weighing date.
	 *
	 * @param weighingDate the weighing date of this ncra verify weighing date
	 */
	@Override
	public void setWeighingDate(Date weighingDate) {
		model.setWeighingDate(weighingDate);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected NcraVerifyWeighingDateWrapper wrap(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		return new NcraVerifyWeighingDateWrapper(ncraVerifyWeighingDate);
	}

}