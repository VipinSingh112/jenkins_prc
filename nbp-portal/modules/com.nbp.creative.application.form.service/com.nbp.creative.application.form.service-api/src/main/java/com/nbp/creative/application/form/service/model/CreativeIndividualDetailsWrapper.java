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
 * This class is a wrapper for {@link CreativeIndividualDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetails
 * @generated
 */
public class CreativeIndividualDetailsWrapper
	extends BaseModelWrapper<CreativeIndividualDetails>
	implements CreativeIndividualDetails,
			   ModelWrapper<CreativeIndividualDetails> {

	public CreativeIndividualDetailsWrapper(
		CreativeIndividualDetails creativeIndividualDetails) {

		super(creativeIndividualDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeIndividualDetailsId", getCreativeIndividualDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("sectorOfPractice", getSectorOfPractice());
		attributes.put("firstName", getFirstName());
		attributes.put("middleName", getMiddleName());
		attributes.put("lastName", getLastName());
		attributes.put("trn", getTrn());
		attributes.put("city", getCity());
		attributes.put("country", getCountry());
		attributes.put("sex", getSex());
		attributes.put("cell", getCell());
		attributes.put("email", getEmail());
		attributes.put("areYouStudent", getAreYouStudent());
		attributes.put("companyEmail", getCompanyEmail());
		attributes.put("companyWebsite", getCompanyWebsite());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeIndividualDetailsId = (Long)attributes.get(
			"creativeIndividualDetailsId");

		if (creativeIndividualDetailsId != null) {
			setCreativeIndividualDetailsId(creativeIndividualDetailsId);
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

		String sectorOfPractice = (String)attributes.get("sectorOfPractice");

		if (sectorOfPractice != null) {
			setSectorOfPractice(sectorOfPractice);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String cell = (String)attributes.get("cell");

		if (cell != null) {
			setCell(cell);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String areYouStudent = (String)attributes.get("areYouStudent");

		if (areYouStudent != null) {
			setAreYouStudent(areYouStudent);
		}

		String companyEmail = (String)attributes.get("companyEmail");

		if (companyEmail != null) {
			setCompanyEmail(companyEmail);
		}

		String companyWebsite = (String)attributes.get("companyWebsite");

		if (companyWebsite != null) {
			setCompanyWebsite(companyWebsite);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeIndividualDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the are you student of this creative individual details.
	 *
	 * @return the are you student of this creative individual details
	 */
	@Override
	public String getAreYouStudent() {
		return model.getAreYouStudent();
	}

	/**
	 * Returns the cell of this creative individual details.
	 *
	 * @return the cell of this creative individual details
	 */
	@Override
	public String getCell() {
		return model.getCell();
	}

	/**
	 * Returns the city of this creative individual details.
	 *
	 * @return the city of this creative individual details
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company email of this creative individual details.
	 *
	 * @return the company email of this creative individual details
	 */
	@Override
	public String getCompanyEmail() {
		return model.getCompanyEmail();
	}

	/**
	 * Returns the company ID of this creative individual details.
	 *
	 * @return the company ID of this creative individual details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company website of this creative individual details.
	 *
	 * @return the company website of this creative individual details
	 */
	@Override
	public String getCompanyWebsite() {
		return model.getCompanyWebsite();
	}

	/**
	 * Returns the country of this creative individual details.
	 *
	 * @return the country of this creative individual details
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this creative individual details.
	 *
	 * @return the create date of this creative individual details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative individual details.
	 *
	 * @return the creative application ID of this creative individual details
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative individual details ID of this creative individual details.
	 *
	 * @return the creative individual details ID of this creative individual details
	 */
	@Override
	public long getCreativeIndividualDetailsId() {
		return model.getCreativeIndividualDetailsId();
	}

	/**
	 * Returns the email of this creative individual details.
	 *
	 * @return the email of this creative individual details
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the first name of this creative individual details.
	 *
	 * @return the first name of this creative individual details
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this creative individual details.
	 *
	 * @return the group ID of this creative individual details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this creative individual details.
	 *
	 * @return the last name of this creative individual details
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the middle name of this creative individual details.
	 *
	 * @return the middle name of this creative individual details
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this creative individual details.
	 *
	 * @return the modified date of this creative individual details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this creative individual details.
	 *
	 * @return the primary key of this creative individual details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sector of practice of this creative individual details.
	 *
	 * @return the sector of practice of this creative individual details
	 */
	@Override
	public String getSectorOfPractice() {
		return model.getSectorOfPractice();
	}

	/**
	 * Returns the sex of this creative individual details.
	 *
	 * @return the sex of this creative individual details
	 */
	@Override
	public String getSex() {
		return model.getSex();
	}

	/**
	 * Returns the trn of this creative individual details.
	 *
	 * @return the trn of this creative individual details
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the user ID of this creative individual details.
	 *
	 * @return the user ID of this creative individual details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative individual details.
	 *
	 * @return the user name of this creative individual details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative individual details.
	 *
	 * @return the user uuid of this creative individual details
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
	 * Sets the are you student of this creative individual details.
	 *
	 * @param areYouStudent the are you student of this creative individual details
	 */
	@Override
	public void setAreYouStudent(String areYouStudent) {
		model.setAreYouStudent(areYouStudent);
	}

	/**
	 * Sets the cell of this creative individual details.
	 *
	 * @param cell the cell of this creative individual details
	 */
	@Override
	public void setCell(String cell) {
		model.setCell(cell);
	}

	/**
	 * Sets the city of this creative individual details.
	 *
	 * @param city the city of this creative individual details
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company email of this creative individual details.
	 *
	 * @param companyEmail the company email of this creative individual details
	 */
	@Override
	public void setCompanyEmail(String companyEmail) {
		model.setCompanyEmail(companyEmail);
	}

	/**
	 * Sets the company ID of this creative individual details.
	 *
	 * @param companyId the company ID of this creative individual details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company website of this creative individual details.
	 *
	 * @param companyWebsite the company website of this creative individual details
	 */
	@Override
	public void setCompanyWebsite(String companyWebsite) {
		model.setCompanyWebsite(companyWebsite);
	}

	/**
	 * Sets the country of this creative individual details.
	 *
	 * @param country the country of this creative individual details
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this creative individual details.
	 *
	 * @param createDate the create date of this creative individual details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative individual details.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative individual details
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative individual details ID of this creative individual details.
	 *
	 * @param creativeIndividualDetailsId the creative individual details ID of this creative individual details
	 */
	@Override
	public void setCreativeIndividualDetailsId(
		long creativeIndividualDetailsId) {

		model.setCreativeIndividualDetailsId(creativeIndividualDetailsId);
	}

	/**
	 * Sets the email of this creative individual details.
	 *
	 * @param email the email of this creative individual details
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the first name of this creative individual details.
	 *
	 * @param firstName the first name of this creative individual details
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this creative individual details.
	 *
	 * @param groupId the group ID of this creative individual details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this creative individual details.
	 *
	 * @param lastName the last name of this creative individual details
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the middle name of this creative individual details.
	 *
	 * @param middleName the middle name of this creative individual details
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this creative individual details.
	 *
	 * @param modifiedDate the modified date of this creative individual details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this creative individual details.
	 *
	 * @param primaryKey the primary key of this creative individual details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sector of practice of this creative individual details.
	 *
	 * @param sectorOfPractice the sector of practice of this creative individual details
	 */
	@Override
	public void setSectorOfPractice(String sectorOfPractice) {
		model.setSectorOfPractice(sectorOfPractice);
	}

	/**
	 * Sets the sex of this creative individual details.
	 *
	 * @param sex the sex of this creative individual details
	 */
	@Override
	public void setSex(String sex) {
		model.setSex(sex);
	}

	/**
	 * Sets the trn of this creative individual details.
	 *
	 * @param trn the trn of this creative individual details
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the user ID of this creative individual details.
	 *
	 * @param userId the user ID of this creative individual details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative individual details.
	 *
	 * @param userName the user name of this creative individual details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative individual details.
	 *
	 * @param userUuid the user uuid of this creative individual details
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
	protected CreativeIndividualDetailsWrapper wrap(
		CreativeIndividualDetails creativeIndividualDetails) {

		return new CreativeIndividualDetailsWrapper(creativeIndividualDetails);
	}

}