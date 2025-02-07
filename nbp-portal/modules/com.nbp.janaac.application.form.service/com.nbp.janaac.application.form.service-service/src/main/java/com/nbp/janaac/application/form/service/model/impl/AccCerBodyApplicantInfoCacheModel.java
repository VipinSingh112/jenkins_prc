/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyApplicantInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyApplicantInfoCacheModel
	implements CacheModel<AccCerBodyApplicantInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyApplicantInfoCacheModel)) {
			return false;
		}

		AccCerBodyApplicantInfoCacheModel accCerBodyApplicantInfoCacheModel =
			(AccCerBodyApplicantInfoCacheModel)object;

		if (accCerBodyApplicantInfoId ==
				accCerBodyApplicantInfoCacheModel.accCerBodyApplicantInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyApplicantInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyApplicantInfoId=");
		sb.append(accCerBodyApplicantInfoId);
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
		sb.append(", applicantTelephone=");
		sb.append(applicantTelephone);
		sb.append(", applicantFaxNo=");
		sb.append(applicantFaxNo);
		sb.append(", applicantWebsite=");
		sb.append(applicantWebsite);
		sb.append(", certificationName=");
		sb.append(certificationName);
		sb.append(", certiAddress=");
		sb.append(certiAddress);
		sb.append(", personnelName=");
		sb.append(personnelName);
		sb.append(", personnelEmail=");
		sb.append(personnelEmail);
		sb.append(", personnelContactName=");
		sb.append(personnelContactName);
		sb.append(", personnelContactEmail=");
		sb.append(personnelContactEmail);
		sb.append(", personnelFMName=");
		sb.append(personnelFMName);
		sb.append(", personnelFMEmail=");
		sb.append(personnelFMEmail);
		sb.append(", accreditationRequest=");
		sb.append(accreditationRequest);
		sb.append(", managementSystem=");
		sb.append(managementSystem);
		sb.append(", specifyOther=");
		sb.append(specifyOther);
		sb.append(", listOfStandard=");
		sb.append(listOfStandard);
		sb.append(", authorizedPersonnelName=");
		sb.append(authorizedPersonnelName);
		sb.append(", authorizedPersonnelPos=");
		sb.append(authorizedPersonnelPos);
		sb.append(", authorizedPersonnelDate=");
		sb.append(authorizedPersonnelDate);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccCerBodyApplicantInfo toEntityModel() {
		AccCerBodyApplicantInfoImpl accCerBodyApplicantInfoImpl =
			new AccCerBodyApplicantInfoImpl();

		if (uuid == null) {
			accCerBodyApplicantInfoImpl.setUuid("");
		}
		else {
			accCerBodyApplicantInfoImpl.setUuid(uuid);
		}

		accCerBodyApplicantInfoImpl.setAccCerBodyApplicantInfoId(
			accCerBodyApplicantInfoId);
		accCerBodyApplicantInfoImpl.setGroupId(groupId);
		accCerBodyApplicantInfoImpl.setCompanyId(companyId);
		accCerBodyApplicantInfoImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyApplicantInfoImpl.setUserName("");
		}
		else {
			accCerBodyApplicantInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyApplicantInfoImpl.setCreateDate(null);
		}
		else {
			accCerBodyApplicantInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyApplicantInfoImpl.setModifiedDate(null);
		}
		else {
			accCerBodyApplicantInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicantName == null) {
			accCerBodyApplicantInfoImpl.setApplicantName("");
		}
		else {
			accCerBodyApplicantInfoImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			accCerBodyApplicantInfoImpl.setApplicantAddress("");
		}
		else {
			accCerBodyApplicantInfoImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantTelephone == null) {
			accCerBodyApplicantInfoImpl.setApplicantTelephone("");
		}
		else {
			accCerBodyApplicantInfoImpl.setApplicantTelephone(
				applicantTelephone);
		}

		if (applicantFaxNo == null) {
			accCerBodyApplicantInfoImpl.setApplicantFaxNo("");
		}
		else {
			accCerBodyApplicantInfoImpl.setApplicantFaxNo(applicantFaxNo);
		}

		if (applicantWebsite == null) {
			accCerBodyApplicantInfoImpl.setApplicantWebsite("");
		}
		else {
			accCerBodyApplicantInfoImpl.setApplicantWebsite(applicantWebsite);
		}

		if (certificationName == null) {
			accCerBodyApplicantInfoImpl.setCertificationName("");
		}
		else {
			accCerBodyApplicantInfoImpl.setCertificationName(certificationName);
		}

		if (certiAddress == null) {
			accCerBodyApplicantInfoImpl.setCertiAddress("");
		}
		else {
			accCerBodyApplicantInfoImpl.setCertiAddress(certiAddress);
		}

		if (personnelName == null) {
			accCerBodyApplicantInfoImpl.setPersonnelName("");
		}
		else {
			accCerBodyApplicantInfoImpl.setPersonnelName(personnelName);
		}

		if (personnelEmail == null) {
			accCerBodyApplicantInfoImpl.setPersonnelEmail("");
		}
		else {
			accCerBodyApplicantInfoImpl.setPersonnelEmail(personnelEmail);
		}

		if (personnelContactName == null) {
			accCerBodyApplicantInfoImpl.setPersonnelContactName("");
		}
		else {
			accCerBodyApplicantInfoImpl.setPersonnelContactName(
				personnelContactName);
		}

		if (personnelContactEmail == null) {
			accCerBodyApplicantInfoImpl.setPersonnelContactEmail("");
		}
		else {
			accCerBodyApplicantInfoImpl.setPersonnelContactEmail(
				personnelContactEmail);
		}

		if (personnelFMName == null) {
			accCerBodyApplicantInfoImpl.setPersonnelFMName("");
		}
		else {
			accCerBodyApplicantInfoImpl.setPersonnelFMName(personnelFMName);
		}

		if (personnelFMEmail == null) {
			accCerBodyApplicantInfoImpl.setPersonnelFMEmail("");
		}
		else {
			accCerBodyApplicantInfoImpl.setPersonnelFMEmail(personnelFMEmail);
		}

		if (accreditationRequest == null) {
			accCerBodyApplicantInfoImpl.setAccreditationRequest("");
		}
		else {
			accCerBodyApplicantInfoImpl.setAccreditationRequest(
				accreditationRequest);
		}

		if (managementSystem == null) {
			accCerBodyApplicantInfoImpl.setManagementSystem("");
		}
		else {
			accCerBodyApplicantInfoImpl.setManagementSystem(managementSystem);
		}

		if (specifyOther == null) {
			accCerBodyApplicantInfoImpl.setSpecifyOther("");
		}
		else {
			accCerBodyApplicantInfoImpl.setSpecifyOther(specifyOther);
		}

		if (listOfStandard == null) {
			accCerBodyApplicantInfoImpl.setListOfStandard("");
		}
		else {
			accCerBodyApplicantInfoImpl.setListOfStandard(listOfStandard);
		}

		if (authorizedPersonnelName == null) {
			accCerBodyApplicantInfoImpl.setAuthorizedPersonnelName("");
		}
		else {
			accCerBodyApplicantInfoImpl.setAuthorizedPersonnelName(
				authorizedPersonnelName);
		}

		if (authorizedPersonnelPos == null) {
			accCerBodyApplicantInfoImpl.setAuthorizedPersonnelPos("");
		}
		else {
			accCerBodyApplicantInfoImpl.setAuthorizedPersonnelPos(
				authorizedPersonnelPos);
		}

		if (authorizedPersonnelDate == Long.MIN_VALUE) {
			accCerBodyApplicantInfoImpl.setAuthorizedPersonnelDate(null);
		}
		else {
			accCerBodyApplicantInfoImpl.setAuthorizedPersonnelDate(
				new Date(authorizedPersonnelDate));
		}

		accCerBodyApplicantInfoImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyApplicantInfoImpl.resetOriginalValues();

		return accCerBodyApplicantInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyApplicantInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		applicantTelephone = objectInput.readUTF();
		applicantFaxNo = objectInput.readUTF();
		applicantWebsite = objectInput.readUTF();
		certificationName = objectInput.readUTF();
		certiAddress = objectInput.readUTF();
		personnelName = objectInput.readUTF();
		personnelEmail = objectInput.readUTF();
		personnelContactName = objectInput.readUTF();
		personnelContactEmail = objectInput.readUTF();
		personnelFMName = objectInput.readUTF();
		personnelFMEmail = objectInput.readUTF();
		accreditationRequest = objectInput.readUTF();
		managementSystem = objectInput.readUTF();
		specifyOther = objectInput.readUTF();
		listOfStandard = objectInput.readUTF();
		authorizedPersonnelName = objectInput.readUTF();
		authorizedPersonnelPos = objectInput.readUTF();
		authorizedPersonnelDate = objectInput.readLong();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accCerBodyApplicantInfoId);

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

		if (applicantTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTelephone);
		}

		if (applicantFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantFaxNo);
		}

		if (applicantWebsite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantWebsite);
		}

		if (certificationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationName);
		}

		if (certiAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certiAddress);
		}

		if (personnelName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelName);
		}

		if (personnelEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelEmail);
		}

		if (personnelContactName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelContactName);
		}

		if (personnelContactEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelContactEmail);
		}

		if (personnelFMName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelFMName);
		}

		if (personnelFMEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelFMEmail);
		}

		if (accreditationRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accreditationRequest);
		}

		if (managementSystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementSystem);
		}

		if (specifyOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specifyOther);
		}

		if (listOfStandard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(listOfStandard);
		}

		if (authorizedPersonnelName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorizedPersonnelName);
		}

		if (authorizedPersonnelPos == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorizedPersonnelPos);
		}

		objectOutput.writeLong(authorizedPersonnelDate);

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accCerBodyApplicantInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String applicantAddress;
	public String applicantTelephone;
	public String applicantFaxNo;
	public String applicantWebsite;
	public String certificationName;
	public String certiAddress;
	public String personnelName;
	public String personnelEmail;
	public String personnelContactName;
	public String personnelContactEmail;
	public String personnelFMName;
	public String personnelFMEmail;
	public String accreditationRequest;
	public String managementSystem;
	public String specifyOther;
	public String listOfStandard;
	public String authorizedPersonnelName;
	public String authorizedPersonnelPos;
	public long authorizedPersonnelDate;
	public long janaacApplicationId;

}