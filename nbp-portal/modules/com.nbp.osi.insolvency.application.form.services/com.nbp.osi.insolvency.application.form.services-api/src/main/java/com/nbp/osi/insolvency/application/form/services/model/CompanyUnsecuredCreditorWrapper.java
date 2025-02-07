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
 * This class is a wrapper for {@link CompanyUnsecuredCreditor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUnsecuredCreditor
 * @generated
 */
public class CompanyUnsecuredCreditorWrapper
	extends BaseModelWrapper<CompanyUnsecuredCreditor>
	implements CompanyUnsecuredCreditor,
			   ModelWrapper<CompanyUnsecuredCreditor> {

	public CompanyUnsecuredCreditorWrapper(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		super(companyUnsecuredCreditor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"companyUnsecuredCreditorId", getCompanyUnsecuredCreditorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("unsecuredCreditor", getUnsecuredCreditor());
		attributes.put("unsecuredDebtor", getUnsecuredDebtor());
		attributes.put("unsecuredPurpose", getUnsecuredPurpose());
		attributes.put("unsecuredLiabilty", getUnsecuredLiabilty());
		attributes.put("unsecuredCounter", getUnsecuredCounter());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long companyUnsecuredCreditorId = (Long)attributes.get(
			"companyUnsecuredCreditorId");

		if (companyUnsecuredCreditorId != null) {
			setCompanyUnsecuredCreditorId(companyUnsecuredCreditorId);
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

		String unsecuredCreditor = (String)attributes.get("unsecuredCreditor");

		if (unsecuredCreditor != null) {
			setUnsecuredCreditor(unsecuredCreditor);
		}

		String unsecuredDebtor = (String)attributes.get("unsecuredDebtor");

		if (unsecuredDebtor != null) {
			setUnsecuredDebtor(unsecuredDebtor);
		}

		String unsecuredPurpose = (String)attributes.get("unsecuredPurpose");

		if (unsecuredPurpose != null) {
			setUnsecuredPurpose(unsecuredPurpose);
		}

		String unsecuredLiabilty = (String)attributes.get("unsecuredLiabilty");

		if (unsecuredLiabilty != null) {
			setUnsecuredLiabilty(unsecuredLiabilty);
		}

		String unsecuredCounter = (String)attributes.get("unsecuredCounter");

		if (unsecuredCounter != null) {
			setUnsecuredCounter(unsecuredCounter);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public CompanyUnsecuredCreditor cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this company unsecured creditor.
	 *
	 * @return the company ID of this company unsecured creditor
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company unsecured creditor ID of this company unsecured creditor.
	 *
	 * @return the company unsecured creditor ID of this company unsecured creditor
	 */
	@Override
	public long getCompanyUnsecuredCreditorId() {
		return model.getCompanyUnsecuredCreditorId();
	}

	/**
	 * Returns the create date of this company unsecured creditor.
	 *
	 * @return the create date of this company unsecured creditor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this company unsecured creditor.
	 *
	 * @return the group ID of this company unsecured creditor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this company unsecured creditor.
	 *
	 * @return the modified date of this company unsecured creditor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this company unsecured creditor.
	 *
	 * @return the osi insolvency ID of this company unsecured creditor
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this company unsecured creditor.
	 *
	 * @return the primary key of this company unsecured creditor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the unsecured counter of this company unsecured creditor.
	 *
	 * @return the unsecured counter of this company unsecured creditor
	 */
	@Override
	public String getUnsecuredCounter() {
		return model.getUnsecuredCounter();
	}

	/**
	 * Returns the unsecured creditor of this company unsecured creditor.
	 *
	 * @return the unsecured creditor of this company unsecured creditor
	 */
	@Override
	public String getUnsecuredCreditor() {
		return model.getUnsecuredCreditor();
	}

	/**
	 * Returns the unsecured debtor of this company unsecured creditor.
	 *
	 * @return the unsecured debtor of this company unsecured creditor
	 */
	@Override
	public String getUnsecuredDebtor() {
		return model.getUnsecuredDebtor();
	}

	/**
	 * Returns the unsecured liabilty of this company unsecured creditor.
	 *
	 * @return the unsecured liabilty of this company unsecured creditor
	 */
	@Override
	public String getUnsecuredLiabilty() {
		return model.getUnsecuredLiabilty();
	}

	/**
	 * Returns the unsecured purpose of this company unsecured creditor.
	 *
	 * @return the unsecured purpose of this company unsecured creditor
	 */
	@Override
	public String getUnsecuredPurpose() {
		return model.getUnsecuredPurpose();
	}

	/**
	 * Returns the user ID of this company unsecured creditor.
	 *
	 * @return the user ID of this company unsecured creditor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this company unsecured creditor.
	 *
	 * @return the user name of this company unsecured creditor
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this company unsecured creditor.
	 *
	 * @return the user uuid of this company unsecured creditor
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
	 * Sets the company ID of this company unsecured creditor.
	 *
	 * @param companyId the company ID of this company unsecured creditor
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company unsecured creditor ID of this company unsecured creditor.
	 *
	 * @param companyUnsecuredCreditorId the company unsecured creditor ID of this company unsecured creditor
	 */
	@Override
	public void setCompanyUnsecuredCreditorId(long companyUnsecuredCreditorId) {
		model.setCompanyUnsecuredCreditorId(companyUnsecuredCreditorId);
	}

	/**
	 * Sets the create date of this company unsecured creditor.
	 *
	 * @param createDate the create date of this company unsecured creditor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this company unsecured creditor.
	 *
	 * @param groupId the group ID of this company unsecured creditor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this company unsecured creditor.
	 *
	 * @param modifiedDate the modified date of this company unsecured creditor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this company unsecured creditor.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this company unsecured creditor
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this company unsecured creditor.
	 *
	 * @param primaryKey the primary key of this company unsecured creditor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the unsecured counter of this company unsecured creditor.
	 *
	 * @param unsecuredCounter the unsecured counter of this company unsecured creditor
	 */
	@Override
	public void setUnsecuredCounter(String unsecuredCounter) {
		model.setUnsecuredCounter(unsecuredCounter);
	}

	/**
	 * Sets the unsecured creditor of this company unsecured creditor.
	 *
	 * @param unsecuredCreditor the unsecured creditor of this company unsecured creditor
	 */
	@Override
	public void setUnsecuredCreditor(String unsecuredCreditor) {
		model.setUnsecuredCreditor(unsecuredCreditor);
	}

	/**
	 * Sets the unsecured debtor of this company unsecured creditor.
	 *
	 * @param unsecuredDebtor the unsecured debtor of this company unsecured creditor
	 */
	@Override
	public void setUnsecuredDebtor(String unsecuredDebtor) {
		model.setUnsecuredDebtor(unsecuredDebtor);
	}

	/**
	 * Sets the unsecured liabilty of this company unsecured creditor.
	 *
	 * @param unsecuredLiabilty the unsecured liabilty of this company unsecured creditor
	 */
	@Override
	public void setUnsecuredLiabilty(String unsecuredLiabilty) {
		model.setUnsecuredLiabilty(unsecuredLiabilty);
	}

	/**
	 * Sets the unsecured purpose of this company unsecured creditor.
	 *
	 * @param unsecuredPurpose the unsecured purpose of this company unsecured creditor
	 */
	@Override
	public void setUnsecuredPurpose(String unsecuredPurpose) {
		model.setUnsecuredPurpose(unsecuredPurpose);
	}

	/**
	 * Sets the user ID of this company unsecured creditor.
	 *
	 * @param userId the user ID of this company unsecured creditor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this company unsecured creditor.
	 *
	 * @param userName the user name of this company unsecured creditor
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this company unsecured creditor.
	 *
	 * @param userUuid the user uuid of this company unsecured creditor
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
	protected CompanyUnsecuredCreditorWrapper wrap(
		CompanyUnsecuredCreditor companyUnsecuredCreditor) {

		return new CompanyUnsecuredCreditorWrapper(companyUnsecuredCreditor);
	}

}