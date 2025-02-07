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
 * This class is a wrapper for {@link MedicalFacilitiesNurseStaff}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseStaff
 * @generated
 */
public class MedicalFacilitiesNurseStaffWrapper
	extends BaseModelWrapper<MedicalFacilitiesNurseStaff>
	implements MedicalFacilitiesNurseStaff,
			   ModelWrapper<MedicalFacilitiesNurseStaff> {

	public MedicalFacilitiesNurseStaffWrapper(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		super(medicalFacilitiesNurseStaff);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesNurseStaffId",
			getMedicalFacilitiesNurseStaffId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nStaffName", getNStaffName());
		attributes.put("nStaffQualification", getNStaffQualification());
		attributes.put("nStaffState", getNStaffState());
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

		Long medicalFacilitiesNurseStaffId = (Long)attributes.get(
			"medicalFacilitiesNurseStaffId");

		if (medicalFacilitiesNurseStaffId != null) {
			setMedicalFacilitiesNurseStaffId(medicalFacilitiesNurseStaffId);
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

		String nStaffName = (String)attributes.get("nStaffName");

		if (nStaffName != null) {
			setNStaffName(nStaffName);
		}

		String nStaffQualification = (String)attributes.get(
			"nStaffQualification");

		if (nStaffQualification != null) {
			setNStaffQualification(nStaffQualification);
		}

		String nStaffState = (String)attributes.get("nStaffState");

		if (nStaffState != null) {
			setNStaffState(nStaffState);
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
	public MedicalFacilitiesNurseStaff cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical facilities nurse staff.
	 *
	 * @return the company ID of this medical facilities nurse staff
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical facilities nurse staff.
	 *
	 * @return the counter of this medical facilities nurse staff
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical facilities nurse staff.
	 *
	 * @return the create date of this medical facilities nurse staff
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical facilities nurse staff.
	 *
	 * @return the group ID of this medical facilities nurse staff
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities nurse staff.
	 *
	 * @return the medical facilities app ID of this medical facilities nurse staff
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities nurse staff ID of this medical facilities nurse staff.
	 *
	 * @return the medical facilities nurse staff ID of this medical facilities nurse staff
	 */
	@Override
	public long getMedicalFacilitiesNurseStaffId() {
		return model.getMedicalFacilitiesNurseStaffId();
	}

	/**
	 * Returns the modified date of this medical facilities nurse staff.
	 *
	 * @return the modified date of this medical facilities nurse staff
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the n staff name of this medical facilities nurse staff.
	 *
	 * @return the n staff name of this medical facilities nurse staff
	 */
	@Override
	public String getNStaffName() {
		return model.getNStaffName();
	}

	/**
	 * Returns the n staff qualification of this medical facilities nurse staff.
	 *
	 * @return the n staff qualification of this medical facilities nurse staff
	 */
	@Override
	public String getNStaffQualification() {
		return model.getNStaffQualification();
	}

	/**
	 * Returns the n staff state of this medical facilities nurse staff.
	 *
	 * @return the n staff state of this medical facilities nurse staff
	 */
	@Override
	public String getNStaffState() {
		return model.getNStaffState();
	}

	/**
	 * Returns the primary key of this medical facilities nurse staff.
	 *
	 * @return the primary key of this medical facilities nurse staff
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical facilities nurse staff.
	 *
	 * @return the user ID of this medical facilities nurse staff
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities nurse staff.
	 *
	 * @return the user name of this medical facilities nurse staff
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities nurse staff.
	 *
	 * @return the user uuid of this medical facilities nurse staff
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities nurse staff.
	 *
	 * @return the uuid of this medical facilities nurse staff
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
	 * Sets the company ID of this medical facilities nurse staff.
	 *
	 * @param companyId the company ID of this medical facilities nurse staff
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical facilities nurse staff.
	 *
	 * @param counter the counter of this medical facilities nurse staff
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical facilities nurse staff.
	 *
	 * @param createDate the create date of this medical facilities nurse staff
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical facilities nurse staff.
	 *
	 * @param groupId the group ID of this medical facilities nurse staff
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities nurse staff.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities nurse staff
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities nurse staff ID of this medical facilities nurse staff.
	 *
	 * @param medicalFacilitiesNurseStaffId the medical facilities nurse staff ID of this medical facilities nurse staff
	 */
	@Override
	public void setMedicalFacilitiesNurseStaffId(
		long medicalFacilitiesNurseStaffId) {

		model.setMedicalFacilitiesNurseStaffId(medicalFacilitiesNurseStaffId);
	}

	/**
	 * Sets the modified date of this medical facilities nurse staff.
	 *
	 * @param modifiedDate the modified date of this medical facilities nurse staff
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the n staff name of this medical facilities nurse staff.
	 *
	 * @param nStaffName the n staff name of this medical facilities nurse staff
	 */
	@Override
	public void setNStaffName(String nStaffName) {
		model.setNStaffName(nStaffName);
	}

	/**
	 * Sets the n staff qualification of this medical facilities nurse staff.
	 *
	 * @param nStaffQualification the n staff qualification of this medical facilities nurse staff
	 */
	@Override
	public void setNStaffQualification(String nStaffQualification) {
		model.setNStaffQualification(nStaffQualification);
	}

	/**
	 * Sets the n staff state of this medical facilities nurse staff.
	 *
	 * @param nStaffState the n staff state of this medical facilities nurse staff
	 */
	@Override
	public void setNStaffState(String nStaffState) {
		model.setNStaffState(nStaffState);
	}

	/**
	 * Sets the primary key of this medical facilities nurse staff.
	 *
	 * @param primaryKey the primary key of this medical facilities nurse staff
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical facilities nurse staff.
	 *
	 * @param userId the user ID of this medical facilities nurse staff
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities nurse staff.
	 *
	 * @param userName the user name of this medical facilities nurse staff
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities nurse staff.
	 *
	 * @param userUuid the user uuid of this medical facilities nurse staff
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities nurse staff.
	 *
	 * @param uuid the uuid of this medical facilities nurse staff
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
	protected MedicalFacilitiesNurseStaffWrapper wrap(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return new MedicalFacilitiesNurseStaffWrapper(
			medicalFacilitiesNurseStaff);
	}

}