/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicSafeguardMaterialAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardMaterialAdd
 * @generated
 */
public class MiicSafeguardMaterialAddWrapper
	extends BaseModelWrapper<MiicSafeguardMaterialAdd>
	implements MiicSafeguardMaterialAdd,
			   ModelWrapper<MiicSafeguardMaterialAdd> {

	public MiicSafeguardMaterialAddWrapper(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		super(miicSafeguardMaterialAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miicSafeguardMaterialAddId", getMiicSafeguardMaterialAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nameOfProducer", getNameOfProducer());
		attributes.put("addressOfProducer ", getAddressOfProducer());
		attributes.put("description", getDescription());
		attributes.put("tariffHeadingNum", getTariffHeadingNum());
		attributes.put("amount", getAmount());
		attributes.put("quantity", getQuantity());
		attributes.put("technologySpecification", getTechnologySpecification());
		attributes.put("periodOfImportationFrom", getPeriodOfImportationFrom());
		attributes.put("periodOfImportationTo", getPeriodOfImportationTo());
		attributes.put("counter", getCounter());
		attributes.put("miicApplicationId", getMiicApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miicSafeguardMaterialAddId = (Long)attributes.get(
			"miicSafeguardMaterialAddId");

		if (miicSafeguardMaterialAddId != null) {
			setMiicSafeguardMaterialAddId(miicSafeguardMaterialAddId);
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

		String nameOfProducer = (String)attributes.get("nameOfProducer");

		if (nameOfProducer != null) {
			setNameOfProducer(nameOfProducer);
		}

		String addressOfProducer = (String)attributes.get("addressOfProducer ");

		if (addressOfProducer != null) {
			setAddressOfProducer(addressOfProducer);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String tariffHeadingNum = (String)attributes.get("tariffHeadingNum");

		if (tariffHeadingNum != null) {
			setTariffHeadingNum(tariffHeadingNum);
		}

		String amount = (String)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String technologySpecification = (String)attributes.get(
			"technologySpecification");

		if (technologySpecification != null) {
			setTechnologySpecification(technologySpecification);
		}

		Date periodOfImportationFrom = (Date)attributes.get(
			"periodOfImportationFrom");

		if (periodOfImportationFrom != null) {
			setPeriodOfImportationFrom(periodOfImportationFrom);
		}

		Date periodOfImportationTo = (Date)attributes.get(
			"periodOfImportationTo");

		if (periodOfImportationTo != null) {
			setPeriodOfImportationTo(periodOfImportationTo);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long miicApplicationId = (Long)attributes.get("miicApplicationId");

		if (miicApplicationId != null) {
			setMiicApplicationId(miicApplicationId);
		}
	}

	@Override
	public MiicSafeguardMaterialAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of producer of this miic safeguard material add.
	 *
	 * @return the address of producer of this miic safeguard material add
	 */
	@Override
	public String getAddressOfProducer() {
		return model.getAddressOfProducer();
	}

	/**
	 * Returns the amount of this miic safeguard material add.
	 *
	 * @return the amount of this miic safeguard material add
	 */
	@Override
	public String getAmount() {
		return model.getAmount();
	}

	/**
	 * Returns the company ID of this miic safeguard material add.
	 *
	 * @return the company ID of this miic safeguard material add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this miic safeguard material add.
	 *
	 * @return the counter of this miic safeguard material add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this miic safeguard material add.
	 *
	 * @return the create date of this miic safeguard material add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this miic safeguard material add.
	 *
	 * @return the description of this miic safeguard material add
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this miic safeguard material add.
	 *
	 * @return the group ID of this miic safeguard material add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the miic application ID of this miic safeguard material add.
	 *
	 * @return the miic application ID of this miic safeguard material add
	 */
	@Override
	public long getMiicApplicationId() {
		return model.getMiicApplicationId();
	}

	/**
	 * Returns the miic safeguard material add ID of this miic safeguard material add.
	 *
	 * @return the miic safeguard material add ID of this miic safeguard material add
	 */
	@Override
	public long getMiicSafeguardMaterialAddId() {
		return model.getMiicSafeguardMaterialAddId();
	}

	/**
	 * Returns the modified date of this miic safeguard material add.
	 *
	 * @return the modified date of this miic safeguard material add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of producer of this miic safeguard material add.
	 *
	 * @return the name of producer of this miic safeguard material add
	 */
	@Override
	public String getNameOfProducer() {
		return model.getNameOfProducer();
	}

	/**
	 * Returns the period of importation from of this miic safeguard material add.
	 *
	 * @return the period of importation from of this miic safeguard material add
	 */
	@Override
	public Date getPeriodOfImportationFrom() {
		return model.getPeriodOfImportationFrom();
	}

	/**
	 * Returns the period of importation to of this miic safeguard material add.
	 *
	 * @return the period of importation to of this miic safeguard material add
	 */
	@Override
	public Date getPeriodOfImportationTo() {
		return model.getPeriodOfImportationTo();
	}

	/**
	 * Returns the primary key of this miic safeguard material add.
	 *
	 * @return the primary key of this miic safeguard material add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this miic safeguard material add.
	 *
	 * @return the quantity of this miic safeguard material add
	 */
	@Override
	public String getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the tariff heading num of this miic safeguard material add.
	 *
	 * @return the tariff heading num of this miic safeguard material add
	 */
	@Override
	public String getTariffHeadingNum() {
		return model.getTariffHeadingNum();
	}

	/**
	 * Returns the technology specification of this miic safeguard material add.
	 *
	 * @return the technology specification of this miic safeguard material add
	 */
	@Override
	public String getTechnologySpecification() {
		return model.getTechnologySpecification();
	}

	/**
	 * Returns the user ID of this miic safeguard material add.
	 *
	 * @return the user ID of this miic safeguard material add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic safeguard material add.
	 *
	 * @return the user name of this miic safeguard material add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic safeguard material add.
	 *
	 * @return the user uuid of this miic safeguard material add
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
	 * Sets the address of producer of this miic safeguard material add.
	 *
	 * @param addressOfProducer  the address of producer of this miic safeguard material add
	 */
	@Override
	public void setAddressOfProducer(String addressOfProducer) {
		model.setAddressOfProducer(addressOfProducer);
	}

	/**
	 * Sets the amount of this miic safeguard material add.
	 *
	 * @param amount the amount of this miic safeguard material add
	 */
	@Override
	public void setAmount(String amount) {
		model.setAmount(amount);
	}

	/**
	 * Sets the company ID of this miic safeguard material add.
	 *
	 * @param companyId the company ID of this miic safeguard material add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this miic safeguard material add.
	 *
	 * @param counter the counter of this miic safeguard material add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this miic safeguard material add.
	 *
	 * @param createDate the create date of this miic safeguard material add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this miic safeguard material add.
	 *
	 * @param description the description of this miic safeguard material add
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this miic safeguard material add.
	 *
	 * @param groupId the group ID of this miic safeguard material add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the miic application ID of this miic safeguard material add.
	 *
	 * @param miicApplicationId the miic application ID of this miic safeguard material add
	 */
	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		model.setMiicApplicationId(miicApplicationId);
	}

	/**
	 * Sets the miic safeguard material add ID of this miic safeguard material add.
	 *
	 * @param miicSafeguardMaterialAddId the miic safeguard material add ID of this miic safeguard material add
	 */
	@Override
	public void setMiicSafeguardMaterialAddId(long miicSafeguardMaterialAddId) {
		model.setMiicSafeguardMaterialAddId(miicSafeguardMaterialAddId);
	}

	/**
	 * Sets the modified date of this miic safeguard material add.
	 *
	 * @param modifiedDate the modified date of this miic safeguard material add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of producer of this miic safeguard material add.
	 *
	 * @param nameOfProducer the name of producer of this miic safeguard material add
	 */
	@Override
	public void setNameOfProducer(String nameOfProducer) {
		model.setNameOfProducer(nameOfProducer);
	}

	/**
	 * Sets the period of importation from of this miic safeguard material add.
	 *
	 * @param periodOfImportationFrom the period of importation from of this miic safeguard material add
	 */
	@Override
	public void setPeriodOfImportationFrom(Date periodOfImportationFrom) {
		model.setPeriodOfImportationFrom(periodOfImportationFrom);
	}

	/**
	 * Sets the period of importation to of this miic safeguard material add.
	 *
	 * @param periodOfImportationTo the period of importation to of this miic safeguard material add
	 */
	@Override
	public void setPeriodOfImportationTo(Date periodOfImportationTo) {
		model.setPeriodOfImportationTo(periodOfImportationTo);
	}

	/**
	 * Sets the primary key of this miic safeguard material add.
	 *
	 * @param primaryKey the primary key of this miic safeguard material add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this miic safeguard material add.
	 *
	 * @param quantity the quantity of this miic safeguard material add
	 */
	@Override
	public void setQuantity(String quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the tariff heading num of this miic safeguard material add.
	 *
	 * @param tariffHeadingNum the tariff heading num of this miic safeguard material add
	 */
	@Override
	public void setTariffHeadingNum(String tariffHeadingNum) {
		model.setTariffHeadingNum(tariffHeadingNum);
	}

	/**
	 * Sets the technology specification of this miic safeguard material add.
	 *
	 * @param technologySpecification the technology specification of this miic safeguard material add
	 */
	@Override
	public void setTechnologySpecification(String technologySpecification) {
		model.setTechnologySpecification(technologySpecification);
	}

	/**
	 * Sets the user ID of this miic safeguard material add.
	 *
	 * @param userId the user ID of this miic safeguard material add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic safeguard material add.
	 *
	 * @param userName the user name of this miic safeguard material add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic safeguard material add.
	 *
	 * @param userUuid the user uuid of this miic safeguard material add
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
	protected MiicSafeguardMaterialAddWrapper wrap(
		MiicSafeguardMaterialAdd miicSafeguardMaterialAdd) {

		return new MiicSafeguardMaterialAddWrapper(miicSafeguardMaterialAdd);
	}

}