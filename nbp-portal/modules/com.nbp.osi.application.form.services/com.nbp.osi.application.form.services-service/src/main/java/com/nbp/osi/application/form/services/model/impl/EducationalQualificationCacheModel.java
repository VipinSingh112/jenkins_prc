/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.application.form.services.model.EducationalQualification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing EducationalQualification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EducationalQualificationCacheModel
	implements CacheModel<EducationalQualification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EducationalQualificationCacheModel)) {
			return false;
		}

		EducationalQualificationCacheModel educationalQualificationCacheModel =
			(EducationalQualificationCacheModel)object;

		if (educationalDetailId ==
				educationalQualificationCacheModel.educationalDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, educationalDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", educationalDetailId=");
		sb.append(educationalDetailId);
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
		sb.append(", institution=");
		sb.append(institution);
		sb.append(", qualificationType=");
		sb.append(qualificationType);
		sb.append(", qualificationPeriod=");
		sb.append(qualificationPeriod);
		sb.append(", qualificationGrade=");
		sb.append(qualificationGrade);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EducationalQualification toEntityModel() {
		EducationalQualificationImpl educationalQualificationImpl =
			new EducationalQualificationImpl();

		if (uuid == null) {
			educationalQualificationImpl.setUuid("");
		}
		else {
			educationalQualificationImpl.setUuid(uuid);
		}

		educationalQualificationImpl.setEducationalDetailId(
			educationalDetailId);
		educationalQualificationImpl.setGroupId(groupId);
		educationalQualificationImpl.setCompanyId(companyId);
		educationalQualificationImpl.setUserId(userId);

		if (userName == null) {
			educationalQualificationImpl.setUserName("");
		}
		else {
			educationalQualificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			educationalQualificationImpl.setCreateDate(null);
		}
		else {
			educationalQualificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			educationalQualificationImpl.setModifiedDate(null);
		}
		else {
			educationalQualificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (institution == null) {
			educationalQualificationImpl.setInstitution("");
		}
		else {
			educationalQualificationImpl.setInstitution(institution);
		}

		if (qualificationType == null) {
			educationalQualificationImpl.setQualificationType("");
		}
		else {
			educationalQualificationImpl.setQualificationType(
				qualificationType);
		}

		if (qualificationPeriod == Long.MIN_VALUE) {
			educationalQualificationImpl.setQualificationPeriod(null);
		}
		else {
			educationalQualificationImpl.setQualificationPeriod(
				new Date(qualificationPeriod));
		}

		if (qualificationGrade == null) {
			educationalQualificationImpl.setQualificationGrade("");
		}
		else {
			educationalQualificationImpl.setQualificationGrade(
				qualificationGrade);
		}

		if (counter == null) {
			educationalQualificationImpl.setCounter("");
		}
		else {
			educationalQualificationImpl.setCounter(counter);
		}

		educationalQualificationImpl.setOsiApplicationId(osiApplicationId);

		educationalQualificationImpl.resetOriginalValues();

		return educationalQualificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		educationalDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		institution = objectInput.readUTF();
		qualificationType = objectInput.readUTF();
		qualificationPeriod = objectInput.readLong();
		qualificationGrade = objectInput.readUTF();
		counter = objectInput.readUTF();

		osiApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(educationalDetailId);

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

		if (institution == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(institution);
		}

		if (qualificationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualificationType);
		}

		objectOutput.writeLong(qualificationPeriod);

		if (qualificationGrade == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualificationGrade);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(osiApplicationId);
	}

	public String uuid;
	public long educationalDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String institution;
	public String qualificationType;
	public long qualificationPeriod;
	public String qualificationGrade;
	public String counter;
	public long osiApplicationId;

}