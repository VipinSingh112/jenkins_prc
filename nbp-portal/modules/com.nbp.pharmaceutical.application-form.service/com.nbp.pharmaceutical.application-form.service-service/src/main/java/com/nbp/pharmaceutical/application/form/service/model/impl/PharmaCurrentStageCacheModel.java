/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PharmaCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaCurrentStageCacheModel
	implements CacheModel<PharmaCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaCurrentStageCacheModel)) {
			return false;
		}

		PharmaCurrentStageCacheModel pharmaCurrentStageCacheModel =
			(PharmaCurrentStageCacheModel)object;

		if (pharmaCurrentStageId ==
				pharmaCurrentStageCacheModel.pharmaCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{pharmaCurrentStageId=");
		sb.append(pharmaCurrentStageId);
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
		sb.append(", pharmaApplicationId=");
		sb.append(pharmaApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaCurrentStage toEntityModel() {
		PharmaCurrentStageImpl pharmaCurrentStageImpl =
			new PharmaCurrentStageImpl();

		pharmaCurrentStageImpl.setPharmaCurrentStageId(pharmaCurrentStageId);
		pharmaCurrentStageImpl.setGroupId(groupId);
		pharmaCurrentStageImpl.setCompanyId(companyId);
		pharmaCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			pharmaCurrentStageImpl.setUserName("");
		}
		else {
			pharmaCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pharmaCurrentStageImpl.setCreateDate(null);
		}
		else {
			pharmaCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pharmaCurrentStageImpl.setModifiedDate(null);
		}
		else {
			pharmaCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			pharmaCurrentStageImpl.setCurrentStage("");
		}
		else {
			pharmaCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStage == null) {
			pharmaCurrentStageImpl.setLastFormStage("");
		}
		else {
			pharmaCurrentStageImpl.setLastFormStage(lastFormStage);
		}

		pharmaCurrentStageImpl.setPharmaApplicationId(pharmaApplicationId);

		pharmaCurrentStageImpl.resetOriginalValues();

		return pharmaCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStage = objectInput.readUTF();

		pharmaApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaCurrentStageId);

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

		objectOutput.writeLong(pharmaApplicationId);
	}

	public long pharmaCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStage;
	public long pharmaApplicationId;

}