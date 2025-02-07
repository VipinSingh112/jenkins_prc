/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCCertificateOfServiceAddForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCCertificateOfServiceAddFormCacheModel
	implements CacheModel<JADSCCertificateOfServiceAddForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCCertificateOfServiceAddFormCacheModel)) {
			return false;
		}

		JADSCCertificateOfServiceAddFormCacheModel
			jadscCertificateOfServiceAddFormCacheModel =
				(JADSCCertificateOfServiceAddFormCacheModel)object;

		if (jadscCOSId ==
				jadscCertificateOfServiceAddFormCacheModel.jadscCOSId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscCOSId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscCOSId=");
		sb.append(jadscCOSId);
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
		sb.append(", docServeCom=");
		sb.append(docServeCom);
		sb.append(", docServeAddress=");
		sb.append(docServeAddress);
		sb.append(", docServeName=");
		sb.append(docServeName);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCCertificateOfServiceAddForm toEntityModel() {
		JADSCCertificateOfServiceAddFormImpl
			jadscCertificateOfServiceAddFormImpl =
				new JADSCCertificateOfServiceAddFormImpl();

		if (uuid == null) {
			jadscCertificateOfServiceAddFormImpl.setUuid("");
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setUuid(uuid);
		}

		jadscCertificateOfServiceAddFormImpl.setJadscCOSId(jadscCOSId);
		jadscCertificateOfServiceAddFormImpl.setGroupId(groupId);
		jadscCertificateOfServiceAddFormImpl.setCompanyId(companyId);
		jadscCertificateOfServiceAddFormImpl.setUserId(userId);

		if (userName == null) {
			jadscCertificateOfServiceAddFormImpl.setUserName("");
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscCertificateOfServiceAddFormImpl.setCreateDate(null);
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscCertificateOfServiceAddFormImpl.setModifiedDate(null);
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (docServeCom == null) {
			jadscCertificateOfServiceAddFormImpl.setDocServeCom("");
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setDocServeCom(docServeCom);
		}

		if (docServeAddress == null) {
			jadscCertificateOfServiceAddFormImpl.setDocServeAddress("");
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setDocServeAddress(
				docServeAddress);
		}

		if (docServeName == null) {
			jadscCertificateOfServiceAddFormImpl.setDocServeName("");
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setDocServeName(docServeName);
		}

		if (counter == null) {
			jadscCertificateOfServiceAddFormImpl.setCounter("");
		}
		else {
			jadscCertificateOfServiceAddFormImpl.setCounter(counter);
		}

		jadscCertificateOfServiceAddFormImpl.setJadscApplicationId(
			jadscApplicationId);

		jadscCertificateOfServiceAddFormImpl.resetOriginalValues();

		return jadscCertificateOfServiceAddFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscCOSId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		docServeCom = objectInput.readUTF();
		docServeAddress = objectInput.readUTF();
		docServeName = objectInput.readUTF();
		counter = objectInput.readUTF();

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

		objectOutput.writeLong(jadscCOSId);

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

		if (docServeCom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docServeCom);
		}

		if (docServeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docServeAddress);
		}

		if (docServeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(docServeName);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jadscCOSId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String docServeCom;
	public String docServeAddress;
	public String docServeName;
	public String counter;
	public long jadscApplicationId;

}