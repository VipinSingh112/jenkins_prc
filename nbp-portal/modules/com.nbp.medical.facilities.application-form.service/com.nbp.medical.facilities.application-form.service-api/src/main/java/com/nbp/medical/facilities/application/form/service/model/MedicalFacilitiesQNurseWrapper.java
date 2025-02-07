/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MedicalFacilitiesQNurse}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesQNurse
 * @generated
 */
public class MedicalFacilitiesQNurseWrapper
	extends BaseModelWrapper<MedicalFacilitiesQNurse>
	implements MedicalFacilitiesQNurse, ModelWrapper<MedicalFacilitiesQNurse> {

	public MedicalFacilitiesQNurseWrapper(
		MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

		super(medicalFacilitiesQNurse);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesQNurseId", getMedicalFacilitiesQNurseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("checkQualifiedNurse", getCheckQualifiedNurse());
		attributes.put("name", getName());
		attributes.put("qualification", getQualification());
		attributes.put("nursingStaffCategory", getNursingStaffCategory());
		attributes.put("qNurseName", getQNurseName());
		attributes.put("qNurseQualification", getQNurseQualification());
		attributes.put("ratioOfQNurses", getRatioOfQNurses());
		attributes.put("medicalFacilitiesAppId", getMedicalFacilitiesAppId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long medicalFacilitiesQNurseId = (Long)attributes.get(
			"medicalFacilitiesQNurseId");

		if (medicalFacilitiesQNurseId != null) {
			setMedicalFacilitiesQNurseId(medicalFacilitiesQNurseId);
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

		String checkQualifiedNurse = (String)attributes.get(
			"checkQualifiedNurse");

		if (checkQualifiedNurse != null) {
			setCheckQualifiedNurse(checkQualifiedNurse);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String qualification = (String)attributes.get("qualification");

		if (qualification != null) {
			setQualification(qualification);
		}

		String nursingStaffCategory = (String)attributes.get(
			"nursingStaffCategory");

		if (nursingStaffCategory != null) {
			setNursingStaffCategory(nursingStaffCategory);
		}

		String qNurseName = (String)attributes.get("qNurseName");

		if (qNurseName != null) {
			setQNurseName(qNurseName);
		}

		String qNurseQualification = (String)attributes.get(
			"qNurseQualification");

		if (qNurseQualification != null) {
			setQNurseQualification(qNurseQualification);
		}

		String ratioOfQNurses = (String)attributes.get("ratioOfQNurses");

		if (ratioOfQNurses != null) {
			setRatioOfQNurses(ratioOfQNurses);
		}

		Long medicalFacilitiesAppId = (Long)attributes.get(
			"medicalFacilitiesAppId");

		if (medicalFacilitiesAppId != null) {
			setMedicalFacilitiesAppId(medicalFacilitiesAppId);
		}
	}

	@Override
	public MedicalFacilitiesQNurse cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the check qualified nurse of this medical facilities q nurse.
	 *
	 * @return the check qualified nurse of this medical facilities q nurse
	 */
	@Override
	public String getCheckQualifiedNurse() {
		return model.getCheckQualifiedNurse();
	}

	/**
	 * Returns the company ID of this medical facilities q nurse.
	 *
	 * @return the company ID of this medical facilities q nurse
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this medical facilities q nurse.
	 *
	 * @return the create date of this medical facilities q nurse
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical facilities q nurse.
	 *
	 * @return the group ID of this medical facilities q nurse
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities q nurse.
	 *
	 * @return the medical facilities app ID of this medical facilities q nurse
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities q nurse ID of this medical facilities q nurse.
	 *
	 * @return the medical facilities q nurse ID of this medical facilities q nurse
	 */
	@Override
	public long getMedicalFacilitiesQNurseId() {
		return model.getMedicalFacilitiesQNurseId();
	}

	/**
	 * Returns the modified date of this medical facilities q nurse.
	 *
	 * @return the modified date of this medical facilities q nurse
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this medical facilities q nurse.
	 *
	 * @return the name of this medical facilities q nurse
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the nursing staff category of this medical facilities q nurse.
	 *
	 * @return the nursing staff category of this medical facilities q nurse
	 */
	@Override
	public String getNursingStaffCategory() {
		return model.getNursingStaffCategory();
	}

	/**
	 * Returns the primary key of this medical facilities q nurse.
	 *
	 * @return the primary key of this medical facilities q nurse
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the q nurse name of this medical facilities q nurse.
	 *
	 * @return the q nurse name of this medical facilities q nurse
	 */
	@Override
	public String getQNurseName() {
		return model.getQNurseName();
	}

	/**
	 * Returns the q nurse qualification of this medical facilities q nurse.
	 *
	 * @return the q nurse qualification of this medical facilities q nurse
	 */
	@Override
	public String getQNurseQualification() {
		return model.getQNurseQualification();
	}

	/**
	 * Returns the qualification of this medical facilities q nurse.
	 *
	 * @return the qualification of this medical facilities q nurse
	 */
	@Override
	public String getQualification() {
		return model.getQualification();
	}

	/**
	 * Returns the ratio of q nurses of this medical facilities q nurse.
	 *
	 * @return the ratio of q nurses of this medical facilities q nurse
	 */
	@Override
	public String getRatioOfQNurses() {
		return model.getRatioOfQNurses();
	}

	/**
	 * Returns the user ID of this medical facilities q nurse.
	 *
	 * @return the user ID of this medical facilities q nurse
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities q nurse.
	 *
	 * @return the user name of this medical facilities q nurse
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities q nurse.
	 *
	 * @return the user uuid of this medical facilities q nurse
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities q nurse.
	 *
	 * @return the uuid of this medical facilities q nurse
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
	 * Sets the check qualified nurse of this medical facilities q nurse.
	 *
	 * @param checkQualifiedNurse the check qualified nurse of this medical facilities q nurse
	 */
	@Override
	public void setCheckQualifiedNurse(String checkQualifiedNurse) {
		model.setCheckQualifiedNurse(checkQualifiedNurse);
	}

	/**
	 * Sets the company ID of this medical facilities q nurse.
	 *
	 * @param companyId the company ID of this medical facilities q nurse
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this medical facilities q nurse.
	 *
	 * @param createDate the create date of this medical facilities q nurse
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical facilities q nurse.
	 *
	 * @param groupId the group ID of this medical facilities q nurse
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities q nurse.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities q nurse
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities q nurse ID of this medical facilities q nurse.
	 *
	 * @param medicalFacilitiesQNurseId the medical facilities q nurse ID of this medical facilities q nurse
	 */
	@Override
	public void setMedicalFacilitiesQNurseId(long medicalFacilitiesQNurseId) {
		model.setMedicalFacilitiesQNurseId(medicalFacilitiesQNurseId);
	}

	/**
	 * Sets the modified date of this medical facilities q nurse.
	 *
	 * @param modifiedDate the modified date of this medical facilities q nurse
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this medical facilities q nurse.
	 *
	 * @param name the name of this medical facilities q nurse
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the nursing staff category of this medical facilities q nurse.
	 *
	 * @param nursingStaffCategory the nursing staff category of this medical facilities q nurse
	 */
	@Override
	public void setNursingStaffCategory(String nursingStaffCategory) {
		model.setNursingStaffCategory(nursingStaffCategory);
	}

	/**
	 * Sets the primary key of this medical facilities q nurse.
	 *
	 * @param primaryKey the primary key of this medical facilities q nurse
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the q nurse name of this medical facilities q nurse.
	 *
	 * @param qNurseName the q nurse name of this medical facilities q nurse
	 */
	@Override
	public void setQNurseName(String qNurseName) {
		model.setQNurseName(qNurseName);
	}

	/**
	 * Sets the q nurse qualification of this medical facilities q nurse.
	 *
	 * @param qNurseQualification the q nurse qualification of this medical facilities q nurse
	 */
	@Override
	public void setQNurseQualification(String qNurseQualification) {
		model.setQNurseQualification(qNurseQualification);
	}

	/**
	 * Sets the qualification of this medical facilities q nurse.
	 *
	 * @param qualification the qualification of this medical facilities q nurse
	 */
	@Override
	public void setQualification(String qualification) {
		model.setQualification(qualification);
	}

	/**
	 * Sets the ratio of q nurses of this medical facilities q nurse.
	 *
	 * @param ratioOfQNurses the ratio of q nurses of this medical facilities q nurse
	 */
	@Override
	public void setRatioOfQNurses(String ratioOfQNurses) {
		model.setRatioOfQNurses(ratioOfQNurses);
	}

	/**
	 * Sets the user ID of this medical facilities q nurse.
	 *
	 * @param userId the user ID of this medical facilities q nurse
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities q nurse.
	 *
	 * @param userName the user name of this medical facilities q nurse
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities q nurse.
	 *
	 * @param userUuid the user uuid of this medical facilities q nurse
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities q nurse.
	 *
	 * @param uuid the uuid of this medical facilities q nurse
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
	protected MedicalFacilitiesQNurseWrapper wrap(
		MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

		return new MedicalFacilitiesQNurseWrapper(medicalFacilitiesQNurse);
	}

}