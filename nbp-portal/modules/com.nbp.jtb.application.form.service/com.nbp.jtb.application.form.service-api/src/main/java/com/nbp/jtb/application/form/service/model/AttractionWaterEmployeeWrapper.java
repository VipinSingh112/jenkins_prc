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
 * This class is a wrapper for {@link AttractionWaterEmployee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterEmployee
 * @generated
 */
public class AttractionWaterEmployeeWrapper
	extends BaseModelWrapper<AttractionWaterEmployee>
	implements AttractionWaterEmployee, ModelWrapper<AttractionWaterEmployee> {

	public AttractionWaterEmployeeWrapper(
		AttractionWaterEmployee attractionWaterEmployee) {

		super(attractionWaterEmployee);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attractionWaterEmpLicId", getAttractionWaterEmpLicId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("applicantAge", getApplicantAge());
		attributes.put("applicantNationality", getApplicantNationality());
		attributes.put("workPermitApplied", getWorkPermitApplied());
		attributes.put("workPermitDate", getWorkPermitDate());
		attributes.put("qualification", getQualification());
		attributes.put("placeOfEmployment", getPlaceOfEmployment());
		attributes.put("ownerName", getOwnerName());
		attributes.put("cpr", getCpr());
		attributes.put("firstAid", getFirstAid());
		attributes.put("medicFirstAid", getMedicFirstAid());
		attributes.put("lifeguard", getLifeguard());
		attributes.put("rescueDiver", getRescueDiver());
		attributes.put("otherRescue", getOtherRescue());
		attributes.put("employeeSignatureDate", getEmployeeSignatureDate());
		attributes.put("timePeriod", getTimePeriod());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionWaterEmpLicId = (Long)attributes.get(
			"attractionWaterEmpLicId");

		if (attractionWaterEmpLicId != null) {
			setAttractionWaterEmpLicId(attractionWaterEmpLicId);
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

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String applicantAge = (String)attributes.get("applicantAge");

		if (applicantAge != null) {
			setApplicantAge(applicantAge);
		}

		String applicantNationality = (String)attributes.get(
			"applicantNationality");

		if (applicantNationality != null) {
			setApplicantNationality(applicantNationality);
		}

		String workPermitApplied = (String)attributes.get("workPermitApplied");

		if (workPermitApplied != null) {
			setWorkPermitApplied(workPermitApplied);
		}

		Date workPermitDate = (Date)attributes.get("workPermitDate");

		if (workPermitDate != null) {
			setWorkPermitDate(workPermitDate);
		}

		String qualification = (String)attributes.get("qualification");

		if (qualification != null) {
			setQualification(qualification);
		}

		String placeOfEmployment = (String)attributes.get("placeOfEmployment");

		if (placeOfEmployment != null) {
			setPlaceOfEmployment(placeOfEmployment);
		}

		String ownerName = (String)attributes.get("ownerName");

		if (ownerName != null) {
			setOwnerName(ownerName);
		}

		String cpr = (String)attributes.get("cpr");

		if (cpr != null) {
			setCpr(cpr);
		}

		String firstAid = (String)attributes.get("firstAid");

		if (firstAid != null) {
			setFirstAid(firstAid);
		}

		String medicFirstAid = (String)attributes.get("medicFirstAid");

		if (medicFirstAid != null) {
			setMedicFirstAid(medicFirstAid);
		}

		String lifeguard = (String)attributes.get("lifeguard");

		if (lifeguard != null) {
			setLifeguard(lifeguard);
		}

		String rescueDiver = (String)attributes.get("rescueDiver");

		if (rescueDiver != null) {
			setRescueDiver(rescueDiver);
		}

		String otherRescue = (String)attributes.get("otherRescue");

		if (otherRescue != null) {
			setOtherRescue(otherRescue);
		}

		Date employeeSignatureDate = (Date)attributes.get(
			"employeeSignatureDate");

		if (employeeSignatureDate != null) {
			setEmployeeSignatureDate(employeeSignatureDate);
		}

		String timePeriod = (String)attributes.get("timePeriod");

		if (timePeriod != null) {
			setTimePeriod(timePeriod);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionWaterEmployee cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the applicant address of this attraction water employee.
	 *
	 * @return the applicant address of this attraction water employee
	 */
	@Override
	public String getApplicantAddress() {
		return model.getApplicantAddress();
	}

	/**
	 * Returns the applicant age of this attraction water employee.
	 *
	 * @return the applicant age of this attraction water employee
	 */
	@Override
	public String getApplicantAge() {
		return model.getApplicantAge();
	}

	/**
	 * Returns the applicant name of this attraction water employee.
	 *
	 * @return the applicant name of this attraction water employee
	 */
	@Override
	public String getApplicantName() {
		return model.getApplicantName();
	}

	/**
	 * Returns the applicant nationality of this attraction water employee.
	 *
	 * @return the applicant nationality of this attraction water employee
	 */
	@Override
	public String getApplicantNationality() {
		return model.getApplicantNationality();
	}

	/**
	 * Returns the attraction water emp lic ID of this attraction water employee.
	 *
	 * @return the attraction water emp lic ID of this attraction water employee
	 */
	@Override
	public long getAttractionWaterEmpLicId() {
		return model.getAttractionWaterEmpLicId();
	}

	/**
	 * Returns the company ID of this attraction water employee.
	 *
	 * @return the company ID of this attraction water employee
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the cpr of this attraction water employee.
	 *
	 * @return the cpr of this attraction water employee
	 */
	@Override
	public String getCpr() {
		return model.getCpr();
	}

	/**
	 * Returns the create date of this attraction water employee.
	 *
	 * @return the create date of this attraction water employee
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the employee signature date of this attraction water employee.
	 *
	 * @return the employee signature date of this attraction water employee
	 */
	@Override
	public Date getEmployeeSignatureDate() {
		return model.getEmployeeSignatureDate();
	}

	/**
	 * Returns the first aid of this attraction water employee.
	 *
	 * @return the first aid of this attraction water employee
	 */
	@Override
	public String getFirstAid() {
		return model.getFirstAid();
	}

	/**
	 * Returns the group ID of this attraction water employee.
	 *
	 * @return the group ID of this attraction water employee
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction water employee.
	 *
	 * @return the jtb application ID of this attraction water employee
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the lifeguard of this attraction water employee.
	 *
	 * @return the lifeguard of this attraction water employee
	 */
	@Override
	public String getLifeguard() {
		return model.getLifeguard();
	}

	/**
	 * Returns the medic first aid of this attraction water employee.
	 *
	 * @return the medic first aid of this attraction water employee
	 */
	@Override
	public String getMedicFirstAid() {
		return model.getMedicFirstAid();
	}

	/**
	 * Returns the modified date of this attraction water employee.
	 *
	 * @return the modified date of this attraction water employee
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other rescue of this attraction water employee.
	 *
	 * @return the other rescue of this attraction water employee
	 */
	@Override
	public String getOtherRescue() {
		return model.getOtherRescue();
	}

	/**
	 * Returns the owner name of this attraction water employee.
	 *
	 * @return the owner name of this attraction water employee
	 */
	@Override
	public String getOwnerName() {
		return model.getOwnerName();
	}

	/**
	 * Returns the place of employment of this attraction water employee.
	 *
	 * @return the place of employment of this attraction water employee
	 */
	@Override
	public String getPlaceOfEmployment() {
		return model.getPlaceOfEmployment();
	}

	/**
	 * Returns the primary key of this attraction water employee.
	 *
	 * @return the primary key of this attraction water employee
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the qualification of this attraction water employee.
	 *
	 * @return the qualification of this attraction water employee
	 */
	@Override
	public String getQualification() {
		return model.getQualification();
	}

	/**
	 * Returns the rescue diver of this attraction water employee.
	 *
	 * @return the rescue diver of this attraction water employee
	 */
	@Override
	public String getRescueDiver() {
		return model.getRescueDiver();
	}

	/**
	 * Returns the time period of this attraction water employee.
	 *
	 * @return the time period of this attraction water employee
	 */
	@Override
	public String getTimePeriod() {
		return model.getTimePeriod();
	}

	/**
	 * Returns the user ID of this attraction water employee.
	 *
	 * @return the user ID of this attraction water employee
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction water employee.
	 *
	 * @return the user name of this attraction water employee
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction water employee.
	 *
	 * @return the user uuid of this attraction water employee
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the work permit applied of this attraction water employee.
	 *
	 * @return the work permit applied of this attraction water employee
	 */
	@Override
	public String getWorkPermitApplied() {
		return model.getWorkPermitApplied();
	}

	/**
	 * Returns the work permit date of this attraction water employee.
	 *
	 * @return the work permit date of this attraction water employee
	 */
	@Override
	public Date getWorkPermitDate() {
		return model.getWorkPermitDate();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the applicant address of this attraction water employee.
	 *
	 * @param applicantAddress the applicant address of this attraction water employee
	 */
	@Override
	public void setApplicantAddress(String applicantAddress) {
		model.setApplicantAddress(applicantAddress);
	}

	/**
	 * Sets the applicant age of this attraction water employee.
	 *
	 * @param applicantAge the applicant age of this attraction water employee
	 */
	@Override
	public void setApplicantAge(String applicantAge) {
		model.setApplicantAge(applicantAge);
	}

	/**
	 * Sets the applicant name of this attraction water employee.
	 *
	 * @param applicantName the applicant name of this attraction water employee
	 */
	@Override
	public void setApplicantName(String applicantName) {
		model.setApplicantName(applicantName);
	}

	/**
	 * Sets the applicant nationality of this attraction water employee.
	 *
	 * @param applicantNationality the applicant nationality of this attraction water employee
	 */
	@Override
	public void setApplicantNationality(String applicantNationality) {
		model.setApplicantNationality(applicantNationality);
	}

	/**
	 * Sets the attraction water emp lic ID of this attraction water employee.
	 *
	 * @param attractionWaterEmpLicId the attraction water emp lic ID of this attraction water employee
	 */
	@Override
	public void setAttractionWaterEmpLicId(long attractionWaterEmpLicId) {
		model.setAttractionWaterEmpLicId(attractionWaterEmpLicId);
	}

	/**
	 * Sets the company ID of this attraction water employee.
	 *
	 * @param companyId the company ID of this attraction water employee
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the cpr of this attraction water employee.
	 *
	 * @param cpr the cpr of this attraction water employee
	 */
	@Override
	public void setCpr(String cpr) {
		model.setCpr(cpr);
	}

	/**
	 * Sets the create date of this attraction water employee.
	 *
	 * @param createDate the create date of this attraction water employee
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the employee signature date of this attraction water employee.
	 *
	 * @param employeeSignatureDate the employee signature date of this attraction water employee
	 */
	@Override
	public void setEmployeeSignatureDate(Date employeeSignatureDate) {
		model.setEmployeeSignatureDate(employeeSignatureDate);
	}

	/**
	 * Sets the first aid of this attraction water employee.
	 *
	 * @param firstAid the first aid of this attraction water employee
	 */
	@Override
	public void setFirstAid(String firstAid) {
		model.setFirstAid(firstAid);
	}

	/**
	 * Sets the group ID of this attraction water employee.
	 *
	 * @param groupId the group ID of this attraction water employee
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction water employee.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction water employee
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the lifeguard of this attraction water employee.
	 *
	 * @param lifeguard the lifeguard of this attraction water employee
	 */
	@Override
	public void setLifeguard(String lifeguard) {
		model.setLifeguard(lifeguard);
	}

	/**
	 * Sets the medic first aid of this attraction water employee.
	 *
	 * @param medicFirstAid the medic first aid of this attraction water employee
	 */
	@Override
	public void setMedicFirstAid(String medicFirstAid) {
		model.setMedicFirstAid(medicFirstAid);
	}

	/**
	 * Sets the modified date of this attraction water employee.
	 *
	 * @param modifiedDate the modified date of this attraction water employee
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other rescue of this attraction water employee.
	 *
	 * @param otherRescue the other rescue of this attraction water employee
	 */
	@Override
	public void setOtherRescue(String otherRescue) {
		model.setOtherRescue(otherRescue);
	}

	/**
	 * Sets the owner name of this attraction water employee.
	 *
	 * @param ownerName the owner name of this attraction water employee
	 */
	@Override
	public void setOwnerName(String ownerName) {
		model.setOwnerName(ownerName);
	}

	/**
	 * Sets the place of employment of this attraction water employee.
	 *
	 * @param placeOfEmployment the place of employment of this attraction water employee
	 */
	@Override
	public void setPlaceOfEmployment(String placeOfEmployment) {
		model.setPlaceOfEmployment(placeOfEmployment);
	}

	/**
	 * Sets the primary key of this attraction water employee.
	 *
	 * @param primaryKey the primary key of this attraction water employee
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the qualification of this attraction water employee.
	 *
	 * @param qualification the qualification of this attraction water employee
	 */
	@Override
	public void setQualification(String qualification) {
		model.setQualification(qualification);
	}

	/**
	 * Sets the rescue diver of this attraction water employee.
	 *
	 * @param rescueDiver the rescue diver of this attraction water employee
	 */
	@Override
	public void setRescueDiver(String rescueDiver) {
		model.setRescueDiver(rescueDiver);
	}

	/**
	 * Sets the time period of this attraction water employee.
	 *
	 * @param timePeriod the time period of this attraction water employee
	 */
	@Override
	public void setTimePeriod(String timePeriod) {
		model.setTimePeriod(timePeriod);
	}

	/**
	 * Sets the user ID of this attraction water employee.
	 *
	 * @param userId the user ID of this attraction water employee
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction water employee.
	 *
	 * @param userName the user name of this attraction water employee
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction water employee.
	 *
	 * @param userUuid the user uuid of this attraction water employee
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the work permit applied of this attraction water employee.
	 *
	 * @param workPermitApplied the work permit applied of this attraction water employee
	 */
	@Override
	public void setWorkPermitApplied(String workPermitApplied) {
		model.setWorkPermitApplied(workPermitApplied);
	}

	/**
	 * Sets the work permit date of this attraction water employee.
	 *
	 * @param workPermitDate the work permit date of this attraction water employee
	 */
	@Override
	public void setWorkPermitDate(Date workPermitDate) {
		model.setWorkPermitDate(workPermitDate);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AttractionWaterEmployeeWrapper wrap(
		AttractionWaterEmployee attractionWaterEmployee) {

		return new AttractionWaterEmployeeWrapper(attractionWaterEmployee);
	}

}