/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionWaterEmployee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionWaterEmployee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionWaterEmployeeCacheModel
	implements CacheModel<AttractionWaterEmployee>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionWaterEmployeeCacheModel)) {
			return false;
		}

		AttractionWaterEmployeeCacheModel attractionWaterEmployeeCacheModel =
			(AttractionWaterEmployeeCacheModel)object;

		if (attractionWaterEmpLicId ==
				attractionWaterEmployeeCacheModel.attractionWaterEmpLicId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionWaterEmpLicId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{attractionWaterEmpLicId=");
		sb.append(attractionWaterEmpLicId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", applicantAge=");
		sb.append(applicantAge);
		sb.append(", applicantNationality=");
		sb.append(applicantNationality);
		sb.append(", workPermitApplied=");
		sb.append(workPermitApplied);
		sb.append(", workPermitDate=");
		sb.append(workPermitDate);
		sb.append(", qualification=");
		sb.append(qualification);
		sb.append(", placeOfEmployment=");
		sb.append(placeOfEmployment);
		sb.append(", ownerName=");
		sb.append(ownerName);
		sb.append(", cpr=");
		sb.append(cpr);
		sb.append(", firstAid=");
		sb.append(firstAid);
		sb.append(", medicFirstAid=");
		sb.append(medicFirstAid);
		sb.append(", lifeguard=");
		sb.append(lifeguard);
		sb.append(", rescueDiver=");
		sb.append(rescueDiver);
		sb.append(", otherRescue=");
		sb.append(otherRescue);
		sb.append(", employeeSignatureDate=");
		sb.append(employeeSignatureDate);
		sb.append(", timePeriod=");
		sb.append(timePeriod);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionWaterEmployee toEntityModel() {
		AttractionWaterEmployeeImpl attractionWaterEmployeeImpl =
			new AttractionWaterEmployeeImpl();

		attractionWaterEmployeeImpl.setAttractionWaterEmpLicId(
			attractionWaterEmpLicId);
		attractionWaterEmployeeImpl.setGroupId(groupId);
		attractionWaterEmployeeImpl.setCompanyId(companyId);
		attractionWaterEmployeeImpl.setUserId(userId);

		if (userName == null) {
			attractionWaterEmployeeImpl.setUserName("");
		}
		else {
			attractionWaterEmployeeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionWaterEmployeeImpl.setCreateDate(null);
		}
		else {
			attractionWaterEmployeeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionWaterEmployeeImpl.setModifiedDate(null);
		}
		else {
			attractionWaterEmployeeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicantName == null) {
			attractionWaterEmployeeImpl.setApplicantName("");
		}
		else {
			attractionWaterEmployeeImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			attractionWaterEmployeeImpl.setApplicantAddress("");
		}
		else {
			attractionWaterEmployeeImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantAge == null) {
			attractionWaterEmployeeImpl.setApplicantAge("");
		}
		else {
			attractionWaterEmployeeImpl.setApplicantAge(applicantAge);
		}

		if (applicantNationality == null) {
			attractionWaterEmployeeImpl.setApplicantNationality("");
		}
		else {
			attractionWaterEmployeeImpl.setApplicantNationality(
				applicantNationality);
		}

		if (workPermitApplied == null) {
			attractionWaterEmployeeImpl.setWorkPermitApplied("");
		}
		else {
			attractionWaterEmployeeImpl.setWorkPermitApplied(workPermitApplied);
		}

		if (workPermitDate == Long.MIN_VALUE) {
			attractionWaterEmployeeImpl.setWorkPermitDate(null);
		}
		else {
			attractionWaterEmployeeImpl.setWorkPermitDate(
				new Date(workPermitDate));
		}

		if (qualification == null) {
			attractionWaterEmployeeImpl.setQualification("");
		}
		else {
			attractionWaterEmployeeImpl.setQualification(qualification);
		}

		if (placeOfEmployment == null) {
			attractionWaterEmployeeImpl.setPlaceOfEmployment("");
		}
		else {
			attractionWaterEmployeeImpl.setPlaceOfEmployment(placeOfEmployment);
		}

		if (ownerName == null) {
			attractionWaterEmployeeImpl.setOwnerName("");
		}
		else {
			attractionWaterEmployeeImpl.setOwnerName(ownerName);
		}

		if (cpr == null) {
			attractionWaterEmployeeImpl.setCpr("");
		}
		else {
			attractionWaterEmployeeImpl.setCpr(cpr);
		}

		if (firstAid == null) {
			attractionWaterEmployeeImpl.setFirstAid("");
		}
		else {
			attractionWaterEmployeeImpl.setFirstAid(firstAid);
		}

		if (medicFirstAid == null) {
			attractionWaterEmployeeImpl.setMedicFirstAid("");
		}
		else {
			attractionWaterEmployeeImpl.setMedicFirstAid(medicFirstAid);
		}

		if (lifeguard == null) {
			attractionWaterEmployeeImpl.setLifeguard("");
		}
		else {
			attractionWaterEmployeeImpl.setLifeguard(lifeguard);
		}

		if (rescueDiver == null) {
			attractionWaterEmployeeImpl.setRescueDiver("");
		}
		else {
			attractionWaterEmployeeImpl.setRescueDiver(rescueDiver);
		}

		if (otherRescue == null) {
			attractionWaterEmployeeImpl.setOtherRescue("");
		}
		else {
			attractionWaterEmployeeImpl.setOtherRescue(otherRescue);
		}

		if (employeeSignatureDate == Long.MIN_VALUE) {
			attractionWaterEmployeeImpl.setEmployeeSignatureDate(null);
		}
		else {
			attractionWaterEmployeeImpl.setEmployeeSignatureDate(
				new Date(employeeSignatureDate));
		}

		if (timePeriod == null) {
			attractionWaterEmployeeImpl.setTimePeriod("");
		}
		else {
			attractionWaterEmployeeImpl.setTimePeriod(timePeriod);
		}

		attractionWaterEmployeeImpl.setJtbApplicationId(jtbApplicationId);

		attractionWaterEmployeeImpl.resetOriginalValues();

		return attractionWaterEmployeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionWaterEmpLicId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		applicantAge = objectInput.readUTF();
		applicantNationality = objectInput.readUTF();
		workPermitApplied = objectInput.readUTF();
		workPermitDate = objectInput.readLong();
		qualification = objectInput.readUTF();
		placeOfEmployment = objectInput.readUTF();
		ownerName = objectInput.readUTF();
		cpr = objectInput.readUTF();
		firstAid = objectInput.readUTF();
		medicFirstAid = objectInput.readUTF();
		lifeguard = objectInput.readUTF();
		rescueDiver = objectInput.readUTF();
		otherRescue = objectInput.readUTF();
		employeeSignatureDate = objectInput.readLong();
		timePeriod = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionWaterEmpLicId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (applicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (applicantAge == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAge);
		}

		if (applicantNationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNationality);
		}

		if (workPermitApplied == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workPermitApplied);
		}

		objectOutput.writeLong(workPermitDate);

		if (qualification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualification);
		}

		if (placeOfEmployment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfEmployment);
		}

		if (ownerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerName);
		}

		if (cpr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cpr);
		}

		if (firstAid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstAid);
		}

		if (medicFirstAid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medicFirstAid);
		}

		if (lifeguard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lifeguard);
		}

		if (rescueDiver == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rescueDiver);
		}

		if (otherRescue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherRescue);
		}

		objectOutput.writeLong(employeeSignatureDate);

		if (timePeriod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(timePeriod);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionWaterEmpLicId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String applicantAddress;
	public String applicantAge;
	public String applicantNationality;
	public String workPermitApplied;
	public long workPermitDate;
	public String qualification;
	public String placeOfEmployment;
	public String ownerName;
	public String cpr;
	public String firstAid;
	public String medicFirstAid;
	public String lifeguard;
	public String rescueDiver;
	public String otherRescue;
	public long employeeSignatureDate;
	public String timePeriod;
	public long jtbApplicationId;

}