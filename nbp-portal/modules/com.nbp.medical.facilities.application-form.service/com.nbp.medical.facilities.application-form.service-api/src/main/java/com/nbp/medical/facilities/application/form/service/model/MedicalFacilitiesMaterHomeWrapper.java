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
 * This class is a wrapper for {@link MedicalFacilitiesMaterHome}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesMaterHome
 * @generated
 */
public class MedicalFacilitiesMaterHomeWrapper
	extends BaseModelWrapper<MedicalFacilitiesMaterHome>
	implements MedicalFacilitiesMaterHome,
			   ModelWrapper<MedicalFacilitiesMaterHome> {

	public MedicalFacilitiesMaterHomeWrapper(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		super(medicalFacilitiesMaterHome);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesMaterHomeId", getMedicalFacilitiesMaterHomeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nurseName", getNurseName());
		attributes.put("nurseQualification", getNurseQualification());
		attributes.put("otherPerson", getOtherPerson());
		attributes.put("counter", getCounter());
		attributes.put("medicalFacilitiesAppId", getMedicalFacilitiesAppId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long medicalFacilitiesMaterHomeId = (Long)attributes.get(
			"medicalFacilitiesMaterHomeId");

		if (medicalFacilitiesMaterHomeId != null) {
			setMedicalFacilitiesMaterHomeId(medicalFacilitiesMaterHomeId);
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

		String nurseName = (String)attributes.get("nurseName");

		if (nurseName != null) {
			setNurseName(nurseName);
		}

		String nurseQualification = (String)attributes.get(
			"nurseQualification");

		if (nurseQualification != null) {
			setNurseQualification(nurseQualification);
		}

		String otherPerson = (String)attributes.get("otherPerson");

		if (otherPerson != null) {
			setOtherPerson(otherPerson);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long medicalFacilitiesAppId = (Long)attributes.get(
			"medicalFacilitiesAppId");

		if (medicalFacilitiesAppId != null) {
			setMedicalFacilitiesAppId(medicalFacilitiesAppId);
		}
	}

	@Override
	public MedicalFacilitiesMaterHome cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical facilities mater home.
	 *
	 * @return the company ID of this medical facilities mater home
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical facilities mater home.
	 *
	 * @return the counter of this medical facilities mater home
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical facilities mater home.
	 *
	 * @return the create date of this medical facilities mater home
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical facilities mater home.
	 *
	 * @return the group ID of this medical facilities mater home
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities mater home.
	 *
	 * @return the medical facilities app ID of this medical facilities mater home
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities mater home ID of this medical facilities mater home.
	 *
	 * @return the medical facilities mater home ID of this medical facilities mater home
	 */
	@Override
	public long getMedicalFacilitiesMaterHomeId() {
		return model.getMedicalFacilitiesMaterHomeId();
	}

	/**
	 * Returns the modified date of this medical facilities mater home.
	 *
	 * @return the modified date of this medical facilities mater home
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nurse name of this medical facilities mater home.
	 *
	 * @return the nurse name of this medical facilities mater home
	 */
	@Override
	public String getNurseName() {
		return model.getNurseName();
	}

	/**
	 * Returns the nurse qualification of this medical facilities mater home.
	 *
	 * @return the nurse qualification of this medical facilities mater home
	 */
	@Override
	public String getNurseQualification() {
		return model.getNurseQualification();
	}

	/**
	 * Returns the other person of this medical facilities mater home.
	 *
	 * @return the other person of this medical facilities mater home
	 */
	@Override
	public String getOtherPerson() {
		return model.getOtherPerson();
	}

	/**
	 * Returns the primary key of this medical facilities mater home.
	 *
	 * @return the primary key of this medical facilities mater home
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical facilities mater home.
	 *
	 * @return the user ID of this medical facilities mater home
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities mater home.
	 *
	 * @return the user name of this medical facilities mater home
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities mater home.
	 *
	 * @return the user uuid of this medical facilities mater home
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities mater home.
	 *
	 * @return the uuid of this medical facilities mater home
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
	 * Sets the company ID of this medical facilities mater home.
	 *
	 * @param companyId the company ID of this medical facilities mater home
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical facilities mater home.
	 *
	 * @param counter the counter of this medical facilities mater home
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical facilities mater home.
	 *
	 * @param createDate the create date of this medical facilities mater home
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical facilities mater home.
	 *
	 * @param groupId the group ID of this medical facilities mater home
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities mater home.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities mater home
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities mater home ID of this medical facilities mater home.
	 *
	 * @param medicalFacilitiesMaterHomeId the medical facilities mater home ID of this medical facilities mater home
	 */
	@Override
	public void setMedicalFacilitiesMaterHomeId(
		long medicalFacilitiesMaterHomeId) {

		model.setMedicalFacilitiesMaterHomeId(medicalFacilitiesMaterHomeId);
	}

	/**
	 * Sets the modified date of this medical facilities mater home.
	 *
	 * @param modifiedDate the modified date of this medical facilities mater home
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nurse name of this medical facilities mater home.
	 *
	 * @param nurseName the nurse name of this medical facilities mater home
	 */
	@Override
	public void setNurseName(String nurseName) {
		model.setNurseName(nurseName);
	}

	/**
	 * Sets the nurse qualification of this medical facilities mater home.
	 *
	 * @param nurseQualification the nurse qualification of this medical facilities mater home
	 */
	@Override
	public void setNurseQualification(String nurseQualification) {
		model.setNurseQualification(nurseQualification);
	}

	/**
	 * Sets the other person of this medical facilities mater home.
	 *
	 * @param otherPerson the other person of this medical facilities mater home
	 */
	@Override
	public void setOtherPerson(String otherPerson) {
		model.setOtherPerson(otherPerson);
	}

	/**
	 * Sets the primary key of this medical facilities mater home.
	 *
	 * @param primaryKey the primary key of this medical facilities mater home
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical facilities mater home.
	 *
	 * @param userId the user ID of this medical facilities mater home
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities mater home.
	 *
	 * @param userName the user name of this medical facilities mater home
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities mater home.
	 *
	 * @param userUuid the user uuid of this medical facilities mater home
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities mater home.
	 *
	 * @param uuid the uuid of this medical facilities mater home
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
	protected MedicalFacilitiesMaterHomeWrapper wrap(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		return new MedicalFacilitiesMaterHomeWrapper(
			medicalFacilitiesMaterHome);
	}

}