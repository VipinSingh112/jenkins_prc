/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantGeneralBussinessInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantGeneralBussinessInfoCacheModel
	implements CacheModel<SezOccupantGeneralBussinessInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantGeneralBussinessInfoCacheModel)) {
			return false;
		}

		SezOccupantGeneralBussinessInfoCacheModel
			sezOccupantGeneralBussinessInfoCacheModel =
				(SezOccupantGeneralBussinessInfoCacheModel)object;

		if (sezOccGenBussId ==
				sezOccupantGeneralBussinessInfoCacheModel.sezOccGenBussId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccGenBussId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{sezOccGenBussId=");
		sb.append(sezOccGenBussId);
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
		sb.append(", occAppDate=");
		sb.append(occAppDate);
		sb.append(", occSezDevName=");
		sb.append(occSezDevName);
		sb.append(", occSezDevControlNum=");
		sb.append(occSezDevControlNum);
		sb.append(", occExistingCom=");
		sb.append(occExistingCom);
		sb.append(", occFormArticle=");
		sb.append(occFormArticle);
		sb.append(", occFormArticleOther=");
		sb.append(occFormArticleOther);
		sb.append(", occTRN=");
		sb.append(occTRN);
		sb.append(", occGCT=");
		sb.append(occGCT);
		sb.append(", occTCC=");
		sb.append(occTCC);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantGeneralBussinessInfo toEntityModel() {
		SezOccupantGeneralBussinessInfoImpl
			sezOccupantGeneralBussinessInfoImpl =
				new SezOccupantGeneralBussinessInfoImpl();

		sezOccupantGeneralBussinessInfoImpl.setSezOccGenBussId(sezOccGenBussId);
		sezOccupantGeneralBussinessInfoImpl.setGroupId(groupId);
		sezOccupantGeneralBussinessInfoImpl.setCompanyId(companyId);
		sezOccupantGeneralBussinessInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantGeneralBussinessInfoImpl.setUserName("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantGeneralBussinessInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantGeneralBussinessInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occAppDate == Long.MIN_VALUE) {
			sezOccupantGeneralBussinessInfoImpl.setOccAppDate(null);
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccAppDate(
				new Date(occAppDate));
		}

		if (occSezDevName == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccSezDevName("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccSezDevName(occSezDevName);
		}

		if (occSezDevControlNum == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccSezDevControlNum("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccSezDevControlNum(
				occSezDevControlNum);
		}

		if (occExistingCom == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccExistingCom("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccExistingCom(
				occExistingCom);
		}

		if (occFormArticle == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccFormArticle("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccFormArticle(
				occFormArticle);
		}

		if (occFormArticleOther == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccFormArticleOther("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccFormArticleOther(
				occFormArticleOther);
		}

		if (occTRN == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccTRN("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccTRN(occTRN);
		}

		if (occGCT == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccGCT("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccGCT(occGCT);
		}

		if (occTCC == null) {
			sezOccupantGeneralBussinessInfoImpl.setOccTCC("");
		}
		else {
			sezOccupantGeneralBussinessInfoImpl.setOccTCC(occTCC);
		}

		sezOccupantGeneralBussinessInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantGeneralBussinessInfoImpl.resetOriginalValues();

		return sezOccupantGeneralBussinessInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccGenBussId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occAppDate = objectInput.readLong();
		occSezDevName = objectInput.readUTF();
		occSezDevControlNum = objectInput.readUTF();
		occExistingCom = objectInput.readUTF();
		occFormArticle = objectInput.readUTF();
		occFormArticleOther = objectInput.readUTF();
		occTRN = objectInput.readUTF();
		occGCT = objectInput.readUTF();
		occTCC = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccGenBussId);

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
		objectOutput.writeLong(occAppDate);

		if (occSezDevName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSezDevName);
		}

		if (occSezDevControlNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSezDevControlNum);
		}

		if (occExistingCom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occExistingCom);
		}

		if (occFormArticle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occFormArticle);
		}

		if (occFormArticleOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occFormArticleOther);
		}

		if (occTRN == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occTRN);
		}

		if (occGCT == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occGCT);
		}

		if (occTCC == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occTCC);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccGenBussId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long occAppDate;
	public String occSezDevName;
	public String occSezDevControlNum;
	public String occExistingCom;
	public String occFormArticle;
	public String occFormArticleOther;
	public String occTRN;
	public String occGCT;
	public String occTCC;
	public long sezStatusApplicationId;

}