/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link QualityDeclarationInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityDeclarationInfo
 * @generated
 */
public class QualityDeclarationInfoWrapper
	extends BaseModelWrapper<QualityDeclarationInfo>
	implements ModelWrapper<QualityDeclarationInfo>, QualityDeclarationInfo {

	public QualityDeclarationInfoWrapper(
		QualityDeclarationInfo qualityDeclarationInfo) {

		super(qualityDeclarationInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"qualityDeclarationInfoId", getQualityDeclarationInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("declarationSignDate", getDeclarationSignDate());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long qualityDeclarationInfoId = (Long)attributes.get(
			"qualityDeclarationInfoId");

		if (qualityDeclarationInfoId != null) {
			setQualityDeclarationInfoId(qualityDeclarationInfoId);
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

		Date declarationSignDate = (Date)attributes.get("declarationSignDate");

		if (declarationSignDate != null) {
			setDeclarationSignDate(declarationSignDate);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public QualityDeclarationInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this quality declaration info.
	 *
	 * @return the company ID of this quality declaration info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this quality declaration info.
	 *
	 * @return the create date of this quality declaration info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the declaration sign date of this quality declaration info.
	 *
	 * @return the declaration sign date of this quality declaration info
	 */
	@Override
	public Date getDeclarationSignDate() {
		return model.getDeclarationSignDate();
	}

	/**
	 * Returns the group ID of this quality declaration info.
	 *
	 * @return the group ID of this quality declaration info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this quality declaration info.
	 *
	 * @return the hsra application ID of this quality declaration info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this quality declaration info.
	 *
	 * @return the modified date of this quality declaration info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this quality declaration info.
	 *
	 * @return the primary key of this quality declaration info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quality declaration info ID of this quality declaration info.
	 *
	 * @return the quality declaration info ID of this quality declaration info
	 */
	@Override
	public long getQualityDeclarationInfoId() {
		return model.getQualityDeclarationInfoId();
	}

	/**
	 * Returns the user ID of this quality declaration info.
	 *
	 * @return the user ID of this quality declaration info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quality declaration info.
	 *
	 * @return the user name of this quality declaration info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quality declaration info.
	 *
	 * @return the user uuid of this quality declaration info
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
	 * Sets the company ID of this quality declaration info.
	 *
	 * @param companyId the company ID of this quality declaration info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this quality declaration info.
	 *
	 * @param createDate the create date of this quality declaration info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the declaration sign date of this quality declaration info.
	 *
	 * @param declarationSignDate the declaration sign date of this quality declaration info
	 */
	@Override
	public void setDeclarationSignDate(Date declarationSignDate) {
		model.setDeclarationSignDate(declarationSignDate);
	}

	/**
	 * Sets the group ID of this quality declaration info.
	 *
	 * @param groupId the group ID of this quality declaration info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this quality declaration info.
	 *
	 * @param hsraApplicationId the hsra application ID of this quality declaration info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this quality declaration info.
	 *
	 * @param modifiedDate the modified date of this quality declaration info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this quality declaration info.
	 *
	 * @param primaryKey the primary key of this quality declaration info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quality declaration info ID of this quality declaration info.
	 *
	 * @param qualityDeclarationInfoId the quality declaration info ID of this quality declaration info
	 */
	@Override
	public void setQualityDeclarationInfoId(long qualityDeclarationInfoId) {
		model.setQualityDeclarationInfoId(qualityDeclarationInfoId);
	}

	/**
	 * Sets the user ID of this quality declaration info.
	 *
	 * @param userId the user ID of this quality declaration info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quality declaration info.
	 *
	 * @param userName the user name of this quality declaration info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quality declaration info.
	 *
	 * @param userUuid the user uuid of this quality declaration info
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
	protected QualityDeclarationInfoWrapper wrap(
		QualityDeclarationInfo qualityDeclarationInfo) {

		return new QualityDeclarationInfoWrapper(qualityDeclarationInfo);
	}

}