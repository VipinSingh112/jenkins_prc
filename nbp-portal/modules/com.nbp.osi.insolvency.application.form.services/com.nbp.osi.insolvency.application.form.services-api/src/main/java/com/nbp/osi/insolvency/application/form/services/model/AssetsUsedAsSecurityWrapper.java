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
 * This class is a wrapper for {@link AssetsUsedAsSecurity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurity
 * @generated
 */
public class AssetsUsedAsSecurityWrapper
	extends BaseModelWrapper<AssetsUsedAsSecurity>
	implements AssetsUsedAsSecurity, ModelWrapper<AssetsUsedAsSecurity> {

	public AssetsUsedAsSecurityWrapper(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		super(assetsUsedAsSecurity);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetsUsedAsSecurityId", getAssetsUsedAsSecurityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assetSecurity", getAssetSecurity());
		attributes.put("assetSecurityHolder", getAssetSecurityHolder());
		attributes.put("assetDetails", getAssetDetails());
		attributes.put("assetValue", getAssetValue());
		attributes.put("assetLiability", getAssetLiability());
		attributes.put("assetNetValue", getAssetNetValue());
		attributes.put("assetCounter", getAssetCounter());
		attributes.put(
			"comTotalAssetUsedSecurity", getComTotalAssetUsedSecurity());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetsUsedAsSecurityId = (Long)attributes.get(
			"assetsUsedAsSecurityId");

		if (assetsUsedAsSecurityId != null) {
			setAssetsUsedAsSecurityId(assetsUsedAsSecurityId);
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

		String assetSecurity = (String)attributes.get("assetSecurity");

		if (assetSecurity != null) {
			setAssetSecurity(assetSecurity);
		}

		String assetSecurityHolder = (String)attributes.get(
			"assetSecurityHolder");

		if (assetSecurityHolder != null) {
			setAssetSecurityHolder(assetSecurityHolder);
		}

		String assetDetails = (String)attributes.get("assetDetails");

		if (assetDetails != null) {
			setAssetDetails(assetDetails);
		}

		String assetValue = (String)attributes.get("assetValue");

		if (assetValue != null) {
			setAssetValue(assetValue);
		}

		String assetLiability = (String)attributes.get("assetLiability");

		if (assetLiability != null) {
			setAssetLiability(assetLiability);
		}

		String assetNetValue = (String)attributes.get("assetNetValue");

		if (assetNetValue != null) {
			setAssetNetValue(assetNetValue);
		}

		String assetCounter = (String)attributes.get("assetCounter");

		if (assetCounter != null) {
			setAssetCounter(assetCounter);
		}

		String comTotalAssetUsedSecurity = (String)attributes.get(
			"comTotalAssetUsedSecurity");

		if (comTotalAssetUsedSecurity != null) {
			setComTotalAssetUsedSecurity(comTotalAssetUsedSecurity);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public AssetsUsedAsSecurity cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the asset counter of this assets used as security.
	 *
	 * @return the asset counter of this assets used as security
	 */
	@Override
	public String getAssetCounter() {
		return model.getAssetCounter();
	}

	/**
	 * Returns the asset details of this assets used as security.
	 *
	 * @return the asset details of this assets used as security
	 */
	@Override
	public String getAssetDetails() {
		return model.getAssetDetails();
	}

	/**
	 * Returns the asset liability of this assets used as security.
	 *
	 * @return the asset liability of this assets used as security
	 */
	@Override
	public String getAssetLiability() {
		return model.getAssetLiability();
	}

	/**
	 * Returns the asset net value of this assets used as security.
	 *
	 * @return the asset net value of this assets used as security
	 */
	@Override
	public String getAssetNetValue() {
		return model.getAssetNetValue();
	}

	/**
	 * Returns the asset security of this assets used as security.
	 *
	 * @return the asset security of this assets used as security
	 */
	@Override
	public String getAssetSecurity() {
		return model.getAssetSecurity();
	}

	/**
	 * Returns the asset security holder of this assets used as security.
	 *
	 * @return the asset security holder of this assets used as security
	 */
	@Override
	public String getAssetSecurityHolder() {
		return model.getAssetSecurityHolder();
	}

	/**
	 * Returns the assets used as security ID of this assets used as security.
	 *
	 * @return the assets used as security ID of this assets used as security
	 */
	@Override
	public long getAssetsUsedAsSecurityId() {
		return model.getAssetsUsedAsSecurityId();
	}

	/**
	 * Returns the asset value of this assets used as security.
	 *
	 * @return the asset value of this assets used as security
	 */
	@Override
	public String getAssetValue() {
		return model.getAssetValue();
	}

	/**
	 * Returns the company ID of this assets used as security.
	 *
	 * @return the company ID of this assets used as security
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the com total asset used security of this assets used as security.
	 *
	 * @return the com total asset used security of this assets used as security
	 */
	@Override
	public String getComTotalAssetUsedSecurity() {
		return model.getComTotalAssetUsedSecurity();
	}

	/**
	 * Returns the create date of this assets used as security.
	 *
	 * @return the create date of this assets used as security
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this assets used as security.
	 *
	 * @return the group ID of this assets used as security
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this assets used as security.
	 *
	 * @return the modified date of this assets used as security
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this assets used as security.
	 *
	 * @return the osi insolvency ID of this assets used as security
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this assets used as security.
	 *
	 * @return the primary key of this assets used as security
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this assets used as security.
	 *
	 * @return the user ID of this assets used as security
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this assets used as security.
	 *
	 * @return the user name of this assets used as security
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this assets used as security.
	 *
	 * @return the user uuid of this assets used as security
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
	 * Sets the asset counter of this assets used as security.
	 *
	 * @param assetCounter the asset counter of this assets used as security
	 */
	@Override
	public void setAssetCounter(String assetCounter) {
		model.setAssetCounter(assetCounter);
	}

	/**
	 * Sets the asset details of this assets used as security.
	 *
	 * @param assetDetails the asset details of this assets used as security
	 */
	@Override
	public void setAssetDetails(String assetDetails) {
		model.setAssetDetails(assetDetails);
	}

	/**
	 * Sets the asset liability of this assets used as security.
	 *
	 * @param assetLiability the asset liability of this assets used as security
	 */
	@Override
	public void setAssetLiability(String assetLiability) {
		model.setAssetLiability(assetLiability);
	}

	/**
	 * Sets the asset net value of this assets used as security.
	 *
	 * @param assetNetValue the asset net value of this assets used as security
	 */
	@Override
	public void setAssetNetValue(String assetNetValue) {
		model.setAssetNetValue(assetNetValue);
	}

	/**
	 * Sets the asset security of this assets used as security.
	 *
	 * @param assetSecurity the asset security of this assets used as security
	 */
	@Override
	public void setAssetSecurity(String assetSecurity) {
		model.setAssetSecurity(assetSecurity);
	}

	/**
	 * Sets the asset security holder of this assets used as security.
	 *
	 * @param assetSecurityHolder the asset security holder of this assets used as security
	 */
	@Override
	public void setAssetSecurityHolder(String assetSecurityHolder) {
		model.setAssetSecurityHolder(assetSecurityHolder);
	}

	/**
	 * Sets the assets used as security ID of this assets used as security.
	 *
	 * @param assetsUsedAsSecurityId the assets used as security ID of this assets used as security
	 */
	@Override
	public void setAssetsUsedAsSecurityId(long assetsUsedAsSecurityId) {
		model.setAssetsUsedAsSecurityId(assetsUsedAsSecurityId);
	}

	/**
	 * Sets the asset value of this assets used as security.
	 *
	 * @param assetValue the asset value of this assets used as security
	 */
	@Override
	public void setAssetValue(String assetValue) {
		model.setAssetValue(assetValue);
	}

	/**
	 * Sets the company ID of this assets used as security.
	 *
	 * @param companyId the company ID of this assets used as security
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the com total asset used security of this assets used as security.
	 *
	 * @param comTotalAssetUsedSecurity the com total asset used security of this assets used as security
	 */
	@Override
	public void setComTotalAssetUsedSecurity(String comTotalAssetUsedSecurity) {
		model.setComTotalAssetUsedSecurity(comTotalAssetUsedSecurity);
	}

	/**
	 * Sets the create date of this assets used as security.
	 *
	 * @param createDate the create date of this assets used as security
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this assets used as security.
	 *
	 * @param groupId the group ID of this assets used as security
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this assets used as security.
	 *
	 * @param modifiedDate the modified date of this assets used as security
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this assets used as security.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this assets used as security
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this assets used as security.
	 *
	 * @param primaryKey the primary key of this assets used as security
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this assets used as security.
	 *
	 * @param userId the user ID of this assets used as security
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this assets used as security.
	 *
	 * @param userName the user name of this assets used as security
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this assets used as security.
	 *
	 * @param userUuid the user uuid of this assets used as security
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
	protected AssetsUsedAsSecurityWrapper wrap(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return new AssetsUsedAsSecurityWrapper(assetsUsedAsSecurity);
	}

}