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
 * This class is a wrapper for {@link NotUsedSecurity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotUsedSecurity
 * @generated
 */
public class NotUsedSecurityWrapper
	extends BaseModelWrapper<NotUsedSecurity>
	implements ModelWrapper<NotUsedSecurity>, NotUsedSecurity {

	public NotUsedSecurityWrapper(NotUsedSecurity notUsedSecurity) {
		super(notUsedSecurity);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("notUsedSecurityId", getNotUsedSecurityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("realProperty", getRealProperty());
		attributes.put("notUsedLocation", getNotUsedLocation());
		attributes.put("notUsedDescription", getNotUsedDescription());
		attributes.put("notUsedCounter", getNotUsedCounter());
		attributes.put("notUsedValue", getNotUsedValue());
		attributes.put("notNetValue", getNotNetValue());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long notUsedSecurityId = (Long)attributes.get("notUsedSecurityId");

		if (notUsedSecurityId != null) {
			setNotUsedSecurityId(notUsedSecurityId);
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

		String realProperty = (String)attributes.get("realProperty");

		if (realProperty != null) {
			setRealProperty(realProperty);
		}

		String notUsedLocation = (String)attributes.get("notUsedLocation");

		if (notUsedLocation != null) {
			setNotUsedLocation(notUsedLocation);
		}

		String notUsedDescription = (String)attributes.get(
			"notUsedDescription");

		if (notUsedDescription != null) {
			setNotUsedDescription(notUsedDescription);
		}

		String notUsedCounter = (String)attributes.get("notUsedCounter");

		if (notUsedCounter != null) {
			setNotUsedCounter(notUsedCounter);
		}

		String notUsedValue = (String)attributes.get("notUsedValue");

		if (notUsedValue != null) {
			setNotUsedValue(notUsedValue);
		}

		String notNetValue = (String)attributes.get("notNetValue");

		if (notNetValue != null) {
			setNotNetValue(notNetValue);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public NotUsedSecurity cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this not used security.
	 *
	 * @return the company ID of this not used security
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this not used security.
	 *
	 * @return the create date of this not used security
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this not used security.
	 *
	 * @return the group ID of this not used security
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this not used security.
	 *
	 * @return the modified date of this not used security
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the not net value of this not used security.
	 *
	 * @return the not net value of this not used security
	 */
	@Override
	public String getNotNetValue() {
		return model.getNotNetValue();
	}

	/**
	 * Returns the not used counter of this not used security.
	 *
	 * @return the not used counter of this not used security
	 */
	@Override
	public String getNotUsedCounter() {
		return model.getNotUsedCounter();
	}

	/**
	 * Returns the not used description of this not used security.
	 *
	 * @return the not used description of this not used security
	 */
	@Override
	public String getNotUsedDescription() {
		return model.getNotUsedDescription();
	}

	/**
	 * Returns the not used location of this not used security.
	 *
	 * @return the not used location of this not used security
	 */
	@Override
	public String getNotUsedLocation() {
		return model.getNotUsedLocation();
	}

	/**
	 * Returns the not used security ID of this not used security.
	 *
	 * @return the not used security ID of this not used security
	 */
	@Override
	public long getNotUsedSecurityId() {
		return model.getNotUsedSecurityId();
	}

	/**
	 * Returns the not used value of this not used security.
	 *
	 * @return the not used value of this not used security
	 */
	@Override
	public String getNotUsedValue() {
		return model.getNotUsedValue();
	}

	/**
	 * Returns the osi insolvency ID of this not used security.
	 *
	 * @return the osi insolvency ID of this not used security
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this not used security.
	 *
	 * @return the primary key of this not used security
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the real property of this not used security.
	 *
	 * @return the real property of this not used security
	 */
	@Override
	public String getRealProperty() {
		return model.getRealProperty();
	}

	/**
	 * Returns the user ID of this not used security.
	 *
	 * @return the user ID of this not used security
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this not used security.
	 *
	 * @return the user name of this not used security
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this not used security.
	 *
	 * @return the user uuid of this not used security
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
	 * Sets the company ID of this not used security.
	 *
	 * @param companyId the company ID of this not used security
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this not used security.
	 *
	 * @param createDate the create date of this not used security
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this not used security.
	 *
	 * @param groupId the group ID of this not used security
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this not used security.
	 *
	 * @param modifiedDate the modified date of this not used security
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the not net value of this not used security.
	 *
	 * @param notNetValue the not net value of this not used security
	 */
	@Override
	public void setNotNetValue(String notNetValue) {
		model.setNotNetValue(notNetValue);
	}

	/**
	 * Sets the not used counter of this not used security.
	 *
	 * @param notUsedCounter the not used counter of this not used security
	 */
	@Override
	public void setNotUsedCounter(String notUsedCounter) {
		model.setNotUsedCounter(notUsedCounter);
	}

	/**
	 * Sets the not used description of this not used security.
	 *
	 * @param notUsedDescription the not used description of this not used security
	 */
	@Override
	public void setNotUsedDescription(String notUsedDescription) {
		model.setNotUsedDescription(notUsedDescription);
	}

	/**
	 * Sets the not used location of this not used security.
	 *
	 * @param notUsedLocation the not used location of this not used security
	 */
	@Override
	public void setNotUsedLocation(String notUsedLocation) {
		model.setNotUsedLocation(notUsedLocation);
	}

	/**
	 * Sets the not used security ID of this not used security.
	 *
	 * @param notUsedSecurityId the not used security ID of this not used security
	 */
	@Override
	public void setNotUsedSecurityId(long notUsedSecurityId) {
		model.setNotUsedSecurityId(notUsedSecurityId);
	}

	/**
	 * Sets the not used value of this not used security.
	 *
	 * @param notUsedValue the not used value of this not used security
	 */
	@Override
	public void setNotUsedValue(String notUsedValue) {
		model.setNotUsedValue(notUsedValue);
	}

	/**
	 * Sets the osi insolvency ID of this not used security.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this not used security
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this not used security.
	 *
	 * @param primaryKey the primary key of this not used security
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the real property of this not used security.
	 *
	 * @param realProperty the real property of this not used security
	 */
	@Override
	public void setRealProperty(String realProperty) {
		model.setRealProperty(realProperty);
	}

	/**
	 * Sets the user ID of this not used security.
	 *
	 * @param userId the user ID of this not used security
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this not used security.
	 *
	 * @param userName the user name of this not used security
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this not used security.
	 *
	 * @param userUuid the user uuid of this not used security
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
	protected NotUsedSecurityWrapper wrap(NotUsedSecurity notUsedSecurity) {
		return new NotUsedSecurityWrapper(notUsedSecurity);
	}

}