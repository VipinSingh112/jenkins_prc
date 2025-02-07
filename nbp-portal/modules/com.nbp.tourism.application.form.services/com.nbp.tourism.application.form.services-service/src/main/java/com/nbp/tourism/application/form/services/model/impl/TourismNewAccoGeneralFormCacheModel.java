/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAccoGeneralForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAccoGeneralFormCacheModel
	implements CacheModel<TourismNewAccoGeneralForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAccoGeneralFormCacheModel)) {
			return false;
		}

		TourismNewAccoGeneralFormCacheModel
			tourismNewAccoGeneralFormCacheModel =
				(TourismNewAccoGeneralFormCacheModel)object;

		if (tourismNewAccoGenFormId ==
				tourismNewAccoGeneralFormCacheModel.tourismNewAccoGenFormId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAccoGenFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{tourismNewAccoGenFormId=");
		sb.append(tourismNewAccoGenFormId);
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
		sb.append(", accomadationRoom=");
		sb.append(accomadationRoom);
		sb.append(", facilityDetail=");
		sb.append(facilityDetail);
		sb.append(", hotelOperator=");
		sb.append(hotelOperator);
		sb.append(", offeredAccomadation=");
		sb.append(offeredAccomadation);
		sb.append(", constructionDate=");
		sb.append(constructionDate);
		sb.append(", commenceDate=");
		sb.append(commenceDate);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAccoGeneralForm toEntityModel() {
		TourismNewAccoGeneralFormImpl tourismNewAccoGeneralFormImpl =
			new TourismNewAccoGeneralFormImpl();

		tourismNewAccoGeneralFormImpl.setTourismNewAccoGenFormId(
			tourismNewAccoGenFormId);
		tourismNewAccoGeneralFormImpl.setGroupId(groupId);
		tourismNewAccoGeneralFormImpl.setCompanyId(companyId);
		tourismNewAccoGeneralFormImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAccoGeneralFormImpl.setUserName("");
		}
		else {
			tourismNewAccoGeneralFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAccoGeneralFormImpl.setCreateDate(null);
		}
		else {
			tourismNewAccoGeneralFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAccoGeneralFormImpl.setModifiedDate(null);
		}
		else {
			tourismNewAccoGeneralFormImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (establishmentName == null) {
			tourismNewAccoGeneralFormImpl.setEstablishmentName("");
		}
		else {
			tourismNewAccoGeneralFormImpl.setEstablishmentName(
				establishmentName);
		}

		if (accomadationRoom == null) {
			tourismNewAccoGeneralFormImpl.setAccomadationRoom("");
		}
		else {
			tourismNewAccoGeneralFormImpl.setAccomadationRoom(accomadationRoom);
		}

		if (facilityDetail == null) {
			tourismNewAccoGeneralFormImpl.setFacilityDetail("");
		}
		else {
			tourismNewAccoGeneralFormImpl.setFacilityDetail(facilityDetail);
		}

		if (hotelOperator == null) {
			tourismNewAccoGeneralFormImpl.setHotelOperator("");
		}
		else {
			tourismNewAccoGeneralFormImpl.setHotelOperator(hotelOperator);
		}

		if (offeredAccomadation == null) {
			tourismNewAccoGeneralFormImpl.setOfferedAccomadation("");
		}
		else {
			tourismNewAccoGeneralFormImpl.setOfferedAccomadation(
				offeredAccomadation);
		}

		if (constructionDate == Long.MIN_VALUE) {
			tourismNewAccoGeneralFormImpl.setConstructionDate(null);
		}
		else {
			tourismNewAccoGeneralFormImpl.setConstructionDate(
				new Date(constructionDate));
		}

		if (commenceDate == Long.MIN_VALUE) {
			tourismNewAccoGeneralFormImpl.setCommenceDate(null);
		}
		else {
			tourismNewAccoGeneralFormImpl.setCommenceDate(
				new Date(commenceDate));
		}

		tourismNewAccoGeneralFormImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAccoGeneralFormImpl.resetOriginalValues();

		return tourismNewAccoGeneralFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAccoGenFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		establishmentName = objectInput.readUTF();
		accomadationRoom = objectInput.readUTF();
		facilityDetail = objectInput.readUTF();
		hotelOperator = objectInput.readUTF();
		offeredAccomadation = objectInput.readUTF();
		constructionDate = objectInput.readLong();
		commenceDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAccoGenFormId);

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

		if (accomadationRoom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accomadationRoom);
		}

		if (facilityDetail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilityDetail);
		}

		if (hotelOperator == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hotelOperator);
		}

		if (offeredAccomadation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(offeredAccomadation);
		}

		objectOutput.writeLong(constructionDate);
		objectOutput.writeLong(commenceDate);

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewAccoGenFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String establishmentName;
	public String accomadationRoom;
	public String facilityDetail;
	public String hotelOperator;
	public String offeredAccomadation;
	public long constructionDate;
	public long commenceDate;
	public long tourismApplicationId;

}