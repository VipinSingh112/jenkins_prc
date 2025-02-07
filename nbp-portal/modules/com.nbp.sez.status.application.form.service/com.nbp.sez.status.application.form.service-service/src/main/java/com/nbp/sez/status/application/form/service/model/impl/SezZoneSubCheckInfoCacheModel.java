/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneSubCheckInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneSubCheckInfoCacheModel
	implements CacheModel<SezZoneSubCheckInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneSubCheckInfoCacheModel)) {
			return false;
		}

		SezZoneSubCheckInfoCacheModel sezZoneSubCheckInfoCacheModel =
			(SezZoneSubCheckInfoCacheModel)object;

		if (sezZoneSubCheckInfoId ==
				sezZoneSubCheckInfoCacheModel.sezZoneSubCheckInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneSubCheckInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezZoneSubCheckInfoId=");
		sb.append(sezZoneSubCheckInfoId);
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
		sb.append(", generalRequirement=");
		sb.append(generalRequirement);
		sb.append(", companyInformation=");
		sb.append(companyInformation);
		sb.append(", swornState=");
		sb.append(swornState);
		sb.append(", occupancyRequirement=");
		sb.append(occupancyRequirement);
		sb.append(", approvals=");
		sb.append(approvals);
		sb.append(", signatureName=");
		sb.append(signatureName);
		sb.append(", signatureDate=");
		sb.append(signatureDate);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezZoneSubCheckInfo toEntityModel() {
		SezZoneSubCheckInfoImpl sezZoneSubCheckInfoImpl =
			new SezZoneSubCheckInfoImpl();

		sezZoneSubCheckInfoImpl.setSezZoneSubCheckInfoId(sezZoneSubCheckInfoId);
		sezZoneSubCheckInfoImpl.setGroupId(groupId);
		sezZoneSubCheckInfoImpl.setCompanyId(companyId);
		sezZoneSubCheckInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneSubCheckInfoImpl.setUserName("");
		}
		else {
			sezZoneSubCheckInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneSubCheckInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneSubCheckInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneSubCheckInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneSubCheckInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (generalRequirement == null) {
			sezZoneSubCheckInfoImpl.setGeneralRequirement("");
		}
		else {
			sezZoneSubCheckInfoImpl.setGeneralRequirement(generalRequirement);
		}

		if (companyInformation == null) {
			sezZoneSubCheckInfoImpl.setCompanyInformation("");
		}
		else {
			sezZoneSubCheckInfoImpl.setCompanyInformation(companyInformation);
		}

		if (swornState == null) {
			sezZoneSubCheckInfoImpl.setSwornState("");
		}
		else {
			sezZoneSubCheckInfoImpl.setSwornState(swornState);
		}

		if (occupancyRequirement == null) {
			sezZoneSubCheckInfoImpl.setOccupancyRequirement("");
		}
		else {
			sezZoneSubCheckInfoImpl.setOccupancyRequirement(
				occupancyRequirement);
		}

		if (approvals == null) {
			sezZoneSubCheckInfoImpl.setApprovals("");
		}
		else {
			sezZoneSubCheckInfoImpl.setApprovals(approvals);
		}

		if (signatureName == null) {
			sezZoneSubCheckInfoImpl.setSignatureName("");
		}
		else {
			sezZoneSubCheckInfoImpl.setSignatureName(signatureName);
		}

		if (signatureDate == Long.MIN_VALUE) {
			sezZoneSubCheckInfoImpl.setSignatureDate(null);
		}
		else {
			sezZoneSubCheckInfoImpl.setSignatureDate(new Date(signatureDate));
		}

		sezZoneSubCheckInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezZoneSubCheckInfoImpl.resetOriginalValues();

		return sezZoneSubCheckInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneSubCheckInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		generalRequirement = objectInput.readUTF();
		companyInformation = objectInput.readUTF();
		swornState = objectInput.readUTF();
		occupancyRequirement = objectInput.readUTF();
		approvals = objectInput.readUTF();
		signatureName = objectInput.readUTF();
		signatureDate = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneSubCheckInfoId);

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

		if (generalRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(generalRequirement);
		}

		if (companyInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyInformation);
		}

		if (swornState == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(swornState);
		}

		if (occupancyRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occupancyRequirement);
		}

		if (approvals == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approvals);
		}

		if (signatureName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatureName);
		}

		objectOutput.writeLong(signatureDate);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneSubCheckInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String generalRequirement;
	public String companyInformation;
	public String swornState;
	public String occupancyRequirement;
	public String approvals;
	public String signatureName;
	public long signatureDate;
	public long sezStatusApplicationId;

}