/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddress;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeIndividualDetailsAddress in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeIndividualDetailsAddressCacheModel
	implements CacheModel<CreativeIndividualDetailsAddress>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeIndividualDetailsAddressCacheModel)) {
			return false;
		}

		CreativeIndividualDetailsAddressCacheModel
			creativeIndividualDetailsAddressCacheModel =
				(CreativeIndividualDetailsAddressCacheModel)object;

		if (creativeIndiDetailsAddressId ==
				creativeIndividualDetailsAddressCacheModel.
					creativeIndiDetailsAddressId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeIndiDetailsAddressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{creativeIndiDetailsAddressId=");
		sb.append(creativeIndiDetailsAddressId);
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
		sb.append(", creativeIndividualDetailsId=");
		sb.append(creativeIndividualDetailsId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeIndividualDetailsAddress toEntityModel() {
		CreativeIndividualDetailsAddressImpl
			creativeIndividualDetailsAddressImpl =
				new CreativeIndividualDetailsAddressImpl();

		creativeIndividualDetailsAddressImpl.setCreativeIndiDetailsAddressId(
			creativeIndiDetailsAddressId);
		creativeIndividualDetailsAddressImpl.setGroupId(groupId);
		creativeIndividualDetailsAddressImpl.setCompanyId(companyId);
		creativeIndividualDetailsAddressImpl.setUserId(userId);

		if (userName == null) {
			creativeIndividualDetailsAddressImpl.setUserName("");
		}
		else {
			creativeIndividualDetailsAddressImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeIndividualDetailsAddressImpl.setCreateDate(null);
		}
		else {
			creativeIndividualDetailsAddressImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeIndividualDetailsAddressImpl.setModifiedDate(null);
		}
		else {
			creativeIndividualDetailsAddressImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (streetAddress == null) {
			creativeIndividualDetailsAddressImpl.setStreetAddress("");
		}
		else {
			creativeIndividualDetailsAddressImpl.setStreetAddress(
				streetAddress);
		}

		if (streetAddressLineTwo == null) {
			creativeIndividualDetailsAddressImpl.setStreetAddressLineTwo("");
		}
		else {
			creativeIndividualDetailsAddressImpl.setStreetAddressLineTwo(
				streetAddressLineTwo);
		}

		creativeIndividualDetailsAddressImpl.setCreativeApplicationId(
			CreativeApplicationId);
		creativeIndividualDetailsAddressImpl.setCreativeIndividualDetailsId(
			creativeIndividualDetailsId);

		creativeIndividualDetailsAddressImpl.resetOriginalValues();

		return creativeIndividualDetailsAddressImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeIndiDetailsAddressId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		streetAddress = objectInput.readUTF();
		streetAddressLineTwo = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();

		creativeIndividualDetailsId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeIndiDetailsAddressId);

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

		objectOutput.writeLong(creativeIndividualDetailsId);
	}

	public long creativeIndiDetailsAddressId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String streetAddress;
	public String streetAddressLineTwo;
	public long CreativeApplicationId;
	public long creativeIndividualDetailsId;

}