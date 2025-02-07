/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesApplicantinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesApplicantinfoCacheModel
	implements CacheModel<OsiServicesApplicantinfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiServicesApplicantinfoCacheModel)) {
			return false;
		}

		OsiServicesApplicantinfoCacheModel osiServicesApplicantinfoCacheModel =
			(OsiServicesApplicantinfoCacheModel)object;

		if (osiServicesApplicanId ==
				osiServicesApplicantinfoCacheModel.osiServicesApplicanId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiServicesApplicanId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiServicesApplicanId=");
		sb.append(osiServicesApplicanId);
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
		sb.append(", applicantNature=");
		sb.append(applicantNature);
		sb.append(", indiFirstName=");
		sb.append(indiFirstName);
		sb.append(", indiLastName=");
		sb.append(indiLastName);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", applicationDate=");
		sb.append(applicationDate);
		sb.append(", trnNumber=");
		sb.append(trnNumber);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesApplicantinfo toEntityModel() {
		OsiServicesApplicantinfoImpl osiServicesApplicantinfoImpl =
			new OsiServicesApplicantinfoImpl();

		if (uuid == null) {
			osiServicesApplicantinfoImpl.setUuid("");
		}
		else {
			osiServicesApplicantinfoImpl.setUuid(uuid);
		}

		osiServicesApplicantinfoImpl.setOsiServicesApplicanId(
			osiServicesApplicanId);
		osiServicesApplicantinfoImpl.setGroupId(groupId);
		osiServicesApplicantinfoImpl.setCompanyId(companyId);
		osiServicesApplicantinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesApplicantinfoImpl.setUserName("");
		}
		else {
			osiServicesApplicantinfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesApplicantinfoImpl.setCreateDate(null);
		}
		else {
			osiServicesApplicantinfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesApplicantinfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesApplicantinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantNature == null) {
			osiServicesApplicantinfoImpl.setApplicantNature("");
		}
		else {
			osiServicesApplicantinfoImpl.setApplicantNature(applicantNature);
		}

		if (indiFirstName == null) {
			osiServicesApplicantinfoImpl.setIndiFirstName("");
		}
		else {
			osiServicesApplicantinfoImpl.setIndiFirstName(indiFirstName);
		}

		if (indiLastName == null) {
			osiServicesApplicantinfoImpl.setIndiLastName("");
		}
		else {
			osiServicesApplicantinfoImpl.setIndiLastName(indiLastName);
		}

		if (companyName == null) {
			osiServicesApplicantinfoImpl.setCompanyName("");
		}
		else {
			osiServicesApplicantinfoImpl.setCompanyName(companyName);
		}

		if (address == null) {
			osiServicesApplicantinfoImpl.setAddress("");
		}
		else {
			osiServicesApplicantinfoImpl.setAddress(address);
		}

		if (emailAddress == null) {
			osiServicesApplicantinfoImpl.setEmailAddress("");
		}
		else {
			osiServicesApplicantinfoImpl.setEmailAddress(emailAddress);
		}

		if (telephone == null) {
			osiServicesApplicantinfoImpl.setTelephone("");
		}
		else {
			osiServicesApplicantinfoImpl.setTelephone(telephone);
		}

		if (applicationDate == Long.MIN_VALUE) {
			osiServicesApplicantinfoImpl.setApplicationDate(null);
		}
		else {
			osiServicesApplicantinfoImpl.setApplicationDate(
				new Date(applicationDate));
		}

		if (trnNumber == null) {
			osiServicesApplicantinfoImpl.setTrnNumber("");
		}
		else {
			osiServicesApplicantinfoImpl.setTrnNumber(trnNumber);
		}

		osiServicesApplicantinfoImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesApplicantinfoImpl.resetOriginalValues();

		return osiServicesApplicantinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiServicesApplicanId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantNature = objectInput.readUTF();
		indiFirstName = objectInput.readUTF();
		indiLastName = objectInput.readUTF();
		companyName = objectInput.readUTF();
		address = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		telephone = objectInput.readUTF();
		applicationDate = objectInput.readLong();
		trnNumber = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osiServicesApplicanId);

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

		if (applicantNature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNature);
		}

		if (indiFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiFirstName);
		}

		if (indiLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiLastName);
		}

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		objectOutput.writeLong(applicationDate);

		if (trnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNumber);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiServicesApplicanId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantNature;
	public String indiFirstName;
	public String indiLastName;
	public String companyName;
	public String address;
	public String emailAddress;
	public String telephone;
	public long applicationDate;
	public String trnNumber;
	public long osiServicesApplicationId;

}