/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionTravelHaltApp in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionTravelHaltAppCacheModel
	implements CacheModel<AttractionTravelHaltApp>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionTravelHaltAppCacheModel)) {
			return false;
		}

		AttractionTravelHaltAppCacheModel attractionTravelHaltAppCacheModel =
			(AttractionTravelHaltAppCacheModel)object;

		if (attractionTravelHaltAppId ==
				attractionTravelHaltAppCacheModel.attractionTravelHaltAppId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionTravelHaltAppId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{attractionTravelHaltAppId=");
		sb.append(attractionTravelHaltAppId);
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
		sb.append(", travelHaltApplicantName=");
		sb.append(travelHaltApplicantName);
		sb.append(", travelHaltAddress=");
		sb.append(travelHaltAddress);
		sb.append(", travelHaltTelephone=");
		sb.append(travelHaltTelephone);
		sb.append(", travelHaltEmail=");
		sb.append(travelHaltEmail);
		sb.append(", travelHaltName=");
		sb.append(travelHaltName);
		sb.append(", travelHaltLocation=");
		sb.append(travelHaltLocation);
		sb.append(", travelHaltTelephoneNum=");
		sb.append(travelHaltTelephoneNum);
		sb.append(", travelHaltEmployeesNo=");
		sb.append(travelHaltEmployeesNo);
		sb.append(", travelHaltSignDate=");
		sb.append(travelHaltSignDate);
		sb.append(", gasStation=");
		sb.append(gasStation);
		sb.append(", refreshment=");
		sb.append(refreshment);
		sb.append(", drinks=");
		sb.append(drinks);
		sb.append(", restaurant=");
		sb.append(restaurant);
		sb.append(", wirelessinternet=");
		sb.append(wirelessinternet);
		sb.append(", restrooms=");
		sb.append(restrooms);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionTravelHaltApp toEntityModel() {
		AttractionTravelHaltAppImpl attractionTravelHaltAppImpl =
			new AttractionTravelHaltAppImpl();

		attractionTravelHaltAppImpl.setAttractionTravelHaltAppId(
			attractionTravelHaltAppId);
		attractionTravelHaltAppImpl.setGroupId(groupId);
		attractionTravelHaltAppImpl.setCompanyId(companyId);
		attractionTravelHaltAppImpl.setUserId(userId);

		if (userName == null) {
			attractionTravelHaltAppImpl.setUserName("");
		}
		else {
			attractionTravelHaltAppImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionTravelHaltAppImpl.setCreateDate(null);
		}
		else {
			attractionTravelHaltAppImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionTravelHaltAppImpl.setModifiedDate(null);
		}
		else {
			attractionTravelHaltAppImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (travelHaltApplicantName == null) {
			attractionTravelHaltAppImpl.setTravelHaltApplicantName("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltApplicantName(
				travelHaltApplicantName);
		}

		if (travelHaltAddress == null) {
			attractionTravelHaltAppImpl.setTravelHaltAddress("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltAddress(travelHaltAddress);
		}

		if (travelHaltTelephone == null) {
			attractionTravelHaltAppImpl.setTravelHaltTelephone("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltTelephone(
				travelHaltTelephone);
		}

		if (travelHaltEmail == null) {
			attractionTravelHaltAppImpl.setTravelHaltEmail("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltEmail(travelHaltEmail);
		}

		if (travelHaltName == null) {
			attractionTravelHaltAppImpl.setTravelHaltName("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltName(travelHaltName);
		}

		if (travelHaltLocation == null) {
			attractionTravelHaltAppImpl.setTravelHaltLocation("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltLocation(
				travelHaltLocation);
		}

		if (travelHaltTelephoneNum == null) {
			attractionTravelHaltAppImpl.setTravelHaltTelephoneNum("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltTelephoneNum(
				travelHaltTelephoneNum);
		}

		if (travelHaltEmployeesNo == null) {
			attractionTravelHaltAppImpl.setTravelHaltEmployeesNo("");
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltEmployeesNo(
				travelHaltEmployeesNo);
		}

		if (travelHaltSignDate == Long.MIN_VALUE) {
			attractionTravelHaltAppImpl.setTravelHaltSignDate(null);
		}
		else {
			attractionTravelHaltAppImpl.setTravelHaltSignDate(
				new Date(travelHaltSignDate));
		}

		if (gasStation == null) {
			attractionTravelHaltAppImpl.setGasStation("");
		}
		else {
			attractionTravelHaltAppImpl.setGasStation(gasStation);
		}

		if (refreshment == null) {
			attractionTravelHaltAppImpl.setRefreshment("");
		}
		else {
			attractionTravelHaltAppImpl.setRefreshment(refreshment);
		}

		if (drinks == null) {
			attractionTravelHaltAppImpl.setDrinks("");
		}
		else {
			attractionTravelHaltAppImpl.setDrinks(drinks);
		}

		if (restaurant == null) {
			attractionTravelHaltAppImpl.setRestaurant("");
		}
		else {
			attractionTravelHaltAppImpl.setRestaurant(restaurant);
		}

		if (wirelessinternet == null) {
			attractionTravelHaltAppImpl.setWirelessinternet("");
		}
		else {
			attractionTravelHaltAppImpl.setWirelessinternet(wirelessinternet);
		}

		if (restrooms == null) {
			attractionTravelHaltAppImpl.setRestrooms("");
		}
		else {
			attractionTravelHaltAppImpl.setRestrooms(restrooms);
		}

		attractionTravelHaltAppImpl.setJtbApplicationId(jtbApplicationId);

		attractionTravelHaltAppImpl.resetOriginalValues();

		return attractionTravelHaltAppImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionTravelHaltAppId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		travelHaltApplicantName = objectInput.readUTF();
		travelHaltAddress = objectInput.readUTF();
		travelHaltTelephone = objectInput.readUTF();
		travelHaltEmail = objectInput.readUTF();
		travelHaltName = objectInput.readUTF();
		travelHaltLocation = objectInput.readUTF();
		travelHaltTelephoneNum = objectInput.readUTF();
		travelHaltEmployeesNo = objectInput.readUTF();
		travelHaltSignDate = objectInput.readLong();
		gasStation = objectInput.readUTF();
		refreshment = objectInput.readUTF();
		drinks = objectInput.readUTF();
		restaurant = objectInput.readUTF();
		wirelessinternet = objectInput.readUTF();
		restrooms = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionTravelHaltAppId);

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

		if (travelHaltApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltApplicantName);
		}

		if (travelHaltAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltAddress);
		}

		if (travelHaltTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltTelephone);
		}

		if (travelHaltEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltEmail);
		}

		if (travelHaltName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltName);
		}

		if (travelHaltLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltLocation);
		}

		if (travelHaltTelephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltTelephoneNum);
		}

		if (travelHaltEmployeesNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(travelHaltEmployeesNo);
		}

		objectOutput.writeLong(travelHaltSignDate);

		if (gasStation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gasStation);
		}

		if (refreshment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(refreshment);
		}

		if (drinks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(drinks);
		}

		if (restaurant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(restaurant);
		}

		if (wirelessinternet == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(wirelessinternet);
		}

		if (restrooms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(restrooms);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionTravelHaltAppId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String travelHaltApplicantName;
	public String travelHaltAddress;
	public String travelHaltTelephone;
	public String travelHaltEmail;
	public String travelHaltName;
	public String travelHaltLocation;
	public String travelHaltTelephoneNum;
	public String travelHaltEmployeesNo;
	public long travelHaltSignDate;
	public String gasStation;
	public String refreshment;
	public String drinks;
	public String restaurant;
	public String wirelessinternet;
	public String restrooms;
	public long jtbApplicationId;

}