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
 * This class is a wrapper for {@link SezZoneEmployInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfo
 * @generated
 */
public class SezZoneEmployInfoWrapper
	extends BaseModelWrapper<SezZoneEmployInfo>
	implements ModelWrapper<SezZoneEmployInfo>, SezZoneEmployInfo {

	public SezZoneEmployInfoWrapper(SezZoneEmployInfo sezZoneEmployInfo) {
		super(sezZoneEmployInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezZoneEmpInfoId", getSezZoneEmpInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("labourRequirementYear", getLabourRequirementYear());
		attributes.put("labourRequirementDirect", getLabourRequirementDirect());
		attributes.put("labourRequirementMale", getLabourRequirementMale());
		attributes.put("labourRequirementFemale", getLabourRequirementFemale());
		attributes.put("labourRequirementLocal", getLabourRequirementLocal());
		attributes.put(
			"labourRequirementForeign", getLabourRequirementForeign());
		attributes.put("counter", getCounter());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezZoneEmpInfoId = (Long)attributes.get("sezZoneEmpInfoId");

		if (sezZoneEmpInfoId != null) {
			setSezZoneEmpInfoId(sezZoneEmpInfoId);
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

		String labourRequirementYear = (String)attributes.get(
			"labourRequirementYear");

		if (labourRequirementYear != null) {
			setLabourRequirementYear(labourRequirementYear);
		}

		String labourRequirementDirect = (String)attributes.get(
			"labourRequirementDirect");

		if (labourRequirementDirect != null) {
			setLabourRequirementDirect(labourRequirementDirect);
		}

		String labourRequirementMale = (String)attributes.get(
			"labourRequirementMale");

		if (labourRequirementMale != null) {
			setLabourRequirementMale(labourRequirementMale);
		}

		String labourRequirementFemale = (String)attributes.get(
			"labourRequirementFemale");

		if (labourRequirementFemale != null) {
			setLabourRequirementFemale(labourRequirementFemale);
		}

		String labourRequirementLocal = (String)attributes.get(
			"labourRequirementLocal");

		if (labourRequirementLocal != null) {
			setLabourRequirementLocal(labourRequirementLocal);
		}

		String labourRequirementForeign = (String)attributes.get(
			"labourRequirementForeign");

		if (labourRequirementForeign != null) {
			setLabourRequirementForeign(labourRequirementForeign);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezZoneEmployInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez zone employ info.
	 *
	 * @return the company ID of this sez zone employ info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this sez zone employ info.
	 *
	 * @return the counter of this sez zone employ info
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this sez zone employ info.
	 *
	 * @return the create date of this sez zone employ info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez zone employ info.
	 *
	 * @return the group ID of this sez zone employ info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the labour requirement direct of this sez zone employ info.
	 *
	 * @return the labour requirement direct of this sez zone employ info
	 */
	@Override
	public String getLabourRequirementDirect() {
		return model.getLabourRequirementDirect();
	}

	/**
	 * Returns the labour requirement female of this sez zone employ info.
	 *
	 * @return the labour requirement female of this sez zone employ info
	 */
	@Override
	public String getLabourRequirementFemale() {
		return model.getLabourRequirementFemale();
	}

	/**
	 * Returns the labour requirement foreign of this sez zone employ info.
	 *
	 * @return the labour requirement foreign of this sez zone employ info
	 */
	@Override
	public String getLabourRequirementForeign() {
		return model.getLabourRequirementForeign();
	}

	/**
	 * Returns the labour requirement local of this sez zone employ info.
	 *
	 * @return the labour requirement local of this sez zone employ info
	 */
	@Override
	public String getLabourRequirementLocal() {
		return model.getLabourRequirementLocal();
	}

	/**
	 * Returns the labour requirement male of this sez zone employ info.
	 *
	 * @return the labour requirement male of this sez zone employ info
	 */
	@Override
	public String getLabourRequirementMale() {
		return model.getLabourRequirementMale();
	}

	/**
	 * Returns the labour requirement year of this sez zone employ info.
	 *
	 * @return the labour requirement year of this sez zone employ info
	 */
	@Override
	public String getLabourRequirementYear() {
		return model.getLabourRequirementYear();
	}

	/**
	 * Returns the modified date of this sez zone employ info.
	 *
	 * @return the modified date of this sez zone employ info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sez zone employ info.
	 *
	 * @return the primary key of this sez zone employ info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez status application ID of this sez zone employ info.
	 *
	 * @return the sez status application ID of this sez zone employ info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez zone emp info ID of this sez zone employ info.
	 *
	 * @return the sez zone emp info ID of this sez zone employ info
	 */
	@Override
	public long getSezZoneEmpInfoId() {
		return model.getSezZoneEmpInfoId();
	}

	/**
	 * Returns the user ID of this sez zone employ info.
	 *
	 * @return the user ID of this sez zone employ info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez zone employ info.
	 *
	 * @return the user name of this sez zone employ info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez zone employ info.
	 *
	 * @return the user uuid of this sez zone employ info
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
	 * Sets the company ID of this sez zone employ info.
	 *
	 * @param companyId the company ID of this sez zone employ info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this sez zone employ info.
	 *
	 * @param counter the counter of this sez zone employ info
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this sez zone employ info.
	 *
	 * @param createDate the create date of this sez zone employ info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez zone employ info.
	 *
	 * @param groupId the group ID of this sez zone employ info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the labour requirement direct of this sez zone employ info.
	 *
	 * @param labourRequirementDirect the labour requirement direct of this sez zone employ info
	 */
	@Override
	public void setLabourRequirementDirect(String labourRequirementDirect) {
		model.setLabourRequirementDirect(labourRequirementDirect);
	}

	/**
	 * Sets the labour requirement female of this sez zone employ info.
	 *
	 * @param labourRequirementFemale the labour requirement female of this sez zone employ info
	 */
	@Override
	public void setLabourRequirementFemale(String labourRequirementFemale) {
		model.setLabourRequirementFemale(labourRequirementFemale);
	}

	/**
	 * Sets the labour requirement foreign of this sez zone employ info.
	 *
	 * @param labourRequirementForeign the labour requirement foreign of this sez zone employ info
	 */
	@Override
	public void setLabourRequirementForeign(String labourRequirementForeign) {
		model.setLabourRequirementForeign(labourRequirementForeign);
	}

	/**
	 * Sets the labour requirement local of this sez zone employ info.
	 *
	 * @param labourRequirementLocal the labour requirement local of this sez zone employ info
	 */
	@Override
	public void setLabourRequirementLocal(String labourRequirementLocal) {
		model.setLabourRequirementLocal(labourRequirementLocal);
	}

	/**
	 * Sets the labour requirement male of this sez zone employ info.
	 *
	 * @param labourRequirementMale the labour requirement male of this sez zone employ info
	 */
	@Override
	public void setLabourRequirementMale(String labourRequirementMale) {
		model.setLabourRequirementMale(labourRequirementMale);
	}

	/**
	 * Sets the labour requirement year of this sez zone employ info.
	 *
	 * @param labourRequirementYear the labour requirement year of this sez zone employ info
	 */
	@Override
	public void setLabourRequirementYear(String labourRequirementYear) {
		model.setLabourRequirementYear(labourRequirementYear);
	}

	/**
	 * Sets the modified date of this sez zone employ info.
	 *
	 * @param modifiedDate the modified date of this sez zone employ info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sez zone employ info.
	 *
	 * @param primaryKey the primary key of this sez zone employ info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez status application ID of this sez zone employ info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone employ info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez zone emp info ID of this sez zone employ info.
	 *
	 * @param sezZoneEmpInfoId the sez zone emp info ID of this sez zone employ info
	 */
	@Override
	public void setSezZoneEmpInfoId(long sezZoneEmpInfoId) {
		model.setSezZoneEmpInfoId(sezZoneEmpInfoId);
	}

	/**
	 * Sets the user ID of this sez zone employ info.
	 *
	 * @param userId the user ID of this sez zone employ info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez zone employ info.
	 *
	 * @param userName the user name of this sez zone employ info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez zone employ info.
	 *
	 * @param userUuid the user uuid of this sez zone employ info
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
	protected SezZoneEmployInfoWrapper wrap(
		SezZoneEmployInfo sezZoneEmployInfo) {

		return new SezZoneEmployInfoWrapper(sezZoneEmployInfo);
	}

}