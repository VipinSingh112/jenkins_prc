/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAccoGenralInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAccoGenralInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAccoGenralInfoCacheModel
	implements CacheModel<TourismBonaAccoGenralInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAccoGenralInfoCacheModel)) {
			return false;
		}

		TourismBonaAccoGenralInfoCacheModel
			tourismBonaAccoGenralInfoCacheModel =
				(TourismBonaAccoGenralInfoCacheModel)object;

		if (tourismBonaAccoGenralInfoId ==
				tourismBonaAccoGenralInfoCacheModel.
					tourismBonaAccoGenralInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAccoGenralInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{tourismBonaAccoGenralInfoId=");
		sb.append(tourismBonaAccoGenralInfoId);
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
		sb.append(", establishmentName=");
		sb.append(establishmentName);
		sb.append(", establishmentNewName=");
		sb.append(establishmentNewName);
		sb.append(", generalFacilityRoom=");
		sb.append(generalFacilityRoom);
		sb.append(", existingFacilityRoom=");
		sb.append(existingFacilityRoom);
		sb.append(", offeredFacilityDetail=");
		sb.append(offeredFacilityDetail);
		sb.append(", plannedFacilityDetail=");
		sb.append(plannedFacilityDetail);
		sb.append(", accomodationToBeOffered=");
		sb.append(accomodationToBeOffered);
		sb.append(", constructionDate=");
		sb.append(constructionDate);
		sb.append(", expectedCommenceDate=");
		sb.append(expectedCommenceDate);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAccoGenralInfo toEntityModel() {
		TourismBonaAccoGenralInfoImpl tourismBonaAccoGenralInfoImpl =
			new TourismBonaAccoGenralInfoImpl();

		tourismBonaAccoGenralInfoImpl.setTourismBonaAccoGenralInfoId(
			tourismBonaAccoGenralInfoId);
		tourismBonaAccoGenralInfoImpl.setGroupId(groupId);
		tourismBonaAccoGenralInfoImpl.setCompanyId(companyId);
		tourismBonaAccoGenralInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAccoGenralInfoImpl.setUserName("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAccoGenralInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaAccoGenralInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAccoGenralInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAccoGenralInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (establishmentName == null) {
			tourismBonaAccoGenralInfoImpl.setEstablishmentName("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setEstablishmentName(
				establishmentName);
		}

		if (establishmentNewName == null) {
			tourismBonaAccoGenralInfoImpl.setEstablishmentNewName("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setEstablishmentNewName(
				establishmentNewName);
		}

		if (generalFacilityRoom == null) {
			tourismBonaAccoGenralInfoImpl.setGeneralFacilityRoom("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setGeneralFacilityRoom(
				generalFacilityRoom);
		}

		if (existingFacilityRoom == null) {
			tourismBonaAccoGenralInfoImpl.setExistingFacilityRoom("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setExistingFacilityRoom(
				existingFacilityRoom);
		}

		if (offeredFacilityDetail == null) {
			tourismBonaAccoGenralInfoImpl.setOfferedFacilityDetail("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setOfferedFacilityDetail(
				offeredFacilityDetail);
		}

		if (plannedFacilityDetail == null) {
			tourismBonaAccoGenralInfoImpl.setPlannedFacilityDetail("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setPlannedFacilityDetail(
				plannedFacilityDetail);
		}

		if (accomodationToBeOffered == null) {
			tourismBonaAccoGenralInfoImpl.setAccomodationToBeOffered("");
		}
		else {
			tourismBonaAccoGenralInfoImpl.setAccomodationToBeOffered(
				accomodationToBeOffered);
		}

		if (constructionDate == Long.MIN_VALUE) {
			tourismBonaAccoGenralInfoImpl.setConstructionDate(null);
		}
		else {
			tourismBonaAccoGenralInfoImpl.setConstructionDate(
				new Date(constructionDate));
		}

		if (expectedCommenceDate == Long.MIN_VALUE) {
			tourismBonaAccoGenralInfoImpl.setExpectedCommenceDate(null);
		}
		else {
			tourismBonaAccoGenralInfoImpl.setExpectedCommenceDate(
				new Date(expectedCommenceDate));
		}

		tourismBonaAccoGenralInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAccoGenralInfoImpl.resetOriginalValues();

		return tourismBonaAccoGenralInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAccoGenralInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		establishmentName = objectInput.readUTF();
		establishmentNewName = objectInput.readUTF();
		generalFacilityRoom = objectInput.readUTF();
		existingFacilityRoom = objectInput.readUTF();
		offeredFacilityDetail = objectInput.readUTF();
		plannedFacilityDetail = objectInput.readUTF();
		accomodationToBeOffered = objectInput.readUTF();
		constructionDate = objectInput.readLong();
		expectedCommenceDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAccoGenralInfoId);

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

		if (establishmentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishmentName);
		}

		if (establishmentNewName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishmentNewName);
		}

		if (generalFacilityRoom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(generalFacilityRoom);
		}

		if (existingFacilityRoom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(existingFacilityRoom);
		}

		if (offeredFacilityDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(offeredFacilityDetail);
		}

		if (plannedFacilityDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(plannedFacilityDetail);
		}

		if (accomodationToBeOffered == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accomodationToBeOffered);
		}

		objectOutput.writeLong(constructionDate);
		objectOutput.writeLong(expectedCommenceDate);

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaAccoGenralInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String establishmentName;
	public String establishmentNewName;
	public String generalFacilityRoom;
	public String existingFacilityRoom;
	public String offeredFacilityDetail;
	public String plannedFacilityDetail;
	public String accomodationToBeOffered;
	public long constructionDate;
	public long expectedCommenceDate;
	public long tourismApplicationId;

}