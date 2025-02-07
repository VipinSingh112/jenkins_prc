/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquireCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireCurrentStageCacheModel
	implements CacheModel<AcquireCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireCurrentStageCacheModel)) {
			return false;
		}

		AcquireCurrentStageCacheModel acquireCurrentStageCacheModel =
			(AcquireCurrentStageCacheModel)object;

		if (acquireCurrentStageId ==
				acquireCurrentStageCacheModel.acquireCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{acquireCurrentStageId=");
		sb.append(acquireCurrentStageId);
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
		sb.append(", lastFormStage=");
		sb.append(lastFormStage);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireCurrentStage toEntityModel() {
		AcquireCurrentStageImpl acquireCurrentStageImpl =
			new AcquireCurrentStageImpl();

		acquireCurrentStageImpl.setAcquireCurrentStageId(acquireCurrentStageId);
		acquireCurrentStageImpl.setGroupId(groupId);
		acquireCurrentStageImpl.setCompanyId(companyId);
		acquireCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			acquireCurrentStageImpl.setUserName("");
		}
		else {
			acquireCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireCurrentStageImpl.setCreateDate(null);
		}
		else {
			acquireCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireCurrentStageImpl.setModifiedDate(null);
		}
		else {
			acquireCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			acquireCurrentStageImpl.setCurrentStage("");
		}
		else {
			acquireCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStage == null) {
			acquireCurrentStageImpl.setLastFormStage("");
		}
		else {
			acquireCurrentStageImpl.setLastFormStage(lastFormStage);
		}

		acquireCurrentStageImpl.setAcquireApplicationId(acquireApplicationId);

		acquireCurrentStageImpl.resetOriginalValues();

		return acquireCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStage = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireCurrentStageId);

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

		if (lastFormStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStage);
		}

		objectOutput.writeLong(acquireApplicationId);
	}

	public long acquireCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStage;
	public long acquireApplicationId;

}