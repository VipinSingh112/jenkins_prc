/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BlasterCompetencyForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BlasterCompetencyFormCacheModel
	implements CacheModel<BlasterCompetencyForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BlasterCompetencyFormCacheModel)) {
			return false;
		}

		BlasterCompetencyFormCacheModel blasterCompetencyFormCacheModel =
			(BlasterCompetencyFormCacheModel)object;

		if (blasterCompetencyFormId ==
				blasterCompetencyFormCacheModel.blasterCompetencyFormId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, blasterCompetencyFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{blasterCompetencyFormId=");
		sb.append(blasterCompetencyFormId);
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
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", surName=");
		sb.append(surName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", officeNumber=");
		sb.append(officeNumber);
		sb.append(", cellNum=");
		sb.append(cellNum);
		sb.append(", trnNum=");
		sb.append(trnNum);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", address=");
		sb.append(address);
		sb.append(", educationalBack=");
		sb.append(educationalBack);
		sb.append(", blastingCourse=");
		sb.append(blastingCourse);
		sb.append(", state=");
		sb.append(state);
		sb.append(", nameOfCourse=");
		sb.append(nameOfCourse);
		sb.append(", courseOrganiser=");
		sb.append(courseOrganiser);
		sb.append(", dateAppli=");
		sb.append(dateAppli);
		sb.append(", explosivesApplicationId=");
		sb.append(explosivesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BlasterCompetencyForm toEntityModel() {
		BlasterCompetencyFormImpl blasterCompetencyFormImpl =
			new BlasterCompetencyFormImpl();

		blasterCompetencyFormImpl.setBlasterCompetencyFormId(
			blasterCompetencyFormId);
		blasterCompetencyFormImpl.setGroupId(groupId);
		blasterCompetencyFormImpl.setCompanyId(companyId);
		blasterCompetencyFormImpl.setUserId(userId);

		if (userName == null) {
			blasterCompetencyFormImpl.setUserName("");
		}
		else {
			blasterCompetencyFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			blasterCompetencyFormImpl.setCreateDate(null);
		}
		else {
			blasterCompetencyFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			blasterCompetencyFormImpl.setModifiedDate(null);
		}
		else {
			blasterCompetencyFormImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			blasterCompetencyFormImpl.setFirstName("");
		}
		else {
			blasterCompetencyFormImpl.setFirstName(firstName);
		}

		if (surName == null) {
			blasterCompetencyFormImpl.setSurName("");
		}
		else {
			blasterCompetencyFormImpl.setSurName(surName);
		}

		if (middleName == null) {
			blasterCompetencyFormImpl.setMiddleName("");
		}
		else {
			blasterCompetencyFormImpl.setMiddleName(middleName);
		}

		if (gender == null) {
			blasterCompetencyFormImpl.setGender("");
		}
		else {
			blasterCompetencyFormImpl.setGender(gender);
		}

		if (officeNumber == null) {
			blasterCompetencyFormImpl.setOfficeNumber("");
		}
		else {
			blasterCompetencyFormImpl.setOfficeNumber(officeNumber);
		}

		if (cellNum == null) {
			blasterCompetencyFormImpl.setCellNum("");
		}
		else {
			blasterCompetencyFormImpl.setCellNum(cellNum);
		}

		if (trnNum == null) {
			blasterCompetencyFormImpl.setTrnNum("");
		}
		else {
			blasterCompetencyFormImpl.setTrnNum(trnNum);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			blasterCompetencyFormImpl.setDateOfBirth(null);
		}
		else {
			blasterCompetencyFormImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (address == null) {
			blasterCompetencyFormImpl.setAddress("");
		}
		else {
			blasterCompetencyFormImpl.setAddress(address);
		}

		if (educationalBack == null) {
			blasterCompetencyFormImpl.setEducationalBack("");
		}
		else {
			blasterCompetencyFormImpl.setEducationalBack(educationalBack);
		}

		if (blastingCourse == null) {
			blasterCompetencyFormImpl.setBlastingCourse("");
		}
		else {
			blasterCompetencyFormImpl.setBlastingCourse(blastingCourse);
		}

		if (state == null) {
			blasterCompetencyFormImpl.setState("");
		}
		else {
			blasterCompetencyFormImpl.setState(state);
		}

		if (nameOfCourse == null) {
			blasterCompetencyFormImpl.setNameOfCourse("");
		}
		else {
			blasterCompetencyFormImpl.setNameOfCourse(nameOfCourse);
		}

		if (courseOrganiser == null) {
			blasterCompetencyFormImpl.setCourseOrganiser("");
		}
		else {
			blasterCompetencyFormImpl.setCourseOrganiser(courseOrganiser);
		}

		if (dateAppli == Long.MIN_VALUE) {
			blasterCompetencyFormImpl.setDateAppli(null);
		}
		else {
			blasterCompetencyFormImpl.setDateAppli(new Date(dateAppli));
		}

		blasterCompetencyFormImpl.setExplosivesApplicationId(
			explosivesApplicationId);

		blasterCompetencyFormImpl.resetOriginalValues();

		return blasterCompetencyFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		blasterCompetencyFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		surName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		gender = objectInput.readUTF();
		officeNumber = objectInput.readUTF();
		cellNum = objectInput.readUTF();
		trnNum = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		address = objectInput.readUTF();
		educationalBack = objectInput.readUTF();
		blastingCourse = objectInput.readUTF();
		state = objectInput.readUTF();
		nameOfCourse = objectInput.readUTF();
		courseOrganiser = objectInput.readUTF();
		dateAppli = objectInput.readLong();

		explosivesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(blasterCompetencyFormId);

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

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (surName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surName);
		}

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (officeNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officeNumber);
		}

		if (cellNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cellNum);
		}

		if (trnNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNum);
		}

		objectOutput.writeLong(dateOfBirth);

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (educationalBack == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(educationalBack);
		}

		if (blastingCourse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(blastingCourse);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (nameOfCourse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfCourse);
		}

		if (courseOrganiser == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(courseOrganiser);
		}

		objectOutput.writeLong(dateAppli);

		objectOutput.writeLong(explosivesApplicationId);
	}

	public long blasterCompetencyFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String surName;
	public String middleName;
	public String gender;
	public String officeNumber;
	public String cellNum;
	public String trnNum;
	public long dateOfBirth;
	public String address;
	public String educationalBack;
	public String blastingCourse;
	public String state;
	public String nameOfCourse;
	public String courseOrganiser;
	public long dateAppli;
	public long explosivesApplicationId;

}