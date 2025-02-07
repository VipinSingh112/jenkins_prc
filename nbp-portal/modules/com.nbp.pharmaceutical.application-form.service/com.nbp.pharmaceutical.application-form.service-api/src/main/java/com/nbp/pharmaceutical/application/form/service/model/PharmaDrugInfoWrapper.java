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
 * This class is a wrapper for {@link PharmaDrugInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDrugInfo
 * @generated
 */
public class PharmaDrugInfoWrapper
	extends BaseModelWrapper<PharmaDrugInfo>
	implements ModelWrapper<PharmaDrugInfo>, PharmaDrugInfo {

	public PharmaDrugInfoWrapper(PharmaDrugInfo pharmaDrugInfo) {
		super(pharmaDrugInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pharmaDrugInfoId", getPharmaDrugInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("pharmaDrugBrandName", getPharmaDrugBrandName());
		attributes.put("pharmaDrugDeisgnation", getPharmaDrugDeisgnation());
		attributes.put("pharmaDosageForm", getPharmaDosageForm());
		attributes.put(
			"pharmaAdministrationRoute", getPharmaAdministrationRoute());
		attributes.put("pharmaOriginDispensing", getPharmaOriginDispensing());
		attributes.put("pharmaLicenseHolderName", getPharmaLicenseHolderName());
		attributes.put(
			"pharmaLicenseHolderAddress", getPharmaLicenseHolderAddress());
		attributes.put("pharmaApplicationId", getPharmaApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaDrugInfoId = (Long)attributes.get("pharmaDrugInfoId");

		if (pharmaDrugInfoId != null) {
			setPharmaDrugInfoId(pharmaDrugInfoId);
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

		String pharmaDrugBrandName = (String)attributes.get(
			"pharmaDrugBrandName");

		if (pharmaDrugBrandName != null) {
			setPharmaDrugBrandName(pharmaDrugBrandName);
		}

		String pharmaDrugDeisgnation = (String)attributes.get(
			"pharmaDrugDeisgnation");

		if (pharmaDrugDeisgnation != null) {
			setPharmaDrugDeisgnation(pharmaDrugDeisgnation);
		}

		String pharmaDosageForm = (String)attributes.get("pharmaDosageForm");

		if (pharmaDosageForm != null) {
			setPharmaDosageForm(pharmaDosageForm);
		}

		String pharmaAdministrationRoute = (String)attributes.get(
			"pharmaAdministrationRoute");

		if (pharmaAdministrationRoute != null) {
			setPharmaAdministrationRoute(pharmaAdministrationRoute);
		}

		String pharmaOriginDispensing = (String)attributes.get(
			"pharmaOriginDispensing");

		if (pharmaOriginDispensing != null) {
			setPharmaOriginDispensing(pharmaOriginDispensing);
		}

		String pharmaLicenseHolderName = (String)attributes.get(
			"pharmaLicenseHolderName");

		if (pharmaLicenseHolderName != null) {
			setPharmaLicenseHolderName(pharmaLicenseHolderName);
		}

		String pharmaLicenseHolderAddress = (String)attributes.get(
			"pharmaLicenseHolderAddress");

		if (pharmaLicenseHolderAddress != null) {
			setPharmaLicenseHolderAddress(pharmaLicenseHolderAddress);
		}

		Long pharmaApplicationId = (Long)attributes.get("pharmaApplicationId");

		if (pharmaApplicationId != null) {
			setPharmaApplicationId(pharmaApplicationId);
		}
	}

	@Override
	public PharmaDrugInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this pharma drug info.
	 *
	 * @return the company ID of this pharma drug info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma drug info.
	 *
	 * @return the create date of this pharma drug info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this pharma drug info.
	 *
	 * @return the group ID of this pharma drug info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this pharma drug info.
	 *
	 * @return the modified date of this pharma drug info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pharma administration route of this pharma drug info.
	 *
	 * @return the pharma administration route of this pharma drug info
	 */
	@Override
	public String getPharmaAdministrationRoute() {
		return model.getPharmaAdministrationRoute();
	}

	/**
	 * Returns the pharma application ID of this pharma drug info.
	 *
	 * @return the pharma application ID of this pharma drug info
	 */
	@Override
	public long getPharmaApplicationId() {
		return model.getPharmaApplicationId();
	}

	/**
	 * Returns the pharma dosage form of this pharma drug info.
	 *
	 * @return the pharma dosage form of this pharma drug info
	 */
	@Override
	public String getPharmaDosageForm() {
		return model.getPharmaDosageForm();
	}

	/**
	 * Returns the pharma drug brand name of this pharma drug info.
	 *
	 * @return the pharma drug brand name of this pharma drug info
	 */
	@Override
	public String getPharmaDrugBrandName() {
		return model.getPharmaDrugBrandName();
	}

	/**
	 * Returns the pharma drug deisgnation of this pharma drug info.
	 *
	 * @return the pharma drug deisgnation of this pharma drug info
	 */
	@Override
	public String getPharmaDrugDeisgnation() {
		return model.getPharmaDrugDeisgnation();
	}

	/**
	 * Returns the pharma drug info ID of this pharma drug info.
	 *
	 * @return the pharma drug info ID of this pharma drug info
	 */
	@Override
	public long getPharmaDrugInfoId() {
		return model.getPharmaDrugInfoId();
	}

	/**
	 * Returns the pharma license holder address of this pharma drug info.
	 *
	 * @return the pharma license holder address of this pharma drug info
	 */
	@Override
	public String getPharmaLicenseHolderAddress() {
		return model.getPharmaLicenseHolderAddress();
	}

	/**
	 * Returns the pharma license holder name of this pharma drug info.
	 *
	 * @return the pharma license holder name of this pharma drug info
	 */
	@Override
	public String getPharmaLicenseHolderName() {
		return model.getPharmaLicenseHolderName();
	}

	/**
	 * Returns the pharma origin dispensing of this pharma drug info.
	 *
	 * @return the pharma origin dispensing of this pharma drug info
	 */
	@Override
	public String getPharmaOriginDispensing() {
		return model.getPharmaOriginDispensing();
	}

	/**
	 * Returns the primary key of this pharma drug info.
	 *
	 * @return the primary key of this pharma drug info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this pharma drug info.
	 *
	 * @return the user ID of this pharma drug info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma drug info.
	 *
	 * @return the user name of this pharma drug info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma drug info.
	 *
	 * @return the user uuid of this pharma drug info
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
	 * Sets the company ID of this pharma drug info.
	 *
	 * @param companyId the company ID of this pharma drug info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma drug info.
	 *
	 * @param createDate the create date of this pharma drug info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this pharma drug info.
	 *
	 * @param groupId the group ID of this pharma drug info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this pharma drug info.
	 *
	 * @param modifiedDate the modified date of this pharma drug info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pharma administration route of this pharma drug info.
	 *
	 * @param pharmaAdministrationRoute the pharma administration route of this pharma drug info
	 */
	@Override
	public void setPharmaAdministrationRoute(String pharmaAdministrationRoute) {
		model.setPharmaAdministrationRoute(pharmaAdministrationRoute);
	}

	/**
	 * Sets the pharma application ID of this pharma drug info.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma drug info
	 */
	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		model.setPharmaApplicationId(pharmaApplicationId);
	}

	/**
	 * Sets the pharma dosage form of this pharma drug info.
	 *
	 * @param pharmaDosageForm the pharma dosage form of this pharma drug info
	 */
	@Override
	public void setPharmaDosageForm(String pharmaDosageForm) {
		model.setPharmaDosageForm(pharmaDosageForm);
	}

	/**
	 * Sets the pharma drug brand name of this pharma drug info.
	 *
	 * @param pharmaDrugBrandName the pharma drug brand name of this pharma drug info
	 */
	@Override
	public void setPharmaDrugBrandName(String pharmaDrugBrandName) {
		model.setPharmaDrugBrandName(pharmaDrugBrandName);
	}

	/**
	 * Sets the pharma drug deisgnation of this pharma drug info.
	 *
	 * @param pharmaDrugDeisgnation the pharma drug deisgnation of this pharma drug info
	 */
	@Override
	public void setPharmaDrugDeisgnation(String pharmaDrugDeisgnation) {
		model.setPharmaDrugDeisgnation(pharmaDrugDeisgnation);
	}

	/**
	 * Sets the pharma drug info ID of this pharma drug info.
	 *
	 * @param pharmaDrugInfoId the pharma drug info ID of this pharma drug info
	 */
	@Override
	public void setPharmaDrugInfoId(long pharmaDrugInfoId) {
		model.setPharmaDrugInfoId(pharmaDrugInfoId);
	}

	/**
	 * Sets the pharma license holder address of this pharma drug info.
	 *
	 * @param pharmaLicenseHolderAddress the pharma license holder address of this pharma drug info
	 */
	@Override
	public void setPharmaLicenseHolderAddress(
		String pharmaLicenseHolderAddress) {

		model.setPharmaLicenseHolderAddress(pharmaLicenseHolderAddress);
	}

	/**
	 * Sets the pharma license holder name of this pharma drug info.
	 *
	 * @param pharmaLicenseHolderName the pharma license holder name of this pharma drug info
	 */
	@Override
	public void setPharmaLicenseHolderName(String pharmaLicenseHolderName) {
		model.setPharmaLicenseHolderName(pharmaLicenseHolderName);
	}

	/**
	 * Sets the pharma origin dispensing of this pharma drug info.
	 *
	 * @param pharmaOriginDispensing the pharma origin dispensing of this pharma drug info
	 */
	@Override
	public void setPharmaOriginDispensing(String pharmaOriginDispensing) {
		model.setPharmaOriginDispensing(pharmaOriginDispensing);
	}

	/**
	 * Sets the primary key of this pharma drug info.
	 *
	 * @param primaryKey the primary key of this pharma drug info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this pharma drug info.
	 *
	 * @param userId the user ID of this pharma drug info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma drug info.
	 *
	 * @param userName the user name of this pharma drug info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma drug info.
	 *
	 * @param userUuid the user uuid of this pharma drug info
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
	protected PharmaDrugInfoWrapper wrap(PharmaDrugInfo pharmaDrugInfo) {
		return new PharmaDrugInfoWrapper(pharmaDrugInfo);
	}

}