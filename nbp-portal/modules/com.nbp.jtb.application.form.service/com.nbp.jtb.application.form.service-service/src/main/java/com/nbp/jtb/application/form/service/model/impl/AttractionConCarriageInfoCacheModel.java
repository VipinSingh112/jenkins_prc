/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionConCarriageInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionConCarriageInfoCacheModel
	implements CacheModel<AttractionConCarriageInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionConCarriageInfoCacheModel)) {
			return false;
		}

		AttractionConCarriageInfoCacheModel
			attractionConCarriageInfoCacheModel =
				(AttractionConCarriageInfoCacheModel)object;

		if (attractionConCarriageInfoId ==
				attractionConCarriageInfoCacheModel.
					attractionConCarriageInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionConCarriageInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{attractionConCarriageInfoId=");
		sb.append(attractionConCarriageInfoId);
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
		sb.append(", ownerName=");
		sb.append(ownerName);
		sb.append(", homeAddress=");
		sb.append(homeAddress);
		sb.append(", email=");
		sb.append(email);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", parish=");
		sb.append(parish);
		sb.append(", newContractDate=");
		sb.append(newContractDate);
		sb.append(", newContarctVehiclesNo=");
		sb.append(newContarctVehiclesNo);
		sb.append(", newContractTrn=");
		sb.append(newContractTrn);
		sb.append(", contractOrganization=");
		sb.append(contractOrganization);
		sb.append(", ownerSignDate=");
		sb.append(ownerSignDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionConCarriageInfo toEntityModel() {
		AttractionConCarriageInfoImpl attractionConCarriageInfoImpl =
			new AttractionConCarriageInfoImpl();

		attractionConCarriageInfoImpl.setAttractionConCarriageInfoId(
			attractionConCarriageInfoId);
		attractionConCarriageInfoImpl.setGroupId(groupId);
		attractionConCarriageInfoImpl.setCompanyId(companyId);
		attractionConCarriageInfoImpl.setUserId(userId);

		if (userName == null) {
			attractionConCarriageInfoImpl.setUserName("");
		}
		else {
			attractionConCarriageInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionConCarriageInfoImpl.setCreateDate(null);
		}
		else {
			attractionConCarriageInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionConCarriageInfoImpl.setModifiedDate(null);
		}
		else {
			attractionConCarriageInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (ownerName == null) {
			attractionConCarriageInfoImpl.setOwnerName("");
		}
		else {
			attractionConCarriageInfoImpl.setOwnerName(ownerName);
		}

		if (homeAddress == null) {
			attractionConCarriageInfoImpl.setHomeAddress("");
		}
		else {
			attractionConCarriageInfoImpl.setHomeAddress(homeAddress);
		}

		if (email == null) {
			attractionConCarriageInfoImpl.setEmail("");
		}
		else {
			attractionConCarriageInfoImpl.setEmail(email);
		}

		if (telephone == null) {
			attractionConCarriageInfoImpl.setTelephone("");
		}
		else {
			attractionConCarriageInfoImpl.setTelephone(telephone);
		}

		if (parish == null) {
			attractionConCarriageInfoImpl.setParish("");
		}
		else {
			attractionConCarriageInfoImpl.setParish(parish);
		}

		if (newContractDate == Long.MIN_VALUE) {
			attractionConCarriageInfoImpl.setNewContractDate(null);
		}
		else {
			attractionConCarriageInfoImpl.setNewContractDate(
				new Date(newContractDate));
		}

		if (newContarctVehiclesNo == null) {
			attractionConCarriageInfoImpl.setNewContarctVehiclesNo("");
		}
		else {
			attractionConCarriageInfoImpl.setNewContarctVehiclesNo(
				newContarctVehiclesNo);
		}

		if (newContractTrn == null) {
			attractionConCarriageInfoImpl.setNewContractTrn("");
		}
		else {
			attractionConCarriageInfoImpl.setNewContractTrn(newContractTrn);
		}

		if (contractOrganization == null) {
			attractionConCarriageInfoImpl.setContractOrganization("");
		}
		else {
			attractionConCarriageInfoImpl.setContractOrganization(
				contractOrganization);
		}

		if (ownerSignDate == Long.MIN_VALUE) {
			attractionConCarriageInfoImpl.setOwnerSignDate(null);
		}
		else {
			attractionConCarriageInfoImpl.setOwnerSignDate(
				new Date(ownerSignDate));
		}

		attractionConCarriageInfoImpl.setJtbApplicationId(jtbApplicationId);

		attractionConCarriageInfoImpl.resetOriginalValues();

		return attractionConCarriageInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionConCarriageInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ownerName = objectInput.readUTF();
		homeAddress = objectInput.readUTF();
		email = objectInput.readUTF();
		telephone = objectInput.readUTF();
		parish = objectInput.readUTF();
		newContractDate = objectInput.readLong();
		newContarctVehiclesNo = objectInput.readUTF();
		newContractTrn = objectInput.readUTF();
		contractOrganization = objectInput.readUTF();
		ownerSignDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionConCarriageInfoId);

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

		if (ownerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownerName);
		}

		if (homeAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(homeAddress);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (parish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(parish);
		}

		objectOutput.writeLong(newContractDate);

		if (newContarctVehiclesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newContarctVehiclesNo);
		}

		if (newContractTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newContractTrn);
		}

		if (contractOrganization == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractOrganization);
		}

		objectOutput.writeLong(ownerSignDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionConCarriageInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ownerName;
	public String homeAddress;
	public String email;
	public String telephone;
	public String parish;
	public long newContractDate;
	public String newContarctVehiclesNo;
	public String newContractTrn;
	public String contractOrganization;
	public long ownerSignDate;
	public long jtbApplicationId;

}