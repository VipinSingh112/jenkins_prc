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
 * This class is a wrapper for {@link QuarryInformaation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInformaation
 * @generated
 */
public class QuarryInformaationWrapper
	extends BaseModelWrapper<QuarryInformaation>
	implements ModelWrapper<QuarryInformaation>, QuarryInformaation {

	public QuarryInformaationWrapper(QuarryInformaation quarryInformaation) {
		super(quarryInformaation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("auarryInfoId", getAuarryInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("location", getLocation());
		attributes.put("district", getDistrict());
		attributes.put("parish", getParish());
		attributes.put("actualSizeOfQuary", getActualSizeOfQuary());
		attributes.put("hasQuarrySubmitted", getHasQuarrySubmitted());
		attributes.put("sixCopiesOfLocation", getSixCopiesOfLocation());
		attributes.put("legalAccessToLand", getLegalAccessToLand());
		attributes.put("ownerShipEnclosed", getOwnerShipEnclosed());
		attributes.put("adjacentPropOwner", getAdjacentPropOwner());
		attributes.put("measurement", getMeasurement());
		attributes.put("landOwnerName", getLandOwnerName());
		attributes.put("landOwnerAddress", getLandOwnerAddress());
		attributes.put("quarryApplicationId", getQuarryApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long auarryInfoId = (Long)attributes.get("auarryInfoId");

		if (auarryInfoId != null) {
			setAuarryInfoId(auarryInfoId);
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

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String district = (String)attributes.get("district");

		if (district != null) {
			setDistrict(district);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
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

		String measurement = (String)attributes.get("measurement");

		if (measurement != null) {
			setMeasurement(measurement);
		}

		String landOwnerName = (String)attributes.get("landOwnerName");

		if (landOwnerName != null) {
			setLandOwnerName(landOwnerName);
		}

		String landOwnerAddress = (String)attributes.get("landOwnerAddress");

		if (landOwnerAddress != null) {
			setLandOwnerAddress(landOwnerAddress);
		}

		Long quarryApplicationId = (Long)attributes.get("quarryApplicationId");

		if (quarryApplicationId != null) {
			setQuarryApplicationId(quarryApplicationId);
		}
	}

	@Override
	public QuarryInformaation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the actual size of quary of this quarry informaation.
	 *
	 * @return the actual size of quary of this quarry informaation
	 */
	@Override
	public String getActualSizeOfQuary() {
		return model.getActualSizeOfQuary();
	}

	/**
	 * Returns the adjacent prop owner of this quarry informaation.
	 *
	 * @return the adjacent prop owner of this quarry informaation
	 */
	@Override
	public String getAdjacentPropOwner() {
		return model.getAdjacentPropOwner();
	}

	/**
	 * Returns the auarry info ID of this quarry informaation.
	 *
	 * @return the auarry info ID of this quarry informaation
	 */
	@Override
	public long getAuarryInfoId() {
		return model.getAuarryInfoId();
	}

	/**
	 * Returns the company ID of this quarry informaation.
	 *
	 * @return the company ID of this quarry informaation
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quarry informaation.
	 *
	 * @return the create date of this quarry informaation
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the district of this quarry informaation.
	 *
	 * @return the district of this quarry informaation
	 */
	@Override
	public String getDistrict() {
		return model.getDistrict();
	}

	/**
	 * Returns the group ID of this quarry informaation.
	 *
	 * @return the group ID of this quarry informaation
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the has quarry submitted of this quarry informaation.
	 *
	 * @return the has quarry submitted of this quarry informaation
	 */
	@Override
	public String getHasQuarrySubmitted() {
		return model.getHasQuarrySubmitted();
	}

	/**
	 * Returns the land owner address of this quarry informaation.
	 *
	 * @return the land owner address of this quarry informaation
	 */
	@Override
	public String getLandOwnerAddress() {
		return model.getLandOwnerAddress();
	}

	/**
	 * Returns the land owner name of this quarry informaation.
	 *
	 * @return the land owner name of this quarry informaation
	 */
	@Override
	public String getLandOwnerName() {
		return model.getLandOwnerName();
	}

	/**
	 * Returns the legal access to land of this quarry informaation.
	 *
	 * @return the legal access to land of this quarry informaation
	 */
	@Override
	public String getLegalAccessToLand() {
		return model.getLegalAccessToLand();
	}

	/**
	 * Returns the location of this quarry informaation.
	 *
	 * @return the location of this quarry informaation
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the measurement of this quarry informaation.
	 *
	 * @return the measurement of this quarry informaation
	 */
	@Override
	public String getMeasurement() {
		return model.getMeasurement();
	}

	/**
	 * Returns the modified date of this quarry informaation.
	 *
	 * @return the modified date of this quarry informaation
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the owner ship enclosed of this quarry informaation.
	 *
	 * @return the owner ship enclosed of this quarry informaation
	 */
	@Override
	public String getOwnerShipEnclosed() {
		return model.getOwnerShipEnclosed();
	}

	/**
	 * Returns the parish of this quarry informaation.
	 *
	 * @return the parish of this quarry informaation
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this quarry informaation.
	 *
	 * @return the primary key of this quarry informaation
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quarry application ID of this quarry informaation.
	 *
	 * @return the quarry application ID of this quarry informaation
	 */
	@Override
	public long getQuarryApplicationId() {
		return model.getQuarryApplicationId();
	}

	/**
	 * Returns the six copies of location of this quarry informaation.
	 *
	 * @return the six copies of location of this quarry informaation
	 */
	@Override
	public String getSixCopiesOfLocation() {
		return model.getSixCopiesOfLocation();
	}

	/**
	 * Returns the user ID of this quarry informaation.
	 *
	 * @return the user ID of this quarry informaation
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quarry informaation.
	 *
	 * @return the user name of this quarry informaation
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quarry informaation.
	 *
	 * @return the user uuid of this quarry informaation
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
	 * Sets the actual size of quary of this quarry informaation.
	 *
	 * @param actualSizeOfQuary the actual size of quary of this quarry informaation
	 */
	@Override
	public void setActualSizeOfQuary(String actualSizeOfQuary) {
		model.setActualSizeOfQuary(actualSizeOfQuary);
	}

	/**
	 * Sets the adjacent prop owner of this quarry informaation.
	 *
	 * @param adjacentPropOwner the adjacent prop owner of this quarry informaation
	 */
	@Override
	public void setAdjacentPropOwner(String adjacentPropOwner) {
		model.setAdjacentPropOwner(adjacentPropOwner);
	}

	/**
	 * Sets the auarry info ID of this quarry informaation.
	 *
	 * @param auarryInfoId the auarry info ID of this quarry informaation
	 */
	@Override
	public void setAuarryInfoId(long auarryInfoId) {
		model.setAuarryInfoId(auarryInfoId);
	}

	/**
	 * Sets the company ID of this quarry informaation.
	 *
	 * @param companyId the company ID of this quarry informaation
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quarry informaation.
	 *
	 * @param createDate the create date of this quarry informaation
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the district of this quarry informaation.
	 *
	 * @param district the district of this quarry informaation
	 */
	@Override
	public void setDistrict(String district) {
		model.setDistrict(district);
	}

	/**
	 * Sets the group ID of this quarry informaation.
	 *
	 * @param groupId the group ID of this quarry informaation
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the has quarry submitted of this quarry informaation.
	 *
	 * @param hasQuarrySubmitted the has quarry submitted of this quarry informaation
	 */
	@Override
	public void setHasQuarrySubmitted(String hasQuarrySubmitted) {
		model.setHasQuarrySubmitted(hasQuarrySubmitted);
	}

	/**
	 * Sets the land owner address of this quarry informaation.
	 *
	 * @param landOwnerAddress the land owner address of this quarry informaation
	 */
	@Override
	public void setLandOwnerAddress(String landOwnerAddress) {
		model.setLandOwnerAddress(landOwnerAddress);
	}

	/**
	 * Sets the land owner name of this quarry informaation.
	 *
	 * @param landOwnerName the land owner name of this quarry informaation
	 */
	@Override
	public void setLandOwnerName(String landOwnerName) {
		model.setLandOwnerName(landOwnerName);
	}

	/**
	 * Sets the legal access to land of this quarry informaation.
	 *
	 * @param legalAccessToLand the legal access to land of this quarry informaation
	 */
	@Override
	public void setLegalAccessToLand(String legalAccessToLand) {
		model.setLegalAccessToLand(legalAccessToLand);
	}

	/**
	 * Sets the location of this quarry informaation.
	 *
	 * @param location the location of this quarry informaation
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the measurement of this quarry informaation.
	 *
	 * @param measurement the measurement of this quarry informaation
	 */
	@Override
	public void setMeasurement(String measurement) {
		model.setMeasurement(measurement);
	}

	/**
	 * Sets the modified date of this quarry informaation.
	 *
	 * @param modifiedDate the modified date of this quarry informaation
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the owner ship enclosed of this quarry informaation.
	 *
	 * @param ownerShipEnclosed the owner ship enclosed of this quarry informaation
	 */
	@Override
	public void setOwnerShipEnclosed(String ownerShipEnclosed) {
		model.setOwnerShipEnclosed(ownerShipEnclosed);
	}

	/**
	 * Sets the parish of this quarry informaation.
	 *
	 * @param parish the parish of this quarry informaation
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this quarry informaation.
	 *
	 * @param primaryKey the primary key of this quarry informaation
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quarry application ID of this quarry informaation.
	 *
	 * @param quarryApplicationId the quarry application ID of this quarry informaation
	 */
	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		model.setQuarryApplicationId(quarryApplicationId);
	}

	/**
	 * Sets the six copies of location of this quarry informaation.
	 *
	 * @param sixCopiesOfLocation the six copies of location of this quarry informaation
	 */
	@Override
	public void setSixCopiesOfLocation(String sixCopiesOfLocation) {
		model.setSixCopiesOfLocation(sixCopiesOfLocation);
	}

	/**
	 * Sets the user ID of this quarry informaation.
	 *
	 * @param userId the user ID of this quarry informaation
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quarry informaation.
	 *
	 * @param userName the user name of this quarry informaation
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quarry informaation.
	 *
	 * @param userUuid the user uuid of this quarry informaation
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
	protected QuarryInformaationWrapper wrap(
		QuarryInformaation quarryInformaation) {

		return new QuarryInformaationWrapper(quarryInformaation);
	}

}