/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractDetailFormInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractDetailFormInfoCacheModel
	implements CacheModel<AttractDetailFormInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractDetailFormInfoCacheModel)) {
			return false;
		}

		AttractDetailFormInfoCacheModel attractDetailFormInfoCacheModel =
			(AttractDetailFormInfoCacheModel)object;

		if (attractDetailFormInfoId ==
				attractDetailFormInfoCacheModel.attractDetailFormInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractDetailFormInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{attractDetailFormInfoId=");
		sb.append(attractDetailFormInfoId);
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
		sb.append(", newAttractionsOwnerName=");
		sb.append(newAttractionsOwnerName);
		sb.append(", newAttractionsLocation=");
		sb.append(newAttractionsLocation);
		sb.append(", newAttractionsMailing=");
		sb.append(newAttractionsMailing);
		sb.append(", newAttractionsTelephone=");
		sb.append(newAttractionsTelephone);
		sb.append(", newAttractionsFaxNum=");
		sb.append(newAttractionsFaxNum);
		sb.append(", newAttractionsEmailAddr=");
		sb.append(newAttractionsEmailAddr);
		sb.append(", newAttractionsEmpNum=");
		sb.append(newAttractionsEmpNum);
		sb.append(", newAttractionsParish=");
		sb.append(newAttractionsParish);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractDetailFormInfo toEntityModel() {
		AttractDetailFormInfoImpl attractDetailFormInfoImpl =
			new AttractDetailFormInfoImpl();

		attractDetailFormInfoImpl.setAttractDetailFormInfoId(
			attractDetailFormInfoId);
		attractDetailFormInfoImpl.setGroupId(groupId);
		attractDetailFormInfoImpl.setCompanyId(companyId);
		attractDetailFormInfoImpl.setUserId(userId);

		if (userName == null) {
			attractDetailFormInfoImpl.setUserName("");
		}
		else {
			attractDetailFormInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractDetailFormInfoImpl.setCreateDate(null);
		}
		else {
			attractDetailFormInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractDetailFormInfoImpl.setModifiedDate(null);
		}
		else {
			attractDetailFormInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (newAttractionsOwnerName == null) {
			attractDetailFormInfoImpl.setNewAttractionsOwnerName("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsOwnerName(
				newAttractionsOwnerName);
		}

		if (newAttractionsLocation == null) {
			attractDetailFormInfoImpl.setNewAttractionsLocation("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsLocation(
				newAttractionsLocation);
		}

		if (newAttractionsMailing == null) {
			attractDetailFormInfoImpl.setNewAttractionsMailing("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsMailing(
				newAttractionsMailing);
		}

		if (newAttractionsTelephone == null) {
			attractDetailFormInfoImpl.setNewAttractionsTelephone("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsTelephone(
				newAttractionsTelephone);
		}

		if (newAttractionsFaxNum == null) {
			attractDetailFormInfoImpl.setNewAttractionsFaxNum("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsFaxNum(
				newAttractionsFaxNum);
		}

		if (newAttractionsEmailAddr == null) {
			attractDetailFormInfoImpl.setNewAttractionsEmailAddr("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsEmailAddr(
				newAttractionsEmailAddr);
		}

		if (newAttractionsEmpNum == null) {
			attractDetailFormInfoImpl.setNewAttractionsEmpNum("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsEmpNum(
				newAttractionsEmpNum);
		}

		if (newAttractionsParish == null) {
			attractDetailFormInfoImpl.setNewAttractionsParish("");
		}
		else {
			attractDetailFormInfoImpl.setNewAttractionsParish(
				newAttractionsParish);
		}

		attractDetailFormInfoImpl.setJtbApplicationId(jtbApplicationId);

		attractDetailFormInfoImpl.resetOriginalValues();

		return attractDetailFormInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractDetailFormInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		newAttractionsOwnerName = objectInput.readUTF();
		newAttractionsLocation = objectInput.readUTF();
		newAttractionsMailing = objectInput.readUTF();
		newAttractionsTelephone = objectInput.readUTF();
		newAttractionsFaxNum = objectInput.readUTF();
		newAttractionsEmailAddr = objectInput.readUTF();
		newAttractionsEmpNum = objectInput.readUTF();
		newAttractionsParish = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractDetailFormInfoId);

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

		if (newAttractionsOwnerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsOwnerName);
		}

		if (newAttractionsLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsLocation);
		}

		if (newAttractionsMailing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsMailing);
		}

		if (newAttractionsTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsTelephone);
		}

		if (newAttractionsFaxNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsFaxNum);
		}

		if (newAttractionsEmailAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsEmailAddr);
		}

		if (newAttractionsEmpNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsEmpNum);
		}

		if (newAttractionsParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newAttractionsParish);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractDetailFormInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String newAttractionsOwnerName;
	public String newAttractionsLocation;
	public String newAttractionsMailing;
	public String newAttractionsTelephone;
	public String newAttractionsFaxNum;
	public String newAttractionsEmailAddr;
	public String newAttractionsEmpNum;
	public String newAttractionsParish;
	public long jtbApplicationId;

}