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
 * This class is a wrapper for {@link MedicalFacilitiesAppliInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppliInfo
 * @generated
 */
public class MedicalFacilitiesAppliInfoWrapper
	extends BaseModelWrapper<MedicalFacilitiesAppliInfo>
	implements MedicalFacilitiesAppliInfo,
			   ModelWrapper<MedicalFacilitiesAppliInfo> {

	public MedicalFacilitiesAppliInfoWrapper(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		super(medicalFacilitiesAppliInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesAppliId", getMedicalFacilitiesAppliId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("appliTelephoneNumber", getAppliTelephoneNumber());
		attributes.put("appliAddress", getAppliAddress());
		attributes.put("appliEmailAddress", getAppliEmailAddress());
		attributes.put("appliNationality", getAppliNationality());
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

		Long medicalFacilitiesAppliId = (Long)attributes.get(
			"medicalFacilitiesAppliId");

		if (medicalFacilitiesAppliId != null) {
			setMedicalFacilitiesAppliId(medicalFacilitiesAppliId);
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

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String appliTelephoneNumber = (String)attributes.get(
			"appliTelephoneNumber");

		if (appliTelephoneNumber != null) {
			setAppliTelephoneNumber(appliTelephoneNumber);
		}

		String appliAddress = (String)attributes.get("appliAddress");

		if (appliAddress != null) {
			setAppliAddress(appliAddress);
		}

		String appliEmailAddress = (String)attributes.get("appliEmailAddress");

		if (appliEmailAddress != null) {
			setAppliEmailAddress(appliEmailAddress);
		}

		String appliNationality = (String)attributes.get("appliNationality");

		if (appliNationality != null) {
			setAppliNationality(appliNationality);
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
	public MedicalFacilitiesAppliInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the appli address of this medical facilities appli info.
	 *
	 * @return the appli address of this medical facilities appli info
	 */
	@Override
	public String getAppliAddress() {
		return model.getAppliAddress();
	}

	/**
	 * Returns the applicant name of this medical facilities appli info.
	 *
	 * @return the applicant name of this medical facilities appli info
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the appli email address of this medical facilities appli info.
	 *
	 * @return the appli email address of this medical facilities appli info
	 */
	@Override
	public String getAppliEmailAddress() {
		return model.getAppliEmailAddress();
	}

	/**
	 * Returns the appli nationality of this medical facilities appli info.
	 *
	 * @return the appli nationality of this medical facilities appli info
	 */
	@Override
	public String getAppliNationality() {
		return model.getAppliNationality();
	}

	/**
	 * Returns the appli telephone number of this medical facilities appli info.
	 *
	 * @return the appli telephone number of this medical facilities appli info
	 */
	@Override
	public String getAppliTelephoneNumber() {
		return model.getAppliTelephoneNumber();
	}

	/**
	 * Returns the company ID of this medical facilities appli info.
	 *
	 * @return the company ID of this medical facilities appli info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical facilities appli info.
	 *
	 * @return the counter of this medical facilities appli info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical facilities appli info.
	 *
	 * @return the create date of this medical facilities appli info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical facilities appli info.
	 *
	 * @return the group ID of this medical facilities appli info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities appli info.
	 *
	 * @return the medical facilities app ID of this medical facilities appli info
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities appli ID of this medical facilities appli info.
	 *
	 * @return the medical facilities appli ID of this medical facilities appli info
	 */
	@Override
	public long getMedicalFacilitiesAppliId() {
		return model.getMedicalFacilitiesAppliId();
	}

	/**
	 * Returns the modified date of this medical facilities appli info.
	 *
	 * @return the modified date of this medical facilities appli info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this medical facilities appli info.
	 *
	 * @return the primary key of this medical facilities appli info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical facilities appli info.
	 *
	 * @return the user ID of this medical facilities appli info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities appli info.
	 *
	 * @return the user name of this medical facilities appli info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities appli info.
	 *
	 * @return the user uuid of this medical facilities appli info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities appli info.
	 *
	 * @return the uuid of this medical facilities appli info
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
	 * Sets the appli address of this medical facilities appli info.
	 *
	 * @param appliAddress the appli address of this medical facilities appli info
	 */
	@Override
	public void setAppliAddress(String appliAddress) {
		model.setAppliAddress(appliAddress);
	}

	/**
	 * Sets the applicant name of this medical facilities appli info.
	 *
	 * @param applicantName the applicant name of this medical facilities appli info
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the appli email address of this medical facilities appli info.
	 *
	 * @param appliEmailAddress the appli email address of this medical facilities appli info
	 */
	@Override
	public void setAppliEmailAddress(String appliEmailAddress) {
		model.setAppliEmailAddress(appliEmailAddress);
	}

	/**
	 * Sets the appli nationality of this medical facilities appli info.
	 *
	 * @param appliNationality the appli nationality of this medical facilities appli info
	 */
	@Override
	public void setAppliNationality(String appliNationality) {
		model.setAppliNationality(appliNationality);
	}

	/**
	 * Sets the appli telephone number of this medical facilities appli info.
	 *
	 * @param appliTelephoneNumber the appli telephone number of this medical facilities appli info
	 */
	@Override
	public void setAppliTelephoneNumber(String appliTelephoneNumber) {
		model.setAppliTelephoneNumber(appliTelephoneNumber);
	}

	/**
	 * Sets the company ID of this medical facilities appli info.
	 *
	 * @param companyId the company ID of this medical facilities appli info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical facilities appli info.
	 *
	 * @param counter the counter of this medical facilities appli info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical facilities appli info.
	 *
	 * @param createDate the create date of this medical facilities appli info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical facilities appli info.
	 *
	 * @param groupId the group ID of this medical facilities appli info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities appli info.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities appli info
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities appli ID of this medical facilities appli info.
	 *
	 * @param medicalFacilitiesAppliId the medical facilities appli ID of this medical facilities appli info
	 */
	@Override
	public void setMedicalFacilitiesAppliId(long medicalFacilitiesAppliId) {
		model.setMedicalFacilitiesAppliId(medicalFacilitiesAppliId);
	}

	/**
	 * Sets the modified date of this medical facilities appli info.
	 *
	 * @param modifiedDate the modified date of this medical facilities appli info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this medical facilities appli info.
	 *
	 * @param primaryKey the primary key of this medical facilities appli info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical facilities appli info.
	 *
	 * @param userId the user ID of this medical facilities appli info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities appli info.
	 *
	 * @param userName the user name of this medical facilities appli info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities appli info.
	 *
	 * @param userUuid the user uuid of this medical facilities appli info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities appli info.
	 *
	 * @param uuid the uuid of this medical facilities appli info
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
	protected MedicalFacilitiesAppliInfoWrapper wrap(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		return new MedicalFacilitiesAppliInfoWrapper(
			medicalFacilitiesAppliInfo);
	}

}