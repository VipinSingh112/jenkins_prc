/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccThirdPartyAppliInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccThirdPartyAppliInfoCacheModel
	implements CacheModel<AccThirdPartyAppliInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccThirdPartyAppliInfoCacheModel)) {
			return false;
		}

		AccThirdPartyAppliInfoCacheModel accThirdPartyAppliInfoCacheModel =
			(AccThirdPartyAppliInfoCacheModel)object;

		if (accThirdPartyAppliInfoId ==
				accThirdPartyAppliInfoCacheModel.accThirdPartyAppliInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accThirdPartyAppliInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accThirdPartyAppliInfoId=");
		sb.append(accThirdPartyAppliInfoId);
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
		sb.append(", accFdaScheme=");
		sb.append(accFdaScheme);
		sb.append(", specifyOther=");
		sb.append(specifyOther);
		sb.append(", supplementaryCertificate=");
		sb.append(supplementaryCertificate);
		sb.append(", supplementaryOther=");
		sb.append(supplementaryOther);
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
	public AccThirdPartyAppliInfo toEntityModel() {
		AccThirdPartyAppliInfoImpl accThirdPartyAppliInfoImpl =
			new AccThirdPartyAppliInfoImpl();

		if (uuid == null) {
			accThirdPartyAppliInfoImpl.setUuid("");
		}
		else {
			accThirdPartyAppliInfoImpl.setUuid(uuid);
		}

		accThirdPartyAppliInfoImpl.setAccThirdPartyAppliInfoId(
			accThirdPartyAppliInfoId);
		accThirdPartyAppliInfoImpl.setGroupId(groupId);
		accThirdPartyAppliInfoImpl.setCompanyId(companyId);
		accThirdPartyAppliInfoImpl.setUserId(userId);

		if (userName == null) {
			accThirdPartyAppliInfoImpl.setUserName("");
		}
		else {
			accThirdPartyAppliInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accThirdPartyAppliInfoImpl.setCreateDate(null);
		}
		else {
			accThirdPartyAppliInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accThirdPartyAppliInfoImpl.setModifiedDate(null);
		}
		else {
			accThirdPartyAppliInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicantName == null) {
			accThirdPartyAppliInfoImpl.setApplicantName("");
		}
		else {
			accThirdPartyAppliInfoImpl.setApplicantName(applicantName);
		}

		if (applicantAddress == null) {
			accThirdPartyAppliInfoImpl.setApplicantAddress("");
		}
		else {
			accThirdPartyAppliInfoImpl.setApplicantAddress(applicantAddress);
		}

		if (applicantTelephone == null) {
			accThirdPartyAppliInfoImpl.setApplicantTelephone("");
		}
		else {
			accThirdPartyAppliInfoImpl.setApplicantTelephone(
				applicantTelephone);
		}

		if (applicantFaxNo == null) {
			accThirdPartyAppliInfoImpl.setApplicantFaxNo("");
		}
		else {
			accThirdPartyAppliInfoImpl.setApplicantFaxNo(applicantFaxNo);
		}

		if (applicantWebsite == null) {
			accThirdPartyAppliInfoImpl.setApplicantWebsite("");
		}
		else {
			accThirdPartyAppliInfoImpl.setApplicantWebsite(applicantWebsite);
		}

		if (certificationName == null) {
			accThirdPartyAppliInfoImpl.setCertificationName("");
		}
		else {
			accThirdPartyAppliInfoImpl.setCertificationName(certificationName);
		}

		if (certiAddress == null) {
			accThirdPartyAppliInfoImpl.setCertiAddress("");
		}
		else {
			accThirdPartyAppliInfoImpl.setCertiAddress(certiAddress);
		}

		if (personnelName == null) {
			accThirdPartyAppliInfoImpl.setPersonnelName("");
		}
		else {
			accThirdPartyAppliInfoImpl.setPersonnelName(personnelName);
		}

		if (personnelEmail == null) {
			accThirdPartyAppliInfoImpl.setPersonnelEmail("");
		}
		else {
			accThirdPartyAppliInfoImpl.setPersonnelEmail(personnelEmail);
		}

		if (personnelContactName == null) {
			accThirdPartyAppliInfoImpl.setPersonnelContactName("");
		}
		else {
			accThirdPartyAppliInfoImpl.setPersonnelContactName(
				personnelContactName);
		}

		if (personnelContactEmail == null) {
			accThirdPartyAppliInfoImpl.setPersonnelContactEmail("");
		}
		else {
			accThirdPartyAppliInfoImpl.setPersonnelContactEmail(
				personnelContactEmail);
		}

		if (personnelFMName == null) {
			accThirdPartyAppliInfoImpl.setPersonnelFMName("");
		}
		else {
			accThirdPartyAppliInfoImpl.setPersonnelFMName(personnelFMName);
		}

		if (personnelFMEmail == null) {
			accThirdPartyAppliInfoImpl.setPersonnelFMEmail("");
		}
		else {
			accThirdPartyAppliInfoImpl.setPersonnelFMEmail(personnelFMEmail);
		}

		if (accreditationRequest == null) {
			accThirdPartyAppliInfoImpl.setAccreditationRequest("");
		}
		else {
			accThirdPartyAppliInfoImpl.setAccreditationRequest(
				accreditationRequest);
		}

		if (accFdaScheme == null) {
			accThirdPartyAppliInfoImpl.setAccFdaScheme("");
		}
		else {
			accThirdPartyAppliInfoImpl.setAccFdaScheme(accFdaScheme);
		}

		if (specifyOther == null) {
			accThirdPartyAppliInfoImpl.setSpecifyOther("");
		}
		else {
			accThirdPartyAppliInfoImpl.setSpecifyOther(specifyOther);
		}

		if (supplementaryCertificate == null) {
			accThirdPartyAppliInfoImpl.setSupplementaryCertificate("");
		}
		else {
			accThirdPartyAppliInfoImpl.setSupplementaryCertificate(
				supplementaryCertificate);
		}

		if (supplementaryOther == null) {
			accThirdPartyAppliInfoImpl.setSupplementaryOther("");
		}
		else {
			accThirdPartyAppliInfoImpl.setSupplementaryOther(
				supplementaryOther);
		}

		if (listOfStandard == null) {
			accThirdPartyAppliInfoImpl.setListOfStandard("");
		}
		else {
			accThirdPartyAppliInfoImpl.setListOfStandard(listOfStandard);
		}

		if (authorizedPersonnelName == null) {
			accThirdPartyAppliInfoImpl.setAuthorizedPersonnelName("");
		}
		else {
			accThirdPartyAppliInfoImpl.setAuthorizedPersonnelName(
				authorizedPersonnelName);
		}

		if (authorizedPersonnelPos == null) {
			accThirdPartyAppliInfoImpl.setAuthorizedPersonnelPos("");
		}
		else {
			accThirdPartyAppliInfoImpl.setAuthorizedPersonnelPos(
				authorizedPersonnelPos);
		}

		if (authorizedPersonnelDate == Long.MIN_VALUE) {
			accThirdPartyAppliInfoImpl.setAuthorizedPersonnelDate(null);
		}
		else {
			accThirdPartyAppliInfoImpl.setAuthorizedPersonnelDate(
				new Date(authorizedPersonnelDate));
		}

		accThirdPartyAppliInfoImpl.setJanaacApplicationId(janaacApplicationId);

		accThirdPartyAppliInfoImpl.resetOriginalValues();

		return accThirdPartyAppliInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accThirdPartyAppliInfoId = objectInput.readLong();

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
		accFdaScheme = objectInput.readUTF();
		specifyOther = objectInput.readUTF();
		supplementaryCertificate = objectInput.readUTF();
		supplementaryOther = objectInput.readUTF();
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

		objectOutput.writeLong(accThirdPartyAppliInfoId);

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

		if (accFdaScheme == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accFdaScheme);
		}

		if (specifyOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specifyOther);
		}

		if (supplementaryCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(supplementaryCertificate);
		}

		if (supplementaryOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(supplementaryOther);
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
	public long accThirdPartyAppliInfoId;
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
	public String accFdaScheme;
	public String specifyOther;
	public String supplementaryCertificate;
	public String supplementaryOther;
	public String listOfStandard;
	public String authorizedPersonnelName;
	public String authorizedPersonnelPos;
	public long authorizedPersonnelDate;
	public long janaacApplicationId;

}