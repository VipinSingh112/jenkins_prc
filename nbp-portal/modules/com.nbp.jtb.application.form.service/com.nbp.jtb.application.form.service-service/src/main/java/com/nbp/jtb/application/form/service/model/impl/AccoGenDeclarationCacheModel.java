/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccoGenDeclaration in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccoGenDeclarationCacheModel
	implements CacheModel<AccoGenDeclaration>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccoGenDeclarationCacheModel)) {
			return false;
		}

		AccoGenDeclarationCacheModel accoGenDeclarationCacheModel =
			(AccoGenDeclarationCacheModel)object;

		if (accoGenDeclarationId ==
				accoGenDeclarationCacheModel.accoGenDeclarationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accoGenDeclarationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accoGenDeclarationId=");
		sb.append(accoGenDeclarationId);
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
		sb.append(", noOfBedroom=");
		sb.append(noOfBedroom);
		sb.append(", ownerOfHotel=");
		sb.append(ownerOfHotel);
		sb.append(", addressOne=");
		sb.append(addressOne);
		sb.append(", compIncorporatedOne=");
		sb.append(compIncorporatedOne);
		sb.append(", companyDate=");
		sb.append(companyDate);
		sb.append(", hotelOperator=");
		sb.append(hotelOperator);
		sb.append(", hotelOperatorDateSince=");
		sb.append(hotelOperatorDateSince);
		sb.append(", addressTwo=");
		sb.append(addressTwo);
		sb.append(", compIncorporatedTwo=");
		sb.append(compIncorporatedTwo);
		sb.append(", hotelOperatorName=");
		sb.append(hotelOperatorName);
		sb.append(", dateTwo=");
		sb.append(dateTwo);
		sb.append(", hotelIncepDate=");
		sb.append(hotelIncepDate);
		sb.append(", financeOfOper=");
		sb.append(financeOfOper);
		sb.append(", noOfEmployee=");
		sb.append(noOfEmployee);
		sb.append(", signatureDate=");
		sb.append(signatureDate);
		sb.append(", nameOfManager=");
		sb.append(nameOfManager);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccoGenDeclaration toEntityModel() {
		AccoGenDeclarationImpl accoGenDeclarationImpl =
			new AccoGenDeclarationImpl();

		if (uuid == null) {
			accoGenDeclarationImpl.setUuid("");
		}
		else {
			accoGenDeclarationImpl.setUuid(uuid);
		}

		accoGenDeclarationImpl.setAccoGenDeclarationId(accoGenDeclarationId);
		accoGenDeclarationImpl.setGroupId(groupId);
		accoGenDeclarationImpl.setCompanyId(companyId);
		accoGenDeclarationImpl.setUserId(userId);

		if (userName == null) {
			accoGenDeclarationImpl.setUserName("");
		}
		else {
			accoGenDeclarationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accoGenDeclarationImpl.setCreateDate(null);
		}
		else {
			accoGenDeclarationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accoGenDeclarationImpl.setModifiedDate(null);
		}
		else {
			accoGenDeclarationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (noOfBedroom == null) {
			accoGenDeclarationImpl.setNoOfBedroom("");
		}
		else {
			accoGenDeclarationImpl.setNoOfBedroom(noOfBedroom);
		}

		if (ownerOfHotel == null) {
			accoGenDeclarationImpl.setOwnerOfHotel("");
		}
		else {
			accoGenDeclarationImpl.setOwnerOfHotel(ownerOfHotel);
		}

		if (addressOne == null) {
			accoGenDeclarationImpl.setAddressOne("");
		}
		else {
			accoGenDeclarationImpl.setAddressOne(addressOne);
		}

		if (compIncorporatedOne == null) {
			accoGenDeclarationImpl.setCompIncorporatedOne("");
		}
		else {
			accoGenDeclarationImpl.setCompIncorporatedOne(compIncorporatedOne);
		}

		if (companyDate == Long.MIN_VALUE) {
			accoGenDeclarationImpl.setCompanyDate(null);
		}
		else {
			accoGenDeclarationImpl.setCompanyDate(new Date(companyDate));
		}

		if (hotelOperator == null) {
			accoGenDeclarationImpl.setHotelOperator("");
		}
		else {
			accoGenDeclarationImpl.setHotelOperator(hotelOperator);
		}

		if (hotelOperatorDateSince == Long.MIN_VALUE) {
			accoGenDeclarationImpl.setHotelOperatorDateSince(null);
		}
		else {
			accoGenDeclarationImpl.setHotelOperatorDateSince(
				new Date(hotelOperatorDateSince));
		}

		if (addressTwo == null) {
			accoGenDeclarationImpl.setAddressTwo("");
		}
		else {
			accoGenDeclarationImpl.setAddressTwo(addressTwo);
		}

		if (compIncorporatedTwo == null) {
			accoGenDeclarationImpl.setCompIncorporatedTwo("");
		}
		else {
			accoGenDeclarationImpl.setCompIncorporatedTwo(compIncorporatedTwo);
		}

		if (hotelOperatorName == null) {
			accoGenDeclarationImpl.setHotelOperatorName("");
		}
		else {
			accoGenDeclarationImpl.setHotelOperatorName(hotelOperatorName);
		}

		if (dateTwo == Long.MIN_VALUE) {
			accoGenDeclarationImpl.setDateTwo(null);
		}
		else {
			accoGenDeclarationImpl.setDateTwo(new Date(dateTwo));
		}

		if (hotelIncepDate == Long.MIN_VALUE) {
			accoGenDeclarationImpl.setHotelIncepDate(null);
		}
		else {
			accoGenDeclarationImpl.setHotelIncepDate(new Date(hotelIncepDate));
		}

		if (financeOfOper == null) {
			accoGenDeclarationImpl.setFinanceOfOper("");
		}
		else {
			accoGenDeclarationImpl.setFinanceOfOper(financeOfOper);
		}

		if (noOfEmployee == null) {
			accoGenDeclarationImpl.setNoOfEmployee("");
		}
		else {
			accoGenDeclarationImpl.setNoOfEmployee(noOfEmployee);
		}

		if (signatureDate == Long.MIN_VALUE) {
			accoGenDeclarationImpl.setSignatureDate(null);
		}
		else {
			accoGenDeclarationImpl.setSignatureDate(new Date(signatureDate));
		}

		if (nameOfManager == null) {
			accoGenDeclarationImpl.setNameOfManager("");
		}
		else {
			accoGenDeclarationImpl.setNameOfManager(nameOfManager);
		}

		accoGenDeclarationImpl.setJtbApplicationId(jtbApplicationId);

		accoGenDeclarationImpl.resetOriginalValues();

		return accoGenDeclarationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accoGenDeclarationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		noOfBedroom = objectInput.readUTF();
		ownerOfHotel = objectInput.readUTF();
		addressOne = objectInput.readUTF();
		compIncorporatedOne = objectInput.readUTF();
		companyDate = objectInput.readLong();
		hotelOperator = objectInput.readUTF();
		hotelOperatorDateSince = objectInput.readLong();
		addressTwo = objectInput.readUTF();
		compIncorporatedTwo = objectInput.readUTF();
		hotelOperatorName = objectInput.readUTF();
		dateTwo = objectInput.readLong();
		hotelIncepDate = objectInput.readLong();
		financeOfOper = objectInput.readUTF();
		noOfEmployee = objectInput.readUTF();
		signatureDate = objectInput.readLong();
		nameOfManager = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accoGenDeclarationId);

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

		if (noOfBedroom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noOfBedroom);
		}

		if (ownerOfHotel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerOfHotel);
		}

		if (addressOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressOne);
		}

		if (compIncorporatedOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(compIncorporatedOne);
		}

		objectOutput.writeLong(companyDate);

		if (hotelOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hotelOperator);
		}

		objectOutput.writeLong(hotelOperatorDateSince);

		if (addressTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressTwo);
		}

		if (compIncorporatedTwo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(compIncorporatedTwo);
		}

		if (hotelOperatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hotelOperatorName);
		}

		objectOutput.writeLong(dateTwo);
		objectOutput.writeLong(hotelIncepDate);

		if (financeOfOper == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(financeOfOper);
		}

		if (noOfEmployee == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noOfEmployee);
		}

		objectOutput.writeLong(signatureDate);

		if (nameOfManager == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfManager);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public String uuid;
	public long accoGenDeclarationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String noOfBedroom;
	public String ownerOfHotel;
	public String addressOne;
	public String compIncorporatedOne;
	public long companyDate;
	public String hotelOperator;
	public long hotelOperatorDateSince;
	public String addressTwo;
	public String compIncorporatedTwo;
	public String hotelOperatorName;
	public long dateTwo;
	public long hotelIncepDate;
	public String financeOfOper;
	public String noOfEmployee;
	public long signatureDate;
	public String nameOfManager;
	public long jtbApplicationId;

}