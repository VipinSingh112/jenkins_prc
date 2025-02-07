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
 * This class is a wrapper for {@link MedicalFacilitiesSignInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesSignInfo
 * @generated
 */
public class MedicalFacilitiesSignInfoWrapper
	extends BaseModelWrapper<MedicalFacilitiesSignInfo>
	implements MedicalFacilitiesSignInfo,
			   ModelWrapper<MedicalFacilitiesSignInfo> {

	public MedicalFacilitiesSignInfoWrapper(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		super(medicalFacilitiesSignInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesSignInfoId", getMedicalFacilitiesSignInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("number", getNumber());
		attributes.put("particulars", getParticulars());
		attributes.put("chargedFees", getChargedFees());
		attributes.put("addressOfOtherNHome", getAddressOfOtherNHome());
		attributes.put("enteredDate", getEnteredDate());
		attributes.put("medicalFacilitiesAppId", getMedicalFacilitiesAppId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long medicalFacilitiesSignInfoId = (Long)attributes.get(
			"medicalFacilitiesSignInfoId");

		if (medicalFacilitiesSignInfoId != null) {
			setMedicalFacilitiesSignInfoId(medicalFacilitiesSignInfoId);
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

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		String particulars = (String)attributes.get("particulars");

		if (particulars != null) {
			setParticulars(particulars);
		}

		String chargedFees = (String)attributes.get("chargedFees");

		if (chargedFees != null) {
			setChargedFees(chargedFees);
		}

		String addressOfOtherNHome = (String)attributes.get(
			"addressOfOtherNHome");

		if (addressOfOtherNHome != null) {
			setAddressOfOtherNHome(addressOfOtherNHome);
		}

		Date enteredDate = (Date)attributes.get("enteredDate");

		if (enteredDate != null) {
			setEnteredDate(enteredDate);
		}

		Long medicalFacilitiesAppId = (Long)attributes.get(
			"medicalFacilitiesAppId");

		if (medicalFacilitiesAppId != null) {
			setMedicalFacilitiesAppId(medicalFacilitiesAppId);
		}
	}

	@Override
	public MedicalFacilitiesSignInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of other n home of this medical facilities sign info.
	 *
	 * @return the address of other n home of this medical facilities sign info
	 */
	@Override
	public String getAddressOfOtherNHome() {
		return model.getAddressOfOtherNHome();
	}

	/**
	 * Returns the charged fees of this medical facilities sign info.
	 *
	 * @return the charged fees of this medical facilities sign info
	 */
	@Override
	public String getChargedFees() {
		return model.getChargedFees();
	}

	/**
	 * Returns the company ID of this medical facilities sign info.
	 *
	 * @return the company ID of this medical facilities sign info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this medical facilities sign info.
	 *
	 * @return the create date of this medical facilities sign info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entered date of this medical facilities sign info.
	 *
	 * @return the entered date of this medical facilities sign info
	 */
	@Override
	public Date getEnteredDate() {
		return model.getEnteredDate();
	}

	/**
	 * Returns the group ID of this medical facilities sign info.
	 *
	 * @return the group ID of this medical facilities sign info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities sign info.
	 *
	 * @return the medical facilities app ID of this medical facilities sign info
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities sign info ID of this medical facilities sign info.
	 *
	 * @return the medical facilities sign info ID of this medical facilities sign info
	 */
	@Override
	public long getMedicalFacilitiesSignInfoId() {
		return model.getMedicalFacilitiesSignInfoId();
	}

	/**
	 * Returns the modified date of this medical facilities sign info.
	 *
	 * @return the modified date of this medical facilities sign info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the number of this medical facilities sign info.
	 *
	 * @return the number of this medical facilities sign info
	 */
	@Override
	public String getNumber() {
		return model.getNumber();
	}

	/**
	 * Returns the particulars of this medical facilities sign info.
	 *
	 * @return the particulars of this medical facilities sign info
	 */
	@Override
	public String getParticulars() {
		return model.getParticulars();
	}

	/**
	 * Returns the primary key of this medical facilities sign info.
	 *
	 * @return the primary key of this medical facilities sign info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical facilities sign info.
	 *
	 * @return the user ID of this medical facilities sign info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities sign info.
	 *
	 * @return the user name of this medical facilities sign info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities sign info.
	 *
	 * @return the user uuid of this medical facilities sign info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities sign info.
	 *
	 * @return the uuid of this medical facilities sign info
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
	 * Sets the address of other n home of this medical facilities sign info.
	 *
	 * @param addressOfOtherNHome the address of other n home of this medical facilities sign info
	 */
	@Override
	public void setAddressOfOtherNHome(String addressOfOtherNHome) {
		model.setAddressOfOtherNHome(addressOfOtherNHome);
	}

	/**
	 * Sets the charged fees of this medical facilities sign info.
	 *
	 * @param chargedFees the charged fees of this medical facilities sign info
	 */
	@Override
	public void setChargedFees(String chargedFees) {
		model.setChargedFees(chargedFees);
	}

	/**
	 * Sets the company ID of this medical facilities sign info.
	 *
	 * @param companyId the company ID of this medical facilities sign info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this medical facilities sign info.
	 *
	 * @param createDate the create date of this medical facilities sign info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entered date of this medical facilities sign info.
	 *
	 * @param enteredDate the entered date of this medical facilities sign info
	 */
	@Override
	public void setEnteredDate(Date enteredDate) {
		model.setEnteredDate(enteredDate);
	}

	/**
	 * Sets the group ID of this medical facilities sign info.
	 *
	 * @param groupId the group ID of this medical facilities sign info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities sign info.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities sign info
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities sign info ID of this medical facilities sign info.
	 *
	 * @param medicalFacilitiesSignInfoId the medical facilities sign info ID of this medical facilities sign info
	 */
	@Override
	public void setMedicalFacilitiesSignInfoId(
		long medicalFacilitiesSignInfoId) {

		model.setMedicalFacilitiesSignInfoId(medicalFacilitiesSignInfoId);
	}

	/**
	 * Sets the modified date of this medical facilities sign info.
	 *
	 * @param modifiedDate the modified date of this medical facilities sign info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the number of this medical facilities sign info.
	 *
	 * @param number the number of this medical facilities sign info
	 */
	@Override
	public void setNumber(String number) {
		model.setNumber(number);
	}

	/**
	 * Sets the particulars of this medical facilities sign info.
	 *
	 * @param particulars the particulars of this medical facilities sign info
	 */
	@Override
	public void setParticulars(String particulars) {
		model.setParticulars(particulars);
	}

	/**
	 * Sets the primary key of this medical facilities sign info.
	 *
	 * @param primaryKey the primary key of this medical facilities sign info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical facilities sign info.
	 *
	 * @param userId the user ID of this medical facilities sign info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities sign info.
	 *
	 * @param userName the user name of this medical facilities sign info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities sign info.
	 *
	 * @param userUuid the user uuid of this medical facilities sign info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities sign info.
	 *
	 * @param uuid the uuid of this medical facilities sign info
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
	protected MedicalFacilitiesSignInfoWrapper wrap(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		return new MedicalFacilitiesSignInfoWrapper(medicalFacilitiesSignInfo);
	}

}