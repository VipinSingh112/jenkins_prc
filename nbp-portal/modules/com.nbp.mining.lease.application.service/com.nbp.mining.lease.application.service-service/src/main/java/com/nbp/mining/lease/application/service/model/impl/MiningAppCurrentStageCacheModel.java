/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningAppCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningAppCurrentStageCacheModel
	implements CacheModel<MiningAppCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningAppCurrentStageCacheModel)) {
			return false;
		}

		MiningAppCurrentStageCacheModel miningAppCurrentStageCacheModel =
			(MiningAppCurrentStageCacheModel)object;

		if (miningAppCurrentStageId ==
				miningAppCurrentStageCacheModel.miningAppCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningAppCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miningAppCurrentStageId=");
		sb.append(miningAppCurrentStageId);
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
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningAppCurrentStage toEntityModel() {
		MiningAppCurrentStageImpl miningAppCurrentStageImpl =
			new MiningAppCurrentStageImpl();

		if (uuid == null) {
			miningAppCurrentStageImpl.setUuid("");
		}
		else {
			miningAppCurrentStageImpl.setUuid(uuid);
		}

		miningAppCurrentStageImpl.setMiningAppCurrentStageId(
			miningAppCurrentStageId);
		miningAppCurrentStageImpl.setGroupId(groupId);
		miningAppCurrentStageImpl.setCompanyId(companyId);
		miningAppCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			miningAppCurrentStageImpl.setUserName("");
		}
		else {
			miningAppCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningAppCurrentStageImpl.setCreateDate(null);
		}
		else {
			miningAppCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningAppCurrentStageImpl.setModifiedDate(null);
		}
		else {
			miningAppCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			miningAppCurrentStageImpl.setCurrentStage("");
		}
		else {
			miningAppCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			miningAppCurrentStageImpl.setLastFormStep("");
		}
		else {
			miningAppCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		miningAppCurrentStageImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningAppCurrentStageImpl.resetOriginalValues();

		return miningAppCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miningAppCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(miningAppCurrentStageId);

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

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public String uuid;
	public long miningAppCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long miningLeaseApplicationId;

}