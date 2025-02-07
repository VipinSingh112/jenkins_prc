/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireLandPropertyDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireLandPropertyDetailsCacheModel
	implements CacheModel<AcquireLandPropertyDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireLandPropertyDetailsCacheModel)) {
			return false;
		}

		AcquireLandPropertyDetailsCacheModel
			acquireLandPropertyDetailsCacheModel =
				(AcquireLandPropertyDetailsCacheModel)object;

		if (acquireLandPropertyDetailsId ==
				acquireLandPropertyDetailsCacheModel.
					acquireLandPropertyDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireLandPropertyDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(55);

		sb.append("{acquireLandPropertyDetailsId=");
		sb.append(acquireLandPropertyDetailsId);
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
		sb.append(", landPropIdentified=");
		sb.append(landPropIdentified);
		sb.append(", landPropAddr=");
		sb.append(landPropAddr);
		sb.append(", landPropOccupation=");
		sb.append(landPropOccupation);
		sb.append(", landPropOccupationPeriod=");
		sb.append(landPropOccupationPeriod);
		sb.append(", landPropTenureType=");
		sb.append(landPropTenureType);
		sb.append(", landPropDesiredLoc=");
		sb.append(landPropDesiredLoc);
		sb.append(", landPropProposedUse=");
		sb.append(landPropProposedUse);
		sb.append(", landPropProposedUseOther=");
		sb.append(landPropProposedUseOther);
		sb.append(", landPropPropTenureType=");
		sb.append(landPropPropTenureType);
		sb.append(", landPropApplied=");
		sb.append(landPropApplied);
		sb.append(", landPropApplicationDate=");
		sb.append(landPropApplicationDate);
		sb.append(", landPropExistingBuilding=");
		sb.append(landPropExistingBuilding);
		sb.append(", landPropExistingBuildingOther=");
		sb.append(landPropExistingBuildingOther);
		sb.append(", landPropOwn=");
		sb.append(landPropOwn);
		sb.append(", landPropGovAcquired=");
		sb.append(landPropGovAcquired);
		sb.append(", landPropStateDetails=");
		sb.append(landPropStateDetails);
		sb.append(", landPropPaymentMethod=");
		sb.append(landPropPaymentMethod);
		sb.append(", landPropPaymentMethodOther=");
		sb.append(landPropPaymentMethodOther);
		sb.append(", landPropComments=");
		sb.append(landPropComments);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireLandPropertyDetails toEntityModel() {
		AcquireLandPropertyDetailsImpl acquireLandPropertyDetailsImpl =
			new AcquireLandPropertyDetailsImpl();

		acquireLandPropertyDetailsImpl.setAcquireLandPropertyDetailsId(
			acquireLandPropertyDetailsId);
		acquireLandPropertyDetailsImpl.setGroupId(groupId);
		acquireLandPropertyDetailsImpl.setCompanyId(companyId);
		acquireLandPropertyDetailsImpl.setUserId(userId);

		if (userName == null) {
			acquireLandPropertyDetailsImpl.setUserName("");
		}
		else {
			acquireLandPropertyDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireLandPropertyDetailsImpl.setCreateDate(null);
		}
		else {
			acquireLandPropertyDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireLandPropertyDetailsImpl.setModifiedDate(null);
		}
		else {
			acquireLandPropertyDetailsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (landPropIdentified == null) {
			acquireLandPropertyDetailsImpl.setLandPropIdentified("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropIdentified(
				landPropIdentified);
		}

		if (landPropAddr == null) {
			acquireLandPropertyDetailsImpl.setLandPropAddr("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropAddr(landPropAddr);
		}

		if (landPropOccupation == null) {
			acquireLandPropertyDetailsImpl.setLandPropOccupation("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropOccupation(
				landPropOccupation);
		}

		if (landPropOccupationPeriod == null) {
			acquireLandPropertyDetailsImpl.setLandPropOccupationPeriod("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropOccupationPeriod(
				landPropOccupationPeriod);
		}

		if (landPropTenureType == null) {
			acquireLandPropertyDetailsImpl.setLandPropTenureType("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropTenureType(
				landPropTenureType);
		}

		if (landPropDesiredLoc == null) {
			acquireLandPropertyDetailsImpl.setLandPropDesiredLoc("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropDesiredLoc(
				landPropDesiredLoc);
		}

		if (landPropProposedUse == null) {
			acquireLandPropertyDetailsImpl.setLandPropProposedUse("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropProposedUse(
				landPropProposedUse);
		}

		if (landPropProposedUseOther == null) {
			acquireLandPropertyDetailsImpl.setLandPropProposedUseOther("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropProposedUseOther(
				landPropProposedUseOther);
		}

		if (landPropPropTenureType == null) {
			acquireLandPropertyDetailsImpl.setLandPropPropTenureType("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropPropTenureType(
				landPropPropTenureType);
		}

		if (landPropApplied == null) {
			acquireLandPropertyDetailsImpl.setLandPropApplied("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropApplied(landPropApplied);
		}

		if (landPropApplicationDate == Long.MIN_VALUE) {
			acquireLandPropertyDetailsImpl.setLandPropApplicationDate(null);
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropApplicationDate(
				new Date(landPropApplicationDate));
		}

		if (landPropExistingBuilding == null) {
			acquireLandPropertyDetailsImpl.setLandPropExistingBuilding("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropExistingBuilding(
				landPropExistingBuilding);
		}

		if (landPropExistingBuildingOther == null) {
			acquireLandPropertyDetailsImpl.setLandPropExistingBuildingOther("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropExistingBuildingOther(
				landPropExistingBuildingOther);
		}

		if (landPropOwn == null) {
			acquireLandPropertyDetailsImpl.setLandPropOwn("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropOwn(landPropOwn);
		}

		if (landPropGovAcquired == null) {
			acquireLandPropertyDetailsImpl.setLandPropGovAcquired("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropGovAcquired(
				landPropGovAcquired);
		}

		if (landPropStateDetails == null) {
			acquireLandPropertyDetailsImpl.setLandPropStateDetails("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropStateDetails(
				landPropStateDetails);
		}

		if (landPropPaymentMethod == null) {
			acquireLandPropertyDetailsImpl.setLandPropPaymentMethod("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropPaymentMethod(
				landPropPaymentMethod);
		}

		if (landPropPaymentMethodOther == null) {
			acquireLandPropertyDetailsImpl.setLandPropPaymentMethodOther("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropPaymentMethodOther(
				landPropPaymentMethodOther);
		}

		if (landPropComments == null) {
			acquireLandPropertyDetailsImpl.setLandPropComments("");
		}
		else {
			acquireLandPropertyDetailsImpl.setLandPropComments(
				landPropComments);
		}

		acquireLandPropertyDetailsImpl.setAcquireApplicationId(
			acquireApplicationId);

		acquireLandPropertyDetailsImpl.resetOriginalValues();

		return acquireLandPropertyDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireLandPropertyDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		landPropIdentified = objectInput.readUTF();
		landPropAddr = objectInput.readUTF();
		landPropOccupation = objectInput.readUTF();
		landPropOccupationPeriod = objectInput.readUTF();
		landPropTenureType = objectInput.readUTF();
		landPropDesiredLoc = objectInput.readUTF();
		landPropProposedUse = objectInput.readUTF();
		landPropProposedUseOther = objectInput.readUTF();
		landPropPropTenureType = objectInput.readUTF();
		landPropApplied = objectInput.readUTF();
		landPropApplicationDate = objectInput.readLong();
		landPropExistingBuilding = objectInput.readUTF();
		landPropExistingBuildingOther = objectInput.readUTF();
		landPropOwn = objectInput.readUTF();
		landPropGovAcquired = objectInput.readUTF();
		landPropStateDetails = objectInput.readUTF();
		landPropPaymentMethod = objectInput.readUTF();
		landPropPaymentMethodOther = objectInput.readUTF();
		landPropComments = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireLandPropertyDetailsId);

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

		if (landPropIdentified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropIdentified);
		}

		if (landPropAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropAddr);
		}

		if (landPropOccupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropOccupation);
		}

		if (landPropOccupationPeriod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropOccupationPeriod);
		}

		if (landPropTenureType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropTenureType);
		}

		if (landPropDesiredLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropDesiredLoc);
		}

		if (landPropProposedUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropProposedUse);
		}

		if (landPropProposedUseOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropProposedUseOther);
		}

		if (landPropPropTenureType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropPropTenureType);
		}

		if (landPropApplied == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropApplied);
		}

		objectOutput.writeLong(landPropApplicationDate);

		if (landPropExistingBuilding == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropExistingBuilding);
		}

		if (landPropExistingBuildingOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropExistingBuildingOther);
		}

		if (landPropOwn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropOwn);
		}

		if (landPropGovAcquired == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropGovAcquired);
		}

		if (landPropStateDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropStateDetails);
		}

		if (landPropPaymentMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropPaymentMethod);
		}

		if (landPropPaymentMethodOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropPaymentMethodOther);
		}

		if (landPropComments == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landPropComments);
		}

		objectOutput.writeLong(acquireApplicationId);
	}

	public long acquireLandPropertyDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String landPropIdentified;
	public String landPropAddr;
	public String landPropOccupation;
	public String landPropOccupationPeriod;
	public String landPropTenureType;
	public String landPropDesiredLoc;
	public String landPropProposedUse;
	public String landPropProposedUseOther;
	public String landPropPropTenureType;
	public String landPropApplied;
	public long landPropApplicationDate;
	public String landPropExistingBuilding;
	public String landPropExistingBuildingOther;
	public String landPropOwn;
	public String landPropGovAcquired;
	public String landPropStateDetails;
	public String landPropPaymentMethod;
	public String landPropPaymentMethodOther;
	public String landPropComments;
	public long acquireApplicationId;

}