/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OSIServiceCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OSIServiceCurrentStageCacheModel
	implements CacheModel<OSIServiceCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OSIServiceCurrentStageCacheModel)) {
			return false;
		}

		OSIServiceCurrentStageCacheModel osiServiceCurrentStageCacheModel =
			(OSIServiceCurrentStageCacheModel)object;

		if (osiCurrentStageId ==
				osiServiceCurrentStageCacheModel.osiCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{osiCurrentStageId=");
		sb.append(osiCurrentStageId);
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
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OSIServiceCurrentStage toEntityModel() {
		OSIServiceCurrentStageImpl osiServiceCurrentStageImpl =
			new OSIServiceCurrentStageImpl();

		osiServiceCurrentStageImpl.setOsiCurrentStageId(osiCurrentStageId);
		osiServiceCurrentStageImpl.setGroupId(groupId);
		osiServiceCurrentStageImpl.setCompanyId(companyId);
		osiServiceCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			osiServiceCurrentStageImpl.setUserName("");
		}
		else {
			osiServiceCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServiceCurrentStageImpl.setCreateDate(null);
		}
		else {
			osiServiceCurrentStageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServiceCurrentStageImpl.setModifiedDate(null);
		}
		else {
			osiServiceCurrentStageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (currentStage == null) {
			osiServiceCurrentStageImpl.setCurrentStage("");
		}
		else {
			osiServiceCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormDetailsStep == null) {
			osiServiceCurrentStageImpl.setLastFormDetailsStep("");
		}
		else {
			osiServiceCurrentStageImpl.setLastFormDetailsStep(
				lastFormDetailsStep);
		}

		osiServiceCurrentStageImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServiceCurrentStageImpl.resetOriginalValues();

		return osiServiceCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormDetailsStep = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiCurrentStageId);

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

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public long osiCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormDetailsStep;
	public long osiServicesApplicationId;

}