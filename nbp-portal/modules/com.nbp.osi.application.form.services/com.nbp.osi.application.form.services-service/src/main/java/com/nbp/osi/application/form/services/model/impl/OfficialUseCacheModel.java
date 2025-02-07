/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.application.form.services.model.OfficialUse;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OfficialUse in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OfficialUseCacheModel
	implements CacheModel<OfficialUse>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OfficialUseCacheModel)) {
			return false;
		}

		OfficialUseCacheModel officialUseCacheModel =
			(OfficialUseCacheModel)object;

		if (officialUseId == officialUseCacheModel.officialUseId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, officialUseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{officialUseId=");
		sb.append(officialUseId);
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
		sb.append(", receivedBy=");
		sb.append(receivedBy);
		sb.append(", receivedByDate=");
		sb.append(receivedByDate);
		sb.append(", verifiedBy=");
		sb.append(verifiedBy);
		sb.append(", verifiedByDate=");
		sb.append(verifiedByDate);
		sb.append(", applicationAccepted=");
		sb.append(applicationAccepted);
		sb.append(", dateCertificateIssued=");
		sb.append(dateCertificateIssued);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", remarksNotes=");
		sb.append(remarksNotes);
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OfficialUse toEntityModel() {
		OfficialUseImpl officialUseImpl = new OfficialUseImpl();

		officialUseImpl.setOfficialUseId(officialUseId);
		officialUseImpl.setGroupId(groupId);
		officialUseImpl.setCompanyId(companyId);
		officialUseImpl.setUserId(userId);

		if (userName == null) {
			officialUseImpl.setUserName("");
		}
		else {
			officialUseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			officialUseImpl.setCreateDate(null);
		}
		else {
			officialUseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			officialUseImpl.setModifiedDate(null);
		}
		else {
			officialUseImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (receivedBy == null) {
			officialUseImpl.setReceivedBy("");
		}
		else {
			officialUseImpl.setReceivedBy(receivedBy);
		}

		if (receivedByDate == Long.MIN_VALUE) {
			officialUseImpl.setReceivedByDate(null);
		}
		else {
			officialUseImpl.setReceivedByDate(new Date(receivedByDate));
		}

		if (verifiedBy == null) {
			officialUseImpl.setVerifiedBy("");
		}
		else {
			officialUseImpl.setVerifiedBy(verifiedBy);
		}

		if (verifiedByDate == Long.MIN_VALUE) {
			officialUseImpl.setVerifiedByDate(null);
		}
		else {
			officialUseImpl.setVerifiedByDate(new Date(verifiedByDate));
		}

		if (applicationAccepted == null) {
			officialUseImpl.setApplicationAccepted("");
		}
		else {
			officialUseImpl.setApplicationAccepted(applicationAccepted);
		}

		if (dateCertificateIssued == Long.MIN_VALUE) {
			officialUseImpl.setDateCertificateIssued(null);
		}
		else {
			officialUseImpl.setDateCertificateIssued(
				new Date(dateCertificateIssued));
		}

		if (certificateNumber == null) {
			officialUseImpl.setCertificateNumber("");
		}
		else {
			officialUseImpl.setCertificateNumber(certificateNumber);
		}

		if (remarksNotes == null) {
			officialUseImpl.setRemarksNotes("");
		}
		else {
			officialUseImpl.setRemarksNotes(remarksNotes);
		}

		officialUseImpl.setOsiApplicationId(osiApplicationId);

		officialUseImpl.resetOriginalValues();

		return officialUseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		officialUseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		receivedBy = objectInput.readUTF();
		receivedByDate = objectInput.readLong();
		verifiedBy = objectInput.readUTF();
		verifiedByDate = objectInput.readLong();
		applicationAccepted = objectInput.readUTF();
		dateCertificateIssued = objectInput.readLong();
		certificateNumber = objectInput.readUTF();
		remarksNotes = objectInput.readUTF();

		osiApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(officialUseId);

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

		if (receivedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(receivedBy);
		}

		objectOutput.writeLong(receivedByDate);

		if (verifiedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verifiedBy);
		}

		objectOutput.writeLong(verifiedByDate);

		if (applicationAccepted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationAccepted);
		}

		objectOutput.writeLong(dateCertificateIssued);

		if (certificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		if (remarksNotes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarksNotes);
		}

		objectOutput.writeLong(osiApplicationId);
	}

	public long officialUseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String receivedBy;
	public long receivedByDate;
	public String verifiedBy;
	public long verifiedByDate;
	public String applicationAccepted;
	public long dateCertificateIssued;
	public String certificateNumber;
	public String remarksNotes;
	public long osiApplicationId;

}