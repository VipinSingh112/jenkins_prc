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
 * This class is a wrapper for {@link MedicalFacilitiesComDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesComDetail
 * @generated
 */
public class MedicalFacilitiesComDetailWrapper
	extends BaseModelWrapper<MedicalFacilitiesComDetail>
	implements MedicalFacilitiesComDetail,
			   ModelWrapper<MedicalFacilitiesComDetail> {

	public MedicalFacilitiesComDetailWrapper(
		MedicalFacilitiesComDetail medicalFacilitiesComDetail) {

		super(medicalFacilitiesComDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put(
			"medicalFacilitiesComDetailId", getMedicalFacilitiesComDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("fullName", getFullName());
		attributes.put("privateAddress", getPrivateAddress());
		attributes.put("registeredOffice", getRegisteredOffice());
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

		Long medicalFacilitiesComDetailId = (Long)attributes.get(
			"medicalFacilitiesComDetailId");

		if (medicalFacilitiesComDetailId != null) {
			setMedicalFacilitiesComDetailId(medicalFacilitiesComDetailId);
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

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String privateAddress = (String)attributes.get("privateAddress");

		if (privateAddress != null) {
			setPrivateAddress(privateAddress);
		}

		String registeredOffice = (String)attributes.get("registeredOffice");

		if (registeredOffice != null) {
			setRegisteredOffice(registeredOffice);
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
	public MedicalFacilitiesComDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this medical facilities com detail.
	 *
	 * @return the company ID of this medical facilities com detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this medical facilities com detail.
	 *
	 * @return the counter of this medical facilities com detail
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this medical facilities com detail.
	 *
	 * @return the create date of this medical facilities com detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the full name of this medical facilities com detail.
	 *
	 * @return the full name of this medical facilities com detail
	 */
	@Override
	public String getFullName() {
		return model.getFullName();
	}

	/**
	 * Returns the group ID of this medical facilities com detail.
	 *
	 * @return the group ID of this medical facilities com detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the medical facilities app ID of this medical facilities com detail.
	 *
	 * @return the medical facilities app ID of this medical facilities com detail
	 */
	@Override
	public long getMedicalFacilitiesAppId() {
		return model.getMedicalFacilitiesAppId();
	}

	/**
	 * Returns the medical facilities com detail ID of this medical facilities com detail.
	 *
	 * @return the medical facilities com detail ID of this medical facilities com detail
	 */
	@Override
	public long getMedicalFacilitiesComDetailId() {
		return model.getMedicalFacilitiesComDetailId();
	}

	/**
	 * Returns the modified date of this medical facilities com detail.
	 *
	 * @return the modified date of this medical facilities com detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this medical facilities com detail.
	 *
	 * @return the primary key of this medical facilities com detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the private address of this medical facilities com detail.
	 *
	 * @return the private address of this medical facilities com detail
	 */
	@Override
	public String getPrivateAddress() {
		return model.getPrivateAddress();
	}

	/**
	 * Returns the registered office of this medical facilities com detail.
	 *
	 * @return the registered office of this medical facilities com detail
	 */
	@Override
	public String getRegisteredOffice() {
		return model.getRegisteredOffice();
	}

	/**
	 * Returns the user ID of this medical facilities com detail.
	 *
	 * @return the user ID of this medical facilities com detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this medical facilities com detail.
	 *
	 * @return the user name of this medical facilities com detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this medical facilities com detail.
	 *
	 * @return the user uuid of this medical facilities com detail
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this medical facilities com detail.
	 *
	 * @return the uuid of this medical facilities com detail
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
	 * Sets the company ID of this medical facilities com detail.
	 *
	 * @param companyId the company ID of this medical facilities com detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this medical facilities com detail.
	 *
	 * @param counter the counter of this medical facilities com detail
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this medical facilities com detail.
	 *
	 * @param createDate the create date of this medical facilities com detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the full name of this medical facilities com detail.
	 *
	 * @param fullName the full name of this medical facilities com detail
	 */
	@Override
	public void setFullName(String fullName) {
		model.setFullName(fullName);
	}

	/**
	 * Sets the group ID of this medical facilities com detail.
	 *
	 * @param groupId the group ID of this medical facilities com detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the medical facilities app ID of this medical facilities com detail.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID of this medical facilities com detail
	 */
	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		model.setMedicalFacilitiesAppId(medicalFacilitiesAppId);
	}

	/**
	 * Sets the medical facilities com detail ID of this medical facilities com detail.
	 *
	 * @param medicalFacilitiesComDetailId the medical facilities com detail ID of this medical facilities com detail
	 */
	@Override
	public void setMedicalFacilitiesComDetailId(
		long medicalFacilitiesComDetailId) {

		model.setMedicalFacilitiesComDetailId(medicalFacilitiesComDetailId);
	}

	/**
	 * Sets the modified date of this medical facilities com detail.
	 *
	 * @param modifiedDate the modified date of this medical facilities com detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this medical facilities com detail.
	 *
	 * @param primaryKey the primary key of this medical facilities com detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the private address of this medical facilities com detail.
	 *
	 * @param privateAddress the private address of this medical facilities com detail
	 */
	@Override
	public void setPrivateAddress(String privateAddress) {
		model.setPrivateAddress(privateAddress);
	}

	/**
	 * Sets the registered office of this medical facilities com detail.
	 *
	 * @param registeredOffice the registered office of this medical facilities com detail
	 */
	@Override
	public void setRegisteredOffice(String registeredOffice) {
		model.setRegisteredOffice(registeredOffice);
	}

	/**
	 * Sets the user ID of this medical facilities com detail.
	 *
	 * @param userId the user ID of this medical facilities com detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this medical facilities com detail.
	 *
	 * @param userName the user name of this medical facilities com detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this medical facilities com detail.
	 *
	 * @param userUuid the user uuid of this medical facilities com detail
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this medical facilities com detail.
	 *
	 * @param uuid the uuid of this medical facilities com detail
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
	protected MedicalFacilitiesComDetailWrapper wrap(
		MedicalFacilitiesComDetail medicalFacilitiesComDetail) {

		return new MedicalFacilitiesComDetailWrapper(
			medicalFacilitiesComDetail);
	}

}