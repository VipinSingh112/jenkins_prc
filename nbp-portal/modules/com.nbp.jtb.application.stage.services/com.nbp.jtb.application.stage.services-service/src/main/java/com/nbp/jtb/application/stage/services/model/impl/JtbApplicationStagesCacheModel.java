/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.stage.services.model.JtbApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbApplicationStagesCacheModel
	implements CacheModel<JtbApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbApplicationStagesCacheModel)) {
			return false;
		}

		JtbApplicationStagesCacheModel jtbApplicationStagesCacheModel =
			(JtbApplicationStagesCacheModel)object;

		if (jtbApplicationStagesId ==
				jtbApplicationStagesCacheModel.jtbApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jtbApplicationStagesId=");
		sb.append(jtbApplicationStagesId);
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
		sb.append(", stageName=");
		sb.append(stageName);
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", stageStatus=");
		sb.append(stageStatus);
		sb.append(", stageStartDate=");
		sb.append(stageStartDate);
		sb.append(", stageEndDate=");
		sb.append(stageEndDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbApplicationStages toEntityModel() {
		JtbApplicationStagesImpl jtbApplicationStagesImpl =
			new JtbApplicationStagesImpl();

		if (uuid == null) {
			jtbApplicationStagesImpl.setUuid("");
		}
		else {
			jtbApplicationStagesImpl.setUuid(uuid);
		}

		jtbApplicationStagesImpl.setJtbApplicationStagesId(
			jtbApplicationStagesId);
		jtbApplicationStagesImpl.setGroupId(groupId);
		jtbApplicationStagesImpl.setCompanyId(companyId);
		jtbApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			jtbApplicationStagesImpl.setUserName("");
		}
		else {
			jtbApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbApplicationStagesImpl.setCreateDate(null);
		}
		else {
			jtbApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			jtbApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			jtbApplicationStagesImpl.setStageName("");
		}
		else {
			jtbApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			jtbApplicationStagesImpl.setDuration("");
		}
		else {
			jtbApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			jtbApplicationStagesImpl.setStageStatus("");
		}
		else {
			jtbApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			jtbApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			jtbApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			jtbApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			jtbApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		jtbApplicationStagesImpl.setJtbApplicationId(jtbApplicationId);

		if (caseId == null) {
			jtbApplicationStagesImpl.setCaseId("");
		}
		else {
			jtbApplicationStagesImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			jtbApplicationStagesImpl.setUpdateBySource("");
		}
		else {
			jtbApplicationStagesImpl.setUpdateBySource(updateBySource);
		}

		jtbApplicationStagesImpl.resetOriginalValues();

		return jtbApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jtbApplicationStagesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		stageName = objectInput.readUTF();
		duration = objectInput.readUTF();
		stageStatus = objectInput.readUTF();
		stageStartDate = objectInput.readLong();
		stageEndDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updateBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jtbApplicationStagesId);

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

		if (stageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stageName);
		}

		if (duration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(duration);
		}

		if (stageStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stageStatus);
		}

		objectOutput.writeLong(stageStartDate);
		objectOutput.writeLong(stageEndDate);

		objectOutput.writeLong(jtbApplicationId);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (updateBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updateBySource);
		}
	}

	public String uuid;
	public long jtbApplicationStagesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String stageName;
	public String duration;
	public String stageStatus;
	public long stageStartDate;
	public long stageEndDate;
	public long jtbApplicationId;
	public String caseId;
	public String updateBySource;

}