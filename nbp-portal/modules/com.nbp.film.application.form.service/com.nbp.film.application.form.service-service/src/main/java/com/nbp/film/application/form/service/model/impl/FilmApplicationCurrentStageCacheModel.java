/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmApplicationCurrentStageCacheModel
	implements CacheModel<FilmApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmApplicationCurrentStageCacheModel)) {
			return false;
		}

		FilmApplicationCurrentStageCacheModel
			filmApplicationCurrentStageCacheModel =
				(FilmApplicationCurrentStageCacheModel)object;

		if (filmApplicationCurrentStageId ==
				filmApplicationCurrentStageCacheModel.
					filmApplicationCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmApplicationCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{filmApplicationCurrentStageId=");
		sb.append(filmApplicationCurrentStageId);
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
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmApplicationCurrentStage toEntityModel() {
		FilmApplicationCurrentStageImpl filmApplicationCurrentStageImpl =
			new FilmApplicationCurrentStageImpl();

		filmApplicationCurrentStageImpl.setFilmApplicationCurrentStageId(
			filmApplicationCurrentStageId);
		filmApplicationCurrentStageImpl.setGroupId(groupId);
		filmApplicationCurrentStageImpl.setCompanyId(companyId);
		filmApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			filmApplicationCurrentStageImpl.setUserName("");
		}
		else {
			filmApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			filmApplicationCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			filmApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			filmApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			filmApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStage == null) {
			filmApplicationCurrentStageImpl.setLastFormStage("");
		}
		else {
			filmApplicationCurrentStageImpl.setLastFormStage(lastFormStage);
		}

		filmApplicationCurrentStageImpl.setFilmApplicationId(filmApplicationId);

		filmApplicationCurrentStageImpl.resetOriginalValues();

		return filmApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmApplicationCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStage = objectInput.readUTF();

		filmApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmApplicationCurrentStageId);

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

		objectOutput.writeLong(filmApplicationId);
	}

	public long filmApplicationCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStage;
	public long filmApplicationId;

}