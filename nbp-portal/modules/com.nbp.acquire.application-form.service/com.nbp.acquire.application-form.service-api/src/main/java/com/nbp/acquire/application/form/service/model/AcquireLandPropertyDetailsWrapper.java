/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AcquireLandPropertyDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireLandPropertyDetails
 * @generated
 */
public class AcquireLandPropertyDetailsWrapper
	extends BaseModelWrapper<AcquireLandPropertyDetails>
	implements AcquireLandPropertyDetails,
			   ModelWrapper<AcquireLandPropertyDetails> {

	public AcquireLandPropertyDetailsWrapper(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		super(acquireLandPropertyDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"acquireLandPropertyDetailsId", getAcquireLandPropertyDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("landPropIdentified", getLandPropIdentified());
		attributes.put("landPropAddr", getLandPropAddr());
		attributes.put("landPropOccupation", getLandPropOccupation());
		attributes.put(
			"landPropOccupationPeriod", getLandPropOccupationPeriod());
		attributes.put("landPropTenureType", getLandPropTenureType());
		attributes.put("landPropDesiredLoc", getLandPropDesiredLoc());
		attributes.put("landPropProposedUse", getLandPropProposedUse());
		attributes.put(
			"landPropProposedUseOther", getLandPropProposedUseOther());
		attributes.put("landPropPropTenureType", getLandPropPropTenureType());
		attributes.put("landPropApplied", getLandPropApplied());
		attributes.put("landPropApplicationDate", getLandPropApplicationDate());
		attributes.put(
			"landPropExistingBuilding", getLandPropExistingBuilding());
		attributes.put(
			"landPropExistingBuildingOther",
			getLandPropExistingBuildingOther());
		attributes.put("landPropOwn", getLandPropOwn());
		attributes.put("landPropGovAcquired", getLandPropGovAcquired());
		attributes.put("landPropStateDetails", getLandPropStateDetails());
		attributes.put("landPropPaymentMethod", getLandPropPaymentMethod());
		attributes.put(
			"landPropPaymentMethodOther", getLandPropPaymentMethodOther());
		attributes.put("landPropComments", getLandPropComments());
		attributes.put("acquireApplicationId", getAcquireApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long acquireLandPropertyDetailsId = (Long)attributes.get(
			"acquireLandPropertyDetailsId");

		if (acquireLandPropertyDetailsId != null) {
			setAcquireLandPropertyDetailsId(acquireLandPropertyDetailsId);
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

		String landPropIdentified = (String)attributes.get(
			"landPropIdentified");

		if (landPropIdentified != null) {
			setLandPropIdentified(landPropIdentified);
		}

		String landPropAddr = (String)attributes.get("landPropAddr");

		if (landPropAddr != null) {
			setLandPropAddr(landPropAddr);
		}

		String landPropOccupation = (String)attributes.get(
			"landPropOccupation");

		if (landPropOccupation != null) {
			setLandPropOccupation(landPropOccupation);
		}

		String landPropOccupationPeriod = (String)attributes.get(
			"landPropOccupationPeriod");

		if (landPropOccupationPeriod != null) {
			setLandPropOccupationPeriod(landPropOccupationPeriod);
		}

		String landPropTenureType = (String)attributes.get(
			"landPropTenureType");

		if (landPropTenureType != null) {
			setLandPropTenureType(landPropTenureType);
		}

		String landPropDesiredLoc = (String)attributes.get(
			"landPropDesiredLoc");

		if (landPropDesiredLoc != null) {
			setLandPropDesiredLoc(landPropDesiredLoc);
		}

		String landPropProposedUse = (String)attributes.get(
			"landPropProposedUse");

		if (landPropProposedUse != null) {
			setLandPropProposedUse(landPropProposedUse);
		}

		String landPropProposedUseOther = (String)attributes.get(
			"landPropProposedUseOther");

		if (landPropProposedUseOther != null) {
			setLandPropProposedUseOther(landPropProposedUseOther);
		}

		String landPropPropTenureType = (String)attributes.get(
			"landPropPropTenureType");

		if (landPropPropTenureType != null) {
			setLandPropPropTenureType(landPropPropTenureType);
		}

		String landPropApplied = (String)attributes.get("landPropApplied");

		if (landPropApplied != null) {
			setLandPropApplied(landPropApplied);
		}

		Date landPropApplicationDate = (Date)attributes.get(
			"landPropApplicationDate");

		if (landPropApplicationDate != null) {
			setLandPropApplicationDate(landPropApplicationDate);
		}

		String landPropExistingBuilding = (String)attributes.get(
			"landPropExistingBuilding");

		if (landPropExistingBuilding != null) {
			setLandPropExistingBuilding(landPropExistingBuilding);
		}

		String landPropExistingBuildingOther = (String)attributes.get(
			"landPropExistingBuildingOther");

		if (landPropExistingBuildingOther != null) {
			setLandPropExistingBuildingOther(landPropExistingBuildingOther);
		}

		String landPropOwn = (String)attributes.get("landPropOwn");

		if (landPropOwn != null) {
			setLandPropOwn(landPropOwn);
		}

		String landPropGovAcquired = (String)attributes.get(
			"landPropGovAcquired");

		if (landPropGovAcquired != null) {
			setLandPropGovAcquired(landPropGovAcquired);
		}

		String landPropStateDetails = (String)attributes.get(
			"landPropStateDetails");

		if (landPropStateDetails != null) {
			setLandPropStateDetails(landPropStateDetails);
		}

		String landPropPaymentMethod = (String)attributes.get(
			"landPropPaymentMethod");

		if (landPropPaymentMethod != null) {
			setLandPropPaymentMethod(landPropPaymentMethod);
		}

		String landPropPaymentMethodOther = (String)attributes.get(
			"landPropPaymentMethodOther");

		if (landPropPaymentMethodOther != null) {
			setLandPropPaymentMethodOther(landPropPaymentMethodOther);
		}

		String landPropComments = (String)attributes.get("landPropComments");

		if (landPropComments != null) {
			setLandPropComments(landPropComments);
		}

		Long acquireApplicationId = (Long)attributes.get(
			"acquireApplicationId");

		if (acquireApplicationId != null) {
			setAcquireApplicationId(acquireApplicationId);
		}
	}

	@Override
	public AcquireLandPropertyDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the acquire application ID of this acquire land property details.
	 *
	 * @return the acquire application ID of this acquire land property details
	 */
	@Override
	public long getAcquireApplicationId() {
		return model.getAcquireApplicationId();
	}

	/**
	 * Returns the acquire land property details ID of this acquire land property details.
	 *
	 * @return the acquire land property details ID of this acquire land property details
	 */
	@Override
	public long getAcquireLandPropertyDetailsId() {
		return model.getAcquireLandPropertyDetailsId();
	}

	/**
	 * Returns the company ID of this acquire land property details.
	 *
	 * @return the company ID of this acquire land property details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this acquire land property details.
	 *
	 * @return the create date of this acquire land property details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this acquire land property details.
	 *
	 * @return the group ID of this acquire land property details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the land prop addr of this acquire land property details.
	 *
	 * @return the land prop addr of this acquire land property details
	 */
	@Override
	public String getLandPropAddr() {
		return model.getLandPropAddr();
	}

	/**
	 * Returns the land prop application date of this acquire land property details.
	 *
	 * @return the land prop application date of this acquire land property details
	 */
	@Override
	public Date getLandPropApplicationDate() {
		return model.getLandPropApplicationDate();
	}

	/**
	 * Returns the land prop applied of this acquire land property details.
	 *
	 * @return the land prop applied of this acquire land property details
	 */
	@Override
	public String getLandPropApplied() {
		return model.getLandPropApplied();
	}

	/**
	 * Returns the land prop comments of this acquire land property details.
	 *
	 * @return the land prop comments of this acquire land property details
	 */
	@Override
	public String getLandPropComments() {
		return model.getLandPropComments();
	}

	/**
	 * Returns the land prop desired loc of this acquire land property details.
	 *
	 * @return the land prop desired loc of this acquire land property details
	 */
	@Override
	public String getLandPropDesiredLoc() {
		return model.getLandPropDesiredLoc();
	}

	/**
	 * Returns the land prop existing building of this acquire land property details.
	 *
	 * @return the land prop existing building of this acquire land property details
	 */
	@Override
	public String getLandPropExistingBuilding() {
		return model.getLandPropExistingBuilding();
	}

	/**
	 * Returns the land prop existing building other of this acquire land property details.
	 *
	 * @return the land prop existing building other of this acquire land property details
	 */
	@Override
	public String getLandPropExistingBuildingOther() {
		return model.getLandPropExistingBuildingOther();
	}

	/**
	 * Returns the land prop gov acquired of this acquire land property details.
	 *
	 * @return the land prop gov acquired of this acquire land property details
	 */
	@Override
	public String getLandPropGovAcquired() {
		return model.getLandPropGovAcquired();
	}

	/**
	 * Returns the land prop identified of this acquire land property details.
	 *
	 * @return the land prop identified of this acquire land property details
	 */
	@Override
	public String getLandPropIdentified() {
		return model.getLandPropIdentified();
	}

	/**
	 * Returns the land prop occupation of this acquire land property details.
	 *
	 * @return the land prop occupation of this acquire land property details
	 */
	@Override
	public String getLandPropOccupation() {
		return model.getLandPropOccupation();
	}

	/**
	 * Returns the land prop occupation period of this acquire land property details.
	 *
	 * @return the land prop occupation period of this acquire land property details
	 */
	@Override
	public String getLandPropOccupationPeriod() {
		return model.getLandPropOccupationPeriod();
	}

	/**
	 * Returns the land prop own of this acquire land property details.
	 *
	 * @return the land prop own of this acquire land property details
	 */
	@Override
	public String getLandPropOwn() {
		return model.getLandPropOwn();
	}

	/**
	 * Returns the land prop payment method of this acquire land property details.
	 *
	 * @return the land prop payment method of this acquire land property details
	 */
	@Override
	public String getLandPropPaymentMethod() {
		return model.getLandPropPaymentMethod();
	}

	/**
	 * Returns the land prop payment method other of this acquire land property details.
	 *
	 * @return the land prop payment method other of this acquire land property details
	 */
	@Override
	public String getLandPropPaymentMethodOther() {
		return model.getLandPropPaymentMethodOther();
	}

	/**
	 * Returns the land prop proposed use of this acquire land property details.
	 *
	 * @return the land prop proposed use of this acquire land property details
	 */
	@Override
	public String getLandPropProposedUse() {
		return model.getLandPropProposedUse();
	}

	/**
	 * Returns the land prop proposed use other of this acquire land property details.
	 *
	 * @return the land prop proposed use other of this acquire land property details
	 */
	@Override
	public String getLandPropProposedUseOther() {
		return model.getLandPropProposedUseOther();
	}

	/**
	 * Returns the land prop prop tenure type of this acquire land property details.
	 *
	 * @return the land prop prop tenure type of this acquire land property details
	 */
	@Override
	public String getLandPropPropTenureType() {
		return model.getLandPropPropTenureType();
	}

	/**
	 * Returns the land prop state details of this acquire land property details.
	 *
	 * @return the land prop state details of this acquire land property details
	 */
	@Override
	public String getLandPropStateDetails() {
		return model.getLandPropStateDetails();
	}

	/**
	 * Returns the land prop tenure type of this acquire land property details.
	 *
	 * @return the land prop tenure type of this acquire land property details
	 */
	@Override
	public String getLandPropTenureType() {
		return model.getLandPropTenureType();
	}

	/**
	 * Returns the modified date of this acquire land property details.
	 *
	 * @return the modified date of this acquire land property details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this acquire land property details.
	 *
	 * @return the primary key of this acquire land property details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this acquire land property details.
	 *
	 * @return the user ID of this acquire land property details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this acquire land property details.
	 *
	 * @return the user name of this acquire land property details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this acquire land property details.
	 *
	 * @return the user uuid of this acquire land property details
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
	 * Sets the acquire application ID of this acquire land property details.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire land property details
	 */
	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		model.setAcquireApplicationId(acquireApplicationId);
	}

	/**
	 * Sets the acquire land property details ID of this acquire land property details.
	 *
	 * @param acquireLandPropertyDetailsId the acquire land property details ID of this acquire land property details
	 */
	@Override
	public void setAcquireLandPropertyDetailsId(
		long acquireLandPropertyDetailsId) {

		model.setAcquireLandPropertyDetailsId(acquireLandPropertyDetailsId);
	}

	/**
	 * Sets the company ID of this acquire land property details.
	 *
	 * @param companyId the company ID of this acquire land property details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this acquire land property details.
	 *
	 * @param createDate the create date of this acquire land property details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this acquire land property details.
	 *
	 * @param groupId the group ID of this acquire land property details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the land prop addr of this acquire land property details.
	 *
	 * @param landPropAddr the land prop addr of this acquire land property details
	 */
	@Override
	public void setLandPropAddr(String landPropAddr) {
		model.setLandPropAddr(landPropAddr);
	}

	/**
	 * Sets the land prop application date of this acquire land property details.
	 *
	 * @param landPropApplicationDate the land prop application date of this acquire land property details
	 */
	@Override
	public void setLandPropApplicationDate(Date landPropApplicationDate) {
		model.setLandPropApplicationDate(landPropApplicationDate);
	}

	/**
	 * Sets the land prop applied of this acquire land property details.
	 *
	 * @param landPropApplied the land prop applied of this acquire land property details
	 */
	@Override
	public void setLandPropApplied(String landPropApplied) {
		model.setLandPropApplied(landPropApplied);
	}

	/**
	 * Sets the land prop comments of this acquire land property details.
	 *
	 * @param landPropComments the land prop comments of this acquire land property details
	 */
	@Override
	public void setLandPropComments(String landPropComments) {
		model.setLandPropComments(landPropComments);
	}

	/**
	 * Sets the land prop desired loc of this acquire land property details.
	 *
	 * @param landPropDesiredLoc the land prop desired loc of this acquire land property details
	 */
	@Override
	public void setLandPropDesiredLoc(String landPropDesiredLoc) {
		model.setLandPropDesiredLoc(landPropDesiredLoc);
	}

	/**
	 * Sets the land prop existing building of this acquire land property details.
	 *
	 * @param landPropExistingBuilding the land prop existing building of this acquire land property details
	 */
	@Override
	public void setLandPropExistingBuilding(String landPropExistingBuilding) {
		model.setLandPropExistingBuilding(landPropExistingBuilding);
	}

	/**
	 * Sets the land prop existing building other of this acquire land property details.
	 *
	 * @param landPropExistingBuildingOther the land prop existing building other of this acquire land property details
	 */
	@Override
	public void setLandPropExistingBuildingOther(
		String landPropExistingBuildingOther) {

		model.setLandPropExistingBuildingOther(landPropExistingBuildingOther);
	}

	/**
	 * Sets the land prop gov acquired of this acquire land property details.
	 *
	 * @param landPropGovAcquired the land prop gov acquired of this acquire land property details
	 */
	@Override
	public void setLandPropGovAcquired(String landPropGovAcquired) {
		model.setLandPropGovAcquired(landPropGovAcquired);
	}

	/**
	 * Sets the land prop identified of this acquire land property details.
	 *
	 * @param landPropIdentified the land prop identified of this acquire land property details
	 */
	@Override
	public void setLandPropIdentified(String landPropIdentified) {
		model.setLandPropIdentified(landPropIdentified);
	}

	/**
	 * Sets the land prop occupation of this acquire land property details.
	 *
	 * @param landPropOccupation the land prop occupation of this acquire land property details
	 */
	@Override
	public void setLandPropOccupation(String landPropOccupation) {
		model.setLandPropOccupation(landPropOccupation);
	}

	/**
	 * Sets the land prop occupation period of this acquire land property details.
	 *
	 * @param landPropOccupationPeriod the land prop occupation period of this acquire land property details
	 */
	@Override
	public void setLandPropOccupationPeriod(String landPropOccupationPeriod) {
		model.setLandPropOccupationPeriod(landPropOccupationPeriod);
	}

	/**
	 * Sets the land prop own of this acquire land property details.
	 *
	 * @param landPropOwn the land prop own of this acquire land property details
	 */
	@Override
	public void setLandPropOwn(String landPropOwn) {
		model.setLandPropOwn(landPropOwn);
	}

	/**
	 * Sets the land prop payment method of this acquire land property details.
	 *
	 * @param landPropPaymentMethod the land prop payment method of this acquire land property details
	 */
	@Override
	public void setLandPropPaymentMethod(String landPropPaymentMethod) {
		model.setLandPropPaymentMethod(landPropPaymentMethod);
	}

	/**
	 * Sets the land prop payment method other of this acquire land property details.
	 *
	 * @param landPropPaymentMethodOther the land prop payment method other of this acquire land property details
	 */
	@Override
	public void setLandPropPaymentMethodOther(
		String landPropPaymentMethodOther) {

		model.setLandPropPaymentMethodOther(landPropPaymentMethodOther);
	}

	/**
	 * Sets the land prop proposed use of this acquire land property details.
	 *
	 * @param landPropProposedUse the land prop proposed use of this acquire land property details
	 */
	@Override
	public void setLandPropProposedUse(String landPropProposedUse) {
		model.setLandPropProposedUse(landPropProposedUse);
	}

	/**
	 * Sets the land prop proposed use other of this acquire land property details.
	 *
	 * @param landPropProposedUseOther the land prop proposed use other of this acquire land property details
	 */
	@Override
	public void setLandPropProposedUseOther(String landPropProposedUseOther) {
		model.setLandPropProposedUseOther(landPropProposedUseOther);
	}

	/**
	 * Sets the land prop prop tenure type of this acquire land property details.
	 *
	 * @param landPropPropTenureType the land prop prop tenure type of this acquire land property details
	 */
	@Override
	public void setLandPropPropTenureType(String landPropPropTenureType) {
		model.setLandPropPropTenureType(landPropPropTenureType);
	}

	/**
	 * Sets the land prop state details of this acquire land property details.
	 *
	 * @param landPropStateDetails the land prop state details of this acquire land property details
	 */
	@Override
	public void setLandPropStateDetails(String landPropStateDetails) {
		model.setLandPropStateDetails(landPropStateDetails);
	}

	/**
	 * Sets the land prop tenure type of this acquire land property details.
	 *
	 * @param landPropTenureType the land prop tenure type of this acquire land property details
	 */
	@Override
	public void setLandPropTenureType(String landPropTenureType) {
		model.setLandPropTenureType(landPropTenureType);
	}

	/**
	 * Sets the modified date of this acquire land property details.
	 *
	 * @param modifiedDate the modified date of this acquire land property details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this acquire land property details.
	 *
	 * @param primaryKey the primary key of this acquire land property details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this acquire land property details.
	 *
	 * @param userId the user ID of this acquire land property details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this acquire land property details.
	 *
	 * @param userName the user name of this acquire land property details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this acquire land property details.
	 *
	 * @param userUuid the user uuid of this acquire land property details
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
	protected AcquireLandPropertyDetailsWrapper wrap(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		return new AcquireLandPropertyDetailsWrapper(
			acquireLandPropertyDetails);
	}

}