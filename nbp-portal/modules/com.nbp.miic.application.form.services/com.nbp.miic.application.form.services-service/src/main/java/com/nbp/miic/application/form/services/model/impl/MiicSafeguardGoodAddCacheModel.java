/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicSafeguardGoodAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicSafeguardGoodAddCacheModel
	implements CacheModel<MiicSafeguardGoodAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicSafeguardGoodAddCacheModel)) {
			return false;
		}

		MiicSafeguardGoodAddCacheModel miicSafeguardGoodAddCacheModel =
			(MiicSafeguardGoodAddCacheModel)object;

		if (miicSafeguardGoodAddId ==
				miicSafeguardGoodAddCacheModel.miicSafeguardGoodAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicSafeguardGoodAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{miicSafeguardGoodAddId=");
		sb.append(miicSafeguardGoodAddId);
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
		sb.append(", tariffHeadingNum=");
		sb.append(tariffHeadingNum);
		sb.append(", description=");
		sb.append(description);
		sb.append(", amountQuantity=");
		sb.append(amountQuantity);
		sb.append(", amountEstimate=");
		sb.append(amountEstimate);
		sb.append(", resonForRequest=");
		sb.append(resonForRequest);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicSafeguardGoodAdd toEntityModel() {
		MiicSafeguardGoodAddImpl miicSafeguardGoodAddImpl =
			new MiicSafeguardGoodAddImpl();

		miicSafeguardGoodAddImpl.setMiicSafeguardGoodAddId(
			miicSafeguardGoodAddId);
		miicSafeguardGoodAddImpl.setGroupId(groupId);
		miicSafeguardGoodAddImpl.setCompanyId(companyId);
		miicSafeguardGoodAddImpl.setUserId(userId);

		if (userName == null) {
			miicSafeguardGoodAddImpl.setUserName("");
		}
		else {
			miicSafeguardGoodAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicSafeguardGoodAddImpl.setCreateDate(null);
		}
		else {
			miicSafeguardGoodAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicSafeguardGoodAddImpl.setModifiedDate(null);
		}
		else {
			miicSafeguardGoodAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tariffHeadingNum == null) {
			miicSafeguardGoodAddImpl.setTariffHeadingNum("");
		}
		else {
			miicSafeguardGoodAddImpl.setTariffHeadingNum(tariffHeadingNum);
		}

		if (description == null) {
			miicSafeguardGoodAddImpl.setDescription("");
		}
		else {
			miicSafeguardGoodAddImpl.setDescription(description);
		}

		if (amountQuantity == null) {
			miicSafeguardGoodAddImpl.setAmountQuantity("");
		}
		else {
			miicSafeguardGoodAddImpl.setAmountQuantity(amountQuantity);
		}

		if (amountEstimate == null) {
			miicSafeguardGoodAddImpl.setAmountEstimate("");
		}
		else {
			miicSafeguardGoodAddImpl.setAmountEstimate(amountEstimate);
		}

		if (resonForRequest == null) {
			miicSafeguardGoodAddImpl.setResonForRequest("");
		}
		else {
			miicSafeguardGoodAddImpl.setResonForRequest(resonForRequest);
		}

		if (counter == null) {
			miicSafeguardGoodAddImpl.setCounter("");
		}
		else {
			miicSafeguardGoodAddImpl.setCounter(counter);
		}

		miicSafeguardGoodAddImpl.setMiicApplicationId(miicApplicationId);

		miicSafeguardGoodAddImpl.resetOriginalValues();

		return miicSafeguardGoodAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicSafeguardGoodAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tariffHeadingNum = objectInput.readUTF();
		description = objectInput.readUTF();
		amountQuantity = objectInput.readUTF();
		amountEstimate = objectInput.readUTF();
		resonForRequest = objectInput.readUTF();
		counter = objectInput.readUTF();

		miicApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicSafeguardGoodAddId);

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

		if (tariffHeadingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tariffHeadingNum);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (amountQuantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountQuantity);
		}

		if (amountEstimate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountEstimate);
		}

		if (resonForRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(resonForRequest);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(miicApplicationId);
	}

	public long miicSafeguardGoodAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tariffHeadingNum;
	public String description;
	public String amountQuantity;
	public String amountEstimate;
	public String resonForRequest;
	public String counter;
	public long miicApplicationId;

}