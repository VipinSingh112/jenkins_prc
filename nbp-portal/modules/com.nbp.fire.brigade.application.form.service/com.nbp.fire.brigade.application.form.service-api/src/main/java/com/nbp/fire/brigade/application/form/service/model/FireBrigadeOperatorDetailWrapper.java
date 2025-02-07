/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FireBrigadeOperatorDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetail
 * @generated
 */
public class FireBrigadeOperatorDetailWrapper
	extends BaseModelWrapper<FireBrigadeOperatorDetail>
	implements FireBrigadeOperatorDetail,
			   ModelWrapper<FireBrigadeOperatorDetail> {

	public FireBrigadeOperatorDetailWrapper(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		super(fireBrigadeOperatorDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"fireBrigadeOperatorDetailId", getFireBrigadeOperatorDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("operatorName", getOperatorName());
		attributes.put("businessName", getBusinessName());
		attributes.put("address", getAddress());
		attributes.put("premisesUses", getPremisesUses());
		attributes.put("premisesOccupancy", getPremisesOccupancy());
		attributes.put("premisesBusiness", getPremisesBusiness());
		attributes.put("maxWorkingPersons", getMaxWorkingPersons());
		attributes.put(
			"maxNumPersonsAtAnyOneTime", getMaxNumPersonsAtAnyOneTime());
		attributes.put(
			"fireBrigadeApplicationId", getFireBrigadeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fireBrigadeOperatorDetailId = (Long)attributes.get(
			"fireBrigadeOperatorDetailId");

		if (fireBrigadeOperatorDetailId != null) {
			setFireBrigadeOperatorDetailId(fireBrigadeOperatorDetailId);
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

		String operatorName = (String)attributes.get("operatorName");

		if (operatorName != null) {
			setOperatorName(operatorName);
		}

		String businessName = (String)attributes.get("businessName");

		if (businessName != null) {
			setBusinessName(businessName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String premisesUses = (String)attributes.get("premisesUses");

		if (premisesUses != null) {
			setPremisesUses(premisesUses);
		}

		String premisesOccupancy = (String)attributes.get("premisesOccupancy");

		if (premisesOccupancy != null) {
			setPremisesOccupancy(premisesOccupancy);
		}

		String premisesBusiness = (String)attributes.get("premisesBusiness");

		if (premisesBusiness != null) {
			setPremisesBusiness(premisesBusiness);
		}

		String maxWorkingPersons = (String)attributes.get("maxWorkingPersons");

		if (maxWorkingPersons != null) {
			setMaxWorkingPersons(maxWorkingPersons);
		}

		String maxNumPersonsAtAnyOneTime = (String)attributes.get(
			"maxNumPersonsAtAnyOneTime");

		if (maxNumPersonsAtAnyOneTime != null) {
			setMaxNumPersonsAtAnyOneTime(maxNumPersonsAtAnyOneTime);
		}

		Long fireBrigadeApplicationId = (Long)attributes.get(
			"fireBrigadeApplicationId");

		if (fireBrigadeApplicationId != null) {
			setFireBrigadeApplicationId(fireBrigadeApplicationId);
		}
	}

	@Override
	public FireBrigadeOperatorDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this fire brigade operator detail.
	 *
	 * @return the address of this fire brigade operator detail
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the business name of this fire brigade operator detail.
	 *
	 * @return the business name of this fire brigade operator detail
	 */
	@Override
	public String getBusinessName() {
		return model.getBusinessName();
	}

	/**
	 * Returns the company ID of this fire brigade operator detail.
	 *
	 * @return the company ID of this fire brigade operator detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this fire brigade operator detail.
	 *
	 * @return the create date of this fire brigade operator detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the fire brigade application ID of this fire brigade operator detail.
	 *
	 * @return the fire brigade application ID of this fire brigade operator detail
	 */
	@Override
	public long getFireBrigadeApplicationId() {
		return model.getFireBrigadeApplicationId();
	}

	/**
	 * Returns the fire brigade operator detail ID of this fire brigade operator detail.
	 *
	 * @return the fire brigade operator detail ID of this fire brigade operator detail
	 */
	@Override
	public long getFireBrigadeOperatorDetailId() {
		return model.getFireBrigadeOperatorDetailId();
	}

	/**
	 * Returns the group ID of this fire brigade operator detail.
	 *
	 * @return the group ID of this fire brigade operator detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the max num persons at any one time of this fire brigade operator detail.
	 *
	 * @return the max num persons at any one time of this fire brigade operator detail
	 */
	@Override
	public String getMaxNumPersonsAtAnyOneTime() {
		return model.getMaxNumPersonsAtAnyOneTime();
	}

	/**
	 * Returns the max working persons of this fire brigade operator detail.
	 *
	 * @return the max working persons of this fire brigade operator detail
	 */
	@Override
	public String getMaxWorkingPersons() {
		return model.getMaxWorkingPersons();
	}

	/**
	 * Returns the modified date of this fire brigade operator detail.
	 *
	 * @return the modified date of this fire brigade operator detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the operator name of this fire brigade operator detail.
	 *
	 * @return the operator name of this fire brigade operator detail
	 */
	@Override
	public String getOperatorName() {
		return model.getOperatorName();
	}

	/**
	 * Returns the premises business of this fire brigade operator detail.
	 *
	 * @return the premises business of this fire brigade operator detail
	 */
	@Override
	public String getPremisesBusiness() {
		return model.getPremisesBusiness();
	}

	/**
	 * Returns the premises occupancy of this fire brigade operator detail.
	 *
	 * @return the premises occupancy of this fire brigade operator detail
	 */
	@Override
	public String getPremisesOccupancy() {
		return model.getPremisesOccupancy();
	}

	/**
	 * Returns the premises uses of this fire brigade operator detail.
	 *
	 * @return the premises uses of this fire brigade operator detail
	 */
	@Override
	public String getPremisesUses() {
		return model.getPremisesUses();
	}

	/**
	 * Returns the primary key of this fire brigade operator detail.
	 *
	 * @return the primary key of this fire brigade operator detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this fire brigade operator detail.
	 *
	 * @return the user ID of this fire brigade operator detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this fire brigade operator detail.
	 *
	 * @return the user name of this fire brigade operator detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this fire brigade operator detail.
	 *
	 * @return the user uuid of this fire brigade operator detail
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
	 * Sets the address of this fire brigade operator detail.
	 *
	 * @param address the address of this fire brigade operator detail
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the business name of this fire brigade operator detail.
	 *
	 * @param businessName the business name of this fire brigade operator detail
	 */
	@Override
	public void setBusinessName(String businessName) {
		model.setBusinessName(businessName);
	}

	/**
	 * Sets the company ID of this fire brigade operator detail.
	 *
	 * @param companyId the company ID of this fire brigade operator detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this fire brigade operator detail.
	 *
	 * @param createDate the create date of this fire brigade operator detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the fire brigade application ID of this fire brigade operator detail.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade operator detail
	 */
	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		model.setFireBrigadeApplicationId(fireBrigadeApplicationId);
	}

	/**
	 * Sets the fire brigade operator detail ID of this fire brigade operator detail.
	 *
	 * @param fireBrigadeOperatorDetailId the fire brigade operator detail ID of this fire brigade operator detail
	 */
	@Override
	public void setFireBrigadeOperatorDetailId(
		long fireBrigadeOperatorDetailId) {

		model.setFireBrigadeOperatorDetailId(fireBrigadeOperatorDetailId);
	}

	/**
	 * Sets the group ID of this fire brigade operator detail.
	 *
	 * @param groupId the group ID of this fire brigade operator detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the max num persons at any one time of this fire brigade operator detail.
	 *
	 * @param maxNumPersonsAtAnyOneTime the max num persons at any one time of this fire brigade operator detail
	 */
	@Override
	public void setMaxNumPersonsAtAnyOneTime(String maxNumPersonsAtAnyOneTime) {
		model.setMaxNumPersonsAtAnyOneTime(maxNumPersonsAtAnyOneTime);
	}

	/**
	 * Sets the max working persons of this fire brigade operator detail.
	 *
	 * @param maxWorkingPersons the max working persons of this fire brigade operator detail
	 */
	@Override
	public void setMaxWorkingPersons(String maxWorkingPersons) {
		model.setMaxWorkingPersons(maxWorkingPersons);
	}

	/**
	 * Sets the modified date of this fire brigade operator detail.
	 *
	 * @param modifiedDate the modified date of this fire brigade operator detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the operator name of this fire brigade operator detail.
	 *
	 * @param operatorName the operator name of this fire brigade operator detail
	 */
	@Override
	public void setOperatorName(String operatorName) {
		model.setOperatorName(operatorName);
	}

	/**
	 * Sets the premises business of this fire brigade operator detail.
	 *
	 * @param premisesBusiness the premises business of this fire brigade operator detail
	 */
	@Override
	public void setPremisesBusiness(String premisesBusiness) {
		model.setPremisesBusiness(premisesBusiness);
	}

	/**
	 * Sets the premises occupancy of this fire brigade operator detail.
	 *
	 * @param premisesOccupancy the premises occupancy of this fire brigade operator detail
	 */
	@Override
	public void setPremisesOccupancy(String premisesOccupancy) {
		model.setPremisesOccupancy(premisesOccupancy);
	}

	/**
	 * Sets the premises uses of this fire brigade operator detail.
	 *
	 * @param premisesUses the premises uses of this fire brigade operator detail
	 */
	@Override
	public void setPremisesUses(String premisesUses) {
		model.setPremisesUses(premisesUses);
	}

	/**
	 * Sets the primary key of this fire brigade operator detail.
	 *
	 * @param primaryKey the primary key of this fire brigade operator detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this fire brigade operator detail.
	 *
	 * @param userId the user ID of this fire brigade operator detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this fire brigade operator detail.
	 *
	 * @param userName the user name of this fire brigade operator detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this fire brigade operator detail.
	 *
	 * @param userUuid the user uuid of this fire brigade operator detail
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
	protected FireBrigadeOperatorDetailWrapper wrap(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return new FireBrigadeOperatorDetailWrapper(fireBrigadeOperatorDetail);
	}

}