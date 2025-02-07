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
 * This class is a wrapper for {@link PharmaManufacturerInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaManufacturerInfo
 * @generated
 */
public class PharmaManufacturerInfoWrapper
	extends BaseModelWrapper<PharmaManufacturerInfo>
	implements ModelWrapper<PharmaManufacturerInfo>, PharmaManufacturerInfo {

	public PharmaManufacturerInfoWrapper(
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		super(pharmaManufacturerInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"pharmaManufacturerInfoId", getPharmaManufacturerInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"pharmaDrugManufacturerName", getPharmaDrugManufacturerName());
		attributes.put(
			"pharmaDrugManufacturerAdd", getPharmaDrugManufacturerAdd());
		attributes.put("pharmaDrugDeisgnation", getPharmaDrugDeisgnation());
		attributes.put("pharmaMarketAuthName", getPharmaMarketAuthName());
		attributes.put("pharmaMarketAuthAddress", getPharmaMarketAuthAddress());
		attributes.put("pharmaReguOfficerName", getPharmaReguOfficerName());
		attributes.put(
			"pharmaReguOfficerContact", getPharmaReguOfficerContact());
		attributes.put("pharmaDrugApplicName", getPharmaDrugApplicName());
		attributes.put("pharmaDrugApplicAddress", getPharmaDrugApplicAddress());
		attributes.put("pharmaLocalReprName", getPharmaLocalReprName());
		attributes.put("pharmaLocalReprContact", getPharmaLocalReprContact());
		attributes.put("pharmaLocalReprAdd", getPharmaLocalReprAdd());
		attributes.put("pharmaLocalDistName", getPharmaLocalDistName());
		attributes.put("pharmaLocalDistAddress", getPharmaLocalDistAddress());
		attributes.put("pharmaLocalDistContact", getPharmaLocalDistContact());
		attributes.put("pharmaApplicationId", getPharmaApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaManufacturerInfoId = (Long)attributes.get(
			"pharmaManufacturerInfoId");

		if (pharmaManufacturerInfoId != null) {
			setPharmaManufacturerInfoId(pharmaManufacturerInfoId);
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

		String pharmaDrugManufacturerName = (String)attributes.get(
			"pharmaDrugManufacturerName");

		if (pharmaDrugManufacturerName != null) {
			setPharmaDrugManufacturerName(pharmaDrugManufacturerName);
		}

		String pharmaDrugManufacturerAdd = (String)attributes.get(
			"pharmaDrugManufacturerAdd");

		if (pharmaDrugManufacturerAdd != null) {
			setPharmaDrugManufacturerAdd(pharmaDrugManufacturerAdd);
		}

		String pharmaDrugDeisgnation = (String)attributes.get(
			"pharmaDrugDeisgnation");

		if (pharmaDrugDeisgnation != null) {
			setPharmaDrugDeisgnation(pharmaDrugDeisgnation);
		}

		String pharmaMarketAuthName = (String)attributes.get(
			"pharmaMarketAuthName");

		if (pharmaMarketAuthName != null) {
			setPharmaMarketAuthName(pharmaMarketAuthName);
		}

		String pharmaMarketAuthAddress = (String)attributes.get(
			"pharmaMarketAuthAddress");

		if (pharmaMarketAuthAddress != null) {
			setPharmaMarketAuthAddress(pharmaMarketAuthAddress);
		}

		String pharmaReguOfficerName = (String)attributes.get(
			"pharmaReguOfficerName");

		if (pharmaReguOfficerName != null) {
			setPharmaReguOfficerName(pharmaReguOfficerName);
		}

		String pharmaReguOfficerContact = (String)attributes.get(
			"pharmaReguOfficerContact");

		if (pharmaReguOfficerContact != null) {
			setPharmaReguOfficerContact(pharmaReguOfficerContact);
		}

		String pharmaDrugApplicName = (String)attributes.get(
			"pharmaDrugApplicName");

		if (pharmaDrugApplicName != null) {
			setPharmaDrugApplicName(pharmaDrugApplicName);
		}

		String pharmaDrugApplicAddress = (String)attributes.get(
			"pharmaDrugApplicAddress");

		if (pharmaDrugApplicAddress != null) {
			setPharmaDrugApplicAddress(pharmaDrugApplicAddress);
		}

		String pharmaLocalReprName = (String)attributes.get(
			"pharmaLocalReprName");

		if (pharmaLocalReprName != null) {
			setPharmaLocalReprName(pharmaLocalReprName);
		}

		String pharmaLocalReprContact = (String)attributes.get(
			"pharmaLocalReprContact");

		if (pharmaLocalReprContact != null) {
			setPharmaLocalReprContact(pharmaLocalReprContact);
		}

		String pharmaLocalReprAdd = (String)attributes.get(
			"pharmaLocalReprAdd");

		if (pharmaLocalReprAdd != null) {
			setPharmaLocalReprAdd(pharmaLocalReprAdd);
		}

		String pharmaLocalDistName = (String)attributes.get(
			"pharmaLocalDistName");

		if (pharmaLocalDistName != null) {
			setPharmaLocalDistName(pharmaLocalDistName);
		}

		String pharmaLocalDistAddress = (String)attributes.get(
			"pharmaLocalDistAddress");

		if (pharmaLocalDistAddress != null) {
			setPharmaLocalDistAddress(pharmaLocalDistAddress);
		}

		String pharmaLocalDistContact = (String)attributes.get(
			"pharmaLocalDistContact");

		if (pharmaLocalDistContact != null) {
			setPharmaLocalDistContact(pharmaLocalDistContact);
		}

		Long pharmaApplicationId = (Long)attributes.get("pharmaApplicationId");

		if (pharmaApplicationId != null) {
			setPharmaApplicationId(pharmaApplicationId);
		}
	}

	@Override
	public PharmaManufacturerInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this pharma manufacturer info.
	 *
	 * @return the company ID of this pharma manufacturer info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma manufacturer info.
	 *
	 * @return the create date of this pharma manufacturer info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this pharma manufacturer info.
	 *
	 * @return the group ID of this pharma manufacturer info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this pharma manufacturer info.
	 *
	 * @return the modified date of this pharma manufacturer info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pharma application ID of this pharma manufacturer info.
	 *
	 * @return the pharma application ID of this pharma manufacturer info
	 */
	@Override
	public long getPharmaApplicationId() {
		return model.getPharmaApplicationId();
	}

	/**
	 * Returns the pharma drug applic address of this pharma manufacturer info.
	 *
	 * @return the pharma drug applic address of this pharma manufacturer info
	 */
	@Override
	public String getPharmaDrugApplicAddress() {
		return model.getPharmaDrugApplicAddress();
	}

	/**
	 * Returns the pharma drug applic name of this pharma manufacturer info.
	 *
	 * @return the pharma drug applic name of this pharma manufacturer info
	 */
	@Override
	public String getPharmaDrugApplicName() {
		return model.getPharmaDrugApplicName();
	}

	/**
	 * Returns the pharma drug deisgnation of this pharma manufacturer info.
	 *
	 * @return the pharma drug deisgnation of this pharma manufacturer info
	 */
	@Override
	public String getPharmaDrugDeisgnation() {
		return model.getPharmaDrugDeisgnation();
	}

	/**
	 * Returns the pharma drug manufacturer add of this pharma manufacturer info.
	 *
	 * @return the pharma drug manufacturer add of this pharma manufacturer info
	 */
	@Override
	public String getPharmaDrugManufacturerAdd() {
		return model.getPharmaDrugManufacturerAdd();
	}

	/**
	 * Returns the pharma drug manufacturer name of this pharma manufacturer info.
	 *
	 * @return the pharma drug manufacturer name of this pharma manufacturer info
	 */
	@Override
	public String getPharmaDrugManufacturerName() {
		return model.getPharmaDrugManufacturerName();
	}

	/**
	 * Returns the pharma local dist address of this pharma manufacturer info.
	 *
	 * @return the pharma local dist address of this pharma manufacturer info
	 */
	@Override
	public String getPharmaLocalDistAddress() {
		return model.getPharmaLocalDistAddress();
	}

	/**
	 * Returns the pharma local dist contact of this pharma manufacturer info.
	 *
	 * @return the pharma local dist contact of this pharma manufacturer info
	 */
	@Override
	public String getPharmaLocalDistContact() {
		return model.getPharmaLocalDistContact();
	}

	/**
	 * Returns the pharma local dist name of this pharma manufacturer info.
	 *
	 * @return the pharma local dist name of this pharma manufacturer info
	 */
	@Override
	public String getPharmaLocalDistName() {
		return model.getPharmaLocalDistName();
	}

	/**
	 * Returns the pharma local repr add of this pharma manufacturer info.
	 *
	 * @return the pharma local repr add of this pharma manufacturer info
	 */
	@Override
	public String getPharmaLocalReprAdd() {
		return model.getPharmaLocalReprAdd();
	}

	/**
	 * Returns the pharma local repr contact of this pharma manufacturer info.
	 *
	 * @return the pharma local repr contact of this pharma manufacturer info
	 */
	@Override
	public String getPharmaLocalReprContact() {
		return model.getPharmaLocalReprContact();
	}

	/**
	 * Returns the pharma local repr name of this pharma manufacturer info.
	 *
	 * @return the pharma local repr name of this pharma manufacturer info
	 */
	@Override
	public String getPharmaLocalReprName() {
		return model.getPharmaLocalReprName();
	}

	/**
	 * Returns the pharma manufacturer info ID of this pharma manufacturer info.
	 *
	 * @return the pharma manufacturer info ID of this pharma manufacturer info
	 */
	@Override
	public long getPharmaManufacturerInfoId() {
		return model.getPharmaManufacturerInfoId();
	}

	/**
	 * Returns the pharma market auth address of this pharma manufacturer info.
	 *
	 * @return the pharma market auth address of this pharma manufacturer info
	 */
	@Override
	public String getPharmaMarketAuthAddress() {
		return model.getPharmaMarketAuthAddress();
	}

	/**
	 * Returns the pharma market auth name of this pharma manufacturer info.
	 *
	 * @return the pharma market auth name of this pharma manufacturer info
	 */
	@Override
	public String getPharmaMarketAuthName() {
		return model.getPharmaMarketAuthName();
	}

	/**
	 * Returns the pharma regu officer contact of this pharma manufacturer info.
	 *
	 * @return the pharma regu officer contact of this pharma manufacturer info
	 */
	@Override
	public String getPharmaReguOfficerContact() {
		return model.getPharmaReguOfficerContact();
	}

	/**
	 * Returns the pharma regu officer name of this pharma manufacturer info.
	 *
	 * @return the pharma regu officer name of this pharma manufacturer info
	 */
	@Override
	public String getPharmaReguOfficerName() {
		return model.getPharmaReguOfficerName();
	}

	/**
	 * Returns the primary key of this pharma manufacturer info.
	 *
	 * @return the primary key of this pharma manufacturer info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this pharma manufacturer info.
	 *
	 * @return the user ID of this pharma manufacturer info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma manufacturer info.
	 *
	 * @return the user name of this pharma manufacturer info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma manufacturer info.
	 *
	 * @return the user uuid of this pharma manufacturer info
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
	 * Sets the company ID of this pharma manufacturer info.
	 *
	 * @param companyId the company ID of this pharma manufacturer info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma manufacturer info.
	 *
	 * @param createDate the create date of this pharma manufacturer info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this pharma manufacturer info.
	 *
	 * @param groupId the group ID of this pharma manufacturer info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this pharma manufacturer info.
	 *
	 * @param modifiedDate the modified date of this pharma manufacturer info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pharma application ID of this pharma manufacturer info.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma manufacturer info
	 */
	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		model.setPharmaApplicationId(pharmaApplicationId);
	}

	/**
	 * Sets the pharma drug applic address of this pharma manufacturer info.
	 *
	 * @param pharmaDrugApplicAddress the pharma drug applic address of this pharma manufacturer info
	 */
	@Override
	public void setPharmaDrugApplicAddress(String pharmaDrugApplicAddress) {
		model.setPharmaDrugApplicAddress(pharmaDrugApplicAddress);
	}

	/**
	 * Sets the pharma drug applic name of this pharma manufacturer info.
	 *
	 * @param pharmaDrugApplicName the pharma drug applic name of this pharma manufacturer info
	 */
	@Override
	public void setPharmaDrugApplicName(String pharmaDrugApplicName) {
		model.setPharmaDrugApplicName(pharmaDrugApplicName);
	}

	/**
	 * Sets the pharma drug deisgnation of this pharma manufacturer info.
	 *
	 * @param pharmaDrugDeisgnation the pharma drug deisgnation of this pharma manufacturer info
	 */
	@Override
	public void setPharmaDrugDeisgnation(String pharmaDrugDeisgnation) {
		model.setPharmaDrugDeisgnation(pharmaDrugDeisgnation);
	}

	/**
	 * Sets the pharma drug manufacturer add of this pharma manufacturer info.
	 *
	 * @param pharmaDrugManufacturerAdd the pharma drug manufacturer add of this pharma manufacturer info
	 */
	@Override
	public void setPharmaDrugManufacturerAdd(String pharmaDrugManufacturerAdd) {
		model.setPharmaDrugManufacturerAdd(pharmaDrugManufacturerAdd);
	}

	/**
	 * Sets the pharma drug manufacturer name of this pharma manufacturer info.
	 *
	 * @param pharmaDrugManufacturerName the pharma drug manufacturer name of this pharma manufacturer info
	 */
	@Override
	public void setPharmaDrugManufacturerName(
		String pharmaDrugManufacturerName) {

		model.setPharmaDrugManufacturerName(pharmaDrugManufacturerName);
	}

	/**
	 * Sets the pharma local dist address of this pharma manufacturer info.
	 *
	 * @param pharmaLocalDistAddress the pharma local dist address of this pharma manufacturer info
	 */
	@Override
	public void setPharmaLocalDistAddress(String pharmaLocalDistAddress) {
		model.setPharmaLocalDistAddress(pharmaLocalDistAddress);
	}

	/**
	 * Sets the pharma local dist contact of this pharma manufacturer info.
	 *
	 * @param pharmaLocalDistContact the pharma local dist contact of this pharma manufacturer info
	 */
	@Override
	public void setPharmaLocalDistContact(String pharmaLocalDistContact) {
		model.setPharmaLocalDistContact(pharmaLocalDistContact);
	}

	/**
	 * Sets the pharma local dist name of this pharma manufacturer info.
	 *
	 * @param pharmaLocalDistName the pharma local dist name of this pharma manufacturer info
	 */
	@Override
	public void setPharmaLocalDistName(String pharmaLocalDistName) {
		model.setPharmaLocalDistName(pharmaLocalDistName);
	}

	/**
	 * Sets the pharma local repr add of this pharma manufacturer info.
	 *
	 * @param pharmaLocalReprAdd the pharma local repr add of this pharma manufacturer info
	 */
	@Override
	public void setPharmaLocalReprAdd(String pharmaLocalReprAdd) {
		model.setPharmaLocalReprAdd(pharmaLocalReprAdd);
	}

	/**
	 * Sets the pharma local repr contact of this pharma manufacturer info.
	 *
	 * @param pharmaLocalReprContact the pharma local repr contact of this pharma manufacturer info
	 */
	@Override
	public void setPharmaLocalReprContact(String pharmaLocalReprContact) {
		model.setPharmaLocalReprContact(pharmaLocalReprContact);
	}

	/**
	 * Sets the pharma local repr name of this pharma manufacturer info.
	 *
	 * @param pharmaLocalReprName the pharma local repr name of this pharma manufacturer info
	 */
	@Override
	public void setPharmaLocalReprName(String pharmaLocalReprName) {
		model.setPharmaLocalReprName(pharmaLocalReprName);
	}

	/**
	 * Sets the pharma manufacturer info ID of this pharma manufacturer info.
	 *
	 * @param pharmaManufacturerInfoId the pharma manufacturer info ID of this pharma manufacturer info
	 */
	@Override
	public void setPharmaManufacturerInfoId(long pharmaManufacturerInfoId) {
		model.setPharmaManufacturerInfoId(pharmaManufacturerInfoId);
	}

	/**
	 * Sets the pharma market auth address of this pharma manufacturer info.
	 *
	 * @param pharmaMarketAuthAddress the pharma market auth address of this pharma manufacturer info
	 */
	@Override
	public void setPharmaMarketAuthAddress(String pharmaMarketAuthAddress) {
		model.setPharmaMarketAuthAddress(pharmaMarketAuthAddress);
	}

	/**
	 * Sets the pharma market auth name of this pharma manufacturer info.
	 *
	 * @param pharmaMarketAuthName the pharma market auth name of this pharma manufacturer info
	 */
	@Override
	public void setPharmaMarketAuthName(String pharmaMarketAuthName) {
		model.setPharmaMarketAuthName(pharmaMarketAuthName);
	}

	/**
	 * Sets the pharma regu officer contact of this pharma manufacturer info.
	 *
	 * @param pharmaReguOfficerContact the pharma regu officer contact of this pharma manufacturer info
	 */
	@Override
	public void setPharmaReguOfficerContact(String pharmaReguOfficerContact) {
		model.setPharmaReguOfficerContact(pharmaReguOfficerContact);
	}

	/**
	 * Sets the pharma regu officer name of this pharma manufacturer info.
	 *
	 * @param pharmaReguOfficerName the pharma regu officer name of this pharma manufacturer info
	 */
	@Override
	public void setPharmaReguOfficerName(String pharmaReguOfficerName) {
		model.setPharmaReguOfficerName(pharmaReguOfficerName);
	}

	/**
	 * Sets the primary key of this pharma manufacturer info.
	 *
	 * @param primaryKey the primary key of this pharma manufacturer info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this pharma manufacturer info.
	 *
	 * @param userId the user ID of this pharma manufacturer info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma manufacturer info.
	 *
	 * @param userName the user name of this pharma manufacturer info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma manufacturer info.
	 *
	 * @param userUuid the user uuid of this pharma manufacturer info
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
	protected PharmaManufacturerInfoWrapper wrap(
		PharmaManufacturerInfo pharmaManufacturerInfo) {

		return new PharmaManufacturerInfoWrapper(pharmaManufacturerInfo);
	}

}