/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionWaterSport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionWaterSport in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionWaterSportCacheModel
	implements CacheModel<AttractionWaterSport>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionWaterSportCacheModel)) {
			return false;
		}

		AttractionWaterSportCacheModel attractionWaterSportCacheModel =
			(AttractionWaterSportCacheModel)object;

		if (attractionWaterSportId ==
				attractionWaterSportCacheModel.attractionWaterSportId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionWaterSportId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{attractionWaterSportId=");
		sb.append(attractionWaterSportId);
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
		sb.append(", waterSportBusinessName=");
		sb.append(waterSportBusinessName);
		sb.append(", waterSportMailingaAdd=");
		sb.append(waterSportMailingaAdd);
		sb.append(", waterSportOpLocationAddr=");
		sb.append(waterSportOpLocationAddr);
		sb.append(", waterSportOpPhone=");
		sb.append(waterSportOpPhone);
		sb.append(", waterSportOpEmail=");
		sb.append(waterSportOpEmail);
		sb.append(", waterSportOpOwnerName=");
		sb.append(waterSportOpOwnerName);
		sb.append(", waterSportOpAddressOwner=");
		sb.append(waterSportOpAddressOwner);
		sb.append(", waterSportOpManagerName=");
		sb.append(waterSportOpManagerName);
		sb.append(", waterSportOpApplicantName=");
		sb.append(waterSportOpApplicantName);
		sb.append(", waterSportOpNationality=");
		sb.append(waterSportOpNationality);
		sb.append(", waterSportOpEmployeesNo=");
		sb.append(waterSportOpEmployeesNo);
		sb.append(", waterSportOpActivityList=");
		sb.append(waterSportOpActivityList);
		sb.append(", occupyLocation=");
		sb.append(occupyLocation);
		sb.append(", proposalSubmitted=");
		sb.append(proposalSubmitted);
		sb.append(", foreignNationalsInvolved=");
		sb.append(foreignNationalsInvolved);
		sb.append(", workPermitApplied=");
		sb.append(workPermitApplied);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionWaterSport toEntityModel() {
		AttractionWaterSportImpl attractionWaterSportImpl =
			new AttractionWaterSportImpl();

		attractionWaterSportImpl.setAttractionWaterSportId(
			attractionWaterSportId);
		attractionWaterSportImpl.setGroupId(groupId);
		attractionWaterSportImpl.setCompanyId(companyId);
		attractionWaterSportImpl.setUserId(userId);

		if (userName == null) {
			attractionWaterSportImpl.setUserName("");
		}
		else {
			attractionWaterSportImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionWaterSportImpl.setCreateDate(null);
		}
		else {
			attractionWaterSportImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionWaterSportImpl.setModifiedDate(null);
		}
		else {
			attractionWaterSportImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (waterSportBusinessName == null) {
			attractionWaterSportImpl.setWaterSportBusinessName("");
		}
		else {
			attractionWaterSportImpl.setWaterSportBusinessName(
				waterSportBusinessName);
		}

		if (waterSportMailingaAdd == null) {
			attractionWaterSportImpl.setWaterSportMailingaAdd("");
		}
		else {
			attractionWaterSportImpl.setWaterSportMailingaAdd(
				waterSportMailingaAdd);
		}

		if (waterSportOpLocationAddr == null) {
			attractionWaterSportImpl.setWaterSportOpLocationAddr("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpLocationAddr(
				waterSportOpLocationAddr);
		}

		if (waterSportOpPhone == null) {
			attractionWaterSportImpl.setWaterSportOpPhone("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpPhone(waterSportOpPhone);
		}

		if (waterSportOpEmail == null) {
			attractionWaterSportImpl.setWaterSportOpEmail("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpEmail(waterSportOpEmail);
		}

		if (waterSportOpOwnerName == null) {
			attractionWaterSportImpl.setWaterSportOpOwnerName("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpOwnerName(
				waterSportOpOwnerName);
		}

		if (waterSportOpAddressOwner == null) {
			attractionWaterSportImpl.setWaterSportOpAddressOwner("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpAddressOwner(
				waterSportOpAddressOwner);
		}

		if (waterSportOpManagerName == null) {
			attractionWaterSportImpl.setWaterSportOpManagerName("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpManagerName(
				waterSportOpManagerName);
		}

		if (waterSportOpApplicantName == null) {
			attractionWaterSportImpl.setWaterSportOpApplicantName("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpApplicantName(
				waterSportOpApplicantName);
		}

		if (waterSportOpNationality == null) {
			attractionWaterSportImpl.setWaterSportOpNationality("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpNationality(
				waterSportOpNationality);
		}

		if (waterSportOpEmployeesNo == null) {
			attractionWaterSportImpl.setWaterSportOpEmployeesNo("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpEmployeesNo(
				waterSportOpEmployeesNo);
		}

		if (waterSportOpActivityList == null) {
			attractionWaterSportImpl.setWaterSportOpActivityList("");
		}
		else {
			attractionWaterSportImpl.setWaterSportOpActivityList(
				waterSportOpActivityList);
		}

		if (occupyLocation == null) {
			attractionWaterSportImpl.setOccupyLocation("");
		}
		else {
			attractionWaterSportImpl.setOccupyLocation(occupyLocation);
		}

		if (proposalSubmitted == null) {
			attractionWaterSportImpl.setProposalSubmitted("");
		}
		else {
			attractionWaterSportImpl.setProposalSubmitted(proposalSubmitted);
		}

		if (foreignNationalsInvolved == null) {
			attractionWaterSportImpl.setForeignNationalsInvolved("");
		}
		else {
			attractionWaterSportImpl.setForeignNationalsInvolved(
				foreignNationalsInvolved);
		}

		if (workPermitApplied == null) {
			attractionWaterSportImpl.setWorkPermitApplied("");
		}
		else {
			attractionWaterSportImpl.setWorkPermitApplied(workPermitApplied);
		}

		attractionWaterSportImpl.setJtbApplicationId(jtbApplicationId);

		attractionWaterSportImpl.resetOriginalValues();

		return attractionWaterSportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionWaterSportId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		waterSportBusinessName = objectInput.readUTF();
		waterSportMailingaAdd = objectInput.readUTF();
		waterSportOpLocationAddr = objectInput.readUTF();
		waterSportOpPhone = objectInput.readUTF();
		waterSportOpEmail = objectInput.readUTF();
		waterSportOpOwnerName = objectInput.readUTF();
		waterSportOpAddressOwner = objectInput.readUTF();
		waterSportOpManagerName = objectInput.readUTF();
		waterSportOpApplicantName = objectInput.readUTF();
		waterSportOpNationality = objectInput.readUTF();
		waterSportOpEmployeesNo = objectInput.readUTF();
		waterSportOpActivityList = objectInput.readUTF();
		occupyLocation = objectInput.readUTF();
		proposalSubmitted = objectInput.readUTF();
		foreignNationalsInvolved = objectInput.readUTF();
		workPermitApplied = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionWaterSportId);

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

		if (waterSportBusinessName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportBusinessName);
		}

		if (waterSportMailingaAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportMailingaAdd);
		}

		if (waterSportOpLocationAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpLocationAddr);
		}

		if (waterSportOpPhone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpPhone);
		}

		if (waterSportOpEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpEmail);
		}

		if (waterSportOpOwnerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpOwnerName);
		}

		if (waterSportOpAddressOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpAddressOwner);
		}

		if (waterSportOpManagerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpManagerName);
		}

		if (waterSportOpApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpApplicantName);
		}

		if (waterSportOpNationality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpNationality);
		}

		if (waterSportOpEmployeesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpEmployeesNo);
		}

		if (waterSportOpActivityList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(waterSportOpActivityList);
		}

		if (occupyLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occupyLocation);
		}

		if (proposalSubmitted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proposalSubmitted);
		}

		if (foreignNationalsInvolved == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foreignNationalsInvolved);
		}

		if (workPermitApplied == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workPermitApplied);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionWaterSportId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String waterSportBusinessName;
	public String waterSportMailingaAdd;
	public String waterSportOpLocationAddr;
	public String waterSportOpPhone;
	public String waterSportOpEmail;
	public String waterSportOpOwnerName;
	public String waterSportOpAddressOwner;
	public String waterSportOpManagerName;
	public String waterSportOpApplicantName;
	public String waterSportOpNationality;
	public String waterSportOpEmployeesNo;
	public String waterSportOpActivityList;
	public String occupyLocation;
	public String proposalSubmitted;
	public String foreignNationalsInvolved;
	public String workPermitApplied;
	public long jtbApplicationId;

}