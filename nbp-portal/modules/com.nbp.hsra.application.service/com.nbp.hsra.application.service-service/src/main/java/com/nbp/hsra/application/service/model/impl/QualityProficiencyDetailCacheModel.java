/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.QualityProficiencyDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QualityProficiencyDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QualityProficiencyDetailCacheModel
	implements CacheModel<QualityProficiencyDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QualityProficiencyDetailCacheModel)) {
			return false;
		}

		QualityProficiencyDetailCacheModel qualityProficiencyDetailCacheModel =
			(QualityProficiencyDetailCacheModel)object;

		if (qualityProficiDetailId ==
				qualityProficiencyDetailCacheModel.qualityProficiDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, qualityProficiDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(67);

		sb.append("{qualityProficiDetailId=");
		sb.append(qualityProficiDetailId);
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
		sb.append(", proficiencyDetails=");
		sb.append(proficiencyDetails);
		sb.append(", workDurationOne=");
		sb.append(workDurationOne);
		sb.append(", capacityOne=");
		sb.append(capacityOne);
		sb.append(", workDurationTwo=");
		sb.append(workDurationTwo);
		sb.append(", capacityTwo=");
		sb.append(capacityTwo);
		sb.append(", workDurationThree=");
		sb.append(workDurationThree);
		sb.append(", capacityThree=");
		sb.append(capacityThree);
		sb.append(", workDurationFour=");
		sb.append(workDurationFour);
		sb.append(", capacityFour=");
		sb.append(capacityFour);
		sb.append(", workDurationFive=");
		sb.append(workDurationFive);
		sb.append(", capacityFive=");
		sb.append(capacityFive);
		sb.append(", workDurationSix=");
		sb.append(workDurationSix);
		sb.append(", capacitySix=");
		sb.append(capacitySix);
		sb.append(", workDurationSeven=");
		sb.append(workDurationSeven);
		sb.append(", capacitySeven=");
		sb.append(capacitySeven);
		sb.append(", workDurationEight=");
		sb.append(workDurationEight);
		sb.append(", capacityEight=");
		sb.append(capacityEight);
		sb.append(", workDurationNine=");
		sb.append(workDurationNine);
		sb.append(", capacityNine=");
		sb.append(capacityNine);
		sb.append(", workDurationTen=");
		sb.append(workDurationTen);
		sb.append(", capacityTen=");
		sb.append(capacityTen);
		sb.append(", workDurationEleven=");
		sb.append(workDurationEleven);
		sb.append(", capacityEleven=");
		sb.append(capacityEleven);
		sb.append(", workDurationTwelve=");
		sb.append(workDurationTwelve);
		sb.append(", capacityTwelve=");
		sb.append(capacityTwelve);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QualityProficiencyDetail toEntityModel() {
		QualityProficiencyDetailImpl qualityProficiencyDetailImpl =
			new QualityProficiencyDetailImpl();

		qualityProficiencyDetailImpl.setQualityProficiDetailId(
			qualityProficiDetailId);
		qualityProficiencyDetailImpl.setGroupId(groupId);
		qualityProficiencyDetailImpl.setCompanyId(companyId);
		qualityProficiencyDetailImpl.setUserId(userId);

		if (userName == null) {
			qualityProficiencyDetailImpl.setUserName("");
		}
		else {
			qualityProficiencyDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			qualityProficiencyDetailImpl.setCreateDate(null);
		}
		else {
			qualityProficiencyDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			qualityProficiencyDetailImpl.setModifiedDate(null);
		}
		else {
			qualityProficiencyDetailImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (proficiencyDetails == null) {
			qualityProficiencyDetailImpl.setProficiencyDetails("");
		}
		else {
			qualityProficiencyDetailImpl.setProficiencyDetails(
				proficiencyDetails);
		}

		if (workDurationOne == null) {
			qualityProficiencyDetailImpl.setWorkDurationOne("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationOne(workDurationOne);
		}

		if (capacityOne == null) {
			qualityProficiencyDetailImpl.setCapacityOne("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityOne(capacityOne);
		}

		if (workDurationTwo == null) {
			qualityProficiencyDetailImpl.setWorkDurationTwo("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationTwo(workDurationTwo);
		}

		if (capacityTwo == null) {
			qualityProficiencyDetailImpl.setCapacityTwo("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityTwo(capacityTwo);
		}

		if (workDurationThree == null) {
			qualityProficiencyDetailImpl.setWorkDurationThree("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationThree(
				workDurationThree);
		}

		if (capacityThree == null) {
			qualityProficiencyDetailImpl.setCapacityThree("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityThree(capacityThree);
		}

		if (workDurationFour == null) {
			qualityProficiencyDetailImpl.setWorkDurationFour("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationFour(workDurationFour);
		}

		if (capacityFour == null) {
			qualityProficiencyDetailImpl.setCapacityFour("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityFour(capacityFour);
		}

		if (workDurationFive == null) {
			qualityProficiencyDetailImpl.setWorkDurationFive("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationFive(workDurationFive);
		}

		if (capacityFive == null) {
			qualityProficiencyDetailImpl.setCapacityFive("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityFive(capacityFive);
		}

		if (workDurationSix == null) {
			qualityProficiencyDetailImpl.setWorkDurationSix("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationSix(workDurationSix);
		}

		if (capacitySix == null) {
			qualityProficiencyDetailImpl.setCapacitySix("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacitySix(capacitySix);
		}

		if (workDurationSeven == null) {
			qualityProficiencyDetailImpl.setWorkDurationSeven("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationSeven(
				workDurationSeven);
		}

		if (capacitySeven == null) {
			qualityProficiencyDetailImpl.setCapacitySeven("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacitySeven(capacitySeven);
		}

		if (workDurationEight == null) {
			qualityProficiencyDetailImpl.setWorkDurationEight("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationEight(
				workDurationEight);
		}

		if (capacityEight == null) {
			qualityProficiencyDetailImpl.setCapacityEight("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityEight(capacityEight);
		}

		if (workDurationNine == null) {
			qualityProficiencyDetailImpl.setWorkDurationNine("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationNine(workDurationNine);
		}

		if (capacityNine == null) {
			qualityProficiencyDetailImpl.setCapacityNine("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityNine(capacityNine);
		}

		if (workDurationTen == null) {
			qualityProficiencyDetailImpl.setWorkDurationTen("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationTen(workDurationTen);
		}

		if (capacityTen == null) {
			qualityProficiencyDetailImpl.setCapacityTen("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityTen(capacityTen);
		}

		if (workDurationEleven == null) {
			qualityProficiencyDetailImpl.setWorkDurationEleven("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationEleven(
				workDurationEleven);
		}

		if (capacityEleven == null) {
			qualityProficiencyDetailImpl.setCapacityEleven("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityEleven(capacityEleven);
		}

		if (workDurationTwelve == null) {
			qualityProficiencyDetailImpl.setWorkDurationTwelve("");
		}
		else {
			qualityProficiencyDetailImpl.setWorkDurationTwelve(
				workDurationTwelve);
		}

		if (capacityTwelve == null) {
			qualityProficiencyDetailImpl.setCapacityTwelve("");
		}
		else {
			qualityProficiencyDetailImpl.setCapacityTwelve(capacityTwelve);
		}

		qualityProficiencyDetailImpl.setHsraApplicationId(hsraApplicationId);

		qualityProficiencyDetailImpl.resetOriginalValues();

		return qualityProficiencyDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		qualityProficiDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		proficiencyDetails = objectInput.readUTF();
		workDurationOne = objectInput.readUTF();
		capacityOne = objectInput.readUTF();
		workDurationTwo = objectInput.readUTF();
		capacityTwo = objectInput.readUTF();
		workDurationThree = objectInput.readUTF();
		capacityThree = objectInput.readUTF();
		workDurationFour = objectInput.readUTF();
		capacityFour = objectInput.readUTF();
		workDurationFive = objectInput.readUTF();
		capacityFive = objectInput.readUTF();
		workDurationSix = objectInput.readUTF();
		capacitySix = objectInput.readUTF();
		workDurationSeven = objectInput.readUTF();
		capacitySeven = objectInput.readUTF();
		workDurationEight = objectInput.readUTF();
		capacityEight = objectInput.readUTF();
		workDurationNine = objectInput.readUTF();
		capacityNine = objectInput.readUTF();
		workDurationTen = objectInput.readUTF();
		capacityTen = objectInput.readUTF();
		workDurationEleven = objectInput.readUTF();
		capacityEleven = objectInput.readUTF();
		workDurationTwelve = objectInput.readUTF();
		capacityTwelve = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(qualityProficiDetailId);

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

		if (proficiencyDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proficiencyDetails);
		}

		if (workDurationOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationOne);
		}

		if (capacityOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityOne);
		}

		if (workDurationTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationTwo);
		}

		if (capacityTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityTwo);
		}

		if (workDurationThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationThree);
		}

		if (capacityThree == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityThree);
		}

		if (workDurationFour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationFour);
		}

		if (capacityFour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityFour);
		}

		if (workDurationFive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationFive);
		}

		if (capacityFive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityFive);
		}

		if (workDurationSix == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationSix);
		}

		if (capacitySix == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacitySix);
		}

		if (workDurationSeven == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationSeven);
		}

		if (capacitySeven == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacitySeven);
		}

		if (workDurationEight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationEight);
		}

		if (capacityEight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityEight);
		}

		if (workDurationNine == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationNine);
		}

		if (capacityNine == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityNine);
		}

		if (workDurationTen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationTen);
		}

		if (capacityTen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityTen);
		}

		if (workDurationEleven == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationEleven);
		}

		if (capacityEleven == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityEleven);
		}

		if (workDurationTwelve == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workDurationTwelve);
		}

		if (capacityTwelve == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacityTwelve);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long qualityProficiDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String proficiencyDetails;
	public String workDurationOne;
	public String capacityOne;
	public String workDurationTwo;
	public String capacityTwo;
	public String workDurationThree;
	public String capacityThree;
	public String workDurationFour;
	public String capacityFour;
	public String workDurationFive;
	public String capacityFive;
	public String workDurationSix;
	public String capacitySix;
	public String workDurationSeven;
	public String capacitySeven;
	public String workDurationEight;
	public String capacityEight;
	public String workDurationNine;
	public String capacityNine;
	public String workDurationTen;
	public String capacityTen;
	public String workDurationEleven;
	public String capacityEleven;
	public String workDurationTwelve;
	public String capacityTwelve;
	public long hsraApplicationId;

}