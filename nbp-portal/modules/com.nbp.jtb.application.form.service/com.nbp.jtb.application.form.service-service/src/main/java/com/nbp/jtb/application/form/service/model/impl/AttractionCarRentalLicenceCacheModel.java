/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionCarRentalLicence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionCarRentalLicenceCacheModel
	implements CacheModel<AttractionCarRentalLicence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionCarRentalLicenceCacheModel)) {
			return false;
		}

		AttractionCarRentalLicenceCacheModel
			attractionCarRentalLicenceCacheModel =
				(AttractionCarRentalLicenceCacheModel)object;

		if (attractionCarRentalLicId ==
				attractionCarRentalLicenceCacheModel.attractionCarRentalLicId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionCarRentalLicId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{attractionCarRentalLicId=");
		sb.append(attractionCarRentalLicId);
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
		sb.append(", ncrApplicantName=");
		sb.append(ncrApplicantName);
		sb.append(", ncrAddress=");
		sb.append(ncrAddress);
		sb.append(", ncrCompanyName=");
		sb.append(ncrCompanyName);
		sb.append(", ncrCompanyAddr=");
		sb.append(ncrCompanyAddr);
		sb.append(", ncrTelephone=");
		sb.append(ncrTelephone);
		sb.append(", ncrEmail=");
		sb.append(ncrEmail);
		sb.append(", ncrManagerName=");
		sb.append(ncrManagerName);
		sb.append(", ncrDate=");
		sb.append(ncrDate);
		sb.append(", ncrVehiclesNo=");
		sb.append(ncrVehiclesNo);
		sb.append(", ncrEmployeesNo=");
		sb.append(ncrEmployeesNo);
		sb.append(", ncrOfficeLoc=");
		sb.append(ncrOfficeLoc);
		sb.append(", ncrPosition=");
		sb.append(ncrPosition);
		sb.append(", ncrSignDate=");
		sb.append(ncrSignDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionCarRentalLicence toEntityModel() {
		AttractionCarRentalLicenceImpl attractionCarRentalLicenceImpl =
			new AttractionCarRentalLicenceImpl();

		attractionCarRentalLicenceImpl.setAttractionCarRentalLicId(
			attractionCarRentalLicId);
		attractionCarRentalLicenceImpl.setGroupId(groupId);
		attractionCarRentalLicenceImpl.setCompanyId(companyId);
		attractionCarRentalLicenceImpl.setUserId(userId);

		if (userName == null) {
			attractionCarRentalLicenceImpl.setUserName("");
		}
		else {
			attractionCarRentalLicenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionCarRentalLicenceImpl.setCreateDate(null);
		}
		else {
			attractionCarRentalLicenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionCarRentalLicenceImpl.setModifiedDate(null);
		}
		else {
			attractionCarRentalLicenceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (ncrApplicantName == null) {
			attractionCarRentalLicenceImpl.setNcrApplicantName("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrApplicantName(
				ncrApplicantName);
		}

		if (ncrAddress == null) {
			attractionCarRentalLicenceImpl.setNcrAddress("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrAddress(ncrAddress);
		}

		if (ncrCompanyName == null) {
			attractionCarRentalLicenceImpl.setNcrCompanyName("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrCompanyName(ncrCompanyName);
		}

		if (ncrCompanyAddr == null) {
			attractionCarRentalLicenceImpl.setNcrCompanyAddr("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrCompanyAddr(ncrCompanyAddr);
		}

		if (ncrTelephone == null) {
			attractionCarRentalLicenceImpl.setNcrTelephone("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrTelephone(ncrTelephone);
		}

		if (ncrEmail == null) {
			attractionCarRentalLicenceImpl.setNcrEmail("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrEmail(ncrEmail);
		}

		if (ncrManagerName == null) {
			attractionCarRentalLicenceImpl.setNcrManagerName("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrManagerName(ncrManagerName);
		}

		if (ncrDate == Long.MIN_VALUE) {
			attractionCarRentalLicenceImpl.setNcrDate(null);
		}
		else {
			attractionCarRentalLicenceImpl.setNcrDate(new Date(ncrDate));
		}

		if (ncrVehiclesNo == null) {
			attractionCarRentalLicenceImpl.setNcrVehiclesNo("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrVehiclesNo(ncrVehiclesNo);
		}

		if (ncrEmployeesNo == null) {
			attractionCarRentalLicenceImpl.setNcrEmployeesNo("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrEmployeesNo(ncrEmployeesNo);
		}

		if (ncrOfficeLoc == null) {
			attractionCarRentalLicenceImpl.setNcrOfficeLoc("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrOfficeLoc(ncrOfficeLoc);
		}

		if (ncrPosition == null) {
			attractionCarRentalLicenceImpl.setNcrPosition("");
		}
		else {
			attractionCarRentalLicenceImpl.setNcrPosition(ncrPosition);
		}

		if (ncrSignDate == Long.MIN_VALUE) {
			attractionCarRentalLicenceImpl.setNcrSignDate(null);
		}
		else {
			attractionCarRentalLicenceImpl.setNcrSignDate(
				new Date(ncrSignDate));
		}

		attractionCarRentalLicenceImpl.setJtbApplicationId(jtbApplicationId);

		attractionCarRentalLicenceImpl.resetOriginalValues();

		return attractionCarRentalLicenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionCarRentalLicId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ncrApplicantName = objectInput.readUTF();
		ncrAddress = objectInput.readUTF();
		ncrCompanyName = objectInput.readUTF();
		ncrCompanyAddr = objectInput.readUTF();
		ncrTelephone = objectInput.readUTF();
		ncrEmail = objectInput.readUTF();
		ncrManagerName = objectInput.readUTF();
		ncrDate = objectInput.readLong();
		ncrVehiclesNo = objectInput.readUTF();
		ncrEmployeesNo = objectInput.readUTF();
		ncrOfficeLoc = objectInput.readUTF();
		ncrPosition = objectInput.readUTF();
		ncrSignDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionCarRentalLicId);

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

		if (ncrApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrApplicantName);
		}

		if (ncrAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrAddress);
		}

		if (ncrCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrCompanyName);
		}

		if (ncrCompanyAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrCompanyAddr);
		}

		if (ncrTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrTelephone);
		}

		if (ncrEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrEmail);
		}

		if (ncrManagerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrManagerName);
		}

		objectOutput.writeLong(ncrDate);

		if (ncrVehiclesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrVehiclesNo);
		}

		if (ncrEmployeesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrEmployeesNo);
		}

		if (ncrOfficeLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrOfficeLoc);
		}

		if (ncrPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrPosition);
		}

		objectOutput.writeLong(ncrSignDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionCarRentalLicId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ncrApplicantName;
	public String ncrAddress;
	public String ncrCompanyName;
	public String ncrCompanyAddr;
	public String ncrTelephone;
	public String ncrEmail;
	public String ncrManagerName;
	public long ncrDate;
	public String ncrVehiclesNo;
	public String ncrEmployeesNo;
	public String ncrOfficeLoc;
	public String ncrPosition;
	public long ncrSignDate;
	public long jtbApplicationId;

}