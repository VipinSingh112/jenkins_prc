/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusLicenseIssuance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusLicenseIssuanceCacheModel
	implements CacheModel<SezStatusLicenseIssuance>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusLicenseIssuanceCacheModel)) {
			return false;
		}

		SezStatusLicenseIssuanceCacheModel sezStatusLicenseIssuanceCacheModel =
			(SezStatusLicenseIssuanceCacheModel)object;

		if (sezStatusLicIssuedId ==
				sezStatusLicenseIssuanceCacheModel.sezStatusLicIssuedId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusLicIssuedId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sezStatusLicIssuedId=");
		sb.append(sezStatusLicIssuedId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", licenceNumber=");
		sb.append(licenceNumber);
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", sezStatus=");
		sb.append(sezStatus);
		sb.append(", sezDeveloperNumber=");
		sb.append(sezDeveloperNumber);
		sb.append(", dateOfLicIssuance=");
		sb.append(dateOfLicIssuance);
		sb.append(", dateOfLicenseExpiration=");
		sb.append(dateOfLicenseExpiration);
		sb.append(", docLicFileEntryId=");
		sb.append(docLicFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusLicenseIssuance toEntityModel() {
		SezStatusLicenseIssuanceImpl sezStatusLicenseIssuanceImpl =
			new SezStatusLicenseIssuanceImpl();

		if (uuid == null) {
			sezStatusLicenseIssuanceImpl.setUuid("");
		}
		else {
			sezStatusLicenseIssuanceImpl.setUuid(uuid);
		}

		sezStatusLicenseIssuanceImpl.setSezStatusLicIssuedId(
			sezStatusLicIssuedId);
		sezStatusLicenseIssuanceImpl.setGroupId(groupId);
		sezStatusLicenseIssuanceImpl.setCompanyId(companyId);
		sezStatusLicenseIssuanceImpl.setUserId(userId);

		if (userName == null) {
			sezStatusLicenseIssuanceImpl.setUserName("");
		}
		else {
			sezStatusLicenseIssuanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusLicenseIssuanceImpl.setCreateDate(null);
		}
		else {
			sezStatusLicenseIssuanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusLicenseIssuanceImpl.setModifiedDate(null);
		}
		else {
			sezStatusLicenseIssuanceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			sezStatusLicenseIssuanceImpl.setCaseId("");
		}
		else {
			sezStatusLicenseIssuanceImpl.setCaseId(caseId);
		}

		if (licenceNumber == null) {
			sezStatusLicenseIssuanceImpl.setLicenceNumber("");
		}
		else {
			sezStatusLicenseIssuanceImpl.setLicenceNumber(licenceNumber);
		}

		if (nameOfApplicant == null) {
			sezStatusLicenseIssuanceImpl.setNameOfApplicant("");
		}
		else {
			sezStatusLicenseIssuanceImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (sezStatus == null) {
			sezStatusLicenseIssuanceImpl.setSezStatus("");
		}
		else {
			sezStatusLicenseIssuanceImpl.setSezStatus(sezStatus);
		}

		if (sezDeveloperNumber == null) {
			sezStatusLicenseIssuanceImpl.setSezDeveloperNumber("");
		}
		else {
			sezStatusLicenseIssuanceImpl.setSezDeveloperNumber(
				sezDeveloperNumber);
		}

		if (dateOfLicIssuance == Long.MIN_VALUE) {
			sezStatusLicenseIssuanceImpl.setDateOfLicIssuance(null);
		}
		else {
			sezStatusLicenseIssuanceImpl.setDateOfLicIssuance(
				new Date(dateOfLicIssuance));
		}

		if (dateOfLicenseExpiration == Long.MIN_VALUE) {
			sezStatusLicenseIssuanceImpl.setDateOfLicenseExpiration(null);
		}
		else {
			sezStatusLicenseIssuanceImpl.setDateOfLicenseExpiration(
				new Date(dateOfLicenseExpiration));
		}

		sezStatusLicenseIssuanceImpl.setDocLicFileEntryId(docLicFileEntryId);

		sezStatusLicenseIssuanceImpl.resetOriginalValues();

		return sezStatusLicenseIssuanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sezStatusLicIssuedId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		licenceNumber = objectInput.readUTF();
		nameOfApplicant = objectInput.readUTF();
		sezStatus = objectInput.readUTF();
		sezDeveloperNumber = objectInput.readUTF();
		dateOfLicIssuance = objectInput.readLong();
		dateOfLicenseExpiration = objectInput.readLong();

		docLicFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sezStatusLicIssuedId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (licenceNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenceNumber);
		}

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (sezStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sezStatus);
		}

		if (sezDeveloperNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sezDeveloperNumber);
		}

		objectOutput.writeLong(dateOfLicIssuance);
		objectOutput.writeLong(dateOfLicenseExpiration);

		objectOutput.writeLong(docLicFileEntryId);
	}

	public String uuid;
	public long sezStatusLicIssuedId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String licenceNumber;
	public String nameOfApplicant;
	public String sezStatus;
	public String sezDeveloperNumber;
	public long dateOfLicIssuance;
	public long dateOfLicenseExpiration;
	public long docLicFileEntryId;

}