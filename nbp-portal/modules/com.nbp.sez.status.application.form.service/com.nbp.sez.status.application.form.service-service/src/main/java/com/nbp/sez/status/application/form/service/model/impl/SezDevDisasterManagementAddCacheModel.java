/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevDisasterManagementAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevDisasterManagementAddCacheModel
	implements CacheModel<SezDevDisasterManagementAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevDisasterManagementAddCacheModel)) {
			return false;
		}

		SezDevDisasterManagementAddCacheModel
			sezDevDisasterManagementAddCacheModel =
				(SezDevDisasterManagementAddCacheModel)object;

		if (sezDevDisasterManagementAddId ==
				sezDevDisasterManagementAddCacheModel.
					sezDevDisasterManagementAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevDisasterManagementAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{sezDevDisasterManagementAddId=");
		sb.append(sezDevDisasterManagementAddId);
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
		sb.append(", disasterMitigationPlan=");
		sb.append(disasterMitigationPlan);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevDisasterManagementAdd toEntityModel() {
		SezDevDisasterManagementAddImpl sezDevDisasterManagementAddImpl =
			new SezDevDisasterManagementAddImpl();

		sezDevDisasterManagementAddImpl.setSezDevDisasterManagementAddId(
			sezDevDisasterManagementAddId);
		sezDevDisasterManagementAddImpl.setGroupId(groupId);
		sezDevDisasterManagementAddImpl.setCompanyId(companyId);
		sezDevDisasterManagementAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevDisasterManagementAddImpl.setUserName("");
		}
		else {
			sezDevDisasterManagementAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevDisasterManagementAddImpl.setCreateDate(null);
		}
		else {
			sezDevDisasterManagementAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevDisasterManagementAddImpl.setModifiedDate(null);
		}
		else {
			sezDevDisasterManagementAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (disasterMitigationPlan == null) {
			sezDevDisasterManagementAddImpl.setDisasterMitigationPlan("");
		}
		else {
			sezDevDisasterManagementAddImpl.setDisasterMitigationPlan(
				disasterMitigationPlan);
		}

		if (counter == null) {
			sezDevDisasterManagementAddImpl.setCounter("");
		}
		else {
			sezDevDisasterManagementAddImpl.setCounter(counter);
		}

		sezDevDisasterManagementAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevDisasterManagementAddImpl.resetOriginalValues();

		return sezDevDisasterManagementAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevDisasterManagementAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		disasterMitigationPlan = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevDisasterManagementAddId);

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

		if (disasterMitigationPlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(disasterMitigationPlan);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevDisasterManagementAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String disasterMitigationPlan;
	public String counter;
	public long sezStatusApplicationId;

}