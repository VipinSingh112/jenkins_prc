/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionBikeRentalInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionBikeRentalInfo
 * @generated
 */
public class AttractionBikeRentalInfoWrapper
	extends BaseModelWrapper<AttractionBikeRentalInfo>
	implements AttractionBikeRentalInfo,
			   ModelWrapper<AttractionBikeRentalInfo> {

	public AttractionBikeRentalInfoWrapper(
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		super(attractionBikeRentalInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionBikeRentalInfoId", getAttractionBikeRentalInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("address", getAddress());
		attributes.put("companyName", getCompanyName());
		attributes.put("exactLocation", getExactLocation());
		attributes.put("telephone", getTelephone());
		attributes.put("email", getEmail());
		attributes.put("registrationDate", getRegistrationDate());
		attributes.put("managerName", getManagerName());
		attributes.put("numberOfBikes", getNumberOfBikes());
		attributes.put("numberOfHelmets", getNumberOfHelmets());
		attributes.put("numberOfEmployees", getNumberOfEmployees());
		attributes.put("signatureDate", getSignatureDate());
		attributes.put("motorBikeIndustry", getMotorBikeIndustry());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionBikeRentalInfoId = (Long)attributes.get(
			"attractionBikeRentalInfoId");

		if (attractionBikeRentalInfoId != null) {
			setAttractionBikeRentalInfoId(attractionBikeRentalInfoId);
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

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String exactLocation = (String)attributes.get("exactLocation");

		if (exactLocation != null) {
			setExactLocation(exactLocation);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date registrationDate = (Date)attributes.get("registrationDate");

		if (registrationDate != null) {
			setRegistrationDate(registrationDate);
		}

		String managerName = (String)attributes.get("managerName");

		if (managerName != null) {
			setManagerName(managerName);
		}

		String numberOfBikes = (String)attributes.get("numberOfBikes");

		if (numberOfBikes != null) {
			setNumberOfBikes(numberOfBikes);
		}

		String numberOfHelmets = (String)attributes.get("numberOfHelmets");

		if (numberOfHelmets != null) {
			setNumberOfHelmets(numberOfHelmets);
		}

		String numberOfEmployees = (String)attributes.get("numberOfEmployees");

		if (numberOfEmployees != null) {
			setNumberOfEmployees(numberOfEmployees);
		}

		Date signatureDate = (Date)attributes.get("signatureDate");

		if (signatureDate != null) {
			setSignatureDate(signatureDate);
		}

		String motorBikeIndustry = (String)attributes.get("motorBikeIndustry");

		if (motorBikeIndustry != null) {
			setMotorBikeIndustry(motorBikeIndustry);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionBikeRentalInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this attraction bike rental info.
	 *
	 * @return the address of this attraction bike rental info
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the applicant name of this attraction bike rental info.
	 *
	 * @return the applicant name of this attraction bike rental info
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the attraction bike rental info ID of this attraction bike rental info.
	 *
	 * @return the attraction bike rental info ID of this attraction bike rental info
	 */
	@Override
	public long getAttractionBikeRentalInfoId() {
		return model.getAttractionBikeRentalInfoId();
	}

	/**
	 * Returns the company ID of this attraction bike rental info.
	 *
	 * @return the company ID of this attraction bike rental info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this attraction bike rental info.
	 *
	 * @return the company name of this attraction bike rental info
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the create date of this attraction bike rental info.
	 *
	 * @return the create date of this attraction bike rental info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this attraction bike rental info.
	 *
	 * @return the email of this attraction bike rental info
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the exact location of this attraction bike rental info.
	 *
	 * @return the exact location of this attraction bike rental info
	 */
	@Override
	public String getExactLocation() {
		return model.getExactLocation();
	}

	/**
	 * Returns the group ID of this attraction bike rental info.
	 *
	 * @return the group ID of this attraction bike rental info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction bike rental info.
	 *
	 * @return the jtb application ID of this attraction bike rental info
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the manager name of this attraction bike rental info.
	 *
	 * @return the manager name of this attraction bike rental info
	 */
	@Override
	public String getManagerName() {
		return model.getManagerName();
	}

	/**
	 * Returns the modified date of this attraction bike rental info.
	 *
	 * @return the modified date of this attraction bike rental info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the motor bike industry of this attraction bike rental info.
	 *
	 * @return the motor bike industry of this attraction bike rental info
	 */
	@Override
	public String getMotorBikeIndustry() {
		return model.getMotorBikeIndustry();
	}

	/**
	 * Returns the number of bikes of this attraction bike rental info.
	 *
	 * @return the number of bikes of this attraction bike rental info
	 */
	@Override
	public String getNumberOfBikes() {
		return model.getNumberOfBikes();
	}

	/**
	 * Returns the number of employees of this attraction bike rental info.
	 *
	 * @return the number of employees of this attraction bike rental info
	 */
	@Override
	public String getNumberOfEmployees() {
		return model.getNumberOfEmployees();
	}

	/**
	 * Returns the number of helmets of this attraction bike rental info.
	 *
	 * @return the number of helmets of this attraction bike rental info
	 */
	@Override
	public String getNumberOfHelmets() {
		return model.getNumberOfHelmets();
	}

	/**
	 * Returns the primary key of this attraction bike rental info.
	 *
	 * @return the primary key of this attraction bike rental info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registration date of this attraction bike rental info.
	 *
	 * @return the registration date of this attraction bike rental info
	 */
	@Override
	public Date getRegistrationDate() {
		return model.getRegistrationDate();
	}

	/**
	 * Returns the signature date of this attraction bike rental info.
	 *
	 * @return the signature date of this attraction bike rental info
	 */
	@Override
	public Date getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the telephone of this attraction bike rental info.
	 *
	 * @return the telephone of this attraction bike rental info
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the user ID of this attraction bike rental info.
	 *
	 * @return the user ID of this attraction bike rental info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction bike rental info.
	 *
	 * @return the user name of this attraction bike rental info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction bike rental info.
	 *
	 * @return the user uuid of this attraction bike rental info
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
	 * Sets the address of this attraction bike rental info.
	 *
	 * @param address the address of this attraction bike rental info
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the applicant name of this attraction bike rental info.
	 *
	 * @param applicantName the applicant name of this attraction bike rental info
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the attraction bike rental info ID of this attraction bike rental info.
	 *
	 * @param attractionBikeRentalInfoId the attraction bike rental info ID of this attraction bike rental info
	 */
	@Override
	public void setAttractionBikeRentalInfoId(long attractionBikeRentalInfoId) {
		model.setAttractionBikeRentalInfoId(attractionBikeRentalInfoId);
	}

	/**
	 * Sets the company ID of this attraction bike rental info.
	 *
	 * @param companyId the company ID of this attraction bike rental info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this attraction bike rental info.
	 *
	 * @param companyName the company name of this attraction bike rental info
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the create date of this attraction bike rental info.
	 *
	 * @param createDate the create date of this attraction bike rental info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this attraction bike rental info.
	 *
	 * @param email the email of this attraction bike rental info
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the exact location of this attraction bike rental info.
	 *
	 * @param exactLocation the exact location of this attraction bike rental info
	 */
	@Override
	public void setExactLocation(String exactLocation) {
		model.setExactLocation(exactLocation);
	}

	/**
	 * Sets the group ID of this attraction bike rental info.
	 *
	 * @param groupId the group ID of this attraction bike rental info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction bike rental info.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction bike rental info
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the manager name of this attraction bike rental info.
	 *
	 * @param managerName the manager name of this attraction bike rental info
	 */
	@Override
	public void setManagerName(String managerName) {
		model.setManagerName(managerName);
	}

	/**
	 * Sets the modified date of this attraction bike rental info.
	 *
	 * @param modifiedDate the modified date of this attraction bike rental info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the motor bike industry of this attraction bike rental info.
	 *
	 * @param motorBikeIndustry the motor bike industry of this attraction bike rental info
	 */
	@Override
	public void setMotorBikeIndustry(String motorBikeIndustry) {
		model.setMotorBikeIndustry(motorBikeIndustry);
	}

	/**
	 * Sets the number of bikes of this attraction bike rental info.
	 *
	 * @param numberOfBikes the number of bikes of this attraction bike rental info
	 */
	@Override
	public void setNumberOfBikes(String numberOfBikes) {
		model.setNumberOfBikes(numberOfBikes);
	}

	/**
	 * Sets the number of employees of this attraction bike rental info.
	 *
	 * @param numberOfEmployees the number of employees of this attraction bike rental info
	 */
	@Override
	public void setNumberOfEmployees(String numberOfEmployees) {
		model.setNumberOfEmployees(numberOfEmployees);
	}

	/**
	 * Sets the number of helmets of this attraction bike rental info.
	 *
	 * @param numberOfHelmets the number of helmets of this attraction bike rental info
	 */
	@Override
	public void setNumberOfHelmets(String numberOfHelmets) {
		model.setNumberOfHelmets(numberOfHelmets);
	}

	/**
	 * Sets the primary key of this attraction bike rental info.
	 *
	 * @param primaryKey the primary key of this attraction bike rental info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registration date of this attraction bike rental info.
	 *
	 * @param registrationDate the registration date of this attraction bike rental info
	 */
	@Override
	public void setRegistrationDate(Date registrationDate) {
		model.setRegistrationDate(registrationDate);
	}

	/**
	 * Sets the signature date of this attraction bike rental info.
	 *
	 * @param signatureDate the signature date of this attraction bike rental info
	 */
	@Override
	public void setSignatureDate(Date signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the telephone of this attraction bike rental info.
	 *
	 * @param telephone the telephone of this attraction bike rental info
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the user ID of this attraction bike rental info.
	 *
	 * @param userId the user ID of this attraction bike rental info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction bike rental info.
	 *
	 * @param userName the user name of this attraction bike rental info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction bike rental info.
	 *
	 * @param userUuid the user uuid of this attraction bike rental info
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
	protected AttractionBikeRentalInfoWrapper wrap(
		AttractionBikeRentalInfo attractionBikeRentalInfo) {

		return new AttractionBikeRentalInfoWrapper(attractionBikeRentalInfo);
	}

}