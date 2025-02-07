/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.application.form.services.model.OsiCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiCurrentStageCacheModel
	implements CacheModel<OsiCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiCurrentStageCacheModel)) {
			return false;
		}

		OsiCurrentStageCacheModel osiCurrentStageCacheModel =
			(OsiCurrentStageCacheModel)object;

		if (osiCurrentStageId == osiCurrentStageCacheModel.osiCurrentStageId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{osiCurrentStageId=");
		sb.append(osiCurrentStageId);
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
		sb.append(", lastFormStep=");
		sb.append(lastFormStep);
		sb.append(", currentStage=");
		sb.append(currentStage);
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiCurrentStage toEntityModel() {
		OsiCurrentStageImpl osiCurrentStageImpl = new OsiCurrentStageImpl();

		osiCurrentStageImpl.setOsiCurrentStageId(osiCurrentStageId);
		osiCurrentStageImpl.setGroupId(groupId);
		osiCurrentStageImpl.setCompanyId(companyId);
		osiCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			osiCurrentStageImpl.setUserName("");
		}
		else {
			osiCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiCurrentStageImpl.setCreateDate(null);
		}
		else {
			osiCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiCurrentStageImpl.setModifiedDate(null);
		}
		else {
			osiCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (lastFormStep == null) {
			osiCurrentStageImpl.setLastFormStep("");
		}
		else {
			osiCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		if (currentStage == null) {
			osiCurrentStageImpl.setCurrentStage("");
		}
		else {
			osiCurrentStageImpl.setCurrentStage(currentStage);
		}

		osiCurrentStageImpl.setOsiApplicationId(osiApplicationId);

		osiCurrentStageImpl.resetOriginalValues();

		return osiCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		lastFormStep = objectInput.readUTF();
		currentStage = objectInput.readUTF();

		osiApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiCurrentStageId);

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

		if (lastFormStep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormStep);
		}

		if (currentStage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentStage);
		}

		objectOutput.writeLong(osiApplicationId);
	}

	public long osiCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String lastFormStep;
	public String currentStage;
	public long osiApplicationId;

}