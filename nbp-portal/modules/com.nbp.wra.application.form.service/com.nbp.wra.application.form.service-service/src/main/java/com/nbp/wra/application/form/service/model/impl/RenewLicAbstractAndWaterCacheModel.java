/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RenewLicAbstractAndWater in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RenewLicAbstractAndWaterCacheModel
	implements CacheModel<RenewLicAbstractAndWater>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RenewLicAbstractAndWaterCacheModel)) {
			return false;
		}

		RenewLicAbstractAndWaterCacheModel renewLicAbstractAndWaterCacheModel =
			(RenewLicAbstractAndWaterCacheModel)object;

		if (renewLicAbstractAndWaterId ==
				renewLicAbstractAndWaterCacheModel.renewLicAbstractAndWaterId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, renewLicAbstractAndWaterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{renewLicAbstractAndWaterId=");
		sb.append(renewLicAbstractAndWaterId);
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
		sb.append(", renewName=");
		sb.append(renewName);
		sb.append(", renewContact=");
		sb.append(renewContact);
		sb.append(", renewJobTitle=");
		sb.append(renewJobTitle);
		sb.append(", renewTelephoneNum=");
		sb.append(renewTelephoneNum);
		sb.append(", renewFaxNum=");
		sb.append(renewFaxNum);
		sb.append(", renewParishLocation=");
		sb.append(renewParishLocation);
		sb.append(", renewAddress=");
		sb.append(renewAddress);
		sb.append(", renewSourceName=");
		sb.append(renewSourceName);
		sb.append(", renewDetailsParishAdd=");
		sb.append(renewDetailsParishAdd);
		sb.append(", renewDetailsLocation=");
		sb.append(renewDetailsLocation);
		sb.append(", renewAbstractionRate=");
		sb.append(renewAbstractionRate);
		sb.append(", renewDetailsUse=");
		sb.append(renewDetailsUse);
		sb.append(", renewAbstractionMethod=");
		sb.append(renewAbstractionMethod);
		sb.append(", attachedDevice=");
		sb.append(attachedDevice);
		sb.append(", renewStateDevice=");
		sb.append(renewStateDevice);
		sb.append(", abstractionData=");
		sb.append(abstractionData);
		sb.append(", renewSignName=");
		sb.append(renewSignName);
		sb.append(", renewDate=");
		sb.append(renewDate);
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RenewLicAbstractAndWater toEntityModel() {
		RenewLicAbstractAndWaterImpl renewLicAbstractAndWaterImpl =
			new RenewLicAbstractAndWaterImpl();

		renewLicAbstractAndWaterImpl.setRenewLicAbstractAndWaterId(
			renewLicAbstractAndWaterId);
		renewLicAbstractAndWaterImpl.setGroupId(groupId);
		renewLicAbstractAndWaterImpl.setCompanyId(companyId);
		renewLicAbstractAndWaterImpl.setUserId(userId);

		if (userName == null) {
			renewLicAbstractAndWaterImpl.setUserName("");
		}
		else {
			renewLicAbstractAndWaterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			renewLicAbstractAndWaterImpl.setCreateDate(null);
		}
		else {
			renewLicAbstractAndWaterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			renewLicAbstractAndWaterImpl.setModifiedDate(null);
		}
		else {
			renewLicAbstractAndWaterImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (renewName == null) {
			renewLicAbstractAndWaterImpl.setRenewName("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewName(renewName);
		}

		if (renewContact == null) {
			renewLicAbstractAndWaterImpl.setRenewContact("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewContact(renewContact);
		}

		if (renewJobTitle == null) {
			renewLicAbstractAndWaterImpl.setRenewJobTitle("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewJobTitle(renewJobTitle);
		}

		if (renewTelephoneNum == null) {
			renewLicAbstractAndWaterImpl.setRenewTelephoneNum("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewTelephoneNum(
				renewTelephoneNum);
		}

		if (renewFaxNum == null) {
			renewLicAbstractAndWaterImpl.setRenewFaxNum("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewFaxNum(renewFaxNum);
		}

		if (renewParishLocation == null) {
			renewLicAbstractAndWaterImpl.setRenewParishLocation("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewParishLocation(
				renewParishLocation);
		}

		if (renewAddress == null) {
			renewLicAbstractAndWaterImpl.setRenewAddress("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewAddress(renewAddress);
		}

		if (renewSourceName == null) {
			renewLicAbstractAndWaterImpl.setRenewSourceName("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewSourceName(renewSourceName);
		}

		if (renewDetailsParishAdd == null) {
			renewLicAbstractAndWaterImpl.setRenewDetailsParishAdd("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewDetailsParishAdd(
				renewDetailsParishAdd);
		}

		if (renewDetailsLocation == null) {
			renewLicAbstractAndWaterImpl.setRenewDetailsLocation("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewDetailsLocation(
				renewDetailsLocation);
		}

		if (renewAbstractionRate == null) {
			renewLicAbstractAndWaterImpl.setRenewAbstractionRate("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewAbstractionRate(
				renewAbstractionRate);
		}

		if (renewDetailsUse == null) {
			renewLicAbstractAndWaterImpl.setRenewDetailsUse("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewDetailsUse(renewDetailsUse);
		}

		if (renewAbstractionMethod == null) {
			renewLicAbstractAndWaterImpl.setRenewAbstractionMethod("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewAbstractionMethod(
				renewAbstractionMethod);
		}

		if (attachedDevice == null) {
			renewLicAbstractAndWaterImpl.setAttachedDevice("");
		}
		else {
			renewLicAbstractAndWaterImpl.setAttachedDevice(attachedDevice);
		}

		if (renewStateDevice == null) {
			renewLicAbstractAndWaterImpl.setRenewStateDevice("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewStateDevice(renewStateDevice);
		}

		if (abstractionData == null) {
			renewLicAbstractAndWaterImpl.setAbstractionData("");
		}
		else {
			renewLicAbstractAndWaterImpl.setAbstractionData(abstractionData);
		}

		if (renewSignName == null) {
			renewLicAbstractAndWaterImpl.setRenewSignName("");
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewSignName(renewSignName);
		}

		if (renewDate == Long.MIN_VALUE) {
			renewLicAbstractAndWaterImpl.setRenewDate(null);
		}
		else {
			renewLicAbstractAndWaterImpl.setRenewDate(new Date(renewDate));
		}

		renewLicAbstractAndWaterImpl.setWraApplicationId(wraApplicationId);

		renewLicAbstractAndWaterImpl.resetOriginalValues();

		return renewLicAbstractAndWaterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		renewLicAbstractAndWaterId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		renewName = objectInput.readUTF();
		renewContact = objectInput.readUTF();
		renewJobTitle = objectInput.readUTF();
		renewTelephoneNum = objectInput.readUTF();
		renewFaxNum = objectInput.readUTF();
		renewParishLocation = objectInput.readUTF();
		renewAddress = objectInput.readUTF();
		renewSourceName = objectInput.readUTF();
		renewDetailsParishAdd = objectInput.readUTF();
		renewDetailsLocation = objectInput.readUTF();
		renewAbstractionRate = objectInput.readUTF();
		renewDetailsUse = objectInput.readUTF();
		renewAbstractionMethod = objectInput.readUTF();
		attachedDevice = objectInput.readUTF();
		renewStateDevice = objectInput.readUTF();
		abstractionData = objectInput.readUTF();
		renewSignName = objectInput.readUTF();
		renewDate = objectInput.readLong();

		wraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(renewLicAbstractAndWaterId);

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

		if (renewName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewName);
		}

		if (renewContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewContact);
		}

		if (renewJobTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewJobTitle);
		}

		if (renewTelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewTelephoneNum);
		}

		if (renewFaxNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewFaxNum);
		}

		if (renewParishLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewParishLocation);
		}

		if (renewAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewAddress);
		}

		if (renewSourceName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewSourceName);
		}

		if (renewDetailsParishAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewDetailsParishAdd);
		}

		if (renewDetailsLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewDetailsLocation);
		}

		if (renewAbstractionRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewAbstractionRate);
		}

		if (renewDetailsUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewDetailsUse);
		}

		if (renewAbstractionMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewAbstractionMethod);
		}

		if (attachedDevice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attachedDevice);
		}

		if (renewStateDevice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewStateDevice);
		}

		if (abstractionData == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(abstractionData);
		}

		if (renewSignName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewSignName);
		}

		objectOutput.writeLong(renewDate);

		objectOutput.writeLong(wraApplicationId);
	}

	public long renewLicAbstractAndWaterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String renewName;
	public String renewContact;
	public String renewJobTitle;
	public String renewTelephoneNum;
	public String renewFaxNum;
	public String renewParishLocation;
	public String renewAddress;
	public String renewSourceName;
	public String renewDetailsParishAdd;
	public String renewDetailsLocation;
	public String renewAbstractionRate;
	public String renewDetailsUse;
	public String renewAbstractionMethod;
	public String attachedDevice;
	public String renewStateDevice;
	public String abstractionData;
	public String renewSignName;
	public long renewDate;
	public long wraApplicationId;

}