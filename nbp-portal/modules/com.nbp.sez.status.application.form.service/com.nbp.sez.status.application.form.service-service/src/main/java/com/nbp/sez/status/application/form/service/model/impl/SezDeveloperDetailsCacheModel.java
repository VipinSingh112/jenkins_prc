/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDeveloperDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDeveloperDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDeveloperDetailsCacheModel
	implements CacheModel<SezDeveloperDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDeveloperDetailsCacheModel)) {
			return false;
		}

		SezDeveloperDetailsCacheModel sezDeveloperDetailsCacheModel =
			(SezDeveloperDetailsCacheModel)object;

		if (sezDeveloperDetailsId ==
				sezDeveloperDetailsCacheModel.sezDeveloperDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDeveloperDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezDeveloperDetailsId=");
		sb.append(sezDeveloperDetailsId);
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
		sb.append(", developerName=");
		sb.append(developerName);
		sb.append(", developerNumber=");
		sb.append(developerNumber);
		sb.append(", developerControl=");
		sb.append(developerControl);
		sb.append(", letterOfApprovalDate=");
		sb.append(letterOfApprovalDate);
		sb.append(", sezDeveloperDate=");
		sb.append(sezDeveloperDate);
		sb.append(", letterOfApprovalEntrtyId=");
		sb.append(letterOfApprovalEntrtyId);
		sb.append(", sezDeveloperAgreementEntryId=");
		sb.append(sezDeveloperAgreementEntryId);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDeveloperDetails toEntityModel() {
		SezDeveloperDetailsImpl sezDeveloperDetailsImpl =
			new SezDeveloperDetailsImpl();

		sezDeveloperDetailsImpl.setSezDeveloperDetailsId(sezDeveloperDetailsId);
		sezDeveloperDetailsImpl.setGroupId(groupId);
		sezDeveloperDetailsImpl.setCompanyId(companyId);
		sezDeveloperDetailsImpl.setUserId(userId);

		if (userName == null) {
			sezDeveloperDetailsImpl.setUserName("");
		}
		else {
			sezDeveloperDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDeveloperDetailsImpl.setCreateDate(null);
		}
		else {
			sezDeveloperDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDeveloperDetailsImpl.setModifiedDate(null);
		}
		else {
			sezDeveloperDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (developerName == null) {
			sezDeveloperDetailsImpl.setDeveloperName("");
		}
		else {
			sezDeveloperDetailsImpl.setDeveloperName(developerName);
		}

		if (developerNumber == null) {
			sezDeveloperDetailsImpl.setDeveloperNumber("");
		}
		else {
			sezDeveloperDetailsImpl.setDeveloperNumber(developerNumber);
		}

		if (developerControl == null) {
			sezDeveloperDetailsImpl.setDeveloperControl("");
		}
		else {
			sezDeveloperDetailsImpl.setDeveloperControl(developerControl);
		}

		if (letterOfApprovalDate == Long.MIN_VALUE) {
			sezDeveloperDetailsImpl.setLetterOfApprovalDate(null);
		}
		else {
			sezDeveloperDetailsImpl.setLetterOfApprovalDate(
				new Date(letterOfApprovalDate));
		}

		if (sezDeveloperDate == Long.MIN_VALUE) {
			sezDeveloperDetailsImpl.setSezDeveloperDate(null);
		}
		else {
			sezDeveloperDetailsImpl.setSezDeveloperDate(
				new Date(sezDeveloperDate));
		}

		sezDeveloperDetailsImpl.setLetterOfApprovalEntrtyId(
			letterOfApprovalEntrtyId);
		sezDeveloperDetailsImpl.setSezDeveloperAgreementEntryId(
			sezDeveloperAgreementEntryId);
		sezDeveloperDetailsImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDeveloperDetailsImpl.resetOriginalValues();

		return sezDeveloperDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDeveloperDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		developerName = objectInput.readUTF();
		developerNumber = objectInput.readUTF();
		developerControl = objectInput.readUTF();
		letterOfApprovalDate = objectInput.readLong();
		sezDeveloperDate = objectInput.readLong();

		letterOfApprovalEntrtyId = objectInput.readLong();

		sezDeveloperAgreementEntryId = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDeveloperDetailsId);

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

		if (developerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerName);
		}

		if (developerNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerNumber);
		}

		if (developerControl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerControl);
		}

		objectOutput.writeLong(letterOfApprovalDate);
		objectOutput.writeLong(sezDeveloperDate);

		objectOutput.writeLong(letterOfApprovalEntrtyId);

		objectOutput.writeLong(sezDeveloperAgreementEntryId);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDeveloperDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String developerName;
	public String developerNumber;
	public String developerControl;
	public long letterOfApprovalDate;
	public long sezDeveloperDate;
	public long letterOfApprovalEntrtyId;
	public long sezDeveloperAgreementEntryId;
	public long sezStatusApplicationId;

}