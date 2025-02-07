/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FactoriesProductDetailsAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAdd
 * @generated
 */
public class FactoriesProductDetailsAddWrapper
	extends BaseModelWrapper<FactoriesProductDetailsAdd>
	implements FactoriesProductDetailsAdd,
			   ModelWrapper<FactoriesProductDetailsAdd> {

	public FactoriesProductDetailsAddWrapper(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		super(factoriesProductDetailsAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"factoriesProductDetailsAddId", getFactoriesProductDetailsAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productBrand", getProductBrand());
		attributes.put("product", getProduct());
		attributes.put("productSize", getProductSize());
		attributes.put("productMeasurementVal", getProductMeasurementVal());
		attributes.put("counter", getCounter());
		attributes.put("factoriesApplicationId", getFactoriesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long factoriesProductDetailsAddId = (Long)attributes.get(
			"factoriesProductDetailsAddId");

		if (factoriesProductDetailsAddId != null) {
			setFactoriesProductDetailsAddId(factoriesProductDetailsAddId);
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

		String productBrand = (String)attributes.get("productBrand");

		if (productBrand != null) {
			setProductBrand(productBrand);
		}

		String product = (String)attributes.get("product");

		if (product != null) {
			setProduct(product);
		}

		String productSize = (String)attributes.get("productSize");

		if (productSize != null) {
			setProductSize(productSize);
		}

		String productMeasurementVal = (String)attributes.get(
			"productMeasurementVal");

		if (productMeasurementVal != null) {
			setProductMeasurementVal(productMeasurementVal);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long factoriesApplicationId = (Long)attributes.get(
			"factoriesApplicationId");

		if (factoriesApplicationId != null) {
			setFactoriesApplicationId(factoriesApplicationId);
		}
	}

	@Override
	public FactoriesProductDetailsAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this factories product details add.
	 *
	 * @return the company ID of this factories product details add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this factories product details add.
	 *
	 * @return the counter of this factories product details add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this factories product details add.
	 *
	 * @return the create date of this factories product details add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the factories application ID of this factories product details add.
	 *
	 * @return the factories application ID of this factories product details add
	 */
	@Override
	public long getFactoriesApplicationId() {
		return model.getFactoriesApplicationId();
	}

	/**
	 * Returns the factories product details add ID of this factories product details add.
	 *
	 * @return the factories product details add ID of this factories product details add
	 */
	@Override
	public long getFactoriesProductDetailsAddId() {
		return model.getFactoriesProductDetailsAddId();
	}

	/**
	 * Returns the group ID of this factories product details add.
	 *
	 * @return the group ID of this factories product details add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this factories product details add.
	 *
	 * @return the modified date of this factories product details add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this factories product details add.
	 *
	 * @return the primary key of this factories product details add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product of this factories product details add.
	 *
	 * @return the product of this factories product details add
	 */
	@Override
	public String getProduct() {
		return model.getProduct();
	}

	/**
	 * Returns the product brand of this factories product details add.
	 *
	 * @return the product brand of this factories product details add
	 */
	@Override
	public String getProductBrand() {
		return model.getProductBrand();
	}

	/**
	 * Returns the product measurement val of this factories product details add.
	 *
	 * @return the product measurement val of this factories product details add
	 */
	@Override
	public String getProductMeasurementVal() {
		return model.getProductMeasurementVal();
	}

	/**
	 * Returns the product size of this factories product details add.
	 *
	 * @return the product size of this factories product details add
	 */
	@Override
	public String getProductSize() {
		return model.getProductSize();
	}

	/**
	 * Returns the user ID of this factories product details add.
	 *
	 * @return the user ID of this factories product details add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this factories product details add.
	 *
	 * @return the user name of this factories product details add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this factories product details add.
	 *
	 * @return the user uuid of this factories product details add
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
	 * Sets the company ID of this factories product details add.
	 *
	 * @param companyId the company ID of this factories product details add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this factories product details add.
	 *
	 * @param counter the counter of this factories product details add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this factories product details add.
	 *
	 * @param createDate the create date of this factories product details add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the factories application ID of this factories product details add.
	 *
	 * @param factoriesApplicationId the factories application ID of this factories product details add
	 */
	@Override
	public void setFactoriesApplicationId(long factoriesApplicationId) {
		model.setFactoriesApplicationId(factoriesApplicationId);
	}

	/**
	 * Sets the factories product details add ID of this factories product details add.
	 *
	 * @param factoriesProductDetailsAddId the factories product details add ID of this factories product details add
	 */
	@Override
	public void setFactoriesProductDetailsAddId(
		long factoriesProductDetailsAddId) {

		model.setFactoriesProductDetailsAddId(factoriesProductDetailsAddId);
	}

	/**
	 * Sets the group ID of this factories product details add.
	 *
	 * @param groupId the group ID of this factories product details add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this factories product details add.
	 *
	 * @param modifiedDate the modified date of this factories product details add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this factories product details add.
	 *
	 * @param primaryKey the primary key of this factories product details add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product of this factories product details add.
	 *
	 * @param product the product of this factories product details add
	 */
	@Override
	public void setProduct(String product) {
		model.setProduct(product);
	}

	/**
	 * Sets the product brand of this factories product details add.
	 *
	 * @param productBrand the product brand of this factories product details add
	 */
	@Override
	public void setProductBrand(String productBrand) {
		model.setProductBrand(productBrand);
	}

	/**
	 * Sets the product measurement val of this factories product details add.
	 *
	 * @param productMeasurementVal the product measurement val of this factories product details add
	 */
	@Override
	public void setProductMeasurementVal(String productMeasurementVal) {
		model.setProductMeasurementVal(productMeasurementVal);
	}

	/**
	 * Sets the product size of this factories product details add.
	 *
	 * @param productSize the product size of this factories product details add
	 */
	@Override
	public void setProductSize(String productSize) {
		model.setProductSize(productSize);
	}

	/**
	 * Sets the user ID of this factories product details add.
	 *
	 * @param userId the user ID of this factories product details add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this factories product details add.
	 *
	 * @param userName the user name of this factories product details add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this factories product details add.
	 *
	 * @param userUuid the user uuid of this factories product details add
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
	protected FactoriesProductDetailsAddWrapper wrap(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return new FactoriesProductDetailsAddWrapper(
			factoriesProductDetailsAdd);
	}

}