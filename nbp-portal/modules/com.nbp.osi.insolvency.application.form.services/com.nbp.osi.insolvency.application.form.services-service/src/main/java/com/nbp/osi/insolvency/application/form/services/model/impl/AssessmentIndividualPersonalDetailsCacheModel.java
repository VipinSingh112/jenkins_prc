/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.AssessmentIndividualPersonalDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AssessmentIndividualPersonalDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AssessmentIndividualPersonalDetailsCacheModel
	implements CacheModel<AssessmentIndividualPersonalDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				AssessmentIndividualPersonalDetailsCacheModel)) {

			return false;
		}

		AssessmentIndividualPersonalDetailsCacheModel
			assessmentIndividualPersonalDetailsCacheModel =
				(AssessmentIndividualPersonalDetailsCacheModel)object;

		if (assessmentDetailsId ==
				assessmentIndividualPersonalDetailsCacheModel.
					assessmentDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, assessmentDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{assessmentDetailsId=");
		sb.append(assessmentDetailsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", initialDateContact=");
		sb.append(initialDateContact);
		sb.append(", personalName=");
		sb.append(personalName);
		sb.append(", personalAddress=");
		sb.append(personalAddress);
		sb.append(", personalEmail=");
		sb.append(personalEmail);
		sb.append(", personalTelNum=");
		sb.append(personalTelNum);
		sb.append(", personalTrn=");
		sb.append(personalTrn);
		sb.append(", personalNis=");
		sb.append(personalNis);
		sb.append(", personalDob=");
		sb.append(personalDob);
		sb.append(", personalAge=");
		sb.append(personalAge);
		sb.append(", personalMaritalStatus=");
		sb.append(personalMaritalStatus);
		sb.append(", personalDependents=");
		sb.append(personalDependents);
		sb.append(", personalOccupation=");
		sb.append(personalOccupation);
		sb.append(", emergencyName=");
		sb.append(emergencyName);
		sb.append(", emergencyEmail=");
		sb.append(emergencyEmail);
		sb.append(", emergencyTelNum=");
		sb.append(emergencyTelNum);
		sb.append(", emergencyAddress=");
		sb.append(emergencyAddress);
		sb.append(", emergencyEmployer=");
		sb.append(emergencyEmployer);
		sb.append(", employerAddress=");
		sb.append(employerAddress);
		sb.append(", employerEmail=");
		sb.append(employerEmail);
		sb.append(", employerTelNum=");
		sb.append(employerTelNum);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AssessmentIndividualPersonalDetails toEntityModel() {
		AssessmentIndividualPersonalDetailsImpl
			assessmentIndividualPersonalDetailsImpl =
				new AssessmentIndividualPersonalDetailsImpl();

		assessmentIndividualPersonalDetailsImpl.setAssessmentDetailsId(
			assessmentDetailsId);
		assessmentIndividualPersonalDetailsImpl.setGroupId(groupId);

		if (initialDateContact == Long.MIN_VALUE) {
			assessmentIndividualPersonalDetailsImpl.setInitialDateContact(null);
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setInitialDateContact(
				new Date(initialDateContact));
		}

		if (personalName == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalName("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalName(
				personalName);
		}

		if (personalAddress == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalAddress("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalAddress(
				personalAddress);
		}

		if (personalEmail == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalEmail("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalEmail(
				personalEmail);
		}

		if (personalTelNum == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalTelNum("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalTelNum(
				personalTelNum);
		}

		if (personalTrn == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalTrn("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalTrn(personalTrn);
		}

		if (personalNis == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalNis("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalNis(personalNis);
		}

		if (personalDob == Long.MIN_VALUE) {
			assessmentIndividualPersonalDetailsImpl.setPersonalDob(null);
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalDob(
				new Date(personalDob));
		}

		if (personalAge == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalAge("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalAge(personalAge);
		}

		if (personalMaritalStatus == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalMaritalStatus(
				"");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalMaritalStatus(
				personalMaritalStatus);
		}

		if (personalDependents == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalDependents("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalDependents(
				personalDependents);
		}

		if (personalOccupation == null) {
			assessmentIndividualPersonalDetailsImpl.setPersonalOccupation("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setPersonalOccupation(
				personalOccupation);
		}

		if (emergencyName == null) {
			assessmentIndividualPersonalDetailsImpl.setEmergencyName("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmergencyName(
				emergencyName);
		}

		if (emergencyEmail == null) {
			assessmentIndividualPersonalDetailsImpl.setEmergencyEmail("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmergencyEmail(
				emergencyEmail);
		}

		if (emergencyTelNum == null) {
			assessmentIndividualPersonalDetailsImpl.setEmergencyTelNum("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmergencyTelNum(
				emergencyTelNum);
		}

		if (emergencyAddress == null) {
			assessmentIndividualPersonalDetailsImpl.setEmergencyAddress("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmergencyAddress(
				emergencyAddress);
		}

		if (emergencyEmployer == null) {
			assessmentIndividualPersonalDetailsImpl.setEmergencyEmployer("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmergencyEmployer(
				emergencyEmployer);
		}

		if (employerAddress == null) {
			assessmentIndividualPersonalDetailsImpl.setEmployerAddress("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmployerAddress(
				employerAddress);
		}

		if (employerEmail == null) {
			assessmentIndividualPersonalDetailsImpl.setEmployerEmail("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmployerEmail(
				employerEmail);
		}

		if (employerTelNum == null) {
			assessmentIndividualPersonalDetailsImpl.setEmployerTelNum("");
		}
		else {
			assessmentIndividualPersonalDetailsImpl.setEmployerTelNum(
				employerTelNum);
		}

		assessmentIndividualPersonalDetailsImpl.setOsiInsolvencyId(
			osiInsolvencyId);

		assessmentIndividualPersonalDetailsImpl.resetOriginalValues();

		return assessmentIndividualPersonalDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assessmentDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();
		initialDateContact = objectInput.readLong();
		personalName = objectInput.readUTF();
		personalAddress = objectInput.readUTF();
		personalEmail = objectInput.readUTF();
		personalTelNum = objectInput.readUTF();
		personalTrn = objectInput.readUTF();
		personalNis = objectInput.readUTF();
		personalDob = objectInput.readLong();
		personalAge = objectInput.readUTF();
		personalMaritalStatus = objectInput.readUTF();
		personalDependents = objectInput.readUTF();
		personalOccupation = objectInput.readUTF();
		emergencyName = objectInput.readUTF();
		emergencyEmail = objectInput.readUTF();
		emergencyTelNum = objectInput.readUTF();
		emergencyAddress = objectInput.readUTF();
		emergencyEmployer = objectInput.readUTF();
		employerAddress = objectInput.readUTF();
		employerEmail = objectInput.readUTF();
		employerTelNum = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(assessmentDetailsId);

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(initialDateContact);

		if (personalName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalName);
		}

		if (personalAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalAddress);
		}

		if (personalEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalEmail);
		}

		if (personalTelNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalTelNum);
		}

		if (personalTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalTrn);
		}

		if (personalNis == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalNis);
		}

		objectOutput.writeLong(personalDob);

		if (personalAge == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalAge);
		}

		if (personalMaritalStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalMaritalStatus);
		}

		if (personalDependents == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalDependents);
		}

		if (personalOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personalOccupation);
		}

		if (emergencyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyName);
		}

		if (emergencyEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyEmail);
		}

		if (emergencyTelNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyTelNum);
		}

		if (emergencyAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyAddress);
		}

		if (emergencyEmployer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyEmployer);
		}

		if (employerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employerAddress);
		}

		if (employerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employerEmail);
		}

		if (employerTelNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(employerTelNum);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long assessmentDetailsId;
	public long groupId;
	public long initialDateContact;
	public String personalName;
	public String personalAddress;
	public String personalEmail;
	public String personalTelNum;
	public String personalTrn;
	public String personalNis;
	public long personalDob;
	public String personalAge;
	public String personalMaritalStatus;
	public String personalDependents;
	public String personalOccupation;
	public String emergencyName;
	public String emergencyEmail;
	public String emergencyTelNum;
	public String emergencyAddress;
	public String emergencyEmployer;
	public String employerAddress;
	public String employerEmail;
	public String employerTelNum;
	public long osiInsolvencyId;

}