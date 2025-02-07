/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MedicalPractitionerAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPractitionerAdd
 * @generated
 */
public class MedicalPractitionerAddWrapper
	extends BaseModelWrapper<MedicalPractitionerAdd>
	implements MedicalPractitionerAdd, ModelWrapper<MedicalPractitionerAdd> {

	public MedicalPractitionerAddWrapper(
		MedicalPractitionerAdd medicalPractitionerAdd) {

		super(medicalPractitionerAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"medicalPractitionerAddId", getMedicalPractitionerAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("medicalPractitionerName", getMedicalPractitionerName());
		attributes.put(
			"medicalPractitionerAddress", getMedicalPractitionerAddress());
		attributes.put(
			"medicalPractitionerTelephone", getMedicalPractitionerTelephone());
		attributes.put("medicalPractitionerFax", getMedicalPractitionerFax());
		attributes.put(
			"medicalPractitionerEmail", getMedicalPractitionerEmail());
		attributes.put(
			"medicalPractitionerLicenceNo", getMedicalPractitionerLicenceNo());
		attributes.put("counter", getCounter());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long medicalPractitionerAddId = (Long)attributes.get(
			"medicalPractitionerAddId");

		if (medicalPractitionerAddId != null) {
			setMedicalPractitionerAddId(medicalPractitionerAddId);
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

		String medicalPractitionerName = (String)attributes.get(
			"medicalPractitionerName");

		if (medicalPractitionerName != null) {
			setMedicalPractitionerName(medicalPractitionerName);
		}

		String medicalPractitionerAddress = (String)attributes.get(
			"medicalPractitionerAddress");

		if (medicalPractitionerAddress != null) {
			setMedicalPractitionerAddress(medicalPractitionerAddress);
		}

		String medicalPractitionerTelephone = (String)attributes.get(
			"medicalPractitionerTelephone");

		if (medicalPractitionerTelephone != null) {
			setMedicalPractitionerTelephone(medicalPractitionerTelephone);
		}

		String medicalPractitionerFax = (String)attributes.get(
			"medicalPractitionerFax");

		if (medicalPractitionerFax != null) {
			setMedicalPractitionerFax(medicalPractitionerFax);
		}

		String medicalPractitionerEmail = (String)attributes.get(
			"medicalPractitionerEmail");

		if (medicalPractitionerEmail != null) {
			setMedicalPractitionerEmail(medicalPractitionerEmail);
		}

		String medicalPractitionerLicenceNo = (String)attributes.get(
			"medicalPractitionerLicenceNo");

		if (medicalPractitionerLicenceNo != null) {
			setMedicalPractitionerLicenceNo(medicalPractitionerLicenceNo);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public MedicalPractitionerAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical practitioner add.
	 *
	 * @return the company ID of this medical practitioner add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical practitioner add.
	 *
	 * @return the counter of this medical practitioner add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical practitioner add.
	 *
	 * @return the create date of this medical practitioner add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this medical practitioner add.
	 *
	 * @return the group ID of this medical practitioner add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this medical practitioner add.
	 *
	 * @return the hsra application ID of this medical practitioner add
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the medical practitioner add ID of this medical practitioner add.
	 *
	 * @return the medical practitioner add ID of this medical practitioner add
	 */
	@Override
	public long getMedicalPractitionerAddId() {
		return model.getMedicalPractitionerAddId();
	}

	/**
	 * Returns the medical practitioner address of this medical practitioner add.
	 *
	 * @return the medical practitioner address of this medical practitioner add
	 */
	@Override
	public String getMedicalPractitionerAddress() {
		return model.getMedicalPractitionerAddress();
	}

	/**
	 * Returns the medical practitioner email of this medical practitioner add.
	 *
	 * @return the medical practitioner email of this medical practitioner add
	 */
	@Override
	public String getMedicalPractitionerEmail() {
		return model.getMedicalPractitionerEmail();
	}

	/**
	 * Returns the medical practitioner fax of this medical practitioner add.
	 *
	 * @return the medical practitioner fax of this medical practitioner add
	 */
	@Override
	public String getMedicalPractitionerFax() {
		return model.getMedicalPractitionerFax();
	}

	/**
	 * Returns the medical practitioner licence no of this medical practitioner add.
	 *
	 * @return the medical practitioner licence no of this medical practitioner add
	 */
	@Override
	public String getMedicalPractitionerLicenceNo() {
		return model.getMedicalPractitionerLicenceNo();
	}

	/**
	 * Returns the medical practitioner name of this medical practitioner add.
	 *
	 * @return the medical practitioner name of this medical practitioner add
	 */
	@Override
	public String getMedicalPractitionerName() {
		return model.getMedicalPractitionerName();
	}

	/**
	 * Returns the medical practitioner telephone of this medical practitioner add.
	 *
	 * @return the medical practitioner telephone of this medical practitioner add
	 */
	@Override
	public String getMedicalPractitionerTelephone() {
		return model.getMedicalPractitionerTelephone();
	}

	/**
	 * Returns the modified date of this medical practitioner add.
	 *
	 * @return the modified date of this medical practitioner add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this medical practitioner add.
	 *
	 * @return the primary key of this medical practitioner add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this medical practitioner add.
	 *
	 * @return the user ID of this medical practitioner add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical practitioner add.
	 *
	 * @return the user name of this medical practitioner add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical practitioner add.
	 *
	 * @return the user uuid of this medical practitioner add
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
	 * Sets the company ID of this medical practitioner add.
	 *
	 * @param companyId the company ID of this medical practitioner add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical practitioner add.
	 *
	 * @param counter the counter of this medical practitioner add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical practitioner add.
	 *
	 * @param createDate the create date of this medical practitioner add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this medical practitioner add.
	 *
	 * @param groupId the group ID of this medical practitioner add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this medical practitioner add.
	 *
	 * @param hsraApplicationId the hsra application ID of this medical practitioner add
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the medical practitioner add ID of this medical practitioner add.
	 *
	 * @param medicalPractitionerAddId the medical practitioner add ID of this medical practitioner add
	 */
	@Override
	public void setMedicalPractitionerAddId(long medicalPractitionerAddId) {
		model.setMedicalPractitionerAddId(medicalPractitionerAddId);
	}

	/**
	 * Sets the medical practitioner address of this medical practitioner add.
	 *
	 * @param medicalPractitionerAddress the medical practitioner address of this medical practitioner add
	 */
	@Override
	public void setMedicalPractitionerAddress(
		String medicalPractitionerAddress) {

		model.setMedicalPractitionerAddress(medicalPractitionerAddress);
	}

	/**
	 * Sets the medical practitioner email of this medical practitioner add.
	 *
	 * @param medicalPractitionerEmail the medical practitioner email of this medical practitioner add
	 */
	@Override
	public void setMedicalPractitionerEmail(String medicalPractitionerEmail) {
		model.setMedicalPractitionerEmail(medicalPractitionerEmail);
	}

	/**
	 * Sets the medical practitioner fax of this medical practitioner add.
	 *
	 * @param medicalPractitionerFax the medical practitioner fax of this medical practitioner add
	 */
	@Override
	public void setMedicalPractitionerFax(String medicalPractitionerFax) {
		model.setMedicalPractitionerFax(medicalPractitionerFax);
	}

	/**
	 * Sets the medical practitioner licence no of this medical practitioner add.
	 *
	 * @param medicalPractitionerLicenceNo the medical practitioner licence no of this medical practitioner add
	 */
	@Override
	public void setMedicalPractitionerLicenceNo(
		String medicalPractitionerLicenceNo) {

		model.setMedicalPractitionerLicenceNo(medicalPractitionerLicenceNo);
	}

	/**
	 * Sets the medical practitioner name of this medical practitioner add.
	 *
	 * @param medicalPractitionerName the medical practitioner name of this medical practitioner add
	 */
	@Override
	public void setMedicalPractitionerName(String medicalPractitionerName) {
		model.setMedicalPractitionerName(medicalPractitionerName);
	}

	/**
	 * Sets the medical practitioner telephone of this medical practitioner add.
	 *
	 * @param medicalPractitionerTelephone the medical practitioner telephone of this medical practitioner add
	 */
	@Override
	public void setMedicalPractitionerTelephone(
		String medicalPractitionerTelephone) {

		model.setMedicalPractitionerTelephone(medicalPractitionerTelephone);
	}

	/**
	 * Sets the modified date of this medical practitioner add.
	 *
	 * @param modifiedDate the modified date of this medical practitioner add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this medical practitioner add.
	 *
	 * @param primaryKey the primary key of this medical practitioner add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this medical practitioner add.
	 *
	 * @param userId the user ID of this medical practitioner add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical practitioner add.
	 *
	 * @param userName the user name of this medical practitioner add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical practitioner add.
	 *
	 * @param userUuid the user uuid of this medical practitioner add
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
	protected MedicalPractitionerAddWrapper wrap(
		MedicalPractitionerAdd medicalPractitionerAdd) {

		return new MedicalPractitionerAddWrapper(medicalPractitionerAdd);
	}

}