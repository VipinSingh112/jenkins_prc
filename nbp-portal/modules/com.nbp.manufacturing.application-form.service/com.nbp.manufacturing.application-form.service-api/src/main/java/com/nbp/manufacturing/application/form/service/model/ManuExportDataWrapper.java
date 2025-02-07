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
 * This class is a wrapper for {@link ManuExportData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuExportData
 * @generated
 */
public class ManuExportDataWrapper
	extends BaseModelWrapper<ManuExportData>
	implements ManuExportData, ModelWrapper<ManuExportData> {

	public ManuExportDataWrapper(ManuExportData manuExportData) {
		super(manuExportData);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("manuExportDataId", getManuExportDataId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyInvolved", getCompanyInvolved());
		attributes.put("itemsName", getItemsName());
		attributes.put("quantity", getQuantity());
		attributes.put("monetary", getMonetary());
		attributes.put("countryName", getCountryName());
		attributes.put(
			"manufacturingApplicationId", getManufacturingApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long manuExportDataId = (Long)attributes.get("manuExportDataId");

		if (manuExportDataId != null) {
			setManuExportDataId(manuExportDataId);
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

		String companyInvolved = (String)attributes.get("companyInvolved");

		if (companyInvolved != null) {
			setCompanyInvolved(companyInvolved);
		}

		String itemsName = (String)attributes.get("itemsName");

		if (itemsName != null) {
			setItemsName(itemsName);
		}

		String quantity = (String)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String monetary = (String)attributes.get("monetary");

		if (monetary != null) {
			setMonetary(monetary);
		}

		String countryName = (String)attributes.get("countryName");

		if (countryName != null) {
			setCountryName(countryName);
		}

		Long manufacturingApplicationId = (Long)attributes.get(
			"manufacturingApplicationId");

		if (manufacturingApplicationId != null) {
			setManufacturingApplicationId(manufacturingApplicationId);
		}
	}

	@Override
	public ManuExportData cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this manu export data.
	 *
	 * @return the company ID of this manu export data
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company involved of this manu export data.
	 *
	 * @return the company involved of this manu export data
	 */
	@Override
	public String getCompanyInvolved() {
		return model.getCompanyInvolved();
	}

	/**
	 * Returns the country name of this manu export data.
	 *
	 * @return the country name of this manu export data
	 */
	@Override
	public String getCountryName() {
		return model.getCountryName();
	}

	/**
	 * Returns the create date of this manu export data.
	 *
	 * @return the create date of this manu export data
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this manu export data.
	 *
	 * @return the group ID of this manu export data
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the items name of this manu export data.
	 *
	 * @return the items name of this manu export data
	 */
	@Override
	public String getItemsName() {
		return model.getItemsName();
	}

	/**
	 * Returns the manu export data ID of this manu export data.
	 *
	 * @return the manu export data ID of this manu export data
	 */
	@Override
	public long getManuExportDataId() {
		return model.getManuExportDataId();
	}

	/**
	 * Returns the manufacturing application ID of this manu export data.
	 *
	 * @return the manufacturing application ID of this manu export data
	 */
	@Override
	public long getManufacturingApplicationId() {
		return model.getManufacturingApplicationId();
	}

	/**
	 * Returns the modified date of this manu export data.
	 *
	 * @return the modified date of this manu export data
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the monetary of this manu export data.
	 *
	 * @return the monetary of this manu export data
	 */
	@Override
	public String getMonetary() {
		return model.getMonetary();
	}

	/**
	 * Returns the primary key of this manu export data.
	 *
	 * @return the primary key of this manu export data
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this manu export data.
	 *
	 * @return the quantity of this manu export data
	 */
	@Override
	public String getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the user ID of this manu export data.
	 *
	 * @return the user ID of this manu export data
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this manu export data.
	 *
	 * @return the user name of this manu export data
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this manu export data.
	 *
	 * @return the user uuid of this manu export data
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
	 * Sets the company ID of this manu export data.
	 *
	 * @param companyId the company ID of this manu export data
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company involved of this manu export data.
	 *
	 * @param companyInvolved the company involved of this manu export data
	 */
	@Override
	public void setCompanyInvolved(String companyInvolved) {
		model.setCompanyInvolved(companyInvolved);
	}

	/**
	 * Sets the country name of this manu export data.
	 *
	 * @param countryName the country name of this manu export data
	 */
	@Override
	public void setCountryName(String countryName) {
		model.setCountryName(countryName);
	}

	/**
	 * Sets the create date of this manu export data.
	 *
	 * @param createDate the create date of this manu export data
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this manu export data.
	 *
	 * @param groupId the group ID of this manu export data
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the items name of this manu export data.
	 *
	 * @param itemsName the items name of this manu export data
	 */
	@Override
	public void setItemsName(String itemsName) {
		model.setItemsName(itemsName);
	}

	/**
	 * Sets the manu export data ID of this manu export data.
	 *
	 * @param manuExportDataId the manu export data ID of this manu export data
	 */
	@Override
	public void setManuExportDataId(long manuExportDataId) {
		model.setManuExportDataId(manuExportDataId);
	}

	/**
	 * Sets the manufacturing application ID of this manu export data.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu export data
	 */
	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		model.setManufacturingApplicationId(manufacturingApplicationId);
	}

	/**
	 * Sets the modified date of this manu export data.
	 *
	 * @param modifiedDate the modified date of this manu export data
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the monetary of this manu export data.
	 *
	 * @param monetary the monetary of this manu export data
	 */
	@Override
	public void setMonetary(String monetary) {
		model.setMonetary(monetary);
	}

	/**
	 * Sets the primary key of this manu export data.
	 *
	 * @param primaryKey the primary key of this manu export data
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this manu export data.
	 *
	 * @param quantity the quantity of this manu export data
	 */
	@Override
	public void setQuantity(String quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the user ID of this manu export data.
	 *
	 * @param userId the user ID of this manu export data
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this manu export data.
	 *
	 * @param userName the user name of this manu export data
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this manu export data.
	 *
	 * @param userUuid the user uuid of this manu export data
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
	protected ManuExportDataWrapper wrap(ManuExportData manuExportData) {
		return new ManuExportDataWrapper(manuExportData);
	}

}