/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExplosivesCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExplosivesCurrentStageCacheModel
	implements CacheModel<ExplosivesCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExplosivesCurrentStageCacheModel)) {
			return false;
		}

		ExplosivesCurrentStageCacheModel explosivesCurrentStageCacheModel =
			(ExplosivesCurrentStageCacheModel)object;

		if (explosiveStageId ==
				explosivesCurrentStageCacheModel.explosiveStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, explosiveStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{explosiveStageId=");
		sb.append(explosiveStageId);
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
		sb.append(", lastFormDetailsStep=");
		sb.append(lastFormDetailsStep);
		sb.append(", explosivesApplicationId=");
		sb.append(explosivesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExplosivesCurrentStage toEntityModel() {
		ExplosivesCurrentStageImpl explosivesCurrentStageImpl =
			new ExplosivesCurrentStageImpl();

		explosivesCurrentStageImpl.setExplosiveStageId(explosiveStageId);
		explosivesCurrentStageImpl.setGroupId(groupId);
		explosivesCurrentStageImpl.setCompanyId(companyId);
		explosivesCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			explosivesCurrentStageImpl.setUserName("");
		}
		else {
			explosivesCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			explosivesCurrentStageImpl.setCreateDate(null);
		}
		else {
			explosivesCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			explosivesCurrentStageImpl.setModifiedDate(null);
		}
		else {
			explosivesCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			explosivesCurrentStageImpl.setCurrentStage("");
		}
		else {
			explosivesCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormDetailsStep == null) {
			explosivesCurrentStageImpl.setLastFormDetailsStep("");
		}
		else {
			explosivesCurrentStageImpl.setLastFormDetailsStep(
				lastFormDetailsStep);
		}

		explosivesCurrentStageImpl.setExplosivesApplicationId(
			explosivesApplicationId);

		explosivesCurrentStageImpl.resetOriginalValues();

		return explosivesCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		explosiveStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormDetailsStep = objectInput.readUTF();

		explosivesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(explosiveStageId);

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

		if (lastFormDetailsStep == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastFormDetailsStep);
		}

		objectOutput.writeLong(explosivesApplicationId);
	}

	public long explosiveStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormDetailsStep;
	public long explosivesApplicationId;

}