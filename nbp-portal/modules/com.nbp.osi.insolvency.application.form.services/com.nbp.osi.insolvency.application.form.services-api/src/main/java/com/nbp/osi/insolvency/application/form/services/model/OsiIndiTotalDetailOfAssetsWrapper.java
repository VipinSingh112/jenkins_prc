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
 * This class is a wrapper for {@link OsiIndiTotalDetailOfAssets}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiIndiTotalDetailOfAssets
 * @generated
 */
public class OsiIndiTotalDetailOfAssetsWrapper
	extends BaseModelWrapper<OsiIndiTotalDetailOfAssets>
	implements ModelWrapper<OsiIndiTotalDetailOfAssets>,
			   OsiIndiTotalDetailOfAssets {

	public OsiIndiTotalDetailOfAssetsWrapper(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		super(osiIndiTotalDetailOfAssets);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"osiIndiTotalDetailOfAssetsId", getOsiIndiTotalDetailOfAssetsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"totalValueOfAssetUsedSecu", getTotalValueOfAssetUsedSecu());
		attributes.put(
			"totalValueOfAssetNotUsedSecu", getTotalValueOfAssetNotUsedSecu());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long osiIndiTotalDetailOfAssetsId = (Long)attributes.get(
			"osiIndiTotalDetailOfAssetsId");

		if (osiIndiTotalDetailOfAssetsId != null) {
			setOsiIndiTotalDetailOfAssetsId(osiIndiTotalDetailOfAssetsId);
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

		String totalValueOfAssetUsedSecu = (String)attributes.get(
			"totalValueOfAssetUsedSecu");

		if (totalValueOfAssetUsedSecu != null) {
			setTotalValueOfAssetUsedSecu(totalValueOfAssetUsedSecu);
		}

		String totalValueOfAssetNotUsedSecu = (String)attributes.get(
			"totalValueOfAssetNotUsedSecu");

		if (totalValueOfAssetNotUsedSecu != null) {
			setTotalValueOfAssetNotUsedSecu(totalValueOfAssetNotUsedSecu);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public OsiIndiTotalDetailOfAssets cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this osi indi total detail of assets.
	 *
	 * @return the company ID of this osi indi total detail of assets
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi indi total detail of assets.
	 *
	 * @return the create date of this osi indi total detail of assets
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this osi indi total detail of assets.
	 *
	 * @return the group ID of this osi indi total detail of assets
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi indi total detail of assets.
	 *
	 * @return the modified date of this osi indi total detail of assets
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi indi total detail of assets ID of this osi indi total detail of assets.
	 *
	 * @return the osi indi total detail of assets ID of this osi indi total detail of assets
	 */
	@Override
	public long getOsiIndiTotalDetailOfAssetsId() {
		return model.getOsiIndiTotalDetailOfAssetsId();
	}

	/**
	 * Returns the osi insolvency ID of this osi indi total detail of assets.
	 *
	 * @return the osi insolvency ID of this osi indi total detail of assets
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this osi indi total detail of assets.
	 *
	 * @return the primary key of this osi indi total detail of assets
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the total value of asset not used secu of this osi indi total detail of assets.
	 *
	 * @return the total value of asset not used secu of this osi indi total detail of assets
	 */
	@Override
	public String getTotalValueOfAssetNotUsedSecu() {
		return model.getTotalValueOfAssetNotUsedSecu();
	}

	/**
	 * Returns the total value of asset used secu of this osi indi total detail of assets.
	 *
	 * @return the total value of asset used secu of this osi indi total detail of assets
	 */
	@Override
	public String getTotalValueOfAssetUsedSecu() {
		return model.getTotalValueOfAssetUsedSecu();
	}

	/**
	 * Returns the user ID of this osi indi total detail of assets.
	 *
	 * @return the user ID of this osi indi total detail of assets
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi indi total detail of assets.
	 *
	 * @return the user name of this osi indi total detail of assets
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi indi total detail of assets.
	 *
	 * @return the user uuid of this osi indi total detail of assets
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
	 * Sets the company ID of this osi indi total detail of assets.
	 *
	 * @param companyId the company ID of this osi indi total detail of assets
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi indi total detail of assets.
	 *
	 * @param createDate the create date of this osi indi total detail of assets
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this osi indi total detail of assets.
	 *
	 * @param groupId the group ID of this osi indi total detail of assets
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi indi total detail of assets.
	 *
	 * @param modifiedDate the modified date of this osi indi total detail of assets
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi indi total detail of assets ID of this osi indi total detail of assets.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the osi indi total detail of assets ID of this osi indi total detail of assets
	 */
	@Override
	public void setOsiIndiTotalDetailOfAssetsId(
		long osiIndiTotalDetailOfAssetsId) {

		model.setOsiIndiTotalDetailOfAssetsId(osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Sets the osi insolvency ID of this osi indi total detail of assets.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this osi indi total detail of assets
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this osi indi total detail of assets.
	 *
	 * @param primaryKey the primary key of this osi indi total detail of assets
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the total value of asset not used secu of this osi indi total detail of assets.
	 *
	 * @param totalValueOfAssetNotUsedSecu the total value of asset not used secu of this osi indi total detail of assets
	 */
	@Override
	public void setTotalValueOfAssetNotUsedSecu(
		String totalValueOfAssetNotUsedSecu) {

		model.setTotalValueOfAssetNotUsedSecu(totalValueOfAssetNotUsedSecu);
	}

	/**
	 * Sets the total value of asset used secu of this osi indi total detail of assets.
	 *
	 * @param totalValueOfAssetUsedSecu the total value of asset used secu of this osi indi total detail of assets
	 */
	@Override
	public void setTotalValueOfAssetUsedSecu(String totalValueOfAssetUsedSecu) {
		model.setTotalValueOfAssetUsedSecu(totalValueOfAssetUsedSecu);
	}

	/**
	 * Sets the user ID of this osi indi total detail of assets.
	 *
	 * @param userId the user ID of this osi indi total detail of assets
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi indi total detail of assets.
	 *
	 * @param userName the user name of this osi indi total detail of assets
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi indi total detail of assets.
	 *
	 * @param userUuid the user uuid of this osi indi total detail of assets
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
	protected OsiIndiTotalDetailOfAssetsWrapper wrap(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return new OsiIndiTotalDetailOfAssetsWrapper(
			osiIndiTotalDetailOfAssets);
	}

}