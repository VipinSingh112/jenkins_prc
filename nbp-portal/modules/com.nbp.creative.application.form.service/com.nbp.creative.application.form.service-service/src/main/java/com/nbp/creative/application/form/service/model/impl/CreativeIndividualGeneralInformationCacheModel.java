/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeIndividualGeneralInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeIndividualGeneralInformationCacheModel
	implements CacheModel<CreativeIndividualGeneralInformation>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				CreativeIndividualGeneralInformationCacheModel)) {

			return false;
		}

		CreativeIndividualGeneralInformationCacheModel
			creativeIndividualGeneralInformationCacheModel =
				(CreativeIndividualGeneralInformationCacheModel)object;

		if (creativeIndiGeneralInfoId ==
				creativeIndividualGeneralInformationCacheModel.
					creativeIndiGeneralInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeIndiGeneralInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{creativeIndiGeneralInfoId=");
		sb.append(creativeIndiGeneralInfoId);
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
		sb.append(", profile=");
		sb.append(profile);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeIndividualGeneralInformation toEntityModel() {
		CreativeIndividualGeneralInformationImpl
			creativeIndividualGeneralInformationImpl =
				new CreativeIndividualGeneralInformationImpl();

		creativeIndividualGeneralInformationImpl.setCreativeIndiGeneralInfoId(
			creativeIndiGeneralInfoId);
		creativeIndividualGeneralInformationImpl.setGroupId(groupId);
		creativeIndividualGeneralInformationImpl.setCompanyId(companyId);
		creativeIndividualGeneralInformationImpl.setUserId(userId);

		if (userName == null) {
			creativeIndividualGeneralInformationImpl.setUserName("");
		}
		else {
			creativeIndividualGeneralInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeIndividualGeneralInformationImpl.setCreateDate(null);
		}
		else {
			creativeIndividualGeneralInformationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeIndividualGeneralInformationImpl.setModifiedDate(null);
		}
		else {
			creativeIndividualGeneralInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (profile == null) {
			creativeIndividualGeneralInformationImpl.setProfile("");
		}
		else {
			creativeIndividualGeneralInformationImpl.setProfile(profile);
		}

		creativeIndividualGeneralInformationImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeIndividualGeneralInformationImpl.resetOriginalValues();

		return creativeIndividualGeneralInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeIndiGeneralInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		profile = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeIndiGeneralInfoId);

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

		if (profile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(profile);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeIndiGeneralInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String profile;
	public long CreativeApplicationId;

}