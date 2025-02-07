/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuEquipmentAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuEquipmentAddCacheModel
	implements CacheModel<ManuEquipmentAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuEquipmentAddCacheModel)) {
			return false;
		}

		ManuEquipmentAddCacheModel manuEquipmentAddCacheModel =
			(ManuEquipmentAddCacheModel)object;

		if (manuEquipmentAddId ==
				manuEquipmentAddCacheModel.manuEquipmentAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuEquipmentAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{manuEquipmentAddId=");
		sb.append(manuEquipmentAddId);
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
		sb.append(", equipmentName=");
		sb.append(equipmentName);
		sb.append(", jamaicanDollor=");
		sb.append(jamaicanDollor);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append(", manuEquipmentId=");
		sb.append(manuEquipmentId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuEquipmentAdd toEntityModel() {
		ManuEquipmentAddImpl manuEquipmentAddImpl = new ManuEquipmentAddImpl();

		manuEquipmentAddImpl.setManuEquipmentAddId(manuEquipmentAddId);
		manuEquipmentAddImpl.setGroupId(groupId);
		manuEquipmentAddImpl.setCompanyId(companyId);
		manuEquipmentAddImpl.setUserId(userId);

		if (userName == null) {
			manuEquipmentAddImpl.setUserName("");
		}
		else {
			manuEquipmentAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuEquipmentAddImpl.setCreateDate(null);
		}
		else {
			manuEquipmentAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuEquipmentAddImpl.setModifiedDate(null);
		}
		else {
			manuEquipmentAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (equipmentName == null) {
			manuEquipmentAddImpl.setEquipmentName("");
		}
		else {
			manuEquipmentAddImpl.setEquipmentName(equipmentName);
		}

		if (jamaicanDollor == null) {
			manuEquipmentAddImpl.setJamaicanDollor("");
		}
		else {
			manuEquipmentAddImpl.setJamaicanDollor(jamaicanDollor);
		}

		if (counter == null) {
			manuEquipmentAddImpl.setCounter("");
		}
		else {
			manuEquipmentAddImpl.setCounter(counter);
		}

		manuEquipmentAddImpl.setManufacturingApplicationId(
			manufacturingApplicationId);
		manuEquipmentAddImpl.setManuEquipmentId(manuEquipmentId);

		manuEquipmentAddImpl.resetOriginalValues();

		return manuEquipmentAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuEquipmentAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		equipmentName = objectInput.readUTF();
		jamaicanDollor = objectInput.readUTF();
		counter = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();

		manuEquipmentId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuEquipmentAddId);

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

		if (equipmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentName);
		}

		if (jamaicanDollor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jamaicanDollor);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(manufacturingApplicationId);

		objectOutput.writeLong(manuEquipmentId);
	}

	public long manuEquipmentAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String equipmentName;
	public String jamaicanDollor;
	public String counter;
	public long manufacturingApplicationId;
	public long manuEquipmentId;

}