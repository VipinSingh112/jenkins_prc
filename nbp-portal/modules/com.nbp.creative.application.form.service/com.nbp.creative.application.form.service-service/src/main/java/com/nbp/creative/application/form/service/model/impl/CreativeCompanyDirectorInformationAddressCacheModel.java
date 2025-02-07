/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeCompanyDirectorInformationAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeCompanyDirectorInformationAddressCacheModel
	implements CacheModel<CreativeCompanyDirectorInformationAddress>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				CreativeCompanyDirectorInformationAddressCacheModel)) {

			return false;
		}

		CreativeCompanyDirectorInformationAddressCacheModel
			creativeCompanyDirectorInformationAddressCacheModel =
				(CreativeCompanyDirectorInformationAddressCacheModel)object;

		if (creativeComDirectorAddressId ==
				creativeCompanyDirectorInformationAddressCacheModel.
					creativeComDirectorAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeComDirectorAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{creativeComDirectorAddressId=");
		sb.append(creativeComDirectorAddressId);
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
		sb.append(", streetAddress=");
		sb.append(streetAddress);
		sb.append(", streetAddressLineTwo=");
		sb.append(streetAddressLineTwo);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append(", creativeComDirectorInfoId=");
		sb.append(creativeComDirectorInfoId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeCompanyDirectorInformationAddress toEntityModel() {
		CreativeCompanyDirectorInformationAddressImpl
			creativeCompanyDirectorInformationAddressImpl =
				new CreativeCompanyDirectorInformationAddressImpl();

		creativeCompanyDirectorInformationAddressImpl.
			setCreativeComDirectorAddressId(creativeComDirectorAddressId);
		creativeCompanyDirectorInformationAddressImpl.setGroupId(groupId);
		creativeCompanyDirectorInformationAddressImpl.setCompanyId(companyId);
		creativeCompanyDirectorInformationAddressImpl.setUserId(userId);

		if (userName == null) {
			creativeCompanyDirectorInformationAddressImpl.setUserName("");
		}
		else {
			creativeCompanyDirectorInformationAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeCompanyDirectorInformationAddressImpl.setCreateDate(null);
		}
		else {
			creativeCompanyDirectorInformationAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeCompanyDirectorInformationAddressImpl.setModifiedDate(null);
		}
		else {
			creativeCompanyDirectorInformationAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (streetAddress == null) {
			creativeCompanyDirectorInformationAddressImpl.setStreetAddress("");
		}
		else {
			creativeCompanyDirectorInformationAddressImpl.setStreetAddress(
				streetAddress);
		}

		if (streetAddressLineTwo == null) {
			creativeCompanyDirectorInformationAddressImpl.
				setStreetAddressLineTwo("");
		}
		else {
			creativeCompanyDirectorInformationAddressImpl.
				setStreetAddressLineTwo(streetAddressLineTwo);
		}

		creativeCompanyDirectorInformationAddressImpl.setCreativeApplicationId(
			CreativeApplicationId);
		creativeCompanyDirectorInformationAddressImpl.
			setCreativeComDirectorInfoId(creativeComDirectorInfoId);

		creativeCompanyDirectorInformationAddressImpl.resetOriginalValues();

		return creativeCompanyDirectorInformationAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeComDirectorAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		streetAddress = objectInput.readUTF();
		streetAddressLineTwo = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();

		creativeComDirectorInfoId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeComDirectorAddressId);

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

		if (streetAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(streetAddress);
		}

		if (streetAddressLineTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(streetAddressLineTwo);
		}

		objectOutput.writeLong(CreativeApplicationId);

		objectOutput.writeLong(creativeComDirectorInfoId);
	}

	public long creativeComDirectorAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String streetAddress;
	public String streetAddressLineTwo;
	public long CreativeApplicationId;
	public long creativeComDirectorInfoId;

}