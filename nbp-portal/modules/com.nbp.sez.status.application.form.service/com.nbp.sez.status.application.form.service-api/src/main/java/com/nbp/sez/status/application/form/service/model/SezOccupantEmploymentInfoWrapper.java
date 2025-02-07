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
 * This class is a wrapper for {@link SezOccupantEmploymentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantEmploymentInfo
 * @generated
 */
public class SezOccupantEmploymentInfoWrapper
	extends BaseModelWrapper<SezOccupantEmploymentInfo>
	implements ModelWrapper<SezOccupantEmploymentInfo>,
			   SezOccupantEmploymentInfo {

	public SezOccupantEmploymentInfoWrapper(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		super(sezOccupantEmploymentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccEmpId", getSezOccEmpId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occLabourYear", getOccLabourYear());
		attributes.put("occLabourDirect", getOccLabourDirect());
		attributes.put("occLabourMale", getOccLabourMale());
		attributes.put("occLabourFemale", getOccLabourFemale());
		attributes.put("occLabourLocal", getOccLabourLocal());
		attributes.put("occLabourForeign", getOccLabourForeign());
		attributes.put("occEmpCounter", getOccEmpCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccEmpId = (Long)attributes.get("sezOccEmpId");

		if (sezOccEmpId != null) {
			setSezOccEmpId(sezOccEmpId);
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

		String occLabourYear = (String)attributes.get("occLabourYear");

		if (occLabourYear != null) {
			setOccLabourYear(occLabourYear);
		}

		String occLabourDirect = (String)attributes.get("occLabourDirect");

		if (occLabourDirect != null) {
			setOccLabourDirect(occLabourDirect);
		}

		String occLabourMale = (String)attributes.get("occLabourMale");

		if (occLabourMale != null) {
			setOccLabourMale(occLabourMale);
		}

		String occLabourFemale = (String)attributes.get("occLabourFemale");

		if (occLabourFemale != null) {
			setOccLabourFemale(occLabourFemale);
		}

		String occLabourLocal = (String)attributes.get("occLabourLocal");

		if (occLabourLocal != null) {
			setOccLabourLocal(occLabourLocal);
		}

		String occLabourForeign = (String)attributes.get("occLabourForeign");

		if (occLabourForeign != null) {
			setOccLabourForeign(occLabourForeign);
		}

		String occEmpCounter = (String)attributes.get("occEmpCounter");

		if (occEmpCounter != null) {
			setOccEmpCounter(occEmpCounter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantEmploymentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant employment info.
	 *
	 * @return the company ID of this sez occupant employment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant employment info.
	 *
	 * @return the create date of this sez occupant employment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant employment info.
	 *
	 * @return the group ID of this sez occupant employment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant employment info.
	 *
	 * @return the modified date of this sez occupant employment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ emp counter of this sez occupant employment info.
	 *
	 * @return the occ emp counter of this sez occupant employment info
	 */
	@Override
	public String getOccEmpCounter() {
		return model.getOccEmpCounter();
	}

	/**
	 * Returns the occ labour direct of this sez occupant employment info.
	 *
	 * @return the occ labour direct of this sez occupant employment info
	 */
	@Override
	public String getOccLabourDirect() {
		return model.getOccLabourDirect();
	}

	/**
	 * Returns the occ labour female of this sez occupant employment info.
	 *
	 * @return the occ labour female of this sez occupant employment info
	 */
	@Override
	public String getOccLabourFemale() {
		return model.getOccLabourFemale();
	}

	/**
	 * Returns the occ labour foreign of this sez occupant employment info.
	 *
	 * @return the occ labour foreign of this sez occupant employment info
	 */
	@Override
	public String getOccLabourForeign() {
		return model.getOccLabourForeign();
	}

	/**
	 * Returns the occ labour local of this sez occupant employment info.
	 *
	 * @return the occ labour local of this sez occupant employment info
	 */
	@Override
	public String getOccLabourLocal() {
		return model.getOccLabourLocal();
	}

	/**
	 * Returns the occ labour male of this sez occupant employment info.
	 *
	 * @return the occ labour male of this sez occupant employment info
	 */
	@Override
	public String getOccLabourMale() {
		return model.getOccLabourMale();
	}

	/**
	 * Returns the occ labour year of this sez occupant employment info.
	 *
	 * @return the occ labour year of this sez occupant employment info
	 */
	@Override
	public String getOccLabourYear() {
		return model.getOccLabourYear();
	}

	/**
	 * Returns the primary key of this sez occupant employment info.
	 *
	 * @return the primary key of this sez occupant employment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ emp ID of this sez occupant employment info.
	 *
	 * @return the sez occ emp ID of this sez occupant employment info
	 */
	@Override
	public long getSezOccEmpId() {
		return model.getSezOccEmpId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant employment info.
	 *
	 * @return the sez status application ID of this sez occupant employment info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant employment info.
	 *
	 * @return the user ID of this sez occupant employment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant employment info.
	 *
	 * @return the user name of this sez occupant employment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant employment info.
	 *
	 * @return the user uuid of this sez occupant employment info
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
	 * Sets the company ID of this sez occupant employment info.
	 *
	 * @param companyId the company ID of this sez occupant employment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant employment info.
	 *
	 * @param createDate the create date of this sez occupant employment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant employment info.
	 *
	 * @param groupId the group ID of this sez occupant employment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant employment info.
	 *
	 * @param modifiedDate the modified date of this sez occupant employment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ emp counter of this sez occupant employment info.
	 *
	 * @param occEmpCounter the occ emp counter of this sez occupant employment info
	 */
	@Override
	public void setOccEmpCounter(String occEmpCounter) {
		model.setOccEmpCounter(occEmpCounter);
	}

	/**
	 * Sets the occ labour direct of this sez occupant employment info.
	 *
	 * @param occLabourDirect the occ labour direct of this sez occupant employment info
	 */
	@Override
	public void setOccLabourDirect(String occLabourDirect) {
		model.setOccLabourDirect(occLabourDirect);
	}

	/**
	 * Sets the occ labour female of this sez occupant employment info.
	 *
	 * @param occLabourFemale the occ labour female of this sez occupant employment info
	 */
	@Override
	public void setOccLabourFemale(String occLabourFemale) {
		model.setOccLabourFemale(occLabourFemale);
	}

	/**
	 * Sets the occ labour foreign of this sez occupant employment info.
	 *
	 * @param occLabourForeign the occ labour foreign of this sez occupant employment info
	 */
	@Override
	public void setOccLabourForeign(String occLabourForeign) {
		model.setOccLabourForeign(occLabourForeign);
	}

	/**
	 * Sets the occ labour local of this sez occupant employment info.
	 *
	 * @param occLabourLocal the occ labour local of this sez occupant employment info
	 */
	@Override
	public void setOccLabourLocal(String occLabourLocal) {
		model.setOccLabourLocal(occLabourLocal);
	}

	/**
	 * Sets the occ labour male of this sez occupant employment info.
	 *
	 * @param occLabourMale the occ labour male of this sez occupant employment info
	 */
	@Override
	public void setOccLabourMale(String occLabourMale) {
		model.setOccLabourMale(occLabourMale);
	}

	/**
	 * Sets the occ labour year of this sez occupant employment info.
	 *
	 * @param occLabourYear the occ labour year of this sez occupant employment info
	 */
	@Override
	public void setOccLabourYear(String occLabourYear) {
		model.setOccLabourYear(occLabourYear);
	}

	/**
	 * Sets the primary key of this sez occupant employment info.
	 *
	 * @param primaryKey the primary key of this sez occupant employment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ emp ID of this sez occupant employment info.
	 *
	 * @param sezOccEmpId the sez occ emp ID of this sez occupant employment info
	 */
	@Override
	public void setSezOccEmpId(long sezOccEmpId) {
		model.setSezOccEmpId(sezOccEmpId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant employment info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant employment info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant employment info.
	 *
	 * @param userId the user ID of this sez occupant employment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant employment info.
	 *
	 * @param userName the user name of this sez occupant employment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant employment info.
	 *
	 * @param userUuid the user uuid of this sez occupant employment info
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
	protected SezOccupantEmploymentInfoWrapper wrap(
		SezOccupantEmploymentInfo sezOccupantEmploymentInfo) {

		return new SezOccupantEmploymentInfoWrapper(sezOccupantEmploymentInfo);
	}

}