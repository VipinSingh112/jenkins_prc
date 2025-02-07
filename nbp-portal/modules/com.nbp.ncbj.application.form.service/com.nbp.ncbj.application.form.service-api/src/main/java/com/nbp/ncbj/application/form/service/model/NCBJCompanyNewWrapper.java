/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NCBJCompanyNew}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NCBJCompanyNew
 * @generated
 */
public class NCBJCompanyNewWrapper
	extends BaseModelWrapper<NCBJCompanyNew>
	implements ModelWrapper<NCBJCompanyNew>, NCBJCompanyNew {

	public NCBJCompanyNewWrapper(NCBJCompanyNew ncbjCompanyNew) {
		super(ncbjCompanyNew);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nCBJCompanyNewId", getNCBJCompanyNewId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("companyAddress", getCompanyAddress());
		attributes.put("headOfCompany", getHeadOfCompany());
		attributes.put("jobTitleOne", getJobTitleOne());
		attributes.put("companyEmailOne", getCompanyEmailOne());
		attributes.put("companyNumOne", getCompanyNumOne());
		attributes.put("contactName", getContactName());
		attributes.put("jobTitleTwo", getJobTitleTwo());
		attributes.put("companyEmailTwo", getCompanyEmailTwo());
		attributes.put("companyNumTwo", getCompanyNumTwo());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nCBJCompanyNewId = (Long)attributes.get("nCBJCompanyNewId");

		if (nCBJCompanyNewId != null) {
			setNCBJCompanyNewId(nCBJCompanyNewId);
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

		String companyAddress = (String)attributes.get("companyAddress");

		if (companyAddress != null) {
			setCompanyAddress(companyAddress);
		}

		String headOfCompany = (String)attributes.get("headOfCompany");

		if (headOfCompany != null) {
			setHeadOfCompany(headOfCompany);
		}

		String jobTitleOne = (String)attributes.get("jobTitleOne");

		if (jobTitleOne != null) {
			setJobTitleOne(jobTitleOne);
		}

		String companyEmailOne = (String)attributes.get("companyEmailOne");

		if (companyEmailOne != null) {
			setCompanyEmailOne(companyEmailOne);
		}

		String companyNumOne = (String)attributes.get("companyNumOne");

		if (companyNumOne != null) {
			setCompanyNumOne(companyNumOne);
		}

		String contactName = (String)attributes.get("contactName");

		if (contactName != null) {
			setContactName(contactName);
		}

		String jobTitleTwo = (String)attributes.get("jobTitleTwo");

		if (jobTitleTwo != null) {
			setJobTitleTwo(jobTitleTwo);
		}

		String companyEmailTwo = (String)attributes.get("companyEmailTwo");

		if (companyEmailTwo != null) {
			setCompanyEmailTwo(companyEmailTwo);
		}

		String companyNumTwo = (String)attributes.get("companyNumTwo");

		if (companyNumTwo != null) {
			setCompanyNumTwo(companyNumTwo);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NCBJCompanyNew cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company address of this ncbj company new.
	 *
	 * @return the company address of this ncbj company new
	 */
	@Override
	public String getCompanyAddress() {
		return model.getCompanyAddress();
	}

	/**
	 * Returns the company email one of this ncbj company new.
	 *
	 * @return the company email one of this ncbj company new
	 */
	@Override
	public String getCompanyEmailOne() {
		return model.getCompanyEmailOne();
	}

	/**
	 * Returns the company email two of this ncbj company new.
	 *
	 * @return the company email two of this ncbj company new
	 */
	@Override
	public String getCompanyEmailTwo() {
		return model.getCompanyEmailTwo();
	}

	/**
	 * Returns the company ID of this ncbj company new.
	 *
	 * @return the company ID of this ncbj company new
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this ncbj company new.
	 *
	 * @return the company name of this ncbj company new
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the company num one of this ncbj company new.
	 *
	 * @return the company num one of this ncbj company new
	 */
	@Override
	public String getCompanyNumOne() {
		return model.getCompanyNumOne();
	}

	/**
	 * Returns the company num two of this ncbj company new.
	 *
	 * @return the company num two of this ncbj company new
	 */
	@Override
	public String getCompanyNumTwo() {
		return model.getCompanyNumTwo();
	}

	/**
	 * Returns the contact name of this ncbj company new.
	 *
	 * @return the contact name of this ncbj company new
	 */
	@Override
	public String getContactName() {
		return model.getContactName();
	}

	/**
	 * Returns the create date of this ncbj company new.
	 *
	 * @return the create date of this ncbj company new
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj company new.
	 *
	 * @return the group ID of this ncbj company new
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the head of company of this ncbj company new.
	 *
	 * @return the head of company of this ncbj company new
	 */
	@Override
	public String getHeadOfCompany() {
		return model.getHeadOfCompany();
	}

	/**
	 * Returns the job title one of this ncbj company new.
	 *
	 * @return the job title one of this ncbj company new
	 */
	@Override
	public String getJobTitleOne() {
		return model.getJobTitleOne();
	}

	/**
	 * Returns the job title two of this ncbj company new.
	 *
	 * @return the job title two of this ncbj company new
	 */
	@Override
	public String getJobTitleTwo() {
		return model.getJobTitleTwo();
	}

	/**
	 * Returns the modified date of this ncbj company new.
	 *
	 * @return the modified date of this ncbj company new
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj company new.
	 *
	 * @return the ncbj application ID of this ncbj company new
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the n cbj company new ID of this ncbj company new.
	 *
	 * @return the n cbj company new ID of this ncbj company new
	 */
	@Override
	public long getNCBJCompanyNewId() {
		return model.getNCBJCompanyNewId();
	}

	/**
	 * Returns the primary key of this ncbj company new.
	 *
	 * @return the primary key of this ncbj company new
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this ncbj company new.
	 *
	 * @return the user ID of this ncbj company new
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj company new.
	 *
	 * @return the user name of this ncbj company new
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj company new.
	 *
	 * @return the user uuid of this ncbj company new
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
	 * Sets the company address of this ncbj company new.
	 *
	 * @param companyAddress the company address of this ncbj company new
	 */
	@Override
	public void setCompanyAddress(String companyAddress) {
		model.setCompanyAddress(companyAddress);
	}

	/**
	 * Sets the company email one of this ncbj company new.
	 *
	 * @param companyEmailOne the company email one of this ncbj company new
	 */
	@Override
	public void setCompanyEmailOne(String companyEmailOne) {
		model.setCompanyEmailOne(companyEmailOne);
	}

	/**
	 * Sets the company email two of this ncbj company new.
	 *
	 * @param companyEmailTwo the company email two of this ncbj company new
	 */
	@Override
	public void setCompanyEmailTwo(String companyEmailTwo) {
		model.setCompanyEmailTwo(companyEmailTwo);
	}

	/**
	 * Sets the company ID of this ncbj company new.
	 *
	 * @param companyId the company ID of this ncbj company new
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this ncbj company new.
	 *
	 * @param companyName the company name of this ncbj company new
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the company num one of this ncbj company new.
	 *
	 * @param companyNumOne the company num one of this ncbj company new
	 */
	@Override
	public void setCompanyNumOne(String companyNumOne) {
		model.setCompanyNumOne(companyNumOne);
	}

	/**
	 * Sets the company num two of this ncbj company new.
	 *
	 * @param companyNumTwo the company num two of this ncbj company new
	 */
	@Override
	public void setCompanyNumTwo(String companyNumTwo) {
		model.setCompanyNumTwo(companyNumTwo);
	}

	/**
	 * Sets the contact name of this ncbj company new.
	 *
	 * @param contactName the contact name of this ncbj company new
	 */
	@Override
	public void setContactName(String contactName) {
		model.setContactName(contactName);
	}

	/**
	 * Sets the create date of this ncbj company new.
	 *
	 * @param createDate the create date of this ncbj company new
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj company new.
	 *
	 * @param groupId the group ID of this ncbj company new
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the head of company of this ncbj company new.
	 *
	 * @param headOfCompany the head of company of this ncbj company new
	 */
	@Override
	public void setHeadOfCompany(String headOfCompany) {
		model.setHeadOfCompany(headOfCompany);
	}

	/**
	 * Sets the job title one of this ncbj company new.
	 *
	 * @param jobTitleOne the job title one of this ncbj company new
	 */
	@Override
	public void setJobTitleOne(String jobTitleOne) {
		model.setJobTitleOne(jobTitleOne);
	}

	/**
	 * Sets the job title two of this ncbj company new.
	 *
	 * @param jobTitleTwo the job title two of this ncbj company new
	 */
	@Override
	public void setJobTitleTwo(String jobTitleTwo) {
		model.setJobTitleTwo(jobTitleTwo);
	}

	/**
	 * Sets the modified date of this ncbj company new.
	 *
	 * @param modifiedDate the modified date of this ncbj company new
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj company new.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj company new
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the n cbj company new ID of this ncbj company new.
	 *
	 * @param nCBJCompanyNewId the n cbj company new ID of this ncbj company new
	 */
	@Override
	public void setNCBJCompanyNewId(long nCBJCompanyNewId) {
		model.setNCBJCompanyNewId(nCBJCompanyNewId);
	}

	/**
	 * Sets the primary key of this ncbj company new.
	 *
	 * @param primaryKey the primary key of this ncbj company new
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this ncbj company new.
	 *
	 * @param userId the user ID of this ncbj company new
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj company new.
	 *
	 * @param userName the user name of this ncbj company new
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj company new.
	 *
	 * @param userUuid the user uuid of this ncbj company new
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
	protected NCBJCompanyNewWrapper wrap(NCBJCompanyNew ncbjCompanyNew) {
		return new NCBJCompanyNewWrapper(ncbjCompanyNew);
	}

}