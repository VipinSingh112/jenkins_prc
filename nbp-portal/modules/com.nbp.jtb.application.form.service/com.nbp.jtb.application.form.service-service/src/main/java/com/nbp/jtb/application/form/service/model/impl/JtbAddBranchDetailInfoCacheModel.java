/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbAddBranchDetailInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbAddBranchDetailInfoCacheModel
	implements CacheModel<JtbAddBranchDetailInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbAddBranchDetailInfoCacheModel)) {
			return false;
		}

		JtbAddBranchDetailInfoCacheModel jtbAddBranchDetailInfoCacheModel =
			(JtbAddBranchDetailInfoCacheModel)object;

		if (jtbBranchDetailInfoId ==
				jtbAddBranchDetailInfoCacheModel.jtbBranchDetailInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jtbBranchDetailInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{jtbBranchDetailInfoId=");
		sb.append(jtbBranchDetailInfoId);
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
		sb.append(", branchOfficeDetails=");
		sb.append(branchOfficeDetails);
		sb.append(", branchOfficeLocation=");
		sb.append(branchOfficeLocation);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbAddBranchDetailInfo toEntityModel() {
		JtbAddBranchDetailInfoImpl jtbAddBranchDetailInfoImpl =
			new JtbAddBranchDetailInfoImpl();

		jtbAddBranchDetailInfoImpl.setJtbBranchDetailInfoId(
			jtbBranchDetailInfoId);
		jtbAddBranchDetailInfoImpl.setGroupId(groupId);
		jtbAddBranchDetailInfoImpl.setCompanyId(companyId);
		jtbAddBranchDetailInfoImpl.setUserId(userId);

		if (userName == null) {
			jtbAddBranchDetailInfoImpl.setUserName("");
		}
		else {
			jtbAddBranchDetailInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbAddBranchDetailInfoImpl.setCreateDate(null);
		}
		else {
			jtbAddBranchDetailInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbAddBranchDetailInfoImpl.setModifiedDate(null);
		}
		else {
			jtbAddBranchDetailInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (counter == null) {
			jtbAddBranchDetailInfoImpl.setCounter("");
		}
		else {
			jtbAddBranchDetailInfoImpl.setCounter(counter);
		}

		if (branchOfficeDetails == null) {
			jtbAddBranchDetailInfoImpl.setBranchOfficeDetails("");
		}
		else {
			jtbAddBranchDetailInfoImpl.setBranchOfficeDetails(
				branchOfficeDetails);
		}

		if (branchOfficeLocation == null) {
			jtbAddBranchDetailInfoImpl.setBranchOfficeLocation("");
		}
		else {
			jtbAddBranchDetailInfoImpl.setBranchOfficeLocation(
				branchOfficeLocation);
		}

		jtbAddBranchDetailInfoImpl.setJtbApplicationId(jtbApplicationId);

		jtbAddBranchDetailInfoImpl.resetOriginalValues();

		return jtbAddBranchDetailInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jtbBranchDetailInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		counter = objectInput.readUTF();
		branchOfficeDetails = objectInput.readUTF();
		branchOfficeLocation = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jtbBranchDetailInfoId);

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

		if (branchOfficeDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(branchOfficeDetails);
		}

		if (branchOfficeLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(branchOfficeLocation);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long jtbBranchDetailInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String counter;
	public String branchOfficeDetails;
	public String branchOfficeLocation;
	public long jtbApplicationId;

}