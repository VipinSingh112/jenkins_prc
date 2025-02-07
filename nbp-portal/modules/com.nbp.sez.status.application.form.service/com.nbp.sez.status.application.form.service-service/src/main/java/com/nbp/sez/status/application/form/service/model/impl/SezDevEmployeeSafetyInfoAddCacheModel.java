/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevEmployeeSafetyInfoAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevEmployeeSafetyInfoAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevEmployeeSafetyInfoAddCacheModel
	implements CacheModel<SezDevEmployeeSafetyInfoAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevEmployeeSafetyInfoAddCacheModel)) {
			return false;
		}

		SezDevEmployeeSafetyInfoAddCacheModel
			sezDevEmployeeSafetyInfoAddCacheModel =
				(SezDevEmployeeSafetyInfoAddCacheModel)object;

		if (sezDevEmployeeSafetyInfoAddId ==
				sezDevEmployeeSafetyInfoAddCacheModel.
					sezDevEmployeeSafetyInfoAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevEmployeeSafetyInfoAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{sezDevEmployeeSafetyInfoAddId=");
		sb.append(sezDevEmployeeSafetyInfoAddId);
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
		sb.append(", securityMeasures=");
		sb.append(securityMeasures);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevEmployeeSafetyInfoAdd toEntityModel() {
		SezDevEmployeeSafetyInfoAddImpl sezDevEmployeeSafetyInfoAddImpl =
			new SezDevEmployeeSafetyInfoAddImpl();

		sezDevEmployeeSafetyInfoAddImpl.setSezDevEmployeeSafetyInfoAddId(
			sezDevEmployeeSafetyInfoAddId);
		sezDevEmployeeSafetyInfoAddImpl.setGroupId(groupId);
		sezDevEmployeeSafetyInfoAddImpl.setCompanyId(companyId);
		sezDevEmployeeSafetyInfoAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevEmployeeSafetyInfoAddImpl.setUserName("");
		}
		else {
			sezDevEmployeeSafetyInfoAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevEmployeeSafetyInfoAddImpl.setCreateDate(null);
		}
		else {
			sezDevEmployeeSafetyInfoAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevEmployeeSafetyInfoAddImpl.setModifiedDate(null);
		}
		else {
			sezDevEmployeeSafetyInfoAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (securityMeasures == null) {
			sezDevEmployeeSafetyInfoAddImpl.setSecurityMeasures("");
		}
		else {
			sezDevEmployeeSafetyInfoAddImpl.setSecurityMeasures(
				securityMeasures);
		}

		if (counter == null) {
			sezDevEmployeeSafetyInfoAddImpl.setCounter("");
		}
		else {
			sezDevEmployeeSafetyInfoAddImpl.setCounter(counter);
		}

		sezDevEmployeeSafetyInfoAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevEmployeeSafetyInfoAddImpl.resetOriginalValues();

		return sezDevEmployeeSafetyInfoAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevEmployeeSafetyInfoAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		securityMeasures = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevEmployeeSafetyInfoAddId);

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

		if (securityMeasures == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityMeasures);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevEmployeeSafetyInfoAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String securityMeasures;
	public String counter;
	public long sezStatusApplicationId;

}