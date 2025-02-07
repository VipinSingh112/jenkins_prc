/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneGeneralBusinessInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneGeneralBusinessInfoCacheModel
	implements CacheModel<SezZoneGeneralBusinessInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneGeneralBusinessInfoCacheModel)) {
			return false;
		}

		SezZoneGeneralBusinessInfoCacheModel
			sezZoneGeneralBusinessInfoCacheModel =
				(SezZoneGeneralBusinessInfoCacheModel)object;

		if (sezZoneGeneralBusinessInfoId ==
				sezZoneGeneralBusinessInfoCacheModel.
					sezZoneGeneralBusinessInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneGeneralBusinessInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{sezZoneGeneralBusinessInfoId=");
		sb.append(sezZoneGeneralBusinessInfoId);
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
		sb.append(", applicationDate=");
		sb.append(applicationDate);
		sb.append(", developerName=");
		sb.append(developerName);
		sb.append(", LocationName=");
		sb.append(LocationName);
		sb.append(", controlNum=");
		sb.append(controlNum);
		sb.append(", existingCompany=");
		sb.append(existingCompany);
		sb.append(", articleForm=");
		sb.append(articleForm);
		sb.append(", otherArticleForm=");
		sb.append(otherArticleForm);
		sb.append(", nonResidentCom=");
		sb.append(nonResidentCom);
		sb.append(", taxRegisNum=");
		sb.append(taxRegisNum);
		sb.append(", genConsumptionNum=");
		sb.append(genConsumptionNum);
		sb.append(", taxComplianceCertificateNum=");
		sb.append(taxComplianceCertificateNum);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezZoneGeneralBusinessInfo toEntityModel() {
		SezZoneGeneralBusinessInfoImpl sezZoneGeneralBusinessInfoImpl =
			new SezZoneGeneralBusinessInfoImpl();

		sezZoneGeneralBusinessInfoImpl.setSezZoneGeneralBusinessInfoId(
			sezZoneGeneralBusinessInfoId);
		sezZoneGeneralBusinessInfoImpl.setGroupId(groupId);
		sezZoneGeneralBusinessInfoImpl.setCompanyId(companyId);
		sezZoneGeneralBusinessInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneGeneralBusinessInfoImpl.setUserName("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneGeneralBusinessInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneGeneralBusinessInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicationDate == Long.MIN_VALUE) {
			sezZoneGeneralBusinessInfoImpl.setApplicationDate(null);
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setApplicationDate(
				new Date(applicationDate));
		}

		if (developerName == null) {
			sezZoneGeneralBusinessInfoImpl.setDeveloperName("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setDeveloperName(developerName);
		}

		if (LocationName == null) {
			sezZoneGeneralBusinessInfoImpl.setLocationName("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setLocationName(LocationName);
		}

		if (controlNum == null) {
			sezZoneGeneralBusinessInfoImpl.setControlNum("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setControlNum(controlNum);
		}

		if (existingCompany == null) {
			sezZoneGeneralBusinessInfoImpl.setExistingCompany("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setExistingCompany(existingCompany);
		}

		if (articleForm == null) {
			sezZoneGeneralBusinessInfoImpl.setArticleForm("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setArticleForm(articleForm);
		}

		if (otherArticleForm == null) {
			sezZoneGeneralBusinessInfoImpl.setOtherArticleForm("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setOtherArticleForm(
				otherArticleForm);
		}

		if (nonResidentCom == null) {
			sezZoneGeneralBusinessInfoImpl.setNonResidentCom("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setNonResidentCom(nonResidentCom);
		}

		if (taxRegisNum == null) {
			sezZoneGeneralBusinessInfoImpl.setTaxRegisNum("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setTaxRegisNum(taxRegisNum);
		}

		if (genConsumptionNum == null) {
			sezZoneGeneralBusinessInfoImpl.setGenConsumptionNum("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setGenConsumptionNum(
				genConsumptionNum);
		}

		if (taxComplianceCertificateNum == null) {
			sezZoneGeneralBusinessInfoImpl.setTaxComplianceCertificateNum("");
		}
		else {
			sezZoneGeneralBusinessInfoImpl.setTaxComplianceCertificateNum(
				taxComplianceCertificateNum);
		}

		sezZoneGeneralBusinessInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezZoneGeneralBusinessInfoImpl.resetOriginalValues();

		return sezZoneGeneralBusinessInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneGeneralBusinessInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicationDate = objectInput.readLong();
		developerName = objectInput.readUTF();
		LocationName = objectInput.readUTF();
		controlNum = objectInput.readUTF();
		existingCompany = objectInput.readUTF();
		articleForm = objectInput.readUTF();
		otherArticleForm = objectInput.readUTF();
		nonResidentCom = objectInput.readUTF();
		taxRegisNum = objectInput.readUTF();
		genConsumptionNum = objectInput.readUTF();
		taxComplianceCertificateNum = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneGeneralBusinessInfoId);

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
		objectOutput.writeLong(applicationDate);

		if (developerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(developerName);
		}

		if (LocationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(LocationName);
		}

		if (controlNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(controlNum);
		}

		if (existingCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(existingCompany);
		}

		if (articleForm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(articleForm);
		}

		if (otherArticleForm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherArticleForm);
		}

		if (nonResidentCom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonResidentCom);
		}

		if (taxRegisNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxRegisNum);
		}

		if (genConsumptionNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(genConsumptionNum);
		}

		if (taxComplianceCertificateNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxComplianceCertificateNum);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneGeneralBusinessInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long applicationDate;
	public String developerName;
	public String LocationName;
	public String controlNum;
	public String existingCompany;
	public String articleForm;
	public String otherArticleForm;
	public String nonResidentCom;
	public String taxRegisNum;
	public String genConsumptionNum;
	public String taxComplianceCertificateNum;
	public long sezStatusApplicationId;

}