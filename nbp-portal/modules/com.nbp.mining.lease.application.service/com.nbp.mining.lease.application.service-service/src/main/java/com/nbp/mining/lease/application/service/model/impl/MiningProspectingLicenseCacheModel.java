/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningProspectingLicense in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningProspectingLicenseCacheModel
	implements CacheModel<MiningProspectingLicense>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningProspectingLicenseCacheModel)) {
			return false;
		}

		MiningProspectingLicenseCacheModel miningProspectingLicenseCacheModel =
			(MiningProspectingLicenseCacheModel)object;

		if (miningProspectingLicenseId ==
				miningProspectingLicenseCacheModel.miningProspectingLicenseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningProspectingLicenseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(105);

		sb.append("{miningProspectingLicenseId=");
		sb.append(miningProspectingLicenseId);
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
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", trnNumber=");
		sb.append(trnNumber);
		sb.append(", nationalityOfApplicant=");
		sb.append(nationalityOfApplicant);
		sb.append(", addressInJamaica=");
		sb.append(addressInJamaica);
		sb.append(", telephoneNumber=");
		sb.append(telephoneNumber);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", numberOfApplicant=");
		sb.append(numberOfApplicant);
		sb.append(", nameOfTheAgent=");
		sb.append(nameOfTheAgent);
		sb.append(", numberOfThisProspecting=");
		sb.append(numberOfThisProspecting);
		sb.append(", prospectingRight=");
		sb.append(prospectingRight);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", licence=");
		sb.append(licence);
		sb.append(", stateTheNearestLandmark=");
		sb.append(stateTheNearestLandmark);
		sb.append(", approximateArea=");
		sb.append(approximateArea);
		sb.append(", mineralForWhichApplicant=");
		sb.append(mineralForWhichApplicant);
		sb.append(", copyOfArticle=");
		sb.append(copyOfArticle);
		sb.append(", dateUponTheLocation=");
		sb.append(dateUponTheLocation);
		sb.append(", proslicenceFeeCheck=");
		sb.append(proslicenceFeeCheck);
		sb.append(", dateSurrender=");
		sb.append(dateSurrender);
		sb.append(", areaOfApproximately=");
		sb.append(areaOfApproximately);
		sb.append(", locationBeacon=");
		sb.append(locationBeacon);
		sb.append(", intersectionCoordinates=");
		sb.append(intersectionCoordinates);
		sb.append(", northTopographical=");
		sb.append(northTopographical);
		sb.append(", eastTopographical=");
		sb.append(eastTopographical);
		sb.append(", firstCornerOfNorth=");
		sb.append(firstCornerOfNorth);
		sb.append(", firstCornerOfEast=");
		sb.append(firstCornerOfEast);
		sb.append(", firstCornerApproximateMeter=");
		sb.append(firstCornerApproximateMeter);
		sb.append(", firstCornerApproximateDegree=");
		sb.append(firstCornerApproximateDegree);
		sb.append(", secondCornerOfNorth=");
		sb.append(secondCornerOfNorth);
		sb.append(", secondCornerOfEast=");
		sb.append(secondCornerOfEast);
		sb.append(", secondCornerApproximateMeter=");
		sb.append(secondCornerApproximateMeter);
		sb.append(", secondCornerApproximateDegree=");
		sb.append(secondCornerApproximateDegree);
		sb.append(", thirdCornerOfNorth=");
		sb.append(thirdCornerOfNorth);
		sb.append(", thirdCornerOfEast=");
		sb.append(thirdCornerOfEast);
		sb.append(", thirdCornerApproximateMeter=");
		sb.append(thirdCornerApproximateMeter);
		sb.append(", thirdCornerApproximateDegree=");
		sb.append(thirdCornerApproximateDegree);
		sb.append(", fourthCornerOfNorth=");
		sb.append(fourthCornerOfNorth);
		sb.append(", fourthCornerOfEast=");
		sb.append(fourthCornerOfEast);
		sb.append(", fourthCornerApproximateMeter=");
		sb.append(fourthCornerApproximateMeter);
		sb.append(", fourthCornerApproximateDegree=");
		sb.append(fourthCornerApproximateDegree);
		sb.append(", fifthCornerOfNorth=");
		sb.append(fifthCornerOfNorth);
		sb.append(", fifthCornerOfEast=");
		sb.append(fifthCornerOfEast);
		sb.append(", fifthCornerApproximateMeter=");
		sb.append(fifthCornerApproximateMeter);
		sb.append(", fifthCornerApproximateDegree=");
		sb.append(fifthCornerApproximateDegree);
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningProspectingLicense toEntityModel() {
		MiningProspectingLicenseImpl miningProspectingLicenseImpl =
			new MiningProspectingLicenseImpl();

		miningProspectingLicenseImpl.setMiningProspectingLicenseId(
			miningProspectingLicenseId);
		miningProspectingLicenseImpl.setGroupId(groupId);
		miningProspectingLicenseImpl.setCompanyId(companyId);
		miningProspectingLicenseImpl.setUserId(userId);

		if (userName == null) {
			miningProspectingLicenseImpl.setUserName("");
		}
		else {
			miningProspectingLicenseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningProspectingLicenseImpl.setCreateDate(null);
		}
		else {
			miningProspectingLicenseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningProspectingLicenseImpl.setModifiedDate(null);
		}
		else {
			miningProspectingLicenseImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfApplicant == null) {
			miningProspectingLicenseImpl.setNameOfApplicant("");
		}
		else {
			miningProspectingLicenseImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (trnNumber == null) {
			miningProspectingLicenseImpl.setTrnNumber("");
		}
		else {
			miningProspectingLicenseImpl.setTrnNumber(trnNumber);
		}

		if (nationalityOfApplicant == null) {
			miningProspectingLicenseImpl.setNationalityOfApplicant("");
		}
		else {
			miningProspectingLicenseImpl.setNationalityOfApplicant(
				nationalityOfApplicant);
		}

		if (addressInJamaica == null) {
			miningProspectingLicenseImpl.setAddressInJamaica("");
		}
		else {
			miningProspectingLicenseImpl.setAddressInJamaica(addressInJamaica);
		}

		if (telephoneNumber == null) {
			miningProspectingLicenseImpl.setTelephoneNumber("");
		}
		else {
			miningProspectingLicenseImpl.setTelephoneNumber(telephoneNumber);
		}

		if (emailAddress == null) {
			miningProspectingLicenseImpl.setEmailAddress("");
		}
		else {
			miningProspectingLicenseImpl.setEmailAddress(emailAddress);
		}

		if (numberOfApplicant == null) {
			miningProspectingLicenseImpl.setNumberOfApplicant("");
		}
		else {
			miningProspectingLicenseImpl.setNumberOfApplicant(
				numberOfApplicant);
		}

		if (nameOfTheAgent == null) {
			miningProspectingLicenseImpl.setNameOfTheAgent("");
		}
		else {
			miningProspectingLicenseImpl.setNameOfTheAgent(nameOfTheAgent);
		}

		if (numberOfThisProspecting == null) {
			miningProspectingLicenseImpl.setNumberOfThisProspecting("");
		}
		else {
			miningProspectingLicenseImpl.setNumberOfThisProspecting(
				numberOfThisProspecting);
		}

		if (prospectingRight == null) {
			miningProspectingLicenseImpl.setProspectingRight("");
		}
		else {
			miningProspectingLicenseImpl.setProspectingRight(prospectingRight);
		}

		if (parish == null) {
			miningProspectingLicenseImpl.setParish("");
		}
		else {
			miningProspectingLicenseImpl.setParish(parish);
		}

		if (licence == null) {
			miningProspectingLicenseImpl.setLicence("");
		}
		else {
			miningProspectingLicenseImpl.setLicence(licence);
		}

		if (stateTheNearestLandmark == null) {
			miningProspectingLicenseImpl.setStateTheNearestLandmark("");
		}
		else {
			miningProspectingLicenseImpl.setStateTheNearestLandmark(
				stateTheNearestLandmark);
		}

		if (approximateArea == null) {
			miningProspectingLicenseImpl.setApproximateArea("");
		}
		else {
			miningProspectingLicenseImpl.setApproximateArea(approximateArea);
		}

		if (mineralForWhichApplicant == null) {
			miningProspectingLicenseImpl.setMineralForWhichApplicant("");
		}
		else {
			miningProspectingLicenseImpl.setMineralForWhichApplicant(
				mineralForWhichApplicant);
		}

		if (copyOfArticle == null) {
			miningProspectingLicenseImpl.setCopyOfArticle("");
		}
		else {
			miningProspectingLicenseImpl.setCopyOfArticle(copyOfArticle);
		}

		if (dateUponTheLocation == Long.MIN_VALUE) {
			miningProspectingLicenseImpl.setDateUponTheLocation(null);
		}
		else {
			miningProspectingLicenseImpl.setDateUponTheLocation(
				new Date(dateUponTheLocation));
		}

		if (proslicenceFeeCheck == null) {
			miningProspectingLicenseImpl.setProslicenceFeeCheck("");
		}
		else {
			miningProspectingLicenseImpl.setProslicenceFeeCheck(
				proslicenceFeeCheck);
		}

		if (dateSurrender == Long.MIN_VALUE) {
			miningProspectingLicenseImpl.setDateSurrender(null);
		}
		else {
			miningProspectingLicenseImpl.setDateSurrender(
				new Date(dateSurrender));
		}

		if (areaOfApproximately == null) {
			miningProspectingLicenseImpl.setAreaOfApproximately("");
		}
		else {
			miningProspectingLicenseImpl.setAreaOfApproximately(
				areaOfApproximately);
		}

		if (locationBeacon == null) {
			miningProspectingLicenseImpl.setLocationBeacon("");
		}
		else {
			miningProspectingLicenseImpl.setLocationBeacon(locationBeacon);
		}

		if (intersectionCoordinates == null) {
			miningProspectingLicenseImpl.setIntersectionCoordinates("");
		}
		else {
			miningProspectingLicenseImpl.setIntersectionCoordinates(
				intersectionCoordinates);
		}

		if (northTopographical == null) {
			miningProspectingLicenseImpl.setNorthTopographical("");
		}
		else {
			miningProspectingLicenseImpl.setNorthTopographical(
				northTopographical);
		}

		if (eastTopographical == null) {
			miningProspectingLicenseImpl.setEastTopographical("");
		}
		else {
			miningProspectingLicenseImpl.setEastTopographical(
				eastTopographical);
		}

		if (firstCornerOfNorth == null) {
			miningProspectingLicenseImpl.setFirstCornerOfNorth("");
		}
		else {
			miningProspectingLicenseImpl.setFirstCornerOfNorth(
				firstCornerOfNorth);
		}

		if (firstCornerOfEast == null) {
			miningProspectingLicenseImpl.setFirstCornerOfEast("");
		}
		else {
			miningProspectingLicenseImpl.setFirstCornerOfEast(
				firstCornerOfEast);
		}

		if (firstCornerApproximateMeter == null) {
			miningProspectingLicenseImpl.setFirstCornerApproximateMeter("");
		}
		else {
			miningProspectingLicenseImpl.setFirstCornerApproximateMeter(
				firstCornerApproximateMeter);
		}

		if (firstCornerApproximateDegree == null) {
			miningProspectingLicenseImpl.setFirstCornerApproximateDegree("");
		}
		else {
			miningProspectingLicenseImpl.setFirstCornerApproximateDegree(
				firstCornerApproximateDegree);
		}

		if (secondCornerOfNorth == null) {
			miningProspectingLicenseImpl.setSecondCornerOfNorth("");
		}
		else {
			miningProspectingLicenseImpl.setSecondCornerOfNorth(
				secondCornerOfNorth);
		}

		if (secondCornerOfEast == null) {
			miningProspectingLicenseImpl.setSecondCornerOfEast("");
		}
		else {
			miningProspectingLicenseImpl.setSecondCornerOfEast(
				secondCornerOfEast);
		}

		if (secondCornerApproximateMeter == null) {
			miningProspectingLicenseImpl.setSecondCornerApproximateMeter("");
		}
		else {
			miningProspectingLicenseImpl.setSecondCornerApproximateMeter(
				secondCornerApproximateMeter);
		}

		if (secondCornerApproximateDegree == null) {
			miningProspectingLicenseImpl.setSecondCornerApproximateDegree("");
		}
		else {
			miningProspectingLicenseImpl.setSecondCornerApproximateDegree(
				secondCornerApproximateDegree);
		}

		if (thirdCornerOfNorth == null) {
			miningProspectingLicenseImpl.setThirdCornerOfNorth("");
		}
		else {
			miningProspectingLicenseImpl.setThirdCornerOfNorth(
				thirdCornerOfNorth);
		}

		if (thirdCornerOfEast == null) {
			miningProspectingLicenseImpl.setThirdCornerOfEast("");
		}
		else {
			miningProspectingLicenseImpl.setThirdCornerOfEast(
				thirdCornerOfEast);
		}

		if (thirdCornerApproximateMeter == null) {
			miningProspectingLicenseImpl.setThirdCornerApproximateMeter("");
		}
		else {
			miningProspectingLicenseImpl.setThirdCornerApproximateMeter(
				thirdCornerApproximateMeter);
		}

		if (thirdCornerApproximateDegree == null) {
			miningProspectingLicenseImpl.setThirdCornerApproximateDegree("");
		}
		else {
			miningProspectingLicenseImpl.setThirdCornerApproximateDegree(
				thirdCornerApproximateDegree);
		}

		if (fourthCornerOfNorth == null) {
			miningProspectingLicenseImpl.setFourthCornerOfNorth("");
		}
		else {
			miningProspectingLicenseImpl.setFourthCornerOfNorth(
				fourthCornerOfNorth);
		}

		if (fourthCornerOfEast == null) {
			miningProspectingLicenseImpl.setFourthCornerOfEast("");
		}
		else {
			miningProspectingLicenseImpl.setFourthCornerOfEast(
				fourthCornerOfEast);
		}

		if (fourthCornerApproximateMeter == null) {
			miningProspectingLicenseImpl.setFourthCornerApproximateMeter("");
		}
		else {
			miningProspectingLicenseImpl.setFourthCornerApproximateMeter(
				fourthCornerApproximateMeter);
		}

		if (fourthCornerApproximateDegree == null) {
			miningProspectingLicenseImpl.setFourthCornerApproximateDegree("");
		}
		else {
			miningProspectingLicenseImpl.setFourthCornerApproximateDegree(
				fourthCornerApproximateDegree);
		}

		if (fifthCornerOfNorth == null) {
			miningProspectingLicenseImpl.setFifthCornerOfNorth("");
		}
		else {
			miningProspectingLicenseImpl.setFifthCornerOfNorth(
				fifthCornerOfNorth);
		}

		if (fifthCornerOfEast == null) {
			miningProspectingLicenseImpl.setFifthCornerOfEast("");
		}
		else {
			miningProspectingLicenseImpl.setFifthCornerOfEast(
				fifthCornerOfEast);
		}

		if (fifthCornerApproximateMeter == null) {
			miningProspectingLicenseImpl.setFifthCornerApproximateMeter("");
		}
		else {
			miningProspectingLicenseImpl.setFifthCornerApproximateMeter(
				fifthCornerApproximateMeter);
		}

		if (fifthCornerApproximateDegree == null) {
			miningProspectingLicenseImpl.setFifthCornerApproximateDegree("");
		}
		else {
			miningProspectingLicenseImpl.setFifthCornerApproximateDegree(
				fifthCornerApproximateDegree);
		}

		miningProspectingLicenseImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningProspectingLicenseImpl.resetOriginalValues();

		return miningProspectingLicenseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningProspectingLicenseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfApplicant = objectInput.readUTF();
		trnNumber = objectInput.readUTF();
		nationalityOfApplicant = objectInput.readUTF();
		addressInJamaica = objectInput.readUTF();
		telephoneNumber = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		numberOfApplicant = objectInput.readUTF();
		nameOfTheAgent = objectInput.readUTF();
		numberOfThisProspecting = objectInput.readUTF();
		prospectingRight = objectInput.readUTF();
		parish = objectInput.readUTF();
		licence = objectInput.readUTF();
		stateTheNearestLandmark = objectInput.readUTF();
		approximateArea = objectInput.readUTF();
		mineralForWhichApplicant = objectInput.readUTF();
		copyOfArticle = objectInput.readUTF();
		dateUponTheLocation = objectInput.readLong();
		proslicenceFeeCheck = objectInput.readUTF();
		dateSurrender = objectInput.readLong();
		areaOfApproximately = objectInput.readUTF();
		locationBeacon = objectInput.readUTF();
		intersectionCoordinates = objectInput.readUTF();
		northTopographical = objectInput.readUTF();
		eastTopographical = objectInput.readUTF();
		firstCornerOfNorth = objectInput.readUTF();
		firstCornerOfEast = objectInput.readUTF();
		firstCornerApproximateMeter = objectInput.readUTF();
		firstCornerApproximateDegree = objectInput.readUTF();
		secondCornerOfNorth = objectInput.readUTF();
		secondCornerOfEast = objectInput.readUTF();
		secondCornerApproximateMeter = objectInput.readUTF();
		secondCornerApproximateDegree = objectInput.readUTF();
		thirdCornerOfNorth = objectInput.readUTF();
		thirdCornerOfEast = objectInput.readUTF();
		thirdCornerApproximateMeter = objectInput.readUTF();
		thirdCornerApproximateDegree = objectInput.readUTF();
		fourthCornerOfNorth = objectInput.readUTF();
		fourthCornerOfEast = objectInput.readUTF();
		fourthCornerApproximateMeter = objectInput.readUTF();
		fourthCornerApproximateDegree = objectInput.readUTF();
		fifthCornerOfNorth = objectInput.readUTF();
		fifthCornerOfEast = objectInput.readUTF();
		fifthCornerApproximateMeter = objectInput.readUTF();
		fifthCornerApproximateDegree = objectInput.readUTF();

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningProspectingLicenseId);

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

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (trnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNumber);
		}

		if (nationalityOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationalityOfApplicant);
		}

		if (addressInJamaica == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressInJamaica);
		}

		if (telephoneNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNumber);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (numberOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfApplicant);
		}

		if (nameOfTheAgent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfTheAgent);
		}

		if (numberOfThisProspecting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfThisProspecting);
		}

		if (prospectingRight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prospectingRight);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		if (licence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licence);
		}

		if (stateTheNearestLandmark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stateTheNearestLandmark);
		}

		if (approximateArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approximateArea);
		}

		if (mineralForWhichApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mineralForWhichApplicant);
		}

		if (copyOfArticle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(copyOfArticle);
		}

		objectOutput.writeLong(dateUponTheLocation);

		if (proslicenceFeeCheck == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proslicenceFeeCheck);
		}

		objectOutput.writeLong(dateSurrender);

		if (areaOfApproximately == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areaOfApproximately);
		}

		if (locationBeacon == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationBeacon);
		}

		if (intersectionCoordinates == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(intersectionCoordinates);
		}

		if (northTopographical == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(northTopographical);
		}

		if (eastTopographical == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eastTopographical);
		}

		if (firstCornerOfNorth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstCornerOfNorth);
		}

		if (firstCornerOfEast == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstCornerOfEast);
		}

		if (firstCornerApproximateMeter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstCornerApproximateMeter);
		}

		if (firstCornerApproximateDegree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstCornerApproximateDegree);
		}

		if (secondCornerOfNorth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondCornerOfNorth);
		}

		if (secondCornerOfEast == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondCornerOfEast);
		}

		if (secondCornerApproximateMeter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondCornerApproximateMeter);
		}

		if (secondCornerApproximateDegree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondCornerApproximateDegree);
		}

		if (thirdCornerOfNorth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdCornerOfNorth);
		}

		if (thirdCornerOfEast == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdCornerOfEast);
		}

		if (thirdCornerApproximateMeter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdCornerApproximateMeter);
		}

		if (thirdCornerApproximateDegree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdCornerApproximateDegree);
		}

		if (fourthCornerOfNorth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthCornerOfNorth);
		}

		if (fourthCornerOfEast == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthCornerOfEast);
		}

		if (fourthCornerApproximateMeter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthCornerApproximateMeter);
		}

		if (fourthCornerApproximateDegree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fourthCornerApproximateDegree);
		}

		if (fifthCornerOfNorth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthCornerOfNorth);
		}

		if (fifthCornerOfEast == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthCornerOfEast);
		}

		if (fifthCornerApproximateMeter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthCornerApproximateMeter);
		}

		if (fifthCornerApproximateDegree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fifthCornerApproximateDegree);
		}

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public long miningProspectingLicenseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfApplicant;
	public String trnNumber;
	public String nationalityOfApplicant;
	public String addressInJamaica;
	public String telephoneNumber;
	public String emailAddress;
	public String numberOfApplicant;
	public String nameOfTheAgent;
	public String numberOfThisProspecting;
	public String prospectingRight;
	public String parish;
	public String licence;
	public String stateTheNearestLandmark;
	public String approximateArea;
	public String mineralForWhichApplicant;
	public String copyOfArticle;
	public long dateUponTheLocation;
	public String proslicenceFeeCheck;
	public long dateSurrender;
	public String areaOfApproximately;
	public String locationBeacon;
	public String intersectionCoordinates;
	public String northTopographical;
	public String eastTopographical;
	public String firstCornerOfNorth;
	public String firstCornerOfEast;
	public String firstCornerApproximateMeter;
	public String firstCornerApproximateDegree;
	public String secondCornerOfNorth;
	public String secondCornerOfEast;
	public String secondCornerApproximateMeter;
	public String secondCornerApproximateDegree;
	public String thirdCornerOfNorth;
	public String thirdCornerOfEast;
	public String thirdCornerApproximateMeter;
	public String thirdCornerApproximateDegree;
	public String fourthCornerOfNorth;
	public String fourthCornerOfEast;
	public String fourthCornerApproximateMeter;
	public String fourthCornerApproximateDegree;
	public String fifthCornerOfNorth;
	public String fifthCornerOfEast;
	public String fifthCornerApproximateMeter;
	public String fifthCornerApproximateDegree;
	public long miningLeaseApplicationId;

}