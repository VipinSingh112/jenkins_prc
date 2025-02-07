/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionCarRentLicence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionCarRentLicence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionCarRentLicenceCacheModel
	implements CacheModel<AttractionCarRentLicence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionCarRentLicenceCacheModel)) {
			return false;
		}

		AttractionCarRentLicenceCacheModel attractionCarRentLicenceCacheModel =
			(AttractionCarRentLicenceCacheModel)object;

		if (attractionCarRentLicenceId ==
				attractionCarRentLicenceCacheModel.attractionCarRentLicenceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionCarRentLicenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{attractionCarRentLicenceId=");
		sb.append(attractionCarRentLicenceId);
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
		sb.append(", newCarRentApplicantName=");
		sb.append(newCarRentApplicantName);
		sb.append(", newCarRentAddress=");
		sb.append(newCarRentAddress);
		sb.append(", newCarRentCompanyName=");
		sb.append(newCarRentCompanyName);
		sb.append(", newCarRentCompanyAddr=");
		sb.append(newCarRentCompanyAddr);
		sb.append(", newCarRentTelephone=");
		sb.append(newCarRentTelephone);
		sb.append(", newCarRentEmail=");
		sb.append(newCarRentEmail);
		sb.append(", newCarRentManagerName=");
		sb.append(newCarRentManagerName);
		sb.append(", newCarRentDate=");
		sb.append(newCarRentDate1);
		sb.append(", newCarRentVehiclesNo=");
		sb.append(newCarRentVehiclesNo);
		sb.append(", newCarRentEmployeesNo=");
		sb.append(newCarRentEmployeesNo);
		sb.append(", newCarRentOfficeLoc=");
		sb.append(newCarRentOfficeLoc1);
		sb.append(", newCarRentPosition=");
		sb.append(newCarRentPosition);
		sb.append(", newCarRentOfficeLoc=");
		sb.append(newCarRentOfficeLoc1);
		sb.append(", newCarRentDate=");
		sb.append(newCarRentDate1);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionCarRentLicence toEntityModel() {
		AttractionCarRentLicenceImpl attractionCarRentLicenceImpl =
			new AttractionCarRentLicenceImpl();

		attractionCarRentLicenceImpl.setAttractionCarRentLicenceId(
			attractionCarRentLicenceId);
		attractionCarRentLicenceImpl.setGroupId(groupId);
		attractionCarRentLicenceImpl.setCompanyId(companyId);
		attractionCarRentLicenceImpl.setUserId(userId);

		if (userName == null) {
			attractionCarRentLicenceImpl.setUserName("");
		}
		else {
			attractionCarRentLicenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionCarRentLicenceImpl.setCreateDate(null);
		}
		else {
			attractionCarRentLicenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionCarRentLicenceImpl.setModifiedDate(null);
		}
		else {
			attractionCarRentLicenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (newCarRentApplicantName == null) {
			attractionCarRentLicenceImpl.setNewCarRentApplicantName("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentApplicantName(
				newCarRentApplicantName);
		}

		if (newCarRentAddress == null) {
			attractionCarRentLicenceImpl.setNewCarRentAddress("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentAddress(
				newCarRentAddress);
		}

		if (newCarRentCompanyName == null) {
			attractionCarRentLicenceImpl.setNewCarRentCompanyName("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentCompanyName(
				newCarRentCompanyName);
		}

		if (newCarRentCompanyAddr == null) {
			attractionCarRentLicenceImpl.setNewCarRentCompanyAddr("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentCompanyAddr(
				newCarRentCompanyAddr);
		}

		if (newCarRentTelephone == null) {
			attractionCarRentLicenceImpl.setNewCarRentTelephone("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentTelephone(
				newCarRentTelephone);
		}

		if (newCarRentEmail == null) {
			attractionCarRentLicenceImpl.setNewCarRentEmail("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentEmail(newCarRentEmail);
		}

		if (newCarRentManagerName == null) {
			attractionCarRentLicenceImpl.setNewCarRentManagerName("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentManagerName(
				newCarRentManagerName);
		}

		if (newCarRentDate1 == Long.MIN_VALUE) {
			attractionCarRentLicenceImpl.setNewCarRentDate(null);
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentDate(
				new Date(newCarRentDate1));
		}

		if (newCarRentVehiclesNo == null) {
			attractionCarRentLicenceImpl.setNewCarRentVehiclesNo("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentVehiclesNo(
				newCarRentVehiclesNo);
		}

		if (newCarRentEmployeesNo == null) {
			attractionCarRentLicenceImpl.setNewCarRentEmployeesNo("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentEmployeesNo(
				newCarRentEmployeesNo);
		}

		if (newCarRentOfficeLoc1 == null) {
			attractionCarRentLicenceImpl.setNewCarRentOfficeLoc("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentOfficeLoc(
				newCarRentOfficeLoc1);
		}

		if (newCarRentPosition == null) {
			attractionCarRentLicenceImpl.setNewCarRentPosition("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentPosition(
				newCarRentPosition);
		}

		if (newCarRentOfficeLoc1 == null) {
			attractionCarRentLicenceImpl.setNewCarRentOfficeLoc("");
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentOfficeLoc(
				newCarRentOfficeLoc1);
		}

		if (newCarRentDate1 == Long.MIN_VALUE) {
			attractionCarRentLicenceImpl.setNewCarRentDate(null);
		}
		else {
			attractionCarRentLicenceImpl.setNewCarRentDate(
				new Date(newCarRentDate1));
		}

		attractionCarRentLicenceImpl.setJtbApplicationId(jtbApplicationId);

		attractionCarRentLicenceImpl.resetOriginalValues();

		return attractionCarRentLicenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionCarRentLicenceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		newCarRentApplicantName = objectInput.readUTF();
		newCarRentAddress = objectInput.readUTF();
		newCarRentCompanyName = objectInput.readUTF();
		newCarRentCompanyAddr = objectInput.readUTF();
		newCarRentTelephone = objectInput.readUTF();
		newCarRentEmail = objectInput.readUTF();
		newCarRentManagerName = objectInput.readUTF();
		newCarRentDate1 = objectInput.readLong();
		newCarRentVehiclesNo = objectInput.readUTF();
		newCarRentEmployeesNo = objectInput.readUTF();
		newCarRentOfficeLoc1 = objectInput.readUTF();
		newCarRentPosition = objectInput.readUTF();
		newCarRentOfficeLoc1 = objectInput.readUTF();
		newCarRentDate1 = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionCarRentLicenceId);

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

		if (newCarRentApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentApplicantName);
		}

		if (newCarRentAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentAddress);
		}

		if (newCarRentCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentCompanyName);
		}

		if (newCarRentCompanyAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentCompanyAddr);
		}

		if (newCarRentTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentTelephone);
		}

		if (newCarRentEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentEmail);
		}

		if (newCarRentManagerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentManagerName);
		}

		objectOutput.writeLong(newCarRentDate1);

		if (newCarRentVehiclesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentVehiclesNo);
		}

		if (newCarRentEmployeesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentEmployeesNo);
		}

		if (newCarRentOfficeLoc1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentOfficeLoc1);
		}

		if (newCarRentPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentPosition);
		}

		if (newCarRentOfficeLoc1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newCarRentOfficeLoc1);
		}

		objectOutput.writeLong(newCarRentDate1);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionCarRentLicenceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String newCarRentApplicantName;
	public String newCarRentAddress;
	public String newCarRentCompanyName;
	public String newCarRentCompanyAddr;
	public String newCarRentTelephone;
	public String newCarRentEmail;
	public String newCarRentManagerName;
	public long newCarRentDate1;
	public String newCarRentVehiclesNo;
	public String newCarRentEmployeesNo;
	public String newCarRentOfficeLoc1;
	public String newCarRentPosition;
	public String newCarRentOfficeLoc;
	public long newCarRentDate;
	public long jtbApplicationId;

}