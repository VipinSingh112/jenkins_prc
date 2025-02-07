/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccoNonHotelRequiredLic in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccoNonHotelRequiredLicCacheModel
	implements CacheModel<AccoNonHotelRequiredLic>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccoNonHotelRequiredLicCacheModel)) {
			return false;
		}

		AccoNonHotelRequiredLicCacheModel accoNonHotelRequiredLicCacheModel =
			(AccoNonHotelRequiredLicCacheModel)object;

		if (accoNonHotelRequiredLicId ==
				accoNonHotelRequiredLicCacheModel.accoNonHotelRequiredLicId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accoNonHotelRequiredLicId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{accoNonHotelRequiredLicId=");
		sb.append(accoNonHotelRequiredLicId);
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
		sb.append(", requiredLicence=");
		sb.append(requiredLicence);
		sb.append(", requiredBedroom=");
		sb.append(requiredBedroom);
		sb.append(", requiredBathroom=");
		sb.append(requiredBathroom);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccoNonHotelRequiredLic toEntityModel() {
		AccoNonHotelRequiredLicImpl accoNonHotelRequiredLicImpl =
			new AccoNonHotelRequiredLicImpl();

		accoNonHotelRequiredLicImpl.setAccoNonHotelRequiredLicId(
			accoNonHotelRequiredLicId);
		accoNonHotelRequiredLicImpl.setGroupId(groupId);
		accoNonHotelRequiredLicImpl.setCompanyId(companyId);
		accoNonHotelRequiredLicImpl.setUserId(userId);

		if (userName == null) {
			accoNonHotelRequiredLicImpl.setUserName("");
		}
		else {
			accoNonHotelRequiredLicImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accoNonHotelRequiredLicImpl.setCreateDate(null);
		}
		else {
			accoNonHotelRequiredLicImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accoNonHotelRequiredLicImpl.setModifiedDate(null);
		}
		else {
			accoNonHotelRequiredLicImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requiredLicence == null) {
			accoNonHotelRequiredLicImpl.setRequiredLicence("");
		}
		else {
			accoNonHotelRequiredLicImpl.setRequiredLicence(requiredLicence);
		}

		if (requiredBedroom == null) {
			accoNonHotelRequiredLicImpl.setRequiredBedroom("");
		}
		else {
			accoNonHotelRequiredLicImpl.setRequiredBedroom(requiredBedroom);
		}

		if (requiredBathroom == null) {
			accoNonHotelRequiredLicImpl.setRequiredBathroom("");
		}
		else {
			accoNonHotelRequiredLicImpl.setRequiredBathroom(requiredBathroom);
		}

		accoNonHotelRequiredLicImpl.setJtbApplicationId(jtbApplicationId);

		accoNonHotelRequiredLicImpl.resetOriginalValues();

		return accoNonHotelRequiredLicImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		accoNonHotelRequiredLicId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		requiredLicence = objectInput.readUTF();
		requiredBedroom = objectInput.readUTF();
		requiredBathroom = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(accoNonHotelRequiredLicId);

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

		if (requiredLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requiredLicence);
		}

		if (requiredBedroom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requiredBedroom);
		}

		if (requiredBathroom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requiredBathroom);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long accoNonHotelRequiredLicId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String requiredLicence;
	public String requiredBedroom;
	public String requiredBathroom;
	public long jtbApplicationId;

}