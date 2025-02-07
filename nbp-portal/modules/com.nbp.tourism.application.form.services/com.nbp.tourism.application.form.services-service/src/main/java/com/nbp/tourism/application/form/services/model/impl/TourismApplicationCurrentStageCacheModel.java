/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismApplicationCurrentStage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismApplicationCurrentStage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismApplicationCurrentStageCacheModel
	implements CacheModel<TourismApplicationCurrentStage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismApplicationCurrentStageCacheModel)) {
			return false;
		}

		TourismApplicationCurrentStageCacheModel
			tourismApplicationCurrentStageCacheModel =
				(TourismApplicationCurrentStageCacheModel)object;

		if (tourismAppliCurrentStageId ==
				tourismApplicationCurrentStageCacheModel.
					tourismAppliCurrentStageId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismAppliCurrentStageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{tourismAppliCurrentStageId=");
		sb.append(tourismAppliCurrentStageId);
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
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismApplicationCurrentStage toEntityModel() {
		TourismApplicationCurrentStageImpl tourismApplicationCurrentStageImpl =
			new TourismApplicationCurrentStageImpl();

		tourismApplicationCurrentStageImpl.setTourismAppliCurrentStageId(
			tourismAppliCurrentStageId);
		tourismApplicationCurrentStageImpl.setGroupId(groupId);
		tourismApplicationCurrentStageImpl.setCompanyId(companyId);
		tourismApplicationCurrentStageImpl.setUserId(userId);

		if (userName == null) {
			tourismApplicationCurrentStageImpl.setUserName("");
		}
		else {
			tourismApplicationCurrentStageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismApplicationCurrentStageImpl.setCreateDate(null);
		}
		else {
			tourismApplicationCurrentStageImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismApplicationCurrentStageImpl.setModifiedDate(null);
		}
		else {
			tourismApplicationCurrentStageImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (currentStage == null) {
			tourismApplicationCurrentStageImpl.setCurrentStage("");
		}
		else {
			tourismApplicationCurrentStageImpl.setCurrentStage(currentStage);
		}

		if (lastFormStep == null) {
			tourismApplicationCurrentStageImpl.setLastFormStep("");
		}
		else {
			tourismApplicationCurrentStageImpl.setLastFormStep(lastFormStep);
		}

		tourismApplicationCurrentStageImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismApplicationCurrentStageImpl.resetOriginalValues();

		return tourismApplicationCurrentStageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismAppliCurrentStageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		currentStage = objectInput.readUTF();
		lastFormStep = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismAppliCurrentStageId);

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

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismAppliCurrentStageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String currentStage;
	public String lastFormStep;
	public long tourismApplicationId;

}