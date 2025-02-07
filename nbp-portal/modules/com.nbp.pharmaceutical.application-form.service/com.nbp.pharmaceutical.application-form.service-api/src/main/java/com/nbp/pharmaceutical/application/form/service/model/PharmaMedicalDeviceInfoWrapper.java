/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PharmaMedicalDeviceInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaMedicalDeviceInfo
 * @generated
 */
public class PharmaMedicalDeviceInfoWrapper
	extends BaseModelWrapper<PharmaMedicalDeviceInfo>
	implements ModelWrapper<PharmaMedicalDeviceInfo>, PharmaMedicalDeviceInfo {

	public PharmaMedicalDeviceInfoWrapper(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		super(pharmaMedicalDeviceInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pharmaMedicalDeviceId", getPharmaMedicalDeviceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("pharmaDeviceName", getPharmaDeviceName());
		attributes.put("pharmaDeviceDeisgnation", getPharmaDeviceDeisgnation());
		attributes.put("pharmaManufacturerName", getPharmaManufacturerName());
		attributes.put(
			"pharmaManufacturerAddress", getPharmaManufacturerAddress());
		attributes.put(
			"pharmaMedicalApplicantName", getPharmaMedicalApplicantName());
		attributes.put(
			"pharmaMedicalApplicantAddress",
			getPharmaMedicalApplicantAddress());
		attributes.put(
			"pharmaRepresentativeName", getPharmaRepresentativeName());
		attributes.put(
			"pharmaRepresentativeAddress", getPharmaRepresentativeAddress());
		attributes.put("pharmaApplicationId", getPharmaApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaMedicalDeviceId = (Long)attributes.get(
			"pharmaMedicalDeviceId");

		if (pharmaMedicalDeviceId != null) {
			setPharmaMedicalDeviceId(pharmaMedicalDeviceId);
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

		String pharmaDeviceName = (String)attributes.get("pharmaDeviceName");

		if (pharmaDeviceName != null) {
			setPharmaDeviceName(pharmaDeviceName);
		}

		String pharmaDeviceDeisgnation = (String)attributes.get(
			"pharmaDeviceDeisgnation");

		if (pharmaDeviceDeisgnation != null) {
			setPharmaDeviceDeisgnation(pharmaDeviceDeisgnation);
		}

		String pharmaManufacturerName = (String)attributes.get(
			"pharmaManufacturerName");

		if (pharmaManufacturerName != null) {
			setPharmaManufacturerName(pharmaManufacturerName);
		}

		String pharmaManufacturerAddress = (String)attributes.get(
			"pharmaManufacturerAddress");

		if (pharmaManufacturerAddress != null) {
			setPharmaManufacturerAddress(pharmaManufacturerAddress);
		}

		String pharmaMedicalApplicantName = (String)attributes.get(
			"pharmaMedicalApplicantName");

		if (pharmaMedicalApplicantName != null) {
			setPharmaMedicalApplicantName(pharmaMedicalApplicantName);
		}

		String pharmaMedicalApplicantAddress = (String)attributes.get(
			"pharmaMedicalApplicantAddress");

		if (pharmaMedicalApplicantAddress != null) {
			setPharmaMedicalApplicantAddress(pharmaMedicalApplicantAddress);
		}

		String pharmaRepresentativeName = (String)attributes.get(
			"pharmaRepresentativeName");

		if (pharmaRepresentativeName != null) {
			setPharmaRepresentativeName(pharmaRepresentativeName);
		}

		String pharmaRepresentativeAddress = (String)attributes.get(
			"pharmaRepresentativeAddress");

		if (pharmaRepresentativeAddress != null) {
			setPharmaRepresentativeAddress(pharmaRepresentativeAddress);
		}

		Long pharmaApplicationId = (Long)attributes.get("pharmaApplicationId");

		if (pharmaApplicationId != null) {
			setPharmaApplicationId(pharmaApplicationId);
		}
	}

	@Override
	public PharmaMedicalDeviceInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this pharma medical device info.
	 *
	 * @return the company ID of this pharma medical device info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma medical device info.
	 *
	 * @return the create date of this pharma medical device info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this pharma medical device info.
	 *
	 * @return the group ID of this pharma medical device info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this pharma medical device info.
	 *
	 * @return the modified date of this pharma medical device info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pharma application ID of this pharma medical device info.
	 *
	 * @return the pharma application ID of this pharma medical device info
	 */
	@Override
	public long getPharmaApplicationId() {
		return model.getPharmaApplicationId();
	}

	/**
	 * Returns the pharma device deisgnation of this pharma medical device info.
	 *
	 * @return the pharma device deisgnation of this pharma medical device info
	 */
	@Override
	public String getPharmaDeviceDeisgnation() {
		return model.getPharmaDeviceDeisgnation();
	}

	/**
	 * Returns the pharma device name of this pharma medical device info.
	 *
	 * @return the pharma device name of this pharma medical device info
	 */
	@Override
	public String getPharmaDeviceName() {
		return model.getPharmaDeviceName();
	}

	/**
	 * Returns the pharma manufacturer address of this pharma medical device info.
	 *
	 * @return the pharma manufacturer address of this pharma medical device info
	 */
	@Override
	public String getPharmaManufacturerAddress() {
		return model.getPharmaManufacturerAddress();
	}

	/**
	 * Returns the pharma manufacturer name of this pharma medical device info.
	 *
	 * @return the pharma manufacturer name of this pharma medical device info
	 */
	@Override
	public String getPharmaManufacturerName() {
		return model.getPharmaManufacturerName();
	}

	/**
	 * Returns the pharma medical applicant address of this pharma medical device info.
	 *
	 * @return the pharma medical applicant address of this pharma medical device info
	 */
	@Override
	public String getPharmaMedicalApplicantAddress() {
		return model.getPharmaMedicalApplicantAddress();
	}

	/**
	 * Returns the pharma medical applicant name of this pharma medical device info.
	 *
	 * @return the pharma medical applicant name of this pharma medical device info
	 */
	@Override
	public String getPharmaMedicalApplicantName() {
		return model.getPharmaMedicalApplicantName();
	}

	/**
	 * Returns the pharma medical device ID of this pharma medical device info.
	 *
	 * @return the pharma medical device ID of this pharma medical device info
	 */
	@Override
	public long getPharmaMedicalDeviceId() {
		return model.getPharmaMedicalDeviceId();
	}

	/**
	 * Returns the pharma representative address of this pharma medical device info.
	 *
	 * @return the pharma representative address of this pharma medical device info
	 */
	@Override
	public String getPharmaRepresentativeAddress() {
		return model.getPharmaRepresentativeAddress();
	}

	/**
	 * Returns the pharma representative name of this pharma medical device info.
	 *
	 * @return the pharma representative name of this pharma medical device info
	 */
	@Override
	public String getPharmaRepresentativeName() {
		return model.getPharmaRepresentativeName();
	}

	/**
	 * Returns the primary key of this pharma medical device info.
	 *
	 * @return the primary key of this pharma medical device info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this pharma medical device info.
	 *
	 * @return the user ID of this pharma medical device info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma medical device info.
	 *
	 * @return the user name of this pharma medical device info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma medical device info.
	 *
	 * @return the user uuid of this pharma medical device info
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
	 * Sets the company ID of this pharma medical device info.
	 *
	 * @param companyId the company ID of this pharma medical device info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma medical device info.
	 *
	 * @param createDate the create date of this pharma medical device info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this pharma medical device info.
	 *
	 * @param groupId the group ID of this pharma medical device info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this pharma medical device info.
	 *
	 * @param modifiedDate the modified date of this pharma medical device info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pharma application ID of this pharma medical device info.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma medical device info
	 */
	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		model.setPharmaApplicationId(pharmaApplicationId);
	}

	/**
	 * Sets the pharma device deisgnation of this pharma medical device info.
	 *
	 * @param pharmaDeviceDeisgnation the pharma device deisgnation of this pharma medical device info
	 */
	@Override
	public void setPharmaDeviceDeisgnation(String pharmaDeviceDeisgnation) {
		model.setPharmaDeviceDeisgnation(pharmaDeviceDeisgnation);
	}

	/**
	 * Sets the pharma device name of this pharma medical device info.
	 *
	 * @param pharmaDeviceName the pharma device name of this pharma medical device info
	 */
	@Override
	public void setPharmaDeviceName(String pharmaDeviceName) {
		model.setPharmaDeviceName(pharmaDeviceName);
	}

	/**
	 * Sets the pharma manufacturer address of this pharma medical device info.
	 *
	 * @param pharmaManufacturerAddress the pharma manufacturer address of this pharma medical device info
	 */
	@Override
	public void setPharmaManufacturerAddress(String pharmaManufacturerAddress) {
		model.setPharmaManufacturerAddress(pharmaManufacturerAddress);
	}

	/**
	 * Sets the pharma manufacturer name of this pharma medical device info.
	 *
	 * @param pharmaManufacturerName the pharma manufacturer name of this pharma medical device info
	 */
	@Override
	public void setPharmaManufacturerName(String pharmaManufacturerName) {
		model.setPharmaManufacturerName(pharmaManufacturerName);
	}

	/**
	 * Sets the pharma medical applicant address of this pharma medical device info.
	 *
	 * @param pharmaMedicalApplicantAddress the pharma medical applicant address of this pharma medical device info
	 */
	@Override
	public void setPharmaMedicalApplicantAddress(
		String pharmaMedicalApplicantAddress) {

		model.setPharmaMedicalApplicantAddress(pharmaMedicalApplicantAddress);
	}

	/**
	 * Sets the pharma medical applicant name of this pharma medical device info.
	 *
	 * @param pharmaMedicalApplicantName the pharma medical applicant name of this pharma medical device info
	 */
	@Override
	public void setPharmaMedicalApplicantName(
		String pharmaMedicalApplicantName) {

		model.setPharmaMedicalApplicantName(pharmaMedicalApplicantName);
	}

	/**
	 * Sets the pharma medical device ID of this pharma medical device info.
	 *
	 * @param pharmaMedicalDeviceId the pharma medical device ID of this pharma medical device info
	 */
	@Override
	public void setPharmaMedicalDeviceId(long pharmaMedicalDeviceId) {
		model.setPharmaMedicalDeviceId(pharmaMedicalDeviceId);
	}

	/**
	 * Sets the pharma representative address of this pharma medical device info.
	 *
	 * @param pharmaRepresentativeAddress the pharma representative address of this pharma medical device info
	 */
	@Override
	public void setPharmaRepresentativeAddress(
		String pharmaRepresentativeAddress) {

		model.setPharmaRepresentativeAddress(pharmaRepresentativeAddress);
	}

	/**
	 * Sets the pharma representative name of this pharma medical device info.
	 *
	 * @param pharmaRepresentativeName the pharma representative name of this pharma medical device info
	 */
	@Override
	public void setPharmaRepresentativeName(String pharmaRepresentativeName) {
		model.setPharmaRepresentativeName(pharmaRepresentativeName);
	}

	/**
	 * Sets the primary key of this pharma medical device info.
	 *
	 * @param primaryKey the primary key of this pharma medical device info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this pharma medical device info.
	 *
	 * @param userId the user ID of this pharma medical device info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma medical device info.
	 *
	 * @param userName the user name of this pharma medical device info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma medical device info.
	 *
	 * @param userUuid the user uuid of this pharma medical device info
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
	protected PharmaMedicalDeviceInfoWrapper wrap(
		PharmaMedicalDeviceInfo pharmaMedicalDeviceInfo) {

		return new PharmaMedicalDeviceInfoWrapper(pharmaMedicalDeviceInfo);
	}

}