/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.SubjectData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SubjectData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SubjectDataCacheModel
	implements CacheModel<SubjectData>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SubjectDataCacheModel)) {
			return false;
		}

		SubjectDataCacheModel subjectDataCacheModel =
			(SubjectDataCacheModel)object;

		if (subjectDataId == subjectDataCacheModel.subjectDataId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, subjectDataId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{subjectDataId=");
		sb.append(subjectDataId);
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
		sb.append(", verSubjectNameTitle=");
		sb.append(verSubjectNameTitle);
		sb.append(", verSubjectFirstName=");
		sb.append(verSubjectFirstName);
		sb.append(", verSubjectMiddleName=");
		sb.append(verSubjectMiddleName);
		sb.append(", verSubjectSurname=");
		sb.append(verSubjectSurname);
		sb.append(", verSubjectDob=");
		sb.append(verSubjectDob);
		sb.append(", verPresentAddress=");
		sb.append(verPresentAddress);
		sb.append(", verPlaceOfBirth=");
		sb.append(verPlaceOfBirth);
		sb.append(", verSubjectTrn=");
		sb.append(verSubjectTrn);
		sb.append(", verSubjectTelNum=");
		sb.append(verSubjectTelNum);
		sb.append(", verSubjectEmail=");
		sb.append(verSubjectEmail);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SubjectData toEntityModel() {
		SubjectDataImpl subjectDataImpl = new SubjectDataImpl();

		subjectDataImpl.setSubjectDataId(subjectDataId);
		subjectDataImpl.setGroupId(groupId);
		subjectDataImpl.setCompanyId(companyId);
		subjectDataImpl.setUserId(userId);

		if (userName == null) {
			subjectDataImpl.setUserName("");
		}
		else {
			subjectDataImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			subjectDataImpl.setCreateDate(null);
		}
		else {
			subjectDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			subjectDataImpl.setModifiedDate(null);
		}
		else {
			subjectDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (verSubjectNameTitle == null) {
			subjectDataImpl.setVerSubjectNameTitle("");
		}
		else {
			subjectDataImpl.setVerSubjectNameTitle(verSubjectNameTitle);
		}

		if (verSubjectFirstName == null) {
			subjectDataImpl.setVerSubjectFirstName("");
		}
		else {
			subjectDataImpl.setVerSubjectFirstName(verSubjectFirstName);
		}

		if (verSubjectMiddleName == null) {
			subjectDataImpl.setVerSubjectMiddleName("");
		}
		else {
			subjectDataImpl.setVerSubjectMiddleName(verSubjectMiddleName);
		}

		if (verSubjectSurname == null) {
			subjectDataImpl.setVerSubjectSurname("");
		}
		else {
			subjectDataImpl.setVerSubjectSurname(verSubjectSurname);
		}

		if (verSubjectDob == Long.MIN_VALUE) {
			subjectDataImpl.setVerSubjectDob(null);
		}
		else {
			subjectDataImpl.setVerSubjectDob(new Date(verSubjectDob));
		}

		if (verPresentAddress == null) {
			subjectDataImpl.setVerPresentAddress("");
		}
		else {
			subjectDataImpl.setVerPresentAddress(verPresentAddress);
		}

		if (verPlaceOfBirth == null) {
			subjectDataImpl.setVerPlaceOfBirth("");
		}
		else {
			subjectDataImpl.setVerPlaceOfBirth(verPlaceOfBirth);
		}

		if (verSubjectTrn == null) {
			subjectDataImpl.setVerSubjectTrn("");
		}
		else {
			subjectDataImpl.setVerSubjectTrn(verSubjectTrn);
		}

		if (verSubjectTelNum == null) {
			subjectDataImpl.setVerSubjectTelNum("");
		}
		else {
			subjectDataImpl.setVerSubjectTelNum(verSubjectTelNum);
		}

		if (verSubjectEmail == null) {
			subjectDataImpl.setVerSubjectEmail("");
		}
		else {
			subjectDataImpl.setVerSubjectEmail(verSubjectEmail);
		}

		subjectDataImpl.setOsiInsolvencyId(osiInsolvencyId);

		subjectDataImpl.resetOriginalValues();

		return subjectDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		subjectDataId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		verSubjectNameTitle = objectInput.readUTF();
		verSubjectFirstName = objectInput.readUTF();
		verSubjectMiddleName = objectInput.readUTF();
		verSubjectSurname = objectInput.readUTF();
		verSubjectDob = objectInput.readLong();
		verPresentAddress = objectInput.readUTF();
		verPlaceOfBirth = objectInput.readUTF();
		verSubjectTrn = objectInput.readUTF();
		verSubjectTelNum = objectInput.readUTF();
		verSubjectEmail = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(subjectDataId);

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

		if (verSubjectNameTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verSubjectNameTitle);
		}

		if (verSubjectFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verSubjectFirstName);
		}

		if (verSubjectMiddleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verSubjectMiddleName);
		}

		if (verSubjectSurname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verSubjectSurname);
		}

		objectOutput.writeLong(verSubjectDob);

		if (verPresentAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verPresentAddress);
		}

		if (verPlaceOfBirth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verPlaceOfBirth);
		}

		if (verSubjectTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verSubjectTrn);
		}

		if (verSubjectTelNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verSubjectTelNum);
		}

		if (verSubjectEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verSubjectEmail);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long subjectDataId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String verSubjectNameTitle;
	public String verSubjectFirstName;
	public String verSubjectMiddleName;
	public String verSubjectSurname;
	public long verSubjectDob;
	public String verPresentAddress;
	public String verPlaceOfBirth;
	public String verSubjectTrn;
	public String verSubjectTelNum;
	public String verSubjectEmail;
	public long osiInsolvencyId;

}