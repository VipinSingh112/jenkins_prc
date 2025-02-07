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
 * This class is a wrapper for {@link AssessmentIndividualPersonalDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetails
 * @generated
 */
public class AssessmentIndividualPersonalDetailsWrapper
	extends BaseModelWrapper<AssessmentIndividualPersonalDetails>
	implements AssessmentIndividualPersonalDetails,
			   ModelWrapper<AssessmentIndividualPersonalDetails> {

	public AssessmentIndividualPersonalDetailsWrapper(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		super(assessmentIndividualPersonalDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assessmentDetailsId", getAssessmentDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("initialDateContact", getInitialDateContact());
		attributes.put("personalName", getPersonalName());
		attributes.put("personalAddress", getPersonalAddress());
		attributes.put("personalEmail", getPersonalEmail());
		attributes.put("personalTelNum", getPersonalTelNum());
		attributes.put("personalTrn", getPersonalTrn());
		attributes.put("personalNis", getPersonalNis());
		attributes.put("personalDob", getPersonalDob());
		attributes.put("personalAge", getPersonalAge());
		attributes.put("personalMaritalStatus", getPersonalMaritalStatus());
		attributes.put("personalDependents", getPersonalDependents());
		attributes.put("personalOccupation", getPersonalOccupation());
		attributes.put("emergencyName", getEmergencyName());
		attributes.put("emergencyEmail", getEmergencyEmail());
		attributes.put("emergencyTelNum", getEmergencyTelNum());
		attributes.put("emergencyAddress", getEmergencyAddress());
		attributes.put("emergencyEmployer", getEmergencyEmployer());
		attributes.put("employerAddress", getEmployerAddress());
		attributes.put("employerEmail", getEmployerEmail());
		attributes.put("employerTelNum", getEmployerTelNum());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assessmentDetailsId = (Long)attributes.get("assessmentDetailsId");

		if (assessmentDetailsId != null) {
			setAssessmentDetailsId(assessmentDetailsId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date initialDateContact = (Date)attributes.get("initialDateContact");

		if (initialDateContact != null) {
			setInitialDateContact(initialDateContact);
		}

		String personalName = (String)attributes.get("personalName");

		if (personalName != null) {
			setPersonalName(personalName);
		}

		String personalAddress = (String)attributes.get("personalAddress");

		if (personalAddress != null) {
			setPersonalAddress(personalAddress);
		}

		String personalEmail = (String)attributes.get("personalEmail");

		if (personalEmail != null) {
			setPersonalEmail(personalEmail);
		}

		String personalTelNum = (String)attributes.get("personalTelNum");

		if (personalTelNum != null) {
			setPersonalTelNum(personalTelNum);
		}

		String personalTrn = (String)attributes.get("personalTrn");

		if (personalTrn != null) {
			setPersonalTrn(personalTrn);
		}

		String personalNis = (String)attributes.get("personalNis");

		if (personalNis != null) {
			setPersonalNis(personalNis);
		}

		Date personalDob = (Date)attributes.get("personalDob");

		if (personalDob != null) {
			setPersonalDob(personalDob);
		}

		String personalAge = (String)attributes.get("personalAge");

		if (personalAge != null) {
			setPersonalAge(personalAge);
		}

		String personalMaritalStatus = (String)attributes.get(
			"personalMaritalStatus");

		if (personalMaritalStatus != null) {
			setPersonalMaritalStatus(personalMaritalStatus);
		}

		String personalDependents = (String)attributes.get(
			"personalDependents");

		if (personalDependents != null) {
			setPersonalDependents(personalDependents);
		}

		String personalOccupation = (String)attributes.get(
			"personalOccupation");

		if (personalOccupation != null) {
			setPersonalOccupation(personalOccupation);
		}

		String emergencyName = (String)attributes.get("emergencyName");

		if (emergencyName != null) {
			setEmergencyName(emergencyName);
		}

		String emergencyEmail = (String)attributes.get("emergencyEmail");

		if (emergencyEmail != null) {
			setEmergencyEmail(emergencyEmail);
		}

		String emergencyTelNum = (String)attributes.get("emergencyTelNum");

		if (emergencyTelNum != null) {
			setEmergencyTelNum(emergencyTelNum);
		}

		String emergencyAddress = (String)attributes.get("emergencyAddress");

		if (emergencyAddress != null) {
			setEmergencyAddress(emergencyAddress);
		}

		String emergencyEmployer = (String)attributes.get("emergencyEmployer");

		if (emergencyEmployer != null) {
			setEmergencyEmployer(emergencyEmployer);
		}

		String employerAddress = (String)attributes.get("employerAddress");

		if (employerAddress != null) {
			setEmployerAddress(employerAddress);
		}

		String employerEmail = (String)attributes.get("employerEmail");

		if (employerEmail != null) {
			setEmployerEmail(employerEmail);
		}

		String employerTelNum = (String)attributes.get("employerTelNum");

		if (employerTelNum != null) {
			setEmployerTelNum(employerTelNum);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public AssessmentIndividualPersonalDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the assessment details ID of this assessment individual personal details.
	 *
	 * @return the assessment details ID of this assessment individual personal details
	 */
	@Override
	public long getAssessmentDetailsId() {
		return model.getAssessmentDetailsId();
	}

	/**
	 * Returns the emergency address of this assessment individual personal details.
	 *
	 * @return the emergency address of this assessment individual personal details
	 */
	@Override
	public String getEmergencyAddress() {
		return model.getEmergencyAddress();
	}

	/**
	 * Returns the emergency email of this assessment individual personal details.
	 *
	 * @return the emergency email of this assessment individual personal details
	 */
	@Override
	public String getEmergencyEmail() {
		return model.getEmergencyEmail();
	}

	/**
	 * Returns the emergency employer of this assessment individual personal details.
	 *
	 * @return the emergency employer of this assessment individual personal details
	 */
	@Override
	public String getEmergencyEmployer() {
		return model.getEmergencyEmployer();
	}

	/**
	 * Returns the emergency name of this assessment individual personal details.
	 *
	 * @return the emergency name of this assessment individual personal details
	 */
	@Override
	public String getEmergencyName() {
		return model.getEmergencyName();
	}

	/**
	 * Returns the emergency tel num of this assessment individual personal details.
	 *
	 * @return the emergency tel num of this assessment individual personal details
	 */
	@Override
	public String getEmergencyTelNum() {
		return model.getEmergencyTelNum();
	}

	/**
	 * Returns the employer address of this assessment individual personal details.
	 *
	 * @return the employer address of this assessment individual personal details
	 */
	@Override
	public String getEmployerAddress() {
		return model.getEmployerAddress();
	}

	/**
	 * Returns the employer email of this assessment individual personal details.
	 *
	 * @return the employer email of this assessment individual personal details
	 */
	@Override
	public String getEmployerEmail() {
		return model.getEmployerEmail();
	}

	/**
	 * Returns the employer tel num of this assessment individual personal details.
	 *
	 * @return the employer tel num of this assessment individual personal details
	 */
	@Override
	public String getEmployerTelNum() {
		return model.getEmployerTelNum();
	}

	/**
	 * Returns the group ID of this assessment individual personal details.
	 *
	 * @return the group ID of this assessment individual personal details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the initial date contact of this assessment individual personal details.
	 *
	 * @return the initial date contact of this assessment individual personal details
	 */
	@Override
	public Date getInitialDateContact() {
		return model.getInitialDateContact();
	}

	/**
	 * Returns the osi insolvency ID of this assessment individual personal details.
	 *
	 * @return the osi insolvency ID of this assessment individual personal details
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the personal address of this assessment individual personal details.
	 *
	 * @return the personal address of this assessment individual personal details
	 */
	@Override
	public String getPersonalAddress() {
		return model.getPersonalAddress();
	}

	/**
	 * Returns the personal age of this assessment individual personal details.
	 *
	 * @return the personal age of this assessment individual personal details
	 */
	@Override
	public String getPersonalAge() {
		return model.getPersonalAge();
	}

	/**
	 * Returns the personal dependents of this assessment individual personal details.
	 *
	 * @return the personal dependents of this assessment individual personal details
	 */
	@Override
	public String getPersonalDependents() {
		return model.getPersonalDependents();
	}

	/**
	 * Returns the personal dob of this assessment individual personal details.
	 *
	 * @return the personal dob of this assessment individual personal details
	 */
	@Override
	public Date getPersonalDob() {
		return model.getPersonalDob();
	}

	/**
	 * Returns the personal email of this assessment individual personal details.
	 *
	 * @return the personal email of this assessment individual personal details
	 */
	@Override
	public String getPersonalEmail() {
		return model.getPersonalEmail();
	}

	/**
	 * Returns the personal marital status of this assessment individual personal details.
	 *
	 * @return the personal marital status of this assessment individual personal details
	 */
	@Override
	public String getPersonalMaritalStatus() {
		return model.getPersonalMaritalStatus();
	}

	/**
	 * Returns the personal name of this assessment individual personal details.
	 *
	 * @return the personal name of this assessment individual personal details
	 */
	@Override
	public String getPersonalName() {
		return model.getPersonalName();
	}

	/**
	 * Returns the personal nis of this assessment individual personal details.
	 *
	 * @return the personal nis of this assessment individual personal details
	 */
	@Override
	public String getPersonalNis() {
		return model.getPersonalNis();
	}

	/**
	 * Returns the personal occupation of this assessment individual personal details.
	 *
	 * @return the personal occupation of this assessment individual personal details
	 */
	@Override
	public String getPersonalOccupation() {
		return model.getPersonalOccupation();
	}

	/**
	 * Returns the personal tel num of this assessment individual personal details.
	 *
	 * @return the personal tel num of this assessment individual personal details
	 */
	@Override
	public String getPersonalTelNum() {
		return model.getPersonalTelNum();
	}

	/**
	 * Returns the personal trn of this assessment individual personal details.
	 *
	 * @return the personal trn of this assessment individual personal details
	 */
	@Override
	public String getPersonalTrn() {
		return model.getPersonalTrn();
	}

	/**
	 * Returns the primary key of this assessment individual personal details.
	 *
	 * @return the primary key of this assessment individual personal details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the assessment details ID of this assessment individual personal details.
	 *
	 * @param assessmentDetailsId the assessment details ID of this assessment individual personal details
	 */
	@Override
	public void setAssessmentDetailsId(long assessmentDetailsId) {
		model.setAssessmentDetailsId(assessmentDetailsId);
	}

	/**
	 * Sets the emergency address of this assessment individual personal details.
	 *
	 * @param emergencyAddress the emergency address of this assessment individual personal details
	 */
	@Override
	public void setEmergencyAddress(String emergencyAddress) {
		model.setEmergencyAddress(emergencyAddress);
	}

	/**
	 * Sets the emergency email of this assessment individual personal details.
	 *
	 * @param emergencyEmail the emergency email of this assessment individual personal details
	 */
	@Override
	public void setEmergencyEmail(String emergencyEmail) {
		model.setEmergencyEmail(emergencyEmail);
	}

	/**
	 * Sets the emergency employer of this assessment individual personal details.
	 *
	 * @param emergencyEmployer the emergency employer of this assessment individual personal details
	 */
	@Override
	public void setEmergencyEmployer(String emergencyEmployer) {
		model.setEmergencyEmployer(emergencyEmployer);
	}

	/**
	 * Sets the emergency name of this assessment individual personal details.
	 *
	 * @param emergencyName the emergency name of this assessment individual personal details
	 */
	@Override
	public void setEmergencyName(String emergencyName) {
		model.setEmergencyName(emergencyName);
	}

	/**
	 * Sets the emergency tel num of this assessment individual personal details.
	 *
	 * @param emergencyTelNum the emergency tel num of this assessment individual personal details
	 */
	@Override
	public void setEmergencyTelNum(String emergencyTelNum) {
		model.setEmergencyTelNum(emergencyTelNum);
	}

	/**
	 * Sets the employer address of this assessment individual personal details.
	 *
	 * @param employerAddress the employer address of this assessment individual personal details
	 */
	@Override
	public void setEmployerAddress(String employerAddress) {
		model.setEmployerAddress(employerAddress);
	}

	/**
	 * Sets the employer email of this assessment individual personal details.
	 *
	 * @param employerEmail the employer email of this assessment individual personal details
	 */
	@Override
	public void setEmployerEmail(String employerEmail) {
		model.setEmployerEmail(employerEmail);
	}

	/**
	 * Sets the employer tel num of this assessment individual personal details.
	 *
	 * @param employerTelNum the employer tel num of this assessment individual personal details
	 */
	@Override
	public void setEmployerTelNum(String employerTelNum) {
		model.setEmployerTelNum(employerTelNum);
	}

	/**
	 * Sets the group ID of this assessment individual personal details.
	 *
	 * @param groupId the group ID of this assessment individual personal details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the initial date contact of this assessment individual personal details.
	 *
	 * @param initialDateContact the initial date contact of this assessment individual personal details
	 */
	@Override
	public void setInitialDateContact(Date initialDateContact) {
		model.setInitialDateContact(initialDateContact);
	}

	/**
	 * Sets the osi insolvency ID of this assessment individual personal details.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this assessment individual personal details
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the personal address of this assessment individual personal details.
	 *
	 * @param personalAddress the personal address of this assessment individual personal details
	 */
	@Override
	public void setPersonalAddress(String personalAddress) {
		model.setPersonalAddress(personalAddress);
	}

	/**
	 * Sets the personal age of this assessment individual personal details.
	 *
	 * @param personalAge the personal age of this assessment individual personal details
	 */
	@Override
	public void setPersonalAge(String personalAge) {
		model.setPersonalAge(personalAge);
	}

	/**
	 * Sets the personal dependents of this assessment individual personal details.
	 *
	 * @param personalDependents the personal dependents of this assessment individual personal details
	 */
	@Override
	public void setPersonalDependents(String personalDependents) {
		model.setPersonalDependents(personalDependents);
	}

	/**
	 * Sets the personal dob of this assessment individual personal details.
	 *
	 * @param personalDob the personal dob of this assessment individual personal details
	 */
	@Override
	public void setPersonalDob(Date personalDob) {
		model.setPersonalDob(personalDob);
	}

	/**
	 * Sets the personal email of this assessment individual personal details.
	 *
	 * @param personalEmail the personal email of this assessment individual personal details
	 */
	@Override
	public void setPersonalEmail(String personalEmail) {
		model.setPersonalEmail(personalEmail);
	}

	/**
	 * Sets the personal marital status of this assessment individual personal details.
	 *
	 * @param personalMaritalStatus the personal marital status of this assessment individual personal details
	 */
	@Override
	public void setPersonalMaritalStatus(String personalMaritalStatus) {
		model.setPersonalMaritalStatus(personalMaritalStatus);
	}

	/**
	 * Sets the personal name of this assessment individual personal details.
	 *
	 * @param personalName the personal name of this assessment individual personal details
	 */
	@Override
	public void setPersonalName(String personalName) {
		model.setPersonalName(personalName);
	}

	/**
	 * Sets the personal nis of this assessment individual personal details.
	 *
	 * @param personalNis the personal nis of this assessment individual personal details
	 */
	@Override
	public void setPersonalNis(String personalNis) {
		model.setPersonalNis(personalNis);
	}

	/**
	 * Sets the personal occupation of this assessment individual personal details.
	 *
	 * @param personalOccupation the personal occupation of this assessment individual personal details
	 */
	@Override
	public void setPersonalOccupation(String personalOccupation) {
		model.setPersonalOccupation(personalOccupation);
	}

	/**
	 * Sets the personal tel num of this assessment individual personal details.
	 *
	 * @param personalTelNum the personal tel num of this assessment individual personal details
	 */
	@Override
	public void setPersonalTelNum(String personalTelNum) {
		model.setPersonalTelNum(personalTelNum);
	}

	/**
	 * Sets the personal trn of this assessment individual personal details.
	 *
	 * @param personalTrn the personal trn of this assessment individual personal details
	 */
	@Override
	public void setPersonalTrn(String personalTrn) {
		model.setPersonalTrn(personalTrn);
	}

	/**
	 * Sets the primary key of this assessment individual personal details.
	 *
	 * @param primaryKey the primary key of this assessment individual personal details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AssessmentIndividualPersonalDetailsWrapper wrap(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		return new AssessmentIndividualPersonalDetailsWrapper(
			assessmentIndividualPersonalDetails);
	}

}