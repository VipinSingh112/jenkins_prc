/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionCraftTrader in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionCraftTraderCacheModel
	implements CacheModel<AttractionCraftTrader>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionCraftTraderCacheModel)) {
			return false;
		}

		AttractionCraftTraderCacheModel attractionCraftTraderCacheModel =
			(AttractionCraftTraderCacheModel)object;

		if (attractionCraftTraderId ==
				attractionCraftTraderCacheModel.attractionCraftTraderId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionCraftTraderId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{attractionCraftTraderId=");
		sb.append(attractionCraftTraderId);
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
		sb.append(", craftTradersAppliOwner=");
		sb.append(craftTradersAppliOwner);
		sb.append(", craftTradersAppliAddress=");
		sb.append(craftTradersAppliAddress);
		sb.append(", craftTradersAppliPhoneNo=");
		sb.append(craftTradersAppliPhoneNo);
		sb.append(", craftTradersAppliEmail=");
		sb.append(craftTradersAppliEmail);
		sb.append(", occupyLocation=");
		sb.append(occupyLocation);
		sb.append(", craftTraderGoodsType=");
		sb.append(craftTraderGoodsType);
		sb.append(", craftTraderName=");
		sb.append(craftTraderName);
		sb.append(", craftTraderPosition=");
		sb.append(craftTraderPosition);
		sb.append(", craftTraderMinisterAddr=");
		sb.append(craftTraderMinisterAddr);
		sb.append(", craftTraderMinisterName=");
		sb.append(craftTraderMinisterName);
		sb.append(", craftTraderMinisterNamePos=");
		sb.append(craftTraderMinisterNamePos);
		sb.append(", craftTraderAddressOwner=");
		sb.append(craftTraderAddressOwner);
		sb.append(", craftTraderSignDate=");
		sb.append(craftTraderSignDate);
		sb.append(", craftTraderAssistSiDate=");
		sb.append(craftTraderAssistSiDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionCraftTrader toEntityModel() {
		AttractionCraftTraderImpl attractionCraftTraderImpl =
			new AttractionCraftTraderImpl();

		attractionCraftTraderImpl.setAttractionCraftTraderId(
			attractionCraftTraderId);
		attractionCraftTraderImpl.setGroupId(groupId);
		attractionCraftTraderImpl.setCompanyId(companyId);
		attractionCraftTraderImpl.setUserId(userId);

		if (userName == null) {
			attractionCraftTraderImpl.setUserName("");
		}
		else {
			attractionCraftTraderImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionCraftTraderImpl.setCreateDate(null);
		}
		else {
			attractionCraftTraderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionCraftTraderImpl.setModifiedDate(null);
		}
		else {
			attractionCraftTraderImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (craftTradersAppliOwner == null) {
			attractionCraftTraderImpl.setCraftTradersAppliOwner("");
		}
		else {
			attractionCraftTraderImpl.setCraftTradersAppliOwner(
				craftTradersAppliOwner);
		}

		if (craftTradersAppliAddress == null) {
			attractionCraftTraderImpl.setCraftTradersAppliAddress("");
		}
		else {
			attractionCraftTraderImpl.setCraftTradersAppliAddress(
				craftTradersAppliAddress);
		}

		if (craftTradersAppliPhoneNo == null) {
			attractionCraftTraderImpl.setCraftTradersAppliPhoneNo("");
		}
		else {
			attractionCraftTraderImpl.setCraftTradersAppliPhoneNo(
				craftTradersAppliPhoneNo);
		}

		if (craftTradersAppliEmail == null) {
			attractionCraftTraderImpl.setCraftTradersAppliEmail("");
		}
		else {
			attractionCraftTraderImpl.setCraftTradersAppliEmail(
				craftTradersAppliEmail);
		}

		if (occupyLocation == null) {
			attractionCraftTraderImpl.setOccupyLocation("");
		}
		else {
			attractionCraftTraderImpl.setOccupyLocation(occupyLocation);
		}

		if (craftTraderGoodsType == null) {
			attractionCraftTraderImpl.setCraftTraderGoodsType("");
		}
		else {
			attractionCraftTraderImpl.setCraftTraderGoodsType(
				craftTraderGoodsType);
		}

		if (craftTraderName == null) {
			attractionCraftTraderImpl.setCraftTraderName("");
		}
		else {
			attractionCraftTraderImpl.setCraftTraderName(craftTraderName);
		}

		if (craftTraderPosition == null) {
			attractionCraftTraderImpl.setCraftTraderPosition("");
		}
		else {
			attractionCraftTraderImpl.setCraftTraderPosition(
				craftTraderPosition);
		}

		if (craftTraderMinisterAddr == null) {
			attractionCraftTraderImpl.setCraftTraderMinisterAddr("");
		}
		else {
			attractionCraftTraderImpl.setCraftTraderMinisterAddr(
				craftTraderMinisterAddr);
		}

		if (craftTraderMinisterName == null) {
			attractionCraftTraderImpl.setCraftTraderMinisterName("");
		}
		else {
			attractionCraftTraderImpl.setCraftTraderMinisterName(
				craftTraderMinisterName);
		}

		if (craftTraderMinisterNamePos == null) {
			attractionCraftTraderImpl.setCraftTraderMinisterNamePos("");
		}
		else {
			attractionCraftTraderImpl.setCraftTraderMinisterNamePos(
				craftTraderMinisterNamePos);
		}

		if (craftTraderAddressOwner == null) {
			attractionCraftTraderImpl.setCraftTraderAddressOwner("");
		}
		else {
			attractionCraftTraderImpl.setCraftTraderAddressOwner(
				craftTraderAddressOwner);
		}

		if (craftTraderSignDate == Long.MIN_VALUE) {
			attractionCraftTraderImpl.setCraftTraderSignDate(null);
		}
		else {
			attractionCraftTraderImpl.setCraftTraderSignDate(
				new Date(craftTraderSignDate));
		}

		if (craftTraderAssistSiDate == Long.MIN_VALUE) {
			attractionCraftTraderImpl.setCraftTraderAssistSiDate(null);
		}
		else {
			attractionCraftTraderImpl.setCraftTraderAssistSiDate(
				new Date(craftTraderAssistSiDate));
		}

		attractionCraftTraderImpl.setJtbApplicationId(jtbApplicationId);

		attractionCraftTraderImpl.resetOriginalValues();

		return attractionCraftTraderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionCraftTraderId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		craftTradersAppliOwner = objectInput.readUTF();
		craftTradersAppliAddress = objectInput.readUTF();
		craftTradersAppliPhoneNo = objectInput.readUTF();
		craftTradersAppliEmail = objectInput.readUTF();
		occupyLocation = objectInput.readUTF();
		craftTraderGoodsType = objectInput.readUTF();
		craftTraderName = objectInput.readUTF();
		craftTraderPosition = objectInput.readUTF();
		craftTraderMinisterAddr = objectInput.readUTF();
		craftTraderMinisterName = objectInput.readUTF();
		craftTraderMinisterNamePos = objectInput.readUTF();
		craftTraderAddressOwner = objectInput.readUTF();
		craftTraderSignDate = objectInput.readLong();
		craftTraderAssistSiDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionCraftTraderId);

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

		if (craftTradersAppliOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTradersAppliOwner);
		}

		if (craftTradersAppliAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTradersAppliAddress);
		}

		if (craftTradersAppliPhoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTradersAppliPhoneNo);
		}

		if (craftTradersAppliEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTradersAppliEmail);
		}

		if (occupyLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occupyLocation);
		}

		if (craftTraderGoodsType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTraderGoodsType);
		}

		if (craftTraderName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTraderName);
		}

		if (craftTraderPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTraderPosition);
		}

		if (craftTraderMinisterAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTraderMinisterAddr);
		}

		if (craftTraderMinisterName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTraderMinisterName);
		}

		if (craftTraderMinisterNamePos == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTraderMinisterNamePos);
		}

		if (craftTraderAddressOwner == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(craftTraderAddressOwner);
		}

		objectOutput.writeLong(craftTraderSignDate);
		objectOutput.writeLong(craftTraderAssistSiDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionCraftTraderId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String craftTradersAppliOwner;
	public String craftTradersAppliAddress;
	public String craftTradersAppliPhoneNo;
	public String craftTradersAppliEmail;
	public String occupyLocation;
	public String craftTraderGoodsType;
	public String craftTraderName;
	public String craftTraderPosition;
	public String craftTraderMinisterAddr;
	public String craftTraderMinisterName;
	public String craftTraderMinisterNamePos;
	public String craftTraderAddressOwner;
	public long craftTraderSignDate;
	public long craftTraderAssistSiDate;
	public long jtbApplicationId;

}