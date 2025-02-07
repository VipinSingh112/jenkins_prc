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
 * This class is a wrapper for {@link CompanySecuredCreditor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecuredCreditor
 * @generated
 */
public class CompanySecuredCreditorWrapper
	extends BaseModelWrapper<CompanySecuredCreditor>
	implements CompanySecuredCreditor, ModelWrapper<CompanySecuredCreditor> {

	public CompanySecuredCreditorWrapper(
		CompanySecuredCreditor companySecuredCreditor) {

		super(companySecuredCreditor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"companySecuredCreditorId", getCompanySecuredCreditorId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("securedCreditor", getSecuredCreditor());
		attributes.put("securedSecurity", getSecuredSecurity());
		attributes.put("securedPurpose", getSecuredPurpose());
		attributes.put("securedLiabilty", getSecuredLiabilty());
		attributes.put("comSecurityValue", getComSecurityValue());
		attributes.put("comSecurityCounter", getComSecurityCounter());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long companySecuredCreditorId = (Long)attributes.get(
			"companySecuredCreditorId");

		if (companySecuredCreditorId != null) {
			setCompanySecuredCreditorId(companySecuredCreditorId);
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

		String securedCreditor = (String)attributes.get("securedCreditor");

		if (securedCreditor != null) {
			setSecuredCreditor(securedCreditor);
		}

		String securedSecurity = (String)attributes.get("securedSecurity");

		if (securedSecurity != null) {
			setSecuredSecurity(securedSecurity);
		}

		String securedPurpose = (String)attributes.get("securedPurpose");

		if (securedPurpose != null) {
			setSecuredPurpose(securedPurpose);
		}

		String securedLiabilty = (String)attributes.get("securedLiabilty");

		if (securedLiabilty != null) {
			setSecuredLiabilty(securedLiabilty);
		}

		String comSecurityValue = (String)attributes.get("comSecurityValue");

		if (comSecurityValue != null) {
			setComSecurityValue(comSecurityValue);
		}

		String comSecurityCounter = (String)attributes.get(
			"comSecurityCounter");

		if (comSecurityCounter != null) {
			setComSecurityCounter(comSecurityCounter);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public CompanySecuredCreditor cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this company secured creditor.
	 *
	 * @return the company ID of this company secured creditor
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company secured creditor ID of this company secured creditor.
	 *
	 * @return the company secured creditor ID of this company secured creditor
	 */
	@Override
	public long getCompanySecuredCreditorId() {
		return model.getCompanySecuredCreditorId();
	}

	/**
	 * Returns the com security counter of this company secured creditor.
	 *
	 * @return the com security counter of this company secured creditor
	 */
	@Override
	public String getComSecurityCounter() {
		return model.getComSecurityCounter();
	}

	/**
	 * Returns the com security value of this company secured creditor.
	 *
	 * @return the com security value of this company secured creditor
	 */
	@Override
	public String getComSecurityValue() {
		return model.getComSecurityValue();
	}

	/**
	 * Returns the create date of this company secured creditor.
	 *
	 * @return the create date of this company secured creditor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this company secured creditor.
	 *
	 * @return the group ID of this company secured creditor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this company secured creditor.
	 *
	 * @return the modified date of this company secured creditor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this company secured creditor.
	 *
	 * @return the osi insolvency ID of this company secured creditor
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this company secured creditor.
	 *
	 * @return the primary key of this company secured creditor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secured creditor of this company secured creditor.
	 *
	 * @return the secured creditor of this company secured creditor
	 */
	@Override
	public String getSecuredCreditor() {
		return model.getSecuredCreditor();
	}

	/**
	 * Returns the secured liabilty of this company secured creditor.
	 *
	 * @return the secured liabilty of this company secured creditor
	 */
	@Override
	public String getSecuredLiabilty() {
		return model.getSecuredLiabilty();
	}

	/**
	 * Returns the secured purpose of this company secured creditor.
	 *
	 * @return the secured purpose of this company secured creditor
	 */
	@Override
	public String getSecuredPurpose() {
		return model.getSecuredPurpose();
	}

	/**
	 * Returns the secured security of this company secured creditor.
	 *
	 * @return the secured security of this company secured creditor
	 */
	@Override
	public String getSecuredSecurity() {
		return model.getSecuredSecurity();
	}

	/**
	 * Returns the user ID of this company secured creditor.
	 *
	 * @return the user ID of this company secured creditor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this company secured creditor.
	 *
	 * @return the user name of this company secured creditor
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this company secured creditor.
	 *
	 * @return the user uuid of this company secured creditor
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
	 * Sets the company ID of this company secured creditor.
	 *
	 * @param companyId the company ID of this company secured creditor
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company secured creditor ID of this company secured creditor.
	 *
	 * @param companySecuredCreditorId the company secured creditor ID of this company secured creditor
	 */
	@Override
	public void setCompanySecuredCreditorId(long companySecuredCreditorId) {
		model.setCompanySecuredCreditorId(companySecuredCreditorId);
	}

	/**
	 * Sets the com security counter of this company secured creditor.
	 *
	 * @param comSecurityCounter the com security counter of this company secured creditor
	 */
	@Override
	public void setComSecurityCounter(String comSecurityCounter) {
		model.setComSecurityCounter(comSecurityCounter);
	}

	/**
	 * Sets the com security value of this company secured creditor.
	 *
	 * @param comSecurityValue the com security value of this company secured creditor
	 */
	@Override
	public void setComSecurityValue(String comSecurityValue) {
		model.setComSecurityValue(comSecurityValue);
	}

	/**
	 * Sets the create date of this company secured creditor.
	 *
	 * @param createDate the create date of this company secured creditor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this company secured creditor.
	 *
	 * @param groupId the group ID of this company secured creditor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this company secured creditor.
	 *
	 * @param modifiedDate the modified date of this company secured creditor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this company secured creditor.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this company secured creditor
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this company secured creditor.
	 *
	 * @param primaryKey the primary key of this company secured creditor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secured creditor of this company secured creditor.
	 *
	 * @param securedCreditor the secured creditor of this company secured creditor
	 */
	@Override
	public void setSecuredCreditor(String securedCreditor) {
		model.setSecuredCreditor(securedCreditor);
	}

	/**
	 * Sets the secured liabilty of this company secured creditor.
	 *
	 * @param securedLiabilty the secured liabilty of this company secured creditor
	 */
	@Override
	public void setSecuredLiabilty(String securedLiabilty) {
		model.setSecuredLiabilty(securedLiabilty);
	}

	/**
	 * Sets the secured purpose of this company secured creditor.
	 *
	 * @param securedPurpose the secured purpose of this company secured creditor
	 */
	@Override
	public void setSecuredPurpose(String securedPurpose) {
		model.setSecuredPurpose(securedPurpose);
	}

	/**
	 * Sets the secured security of this company secured creditor.
	 *
	 * @param securedSecurity the secured security of this company secured creditor
	 */
	@Override
	public void setSecuredSecurity(String securedSecurity) {
		model.setSecuredSecurity(securedSecurity);
	}

	/**
	 * Sets the user ID of this company secured creditor.
	 *
	 * @param userId the user ID of this company secured creditor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this company secured creditor.
	 *
	 * @param userName the user name of this company secured creditor
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this company secured creditor.
	 *
	 * @param userUuid the user uuid of this company secured creditor
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
	protected CompanySecuredCreditorWrapper wrap(
		CompanySecuredCreditor companySecuredCreditor) {

		return new CompanySecuredCreditorWrapper(companySecuredCreditor);
	}

}