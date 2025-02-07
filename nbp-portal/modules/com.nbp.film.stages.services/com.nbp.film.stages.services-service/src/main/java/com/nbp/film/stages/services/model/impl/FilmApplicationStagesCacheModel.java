/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.stages.services.model.FilmApplicationStages;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmApplicationStages in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmApplicationStagesCacheModel
	implements CacheModel<FilmApplicationStages>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmApplicationStagesCacheModel)) {
			return false;
		}

		FilmApplicationStagesCacheModel filmApplicationStagesCacheModel =
			(FilmApplicationStagesCacheModel)object;

		if (filmApplicationStagesId ==
				filmApplicationStagesCacheModel.filmApplicationStagesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmApplicationStagesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{filmApplicationStagesId=");
		sb.append(filmApplicationStagesId);
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
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", updatedBySource=");
		sb.append(updatedBySource);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmApplicationStages toEntityModel() {
		FilmApplicationStagesImpl filmApplicationStagesImpl =
			new FilmApplicationStagesImpl();

		filmApplicationStagesImpl.setFilmApplicationStagesId(
			filmApplicationStagesId);
		filmApplicationStagesImpl.setGroupId(groupId);
		filmApplicationStagesImpl.setCompanyId(companyId);
		filmApplicationStagesImpl.setUserId(userId);

		if (userName == null) {
			filmApplicationStagesImpl.setUserName("");
		}
		else {
			filmApplicationStagesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmApplicationStagesImpl.setCreateDate(null);
		}
		else {
			filmApplicationStagesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmApplicationStagesImpl.setModifiedDate(null);
		}
		else {
			filmApplicationStagesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageName == null) {
			filmApplicationStagesImpl.setStageName("");
		}
		else {
			filmApplicationStagesImpl.setStageName(stageName);
		}

		if (duration == null) {
			filmApplicationStagesImpl.setDuration("");
		}
		else {
			filmApplicationStagesImpl.setDuration(duration);
		}

		if (stageStatus == null) {
			filmApplicationStagesImpl.setStageStatus("");
		}
		else {
			filmApplicationStagesImpl.setStageStatus(stageStatus);
		}

		if (stageStartDate == Long.MIN_VALUE) {
			filmApplicationStagesImpl.setStageStartDate(null);
		}
		else {
			filmApplicationStagesImpl.setStageStartDate(
				new Date(stageStartDate));
		}

		if (stageEndDate == Long.MIN_VALUE) {
			filmApplicationStagesImpl.setStageEndDate(null);
		}
		else {
			filmApplicationStagesImpl.setStageEndDate(new Date(stageEndDate));
		}

		filmApplicationStagesImpl.setFilmApplicationId(filmApplicationId);

		if (caseId == null) {
			filmApplicationStagesImpl.setCaseId("");
		}
		else {
			filmApplicationStagesImpl.setCaseId(caseId);
		}

		if (updatedBySource == null) {
			filmApplicationStagesImpl.setUpdatedBySource("");
		}
		else {
			filmApplicationStagesImpl.setUpdatedBySource(updatedBySource);
		}

		filmApplicationStagesImpl.resetOriginalValues();

		return filmApplicationStagesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmApplicationStagesId = objectInput.readLong();

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

		filmApplicationId = objectInput.readLong();
		caseId = objectInput.readUTF();
		updatedBySource = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmApplicationStagesId);

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

		objectOutput.writeLong(filmApplicationId);

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

	public long filmApplicationStagesId;
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
	public long filmApplicationId;
	public String caseId;
	public String updatedBySource;

}