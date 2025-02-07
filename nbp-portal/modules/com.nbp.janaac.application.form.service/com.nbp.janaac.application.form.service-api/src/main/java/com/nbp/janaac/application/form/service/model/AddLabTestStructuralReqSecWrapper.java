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
 * This class is a wrapper for {@link AddLabTestStructuralReqSec}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabTestStructuralReqSec
 * @generated
 */
public class AddLabTestStructuralReqSecWrapper
	extends BaseModelWrapper<AddLabTestStructuralReqSec>
	implements AddLabTestStructuralReqSec,
			   ModelWrapper<AddLabTestStructuralReqSec> {

	public AddLabTestStructuralReqSecWrapper(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		super(addLabTestStructuralReqSec);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"addLabTestStructuralReqSecId", getAddLabTestStructuralReqSecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productMaterial", getProductMaterial());
		attributes.put("tests", getTests());
		attributes.put("method", getMethod());
		attributes.put("equipment", getEquipment());
		attributes.put("listOfCapability", getListOfCapability());
		attributes.put("estimateOfMeasurement", getEstimateOfMeasurement());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLabTestStructuralReqSecId = (Long)attributes.get(
			"addLabTestStructuralReqSecId");

		if (addLabTestStructuralReqSecId != null) {
			setAddLabTestStructuralReqSecId(addLabTestStructuralReqSecId);
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

		String productMaterial = (String)attributes.get("productMaterial");

		if (productMaterial != null) {
			setProductMaterial(productMaterial);
		}

		String tests = (String)attributes.get("tests");

		if (tests != null) {
			setTests(tests);
		}

		String method = (String)attributes.get("method");

		if (method != null) {
			setMethod(method);
		}

		String equipment = (String)attributes.get("equipment");

		if (equipment != null) {
			setEquipment(equipment);
		}

		String listOfCapability = (String)attributes.get("listOfCapability");

		if (listOfCapability != null) {
			setListOfCapability(listOfCapability);
		}

		String estimateOfMeasurement = (String)attributes.get(
			"estimateOfMeasurement");

		if (estimateOfMeasurement != null) {
			setEstimateOfMeasurement(estimateOfMeasurement);
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
	public AddLabTestStructuralReqSec cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add lab test structural req sec ID of this add lab test structural req sec.
	 *
	 * @return the add lab test structural req sec ID of this add lab test structural req sec
	 */
	@Override
	public long getAddLabTestStructuralReqSecId() {
		return model.getAddLabTestStructuralReqSecId();
	}

	/**
	 * Returns the company ID of this add lab test structural req sec.
	 *
	 * @return the company ID of this add lab test structural req sec
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add lab test structural req sec.
	 *
	 * @return the counter of this add lab test structural req sec
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add lab test structural req sec.
	 *
	 * @return the create date of this add lab test structural req sec
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment of this add lab test structural req sec.
	 *
	 * @return the equipment of this add lab test structural req sec
	 */
	@Override
	public String getEquipment() {
		return model.getEquipment();
	}

	/**
	 * Returns the estimate of measurement of this add lab test structural req sec.
	 *
	 * @return the estimate of measurement of this add lab test structural req sec
	 */
	@Override
	public String getEstimateOfMeasurement() {
		return model.getEstimateOfMeasurement();
	}

	/**
	 * Returns the group ID of this add lab test structural req sec.
	 *
	 * @return the group ID of this add lab test structural req sec
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add lab test structural req sec.
	 *
	 * @return the janaac application ID of this add lab test structural req sec
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the list of capability of this add lab test structural req sec.
	 *
	 * @return the list of capability of this add lab test structural req sec
	 */
	@Override
	public String getListOfCapability() {
		return model.getListOfCapability();
	}

	/**
	 * Returns the method of this add lab test structural req sec.
	 *
	 * @return the method of this add lab test structural req sec
	 */
	@Override
	public String getMethod() {
		return model.getMethod();
	}

	/**
	 * Returns the modified date of this add lab test structural req sec.
	 *
	 * @return the modified date of this add lab test structural req sec
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add lab test structural req sec.
	 *
	 * @return the primary key of this add lab test structural req sec
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product material of this add lab test structural req sec.
	 *
	 * @return the product material of this add lab test structural req sec
	 */
	@Override
	public String getProductMaterial() {
		return model.getProductMaterial();
	}

	/**
	 * Returns the tests of this add lab test structural req sec.
	 *
	 * @return the tests of this add lab test structural req sec
	 */
	@Override
	public String getTests() {
		return model.getTests();
	}

	/**
	 * Returns the user ID of this add lab test structural req sec.
	 *
	 * @return the user ID of this add lab test structural req sec
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add lab test structural req sec.
	 *
	 * @return the user name of this add lab test structural req sec
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add lab test structural req sec.
	 *
	 * @return the user uuid of this add lab test structural req sec
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
	 * Sets the add lab test structural req sec ID of this add lab test structural req sec.
	 *
	 * @param addLabTestStructuralReqSecId the add lab test structural req sec ID of this add lab test structural req sec
	 */
	@Override
	public void setAddLabTestStructuralReqSecId(
		long addLabTestStructuralReqSecId) {

		model.setAddLabTestStructuralReqSecId(addLabTestStructuralReqSecId);
	}

	/**
	 * Sets the company ID of this add lab test structural req sec.
	 *
	 * @param companyId the company ID of this add lab test structural req sec
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add lab test structural req sec.
	 *
	 * @param counter the counter of this add lab test structural req sec
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add lab test structural req sec.
	 *
	 * @param createDate the create date of this add lab test structural req sec
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment of this add lab test structural req sec.
	 *
	 * @param equipment the equipment of this add lab test structural req sec
	 */
	@Override
	public void setEquipment(String equipment) {
		model.setEquipment(equipment);
	}

	/**
	 * Sets the estimate of measurement of this add lab test structural req sec.
	 *
	 * @param estimateOfMeasurement the estimate of measurement of this add lab test structural req sec
	 */
	@Override
	public void setEstimateOfMeasurement(String estimateOfMeasurement) {
		model.setEstimateOfMeasurement(estimateOfMeasurement);
	}

	/**
	 * Sets the group ID of this add lab test structural req sec.
	 *
	 * @param groupId the group ID of this add lab test structural req sec
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add lab test structural req sec.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab test structural req sec
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the list of capability of this add lab test structural req sec.
	 *
	 * @param listOfCapability the list of capability of this add lab test structural req sec
	 */
	@Override
	public void setListOfCapability(String listOfCapability) {
		model.setListOfCapability(listOfCapability);
	}

	/**
	 * Sets the method of this add lab test structural req sec.
	 *
	 * @param method the method of this add lab test structural req sec
	 */
	@Override
	public void setMethod(String method) {
		model.setMethod(method);
	}

	/**
	 * Sets the modified date of this add lab test structural req sec.
	 *
	 * @param modifiedDate the modified date of this add lab test structural req sec
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add lab test structural req sec.
	 *
	 * @param primaryKey the primary key of this add lab test structural req sec
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product material of this add lab test structural req sec.
	 *
	 * @param productMaterial the product material of this add lab test structural req sec
	 */
	@Override
	public void setProductMaterial(String productMaterial) {
		model.setProductMaterial(productMaterial);
	}

	/**
	 * Sets the tests of this add lab test structural req sec.
	 *
	 * @param tests the tests of this add lab test structural req sec
	 */
	@Override
	public void setTests(String tests) {
		model.setTests(tests);
	}

	/**
	 * Sets the user ID of this add lab test structural req sec.
	 *
	 * @param userId the user ID of this add lab test structural req sec
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add lab test structural req sec.
	 *
	 * @param userName the user name of this add lab test structural req sec
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add lab test structural req sec.
	 *
	 * @param userUuid the user uuid of this add lab test structural req sec
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
	protected AddLabTestStructuralReqSecWrapper wrap(
		AddLabTestStructuralReqSec addLabTestStructuralReqSec) {

		return new AddLabTestStructuralReqSecWrapper(
			addLabTestStructuralReqSec);
	}

}