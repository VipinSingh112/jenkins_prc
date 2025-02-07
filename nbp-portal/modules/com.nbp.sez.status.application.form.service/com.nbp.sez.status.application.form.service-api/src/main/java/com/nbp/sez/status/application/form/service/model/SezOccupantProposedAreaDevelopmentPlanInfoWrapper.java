/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezOccupantProposedAreaDevelopmentPlanInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantProposedAreaDevelopmentPlanInfo
 * @generated
 */
public class SezOccupantProposedAreaDevelopmentPlanInfoWrapper
	extends BaseModelWrapper<SezOccupantProposedAreaDevelopmentPlanInfo>
	implements ModelWrapper<SezOccupantProposedAreaDevelopmentPlanInfo>,
			   SezOccupantProposedAreaDevelopmentPlanInfo {

	public SezOccupantProposedAreaDevelopmentPlanInfoWrapper(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		super(sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccPropAreaId", getSezOccPropAreaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occProcessingArea", getOccProcessingArea());
		attributes.put("occNonProcessingArea", getOccNonProcessingArea());
		attributes.put("occOfficeRequirement", getOccOfficeRequirement());
		attributes.put("occFactoryRequirement", getOccFactoryRequirement());
		attributes.put("otherBuildUpRequirement", getOtherBuildUpRequirement());
		attributes.put("occOtherAreaReqName", getOccOtherAreaReqName());
		attributes.put("occOtherAreaRequirement", getOccOtherAreaRequirement());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccPropAreaId = (Long)attributes.get("sezOccPropAreaId");

		if (sezOccPropAreaId != null) {
			setSezOccPropAreaId(sezOccPropAreaId);
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

		String occProcessingArea = (String)attributes.get("occProcessingArea");

		if (occProcessingArea != null) {
			setOccProcessingArea(occProcessingArea);
		}

		String occNonProcessingArea = (String)attributes.get(
			"occNonProcessingArea");

		if (occNonProcessingArea != null) {
			setOccNonProcessingArea(occNonProcessingArea);
		}

		String occOfficeRequirement = (String)attributes.get(
			"occOfficeRequirement");

		if (occOfficeRequirement != null) {
			setOccOfficeRequirement(occOfficeRequirement);
		}

		String occFactoryRequirement = (String)attributes.get(
			"occFactoryRequirement");

		if (occFactoryRequirement != null) {
			setOccFactoryRequirement(occFactoryRequirement);
		}

		String otherBuildUpRequirement = (String)attributes.get(
			"otherBuildUpRequirement");

		if (otherBuildUpRequirement != null) {
			setOtherBuildUpRequirement(otherBuildUpRequirement);
		}

		String occOtherAreaReqName = (String)attributes.get(
			"occOtherAreaReqName");

		if (occOtherAreaReqName != null) {
			setOccOtherAreaReqName(occOtherAreaReqName);
		}

		String occOtherAreaRequirement = (String)attributes.get(
			"occOtherAreaRequirement");

		if (occOtherAreaRequirement != null) {
			setOccOtherAreaRequirement(occOtherAreaRequirement);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo
		cloneWithOriginalValues() {

		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant proposed area development plan info.
	 *
	 * @return the company ID of this sez occupant proposed area development plan info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant proposed area development plan info.
	 *
	 * @return the create date of this sez occupant proposed area development plan info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant proposed area development plan info.
	 *
	 * @return the group ID of this sez occupant proposed area development plan info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant proposed area development plan info.
	 *
	 * @return the modified date of this sez occupant proposed area development plan info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ factory requirement of this sez occupant proposed area development plan info.
	 *
	 * @return the occ factory requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public String getOccFactoryRequirement() {
		return model.getOccFactoryRequirement();
	}

	/**
	 * Returns the occ non processing area of this sez occupant proposed area development plan info.
	 *
	 * @return the occ non processing area of this sez occupant proposed area development plan info
	 */
	@Override
	public String getOccNonProcessingArea() {
		return model.getOccNonProcessingArea();
	}

	/**
	 * Returns the occ office requirement of this sez occupant proposed area development plan info.
	 *
	 * @return the occ office requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public String getOccOfficeRequirement() {
		return model.getOccOfficeRequirement();
	}

	/**
	 * Returns the occ other area req name of this sez occupant proposed area development plan info.
	 *
	 * @return the occ other area req name of this sez occupant proposed area development plan info
	 */
	@Override
	public String getOccOtherAreaReqName() {
		return model.getOccOtherAreaReqName();
	}

	/**
	 * Returns the occ other area requirement of this sez occupant proposed area development plan info.
	 *
	 * @return the occ other area requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public String getOccOtherAreaRequirement() {
		return model.getOccOtherAreaRequirement();
	}

	/**
	 * Returns the occ processing area of this sez occupant proposed area development plan info.
	 *
	 * @return the occ processing area of this sez occupant proposed area development plan info
	 */
	@Override
	public String getOccProcessingArea() {
		return model.getOccProcessingArea();
	}

	/**
	 * Returns the other build up requirement of this sez occupant proposed area development plan info.
	 *
	 * @return the other build up requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public String getOtherBuildUpRequirement() {
		return model.getOtherBuildUpRequirement();
	}

	/**
	 * Returns the primary key of this sez occupant proposed area development plan info.
	 *
	 * @return the primary key of this sez occupant proposed area development plan info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ prop area ID of this sez occupant proposed area development plan info.
	 *
	 * @return the sez occ prop area ID of this sez occupant proposed area development plan info
	 */
	@Override
	public long getSezOccPropAreaId() {
		return model.getSezOccPropAreaId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant proposed area development plan info.
	 *
	 * @return the sez status application ID of this sez occupant proposed area development plan info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant proposed area development plan info.
	 *
	 * @return the user ID of this sez occupant proposed area development plan info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant proposed area development plan info.
	 *
	 * @return the user name of this sez occupant proposed area development plan info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant proposed area development plan info.
	 *
	 * @return the user uuid of this sez occupant proposed area development plan info
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
	 * Sets the company ID of this sez occupant proposed area development plan info.
	 *
	 * @param companyId the company ID of this sez occupant proposed area development plan info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant proposed area development plan info.
	 *
	 * @param createDate the create date of this sez occupant proposed area development plan info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant proposed area development plan info.
	 *
	 * @param groupId the group ID of this sez occupant proposed area development plan info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant proposed area development plan info.
	 *
	 * @param modifiedDate the modified date of this sez occupant proposed area development plan info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ factory requirement of this sez occupant proposed area development plan info.
	 *
	 * @param occFactoryRequirement the occ factory requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public void setOccFactoryRequirement(String occFactoryRequirement) {
		model.setOccFactoryRequirement(occFactoryRequirement);
	}

	/**
	 * Sets the occ non processing area of this sez occupant proposed area development plan info.
	 *
	 * @param occNonProcessingArea the occ non processing area of this sez occupant proposed area development plan info
	 */
	@Override
	public void setOccNonProcessingArea(String occNonProcessingArea) {
		model.setOccNonProcessingArea(occNonProcessingArea);
	}

	/**
	 * Sets the occ office requirement of this sez occupant proposed area development plan info.
	 *
	 * @param occOfficeRequirement the occ office requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public void setOccOfficeRequirement(String occOfficeRequirement) {
		model.setOccOfficeRequirement(occOfficeRequirement);
	}

	/**
	 * Sets the occ other area req name of this sez occupant proposed area development plan info.
	 *
	 * @param occOtherAreaReqName the occ other area req name of this sez occupant proposed area development plan info
	 */
	@Override
	public void setOccOtherAreaReqName(String occOtherAreaReqName) {
		model.setOccOtherAreaReqName(occOtherAreaReqName);
	}

	/**
	 * Sets the occ other area requirement of this sez occupant proposed area development plan info.
	 *
	 * @param occOtherAreaRequirement the occ other area requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public void setOccOtherAreaRequirement(String occOtherAreaRequirement) {
		model.setOccOtherAreaRequirement(occOtherAreaRequirement);
	}

	/**
	 * Sets the occ processing area of this sez occupant proposed area development plan info.
	 *
	 * @param occProcessingArea the occ processing area of this sez occupant proposed area development plan info
	 */
	@Override
	public void setOccProcessingArea(String occProcessingArea) {
		model.setOccProcessingArea(occProcessingArea);
	}

	/**
	 * Sets the other build up requirement of this sez occupant proposed area development plan info.
	 *
	 * @param otherBuildUpRequirement the other build up requirement of this sez occupant proposed area development plan info
	 */
	@Override
	public void setOtherBuildUpRequirement(String otherBuildUpRequirement) {
		model.setOtherBuildUpRequirement(otherBuildUpRequirement);
	}

	/**
	 * Sets the primary key of this sez occupant proposed area development plan info.
	 *
	 * @param primaryKey the primary key of this sez occupant proposed area development plan info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ prop area ID of this sez occupant proposed area development plan info.
	 *
	 * @param sezOccPropAreaId the sez occ prop area ID of this sez occupant proposed area development plan info
	 */
	@Override
	public void setSezOccPropAreaId(long sezOccPropAreaId) {
		model.setSezOccPropAreaId(sezOccPropAreaId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant proposed area development plan info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant proposed area development plan info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant proposed area development plan info.
	 *
	 * @param userId the user ID of this sez occupant proposed area development plan info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant proposed area development plan info.
	 *
	 * @param userName the user name of this sez occupant proposed area development plan info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant proposed area development plan info.
	 *
	 * @param userUuid the user uuid of this sez occupant proposed area development plan info
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
	protected SezOccupantProposedAreaDevelopmentPlanInfoWrapper wrap(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		return new SezOccupantProposedAreaDevelopmentPlanInfoWrapper(
			sezOccupantProposedAreaDevelopmentPlanInfo);
	}

}