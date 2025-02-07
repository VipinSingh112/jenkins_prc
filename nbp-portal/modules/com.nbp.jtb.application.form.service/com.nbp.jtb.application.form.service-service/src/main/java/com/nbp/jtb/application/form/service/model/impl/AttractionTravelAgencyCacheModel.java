/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionTravelAgency in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionTravelAgencyCacheModel
	implements CacheModel<AttractionTravelAgency>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionTravelAgencyCacheModel)) {
			return false;
		}

		AttractionTravelAgencyCacheModel attractionTravelAgencyCacheModel =
			(AttractionTravelAgencyCacheModel)object;

		if (attractionTravelAgencyId ==
				attractionTravelAgencyCacheModel.attractionTravelAgencyId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionTravelAgencyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{attractionTravelAgencyId=");
		sb.append(attractionTravelAgencyId);
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
		sb.append(", agencyAddress=");
		sb.append(agencyAddress);
		sb.append(", agencyTelephone=");
		sb.append(agencyTelephone);
		sb.append(", agencyName=");
		sb.append(agencyName);
		sb.append(", agencyAddressSec=");
		sb.append(agencyAddressSec);
		sb.append(", agencyTelephoneNum=");
		sb.append(agencyTelephoneNum);
		sb.append(", isRegistered=");
		sb.append(isRegistered);
		sb.append(", regstParticulars=");
		sb.append(regstParticulars);
		sb.append(", proprietorName=");
		sb.append(proprietorName);
		sb.append(", managerName=");
		sb.append(managerName);
		sb.append(", managerAddress=");
		sb.append(managerAddress);
		sb.append(", secretaryName=");
		sb.append(secretaryName);
		sb.append(", secretaryAddress=");
		sb.append(secretaryAddress);
		sb.append(", bankerName=");
		sb.append(bankerName);
		sb.append(", bondingCompanyName=");
		sb.append(bondingCompanyName);
		sb.append(", bondingCompanyAddress=");
		sb.append(bondingCompanyAddress);
		sb.append(", auditorsName=");
		sb.append(auditorsName);
		sb.append(", auditorsAddress=");
		sb.append(auditorsAddress);
		sb.append(", numberOfEmployees=");
		sb.append(numberOfEmployees);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionTravelAgency toEntityModel() {
		AttractionTravelAgencyImpl attractionTravelAgencyImpl =
			new AttractionTravelAgencyImpl();

		attractionTravelAgencyImpl.setAttractionTravelAgencyId(
			attractionTravelAgencyId);
		attractionTravelAgencyImpl.setGroupId(groupId);
		attractionTravelAgencyImpl.setCompanyId(companyId);
		attractionTravelAgencyImpl.setUserId(userId);

		if (userName == null) {
			attractionTravelAgencyImpl.setUserName("");
		}
		else {
			attractionTravelAgencyImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionTravelAgencyImpl.setCreateDate(null);
		}
		else {
			attractionTravelAgencyImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionTravelAgencyImpl.setModifiedDate(null);
		}
		else {
			attractionTravelAgencyImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (applicantName == null) {
			attractionTravelAgencyImpl.setApplicantName("");
		}
		else {
			attractionTravelAgencyImpl.setApplicantName(applicantName);
		}

		if (agencyAddress == null) {
			attractionTravelAgencyImpl.setAgencyAddress("");
		}
		else {
			attractionTravelAgencyImpl.setAgencyAddress(agencyAddress);
		}

		if (agencyTelephone == null) {
			attractionTravelAgencyImpl.setAgencyTelephone("");
		}
		else {
			attractionTravelAgencyImpl.setAgencyTelephone(agencyTelephone);
		}

		if (agencyName == null) {
			attractionTravelAgencyImpl.setAgencyName("");
		}
		else {
			attractionTravelAgencyImpl.setAgencyName(agencyName);
		}

		if (agencyAddressSec == null) {
			attractionTravelAgencyImpl.setAgencyAddressSec("");
		}
		else {
			attractionTravelAgencyImpl.setAgencyAddressSec(agencyAddressSec);
		}

		if (agencyTelephoneNum == null) {
			attractionTravelAgencyImpl.setAgencyTelephoneNum("");
		}
		else {
			attractionTravelAgencyImpl.setAgencyTelephoneNum(
				agencyTelephoneNum);
		}

		if (isRegistered == null) {
			attractionTravelAgencyImpl.setIsRegistered("");
		}
		else {
			attractionTravelAgencyImpl.setIsRegistered(isRegistered);
		}

		if (regstParticulars == null) {
			attractionTravelAgencyImpl.setRegstParticulars("");
		}
		else {
			attractionTravelAgencyImpl.setRegstParticulars(regstParticulars);
		}

		if (proprietorName == null) {
			attractionTravelAgencyImpl.setProprietorName("");
		}
		else {
			attractionTravelAgencyImpl.setProprietorName(proprietorName);
		}

		if (managerName == null) {
			attractionTravelAgencyImpl.setManagerName("");
		}
		else {
			attractionTravelAgencyImpl.setManagerName(managerName);
		}

		if (managerAddress == null) {
			attractionTravelAgencyImpl.setManagerAddress("");
		}
		else {
			attractionTravelAgencyImpl.setManagerAddress(managerAddress);
		}

		if (secretaryName == null) {
			attractionTravelAgencyImpl.setSecretaryName("");
		}
		else {
			attractionTravelAgencyImpl.setSecretaryName(secretaryName);
		}

		if (secretaryAddress == null) {
			attractionTravelAgencyImpl.setSecretaryAddress("");
		}
		else {
			attractionTravelAgencyImpl.setSecretaryAddress(secretaryAddress);
		}

		if (bankerName == null) {
			attractionTravelAgencyImpl.setBankerName("");
		}
		else {
			attractionTravelAgencyImpl.setBankerName(bankerName);
		}

		if (bondingCompanyName == null) {
			attractionTravelAgencyImpl.setBondingCompanyName("");
		}
		else {
			attractionTravelAgencyImpl.setBondingCompanyName(
				bondingCompanyName);
		}

		if (bondingCompanyAddress == null) {
			attractionTravelAgencyImpl.setBondingCompanyAddress("");
		}
		else {
			attractionTravelAgencyImpl.setBondingCompanyAddress(
				bondingCompanyAddress);
		}

		if (auditorsName == null) {
			attractionTravelAgencyImpl.setAuditorsName("");
		}
		else {
			attractionTravelAgencyImpl.setAuditorsName(auditorsName);
		}

		if (auditorsAddress == null) {
			attractionTravelAgencyImpl.setAuditorsAddress("");
		}
		else {
			attractionTravelAgencyImpl.setAuditorsAddress(auditorsAddress);
		}

		if (numberOfEmployees == null) {
			attractionTravelAgencyImpl.setNumberOfEmployees("");
		}
		else {
			attractionTravelAgencyImpl.setNumberOfEmployees(numberOfEmployees);
		}

		if (signDate == Long.MIN_VALUE) {
			attractionTravelAgencyImpl.setSignDate(null);
		}
		else {
			attractionTravelAgencyImpl.setSignDate(new Date(signDate));
		}

		attractionTravelAgencyImpl.setJtbApplicationId(jtbApplicationId);

		attractionTravelAgencyImpl.resetOriginalValues();

		return attractionTravelAgencyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionTravelAgencyId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		agencyAddress = objectInput.readUTF();
		agencyTelephone = objectInput.readUTF();
		agencyName = objectInput.readUTF();
		agencyAddressSec = objectInput.readUTF();
		agencyTelephoneNum = objectInput.readUTF();
		isRegistered = objectInput.readUTF();
		regstParticulars = objectInput.readUTF();
		proprietorName = objectInput.readUTF();
		managerName = objectInput.readUTF();
		managerAddress = objectInput.readUTF();
		secretaryName = objectInput.readUTF();
		secretaryAddress = objectInput.readUTF();
		bankerName = objectInput.readUTF();
		bondingCompanyName = objectInput.readUTF();
		bondingCompanyAddress = objectInput.readUTF();
		auditorsName = objectInput.readUTF();
		auditorsAddress = objectInput.readUTF();
		numberOfEmployees = objectInput.readUTF();
		signDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionTravelAgencyId);

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

		if (agencyAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyAddress);
		}

		if (agencyTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyTelephone);
		}

		if (agencyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyName);
		}

		if (agencyAddressSec == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyAddressSec);
		}

		if (agencyTelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agencyTelephoneNum);
		}

		if (isRegistered == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isRegistered);
		}

		if (regstParticulars == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(regstParticulars);
		}

		if (proprietorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proprietorName);
		}

		if (managerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerName);
		}

		if (managerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managerAddress);
		}

		if (secretaryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secretaryName);
		}

		if (secretaryAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secretaryAddress);
		}

		if (bankerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bankerName);
		}

		if (bondingCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bondingCompanyName);
		}

		if (bondingCompanyAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bondingCompanyAddress);
		}

		if (auditorsName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditorsName);
		}

		if (auditorsAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(auditorsAddress);
		}

		if (numberOfEmployees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfEmployees);
		}

		objectOutput.writeLong(signDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionTravelAgencyId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String agencyAddress;
	public String agencyTelephone;
	public String agencyName;
	public String agencyAddressSec;
	public String agencyTelephoneNum;
	public String isRegistered;
	public String regstParticulars;
	public String proprietorName;
	public String managerName;
	public String managerAddress;
	public String secretaryName;
	public String secretaryAddress;
	public String bankerName;
	public String bondingCompanyName;
	public String bondingCompanyAddress;
	public String auditorsName;
	public String auditorsAddress;
	public String numberOfEmployees;
	public long signDate;
	public long jtbApplicationId;

}