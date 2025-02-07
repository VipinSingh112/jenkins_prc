/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ProductiveInputsFormAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAdd
 * @generated
 */
public class ProductiveInputsFormAddWrapper
	extends BaseModelWrapper<ProductiveInputsFormAdd>
	implements ModelWrapper<ProductiveInputsFormAdd>, ProductiveInputsFormAdd {

	public ProductiveInputsFormAddWrapper(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		super(productiveInputsFormAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"productiveInputsFormAddId", getProductiveInputsFormAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("processType", getProcessType());
		attributes.put("tariffCode", getTariffCode());
		attributes.put("manufactureItem", getManufactureItem());
		attributes.put("importedCaricom", getImportedCaricom());
		attributes.put("counter", getCounter());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());
		attributes.put("productiveInputsFormId", getProductiveInputsFormId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productiveInputsFormAddId = (Long)attributes.get(
			"productiveInputsFormAddId");

		if (productiveInputsFormAddId != null) {
			setProductiveInputsFormAddId(productiveInputsFormAddId);
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

		String processType = (String)attributes.get("processType");

		if (processType != null) {
			setProcessType(processType);
		}

		String tariffCode = (String)attributes.get("tariffCode");

		if (tariffCode != null) {
			setTariffCode(tariffCode);
		}

		String manufactureItem = (String)attributes.get("manufactureItem");

		if (manufactureItem != null) {
			setManufactureItem(manufactureItem);
		}

		String importedCaricom = (String)attributes.get("importedCaricom");

		if (importedCaricom != null) {
			setImportedCaricom(importedCaricom);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}

		Long productiveInputsFormId = (Long)attributes.get(
			"productiveInputsFormId");

		if (productiveInputsFormId != null) {
			setProductiveInputsFormId(productiveInputsFormId);
		}
	}

	@Override
	public ProductiveInputsFormAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this productive inputs form add.
	 *
	 * @return the company ID of this productive inputs form add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this productive inputs form add.
	 *
	 * @return the counter of this productive inputs form add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this productive inputs form add.
	 *
	 * @return the create date of this productive inputs form add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this productive inputs form add.
	 *
	 * @return the group ID of this productive inputs form add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the imported caricom of this productive inputs form add.
	 *
	 * @return the imported caricom of this productive inputs form add
	 */
	@Override
	public String getImportedCaricom() {
		return model.getImportedCaricom();
	}

	/**
	 * Returns the manufacture item of this productive inputs form add.
	 *
	 * @return the manufacture item of this productive inputs form add
	 */
	@Override
	public String getManufactureItem() {
		return model.getManufactureItem();
	}

	/**
	 * Returns the manufacturing application ID of this productive inputs form add.
	 *
	 * @return the manufacturing application ID of this productive inputs form add
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this productive inputs form add.
	 *
	 * @return the modified date of this productive inputs form add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this productive inputs form add.
	 *
	 * @return the primary key of this productive inputs form add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the process type of this productive inputs form add.
	 *
	 * @return the process type of this productive inputs form add
	 */
	@Override
	public String getProcessType() {
		return model.getProcessType();
	}

	/**
	 * Returns the productive inputs form add ID of this productive inputs form add.
	 *
	 * @return the productive inputs form add ID of this productive inputs form add
	 */
	@Override
	public long getProductiveInputsFormAddId() {
		return model.getProductiveInputsFormAddId();
	}

	/**
	 * Returns the productive inputs form ID of this productive inputs form add.
	 *
	 * @return the productive inputs form ID of this productive inputs form add
	 */
	@Override
	public long getProductiveInputsFormId() {
		return model.getProductiveInputsFormId();
	}

	/**
	 * Returns the tariff code of this productive inputs form add.
	 *
	 * @return the tariff code of this productive inputs form add
	 */
	@Override
	public String getTariffCode() {
		return model.getTariffCode();
	}

	/**
	 * Returns the user ID of this productive inputs form add.
	 *
	 * @return the user ID of this productive inputs form add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this productive inputs form add.
	 *
	 * @return the user name of this productive inputs form add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this productive inputs form add.
	 *
	 * @return the user uuid of this productive inputs form add
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
	 * Sets the company ID of this productive inputs form add.
	 *
	 * @param companyId the company ID of this productive inputs form add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this productive inputs form add.
	 *
	 * @param counter the counter of this productive inputs form add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this productive inputs form add.
	 *
	 * @param createDate the create date of this productive inputs form add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this productive inputs form add.
	 *
	 * @param groupId the group ID of this productive inputs form add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the imported caricom of this productive inputs form add.
	 *
	 * @param importedCaricom the imported caricom of this productive inputs form add
	 */
	@Override
	public void setImportedCaricom(String importedCaricom) {
		model.setImportedCaricom(importedCaricom);
	}

	/**
	 * Sets the manufacture item of this productive inputs form add.
	 *
	 * @param manufactureItem the manufacture item of this productive inputs form add
	 */
	@Override
	public void setManufactureItem(String manufactureItem) {
		model.setManufactureItem(manufactureItem);
	}

	/**
	 * Sets the manufacturing application ID of this productive inputs form add.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this productive inputs form add
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this productive inputs form add.
	 *
	 * @param modifiedDate the modified date of this productive inputs form add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this productive inputs form add.
	 *
	 * @param primaryKey the primary key of this productive inputs form add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the process type of this productive inputs form add.
	 *
	 * @param processType the process type of this productive inputs form add
	 */
	@Override
	public void setProcessType(String processType) {
		model.setProcessType(processType);
	}

	/**
	 * Sets the productive inputs form add ID of this productive inputs form add.
	 *
	 * @param productiveInputsFormAddId the productive inputs form add ID of this productive inputs form add
	 */
	@Override
	public void setProductiveInputsFormAddId(long productiveInputsFormAddId) {
		model.setProductiveInputsFormAddId(productiveInputsFormAddId);
	}

	/**
	 * Sets the productive inputs form ID of this productive inputs form add.
	 *
	 * @param productiveInputsFormId the productive inputs form ID of this productive inputs form add
	 */
	@Override
	public void setProductiveInputsFormId(long productiveInputsFormId) {
		model.setProductiveInputsFormId(productiveInputsFormId);
	}

	/**
	 * Sets the tariff code of this productive inputs form add.
	 *
	 * @param tariffCode the tariff code of this productive inputs form add
	 */
	@Override
	public void setTariffCode(String tariffCode) {
		model.setTariffCode(tariffCode);
	}

	/**
	 * Sets the user ID of this productive inputs form add.
	 *
	 * @param userId the user ID of this productive inputs form add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this productive inputs form add.
	 *
	 * @param userName the user name of this productive inputs form add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this productive inputs form add.
	 *
	 * @param userUuid the user uuid of this productive inputs form add
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
	protected ProductiveInputsFormAddWrapper wrap(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		return new ProductiveInputsFormAddWrapper(productiveInputsFormAdd);
	}

}