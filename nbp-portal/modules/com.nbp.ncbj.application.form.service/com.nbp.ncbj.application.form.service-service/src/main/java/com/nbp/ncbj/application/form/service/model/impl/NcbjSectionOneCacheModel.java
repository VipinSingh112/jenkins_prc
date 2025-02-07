/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjSectionOne;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjSectionOne in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjSectionOneCacheModel
	implements CacheModel<NcbjSectionOne>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjSectionOneCacheModel)) {
			return false;
		}

		NcbjSectionOneCacheModel ncbjSectionOneCacheModel =
			(NcbjSectionOneCacheModel)object;

		if (ncbjSectionOneId == ncbjSectionOneCacheModel.ncbjSectionOneId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjSectionOneId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{ncbjSectionOneId=");
		sb.append(ncbjSectionOneId);
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
		sb.append(", numberOfProductTypes=");
		sb.append(numberOfProductTypes);
		sb.append(", pleaseListProduct=");
		sb.append(pleaseListProduct);
		sb.append(", numberOfProductionLines=");
		sb.append(numberOfProductionLines);
		sb.append(", exclusionActivities=");
		sb.append(exclusionActivities);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjSectionOne toEntityModel() {
		NcbjSectionOneImpl ncbjSectionOneImpl = new NcbjSectionOneImpl();

		ncbjSectionOneImpl.setNcbjSectionOneId(ncbjSectionOneId);
		ncbjSectionOneImpl.setGroupId(groupId);
		ncbjSectionOneImpl.setCompanyId(companyId);
		ncbjSectionOneImpl.setUserId(userId);

		if (userName == null) {
			ncbjSectionOneImpl.setUserName("");
		}
		else {
			ncbjSectionOneImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjSectionOneImpl.setCreateDate(null);
		}
		else {
			ncbjSectionOneImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjSectionOneImpl.setModifiedDate(null);
		}
		else {
			ncbjSectionOneImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (numberOfProductTypes == null) {
			ncbjSectionOneImpl.setNumberOfProductTypes("");
		}
		else {
			ncbjSectionOneImpl.setNumberOfProductTypes(numberOfProductTypes);
		}

		if (pleaseListProduct == null) {
			ncbjSectionOneImpl.setPleaseListProduct("");
		}
		else {
			ncbjSectionOneImpl.setPleaseListProduct(pleaseListProduct);
		}

		if (numberOfProductionLines == Long.MIN_VALUE) {
			ncbjSectionOneImpl.setNumberOfProductionLines(null);
		}
		else {
			ncbjSectionOneImpl.setNumberOfProductionLines(
				new Date(numberOfProductionLines));
		}

		if (exclusionActivities == Long.MIN_VALUE) {
			ncbjSectionOneImpl.setExclusionActivities(null);
		}
		else {
			ncbjSectionOneImpl.setExclusionActivities(
				new Date(exclusionActivities));
		}

		ncbjSectionOneImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjSectionOneImpl.resetOriginalValues();

		return ncbjSectionOneImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjSectionOneId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		numberOfProductTypes = objectInput.readUTF();
		pleaseListProduct = objectInput.readUTF();
		numberOfProductionLines = objectInput.readLong();
		exclusionActivities = objectInput.readLong();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjSectionOneId);

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

		if (numberOfProductTypes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfProductTypes);
		}

		if (pleaseListProduct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pleaseListProduct);
		}

		objectOutput.writeLong(numberOfProductionLines);
		objectOutput.writeLong(exclusionActivities);

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjSectionOneId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String numberOfProductTypes;
	public String pleaseListProduct;
	public long numberOfProductionLines;
	public long exclusionActivities;
	public long ncbjApplicationId;

}