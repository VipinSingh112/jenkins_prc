/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtClaimantDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtClaimantDetailCacheModel
	implements CacheModel<OgtClaimantDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtClaimantDetailCacheModel)) {
			return false;
		}

		OgtClaimantDetailCacheModel ogtClaimantDetailCacheModel =
			(OgtClaimantDetailCacheModel)object;

		if (ogtClaimantDetailId ==
				ogtClaimantDetailCacheModel.ogtClaimantDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtClaimantDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{ogtClaimantDetailId=");
		sb.append(ogtClaimantDetailId);
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
		sb.append(", claimantName=");
		sb.append(claimantName);
		sb.append(", claimantFirstName=");
		sb.append(claimantFirstName);
		sb.append(", claimantLastName=");
		sb.append(claimantLastName);
		sb.append(", claimantCompanyName=");
		sb.append(claimantCompanyName);
		sb.append(", claimantAddress=");
		sb.append(claimantAddress);
		sb.append(", claimantEmailAddr=");
		sb.append(claimantEmailAddr);
		sb.append(", claimantTeleNum=");
		sb.append(claimantTeleNum);
		sb.append(", claimantFaxNo=");
		sb.append(claimantFaxNo);
		sb.append(", claimantDate=");
		sb.append(claimantDate);
		sb.append(", claimantTrn=");
		sb.append(claimantTrn);
		sb.append(", claimantRelative=");
		sb.append(claimantRelative);
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtClaimantDetail toEntityModel() {
		OgtClaimantDetailImpl ogtClaimantDetailImpl =
			new OgtClaimantDetailImpl();

		ogtClaimantDetailImpl.setOgtClaimantDetailId(ogtClaimantDetailId);
		ogtClaimantDetailImpl.setGroupId(groupId);
		ogtClaimantDetailImpl.setCompanyId(companyId);
		ogtClaimantDetailImpl.setUserId(userId);

		if (userName == null) {
			ogtClaimantDetailImpl.setUserName("");
		}
		else {
			ogtClaimantDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtClaimantDetailImpl.setCreateDate(null);
		}
		else {
			ogtClaimantDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtClaimantDetailImpl.setModifiedDate(null);
		}
		else {
			ogtClaimantDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (claimantName == null) {
			ogtClaimantDetailImpl.setClaimantName("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantName(claimantName);
		}

		if (claimantFirstName == null) {
			ogtClaimantDetailImpl.setClaimantFirstName("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantFirstName(claimantFirstName);
		}

		if (claimantLastName == null) {
			ogtClaimantDetailImpl.setClaimantLastName("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantLastName(claimantLastName);
		}

		if (claimantCompanyName == null) {
			ogtClaimantDetailImpl.setClaimantCompanyName("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantCompanyName(claimantCompanyName);
		}

		if (claimantAddress == null) {
			ogtClaimantDetailImpl.setClaimantAddress("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantAddress(claimantAddress);
		}

		if (claimantEmailAddr == null) {
			ogtClaimantDetailImpl.setClaimantEmailAddr("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantEmailAddr(claimantEmailAddr);
		}

		if (claimantTeleNum == null) {
			ogtClaimantDetailImpl.setClaimantTeleNum("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantTeleNum(claimantTeleNum);
		}

		if (claimantFaxNo == null) {
			ogtClaimantDetailImpl.setClaimantFaxNo("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantFaxNo(claimantFaxNo);
		}

		if (claimantDate == Long.MIN_VALUE) {
			ogtClaimantDetailImpl.setClaimantDate(null);
		}
		else {
			ogtClaimantDetailImpl.setClaimantDate(new Date(claimantDate));
		}

		if (claimantTrn == null) {
			ogtClaimantDetailImpl.setClaimantTrn("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantTrn(claimantTrn);
		}

		if (claimantRelative == null) {
			ogtClaimantDetailImpl.setClaimantRelative("");
		}
		else {
			ogtClaimantDetailImpl.setClaimantRelative(claimantRelative);
		}

		ogtClaimantDetailImpl.setOgtApplicationId(ogtApplicationId);

		ogtClaimantDetailImpl.resetOriginalValues();

		return ogtClaimantDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ogtClaimantDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		claimantName = objectInput.readUTF();
		claimantFirstName = objectInput.readUTF();
		claimantLastName = objectInput.readUTF();
		claimantCompanyName = objectInput.readUTF();
		claimantAddress = objectInput.readUTF();
		claimantEmailAddr = objectInput.readUTF();
		claimantTeleNum = objectInput.readUTF();
		claimantFaxNo = objectInput.readUTF();
		claimantDate = objectInput.readLong();
		claimantTrn = objectInput.readUTF();
		claimantRelative = objectInput.readUTF();

		ogtApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ogtClaimantDetailId);

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

		if (claimantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantName);
		}

		if (claimantFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantFirstName);
		}

		if (claimantLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantLastName);
		}

		if (claimantCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantCompanyName);
		}

		if (claimantAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantAddress);
		}

		if (claimantEmailAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantEmailAddr);
		}

		if (claimantTeleNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantTeleNum);
		}

		if (claimantFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantFaxNo);
		}

		objectOutput.writeLong(claimantDate);

		if (claimantTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantTrn);
		}

		if (claimantRelative == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimantRelative);
		}

		objectOutput.writeLong(ogtApplicationId);
	}

	public long ogtClaimantDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String claimantName;
	public String claimantFirstName;
	public String claimantLastName;
	public String claimantCompanyName;
	public String claimantAddress;
	public String claimantEmailAddr;
	public String claimantTeleNum;
	public String claimantFaxNo;
	public long claimantDate;
	public String claimantTrn;
	public String claimantRelative;
	public long ogtApplicationId;

}