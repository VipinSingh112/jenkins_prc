/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjPremisesLocation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPremisesLocation
 * @generated
 */
public class NcbjPremisesLocationWrapper
	extends BaseModelWrapper<NcbjPremisesLocation>
	implements ModelWrapper<NcbjPremisesLocation>, NcbjPremisesLocation {

	public NcbjPremisesLocationWrapper(
		NcbjPremisesLocation ncbjPremisesLocation) {

		super(ncbjPremisesLocation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjPremisesLocationId", getNcbjPremisesLocationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("transferReasonDraft", getTransferReasonDraft());
		attributes.put("activityExclusion", getActivityExclusion());
		attributes.put("transferReasonAct", getTransferReasonAct());
		attributes.put("productionFacilitySize", getProductionFacilitySize());
		attributes.put("warehouseFacilitySize", getWarehouseFacilitySize());
		attributes.put("facilitiesLocation", getFacilitiesLocation());
		attributes.put("detailForDiffManagement", getDetailForDiffManagement());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjPremisesLocationId = (Long)attributes.get(
			"ncbjPremisesLocationId");

		if (ncbjPremisesLocationId != null) {
			setNcbjPremisesLocationId(ncbjPremisesLocationId);
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

		String transferReasonDraft = (String)attributes.get(
			"transferReasonDraft");

		if (transferReasonDraft != null) {
			setTransferReasonDraft(transferReasonDraft);
		}

		String activityExclusion = (String)attributes.get("activityExclusion");

		if (activityExclusion != null) {
			setActivityExclusion(activityExclusion);
		}

		String transferReasonAct = (String)attributes.get("transferReasonAct");

		if (transferReasonAct != null) {
			setTransferReasonAct(transferReasonAct);
		}

		String productionFacilitySize = (String)attributes.get(
			"productionFacilitySize");

		if (productionFacilitySize != null) {
			setProductionFacilitySize(productionFacilitySize);
		}

		String warehouseFacilitySize = (String)attributes.get(
			"warehouseFacilitySize");

		if (warehouseFacilitySize != null) {
			setWarehouseFacilitySize(warehouseFacilitySize);
		}

		String facilitiesLocation = (String)attributes.get(
			"facilitiesLocation");

		if (facilitiesLocation != null) {
			setFacilitiesLocation(facilitiesLocation);
		}

		String detailForDiffManagement = (String)attributes.get(
			"detailForDiffManagement");

		if (detailForDiffManagement != null) {
			setDetailForDiffManagement(detailForDiffManagement);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjPremisesLocation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the activity exclusion of this ncbj premises location.
	 *
	 * @return the activity exclusion of this ncbj premises location
	 */
	@Override
	public String getActivityExclusion() {
		return model.getActivityExclusion();
	}

	/**
	 * Returns the company ID of this ncbj premises location.
	 *
	 * @return the company ID of this ncbj premises location
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj premises location.
	 *
	 * @return the create date of this ncbj premises location
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the detail for diff management of this ncbj premises location.
	 *
	 * @return the detail for diff management of this ncbj premises location
	 */
	@Override
	public String getDetailForDiffManagement() {
		return model.getDetailForDiffManagement();
	}

	/**
	 * Returns the facilities location of this ncbj premises location.
	 *
	 * @return the facilities location of this ncbj premises location
	 */
	@Override
	public String getFacilitiesLocation() {
		return model.getFacilitiesLocation();
	}

	/**
	 * Returns the group ID of this ncbj premises location.
	 *
	 * @return the group ID of this ncbj premises location
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj premises location.
	 *
	 * @return the modified date of this ncbj premises location
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj premises location.
	 *
	 * @return the ncbj application ID of this ncbj premises location
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj premises location ID of this ncbj premises location.
	 *
	 * @return the ncbj premises location ID of this ncbj premises location
	 */
	@Override
	public long getNcbjPremisesLocationId() {
		return model.getNcbjPremisesLocationId();
	}

	/**
	 * Returns the primary key of this ncbj premises location.
	 *
	 * @return the primary key of this ncbj premises location
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the production facility size of this ncbj premises location.
	 *
	 * @return the production facility size of this ncbj premises location
	 */
	@Override
	public String getProductionFacilitySize() {
		return model.getProductionFacilitySize();
	}

	/**
	 * Returns the transfer reason act of this ncbj premises location.
	 *
	 * @return the transfer reason act of this ncbj premises location
	 */
	@Override
	public String getTransferReasonAct() {
		return model.getTransferReasonAct();
	}

	/**
	 * Returns the transfer reason draft of this ncbj premises location.
	 *
	 * @return the transfer reason draft of this ncbj premises location
	 */
	@Override
	public String getTransferReasonDraft() {
		return model.getTransferReasonDraft();
	}

	/**
	 * Returns the user ID of this ncbj premises location.
	 *
	 * @return the user ID of this ncbj premises location
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj premises location.
	 *
	 * @return the user name of this ncbj premises location
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj premises location.
	 *
	 * @return the user uuid of this ncbj premises location
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the warehouse facility size of this ncbj premises location.
	 *
	 * @return the warehouse facility size of this ncbj premises location
	 */
	@Override
	public String getWarehouseFacilitySize() {
		return model.getWarehouseFacilitySize();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the activity exclusion of this ncbj premises location.
	 *
	 * @param activityExclusion the activity exclusion of this ncbj premises location
	 */
	@Override
	public void setActivityExclusion(String activityExclusion) {
		model.setActivityExclusion(activityExclusion);
	}

	/**
	 * Sets the company ID of this ncbj premises location.
	 *
	 * @param companyId the company ID of this ncbj premises location
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj premises location.
	 *
	 * @param createDate the create date of this ncbj premises location
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the detail for diff management of this ncbj premises location.
	 *
	 * @param detailForDiffManagement the detail for diff management of this ncbj premises location
	 */
	@Override
	public void setDetailForDiffManagement(String detailForDiffManagement) {
		model.setDetailForDiffManagement(detailForDiffManagement);
	}

	/**
	 * Sets the facilities location of this ncbj premises location.
	 *
	 * @param facilitiesLocation the facilities location of this ncbj premises location
	 */
	@Override
	public void setFacilitiesLocation(String facilitiesLocation) {
		model.setFacilitiesLocation(facilitiesLocation);
	}

	/**
	 * Sets the group ID of this ncbj premises location.
	 *
	 * @param groupId the group ID of this ncbj premises location
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj premises location.
	 *
	 * @param modifiedDate the modified date of this ncbj premises location
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj premises location.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj premises location
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj premises location ID of this ncbj premises location.
	 *
	 * @param ncbjPremisesLocationId the ncbj premises location ID of this ncbj premises location
	 */
	@Override
	public void setNcbjPremisesLocationId(long ncbjPremisesLocationId) {
		model.setNcbjPremisesLocationId(ncbjPremisesLocationId);
	}

	/**
	 * Sets the primary key of this ncbj premises location.
	 *
	 * @param primaryKey the primary key of this ncbj premises location
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the production facility size of this ncbj premises location.
	 *
	 * @param productionFacilitySize the production facility size of this ncbj premises location
	 */
	@Override
	public void setProductionFacilitySize(String productionFacilitySize) {
		model.setProductionFacilitySize(productionFacilitySize);
	}

	/**
	 * Sets the transfer reason act of this ncbj premises location.
	 *
	 * @param transferReasonAct the transfer reason act of this ncbj premises location
	 */
	@Override
	public void setTransferReasonAct(String transferReasonAct) {
		model.setTransferReasonAct(transferReasonAct);
	}

	/**
	 * Sets the transfer reason draft of this ncbj premises location.
	 *
	 * @param transferReasonDraft the transfer reason draft of this ncbj premises location
	 */
	@Override
	public void setTransferReasonDraft(String transferReasonDraft) {
		model.setTransferReasonDraft(transferReasonDraft);
	}

	/**
	 * Sets the user ID of this ncbj premises location.
	 *
	 * @param userId the user ID of this ncbj premises location
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj premises location.
	 *
	 * @param userName the user name of this ncbj premises location
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj premises location.
	 *
	 * @param userUuid the user uuid of this ncbj premises location
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the warehouse facility size of this ncbj premises location.
	 *
	 * @param warehouseFacilitySize the warehouse facility size of this ncbj premises location
	 */
	@Override
	public void setWarehouseFacilitySize(String warehouseFacilitySize) {
		model.setWarehouseFacilitySize(warehouseFacilitySize);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected NcbjPremisesLocationWrapper wrap(
		NcbjPremisesLocation ncbjPremisesLocation) {

		return new NcbjPremisesLocationWrapper(ncbjPremisesLocation);
	}

}