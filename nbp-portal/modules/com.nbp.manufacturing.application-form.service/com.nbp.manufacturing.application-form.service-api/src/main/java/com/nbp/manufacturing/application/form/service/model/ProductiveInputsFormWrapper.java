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
 * This class is a wrapper for {@link ProductiveInputsForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsForm
 * @generated
 */
public class ProductiveInputsFormWrapper
	extends BaseModelWrapper<ProductiveInputsForm>
	implements ModelWrapper<ProductiveInputsForm>, ProductiveInputsForm {

	public ProductiveInputsFormWrapper(
		ProductiveInputsForm productiveInputsForm) {

		super(productiveInputsForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productiveInputsFormId", getProductiveInputsFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("categoryOfGoods", getCategoryOfGoods());
		attributes.put("manufactureProducts", getManufactureProducts());
		attributes.put("proposedProducts", getProposedProducts());
		attributes.put("processType", getProcessType());
		attributes.put("tariffCode", getTariffCode());
		attributes.put("manufactureItem", getManufactureItem());
		attributes.put("importedCaricom", getImportedCaricom());
		attributes.put("rawMaterialPurchased", getRawMaterialPurchased());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productiveInputsFormId = (Long)attributes.get(
			"productiveInputsFormId");

		if (productiveInputsFormId != null) {
			setProductiveInputsFormId(productiveInputsFormId);
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

		String categoryOfGoods = (String)attributes.get("categoryOfGoods");

		if (categoryOfGoods != null) {
			setCategoryOfGoods(categoryOfGoods);
		}

		String manufactureProducts = (String)attributes.get(
			"manufactureProducts");

		if (manufactureProducts != null) {
			setManufactureProducts(manufactureProducts);
		}

		String proposedProducts = (String)attributes.get("proposedProducts");

		if (proposedProducts != null) {
			setProposedProducts(proposedProducts);
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

		String rawMaterialPurchased = (String)attributes.get(
			"rawMaterialPurchased");

		if (rawMaterialPurchased != null) {
			setRawMaterialPurchased(rawMaterialPurchased);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}
	}

	@Override
	public ProductiveInputsForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category of goods of this productive inputs form.
	 *
	 * @return the category of goods of this productive inputs form
	 */
	@Override
	public String getCategoryOfGoods() {
		return model.getCategoryOfGoods();
	}

	/**
	 * Returns the company ID of this productive inputs form.
	 *
	 * @return the company ID of this productive inputs form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this productive inputs form.
	 *
	 * @return the create date of this productive inputs form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this productive inputs form.
	 *
	 * @return the group ID of this productive inputs form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the imported caricom of this productive inputs form.
	 *
	 * @return the imported caricom of this productive inputs form
	 */
	@Override
	public String getImportedCaricom() {
		return model.getImportedCaricom();
	}

	/**
	 * Returns the manufacture item of this productive inputs form.
	 *
	 * @return the manufacture item of this productive inputs form
	 */
	@Override
	public String getManufactureItem() {
		return model.getManufactureItem();
	}

	/**
	 * Returns the manufacture products of this productive inputs form.
	 *
	 * @return the manufacture products of this productive inputs form
	 */
	@Override
	public String getManufactureProducts() {
		return model.getManufactureProducts();
	}

	/**
	 * Returns the manufacturing application ID of this productive inputs form.
	 *
	 * @return the manufacturing application ID of this productive inputs form
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this productive inputs form.
	 *
	 * @return the modified date of this productive inputs form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this productive inputs form.
	 *
	 * @return the primary key of this productive inputs form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the process type of this productive inputs form.
	 *
	 * @return the process type of this productive inputs form
	 */
	@Override
	public String getProcessType() {
		return model.getProcessType();
	}

	/**
	 * Returns the productive inputs form ID of this productive inputs form.
	 *
	 * @return the productive inputs form ID of this productive inputs form
	 */
	@Override
	public long getProductiveInputsFormId() {
		return model.getProductiveInputsFormId();
	}

	/**
	 * Returns the proposed products of this productive inputs form.
	 *
	 * @return the proposed products of this productive inputs form
	 */
	@Override
	public String getProposedProducts() {
		return model.getProposedProducts();
	}

	/**
	 * Returns the raw material purchased of this productive inputs form.
	 *
	 * @return the raw material purchased of this productive inputs form
	 */
	@Override
	public String getRawMaterialPurchased() {
		return model.getRawMaterialPurchased();
	}

	/**
	 * Returns the tariff code of this productive inputs form.
	 *
	 * @return the tariff code of this productive inputs form
	 */
	@Override
	public String getTariffCode() {
		return model.getTariffCode();
	}

	/**
	 * Returns the user ID of this productive inputs form.
	 *
	 * @return the user ID of this productive inputs form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this productive inputs form.
	 *
	 * @return the user name of this productive inputs form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this productive inputs form.
	 *
	 * @return the user uuid of this productive inputs form
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
	 * Sets the category of goods of this productive inputs form.
	 *
	 * @param categoryOfGoods the category of goods of this productive inputs form
	 */
	@Override
	public void setCategoryOfGoods(String categoryOfGoods) {
		model.setCategoryOfGoods(categoryOfGoods);
	}

	/**
	 * Sets the company ID of this productive inputs form.
	 *
	 * @param companyId the company ID of this productive inputs form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this productive inputs form.
	 *
	 * @param createDate the create date of this productive inputs form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this productive inputs form.
	 *
	 * @param groupId the group ID of this productive inputs form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the imported caricom of this productive inputs form.
	 *
	 * @param importedCaricom the imported caricom of this productive inputs form
	 */
	@Override
	public void setImportedCaricom(String importedCaricom) {
		model.setImportedCaricom(importedCaricom);
	}

	/**
	 * Sets the manufacture item of this productive inputs form.
	 *
	 * @param manufactureItem the manufacture item of this productive inputs form
	 */
	@Override
	public void setManufactureItem(String manufactureItem) {
		model.setManufactureItem(manufactureItem);
	}

	/**
	 * Sets the manufacture products of this productive inputs form.
	 *
	 * @param manufactureProducts the manufacture products of this productive inputs form
	 */
	@Override
	public void setManufactureProducts(String manufactureProducts) {
		model.setManufactureProducts(manufactureProducts);
	}

	/**
	 * Sets the manufacturing application ID of this productive inputs form.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this productive inputs form
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this productive inputs form.
	 *
	 * @param modifiedDate the modified date of this productive inputs form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this productive inputs form.
	 *
	 * @param primaryKey the primary key of this productive inputs form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the process type of this productive inputs form.
	 *
	 * @param processType the process type of this productive inputs form
	 */
	@Override
	public void setProcessType(String processType) {
		model.setProcessType(processType);
	}

	/**
	 * Sets the productive inputs form ID of this productive inputs form.
	 *
	 * @param productiveInputsFormId the productive inputs form ID of this productive inputs form
	 */
	@Override
	public void setProductiveInputsFormId(long productiveInputsFormId) {
		model.setProductiveInputsFormId(productiveInputsFormId);
	}

	/**
	 * Sets the proposed products of this productive inputs form.
	 *
	 * @param proposedProducts the proposed products of this productive inputs form
	 */
	@Override
	public void setProposedProducts(String proposedProducts) {
		model.setProposedProducts(proposedProducts);
	}

	/**
	 * Sets the raw material purchased of this productive inputs form.
	 *
	 * @param rawMaterialPurchased the raw material purchased of this productive inputs form
	 */
	@Override
	public void setRawMaterialPurchased(String rawMaterialPurchased) {
		model.setRawMaterialPurchased(rawMaterialPurchased);
	}

	/**
	 * Sets the tariff code of this productive inputs form.
	 *
	 * @param tariffCode the tariff code of this productive inputs form
	 */
	@Override
	public void setTariffCode(String tariffCode) {
		model.setTariffCode(tariffCode);
	}

	/**
	 * Sets the user ID of this productive inputs form.
	 *
	 * @param userId the user ID of this productive inputs form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this productive inputs form.
	 *
	 * @param userName the user name of this productive inputs form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this productive inputs form.
	 *
	 * @param userUuid the user uuid of this productive inputs form
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
	protected ProductiveInputsFormWrapper wrap(
		ProductiveInputsForm productiveInputsForm) {

		return new ProductiveInputsFormWrapper(productiveInputsForm);
	}

}