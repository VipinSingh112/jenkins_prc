/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewGroundTransportation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewGroundTransportation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewGroundTransportationCacheModel
	implements CacheModel<TourismNewGroundTransportation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewGroundTransportationCacheModel)) {
			return false;
		}

		TourismNewGroundTransportationCacheModel
			tourismNewGroundTransportationCacheModel =
				(TourismNewGroundTransportationCacheModel)object;

		if (TourismNewGroundTransId ==
				tourismNewGroundTransportationCacheModel.
					TourismNewGroundTransId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, TourismNewGroundTransId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{TourismNewGroundTransId=");
		sb.append(TourismNewGroundTransId);
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
		sb.append(", typeOfGroundTransportation=");
		sb.append(typeOfGroundTransportation);
		sb.append(", newGroundName=");
		sb.append(newGroundName);
		sb.append(", newGroundHomeAddress=");
		sb.append(newGroundHomeAddress);
		sb.append(", newGroundBusinessAddress=");
		sb.append(newGroundBusinessAddress);
		sb.append(", newGroundLandlineNo=");
		sb.append(newGroundLandlineNo);
		sb.append(", newGroundMobileNo=");
		sb.append(newGroundMobileNo);
		sb.append(", newGroundFaxNo=");
		sb.append(newGroundFaxNo);
		sb.append(", newGroundLicensedWith=");
		sb.append(newGroundLicensedWith);
		sb.append(", newGroundBoardExpiryDate=");
		sb.append(newGroundBoardExpiryDate);
		sb.append(", newGroundHaveYouBenefitBefore=");
		sb.append(newGroundHaveYouBenefitBefore);
		sb.append(", newGroundHaveBenefitDate=");
		sb.append(newGroundHaveBenefitDate);
		sb.append(", newGroundEntityType=");
		sb.append(newGroundEntityType);
		sb.append(", newGroundVehicleInfoMake=");
		sb.append(newGroundVehicleInfoMake);
		sb.append(", newGroundVehicleInfoModel=");
		sb.append(newGroundVehicleInfoModel);
		sb.append(", newGroundVehicleInfoYear=");
		sb.append(newGroundVehicleInfoYear);
		sb.append(", newGroundSeatingCapacity=");
		sb.append(newGroundSeatingCapacity);
		sb.append(", newGroundExistingFleetAmount=");
		sb.append(newGroundExistingFleetAmount);
		sb.append(", newGroundIndicateVehicleWill=");
		sb.append(newGroundIndicateVehicleWill);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewGroundTransportation toEntityModel() {
		TourismNewGroundTransportationImpl tourismNewGroundTransportationImpl =
			new TourismNewGroundTransportationImpl();

		tourismNewGroundTransportationImpl.setTourismNewGroundTransId(
			TourismNewGroundTransId);
		tourismNewGroundTransportationImpl.setGroupId(groupId);
		tourismNewGroundTransportationImpl.setCompanyId(companyId);
		tourismNewGroundTransportationImpl.setUserId(userId);

		if (userName == null) {
			tourismNewGroundTransportationImpl.setUserName("");
		}
		else {
			tourismNewGroundTransportationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewGroundTransportationImpl.setCreateDate(null);
		}
		else {
			tourismNewGroundTransportationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewGroundTransportationImpl.setModifiedDate(null);
		}
		else {
			tourismNewGroundTransportationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (typeOfGroundTransportation == null) {
			tourismNewGroundTransportationImpl.setTypeOfGroundTransportation(
				"");
		}
		else {
			tourismNewGroundTransportationImpl.setTypeOfGroundTransportation(
				typeOfGroundTransportation);
		}

		if (newGroundName == null) {
			tourismNewGroundTransportationImpl.setNewGroundName("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundName(newGroundName);
		}

		if (newGroundHomeAddress == null) {
			tourismNewGroundTransportationImpl.setNewGroundHomeAddress("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundHomeAddress(
				newGroundHomeAddress);
		}

		if (newGroundBusinessAddress == null) {
			tourismNewGroundTransportationImpl.setNewGroundBusinessAddress("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundBusinessAddress(
				newGroundBusinessAddress);
		}

		if (newGroundLandlineNo == null) {
			tourismNewGroundTransportationImpl.setNewGroundLandlineNo("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundLandlineNo(
				newGroundLandlineNo);
		}

		if (newGroundMobileNo == null) {
			tourismNewGroundTransportationImpl.setNewGroundMobileNo("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundMobileNo(
				newGroundMobileNo);
		}

		if (newGroundFaxNo == null) {
			tourismNewGroundTransportationImpl.setNewGroundFaxNo("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundFaxNo(
				newGroundFaxNo);
		}

		if (newGroundLicensedWith == null) {
			tourismNewGroundTransportationImpl.setNewGroundLicensedWith("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundLicensedWith(
				newGroundLicensedWith);
		}

		if (newGroundBoardExpiryDate == Long.MIN_VALUE) {
			tourismNewGroundTransportationImpl.setNewGroundBoardExpiryDate(
				null);
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundBoardExpiryDate(
				new Date(newGroundBoardExpiryDate));
		}

		if (newGroundHaveYouBenefitBefore == null) {
			tourismNewGroundTransportationImpl.setNewGroundHaveYouBenefitBefore(
				"");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundHaveYouBenefitBefore(
				newGroundHaveYouBenefitBefore);
		}

		if (newGroundHaveBenefitDate == Long.MIN_VALUE) {
			tourismNewGroundTransportationImpl.setNewGroundHaveBenefitDate(
				null);
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundHaveBenefitDate(
				new Date(newGroundHaveBenefitDate));
		}

		if (newGroundEntityType == null) {
			tourismNewGroundTransportationImpl.setNewGroundEntityType("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundEntityType(
				newGroundEntityType);
		}

		if (newGroundVehicleInfoMake == null) {
			tourismNewGroundTransportationImpl.setNewGroundVehicleInfoMake("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundVehicleInfoMake(
				newGroundVehicleInfoMake);
		}

		if (newGroundVehicleInfoModel == null) {
			tourismNewGroundTransportationImpl.setNewGroundVehicleInfoModel("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundVehicleInfoModel(
				newGroundVehicleInfoModel);
		}

		if (newGroundVehicleInfoYear == null) {
			tourismNewGroundTransportationImpl.setNewGroundVehicleInfoYear("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundVehicleInfoYear(
				newGroundVehicleInfoYear);
		}

		if (newGroundSeatingCapacity == null) {
			tourismNewGroundTransportationImpl.setNewGroundSeatingCapacity("");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundSeatingCapacity(
				newGroundSeatingCapacity);
		}

		if (newGroundExistingFleetAmount == null) {
			tourismNewGroundTransportationImpl.setNewGroundExistingFleetAmount(
				"");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundExistingFleetAmount(
				newGroundExistingFleetAmount);
		}

		if (newGroundIndicateVehicleWill == null) {
			tourismNewGroundTransportationImpl.setNewGroundIndicateVehicleWill(
				"");
		}
		else {
			tourismNewGroundTransportationImpl.setNewGroundIndicateVehicleWill(
				newGroundIndicateVehicleWill);
		}

		tourismNewGroundTransportationImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewGroundTransportationImpl.resetOriginalValues();

		return tourismNewGroundTransportationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		TourismNewGroundTransId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		typeOfGroundTransportation = objectInput.readUTF();
		newGroundName = objectInput.readUTF();
		newGroundHomeAddress = objectInput.readUTF();
		newGroundBusinessAddress = objectInput.readUTF();
		newGroundLandlineNo = objectInput.readUTF();
		newGroundMobileNo = objectInput.readUTF();
		newGroundFaxNo = objectInput.readUTF();
		newGroundLicensedWith = objectInput.readUTF();
		newGroundBoardExpiryDate = objectInput.readLong();
		newGroundHaveYouBenefitBefore = objectInput.readUTF();
		newGroundHaveBenefitDate = objectInput.readLong();
		newGroundEntityType = objectInput.readUTF();
		newGroundVehicleInfoMake = objectInput.readUTF();
		newGroundVehicleInfoModel = objectInput.readUTF();
		newGroundVehicleInfoYear = objectInput.readUTF();
		newGroundSeatingCapacity = objectInput.readUTF();
		newGroundExistingFleetAmount = objectInput.readUTF();
		newGroundIndicateVehicleWill = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(TourismNewGroundTransId);

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

		if (typeOfGroundTransportation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfGroundTransportation);
		}

		if (newGroundName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundName);
		}

		if (newGroundHomeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundHomeAddress);
		}

		if (newGroundBusinessAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundBusinessAddress);
		}

		if (newGroundLandlineNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundLandlineNo);
		}

		if (newGroundMobileNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundMobileNo);
		}

		if (newGroundFaxNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundFaxNo);
		}

		if (newGroundLicensedWith == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundLicensedWith);
		}

		objectOutput.writeLong(newGroundBoardExpiryDate);

		if (newGroundHaveYouBenefitBefore == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundHaveYouBenefitBefore);
		}

		objectOutput.writeLong(newGroundHaveBenefitDate);

		if (newGroundEntityType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundEntityType);
		}

		if (newGroundVehicleInfoMake == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundVehicleInfoMake);
		}

		if (newGroundVehicleInfoModel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundVehicleInfoModel);
		}

		if (newGroundVehicleInfoYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundVehicleInfoYear);
		}

		if (newGroundSeatingCapacity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundSeatingCapacity);
		}

		if (newGroundExistingFleetAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundExistingFleetAmount);
		}

		if (newGroundIndicateVehicleWill == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newGroundIndicateVehicleWill);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long TourismNewGroundTransId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String typeOfGroundTransportation;
	public String newGroundName;
	public String newGroundHomeAddress;
	public String newGroundBusinessAddress;
	public String newGroundLandlineNo;
	public String newGroundMobileNo;
	public String newGroundFaxNo;
	public String newGroundLicensedWith;
	public long newGroundBoardExpiryDate;
	public String newGroundHaveYouBenefitBefore;
	public long newGroundHaveBenefitDate;
	public String newGroundEntityType;
	public String newGroundVehicleInfoMake;
	public String newGroundVehicleInfoModel;
	public String newGroundVehicleInfoYear;
	public String newGroundSeatingCapacity;
	public String newGroundExistingFleetAmount;
	public String newGroundIndicateVehicleWill;
	public long tourismApplicationId;

}