/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilmCompanyDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmCompanyDetails
 * @generated
 */
public class FilmCompanyDetailsWrapper
	extends BaseModelWrapper<FilmCompanyDetails>
	implements FilmCompanyDetails, ModelWrapper<FilmCompanyDetails> {

	public FilmCompanyDetailsWrapper(FilmCompanyDetails filmCompanyDetails) {
		super(filmCompanyDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("filmCompanyDetailsId", getFilmCompanyDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("address", getAddress());
		attributes.put("countryOrigin", getCountryOrigin());
		attributes.put("telephoneNumber", getTelephoneNumber());
		attributes.put("mobile", getMobile());
		attributes.put("contactPerson", getContactPerson());
		attributes.put("email", getEmail());
		attributes.put("position", getPosition());
		attributes.put("filmApplicationId", getFilmApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long filmCompanyDetailsId = (Long)attributes.get(
			"filmCompanyDetailsId");

		if (filmCompanyDetailsId != null) {
			setFilmCompanyDetailsId(filmCompanyDetailsId);
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

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String countryOrigin = (String)attributes.get("countryOrigin");

		if (countryOrigin != null) {
			setCountryOrigin(countryOrigin);
		}

		String telephoneNumber = (String)attributes.get("telephoneNumber");

		if (telephoneNumber != null) {
			setTelephoneNumber(telephoneNumber);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String contactPerson = (String)attributes.get("contactPerson");

		if (contactPerson != null) {
			setContactPerson(contactPerson);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Long filmApplicationId = (Long)attributes.get("filmApplicationId");

		if (filmApplicationId != null) {
			setFilmApplicationId(filmApplicationId);
		}
	}

	@Override
	public FilmCompanyDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this film company details.
	 *
	 * @return the address of this film company details
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the company ID of this film company details.
	 *
	 * @return the company ID of this film company details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this film company details.
	 *
	 * @return the company name of this film company details
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the contact person of this film company details.
	 *
	 * @return the contact person of this film company details
	 */
	@Override
	public String getContactPerson() {
		return model.getContactPerson();
	}

	/**
	 * Returns the country origin of this film company details.
	 *
	 * @return the country origin of this film company details
	 */
	@Override
	public String getCountryOrigin() {
		return model.getCountryOrigin();
	}

	/**
	 * Returns the create date of this film company details.
	 *
	 * @return the create date of this film company details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this film company details.
	 *
	 * @return the email of this film company details
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the film application ID of this film company details.
	 *
	 * @return the film application ID of this film company details
	 */
	@Override
	public long getFilmApplicationId() {
		return model.getFilmApplicationId();
	}

	/**
	 * Returns the film company details ID of this film company details.
	 *
	 * @return the film company details ID of this film company details
	 */
	@Override
	public long getFilmCompanyDetailsId() {
		return model.getFilmCompanyDetailsId();
	}

	/**
	 * Returns the group ID of this film company details.
	 *
	 * @return the group ID of this film company details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mobile of this film company details.
	 *
	 * @return the mobile of this film company details
	 */
	@Override
	public String getMobile() {
		return model.getMobile();
	}

	/**
	 * Returns the modified date of this film company details.
	 *
	 * @return the modified date of this film company details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the position of this film company details.
	 *
	 * @return the position of this film company details
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this film company details.
	 *
	 * @return the primary key of this film company details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone number of this film company details.
	 *
	 * @return the telephone number of this film company details
	 */
	@Override
	public String getTelephoneNumber() {
		return model.getTelephoneNumber();
	}

	/**
	 * Returns the user ID of this film company details.
	 *
	 * @return the user ID of this film company details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film company details.
	 *
	 * @return the user name of this film company details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film company details.
	 *
	 * @return the user uuid of this film company details
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
	 * Sets the address of this film company details.
	 *
	 * @param address the address of this film company details
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the company ID of this film company details.
	 *
	 * @param companyId the company ID of this film company details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this film company details.
	 *
	 * @param companyName the company name of this film company details
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the contact person of this film company details.
	 *
	 * @param contactPerson the contact person of this film company details
	 */
	@Override
	public void setContactPerson(String contactPerson) {
		model.setContactPerson(contactPerson);
	}

	/**
	 * Sets the country origin of this film company details.
	 *
	 * @param countryOrigin the country origin of this film company details
	 */
	@Override
	public void setCountryOrigin(String countryOrigin) {
		model.setCountryOrigin(countryOrigin);
	}

	/**
	 * Sets the create date of this film company details.
	 *
	 * @param createDate the create date of this film company details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this film company details.
	 *
	 * @param email the email of this film company details
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the film application ID of this film company details.
	 *
	 * @param filmApplicationId the film application ID of this film company details
	 */
	@Override
	public void setFilmApplicationId(long filmApplicationId) {
		model.setFilmApplicationId(filmApplicationId);
	}

	/**
	 * Sets the film company details ID of this film company details.
	 *
	 * @param filmCompanyDetailsId the film company details ID of this film company details
	 */
	@Override
	public void setFilmCompanyDetailsId(long filmCompanyDetailsId) {
		model.setFilmCompanyDetailsId(filmCompanyDetailsId);
	}

	/**
	 * Sets the group ID of this film company details.
	 *
	 * @param groupId the group ID of this film company details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mobile of this film company details.
	 *
	 * @param mobile the mobile of this film company details
	 */
	@Override
	public void setMobile(String mobile) {
		model.setMobile(mobile);
	}

	/**
	 * Sets the modified date of this film company details.
	 *
	 * @param modifiedDate the modified date of this film company details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the position of this film company details.
	 *
	 * @param position the position of this film company details
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this film company details.
	 *
	 * @param primaryKey the primary key of this film company details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone number of this film company details.
	 *
	 * @param telephoneNumber the telephone number of this film company details
	 */
	@Override
	public void setTelephoneNumber(String telephoneNumber) {
		model.setTelephoneNumber(telephoneNumber);
	}

	/**
	 * Sets the user ID of this film company details.
	 *
	 * @param userId the user ID of this film company details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film company details.
	 *
	 * @param userName the user name of this film company details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film company details.
	 *
	 * @param userUuid the user uuid of this film company details
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
	protected FilmCompanyDetailsWrapper wrap(
		FilmCompanyDetails filmCompanyDetails) {

		return new FilmCompanyDetailsWrapper(filmCompanyDetails);
	}

}