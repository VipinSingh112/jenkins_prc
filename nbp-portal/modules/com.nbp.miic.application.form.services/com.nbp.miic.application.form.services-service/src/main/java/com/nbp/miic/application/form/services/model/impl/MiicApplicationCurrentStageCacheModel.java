/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicApplicationCurrentStageCacheModel
	implements CacheModel<MiicApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicApplicationCurrentStageCacheModel)) {
			return false;
		}

		MiicApplicationCurrentStageCacheModel
			miicApplicationCurrentStageCacheModel =
				(MiicApplicationCurrentStageCacheModel)object;

		if (miicApplicationCurrentStageId ==
				miicApplicationCurrentStageCacheModel.
					miicApplicationCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicApplicationCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{miicApplicationCurrentStageId=");
		sb.append(miicApplicationCurrentStageId);
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
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicApplicationCurrentStage toEntityModel() {
		MiicApplicationCurrentStageImpl miicApplicationCurrentStageImpl =
			new MiicApplicationCurrentStageImpl();

		miicApplicationCurrentStageImpl.setMiicApplicationCurrentStageId(
			miicApplicationCurrentStageId);
		miicApplicationCurrentStageImpl.setGroupId(groupId);
		miicApplicationCurrentStageImpl.setCompanyId(companyId);
		miicApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			miicApplicationCurrentStageImpl.setUserName("");
		}
		else {
			miicApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			miicApplicationCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			miicApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			miicApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			miicApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			miicApplicationCurrentStageImpl.setLastFormStep("");
		}
		else {
			miicApplicationCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		miicApplicationCurrentStageImpl.setMiicApplicationId(miicApplicationId);

		miicApplicationCurrentStageImpl.resetOriginalValues();

		return miicApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicApplicationCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		miicApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicApplicationCurrentStageId);

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

		objectOutput.writeLong(miicApplicationId);
	}

	public long miicApplicationCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long miicApplicationId;

}