/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OsiTotalMonthlyExpense}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiTotalMonthlyExpense
 * @generated
 */
public class OsiTotalMonthlyExpenseWrapper
	extends BaseModelWrapper<OsiTotalMonthlyExpense>
	implements ModelWrapper<OsiTotalMonthlyExpense>, OsiTotalMonthlyExpense {

	public OsiTotalMonthlyExpenseWrapper(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		super(osiTotalMonthlyExpense);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"osiTotalMonthlyExpenseId", getOsiTotalMonthlyExpenseId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("totalExpense", getTotalExpense());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiTotalMonthlyExpenseId = (Long)attributes.get(
			"osiTotalMonthlyExpenseId");

		if (osiTotalMonthlyExpenseId != null) {
			setOsiTotalMonthlyExpenseId(osiTotalMonthlyExpenseId);
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

		String totalExpense = (String)attributes.get("totalExpense");

		if (totalExpense != null) {
			setTotalExpense(totalExpense);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiTotalMonthlyExpense cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi total monthly expense.
	 *
	 * @return the company ID of this osi total monthly expense
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi total monthly expense.
	 *
	 * @return the create date of this osi total monthly expense
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi total monthly expense.
	 *
	 * @return the group ID of this osi total monthly expense
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi total monthly expense.
	 *
	 * @return the modified date of this osi total monthly expense
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this osi total monthly expense.
	 *
	 * @return the osi insolvency ID of this osi total monthly expense
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the osi total monthly expense ID of this osi total monthly expense.
	 *
	 * @return the osi total monthly expense ID of this osi total monthly expense
	 */
	@Override
	public long getOsiTotalMonthlyExpenseId() {
		return model.getOsiTotalMonthlyExpenseId();
	}

	/**
	 * Returns the primary key of this osi total monthly expense.
	 *
	 * @return the primary key of this osi total monthly expense
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the total expense of this osi total monthly expense.
	 *
	 * @return the total expense of this osi total monthly expense
	 */
	@Override
	public String getTotalExpense() {
		return model.getTotalExpense();
	}

	/**
	 * Returns the user ID of this osi total monthly expense.
	 *
	 * @return the user ID of this osi total monthly expense
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi total monthly expense.
	 *
	 * @return the user name of this osi total monthly expense
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi total monthly expense.
	 *
	 * @return the user uuid of this osi total monthly expense
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
	 * Sets the company ID of this osi total monthly expense.
	 *
	 * @param companyId the company ID of this osi total monthly expense
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi total monthly expense.
	 *
	 * @param createDate the create date of this osi total monthly expense
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi total monthly expense.
	 *
	 * @param groupId the group ID of this osi total monthly expense
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi total monthly expense.
	 *
	 * @param modifiedDate the modified date of this osi total monthly expense
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this osi total monthly expense.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi total monthly expense
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the osi total monthly expense ID of this osi total monthly expense.
	 *
	 * @param osiTotalMonthlyExpenseId the osi total monthly expense ID of this osi total monthly expense
	 */
	@Override
	public void setOsiTotalMonthlyExpenseId(long osiTotalMonthlyExpenseId) {
		model.setOsiTotalMonthlyExpenseId(osiTotalMonthlyExpenseId);
	}

	/**
	 * Sets the primary key of this osi total monthly expense.
	 *
	 * @param primaryKey the primary key of this osi total monthly expense
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the total expense of this osi total monthly expense.
	 *
	 * @param totalExpense the total expense of this osi total monthly expense
	 */
	@Override
	public void setTotalExpense(String totalExpense) {
		model.setTotalExpense(totalExpense);
	}

	/**
	 * Sets the user ID of this osi total monthly expense.
	 *
	 * @param userId the user ID of this osi total monthly expense
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi total monthly expense.
	 *
	 * @param userName the user name of this osi total monthly expense
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi total monthly expense.
	 *
	 * @param userUuid the user uuid of this osi total monthly expense
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
	protected OsiTotalMonthlyExpenseWrapper wrap(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		return new OsiTotalMonthlyExpenseWrapper(osiTotalMonthlyExpense);
	}

}