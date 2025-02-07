/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicSafeguardMaterialAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicSafeguardMaterialAddCacheModel
	implements CacheModel<MiicSafeguardMaterialAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicSafeguardMaterialAddCacheModel)) {
			return false;
		}

		MiicSafeguardMaterialAddCacheModel miicSafeguardMaterialAddCacheModel =
			(MiicSafeguardMaterialAddCacheModel)object;

		if (miicSafeguardMaterialAddId ==
				miicSafeguardMaterialAddCacheModel.miicSafeguardMaterialAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicSafeguardMaterialAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{miicSafeguardMaterialAddId=");
		sb.append(miicSafeguardMaterialAddId);
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
		sb.append(", nameOfProducer=");
		sb.append(nameOfProducer);
		sb.append(", addressOfProducer =");
		sb.append(addressOfProducer);
		sb.append(", description=");
		sb.append(description);
		sb.append(", tariffHeadingNum=");
		sb.append(tariffHeadingNum);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", technologySpecification=");
		sb.append(technologySpecification);
		sb.append(", periodOfImportationFrom=");
		sb.append(periodOfImportationFrom);
		sb.append(", periodOfImportationTo=");
		sb.append(periodOfImportationTo);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicSafeguardMaterialAdd toEntityModel() {
		MiicSafeguardMaterialAddImpl miicSafeguardMaterialAddImpl =
			new MiicSafeguardMaterialAddImpl();

		miicSafeguardMaterialAddImpl.setMiicSafeguardMaterialAddId(
			miicSafeguardMaterialAddId);
		miicSafeguardMaterialAddImpl.setGroupId(groupId);
		miicSafeguardMaterialAddImpl.setCompanyId(companyId);
		miicSafeguardMaterialAddImpl.setUserId(userId);

		if (userName == null) {
			miicSafeguardMaterialAddImpl.setUserName("");
		}
		else {
			miicSafeguardMaterialAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicSafeguardMaterialAddImpl.setCreateDate(null);
		}
		else {
			miicSafeguardMaterialAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicSafeguardMaterialAddImpl.setModifiedDate(null);
		}
		else {
			miicSafeguardMaterialAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfProducer == null) {
			miicSafeguardMaterialAddImpl.setNameOfProducer("");
		}
		else {
			miicSafeguardMaterialAddImpl.setNameOfProducer(nameOfProducer);
		}

		if (addressOfProducer == null) {
			miicSafeguardMaterialAddImpl.setAddressOfProducer("");
		}
		else {
			miicSafeguardMaterialAddImpl.setAddressOfProducer(
				addressOfProducer);
		}

		if (description == null) {
			miicSafeguardMaterialAddImpl.setDescription("");
		}
		else {
			miicSafeguardMaterialAddImpl.setDescription(description);
		}

		if (tariffHeadingNum == null) {
			miicSafeguardMaterialAddImpl.setTariffHeadingNum("");
		}
		else {
			miicSafeguardMaterialAddImpl.setTariffHeadingNum(tariffHeadingNum);
		}

		if (amount == null) {
			miicSafeguardMaterialAddImpl.setAmount("");
		}
		else {
			miicSafeguardMaterialAddImpl.setAmount(amount);
		}

		if (quantity == null) {
			miicSafeguardMaterialAddImpl.setQuantity("");
		}
		else {
			miicSafeguardMaterialAddImpl.setQuantity(quantity);
		}

		if (technologySpecification == null) {
			miicSafeguardMaterialAddImpl.setTechnologySpecification("");
		}
		else {
			miicSafeguardMaterialAddImpl.setTechnologySpecification(
				technologySpecification);
		}

		if (periodOfImportationFrom == Long.MIN_VALUE) {
			miicSafeguardMaterialAddImpl.setPeriodOfImportationFrom(null);
		}
		else {
			miicSafeguardMaterialAddImpl.setPeriodOfImportationFrom(
				new Date(periodOfImportationFrom));
		}

		if (periodOfImportationTo == Long.MIN_VALUE) {
			miicSafeguardMaterialAddImpl.setPeriodOfImportationTo(null);
		}
		else {
			miicSafeguardMaterialAddImpl.setPeriodOfImportationTo(
				new Date(periodOfImportationTo));
		}

		if (counter == null) {
			miicSafeguardMaterialAddImpl.setCounter("");
		}
		else {
			miicSafeguardMaterialAddImpl.setCounter(counter);
		}

		miicSafeguardMaterialAddImpl.setMiicApplicationId(miicApplicationId);

		miicSafeguardMaterialAddImpl.resetOriginalValues();

		return miicSafeguardMaterialAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicSafeguardMaterialAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfProducer = objectInput.readUTF();
		addressOfProducer = objectInput.readUTF();
		description = objectInput.readUTF();
		tariffHeadingNum = objectInput.readUTF();
		amount = objectInput.readUTF();
		quantity = objectInput.readUTF();
		technologySpecification = objectInput.readUTF();
		periodOfImportationFrom = objectInput.readLong();
		periodOfImportationTo = objectInput.readLong();
		counter = objectInput.readUTF();

		miicApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicSafeguardMaterialAddId);

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

		if (nameOfProducer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfProducer);
		}

		if (addressOfProducer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressOfProducer);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (tariffHeadingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tariffHeadingNum);
		}

		if (amount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amount);
		}

		if (quantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quantity);
		}

		if (technologySpecification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(technologySpecification);
		}

		objectOutput.writeLong(periodOfImportationFrom);
		objectOutput.writeLong(periodOfImportationTo);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(miicApplicationId);
	}

	public long miicSafeguardMaterialAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfProducer;
	public String addressOfProducer;
	public String description;
	public String tariffHeadingNum;
	public String amount;
	public String quantity;
	public String technologySpecification;
	public long periodOfImportationFrom;
	public long periodOfImportationTo;
	public String counter;
	public long miicApplicationId;

}