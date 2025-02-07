/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCCertificateOfVeracity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCCertificateOfVeracityCacheModel
	implements CacheModel<JADSCCertificateOfVeracity>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCCertificateOfVeracityCacheModel)) {
			return false;
		}

		JADSCCertificateOfVeracityCacheModel
			jadscCertificateOfVeracityCacheModel =
				(JADSCCertificateOfVeracityCacheModel)object;

		if (jadscCOVId == jadscCertificateOfVeracityCacheModel.jadscCOVId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscCOVId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscCOVId=");
		sb.append(jadscCOVId);
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
		sb.append(", veracityComName=");
		sb.append(veracityComName);
		sb.append(", veracityComPosition=");
		sb.append(veracityComPosition);
		sb.append(", veracityComCompany=");
		sb.append(veracityComCompany);
		sb.append(", veracitySignedDate=");
		sb.append(veracitySignedDate);
		sb.append(", veracitySignedTelephone=");
		sb.append(veracitySignedTelephone);
		sb.append(", veracitySignedFax=");
		sb.append(veracitySignedFax);
		sb.append(", veracitySignedAddress=");
		sb.append(veracitySignedAddress);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCCertificateOfVeracity toEntityModel() {
		JADSCCertificateOfVeracityImpl jadscCertificateOfVeracityImpl =
			new JADSCCertificateOfVeracityImpl();

		if (uuid == null) {
			jadscCertificateOfVeracityImpl.setUuid("");
		}
		else {
			jadscCertificateOfVeracityImpl.setUuid(uuid);
		}

		jadscCertificateOfVeracityImpl.setJadscCOVId(jadscCOVId);
		jadscCertificateOfVeracityImpl.setGroupId(groupId);
		jadscCertificateOfVeracityImpl.setCompanyId(companyId);
		jadscCertificateOfVeracityImpl.setUserId(userId);

		if (userName == null) {
			jadscCertificateOfVeracityImpl.setUserName("");
		}
		else {
			jadscCertificateOfVeracityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscCertificateOfVeracityImpl.setCreateDate(null);
		}
		else {
			jadscCertificateOfVeracityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscCertificateOfVeracityImpl.setModifiedDate(null);
		}
		else {
			jadscCertificateOfVeracityImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (veracityComName == null) {
			jadscCertificateOfVeracityImpl.setVeracityComName("");
		}
		else {
			jadscCertificateOfVeracityImpl.setVeracityComName(veracityComName);
		}

		if (veracityComPosition == null) {
			jadscCertificateOfVeracityImpl.setVeracityComPosition("");
		}
		else {
			jadscCertificateOfVeracityImpl.setVeracityComPosition(
				veracityComPosition);
		}

		if (veracityComCompany == null) {
			jadscCertificateOfVeracityImpl.setVeracityComCompany("");
		}
		else {
			jadscCertificateOfVeracityImpl.setVeracityComCompany(
				veracityComCompany);
		}

		if (veracitySignedDate == Long.MIN_VALUE) {
			jadscCertificateOfVeracityImpl.setVeracitySignedDate(null);
		}
		else {
			jadscCertificateOfVeracityImpl.setVeracitySignedDate(
				new Date(veracitySignedDate));
		}

		if (veracitySignedTelephone == null) {
			jadscCertificateOfVeracityImpl.setVeracitySignedTelephone("");
		}
		else {
			jadscCertificateOfVeracityImpl.setVeracitySignedTelephone(
				veracitySignedTelephone);
		}

		if (veracitySignedFax == null) {
			jadscCertificateOfVeracityImpl.setVeracitySignedFax("");
		}
		else {
			jadscCertificateOfVeracityImpl.setVeracitySignedFax(
				veracitySignedFax);
		}

		if (veracitySignedAddress == null) {
			jadscCertificateOfVeracityImpl.setVeracitySignedAddress("");
		}
		else {
			jadscCertificateOfVeracityImpl.setVeracitySignedAddress(
				veracitySignedAddress);
		}

		jadscCertificateOfVeracityImpl.setJadscApplicationId(
			jadscApplicationId);

		jadscCertificateOfVeracityImpl.resetOriginalValues();

		return jadscCertificateOfVeracityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscCOVId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		veracityComName = objectInput.readUTF();
		veracityComPosition = objectInput.readUTF();
		veracityComCompany = objectInput.readUTF();
		veracitySignedDate = objectInput.readLong();
		veracitySignedTelephone = objectInput.readUTF();
		veracitySignedFax = objectInput.readUTF();
		veracitySignedAddress = objectInput.readUTF();

		jadscApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(jadscCOVId);

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

		if (veracityComName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(veracityComName);
		}

		if (veracityComPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(veracityComPosition);
		}

		if (veracityComCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(veracityComCompany);
		}

		objectOutput.writeLong(veracitySignedDate);

		if (veracitySignedTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(veracitySignedTelephone);
		}

		if (veracitySignedFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(veracitySignedFax);
		}

		if (veracitySignedAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(veracitySignedAddress);
		}

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jadscCOVId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String veracityComName;
	public String veracityComPosition;
	public String veracityComCompany;
	public long veracitySignedDate;
	public String veracitySignedTelephone;
	public String veracitySignedFax;
	public String veracitySignedAddress;
	public long jadscApplicationId;

}