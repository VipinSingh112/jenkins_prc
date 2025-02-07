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
 * This class is a wrapper for {@link MedicalFacilitiesHomeTwo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeTwo
 * @generated
 */
public class MedicalFacilitiesHomeTwoWrapper
	extends BaseModelWrapper<MedicalFacilitiesHomeTwo>
	implements MedicalFacilitiesHomeTwo,
			   ModelWrapper<MedicalFacilitiesHomeTwo> {

	public MedicalFacilitiesHomeTwoWrapper(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		super(medicalFacilitiesHomeTwo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesHomeTwoId", getMedicalFacilitiesHomeTwoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("maternityPatients", getMaternityPatients());
		attributes.put("otherPatients", getOtherPatients());
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

		Long medicalFacilitiesHomeTwoId = (Long)attributes.get(
			"medicalFacilitiesHomeTwoId");

		if (medicalFacilitiesHomeTwoId != null) {
			setMedicalFacilitiesHomeTwoId(medicalFacilitiesHomeTwoId);
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

		String maternityPatients = (String)attributes.get("maternityPatients");

		if (maternityPatients != null) {
			setMaternityPatients(maternityPatients);
		}

		String otherPatients = (String)attributes.get("otherPatients");

		if (otherPatients != null) {
			setOtherPatients(otherPatients);
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
	public MedicalFacilitiesHomeTwo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical facilities home two.
	 *
	 * @return the company ID of this medical facilities home two
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical facilities home two.
	 *
	 * @return the counter of this medical facilities home two
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical facilities home two.
	 *
	 * @return the create date of this medical facilities home two
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical facilities home two.
	 *
	 * @return the group ID of this medical facilities home two
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the maternity patients of this medical facilities home two.
	 *
	 * @return the maternity patients of this medical facilities home two
	 */
	@Override
	public String getMaternityPatients() {
		return model.getMaternityPatients();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities home two.
	 *
	 * @return the medical facilities app ID of this medical facilities home two
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities home two ID of this medical facilities home two.
	 *
	 * @return the medical facilities home two ID of this medical facilities home two
	 */
	@Override
	public long getMedicalFacilitiesHomeTwoId() {
		return model.getMedicalFacilitiesHomeTwoId();
	}

	/**
	 * Returns the modified date of this medical facilities home two.
	 *
	 * @return the modified date of this medical facilities home two
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other patients of this medical facilities home two.
	 *
	 * @return the other patients of this medical facilities home two
	 */
	@Override
	public String getOtherPatients() {
		return model.getOtherPatients();
	}

	/**
	 * Returns the primary key of this medical facilities home two.
	 *
	 * @return the primary key of this medical facilities home two
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical facilities home two.
	 *
	 * @return the user ID of this medical facilities home two
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities home two.
	 *
	 * @return the user name of this medical facilities home two
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities home two.
	 *
	 * @return the user uuid of this medical facilities home two
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities home two.
	 *
	 * @return the uuid of this medical facilities home two
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
	 * Sets the company ID of this medical facilities home two.
	 *
	 * @param companyId the company ID of this medical facilities home two
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical facilities home two.
	 *
	 * @param counter the counter of this medical facilities home two
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical facilities home two.
	 *
	 * @param createDate the create date of this medical facilities home two
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical facilities home two.
	 *
	 * @param groupId the group ID of this medical facilities home two
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the maternity patients of this medical facilities home two.
	 *
	 * @param maternityPatients the maternity patients of this medical facilities home two
	 */
	@Override
	public void setMaternityPatients(String maternityPatients) {
		model.setMaternityPatients(maternityPatients);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities home two.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities home two
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities home two ID of this medical facilities home two.
	 *
	 * @param medicalFacilitiesHomeTwoId the medical facilities home two ID of this medical facilities home two
	 */
	@Override
	public void setMedicalFacilitiesHomeTwoId(long medicalFacilitiesHomeTwoId) {
		model.setMedicalFacilitiesHomeTwoId(medicalFacilitiesHomeTwoId);
	}

	/**
	 * Sets the modified date of this medical facilities home two.
	 *
	 * @param modifiedDate the modified date of this medical facilities home two
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other patients of this medical facilities home two.
	 *
	 * @param otherPatients the other patients of this medical facilities home two
	 */
	@Override
	public void setOtherPatients(String otherPatients) {
		model.setOtherPatients(otherPatients);
	}

	/**
	 * Sets the primary key of this medical facilities home two.
	 *
	 * @param primaryKey the primary key of this medical facilities home two
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical facilities home two.
	 *
	 * @param userId the user ID of this medical facilities home two
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities home two.
	 *
	 * @param userName the user name of this medical facilities home two
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities home two.
	 *
	 * @param userUuid the user uuid of this medical facilities home two
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities home two.
	 *
	 * @param uuid the uuid of this medical facilities home two
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
	protected MedicalFacilitiesHomeTwoWrapper wrap(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return new MedicalFacilitiesHomeTwoWrapper(medicalFacilitiesHomeTwo);
	}

}