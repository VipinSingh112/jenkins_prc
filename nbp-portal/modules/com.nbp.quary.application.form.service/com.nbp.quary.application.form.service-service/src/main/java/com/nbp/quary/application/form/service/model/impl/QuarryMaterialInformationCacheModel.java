/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryMaterialInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryMaterialInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryMaterialInformationCacheModel
	implements CacheModel<QuarryMaterialInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryMaterialInformationCacheModel)) {
			return false;
		}

		QuarryMaterialInformationCacheModel
			quarryMaterialInformationCacheModel =
				(QuarryMaterialInformationCacheModel)object;

		if (materialInfoId ==
				quarryMaterialInformationCacheModel.materialInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, materialInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{materialInfoId=");
		sb.append(materialInfoId);
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
		sb.append(", typeOfMaterial=");
		sb.append(typeOfMaterial);
		sb.append(", reserveEstimate=");
		sb.append(reserveEstimate);
		sb.append(", estimateDailyProd=");
		sb.append(estimateDailyProd);
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
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryMaterialInformation toEntityModel() {
		QuarryMaterialInformationImpl quarryMaterialInformationImpl =
			new QuarryMaterialInformationImpl();

		quarryMaterialInformationImpl.setMaterialInfoId(materialInfoId);
		quarryMaterialInformationImpl.setGroupId(groupId);
		quarryMaterialInformationImpl.setCompanyId(companyId);
		quarryMaterialInformationImpl.setUserId(userId);

		if (userName == null) {
			quarryMaterialInformationImpl.setUserName("");
		}
		else {
			quarryMaterialInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryMaterialInformationImpl.setCreateDate(null);
		}
		else {
			quarryMaterialInformationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryMaterialInformationImpl.setModifiedDate(null);
		}
		else {
			quarryMaterialInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (typeOfMaterial == null) {
			quarryMaterialInformationImpl.setTypeOfMaterial("");
		}
		else {
			quarryMaterialInformationImpl.setTypeOfMaterial(typeOfMaterial);
		}

		if (reserveEstimate == null) {
			quarryMaterialInformationImpl.setReserveEstimate("");
		}
		else {
			quarryMaterialInformationImpl.setReserveEstimate(reserveEstimate);
		}

		if (estimateDailyProd == null) {
			quarryMaterialInformationImpl.setEstimateDailyProd("");
		}
		else {
			quarryMaterialInformationImpl.setEstimateDailyProd(
				estimateDailyProd);
		}

		if (actualSizeOfQuary == null) {
			quarryMaterialInformationImpl.setActualSizeOfQuary("");
		}
		else {
			quarryMaterialInformationImpl.setActualSizeOfQuary(
				actualSizeOfQuary);
		}

		if (hasQuarrySubmitted == null) {
			quarryMaterialInformationImpl.setHasQuarrySubmitted("");
		}
		else {
			quarryMaterialInformationImpl.setHasQuarrySubmitted(
				hasQuarrySubmitted);
		}

		if (sixCopiesOfLocation == null) {
			quarryMaterialInformationImpl.setSixCopiesOfLocation("");
		}
		else {
			quarryMaterialInformationImpl.setSixCopiesOfLocation(
				sixCopiesOfLocation);
		}

		if (legalAccessToLand == null) {
			quarryMaterialInformationImpl.setLegalAccessToLand("");
		}
		else {
			quarryMaterialInformationImpl.setLegalAccessToLand(
				legalAccessToLand);
		}

		if (ownerShipEnclosed == null) {
			quarryMaterialInformationImpl.setOwnerShipEnclosed("");
		}
		else {
			quarryMaterialInformationImpl.setOwnerShipEnclosed(
				ownerShipEnclosed);
		}

		if (adjacentPropOwner == null) {
			quarryMaterialInformationImpl.setAdjacentPropOwner("");
		}
		else {
			quarryMaterialInformationImpl.setAdjacentPropOwner(
				adjacentPropOwner);
		}

		quarryMaterialInformationImpl.setQuarryApplicationId(
			quarryApplicationId);

		quarryMaterialInformationImpl.resetOriginalValues();

		return quarryMaterialInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		materialInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfMaterial = objectInput.readUTF();
		reserveEstimate = objectInput.readUTF();
		estimateDailyProd = objectInput.readUTF();
		actualSizeOfQuary = objectInput.readUTF();
		hasQuarrySubmitted = objectInput.readUTF();
		sixCopiesOfLocation = objectInput.readUTF();
		legalAccessToLand = objectInput.readUTF();
		ownerShipEnclosed = objectInput.readUTF();
		adjacentPropOwner = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(materialInfoId);

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

		if (typeOfMaterial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfMaterial);
		}

		if (reserveEstimate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reserveEstimate);
		}

		if (estimateDailyProd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estimateDailyProd);
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

		objectOutput.writeLong(quarryApplicationId);
	}

	public long materialInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfMaterial;
	public String reserveEstimate;
	public String estimateDailyProd;
	public String actualSizeOfQuary;
	public String hasQuarrySubmitted;
	public String sixCopiesOfLocation;
	public String legalAccessToLand;
	public String ownerShipEnclosed;
	public String adjacentPropOwner;
	public long quarryApplicationId;

}