/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyGeneralInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeCompanyGeneralInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeCompanyGeneralInformationCacheModel
	implements CacheModel<CreativeCompanyGeneralInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeCompanyGeneralInformationCacheModel)) {
			return false;
		}

		CreativeCompanyGeneralInformationCacheModel
			creativeCompanyGeneralInformationCacheModel =
				(CreativeCompanyGeneralInformationCacheModel)object;

		if (creativeCompanyGeneralInfoId ==
				creativeCompanyGeneralInformationCacheModel.
					creativeCompanyGeneralInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeCompanyGeneralInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{creativeCompanyGeneralInfoId=");
		sb.append(creativeCompanyGeneralInfoId);
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
		sb.append(", HaveYouRecievedAny=");
		sb.append(HaveYouRecievedAny);
		sb.append(", mprsStartDate=");
		sb.append(mprsStartDate);
		sb.append(", mprsEndDate=");
		sb.append(mprsEndDate);
		sb.append(", mttStartDate=");
		sb.append(mttStartDate);
		sb.append(", mttEndDate=");
		sb.append(mttEndDate);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeCompanyGeneralInformation toEntityModel() {
		CreativeCompanyGeneralInformationImpl
			creativeCompanyGeneralInformationImpl =
				new CreativeCompanyGeneralInformationImpl();

		creativeCompanyGeneralInformationImpl.setCreativeCompanyGeneralInfoId(
			creativeCompanyGeneralInfoId);
		creativeCompanyGeneralInformationImpl.setGroupId(groupId);
		creativeCompanyGeneralInformationImpl.setCompanyId(companyId);
		creativeCompanyGeneralInformationImpl.setUserId(userId);

		if (userName == null) {
			creativeCompanyGeneralInformationImpl.setUserName("");
		}
		else {
			creativeCompanyGeneralInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeCompanyGeneralInformationImpl.setCreateDate(null);
		}
		else {
			creativeCompanyGeneralInformationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeCompanyGeneralInformationImpl.setModifiedDate(null);
		}
		else {
			creativeCompanyGeneralInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (HaveYouRecievedAny == null) {
			creativeCompanyGeneralInformationImpl.setHaveYouRecievedAny("");
		}
		else {
			creativeCompanyGeneralInformationImpl.setHaveYouRecievedAny(
				HaveYouRecievedAny);
		}

		if (mprsStartDate == Long.MIN_VALUE) {
			creativeCompanyGeneralInformationImpl.setMprsStartDate(null);
		}
		else {
			creativeCompanyGeneralInformationImpl.setMprsStartDate(
				new Date(mprsStartDate));
		}

		if (mprsEndDate == Long.MIN_VALUE) {
			creativeCompanyGeneralInformationImpl.setMprsEndDate(null);
		}
		else {
			creativeCompanyGeneralInformationImpl.setMprsEndDate(
				new Date(mprsEndDate));
		}

		if (mttStartDate == Long.MIN_VALUE) {
			creativeCompanyGeneralInformationImpl.setMttStartDate(null);
		}
		else {
			creativeCompanyGeneralInformationImpl.setMttStartDate(
				new Date(mttStartDate));
		}

		if (mttEndDate == Long.MIN_VALUE) {
			creativeCompanyGeneralInformationImpl.setMttEndDate(null);
		}
		else {
			creativeCompanyGeneralInformationImpl.setMttEndDate(
				new Date(mttEndDate));
		}

		creativeCompanyGeneralInformationImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeCompanyGeneralInformationImpl.resetOriginalValues();

		return creativeCompanyGeneralInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeCompanyGeneralInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		HaveYouRecievedAny = objectInput.readUTF();
		mprsStartDate = objectInput.readLong();
		mprsEndDate = objectInput.readLong();
		mttStartDate = objectInput.readLong();
		mttEndDate = objectInput.readLong();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeCompanyGeneralInfoId);

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

		if (HaveYouRecievedAny == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(HaveYouRecievedAny);
		}

		objectOutput.writeLong(mprsStartDate);
		objectOutput.writeLong(mprsEndDate);
		objectOutput.writeLong(mttStartDate);
		objectOutput.writeLong(mttEndDate);

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeCompanyGeneralInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String HaveYouRecievedAny;
	public long mprsStartDate;
	public long mprsEndDate;
	public long mttStartDate;
	public long mttEndDate;
	public long CreativeApplicationId;

}