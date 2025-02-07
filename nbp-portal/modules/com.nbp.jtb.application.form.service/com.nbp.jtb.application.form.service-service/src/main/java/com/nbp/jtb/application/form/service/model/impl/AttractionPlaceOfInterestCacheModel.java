/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionPlaceOfInterest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionPlaceOfInterestCacheModel
	implements CacheModel<AttractionPlaceOfInterest>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionPlaceOfInterestCacheModel)) {
			return false;
		}

		AttractionPlaceOfInterestCacheModel
			attractionPlaceOfInterestCacheModel =
				(AttractionPlaceOfInterestCacheModel)object;

		if (attractionPlaceOfInterestId ==
				attractionPlaceOfInterestCacheModel.
					attractionPlaceOfInterestId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionPlaceOfInterestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{attractionPlaceOfInterestId=");
		sb.append(attractionPlaceOfInterestId);
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
		sb.append(", placeOfInterest=");
		sb.append(placeOfInterest);
		sb.append(", typeOfRole=");
		sb.append(typeOfRole);
		sb.append(", placeInterestOwnerName=");
		sb.append(placeInterestOwnerName);
		sb.append(", nameOfInterestLocation=");
		sb.append(nameOfInterestLocation);
		sb.append(", placeOfInterestLocation=");
		sb.append(placeOfInterestLocation);
		sb.append(", placeOfInterestMailing=");
		sb.append(placeOfInterestMailing);
		sb.append(", placeOfInterestTelephone=");
		sb.append(placeOfInterestTelephone);
		sb.append(", placeOfInterestEmail=");
		sb.append(placeOfInterestEmail);
		sb.append(", placeOfInterestEmployeesNo=");
		sb.append(placeOfInterestEmployeesNo);
		sb.append(", placeOfInterestParish=");
		sb.append(placeOfInterestParish);
		sb.append(", placeOfInterestOwnerGenDec=");
		sb.append(placeOfInterestOwnerGenDec);
		sb.append(", placeOfInterestHotelLaws=");
		sb.append(placeOfInterestHotelLaws);
		sb.append(", placeOfInterestDate=");
		sb.append(placeOfInterestDate);
		sb.append(", placeOfInterestName=");
		sb.append(placeOfInterestName);
		sb.append(", placeOfInterestOperating=");
		sb.append(placeOfInterestOperating);
		sb.append(", placeOfInterestAcresLand=");
		sb.append(placeOfInterestAcresLand);
		sb.append(", walkingTour=");
		sb.append(walkingTour);
		sb.append(", cemeteryTour=");
		sb.append(cemeteryTour);
		sb.append(", gardenTour=");
		sb.append(gardenTour);
		sb.append(", placeOfInterestRooms=");
		sb.append(placeOfInterestRooms);
		sb.append(", placeOfInterestTentSpace=");
		sb.append(placeOfInterestTentSpace);
		sb.append(", placeOfInterestShowers=");
		sb.append(placeOfInterestShowers);
		sb.append(", placeOfInterestSanitary=");
		sb.append(placeOfInterestSanitary);
		sb.append(", placeOfInterestSignDate=");
		sb.append(placeOfInterestSignDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionPlaceOfInterest toEntityModel() {
		AttractionPlaceOfInterestImpl attractionPlaceOfInterestImpl =
			new AttractionPlaceOfInterestImpl();

		attractionPlaceOfInterestImpl.setAttractionPlaceOfInterestId(
			attractionPlaceOfInterestId);
		attractionPlaceOfInterestImpl.setGroupId(groupId);
		attractionPlaceOfInterestImpl.setCompanyId(companyId);
		attractionPlaceOfInterestImpl.setUserId(userId);

		if (userName == null) {
			attractionPlaceOfInterestImpl.setUserName("");
		}
		else {
			attractionPlaceOfInterestImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionPlaceOfInterestImpl.setCreateDate(null);
		}
		else {
			attractionPlaceOfInterestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionPlaceOfInterestImpl.setModifiedDate(null);
		}
		else {
			attractionPlaceOfInterestImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (placeOfInterest == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterest("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterest(placeOfInterest);
		}

		if (typeOfRole == null) {
			attractionPlaceOfInterestImpl.setTypeOfRole("");
		}
		else {
			attractionPlaceOfInterestImpl.setTypeOfRole(typeOfRole);
		}

		if (placeInterestOwnerName == null) {
			attractionPlaceOfInterestImpl.setPlaceInterestOwnerName("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceInterestOwnerName(
				placeInterestOwnerName);
		}

		if (nameOfInterestLocation == null) {
			attractionPlaceOfInterestImpl.setNameOfInterestLocation("");
		}
		else {
			attractionPlaceOfInterestImpl.setNameOfInterestLocation(
				nameOfInterestLocation);
		}

		if (placeOfInterestLocation == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestLocation("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestLocation(
				placeOfInterestLocation);
		}

		if (placeOfInterestMailing == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestMailing("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestMailing(
				placeOfInterestMailing);
		}

		if (placeOfInterestTelephone == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestTelephone("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestTelephone(
				placeOfInterestTelephone);
		}

		if (placeOfInterestEmail == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestEmail("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestEmail(
				placeOfInterestEmail);
		}

		if (placeOfInterestEmployeesNo == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestEmployeesNo("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestEmployeesNo(
				placeOfInterestEmployeesNo);
		}

		if (placeOfInterestParish == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestParish("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestParish(
				placeOfInterestParish);
		}

		if (placeOfInterestOwnerGenDec == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestOwnerGenDec("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestOwnerGenDec(
				placeOfInterestOwnerGenDec);
		}

		if (placeOfInterestHotelLaws == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestHotelLaws("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestHotelLaws(
				placeOfInterestHotelLaws);
		}

		if (placeOfInterestDate == Long.MIN_VALUE) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestDate(null);
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestDate(
				new Date(placeOfInterestDate));
		}

		if (placeOfInterestName == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestName("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestName(
				placeOfInterestName);
		}

		if (placeOfInterestOperating == Long.MIN_VALUE) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestOperating(null);
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestOperating(
				new Date(placeOfInterestOperating));
		}

		if (placeOfInterestAcresLand == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestAcresLand("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestAcresLand(
				placeOfInterestAcresLand);
		}

		if (walkingTour == null) {
			attractionPlaceOfInterestImpl.setWalkingTour("");
		}
		else {
			attractionPlaceOfInterestImpl.setWalkingTour(walkingTour);
		}

		if (cemeteryTour == null) {
			attractionPlaceOfInterestImpl.setCemeteryTour("");
		}
		else {
			attractionPlaceOfInterestImpl.setCemeteryTour(cemeteryTour);
		}

		if (gardenTour == null) {
			attractionPlaceOfInterestImpl.setGardenTour("");
		}
		else {
			attractionPlaceOfInterestImpl.setGardenTour(gardenTour);
		}

		if (placeOfInterestRooms == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestRooms("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestRooms(
				placeOfInterestRooms);
		}

		if (placeOfInterestTentSpace == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestTentSpace("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestTentSpace(
				placeOfInterestTentSpace);
		}

		if (placeOfInterestShowers == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestShowers("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestShowers(
				placeOfInterestShowers);
		}

		if (placeOfInterestSanitary == null) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestSanitary("");
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestSanitary(
				placeOfInterestSanitary);
		}

		if (placeOfInterestSignDate == Long.MIN_VALUE) {
			attractionPlaceOfInterestImpl.setPlaceOfInterestSignDate(null);
		}
		else {
			attractionPlaceOfInterestImpl.setPlaceOfInterestSignDate(
				new Date(placeOfInterestSignDate));
		}

		attractionPlaceOfInterestImpl.setJtbApplicationId(jtbApplicationId);

		attractionPlaceOfInterestImpl.resetOriginalValues();

		return attractionPlaceOfInterestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionPlaceOfInterestId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		placeOfInterest = objectInput.readUTF();
		typeOfRole = objectInput.readUTF();
		placeInterestOwnerName = objectInput.readUTF();
		nameOfInterestLocation = objectInput.readUTF();
		placeOfInterestLocation = objectInput.readUTF();
		placeOfInterestMailing = objectInput.readUTF();
		placeOfInterestTelephone = objectInput.readUTF();
		placeOfInterestEmail = objectInput.readUTF();
		placeOfInterestEmployeesNo = objectInput.readUTF();
		placeOfInterestParish = objectInput.readUTF();
		placeOfInterestOwnerGenDec = objectInput.readUTF();
		placeOfInterestHotelLaws = objectInput.readUTF();
		placeOfInterestDate = objectInput.readLong();
		placeOfInterestName = objectInput.readUTF();
		placeOfInterestOperating = objectInput.readLong();
		placeOfInterestAcresLand = objectInput.readUTF();
		walkingTour = objectInput.readUTF();
		cemeteryTour = objectInput.readUTF();
		gardenTour = objectInput.readUTF();
		placeOfInterestRooms = objectInput.readUTF();
		placeOfInterestTentSpace = objectInput.readUTF();
		placeOfInterestShowers = objectInput.readUTF();
		placeOfInterestSanitary = objectInput.readUTF();
		placeOfInterestSignDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionPlaceOfInterestId);

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

		if (placeOfInterest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterest);
		}

		if (typeOfRole == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfRole);
		}

		if (placeInterestOwnerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeInterestOwnerName);
		}

		if (nameOfInterestLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfInterestLocation);
		}

		if (placeOfInterestLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestLocation);
		}

		if (placeOfInterestMailing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestMailing);
		}

		if (placeOfInterestTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestTelephone);
		}

		if (placeOfInterestEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestEmail);
		}

		if (placeOfInterestEmployeesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestEmployeesNo);
		}

		if (placeOfInterestParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestParish);
		}

		if (placeOfInterestOwnerGenDec == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestOwnerGenDec);
		}

		if (placeOfInterestHotelLaws == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestHotelLaws);
		}

		objectOutput.writeLong(placeOfInterestDate);

		if (placeOfInterestName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestName);
		}

		objectOutput.writeLong(placeOfInterestOperating);

		if (placeOfInterestAcresLand == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestAcresLand);
		}

		if (walkingTour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(walkingTour);
		}

		if (cemeteryTour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cemeteryTour);
		}

		if (gardenTour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gardenTour);
		}

		if (placeOfInterestRooms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestRooms);
		}

		if (placeOfInterestTentSpace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestTentSpace);
		}

		if (placeOfInterestShowers == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestShowers);
		}

		if (placeOfInterestSanitary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(placeOfInterestSanitary);
		}

		objectOutput.writeLong(placeOfInterestSignDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionPlaceOfInterestId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String placeOfInterest;
	public String typeOfRole;
	public String placeInterestOwnerName;
	public String nameOfInterestLocation;
	public String placeOfInterestLocation;
	public String placeOfInterestMailing;
	public String placeOfInterestTelephone;
	public String placeOfInterestEmail;
	public String placeOfInterestEmployeesNo;
	public String placeOfInterestParish;
	public String placeOfInterestOwnerGenDec;
	public String placeOfInterestHotelLaws;
	public long placeOfInterestDate;
	public String placeOfInterestName;
	public long placeOfInterestOperating;
	public String placeOfInterestAcresLand;
	public String walkingTour;
	public String cemeteryTour;
	public String gardenTour;
	public String placeOfInterestRooms;
	public String placeOfInterestTentSpace;
	public String placeOfInterestShowers;
	public String placeOfInterestSanitary;
	public long placeOfInterestSignDate;
	public long jtbApplicationId;

}