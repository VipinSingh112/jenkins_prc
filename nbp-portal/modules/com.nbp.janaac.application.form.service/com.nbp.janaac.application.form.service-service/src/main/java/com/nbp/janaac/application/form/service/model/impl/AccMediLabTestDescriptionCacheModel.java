/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabTestDescription;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabTestDescription in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabTestDescriptionCacheModel
	implements CacheModel<AccMediLabTestDescription>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabTestDescriptionCacheModel)) {
			return false;
		}

		AccMediLabTestDescriptionCacheModel
			accMediLabTestDescriptionCacheModel =
				(AccMediLabTestDescriptionCacheModel)object;

		if (accMediLabTestDescriptionId ==
				accMediLabTestDescriptionCacheModel.
					accMediLabTestDescriptionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabTestDescriptionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabTestDescriptionId=");
		sb.append(accMediLabTestDescriptionId);
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
		sb.append(", testClinicalActivity=");
		sb.append(testClinicalActivity);
		sb.append(", testLabShiftWork=");
		sb.append(testLabShiftWork);
		sb.append(", testLabSpecimenNo=");
		sb.append(testLabSpecimenNo);
		sb.append(", testSpecimenLocation=");
		sb.append(testSpecimenLocation);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabTestDescription toEntityModel() {
		AccMediLabTestDescriptionImpl accMediLabTestDescriptionImpl =
			new AccMediLabTestDescriptionImpl();

		if (uuid == null) {
			accMediLabTestDescriptionImpl.setUuid("");
		}
		else {
			accMediLabTestDescriptionImpl.setUuid(uuid);
		}

		accMediLabTestDescriptionImpl.setAccMediLabTestDescriptionId(
			accMediLabTestDescriptionId);
		accMediLabTestDescriptionImpl.setGroupId(groupId);
		accMediLabTestDescriptionImpl.setCompanyId(companyId);
		accMediLabTestDescriptionImpl.setUserId(userId);

		if (userName == null) {
			accMediLabTestDescriptionImpl.setUserName("");
		}
		else {
			accMediLabTestDescriptionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabTestDescriptionImpl.setCreateDate(null);
		}
		else {
			accMediLabTestDescriptionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabTestDescriptionImpl.setModifiedDate(null);
		}
		else {
			accMediLabTestDescriptionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (testClinicalActivity == null) {
			accMediLabTestDescriptionImpl.setTestClinicalActivity("");
		}
		else {
			accMediLabTestDescriptionImpl.setTestClinicalActivity(
				testClinicalActivity);
		}

		if (testLabShiftWork == null) {
			accMediLabTestDescriptionImpl.setTestLabShiftWork("");
		}
		else {
			accMediLabTestDescriptionImpl.setTestLabShiftWork(testLabShiftWork);
		}

		if (testLabSpecimenNo == null) {
			accMediLabTestDescriptionImpl.setTestLabSpecimenNo("");
		}
		else {
			accMediLabTestDescriptionImpl.setTestLabSpecimenNo(
				testLabSpecimenNo);
		}

		if (testSpecimenLocation == null) {
			accMediLabTestDescriptionImpl.setTestSpecimenLocation("");
		}
		else {
			accMediLabTestDescriptionImpl.setTestSpecimenLocation(
				testSpecimenLocation);
		}

		accMediLabTestDescriptionImpl.setJanaacApplicationId(
			janaacApplicationId);

		accMediLabTestDescriptionImpl.resetOriginalValues();

		return accMediLabTestDescriptionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabTestDescriptionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		testClinicalActivity = objectInput.readUTF();
		testLabShiftWork = objectInput.readUTF();
		testLabSpecimenNo = objectInput.readUTF();
		testSpecimenLocation = objectInput.readUTF();

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

		objectOutput.writeLong(accMediLabTestDescriptionId);

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

		if (testClinicalActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testClinicalActivity);
		}

		if (testLabShiftWork == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabShiftWork);
		}

		if (testLabSpecimenNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabSpecimenNo);
		}

		if (testSpecimenLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testSpecimenLocation);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabTestDescriptionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String testClinicalActivity;
	public String testLabShiftWork;
	public String testLabSpecimenNo;
	public String testSpecimenLocation;
	public long janaacApplicationId;

}