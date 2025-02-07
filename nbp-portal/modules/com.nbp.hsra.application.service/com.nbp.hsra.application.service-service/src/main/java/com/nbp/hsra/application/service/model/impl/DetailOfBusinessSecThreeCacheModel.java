/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DetailOfBusinessSecThree in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DetailOfBusinessSecThreeCacheModel
	implements CacheModel<DetailOfBusinessSecThree>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DetailOfBusinessSecThreeCacheModel)) {
			return false;
		}

		DetailOfBusinessSecThreeCacheModel detailOfBusinessSecThreeCacheModel =
			(DetailOfBusinessSecThreeCacheModel)object;

		if (detailOfBusinessSecThreeId ==
				detailOfBusinessSecThreeCacheModel.detailOfBusinessSecThreeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, detailOfBusinessSecThreeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{detailOfBusinessSecThreeId=");
		sb.append(detailOfBusinessSecThreeId);
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
		sb.append(", businessType=");
		sb.append(businessType);
		sb.append(", nuclearBusinessNumber=");
		sb.append(nuclearBusinessNumber);
		sb.append(", nuclearCorporationNum=");
		sb.append(nuclearCorporationNum);
		sb.append(", nuclearPublicAct=");
		sb.append(nuclearPublicAct);
		sb.append(", nuclearName=");
		sb.append(nuclearName);
		sb.append(", nuclearAddressThird=");
		sb.append(nuclearAddressThird);
		sb.append(", nuclearThirdParish=");
		sb.append(nuclearThirdParish);
		sb.append(", nuclearTelephoneNum=");
		sb.append(nuclearTelephoneNum);
		sb.append(", nuclearfaxNumber=");
		sb.append(nuclearfaxNumber);
		sb.append(", nuclearEmailAdd=");
		sb.append(nuclearEmailAdd);
		sb.append(", nuclearFinancial=");
		sb.append(nuclearFinancial);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DetailOfBusinessSecThree toEntityModel() {
		DetailOfBusinessSecThreeImpl detailOfBusinessSecThreeImpl =
			new DetailOfBusinessSecThreeImpl();

		detailOfBusinessSecThreeImpl.setDetailOfBusinessSecThreeId(
			detailOfBusinessSecThreeId);
		detailOfBusinessSecThreeImpl.setGroupId(groupId);
		detailOfBusinessSecThreeImpl.setCompanyId(companyId);
		detailOfBusinessSecThreeImpl.setUserId(userId);

		if (userName == null) {
			detailOfBusinessSecThreeImpl.setUserName("");
		}
		else {
			detailOfBusinessSecThreeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			detailOfBusinessSecThreeImpl.setCreateDate(null);
		}
		else {
			detailOfBusinessSecThreeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			detailOfBusinessSecThreeImpl.setModifiedDate(null);
		}
		else {
			detailOfBusinessSecThreeImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (businessType == null) {
			detailOfBusinessSecThreeImpl.setBusinessType("");
		}
		else {
			detailOfBusinessSecThreeImpl.setBusinessType(businessType);
		}

		if (nuclearBusinessNumber == null) {
			detailOfBusinessSecThreeImpl.setNuclearBusinessNumber("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearBusinessNumber(
				nuclearBusinessNumber);
		}

		if (nuclearCorporationNum == null) {
			detailOfBusinessSecThreeImpl.setNuclearCorporationNum("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearCorporationNum(
				nuclearCorporationNum);
		}

		if (nuclearPublicAct == null) {
			detailOfBusinessSecThreeImpl.setNuclearPublicAct("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearPublicAct(nuclearPublicAct);
		}

		if (nuclearName == null) {
			detailOfBusinessSecThreeImpl.setNuclearName("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearName(nuclearName);
		}

		if (nuclearAddressThird == null) {
			detailOfBusinessSecThreeImpl.setNuclearAddressThird("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearAddressThird(
				nuclearAddressThird);
		}

		if (nuclearThirdParish == null) {
			detailOfBusinessSecThreeImpl.setNuclearThirdParish("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearThirdParish(
				nuclearThirdParish);
		}

		if (nuclearTelephoneNum == null) {
			detailOfBusinessSecThreeImpl.setNuclearTelephoneNum("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearTelephoneNum(
				nuclearTelephoneNum);
		}

		if (nuclearfaxNumber == null) {
			detailOfBusinessSecThreeImpl.setNuclearfaxNumber("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearfaxNumber(nuclearfaxNumber);
		}

		if (nuclearEmailAdd == null) {
			detailOfBusinessSecThreeImpl.setNuclearEmailAdd("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearEmailAdd(nuclearEmailAdd);
		}

		if (nuclearFinancial == null) {
			detailOfBusinessSecThreeImpl.setNuclearFinancial("");
		}
		else {
			detailOfBusinessSecThreeImpl.setNuclearFinancial(nuclearFinancial);
		}

		detailOfBusinessSecThreeImpl.setHsraApplicationId(hsraApplicationId);

		detailOfBusinessSecThreeImpl.resetOriginalValues();

		return detailOfBusinessSecThreeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		detailOfBusinessSecThreeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		businessType = objectInput.readUTF();
		nuclearBusinessNumber = objectInput.readUTF();
		nuclearCorporationNum = objectInput.readUTF();
		nuclearPublicAct = objectInput.readUTF();
		nuclearName = objectInput.readUTF();
		nuclearAddressThird = objectInput.readUTF();
		nuclearThirdParish = objectInput.readUTF();
		nuclearTelephoneNum = objectInput.readUTF();
		nuclearfaxNumber = objectInput.readUTF();
		nuclearEmailAdd = objectInput.readUTF();
		nuclearFinancial = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(detailOfBusinessSecThreeId);

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

		if (businessType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessType);
		}

		if (nuclearBusinessNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearBusinessNumber);
		}

		if (nuclearCorporationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearCorporationNum);
		}

		if (nuclearPublicAct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearPublicAct);
		}

		if (nuclearName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearName);
		}

		if (nuclearAddressThird == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearAddressThird);
		}

		if (nuclearThirdParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearThirdParish);
		}

		if (nuclearTelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearTelephoneNum);
		}

		if (nuclearfaxNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearfaxNumber);
		}

		if (nuclearEmailAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearEmailAdd);
		}

		if (nuclearFinancial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearFinancial);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long detailOfBusinessSecThreeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String businessType;
	public String nuclearBusinessNumber;
	public String nuclearCorporationNum;
	public String nuclearPublicAct;
	public String nuclearName;
	public String nuclearAddressThird;
	public String nuclearThirdParish;
	public String nuclearTelephoneNum;
	public String nuclearfaxNumber;
	public String nuclearEmailAdd;
	public String nuclearFinancial;
	public long hsraApplicationId;

}