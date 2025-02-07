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
 * This class is a wrapper for {@link SezZoneProposedProjectInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneProposedProjectInfo
 * @generated
 */
public class SezZoneProposedProjectInfoWrapper
	extends BaseModelWrapper<SezZoneProposedProjectInfo>
	implements ModelWrapper<SezZoneProposedProjectInfo>,
			   SezZoneProposedProjectInfo {

	public SezZoneProposedProjectInfoWrapper(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		super(sezZoneProposedProjectInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezZoneProposedProjectInfoId", getSezZoneProposedProjectInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityDeniedApproval", getEntityDeniedApproval());
		attributes.put("deniedApprovalDate", getDeniedApprovalDate());
		attributes.put(
			"deniedApprovalProjectType", getDeniedApprovalProjectType());
		attributes.put("freeZoneLocation", getFreeZoneLocation());
		attributes.put("leasedBuildingNum", getLeasedBuildingNum());
		attributes.put("leasedTown", getLeasedTown());
		attributes.put("leasedParish", getLeasedParish());
		attributes.put("leaseYears", getLeaseYears());
		attributes.put("volume", getVolume());
		attributes.put("folio", getFolio());
		attributes.put("floorNum", getFloorNum());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneProposedProjectInfoId = (Long)attributes.get(
			"sezZoneProposedProjectInfoId");

		if (sezZoneProposedProjectInfoId != null) {
			setSezZoneProposedProjectInfoId(sezZoneProposedProjectInfoId);
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

		String entityDeniedApproval = (String)attributes.get(
			"entityDeniedApproval");

		if (entityDeniedApproval != null) {
			setEntityDeniedApproval(entityDeniedApproval);
		}

		Date deniedApprovalDate = (Date)attributes.get("deniedApprovalDate");

		if (deniedApprovalDate != null) {
			setDeniedApprovalDate(deniedApprovalDate);
		}

		String deniedApprovalProjectType = (String)attributes.get(
			"deniedApprovalProjectType");

		if (deniedApprovalProjectType != null) {
			setDeniedApprovalProjectType(deniedApprovalProjectType);
		}

		String freeZoneLocation = (String)attributes.get("freeZoneLocation");

		if (freeZoneLocation != null) {
			setFreeZoneLocation(freeZoneLocation);
		}

		String leasedBuildingNum = (String)attributes.get("leasedBuildingNum");

		if (leasedBuildingNum != null) {
			setLeasedBuildingNum(leasedBuildingNum);
		}

		String leasedTown = (String)attributes.get("leasedTown");

		if (leasedTown != null) {
			setLeasedTown(leasedTown);
		}

		String leasedParish = (String)attributes.get("leasedParish");

		if (leasedParish != null) {
			setLeasedParish(leasedParish);
		}

		String leaseYears = (String)attributes.get("leaseYears");

		if (leaseYears != null) {
			setLeaseYears(leaseYears);
		}

		String volume = (String)attributes.get("volume");

		if (volume != null) {
			setVolume(volume);
		}

		String folio = (String)attributes.get("folio");

		if (folio != null) {
			setFolio(folio);
		}

		String floorNum = (String)attributes.get("floorNum");

		if (floorNum != null) {
			setFloorNum(floorNum);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezZoneProposedProjectInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez zone proposed project info.
	 *
	 * @return the company ID of this sez zone proposed project info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez zone proposed project info.
	 *
	 * @return the create date of this sez zone proposed project info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the denied approval date of this sez zone proposed project info.
	 *
	 * @return the denied approval date of this sez zone proposed project info
	 */
	@Override
	public Date getDeniedApprovalDate() {
		return model.getDeniedApprovalDate();
	}

	/**
	 * Returns the denied approval project type of this sez zone proposed project info.
	 *
	 * @return the denied approval project type of this sez zone proposed project info
	 */
	@Override
	public String getDeniedApprovalProjectType() {
		return model.getDeniedApprovalProjectType();
	}

	/**
	 * Returns the entity denied approval of this sez zone proposed project info.
	 *
	 * @return the entity denied approval of this sez zone proposed project info
	 */
	@Override
	public String getEntityDeniedApproval() {
		return model.getEntityDeniedApproval();
	}

	/**
	 * Returns the floor num of this sez zone proposed project info.
	 *
	 * @return the floor num of this sez zone proposed project info
	 */
	@Override
	public String getFloorNum() {
		return model.getFloorNum();
	}

	/**
	 * Returns the folio of this sez zone proposed project info.
	 *
	 * @return the folio of this sez zone proposed project info
	 */
	@Override
	public String getFolio() {
		return model.getFolio();
	}

	/**
	 * Returns the free zone location of this sez zone proposed project info.
	 *
	 * @return the free zone location of this sez zone proposed project info
	 */
	@Override
	public String getFreeZoneLocation() {
		return model.getFreeZoneLocation();
	}

	/**
	 * Returns the group ID of this sez zone proposed project info.
	 *
	 * @return the group ID of this sez zone proposed project info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the leased building num of this sez zone proposed project info.
	 *
	 * @return the leased building num of this sez zone proposed project info
	 */
	@Override
	public String getLeasedBuildingNum() {
		return model.getLeasedBuildingNum();
	}

	/**
	 * Returns the leased parish of this sez zone proposed project info.
	 *
	 * @return the leased parish of this sez zone proposed project info
	 */
	@Override
	public String getLeasedParish() {
		return model.getLeasedParish();
	}

	/**
	 * Returns the leased town of this sez zone proposed project info.
	 *
	 * @return the leased town of this sez zone proposed project info
	 */
	@Override
	public String getLeasedTown() {
		return model.getLeasedTown();
	}

	/**
	 * Returns the lease years of this sez zone proposed project info.
	 *
	 * @return the lease years of this sez zone proposed project info
	 */
	@Override
	public String getLeaseYears() {
		return model.getLeaseYears();
	}

	/**
	 * Returns the modified date of this sez zone proposed project info.
	 *
	 * @return the modified date of this sez zone proposed project info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez zone proposed project info.
	 *
	 * @return the primary key of this sez zone proposed project info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez zone proposed project info.
	 *
	 * @return the sez status application ID of this sez zone proposed project info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone proposed project info ID of this sez zone proposed project info.
	 *
	 * @return the sez zone proposed project info ID of this sez zone proposed project info
	 */
	@Override
	public long getSezZoneProposedProjectInfoId() {
		return model.getSezZoneProposedProjectInfoId();
	}

	/**
	 * Returns the user ID of this sez zone proposed project info.
	 *
	 * @return the user ID of this sez zone proposed project info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone proposed project info.
	 *
	 * @return the user name of this sez zone proposed project info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone proposed project info.
	 *
	 * @return the user uuid of this sez zone proposed project info
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the volume of this sez zone proposed project info.
	 *
	 * @return the volume of this sez zone proposed project info
	 */
	@Override
	public String getVolume() {
		return model.getVolume();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this sez zone proposed project info.
	 *
	 * @param companyId the company ID of this sez zone proposed project info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez zone proposed project info.
	 *
	 * @param createDate the create date of this sez zone proposed project info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the denied approval date of this sez zone proposed project info.
	 *
	 * @param deniedApprovalDate the denied approval date of this sez zone proposed project info
	 */
	@Override
	public void setDeniedApprovalDate(Date deniedApprovalDate) {
		model.setDeniedApprovalDate(deniedApprovalDate);
	}

	/**
	 * Sets the denied approval project type of this sez zone proposed project info.
	 *
	 * @param deniedApprovalProjectType the denied approval project type of this sez zone proposed project info
	 */
	@Override
	public void setDeniedApprovalProjectType(String deniedApprovalProjectType) {
		model.setDeniedApprovalProjectType(deniedApprovalProjectType);
	}

	/**
	 * Sets the entity denied approval of this sez zone proposed project info.
	 *
	 * @param entityDeniedApproval the entity denied approval of this sez zone proposed project info
	 */
	@Override
	public void setEntityDeniedApproval(String entityDeniedApproval) {
		model.setEntityDeniedApproval(entityDeniedApproval);
	}

	/**
	 * Sets the floor num of this sez zone proposed project info.
	 *
	 * @param floorNum the floor num of this sez zone proposed project info
	 */
	@Override
	public void setFloorNum(String floorNum) {
		model.setFloorNum(floorNum);
	}

	/**
	 * Sets the folio of this sez zone proposed project info.
	 *
	 * @param folio the folio of this sez zone proposed project info
	 */
	@Override
	public void setFolio(String folio) {
		model.setFolio(folio);
	}

	/**
	 * Sets the free zone location of this sez zone proposed project info.
	 *
	 * @param freeZoneLocation the free zone location of this sez zone proposed project info
	 */
	@Override
	public void setFreeZoneLocation(String freeZoneLocation) {
		model.setFreeZoneLocation(freeZoneLocation);
	}

	/**
	 * Sets the group ID of this sez zone proposed project info.
	 *
	 * @param groupId the group ID of this sez zone proposed project info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the leased building num of this sez zone proposed project info.
	 *
	 * @param leasedBuildingNum the leased building num of this sez zone proposed project info
	 */
	@Override
	public void setLeasedBuildingNum(String leasedBuildingNum) {
		model.setLeasedBuildingNum(leasedBuildingNum);
	}

	/**
	 * Sets the leased parish of this sez zone proposed project info.
	 *
	 * @param leasedParish the leased parish of this sez zone proposed project info
	 */
	@Override
	public void setLeasedParish(String leasedParish) {
		model.setLeasedParish(leasedParish);
	}

	/**
	 * Sets the leased town of this sez zone proposed project info.
	 *
	 * @param leasedTown the leased town of this sez zone proposed project info
	 */
	@Override
	public void setLeasedTown(String leasedTown) {
		model.setLeasedTown(leasedTown);
	}

	/**
	 * Sets the lease years of this sez zone proposed project info.
	 *
	 * @param leaseYears the lease years of this sez zone proposed project info
	 */
	@Override
	public void setLeaseYears(String leaseYears) {
		model.setLeaseYears(leaseYears);
	}

	/**
	 * Sets the modified date of this sez zone proposed project info.
	 *
	 * @param modifiedDate the modified date of this sez zone proposed project info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez zone proposed project info.
	 *
	 * @param primaryKey the primary key of this sez zone proposed project info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez zone proposed project info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone proposed project info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone proposed project info ID of this sez zone proposed project info.
	 *
	 * @param sezZoneProposedProjectInfoId the sez zone proposed project info ID of this sez zone proposed project info
	 */
	@Override
	public void setSezZoneProposedProjectInfoId(
		long sezZoneProposedProjectInfoId) {

		model.setSezZoneProposedProjectInfoId(sezZoneProposedProjectInfoId);
	}

	/**
	 * Sets the user ID of this sez zone proposed project info.
	 *
	 * @param userId the user ID of this sez zone proposed project info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone proposed project info.
	 *
	 * @param userName the user name of this sez zone proposed project info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone proposed project info.
	 *
	 * @param userUuid the user uuid of this sez zone proposed project info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the volume of this sez zone proposed project info.
	 *
	 * @param volume the volume of this sez zone proposed project info
	 */
	@Override
	public void setVolume(String volume) {
		model.setVolume(volume);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected SezZoneProposedProjectInfoWrapper wrap(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		return new SezZoneProposedProjectInfoWrapper(
			sezZoneProposedProjectInfo);
	}

}