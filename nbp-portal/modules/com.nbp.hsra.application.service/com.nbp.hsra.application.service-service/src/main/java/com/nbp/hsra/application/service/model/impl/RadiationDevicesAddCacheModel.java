/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadiationDevicesAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadiationDevicesAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadiationDevicesAddCacheModel
	implements CacheModel<RadiationDevicesAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadiationDevicesAddCacheModel)) {
			return false;
		}

		RadiationDevicesAddCacheModel radiationDevicesAddCacheModel =
			(RadiationDevicesAddCacheModel)object;

		if (radiationDevicesAddId ==
				radiationDevicesAddCacheModel.radiationDevicesAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radiationDevicesAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{radiationDevicesAddId=");
		sb.append(radiationDevicesAddId);
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
		sb.append(", radiationDevicesRadio=");
		sb.append(radiationDevicesRadio);
		sb.append(", radiationDevicesMaxActivity=");
		sb.append(radiationDevicesMaxActivity);
		sb.append(", radiationDevicesManufacturer=");
		sb.append(radiationDevicesManufacturer);
		sb.append(", radiationDevicesName=");
		sb.append(radiationDevicesName);
		sb.append(", radiationDevicesModelNo=");
		sb.append(radiationDevicesModelNo);
		sb.append(", radiationDevicesNumber=");
		sb.append(radiationDevicesNumber);
		sb.append(", radiationDevicesUse=");
		sb.append(radiationDevicesUse);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RadiationDevicesAdd toEntityModel() {
		RadiationDevicesAddImpl radiationDevicesAddImpl =
			new RadiationDevicesAddImpl();

		radiationDevicesAddImpl.setRadiationDevicesAddId(radiationDevicesAddId);
		radiationDevicesAddImpl.setGroupId(groupId);
		radiationDevicesAddImpl.setCompanyId(companyId);
		radiationDevicesAddImpl.setUserId(userId);

		if (userName == null) {
			radiationDevicesAddImpl.setUserName("");
		}
		else {
			radiationDevicesAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radiationDevicesAddImpl.setCreateDate(null);
		}
		else {
			radiationDevicesAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radiationDevicesAddImpl.setModifiedDate(null);
		}
		else {
			radiationDevicesAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (radiationDevicesRadio == null) {
			radiationDevicesAddImpl.setRadiationDevicesRadio("");
		}
		else {
			radiationDevicesAddImpl.setRadiationDevicesRadio(
				radiationDevicesRadio);
		}

		if (radiationDevicesMaxActivity == null) {
			radiationDevicesAddImpl.setRadiationDevicesMaxActivity("");
		}
		else {
			radiationDevicesAddImpl.setRadiationDevicesMaxActivity(
				radiationDevicesMaxActivity);
		}

		if (radiationDevicesManufacturer == null) {
			radiationDevicesAddImpl.setRadiationDevicesManufacturer("");
		}
		else {
			radiationDevicesAddImpl.setRadiationDevicesManufacturer(
				radiationDevicesManufacturer);
		}

		if (radiationDevicesName == null) {
			radiationDevicesAddImpl.setRadiationDevicesName("");
		}
		else {
			radiationDevicesAddImpl.setRadiationDevicesName(
				radiationDevicesName);
		}

		if (radiationDevicesModelNo == null) {
			radiationDevicesAddImpl.setRadiationDevicesModelNo("");
		}
		else {
			radiationDevicesAddImpl.setRadiationDevicesModelNo(
				radiationDevicesModelNo);
		}

		if (radiationDevicesNumber == null) {
			radiationDevicesAddImpl.setRadiationDevicesNumber("");
		}
		else {
			radiationDevicesAddImpl.setRadiationDevicesNumber(
				radiationDevicesNumber);
		}

		if (radiationDevicesUse == null) {
			radiationDevicesAddImpl.setRadiationDevicesUse("");
		}
		else {
			radiationDevicesAddImpl.setRadiationDevicesUse(radiationDevicesUse);
		}

		if (counter == null) {
			radiationDevicesAddImpl.setCounter("");
		}
		else {
			radiationDevicesAddImpl.setCounter(counter);
		}

		radiationDevicesAddImpl.setHsraApplicationId(hsraApplicationId);

		radiationDevicesAddImpl.resetOriginalValues();

		return radiationDevicesAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radiationDevicesAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		radiationDevicesRadio = objectInput.readUTF();
		radiationDevicesMaxActivity = objectInput.readUTF();
		radiationDevicesManufacturer = objectInput.readUTF();
		radiationDevicesName = objectInput.readUTF();
		radiationDevicesModelNo = objectInput.readUTF();
		radiationDevicesNumber = objectInput.readUTF();
		radiationDevicesUse = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(radiationDevicesAddId);

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

		if (radiationDevicesRadio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationDevicesRadio);
		}

		if (radiationDevicesMaxActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationDevicesMaxActivity);
		}

		if (radiationDevicesManufacturer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationDevicesManufacturer);
		}

		if (radiationDevicesName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationDevicesName);
		}

		if (radiationDevicesModelNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationDevicesModelNo);
		}

		if (radiationDevicesNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationDevicesNumber);
		}

		if (radiationDevicesUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(radiationDevicesUse);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long radiationDevicesAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String radiationDevicesRadio;
	public String radiationDevicesMaxActivity;
	public String radiationDevicesManufacturer;
	public String radiationDevicesName;
	public String radiationDevicesModelNo;
	public String radiationDevicesNumber;
	public String radiationDevicesUse;
	public String counter;
	public long hsraApplicationId;

}