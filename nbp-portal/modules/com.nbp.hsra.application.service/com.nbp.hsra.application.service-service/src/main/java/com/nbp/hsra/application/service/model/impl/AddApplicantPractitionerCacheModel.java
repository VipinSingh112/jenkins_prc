/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.AddApplicantPractitioner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddApplicantPractitioner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddApplicantPractitionerCacheModel
	implements CacheModel<AddApplicantPractitioner>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddApplicantPractitionerCacheModel)) {
			return false;
		}

		AddApplicantPractitionerCacheModel addApplicantPractitionerCacheModel =
			(AddApplicantPractitionerCacheModel)object;

		if (addApplicantPractitionerId ==
				addApplicantPractitionerCacheModel.addApplicantPractitionerId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addApplicantPractitionerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", addApplicantPractitionerId=");
		sb.append(addApplicantPractitionerId);
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
		sb.append(", applicantDate=");
		sb.append(applicantDate);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddApplicantPractitioner toEntityModel() {
		AddApplicantPractitionerImpl addApplicantPractitionerImpl =
			new AddApplicantPractitionerImpl();

		if (uuid == null) {
			addApplicantPractitionerImpl.setUuid("");
		}
		else {
			addApplicantPractitionerImpl.setUuid(uuid);
		}

		addApplicantPractitionerImpl.setAddApplicantPractitionerId(
			addApplicantPractitionerId);
		addApplicantPractitionerImpl.setGroupId(groupId);
		addApplicantPractitionerImpl.setCompanyId(companyId);
		addApplicantPractitionerImpl.setUserId(userId);

		if (userName == null) {
			addApplicantPractitionerImpl.setUserName("");
		}
		else {
			addApplicantPractitionerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addApplicantPractitionerImpl.setCreateDate(null);
		}
		else {
			addApplicantPractitionerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addApplicantPractitionerImpl.setModifiedDate(null);
		}
		else {
			addApplicantPractitionerImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantDate == Long.MIN_VALUE) {
			addApplicantPractitionerImpl.setApplicantDate(null);
		}
		else {
			addApplicantPractitionerImpl.setApplicantDate(
				new Date(applicantDate));
		}

		if (counter == null) {
			addApplicantPractitionerImpl.setCounter("");
		}
		else {
			addApplicantPractitionerImpl.setCounter(counter);
		}

		addApplicantPractitionerImpl.setHsraApplicationId(hsraApplicationId);

		addApplicantPractitionerImpl.resetOriginalValues();

		return addApplicantPractitionerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		addApplicantPractitionerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantDate = objectInput.readLong();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(addApplicantPractitionerId);

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
		objectOutput.writeLong(applicantDate);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public String uuid;
	public long addApplicantPractitionerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long applicantDate;
	public String counter;
	public long hsraApplicationId;

}