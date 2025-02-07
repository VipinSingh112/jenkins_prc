/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgriApplicationCurrentStage;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AgriApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AgriApplicationCurrentStageCacheModel
	implements CacheModel<AgriApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AgriApplicationCurrentStageCacheModel)) {
			return false;
		}

		AgriApplicationCurrentStageCacheModel
			agriApplicationCurrentStageCacheModel =
				(AgriApplicationCurrentStageCacheModel)object;

		if (agriApplicationCurrentStageId ==
				agriApplicationCurrentStageCacheModel.
					agriApplicationCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, agriApplicationCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{agriApplicationCurrentStageId=");
		sb.append(agriApplicationCurrentStageId);
		sb.append(", agricultureStageId=");
		sb.append(agricultureStageId);
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
		sb.append(", lastFormStage=");
		sb.append(lastFormStage);
		sb.append(", agricultureApplicationId=");
		sb.append(agricultureApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AgriApplicationCurrentStage toEntityModel() {
		AgriApplicationCurrentStageImpl agriApplicationCurrentStageImpl =
			new AgriApplicationCurrentStageImpl();

		agriApplicationCurrentStageImpl.setAgriApplicationCurrentStageId(
			agriApplicationCurrentStageId);
		agriApplicationCurrentStageImpl.setAgricultureStageId(
			agricultureStageId);
		agriApplicationCurrentStageImpl.setCompanyId(companyId);
		agriApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			agriApplicationCurrentStageImpl.setUserName("");
		}
		else {
			agriApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			agriApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			agriApplicationCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			agriApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			agriApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			agriApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			agriApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStage == null) {
			agriApplicationCurrentStageImpl.setLastFormStage("");
		}
		else {
			agriApplicationCurrentStageImpl.setLastFormStage(lastFormStage);
		}

		agriApplicationCurrentStageImpl.setAgricultureApplicationId(
			agricultureApplicationId);

		agriApplicationCurrentStageImpl.resetOriginalValues();

		return agriApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		agriApplicationCurrentStageId = objectInput.readLong();

		agricultureStageId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStage = objectInput.readUTF();

		agricultureApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(agriApplicationCurrentStageId);

		objectOutput.writeLong(agricultureStageId);

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

		if (lastFormStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStage);
		}

		objectOutput.writeLong(agricultureApplicationId);
	}

	public long agriApplicationCurrentStageId;
	public long agricultureStageId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStage;
	public long agricultureApplicationId;

}