/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.PackagingProcess;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PackagingProcess in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PackagingProcessCacheModel
	implements CacheModel<PackagingProcess>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PackagingProcessCacheModel)) {
			return false;
		}

		PackagingProcessCacheModel packagingProcessCacheModel =
			(PackagingProcessCacheModel)object;

		if (packagingProcessId ==
				packagingProcessCacheModel.packagingProcessId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, packagingProcessId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{packagingProcessId=");
		sb.append(packagingProcessId);
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
		sb.append(", packagingProcess=");
		sb.append(packagingProcess);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PackagingProcess toEntityModel() {
		PackagingProcessImpl packagingProcessImpl = new PackagingProcessImpl();

		packagingProcessImpl.setPackagingProcessId(packagingProcessId);
		packagingProcessImpl.setGroupId(groupId);
		packagingProcessImpl.setCompanyId(companyId);
		packagingProcessImpl.setUserId(userId);

		if (userName == null) {
			packagingProcessImpl.setUserName("");
		}
		else {
			packagingProcessImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			packagingProcessImpl.setCreateDate(null);
		}
		else {
			packagingProcessImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			packagingProcessImpl.setModifiedDate(null);
		}
		else {
			packagingProcessImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (packagingProcess == null) {
			packagingProcessImpl.setPackagingProcess("");
		}
		else {
			packagingProcessImpl.setPackagingProcess(packagingProcess);
		}

		packagingProcessImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		packagingProcessImpl.resetOriginalValues();

		return packagingProcessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		packagingProcessId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		packagingProcess = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(packagingProcessId);

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

		if (packagingProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(packagingProcess);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long packagingProcessId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String packagingProcess;
	public long manufacturingApplicationId;

}