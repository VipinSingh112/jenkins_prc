/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquirePropertyDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquirePropertyDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquirePropertyDetailsCacheModel
	implements CacheModel<AcquirePropertyDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquirePropertyDetailsCacheModel)) {
			return false;
		}

		AcquirePropertyDetailsCacheModel acquirePropertyDetailsCacheModel =
			(AcquirePropertyDetailsCacheModel)object;

		if (acquirePropertyDetailsId ==
				acquirePropertyDetailsCacheModel.acquirePropertyDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquirePropertyDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{acquirePropertyDetailsId=");
		sb.append(acquirePropertyDetailsId);
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
		sb.append(", propertyTenureType=");
		sb.append(propertyTenureType);
		sb.append(", propertyIdentified=");
		sb.append(propertyIdentified);
		sb.append(", propertyAddr=");
		sb.append(propertyAddr);
		sb.append(", propertyDesiredLoc=");
		sb.append(propertyDesiredLoc);
		sb.append(", propertyVolume=");
		sb.append(propertyVolume);
		sb.append(", propertyFolio=");
		sb.append(propertyFolio);
		sb.append(", propertyValuationNum=");
		sb.append(propertyValuationNum);
		sb.append(", propertySketchAttached=");
		sb.append(propertySketchAttached);
		sb.append(", propertyCurrentUse=");
		sb.append(propertyCurrentUse);
		sb.append(", propertyCurrentUseOther=");
		sb.append(propertyCurrentUseOther);
		sb.append(", propertyExistingBuilding=");
		sb.append(propertyExistingBuilding);
		sb.append(", propertyExistingBuildingOther=");
		sb.append(propertyExistingBuildingOther);
		sb.append(", propertyExistingInfrastructure=");
		sb.append(propertyExistingInfrastructure);
		sb.append(", propertyProposedUse=");
		sb.append(propertyProposedUse);
		sb.append(", propertyProposedUseOther=");
		sb.append(propertyProposedUseOther);
		sb.append(", propertyProposedInfrastructure=");
		sb.append(propertyProposedInfrastructure);
		sb.append(", propertyLandAreaHectare=");
		sb.append(propertyLandAreaHectare);
		sb.append(", propertyLandAreaAcres=");
		sb.append(propertyLandAreaAcres);
		sb.append(", propertyLandAreaRoods=");
		sb.append(propertyLandAreaRoods);
		sb.append(", propertyLandAreaPerches=");
		sb.append(propertyLandAreaPerches);
		sb.append(", propertyAdjoiningNorth=");
		sb.append(propertyAdjoiningNorth);
		sb.append(", propertyAdjoiningSouth=");
		sb.append(propertyAdjoiningSouth);
		sb.append(", propertyAdjoiningEast=");
		sb.append(propertyAdjoiningEast);
		sb.append(", propertyAdjoiningWest=");
		sb.append(propertyAdjoiningWest);
		sb.append(", propertyDate=");
		sb.append(propertyDate);
		sb.append(", propertyAdditionalInfo=");
		sb.append(propertyAdditionalInfo);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquirePropertyDetails toEntityModel() {
		AcquirePropertyDetailsImpl acquirePropertyDetailsImpl =
			new AcquirePropertyDetailsImpl();

		acquirePropertyDetailsImpl.setAcquirePropertyDetailsId(
			acquirePropertyDetailsId);
		acquirePropertyDetailsImpl.setGroupId(groupId);
		acquirePropertyDetailsImpl.setCompanyId(companyId);
		acquirePropertyDetailsImpl.setUserId(userId);

		if (userName == null) {
			acquirePropertyDetailsImpl.setUserName("");
		}
		else {
			acquirePropertyDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquirePropertyDetailsImpl.setCreateDate(null);
		}
		else {
			acquirePropertyDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquirePropertyDetailsImpl.setModifiedDate(null);
		}
		else {
			acquirePropertyDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (propertyTenureType == null) {
			acquirePropertyDetailsImpl.setPropertyTenureType("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyTenureType(
				propertyTenureType);
		}

		if (propertyIdentified == null) {
			acquirePropertyDetailsImpl.setPropertyIdentified("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyIdentified(
				propertyIdentified);
		}

		if (propertyAddr == null) {
			acquirePropertyDetailsImpl.setPropertyAddr("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyAddr(propertyAddr);
		}

		if (propertyDesiredLoc == null) {
			acquirePropertyDetailsImpl.setPropertyDesiredLoc("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyDesiredLoc(
				propertyDesiredLoc);
		}

		if (propertyVolume == null) {
			acquirePropertyDetailsImpl.setPropertyVolume("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyVolume(propertyVolume);
		}

		if (propertyFolio == null) {
			acquirePropertyDetailsImpl.setPropertyFolio("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyFolio(propertyFolio);
		}

		if (propertyValuationNum == null) {
			acquirePropertyDetailsImpl.setPropertyValuationNum("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyValuationNum(
				propertyValuationNum);
		}

		if (propertySketchAttached == null) {
			acquirePropertyDetailsImpl.setPropertySketchAttached("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertySketchAttached(
				propertySketchAttached);
		}

		if (propertyCurrentUse == null) {
			acquirePropertyDetailsImpl.setPropertyCurrentUse("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyCurrentUse(
				propertyCurrentUse);
		}

		if (propertyCurrentUseOther == null) {
			acquirePropertyDetailsImpl.setPropertyCurrentUseOther("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyCurrentUseOther(
				propertyCurrentUseOther);
		}

		if (propertyExistingBuilding == null) {
			acquirePropertyDetailsImpl.setPropertyExistingBuilding("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyExistingBuilding(
				propertyExistingBuilding);
		}

		if (propertyExistingBuildingOther == null) {
			acquirePropertyDetailsImpl.setPropertyExistingBuildingOther("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyExistingBuildingOther(
				propertyExistingBuildingOther);
		}

		if (propertyExistingInfrastructure == null) {
			acquirePropertyDetailsImpl.setPropertyExistingInfrastructure("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyExistingInfrastructure(
				propertyExistingInfrastructure);
		}

		if (propertyProposedUse == null) {
			acquirePropertyDetailsImpl.setPropertyProposedUse("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyProposedUse(
				propertyProposedUse);
		}

		if (propertyProposedUseOther == null) {
			acquirePropertyDetailsImpl.setPropertyProposedUseOther("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyProposedUseOther(
				propertyProposedUseOther);
		}

		if (propertyProposedInfrastructure == null) {
			acquirePropertyDetailsImpl.setPropertyProposedInfrastructure("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyProposedInfrastructure(
				propertyProposedInfrastructure);
		}

		if (propertyLandAreaHectare == null) {
			acquirePropertyDetailsImpl.setPropertyLandAreaHectare("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyLandAreaHectare(
				propertyLandAreaHectare);
		}

		if (propertyLandAreaAcres == null) {
			acquirePropertyDetailsImpl.setPropertyLandAreaAcres("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyLandAreaAcres(
				propertyLandAreaAcres);
		}

		if (propertyLandAreaRoods == null) {
			acquirePropertyDetailsImpl.setPropertyLandAreaRoods("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyLandAreaRoods(
				propertyLandAreaRoods);
		}

		if (propertyLandAreaPerches == null) {
			acquirePropertyDetailsImpl.setPropertyLandAreaPerches("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyLandAreaPerches(
				propertyLandAreaPerches);
		}

		if (propertyAdjoiningNorth == null) {
			acquirePropertyDetailsImpl.setPropertyAdjoiningNorth("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyAdjoiningNorth(
				propertyAdjoiningNorth);
		}

		if (propertyAdjoiningSouth == null) {
			acquirePropertyDetailsImpl.setPropertyAdjoiningSouth("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyAdjoiningSouth(
				propertyAdjoiningSouth);
		}

		if (propertyAdjoiningEast == null) {
			acquirePropertyDetailsImpl.setPropertyAdjoiningEast("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyAdjoiningEast(
				propertyAdjoiningEast);
		}

		if (propertyAdjoiningWest == null) {
			acquirePropertyDetailsImpl.setPropertyAdjoiningWest("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyAdjoiningWest(
				propertyAdjoiningWest);
		}

		if (propertyDate == Long.MIN_VALUE) {
			acquirePropertyDetailsImpl.setPropertyDate(null);
		}
		else {
			acquirePropertyDetailsImpl.setPropertyDate(new Date(propertyDate));
		}

		if (propertyAdditionalInfo == null) {
			acquirePropertyDetailsImpl.setPropertyAdditionalInfo("");
		}
		else {
			acquirePropertyDetailsImpl.setPropertyAdditionalInfo(
				propertyAdditionalInfo);
		}

		acquirePropertyDetailsImpl.setAcquireApplicationId(
			acquireApplicationId);

		acquirePropertyDetailsImpl.resetOriginalValues();

		return acquirePropertyDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquirePropertyDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		propertyTenureType = objectInput.readUTF();
		propertyIdentified = objectInput.readUTF();
		propertyAddr = objectInput.readUTF();
		propertyDesiredLoc = objectInput.readUTF();
		propertyVolume = objectInput.readUTF();
		propertyFolio = objectInput.readUTF();
		propertyValuationNum = objectInput.readUTF();
		propertySketchAttached = objectInput.readUTF();
		propertyCurrentUse = objectInput.readUTF();
		propertyCurrentUseOther = objectInput.readUTF();
		propertyExistingBuilding = objectInput.readUTF();
		propertyExistingBuildingOther = objectInput.readUTF();
		propertyExistingInfrastructure = objectInput.readUTF();
		propertyProposedUse = objectInput.readUTF();
		propertyProposedUseOther = objectInput.readUTF();
		propertyProposedInfrastructure = objectInput.readUTF();
		propertyLandAreaHectare = objectInput.readUTF();
		propertyLandAreaAcres = objectInput.readUTF();
		propertyLandAreaRoods = objectInput.readUTF();
		propertyLandAreaPerches = objectInput.readUTF();
		propertyAdjoiningNorth = objectInput.readUTF();
		propertyAdjoiningSouth = objectInput.readUTF();
		propertyAdjoiningEast = objectInput.readUTF();
		propertyAdjoiningWest = objectInput.readUTF();
		propertyDate = objectInput.readLong();
		propertyAdditionalInfo = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquirePropertyDetailsId);

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

		if (propertyTenureType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyTenureType);
		}

		if (propertyIdentified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyIdentified);
		}

		if (propertyAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyAddr);
		}

		if (propertyDesiredLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyDesiredLoc);
		}

		if (propertyVolume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyVolume);
		}

		if (propertyFolio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyFolio);
		}

		if (propertyValuationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyValuationNum);
		}

		if (propertySketchAttached == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertySketchAttached);
		}

		if (propertyCurrentUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyCurrentUse);
		}

		if (propertyCurrentUseOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyCurrentUseOther);
		}

		if (propertyExistingBuilding == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyExistingBuilding);
		}

		if (propertyExistingBuildingOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyExistingBuildingOther);
		}

		if (propertyExistingInfrastructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyExistingInfrastructure);
		}

		if (propertyProposedUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyProposedUse);
		}

		if (propertyProposedUseOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyProposedUseOther);
		}

		if (propertyProposedInfrastructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyProposedInfrastructure);
		}

		if (propertyLandAreaHectare == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyLandAreaHectare);
		}

		if (propertyLandAreaAcres == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyLandAreaAcres);
		}

		if (propertyLandAreaRoods == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyLandAreaRoods);
		}

		if (propertyLandAreaPerches == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyLandAreaPerches);
		}

		if (propertyAdjoiningNorth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyAdjoiningNorth);
		}

		if (propertyAdjoiningSouth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyAdjoiningSouth);
		}

		if (propertyAdjoiningEast == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyAdjoiningEast);
		}

		if (propertyAdjoiningWest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyAdjoiningWest);
		}

		objectOutput.writeLong(propertyDate);

		if (propertyAdditionalInfo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(propertyAdditionalInfo);
		}

		objectOutput.writeLong(acquireApplicationId);
	}

	public long acquirePropertyDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String propertyTenureType;
	public String propertyIdentified;
	public String propertyAddr;
	public String propertyDesiredLoc;
	public String propertyVolume;
	public String propertyFolio;
	public String propertyValuationNum;
	public String propertySketchAttached;
	public String propertyCurrentUse;
	public String propertyCurrentUseOther;
	public String propertyExistingBuilding;
	public String propertyExistingBuildingOther;
	public String propertyExistingInfrastructure;
	public String propertyProposedUse;
	public String propertyProposedUseOther;
	public String propertyProposedInfrastructure;
	public String propertyLandAreaHectare;
	public String propertyLandAreaAcres;
	public String propertyLandAreaRoods;
	public String propertyLandAreaPerches;
	public String propertyAdjoiningNorth;
	public String propertyAdjoiningSouth;
	public String propertyAdjoiningEast;
	public String propertyAdjoiningWest;
	public long propertyDate;
	public String propertyAdditionalInfo;
	public long acquireApplicationId;

}