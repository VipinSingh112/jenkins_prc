/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmEquipmentList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmEquipmentList in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmEquipmentListCacheModel
	implements CacheModel<FilmEquipmentList>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmEquipmentListCacheModel)) {
			return false;
		}

		FilmEquipmentListCacheModel filmEquipmentListCacheModel =
			(FilmEquipmentListCacheModel)object;

		if (filmEquipmentListId ==
				filmEquipmentListCacheModel.filmEquipmentListId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmEquipmentListId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{filmEquipmentListId=");
		sb.append(filmEquipmentListId);
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
		sb.append(", item=");
		sb.append(item);
		sb.append(", serialNumber=");
		sb.append(serialNumber);
		sb.append(", weight=");
		sb.append(weight);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", unitPrice=");
		sb.append(unitPrice);
		sb.append(", description=");
		sb.append(description);
		sb.append(", total=");
		sb.append(total);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", equipmentList=");
		sb.append(equipmentList);
		sb.append(", flightNumber=");
		sb.append(flightNumber);
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmEquipmentList toEntityModel() {
		FilmEquipmentListImpl filmEquipmentListImpl =
			new FilmEquipmentListImpl();

		filmEquipmentListImpl.setFilmEquipmentListId(filmEquipmentListId);
		filmEquipmentListImpl.setGroupId(groupId);
		filmEquipmentListImpl.setCompanyId(companyId);
		filmEquipmentListImpl.setUserId(userId);

		if (userName == null) {
			filmEquipmentListImpl.setUserName("");
		}
		else {
			filmEquipmentListImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmEquipmentListImpl.setCreateDate(null);
		}
		else {
			filmEquipmentListImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmEquipmentListImpl.setModifiedDate(null);
		}
		else {
			filmEquipmentListImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (item == null) {
			filmEquipmentListImpl.setItem("");
		}
		else {
			filmEquipmentListImpl.setItem(item);
		}

		if (serialNumber == null) {
			filmEquipmentListImpl.setSerialNumber("");
		}
		else {
			filmEquipmentListImpl.setSerialNumber(serialNumber);
		}

		if (weight == null) {
			filmEquipmentListImpl.setWeight("");
		}
		else {
			filmEquipmentListImpl.setWeight(weight);
		}

		if (quantity == null) {
			filmEquipmentListImpl.setQuantity("");
		}
		else {
			filmEquipmentListImpl.setQuantity(quantity);
		}

		if (unitPrice == null) {
			filmEquipmentListImpl.setUnitPrice("");
		}
		else {
			filmEquipmentListImpl.setUnitPrice(unitPrice);
		}

		if (description == null) {
			filmEquipmentListImpl.setDescription("");
		}
		else {
			filmEquipmentListImpl.setDescription(description);
		}

		if (total == null) {
			filmEquipmentListImpl.setTotal("");
		}
		else {
			filmEquipmentListImpl.setTotal(total);
		}

		if (counter == null) {
			filmEquipmentListImpl.setCounter("");
		}
		else {
			filmEquipmentListImpl.setCounter(counter);
		}

		if (equipmentList == null) {
			filmEquipmentListImpl.setEquipmentList("");
		}
		else {
			filmEquipmentListImpl.setEquipmentList(equipmentList);
		}

		if (flightNumber == null) {
			filmEquipmentListImpl.setFlightNumber("");
		}
		else {
			filmEquipmentListImpl.setFlightNumber(flightNumber);
		}

		filmEquipmentListImpl.setFilmApplicationId(filmApplicationId);

		filmEquipmentListImpl.resetOriginalValues();

		return filmEquipmentListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmEquipmentListId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		item = objectInput.readUTF();
		serialNumber = objectInput.readUTF();
		weight = objectInput.readUTF();
		quantity = objectInput.readUTF();
		unitPrice = objectInput.readUTF();
		description = objectInput.readUTF();
		total = objectInput.readUTF();
		counter = objectInput.readUTF();
		equipmentList = objectInput.readUTF();
		flightNumber = objectInput.readUTF();

		filmApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmEquipmentListId);

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

		if (item == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(item);
		}

		if (serialNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serialNumber);
		}

		if (weight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(weight);
		}

		if (quantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (unitPrice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unitPrice);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (total == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(total);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		if (equipmentList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipmentList);
		}

		if (flightNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(flightNumber);
		}

		objectOutput.writeLong(filmApplicationId);
	}

	public long filmEquipmentListId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String item;
	public String serialNumber;
	public String weight;
	public String quantity;
	public String unitPrice;
	public String description;
	public String total;
	public String counter;
	public String equipmentList;
	public String flightNumber;
	public long filmApplicationId;

}