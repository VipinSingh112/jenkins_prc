/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbAddCraftApplicantInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbAddCraftApplicantInfoCacheModel
	implements CacheModel<JtbAddCraftApplicantInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbAddCraftApplicantInfoCacheModel)) {
			return false;
		}

		JtbAddCraftApplicantInfoCacheModel jtbAddCraftApplicantInfoCacheModel =
			(JtbAddCraftApplicantInfoCacheModel)object;

		if (jtbAddCraftApplicantInfoId ==
				jtbAddCraftApplicantInfoCacheModel.jtbAddCraftApplicantInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbAddCraftApplicantInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{jtbAddCraftApplicantInfoId=");
		sb.append(jtbAddCraftApplicantInfoId);
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
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ownerName=");
		sb.append(ownerName);
		sb.append(", ownerAddress=");
		sb.append(ownerAddress);
		sb.append(", ownerPhoneNo=");
		sb.append(ownerPhoneNo);
		sb.append(", sellingLocation=");
		sb.append(sellingLocation);
		sb.append(", operatingEmail=");
		sb.append(operatingEmail);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbAddCraftApplicantInfo toEntityModel() {
		JtbAddCraftApplicantInfoImpl jtbAddCraftApplicantInfoImpl =
			new JtbAddCraftApplicantInfoImpl();

		jtbAddCraftApplicantInfoImpl.setJtbAddCraftApplicantInfoId(
			jtbAddCraftApplicantInfoId);
		jtbAddCraftApplicantInfoImpl.setGroupId(groupId);
		jtbAddCraftApplicantInfoImpl.setCompanyId(companyId);
		jtbAddCraftApplicantInfoImpl.setUserId(userId);

		if (userName == null) {
			jtbAddCraftApplicantInfoImpl.setUserName("");
		}
		else {
			jtbAddCraftApplicantInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbAddCraftApplicantInfoImpl.setCreateDate(null);
		}
		else {
			jtbAddCraftApplicantInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbAddCraftApplicantInfoImpl.setModifiedDate(null);
		}
		else {
			jtbAddCraftApplicantInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (counter == null) {
			jtbAddCraftApplicantInfoImpl.setCounter("");
		}
		else {
			jtbAddCraftApplicantInfoImpl.setCounter(counter);
		}

		if (ownerName == null) {
			jtbAddCraftApplicantInfoImpl.setOwnerName("");
		}
		else {
			jtbAddCraftApplicantInfoImpl.setOwnerName(ownerName);
		}

		if (ownerAddress == null) {
			jtbAddCraftApplicantInfoImpl.setOwnerAddress("");
		}
		else {
			jtbAddCraftApplicantInfoImpl.setOwnerAddress(ownerAddress);
		}

		if (ownerPhoneNo == null) {
			jtbAddCraftApplicantInfoImpl.setOwnerPhoneNo("");
		}
		else {
			jtbAddCraftApplicantInfoImpl.setOwnerPhoneNo(ownerPhoneNo);
		}

		if (sellingLocation == null) {
			jtbAddCraftApplicantInfoImpl.setSellingLocation("");
		}
		else {
			jtbAddCraftApplicantInfoImpl.setSellingLocation(sellingLocation);
		}

		if (operatingEmail == null) {
			jtbAddCraftApplicantInfoImpl.setOperatingEmail("");
		}
		else {
			jtbAddCraftApplicantInfoImpl.setOperatingEmail(operatingEmail);
		}

		jtbAddCraftApplicantInfoImpl.setJtbApplicationId(jtbApplicationId);

		jtbAddCraftApplicantInfoImpl.resetOriginalValues();

		return jtbAddCraftApplicantInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbAddCraftApplicantInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		counter = objectInput.readUTF();
		ownerName = objectInput.readUTF();
		ownerAddress = objectInput.readUTF();
		ownerPhoneNo = objectInput.readUTF();
		sellingLocation = objectInput.readUTF();
		operatingEmail = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jtbAddCraftApplicantInfoId);

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

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		if (ownerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerName);
		}

		if (ownerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerAddress);
		}

		if (ownerPhoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerPhoneNo);
		}

		if (sellingLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sellingLocation);
		}

		if (operatingEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatingEmail);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long jtbAddCraftApplicantInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String counter;
	public String ownerName;
	public String ownerAddress;
	public String ownerPhoneNo;
	public String sellingLocation;
	public String operatingEmail;
	public long jtbApplicationId;

}