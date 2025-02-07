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
 * This class is a wrapper for {@link JADSCChecklist}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklist
 * @generated
 */
public class JADSCChecklistWrapper
	extends BaseModelWrapper<JADSCChecklist>
	implements JADSCChecklist, ModelWrapper<JADSCChecklist> {

	public JADSCChecklistWrapper(JADSCChecklist jadscChecklist) {
		super(jadscChecklist);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jadscChecklistId", getJadscChecklistId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("informationRegComplaint", getInformationRegComplaint());
		attributes.put("selectedChecklistValues", getSelectedChecklistValues());
		attributes.put("description", getDescription());
		attributes.put("jadscApplicationId", getJadscApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jadscChecklistId = (Long)attributes.get("jadscChecklistId");

		if (jadscChecklistId != null) {
			setJadscChecklistId(jadscChecklistId);
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

		String informationRegComplaint = (String)attributes.get(
			"informationRegComplaint");

		if (informationRegComplaint != null) {
			setInformationRegComplaint(informationRegComplaint);
		}

		String selectedChecklistValues = (String)attributes.get(
			"selectedChecklistValues");

		if (selectedChecklistValues != null) {
			setSelectedChecklistValues(selectedChecklistValues);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCChecklist cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jadsc checklist.
	 *
	 * @return the company ID of this jadsc checklist
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc checklist.
	 *
	 * @return the create date of this jadsc checklist
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this jadsc checklist.
	 *
	 * @return the description of this jadsc checklist
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this jadsc checklist.
	 *
	 * @return the group ID of this jadsc checklist
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the information reg complaint of this jadsc checklist.
	 *
	 * @return the information reg complaint of this jadsc checklist
	 */
	@Override
	public String getInformationRegComplaint() {
		return model.getInformationRegComplaint();
	}

	/**
	 * Returns the jadsc application ID of this jadsc checklist.
	 *
	 * @return the jadsc application ID of this jadsc checklist
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the jadsc checklist ID of this jadsc checklist.
	 *
	 * @return the jadsc checklist ID of this jadsc checklist
	 */
	@Override
	public long getJadscChecklistId() {
		return model.getJadscChecklistId();
	}

	/**
	 * Returns the modified date of this jadsc checklist.
	 *
	 * @return the modified date of this jadsc checklist
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jadsc checklist.
	 *
	 * @return the primary key of this jadsc checklist
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the selected checklist values of this jadsc checklist.
	 *
	 * @return the selected checklist values of this jadsc checklist
	 */
	@Override
	public String getSelectedChecklistValues() {
		return model.getSelectedChecklistValues();
	}

	/**
	 * Returns the user ID of this jadsc checklist.
	 *
	 * @return the user ID of this jadsc checklist
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc checklist.
	 *
	 * @return the user name of this jadsc checklist
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc checklist.
	 *
	 * @return the user uuid of this jadsc checklist
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc checklist.
	 *
	 * @return the uuid of this jadsc checklist
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
	 * Sets the company ID of this jadsc checklist.
	 *
	 * @param companyId the company ID of this jadsc checklist
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc checklist.
	 *
	 * @param createDate the create date of this jadsc checklist
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this jadsc checklist.
	 *
	 * @param description the description of this jadsc checklist
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this jadsc checklist.
	 *
	 * @param groupId the group ID of this jadsc checklist
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the information reg complaint of this jadsc checklist.
	 *
	 * @param informationRegComplaint the information reg complaint of this jadsc checklist
	 */
	@Override
	public void setInformationRegComplaint(String informationRegComplaint) {
		model.setInformationRegComplaint(informationRegComplaint);
	}

	/**
	 * Sets the jadsc application ID of this jadsc checklist.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc checklist
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the jadsc checklist ID of this jadsc checklist.
	 *
	 * @param jadscChecklistId the jadsc checklist ID of this jadsc checklist
	 */
	@Override
	public void setJadscChecklistId(long jadscChecklistId) {
		model.setJadscChecklistId(jadscChecklistId);
	}

	/**
	 * Sets the modified date of this jadsc checklist.
	 *
	 * @param modifiedDate the modified date of this jadsc checklist
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jadsc checklist.
	 *
	 * @param primaryKey the primary key of this jadsc checklist
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the selected checklist values of this jadsc checklist.
	 *
	 * @param selectedChecklistValues the selected checklist values of this jadsc checklist
	 */
	@Override
	public void setSelectedChecklistValues(String selectedChecklistValues) {
		model.setSelectedChecklistValues(selectedChecklistValues);
	}

	/**
	 * Sets the user ID of this jadsc checklist.
	 *
	 * @param userId the user ID of this jadsc checklist
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc checklist.
	 *
	 * @param userName the user name of this jadsc checklist
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc checklist.
	 *
	 * @param userUuid the user uuid of this jadsc checklist
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc checklist.
	 *
	 * @param uuid the uuid of this jadsc checklist
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
	protected JADSCChecklistWrapper wrap(JADSCChecklist jadscChecklist) {
		return new JADSCChecklistWrapper(jadscChecklist);
	}

}