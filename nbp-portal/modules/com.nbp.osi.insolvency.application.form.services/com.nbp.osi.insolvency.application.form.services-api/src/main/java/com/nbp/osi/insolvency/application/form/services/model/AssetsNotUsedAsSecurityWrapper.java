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
 * This class is a wrapper for {@link AssetsNotUsedAsSecurity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurity
 * @generated
 */
public class AssetsNotUsedAsSecurityWrapper
	extends BaseModelWrapper<AssetsNotUsedAsSecurity>
	implements AssetsNotUsedAsSecurity, ModelWrapper<AssetsNotUsedAsSecurity> {

	public AssetsNotUsedAsSecurityWrapper(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		super(assetsNotUsedAsSecurity);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"assetsNotUsedAsSecurityId", getAssetsNotUsedAsSecurityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assetRealProp", getAssetRealProp());
		attributes.put("assetNoValue", getAssetNoValue());
		attributes.put("assetDescription", getAssetDescription());
		attributes.put("assetNoCounter", getAssetNoCounter());
		attributes.put(
			"comTotalAssetNotUsedSecurity", getComTotalAssetNotUsedSecurity());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetsNotUsedAsSecurityId = (Long)attributes.get(
			"assetsNotUsedAsSecurityId");

		if (assetsNotUsedAsSecurityId != null) {
			setAssetsNotUsedAsSecurityId(assetsNotUsedAsSecurityId);
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

		String assetRealProp = (String)attributes.get("assetRealProp");

		if (assetRealProp != null) {
			setAssetRealProp(assetRealProp);
		}

		String assetNoValue = (String)attributes.get("assetNoValue");

		if (assetNoValue != null) {
			setAssetNoValue(assetNoValue);
		}

		String assetDescription = (String)attributes.get("assetDescription");

		if (assetDescription != null) {
			setAssetDescription(assetDescription);
		}

		String assetNoCounter = (String)attributes.get("assetNoCounter");

		if (assetNoCounter != null) {
			setAssetNoCounter(assetNoCounter);
		}

		String comTotalAssetNotUsedSecurity = (String)attributes.get(
			"comTotalAssetNotUsedSecurity");

		if (comTotalAssetNotUsedSecurity != null) {
			setComTotalAssetNotUsedSecurity(comTotalAssetNotUsedSecurity);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public AssetsNotUsedAsSecurity cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the asset description of this assets not used as security.
	 *
	 * @return the asset description of this assets not used as security
	 */
	@Override
	public String getAssetDescription() {
		return model.getAssetDescription();
	}

	/**
	 * Returns the asset no counter of this assets not used as security.
	 *
	 * @return the asset no counter of this assets not used as security
	 */
	@Override
	public String getAssetNoCounter() {
		return model.getAssetNoCounter();
	}

	/**
	 * Returns the asset no value of this assets not used as security.
	 *
	 * @return the asset no value of this assets not used as security
	 */
	@Override
	public String getAssetNoValue() {
		return model.getAssetNoValue();
	}

	/**
	 * Returns the asset real prop of this assets not used as security.
	 *
	 * @return the asset real prop of this assets not used as security
	 */
	@Override
	public String getAssetRealProp() {
		return model.getAssetRealProp();
	}

	/**
	 * Returns the assets not used as security ID of this assets not used as security.
	 *
	 * @return the assets not used as security ID of this assets not used as security
	 */
	@Override
	public long getAssetsNotUsedAsSecurityId() {
		return model.getAssetsNotUsedAsSecurityId();
	}

	/**
	 * Returns the company ID of this assets not used as security.
	 *
	 * @return the company ID of this assets not used as security
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the com total asset not used security of this assets not used as security.
	 *
	 * @return the com total asset not used security of this assets not used as security
	 */
	@Override
	public String getComTotalAssetNotUsedSecurity() {
		return model.getComTotalAssetNotUsedSecurity();
	}

	/**
	 * Returns the create date of this assets not used as security.
	 *
	 * @return the create date of this assets not used as security
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this assets not used as security.
	 *
	 * @return the group ID of this assets not used as security
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this assets not used as security.
	 *
	 * @return the modified date of this assets not used as security
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this assets not used as security.
	 *
	 * @return the osi insolvency ID of this assets not used as security
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this assets not used as security.
	 *
	 * @return the primary key of this assets not used as security
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this assets not used as security.
	 *
	 * @return the user ID of this assets not used as security
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this assets not used as security.
	 *
	 * @return the user name of this assets not used as security
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this assets not used as security.
	 *
	 * @return the user uuid of this assets not used as security
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
	 * Sets the asset description of this assets not used as security.
	 *
	 * @param assetDescription the asset description of this assets not used as security
	 */
	@Override
	public void setAssetDescription(String assetDescription) {
		model.setAssetDescription(assetDescription);
	}

	/**
	 * Sets the asset no counter of this assets not used as security.
	 *
	 * @param assetNoCounter the asset no counter of this assets not used as security
	 */
	@Override
	public void setAssetNoCounter(String assetNoCounter) {
		model.setAssetNoCounter(assetNoCounter);
	}

	/**
	 * Sets the asset no value of this assets not used as security.
	 *
	 * @param assetNoValue the asset no value of this assets not used as security
	 */
	@Override
	public void setAssetNoValue(String assetNoValue) {
		model.setAssetNoValue(assetNoValue);
	}

	/**
	 * Sets the asset real prop of this assets not used as security.
	 *
	 * @param assetRealProp the asset real prop of this assets not used as security
	 */
	@Override
	public void setAssetRealProp(String assetRealProp) {
		model.setAssetRealProp(assetRealProp);
	}

	/**
	 * Sets the assets not used as security ID of this assets not used as security.
	 *
	 * @param assetsNotUsedAsSecurityId the assets not used as security ID of this assets not used as security
	 */
	@Override
	public void setAssetsNotUsedAsSecurityId(long assetsNotUsedAsSecurityId) {
		model.setAssetsNotUsedAsSecurityId(assetsNotUsedAsSecurityId);
	}

	/**
	 * Sets the company ID of this assets not used as security.
	 *
	 * @param companyId the company ID of this assets not used as security
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the com total asset not used security of this assets not used as security.
	 *
	 * @param comTotalAssetNotUsedSecurity the com total asset not used security of this assets not used as security
	 */
	@Override
	public void setComTotalAssetNotUsedSecurity(
		String comTotalAssetNotUsedSecurity) {

		model.setComTotalAssetNotUsedSecurity(comTotalAssetNotUsedSecurity);
	}

	/**
	 * Sets the create date of this assets not used as security.
	 *
	 * @param createDate the create date of this assets not used as security
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this assets not used as security.
	 *
	 * @param groupId the group ID of this assets not used as security
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this assets not used as security.
	 *
	 * @param modifiedDate the modified date of this assets not used as security
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this assets not used as security.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this assets not used as security
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this assets not used as security.
	 *
	 * @param primaryKey the primary key of this assets not used as security
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this assets not used as security.
	 *
	 * @param userId the user ID of this assets not used as security
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this assets not used as security.
	 *
	 * @param userName the user name of this assets not used as security
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this assets not used as security.
	 *
	 * @param userUuid the user uuid of this assets not used as security
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
	protected AssetsNotUsedAsSecurityWrapper wrap(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return new AssetsNotUsedAsSecurityWrapper(assetsNotUsedAsSecurity);
	}

}