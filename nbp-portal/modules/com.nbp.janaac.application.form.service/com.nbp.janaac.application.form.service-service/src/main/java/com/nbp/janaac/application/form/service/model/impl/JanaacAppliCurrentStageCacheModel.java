/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JanaacAppliCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JanaacAppliCurrentStageCacheModel
	implements CacheModel<JanaacAppliCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JanaacAppliCurrentStageCacheModel)) {
			return false;
		}

		JanaacAppliCurrentStageCacheModel janaacAppliCurrentStageCacheModel =
			(JanaacAppliCurrentStageCacheModel)object;

		if (janaacAppliCurrentStageId ==
				janaacAppliCurrentStageCacheModel.janaacAppliCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, janaacAppliCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{janaacAppliCurrentStageId=");
		sb.append(janaacAppliCurrentStageId);
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
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JanaacAppliCurrentStage toEntityModel() {
		JanaacAppliCurrentStageImpl janaacAppliCurrentStageImpl =
			new JanaacAppliCurrentStageImpl();

		janaacAppliCurrentStageImpl.setJanaacAppliCurrentStageId(
			janaacAppliCurrentStageId);
		janaacAppliCurrentStageImpl.setGroupId(groupId);
		janaacAppliCurrentStageImpl.setCompanyId(companyId);
		janaacAppliCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			janaacAppliCurrentStageImpl.setUserName("");
		}
		else {
			janaacAppliCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			janaacAppliCurrentStageImpl.setCreateDate(null);
		}
		else {
			janaacAppliCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			janaacAppliCurrentStageImpl.setModifiedDate(null);
		}
		else {
			janaacAppliCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			janaacAppliCurrentStageImpl.setCurrentStage("");
		}
		else {
			janaacAppliCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			janaacAppliCurrentStageImpl.setLastFormStep("");
		}
		else {
			janaacAppliCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		janaacAppliCurrentStageImpl.setJanaacApplicationId(janaacApplicationId);

		janaacAppliCurrentStageImpl.resetOriginalValues();

		return janaacAppliCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		janaacAppliCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(janaacAppliCurrentStageId);

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

		objectOutput.writeLong(janaacApplicationId);
	}

	public long janaacAppliCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long janaacApplicationId;

}