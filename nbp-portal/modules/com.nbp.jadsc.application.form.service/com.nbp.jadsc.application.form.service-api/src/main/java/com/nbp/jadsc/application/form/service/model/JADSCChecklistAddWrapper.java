/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JADSCChecklistAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAdd
 * @generated
 */
public class JADSCChecklistAddWrapper
	extends BaseModelWrapper<JADSCChecklistAdd>
	implements JADSCChecklistAdd, ModelWrapper<JADSCChecklistAdd> {

	public JADSCChecklistAddWrapper(JADSCChecklistAdd jadscChecklistAdd) {
		super(jadscChecklistAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jADSCChecklistAddId", getJADSCChecklistAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("AddItem", getAddItem());
		attributes.put("counter", getCounter());
		attributes.put("jadscApplicationId", getJadscApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jADSCChecklistAddId = (Long)attributes.get("jADSCChecklistAddId");

		if (jADSCChecklistAddId != null) {
			setJADSCChecklistAddId(jADSCChecklistAddId);
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

		String AddItem = (String)attributes.get("AddItem");

		if (AddItem != null) {
			setAddItem(AddItem);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCChecklistAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add item of this jadsc checklist add.
	 *
	 * @return the add item of this jadsc checklist add
	 */
	@Override
	public String getAddItem() {
		return model.getAddItem();
	}

	/**
	 * Returns the company ID of this jadsc checklist add.
	 *
	 * @return the company ID of this jadsc checklist add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this jadsc checklist add.
	 *
	 * @return the counter of this jadsc checklist add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this jadsc checklist add.
	 *
	 * @return the create date of this jadsc checklist add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jadsc checklist add.
	 *
	 * @return the group ID of this jadsc checklist add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jadsc application ID of this jadsc checklist add.
	 *
	 * @return the jadsc application ID of this jadsc checklist add
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the j adsc checklist add ID of this jadsc checklist add.
	 *
	 * @return the j adsc checklist add ID of this jadsc checklist add
	 */
	@Override
	public long getJADSCChecklistAddId() {
		return model.getJADSCChecklistAddId();
	}

	/**
	 * Returns the modified date of this jadsc checklist add.
	 *
	 * @return the modified date of this jadsc checklist add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jadsc checklist add.
	 *
	 * @return the primary key of this jadsc checklist add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jadsc checklist add.
	 *
	 * @return the user ID of this jadsc checklist add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc checklist add.
	 *
	 * @return the user name of this jadsc checklist add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc checklist add.
	 *
	 * @return the user uuid of this jadsc checklist add
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc checklist add.
	 *
	 * @return the uuid of this jadsc checklist add
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
	 * Sets the add item of this jadsc checklist add.
	 *
	 * @param AddItem the add item of this jadsc checklist add
	 */
	@Override
	public void setAddItem(String AddItem) {
		model.setAddItem(AddItem);
	}

	/**
	 * Sets the company ID of this jadsc checklist add.
	 *
	 * @param companyId the company ID of this jadsc checklist add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this jadsc checklist add.
	 *
	 * @param counter the counter of this jadsc checklist add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this jadsc checklist add.
	 *
	 * @param createDate the create date of this jadsc checklist add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jadsc checklist add.
	 *
	 * @param groupId the group ID of this jadsc checklist add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jadsc application ID of this jadsc checklist add.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc checklist add
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the j adsc checklist add ID of this jadsc checklist add.
	 *
	 * @param jADSCChecklistAddId the j adsc checklist add ID of this jadsc checklist add
	 */
	@Override
	public void setJADSCChecklistAddId(long jADSCChecklistAddId) {
		model.setJADSCChecklistAddId(jADSCChecklistAddId);
	}

	/**
	 * Sets the modified date of this jadsc checklist add.
	 *
	 * @param modifiedDate the modified date of this jadsc checklist add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jadsc checklist add.
	 *
	 * @param primaryKey the primary key of this jadsc checklist add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jadsc checklist add.
	 *
	 * @param userId the user ID of this jadsc checklist add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc checklist add.
	 *
	 * @param userName the user name of this jadsc checklist add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc checklist add.
	 *
	 * @param userUuid the user uuid of this jadsc checklist add
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc checklist add.
	 *
	 * @param uuid the uuid of this jadsc checklist add
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
	protected JADSCChecklistAddWrapper wrap(
		JADSCChecklistAdd jadscChecklistAdd) {

		return new JADSCChecklistAddWrapper(jadscChecklistAdd);
	}

}