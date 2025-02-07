/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicApplicantDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicantDetails
 * @generated
 */
public class MiicApplicantDetailsWrapper
	extends BaseModelWrapper<MiicApplicantDetails>
	implements MiicApplicantDetails, ModelWrapper<MiicApplicantDetails> {

	public MiicApplicantDetailsWrapper(
		MiicApplicantDetails miicApplicantDetails) {

		super(miicApplicantDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("miicApplicantDetailsId", getMiicApplicantDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("natureOfApplicant", getNatureOfApplicant());
		attributes.put("applicantName ", getApplicantName());
		attributes.put("address", getAddress());
		attributes.put("email", getEmail());
		attributes.put("telephone", getTelephone());
		attributes.put("dateOfApplication", getDateOfApplication());
		attributes.put("trnNumber", getTrnNumber());
		attributes.put("miicApplicationId", getMiicApplicationId());
		attributes.put("nameOfProducer", getNameOfProducer());
		attributes.put("companyName", getCompanyName());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miicApplicantDetailsId = (Long)attributes.get(
			"miicApplicantDetailsId");

		if (miicApplicantDetailsId != null) {
			setMiicApplicantDetailsId(miicApplicantDetailsId);
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

		String natureOfApplicant = (String)attributes.get("natureOfApplicant");

		if (natureOfApplicant != null) {
			setNatureOfApplicant(natureOfApplicant);
		}

		String applicantName = (String)attributes.get("applicantName ");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		Date dateOfApplication = (Date)attributes.get("dateOfApplication");

		if (dateOfApplication != null) {
			setDateOfApplication(dateOfApplication);
		}

		String trnNumber = (String)attributes.get("trnNumber");

		if (trnNumber != null) {
			setTrnNumber(trnNumber);
		}

		Long miicApplicationId = (Long)attributes.get("miicApplicationId");

		if (miicApplicationId != null) {
			setMiicApplicationId(miicApplicationId);
		}

		String nameOfProducer = (String)attributes.get("nameOfProducer");

		if (nameOfProducer != null) {
			setNameOfProducer(nameOfProducer);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}
	}

	@Override
	public MiicApplicantDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this miic applicant details.
	 *
	 * @return the address of this miic applicant details
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the applicant name of this miic applicant details.
	 *
	 * @return the applicant name of this miic applicant details
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the company ID of this miic applicant details.
	 *
	 * @return the company ID of this miic applicant details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this miic applicant details.
	 *
	 * @return the company name of this miic applicant details
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the create date of this miic applicant details.
	 *
	 * @return the create date of this miic applicant details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of application of this miic applicant details.
	 *
	 * @return the date of application of this miic applicant details
	 */
	@Override
	public Date getDateOfApplication() {
		return model.getDateOfApplication();
	}

	/**
	 * Returns the email of this miic applicant details.
	 *
	 * @return the email of this miic applicant details
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the first name of this miic applicant details.
	 *
	 * @return the first name of this miic applicant details
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the group ID of this miic applicant details.
	 *
	 * @return the group ID of this miic applicant details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last name of this miic applicant details.
	 *
	 * @return the last name of this miic applicant details
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the miic applicant details ID of this miic applicant details.
	 *
	 * @return the miic applicant details ID of this miic applicant details
	 */
	@Override
	public long getMiicApplicantDetailsId() {
		return model.getMiicApplicantDetailsId();
	}

	/**
	 * Returns the miic application ID of this miic applicant details.
	 *
	 * @return the miic application ID of this miic applicant details
	 */
	@Override
	public long getMiicApplicationId() {
		return model.getMiicApplicationId();
	}

	/**
	 * Returns the modified date of this miic applicant details.
	 *
	 * @return the modified date of this miic applicant details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of producer of this miic applicant details.
	 *
	 * @return the name of producer of this miic applicant details
	 */
	@Override
	public String getNameOfProducer() {
		return model.getNameOfProducer();
	}

	/**
	 * Returns the nature of applicant of this miic applicant details.
	 *
	 * @return the nature of applicant of this miic applicant details
	 */
	@Override
	public String getNatureOfApplicant() {
		return model.getNatureOfApplicant();
	}

	/**
	 * Returns the primary key of this miic applicant details.
	 *
	 * @return the primary key of this miic applicant details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone of this miic applicant details.
	 *
	 * @return the telephone of this miic applicant details
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the trn number of this miic applicant details.
	 *
	 * @return the trn number of this miic applicant details
	 */
	@Override
	public String getTrnNumber() {
		return model.getTrnNumber();
	}

	/**
	 * Returns the user ID of this miic applicant details.
	 *
	 * @return the user ID of this miic applicant details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic applicant details.
	 *
	 * @return the user name of this miic applicant details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic applicant details.
	 *
	 * @return the user uuid of this miic applicant details
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
	 * Sets the address of this miic applicant details.
	 *
	 * @param address the address of this miic applicant details
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the applicant name of this miic applicant details.
	 *
	 * @param applicantName  the applicant name of this miic applicant details
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the company ID of this miic applicant details.
	 *
	 * @param companyId the company ID of this miic applicant details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this miic applicant details.
	 *
	 * @param companyName the company name of this miic applicant details
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the create date of this miic applicant details.
	 *
	 * @param createDate the create date of this miic applicant details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of application of this miic applicant details.
	 *
	 * @param dateOfApplication the date of application of this miic applicant details
	 */
	@Override
	public void setDateOfApplication(Date dateOfApplication) {
		model.setDateOfApplication(dateOfApplication);
	}

	/**
	 * Sets the email of this miic applicant details.
	 *
	 * @param email the email of this miic applicant details
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the first name of this miic applicant details.
	 *
	 * @param firstName the first name of this miic applicant details
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the group ID of this miic applicant details.
	 *
	 * @param groupId the group ID of this miic applicant details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this miic applicant details.
	 *
	 * @param lastName the last name of this miic applicant details
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the miic applicant details ID of this miic applicant details.
	 *
	 * @param miicApplicantDetailsId the miic applicant details ID of this miic applicant details
	 */
	@Override
	public void setMiicApplicantDetailsId(long miicApplicantDetailsId) {
		model.setMiicApplicantDetailsId(miicApplicantDetailsId);
	}

	/**
	 * Sets the miic application ID of this miic applicant details.
	 *
	 * @param miicApplicationId the miic application ID of this miic applicant details
	 */
	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		model.setMiicApplicationId(miicApplicationId);
	}

	/**
	 * Sets the modified date of this miic applicant details.
	 *
	 * @param modifiedDate the modified date of this miic applicant details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of producer of this miic applicant details.
	 *
	 * @param nameOfProducer the name of producer of this miic applicant details
	 */
	@Override
	public void setNameOfProducer(String nameOfProducer) {
		model.setNameOfProducer(nameOfProducer);
	}

	/**
	 * Sets the nature of applicant of this miic applicant details.
	 *
	 * @param natureOfApplicant the nature of applicant of this miic applicant details
	 */
	@Override
	public void setNatureOfApplicant(String natureOfApplicant) {
		model.setNatureOfApplicant(natureOfApplicant);
	}

	/**
	 * Sets the primary key of this miic applicant details.
	 *
	 * @param primaryKey the primary key of this miic applicant details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone of this miic applicant details.
	 *
	 * @param telephone the telephone of this miic applicant details
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the trn number of this miic applicant details.
	 *
	 * @param trnNumber the trn number of this miic applicant details
	 */
	@Override
	public void setTrnNumber(String trnNumber) {
		model.setTrnNumber(trnNumber);
	}

	/**
	 * Sets the user ID of this miic applicant details.
	 *
	 * @param userId the user ID of this miic applicant details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic applicant details.
	 *
	 * @param userName the user name of this miic applicant details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic applicant details.
	 *
	 * @param userUuid the user uuid of this miic applicant details
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
	protected MiicApplicantDetailsWrapper wrap(
		MiicApplicantDetails miicApplicantDetails) {

		return new MiicApplicantDetailsWrapper(miicApplicantDetails);
	}

}