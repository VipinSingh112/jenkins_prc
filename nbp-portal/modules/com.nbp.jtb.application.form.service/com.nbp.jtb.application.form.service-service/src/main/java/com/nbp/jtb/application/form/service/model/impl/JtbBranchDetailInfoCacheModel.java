/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JtbBranchDetailInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JtbBranchDetailInfoCacheModel
	implements CacheModel<JtbBranchDetailInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JtbBranchDetailInfoCacheModel)) {
			return false;
		}

		JtbBranchDetailInfoCacheModel jtbBranchDetailInfoCacheModel =
			(JtbBranchDetailInfoCacheModel)object;

		if (jtbBranchDetailInfoId ==
				jtbBranchDetailInfoCacheModel.jtbBranchDetailInfoId) {

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
		StringBundler sb = new StringBundler(21);

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
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JtbBranchDetailInfo toEntityModel() {
		JtbBranchDetailInfoImpl jtbBranchDetailInfoImpl =
			new JtbBranchDetailInfoImpl();

		jtbBranchDetailInfoImpl.setJtbBranchDetailInfoId(jtbBranchDetailInfoId);
		jtbBranchDetailInfoImpl.setGroupId(groupId);
		jtbBranchDetailInfoImpl.setCompanyId(companyId);
		jtbBranchDetailInfoImpl.setUserId(userId);

		if (userName == null) {
			jtbBranchDetailInfoImpl.setUserName("");
		}
		else {
			jtbBranchDetailInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jtbBranchDetailInfoImpl.setCreateDate(null);
		}
		else {
			jtbBranchDetailInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jtbBranchDetailInfoImpl.setModifiedDate(null);
		}
		else {
			jtbBranchDetailInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (counter == null) {
			jtbBranchDetailInfoImpl.setCounter("");
		}
		else {
			jtbBranchDetailInfoImpl.setCounter(counter);
		}

		if (branchOfficeDetails == null) {
			jtbBranchDetailInfoImpl.setBranchOfficeDetails("");
		}
		else {
			jtbBranchDetailInfoImpl.setBranchOfficeDetails(branchOfficeDetails);
		}

		jtbBranchDetailInfoImpl.setJtbApplicationId(jtbApplicationId);

		jtbBranchDetailInfoImpl.resetOriginalValues();

		return jtbBranchDetailInfoImpl;
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
	public long jtbApplicationId;

}