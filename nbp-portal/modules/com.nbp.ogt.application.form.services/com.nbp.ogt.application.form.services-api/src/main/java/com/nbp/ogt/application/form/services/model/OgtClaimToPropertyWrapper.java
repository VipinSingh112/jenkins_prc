/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OgtClaimToProperty}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimToProperty
 * @generated
 */
public class OgtClaimToPropertyWrapper
	extends BaseModelWrapper<OgtClaimToProperty>
	implements ModelWrapper<OgtClaimToProperty>, OgtClaimToProperty {

	public OgtClaimToPropertyWrapper(OgtClaimToProperty ogtClaimToProperty) {
		super(ogtClaimToProperty);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ogtClaimToPropertyId", getOgtClaimToPropertyId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("propertyDate", getPropertyDate());
		attributes.put("propClaimDesc", getPropClaimDesc());
		attributes.put("affidavitDesc", getAffidavitDesc());
		attributes.put("ogtApplicationId", getOgtApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ogtClaimToPropertyId = (Long)attributes.get(
			"ogtClaimToPropertyId");

		if (ogtClaimToPropertyId != null) {
			setOgtClaimToPropertyId(ogtClaimToPropertyId);
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

		Date propertyDate = (Date)attributes.get("propertyDate");

		if (propertyDate != null) {
			setPropertyDate(propertyDate);
		}

		String propClaimDesc = (String)attributes.get("propClaimDesc");

		if (propClaimDesc != null) {
			setPropClaimDesc(propClaimDesc);
		}

		String affidavitDesc = (String)attributes.get("affidavitDesc");

		if (affidavitDesc != null) {
			setAffidavitDesc(affidavitDesc);
		}

		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
		}
	}

	@Override
	public OgtClaimToProperty cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the affidavit desc of this ogt claim to property.
	 *
	 * @return the affidavit desc of this ogt claim to property
	 */
	@Override
	public String getAffidavitDesc() {
		return model.getAffidavitDesc();
	}

	/**
	 * Returns the company ID of this ogt claim to property.
	 *
	 * @return the company ID of this ogt claim to property
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ogt claim to property.
	 *
	 * @return the create date of this ogt claim to property
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ogt claim to property.
	 *
	 * @return the group ID of this ogt claim to property
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ogt claim to property.
	 *
	 * @return the modified date of this ogt claim to property
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ogt application ID of this ogt claim to property.
	 *
	 * @return the ogt application ID of this ogt claim to property
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the ogt claim to property ID of this ogt claim to property.
	 *
	 * @return the ogt claim to property ID of this ogt claim to property
	 */
	@Override
	public long getOgtClaimToPropertyId() {
		return model.getOgtClaimToPropertyId();
	}

	/**
	 * Returns the primary key of this ogt claim to property.
	 *
	 * @return the primary key of this ogt claim to property
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prop claim desc of this ogt claim to property.
	 *
	 * @return the prop claim desc of this ogt claim to property
	 */
	@Override
	public String getPropClaimDesc() {
		return model.getPropClaimDesc();
	}

	/**
	 * Returns the property date of this ogt claim to property.
	 *
	 * @return the property date of this ogt claim to property
	 */
	@Override
	public Date getPropertyDate() {
		return model.getPropertyDate();
	}

	/**
	 * Returns the user ID of this ogt claim to property.
	 *
	 * @return the user ID of this ogt claim to property
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt claim to property.
	 *
	 * @return the user name of this ogt claim to property
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt claim to property.
	 *
	 * @return the user uuid of this ogt claim to property
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
	 * Sets the affidavit desc of this ogt claim to property.
	 *
	 * @param affidavitDesc the affidavit desc of this ogt claim to property
	 */
	@Override
	public void setAffidavitDesc(String affidavitDesc) {
		model.setAffidavitDesc(affidavitDesc);
	}

	/**
	 * Sets the company ID of this ogt claim to property.
	 *
	 * @param companyId the company ID of this ogt claim to property
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ogt claim to property.
	 *
	 * @param createDate the create date of this ogt claim to property
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ogt claim to property.
	 *
	 * @param groupId the group ID of this ogt claim to property
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ogt claim to property.
	 *
	 * @param modifiedDate the modified date of this ogt claim to property
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ogt application ID of this ogt claim to property.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt claim to property
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the ogt claim to property ID of this ogt claim to property.
	 *
	 * @param ogtClaimToPropertyId the ogt claim to property ID of this ogt claim to property
	 */
	@Override
	public void setOgtClaimToPropertyId(long ogtClaimToPropertyId) {
		model.setOgtClaimToPropertyId(ogtClaimToPropertyId);
	}

	/**
	 * Sets the primary key of this ogt claim to property.
	 *
	 * @param primaryKey the primary key of this ogt claim to property
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the prop claim desc of this ogt claim to property.
	 *
	 * @param propClaimDesc the prop claim desc of this ogt claim to property
	 */
	@Override
	public void setPropClaimDesc(String propClaimDesc) {
		model.setPropClaimDesc(propClaimDesc);
	}

	/**
	 * Sets the property date of this ogt claim to property.
	 *
	 * @param propertyDate the property date of this ogt claim to property
	 */
	@Override
	public void setPropertyDate(Date propertyDate) {
		model.setPropertyDate(propertyDate);
	}

	/**
	 * Sets the user ID of this ogt claim to property.
	 *
	 * @param userId the user ID of this ogt claim to property
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt claim to property.
	 *
	 * @param userName the user name of this ogt claim to property
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt claim to property.
	 *
	 * @param userUuid the user uuid of this ogt claim to property
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
	protected OgtClaimToPropertyWrapper wrap(
		OgtClaimToProperty ogtClaimToProperty) {

		return new OgtClaimToPropertyWrapper(ogtClaimToProperty);
	}

}