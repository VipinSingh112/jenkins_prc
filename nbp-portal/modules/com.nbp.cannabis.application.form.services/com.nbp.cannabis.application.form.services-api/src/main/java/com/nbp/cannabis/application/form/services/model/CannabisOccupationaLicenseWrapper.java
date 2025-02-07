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
 * This class is a wrapper for {@link CannabisOccupationaLicense}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicense
 * @generated
 */
public class CannabisOccupationaLicenseWrapper
	extends BaseModelWrapper<CannabisOccupationaLicense>
	implements CannabisOccupationaLicense,
			   ModelWrapper<CannabisOccupationaLicense> {

	public CannabisOccupationaLicenseWrapper(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		super(cannabisOccupationaLicense);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"cannabisOccupationaLicenseId", getCannabisOccupationaLicenseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("surname", getSurname());
		attributes.put("position", getPosition());
		attributes.put("management", getManagement());
		attributes.put("director", getDirector());
		attributes.put("trn", getTrn());
		attributes.put("dob", getDob());
		attributes.put("idNumber", getIdNumber());
		attributes.put("typeOfId", getTypeOfId());
		attributes.put("counter", getCounter());
		attributes.put(
			"officialPoliceRecordDocId", getOfficialPoliceRecordDocId());
		attributes.put("certifiedCopyofIdDocId", getCertifiedCopyofIdDocId());
		attributes.put("photoOfEmployeeDocId", getPhotoOfEmployeeDocId());
		attributes.put("signature", getSignature());
		attributes.put("cannabisApplicationId", getCannabisApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cannabisOccupationaLicenseId = (Long)attributes.get(
			"cannabisOccupationaLicenseId");

		if (cannabisOccupationaLicenseId != null) {
			setCannabisOccupationaLicenseId(cannabisOccupationaLicenseId);
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

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String management = (String)attributes.get("management");

		if (management != null) {
			setManagement(management);
		}

		String director = (String)attributes.get("director");

		if (director != null) {
			setDirector(director);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}

		String idNumber = (String)attributes.get("idNumber");

		if (idNumber != null) {
			setIdNumber(idNumber);
		}

		String typeOfId = (String)attributes.get("typeOfId");

		if (typeOfId != null) {
			setTypeOfId(typeOfId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long officialPoliceRecordDocId = (Long)attributes.get(
			"officialPoliceRecordDocId");

		if (officialPoliceRecordDocId != null) {
			setOfficialPoliceRecordDocId(officialPoliceRecordDocId);
		}

		Long certifiedCopyofIdDocId = (Long)attributes.get(
			"certifiedCopyofIdDocId");

		if (certifiedCopyofIdDocId != null) {
			setCertifiedCopyofIdDocId(certifiedCopyofIdDocId);
		}

		Long photoOfEmployeeDocId = (Long)attributes.get(
			"photoOfEmployeeDocId");

		if (photoOfEmployeeDocId != null) {
			setPhotoOfEmployeeDocId(photoOfEmployeeDocId);
		}

		String signature = (String)attributes.get("signature");

		if (signature != null) {
			setSignature(signature);
		}

		Long cannabisApplicationId = (Long)attributes.get(
			"cannabisApplicationId");

		if (cannabisApplicationId != null) {
			setCannabisApplicationId(cannabisApplicationId);
		}
	}

	@Override
	public CannabisOccupationaLicense cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cannabis application ID of this cannabis occupationa license.
	 *
	 * @return the cannabis application ID of this cannabis occupationa license
	 */
	@Override
	public long getCannabisApplicationId() {
		return model.getCannabisApplicationId();
	}

	/**
	 * Returns the cannabis occupationa license ID of this cannabis occupationa license.
	 *
	 * @return the cannabis occupationa license ID of this cannabis occupationa license
	 */
	@Override
	public long getCannabisOccupationaLicenseId() {
		return model.getCannabisOccupationaLicenseId();
	}

	/**
	 * Returns the certified copyof ID doc ID of this cannabis occupationa license.
	 *
	 * @return the certified copyof ID doc ID of this cannabis occupationa license
	 */
	@Override
	public long getCertifiedCopyofIdDocId() {
		return model.getCertifiedCopyofIdDocId();
	}

	/**
	 * Returns the company ID of this cannabis occupationa license.
	 *
	 * @return the company ID of this cannabis occupationa license
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this cannabis occupationa license.
	 *
	 * @return the counter of this cannabis occupationa license
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this cannabis occupationa license.
	 *
	 * @return the create date of this cannabis occupationa license
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the director of this cannabis occupationa license.
	 *
	 * @return the director of this cannabis occupationa license
	 */
	@Override
	public String getDirector() {
		return model.getDirector();
	}

	/**
	 * Returns the dob of this cannabis occupationa license.
	 *
	 * @return the dob of this cannabis occupationa license
	 */
	@Override
	public Date getDob() {
		return model.getDob();
	}

	/**
	 * Returns the first name of this cannabis occupationa license.
	 *
	 * @return the first name of this cannabis occupationa license
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this cannabis occupationa license.
	 *
	 * @return the group ID of this cannabis occupationa license
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id number of this cannabis occupationa license.
	 *
	 * @return the id number of this cannabis occupationa license
	 */
	@Override
	public String getIdNumber() {
		return model.getIdNumber();
	}

	/**
	 * Returns the management of this cannabis occupationa license.
	 *
	 * @return the management of this cannabis occupationa license
	 */
	@Override
	public String getManagement() {
		return model.getManagement();
	}

	/**
	 * Returns the middle name of this cannabis occupationa license.
	 *
	 * @return the middle name of this cannabis occupationa license
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this cannabis occupationa license.
	 *
	 * @return the modified date of this cannabis occupationa license
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the official police record doc ID of this cannabis occupationa license.
	 *
	 * @return the official police record doc ID of this cannabis occupationa license
	 */
	@Override
	public long getOfficialPoliceRecordDocId() {
		return model.getOfficialPoliceRecordDocId();
	}

	/**
	 * Returns the photo of employee doc ID of this cannabis occupationa license.
	 *
	 * @return the photo of employee doc ID of this cannabis occupationa license
	 */
	@Override
	public long getPhotoOfEmployeeDocId() {
		return model.getPhotoOfEmployeeDocId();
	}

	/**
	 * Returns the position of this cannabis occupationa license.
	 *
	 * @return the position of this cannabis occupationa license
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this cannabis occupationa license.
	 *
	 * @return the primary key of this cannabis occupationa license
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the signature of this cannabis occupationa license.
	 *
	 * @return the signature of this cannabis occupationa license
	 */
	@Override
	public String getSignature() {
		return model.getSignature();
	}

	/**
	 * Returns the surname of this cannabis occupationa license.
	 *
	 * @return the surname of this cannabis occupationa license
	 */
	@Override
	public String getSurname() {
		return model.getSurname();
	}

	/**
	 * Returns the trn of this cannabis occupationa license.
	 *
	 * @return the trn of this cannabis occupationa license
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the type of ID of this cannabis occupationa license.
	 *
	 * @return the type of ID of this cannabis occupationa license
	 */
	@Override
	public String getTypeOfId() {
		return model.getTypeOfId();
	}

	/**
	 * Returns the user ID of this cannabis occupationa license.
	 *
	 * @return the user ID of this cannabis occupationa license
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this cannabis occupationa license.
	 *
	 * @return the user name of this cannabis occupationa license
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this cannabis occupationa license.
	 *
	 * @return the user uuid of this cannabis occupationa license
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this cannabis occupationa license.
	 *
	 * @return the uuid of this cannabis occupationa license
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
	 * Sets the cannabis application ID of this cannabis occupationa license.
	 *
	 * @param cannabisApplicationId the cannabis application ID of this cannabis occupationa license
	 */
	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		model.setCannabisApplicationId(cannabisApplicationId);
	}

	/**
	 * Sets the cannabis occupationa license ID of this cannabis occupationa license.
	 *
	 * @param cannabisOccupationaLicenseId the cannabis occupationa license ID of this cannabis occupationa license
	 */
	@Override
	public void setCannabisOccupationaLicenseId(
		long cannabisOccupationaLicenseId) {

		model.setCannabisOccupationaLicenseId(cannabisOccupationaLicenseId);
	}

	/**
	 * Sets the certified copyof ID doc ID of this cannabis occupationa license.
	 *
	 * @param certifiedCopyofIdDocId the certified copyof ID doc ID of this cannabis occupationa license
	 */
	@Override
	public void setCertifiedCopyofIdDocId(long certifiedCopyofIdDocId) {
		model.setCertifiedCopyofIdDocId(certifiedCopyofIdDocId);
	}

	/**
	 * Sets the company ID of this cannabis occupationa license.
	 *
	 * @param companyId the company ID of this cannabis occupationa license
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this cannabis occupationa license.
	 *
	 * @param counter the counter of this cannabis occupationa license
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this cannabis occupationa license.
	 *
	 * @param createDate the create date of this cannabis occupationa license
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the director of this cannabis occupationa license.
	 *
	 * @param director the director of this cannabis occupationa license
	 */
	@Override
	public void setDirector(String director) {
		model.setDirector(director);
	}

	/**
	 * Sets the dob of this cannabis occupationa license.
	 *
	 * @param dob the dob of this cannabis occupationa license
	 */
	@Override
	public void setDob(Date dob) {
		model.setDob(dob);
	}

	/**
	 * Sets the first name of this cannabis occupationa license.
	 *
	 * @param firstName the first name of this cannabis occupationa license
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this cannabis occupationa license.
	 *
	 * @param groupId the group ID of this cannabis occupationa license
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id number of this cannabis occupationa license.
	 *
	 * @param idNumber the id number of this cannabis occupationa license
	 */
	@Override
	public void setIdNumber(String idNumber) {
		model.setIdNumber(idNumber);
	}

	/**
	 * Sets the management of this cannabis occupationa license.
	 *
	 * @param management the management of this cannabis occupationa license
	 */
	@Override
	public void setManagement(String management) {
		model.setManagement(management);
	}

	/**
	 * Sets the middle name of this cannabis occupationa license.
	 *
	 * @param middleName the middle name of this cannabis occupationa license
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this cannabis occupationa license.
	 *
	 * @param modifiedDate the modified date of this cannabis occupationa license
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the official police record doc ID of this cannabis occupationa license.
	 *
	 * @param officialPoliceRecordDocId the official police record doc ID of this cannabis occupationa license
	 */
	@Override
	public void setOfficialPoliceRecordDocId(long officialPoliceRecordDocId) {
		model.setOfficialPoliceRecordDocId(officialPoliceRecordDocId);
	}

	/**
	 * Sets the photo of employee doc ID of this cannabis occupationa license.
	 *
	 * @param photoOfEmployeeDocId the photo of employee doc ID of this cannabis occupationa license
	 */
	@Override
	public void setPhotoOfEmployeeDocId(long photoOfEmployeeDocId) {
		model.setPhotoOfEmployeeDocId(photoOfEmployeeDocId);
	}

	/**
	 * Sets the position of this cannabis occupationa license.
	 *
	 * @param position the position of this cannabis occupationa license
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this cannabis occupationa license.
	 *
	 * @param primaryKey the primary key of this cannabis occupationa license
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the signature of this cannabis occupationa license.
	 *
	 * @param signature the signature of this cannabis occupationa license
	 */
	@Override
	public void setSignature(String signature) {
		model.setSignature(signature);
	}

	/**
	 * Sets the surname of this cannabis occupationa license.
	 *
	 * @param surname the surname of this cannabis occupationa license
	 */
	@Override
	public void setSurname(String surname) {
		model.setSurname(surname);
	}

	/**
	 * Sets the trn of this cannabis occupationa license.
	 *
	 * @param trn the trn of this cannabis occupationa license
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the type of ID of this cannabis occupationa license.
	 *
	 * @param typeOfId the type of ID of this cannabis occupationa license
	 */
	@Override
	public void setTypeOfId(String typeOfId) {
		model.setTypeOfId(typeOfId);
	}

	/**
	 * Sets the user ID of this cannabis occupationa license.
	 *
	 * @param userId the user ID of this cannabis occupationa license
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this cannabis occupationa license.
	 *
	 * @param userName the user name of this cannabis occupationa license
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this cannabis occupationa license.
	 *
	 * @param userUuid the user uuid of this cannabis occupationa license
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this cannabis occupationa license.
	 *
	 * @param uuid the uuid of this cannabis occupationa license
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
	protected CannabisOccupationaLicenseWrapper wrap(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		return new CannabisOccupationaLicenseWrapper(
			cannabisOccupationaLicense);
	}

}