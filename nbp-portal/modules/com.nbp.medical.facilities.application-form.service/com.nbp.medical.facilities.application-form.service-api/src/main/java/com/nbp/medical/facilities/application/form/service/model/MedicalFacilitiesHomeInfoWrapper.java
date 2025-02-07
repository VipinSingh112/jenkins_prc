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
 * This class is a wrapper for {@link MedicalFacilitiesHomeInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeInfo
 * @generated
 */
public class MedicalFacilitiesHomeInfoWrapper
	extends BaseModelWrapper<MedicalFacilitiesHomeInfo>
	implements MedicalFacilitiesHomeInfo,
			   ModelWrapper<MedicalFacilitiesHomeInfo> {

	public MedicalFacilitiesHomeInfoWrapper(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		super(medicalFacilitiesHomeInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesHomeInfoId", getMedicalFacilitiesHomeInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfOwner", getNameOfOwner());
		attributes.put("homeAddress", getHomeAddress());
		attributes.put("homeTelephoneNumber", getHomeTelephoneNumber());
		attributes.put("homeEmailAddress", getHomeEmailAddress());
		attributes.put("description", getDescription());
		attributes.put("otherBusinessDetails", getOtherBusinessDetails());
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

		Long medicalFacilitiesHomeInfoId = (Long)attributes.get(
			"medicalFacilitiesHomeInfoId");

		if (medicalFacilitiesHomeInfoId != null) {
			setMedicalFacilitiesHomeInfoId(medicalFacilitiesHomeInfoId);
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

		String nameOfOwner = (String)attributes.get("nameOfOwner");

		if (nameOfOwner != null) {
			setNameOfOwner(nameOfOwner);
		}

		String homeAddress = (String)attributes.get("homeAddress");

		if (homeAddress != null) {
			setHomeAddress(homeAddress);
		}

		String homeTelephoneNumber = (String)attributes.get(
			"homeTelephoneNumber");

		if (homeTelephoneNumber != null) {
			setHomeTelephoneNumber(homeTelephoneNumber);
		}

		String homeEmailAddress = (String)attributes.get("homeEmailAddress");

		if (homeEmailAddress != null) {
			setHomeEmailAddress(homeEmailAddress);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String otherBusinessDetails = (String)attributes.get(
			"otherBusinessDetails");

		if (otherBusinessDetails != null) {
			setOtherBusinessDetails(otherBusinessDetails);
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
	public MedicalFacilitiesHomeInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical facilities home info.
	 *
	 * @return the company ID of this medical facilities home info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical facilities home info.
	 *
	 * @return the counter of this medical facilities home info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical facilities home info.
	 *
	 * @return the create date of this medical facilities home info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this medical facilities home info.
	 *
	 * @return the description of this medical facilities home info
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this medical facilities home info.
	 *
	 * @return the group ID of this medical facilities home info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home address of this medical facilities home info.
	 *
	 * @return the home address of this medical facilities home info
	 */
	@Override
	public String getHomeAddress() {
		return model.getHomeAddress();
	}

	/**
	 * Returns the home email address of this medical facilities home info.
	 *
	 * @return the home email address of this medical facilities home info
	 */
	@Override
	public String getHomeEmailAddress() {
		return model.getHomeEmailAddress();
	}

	/**
	 * Returns the home telephone number of this medical facilities home info.
	 *
	 * @return the home telephone number of this medical facilities home info
	 */
	@Override
	public String getHomeTelephoneNumber() {
		return model.getHomeTelephoneNumber();
	}

	/**
	 * Returns the maternity patients of this medical facilities home info.
	 *
	 * @return the maternity patients of this medical facilities home info
	 */
	@Override
	public String getMaternityPatients() {
		return model.getMaternityPatients();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities home info.
	 *
	 * @return the medical facilities app ID of this medical facilities home info
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities home info ID of this medical facilities home info.
	 *
	 * @return the medical facilities home info ID of this medical facilities home info
	 */
	@Override
	public long getMedicalFacilitiesHomeInfoId() {
		return model.getMedicalFacilitiesHomeInfoId();
	}

	/**
	 * Returns the modified date of this medical facilities home info.
	 *
	 * @return the modified date of this medical facilities home info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of owner of this medical facilities home info.
	 *
	 * @return the name of owner of this medical facilities home info
	 */
	@Override
	public String getNameOfOwner() {
		return model.getNameOfOwner();
	}

	/**
	 * Returns the other business details of this medical facilities home info.
	 *
	 * @return the other business details of this medical facilities home info
	 */
	@Override
	public String getOtherBusinessDetails() {
		return model.getOtherBusinessDetails();
	}

	/**
	 * Returns the other patients of this medical facilities home info.
	 *
	 * @return the other patients of this medical facilities home info
	 */
	@Override
	public String getOtherPatients() {
		return model.getOtherPatients();
	}

	/**
	 * Returns the primary key of this medical facilities home info.
	 *
	 * @return the primary key of this medical facilities home info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical facilities home info.
	 *
	 * @return the user ID of this medical facilities home info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities home info.
	 *
	 * @return the user name of this medical facilities home info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities home info.
	 *
	 * @return the user uuid of this medical facilities home info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities home info.
	 *
	 * @return the uuid of this medical facilities home info
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
	 * Sets the company ID of this medical facilities home info.
	 *
	 * @param companyId the company ID of this medical facilities home info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical facilities home info.
	 *
	 * @param counter the counter of this medical facilities home info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical facilities home info.
	 *
	 * @param createDate the create date of this medical facilities home info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this medical facilities home info.
	 *
	 * @param description the description of this medical facilities home info
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this medical facilities home info.
	 *
	 * @param groupId the group ID of this medical facilities home info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home address of this medical facilities home info.
	 *
	 * @param homeAddress the home address of this medical facilities home info
	 */
	@Override
	public void setHomeAddress(String homeAddress) {
		model.setHomeAddress(homeAddress);
	}

	/**
	 * Sets the home email address of this medical facilities home info.
	 *
	 * @param homeEmailAddress the home email address of this medical facilities home info
	 */
	@Override
	public void setHomeEmailAddress(String homeEmailAddress) {
		model.setHomeEmailAddress(homeEmailAddress);
	}

	/**
	 * Sets the home telephone number of this medical facilities home info.
	 *
	 * @param homeTelephoneNumber the home telephone number of this medical facilities home info
	 */
	@Override
	public void setHomeTelephoneNumber(String homeTelephoneNumber) {
		model.setHomeTelephoneNumber(homeTelephoneNumber);
	}

	/**
	 * Sets the maternity patients of this medical facilities home info.
	 *
	 * @param maternityPatients the maternity patients of this medical facilities home info
	 */
	@Override
	public void setMaternityPatients(String maternityPatients) {
		model.setMaternityPatients(maternityPatients);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities home info.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities home info
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities home info ID of this medical facilities home info.
	 *
	 * @param medicalFacilitiesHomeInfoId the medical facilities home info ID of this medical facilities home info
	 */
	@Override
	public void setMedicalFacilitiesHomeInfoId(
		long medicalFacilitiesHomeInfoId) {

		model.setMedicalFacilitiesHomeInfoId(medicalFacilitiesHomeInfoId);
	}

	/**
	 * Sets the modified date of this medical facilities home info.
	 *
	 * @param modifiedDate the modified date of this medical facilities home info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of owner of this medical facilities home info.
	 *
	 * @param nameOfOwner the name of owner of this medical facilities home info
	 */
	@Override
	public void setNameOfOwner(String nameOfOwner) {
		model.setNameOfOwner(nameOfOwner);
	}

	/**
	 * Sets the other business details of this medical facilities home info.
	 *
	 * @param otherBusinessDetails the other business details of this medical facilities home info
	 */
	@Override
	public void setOtherBusinessDetails(String otherBusinessDetails) {
		model.setOtherBusinessDetails(otherBusinessDetails);
	}

	/**
	 * Sets the other patients of this medical facilities home info.
	 *
	 * @param otherPatients the other patients of this medical facilities home info
	 */
	@Override
	public void setOtherPatients(String otherPatients) {
		model.setOtherPatients(otherPatients);
	}

	/**
	 * Sets the primary key of this medical facilities home info.
	 *
	 * @param primaryKey the primary key of this medical facilities home info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical facilities home info.
	 *
	 * @param userId the user ID of this medical facilities home info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities home info.
	 *
	 * @param userName the user name of this medical facilities home info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities home info.
	 *
	 * @param userUuid the user uuid of this medical facilities home info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities home info.
	 *
	 * @param uuid the uuid of this medical facilities home info
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
	protected MedicalFacilitiesHomeInfoWrapper wrap(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return new MedicalFacilitiesHomeInfoWrapper(medicalFacilitiesHomeInfo);
	}

}