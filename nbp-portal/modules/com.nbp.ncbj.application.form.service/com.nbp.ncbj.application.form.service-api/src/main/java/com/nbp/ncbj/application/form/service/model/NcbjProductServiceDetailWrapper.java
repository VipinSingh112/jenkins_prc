/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjProductServiceDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjProductServiceDetail
 * @generated
 */
public class NcbjProductServiceDetailWrapper
	extends BaseModelWrapper<NcbjProductServiceDetail>
	implements ModelWrapper<NcbjProductServiceDetail>,
			   NcbjProductServiceDetail {

	public NcbjProductServiceDetailWrapper(
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		super(ncbjProductServiceDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"ncbjProductServiceDetailId", getNcbjProductServiceDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productType", getProductType());
		attributes.put("productList", getProductList());
		attributes.put("productLines", getProductLines());
		attributes.put("counter", getCounter());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjProductServiceDetailId = (Long)attributes.get(
			"ncbjProductServiceDetailId");

		if (ncbjProductServiceDetailId != null) {
			setNcbjProductServiceDetailId(ncbjProductServiceDetailId);
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

		String productType = (String)attributes.get("productType");

		if (productType != null) {
			setProductType(productType);
		}

		String productList = (String)attributes.get("productList");

		if (productList != null) {
			setProductList(productList);
		}

		String productLines = (String)attributes.get("productLines");

		if (productLines != null) {
			setProductLines(productLines);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjProductServiceDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncbj product service detail.
	 *
	 * @return the company ID of this ncbj product service detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this ncbj product service detail.
	 *
	 * @return the counter of this ncbj product service detail
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncbj product service detail.
	 *
	 * @return the create date of this ncbj product service detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj product service detail.
	 *
	 * @return the group ID of this ncbj product service detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj product service detail.
	 *
	 * @return the modified date of this ncbj product service detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj product service detail.
	 *
	 * @return the ncbj application ID of this ncbj product service detail
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj product service detail ID of this ncbj product service detail.
	 *
	 * @return the ncbj product service detail ID of this ncbj product service detail
	 */
	@Override
	public long getNcbjProductServiceDetailId() {
		return model.getNcbjProductServiceDetailId();
	}

	/**
	 * Returns the primary key of this ncbj product service detail.
	 *
	 * @return the primary key of this ncbj product service detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the product lines of this ncbj product service detail.
	 *
	 * @return the product lines of this ncbj product service detail
	 */
	@Override
	public String getProductLines() {
		return model.getProductLines();
	}

	/**
	 * Returns the product list of this ncbj product service detail.
	 *
	 * @return the product list of this ncbj product service detail
	 */
	@Override
	public String getProductList() {
		return model.getProductList();
	}

	/**
	 * Returns the product type of this ncbj product service detail.
	 *
	 * @return the product type of this ncbj product service detail
	 */
	@Override
	public String getProductType() {
		return model.getProductType();
	}

	/**
	 * Returns the user ID of this ncbj product service detail.
	 *
	 * @return the user ID of this ncbj product service detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj product service detail.
	 *
	 * @return the user name of this ncbj product service detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj product service detail.
	 *
	 * @return the user uuid of this ncbj product service detail
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
	 * Sets the company ID of this ncbj product service detail.
	 *
	 * @param companyId the company ID of this ncbj product service detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this ncbj product service detail.
	 *
	 * @param counter the counter of this ncbj product service detail
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncbj product service detail.
	 *
	 * @param createDate the create date of this ncbj product service detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj product service detail.
	 *
	 * @param groupId the group ID of this ncbj product service detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj product service detail.
	 *
	 * @param modifiedDate the modified date of this ncbj product service detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj product service detail.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj product service detail
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj product service detail ID of this ncbj product service detail.
	 *
	 * @param ncbjProductServiceDetailId the ncbj product service detail ID of this ncbj product service detail
	 */
	@Override
	public void setNcbjProductServiceDetailId(long ncbjProductServiceDetailId) {
		model.setNcbjProductServiceDetailId(ncbjProductServiceDetailId);
	}

	/**
	 * Sets the primary key of this ncbj product service detail.
	 *
	 * @param primaryKey the primary key of this ncbj product service detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the product lines of this ncbj product service detail.
	 *
	 * @param productLines the product lines of this ncbj product service detail
	 */
	@Override
	public void setProductLines(String productLines) {
		model.setProductLines(productLines);
	}

	/**
	 * Sets the product list of this ncbj product service detail.
	 *
	 * @param productList the product list of this ncbj product service detail
	 */
	@Override
	public void setProductList(String productList) {
		model.setProductList(productList);
	}

	/**
	 * Sets the product type of this ncbj product service detail.
	 *
	 * @param productType the product type of this ncbj product service detail
	 */
	@Override
	public void setProductType(String productType) {
		model.setProductType(productType);
	}

	/**
	 * Sets the user ID of this ncbj product service detail.
	 *
	 * @param userId the user ID of this ncbj product service detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj product service detail.
	 *
	 * @param userName the user name of this ncbj product service detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj product service detail.
	 *
	 * @param userUuid the user uuid of this ncbj product service detail
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
	protected NcbjProductServiceDetailWrapper wrap(
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		return new NcbjProductServiceDetailWrapper(ncbjProductServiceDetail);
	}

}