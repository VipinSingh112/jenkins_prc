/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolvencyApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolvencyApplicationStagesCacheModel
	implements CacheModel<OsiInsolvencyApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolvencyApplicationStagesCacheModel)) {
			return false;
		}

		OsiInsolvencyApplicationStagesCacheModel
			osiInsolvencyApplicationStagesCacheModel =
				(OsiInsolvencyApplicationStagesCacheModel)object;

		if (osiInsolveApplicationStagesId ==
				osiInsolvencyApplicationStagesCacheModel.
					osiInsolveApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInsolveApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiInsolveApplicationStagesId=");
		sb.append(osiInsolveApplicationStagesId);
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
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsolvencyApplicationStages toEntityModel() {
		OsiInsolvencyApplicationStagesImpl osiInsolvencyApplicationStagesImpl =
			new OsiInsolvencyApplicationStagesImpl();

		if (uuid == null) {
			osiInsolvencyApplicationStagesImpl.setUuid("");
		}
		else {
			osiInsolvencyApplicationStagesImpl.setUuid(uuid);
		}

		osiInsolvencyApplicationStagesImpl.setOsiInsolveApplicationStagesId(
			osiInsolveApplicationStagesId);
		osiInsolvencyApplicationStagesImpl.setGroupId(groupId);
		osiInsolvencyApplicationStagesImpl.setCompanyId(companyId);
		osiInsolvencyApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			osiInsolvencyApplicationStagesImpl.setUserName("");
		}
		else {
			osiInsolvencyApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationStagesImpl.setCreateDate(null);
		}
		else {
			osiInsolvencyApplicationStagesImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			osiInsolvencyApplicationStagesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (stageName == null) {
			osiInsolvencyApplicationStagesImpl.setStageName("");
		}
		else {
			osiInsolvencyApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			osiInsolvencyApplicationStagesImpl.setDuration("");
		}
		else {
			osiInsolvencyApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			osiInsolvencyApplicationStagesImpl.setStageStatus("");
		}
		else {
			osiInsolvencyApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			osiInsolvencyApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			osiInsolvencyApplicationStagesImpl.setStageEndDate(
				new Date(stageEndDate));
		}

		osiInsolvencyApplicationStagesImpl.setOsiInsolvencyId(osiInsolvencyId);

		if (caseId == null) {
			osiInsolvencyApplicationStagesImpl.setCaseId("");
		}
		else {
			osiInsolvencyApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			osiInsolvencyApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			osiInsolvencyApplicationStagesImpl.setUpdatedBySource(
				updatedBySource);
		}

		osiInsolvencyApplicationStagesImpl.resetOriginalValues();

		return osiInsolvencyApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiInsolveApplicationStagesId = objectInput.readLong();

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

		osiInsolvencyId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osiInsolveApplicationStagesId);

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

		objectOutput.writeLong(osiInsolvencyId);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (updatedBySource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(updatedBySource);
		}
	}

	public String uuid;
	public long osiInsolveApplicationStagesId;
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
	public long osiInsolvencyId;
	public String caseId;
	public String updatedBySource;

}