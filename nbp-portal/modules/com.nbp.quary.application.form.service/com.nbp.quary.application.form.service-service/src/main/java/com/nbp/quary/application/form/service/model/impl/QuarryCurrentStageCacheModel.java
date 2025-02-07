/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryCurrentStageCacheModel
	implements CacheModel<QuarryCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryCurrentStageCacheModel)) {
			return false;
		}

		QuarryCurrentStageCacheModel quarryCurrentStageCacheModel =
			(QuarryCurrentStageCacheModel)object;

		if (auarryStageId == quarryCurrentStageCacheModel.auarryStageId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auarryStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{auarryStageId=");
		sb.append(auarryStageId);
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
		sb.append(", lastFormDetailsStep=");
		sb.append(lastFormDetailsStep);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryCurrentStage toEntityModel() {
		QuarryCurrentStageImpl quarryCurrentStageImpl =
			new QuarryCurrentStageImpl();

		quarryCurrentStageImpl.setAuarryStageId(auarryStageId);
		quarryCurrentStageImpl.setGroupId(groupId);
		quarryCurrentStageImpl.setCompanyId(companyId);
		quarryCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			quarryCurrentStageImpl.setUserName("");
		}
		else {
			quarryCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryCurrentStageImpl.setCreateDate(null);
		}
		else {
			quarryCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryCurrentStageImpl.setModifiedDate(null);
		}
		else {
			quarryCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			quarryCurrentStageImpl.setCurrentStage("");
		}
		else {
			quarryCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormDetailsStep == null) {
			quarryCurrentStageImpl.setLastFormDetailsStep("");
		}
		else {
			quarryCurrentStageImpl.setLastFormDetailsStep(lastFormDetailsStep);
		}

		quarryCurrentStageImpl.setQuarryApplicationId(quarryApplicationId);

		quarryCurrentStageImpl.resetOriginalValues();

		return quarryCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		auarryStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormDetailsStep = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(auarryStageId);

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

		if (lastFormDetailsStep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormDetailsStep);
		}

		objectOutput.writeLong(quarryApplicationId);
	}

	public long auarryStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormDetailsStep;
	public long quarryApplicationId;

}