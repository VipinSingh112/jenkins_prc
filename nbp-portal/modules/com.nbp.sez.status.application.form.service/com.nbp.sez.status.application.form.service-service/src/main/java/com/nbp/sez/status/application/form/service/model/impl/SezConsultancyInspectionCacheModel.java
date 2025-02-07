/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezConsultancyInspection;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezConsultancyInspection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezConsultancyInspectionCacheModel
	implements CacheModel<SezConsultancyInspection>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezConsultancyInspectionCacheModel)) {
			return false;
		}

		SezConsultancyInspectionCacheModel sezConsultancyInspectionCacheModel =
			(SezConsultancyInspectionCacheModel)object;

		if (sezConsultancyInspectionId ==
				sezConsultancyInspectionCacheModel.sezConsultancyInspectionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezConsultancyInspectionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{sezConsultancyInspectionId=");
		sb.append(sezConsultancyInspectionId);
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
		sb.append(", doYouWant=");
		sb.append(doYouWant);
		sb.append(", consultancyName=");
		sb.append(consultancyName);
		sb.append(", consultancyEmail=");
		sb.append(consultancyEmail);
		sb.append(", consultancyPhoneNum=");
		sb.append(consultancyPhoneNum);
		sb.append(", consultancyDateBirth=");
		sb.append(consultancyDateBirth);
		sb.append(", consultancyBirthCountry=");
		sb.append(consultancyBirthCountry);
		sb.append(", consultancyCountry=");
		sb.append(consultancyCountry);
		sb.append(", consultancySezStatus=");
		sb.append(consultancySezStatus);
		sb.append(", agendaName=");
		sb.append(agendaName);
		sb.append(", dateForInspection=");
		sb.append(dateForInspection);
		sb.append(", consultancyTime=");
		sb.append(consultancyTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezConsultancyInspection toEntityModel() {
		SezConsultancyInspectionImpl sezConsultancyInspectionImpl =
			new SezConsultancyInspectionImpl();

		sezConsultancyInspectionImpl.setSezConsultancyInspectionId(
			sezConsultancyInspectionId);
		sezConsultancyInspectionImpl.setGroupId(groupId);
		sezConsultancyInspectionImpl.setCompanyId(companyId);
		sezConsultancyInspectionImpl.setUserId(userId);

		if (userName == null) {
			sezConsultancyInspectionImpl.setUserName("");
		}
		else {
			sezConsultancyInspectionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezConsultancyInspectionImpl.setCreateDate(null);
		}
		else {
			sezConsultancyInspectionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezConsultancyInspectionImpl.setModifiedDate(null);
		}
		else {
			sezConsultancyInspectionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (doYouWant == null) {
			sezConsultancyInspectionImpl.setDoYouWant("");
		}
		else {
			sezConsultancyInspectionImpl.setDoYouWant(doYouWant);
		}

		if (consultancyName == null) {
			sezConsultancyInspectionImpl.setConsultancyName("");
		}
		else {
			sezConsultancyInspectionImpl.setConsultancyName(consultancyName);
		}

		if (consultancyEmail == null) {
			sezConsultancyInspectionImpl.setConsultancyEmail("");
		}
		else {
			sezConsultancyInspectionImpl.setConsultancyEmail(consultancyEmail);
		}

		if (consultancyPhoneNum == null) {
			sezConsultancyInspectionImpl.setConsultancyPhoneNum("");
		}
		else {
			sezConsultancyInspectionImpl.setConsultancyPhoneNum(
				consultancyPhoneNum);
		}

		if (consultancyDateBirth == Long.MIN_VALUE) {
			sezConsultancyInspectionImpl.setConsultancyDateBirth(null);
		}
		else {
			sezConsultancyInspectionImpl.setConsultancyDateBirth(
				new Date(consultancyDateBirth));
		}

		if (consultancyBirthCountry == null) {
			sezConsultancyInspectionImpl.setConsultancyBirthCountry("");
		}
		else {
			sezConsultancyInspectionImpl.setConsultancyBirthCountry(
				consultancyBirthCountry);
		}

		if (consultancyCountry == null) {
			sezConsultancyInspectionImpl.setConsultancyCountry("");
		}
		else {
			sezConsultancyInspectionImpl.setConsultancyCountry(
				consultancyCountry);
		}

		if (consultancySezStatus == null) {
			sezConsultancyInspectionImpl.setConsultancySezStatus("");
		}
		else {
			sezConsultancyInspectionImpl.setConsultancySezStatus(
				consultancySezStatus);
		}

		if (agendaName == null) {
			sezConsultancyInspectionImpl.setAgendaName("");
		}
		else {
			sezConsultancyInspectionImpl.setAgendaName(agendaName);
		}

		if (dateForInspection == Long.MIN_VALUE) {
			sezConsultancyInspectionImpl.setDateForInspection(null);
		}
		else {
			sezConsultancyInspectionImpl.setDateForInspection(
				new Date(dateForInspection));
		}

		if (consultancyTime == null) {
			sezConsultancyInspectionImpl.setConsultancyTime("");
		}
		else {
			sezConsultancyInspectionImpl.setConsultancyTime(consultancyTime);
		}

		sezConsultancyInspectionImpl.resetOriginalValues();

		return sezConsultancyInspectionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezConsultancyInspectionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		doYouWant = objectInput.readUTF();
		consultancyName = objectInput.readUTF();
		consultancyEmail = objectInput.readUTF();
		consultancyPhoneNum = objectInput.readUTF();
		consultancyDateBirth = objectInput.readLong();
		consultancyBirthCountry = objectInput.readUTF();
		consultancyCountry = objectInput.readUTF();
		consultancySezStatus = objectInput.readUTF();
		agendaName = objectInput.readUTF();
		dateForInspection = objectInput.readLong();
		consultancyTime = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezConsultancyInspectionId);

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

		if (doYouWant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(doYouWant);
		}

		if (consultancyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultancyName);
		}

		if (consultancyEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultancyEmail);
		}

		if (consultancyPhoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultancyPhoneNum);
		}

		objectOutput.writeLong(consultancyDateBirth);

		if (consultancyBirthCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultancyBirthCountry);
		}

		if (consultancyCountry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultancyCountry);
		}

		if (consultancySezStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultancySezStatus);
		}

		if (agendaName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agendaName);
		}

		objectOutput.writeLong(dateForInspection);

		if (consultancyTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultancyTime);
		}
	}

	public long sezConsultancyInspectionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String doYouWant;
	public String consultancyName;
	public String consultancyEmail;
	public String consultancyPhoneNum;
	public long consultancyDateBirth;
	public String consultancyBirthCountry;
	public String consultancyCountry;
	public String consultancySezStatus;
	public String agendaName;
	public long dateForInspection;
	public String consultancyTime;

}