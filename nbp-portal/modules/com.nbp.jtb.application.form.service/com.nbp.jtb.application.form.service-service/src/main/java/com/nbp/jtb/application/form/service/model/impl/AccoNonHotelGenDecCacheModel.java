/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccoNonHotelGenDec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccoNonHotelGenDecCacheModel
	implements CacheModel<AccoNonHotelGenDec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccoNonHotelGenDecCacheModel)) {
			return false;
		}

		AccoNonHotelGenDecCacheModel accoNonHotelGenDecCacheModel =
			(AccoNonHotelGenDecCacheModel)object;

		if (accoNonHotelGenDecId ==
				accoNonHotelGenDecCacheModel.accoNonHotelGenDecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accoNonHotelGenDecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accoNonHotelGenDecId=");
		sb.append(accoNonHotelGenDecId);
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
		sb.append(", nhAccoOperatorName=");
		sb.append(nhAccoOperatorName);
		sb.append(", dateFrom=");
		sb.append(dateFrom);
		sb.append(", dateTo=");
		sb.append(dateTo);
		sb.append(", nhAccoSince=");
		sb.append(nhAccoSince);
		sb.append(", nhAccoDate=");
		sb.append(nhAccoDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccoNonHotelGenDec toEntityModel() {
		AccoNonHotelGenDecImpl accoNonHotelGenDecImpl =
			new AccoNonHotelGenDecImpl();

		if (uuid == null) {
			accoNonHotelGenDecImpl.setUuid("");
		}
		else {
			accoNonHotelGenDecImpl.setUuid(uuid);
		}

		accoNonHotelGenDecImpl.setAccoNonHotelGenDecId(accoNonHotelGenDecId);
		accoNonHotelGenDecImpl.setGroupId(groupId);
		accoNonHotelGenDecImpl.setCompanyId(companyId);
		accoNonHotelGenDecImpl.setUserId(userId);

		if (userName == null) {
			accoNonHotelGenDecImpl.setUserName("");
		}
		else {
			accoNonHotelGenDecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accoNonHotelGenDecImpl.setCreateDate(null);
		}
		else {
			accoNonHotelGenDecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accoNonHotelGenDecImpl.setModifiedDate(null);
		}
		else {
			accoNonHotelGenDecImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nhAccoOperatorName == null) {
			accoNonHotelGenDecImpl.setNhAccoOperatorName("");
		}
		else {
			accoNonHotelGenDecImpl.setNhAccoOperatorName(nhAccoOperatorName);
		}

		if (dateFrom == Long.MIN_VALUE) {
			accoNonHotelGenDecImpl.setDateFrom(null);
		}
		else {
			accoNonHotelGenDecImpl.setDateFrom(new Date(dateFrom));
		}

		if (dateTo == Long.MIN_VALUE) {
			accoNonHotelGenDecImpl.setDateTo(null);
		}
		else {
			accoNonHotelGenDecImpl.setDateTo(new Date(dateTo));
		}

		if (nhAccoSince == Long.MIN_VALUE) {
			accoNonHotelGenDecImpl.setNhAccoSince(null);
		}
		else {
			accoNonHotelGenDecImpl.setNhAccoSince(new Date(nhAccoSince));
		}

		if (nhAccoDate == Long.MIN_VALUE) {
			accoNonHotelGenDecImpl.setNhAccoDate(null);
		}
		else {
			accoNonHotelGenDecImpl.setNhAccoDate(new Date(nhAccoDate));
		}

		accoNonHotelGenDecImpl.setJtbApplicationId(jtbApplicationId);

		accoNonHotelGenDecImpl.resetOriginalValues();

		return accoNonHotelGenDecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accoNonHotelGenDecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nhAccoOperatorName = objectInput.readUTF();
		dateFrom = objectInput.readLong();
		dateTo = objectInput.readLong();
		nhAccoSince = objectInput.readLong();
		nhAccoDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accoNonHotelGenDecId);

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

		if (nhAccoOperatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nhAccoOperatorName);
		}

		objectOutput.writeLong(dateFrom);
		objectOutput.writeLong(dateTo);
		objectOutput.writeLong(nhAccoSince);
		objectOutput.writeLong(nhAccoDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public String uuid;
	public long accoNonHotelGenDecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nhAccoOperatorName;
	public long dateFrom;
	public long dateTo;
	public long nhAccoSince;
	public long nhAccoDate;
	public long jtbApplicationId;

}