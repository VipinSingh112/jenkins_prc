/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabApplicationInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabApplicationInfoCacheModel
	implements CacheModel<AccMediLabApplicationInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabApplicationInfoCacheModel)) {
			return false;
		}

		AccMediLabApplicationInfoCacheModel
			accMediLabApplicationInfoCacheModel =
				(AccMediLabApplicationInfoCacheModel)object;

		if (accMediLabApplicationInfoId ==
				accMediLabApplicationInfoCacheModel.
					accMediLabApplicationInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabApplicationInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabApplicationInfoId=");
		sb.append(accMediLabApplicationInfoId);
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
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", applicantAddress=");
		sb.append(applicantAddress);
		sb.append(", appliTelephoneNo=");
		sb.append(appliTelephoneNo);
		sb.append(", appliFaxNo=");
		sb.append(appliFaxNo);
		sb.append(", appliWebsite=");
		sb.append(appliWebsite);
		sb.append(", laboratoryName=");
		sb.append(laboratoryName);
		sb.append(", laboratoryAddress=");
		sb.append(laboratoryAddress);
		sb.append(", nameOfIncharge=");
		sb.append(nameOfIncharge);
		sb.append(", emailOfIncharge=");
		sb.append(emailOfIncharge);
		sb.append(", personnelQMName=");
		sb.append(personnelQMName);
		sb.append(", personnelQMEmail=");
		sb.append(personnelQMEmail);
		sb.append(", deputyInchargeName=");
		sb.append(deputyInchargeName);
		sb.append(", deputyInchargeEmail=");
		sb.append(deputyInchargeEmail);
		sb.append(", personnelFMName=");
		sb.append(personnelFMName);
		sb.append(", personnelFMEmail=");
		sb.append(personnelFMEmail);
		sb.append(", accRequestType=");
		sb.append(accRequestType);
		sb.append(", authorizedPersonnelName=");
		sb.append(authorizedPersonnelName);
		sb.append(", authorizedPosition=");
		sb.append(authorizedPosition);
		sb.append(", authorizedPersonnelDate=");
		sb.append(authorizedPersonnelDate);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabApplicationInfo toEntityModel() {
		AccMediLabApplicationInfoImpl accMediLabApplicationInfoImpl =
			new AccMediLabApplicationInfoImpl();

		if (uuid == null) {
			accMediLabApplicationInfoImpl.setUuid("");
		}
		else {
			accMediLabApplicationInfoImpl.setUuid(uuid);
		}

		accMediLabApplicationInfoImpl.setAccMediLabApplicationInfoId(
			accMediLabApplicationInfoId);
		accMediLabApplicationInfoImpl.setGroupId(groupId);
		accMediLabApplicationInfoImpl.setCompanyId(companyId);
		accMediLabApplicationInfoImpl.setUserId(userId);

		if (userName == null) {
			accMediLabApplicationInfoImpl.setUserName("");
		}
		else {
			accMediLabApplicationInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabApplicationInfoImpl.setCreateDate(null);
		}
		else {
			accMediLabApplicationInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabApplicationInfoImpl.setModifiedDate(null);
		}
		else {
			accMediLabApplicationInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfApplicant == null) {
			accMediLabApplicationInfoImpl.setNameOfApplicant("");
		}
		else {
			accMediLabApplicationInfoImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (applicantAddress == null) {
			accMediLabApplicationInfoImpl.setApplicantAddress("");
		}
		else {
			accMediLabApplicationInfoImpl.setApplicantAddress(applicantAddress);
		}

		if (appliTelephoneNo == null) {
			accMediLabApplicationInfoImpl.setAppliTelephoneNo("");
		}
		else {
			accMediLabApplicationInfoImpl.setAppliTelephoneNo(appliTelephoneNo);
		}

		if (appliFaxNo == null) {
			accMediLabApplicationInfoImpl.setAppliFaxNo("");
		}
		else {
			accMediLabApplicationInfoImpl.setAppliFaxNo(appliFaxNo);
		}

		if (appliWebsite == null) {
			accMediLabApplicationInfoImpl.setAppliWebsite("");
		}
		else {
			accMediLabApplicationInfoImpl.setAppliWebsite(appliWebsite);
		}

		if (laboratoryName == null) {
			accMediLabApplicationInfoImpl.setLaboratoryName("");
		}
		else {
			accMediLabApplicationInfoImpl.setLaboratoryName(laboratoryName);
		}

		if (laboratoryAddress == null) {
			accMediLabApplicationInfoImpl.setLaboratoryAddress("");
		}
		else {
			accMediLabApplicationInfoImpl.setLaboratoryAddress(
				laboratoryAddress);
		}

		if (nameOfIncharge == null) {
			accMediLabApplicationInfoImpl.setNameOfIncharge("");
		}
		else {
			accMediLabApplicationInfoImpl.setNameOfIncharge(nameOfIncharge);
		}

		if (emailOfIncharge == null) {
			accMediLabApplicationInfoImpl.setEmailOfIncharge("");
		}
		else {
			accMediLabApplicationInfoImpl.setEmailOfIncharge(emailOfIncharge);
		}

		if (personnelQMName == null) {
			accMediLabApplicationInfoImpl.setPersonnelQMName("");
		}
		else {
			accMediLabApplicationInfoImpl.setPersonnelQMName(personnelQMName);
		}

		if (personnelQMEmail == null) {
			accMediLabApplicationInfoImpl.setPersonnelQMEmail("");
		}
		else {
			accMediLabApplicationInfoImpl.setPersonnelQMEmail(personnelQMEmail);
		}

		if (deputyInchargeName == null) {
			accMediLabApplicationInfoImpl.setDeputyInchargeName("");
		}
		else {
			accMediLabApplicationInfoImpl.setDeputyInchargeName(
				deputyInchargeName);
		}

		if (deputyInchargeEmail == null) {
			accMediLabApplicationInfoImpl.setDeputyInchargeEmail("");
		}
		else {
			accMediLabApplicationInfoImpl.setDeputyInchargeEmail(
				deputyInchargeEmail);
		}

		if (personnelFMName == null) {
			accMediLabApplicationInfoImpl.setPersonnelFMName("");
		}
		else {
			accMediLabApplicationInfoImpl.setPersonnelFMName(personnelFMName);
		}

		if (personnelFMEmail == null) {
			accMediLabApplicationInfoImpl.setPersonnelFMEmail("");
		}
		else {
			accMediLabApplicationInfoImpl.setPersonnelFMEmail(personnelFMEmail);
		}

		if (accRequestType == null) {
			accMediLabApplicationInfoImpl.setAccRequestType("");
		}
		else {
			accMediLabApplicationInfoImpl.setAccRequestType(accRequestType);
		}

		if (authorizedPersonnelName == null) {
			accMediLabApplicationInfoImpl.setAuthorizedPersonnelName("");
		}
		else {
			accMediLabApplicationInfoImpl.setAuthorizedPersonnelName(
				authorizedPersonnelName);
		}

		if (authorizedPosition == null) {
			accMediLabApplicationInfoImpl.setAuthorizedPosition("");
		}
		else {
			accMediLabApplicationInfoImpl.setAuthorizedPosition(
				authorizedPosition);
		}

		if (authorizedPersonnelDate == Long.MIN_VALUE) {
			accMediLabApplicationInfoImpl.setAuthorizedPersonnelDate(null);
		}
		else {
			accMediLabApplicationInfoImpl.setAuthorizedPersonnelDate(
				new Date(authorizedPersonnelDate));
		}

		accMediLabApplicationInfoImpl.setJanaacApplicationId(
			janaacApplicationId);

		accMediLabApplicationInfoImpl.resetOriginalValues();

		return accMediLabApplicationInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabApplicationInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfApplicant = objectInput.readUTF();
		applicantAddress = objectInput.readUTF();
		appliTelephoneNo = objectInput.readUTF();
		appliFaxNo = objectInput.readUTF();
		appliWebsite = objectInput.readUTF();
		laboratoryName = objectInput.readUTF();
		laboratoryAddress = objectInput.readUTF();
		nameOfIncharge = objectInput.readUTF();
		emailOfIncharge = objectInput.readUTF();
		personnelQMName = objectInput.readUTF();
		personnelQMEmail = objectInput.readUTF();
		deputyInchargeName = objectInput.readUTF();
		deputyInchargeEmail = objectInput.readUTF();
		personnelFMName = objectInput.readUTF();
		personnelFMEmail = objectInput.readUTF();
		accRequestType = objectInput.readUTF();
		authorizedPersonnelName = objectInput.readUTF();
		authorizedPosition = objectInput.readUTF();
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

		objectOutput.writeLong(accMediLabApplicationInfoId);

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

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (applicantAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAddress);
		}

		if (appliTelephoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appliTelephoneNo);
		}

		if (appliFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appliFaxNo);
		}

		if (appliWebsite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appliWebsite);
		}

		if (laboratoryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryName);
		}

		if (laboratoryAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryAddress);
		}

		if (nameOfIncharge == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfIncharge);
		}

		if (emailOfIncharge == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailOfIncharge);
		}

		if (personnelQMName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelQMName);
		}

		if (personnelQMEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelQMEmail);
		}

		if (deputyInchargeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deputyInchargeName);
		}

		if (deputyInchargeEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deputyInchargeEmail);
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

		if (accRequestType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accRequestType);
		}

		if (authorizedPersonnelName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorizedPersonnelName);
		}

		if (authorizedPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorizedPosition);
		}

		objectOutput.writeLong(authorizedPersonnelDate);

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabApplicationInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfApplicant;
	public String applicantAddress;
	public String appliTelephoneNo;
	public String appliFaxNo;
	public String appliWebsite;
	public String laboratoryName;
	public String laboratoryAddress;
	public String nameOfIncharge;
	public String emailOfIncharge;
	public String personnelQMName;
	public String personnelQMEmail;
	public String deputyInchargeName;
	public String deputyInchargeEmail;
	public String personnelFMName;
	public String personnelFMEmail;
	public String accRequestType;
	public String authorizedPersonnelName;
	public String authorizedPosition;
	public long authorizedPersonnelDate;
	public long janaacApplicationId;

}