/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalCurrentStageCacheModel
	implements CacheModel<MedicalCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalCurrentStageCacheModel)) {
			return false;
		}

		MedicalCurrentStageCacheModel medicalCurrentStageCacheModel =
			(MedicalCurrentStageCacheModel)object;

		if (medicalCurrentStageId ==
				medicalCurrentStageCacheModel.medicalCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", medicalCurrentStageId=");
		sb.append(medicalCurrentStageId);
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
		sb.append(", currentStage=");
		sb.append(currentStage);
		sb.append(", lastFormStep=");
		sb.append(lastFormStep);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalCurrentStage toEntityModel() {
		MedicalCurrentStageImpl medicalCurrentStageImpl =
			new MedicalCurrentStageImpl();

		if (uuid == null) {
			medicalCurrentStageImpl.setUuid("");
		}
		else {
			medicalCurrentStageImpl.setUuid(uuid);
		}

		medicalCurrentStageImpl.setMedicalCurrentStageId(medicalCurrentStageId);
		medicalCurrentStageImpl.setGroupId(groupId);
		medicalCurrentStageImpl.setCompanyId(companyId);
		medicalCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			medicalCurrentStageImpl.setUserName("");
		}
		else {
			medicalCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalCurrentStageImpl.setCreateDate(null);
		}
		else {
			medicalCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalCurrentStageImpl.setModifiedDate(null);
		}
		else {
			medicalCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			medicalCurrentStageImpl.setCurrentStage("");
		}
		else {
			medicalCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			medicalCurrentStageImpl.setLastFormStep("");
		}
		else {
			medicalCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		medicalCurrentStageImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalCurrentStageImpl.resetOriginalValues();

		return medicalCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		medicalCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		medicalFacilitiesAppId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(medicalCurrentStageId);

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

		if (currentStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentStage);
		}

		if (lastFormStep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStep);
		}

		objectOutput.writeLong(medicalFacilitiesAppId);
	}

	public String uuid;
	public long medicalCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long medicalFacilitiesAppId;

}