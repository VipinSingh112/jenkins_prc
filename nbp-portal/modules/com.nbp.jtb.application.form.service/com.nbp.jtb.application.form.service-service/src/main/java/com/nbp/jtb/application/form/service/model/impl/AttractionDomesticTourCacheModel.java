/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionDomesticTour;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionDomesticTour in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionDomesticTourCacheModel
	implements CacheModel<AttractionDomesticTour>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionDomesticTourCacheModel)) {
			return false;
		}

		AttractionDomesticTourCacheModel attractionDomesticTourCacheModel =
			(AttractionDomesticTourCacheModel)object;

		if (attractionDomesticTourId ==
				attractionDomesticTourCacheModel.attractionDomesticTourId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionDomesticTourId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{attractionDomesticTourId=");
		sb.append(attractionDomesticTourId);
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
		sb.append(", domesticTourApplicantName=");
		sb.append(domesticTourApplicantName);
		sb.append(", domesticTourAddress=");
		sb.append(domesticTourAddress);
		sb.append(", domesticTourCompanyName=");
		sb.append(domesticTourCompanyName);
		sb.append(", domesticTourExactLocation=");
		sb.append(domesticTourExactLocation);
		sb.append(", domesticTourTelephone=");
		sb.append(domesticTourTelephone);
		sb.append(", domesticTourEmail=");
		sb.append(domesticTourEmail);
		sb.append(", domesticTourDate=");
		sb.append(domesticTourDate);
		sb.append(", domesticTourManagerName=");
		sb.append(domesticTourManagerName);
		sb.append(", domesticTourVehiclesNum=");
		sb.append(domesticTourVehiclesNum);
		sb.append(", domesticTourEmployeesNo=");
		sb.append(domesticTourEmployeesNo);
		sb.append(", domesticTourOfficeLocation=");
		sb.append(domesticTourOfficeLocation);
		sb.append(", domesticTourSignDate=");
		sb.append(domesticTourSignDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionDomesticTour toEntityModel() {
		AttractionDomesticTourImpl attractionDomesticTourImpl =
			new AttractionDomesticTourImpl();

		attractionDomesticTourImpl.setAttractionDomesticTourId(
			attractionDomesticTourId);
		attractionDomesticTourImpl.setGroupId(groupId);
		attractionDomesticTourImpl.setCompanyId(companyId);
		attractionDomesticTourImpl.setUserId(userId);

		if (userName == null) {
			attractionDomesticTourImpl.setUserName("");
		}
		else {
			attractionDomesticTourImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionDomesticTourImpl.setCreateDate(null);
		}
		else {
			attractionDomesticTourImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionDomesticTourImpl.setModifiedDate(null);
		}
		else {
			attractionDomesticTourImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (domesticTourApplicantName == null) {
			attractionDomesticTourImpl.setDomesticTourApplicantName("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourApplicantName(
				domesticTourApplicantName);
		}

		if (domesticTourAddress == null) {
			attractionDomesticTourImpl.setDomesticTourAddress("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourAddress(
				domesticTourAddress);
		}

		if (domesticTourCompanyName == null) {
			attractionDomesticTourImpl.setDomesticTourCompanyName("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourCompanyName(
				domesticTourCompanyName);
		}

		if (domesticTourExactLocation == null) {
			attractionDomesticTourImpl.setDomesticTourExactLocation("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourExactLocation(
				domesticTourExactLocation);
		}

		if (domesticTourTelephone == null) {
			attractionDomesticTourImpl.setDomesticTourTelephone("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourTelephone(
				domesticTourTelephone);
		}

		if (domesticTourEmail == null) {
			attractionDomesticTourImpl.setDomesticTourEmail("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourEmail(domesticTourEmail);
		}

		if (domesticTourDate == Long.MIN_VALUE) {
			attractionDomesticTourImpl.setDomesticTourDate(null);
		}
		else {
			attractionDomesticTourImpl.setDomesticTourDate(
				new Date(domesticTourDate));
		}

		if (domesticTourManagerName == null) {
			attractionDomesticTourImpl.setDomesticTourManagerName("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourManagerName(
				domesticTourManagerName);
		}

		if (domesticTourVehiclesNum == null) {
			attractionDomesticTourImpl.setDomesticTourVehiclesNum("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourVehiclesNum(
				domesticTourVehiclesNum);
		}

		if (domesticTourEmployeesNo == null) {
			attractionDomesticTourImpl.setDomesticTourEmployeesNo("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourEmployeesNo(
				domesticTourEmployeesNo);
		}

		if (domesticTourOfficeLocation == null) {
			attractionDomesticTourImpl.setDomesticTourOfficeLocation("");
		}
		else {
			attractionDomesticTourImpl.setDomesticTourOfficeLocation(
				domesticTourOfficeLocation);
		}

		if (domesticTourSignDate == Long.MIN_VALUE) {
			attractionDomesticTourImpl.setDomesticTourSignDate(null);
		}
		else {
			attractionDomesticTourImpl.setDomesticTourSignDate(
				new Date(domesticTourSignDate));
		}

		attractionDomesticTourImpl.setJtbApplicationId(jtbApplicationId);

		attractionDomesticTourImpl.resetOriginalValues();

		return attractionDomesticTourImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionDomesticTourId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		domesticTourApplicantName = objectInput.readUTF();
		domesticTourAddress = objectInput.readUTF();
		domesticTourCompanyName = objectInput.readUTF();
		domesticTourExactLocation = objectInput.readUTF();
		domesticTourTelephone = objectInput.readUTF();
		domesticTourEmail = objectInput.readUTF();
		domesticTourDate = objectInput.readLong();
		domesticTourManagerName = objectInput.readUTF();
		domesticTourVehiclesNum = objectInput.readUTF();
		domesticTourEmployeesNo = objectInput.readUTF();
		domesticTourOfficeLocation = objectInput.readUTF();
		domesticTourSignDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionDomesticTourId);

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

		if (domesticTourApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourApplicantName);
		}

		if (domesticTourAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourAddress);
		}

		if (domesticTourCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourCompanyName);
		}

		if (domesticTourExactLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourExactLocation);
		}

		if (domesticTourTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourTelephone);
		}

		if (domesticTourEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourEmail);
		}

		objectOutput.writeLong(domesticTourDate);

		if (domesticTourManagerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourManagerName);
		}

		if (domesticTourVehiclesNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourVehiclesNum);
		}

		if (domesticTourEmployeesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourEmployeesNo);
		}

		if (domesticTourOfficeLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(domesticTourOfficeLocation);
		}

		objectOutput.writeLong(domesticTourSignDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionDomesticTourId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String domesticTourApplicantName;
	public String domesticTourAddress;
	public String domesticTourCompanyName;
	public String domesticTourExactLocation;
	public String domesticTourTelephone;
	public String domesticTourEmail;
	public long domesticTourDate;
	public String domesticTourManagerName;
	public String domesticTourVehiclesNum;
	public String domesticTourEmployeesNo;
	public String domesticTourOfficeLocation;
	public long domesticTourSignDate;
	public long jtbApplicationId;

}