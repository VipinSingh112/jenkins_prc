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
 * This class is a wrapper for {@link NotifiLegalInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotifiLegalInfo
 * @generated
 */
public class NotifiLegalInfoWrapper
	extends BaseModelWrapper<NotifiLegalInfo>
	implements ModelWrapper<NotifiLegalInfo>, NotifiLegalInfo {

	public NotifiLegalInfoWrapper(NotifiLegalInfo notifiLegalInfo) {
		super(notifiLegalInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("notifiLegalInfoId", getNotifiLegalInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("legalPersonName", getLegalPersonName());
		attributes.put("legalPersonAddress", getLegalPersonAddress());
		attributes.put("organizationName", getOrganizationName());
		attributes.put("organizationAddress", getOrganizationAddress());
		attributes.put("contactNumber", getContactNumber());
		attributes.put("legalPersonEmail", getLegalPersonEmail());
		attributes.put("practiceNature", getPracticeNature());
		attributes.put("hsraApplicationId", getHsraApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long notifiLegalInfoId = (Long)attributes.get("notifiLegalInfoId");

		if (notifiLegalInfoId != null) {
			setNotifiLegalInfoId(notifiLegalInfoId);
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

		String legalPersonName = (String)attributes.get("legalPersonName");

		if (legalPersonName != null) {
			setLegalPersonName(legalPersonName);
		}

		String legalPersonAddress = (String)attributes.get(
			"legalPersonAddress");

		if (legalPersonAddress != null) {
			setLegalPersonAddress(legalPersonAddress);
		}

		String organizationName = (String)attributes.get("organizationName");

		if (organizationName != null) {
			setOrganizationName(organizationName);
		}

		String organizationAddress = (String)attributes.get(
			"organizationAddress");

		if (organizationAddress != null) {
			setOrganizationAddress(organizationAddress);
		}

		String contactNumber = (String)attributes.get("contactNumber");

		if (contactNumber != null) {
			setContactNumber(contactNumber);
		}

		String legalPersonEmail = (String)attributes.get("legalPersonEmail");

		if (legalPersonEmail != null) {
			setLegalPersonEmail(legalPersonEmail);
		}

		String practiceNature = (String)attributes.get("practiceNature");

		if (practiceNature != null) {
			setPracticeNature(practiceNature);
		}

		Long hsraApplicationId = (Long)attributes.get("hsraApplicationId");

		if (hsraApplicationId != null) {
			setHsraApplicationId(hsraApplicationId);
		}
	}

	@Override
	public NotifiLegalInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this notifi legal info.
	 *
	 * @return the company ID of this notifi legal info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the contact number of this notifi legal info.
	 *
	 * @return the contact number of this notifi legal info
	 */
	@Override
	public String getContactNumber() {
		return model.getContactNumber();
	}

	/**
	 * Returns the create date of this notifi legal info.
	 *
	 * @return the create date of this notifi legal info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this notifi legal info.
	 *
	 * @return the group ID of this notifi legal info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hsra application ID of this notifi legal info.
	 *
	 * @return the hsra application ID of this notifi legal info
	 */
	@Override
	public long getHsraApplicationId() {
		return model.getHsraApplicationId();
	}

	/**
	 * Returns the legal person address of this notifi legal info.
	 *
	 * @return the legal person address of this notifi legal info
	 */
	@Override
	public String getLegalPersonAddress() {
		return model.getLegalPersonAddress();
	}

	/**
	 * Returns the legal person email of this notifi legal info.
	 *
	 * @return the legal person email of this notifi legal info
	 */
	@Override
	public String getLegalPersonEmail() {
		return model.getLegalPersonEmail();
	}

	/**
	 * Returns the legal person name of this notifi legal info.
	 *
	 * @return the legal person name of this notifi legal info
	 */
	@Override
	public String getLegalPersonName() {
		return model.getLegalPersonName();
	}

	/**
	 * Returns the modified date of this notifi legal info.
	 *
	 * @return the modified date of this notifi legal info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the notifi legal info ID of this notifi legal info.
	 *
	 * @return the notifi legal info ID of this notifi legal info
	 */
	@Override
	public long getNotifiLegalInfoId() {
		return model.getNotifiLegalInfoId();
	}

	/**
	 * Returns the organization address of this notifi legal info.
	 *
	 * @return the organization address of this notifi legal info
	 */
	@Override
	public String getOrganizationAddress() {
		return model.getOrganizationAddress();
	}

	/**
	 * Returns the organization name of this notifi legal info.
	 *
	 * @return the organization name of this notifi legal info
	 */
	@Override
	public String getOrganizationName() {
		return model.getOrganizationName();
	}

	/**
	 * Returns the practice nature of this notifi legal info.
	 *
	 * @return the practice nature of this notifi legal info
	 */
	@Override
	public String getPracticeNature() {
		return model.getPracticeNature();
	}

	/**
	 * Returns the primary key of this notifi legal info.
	 *
	 * @return the primary key of this notifi legal info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this notifi legal info.
	 *
	 * @return the user ID of this notifi legal info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this notifi legal info.
	 *
	 * @return the user name of this notifi legal info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this notifi legal info.
	 *
	 * @return the user uuid of this notifi legal info
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
	 * Sets the company ID of this notifi legal info.
	 *
	 * @param companyId the company ID of this notifi legal info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the contact number of this notifi legal info.
	 *
	 * @param contactNumber the contact number of this notifi legal info
	 */
	@Override
	public void setContactNumber(String contactNumber) {
		model.setContactNumber(contactNumber);
	}

	/**
	 * Sets the create date of this notifi legal info.
	 *
	 * @param createDate the create date of this notifi legal info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this notifi legal info.
	 *
	 * @param groupId the group ID of this notifi legal info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hsra application ID of this notifi legal info.
	 *
	 * @param hsraApplicationId the hsra application ID of this notifi legal info
	 */
	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		model.setHsraApplicationId(hsraApplicationId);
	}

	/**
	 * Sets the legal person address of this notifi legal info.
	 *
	 * @param legalPersonAddress the legal person address of this notifi legal info
	 */
	@Override
	public void setLegalPersonAddress(String legalPersonAddress) {
		model.setLegalPersonAddress(legalPersonAddress);
	}

	/**
	 * Sets the legal person email of this notifi legal info.
	 *
	 * @param legalPersonEmail the legal person email of this notifi legal info
	 */
	@Override
	public void setLegalPersonEmail(String legalPersonEmail) {
		model.setLegalPersonEmail(legalPersonEmail);
	}

	/**
	 * Sets the legal person name of this notifi legal info.
	 *
	 * @param legalPersonName the legal person name of this notifi legal info
	 */
	@Override
	public void setLegalPersonName(String legalPersonName) {
		model.setLegalPersonName(legalPersonName);
	}

	/**
	 * Sets the modified date of this notifi legal info.
	 *
	 * @param modifiedDate the modified date of this notifi legal info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the notifi legal info ID of this notifi legal info.
	 *
	 * @param notifiLegalInfoId the notifi legal info ID of this notifi legal info
	 */
	@Override
	public void setNotifiLegalInfoId(long notifiLegalInfoId) {
		model.setNotifiLegalInfoId(notifiLegalInfoId);
	}

	/**
	 * Sets the organization address of this notifi legal info.
	 *
	 * @param organizationAddress the organization address of this notifi legal info
	 */
	@Override
	public void setOrganizationAddress(String organizationAddress) {
		model.setOrganizationAddress(organizationAddress);
	}

	/**
	 * Sets the organization name of this notifi legal info.
	 *
	 * @param organizationName the organization name of this notifi legal info
	 */
	@Override
	public void setOrganizationName(String organizationName) {
		model.setOrganizationName(organizationName);
	}

	/**
	 * Sets the practice nature of this notifi legal info.
	 *
	 * @param practiceNature the practice nature of this notifi legal info
	 */
	@Override
	public void setPracticeNature(String practiceNature) {
		model.setPracticeNature(practiceNature);
	}

	/**
	 * Sets the primary key of this notifi legal info.
	 *
	 * @param primaryKey the primary key of this notifi legal info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this notifi legal info.
	 *
	 * @param userId the user ID of this notifi legal info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this notifi legal info.
	 *
	 * @param userName the user name of this notifi legal info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this notifi legal info.
	 *
	 * @param userUuid the user uuid of this notifi legal info
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
	protected NotifiLegalInfoWrapper wrap(NotifiLegalInfo notifiLegalInfo) {
		return new NotifiLegalInfoWrapper(notifiLegalInfo);
	}

}