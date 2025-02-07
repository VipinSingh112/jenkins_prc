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
 * This class is a wrapper for {@link RadionuclideInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideInfo
 * @generated
 */
public class RadionuclideInfoWrapper
	extends BaseModelWrapper<RadionuclideInfo>
	implements ModelWrapper<RadionuclideInfo>, RadionuclideInfo {

	public RadionuclideInfoWrapper(RadionuclideInfo radionuclideInfo) {
		super(radionuclideInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("radionuclideInfoId", getRadionuclideInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("radionuclideDetails", getRadionuclideDetails());
		attributes.put("activityDetails", getActivityDetails());
		attributes.put("activityDetailBq", getActivityDetailBq());
		attributes.put("activityDate", getActivityDate());
		attributes.put("chemicalDetailsForm", getChemicalDetailsForm());
		attributes.put("serialNo", getSerialNo());
		attributes.put("sealedSource", getSealedSource());
		attributes.put("manufacturerDetails", getManufacturerDetails());
		attributes.put("modelNo", getModelNo());
		attributes.put("identificationNo", getIdentificationNo());
		attributes.put("statusDetails", getStatusDetails());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radionuclideInfoId = (Long)attributes.get("radionuclideInfoId");

		if (radionuclideInfoId != null) {
			setRadionuclideInfoId(radionuclideInfoId);
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

		String radionuclideDetails = (String)attributes.get(
			"radionuclideDetails");

		if (radionuclideDetails != null) {
			setRadionuclideDetails(radionuclideDetails);
		}

		String activityDetails = (String)attributes.get("activityDetails");

		if (activityDetails != null) {
			setActivityDetails(activityDetails);
		}

		String activityDetailBq = (String)attributes.get("activityDetailBq");

		if (activityDetailBq != null) {
			setActivityDetailBq(activityDetailBq);
		}

		Date activityDate = (Date)attributes.get("activityDate");

		if (activityDate != null) {
			setActivityDate(activityDate);
		}

		String chemicalDetailsForm = (String)attributes.get(
			"chemicalDetailsForm");

		if (chemicalDetailsForm != null) {
			setChemicalDetailsForm(chemicalDetailsForm);
		}

		String serialNo = (String)attributes.get("serialNo");

		if (serialNo != null) {
			setSerialNo(serialNo);
		}

		String sealedSource = (String)attributes.get("sealedSource");

		if (sealedSource != null) {
			setSealedSource(sealedSource);
		}

		String manufacturerDetails = (String)attributes.get(
			"manufacturerDetails");

		if (manufacturerDetails != null) {
			setManufacturerDetails(manufacturerDetails);
		}

		String modelNo = (String)attributes.get("modelNo");

		if (modelNo != null) {
			setModelNo(modelNo);
		}

		String identificationNo = (String)attributes.get("identificationNo");

		if (identificationNo != null) {
			setIdentificationNo(identificationNo);
		}

		String statusDetails = (String)attributes.get("statusDetails");

		if (statusDetails != null) {
			setStatusDetails(statusDetails);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public RadionuclideInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the activity date of this radionuclide info.
	 *
	 * @return the activity date of this radionuclide info
	 */
	@Override
	public Date getActivityDate() {
		return model.getActivityDate();
	}

	/**
	 * Returns the activity detail bq of this radionuclide info.
	 *
	 * @return the activity detail bq of this radionuclide info
	 */
	@Override
	public String getActivityDetailBq() {
		return model.getActivityDetailBq();
	}

	/**
	 * Returns the activity details of this radionuclide info.
	 *
	 * @return the activity details of this radionuclide info
	 */
	@Override
	public String getActivityDetails() {
		return model.getActivityDetails();
	}

	/**
	 * Returns the chemical details form of this radionuclide info.
	 *
	 * @return the chemical details form of this radionuclide info
	 */
	@Override
	public String getChemicalDetailsForm() {
		return model.getChemicalDetailsForm();
	}

	/**
	 * Returns the company ID of this radionuclide info.
	 *
	 * @return the company ID of this radionuclide info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this radionuclide info.
	 *
	 * @return the create date of this radionuclide info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this radionuclide info.
	 *
	 * @return the group ID of this radionuclide info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this radionuclide info.
	 *
	 * @return the hsra application ID of this radionuclide info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the identification no of this radionuclide info.
	 *
	 * @return the identification no of this radionuclide info
	 */
	@Override
	public String getIdentificationNo() {
		return model.getIdentificationNo();
	}

	/**
	 * Returns the manufacturer details of this radionuclide info.
	 *
	 * @return the manufacturer details of this radionuclide info
	 */
	@Override
	public String getManufacturerDetails() {
		return model.getManufacturerDetails();
	}

	/**
	 * Returns the model no of this radionuclide info.
	 *
	 * @return the model no of this radionuclide info
	 */
	@Override
	public String getModelNo() {
		return model.getModelNo();
	}

	/**
	 * Returns the modified date of this radionuclide info.
	 *
	 * @return the modified date of this radionuclide info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this radionuclide info.
	 *
	 * @return the primary key of this radionuclide info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the radionuclide details of this radionuclide info.
	 *
	 * @return the radionuclide details of this radionuclide info
	 */
	@Override
	public String getRadionuclideDetails() {
		return model.getRadionuclideDetails();
	}

	/**
	 * Returns the radionuclide info ID of this radionuclide info.
	 *
	 * @return the radionuclide info ID of this radionuclide info
	 */
	@Override
	public long getRadionuclideInfoId() {
		return model.getRadionuclideInfoId();
	}

	/**
	 * Returns the sealed source of this radionuclide info.
	 *
	 * @return the sealed source of this radionuclide info
	 */
	@Override
	public String getSealedSource() {
		return model.getSealedSource();
	}

	/**
	 * Returns the serial no of this radionuclide info.
	 *
	 * @return the serial no of this radionuclide info
	 */
	@Override
	public String getSerialNo() {
		return model.getSerialNo();
	}

	/**
	 * Returns the status details of this radionuclide info.
	 *
	 * @return the status details of this radionuclide info
	 */
	@Override
	public String getStatusDetails() {
		return model.getStatusDetails();
	}

	/**
	 * Returns the user ID of this radionuclide info.
	 *
	 * @return the user ID of this radionuclide info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this radionuclide info.
	 *
	 * @return the user name of this radionuclide info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this radionuclide info.
	 *
	 * @return the user uuid of this radionuclide info
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
	 * Sets the activity date of this radionuclide info.
	 *
	 * @param activityDate the activity date of this radionuclide info
	 */
	@Override
	public void setActivityDate(Date activityDate) {
		model.setActivityDate(activityDate);
	}

	/**
	 * Sets the activity detail bq of this radionuclide info.
	 *
	 * @param activityDetailBq the activity detail bq of this radionuclide info
	 */
	@Override
	public void setActivityDetailBq(String activityDetailBq) {
		model.setActivityDetailBq(activityDetailBq);
	}

	/**
	 * Sets the activity details of this radionuclide info.
	 *
	 * @param activityDetails the activity details of this radionuclide info
	 */
	@Override
	public void setActivityDetails(String activityDetails) {
		model.setActivityDetails(activityDetails);
	}

	/**
	 * Sets the chemical details form of this radionuclide info.
	 *
	 * @param chemicalDetailsForm the chemical details form of this radionuclide info
	 */
	@Override
	public void setChemicalDetailsForm(String chemicalDetailsForm) {
		model.setChemicalDetailsForm(chemicalDetailsForm);
	}

	/**
	 * Sets the company ID of this radionuclide info.
	 *
	 * @param companyId the company ID of this radionuclide info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this radionuclide info.
	 *
	 * @param createDate the create date of this radionuclide info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this radionuclide info.
	 *
	 * @param groupId the group ID of this radionuclide info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this radionuclide info.
	 *
	 * @param hsraApplicationId the hsra application ID of this radionuclide info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the identification no of this radionuclide info.
	 *
	 * @param identificationNo the identification no of this radionuclide info
	 */
	@Override
	public void setIdentificationNo(String identificationNo) {
		model.setIdentificationNo(identificationNo);
	}

	/**
	 * Sets the manufacturer details of this radionuclide info.
	 *
	 * @param manufacturerDetails the manufacturer details of this radionuclide info
	 */
	@Override
	public void setManufacturerDetails(String manufacturerDetails) {
		model.setManufacturerDetails(manufacturerDetails);
	}

	/**
	 * Sets the model no of this radionuclide info.
	 *
	 * @param modelNo the model no of this radionuclide info
	 */
	@Override
	public void setModelNo(String modelNo) {
		model.setModelNo(modelNo);
	}

	/**
	 * Sets the modified date of this radionuclide info.
	 *
	 * @param modifiedDate the modified date of this radionuclide info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this radionuclide info.
	 *
	 * @param primaryKey the primary key of this radionuclide info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the radionuclide details of this radionuclide info.
	 *
	 * @param radionuclideDetails the radionuclide details of this radionuclide info
	 */
	@Override
	public void setRadionuclideDetails(String radionuclideDetails) {
		model.setRadionuclideDetails(radionuclideDetails);
	}

	/**
	 * Sets the radionuclide info ID of this radionuclide info.
	 *
	 * @param radionuclideInfoId the radionuclide info ID of this radionuclide info
	 */
	@Override
	public void setRadionuclideInfoId(long radionuclideInfoId) {
		model.setRadionuclideInfoId(radionuclideInfoId);
	}

	/**
	 * Sets the sealed source of this radionuclide info.
	 *
	 * @param sealedSource the sealed source of this radionuclide info
	 */
	@Override
	public void setSealedSource(String sealedSource) {
		model.setSealedSource(sealedSource);
	}

	/**
	 * Sets the serial no of this radionuclide info.
	 *
	 * @param serialNo the serial no of this radionuclide info
	 */
	@Override
	public void setSerialNo(String serialNo) {
		model.setSerialNo(serialNo);
	}

	/**
	 * Sets the status details of this radionuclide info.
	 *
	 * @param statusDetails the status details of this radionuclide info
	 */
	@Override
	public void setStatusDetails(String statusDetails) {
		model.setStatusDetails(statusDetails);
	}

	/**
	 * Sets the user ID of this radionuclide info.
	 *
	 * @param userId the user ID of this radionuclide info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this radionuclide info.
	 *
	 * @param userName the user name of this radionuclide info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this radionuclide info.
	 *
	 * @param userUuid the user uuid of this radionuclide info
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
	protected RadionuclideInfoWrapper wrap(RadionuclideInfo radionuclideInfo) {
		return new RadionuclideInfoWrapper(radionuclideInfo);
	}

}