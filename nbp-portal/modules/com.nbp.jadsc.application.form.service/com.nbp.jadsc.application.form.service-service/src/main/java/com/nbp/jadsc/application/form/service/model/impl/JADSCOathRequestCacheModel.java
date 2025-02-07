/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JADSCOathRequest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JADSCOathRequestCacheModel
	implements CacheModel<JADSCOathRequest>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JADSCOathRequestCacheModel)) {
			return false;
		}

		JADSCOathRequestCacheModel jadscOathRequestCacheModel =
			(JADSCOathRequestCacheModel)object;

		if (jadscOathRequestId ==
				jadscOathRequestCacheModel.jadscOathRequestId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscOathRequestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", jadscOathRequestId=");
		sb.append(jadscOathRequestId);
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
		sb.append(", investigationType=");
		sb.append(investigationType);
		sb.append(", partyName=");
		sb.append(partyName);
		sb.append(", requestReason=");
		sb.append(requestReason);
		sb.append(", comOfficial=");
		sb.append(comOfficial);
		sb.append(", signatureDate=");
		sb.append(signatureDate);
		sb.append(", jadscApplicationId=");
		sb.append(jadscApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JADSCOathRequest toEntityModel() {
		JADSCOathRequestImpl jadscOathRequestImpl = new JADSCOathRequestImpl();

		if (uuid == null) {
			jadscOathRequestImpl.setUuid("");
		}
		else {
			jadscOathRequestImpl.setUuid(uuid);
		}

		jadscOathRequestImpl.setJadscOathRequestId(jadscOathRequestId);
		jadscOathRequestImpl.setGroupId(groupId);
		jadscOathRequestImpl.setCompanyId(companyId);
		jadscOathRequestImpl.setUserId(userId);

		if (userName == null) {
			jadscOathRequestImpl.setUserName("");
		}
		else {
			jadscOathRequestImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscOathRequestImpl.setCreateDate(null);
		}
		else {
			jadscOathRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscOathRequestImpl.setModifiedDate(null);
		}
		else {
			jadscOathRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (investigationType == null) {
			jadscOathRequestImpl.setInvestigationType("");
		}
		else {
			jadscOathRequestImpl.setInvestigationType(investigationType);
		}

		if (partyName == null) {
			jadscOathRequestImpl.setPartyName("");
		}
		else {
			jadscOathRequestImpl.setPartyName(partyName);
		}

		if (requestReason == null) {
			jadscOathRequestImpl.setRequestReason("");
		}
		else {
			jadscOathRequestImpl.setRequestReason(requestReason);
		}

		if (comOfficial == null) {
			jadscOathRequestImpl.setComOfficial("");
		}
		else {
			jadscOathRequestImpl.setComOfficial(comOfficial);
		}

		if (signatureDate == Long.MIN_VALUE) {
			jadscOathRequestImpl.setSignatureDate(null);
		}
		else {
			jadscOathRequestImpl.setSignatureDate(new Date(signatureDate));
		}

		jadscOathRequestImpl.setJadscApplicationId(jadscApplicationId);

		jadscOathRequestImpl.resetOriginalValues();

		return jadscOathRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		jadscOathRequestId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		investigationType = objectInput.readUTF();
		partyName = objectInput.readUTF();
		requestReason = objectInput.readUTF();
		comOfficial = objectInput.readUTF();
		signatureDate = objectInput.readLong();

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

		objectOutput.writeLong(jadscOathRequestId);

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

		if (investigationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(investigationType);
		}

		if (partyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partyName);
		}

		if (requestReason == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestReason);
		}

		if (comOfficial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comOfficial);
		}

		objectOutput.writeLong(signatureDate);

		objectOutput.writeLong(jadscApplicationId);
	}

	public String uuid;
	public long jadscOathRequestId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String investigationType;
	public String partyName;
	public String requestReason;
	public String comOfficial;
	public long signatureDate;
	public long jadscApplicationId;

}