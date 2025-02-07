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
 * This class is a wrapper for {@link QualityEmploymentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityEmploymentInfo
 * @generated
 */
public class QualityEmploymentInfoWrapper
	extends BaseModelWrapper<QualityEmploymentInfo>
	implements ModelWrapper<QualityEmploymentInfo>, QualityEmploymentInfo {

	public QualityEmploymentInfoWrapper(
		QualityEmploymentInfo qualityEmploymentInfo) {

		super(qualityEmploymentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("qualityEmploymentInfoId", getQualityEmploymentInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("teleNo", getTeleNo());
		attributes.put("address", getAddress());
		attributes.put("parish", getParish());
		attributes.put("mobileNo", getMobileNo());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long qualityEmploymentInfoId = (Long)attributes.get(
			"qualityEmploymentInfoId");

		if (qualityEmploymentInfoId != null) {
			setQualityEmploymentInfoId(qualityEmploymentInfoId);
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

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String teleNo = (String)attributes.get("teleNo");

		if (teleNo != null) {
			setTeleNo(teleNo);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String mobileNo = (String)attributes.get("mobileNo");

		if (mobileNo != null) {
			setMobileNo(mobileNo);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public QualityEmploymentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this quality employment info.
	 *
	 * @return the address of this quality employment info
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the company ID of this quality employment info.
	 *
	 * @return the company ID of this quality employment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this quality employment info.
	 *
	 * @return the company name of this quality employment info
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the create date of this quality employment info.
	 *
	 * @return the create date of this quality employment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email address of this quality employment info.
	 *
	 * @return the email address of this quality employment info
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the group ID of this quality employment info.
	 *
	 * @return the group ID of this quality employment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this quality employment info.
	 *
	 * @return the hsra application ID of this quality employment info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the mobile no of this quality employment info.
	 *
	 * @return the mobile no of this quality employment info
	 */
	@Override
	public String getMobileNo() {
		return model.getMobileNo();
	}

	/**
	 * Returns the modified date of this quality employment info.
	 *
	 * @return the modified date of this quality employment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the parish of this quality employment info.
	 *
	 * @return the parish of this quality employment info
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the primary key of this quality employment info.
	 *
	 * @return the primary key of this quality employment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quality employment info ID of this quality employment info.
	 *
	 * @return the quality employment info ID of this quality employment info
	 */
	@Override
	public long getQualityEmploymentInfoId() {
		return model.getQualityEmploymentInfoId();
	}

	/**
	 * Returns the tele no of this quality employment info.
	 *
	 * @return the tele no of this quality employment info
	 */
	@Override
	public String getTeleNo() {
		return model.getTeleNo();
	}

	/**
	 * Returns the user ID of this quality employment info.
	 *
	 * @return the user ID of this quality employment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this quality employment info.
	 *
	 * @return the user name of this quality employment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this quality employment info.
	 *
	 * @return the user uuid of this quality employment info
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
	 * Sets the address of this quality employment info.
	 *
	 * @param address the address of this quality employment info
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the company ID of this quality employment info.
	 *
	 * @param companyId the company ID of this quality employment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this quality employment info.
	 *
	 * @param companyName the company name of this quality employment info
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the create date of this quality employment info.
	 *
	 * @param createDate the create date of this quality employment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email address of this quality employment info.
	 *
	 * @param emailAddress the email address of this quality employment info
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the group ID of this quality employment info.
	 *
	 * @param groupId the group ID of this quality employment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this quality employment info.
	 *
	 * @param hsraApplicationId the hsra application ID of this quality employment info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the mobile no of this quality employment info.
	 *
	 * @param mobileNo the mobile no of this quality employment info
	 */
	@Override
	public void setMobileNo(String mobileNo) {
		model.setMobileNo(mobileNo);
	}

	/**
	 * Sets the modified date of this quality employment info.
	 *
	 * @param modifiedDate the modified date of this quality employment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the parish of this quality employment info.
	 *
	 * @param parish the parish of this quality employment info
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the primary key of this quality employment info.
	 *
	 * @param primaryKey the primary key of this quality employment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quality employment info ID of this quality employment info.
	 *
	 * @param qualityEmploymentInfoId the quality employment info ID of this quality employment info
	 */
	@Override
	public void setQualityEmploymentInfoId(long qualityEmploymentInfoId) {
		model.setQualityEmploymentInfoId(qualityEmploymentInfoId);
	}

	/**
	 * Sets the tele no of this quality employment info.
	 *
	 * @param teleNo the tele no of this quality employment info
	 */
	@Override
	public void setTeleNo(String teleNo) {
		model.setTeleNo(teleNo);
	}

	/**
	 * Sets the user ID of this quality employment info.
	 *
	 * @param userId the user ID of this quality employment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this quality employment info.
	 *
	 * @param userName the user name of this quality employment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this quality employment info.
	 *
	 * @param userUuid the user uuid of this quality employment info
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
	protected QualityEmploymentInfoWrapper wrap(
		QualityEmploymentInfo qualityEmploymentInfo) {

		return new QualityEmploymentInfoWrapper(qualityEmploymentInfo);
	}

}