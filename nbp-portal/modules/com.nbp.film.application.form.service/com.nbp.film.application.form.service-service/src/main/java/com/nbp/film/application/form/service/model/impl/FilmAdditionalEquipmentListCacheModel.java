/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmAdditionalEquipmentList in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmAdditionalEquipmentListCacheModel
	implements CacheModel<FilmAdditionalEquipmentList>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmAdditionalEquipmentListCacheModel)) {
			return false;
		}

		FilmAdditionalEquipmentListCacheModel
			filmAdditionalEquipmentListCacheModel =
				(FilmAdditionalEquipmentListCacheModel)object;

		if (FilmAdditionalEquipmentListId ==
				filmAdditionalEquipmentListCacheModel.
					FilmAdditionalEquipmentListId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, FilmAdditionalEquipmentListId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{FilmAdditionalEquipmentListId=");
		sb.append(FilmAdditionalEquipmentListId);
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
		sb.append(", arrivalDate=");
		sb.append(arrivalDate);
		sb.append(", airlineShipper=");
		sb.append(airlineShipper);
		sb.append(", flightVesselNum=");
		sb.append(flightVesselNum);
		sb.append(", passengerName=");
		sb.append(passengerName);
		sb.append(", entryPort=");
		sb.append(entryPort);
		sb.append(", customsBroker=");
		sb.append(customsBroker);
		sb.append(", flightNumber=");
		sb.append(flightNumber);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmAdditionalEquipmentList toEntityModel() {
		FilmAdditionalEquipmentListImpl filmAdditionalEquipmentListImpl =
			new FilmAdditionalEquipmentListImpl();

		filmAdditionalEquipmentListImpl.setFilmAdditionalEquipmentListId(
			FilmAdditionalEquipmentListId);
		filmAdditionalEquipmentListImpl.setGroupId(groupId);
		filmAdditionalEquipmentListImpl.setCompanyId(companyId);
		filmAdditionalEquipmentListImpl.setUserId(userId);

		if (userName == null) {
			filmAdditionalEquipmentListImpl.setUserName("");
		}
		else {
			filmAdditionalEquipmentListImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmAdditionalEquipmentListImpl.setCreateDate(null);
		}
		else {
			filmAdditionalEquipmentListImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmAdditionalEquipmentListImpl.setModifiedDate(null);
		}
		else {
			filmAdditionalEquipmentListImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (arrivalDate == Long.MIN_VALUE) {
			filmAdditionalEquipmentListImpl.setArrivalDate(null);
		}
		else {
			filmAdditionalEquipmentListImpl.setArrivalDate(
				new Date(arrivalDate));
		}

		if (airlineShipper == null) {
			filmAdditionalEquipmentListImpl.setAirlineShipper("");
		}
		else {
			filmAdditionalEquipmentListImpl.setAirlineShipper(airlineShipper);
		}

		if (flightVesselNum == null) {
			filmAdditionalEquipmentListImpl.setFlightVesselNum("");
		}
		else {
			filmAdditionalEquipmentListImpl.setFlightVesselNum(flightVesselNum);
		}

		if (passengerName == null) {
			filmAdditionalEquipmentListImpl.setPassengerName("");
		}
		else {
			filmAdditionalEquipmentListImpl.setPassengerName(passengerName);
		}

		if (entryPort == null) {
			filmAdditionalEquipmentListImpl.setEntryPort("");
		}
		else {
			filmAdditionalEquipmentListImpl.setEntryPort(entryPort);
		}

		if (customsBroker == null) {
			filmAdditionalEquipmentListImpl.setCustomsBroker("");
		}
		else {
			filmAdditionalEquipmentListImpl.setCustomsBroker(customsBroker);
		}

		if (flightNumber == null) {
			filmAdditionalEquipmentListImpl.setFlightNumber("");
		}
		else {
			filmAdditionalEquipmentListImpl.setFlightNumber(flightNumber);
		}

		if (counter == null) {
			filmAdditionalEquipmentListImpl.setCounter("");
		}
		else {
			filmAdditionalEquipmentListImpl.setCounter(counter);
		}

		filmAdditionalEquipmentListImpl.setFilmApplicationId(filmApplicationId);

		filmAdditionalEquipmentListImpl.resetOriginalValues();

		return filmAdditionalEquipmentListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		FilmAdditionalEquipmentListId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		arrivalDate = objectInput.readLong();
		airlineShipper = objectInput.readUTF();
		flightVesselNum = objectInput.readUTF();
		passengerName = objectInput.readUTF();
		entryPort = objectInput.readUTF();
		customsBroker = objectInput.readUTF();
		flightNumber = objectInput.readUTF();
		counter = objectInput.readUTF();

		filmApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(FilmAdditionalEquipmentListId);

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
		objectOutput.writeLong(arrivalDate);

		if (airlineShipper == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(airlineShipper);
		}

		if (flightVesselNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(flightVesselNum);
		}

		if (passengerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(passengerName);
		}

		if (entryPort == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entryPort);
		}

		if (customsBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customsBroker);
		}

		if (flightNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(flightNumber);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(filmApplicationId);
	}

	public long FilmAdditionalEquipmentListId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long arrivalDate;
	public String airlineShipper;
	public String flightVesselNum;
	public String passengerName;
	public String entryPort;
	public String customsBroker;
	public String flightNumber;
	public String counter;
	public long filmApplicationId;

}