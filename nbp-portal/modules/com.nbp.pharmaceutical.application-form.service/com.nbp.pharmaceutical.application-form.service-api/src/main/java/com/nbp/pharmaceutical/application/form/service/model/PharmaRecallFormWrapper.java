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
 * This class is a wrapper for {@link PharmaRecallForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaRecallForm
 * @generated
 */
public class PharmaRecallFormWrapper
	extends BaseModelWrapper<PharmaRecallForm>
	implements ModelWrapper<PharmaRecallForm>, PharmaRecallForm {

	public PharmaRecallFormWrapper(PharmaRecallForm pharmaRecallForm) {
		super(pharmaRecallForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pharmaRecallFormId", getPharmaRecallFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfLicenseHolder", getNameOfLicenseHolder());
		attributes.put("dateOfRecall", getDateOfRecall());
		attributes.put("initiatedBy", getInitiatedBy());
		attributes.put("typeOfRecall", getTypeOfRecall());
		attributes.put("licenseNumber", getLicenseNumber());
		attributes.put("pharmaApplicationId", getPharmaApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pharmaRecallFormId = (Long)attributes.get("pharmaRecallFormId");

		if (pharmaRecallFormId != null) {
			setPharmaRecallFormId(pharmaRecallFormId);
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

		String nameOfLicenseHolder = (String)attributes.get(
			"nameOfLicenseHolder");

		if (nameOfLicenseHolder != null) {
			setNameOfLicenseHolder(nameOfLicenseHolder);
		}

		Date dateOfRecall = (Date)attributes.get("dateOfRecall");

		if (dateOfRecall != null) {
			setDateOfRecall(dateOfRecall);
		}

		String initiatedBy = (String)attributes.get("initiatedBy");

		if (initiatedBy != null) {
			setInitiatedBy(initiatedBy);
		}

		String typeOfRecall = (String)attributes.get("typeOfRecall");

		if (typeOfRecall != null) {
			setTypeOfRecall(typeOfRecall);
		}

		String licenseNumber = (String)attributes.get("licenseNumber");

		if (licenseNumber != null) {
			setLicenseNumber(licenseNumber);
		}

		Long pharmaApplicationId = (Long)attributes.get("pharmaApplicationId");

		if (pharmaApplicationId != null) {
			setPharmaApplicationId(pharmaApplicationId);
		}
	}

	@Override
	public PharmaRecallForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this pharma recall form.
	 *
	 * @return the company ID of this pharma recall form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this pharma recall form.
	 *
	 * @return the create date of this pharma recall form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of recall of this pharma recall form.
	 *
	 * @return the date of recall of this pharma recall form
	 */
	@Override
	public Date getDateOfRecall() {
		return model.getDateOfRecall();
	}

	/**
	 * Returns the group ID of this pharma recall form.
	 *
	 * @return the group ID of this pharma recall form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the initiated by of this pharma recall form.
	 *
	 * @return the initiated by of this pharma recall form
	 */
	@Override
	public String getInitiatedBy() {
		return model.getInitiatedBy();
	}

	/**
	 * Returns the license number of this pharma recall form.
	 *
	 * @return the license number of this pharma recall form
	 */
	@Override
	public String getLicenseNumber() {
		return model.getLicenseNumber();
	}

	/**
	 * Returns the modified date of this pharma recall form.
	 *
	 * @return the modified date of this pharma recall form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of license holder of this pharma recall form.
	 *
	 * @return the name of license holder of this pharma recall form
	 */
	@Override
	public String getNameOfLicenseHolder() {
		return model.getNameOfLicenseHolder();
	}

	/**
	 * Returns the pharma application ID of this pharma recall form.
	 *
	 * @return the pharma application ID of this pharma recall form
	 */
	@Override
	public long getPharmaApplicationId() {
		return model.getPharmaApplicationId();
	}

	/**
	 * Returns the pharma recall form ID of this pharma recall form.
	 *
	 * @return the pharma recall form ID of this pharma recall form
	 */
	@Override
	public long getPharmaRecallFormId() {
		return model.getPharmaRecallFormId();
	}

	/**
	 * Returns the primary key of this pharma recall form.
	 *
	 * @return the primary key of this pharma recall form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of recall of this pharma recall form.
	 *
	 * @return the type of recall of this pharma recall form
	 */
	@Override
	public String getTypeOfRecall() {
		return model.getTypeOfRecall();
	}

	/**
	 * Returns the user ID of this pharma recall form.
	 *
	 * @return the user ID of this pharma recall form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pharma recall form.
	 *
	 * @return the user name of this pharma recall form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pharma recall form.
	 *
	 * @return the user uuid of this pharma recall form
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
	 * Sets the company ID of this pharma recall form.
	 *
	 * @param companyId the company ID of this pharma recall form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this pharma recall form.
	 *
	 * @param createDate the create date of this pharma recall form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of recall of this pharma recall form.
	 *
	 * @param dateOfRecall the date of recall of this pharma recall form
	 */
	@Override
	public void setDateOfRecall(Date dateOfRecall) {
		model.setDateOfRecall(dateOfRecall);
	}

	/**
	 * Sets the group ID of this pharma recall form.
	 *
	 * @param groupId the group ID of this pharma recall form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the initiated by of this pharma recall form.
	 *
	 * @param initiatedBy the initiated by of this pharma recall form
	 */
	@Override
	public void setInitiatedBy(String initiatedBy) {
		model.setInitiatedBy(initiatedBy);
	}

	/**
	 * Sets the license number of this pharma recall form.
	 *
	 * @param licenseNumber the license number of this pharma recall form
	 */
	@Override
	public void setLicenseNumber(String licenseNumber) {
		model.setLicenseNumber(licenseNumber);
	}

	/**
	 * Sets the modified date of this pharma recall form.
	 *
	 * @param modifiedDate the modified date of this pharma recall form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of license holder of this pharma recall form.
	 *
	 * @param nameOfLicenseHolder the name of license holder of this pharma recall form
	 */
	@Override
	public void setNameOfLicenseHolder(String nameOfLicenseHolder) {
		model.setNameOfLicenseHolder(nameOfLicenseHolder);
	}

	/**
	 * Sets the pharma application ID of this pharma recall form.
	 *
	 * @param pharmaApplicationId the pharma application ID of this pharma recall form
	 */
	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		model.setPharmaApplicationId(pharmaApplicationId);
	}

	/**
	 * Sets the pharma recall form ID of this pharma recall form.
	 *
	 * @param pharmaRecallFormId the pharma recall form ID of this pharma recall form
	 */
	@Override
	public void setPharmaRecallFormId(long pharmaRecallFormId) {
		model.setPharmaRecallFormId(pharmaRecallFormId);
	}

	/**
	 * Sets the primary key of this pharma recall form.
	 *
	 * @param primaryKey the primary key of this pharma recall form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of recall of this pharma recall form.
	 *
	 * @param typeOfRecall the type of recall of this pharma recall form
	 */
	@Override
	public void setTypeOfRecall(String typeOfRecall) {
		model.setTypeOfRecall(typeOfRecall);
	}

	/**
	 * Sets the user ID of this pharma recall form.
	 *
	 * @param userId the user ID of this pharma recall form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pharma recall form.
	 *
	 * @param userName the user name of this pharma recall form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pharma recall form.
	 *
	 * @param userUuid the user uuid of this pharma recall form
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
	protected PharmaRecallFormWrapper wrap(PharmaRecallForm pharmaRecallForm) {
		return new PharmaRecallFormWrapper(pharmaRecallForm);
	}

}