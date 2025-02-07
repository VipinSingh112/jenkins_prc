/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisConsentByPropertyOwner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CannabisConsentByPropertyOwner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisConsentByPropertyOwnerCacheModel
	implements CacheModel<CannabisConsentByPropertyOwner>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisConsentByPropertyOwnerCacheModel)) {
			return false;
		}

		CannabisConsentByPropertyOwnerCacheModel
			cannabisConsentByPropertyOwnerCacheModel =
				(CannabisConsentByPropertyOwnerCacheModel)object;

		if (cannabisCPOId ==
				cannabisConsentByPropertyOwnerCacheModel.cannabisCPOId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisCPOId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cannabisCPOId=");
		sb.append(cannabisCPOId);
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
		sb.append(", typeOfProperty=");
		sb.append(typeOfProperty);
		sb.append(", descriptionOfProperty=");
		sb.append(descriptionOfProperty);
		sb.append(", descriptionOfIntendedUse=");
		sb.append(descriptionOfIntendedUse);
		sb.append(", landType=");
		sb.append(landType);
		sb.append(", ownsProperty=");
		sb.append(ownsProperty);
		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisConsentByPropertyOwner toEntityModel() {
		CannabisConsentByPropertyOwnerImpl cannabisConsentByPropertyOwnerImpl =
			new CannabisConsentByPropertyOwnerImpl();

		if (uuid == null) {
			cannabisConsentByPropertyOwnerImpl.setUuid("");
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setUuid(uuid);
		}

		cannabisConsentByPropertyOwnerImpl.setCannabisCPOId(cannabisCPOId);
		cannabisConsentByPropertyOwnerImpl.setGroupId(groupId);
		cannabisConsentByPropertyOwnerImpl.setCompanyId(companyId);
		cannabisConsentByPropertyOwnerImpl.setUserId(userId);

		if (userName == null) {
			cannabisConsentByPropertyOwnerImpl.setUserName("");
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cannabisConsentByPropertyOwnerImpl.setCreateDate(null);
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cannabisConsentByPropertyOwnerImpl.setModifiedDate(null);
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (typeOfProperty == null) {
			cannabisConsentByPropertyOwnerImpl.setTypeOfProperty("");
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setTypeOfProperty(
				typeOfProperty);
		}

		if (descriptionOfProperty == null) {
			cannabisConsentByPropertyOwnerImpl.setDescriptionOfProperty("");
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setDescriptionOfProperty(
				descriptionOfProperty);
		}

		if (descriptionOfIntendedUse == null) {
			cannabisConsentByPropertyOwnerImpl.setDescriptionOfIntendedUse("");
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setDescriptionOfIntendedUse(
				descriptionOfIntendedUse);
		}

		if (landType == null) {
			cannabisConsentByPropertyOwnerImpl.setLandType("");
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setLandType(landType);
		}

		if (ownsProperty == null) {
			cannabisConsentByPropertyOwnerImpl.setOwnsProperty("");
		}
		else {
			cannabisConsentByPropertyOwnerImpl.setOwnsProperty(ownsProperty);
		}

		cannabisConsentByPropertyOwnerImpl.setCannabisApplicationId(
			cannabisApplicationId);

		cannabisConsentByPropertyOwnerImpl.resetOriginalValues();

		return cannabisConsentByPropertyOwnerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		cannabisCPOId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfProperty = objectInput.readUTF();
		descriptionOfProperty = objectInput.readUTF();
		descriptionOfIntendedUse = objectInput.readUTF();
		landType = objectInput.readUTF();
		ownsProperty = objectInput.readUTF();

		cannabisApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(cannabisCPOId);

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

		if (typeOfProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfProperty);
		}

		if (descriptionOfProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descriptionOfProperty);
		}

		if (descriptionOfIntendedUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descriptionOfIntendedUse);
		}

		if (landType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landType);
		}

		if (ownsProperty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownsProperty);
		}

		objectOutput.writeLong(cannabisApplicationId);
	}

	public String uuid;
	public long cannabisCPOId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfProperty;
	public String descriptionOfProperty;
	public String descriptionOfIntendedUse;
	public String landType;
	public String ownsProperty;
	public long cannabisApplicationId;

}