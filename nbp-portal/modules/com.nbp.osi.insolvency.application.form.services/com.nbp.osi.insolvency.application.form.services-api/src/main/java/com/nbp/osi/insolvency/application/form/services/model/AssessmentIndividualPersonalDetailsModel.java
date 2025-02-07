/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AssessmentIndividualPersonalDetails service. Represents a row in the &quot;nbp_osi_assessment_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssessmentIndividualPersonalDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetails
 * @generated
 */
@ProviderType
public interface AssessmentIndividualPersonalDetailsModel
	extends BaseModel<AssessmentIndividualPersonalDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a assessment individual personal details model instance should use the {@link AssessmentIndividualPersonalDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this assessment individual personal details.
	 *
	 * @return the primary key of this assessment individual personal details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this assessment individual personal details.
	 *
	 * @param primaryKey the primary key of this assessment individual personal details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the assessment details ID of this assessment individual personal details.
	 *
	 * @return the assessment details ID of this assessment individual personal details
	 */
	public long getAssessmentDetailsId();

	/**
	 * Sets the assessment details ID of this assessment individual personal details.
	 *
	 * @param assessmentDetailsId the assessment details ID of this assessment individual personal details
	 */
	public void setAssessmentDetailsId(long assessmentDetailsId);

	/**
	 * Returns the group ID of this assessment individual personal details.
	 *
	 * @return the group ID of this assessment individual personal details
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this assessment individual personal details.
	 *
	 * @param groupId the group ID of this assessment individual personal details
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the initial date contact of this assessment individual personal details.
	 *
	 * @return the initial date contact of this assessment individual personal details
	 */
	public Date getInitialDateContact();

	/**
	 * Sets the initial date contact of this assessment individual personal details.
	 *
	 * @param initialDateContact the initial date contact of this assessment individual personal details
	 */
	public void setInitialDateContact(Date initialDateContact);

	/**
	 * Returns the personal name of this assessment individual personal details.
	 *
	 * @return the personal name of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalName();

	/**
	 * Sets the personal name of this assessment individual personal details.
	 *
	 * @param personalName the personal name of this assessment individual personal details
	 */
	public void setPersonalName(String personalName);

	/**
	 * Returns the personal address of this assessment individual personal details.
	 *
	 * @return the personal address of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalAddress();

	/**
	 * Sets the personal address of this assessment individual personal details.
	 *
	 * @param personalAddress the personal address of this assessment individual personal details
	 */
	public void setPersonalAddress(String personalAddress);

	/**
	 * Returns the personal email of this assessment individual personal details.
	 *
	 * @return the personal email of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalEmail();

	/**
	 * Sets the personal email of this assessment individual personal details.
	 *
	 * @param personalEmail the personal email of this assessment individual personal details
	 */
	public void setPersonalEmail(String personalEmail);

	/**
	 * Returns the personal tel num of this assessment individual personal details.
	 *
	 * @return the personal tel num of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalTelNum();

	/**
	 * Sets the personal tel num of this assessment individual personal details.
	 *
	 * @param personalTelNum the personal tel num of this assessment individual personal details
	 */
	public void setPersonalTelNum(String personalTelNum);

	/**
	 * Returns the personal trn of this assessment individual personal details.
	 *
	 * @return the personal trn of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalTrn();

	/**
	 * Sets the personal trn of this assessment individual personal details.
	 *
	 * @param personalTrn the personal trn of this assessment individual personal details
	 */
	public void setPersonalTrn(String personalTrn);

	/**
	 * Returns the personal nis of this assessment individual personal details.
	 *
	 * @return the personal nis of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalNis();

	/**
	 * Sets the personal nis of this assessment individual personal details.
	 *
	 * @param personalNis the personal nis of this assessment individual personal details
	 */
	public void setPersonalNis(String personalNis);

	/**
	 * Returns the personal dob of this assessment individual personal details.
	 *
	 * @return the personal dob of this assessment individual personal details
	 */
	public Date getPersonalDob();

	/**
	 * Sets the personal dob of this assessment individual personal details.
	 *
	 * @param personalDob the personal dob of this assessment individual personal details
	 */
	public void setPersonalDob(Date personalDob);

	/**
	 * Returns the personal age of this assessment individual personal details.
	 *
	 * @return the personal age of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalAge();

	/**
	 * Sets the personal age of this assessment individual personal details.
	 *
	 * @param personalAge the personal age of this assessment individual personal details
	 */
	public void setPersonalAge(String personalAge);

	/**
	 * Returns the personal marital status of this assessment individual personal details.
	 *
	 * @return the personal marital status of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalMaritalStatus();

	/**
	 * Sets the personal marital status of this assessment individual personal details.
	 *
	 * @param personalMaritalStatus the personal marital status of this assessment individual personal details
	 */
	public void setPersonalMaritalStatus(String personalMaritalStatus);

	/**
	 * Returns the personal dependents of this assessment individual personal details.
	 *
	 * @return the personal dependents of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalDependents();

	/**
	 * Sets the personal dependents of this assessment individual personal details.
	 *
	 * @param personalDependents the personal dependents of this assessment individual personal details
	 */
	public void setPersonalDependents(String personalDependents);

	/**
	 * Returns the personal occupation of this assessment individual personal details.
	 *
	 * @return the personal occupation of this assessment individual personal details
	 */
	@AutoEscape
	public String getPersonalOccupation();

	/**
	 * Sets the personal occupation of this assessment individual personal details.
	 *
	 * @param personalOccupation the personal occupation of this assessment individual personal details
	 */
	public void setPersonalOccupation(String personalOccupation);

	/**
	 * Returns the emergency name of this assessment individual personal details.
	 *
	 * @return the emergency name of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmergencyName();

	/**
	 * Sets the emergency name of this assessment individual personal details.
	 *
	 * @param emergencyName the emergency name of this assessment individual personal details
	 */
	public void setEmergencyName(String emergencyName);

	/**
	 * Returns the emergency email of this assessment individual personal details.
	 *
	 * @return the emergency email of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmergencyEmail();

	/**
	 * Sets the emergency email of this assessment individual personal details.
	 *
	 * @param emergencyEmail the emergency email of this assessment individual personal details
	 */
	public void setEmergencyEmail(String emergencyEmail);

	/**
	 * Returns the emergency tel num of this assessment individual personal details.
	 *
	 * @return the emergency tel num of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmergencyTelNum();

	/**
	 * Sets the emergency tel num of this assessment individual personal details.
	 *
	 * @param emergencyTelNum the emergency tel num of this assessment individual personal details
	 */
	public void setEmergencyTelNum(String emergencyTelNum);

	/**
	 * Returns the emergency address of this assessment individual personal details.
	 *
	 * @return the emergency address of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmergencyAddress();

	/**
	 * Sets the emergency address of this assessment individual personal details.
	 *
	 * @param emergencyAddress the emergency address of this assessment individual personal details
	 */
	public void setEmergencyAddress(String emergencyAddress);

	/**
	 * Returns the emergency employer of this assessment individual personal details.
	 *
	 * @return the emergency employer of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmergencyEmployer();

	/**
	 * Sets the emergency employer of this assessment individual personal details.
	 *
	 * @param emergencyEmployer the emergency employer of this assessment individual personal details
	 */
	public void setEmergencyEmployer(String emergencyEmployer);

	/**
	 * Returns the employer address of this assessment individual personal details.
	 *
	 * @return the employer address of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmployerAddress();

	/**
	 * Sets the employer address of this assessment individual personal details.
	 *
	 * @param employerAddress the employer address of this assessment individual personal details
	 */
	public void setEmployerAddress(String employerAddress);

	/**
	 * Returns the employer email of this assessment individual personal details.
	 *
	 * @return the employer email of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmployerEmail();

	/**
	 * Sets the employer email of this assessment individual personal details.
	 *
	 * @param employerEmail the employer email of this assessment individual personal details
	 */
	public void setEmployerEmail(String employerEmail);

	/**
	 * Returns the employer tel num of this assessment individual personal details.
	 *
	 * @return the employer tel num of this assessment individual personal details
	 */
	@AutoEscape
	public String getEmployerTelNum();

	/**
	 * Sets the employer tel num of this assessment individual personal details.
	 *
	 * @param employerTelNum the employer tel num of this assessment individual personal details
	 */
	public void setEmployerTelNum(String employerTelNum);

	/**
	 * Returns the osi insolvency ID of this assessment individual personal details.
	 *
	 * @return the osi insolvency ID of this assessment individual personal details
	 */
	public long getOsiInsolvencyId();

	/**
	 * Sets the osi insolvency ID of this assessment individual personal details.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this assessment individual personal details
	 */
	public void setOsiInsolvencyId(long osiInsolvencyId);

	@Override
	public AssessmentIndividualPersonalDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}