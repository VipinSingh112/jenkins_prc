/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AccCerBodyInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyInfo
 * @generated
 */
public class AccCerBodyInfoWrapper
	extends BaseModelWrapper<AccCerBodyInfo>
	implements AccCerBodyInfo, ModelWrapper<AccCerBodyInfo> {

	public AccCerBodyInfoWrapper(AccCerBodyInfo accCerBodyInfo) {
		super(accCerBodyInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("accCerBodyInfoId", getAccCerBodyInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("describeMechanism", getDescribeMechanism());
		attributes.put("janaacApplicationId", getJanaacApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long accCerBodyInfoId = (Long)attributes.get("accCerBodyInfoId");

		if (accCerBodyInfoId != null) {
			setAccCerBodyInfoId(accCerBodyInfoId);
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

		String describeMechanism = (String)attributes.get("describeMechanism");

		if (describeMechanism != null) {
			setDescribeMechanism(describeMechanism);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}
	}

	@Override
	public AccCerBodyInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acc cer body info ID of this acc cer body info.
	 *
	 * @return the acc cer body info ID of this acc cer body info
	 */
	@Override
	public long getAccCerBodyInfoId() {
		return model.getAccCerBodyInfoId();
	}

	/**
	 * Returns the company ID of this acc cer body info.
	 *
	 * @return the company ID of this acc cer body info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acc cer body info.
	 *
	 * @return the create date of this acc cer body info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the describe mechanism of this acc cer body info.
	 *
	 * @return the describe mechanism of this acc cer body info
	 */
	@Override
	public String getDescribeMechanism() {
		return model.getDescribeMechanism();
	}

	/**
	 * Returns the group ID of this acc cer body info.
	 *
	 * @return the group ID of this acc cer body info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this acc cer body info.
	 *
	 * @return the janaac application ID of this acc cer body info
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this acc cer body info.
	 *
	 * @return the modified date of this acc cer body info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acc cer body info.
	 *
	 * @return the primary key of this acc cer body info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acc cer body info.
	 *
	 * @return the user ID of this acc cer body info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acc cer body info.
	 *
	 * @return the user name of this acc cer body info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acc cer body info.
	 *
	 * @return the user uuid of this acc cer body info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this acc cer body info.
	 *
	 * @return the uuid of this acc cer body info
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the acc cer body info ID of this acc cer body info.
	 *
	 * @param accCerBodyInfoId the acc cer body info ID of this acc cer body info
	 */
	@Override
	public void setAccCerBodyInfoId(long accCerBodyInfoId) {
		model.setAccCerBodyInfoId(accCerBodyInfoId);
	}

	/**
	 * Sets the company ID of this acc cer body info.
	 *
	 * @param companyId the company ID of this acc cer body info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acc cer body info.
	 *
	 * @param createDate the create date of this acc cer body info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the describe mechanism of this acc cer body info.
	 *
	 * @param describeMechanism the describe mechanism of this acc cer body info
	 */
	@Override
	public void setDescribeMechanism(String describeMechanism) {
		model.setDescribeMechanism(describeMechanism);
	}

	/**
	 * Sets the group ID of this acc cer body info.
	 *
	 * @param groupId the group ID of this acc cer body info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this acc cer body info.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc cer body info
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this acc cer body info.
	 *
	 * @param modifiedDate the modified date of this acc cer body info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acc cer body info.
	 *
	 * @param primaryKey the primary key of this acc cer body info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acc cer body info.
	 *
	 * @param userId the user ID of this acc cer body info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acc cer body info.
	 *
	 * @param userName the user name of this acc cer body info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acc cer body info.
	 *
	 * @param userUuid the user uuid of this acc cer body info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this acc cer body info.
	 *
	 * @param uuid the uuid of this acc cer body info
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AccCerBodyInfoWrapper wrap(AccCerBodyInfo accCerBodyInfo) {
		return new AccCerBodyInfoWrapper(accCerBodyInfo);
	}

}