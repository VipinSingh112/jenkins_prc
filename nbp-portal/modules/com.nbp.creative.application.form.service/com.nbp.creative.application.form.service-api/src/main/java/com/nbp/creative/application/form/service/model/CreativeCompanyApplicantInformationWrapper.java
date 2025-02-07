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
 * This class is a wrapper for {@link CreativeCompanyApplicantInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformation
 * @generated
 */
public class CreativeCompanyApplicantInformationWrapper
	extends BaseModelWrapper<CreativeCompanyApplicantInformation>
	implements CreativeCompanyApplicantInformation,
			   ModelWrapper<CreativeCompanyApplicantInformation> {

	public CreativeCompanyApplicantInformationWrapper(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		super(creativeCompanyApplicantInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeCompanyApplicantInfoId",
			getCreativeCompanyApplicantInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("prefix", getPrefix());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("sex", getSex());
		attributes.put("trn", getTrn());
		attributes.put("countryOfResidence", getCountryOfResidence());
		attributes.put("nationality", getNationality());
		attributes.put("cell", getCell());
		attributes.put("email", getEmail());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeCompanyApplicantInfoId = (Long)attributes.get(
			"creativeCompanyApplicantInfoId");

		if (creativeCompanyApplicantInfoId != null) {
			setCreativeCompanyApplicantInfoId(creativeCompanyApplicantInfoId);
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

		String prefix = (String)attributes.get("prefix");

		if (prefix != null) {
			setPrefix(prefix);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}

		String countryOfResidence = (String)attributes.get(
			"countryOfResidence");

		if (countryOfResidence != null) {
			setCountryOfResidence(countryOfResidence);
		}

		String nationality = (String)attributes.get("nationality");

		if (nationality != null) {
			setNationality(nationality);
		}

		String cell = (String)attributes.get("cell");

		if (cell != null) {
			setCell(cell);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeCompanyApplicantInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cell of this creative company applicant information.
	 *
	 * @return the cell of this creative company applicant information
	 */
	@Override
	public String getCell() {
		return model.getCell();
	}

	/**
	 * Returns the company ID of this creative company applicant information.
	 *
	 * @return the company ID of this creative company applicant information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country of residence of this creative company applicant information.
	 *
	 * @return the country of residence of this creative company applicant information
	 */
	@Override
	public String getCountryOfResidence() {
		return model.getCountryOfResidence();
	}

	/**
	 * Returns the create date of this creative company applicant information.
	 *
	 * @return the create date of this creative company applicant information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative company applicant information.
	 *
	 * @return the creative application ID of this creative company applicant information
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative company applicant info ID of this creative company applicant information.
	 *
	 * @return the creative company applicant info ID of this creative company applicant information
	 */
	@Override
	public long getCreativeCompanyApplicantInfoId() {
		return model.getCreativeCompanyApplicantInfoId();
	}

	/**
	 * Returns the email of this creative company applicant information.
	 *
	 * @return the email of this creative company applicant information
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the first name of this creative company applicant information.
	 *
	 * @return the first name of this creative company applicant information
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this creative company applicant information.
	 *
	 * @return the group ID of this creative company applicant information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this creative company applicant information.
	 *
	 * @return the last name of this creative company applicant information
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the modified date of this creative company applicant information.
	 *
	 * @return the modified date of this creative company applicant information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nationality of this creative company applicant information.
	 *
	 * @return the nationality of this creative company applicant information
	 */
	@Override
	public String getNationality() {
		return model.getNationality();
	}

	/**
	 * Returns the prefix of this creative company applicant information.
	 *
	 * @return the prefix of this creative company applicant information
	 */
	@Override
	public String getPrefix() {
		return model.getPrefix();
	}

	/**
	 * Returns the primary key of this creative company applicant information.
	 *
	 * @return the primary key of this creative company applicant information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sex of this creative company applicant information.
	 *
	 * @return the sex of this creative company applicant information
	 */
	@Override
	public String getSex() {
		return model.getSex();
	}

	/**
	 * Returns the trn of this creative company applicant information.
	 *
	 * @return the trn of this creative company applicant information
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the user ID of this creative company applicant information.
	 *
	 * @return the user ID of this creative company applicant information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative company applicant information.
	 *
	 * @return the user name of this creative company applicant information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative company applicant information.
	 *
	 * @return the user uuid of this creative company applicant information
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
	 * Sets the cell of this creative company applicant information.
	 *
	 * @param cell the cell of this creative company applicant information
	 */
	@Override
	public void setCell(String cell) {
		model.setCell(cell);
	}

	/**
	 * Sets the company ID of this creative company applicant information.
	 *
	 * @param companyId the company ID of this creative company applicant information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country of residence of this creative company applicant information.
	 *
	 * @param countryOfResidence the country of residence of this creative company applicant information
	 */
	@Override
	public void setCountryOfResidence(String countryOfResidence) {
		model.setCountryOfResidence(countryOfResidence);
	}

	/**
	 * Sets the create date of this creative company applicant information.
	 *
	 * @param createDate the create date of this creative company applicant information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative company applicant information.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative company applicant information
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative company applicant info ID of this creative company applicant information.
	 *
	 * @param creativeCompanyApplicantInfoId the creative company applicant info ID of this creative company applicant information
	 */
	@Override
	public void setCreativeCompanyApplicantInfoId(
		long creativeCompanyApplicantInfoId) {

		model.setCreativeCompanyApplicantInfoId(creativeCompanyApplicantInfoId);
	}

	/**
	 * Sets the email of this creative company applicant information.
	 *
	 * @param email the email of this creative company applicant information
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the first name of this creative company applicant information.
	 *
	 * @param firstName the first name of this creative company applicant information
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this creative company applicant information.
	 *
	 * @param groupId the group ID of this creative company applicant information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this creative company applicant information.
	 *
	 * @param lastName the last name of this creative company applicant information
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the modified date of this creative company applicant information.
	 *
	 * @param modifiedDate the modified date of this creative company applicant information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nationality of this creative company applicant information.
	 *
	 * @param nationality the nationality of this creative company applicant information
	 */
	@Override
	public void setNationality(String nationality) {
		model.setNationality(nationality);
	}

	/**
	 * Sets the prefix of this creative company applicant information.
	 *
	 * @param prefix the prefix of this creative company applicant information
	 */
	@Override
	public void setPrefix(String prefix) {
		model.setPrefix(prefix);
	}

	/**
	 * Sets the primary key of this creative company applicant information.
	 *
	 * @param primaryKey the primary key of this creative company applicant information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sex of this creative company applicant information.
	 *
	 * @param sex the sex of this creative company applicant information
	 */
	@Override
	public void setSex(String sex) {
		model.setSex(sex);
	}

	/**
	 * Sets the trn of this creative company applicant information.
	 *
	 * @param trn the trn of this creative company applicant information
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the user ID of this creative company applicant information.
	 *
	 * @param userId the user ID of this creative company applicant information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative company applicant information.
	 *
	 * @param userName the user name of this creative company applicant information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative company applicant information.
	 *
	 * @param userUuid the user uuid of this creative company applicant information
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
	protected CreativeCompanyApplicantInformationWrapper wrap(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation) {

		return new CreativeCompanyApplicantInformationWrapper(
			creativeCompanyApplicantInformation);
	}

}