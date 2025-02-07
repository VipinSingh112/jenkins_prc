/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OSIServicesCertiOfIssuance in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OSIServicesCertiOfIssuanceCacheModel
	implements CacheModel<OSIServicesCertiOfIssuance>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OSIServicesCertiOfIssuanceCacheModel)) {
			return false;
		}

		OSIServicesCertiOfIssuanceCacheModel
			osiServicesCertiOfIssuanceCacheModel =
				(OSIServicesCertiOfIssuanceCacheModel)object;

		if (oSIServicesCertiOfIssuanceId ==
				osiServicesCertiOfIssuanceCacheModel.
					oSIServicesCertiOfIssuanceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, oSIServicesCertiOfIssuanceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{oSIServicesCertiOfIssuanceId=");
		sb.append(oSIServicesCertiOfIssuanceId);
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
		sb.append(", nameOfInsolventPerson=");
		sb.append(nameOfInsolventPerson);
		sb.append(", dateCertificateIssued=");
		sb.append(dateCertificateIssued);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", certificateNum=");
		sb.append(certificateNum);
		sb.append(", nameOfLicensedTrustee=");
		sb.append(nameOfLicensedTrustee);
		sb.append(", docFileEntry=");
		sb.append(docFileEntry);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OSIServicesCertiOfIssuance toEntityModel() {
		OSIServicesCertiOfIssuanceImpl osiServicesCertiOfIssuanceImpl =
			new OSIServicesCertiOfIssuanceImpl();

		osiServicesCertiOfIssuanceImpl.setOSIServicesCertiOfIssuanceId(
			oSIServicesCertiOfIssuanceId);
		osiServicesCertiOfIssuanceImpl.setGroupId(groupId);
		osiServicesCertiOfIssuanceImpl.setCompanyId(companyId);
		osiServicesCertiOfIssuanceImpl.setUserId(userId);

		if (userName == null) {
			osiServicesCertiOfIssuanceImpl.setUserName("");
		}
		else {
			osiServicesCertiOfIssuanceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesCertiOfIssuanceImpl.setCreateDate(null);
		}
		else {
			osiServicesCertiOfIssuanceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesCertiOfIssuanceImpl.setModifiedDate(null);
		}
		else {
			osiServicesCertiOfIssuanceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfInsolventPerson == null) {
			osiServicesCertiOfIssuanceImpl.setNameOfInsolventPerson("");
		}
		else {
			osiServicesCertiOfIssuanceImpl.setNameOfInsolventPerson(
				nameOfInsolventPerson);
		}

		if (dateCertificateIssued == Long.MIN_VALUE) {
			osiServicesCertiOfIssuanceImpl.setDateCertificateIssued(null);
		}
		else {
			osiServicesCertiOfIssuanceImpl.setDateCertificateIssued(
				new Date(dateCertificateIssued));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			osiServicesCertiOfIssuanceImpl.setDateOfExpiration(null);
		}
		else {
			osiServicesCertiOfIssuanceImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (certificateNum == null) {
			osiServicesCertiOfIssuanceImpl.setCertificateNum("");
		}
		else {
			osiServicesCertiOfIssuanceImpl.setCertificateNum(certificateNum);
		}

		if (nameOfLicensedTrustee == null) {
			osiServicesCertiOfIssuanceImpl.setNameOfLicensedTrustee("");
		}
		else {
			osiServicesCertiOfIssuanceImpl.setNameOfLicensedTrustee(
				nameOfLicensedTrustee);
		}

		osiServicesCertiOfIssuanceImpl.setDocFileEntry(docFileEntry);

		if (caseId == null) {
			osiServicesCertiOfIssuanceImpl.setCaseId("");
		}
		else {
			osiServicesCertiOfIssuanceImpl.setCaseId(caseId);
		}

		osiServicesCertiOfIssuanceImpl.resetOriginalValues();

		return osiServicesCertiOfIssuanceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		oSIServicesCertiOfIssuanceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfInsolventPerson = objectInput.readUTF();
		dateCertificateIssued = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		certificateNum = objectInput.readUTF();
		nameOfLicensedTrustee = objectInput.readUTF();

		docFileEntry = objectInput.readLong();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(oSIServicesCertiOfIssuanceId);

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

		if (nameOfInsolventPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfInsolventPerson);
		}

		objectOutput.writeLong(dateCertificateIssued);
		objectOutput.writeLong(dateOfExpiration);

		if (certificateNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNum);
		}

		if (nameOfLicensedTrustee == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfLicensedTrustee);
		}

		objectOutput.writeLong(docFileEntry);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long oSIServicesCertiOfIssuanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfInsolventPerson;
	public long dateCertificateIssued;
	public long dateOfExpiration;
	public String certificateNum;
	public String nameOfLicensedTrustee;
	public long docFileEntry;
	public String caseId;

}