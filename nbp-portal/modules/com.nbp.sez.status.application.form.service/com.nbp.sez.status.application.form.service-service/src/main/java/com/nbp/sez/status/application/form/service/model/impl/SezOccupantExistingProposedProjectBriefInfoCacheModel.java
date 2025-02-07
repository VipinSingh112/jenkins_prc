/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantExistingProposedProjectBriefInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantExistingProposedProjectBriefInfoCacheModel
	implements CacheModel<SezOccupantExistingProposedProjectBriefInfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				SezOccupantExistingProposedProjectBriefInfoCacheModel)) {

			return false;
		}

		SezOccupantExistingProposedProjectBriefInfoCacheModel
			sezOccupantExistingProposedProjectBriefInfoCacheModel =
				(SezOccupantExistingProposedProjectBriefInfoCacheModel)object;

		if (sezOccExistPorpId ==
				sezOccupantExistingProposedProjectBriefInfoCacheModel.
					sezOccExistPorpId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccExistPorpId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(81);

		sb.append("{sezOccExistPorpId=");
		sb.append(sezOccExistPorpId);
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
		sb.append(", occBusinessDesc=");
		sb.append(occBusinessDesc);
		sb.append(", occDeniedFreeZoneAppr=");
		sb.append(occDeniedFreeZoneAppr);
		sb.append(", occDeniedFreeZoneApprDate=");
		sb.append(occDeniedFreeZoneApprDate);
		sb.append(", occDeniedFreeZoneApprType=");
		sb.append(occDeniedFreeZoneApprType);
		sb.append(", occFreeZoneLocation=");
		sb.append(occFreeZoneLocation);
		sb.append(", occSezDevLoc=");
		sb.append(occSezDevLoc);
		sb.append(", occSezDevLocDesc=");
		sb.append(occSezDevLocDesc);
		sb.append(", occSubConcessionBuilding=");
		sb.append(occSubConcessionBuilding);
		sb.append(", occSubConcessionTown=");
		sb.append(occSubConcessionTown);
		sb.append(", occSubConcessionParish=");
		sb.append(occSubConcessionParish);
		sb.append(", occCompleteSurveyTechDesc=");
		sb.append(occCompleteSurveyTechDesc);
		sb.append(", occNorthBoundaries=");
		sb.append(occNorthBoundaries);
		sb.append(", occEastBoundaries=");
		sb.append(occEastBoundaries);
		sb.append(", occWestBoundaries=");
		sb.append(occWestBoundaries);
		sb.append(", occSouthBoundaries=");
		sb.append(occSouthBoundaries);
		sb.append(", occOwnership=");
		sb.append(occOwnership);
		sb.append(", occLeaseYears=");
		sb.append(occLeaseYears);
		sb.append(", occVolume=");
		sb.append(occVolume);
		sb.append(", occFolio=");
		sb.append(occFolio);
		sb.append(", occFloorNum=");
		sb.append(occFloorNum);
		sb.append(", occUndertakenService=");
		sb.append(occUndertakenService);
		sb.append(", occUndertakenManufacturing=");
		sb.append(occUndertakenManufacturing);
		sb.append(", occSeaPortDistanceKM=");
		sb.append(occSeaPortDistanceKM);
		sb.append(", occSeaPortDistanceMI=");
		sb.append(occSeaPortDistanceMI);
		sb.append(", occAirportDistanceKM=");
		sb.append(occAirportDistanceKM);
		sb.append(", occAirportDistanceMI=");
		sb.append(occAirportDistanceMI);
		sb.append(", occRoadDistanceKM=");
		sb.append(occRoadDistanceKM);
		sb.append(", occRoadDistanceMI=");
		sb.append(occRoadDistanceMI);
		sb.append(", occRailDistanceKM=");
		sb.append(occRailDistanceKM);
		sb.append(", occRailDistanceMI=");
		sb.append(occRailDistanceMI);
		sb.append(", occCustomDistanceKM=");
		sb.append(occCustomDistanceKM);
		sb.append(", occCustomDistanceMI=");
		sb.append(occCustomDistanceMI);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantExistingProposedProjectBriefInfo toEntityModel() {
		SezOccupantExistingProposedProjectBriefInfoImpl
			sezOccupantExistingProposedProjectBriefInfoImpl =
				new SezOccupantExistingProposedProjectBriefInfoImpl();

		sezOccupantExistingProposedProjectBriefInfoImpl.setSezOccExistPorpId(
			sezOccExistPorpId);
		sezOccupantExistingProposedProjectBriefInfoImpl.setGroupId(groupId);
		sezOccupantExistingProposedProjectBriefInfoImpl.setCompanyId(companyId);
		sezOccupantExistingProposedProjectBriefInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setUserName("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setUserName(
				userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setModifiedDate(
				null);
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occBusinessDesc == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccBusinessDesc(
				"");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccBusinessDesc(
				occBusinessDesc);
		}

		if (occDeniedFreeZoneAppr == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccDeniedFreeZoneAppr("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccDeniedFreeZoneAppr(occDeniedFreeZoneAppr);
		}

		if (occDeniedFreeZoneApprDate == Long.MIN_VALUE) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccDeniedFreeZoneApprDate(null);
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccDeniedFreeZoneApprDate(
					new Date(occDeniedFreeZoneApprDate));
		}

		if (occDeniedFreeZoneApprType == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccDeniedFreeZoneApprType("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccDeniedFreeZoneApprType(occDeniedFreeZoneApprType);
		}

		if (occFreeZoneLocation == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccFreeZoneLocation("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccFreeZoneLocation(occFreeZoneLocation);
		}

		if (occSezDevLoc == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccSezDevLoc("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccSezDevLoc(
				occSezDevLoc);
		}

		if (occSezDevLocDesc == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccSezDevLocDesc(
				"");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccSezDevLocDesc(
				occSezDevLocDesc);
		}

		if (occSubConcessionBuilding == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSubConcessionBuilding("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSubConcessionBuilding(occSubConcessionBuilding);
		}

		if (occSubConcessionTown == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSubConcessionTown("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSubConcessionTown(occSubConcessionTown);
		}

		if (occSubConcessionParish == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSubConcessionParish("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSubConcessionParish(occSubConcessionParish);
		}

		if (occCompleteSurveyTechDesc == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccCompleteSurveyTechDesc("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccCompleteSurveyTechDesc(occCompleteSurveyTechDesc);
		}

		if (occNorthBoundaries == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccNorthBoundaries("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccNorthBoundaries(occNorthBoundaries);
		}

		if (occEastBoundaries == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccEastBoundaries("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccEastBoundaries(occEastBoundaries);
		}

		if (occWestBoundaries == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccWestBoundaries("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccWestBoundaries(occWestBoundaries);
		}

		if (occSouthBoundaries == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSouthBoundaries("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSouthBoundaries(occSouthBoundaries);
		}

		if (occOwnership == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccOwnership("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccOwnership(
				occOwnership);
		}

		if (occLeaseYears == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccLeaseYears(
				"");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccLeaseYears(
				occLeaseYears);
		}

		if (occVolume == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccVolume("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccVolume(
				occVolume);
		}

		if (occFolio == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccFolio("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccFolio(
				occFolio);
		}

		if (occFloorNum == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccFloorNum("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.setOccFloorNum(
				occFloorNum);
		}

		if (occUndertakenService == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccUndertakenService("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccUndertakenService(occUndertakenService);
		}

		if (occUndertakenManufacturing == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccUndertakenManufacturing("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccUndertakenManufacturing(occUndertakenManufacturing);
		}

		if (occSeaPortDistanceKM == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSeaPortDistanceKM("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSeaPortDistanceKM(occSeaPortDistanceKM);
		}

		if (occSeaPortDistanceMI == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSeaPortDistanceMI("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccSeaPortDistanceMI(occSeaPortDistanceMI);
		}

		if (occAirportDistanceKM == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccAirportDistanceKM("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccAirportDistanceKM(occAirportDistanceKM);
		}

		if (occAirportDistanceMI == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccAirportDistanceMI("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccAirportDistanceMI(occAirportDistanceMI);
		}

		if (occRoadDistanceKM == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRoadDistanceKM("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRoadDistanceKM(occRoadDistanceKM);
		}

		if (occRoadDistanceMI == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRoadDistanceMI("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRoadDistanceMI(occRoadDistanceMI);
		}

		if (occRailDistanceKM == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRailDistanceKM("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRailDistanceKM(occRailDistanceKM);
		}

		if (occRailDistanceMI == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRailDistanceMI("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccRailDistanceMI(occRailDistanceMI);
		}

		if (occCustomDistanceKM == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccCustomDistanceKM("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccCustomDistanceKM(occCustomDistanceKM);
		}

		if (occCustomDistanceMI == null) {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccCustomDistanceMI("");
		}
		else {
			sezOccupantExistingProposedProjectBriefInfoImpl.
				setOccCustomDistanceMI(occCustomDistanceMI);
		}

		sezOccupantExistingProposedProjectBriefInfoImpl.
			setSezStatusApplicationId(sezStatusApplicationId);

		sezOccupantExistingProposedProjectBriefInfoImpl.resetOriginalValues();

		return sezOccupantExistingProposedProjectBriefInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccExistPorpId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occBusinessDesc = objectInput.readUTF();
		occDeniedFreeZoneAppr = objectInput.readUTF();
		occDeniedFreeZoneApprDate = objectInput.readLong();
		occDeniedFreeZoneApprType = objectInput.readUTF();
		occFreeZoneLocation = objectInput.readUTF();
		occSezDevLoc = objectInput.readUTF();
		occSezDevLocDesc = objectInput.readUTF();
		occSubConcessionBuilding = objectInput.readUTF();
		occSubConcessionTown = objectInput.readUTF();
		occSubConcessionParish = objectInput.readUTF();
		occCompleteSurveyTechDesc = objectInput.readUTF();
		occNorthBoundaries = objectInput.readUTF();
		occEastBoundaries = objectInput.readUTF();
		occWestBoundaries = objectInput.readUTF();
		occSouthBoundaries = objectInput.readUTF();
		occOwnership = objectInput.readUTF();
		occLeaseYears = objectInput.readUTF();
		occVolume = objectInput.readUTF();
		occFolio = objectInput.readUTF();
		occFloorNum = objectInput.readUTF();
		occUndertakenService = objectInput.readUTF();
		occUndertakenManufacturing = objectInput.readUTF();
		occSeaPortDistanceKM = objectInput.readUTF();
		occSeaPortDistanceMI = objectInput.readUTF();
		occAirportDistanceKM = objectInput.readUTF();
		occAirportDistanceMI = objectInput.readUTF();
		occRoadDistanceKM = objectInput.readUTF();
		occRoadDistanceMI = objectInput.readUTF();
		occRailDistanceKM = objectInput.readUTF();
		occRailDistanceMI = objectInput.readUTF();
		occCustomDistanceKM = objectInput.readUTF();
		occCustomDistanceMI = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccExistPorpId);

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

		if (occBusinessDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occBusinessDesc);
		}

		if (occDeniedFreeZoneAppr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDeniedFreeZoneAppr);
		}

		objectOutput.writeLong(occDeniedFreeZoneApprDate);

		if (occDeniedFreeZoneApprType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDeniedFreeZoneApprType);
		}

		if (occFreeZoneLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occFreeZoneLocation);
		}

		if (occSezDevLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSezDevLoc);
		}

		if (occSezDevLocDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSezDevLocDesc);
		}

		if (occSubConcessionBuilding == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSubConcessionBuilding);
		}

		if (occSubConcessionTown == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSubConcessionTown);
		}

		if (occSubConcessionParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSubConcessionParish);
		}

		if (occCompleteSurveyTechDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occCompleteSurveyTechDesc);
		}

		if (occNorthBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occNorthBoundaries);
		}

		if (occEastBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occEastBoundaries);
		}

		if (occWestBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occWestBoundaries);
		}

		if (occSouthBoundaries == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSouthBoundaries);
		}

		if (occOwnership == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occOwnership);
		}

		if (occLeaseYears == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occLeaseYears);
		}

		if (occVolume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occVolume);
		}

		if (occFolio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occFolio);
		}

		if (occFloorNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occFloorNum);
		}

		if (occUndertakenService == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occUndertakenService);
		}

		if (occUndertakenManufacturing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occUndertakenManufacturing);
		}

		if (occSeaPortDistanceKM == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSeaPortDistanceKM);
		}

		if (occSeaPortDistanceMI == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSeaPortDistanceMI);
		}

		if (occAirportDistanceKM == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occAirportDistanceKM);
		}

		if (occAirportDistanceMI == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occAirportDistanceMI);
		}

		if (occRoadDistanceKM == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occRoadDistanceKM);
		}

		if (occRoadDistanceMI == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occRoadDistanceMI);
		}

		if (occRailDistanceKM == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occRailDistanceKM);
		}

		if (occRailDistanceMI == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occRailDistanceMI);
		}

		if (occCustomDistanceKM == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occCustomDistanceKM);
		}

		if (occCustomDistanceMI == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occCustomDistanceMI);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccExistPorpId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occBusinessDesc;
	public String occDeniedFreeZoneAppr;
	public long occDeniedFreeZoneApprDate;
	public String occDeniedFreeZoneApprType;
	public String occFreeZoneLocation;
	public String occSezDevLoc;
	public String occSezDevLocDesc;
	public String occSubConcessionBuilding;
	public String occSubConcessionTown;
	public String occSubConcessionParish;
	public String occCompleteSurveyTechDesc;
	public String occNorthBoundaries;
	public String occEastBoundaries;
	public String occWestBoundaries;
	public String occSouthBoundaries;
	public String occOwnership;
	public String occLeaseYears;
	public String occVolume;
	public String occFolio;
	public String occFloorNum;
	public String occUndertakenService;
	public String occUndertakenManufacturing;
	public String occSeaPortDistanceKM;
	public String occSeaPortDistanceMI;
	public String occAirportDistanceKM;
	public String occAirportDistanceMI;
	public String occRoadDistanceKM;
	public String occRoadDistanceMI;
	public String occRailDistanceKM;
	public String occRailDistanceMI;
	public String occCustomDistanceKM;
	public String occCustomDistanceMI;
	public long sezStatusApplicationId;

}