/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCCertificateOfService in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCCertificateOfServiceCacheModel
	implements CacheModel<JADSCCertificateOfService>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCCertificateOfServiceCacheModel)) {
			return false;
		}

		JADSCCertificateOfServiceCacheModel
			jadscCertificateOfServiceCacheModel =
				(JADSCCertificateOfServiceCacheModel)object;

		if (jadscCOSId == jadscCertificateOfServiceCacheModel.jadscCOSId) {
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
		StringBundler sb = new StringBundler(29);

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
		sb.append(", docSubmitDate=");
		sb.append(docSubmitDate);
		sb.append(", signatoryName=");
		sb.append(signatoryName);
		sb.append(", signatoryDate=");
		sb.append(signatoryDate);
		sb.append(", signatoryTelephone=");
		sb.append(signatoryTelephone);
		sb.append(", signatoryFax=");
		sb.append(signatoryFax);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCCertificateOfService toEntityModel() {
		JADSCCertificateOfServiceImpl jadscCertificateOfServiceImpl =
			new JADSCCertificateOfServiceImpl();

		if (uuid == null) {
			jadscCertificateOfServiceImpl.setUuid("");
		}
		else {
			jadscCertificateOfServiceImpl.setUuid(uuid);
		}

		jadscCertificateOfServiceImpl.setJadscCOSId(jadscCOSId);
		jadscCertificateOfServiceImpl.setGroupId(groupId);
		jadscCertificateOfServiceImpl.setCompanyId(companyId);
		jadscCertificateOfServiceImpl.setUserId(userId);

		if (userName == null) {
			jadscCertificateOfServiceImpl.setUserName("");
		}
		else {
			jadscCertificateOfServiceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscCertificateOfServiceImpl.setCreateDate(null);
		}
		else {
			jadscCertificateOfServiceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscCertificateOfServiceImpl.setModifiedDate(null);
		}
		else {
			jadscCertificateOfServiceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (docSubmitDate == Long.MIN_VALUE) {
			jadscCertificateOfServiceImpl.setDocSubmitDate(null);
		}
		else {
			jadscCertificateOfServiceImpl.setDocSubmitDate(
				new Date(docSubmitDate));
		}

		if (signatoryName == null) {
			jadscCertificateOfServiceImpl.setSignatoryName("");
		}
		else {
			jadscCertificateOfServiceImpl.setSignatoryName(signatoryName);
		}

		if (signatoryDate == Long.MIN_VALUE) {
			jadscCertificateOfServiceImpl.setSignatoryDate(null);
		}
		else {
			jadscCertificateOfServiceImpl.setSignatoryDate(
				new Date(signatoryDate));
		}

		if (signatoryTelephone == null) {
			jadscCertificateOfServiceImpl.setSignatoryTelephone("");
		}
		else {
			jadscCertificateOfServiceImpl.setSignatoryTelephone(
				signatoryTelephone);
		}

		if (signatoryFax == null) {
			jadscCertificateOfServiceImpl.setSignatoryFax("");
		}
		else {
			jadscCertificateOfServiceImpl.setSignatoryFax(signatoryFax);
		}

		jadscCertificateOfServiceImpl.setJadscApplicationId(jadscApplicationId);

		jadscCertificateOfServiceImpl.resetOriginalValues();

		return jadscCertificateOfServiceImpl;
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
		docSubmitDate = objectInput.readLong();
		signatoryName = objectInput.readUTF();
		signatoryDate = objectInput.readLong();
		signatoryTelephone = objectInput.readUTF();
		signatoryFax = objectInput.readUTF();

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
		objectOutput.writeLong(docSubmitDate);

		if (signatoryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatoryName);
		}

		objectOutput.writeLong(signatoryDate);

		if (signatoryTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatoryTelephone);
		}

		if (signatoryFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatoryFax);
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
	public long docSubmitDate;
	public String signatoryName;
	public long signatoryDate;
	public String signatoryTelephone;
	public String signatoryFax;
	public long jadscApplicationId;

}