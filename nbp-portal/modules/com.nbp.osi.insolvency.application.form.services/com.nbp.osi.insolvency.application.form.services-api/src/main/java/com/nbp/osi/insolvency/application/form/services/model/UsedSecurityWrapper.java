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
 * This class is a wrapper for {@link UsedSecurity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsedSecurity
 * @generated
 */
public class UsedSecurityWrapper
	extends BaseModelWrapper<UsedSecurity>
	implements ModelWrapper<UsedSecurity>, UsedSecurity {

	public UsedSecurityWrapper(UsedSecurity usedSecurity) {
		super(usedSecurity);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("usedSecurityId", getUsedSecurityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("assetType", getAssetType());
		attributes.put("securityHolder", getSecurityHolder());
		attributes.put("securityDetail", getSecurityDetail());
		attributes.put("securityValue", getSecurityValue());
		attributes.put("securityLiability", getSecurityLiability());
		attributes.put("securityNetValue", getSecurityNetValue());
		attributes.put("securityCounter", getSecurityCounter());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long usedSecurityId = (Long)attributes.get("usedSecurityId");

		if (usedSecurityId != null) {
			setUsedSecurityId(usedSecurityId);
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

		String assetType = (String)attributes.get("assetType");

		if (assetType != null) {
			setAssetType(assetType);
		}

		String securityHolder = (String)attributes.get("securityHolder");

		if (securityHolder != null) {
			setSecurityHolder(securityHolder);
		}

		String securityDetail = (String)attributes.get("securityDetail");

		if (securityDetail != null) {
			setSecurityDetail(securityDetail);
		}

		String securityValue = (String)attributes.get("securityValue");

		if (securityValue != null) {
			setSecurityValue(securityValue);
		}

		String securityLiability = (String)attributes.get("securityLiability");

		if (securityLiability != null) {
			setSecurityLiability(securityLiability);
		}

		String securityNetValue = (String)attributes.get("securityNetValue");

		if (securityNetValue != null) {
			setSecurityNetValue(securityNetValue);
		}

		String securityCounter = (String)attributes.get("securityCounter");

		if (securityCounter != null) {
			setSecurityCounter(securityCounter);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public UsedSecurity cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the asset type of this used security.
	 *
	 * @return the asset type of this used security
	 */
	@Override
	public String getAssetType() {
		return model.getAssetType();
	}

	/**
	 * Returns the company ID of this used security.
	 *
	 * @return the company ID of this used security
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this used security.
	 *
	 * @return the create date of this used security
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this used security.
	 *
	 * @return the group ID of this used security
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this used security.
	 *
	 * @return the modified date of this used security
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this used security.
	 *
	 * @return the osi insolvency ID of this used security
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this used security.
	 *
	 * @return the primary key of this used security
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the security counter of this used security.
	 *
	 * @return the security counter of this used security
	 */
	@Override
	public String getSecurityCounter() {
		return model.getSecurityCounter();
	}

	/**
	 * Returns the security detail of this used security.
	 *
	 * @return the security detail of this used security
	 */
	@Override
	public String getSecurityDetail() {
		return model.getSecurityDetail();
	}

	/**
	 * Returns the security holder of this used security.
	 *
	 * @return the security holder of this used security
	 */
	@Override
	public String getSecurityHolder() {
		return model.getSecurityHolder();
	}

	/**
	 * Returns the security liability of this used security.
	 *
	 * @return the security liability of this used security
	 */
	@Override
	public String getSecurityLiability() {
		return model.getSecurityLiability();
	}

	/**
	 * Returns the security net value of this used security.
	 *
	 * @return the security net value of this used security
	 */
	@Override
	public String getSecurityNetValue() {
		return model.getSecurityNetValue();
	}

	/**
	 * Returns the security value of this used security.
	 *
	 * @return the security value of this used security
	 */
	@Override
	public String getSecurityValue() {
		return model.getSecurityValue();
	}

	/**
	 * Returns the used security ID of this used security.
	 *
	 * @return the used security ID of this used security
	 */
	@Override
	public long getUsedSecurityId() {
		return model.getUsedSecurityId();
	}

	/**
	 * Returns the user ID of this used security.
	 *
	 * @return the user ID of this used security
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this used security.
	 *
	 * @return the user name of this used security
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this used security.
	 *
	 * @return the user uuid of this used security
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
	 * Sets the asset type of this used security.
	 *
	 * @param assetType the asset type of this used security
	 */
	@Override
	public void setAssetType(String assetType) {
		model.setAssetType(assetType);
	}

	/**
	 * Sets the company ID of this used security.
	 *
	 * @param companyId the company ID of this used security
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this used security.
	 *
	 * @param createDate the create date of this used security
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this used security.
	 *
	 * @param groupId the group ID of this used security
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this used security.
	 *
	 * @param modifiedDate the modified date of this used security
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this used security.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this used security
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this used security.
	 *
	 * @param primaryKey the primary key of this used security
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the security counter of this used security.
	 *
	 * @param securityCounter the security counter of this used security
	 */
	@Override
	public void setSecurityCounter(String securityCounter) {
		model.setSecurityCounter(securityCounter);
	}

	/**
	 * Sets the security detail of this used security.
	 *
	 * @param securityDetail the security detail of this used security
	 */
	@Override
	public void setSecurityDetail(String securityDetail) {
		model.setSecurityDetail(securityDetail);
	}

	/**
	 * Sets the security holder of this used security.
	 *
	 * @param securityHolder the security holder of this used security
	 */
	@Override
	public void setSecurityHolder(String securityHolder) {
		model.setSecurityHolder(securityHolder);
	}

	/**
	 * Sets the security liability of this used security.
	 *
	 * @param securityLiability the security liability of this used security
	 */
	@Override
	public void setSecurityLiability(String securityLiability) {
		model.setSecurityLiability(securityLiability);
	}

	/**
	 * Sets the security net value of this used security.
	 *
	 * @param securityNetValue the security net value of this used security
	 */
	@Override
	public void setSecurityNetValue(String securityNetValue) {
		model.setSecurityNetValue(securityNetValue);
	}

	/**
	 * Sets the security value of this used security.
	 *
	 * @param securityValue the security value of this used security
	 */
	@Override
	public void setSecurityValue(String securityValue) {
		model.setSecurityValue(securityValue);
	}

	/**
	 * Sets the used security ID of this used security.
	 *
	 * @param usedSecurityId the used security ID of this used security
	 */
	@Override
	public void setUsedSecurityId(long usedSecurityId) {
		model.setUsedSecurityId(usedSecurityId);
	}

	/**
	 * Sets the user ID of this used security.
	 *
	 * @param userId the user ID of this used security
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this used security.
	 *
	 * @param userName the user name of this used security
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this used security.
	 *
	 * @param userUuid the user uuid of this used security
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
	protected UsedSecurityWrapper wrap(UsedSecurity usedSecurity) {
		return new UsedSecurityWrapper(usedSecurity);
	}

}