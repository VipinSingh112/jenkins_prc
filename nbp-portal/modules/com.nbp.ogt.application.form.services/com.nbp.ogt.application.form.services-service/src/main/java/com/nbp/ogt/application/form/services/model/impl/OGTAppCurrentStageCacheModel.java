/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OGTAppCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OGTAppCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OGTAppCurrentStageCacheModel
	implements CacheModel<OGTAppCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OGTAppCurrentStageCacheModel)) {
			return false;
		}

		OGTAppCurrentStageCacheModel ogtAppCurrentStageCacheModel =
			(OGTAppCurrentStageCacheModel)object;

		if (ogtAppCurrentStageId ==
				ogtAppCurrentStageCacheModel.ogtAppCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtAppCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ogtAppCurrentStageId=");
		sb.append(ogtAppCurrentStageId);
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
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OGTAppCurrentStage toEntityModel() {
		OGTAppCurrentStageImpl ogtAppCurrentStageImpl =
			new OGTAppCurrentStageImpl();

		if (uuid == null) {
			ogtAppCurrentStageImpl.setUuid("");
		}
		else {
			ogtAppCurrentStageImpl.setUuid(uuid);
		}

		ogtAppCurrentStageImpl.setOgtAppCurrentStageId(ogtAppCurrentStageId);
		ogtAppCurrentStageImpl.setGroupId(groupId);
		ogtAppCurrentStageImpl.setCompanyId(companyId);
		ogtAppCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			ogtAppCurrentStageImpl.setUserName("");
		}
		else {
			ogtAppCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtAppCurrentStageImpl.setCreateDate(null);
		}
		else {
			ogtAppCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtAppCurrentStageImpl.setModifiedDate(null);
		}
		else {
			ogtAppCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			ogtAppCurrentStageImpl.setCurrentStage("");
		}
		else {
			ogtAppCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			ogtAppCurrentStageImpl.setLastFormStep("");
		}
		else {
			ogtAppCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		ogtAppCurrentStageImpl.setOgtApplicationId(ogtApplicationId);

		ogtAppCurrentStageImpl.resetOriginalValues();

		return ogtAppCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ogtAppCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		ogtApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(ogtAppCurrentStageId);

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

		objectOutput.writeLong(ogtApplicationId);
	}

	public String uuid;
	public long ogtAppCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long ogtApplicationId;

}