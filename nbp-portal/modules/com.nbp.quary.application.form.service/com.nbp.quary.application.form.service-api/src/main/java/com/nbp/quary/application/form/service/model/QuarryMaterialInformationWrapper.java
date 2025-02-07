/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QuarryMaterialInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformation
 * @generated
 */
public class QuarryMaterialInformationWrapper
	extends BaseModelWrapper<QuarryMaterialInformation>
	implements ModelWrapper<QuarryMaterialInformation>,
			   QuarryMaterialInformation {

	public QuarryMaterialInformationWrapper(
		QuarryMaterialInformation quarryMaterialInformation) {

		super(quarryMaterialInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("materialInfoId", getMaterialInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("typeOfMaterial", getTypeOfMaterial());
		attributes.put("reserveEstimate", getReserveEstimate());
		attributes.put("estimateDailyProd", getEstimateDailyProd());
		attributes.put("actualSizeOfQuary", getActualSizeOfQuary());
		attributes.put("hasQuarrySubmitted", getHasQuarrySubmitted());
		attributes.put("sixCopiesOfLocation", getSixCopiesOfLocation());
		attributes.put("legalAccessToLand", getLegalAccessToLand());
		attributes.put("ownerShipEnclosed", getOwnerShipEnclosed());
		attributes.put("adjacentPropOwner", getAdjacentPropOwner());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long materialInfoId = (Long)attributes.get("materialInfoId");

		if (materialInfoId != null) {
			setMaterialInfoId(materialInfoId);
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

		String typeOfMaterial = (String)attributes.get("typeOfMaterial");

		if (typeOfMaterial != null) {
			setTypeOfMaterial(typeOfMaterial);
		}

		String reserveEstimate = (String)attributes.get("reserveEstimate");

		if (reserveEstimate != null) {
			setReserveEstimate(reserveEstimate);
		}

		String estimateDailyProd = (String)attributes.get("estimateDailyProd");

		if (estimateDailyProd != null) {
			setEstimateDailyProd(estimateDailyProd);
		}

		String actualSizeOfQuary = (String)attributes.get("actualSizeOfQuary");

		if (actualSizeOfQuary != null) {
			setActualSizeOfQuary(actualSizeOfQuary);
		}

		String hasQuarrySubmitted = (String)attributes.get(
			"hasQuarrySubmitted");

		if (hasQuarrySubmitted != null) {
			setHasQuarrySubmitted(hasQuarrySubmitted);
		}

		String sixCopiesOfLocation = (String)attributes.get(
			"sixCopiesOfLocation");

		if (sixCopiesOfLocation != null) {
			setSixCopiesOfLocation(sixCopiesOfLocation);
		}

		String legalAccessToLand = (String)attributes.get("legalAccessToLand");

		if (legalAccessToLand != null) {
			setLegalAccessToLand(legalAccessToLand);
		}

		String ownerShipEnclosed = (String)attributes.get("ownerShipEnclosed");

		if (ownerShipEnclosed != null) {
			setOwnerShipEnclosed(ownerShipEnclosed);
		}

		String adjacentPropOwner = (String)attributes.get("adjacentPropOwner");

		if (adjacentPropOwner != null) {
			setAdjacentPropOwner(adjacentPropOwner);
		}

		Long quarryApplicationId = (Long)attributes.get("quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public QuarryMaterialInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the actual size of quary of this quarry material information.
	 *
	 * @return the actual size of quary of this quarry material information
	 */
	@Override
	public String getActualSizeOfQuary() {
		return model.getActualSizeOfQuary();
	}

	/**
	 * Returns the adjacent prop owner of this quarry material information.
	 *
	 * @return the adjacent prop owner of this quarry material information
	 */
	@Override
	public String getAdjacentPropOwner() {
		return model.getAdjacentPropOwner();
	}

	/**
	 * Returns the company ID of this quarry material information.
	 *
	 * @return the company ID of this quarry material information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quarry material information.
	 *
	 * @return the create date of this quarry material information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the estimate daily prod of this quarry material information.
	 *
	 * @return the estimate daily prod of this quarry material information
	 */
	@Override
	public String getEstimateDailyProd() {
		return model.getEstimateDailyProd();
	}

	/**
	 * Returns the group ID of this quarry material information.
	 *
	 * @return the group ID of this quarry material information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the has quarry submitted of this quarry material information.
	 *
	 * @return the has quarry submitted of this quarry material information
	 */
	@Override
	public String getHasQuarrySubmitted() {
		return model.getHasQuarrySubmitted();
	}

	/**
	 * Returns the legal access to land of this quarry material information.
	 *
	 * @return the legal access to land of this quarry material information
	 */
	@Override
	public String getLegalAccessToLand() {
		return model.getLegalAccessToLand();
	}

	/**
	 * Returns the material info ID of this quarry material information.
	 *
	 * @return the material info ID of this quarry material information
	 */
	@Override
	public long getMaterialInfoId() {
		return model.getMaterialInfoId();
	}

	/**
	 * Returns the modified date of this quarry material information.
	 *
	 * @return the modified date of this quarry material information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the owner ship enclosed of this quarry material information.
	 *
	 * @return the owner ship enclosed of this quarry material information
	 */
	@Override
	public String getOwnerShipEnclosed() {
		return model.getOwnerShipEnclosed();
	}

	/**
	 * Returns the primary key of this quarry material information.
	 *
	 * @return the primary key of this quarry material information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quarry application ID of this quarry material information.
	 *
	 * @return the quarry application ID of this quarry material information
	 */
	@Override
	public long getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the reserve estimate of this quarry material information.
	 *
	 * @return the reserve estimate of this quarry material information
	 */
	@Override
	public String getReserveEstimate() {
		return model.getReserveEstimate();
	}

	/**
	 * Returns the six copies of location of this quarry material information.
	 *
	 * @return the six copies of location of this quarry material information
	 */
	@Override
	public String getSixCopiesOfLocation() {
		return model.getSixCopiesOfLocation();
	}

	/**
	 * Returns the type of material of this quarry material information.
	 *
	 * @return the type of material of this quarry material information
	 */
	@Override
	public String getTypeOfMaterial() {
		return model.getTypeOfMaterial();
	}

	/**
	 * Returns the user ID of this quarry material information.
	 *
	 * @return the user ID of this quarry material information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quarry material information.
	 *
	 * @return the user name of this quarry material information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quarry material information.
	 *
	 * @return the user uuid of this quarry material information
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
	 * Sets the actual size of quary of this quarry material information.
	 *
	 * @param actualSizeOfQuary the actual size of quary of this quarry material information
	 */
	@Override
	public void setActualSizeOfQuary(String actualSizeOfQuary) {
		model.setActualSizeOfQuary(actualSizeOfQuary);
	}

	/**
	 * Sets the adjacent prop owner of this quarry material information.
	 *
	 * @param adjacentPropOwner the adjacent prop owner of this quarry material information
	 */
	@Override
	public void setAdjacentPropOwner(String adjacentPropOwner) {
		model.setAdjacentPropOwner(adjacentPropOwner);
	}

	/**
	 * Sets the company ID of this quarry material information.
	 *
	 * @param companyId the company ID of this quarry material information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quarry material information.
	 *
	 * @param createDate the create date of this quarry material information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the estimate daily prod of this quarry material information.
	 *
	 * @param estimateDailyProd the estimate daily prod of this quarry material information
	 */
	@Override
	public void setEstimateDailyProd(String estimateDailyProd) {
		model.setEstimateDailyProd(estimateDailyProd);
	}

	/**
	 * Sets the group ID of this quarry material information.
	 *
	 * @param groupId the group ID of this quarry material information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the has quarry submitted of this quarry material information.
	 *
	 * @param hasQuarrySubmitted the has quarry submitted of this quarry material information
	 */
	@Override
	public void setHasQuarrySubmitted(String hasQuarrySubmitted) {
		model.setHasQuarrySubmitted(hasQuarrySubmitted);
	}

	/**
	 * Sets the legal access to land of this quarry material information.
	 *
	 * @param legalAccessToLand the legal access to land of this quarry material information
	 */
	@Override
	public void setLegalAccessToLand(String legalAccessToLand) {
		model.setLegalAccessToLand(legalAccessToLand);
	}

	/**
	 * Sets the material info ID of this quarry material information.
	 *
	 * @param materialInfoId the material info ID of this quarry material information
	 */
	@Override
	public void setMaterialInfoId(long materialInfoId) {
		model.setMaterialInfoId(materialInfoId);
	}

	/**
	 * Sets the modified date of this quarry material information.
	 *
	 * @param modifiedDate the modified date of this quarry material information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the owner ship enclosed of this quarry material information.
	 *
	 * @param ownerShipEnclosed the owner ship enclosed of this quarry material information
	 */
	@Override
	public void setOwnerShipEnclosed(String ownerShipEnclosed) {
		model.setOwnerShipEnclosed(ownerShipEnclosed);
	}

	/**
	 * Sets the primary key of this quarry material information.
	 *
	 * @param primaryKey the primary key of this quarry material information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quarry application ID of this quarry material information.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry material information
	 */
	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the reserve estimate of this quarry material information.
	 *
	 * @param reserveEstimate the reserve estimate of this quarry material information
	 */
	@Override
	public void setReserveEstimate(String reserveEstimate) {
		model.setReserveEstimate(reserveEstimate);
	}

	/**
	 * Sets the six copies of location of this quarry material information.
	 *
	 * @param sixCopiesOfLocation the six copies of location of this quarry material information
	 */
	@Override
	public void setSixCopiesOfLocation(String sixCopiesOfLocation) {
		model.setSixCopiesOfLocation(sixCopiesOfLocation);
	}

	/**
	 * Sets the type of material of this quarry material information.
	 *
	 * @param typeOfMaterial the type of material of this quarry material information
	 */
	@Override
	public void setTypeOfMaterial(String typeOfMaterial) {
		model.setTypeOfMaterial(typeOfMaterial);
	}

	/**
	 * Sets the user ID of this quarry material information.
	 *
	 * @param userId the user ID of this quarry material information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quarry material information.
	 *
	 * @param userName the user name of this quarry material information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quarry material information.
	 *
	 * @param userUuid the user uuid of this quarry material information
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
	protected QuarryMaterialInformationWrapper wrap(
		QuarryMaterialInformation quarryMaterialInformation) {

		return new QuarryMaterialInformationWrapper(quarryMaterialInformation);
	}

}