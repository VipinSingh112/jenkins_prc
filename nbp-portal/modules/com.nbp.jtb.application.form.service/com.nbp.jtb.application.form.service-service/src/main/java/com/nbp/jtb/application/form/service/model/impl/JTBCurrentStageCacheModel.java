/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JTBCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JTBCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JTBCurrentStageCacheModel
	implements CacheModel<JTBCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JTBCurrentStageCacheModel)) {
			return false;
		}

		JTBCurrentStageCacheModel jtbCurrentStageCacheModel =
			(JTBCurrentStageCacheModel)object;

		if (jTBCurrentStageId == jtbCurrentStageCacheModel.jTBCurrentStageId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jTBCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jTBCurrentStageId=");
		sb.append(jTBCurrentStageId);
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
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JTBCurrentStage toEntityModel() {
		JTBCurrentStageImpl jtbCurrentStageImpl = new JTBCurrentStageImpl();

		jtbCurrentStageImpl.setJTBCurrentStageId(jTBCurrentStageId);
		jtbCurrentStageImpl.setGroupId(groupId);
		jtbCurrentStageImpl.setCompanyId(companyId);
		jtbCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			jtbCurrentStageImpl.setUserName("");
		}
		else {
			jtbCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbCurrentStageImpl.setCreateDate(null);
		}
		else {
			jtbCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbCurrentStageImpl.setModifiedDate(null);
		}
		else {
			jtbCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			jtbCurrentStageImpl.setCurrentStage("");
		}
		else {
			jtbCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			jtbCurrentStageImpl.setLastFormStep("");
		}
		else {
			jtbCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		jtbCurrentStageImpl.setJtbApplicationId(jtbApplicationId);

		jtbCurrentStageImpl.resetOriginalValues();

		return jtbCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jTBCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jTBCurrentStageId);

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

		objectOutput.writeLong(jtbApplicationId);
	}

	public long jTBCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long jtbApplicationId;

}