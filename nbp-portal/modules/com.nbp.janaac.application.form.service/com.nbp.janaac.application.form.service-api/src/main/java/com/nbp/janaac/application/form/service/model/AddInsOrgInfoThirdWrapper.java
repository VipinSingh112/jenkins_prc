/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AddInsOrgInfoThird}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThird
 * @generated
 */
public class AddInsOrgInfoThirdWrapper
	extends BaseModelWrapper<AddInsOrgInfoThird>
	implements AddInsOrgInfoThird, ModelWrapper<AddInsOrgInfoThird> {

	public AddInsOrgInfoThirdWrapper(AddInsOrgInfoThird addInsOrgInfoThird) {
		super(addInsOrgInfoThird);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("AddInsOrgInfoThirdId", getAddInsOrgInfoThirdId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("inspectionActivity", getInspectionActivity());
		attributes.put("fieldOfInspection", getFieldOfInspection());
		attributes.put("typeOfInspection", getTypeOfInspection());
		attributes.put("method", getMethod());
		attributes.put("eqipment", getEqipment());
		attributes.put("limitsOfCapabilities", getLimitsOfCapabilities());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long AddInsOrgInfoThirdId = (Long)attributes.get(
			"AddInsOrgInfoThirdId");

		if (AddInsOrgInfoThirdId != null) {
			setAddInsOrgInfoThirdId(AddInsOrgInfoThirdId);
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

		String inspectionActivity = (String)attributes.get(
			"inspectionActivity");

		if (inspectionActivity != null) {
			setInspectionActivity(inspectionActivity);
		}

		String fieldOfInspection = (String)attributes.get("fieldOfInspection");

		if (fieldOfInspection != null) {
			setFieldOfInspection(fieldOfInspection);
		}

		String typeOfInspection = (String)attributes.get("typeOfInspection");

		if (typeOfInspection != null) {
			setTypeOfInspection(typeOfInspection);
		}

		String method = (String)attributes.get("method");

		if (method != null) {
			setMethod(method);
		}

		String eqipment = (String)attributes.get("eqipment");

		if (eqipment != null) {
			setEqipment(eqipment);
		}

		String limitsOfCapabilities = (String)attributes.get(
			"limitsOfCapabilities");

		if (limitsOfCapabilities != null) {
			setLimitsOfCapabilities(limitsOfCapabilities);
		}

		Long janaacApplicationId = (Long)attributes.get("janaacApplicationId");

		if (janaacApplicationId != null) {
			setJanaacApplicationId(janaacApplicationId);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}
	}

	@Override
	public AddInsOrgInfoThird cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add ins org info third ID of this add ins org info third.
	 *
	 * @return the add ins org info third ID of this add ins org info third
	 */
	@Override
	public long getAddInsOrgInfoThirdId() {
		return model.getAddInsOrgInfoThirdId();
	}

	/**
	 * Returns the company ID of this add ins org info third.
	 *
	 * @return the company ID of this add ins org info third
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add ins org info third.
	 *
	 * @return the counter of this add ins org info third
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add ins org info third.
	 *
	 * @return the create date of this add ins org info third
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the eqipment of this add ins org info third.
	 *
	 * @return the eqipment of this add ins org info third
	 */
	@Override
	public String getEqipment() {
		return model.getEqipment();
	}

	/**
	 * Returns the field of inspection of this add ins org info third.
	 *
	 * @return the field of inspection of this add ins org info third
	 */
	@Override
	public String getFieldOfInspection() {
		return model.getFieldOfInspection();
	}

	/**
	 * Returns the group ID of this add ins org info third.
	 *
	 * @return the group ID of this add ins org info third
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the inspection activity of this add ins org info third.
	 *
	 * @return the inspection activity of this add ins org info third
	 */
	@Override
	public String getInspectionActivity() {
		return model.getInspectionActivity();
	}

	/**
	 * Returns the janaac application ID of this add ins org info third.
	 *
	 * @return the janaac application ID of this add ins org info third
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the limits of capabilities of this add ins org info third.
	 *
	 * @return the limits of capabilities of this add ins org info third
	 */
	@Override
	public String getLimitsOfCapabilities() {
		return model.getLimitsOfCapabilities();
	}

	/**
	 * Returns the method of this add ins org info third.
	 *
	 * @return the method of this add ins org info third
	 */
	@Override
	public String getMethod() {
		return model.getMethod();
	}

	/**
	 * Returns the modified date of this add ins org info third.
	 *
	 * @return the modified date of this add ins org info third
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add ins org info third.
	 *
	 * @return the primary key of this add ins org info third
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of inspection of this add ins org info third.
	 *
	 * @return the type of inspection of this add ins org info third
	 */
	@Override
	public String getTypeOfInspection() {
		return model.getTypeOfInspection();
	}

	/**
	 * Returns the user ID of this add ins org info third.
	 *
	 * @return the user ID of this add ins org info third
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add ins org info third.
	 *
	 * @return the user name of this add ins org info third
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add ins org info third.
	 *
	 * @return the user uuid of this add ins org info third
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
	 * Sets the add ins org info third ID of this add ins org info third.
	 *
	 * @param AddInsOrgInfoThirdId the add ins org info third ID of this add ins org info third
	 */
	@Override
	public void setAddInsOrgInfoThirdId(long AddInsOrgInfoThirdId) {
		model.setAddInsOrgInfoThirdId(AddInsOrgInfoThirdId);
	}

	/**
	 * Sets the company ID of this add ins org info third.
	 *
	 * @param companyId the company ID of this add ins org info third
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add ins org info third.
	 *
	 * @param counter the counter of this add ins org info third
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add ins org info third.
	 *
	 * @param createDate the create date of this add ins org info third
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the eqipment of this add ins org info third.
	 *
	 * @param eqipment the eqipment of this add ins org info third
	 */
	@Override
	public void setEqipment(String eqipment) {
		model.setEqipment(eqipment);
	}

	/**
	 * Sets the field of inspection of this add ins org info third.
	 *
	 * @param fieldOfInspection the field of inspection of this add ins org info third
	 */
	@Override
	public void setFieldOfInspection(String fieldOfInspection) {
		model.setFieldOfInspection(fieldOfInspection);
	}

	/**
	 * Sets the group ID of this add ins org info third.
	 *
	 * @param groupId the group ID of this add ins org info third
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the inspection activity of this add ins org info third.
	 *
	 * @param inspectionActivity the inspection activity of this add ins org info third
	 */
	@Override
	public void setInspectionActivity(String inspectionActivity) {
		model.setInspectionActivity(inspectionActivity);
	}

	/**
	 * Sets the janaac application ID of this add ins org info third.
	 *
	 * @param janaacApplicationId the janaac application ID of this add ins org info third
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the limits of capabilities of this add ins org info third.
	 *
	 * @param limitsOfCapabilities the limits of capabilities of this add ins org info third
	 */
	@Override
	public void setLimitsOfCapabilities(String limitsOfCapabilities) {
		model.setLimitsOfCapabilities(limitsOfCapabilities);
	}

	/**
	 * Sets the method of this add ins org info third.
	 *
	 * @param method the method of this add ins org info third
	 */
	@Override
	public void setMethod(String method) {
		model.setMethod(method);
	}

	/**
	 * Sets the modified date of this add ins org info third.
	 *
	 * @param modifiedDate the modified date of this add ins org info third
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add ins org info third.
	 *
	 * @param primaryKey the primary key of this add ins org info third
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of inspection of this add ins org info third.
	 *
	 * @param typeOfInspection the type of inspection of this add ins org info third
	 */
	@Override
	public void setTypeOfInspection(String typeOfInspection) {
		model.setTypeOfInspection(typeOfInspection);
	}

	/**
	 * Sets the user ID of this add ins org info third.
	 *
	 * @param userId the user ID of this add ins org info third
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add ins org info third.
	 *
	 * @param userName the user name of this add ins org info third
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add ins org info third.
	 *
	 * @param userUuid the user uuid of this add ins org info third
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
	protected AddInsOrgInfoThirdWrapper wrap(
		AddInsOrgInfoThird addInsOrgInfoThird) {

		return new AddInsOrgInfoThirdWrapper(addInsOrgInfoThird);
	}

}