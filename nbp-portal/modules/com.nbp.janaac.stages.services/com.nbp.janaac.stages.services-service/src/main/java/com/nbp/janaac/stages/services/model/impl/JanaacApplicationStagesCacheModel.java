/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.stages.services.model.JanaacApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JanaacApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JanaacApplicationStagesCacheModel
	implements CacheModel<JanaacApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JanaacApplicationStagesCacheModel)) {
			return false;
		}

		JanaacApplicationStagesCacheModel janaacApplicationStagesCacheModel =
			(JanaacApplicationStagesCacheModel)object;

		if (janaacApplicationStagesId ==
				janaacApplicationStagesCacheModel.janaacApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, janaacApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", janaacApplicationStagesId=");
		sb.append(janaacApplicationStagesId);
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
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updateBySource=");
		sb.append(updateBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JanaacApplicationStages toEntityModel() {
		JanaacApplicationStagesImpl janaacApplicationStagesImpl =
			new JanaacApplicationStagesImpl();

		if (uuid == null) {
			janaacApplicationStagesImpl.setUuid("");
		}
		else {
			janaacApplicationStagesImpl.setUuid(uuid);
		}

		janaacApplicationStagesImpl.setJanaacApplicationStagesId(
			janaacApplicationStagesId);
		janaacApplicationStagesImpl.setGroupId(groupId);
		janaacApplicationStagesImpl.setCompanyId(companyId);
		janaacApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			janaacApplicationStagesImpl.setUserName("");
		}
		else {
			janaacApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			janaacApplicationStagesImpl.setCreateDate(null);
		}
		else {
			janaacApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			janaacApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			janaacApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			janaacApplicationStagesImpl.setStageName("");
		}
		else {
			janaacApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			janaacApplicationStagesImpl.setDuration("");
		}
		else {
			janaacApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			janaacApplicationStagesImpl.setStageStatus("");
		}
		else {
			janaacApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			janaacApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			janaacApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			janaacApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			janaacApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		janaacApplicationStagesImpl.setJanaacApplicationId(janaacApplicationId);

		if (caseId == null) {
			janaacApplicationStagesImpl.setCaseId("");
		}
		else {
			janaacApplicationStagesImpl.setCaseId(caseId);
		}

		if (updateBySource == null) {
			janaacApplicationStagesImpl.setUpdateBySource("");
		}
		else {
			janaacApplicationStagesImpl.setUpdateBySource(updateBySource);
		}

		janaacApplicationStagesImpl.resetOriginalValues();

		return janaacApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		janaacApplicationStagesId = objectInput.readLong();

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

		janaacApplicationId = objectInput.readLong();
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

		objectOutput.writeLong(janaacApplicationStagesId);

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

		objectOutput.writeLong(janaacApplicationId);

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
	public long janaacApplicationStagesId;
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
	public long janaacApplicationId;
	public String caseId;
	public String updateBySource;

}