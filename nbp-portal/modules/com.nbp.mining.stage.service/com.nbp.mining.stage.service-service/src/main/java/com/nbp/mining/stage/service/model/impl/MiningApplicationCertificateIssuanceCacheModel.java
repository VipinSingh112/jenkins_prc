/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningApplicationCertificateIssuance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningApplicationCertificateIssuanceCacheModel
	implements CacheModel<MiningApplicationCertificateIssuance>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				MiningApplicationCertificateIssuanceCacheModel)) {

			return false;
		}

		MiningApplicationCertificateIssuanceCacheModel
			miningApplicationCertificateIssuanceCacheModel =
				(MiningApplicationCertificateIssuanceCacheModel)object;

		if (miningCertIssuId ==
				miningApplicationCertificateIssuanceCacheModel.
					miningCertIssuId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningCertIssuId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", miningCertIssuId=");
		sb.append(miningCertIssuId);
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
		sb.append(", dateCertificateIssued=");
		sb.append(dateCertificateIssued);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", documentFileEntryId=");
		sb.append(documentFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningApplicationCertificateIssuance toEntityModel() {
		MiningApplicationCertificateIssuanceImpl
			miningApplicationCertificateIssuanceImpl =
				new MiningApplicationCertificateIssuanceImpl();

		if (uuid == null) {
			miningApplicationCertificateIssuanceImpl.setUuid("");
		}
		else {
			miningApplicationCertificateIssuanceImpl.setUuid(uuid);
		}

		miningApplicationCertificateIssuanceImpl.setMiningCertIssuId(
			miningCertIssuId);
		miningApplicationCertificateIssuanceImpl.setGroupId(groupId);
		miningApplicationCertificateIssuanceImpl.setCompanyId(companyId);
		miningApplicationCertificateIssuanceImpl.setUserId(userId);

		if (userName == null) {
			miningApplicationCertificateIssuanceImpl.setUserName("");
		}
		else {
			miningApplicationCertificateIssuanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningApplicationCertificateIssuanceImpl.setCreateDate(null);
		}
		else {
			miningApplicationCertificateIssuanceImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningApplicationCertificateIssuanceImpl.setModifiedDate(null);
		}
		else {
			miningApplicationCertificateIssuanceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateCertificateIssued == Long.MIN_VALUE) {
			miningApplicationCertificateIssuanceImpl.setDateCertificateIssued(
				null);
		}
		else {
			miningApplicationCertificateIssuanceImpl.setDateCertificateIssued(
				new Date(dateCertificateIssued));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			miningApplicationCertificateIssuanceImpl.setDateOfExpiration(null);
		}
		else {
			miningApplicationCertificateIssuanceImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (certificateNumber == null) {
			miningApplicationCertificateIssuanceImpl.setCertificateNumber("");
		}
		else {
			miningApplicationCertificateIssuanceImpl.setCertificateNumber(
				certificateNumber);
		}

		if (caseId == null) {
			miningApplicationCertificateIssuanceImpl.setCaseId("");
		}
		else {
			miningApplicationCertificateIssuanceImpl.setCaseId(caseId);
		}

		miningApplicationCertificateIssuanceImpl.setDocumentFileEntryId(
			documentFileEntryId);

		miningApplicationCertificateIssuanceImpl.resetOriginalValues();

		return miningApplicationCertificateIssuanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		miningCertIssuId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateCertificateIssued = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();

		documentFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(miningCertIssuId);

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
		objectOutput.writeLong(dateCertificateIssued);
		objectOutput.writeLong(dateOfExpiration);

		if (certificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(documentFileEntryId);
	}

	public String uuid;
	public long miningCertIssuId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateCertificateIssued;
	public long dateOfExpiration;
	public String certificateNumber;
	public String caseId;
	public long documentFileEntryId;

}