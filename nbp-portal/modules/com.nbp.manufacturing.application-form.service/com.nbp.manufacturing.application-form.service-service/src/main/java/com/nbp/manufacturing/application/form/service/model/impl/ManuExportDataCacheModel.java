/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuExportData;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuExportData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuExportDataCacheModel
	implements CacheModel<ManuExportData>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuExportDataCacheModel)) {
			return false;
		}

		ManuExportDataCacheModel manuExportDataCacheModel =
			(ManuExportDataCacheModel)object;

		if (manuExportDataId == manuExportDataCacheModel.manuExportDataId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuExportDataId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{manuExportDataId=");
		sb.append(manuExportDataId);
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
		sb.append(", companyInvolved=");
		sb.append(companyInvolved);
		sb.append(", itemsName=");
		sb.append(itemsName);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", monetary=");
		sb.append(monetary);
		sb.append(", countryName=");
		sb.append(countryName);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuExportData toEntityModel() {
		ManuExportDataImpl manuExportDataImpl = new ManuExportDataImpl();

		manuExportDataImpl.setManuExportDataId(manuExportDataId);
		manuExportDataImpl.setGroupId(groupId);
		manuExportDataImpl.setCompanyId(companyId);
		manuExportDataImpl.setUserId(userId);

		if (userName == null) {
			manuExportDataImpl.setUserName("");
		}
		else {
			manuExportDataImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuExportDataImpl.setCreateDate(null);
		}
		else {
			manuExportDataImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuExportDataImpl.setModifiedDate(null);
		}
		else {
			manuExportDataImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyInvolved == null) {
			manuExportDataImpl.setCompanyInvolved("");
		}
		else {
			manuExportDataImpl.setCompanyInvolved(companyInvolved);
		}

		if (itemsName == null) {
			manuExportDataImpl.setItemsName("");
		}
		else {
			manuExportDataImpl.setItemsName(itemsName);
		}

		if (quantity == null) {
			manuExportDataImpl.setQuantity("");
		}
		else {
			manuExportDataImpl.setQuantity(quantity);
		}

		if (monetary == null) {
			manuExportDataImpl.setMonetary("");
		}
		else {
			manuExportDataImpl.setMonetary(monetary);
		}

		if (countryName == null) {
			manuExportDataImpl.setCountryName("");
		}
		else {
			manuExportDataImpl.setCountryName(countryName);
		}

		manuExportDataImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuExportDataImpl.resetOriginalValues();

		return manuExportDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuExportDataId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyInvolved = objectInput.readUTF();
		itemsName = objectInput.readUTF();
		quantity = objectInput.readUTF();
		monetary = objectInput.readUTF();
		countryName = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuExportDataId);

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

		if (companyInvolved == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyInvolved);
		}

		if (itemsName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(itemsName);
		}

		if (quantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (monetary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monetary);
		}

		if (countryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(countryName);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long manuExportDataId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyInvolved;
	public String itemsName;
	public String quantity;
	public String monetary;
	public String countryName;
	public long manufacturingApplicationId;

}