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
 * This class is a wrapper for {@link AddLabMedicalOrganSec}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganSec
 * @generated
 */
public class AddLabMedicalOrganSecWrapper
	extends BaseModelWrapper<AddLabMedicalOrganSec>
	implements AddLabMedicalOrganSec, ModelWrapper<AddLabMedicalOrganSec> {

	public AddLabMedicalOrganSecWrapper(
		AddLabMedicalOrganSec addLabMedicalOrganSec) {

		super(addLabMedicalOrganSec);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addLabMedicalOrganSecId", getAddLabMedicalOrganSecId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("product", getProduct());
		attributes.put("examination", getExamination());
		attributes.put("methods", getMethods());
		attributes.put("equipment", getEquipment());
		attributes.put("referenceRange", getReferenceRange());
		attributes.put("measurementUncertainty", getMeasurementUncertainty());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addLabMedicalOrganSecId = (Long)attributes.get(
			"addLabMedicalOrganSecId");

		if (addLabMedicalOrganSecId != null) {
			setAddLabMedicalOrganSecId(addLabMedicalOrganSecId);
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

		String product = (String)attributes.get("product");

		if (product != null) {
			setProduct(product);
		}

		String examination = (String)attributes.get("examination");

		if (examination != null) {
			setExamination(examination);
		}

		String methods = (String)attributes.get("methods");

		if (methods != null) {
			setMethods(methods);
		}

		String equipment = (String)attributes.get("equipment");

		if (equipment != null) {
			setEquipment(equipment);
		}

		String referenceRange = (String)attributes.get("referenceRange");

		if (referenceRange != null) {
			setReferenceRange(referenceRange);
		}

		String measurementUncertainty = (String)attributes.get(
			"measurementUncertainty");

		if (measurementUncertainty != null) {
			setMeasurementUncertainty(measurementUncertainty);
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
	public AddLabMedicalOrganSec cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add lab medical organ sec ID of this add lab medical organ sec.
	 *
	 * @return the add lab medical organ sec ID of this add lab medical organ sec
	 */
	@Override
	public long getAddLabMedicalOrganSecId() {
		return model.getAddLabMedicalOrganSecId();
	}

	/**
	 * Returns the company ID of this add lab medical organ sec.
	 *
	 * @return the company ID of this add lab medical organ sec
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add lab medical organ sec.
	 *
	 * @return the counter of this add lab medical organ sec
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add lab medical organ sec.
	 *
	 * @return the create date of this add lab medical organ sec
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the equipment of this add lab medical organ sec.
	 *
	 * @return the equipment of this add lab medical organ sec
	 */
	@Override
	public String getEquipment() {
		return model.getEquipment();
	}

	/**
	 * Returns the examination of this add lab medical organ sec.
	 *
	 * @return the examination of this add lab medical organ sec
	 */
	@Override
	public String getExamination() {
		return model.getExamination();
	}

	/**
	 * Returns the group ID of this add lab medical organ sec.
	 *
	 * @return the group ID of this add lab medical organ sec
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add lab medical organ sec.
	 *
	 * @return the janaac application ID of this add lab medical organ sec
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the measurement uncertainty of this add lab medical organ sec.
	 *
	 * @return the measurement uncertainty of this add lab medical organ sec
	 */
	@Override
	public String getMeasurementUncertainty() {
		return model.getMeasurementUncertainty();
	}

	/**
	 * Returns the methods of this add lab medical organ sec.
	 *
	 * @return the methods of this add lab medical organ sec
	 */
	@Override
	public String getMethods() {
		return model.getMethods();
	}

	/**
	 * Returns the modified date of this add lab medical organ sec.
	 *
	 * @return the modified date of this add lab medical organ sec
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this add lab medical organ sec.
	 *
	 * @return the primary key of this add lab medical organ sec
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product of this add lab medical organ sec.
	 *
	 * @return the product of this add lab medical organ sec
	 */
	@Override
	public String getProduct() {
		return model.getProduct();
	}

	/**
	 * Returns the reference range of this add lab medical organ sec.
	 *
	 * @return the reference range of this add lab medical organ sec
	 */
	@Override
	public String getReferenceRange() {
		return model.getReferenceRange();
	}

	/**
	 * Returns the user ID of this add lab medical organ sec.
	 *
	 * @return the user ID of this add lab medical organ sec
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add lab medical organ sec.
	 *
	 * @return the user name of this add lab medical organ sec
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add lab medical organ sec.
	 *
	 * @return the user uuid of this add lab medical organ sec
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
	 * Sets the add lab medical organ sec ID of this add lab medical organ sec.
	 *
	 * @param addLabMedicalOrganSecId the add lab medical organ sec ID of this add lab medical organ sec
	 */
	@Override
	public void setAddLabMedicalOrganSecId(long addLabMedicalOrganSecId) {
		model.setAddLabMedicalOrganSecId(addLabMedicalOrganSecId);
	}

	/**
	 * Sets the company ID of this add lab medical organ sec.
	 *
	 * @param companyId the company ID of this add lab medical organ sec
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add lab medical organ sec.
	 *
	 * @param counter the counter of this add lab medical organ sec
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add lab medical organ sec.
	 *
	 * @param createDate the create date of this add lab medical organ sec
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the equipment of this add lab medical organ sec.
	 *
	 * @param equipment the equipment of this add lab medical organ sec
	 */
	@Override
	public void setEquipment(String equipment) {
		model.setEquipment(equipment);
	}

	/**
	 * Sets the examination of this add lab medical organ sec.
	 *
	 * @param examination the examination of this add lab medical organ sec
	 */
	@Override
	public void setExamination(String examination) {
		model.setExamination(examination);
	}

	/**
	 * Sets the group ID of this add lab medical organ sec.
	 *
	 * @param groupId the group ID of this add lab medical organ sec
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add lab medical organ sec.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab medical organ sec
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the measurement uncertainty of this add lab medical organ sec.
	 *
	 * @param measurementUncertainty the measurement uncertainty of this add lab medical organ sec
	 */
	@Override
	public void setMeasurementUncertainty(String measurementUncertainty) {
		model.setMeasurementUncertainty(measurementUncertainty);
	}

	/**
	 * Sets the methods of this add lab medical organ sec.
	 *
	 * @param methods the methods of this add lab medical organ sec
	 */
	@Override
	public void setMethods(String methods) {
		model.setMethods(methods);
	}

	/**
	 * Sets the modified date of this add lab medical organ sec.
	 *
	 * @param modifiedDate the modified date of this add lab medical organ sec
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this add lab medical organ sec.
	 *
	 * @param primaryKey the primary key of this add lab medical organ sec
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product of this add lab medical organ sec.
	 *
	 * @param product the product of this add lab medical organ sec
	 */
	@Override
	public void setProduct(String product) {
		model.setProduct(product);
	}

	/**
	 * Sets the reference range of this add lab medical organ sec.
	 *
	 * @param referenceRange the reference range of this add lab medical organ sec
	 */
	@Override
	public void setReferenceRange(String referenceRange) {
		model.setReferenceRange(referenceRange);
	}

	/**
	 * Sets the user ID of this add lab medical organ sec.
	 *
	 * @param userId the user ID of this add lab medical organ sec
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add lab medical organ sec.
	 *
	 * @param userName the user name of this add lab medical organ sec
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add lab medical organ sec.
	 *
	 * @param userUuid the user uuid of this add lab medical organ sec
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
	protected AddLabMedicalOrganSecWrapper wrap(
		AddLabMedicalOrganSec addLabMedicalOrganSec) {

		return new AddLabMedicalOrganSecWrapper(addLabMedicalOrganSec);
	}

}