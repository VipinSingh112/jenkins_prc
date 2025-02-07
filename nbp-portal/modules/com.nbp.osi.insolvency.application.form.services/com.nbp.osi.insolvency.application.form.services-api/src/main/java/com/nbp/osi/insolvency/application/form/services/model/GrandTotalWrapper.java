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
 * This class is a wrapper for {@link GrandTotal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GrandTotal
 * @generated
 */
public class GrandTotalWrapper
	extends BaseModelWrapper<GrandTotal>
	implements GrandTotal, ModelWrapper<GrandTotal> {

	public GrandTotalWrapper(GrandTotal grandTotal) {
		super(grandTotal);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("grandTotalId", getGrandTotalId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("totalSecuredLiabilities", getTotalSecuredLiabilities());
		attributes.put(
			"securedTotalMonthlyPayments", getSecuredTotalMonthlyPayments());
		attributes.put(
			"totalPreferredLiabilities", getTotalPreferredLiabilities());
		attributes.put(
			"preferredTotalMonthlyPayments",
			getPreferredTotalMonthlyPayments());
		attributes.put(
			"totalUnsecuredLiabilities", getTotalUnsecuredLiabilities());
		attributes.put(
			"unsecuredTotalMonthlyPayments",
			getUnsecuredTotalMonthlyPayments());
		attributes.put("grandTotal", getGrandTotal());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long grandTotalId = (Long)attributes.get("grandTotalId");

		if (grandTotalId != null) {
			setGrandTotalId(grandTotalId);
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

		String totalSecuredLiabilities = (String)attributes.get(
			"totalSecuredLiabilities");

		if (totalSecuredLiabilities != null) {
			setTotalSecuredLiabilities(totalSecuredLiabilities);
		}

		String securedTotalMonthlyPayments = (String)attributes.get(
			"securedTotalMonthlyPayments");

		if (securedTotalMonthlyPayments != null) {
			setSecuredTotalMonthlyPayments(securedTotalMonthlyPayments);
		}

		String totalPreferredLiabilities = (String)attributes.get(
			"totalPreferredLiabilities");

		if (totalPreferredLiabilities != null) {
			setTotalPreferredLiabilities(totalPreferredLiabilities);
		}

		String preferredTotalMonthlyPayments = (String)attributes.get(
			"preferredTotalMonthlyPayments");

		if (preferredTotalMonthlyPayments != null) {
			setPreferredTotalMonthlyPayments(preferredTotalMonthlyPayments);
		}

		String totalUnsecuredLiabilities = (String)attributes.get(
			"totalUnsecuredLiabilities");

		if (totalUnsecuredLiabilities != null) {
			setTotalUnsecuredLiabilities(totalUnsecuredLiabilities);
		}

		String unsecuredTotalMonthlyPayments = (String)attributes.get(
			"unsecuredTotalMonthlyPayments");

		if (unsecuredTotalMonthlyPayments != null) {
			setUnsecuredTotalMonthlyPayments(unsecuredTotalMonthlyPayments);
		}

		String grandTotal = (String)attributes.get("grandTotal");

		if (grandTotal != null) {
			setGrandTotal(grandTotal);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public GrandTotal cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this grand total.
	 *
	 * @return the company ID of this grand total
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this grand total.
	 *
	 * @return the create date of this grand total
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the grand total of this grand total.
	 *
	 * @return the grand total of this grand total
	 */
	@Override
	public String getGrandTotal() {
		return model.getGrandTotal();
	}

	/**
	 * Returns the grand total ID of this grand total.
	 *
	 * @return the grand total ID of this grand total
	 */
	@Override
	public long getGrandTotalId() {
		return model.getGrandTotalId();
	}

	/**
	 * Returns the group ID of this grand total.
	 *
	 * @return the group ID of this grand total
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this grand total.
	 *
	 * @return the modified date of this grand total
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this grand total.
	 *
	 * @return the osi insolvency ID of this grand total
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the preferred total monthly payments of this grand total.
	 *
	 * @return the preferred total monthly payments of this grand total
	 */
	@Override
	public String getPreferredTotalMonthlyPayments() {
		return model.getPreferredTotalMonthlyPayments();
	}

	/**
	 * Returns the primary key of this grand total.
	 *
	 * @return the primary key of this grand total
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secured total monthly payments of this grand total.
	 *
	 * @return the secured total monthly payments of this grand total
	 */
	@Override
	public String getSecuredTotalMonthlyPayments() {
		return model.getSecuredTotalMonthlyPayments();
	}

	/**
	 * Returns the total preferred liabilities of this grand total.
	 *
	 * @return the total preferred liabilities of this grand total
	 */
	@Override
	public String getTotalPreferredLiabilities() {
		return model.getTotalPreferredLiabilities();
	}

	/**
	 * Returns the total secured liabilities of this grand total.
	 *
	 * @return the total secured liabilities of this grand total
	 */
	@Override
	public String getTotalSecuredLiabilities() {
		return model.getTotalSecuredLiabilities();
	}

	/**
	 * Returns the total unsecured liabilities of this grand total.
	 *
	 * @return the total unsecured liabilities of this grand total
	 */
	@Override
	public String getTotalUnsecuredLiabilities() {
		return model.getTotalUnsecuredLiabilities();
	}

	/**
	 * Returns the unsecured total monthly payments of this grand total.
	 *
	 * @return the unsecured total monthly payments of this grand total
	 */
	@Override
	public String getUnsecuredTotalMonthlyPayments() {
		return model.getUnsecuredTotalMonthlyPayments();
	}

	/**
	 * Returns the user ID of this grand total.
	 *
	 * @return the user ID of this grand total
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this grand total.
	 *
	 * @return the user name of this grand total
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this grand total.
	 *
	 * @return the user uuid of this grand total
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
	 * Sets the company ID of this grand total.
	 *
	 * @param companyId the company ID of this grand total
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this grand total.
	 *
	 * @param createDate the create date of this grand total
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the grand total of this grand total.
	 *
	 * @param grandTotal the grand total of this grand total
	 */
	@Override
	public void setGrandTotal(String grandTotal) {
		model.setGrandTotal(grandTotal);
	}

	/**
	 * Sets the grand total ID of this grand total.
	 *
	 * @param grandTotalId the grand total ID of this grand total
	 */
	@Override
	public void setGrandTotalId(long grandTotalId) {
		model.setGrandTotalId(grandTotalId);
	}

	/**
	 * Sets the group ID of this grand total.
	 *
	 * @param groupId the group ID of this grand total
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this grand total.
	 *
	 * @param modifiedDate the modified date of this grand total
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this grand total.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this grand total
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the preferred total monthly payments of this grand total.
	 *
	 * @param preferredTotalMonthlyPayments the preferred total monthly payments of this grand total
	 */
	@Override
	public void setPreferredTotalMonthlyPayments(
		String preferredTotalMonthlyPayments) {

		model.setPreferredTotalMonthlyPayments(preferredTotalMonthlyPayments);
	}

	/**
	 * Sets the primary key of this grand total.
	 *
	 * @param primaryKey the primary key of this grand total
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secured total monthly payments of this grand total.
	 *
	 * @param securedTotalMonthlyPayments the secured total monthly payments of this grand total
	 */
	@Override
	public void setSecuredTotalMonthlyPayments(
		String securedTotalMonthlyPayments) {

		model.setSecuredTotalMonthlyPayments(securedTotalMonthlyPayments);
	}

	/**
	 * Sets the total preferred liabilities of this grand total.
	 *
	 * @param totalPreferredLiabilities the total preferred liabilities of this grand total
	 */
	@Override
	public void setTotalPreferredLiabilities(String totalPreferredLiabilities) {
		model.setTotalPreferredLiabilities(totalPreferredLiabilities);
	}

	/**
	 * Sets the total secured liabilities of this grand total.
	 *
	 * @param totalSecuredLiabilities the total secured liabilities of this grand total
	 */
	@Override
	public void setTotalSecuredLiabilities(String totalSecuredLiabilities) {
		model.setTotalSecuredLiabilities(totalSecuredLiabilities);
	}

	/**
	 * Sets the total unsecured liabilities of this grand total.
	 *
	 * @param totalUnsecuredLiabilities the total unsecured liabilities of this grand total
	 */
	@Override
	public void setTotalUnsecuredLiabilities(String totalUnsecuredLiabilities) {
		model.setTotalUnsecuredLiabilities(totalUnsecuredLiabilities);
	}

	/**
	 * Sets the unsecured total monthly payments of this grand total.
	 *
	 * @param unsecuredTotalMonthlyPayments the unsecured total monthly payments of this grand total
	 */
	@Override
	public void setUnsecuredTotalMonthlyPayments(
		String unsecuredTotalMonthlyPayments) {

		model.setUnsecuredTotalMonthlyPayments(unsecuredTotalMonthlyPayments);
	}

	/**
	 * Sets the user ID of this grand total.
	 *
	 * @param userId the user ID of this grand total
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this grand total.
	 *
	 * @param userName the user name of this grand total
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this grand total.
	 *
	 * @param userUuid the user uuid of this grand total
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
	protected GrandTotalWrapper wrap(GrandTotal grandTotal) {
		return new GrandTotalWrapper(grandTotal);
	}

}