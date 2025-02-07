/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadiationDevicesDetailAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadiationDevicesDetailAddCacheModel
	implements CacheModel<RadiationDevicesDetailAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadiationDevicesDetailAddCacheModel)) {
			return false;
		}

		RadiationDevicesDetailAddCacheModel
			radiationDevicesDetailAddCacheModel =
				(RadiationDevicesDetailAddCacheModel)object;

		if (radiationDevicesDetailAddId ==
				radiationDevicesDetailAddCacheModel.
					radiationDevicesDetailAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radiationDevicesDetailAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{radiationDevicesDetailAddId=");
		sb.append(radiationDevicesDetailAddId);
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
	public RadiationDevicesDetailAdd toEntityModel() {
		RadiationDevicesDetailAddImpl radiationDevicesDetailAddImpl =
			new RadiationDevicesDetailAddImpl();

		radiationDevicesDetailAddImpl.setRadiationDevicesDetailAddId(
			radiationDevicesDetailAddId);
		radiationDevicesDetailAddImpl.setGroupId(groupId);
		radiationDevicesDetailAddImpl.setCompanyId(companyId);
		radiationDevicesDetailAddImpl.setUserId(userId);

		if (userName == null) {
			radiationDevicesDetailAddImpl.setUserName("");
		}
		else {
			radiationDevicesDetailAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radiationDevicesDetailAddImpl.setCreateDate(null);
		}
		else {
			radiationDevicesDetailAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radiationDevicesDetailAddImpl.setModifiedDate(null);
		}
		else {
			radiationDevicesDetailAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (radiationDevicesRadio == null) {
			radiationDevicesDetailAddImpl.setRadiationDevicesRadio("");
		}
		else {
			radiationDevicesDetailAddImpl.setRadiationDevicesRadio(
				radiationDevicesRadio);
		}

		if (radiationDevicesMaxActivity == null) {
			radiationDevicesDetailAddImpl.setRadiationDevicesMaxActivity("");
		}
		else {
			radiationDevicesDetailAddImpl.setRadiationDevicesMaxActivity(
				radiationDevicesMaxActivity);
		}

		if (radiationDevicesManufacturer == null) {
			radiationDevicesDetailAddImpl.setRadiationDevicesManufacturer("");
		}
		else {
			radiationDevicesDetailAddImpl.setRadiationDevicesManufacturer(
				radiationDevicesManufacturer);
		}

		if (radiationDevicesName == null) {
			radiationDevicesDetailAddImpl.setRadiationDevicesName("");
		}
		else {
			radiationDevicesDetailAddImpl.setRadiationDevicesName(
				radiationDevicesName);
		}

		if (radiationDevicesModelNo == null) {
			radiationDevicesDetailAddImpl.setRadiationDevicesModelNo("");
		}
		else {
			radiationDevicesDetailAddImpl.setRadiationDevicesModelNo(
				radiationDevicesModelNo);
		}

		if (radiationDevicesNumber == null) {
			radiationDevicesDetailAddImpl.setRadiationDevicesNumber("");
		}
		else {
			radiationDevicesDetailAddImpl.setRadiationDevicesNumber(
				radiationDevicesNumber);
		}

		if (radiationDevicesUse == null) {
			radiationDevicesDetailAddImpl.setRadiationDevicesUse("");
		}
		else {
			radiationDevicesDetailAddImpl.setRadiationDevicesUse(
				radiationDevicesUse);
		}

		if (counter == null) {
			radiationDevicesDetailAddImpl.setCounter("");
		}
		else {
			radiationDevicesDetailAddImpl.setCounter(counter);
		}

		radiationDevicesDetailAddImpl.setHsraApplicationId(hsraApplicationId);

		radiationDevicesDetailAddImpl.resetOriginalValues();

		return radiationDevicesDetailAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radiationDevicesDetailAddId = objectInput.readLong();

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
		objectOutput.writeLong(radiationDevicesDetailAddId);

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

	public long radiationDevicesDetailAddId;
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