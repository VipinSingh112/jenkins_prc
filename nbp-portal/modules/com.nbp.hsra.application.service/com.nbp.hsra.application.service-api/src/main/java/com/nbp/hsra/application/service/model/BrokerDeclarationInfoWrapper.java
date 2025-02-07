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
 * This class is a wrapper for {@link BrokerDeclarationInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrokerDeclarationInfo
 * @generated
 */
public class BrokerDeclarationInfoWrapper
	extends BaseModelWrapper<BrokerDeclarationInfo>
	implements BrokerDeclarationInfo, ModelWrapper<BrokerDeclarationInfo> {

	public BrokerDeclarationInfoWrapper(
		BrokerDeclarationInfo brokerDeclarationInfo) {

		super(brokerDeclarationInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("brokerDeclareInfoId", getBrokerDeclareInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("brokerOperatorName", getBrokerOperatorName());
		attributes.put("brokerTitle", getBrokerTitle());
		attributes.put("signDate", getSignDate());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long brokerDeclareInfoId = (Long)attributes.get("brokerDeclareInfoId");

		if (brokerDeclareInfoId != null) {
			setBrokerDeclareInfoId(brokerDeclareInfoId);
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

		String brokerOperatorName = (String)attributes.get(
			"brokerOperatorName");

		if (brokerOperatorName != null) {
			setBrokerOperatorName(brokerOperatorName);
		}

		String brokerTitle = (String)attributes.get("brokerTitle");

		if (brokerTitle != null) {
			setBrokerTitle(brokerTitle);
		}

		Date signDate = (Date)attributes.get("signDate");

		if (signDate != null) {
			setSignDate(signDate);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public BrokerDeclarationInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the broker declare info ID of this broker declaration info.
	 *
	 * @return the broker declare info ID of this broker declaration info
	 */
	@Override
	public long getBrokerDeclareInfoId() {
		return model.getBrokerDeclareInfoId();
	}

	/**
	 * Returns the broker operator name of this broker declaration info.
	 *
	 * @return the broker operator name of this broker declaration info
	 */
	@Override
	public String getBrokerOperatorName() {
		return model.getBrokerOperatorName();
	}

	/**
	 * Returns the broker title of this broker declaration info.
	 *
	 * @return the broker title of this broker declaration info
	 */
	@Override
	public String getBrokerTitle() {
		return model.getBrokerTitle();
	}

	/**
	 * Returns the company ID of this broker declaration info.
	 *
	 * @return the company ID of this broker declaration info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this broker declaration info.
	 *
	 * @return the create date of this broker declaration info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this broker declaration info.
	 *
	 * @return the group ID of this broker declaration info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this broker declaration info.
	 *
	 * @return the hsra application ID of this broker declaration info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the modified date of this broker declaration info.
	 *
	 * @return the modified date of this broker declaration info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this broker declaration info.
	 *
	 * @return the primary key of this broker declaration info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sign date of this broker declaration info.
	 *
	 * @return the sign date of this broker declaration info
	 */
	@Override
	public Date getSignDate() {
		return model.getSignDate();
	}

	/**
	 * Returns the user ID of this broker declaration info.
	 *
	 * @return the user ID of this broker declaration info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this broker declaration info.
	 *
	 * @return the user name of this broker declaration info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this broker declaration info.
	 *
	 * @return the user uuid of this broker declaration info
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
	 * Sets the broker declare info ID of this broker declaration info.
	 *
	 * @param brokerDeclareInfoId the broker declare info ID of this broker declaration info
	 */
	@Override
	public void setBrokerDeclareInfoId(long brokerDeclareInfoId) {
		model.setBrokerDeclareInfoId(brokerDeclareInfoId);
	}

	/**
	 * Sets the broker operator name of this broker declaration info.
	 *
	 * @param brokerOperatorName the broker operator name of this broker declaration info
	 */
	@Override
	public void setBrokerOperatorName(String brokerOperatorName) {
		model.setBrokerOperatorName(brokerOperatorName);
	}

	/**
	 * Sets the broker title of this broker declaration info.
	 *
	 * @param brokerTitle the broker title of this broker declaration info
	 */
	@Override
	public void setBrokerTitle(String brokerTitle) {
		model.setBrokerTitle(brokerTitle);
	}

	/**
	 * Sets the company ID of this broker declaration info.
	 *
	 * @param companyId the company ID of this broker declaration info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this broker declaration info.
	 *
	 * @param createDate the create date of this broker declaration info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this broker declaration info.
	 *
	 * @param groupId the group ID of this broker declaration info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this broker declaration info.
	 *
	 * @param hsraApplicationId the hsra application ID of this broker declaration info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the modified date of this broker declaration info.
	 *
	 * @param modifiedDate the modified date of this broker declaration info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this broker declaration info.
	 *
	 * @param primaryKey the primary key of this broker declaration info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sign date of this broker declaration info.
	 *
	 * @param signDate the sign date of this broker declaration info
	 */
	@Override
	public void setSignDate(Date signDate) {
		model.setSignDate(signDate);
	}

	/**
	 * Sets the user ID of this broker declaration info.
	 *
	 * @param userId the user ID of this broker declaration info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this broker declaration info.
	 *
	 * @param userName the user name of this broker declaration info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this broker declaration info.
	 *
	 * @param userUuid the user uuid of this broker declaration info
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
	protected BrokerDeclarationInfoWrapper wrap(
		BrokerDeclarationInfo brokerDeclarationInfo) {

		return new BrokerDeclarationInfoWrapper(brokerDeclarationInfo);
	}

}