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
 * This class is a wrapper for {@link CompanySecretary}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanySecretary
 * @generated
 */
public class CompanySecretaryWrapper
	extends BaseModelWrapper<CompanySecretary>
	implements CompanySecretary, ModelWrapper<CompanySecretary> {

	public CompanySecretaryWrapper(CompanySecretary companySecretary) {
		super(companySecretary);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("companySecretaryId", getCompanySecretaryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("secretaryName", getSecretaryName());
		attributes.put("secretaryDate", getSecretaryDate());
		attributes.put("secretaryOccupation", getSecretaryOccupation());
		attributes.put("secretaryContactNum", getSecretaryContactNum());
		attributes.put("secretaryAddress", getSecretaryAddress());
		attributes.put("secretaryCounter", getSecretaryCounter());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long companySecretaryId = (Long)attributes.get("companySecretaryId");

		if (companySecretaryId != null) {
			setCompanySecretaryId(companySecretaryId);
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

		String secretaryName = (String)attributes.get("secretaryName");

		if (secretaryName != null) {
			setSecretaryName(secretaryName);
		}

		Date secretaryDate = (Date)attributes.get("secretaryDate");

		if (secretaryDate != null) {
			setSecretaryDate(secretaryDate);
		}

		String secretaryOccupation = (String)attributes.get(
			"secretaryOccupation");

		if (secretaryOccupation != null) {
			setSecretaryOccupation(secretaryOccupation);
		}

		String secretaryContactNum = (String)attributes.get(
			"secretaryContactNum");

		if (secretaryContactNum != null) {
			setSecretaryContactNum(secretaryContactNum);
		}

		String secretaryAddress = (String)attributes.get("secretaryAddress");

		if (secretaryAddress != null) {
			setSecretaryAddress(secretaryAddress);
		}

		String secretaryCounter = (String)attributes.get("secretaryCounter");

		if (secretaryCounter != null) {
			setSecretaryCounter(secretaryCounter);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public CompanySecretary cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this company secretary.
	 *
	 * @return the company ID of this company secretary
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company secretary ID of this company secretary.
	 *
	 * @return the company secretary ID of this company secretary
	 */
	@Override
	public long getCompanySecretaryId() {
		return model.getCompanySecretaryId();
	}

	/**
	 * Returns the create date of this company secretary.
	 *
	 * @return the create date of this company secretary
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this company secretary.
	 *
	 * @return the group ID of this company secretary
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this company secretary.
	 *
	 * @return the modified date of this company secretary
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this company secretary.
	 *
	 * @return the osi insolvency ID of this company secretary
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this company secretary.
	 *
	 * @return the primary key of this company secretary
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secretary address of this company secretary.
	 *
	 * @return the secretary address of this company secretary
	 */
	@Override
	public String getSecretaryAddress() {
		return model.getSecretaryAddress();
	}

	/**
	 * Returns the secretary contact num of this company secretary.
	 *
	 * @return the secretary contact num of this company secretary
	 */
	@Override
	public String getSecretaryContactNum() {
		return model.getSecretaryContactNum();
	}

	/**
	 * Returns the secretary counter of this company secretary.
	 *
	 * @return the secretary counter of this company secretary
	 */
	@Override
	public String getSecretaryCounter() {
		return model.getSecretaryCounter();
	}

	/**
	 * Returns the secretary date of this company secretary.
	 *
	 * @return the secretary date of this company secretary
	 */
	@Override
	public Date getSecretaryDate() {
		return model.getSecretaryDate();
	}

	/**
	 * Returns the secretary name of this company secretary.
	 *
	 * @return the secretary name of this company secretary
	 */
	@Override
	public String getSecretaryName() {
		return model.getSecretaryName();
	}

	/**
	 * Returns the secretary occupation of this company secretary.
	 *
	 * @return the secretary occupation of this company secretary
	 */
	@Override
	public String getSecretaryOccupation() {
		return model.getSecretaryOccupation();
	}

	/**
	 * Returns the user ID of this company secretary.
	 *
	 * @return the user ID of this company secretary
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this company secretary.
	 *
	 * @return the user name of this company secretary
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this company secretary.
	 *
	 * @return the user uuid of this company secretary
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
	 * Sets the company ID of this company secretary.
	 *
	 * @param companyId the company ID of this company secretary
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company secretary ID of this company secretary.
	 *
	 * @param companySecretaryId the company secretary ID of this company secretary
	 */
	@Override
	public void setCompanySecretaryId(long companySecretaryId) {
		model.setCompanySecretaryId(companySecretaryId);
	}

	/**
	 * Sets the create date of this company secretary.
	 *
	 * @param createDate the create date of this company secretary
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this company secretary.
	 *
	 * @param groupId the group ID of this company secretary
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this company secretary.
	 *
	 * @param modifiedDate the modified date of this company secretary
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this company secretary.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this company secretary
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this company secretary.
	 *
	 * @param primaryKey the primary key of this company secretary
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secretary address of this company secretary.
	 *
	 * @param secretaryAddress the secretary address of this company secretary
	 */
	@Override
	public void setSecretaryAddress(String secretaryAddress) {
		model.setSecretaryAddress(secretaryAddress);
	}

	/**
	 * Sets the secretary contact num of this company secretary.
	 *
	 * @param secretaryContactNum the secretary contact num of this company secretary
	 */
	@Override
	public void setSecretaryContactNum(String secretaryContactNum) {
		model.setSecretaryContactNum(secretaryContactNum);
	}

	/**
	 * Sets the secretary counter of this company secretary.
	 *
	 * @param secretaryCounter the secretary counter of this company secretary
	 */
	@Override
	public void setSecretaryCounter(String secretaryCounter) {
		model.setSecretaryCounter(secretaryCounter);
	}

	/**
	 * Sets the secretary date of this company secretary.
	 *
	 * @param secretaryDate the secretary date of this company secretary
	 */
	@Override
	public void setSecretaryDate(Date secretaryDate) {
		model.setSecretaryDate(secretaryDate);
	}

	/**
	 * Sets the secretary name of this company secretary.
	 *
	 * @param secretaryName the secretary name of this company secretary
	 */
	@Override
	public void setSecretaryName(String secretaryName) {
		model.setSecretaryName(secretaryName);
	}

	/**
	 * Sets the secretary occupation of this company secretary.
	 *
	 * @param secretaryOccupation the secretary occupation of this company secretary
	 */
	@Override
	public void setSecretaryOccupation(String secretaryOccupation) {
		model.setSecretaryOccupation(secretaryOccupation);
	}

	/**
	 * Sets the user ID of this company secretary.
	 *
	 * @param userId the user ID of this company secretary
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this company secretary.
	 *
	 * @param userName the user name of this company secretary
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this company secretary.
	 *
	 * @param userUuid the user uuid of this company secretary
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
	protected CompanySecretaryWrapper wrap(CompanySecretary companySecretary) {
		return new CompanySecretaryWrapper(companySecretary);
	}

}