/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MedicalNurseStaffPremises}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremises
 * @generated
 */
public class MedicalNurseStaffPremisesWrapper
	extends BaseModelWrapper<MedicalNurseStaffPremises>
	implements MedicalNurseStaffPremises,
			   ModelWrapper<MedicalNurseStaffPremises> {

	public MedicalNurseStaffPremisesWrapper(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		super(medicalNurseStaffPremises);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"medicalNurseStaffPremisesId", getMedicalNurseStaffPremisesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nursingStaffCategory", getNursingStaffCategory());
		attributes.put("medicalFacilitiesAppId", getMedicalFacilitiesAppId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long medicalNurseStaffPremisesId = (Long)attributes.get(
			"medicalNurseStaffPremisesId");

		if (medicalNurseStaffPremisesId != null) {
			setMedicalNurseStaffPremisesId(medicalNurseStaffPremisesId);
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

		String nursingStaffCategory = (String)attributes.get(
			"nursingStaffCategory");

		if (nursingStaffCategory != null) {
			setNursingStaffCategory(nursingStaffCategory);
		}

		Long medicalFacilitiesAppId = (Long)attributes.get(
			"medicalFacilitiesAppId");

		if (medicalFacilitiesAppId != null) {
			setMedicalFacilitiesAppId(medicalFacilitiesAppId);
		}
	}

	@Override
	public MedicalNurseStaffPremises cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical nurse staff premises.
	 *
	 * @return the company ID of this medical nurse staff premises
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this medical nurse staff premises.
	 *
	 * @return the create date of this medical nurse staff premises
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical nurse staff premises.
	 *
	 * @return the group ID of this medical nurse staff premises
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical nurse staff premises.
	 *
	 * @return the medical facilities app ID of this medical nurse staff premises
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical nurse staff premises ID of this medical nurse staff premises.
	 *
	 * @return the medical nurse staff premises ID of this medical nurse staff premises
	 */
	@Override
	public long getMedicalNurseStaffPremisesId() {
		return model.getMedicalNurseStaffPremisesId();
	}

	/**
	 * Returns the modified date of this medical nurse staff premises.
	 *
	 * @return the modified date of this medical nurse staff premises
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nursing staff category of this medical nurse staff premises.
	 *
	 * @return the nursing staff category of this medical nurse staff premises
	 */
	@Override
	public String getNursingStaffCategory() {
		return model.getNursingStaffCategory();
	}

	/**
	 * Returns the primary key of this medical nurse staff premises.
	 *
	 * @return the primary key of this medical nurse staff premises
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical nurse staff premises.
	 *
	 * @return the user ID of this medical nurse staff premises
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical nurse staff premises.
	 *
	 * @return the user name of this medical nurse staff premises
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical nurse staff premises.
	 *
	 * @return the user uuid of this medical nurse staff premises
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
	 * Sets the company ID of this medical nurse staff premises.
	 *
	 * @param companyId the company ID of this medical nurse staff premises
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this medical nurse staff premises.
	 *
	 * @param createDate the create date of this medical nurse staff premises
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical nurse staff premises.
	 *
	 * @param groupId the group ID of this medical nurse staff premises
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical nurse staff premises.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical nurse staff premises
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical nurse staff premises ID of this medical nurse staff premises.
	 *
	 * @param medicalNurseStaffPremisesId the medical nurse staff premises ID of this medical nurse staff premises
	 */
	@Override
	public void setMedicalNurseStaffPremisesId(
		long medicalNurseStaffPremisesId) {

		model.setMedicalNurseStaffPremisesId(medicalNurseStaffPremisesId);
	}

	/**
	 * Sets the modified date of this medical nurse staff premises.
	 *
	 * @param modifiedDate the modified date of this medical nurse staff premises
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nursing staff category of this medical nurse staff premises.
	 *
	 * @param nursingStaffCategory the nursing staff category of this medical nurse staff premises
	 */
	@Override
	public void setNursingStaffCategory(String nursingStaffCategory) {
		model.setNursingStaffCategory(nursingStaffCategory);
	}

	/**
	 * Sets the primary key of this medical nurse staff premises.
	 *
	 * @param primaryKey the primary key of this medical nurse staff premises
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical nurse staff premises.
	 *
	 * @param userId the user ID of this medical nurse staff premises
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical nurse staff premises.
	 *
	 * @param userName the user name of this medical nurse staff premises
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical nurse staff premises.
	 *
	 * @param userUuid the user uuid of this medical nurse staff premises
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
	protected MedicalNurseStaffPremisesWrapper wrap(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return new MedicalNurseStaffPremisesWrapper(medicalNurseStaffPremises);
	}

}