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
 * This class is a wrapper for {@link CreativeCompanyDirectorInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformation
 * @generated
 */
public class CreativeCompanyDirectorInformationWrapper
	extends BaseModelWrapper<CreativeCompanyDirectorInformation>
	implements CreativeCompanyDirectorInformation,
			   ModelWrapper<CreativeCompanyDirectorInformation> {

	public CreativeCompanyDirectorInformationWrapper(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation) {

		super(creativeCompanyDirectorInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeComDirectorInfoId", getCreativeComDirectorInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("directorFullName", getDirectorFullName());
		attributes.put("directorTitle", getDirectorTitle());
		attributes.put("directorTrn", getDirectorTrn());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("faxNumber", getFaxNumber());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("socialMedia", getSocialMedia());
		attributes.put("profileName", getProfileName());
		attributes.put(
			"isOperatorDifferentFromOwner", getIsOperatorDifferentFromOwner());
		attributes.put("operatorFirstName", getOperatorFirstName());
		attributes.put("operatorMiddleName", getOperatorMiddleName());
		attributes.put("operatorLastName", getOperatorLastName());
		attributes.put("city", getCity());
		attributes.put("country", getCountry());
		attributes.put("sex", getSex());
		attributes.put("trn", getTrn());
		attributes.put("cell", getCell());
		attributes.put("email", getEmail());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeComDirectorInfoId = (Long)attributes.get(
			"creativeComDirectorInfoId");

		if (creativeComDirectorInfoId != null) {
			setCreativeComDirectorInfoId(creativeComDirectorInfoId);
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

		String directorFullName = (String)attributes.get("directorFullName");

		if (directorFullName != null) {
			setDirectorFullName(directorFullName);
		}

		String directorTitle = (String)attributes.get("directorTitle");

		if (directorTitle != null) {
			setDirectorTitle(directorTitle);
		}

		String directorTrn = (String)attributes.get("directorTrn");

		if (directorTrn != null) {
			setDirectorTrn(directorTrn);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String faxNumber = (String)attributes.get("faxNumber");

		if (faxNumber != null) {
			setFaxNumber(faxNumber);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String socialMedia = (String)attributes.get("socialMedia");

		if (socialMedia != null) {
			setSocialMedia(socialMedia);
		}

		String profileName = (String)attributes.get("profileName");

		if (profileName != null) {
			setProfileName(profileName);
		}

		String isOperatorDifferentFromOwner = (String)attributes.get(
			"isOperatorDifferentFromOwner");

		if (isOperatorDifferentFromOwner != null) {
			setIsOperatorDifferentFromOwner(isOperatorDifferentFromOwner);
		}

		String operatorFirstName = (String)attributes.get("operatorFirstName");

		if (operatorFirstName != null) {
			setOperatorFirstName(operatorFirstName);
		}

		String operatorMiddleName = (String)attributes.get(
			"operatorMiddleName");

		if (operatorMiddleName != null) {
			setOperatorMiddleName(operatorMiddleName);
		}

		String operatorLastName = (String)attributes.get("operatorLastName");

		if (operatorLastName != null) {
			setOperatorLastName(operatorLastName);
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

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
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
	public CreativeCompanyDirectorInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the cell of this creative company director information.
	 *
	 * @return the cell of this creative company director information
	 */
	@Override
	public String getCell() {
		return model.getCell();
	}

	/**
	 * Returns the city of this creative company director information.
	 *
	 * @return the city of this creative company director information
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this creative company director information.
	 *
	 * @return the company ID of this creative company director information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country of this creative company director information.
	 *
	 * @return the country of this creative company director information
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this creative company director information.
	 *
	 * @return the create date of this creative company director information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative company director information.
	 *
	 * @return the creative application ID of this creative company director information
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative com director info ID of this creative company director information.
	 *
	 * @return the creative com director info ID of this creative company director information
	 */
	@Override
	public long getCreativeComDirectorInfoId() {
		return model.getCreativeComDirectorInfoId();
	}

	/**
	 * Returns the director full name of this creative company director information.
	 *
	 * @return the director full name of this creative company director information
	 */
	@Override
	public String getDirectorFullName() {
		return model.getDirectorFullName();
	}

	/**
	 * Returns the director title of this creative company director information.
	 *
	 * @return the director title of this creative company director information
	 */
	@Override
	public String getDirectorTitle() {
		return model.getDirectorTitle();
	}

	/**
	 * Returns the director trn of this creative company director information.
	 *
	 * @return the director trn of this creative company director information
	 */
	@Override
	public String getDirectorTrn() {
		return model.getDirectorTrn();
	}

	/**
	 * Returns the email of this creative company director information.
	 *
	 * @return the email of this creative company director information
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the email address of this creative company director information.
	 *
	 * @return the email address of this creative company director information
	 */
	@Override
	public String getEmailAddress() {
		return model.getEmailAddress();
	}

	/**
	 * Returns the fax number of this creative company director information.
	 *
	 * @return the fax number of this creative company director information
	 */
	@Override
	public String getFaxNumber() {
		return model.getFaxNumber();
	}

	/**
	 * Returns the group ID of this creative company director information.
	 *
	 * @return the group ID of this creative company director information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is operator different from owner of this creative company director information.
	 *
	 * @return the is operator different from owner of this creative company director information
	 */
	@Override
	public String getIsOperatorDifferentFromOwner() {
		return model.getIsOperatorDifferentFromOwner();
	}

	/**
	 * Returns the modified date of this creative company director information.
	 *
	 * @return the modified date of this creative company director information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the operator first name of this creative company director information.
	 *
	 * @return the operator first name of this creative company director information
	 */
	@Override
	public String getOperatorFirstName() {
		return model.getOperatorFirstName();
	}

	/**
	 * Returns the operator last name of this creative company director information.
	 *
	 * @return the operator last name of this creative company director information
	 */
	@Override
	public String getOperatorLastName() {
		return model.getOperatorLastName();
	}

	/**
	 * Returns the operator middle name of this creative company director information.
	 *
	 * @return the operator middle name of this creative company director information
	 */
	@Override
	public String getOperatorMiddleName() {
		return model.getOperatorMiddleName();
	}

	/**
	 * Returns the primary key of this creative company director information.
	 *
	 * @return the primary key of this creative company director information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the profile name of this creative company director information.
	 *
	 * @return the profile name of this creative company director information
	 */
	@Override
	public String getProfileName() {
		return model.getProfileName();
	}

	/**
	 * Returns the sex of this creative company director information.
	 *
	 * @return the sex of this creative company director information
	 */
	@Override
	public String getSex() {
		return model.getSex();
	}

	/**
	 * Returns the social media of this creative company director information.
	 *
	 * @return the social media of this creative company director information
	 */
	@Override
	public String getSocialMedia() {
		return model.getSocialMedia();
	}

	/**
	 * Returns the telephone number of this creative company director information.
	 *
	 * @return the telephone number of this creative company director information
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the trn of this creative company director information.
	 *
	 * @return the trn of this creative company director information
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the user ID of this creative company director information.
	 *
	 * @return the user ID of this creative company director information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative company director information.
	 *
	 * @return the user name of this creative company director information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative company director information.
	 *
	 * @return the user uuid of this creative company director information
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
	 * Sets the cell of this creative company director information.
	 *
	 * @param cell the cell of this creative company director information
	 */
	@Override
	public void setCell(String cell) {
		model.setCell(cell);
	}

	/**
	 * Sets the city of this creative company director information.
	 *
	 * @param city the city of this creative company director information
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this creative company director information.
	 *
	 * @param companyId the company ID of this creative company director information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country of this creative company director information.
	 *
	 * @param country the country of this creative company director information
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this creative company director information.
	 *
	 * @param createDate the create date of this creative company director information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative company director information.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative company director information
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative com director info ID of this creative company director information.
	 *
	 * @param creativeComDirectorInfoId the creative com director info ID of this creative company director information
	 */
	@Override
	public void setCreativeComDirectorInfoId(long creativeComDirectorInfoId) {
		model.setCreativeComDirectorInfoId(creativeComDirectorInfoId);
	}

	/**
	 * Sets the director full name of this creative company director information.
	 *
	 * @param directorFullName the director full name of this creative company director information
	 */
	@Override
	public void setDirectorFullName(String directorFullName) {
		model.setDirectorFullName(directorFullName);
	}

	/**
	 * Sets the director title of this creative company director information.
	 *
	 * @param directorTitle the director title of this creative company director information
	 */
	@Override
	public void setDirectorTitle(String directorTitle) {
		model.setDirectorTitle(directorTitle);
	}

	/**
	 * Sets the director trn of this creative company director information.
	 *
	 * @param directorTrn the director trn of this creative company director information
	 */
	@Override
	public void setDirectorTrn(String directorTrn) {
		model.setDirectorTrn(directorTrn);
	}

	/**
	 * Sets the email of this creative company director information.
	 *
	 * @param email the email of this creative company director information
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the email address of this creative company director information.
	 *
	 * @param emailAddress the email address of this creative company director information
	 */
	@Override
	public void setEmailAddress(String emailAddress) {
		model.setEmailAddress(emailAddress);
	}

	/**
	 * Sets the fax number of this creative company director information.
	 *
	 * @param faxNumber the fax number of this creative company director information
	 */
	@Override
	public void setFaxNumber(String faxNumber) {
		model.setFaxNumber(faxNumber);
	}

	/**
	 * Sets the group ID of this creative company director information.
	 *
	 * @param groupId the group ID of this creative company director information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the is operator different from owner of this creative company director information.
	 *
	 * @param isOperatorDifferentFromOwner the is operator different from owner of this creative company director information
	 */
	@Override
	public void setIsOperatorDifferentFromOwner(
		String isOperatorDifferentFromOwner) {

		model.setIsOperatorDifferentFromOwner(isOperatorDifferentFromOwner);
	}

	/**
	 * Sets the modified date of this creative company director information.
	 *
	 * @param modifiedDate the modified date of this creative company director information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the operator first name of this creative company director information.
	 *
	 * @param operatorFirstName the operator first name of this creative company director information
	 */
	@Override
	public void setOperatorFirstName(String operatorFirstName) {
		model.setOperatorFirstName(operatorFirstName);
	}

	/**
	 * Sets the operator last name of this creative company director information.
	 *
	 * @param operatorLastName the operator last name of this creative company director information
	 */
	@Override
	public void setOperatorLastName(String operatorLastName) {
		model.setOperatorLastName(operatorLastName);
	}

	/**
	 * Sets the operator middle name of this creative company director information.
	 *
	 * @param operatorMiddleName the operator middle name of this creative company director information
	 */
	@Override
	public void setOperatorMiddleName(String operatorMiddleName) {
		model.setOperatorMiddleName(operatorMiddleName);
	}

	/**
	 * Sets the primary key of this creative company director information.
	 *
	 * @param primaryKey the primary key of this creative company director information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the profile name of this creative company director information.
	 *
	 * @param profileName the profile name of this creative company director information
	 */
	@Override
	public void setProfileName(String profileName) {
		model.setProfileName(profileName);
	}

	/**
	 * Sets the sex of this creative company director information.
	 *
	 * @param sex the sex of this creative company director information
	 */
	@Override
	public void setSex(String sex) {
		model.setSex(sex);
	}

	/**
	 * Sets the social media of this creative company director information.
	 *
	 * @param socialMedia the social media of this creative company director information
	 */
	@Override
	public void setSocialMedia(String socialMedia) {
		model.setSocialMedia(socialMedia);
	}

	/**
	 * Sets the telephone number of this creative company director information.
	 *
	 * @param telephoneNumber the telephone number of this creative company director information
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the trn of this creative company director information.
	 *
	 * @param trn the trn of this creative company director information
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the user ID of this creative company director information.
	 *
	 * @param userId the user ID of this creative company director information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative company director information.
	 *
	 * @param userName the user name of this creative company director information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative company director information.
	 *
	 * @param userUuid the user uuid of this creative company director information
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
	protected CreativeCompanyDirectorInformationWrapper wrap(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation) {

		return new CreativeCompanyDirectorInformationWrapper(
			creativeCompanyDirectorInformation);
	}

}