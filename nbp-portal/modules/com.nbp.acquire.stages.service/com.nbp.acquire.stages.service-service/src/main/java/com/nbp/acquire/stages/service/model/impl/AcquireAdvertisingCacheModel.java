/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireAdvertising;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireAdvertising in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireAdvertisingCacheModel
	implements CacheModel<AcquireAdvertising>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireAdvertisingCacheModel)) {
			return false;
		}

		AcquireAdvertisingCacheModel acquireAdvertisingCacheModel =
			(AcquireAdvertisingCacheModel)object;

		if (acquireAdvertisingId ==
				acquireAdvertisingCacheModel.acquireAdvertisingId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireAdvertisingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{acquireAdvertisingId=");
		sb.append(acquireAdvertisingId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", dateFrom=");
		sb.append(dateFrom);
		sb.append(", dateTo=");
		sb.append(dateTo);
		sb.append(", advertisingMediaStatus=");
		sb.append(advertisingMediaStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireAdvertising toEntityModel() {
		AcquireAdvertisingImpl acquireAdvertisingImpl =
			new AcquireAdvertisingImpl();

		acquireAdvertisingImpl.setAcquireAdvertisingId(acquireAdvertisingId);
		acquireAdvertisingImpl.setGroupId(groupId);
		acquireAdvertisingImpl.setCompanyId(companyId);
		acquireAdvertisingImpl.setUserId(userId);

		if (userName == null) {
			acquireAdvertisingImpl.setUserName("");
		}
		else {
			acquireAdvertisingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireAdvertisingImpl.setCreateDate(null);
		}
		else {
			acquireAdvertisingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireAdvertisingImpl.setModifiedDate(null);
		}
		else {
			acquireAdvertisingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			acquireAdvertisingImpl.setCaseId("");
		}
		else {
			acquireAdvertisingImpl.setCaseId(caseId);
		}

		if (dateFrom == Long.MIN_VALUE) {
			acquireAdvertisingImpl.setDateFrom(null);
		}
		else {
			acquireAdvertisingImpl.setDateFrom(new Date(dateFrom));
		}

		if (dateTo == Long.MIN_VALUE) {
			acquireAdvertisingImpl.setDateTo(null);
		}
		else {
			acquireAdvertisingImpl.setDateTo(new Date(dateTo));
		}

		if (advertisingMediaStatus == null) {
			acquireAdvertisingImpl.setAdvertisingMediaStatus("");
		}
		else {
			acquireAdvertisingImpl.setAdvertisingMediaStatus(
				advertisingMediaStatus);
		}

		acquireAdvertisingImpl.resetOriginalValues();

		return acquireAdvertisingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireAdvertisingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateFrom = objectInput.readLong();
		dateTo = objectInput.readLong();
		advertisingMediaStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireAdvertisingId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(dateFrom);
		objectOutput.writeLong(dateTo);

		if (advertisingMediaStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(advertisingMediaStatus);
		}
	}

	public long acquireAdvertisingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateFrom;
	public long dateTo;
	public String advertisingMediaStatus;

}