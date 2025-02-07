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
 * This class is a wrapper for {@link NcbjSectionTwo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionTwo
 * @generated
 */
public class NcbjSectionTwoWrapper
	extends BaseModelWrapper<NcbjSectionTwo>
	implements ModelWrapper<NcbjSectionTwo>, NcbjSectionTwo {

	public NcbjSectionTwoWrapper(NcbjSectionTwo ncbjSectionTwo) {
		super(ncbjSectionTwo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjSectionTwoId", getNcbjSectionTwoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("incomingMaterials", getIncomingMaterials());
		attributes.put("productStorage", getProductStorage());
		attributes.put("buildingSiteAspects", getBuildingSiteAspects());
		attributes.put("wasteDischarges", getWasteDischarges());
		attributes.put("transportDetails", getTransportDetails());
		attributes.put("subcontractedActivities", getSubcontractedActivities());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjSectionTwoId = (Long)attributes.get("ncbjSectionTwoId");

		if (ncbjSectionTwoId != null) {
			setNcbjSectionTwoId(ncbjSectionTwoId);
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

		String incomingMaterials = (String)attributes.get("incomingMaterials");

		if (incomingMaterials != null) {
			setIncomingMaterials(incomingMaterials);
		}

		String productStorage = (String)attributes.get("productStorage");

		if (productStorage != null) {
			setProductStorage(productStorage);
		}

		String buildingSiteAspects = (String)attributes.get(
			"buildingSiteAspects");

		if (buildingSiteAspects != null) {
			setBuildingSiteAspects(buildingSiteAspects);
		}

		String wasteDischarges = (String)attributes.get("wasteDischarges");

		if (wasteDischarges != null) {
			setWasteDischarges(wasteDischarges);
		}

		String transportDetails = (String)attributes.get("transportDetails");

		if (transportDetails != null) {
			setTransportDetails(transportDetails);
		}

		String subcontractedActivities = (String)attributes.get(
			"subcontractedActivities");

		if (subcontractedActivities != null) {
			setSubcontractedActivities(subcontractedActivities);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjSectionTwo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the building site aspects of this ncbj section two.
	 *
	 * @return the building site aspects of this ncbj section two
	 */
	@Override
	public String getBuildingSiteAspects() {
		return model.getBuildingSiteAspects();
	}

	/**
	 * Returns the company ID of this ncbj section two.
	 *
	 * @return the company ID of this ncbj section two
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj section two.
	 *
	 * @return the create date of this ncbj section two
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj section two.
	 *
	 * @return the group ID of this ncbj section two
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the incoming materials of this ncbj section two.
	 *
	 * @return the incoming materials of this ncbj section two
	 */
	@Override
	public String getIncomingMaterials() {
		return model.getIncomingMaterials();
	}

	/**
	 * Returns the modified date of this ncbj section two.
	 *
	 * @return the modified date of this ncbj section two
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj section two.
	 *
	 * @return the ncbj application ID of this ncbj section two
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj section two ID of this ncbj section two.
	 *
	 * @return the ncbj section two ID of this ncbj section two
	 */
	@Override
	public long getNcbjSectionTwoId() {
		return model.getNcbjSectionTwoId();
	}

	/**
	 * Returns the primary key of this ncbj section two.
	 *
	 * @return the primary key of this ncbj section two
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product storage of this ncbj section two.
	 *
	 * @return the product storage of this ncbj section two
	 */
	@Override
	public String getProductStorage() {
		return model.getProductStorage();
	}

	/**
	 * Returns the subcontracted activities of this ncbj section two.
	 *
	 * @return the subcontracted activities of this ncbj section two
	 */
	@Override
	public String getSubcontractedActivities() {
		return model.getSubcontractedActivities();
	}

	/**
	 * Returns the transport details of this ncbj section two.
	 *
	 * @return the transport details of this ncbj section two
	 */
	@Override
	public String getTransportDetails() {
		return model.getTransportDetails();
	}

	/**
	 * Returns the user ID of this ncbj section two.
	 *
	 * @return the user ID of this ncbj section two
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj section two.
	 *
	 * @return the user name of this ncbj section two
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj section two.
	 *
	 * @return the user uuid of this ncbj section two
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the waste discharges of this ncbj section two.
	 *
	 * @return the waste discharges of this ncbj section two
	 */
	@Override
	public String getWasteDischarges() {
		return model.getWasteDischarges();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the building site aspects of this ncbj section two.
	 *
	 * @param buildingSiteAspects the building site aspects of this ncbj section two
	 */
	@Override
	public void setBuildingSiteAspects(String buildingSiteAspects) {
		model.setBuildingSiteAspects(buildingSiteAspects);
	}

	/**
	 * Sets the company ID of this ncbj section two.
	 *
	 * @param companyId the company ID of this ncbj section two
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj section two.
	 *
	 * @param createDate the create date of this ncbj section two
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj section two.
	 *
	 * @param groupId the group ID of this ncbj section two
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the incoming materials of this ncbj section two.
	 *
	 * @param incomingMaterials the incoming materials of this ncbj section two
	 */
	@Override
	public void setIncomingMaterials(String incomingMaterials) {
		model.setIncomingMaterials(incomingMaterials);
	}

	/**
	 * Sets the modified date of this ncbj section two.
	 *
	 * @param modifiedDate the modified date of this ncbj section two
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj section two.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj section two
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj section two ID of this ncbj section two.
	 *
	 * @param ncbjSectionTwoId the ncbj section two ID of this ncbj section two
	 */
	@Override
	public void setNcbjSectionTwoId(long ncbjSectionTwoId) {
		model.setNcbjSectionTwoId(ncbjSectionTwoId);
	}

	/**
	 * Sets the primary key of this ncbj section two.
	 *
	 * @param primaryKey the primary key of this ncbj section two
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product storage of this ncbj section two.
	 *
	 * @param productStorage the product storage of this ncbj section two
	 */
	@Override
	public void setProductStorage(String productStorage) {
		model.setProductStorage(productStorage);
	}

	/**
	 * Sets the subcontracted activities of this ncbj section two.
	 *
	 * @param subcontractedActivities the subcontracted activities of this ncbj section two
	 */
	@Override
	public void setSubcontractedActivities(String subcontractedActivities) {
		model.setSubcontractedActivities(subcontractedActivities);
	}

	/**
	 * Sets the transport details of this ncbj section two.
	 *
	 * @param transportDetails the transport details of this ncbj section two
	 */
	@Override
	public void setTransportDetails(String transportDetails) {
		model.setTransportDetails(transportDetails);
	}

	/**
	 * Sets the user ID of this ncbj section two.
	 *
	 * @param userId the user ID of this ncbj section two
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj section two.
	 *
	 * @param userName the user name of this ncbj section two
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj section two.
	 *
	 * @param userUuid the user uuid of this ncbj section two
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the waste discharges of this ncbj section two.
	 *
	 * @param wasteDischarges the waste discharges of this ncbj section two
	 */
	@Override
	public void setWasteDischarges(String wasteDischarges) {
		model.setWasteDischarges(wasteDischarges);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected NcbjSectionTwoWrapper wrap(NcbjSectionTwo ncbjSectionTwo) {
		return new NcbjSectionTwoWrapper(ncbjSectionTwo);
	}

}