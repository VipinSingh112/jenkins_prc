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
 * This class is a wrapper for {@link RadiationDeclaration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDeclaration
 * @generated
 */
public class RadiationDeclarationWrapper
	extends BaseModelWrapper<RadiationDeclaration>
	implements ModelWrapper<RadiationDeclaration>, RadiationDeclaration {

	public RadiationDeclarationWrapper(
		RadiationDeclaration radiationDeclaration) {

		super(radiationDeclaration);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("radiationDeclarationId", getRadiationDeclarationId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("legalOperatorName", getLegalOperatorName());
		attributes.put("operatorTitle", getOperatorTitle());
		attributes.put("operatorDate", getOperatorDate());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long radiationDeclarationId = (Long)attributes.get(
			"radiationDeclarationId");

		if (radiationDeclarationId != null) {
			setRadiationDeclarationId(radiationDeclarationId);
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

		String legalOperatorName = (String)attributes.get("legalOperatorName");

		if (legalOperatorName != null) {
			setLegalOperatorName(legalOperatorName);
		}

		String operatorTitle = (String)attributes.get("operatorTitle");

		if (operatorTitle != null) {
			setOperatorTitle(operatorTitle);
		}

		Date operatorDate = (Date)attributes.get("operatorDate");

		if (operatorDate != null) {
			setOperatorDate(operatorDate);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public RadiationDeclaration cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this radiation declaration.
	 *
	 * @return the company ID of this radiation declaration
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this radiation declaration.
	 *
	 * @return the create date of this radiation declaration
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this radiation declaration.
	 *
	 * @return the group ID of this radiation declaration
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this radiation declaration.
	 *
	 * @return the hsra application ID of this radiation declaration
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the legal operator name of this radiation declaration.
	 *
	 * @return the legal operator name of this radiation declaration
	 */
	@Override
	public String getLegalOperatorName() {
		return model.getLegalOperatorName();
	}

	/**
	 * Returns the modified date of this radiation declaration.
	 *
	 * @return the modified date of this radiation declaration
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the operator date of this radiation declaration.
	 *
	 * @return the operator date of this radiation declaration
	 */
	@Override
	public Date getOperatorDate() {
		return model.getOperatorDate();
	}

	/**
	 * Returns the operator title of this radiation declaration.
	 *
	 * @return the operator title of this radiation declaration
	 */
	@Override
	public String getOperatorTitle() {
		return model.getOperatorTitle();
	}

	/**
	 * Returns the primary key of this radiation declaration.
	 *
	 * @return the primary key of this radiation declaration
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the radiation declaration ID of this radiation declaration.
	 *
	 * @return the radiation declaration ID of this radiation declaration
	 */
	@Override
	public long getRadiationDeclarationId() {
		return model.getRadiationDeclarationId();
	}

	/**
	 * Returns the user ID of this radiation declaration.
	 *
	 * @return the user ID of this radiation declaration
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this radiation declaration.
	 *
	 * @return the user name of this radiation declaration
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this radiation declaration.
	 *
	 * @return the user uuid of this radiation declaration
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
	 * Sets the company ID of this radiation declaration.
	 *
	 * @param companyId the company ID of this radiation declaration
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this radiation declaration.
	 *
	 * @param createDate the create date of this radiation declaration
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this radiation declaration.
	 *
	 * @param groupId the group ID of this radiation declaration
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this radiation declaration.
	 *
	 * @param hsraApplicationId the hsra application ID of this radiation declaration
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the legal operator name of this radiation declaration.
	 *
	 * @param legalOperatorName the legal operator name of this radiation declaration
	 */
	@Override
	public void setLegalOperatorName(String legalOperatorName) {
		model.setLegalOperatorName(legalOperatorName);
	}

	/**
	 * Sets the modified date of this radiation declaration.
	 *
	 * @param modifiedDate the modified date of this radiation declaration
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the operator date of this radiation declaration.
	 *
	 * @param operatorDate the operator date of this radiation declaration
	 */
	@Override
	public void setOperatorDate(Date operatorDate) {
		model.setOperatorDate(operatorDate);
	}

	/**
	 * Sets the operator title of this radiation declaration.
	 *
	 * @param operatorTitle the operator title of this radiation declaration
	 */
	@Override
	public void setOperatorTitle(String operatorTitle) {
		model.setOperatorTitle(operatorTitle);
	}

	/**
	 * Sets the primary key of this radiation declaration.
	 *
	 * @param primaryKey the primary key of this radiation declaration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the radiation declaration ID of this radiation declaration.
	 *
	 * @param radiationDeclarationId the radiation declaration ID of this radiation declaration
	 */
	@Override
	public void setRadiationDeclarationId(long radiationDeclarationId) {
		model.setRadiationDeclarationId(radiationDeclarationId);
	}

	/**
	 * Sets the user ID of this radiation declaration.
	 *
	 * @param userId the user ID of this radiation declaration
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this radiation declaration.
	 *
	 * @param userName the user name of this radiation declaration
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this radiation declaration.
	 *
	 * @param userUuid the user uuid of this radiation declaration
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
	protected RadiationDeclarationWrapper wrap(
		RadiationDeclaration radiationDeclaration) {

		return new RadiationDeclarationWrapper(radiationDeclaration);
	}

}