/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevDisasterManagement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevDisasterManagementCacheModel
	implements CacheModel<SezDevDisasterManagement>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevDisasterManagementCacheModel)) {
			return false;
		}

		SezDevDisasterManagementCacheModel sezDevDisasterManagementCacheModel =
			(SezDevDisasterManagementCacheModel)object;

		if (sezDevDisasterManagementId ==
				sezDevDisasterManagementCacheModel.sezDevDisasterManagementId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevDisasterManagementId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{sezDevDisasterManagementId=");
		sb.append(sezDevDisasterManagementId);
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
		sb.append(", disasterManagement=");
		sb.append(disasterManagement);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevDisasterManagement toEntityModel() {
		SezDevDisasterManagementImpl sezDevDisasterManagementImpl =
			new SezDevDisasterManagementImpl();

		sezDevDisasterManagementImpl.setSezDevDisasterManagementId(
			sezDevDisasterManagementId);
		sezDevDisasterManagementImpl.setGroupId(groupId);
		sezDevDisasterManagementImpl.setCompanyId(companyId);
		sezDevDisasterManagementImpl.setUserId(userId);

		if (userName == null) {
			sezDevDisasterManagementImpl.setUserName("");
		}
		else {
			sezDevDisasterManagementImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevDisasterManagementImpl.setCreateDate(null);
		}
		else {
			sezDevDisasterManagementImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevDisasterManagementImpl.setModifiedDate(null);
		}
		else {
			sezDevDisasterManagementImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (disasterManagement == null) {
			sezDevDisasterManagementImpl.setDisasterManagement("");
		}
		else {
			sezDevDisasterManagementImpl.setDisasterManagement(
				disasterManagement);
		}

		sezDevDisasterManagementImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevDisasterManagementImpl.resetOriginalValues();

		return sezDevDisasterManagementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevDisasterManagementId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		disasterManagement = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevDisasterManagementId);

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

		if (disasterManagement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(disasterManagement);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevDisasterManagementId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String disasterManagement;
	public long sezStatusApplicationId;

}