/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CannabisApplicationIndividualInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualInfo
 * @generated
 */
public class CannabisApplicationIndividualInfoWrapper
	extends BaseModelWrapper<CannabisApplicationIndividualInfo>
	implements CannabisApplicationIndividualInfo,
			   ModelWrapper<CannabisApplicationIndividualInfo> {

	public CannabisApplicationIndividualInfoWrapper(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo) {

		super(cannabisApplicationIndividualInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("individualInformationId", getIndividualInformationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("middleName", getMiddleName());
		attributes.put("otherName", getOtherName());
		attributes.put("maidenName", getMaidenName());
		attributes.put("motherMaidenName", getMotherMaidenName());
		attributes.put("gender", getGender());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("dob", getDob());
		attributes.put("placeOfBirth", getPlaceOfBirth());
		attributes.put("nationality", getNationality());
		attributes.put("durationInJamaika", getDurationInJamaika());
		attributes.put("trn", getTrn());
		attributes.put("currentOccupation", getCurrentOccupation());
		attributes.put("drivingLincenseNo", getDrivingLincenseNo());
		attributes.put("passporNo", getPassporNo());
		attributes.put("nationalIdentityNo", getNationalIdentityNo());
		attributes.put("contactHome", getContactHome());
		attributes.put("contactWork", getContactWork());
		attributes.put("contactMobile", getContactMobile());
		attributes.put("email", getEmail());
		attributes.put("identityNumber", getIdentityNumber());
		attributes.put("status", getStatus());
		attributes.put("applicationNumber", getApplicationNumber());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long individualInformationId = (Long)attributes.get(
			"individualInformationId");

		if (individualInformationId != null) {
			setIndividualInformationId(individualInformationId);
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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String otherName = (String)attributes.get("otherName");

		if (otherName != null) {
			setOtherName(otherName);
		}

		String maidenName = (String)attributes.get("maidenName");

		if (maidenName != null) {
			setMaidenName(maidenName);
		}

		String motherMaidenName = (String)attributes.get("motherMaidenName");

		if (motherMaidenName != null) {
			setMotherMaidenName(motherMaidenName);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String maritalStatus = (String)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}

		String placeOfBirth = (String)attributes.get("placeOfBirth");

		if (placeOfBirth != null) {
			setPlaceOfBirth(placeOfBirth);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		String durationInJamaika = (String)attributes.get("durationInJamaika");

		if (durationInJamaika != null) {
			setDurationInJamaika(durationInJamaika);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}

		String currentOccupation = (String)attributes.get("currentOccupation");

		if (currentOccupation != null) {
			setCurrentOccupation(currentOccupation);
		}

		String drivingLincenseNo = (String)attributes.get("drivingLincenseNo");

		if (drivingLincenseNo != null) {
			setDrivingLincenseNo(drivingLincenseNo);
		}

		String passporNo = (String)attributes.get("passporNo");

		if (passporNo != null) {
			setPassporNo(passporNo);
		}

		String nationalIdentityNo = (String)attributes.get(
			"nationalIdentityNo");

		if (nationalIdentityNo != null) {
			setNationalIdentityNo(nationalIdentityNo);
		}

		String contactHome = (String)attributes.get("contactHome");

		if (contactHome != null) {
			setContactHome(contactHome);
		}

		String contactWork = (String)attributes.get("contactWork");

		if (contactWork != null) {
			setContactWork(contactWork);
		}

		String contactMobile = (String)attributes.get("contactMobile");

		if (contactMobile != null) {
			setContactMobile(contactMobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String identityNumber = (String)attributes.get("identityNumber");

		if (identityNumber != null) {
			setIdentityNumber(identityNumber);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String applicationNumber = (String)attributes.get("applicationNumber");

		if (applicationNumber != null) {
			setApplicationNumber(applicationNumber);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisApplicationIndividualInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the application number of this cannabis application individual info.
	 *
	 * @return the application number of this cannabis application individual info
	 */
	@Override
	public String getApplicationNumber() {
		return model.getApplicationNumber();
	}

	/**
	 * Returns the cannabis application ID of this cannabis application individual info.
	 *
	 * @return the cannabis application ID of this cannabis application individual info
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the company ID of this cannabis application individual info.
	 *
	 * @return the company ID of this cannabis application individual info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact home of this cannabis application individual info.
	 *
	 * @return the contact home of this cannabis application individual info
	 */
	@Override
	public String getContactHome() {
		return model.getContactHome();
	}

	/**
	 * Returns the contact mobile of this cannabis application individual info.
	 *
	 * @return the contact mobile of this cannabis application individual info
	 */
	@Override
	public String getContactMobile() {
		return model.getContactMobile();
	}

	/**
	 * Returns the contact work of this cannabis application individual info.
	 *
	 * @return the contact work of this cannabis application individual info
	 */
	@Override
	public String getContactWork() {
		return model.getContactWork();
	}

	/**
	 * Returns the create date of this cannabis application individual info.
	 *
	 * @return the create date of this cannabis application individual info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current occupation of this cannabis application individual info.
	 *
	 * @return the current occupation of this cannabis application individual info
	 */
	@Override
	public String getCurrentOccupation() {
		return model.getCurrentOccupation();
	}

	/**
	 * Returns the dob of this cannabis application individual info.
	 *
	 * @return the dob of this cannabis application individual info
	 */
	@Override
	public Date getDob() {
		return model.getDob();
	}

	/**
	 * Returns the driving lincense no of this cannabis application individual info.
	 *
	 * @return the driving lincense no of this cannabis application individual info
	 */
	@Override
	public String getDrivingLincenseNo() {
		return model.getDrivingLincenseNo();
	}

	/**
	 * Returns the duration in jamaika of this cannabis application individual info.
	 *
	 * @return the duration in jamaika of this cannabis application individual info
	 */
	@Override
	public String getDurationInJamaika() {
		return model.getDurationInJamaika();
	}

	/**
	 * Returns the email of this cannabis application individual info.
	 *
	 * @return the email of this cannabis application individual info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the first name of this cannabis application individual info.
	 *
	 * @return the first name of this cannabis application individual info
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the gender of this cannabis application individual info.
	 *
	 * @return the gender of this cannabis application individual info
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this cannabis application individual info.
	 *
	 * @return the group ID of this cannabis application individual info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the identity number of this cannabis application individual info.
	 *
	 * @return the identity number of this cannabis application individual info
	 */
	@Override
	public String getIdentityNumber() {
		return model.getIdentityNumber();
	}

	/**
	 * Returns the individual information ID of this cannabis application individual info.
	 *
	 * @return the individual information ID of this cannabis application individual info
	 */
	@Override
	public long getIndividualInformationId() {
		return model.getIndividualInformationId();
	}

	/**
	 * Returns the last name of this cannabis application individual info.
	 *
	 * @return the last name of this cannabis application individual info
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the maiden name of this cannabis application individual info.
	 *
	 * @return the maiden name of this cannabis application individual info
	 */
	@Override
	public String getMaidenName() {
		return model.getMaidenName();
	}

	/**
	 * Returns the marital status of this cannabis application individual info.
	 *
	 * @return the marital status of this cannabis application individual info
	 */
	@Override
	public String getMaritalStatus() {
		return model.getMaritalStatus();
	}

	/**
	 * Returns the middle name of this cannabis application individual info.
	 *
	 * @return the middle name of this cannabis application individual info
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this cannabis application individual info.
	 *
	 * @return the modified date of this cannabis application individual info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mother maiden name of this cannabis application individual info.
	 *
	 * @return the mother maiden name of this cannabis application individual info
	 */
	@Override
	public String getMotherMaidenName() {
		return model.getMotherMaidenName();
	}

	/**
	 * Returns the national identity no of this cannabis application individual info.
	 *
	 * @return the national identity no of this cannabis application individual info
	 */
	@Override
	public String getNationalIdentityNo() {
		return model.getNationalIdentityNo();
	}

	/**
	 * Returns the nationality of this cannabis application individual info.
	 *
	 * @return the nationality of this cannabis application individual info
	 */
	@Override
	public String getNationality() {
		return model.getNationality();
	}

	/**
	 * Returns the other name of this cannabis application individual info.
	 *
	 * @return the other name of this cannabis application individual info
	 */
	@Override
	public String getOtherName() {
		return model.getOtherName();
	}

	/**
	 * Returns the passpor no of this cannabis application individual info.
	 *
	 * @return the passpor no of this cannabis application individual info
	 */
	@Override
	public String getPassporNo() {
		return model.getPassporNo();
	}

	/**
	 * Returns the place of birth of this cannabis application individual info.
	 *
	 * @return the place of birth of this cannabis application individual info
	 */
	@Override
	public String getPlaceOfBirth() {
		return model.getPlaceOfBirth();
	}

	/**
	 * Returns the primary key of this cannabis application individual info.
	 *
	 * @return the primary key of this cannabis application individual info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this cannabis application individual info.
	 *
	 * @return the status of this cannabis application individual info
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the trn of this cannabis application individual info.
	 *
	 * @return the trn of this cannabis application individual info
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the user ID of this cannabis application individual info.
	 *
	 * @return the user ID of this cannabis application individual info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis application individual info.
	 *
	 * @return the user name of this cannabis application individual info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis application individual info.
	 *
	 * @return the user uuid of this cannabis application individual info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis application individual info.
	 *
	 * @return the uuid of this cannabis application individual info
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
	 * Sets the application number of this cannabis application individual info.
	 *
	 * @param applicationNumber the application number of this cannabis application individual info
	 */
	@Override
	public void setApplicationNumber(String applicationNumber) {
		model.setApplicationNumber(applicationNumber);
	}

	/**
	 * Sets the cannabis application ID of this cannabis application individual info.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis application individual info
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the company ID of this cannabis application individual info.
	 *
	 * @param companyId the company ID of this cannabis application individual info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact home of this cannabis application individual info.
	 *
	 * @param contactHome the contact home of this cannabis application individual info
	 */
	@Override
	public void setContactHome(String contactHome) {
		model.setContactHome(contactHome);
	}

	/**
	 * Sets the contact mobile of this cannabis application individual info.
	 *
	 * @param contactMobile the contact mobile of this cannabis application individual info
	 */
	@Override
	public void setContactMobile(String contactMobile) {
		model.setContactMobile(contactMobile);
	}

	/**
	 * Sets the contact work of this cannabis application individual info.
	 *
	 * @param contactWork the contact work of this cannabis application individual info
	 */
	@Override
	public void setContactWork(String contactWork) {
		model.setContactWork(contactWork);
	}

	/**
	 * Sets the create date of this cannabis application individual info.
	 *
	 * @param createDate the create date of this cannabis application individual info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current occupation of this cannabis application individual info.
	 *
	 * @param currentOccupation the current occupation of this cannabis application individual info
	 */
	@Override
	public void setCurrentOccupation(String currentOccupation) {
		model.setCurrentOccupation(currentOccupation);
	}

	/**
	 * Sets the dob of this cannabis application individual info.
	 *
	 * @param dob the dob of this cannabis application individual info
	 */
	@Override
	public void setDob(Date dob) {
		model.setDob(dob);
	}

	/**
	 * Sets the driving lincense no of this cannabis application individual info.
	 *
	 * @param drivingLincenseNo the driving lincense no of this cannabis application individual info
	 */
	@Override
	public void setDrivingLincenseNo(String drivingLincenseNo) {
		model.setDrivingLincenseNo(drivingLincenseNo);
	}

	/**
	 * Sets the duration in jamaika of this cannabis application individual info.
	 *
	 * @param durationInJamaika the duration in jamaika of this cannabis application individual info
	 */
	@Override
	public void setDurationInJamaika(String durationInJamaika) {
		model.setDurationInJamaika(durationInJamaika);
	}

	/**
	 * Sets the email of this cannabis application individual info.
	 *
	 * @param email the email of this cannabis application individual info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the first name of this cannabis application individual info.
	 *
	 * @param firstName the first name of this cannabis application individual info
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the gender of this cannabis application individual info.
	 *
	 * @param gender the gender of this cannabis application individual info
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this cannabis application individual info.
	 *
	 * @param groupId the group ID of this cannabis application individual info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the identity number of this cannabis application individual info.
	 *
	 * @param identityNumber the identity number of this cannabis application individual info
	 */
	@Override
	public void setIdentityNumber(String identityNumber) {
		model.setIdentityNumber(identityNumber);
	}

	/**
	 * Sets the individual information ID of this cannabis application individual info.
	 *
	 * @param individualInformationId the individual information ID of this cannabis application individual info
	 */
	@Override
	public void setIndividualInformationId(long individualInformationId) {
		model.setIndividualInformationId(individualInformationId);
	}

	/**
	 * Sets the last name of this cannabis application individual info.
	 *
	 * @param lastName the last name of this cannabis application individual info
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the maiden name of this cannabis application individual info.
	 *
	 * @param maidenName the maiden name of this cannabis application individual info
	 */
	@Override
	public void setMaidenName(String maidenName) {
		model.setMaidenName(maidenName);
	}

	/**
	 * Sets the marital status of this cannabis application individual info.
	 *
	 * @param maritalStatus the marital status of this cannabis application individual info
	 */
	@Override
	public void setMaritalStatus(String maritalStatus) {
		model.setMaritalStatus(maritalStatus);
	}

	/**
	 * Sets the middle name of this cannabis application individual info.
	 *
	 * @param middleName the middle name of this cannabis application individual info
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this cannabis application individual info.
	 *
	 * @param modifiedDate the modified date of this cannabis application individual info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mother maiden name of this cannabis application individual info.
	 *
	 * @param motherMaidenName the mother maiden name of this cannabis application individual info
	 */
	@Override
	public void setMotherMaidenName(String motherMaidenName) {
		model.setMotherMaidenName(motherMaidenName);
	}

	/**
	 * Sets the national identity no of this cannabis application individual info.
	 *
	 * @param nationalIdentityNo the national identity no of this cannabis application individual info
	 */
	@Override
	public void setNationalIdentityNo(String nationalIdentityNo) {
		model.setNationalIdentityNo(nationalIdentityNo);
	}

	/**
	 * Sets the nationality of this cannabis application individual info.
	 *
	 * @param nationality the nationality of this cannabis application individual info
	 */
	@Override
	public void setNationality(String nationality) {
		model.setNationality(nationality);
	}

	/**
	 * Sets the other name of this cannabis application individual info.
	 *
	 * @param otherName the other name of this cannabis application individual info
	 */
	@Override
	public void setOtherName(String otherName) {
		model.setOtherName(otherName);
	}

	/**
	 * Sets the passpor no of this cannabis application individual info.
	 *
	 * @param passporNo the passpor no of this cannabis application individual info
	 */
	@Override
	public void setPassporNo(String passporNo) {
		model.setPassporNo(passporNo);
	}

	/**
	 * Sets the place of birth of this cannabis application individual info.
	 *
	 * @param placeOfBirth the place of birth of this cannabis application individual info
	 */
	@Override
	public void setPlaceOfBirth(String placeOfBirth) {
		model.setPlaceOfBirth(placeOfBirth);
	}

	/**
	 * Sets the primary key of this cannabis application individual info.
	 *
	 * @param primaryKey the primary key of this cannabis application individual info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this cannabis application individual info.
	 *
	 * @param status the status of this cannabis application individual info
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the trn of this cannabis application individual info.
	 *
	 * @param trn the trn of this cannabis application individual info
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the user ID of this cannabis application individual info.
	 *
	 * @param userId the user ID of this cannabis application individual info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis application individual info.
	 *
	 * @param userName the user name of this cannabis application individual info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis application individual info.
	 *
	 * @param userUuid the user uuid of this cannabis application individual info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis application individual info.
	 *
	 * @param uuid the uuid of this cannabis application individual info
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
	protected CannabisApplicationIndividualInfoWrapper wrap(
		CannabisApplicationIndividualInfo cannabisApplicationIndividualInfo) {

		return new CannabisApplicationIndividualInfoWrapper(
			cannabisApplicationIndividualInfo);
	}

}