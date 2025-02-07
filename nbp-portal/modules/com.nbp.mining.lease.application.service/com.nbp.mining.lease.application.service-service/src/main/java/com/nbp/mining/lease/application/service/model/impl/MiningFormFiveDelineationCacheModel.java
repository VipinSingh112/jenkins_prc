/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningFormFiveDelineation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningFormFiveDelineationCacheModel
	implements CacheModel<MiningFormFiveDelineation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningFormFiveDelineationCacheModel)) {
			return false;
		}

		MiningFormFiveDelineationCacheModel
			miningFormFiveDelineationCacheModel =
				(MiningFormFiveDelineationCacheModel)object;

		if (miningFormFiveDelineationId ==
				miningFormFiveDelineationCacheModel.
					miningFormFiveDelineationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningFormFiveDelineationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(79);

		sb.append("{miningFormFiveDelineationId=");
		sb.append(miningFormFiveDelineationId);
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
		sb.append(", approximatelyArea=");
		sb.append(approximatelyArea);
		sb.append(", location=");
		sb.append(location);
		sb.append(", coordinates=");
		sb.append(coordinates);
		sb.append(", northSide=");
		sb.append(northSide);
		sb.append(", eastSide=");
		sb.append(eastSide);
		sb.append(", firstNorthSide=");
		sb.append(firstNorthSide);
		sb.append(", firstEastSide=");
		sb.append(firstEastSide);
		sb.append(", firstLocationGrid=");
		sb.append(firstLocationGrid);
		sb.append(", firstDegrees=");
		sb.append(firstDegrees);
		sb.append(", secondNorthSide=");
		sb.append(secondNorthSide);
		sb.append(", secondEastSide=");
		sb.append(secondEastSide);
		sb.append(", secondLocationGrid=");
		sb.append(secondLocationGrid);
		sb.append(", secondDegrees=");
		sb.append(secondDegrees);
		sb.append(", thirdCoordinates=");
		sb.append(thirdCoordinates);
		sb.append(", thirdNorthSide=");
		sb.append(thirdNorthSide);
		sb.append(", thirdEastSide=");
		sb.append(thirdEastSide);
		sb.append(", thirdDegrees=");
		sb.append(thirdDegrees);
		sb.append(", thirdGridLoc=");
		sb.append(thirdGridLoc);
		sb.append(", thirdGridL=");
		sb.append(thirdGridL);
		sb.append(", fourthCoordinates=");
		sb.append(fourthCoordinates);
		sb.append(", fourthNorthSide=");
		sb.append(fourthNorthSide);
		sb.append(", fourthEastSide=");
		sb.append(fourthEastSide);
		sb.append(", fourthDegrees=");
		sb.append(fourthDegrees);
		sb.append(", fourthGridLoc=");
		sb.append(fourthGridLoc);
		sb.append(", fourthGridL=");
		sb.append(fourthGridL);
		sb.append(", fifthCoordinates=");
		sb.append(fifthCoordinates);
		sb.append(", fifthNorthSide=");
		sb.append(fifthNorthSide);
		sb.append(", fifthEastSide=");
		sb.append(fifthEastSide);
		sb.append(", fifthDegrees=");
		sb.append(fifthDegrees);
		sb.append(", fifthGridLoc=");
		sb.append(fifthGridLoc);
		sb.append(", fifthGridL=");
		sb.append(fifthGridL);
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningFormFiveDelineation toEntityModel() {
		MiningFormFiveDelineationImpl miningFormFiveDelineationImpl =
			new MiningFormFiveDelineationImpl();

		miningFormFiveDelineationImpl.setMiningFormFiveDelineationId(
			miningFormFiveDelineationId);
		miningFormFiveDelineationImpl.setGroupId(groupId);
		miningFormFiveDelineationImpl.setCompanyId(companyId);
		miningFormFiveDelineationImpl.setUserId(userId);

		if (userName == null) {
			miningFormFiveDelineationImpl.setUserName("");
		}
		else {
			miningFormFiveDelineationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningFormFiveDelineationImpl.setCreateDate(null);
		}
		else {
			miningFormFiveDelineationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningFormFiveDelineationImpl.setModifiedDate(null);
		}
		else {
			miningFormFiveDelineationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (approximatelyArea == null) {
			miningFormFiveDelineationImpl.setApproximatelyArea("");
		}
		else {
			miningFormFiveDelineationImpl.setApproximatelyArea(
				approximatelyArea);
		}

		if (location == null) {
			miningFormFiveDelineationImpl.setLocation("");
		}
		else {
			miningFormFiveDelineationImpl.setLocation(location);
		}

		if (coordinates == null) {
			miningFormFiveDelineationImpl.setCoordinates("");
		}
		else {
			miningFormFiveDelineationImpl.setCoordinates(coordinates);
		}

		if (northSide == null) {
			miningFormFiveDelineationImpl.setNorthSide("");
		}
		else {
			miningFormFiveDelineationImpl.setNorthSide(northSide);
		}

		if (eastSide == null) {
			miningFormFiveDelineationImpl.setEastSide("");
		}
		else {
			miningFormFiveDelineationImpl.setEastSide(eastSide);
		}

		if (firstNorthSide == null) {
			miningFormFiveDelineationImpl.setFirstNorthSide("");
		}
		else {
			miningFormFiveDelineationImpl.setFirstNorthSide(firstNorthSide);
		}

		if (firstEastSide == null) {
			miningFormFiveDelineationImpl.setFirstEastSide("");
		}
		else {
			miningFormFiveDelineationImpl.setFirstEastSide(firstEastSide);
		}

		if (firstLocationGrid == null) {
			miningFormFiveDelineationImpl.setFirstLocationGrid("");
		}
		else {
			miningFormFiveDelineationImpl.setFirstLocationGrid(
				firstLocationGrid);
		}

		if (firstDegrees == null) {
			miningFormFiveDelineationImpl.setFirstDegrees("");
		}
		else {
			miningFormFiveDelineationImpl.setFirstDegrees(firstDegrees);
		}

		if (secondNorthSide == null) {
			miningFormFiveDelineationImpl.setSecondNorthSide("");
		}
		else {
			miningFormFiveDelineationImpl.setSecondNorthSide(secondNorthSide);
		}

		if (secondEastSide == null) {
			miningFormFiveDelineationImpl.setSecondEastSide("");
		}
		else {
			miningFormFiveDelineationImpl.setSecondEastSide(secondEastSide);
		}

		if (secondLocationGrid == null) {
			miningFormFiveDelineationImpl.setSecondLocationGrid("");
		}
		else {
			miningFormFiveDelineationImpl.setSecondLocationGrid(
				secondLocationGrid);
		}

		if (secondDegrees == null) {
			miningFormFiveDelineationImpl.setSecondDegrees("");
		}
		else {
			miningFormFiveDelineationImpl.setSecondDegrees(secondDegrees);
		}

		if (thirdCoordinates == null) {
			miningFormFiveDelineationImpl.setThirdCoordinates("");
		}
		else {
			miningFormFiveDelineationImpl.setThirdCoordinates(thirdCoordinates);
		}

		if (thirdNorthSide == null) {
			miningFormFiveDelineationImpl.setThirdNorthSide("");
		}
		else {
			miningFormFiveDelineationImpl.setThirdNorthSide(thirdNorthSide);
		}

		if (thirdEastSide == null) {
			miningFormFiveDelineationImpl.setThirdEastSide("");
		}
		else {
			miningFormFiveDelineationImpl.setThirdEastSide(thirdEastSide);
		}

		if (thirdDegrees == null) {
			miningFormFiveDelineationImpl.setThirdDegrees("");
		}
		else {
			miningFormFiveDelineationImpl.setThirdDegrees(thirdDegrees);
		}

		if (thirdGridLoc == null) {
			miningFormFiveDelineationImpl.setThirdGridLoc("");
		}
		else {
			miningFormFiveDelineationImpl.setThirdGridLoc(thirdGridLoc);
		}

		if (thirdGridL == null) {
			miningFormFiveDelineationImpl.setThirdGridL("");
		}
		else {
			miningFormFiveDelineationImpl.setThirdGridL(thirdGridL);
		}

		if (fourthCoordinates == null) {
			miningFormFiveDelineationImpl.setFourthCoordinates("");
		}
		else {
			miningFormFiveDelineationImpl.setFourthCoordinates(
				fourthCoordinates);
		}

		if (fourthNorthSide == null) {
			miningFormFiveDelineationImpl.setFourthNorthSide("");
		}
		else {
			miningFormFiveDelineationImpl.setFourthNorthSide(fourthNorthSide);
		}

		if (fourthEastSide == null) {
			miningFormFiveDelineationImpl.setFourthEastSide("");
		}
		else {
			miningFormFiveDelineationImpl.setFourthEastSide(fourthEastSide);
		}

		if (fourthDegrees == null) {
			miningFormFiveDelineationImpl.setFourthDegrees("");
		}
		else {
			miningFormFiveDelineationImpl.setFourthDegrees(fourthDegrees);
		}

		if (fourthGridLoc == null) {
			miningFormFiveDelineationImpl.setFourthGridLoc("");
		}
		else {
			miningFormFiveDelineationImpl.setFourthGridLoc(fourthGridLoc);
		}

		if (fourthGridL == null) {
			miningFormFiveDelineationImpl.setFourthGridL("");
		}
		else {
			miningFormFiveDelineationImpl.setFourthGridL(fourthGridL);
		}

		if (fifthCoordinates == null) {
			miningFormFiveDelineationImpl.setFifthCoordinates("");
		}
		else {
			miningFormFiveDelineationImpl.setFifthCoordinates(fifthCoordinates);
		}

		if (fifthNorthSide == null) {
			miningFormFiveDelineationImpl.setFifthNorthSide("");
		}
		else {
			miningFormFiveDelineationImpl.setFifthNorthSide(fifthNorthSide);
		}

		if (fifthEastSide == null) {
			miningFormFiveDelineationImpl.setFifthEastSide("");
		}
		else {
			miningFormFiveDelineationImpl.setFifthEastSide(fifthEastSide);
		}

		if (fifthDegrees == null) {
			miningFormFiveDelineationImpl.setFifthDegrees("");
		}
		else {
			miningFormFiveDelineationImpl.setFifthDegrees(fifthDegrees);
		}

		if (fifthGridLoc == null) {
			miningFormFiveDelineationImpl.setFifthGridLoc("");
		}
		else {
			miningFormFiveDelineationImpl.setFifthGridLoc(fifthGridLoc);
		}

		if (fifthGridL == null) {
			miningFormFiveDelineationImpl.setFifthGridL("");
		}
		else {
			miningFormFiveDelineationImpl.setFifthGridL(fifthGridL);
		}

		miningFormFiveDelineationImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningFormFiveDelineationImpl.resetOriginalValues();

		return miningFormFiveDelineationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningFormFiveDelineationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		approximatelyArea = objectInput.readUTF();
		location = objectInput.readUTF();
		coordinates = objectInput.readUTF();
		northSide = objectInput.readUTF();
		eastSide = objectInput.readUTF();
		firstNorthSide = objectInput.readUTF();
		firstEastSide = objectInput.readUTF();
		firstLocationGrid = objectInput.readUTF();
		firstDegrees = objectInput.readUTF();
		secondNorthSide = objectInput.readUTF();
		secondEastSide = objectInput.readUTF();
		secondLocationGrid = objectInput.readUTF();
		secondDegrees = objectInput.readUTF();
		thirdCoordinates = objectInput.readUTF();
		thirdNorthSide = objectInput.readUTF();
		thirdEastSide = objectInput.readUTF();
		thirdDegrees = objectInput.readUTF();
		thirdGridLoc = objectInput.readUTF();
		thirdGridL = objectInput.readUTF();
		fourthCoordinates = objectInput.readUTF();
		fourthNorthSide = objectInput.readUTF();
		fourthEastSide = objectInput.readUTF();
		fourthDegrees = objectInput.readUTF();
		fourthGridLoc = objectInput.readUTF();
		fourthGridL = objectInput.readUTF();
		fifthCoordinates = objectInput.readUTF();
		fifthNorthSide = objectInput.readUTF();
		fifthEastSide = objectInput.readUTF();
		fifthDegrees = objectInput.readUTF();
		fifthGridLoc = objectInput.readUTF();
		fifthGridL = objectInput.readUTF();

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningFormFiveDelineationId);

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

		if (approximatelyArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approximatelyArea);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (coordinates == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(coordinates);
		}

		if (northSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(northSide);
		}

		if (eastSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eastSide);
		}

		if (firstNorthSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstNorthSide);
		}

		if (firstEastSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstEastSide);
		}

		if (firstLocationGrid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstLocationGrid);
		}

		if (firstDegrees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstDegrees);
		}

		if (secondNorthSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondNorthSide);
		}

		if (secondEastSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondEastSide);
		}

		if (secondLocationGrid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondLocationGrid);
		}

		if (secondDegrees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondDegrees);
		}

		if (thirdCoordinates == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdCoordinates);
		}

		if (thirdNorthSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdNorthSide);
		}

		if (thirdEastSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdEastSide);
		}

		if (thirdDegrees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdDegrees);
		}

		if (thirdGridLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdGridLoc);
		}

		if (thirdGridL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdGridL);
		}

		if (fourthCoordinates == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthCoordinates);
		}

		if (fourthNorthSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthNorthSide);
		}

		if (fourthEastSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthEastSide);
		}

		if (fourthDegrees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthDegrees);
		}

		if (fourthGridLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthGridLoc);
		}

		if (fourthGridL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthGridL);
		}

		if (fifthCoordinates == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthCoordinates);
		}

		if (fifthNorthSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthNorthSide);
		}

		if (fifthEastSide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthEastSide);
		}

		if (fifthDegrees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthDegrees);
		}

		if (fifthGridLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthGridLoc);
		}

		if (fifthGridL == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthGridL);
		}

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public long miningFormFiveDelineationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String approximatelyArea;
	public String location;
	public String coordinates;
	public String northSide;
	public String eastSide;
	public String firstNorthSide;
	public String firstEastSide;
	public String firstLocationGrid;
	public String firstDegrees;
	public String secondNorthSide;
	public String secondEastSide;
	public String secondLocationGrid;
	public String secondDegrees;
	public String thirdCoordinates;
	public String thirdNorthSide;
	public String thirdEastSide;
	public String thirdDegrees;
	public String thirdGridLoc;
	public String thirdGridL;
	public String fourthCoordinates;
	public String fourthNorthSide;
	public String fourthEastSide;
	public String fourthDegrees;
	public String fourthGridLoc;
	public String fourthGridL;
	public String fifthCoordinates;
	public String fifthNorthSide;
	public String fifthEastSide;
	public String fifthDegrees;
	public String fifthGridLoc;
	public String fifthGridL;
	public long miningLeaseApplicationId;

}