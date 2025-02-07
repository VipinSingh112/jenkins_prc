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
 * This class is a wrapper for {@link AddFdaPersonnelThird}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelThird
 * @generated
 */
public class AddFdaPersonnelThirdWrapper
	extends BaseModelWrapper<AddFdaPersonnelThird>
	implements AddFdaPersonnelThird, ModelWrapper<AddFdaPersonnelThird> {

	public AddFdaPersonnelThirdWrapper(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		super(addFdaPersonnelThird);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("addFdaPersonnelThirdId", getAddFdaPersonnelThirdId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("outsourcedActivity", getOutsourcedActivity());
		attributes.put("supplierServiceProvider", getSupplierServiceProvider());
		attributes.put("janaacApplicationId", getJanaacApplicationId());
		attributes.put("counter", getCounter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long addFdaPersonnelThirdId = (Long)attributes.get(
			"addFdaPersonnelThirdId");

		if (addFdaPersonnelThirdId != null) {
			setAddFdaPersonnelThirdId(addFdaPersonnelThirdId);
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

		String outsourcedActivity = (String)attributes.get(
			"outsourcedActivity");

		if (outsourcedActivity != null) {
			setOutsourcedActivity(outsourcedActivity);
		}

		String supplierServiceProvider = (String)attributes.get(
			"supplierServiceProvider");

		if (supplierServiceProvider != null) {
			setSupplierServiceProvider(supplierServiceProvider);
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
	public AddFdaPersonnelThird cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the add fda personnel third ID of this add fda personnel third.
	 *
	 * @return the add fda personnel third ID of this add fda personnel third
	 */
	@Override
	public long getAddFdaPersonnelThirdId() {
		return model.getAddFdaPersonnelThirdId();
	}

	/**
	 * Returns the company ID of this add fda personnel third.
	 *
	 * @return the company ID of this add fda personnel third
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this add fda personnel third.
	 *
	 * @return the counter of this add fda personnel third
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this add fda personnel third.
	 *
	 * @return the create date of this add fda personnel third
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this add fda personnel third.
	 *
	 * @return the group ID of this add fda personnel third
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the janaac application ID of this add fda personnel third.
	 *
	 * @return the janaac application ID of this add fda personnel third
	 */
	@Override
	public long getJanaacApplicationId() {
		return model.getJanaacApplicationId();
	}

	/**
	 * Returns the modified date of this add fda personnel third.
	 *
	 * @return the modified date of this add fda personnel third
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the outsourced activity of this add fda personnel third.
	 *
	 * @return the outsourced activity of this add fda personnel third
	 */
	@Override
	public String getOutsourcedActivity() {
		return model.getOutsourcedActivity();
	}

	/**
	 * Returns the primary key of this add fda personnel third.
	 *
	 * @return the primary key of this add fda personnel third
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the supplier service provider of this add fda personnel third.
	 *
	 * @return the supplier service provider of this add fda personnel third
	 */
	@Override
	public String getSupplierServiceProvider() {
		return model.getSupplierServiceProvider();
	}

	/**
	 * Returns the user ID of this add fda personnel third.
	 *
	 * @return the user ID of this add fda personnel third
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this add fda personnel third.
	 *
	 * @return the user name of this add fda personnel third
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this add fda personnel third.
	 *
	 * @return the user uuid of this add fda personnel third
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
	 * Sets the add fda personnel third ID of this add fda personnel third.
	 *
	 * @param addFdaPersonnelThirdId the add fda personnel third ID of this add fda personnel third
	 */
	@Override
	public void setAddFdaPersonnelThirdId(long addFdaPersonnelThirdId) {
		model.setAddFdaPersonnelThirdId(addFdaPersonnelThirdId);
	}

	/**
	 * Sets the company ID of this add fda personnel third.
	 *
	 * @param companyId the company ID of this add fda personnel third
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this add fda personnel third.
	 *
	 * @param counter the counter of this add fda personnel third
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this add fda personnel third.
	 *
	 * @param createDate the create date of this add fda personnel third
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this add fda personnel third.
	 *
	 * @param groupId the group ID of this add fda personnel third
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the janaac application ID of this add fda personnel third.
	 *
	 * @param janaacApplicationId the janaac application ID of this add fda personnel third
	 */
	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		model.setJanaacApplicationId(janaacApplicationId);
	}

	/**
	 * Sets the modified date of this add fda personnel third.
	 *
	 * @param modifiedDate the modified date of this add fda personnel third
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the outsourced activity of this add fda personnel third.
	 *
	 * @param outsourcedActivity the outsourced activity of this add fda personnel third
	 */
	@Override
	public void setOutsourcedActivity(String outsourcedActivity) {
		model.setOutsourcedActivity(outsourcedActivity);
	}

	/**
	 * Sets the primary key of this add fda personnel third.
	 *
	 * @param primaryKey the primary key of this add fda personnel third
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the supplier service provider of this add fda personnel third.
	 *
	 * @param supplierServiceProvider the supplier service provider of this add fda personnel third
	 */
	@Override
	public void setSupplierServiceProvider(String supplierServiceProvider) {
		model.setSupplierServiceProvider(supplierServiceProvider);
	}

	/**
	 * Sets the user ID of this add fda personnel third.
	 *
	 * @param userId the user ID of this add fda personnel third
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this add fda personnel third.
	 *
	 * @param userName the user name of this add fda personnel third
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this add fda personnel third.
	 *
	 * @param userUuid the user uuid of this add fda personnel third
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
	protected AddFdaPersonnelThirdWrapper wrap(
		AddFdaPersonnelThird addFdaPersonnelThird) {

		return new AddFdaPersonnelThirdWrapper(addFdaPersonnelThird);
	}

}