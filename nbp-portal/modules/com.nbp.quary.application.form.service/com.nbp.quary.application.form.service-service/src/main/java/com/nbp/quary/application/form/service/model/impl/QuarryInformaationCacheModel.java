/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryInformaation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryInformaation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryInformaationCacheModel
	implements CacheModel<QuarryInformaation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryInformaationCacheModel)) {
			return false;
		}

		QuarryInformaationCacheModel quarryInformaationCacheModel =
			(QuarryInformaationCacheModel)object;

		if (auarryInfoId == quarryInformaationCacheModel.auarryInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auarryInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{auarryInfoId=");
		sb.append(auarryInfoId);
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
		sb.append(", location=");
		sb.append(location);
		sb.append(", district=");
		sb.append(district);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", actualSizeOfQuary=");
		sb.append(actualSizeOfQuary);
		sb.append(", hasQuarrySubmitted=");
		sb.append(hasQuarrySubmitted);
		sb.append(", sixCopiesOfLocation=");
		sb.append(sixCopiesOfLocation);
		sb.append(", legalAccessToLand=");
		sb.append(legalAccessToLand);
		sb.append(", ownerShipEnclosed=");
		sb.append(ownerShipEnclosed);
		sb.append(", adjacentPropOwner=");
		sb.append(adjacentPropOwner);
		sb.append(", measurement=");
		sb.append(measurement);
		sb.append(", landOwnerName=");
		sb.append(landOwnerName);
		sb.append(", landOwnerAddress=");
		sb.append(landOwnerAddress);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryInformaation toEntityModel() {
		QuarryInformaationImpl quarryInformaationImpl =
			new QuarryInformaationImpl();

		quarryInformaationImpl.setAuarryInfoId(auarryInfoId);
		quarryInformaationImpl.setGroupId(groupId);
		quarryInformaationImpl.setCompanyId(companyId);
		quarryInformaationImpl.setUserId(userId);

		if (userName == null) {
			quarryInformaationImpl.setUserName("");
		}
		else {
			quarryInformaationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryInformaationImpl.setCreateDate(null);
		}
		else {
			quarryInformaationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryInformaationImpl.setModifiedDate(null);
		}
		else {
			quarryInformaationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (location == null) {
			quarryInformaationImpl.setLocation("");
		}
		else {
			quarryInformaationImpl.setLocation(location);
		}

		if (district == null) {
			quarryInformaationImpl.setDistrict("");
		}
		else {
			quarryInformaationImpl.setDistrict(district);
		}

		if (parish == null) {
			quarryInformaationImpl.setParish("");
		}
		else {
			quarryInformaationImpl.setParish(parish);
		}

		if (actualSizeOfQuary == null) {
			quarryInformaationImpl.setActualSizeOfQuary("");
		}
		else {
			quarryInformaationImpl.setActualSizeOfQuary(actualSizeOfQuary);
		}

		if (hasQuarrySubmitted == null) {
			quarryInformaationImpl.setHasQuarrySubmitted("");
		}
		else {
			quarryInformaationImpl.setHasQuarrySubmitted(hasQuarrySubmitted);
		}

		if (sixCopiesOfLocation == null) {
			quarryInformaationImpl.setSixCopiesOfLocation("");
		}
		else {
			quarryInformaationImpl.setSixCopiesOfLocation(sixCopiesOfLocation);
		}

		if (legalAccessToLand == null) {
			quarryInformaationImpl.setLegalAccessToLand("");
		}
		else {
			quarryInformaationImpl.setLegalAccessToLand(legalAccessToLand);
		}

		if (ownerShipEnclosed == null) {
			quarryInformaationImpl.setOwnerShipEnclosed("");
		}
		else {
			quarryInformaationImpl.setOwnerShipEnclosed(ownerShipEnclosed);
		}

		if (adjacentPropOwner == null) {
			quarryInformaationImpl.setAdjacentPropOwner("");
		}
		else {
			quarryInformaationImpl.setAdjacentPropOwner(adjacentPropOwner);
		}

		if (measurement == null) {
			quarryInformaationImpl.setMeasurement("");
		}
		else {
			quarryInformaationImpl.setMeasurement(measurement);
		}

		if (landOwnerName == null) {
			quarryInformaationImpl.setLandOwnerName("");
		}
		else {
			quarryInformaationImpl.setLandOwnerName(landOwnerName);
		}

		if (landOwnerAddress == null) {
			quarryInformaationImpl.setLandOwnerAddress("");
		}
		else {
			quarryInformaationImpl.setLandOwnerAddress(landOwnerAddress);
		}

		quarryInformaationImpl.setQuarryApplicationId(quarryApplicationId);

		quarryInformaationImpl.resetOriginalValues();

		return quarryInformaationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		auarryInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		location = objectInput.readUTF();
		district = objectInput.readUTF();
		parish = objectInput.readUTF();
		actualSizeOfQuary = objectInput.readUTF();
		hasQuarrySubmitted = objectInput.readUTF();
		sixCopiesOfLocation = objectInput.readUTF();
		legalAccessToLand = objectInput.readUTF();
		ownerShipEnclosed = objectInput.readUTF();
		adjacentPropOwner = objectInput.readUTF();
		measurement = objectInput.readUTF();
		landOwnerName = objectInput.readUTF();
		landOwnerAddress = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(auarryInfoId);

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

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (district == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(district);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (actualSizeOfQuary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actualSizeOfQuary);
		}

		if (hasQuarrySubmitted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hasQuarrySubmitted);
		}

		if (sixCopiesOfLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sixCopiesOfLocation);
		}

		if (legalAccessToLand == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(legalAccessToLand);
		}

		if (ownerShipEnclosed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerShipEnclosed);
		}

		if (adjacentPropOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(adjacentPropOwner);
		}

		if (measurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(measurement);
		}

		if (landOwnerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landOwnerName);
		}

		if (landOwnerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landOwnerAddress);
		}

		objectOutput.writeLong(quarryApplicationId);
	}

	public long auarryInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String location;
	public String district;
	public String parish;
	public String actualSizeOfQuary;
	public String hasQuarrySubmitted;
	public String sixCopiesOfLocation;
	public String legalAccessToLand;
	public String ownerShipEnclosed;
	public String adjacentPropOwner;
	public String measurement;
	public String landOwnerName;
	public String landOwnerAddress;
	public long quarryApplicationId;

}