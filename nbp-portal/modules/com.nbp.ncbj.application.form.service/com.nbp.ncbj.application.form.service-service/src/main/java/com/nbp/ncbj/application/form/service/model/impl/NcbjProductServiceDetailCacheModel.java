/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjProductServiceDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjProductServiceDetailCacheModel
	implements CacheModel<NcbjProductServiceDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjProductServiceDetailCacheModel)) {
			return false;
		}

		NcbjProductServiceDetailCacheModel ncbjProductServiceDetailCacheModel =
			(NcbjProductServiceDetailCacheModel)object;

		if (ncbjProductServiceDetailId ==
				ncbjProductServiceDetailCacheModel.ncbjProductServiceDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjProductServiceDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{ncbjProductServiceDetailId=");
		sb.append(ncbjProductServiceDetailId);
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
		sb.append(", productType=");
		sb.append(productType);
		sb.append(", productList=");
		sb.append(productList);
		sb.append(", productLines=");
		sb.append(productLines);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjProductServiceDetail toEntityModel() {
		NcbjProductServiceDetailImpl ncbjProductServiceDetailImpl =
			new NcbjProductServiceDetailImpl();

		ncbjProductServiceDetailImpl.setNcbjProductServiceDetailId(
			ncbjProductServiceDetailId);
		ncbjProductServiceDetailImpl.setGroupId(groupId);
		ncbjProductServiceDetailImpl.setCompanyId(companyId);
		ncbjProductServiceDetailImpl.setUserId(userId);

		if (userName == null) {
			ncbjProductServiceDetailImpl.setUserName("");
		}
		else {
			ncbjProductServiceDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjProductServiceDetailImpl.setCreateDate(null);
		}
		else {
			ncbjProductServiceDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjProductServiceDetailImpl.setModifiedDate(null);
		}
		else {
			ncbjProductServiceDetailImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (productType == null) {
			ncbjProductServiceDetailImpl.setProductType("");
		}
		else {
			ncbjProductServiceDetailImpl.setProductType(productType);
		}

		if (productList == null) {
			ncbjProductServiceDetailImpl.setProductList("");
		}
		else {
			ncbjProductServiceDetailImpl.setProductList(productList);
		}

		if (productLines == null) {
			ncbjProductServiceDetailImpl.setProductLines("");
		}
		else {
			ncbjProductServiceDetailImpl.setProductLines(productLines);
		}

		if (counter == null) {
			ncbjProductServiceDetailImpl.setCounter("");
		}
		else {
			ncbjProductServiceDetailImpl.setCounter(counter);
		}

		ncbjProductServiceDetailImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjProductServiceDetailImpl.resetOriginalValues();

		return ncbjProductServiceDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjProductServiceDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		productType = objectInput.readUTF();
		productList = objectInput.readUTF();
		productLines = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjProductServiceDetailId);

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

		if (productType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productType);
		}

		if (productList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productList);
		}

		if (productLines == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productLines);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjProductServiceDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String productType;
	public String productList;
	public String productLines;
	public String counter;
	public long ncbjApplicationId;

}