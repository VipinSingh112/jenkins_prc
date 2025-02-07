/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionGenDeclareInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionGenDeclareInfoCacheModel
	implements CacheModel<AttractionGenDeclareInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionGenDeclareInfoCacheModel)) {
			return false;
		}

		AttractionGenDeclareInfoCacheModel attractionGenDeclareInfoCacheModel =
			(AttractionGenDeclareInfoCacheModel)object;

		if (attractionGenDeclareInfoId ==
				attractionGenDeclareInfoCacheModel.attractionGenDeclareInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionGenDeclareInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{attractionGenDeclareInfoId=");
		sb.append(attractionGenDeclareInfoId);
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
		sb.append(", newAttractionsGenOwnerName=");
		sb.append(newAttractionsGenOwnerName);
		sb.append(", newAttractionsCompanyLaw=");
		sb.append(newAttractionsCompanyLaw);
		sb.append(", newAttractionsDate=");
		sb.append(newAttractionsDate);
		sb.append(", newAttractionsName=");
		sb.append(newAttractionsName);
		sb.append(", newAttractionsStartDate=");
		sb.append(newAttractionsStartDate);
		sb.append(", newAttractionsSituatedLand=");
		sb.append(newAttractionsSituatedLand);
		sb.append(", newAttractionsActivities=");
		sb.append(newAttractionsActivities);
		sb.append(", attractionNewDate=");
		sb.append(attractionNewDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionGenDeclareInfo toEntityModel() {
		AttractionGenDeclareInfoImpl attractionGenDeclareInfoImpl =
			new AttractionGenDeclareInfoImpl();

		attractionGenDeclareInfoImpl.setAttractionGenDeclareInfoId(
			attractionGenDeclareInfoId);
		attractionGenDeclareInfoImpl.setGroupId(groupId);
		attractionGenDeclareInfoImpl.setCompanyId(companyId);
		attractionGenDeclareInfoImpl.setUserId(userId);

		if (userName == null) {
			attractionGenDeclareInfoImpl.setUserName("");
		}
		else {
			attractionGenDeclareInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionGenDeclareInfoImpl.setCreateDate(null);
		}
		else {
			attractionGenDeclareInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionGenDeclareInfoImpl.setModifiedDate(null);
		}
		else {
			attractionGenDeclareInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (newAttractionsGenOwnerName == null) {
			attractionGenDeclareInfoImpl.setNewAttractionsGenOwnerName("");
		}
		else {
			attractionGenDeclareInfoImpl.setNewAttractionsGenOwnerName(
				newAttractionsGenOwnerName);
		}

		if (newAttractionsCompanyLaw == null) {
			attractionGenDeclareInfoImpl.setNewAttractionsCompanyLaw("");
		}
		else {
			attractionGenDeclareInfoImpl.setNewAttractionsCompanyLaw(
				newAttractionsCompanyLaw);
		}

		if (newAttractionsDate == Long.MIN_VALUE) {
			attractionGenDeclareInfoImpl.setNewAttractionsDate(null);
		}
		else {
			attractionGenDeclareInfoImpl.setNewAttractionsDate(
				new Date(newAttractionsDate));
		}

		if (newAttractionsName == null) {
			attractionGenDeclareInfoImpl.setNewAttractionsName("");
		}
		else {
			attractionGenDeclareInfoImpl.setNewAttractionsName(
				newAttractionsName);
		}

		if (newAttractionsStartDate == Long.MIN_VALUE) {
			attractionGenDeclareInfoImpl.setNewAttractionsStartDate(null);
		}
		else {
			attractionGenDeclareInfoImpl.setNewAttractionsStartDate(
				new Date(newAttractionsStartDate));
		}

		if (newAttractionsSituatedLand == null) {
			attractionGenDeclareInfoImpl.setNewAttractionsSituatedLand("");
		}
		else {
			attractionGenDeclareInfoImpl.setNewAttractionsSituatedLand(
				newAttractionsSituatedLand);
		}

		if (newAttractionsActivities == null) {
			attractionGenDeclareInfoImpl.setNewAttractionsActivities("");
		}
		else {
			attractionGenDeclareInfoImpl.setNewAttractionsActivities(
				newAttractionsActivities);
		}

		if (attractionNewDate == Long.MIN_VALUE) {
			attractionGenDeclareInfoImpl.setAttractionNewDate(null);
		}
		else {
			attractionGenDeclareInfoImpl.setAttractionNewDate(
				new Date(attractionNewDate));
		}

		attractionGenDeclareInfoImpl.setJtbApplicationId(jtbApplicationId);

		attractionGenDeclareInfoImpl.resetOriginalValues();

		return attractionGenDeclareInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionGenDeclareInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		newAttractionsGenOwnerName = objectInput.readUTF();
		newAttractionsCompanyLaw = objectInput.readUTF();
		newAttractionsDate = objectInput.readLong();
		newAttractionsName = objectInput.readUTF();
		newAttractionsStartDate = objectInput.readLong();
		newAttractionsSituatedLand = objectInput.readUTF();
		newAttractionsActivities = objectInput.readUTF();
		attractionNewDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionGenDeclareInfoId);

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

		if (newAttractionsGenOwnerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsGenOwnerName);
		}

		if (newAttractionsCompanyLaw == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsCompanyLaw);
		}

		objectOutput.writeLong(newAttractionsDate);

		if (newAttractionsName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsName);
		}

		objectOutput.writeLong(newAttractionsStartDate);

		if (newAttractionsSituatedLand == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsSituatedLand);
		}

		if (newAttractionsActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsActivities);
		}

		objectOutput.writeLong(attractionNewDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionGenDeclareInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String newAttractionsGenOwnerName;
	public String newAttractionsCompanyLaw;
	public long newAttractionsDate;
	public String newAttractionsName;
	public long newAttractionsStartDate;
	public String newAttractionsSituatedLand;
	public String newAttractionsActivities;
	public long attractionNewDate;
	public long jtbApplicationId;

}