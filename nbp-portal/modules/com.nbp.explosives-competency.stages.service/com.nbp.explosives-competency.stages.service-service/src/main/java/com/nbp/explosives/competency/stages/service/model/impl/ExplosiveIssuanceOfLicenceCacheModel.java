/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ExplosiveIssuanceOfLicence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ExplosiveIssuanceOfLicenceCacheModel
	implements CacheModel<ExplosiveIssuanceOfLicence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ExplosiveIssuanceOfLicenceCacheModel)) {
			return false;
		}

		ExplosiveIssuanceOfLicenceCacheModel
			explosiveIssuanceOfLicenceCacheModel =
				(ExplosiveIssuanceOfLicenceCacheModel)object;

		if (issuanceId == explosiveIssuanceOfLicenceCacheModel.issuanceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, issuanceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", issuanceId=");
		sb.append(issuanceId);
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
		sb.append(", dateOfIssuance=");
		sb.append(dateOfIssuance);
		sb.append(", dateOfExpiration=");
		sb.append(dateOfExpiration);
		sb.append(", certificateNumber=");
		sb.append(certificateNumber);
		sb.append(", certificateNumberId=");
		sb.append(certificateNumberId);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ExplosiveIssuanceOfLicence toEntityModel() {
		ExplosiveIssuanceOfLicenceImpl explosiveIssuanceOfLicenceImpl =
			new ExplosiveIssuanceOfLicenceImpl();

		if (uuid == null) {
			explosiveIssuanceOfLicenceImpl.setUuid("");
		}
		else {
			explosiveIssuanceOfLicenceImpl.setUuid(uuid);
		}

		explosiveIssuanceOfLicenceImpl.setIssuanceId(issuanceId);
		explosiveIssuanceOfLicenceImpl.setGroupId(groupId);
		explosiveIssuanceOfLicenceImpl.setCompanyId(companyId);
		explosiveIssuanceOfLicenceImpl.setUserId(userId);

		if (userName == null) {
			explosiveIssuanceOfLicenceImpl.setUserName("");
		}
		else {
			explosiveIssuanceOfLicenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			explosiveIssuanceOfLicenceImpl.setCreateDate(null);
		}
		else {
			explosiveIssuanceOfLicenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			explosiveIssuanceOfLicenceImpl.setModifiedDate(null);
		}
		else {
			explosiveIssuanceOfLicenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfIssuance == Long.MIN_VALUE) {
			explosiveIssuanceOfLicenceImpl.setDateOfIssuance(null);
		}
		else {
			explosiveIssuanceOfLicenceImpl.setDateOfIssuance(
				new Date(dateOfIssuance));
		}

		if (dateOfExpiration == Long.MIN_VALUE) {
			explosiveIssuanceOfLicenceImpl.setDateOfExpiration(null);
		}
		else {
			explosiveIssuanceOfLicenceImpl.setDateOfExpiration(
				new Date(dateOfExpiration));
		}

		if (certificateNumber == null) {
			explosiveIssuanceOfLicenceImpl.setCertificateNumber("");
		}
		else {
			explosiveIssuanceOfLicenceImpl.setCertificateNumber(
				certificateNumber);
		}

		explosiveIssuanceOfLicenceImpl.setCertificateNumberId(
			certificateNumberId);

		if (caseId == null) {
			explosiveIssuanceOfLicenceImpl.setCaseId("");
		}
		else {
			explosiveIssuanceOfLicenceImpl.setCaseId(caseId);
		}

		explosiveIssuanceOfLicenceImpl.resetOriginalValues();

		return explosiveIssuanceOfLicenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		issuanceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfIssuance = objectInput.readLong();
		dateOfExpiration = objectInput.readLong();
		certificateNumber = objectInput.readUTF();

		certificateNumberId = objectInput.readLong();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(issuanceId);

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
		objectOutput.writeLong(dateOfIssuance);
		objectOutput.writeLong(dateOfExpiration);

		if (certificateNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificateNumber);
		}

		objectOutput.writeLong(certificateNumberId);

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public String uuid;
	public long issuanceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfIssuance;
	public long dateOfExpiration;
	public String certificateNumber;
	public long certificateNumberId;
	public String caseId;

}