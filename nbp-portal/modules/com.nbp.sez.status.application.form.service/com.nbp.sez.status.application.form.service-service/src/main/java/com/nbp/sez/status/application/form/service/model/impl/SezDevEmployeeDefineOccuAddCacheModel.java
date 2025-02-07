/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevEmployeeDefineOccuAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevEmployeeDefineOccuAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevEmployeeDefineOccuAddCacheModel
	implements CacheModel<SezDevEmployeeDefineOccuAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevEmployeeDefineOccuAddCacheModel)) {
			return false;
		}

		SezDevEmployeeDefineOccuAddCacheModel
			sezDevEmployeeDefineOccuAddCacheModel =
				(SezDevEmployeeDefineOccuAddCacheModel)object;

		if (sezDevEmployeeDefineOccuAddId ==
				sezDevEmployeeDefineOccuAddCacheModel.
					sezDevEmployeeDefineOccuAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevEmployeeDefineOccuAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{sezDevEmployeeDefineOccuAddId=");
		sb.append(sezDevEmployeeDefineOccuAddId);
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
		sb.append(", occuSafetySystem=");
		sb.append(occuSafetySystem);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevEmployeeDefineOccuAdd toEntityModel() {
		SezDevEmployeeDefineOccuAddImpl sezDevEmployeeDefineOccuAddImpl =
			new SezDevEmployeeDefineOccuAddImpl();

		sezDevEmployeeDefineOccuAddImpl.setSezDevEmployeeDefineOccuAddId(
			sezDevEmployeeDefineOccuAddId);
		sezDevEmployeeDefineOccuAddImpl.setGroupId(groupId);
		sezDevEmployeeDefineOccuAddImpl.setCompanyId(companyId);
		sezDevEmployeeDefineOccuAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevEmployeeDefineOccuAddImpl.setUserName("");
		}
		else {
			sezDevEmployeeDefineOccuAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevEmployeeDefineOccuAddImpl.setCreateDate(null);
		}
		else {
			sezDevEmployeeDefineOccuAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevEmployeeDefineOccuAddImpl.setModifiedDate(null);
		}
		else {
			sezDevEmployeeDefineOccuAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occuSafetySystem == null) {
			sezDevEmployeeDefineOccuAddImpl.setOccuSafetySystem("");
		}
		else {
			sezDevEmployeeDefineOccuAddImpl.setOccuSafetySystem(
				occuSafetySystem);
		}

		if (counter == null) {
			sezDevEmployeeDefineOccuAddImpl.setCounter("");
		}
		else {
			sezDevEmployeeDefineOccuAddImpl.setCounter(counter);
		}

		sezDevEmployeeDefineOccuAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevEmployeeDefineOccuAddImpl.resetOriginalValues();

		return sezDevEmployeeDefineOccuAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevEmployeeDefineOccuAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occuSafetySystem = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevEmployeeDefineOccuAddId);

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

		if (occuSafetySystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occuSafetySystem);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevEmployeeDefineOccuAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occuSafetySystem;
	public String counter;
	public long sezStatusApplicationId;

}