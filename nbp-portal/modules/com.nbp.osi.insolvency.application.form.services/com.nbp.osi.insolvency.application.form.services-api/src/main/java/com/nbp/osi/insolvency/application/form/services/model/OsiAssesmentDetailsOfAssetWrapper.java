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
 * This class is a wrapper for {@link OsiAssesmentDetailsOfAsset}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssesmentDetailsOfAsset
 * @generated
 */
public class OsiAssesmentDetailsOfAssetWrapper
	extends BaseModelWrapper<OsiAssesmentDetailsOfAsset>
	implements ModelWrapper<OsiAssesmentDetailsOfAsset>,
			   OsiAssesmentDetailsOfAsset {

	public OsiAssesmentDetailsOfAssetWrapper(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		super(osiAssesmentDetailsOfAsset);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("osiAssetDetailsId", getOsiAssetDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"totalAssetUsedAsSecurity", getTotalAssetUsedAsSecurity());
		attributes.put("totalAssetNotUsedAsSec", getTotalAssetNotUsedAsSec());
		attributes.put("totalValuesOfAsset", getTotalValuesOfAsset());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiAssetDetailsId = (Long)attributes.get("osiAssetDetailsId");

		if (osiAssetDetailsId != null) {
			setOsiAssetDetailsId(osiAssetDetailsId);
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

		String totalAssetUsedAsSecurity = (String)attributes.get(
			"totalAssetUsedAsSecurity");

		if (totalAssetUsedAsSecurity != null) {
			setTotalAssetUsedAsSecurity(totalAssetUsedAsSecurity);
		}

		String totalAssetNotUsedAsSec = (String)attributes.get(
			"totalAssetNotUsedAsSec");

		if (totalAssetNotUsedAsSec != null) {
			setTotalAssetNotUsedAsSec(totalAssetNotUsedAsSec);
		}

		String totalValuesOfAsset = (String)attributes.get(
			"totalValuesOfAsset");

		if (totalValuesOfAsset != null) {
			setTotalValuesOfAsset(totalValuesOfAsset);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiAssesmentDetailsOfAsset cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi assesment details of asset.
	 *
	 * @return the company ID of this osi assesment details of asset
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi assesment details of asset.
	 *
	 * @return the create date of this osi assesment details of asset
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi assesment details of asset.
	 *
	 * @return the group ID of this osi assesment details of asset
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi assesment details of asset.
	 *
	 * @return the modified date of this osi assesment details of asset
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi asset details ID of this osi assesment details of asset.
	 *
	 * @return the osi asset details ID of this osi assesment details of asset
	 */
	@Override
	public long getOsiAssetDetailsId() {
		return model.getOsiAssetDetailsId();
	}

	/**
	 * Returns the osi insolvency ID of this osi assesment details of asset.
	 *
	 * @return the osi insolvency ID of this osi assesment details of asset
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this osi assesment details of asset.
	 *
	 * @return the primary key of this osi assesment details of asset
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the total asset not used as sec of this osi assesment details of asset.
	 *
	 * @return the total asset not used as sec of this osi assesment details of asset
	 */
	@Override
	public String getTotalAssetNotUsedAsSec() {
		return model.getTotalAssetNotUsedAsSec();
	}

	/**
	 * Returns the total asset used as security of this osi assesment details of asset.
	 *
	 * @return the total asset used as security of this osi assesment details of asset
	 */
	@Override
	public String getTotalAssetUsedAsSecurity() {
		return model.getTotalAssetUsedAsSecurity();
	}

	/**
	 * Returns the total values of asset of this osi assesment details of asset.
	 *
	 * @return the total values of asset of this osi assesment details of asset
	 */
	@Override
	public String getTotalValuesOfAsset() {
		return model.getTotalValuesOfAsset();
	}

	/**
	 * Returns the user ID of this osi assesment details of asset.
	 *
	 * @return the user ID of this osi assesment details of asset
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi assesment details of asset.
	 *
	 * @return the user name of this osi assesment details of asset
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi assesment details of asset.
	 *
	 * @return the user uuid of this osi assesment details of asset
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
	 * Sets the company ID of this osi assesment details of asset.
	 *
	 * @param companyId the company ID of this osi assesment details of asset
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi assesment details of asset.
	 *
	 * @param createDate the create date of this osi assesment details of asset
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi assesment details of asset.
	 *
	 * @param groupId the group ID of this osi assesment details of asset
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi assesment details of asset.
	 *
	 * @param modifiedDate the modified date of this osi assesment details of asset
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi asset details ID of this osi assesment details of asset.
	 *
	 * @param osiAssetDetailsId the osi asset details ID of this osi assesment details of asset
	 */
	@Override
	public void setOsiAssetDetailsId(long osiAssetDetailsId) {
		model.setOsiAssetDetailsId(osiAssetDetailsId);
	}

	/**
	 * Sets the osi insolvency ID of this osi assesment details of asset.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi assesment details of asset
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this osi assesment details of asset.
	 *
	 * @param primaryKey the primary key of this osi assesment details of asset
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the total asset not used as sec of this osi assesment details of asset.
	 *
	 * @param totalAssetNotUsedAsSec the total asset not used as sec of this osi assesment details of asset
	 */
	@Override
	public void setTotalAssetNotUsedAsSec(String totalAssetNotUsedAsSec) {
		model.setTotalAssetNotUsedAsSec(totalAssetNotUsedAsSec);
	}

	/**
	 * Sets the total asset used as security of this osi assesment details of asset.
	 *
	 * @param totalAssetUsedAsSecurity the total asset used as security of this osi assesment details of asset
	 */
	@Override
	public void setTotalAssetUsedAsSecurity(String totalAssetUsedAsSecurity) {
		model.setTotalAssetUsedAsSecurity(totalAssetUsedAsSecurity);
	}

	/**
	 * Sets the total values of asset of this osi assesment details of asset.
	 *
	 * @param totalValuesOfAsset the total values of asset of this osi assesment details of asset
	 */
	@Override
	public void setTotalValuesOfAsset(String totalValuesOfAsset) {
		model.setTotalValuesOfAsset(totalValuesOfAsset);
	}

	/**
	 * Sets the user ID of this osi assesment details of asset.
	 *
	 * @param userId the user ID of this osi assesment details of asset
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi assesment details of asset.
	 *
	 * @param userName the user name of this osi assesment details of asset
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi assesment details of asset.
	 *
	 * @param userUuid the user uuid of this osi assesment details of asset
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
	protected OsiAssesmentDetailsOfAssetWrapper wrap(
		OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		return new OsiAssesmentDetailsOfAssetWrapper(
			osiAssesmentDetailsOfAsset);
	}

}