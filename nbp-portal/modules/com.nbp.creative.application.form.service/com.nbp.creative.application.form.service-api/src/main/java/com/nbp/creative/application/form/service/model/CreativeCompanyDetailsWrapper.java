/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeCompanyDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetails
 * @generated
 */
public class CreativeCompanyDetailsWrapper
	extends BaseModelWrapper<CreativeCompanyDetails>
	implements CreativeCompanyDetails, ModelWrapper<CreativeCompanyDetails> {

	public CreativeCompanyDetailsWrapper(
		CreativeCompanyDetails creativeCompanyDetails) {

		super(creativeCompanyDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeCompanyDetailsId", getCreativeCompanyDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put(
			"companyBusinessRegistrationNo",
			getCompanyBusinessRegistrationNo());
		attributes.put(
			"dateOfCompanyRegistration", getDateOfCompanyRegistration());
		attributes.put("companyTrn", getCompanyTrn());
		attributes.put("companyTcc", getCompanyTcc());
		attributes.put("companyProfile", getCompanyProfile());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeCompanyDetailsId = (Long)attributes.get(
			"creativeCompanyDetailsId");

		if (creativeCompanyDetailsId != null) {
			setCreativeCompanyDetailsId(creativeCompanyDetailsId);
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

		String companyBusinessRegistrationNo = (String)attributes.get(
			"companyBusinessRegistrationNo");

		if (companyBusinessRegistrationNo != null) {
			setCompanyBusinessRegistrationNo(companyBusinessRegistrationNo);
		}

		Date dateOfCompanyRegistration = (Date)attributes.get(
			"dateOfCompanyRegistration");

		if (dateOfCompanyRegistration != null) {
			setDateOfCompanyRegistration(dateOfCompanyRegistration);
		}

		String companyTrn = (String)attributes.get("companyTrn");

		if (companyTrn != null) {
			setCompanyTrn(companyTrn);
		}

		String companyTcc = (String)attributes.get("companyTcc");

		if (companyTcc != null) {
			setCompanyTcc(companyTcc);
		}

		String companyProfile = (String)attributes.get("companyProfile");

		if (companyProfile != null) {
			setCompanyProfile(companyProfile);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeCompanyDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company business registration no of this creative company details.
	 *
	 * @return the company business registration no of this creative company details
	 */
	@Override
	public String getCompanyBusinessRegistrationNo() {
		return model.getCompanyBusinessRegistrationNo();
	}

	/**
	 * Returns the company ID of this creative company details.
	 *
	 * @return the company ID of this creative company details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this creative company details.
	 *
	 * @return the company name of this creative company details
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the company profile of this creative company details.
	 *
	 * @return the company profile of this creative company details
	 */
	@Override
	public String getCompanyProfile() {
		return model.getCompanyProfile();
	}

	/**
	 * Returns the company tcc of this creative company details.
	 *
	 * @return the company tcc of this creative company details
	 */
	@Override
	public String getCompanyTcc() {
		return model.getCompanyTcc();
	}

	/**
	 * Returns the company trn of this creative company details.
	 *
	 * @return the company trn of this creative company details
	 */
	@Override
	public String getCompanyTrn() {
		return model.getCompanyTrn();
	}

	/**
	 * Returns the create date of this creative company details.
	 *
	 * @return the create date of this creative company details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative company details.
	 *
	 * @return the creative application ID of this creative company details
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative company details ID of this creative company details.
	 *
	 * @return the creative company details ID of this creative company details
	 */
	@Override
	public long getCreativeCompanyDetailsId() {
		return model.getCreativeCompanyDetailsId();
	}

	/**
	 * Returns the date of company registration of this creative company details.
	 *
	 * @return the date of company registration of this creative company details
	 */
	@Override
	public Date getDateOfCompanyRegistration() {
		return model.getDateOfCompanyRegistration();
	}

	/**
	 * Returns the group ID of this creative company details.
	 *
	 * @return the group ID of this creative company details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this creative company details.
	 *
	 * @return the modified date of this creative company details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative company details.
	 *
	 * @return the primary key of this creative company details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this creative company details.
	 *
	 * @return the user ID of this creative company details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative company details.
	 *
	 * @return the user name of this creative company details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative company details.
	 *
	 * @return the user uuid of this creative company details
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
	 * Sets the company business registration no of this creative company details.
	 *
	 * @param companyBusinessRegistrationNo the company business registration no of this creative company details
	 */
	@Override
	public void setCompanyBusinessRegistrationNo(
		String companyBusinessRegistrationNo) {

		model.setCompanyBusinessRegistrationNo(companyBusinessRegistrationNo);
	}

	/**
	 * Sets the company ID of this creative company details.
	 *
	 * @param companyId the company ID of this creative company details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this creative company details.
	 *
	 * @param companyName the company name of this creative company details
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the company profile of this creative company details.
	 *
	 * @param companyProfile the company profile of this creative company details
	 */
	@Override
	public void setCompanyProfile(String companyProfile) {
		model.setCompanyProfile(companyProfile);
	}

	/**
	 * Sets the company tcc of this creative company details.
	 *
	 * @param companyTcc the company tcc of this creative company details
	 */
	@Override
	public void setCompanyTcc(String companyTcc) {
		model.setCompanyTcc(companyTcc);
	}

	/**
	 * Sets the company trn of this creative company details.
	 *
	 * @param companyTrn the company trn of this creative company details
	 */
	@Override
	public void setCompanyTrn(String companyTrn) {
		model.setCompanyTrn(companyTrn);
	}

	/**
	 * Sets the create date of this creative company details.
	 *
	 * @param createDate the create date of this creative company details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative company details.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative company details
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative company details ID of this creative company details.
	 *
	 * @param creativeCompanyDetailsId the creative company details ID of this creative company details
	 */
	@Override
	public void setCreativeCompanyDetailsId(long creativeCompanyDetailsId) {
		model.setCreativeCompanyDetailsId(creativeCompanyDetailsId);
	}

	/**
	 * Sets the date of company registration of this creative company details.
	 *
	 * @param dateOfCompanyRegistration the date of company registration of this creative company details
	 */
	@Override
	public void setDateOfCompanyRegistration(Date dateOfCompanyRegistration) {
		model.setDateOfCompanyRegistration(dateOfCompanyRegistration);
	}

	/**
	 * Sets the group ID of this creative company details.
	 *
	 * @param groupId the group ID of this creative company details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this creative company details.
	 *
	 * @param modifiedDate the modified date of this creative company details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative company details.
	 *
	 * @param primaryKey the primary key of this creative company details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this creative company details.
	 *
	 * @param userId the user ID of this creative company details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative company details.
	 *
	 * @param userName the user name of this creative company details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative company details.
	 *
	 * @param userUuid the user uuid of this creative company details
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
	protected CreativeCompanyDetailsWrapper wrap(
		CreativeCompanyDetails creativeCompanyDetails) {

		return new CreativeCompanyDetailsWrapper(creativeCompanyDetails);
	}

}