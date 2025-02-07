/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesInsolventPersoninfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesInsolventPersoninfoCacheModel
	implements CacheModel<OsiServicesInsolventPersoninfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiServicesInsolventPersoninfoCacheModel)) {
			return false;
		}

		OsiServicesInsolventPersoninfoCacheModel
			osiServicesInsolventPersoninfoCacheModel =
				(OsiServicesInsolventPersoninfoCacheModel)object;

		if (osiServicesInsoId ==
				osiServicesInsolventPersoninfoCacheModel.osiServicesInsoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiServicesInsoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiServicesInsoId=");
		sb.append(osiServicesInsoId);
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
		sb.append(", insolventPersonNature=");
		sb.append(insolventPersonNature);
		sb.append(", insolventIndiFirstName=");
		sb.append(insolventIndiFirstName);
		sb.append(", insolventIndiLastName=");
		sb.append(insolventIndiLastName);
		sb.append(", insolventCompanyName=");
		sb.append(insolventCompanyName);
		sb.append(", insolventAddress=");
		sb.append(insolventAddress);
		sb.append(", insolventParish=");
		sb.append(insolventParish);
		sb.append(", insolventEmailAddress=");
		sb.append(insolventEmailAddress);
		sb.append(", insolventTelephone=");
		sb.append(insolventTelephone);
		sb.append(", insolventApplicationDate=");
		sb.append(insolventApplicationDate);
		sb.append(", insolventTrnNumber=");
		sb.append(insolventTrnNumber);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesInsolventPersoninfo toEntityModel() {
		OsiServicesInsolventPersoninfoImpl osiServicesInsolventPersoninfoImpl =
			new OsiServicesInsolventPersoninfoImpl();

		if (uuid == null) {
			osiServicesInsolventPersoninfoImpl.setUuid("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setUuid(uuid);
		}

		osiServicesInsolventPersoninfoImpl.setOsiServicesInsoId(
			osiServicesInsoId);
		osiServicesInsolventPersoninfoImpl.setGroupId(groupId);
		osiServicesInsolventPersoninfoImpl.setCompanyId(companyId);
		osiServicesInsolventPersoninfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesInsolventPersoninfoImpl.setUserName("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesInsolventPersoninfoImpl.setCreateDate(null);
		}
		else {
			osiServicesInsolventPersoninfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesInsolventPersoninfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesInsolventPersoninfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (insolventPersonNature == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventPersonNature("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventPersonNature(
				insolventPersonNature);
		}

		if (insolventIndiFirstName == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventIndiFirstName("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventIndiFirstName(
				insolventIndiFirstName);
		}

		if (insolventIndiLastName == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventIndiLastName("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventIndiLastName(
				insolventIndiLastName);
		}

		if (insolventCompanyName == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventCompanyName("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventCompanyName(
				insolventCompanyName);
		}

		if (insolventAddress == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventAddress("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventAddress(
				insolventAddress);
		}

		if (insolventParish == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventParish("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventParish(
				insolventParish);
		}

		if (insolventEmailAddress == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventEmailAddress("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventEmailAddress(
				insolventEmailAddress);
		}

		if (insolventTelephone == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventTelephone("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventTelephone(
				insolventTelephone);
		}

		if (insolventApplicationDate == Long.MIN_VALUE) {
			osiServicesInsolventPersoninfoImpl.setInsolventApplicationDate(
				null);
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventApplicationDate(
				new Date(insolventApplicationDate));
		}

		if (insolventTrnNumber == null) {
			osiServicesInsolventPersoninfoImpl.setInsolventTrnNumber("");
		}
		else {
			osiServicesInsolventPersoninfoImpl.setInsolventTrnNumber(
				insolventTrnNumber);
		}

		osiServicesInsolventPersoninfoImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesInsolventPersoninfoImpl.resetOriginalValues();

		return osiServicesInsolventPersoninfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiServicesInsoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		insolventPersonNature = objectInput.readUTF();
		insolventIndiFirstName = objectInput.readUTF();
		insolventIndiLastName = objectInput.readUTF();
		insolventCompanyName = objectInput.readUTF();
		insolventAddress = objectInput.readUTF();
		insolventParish = objectInput.readUTF();
		insolventEmailAddress = objectInput.readUTF();
		insolventTelephone = objectInput.readUTF();
		insolventApplicationDate = objectInput.readLong();
		insolventTrnNumber = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osiServicesInsoId);

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

		if (insolventPersonNature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventPersonNature);
		}

		if (insolventIndiFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventIndiFirstName);
		}

		if (insolventIndiLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventIndiLastName);
		}

		if (insolventCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventCompanyName);
		}

		if (insolventAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventAddress);
		}

		if (insolventParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventParish);
		}

		if (insolventEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventEmailAddress);
		}

		if (insolventTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventTelephone);
		}

		objectOutput.writeLong(insolventApplicationDate);

		if (insolventTrnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insolventTrnNumber);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiServicesInsoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String insolventPersonNature;
	public String insolventIndiFirstName;
	public String insolventIndiLastName;
	public String insolventCompanyName;
	public String insolventAddress;
	public String insolventParish;
	public String insolventEmailAddress;
	public String insolventTelephone;
	public long insolventApplicationDate;
	public String insolventTrnNumber;
	public long osiServicesApplicationId;

}