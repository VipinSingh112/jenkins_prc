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
 * This class is a wrapper for {@link NcbjSectionOne}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOne
 * @generated
 */
public class NcbjSectionOneWrapper
	extends BaseModelWrapper<NcbjSectionOne>
	implements ModelWrapper<NcbjSectionOne>, NcbjSectionOne {

	public NcbjSectionOneWrapper(NcbjSectionOne ncbjSectionOne) {
		super(ncbjSectionOne);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjSectionOneId", getNcbjSectionOneId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("numberOfProductTypes", getNumberOfProductTypes());
		attributes.put("pleaseListProduct", getPleaseListProduct());
		attributes.put("numberOfProductionLines", getNumberOfProductionLines());
		attributes.put("exclusionActivities", getExclusionActivities());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjSectionOneId = (Long)attributes.get("ncbjSectionOneId");

		if (ncbjSectionOneId != null) {
			setNcbjSectionOneId(ncbjSectionOneId);
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

		String numberOfProductTypes = (String)attributes.get(
			"numberOfProductTypes");

		if (numberOfProductTypes != null) {
			setNumberOfProductTypes(numberOfProductTypes);
		}

		String pleaseListProduct = (String)attributes.get("pleaseListProduct");

		if (pleaseListProduct != null) {
			setPleaseListProduct(pleaseListProduct);
		}

		Date numberOfProductionLines = (Date)attributes.get(
			"numberOfProductionLines");

		if (numberOfProductionLines != null) {
			setNumberOfProductionLines(numberOfProductionLines);
		}

		Date exclusionActivities = (Date)attributes.get("exclusionActivities");

		if (exclusionActivities != null) {
			setExclusionActivities(exclusionActivities);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjSectionOne cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncbj section one.
	 *
	 * @return the company ID of this ncbj section one
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj section one.
	 *
	 * @return the create date of this ncbj section one
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the exclusion activities of this ncbj section one.
	 *
	 * @return the exclusion activities of this ncbj section one
	 */
	@Override
	public Date getExclusionActivities() {
		return model.getExclusionActivities();
	}

	/**
	 * Returns the group ID of this ncbj section one.
	 *
	 * @return the group ID of this ncbj section one
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj section one.
	 *
	 * @return the modified date of this ncbj section one
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj section one.
	 *
	 * @return the ncbj application ID of this ncbj section one
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj section one ID of this ncbj section one.
	 *
	 * @return the ncbj section one ID of this ncbj section one
	 */
	@Override
	public long getNcbjSectionOneId() {
		return model.getNcbjSectionOneId();
	}

	/**
	 * Returns the number of production lines of this ncbj section one.
	 *
	 * @return the number of production lines of this ncbj section one
	 */
	@Override
	public Date getNumberOfProductionLines() {
		return model.getNumberOfProductionLines();
	}

	/**
	 * Returns the number of product types of this ncbj section one.
	 *
	 * @return the number of product types of this ncbj section one
	 */
	@Override
	public String getNumberOfProductTypes() {
		return model.getNumberOfProductTypes();
	}

	/**
	 * Returns the please list product of this ncbj section one.
	 *
	 * @return the please list product of this ncbj section one
	 */
	@Override
	public String getPleaseListProduct() {
		return model.getPleaseListProduct();
	}

	/**
	 * Returns the primary key of this ncbj section one.
	 *
	 * @return the primary key of this ncbj section one
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncbj section one.
	 *
	 * @return the user ID of this ncbj section one
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj section one.
	 *
	 * @return the user name of this ncbj section one
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj section one.
	 *
	 * @return the user uuid of this ncbj section one
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
	 * Sets the company ID of this ncbj section one.
	 *
	 * @param companyId the company ID of this ncbj section one
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj section one.
	 *
	 * @param createDate the create date of this ncbj section one
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the exclusion activities of this ncbj section one.
	 *
	 * @param exclusionActivities the exclusion activities of this ncbj section one
	 */
	@Override
	public void setExclusionActivities(Date exclusionActivities) {
		model.setExclusionActivities(exclusionActivities);
	}

	/**
	 * Sets the group ID of this ncbj section one.
	 *
	 * @param groupId the group ID of this ncbj section one
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj section one.
	 *
	 * @param modifiedDate the modified date of this ncbj section one
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj section one.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj section one
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj section one ID of this ncbj section one.
	 *
	 * @param ncbjSectionOneId the ncbj section one ID of this ncbj section one
	 */
	@Override
	public void setNcbjSectionOneId(long ncbjSectionOneId) {
		model.setNcbjSectionOneId(ncbjSectionOneId);
	}

	/**
	 * Sets the number of production lines of this ncbj section one.
	 *
	 * @param numberOfProductionLines the number of production lines of this ncbj section one
	 */
	@Override
	public void setNumberOfProductionLines(Date numberOfProductionLines) {
		model.setNumberOfProductionLines(numberOfProductionLines);
	}

	/**
	 * Sets the number of product types of this ncbj section one.
	 *
	 * @param numberOfProductTypes the number of product types of this ncbj section one
	 */
	@Override
	public void setNumberOfProductTypes(String numberOfProductTypes) {
		model.setNumberOfProductTypes(numberOfProductTypes);
	}

	/**
	 * Sets the please list product of this ncbj section one.
	 *
	 * @param pleaseListProduct the please list product of this ncbj section one
	 */
	@Override
	public void setPleaseListProduct(String pleaseListProduct) {
		model.setPleaseListProduct(pleaseListProduct);
	}

	/**
	 * Sets the primary key of this ncbj section one.
	 *
	 * @param primaryKey the primary key of this ncbj section one
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncbj section one.
	 *
	 * @param userId the user ID of this ncbj section one
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj section one.
	 *
	 * @param userName the user name of this ncbj section one
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj section one.
	 *
	 * @param userUuid the user uuid of this ncbj section one
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
	protected NcbjSectionOneWrapper wrap(NcbjSectionOne ncbjSectionOne) {
		return new NcbjSectionOneWrapper(ncbjSectionOne);
	}

}