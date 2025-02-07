/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningLeaseApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningLeaseApplicationCacheModel
	implements CacheModel<MiningLeaseApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningLeaseApplicationCacheModel)) {
			return false;
		}

		MiningLeaseApplicationCacheModel miningLeaseApplicationCacheModel =
			(MiningLeaseApplicationCacheModel)object;

		if (miningLeaseApplicationId ==
				miningLeaseApplicationCacheModel.miningLeaseApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningLeaseApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
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
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", prospectingRightNumber=");
		sb.append(prospectingRightNumber);
		sb.append(", typeOfProspectingLicence=");
		sb.append(typeOfProspectingLicence);
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", areaDelinationTotalApprox=");
		sb.append(areaDelinationTotalApprox);
		sb.append(", licenceExclusiveSpecial=");
		sb.append(licenceExclusiveSpecial);
		sb.append(", miningMineralsTypeVal=");
		sb.append(miningMineralsTypeVal);
		sb.append(", otherMineralBox=");
		sb.append(otherMineralBox);
		sb.append(", areaDelination=");
		sb.append(areaDelination);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", prospRightsNum=");
		sb.append(prospRightsNum);
		sb.append(", prospLicenseNum=");
		sb.append(prospLicenseNum);
		sb.append(", expiredLicenseAppNumber=");
		sb.append(expiredLicenseAppNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningLeaseApplication toEntityModel() {
		MiningLeaseApplicationImpl miningLeaseApplicationImpl =
			new MiningLeaseApplicationImpl();

		miningLeaseApplicationImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);
		miningLeaseApplicationImpl.setGroupId(groupId);
		miningLeaseApplicationImpl.setCompanyId(companyId);
		miningLeaseApplicationImpl.setUserId(userId);

		if (userName == null) {
			miningLeaseApplicationImpl.setUserName("");
		}
		else {
			miningLeaseApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningLeaseApplicationImpl.setCreateDate(null);
		}
		else {
			miningLeaseApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningLeaseApplicationImpl.setModifiedDate(null);
		}
		else {
			miningLeaseApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			miningLeaseApplicationImpl.setEntityId("");
		}
		else {
			miningLeaseApplicationImpl.setEntityId(entityId);
		}

		if (typeOfApplicant == null) {
			miningLeaseApplicationImpl.setTypeOfApplicant("");
		}
		else {
			miningLeaseApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (prospectingRightNumber == null) {
			miningLeaseApplicationImpl.setProspectingRightNumber("");
		}
		else {
			miningLeaseApplicationImpl.setProspectingRightNumber(
				prospectingRightNumber);
		}

		if (typeOfProspectingLicence == null) {
			miningLeaseApplicationImpl.setTypeOfProspectingLicence("");
		}
		else {
			miningLeaseApplicationImpl.setTypeOfProspectingLicence(
				typeOfProspectingLicence);
		}

		if (typeOfTransaction == null) {
			miningLeaseApplicationImpl.setTypeOfTransaction("");
		}
		else {
			miningLeaseApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (areaDelinationTotalApprox == null) {
			miningLeaseApplicationImpl.setAreaDelinationTotalApprox("");
		}
		else {
			miningLeaseApplicationImpl.setAreaDelinationTotalApprox(
				areaDelinationTotalApprox);
		}

		if (licenceExclusiveSpecial == null) {
			miningLeaseApplicationImpl.setLicenceExclusiveSpecial("");
		}
		else {
			miningLeaseApplicationImpl.setLicenceExclusiveSpecial(
				licenceExclusiveSpecial);
		}

		if (miningMineralsTypeVal == null) {
			miningLeaseApplicationImpl.setMiningMineralsTypeVal("");
		}
		else {
			miningLeaseApplicationImpl.setMiningMineralsTypeVal(
				miningMineralsTypeVal);
		}

		if (otherMineralBox == null) {
			miningLeaseApplicationImpl.setOtherMineralBox("");
		}
		else {
			miningLeaseApplicationImpl.setOtherMineralBox(otherMineralBox);
		}

		if (areaDelination == null) {
			miningLeaseApplicationImpl.setAreaDelination("");
		}
		else {
			miningLeaseApplicationImpl.setAreaDelination(areaDelination);
		}

		miningLeaseApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			miningLeaseApplicationImpl.setApplicationNumber("");
		}
		else {
			miningLeaseApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (prospRightsNum == null) {
			miningLeaseApplicationImpl.setProspRightsNum("");
		}
		else {
			miningLeaseApplicationImpl.setProspRightsNum(prospRightsNum);
		}

		if (prospLicenseNum == null) {
			miningLeaseApplicationImpl.setProspLicenseNum("");
		}
		else {
			miningLeaseApplicationImpl.setProspLicenseNum(prospLicenseNum);
		}

		if (expiredLicenseAppNumber == null) {
			miningLeaseApplicationImpl.setExpiredLicenseAppNumber("");
		}
		else {
			miningLeaseApplicationImpl.setExpiredLicenseAppNumber(
				expiredLicenseAppNumber);
		}

		if (caseId == null) {
			miningLeaseApplicationImpl.setCaseId("");
		}
		else {
			miningLeaseApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			miningLeaseApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			miningLeaseApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		miningLeaseApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			miningLeaseApplicationImpl.setAppCurrentStageName("");
		}
		else {
			miningLeaseApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		miningLeaseApplicationImpl.resetOriginalValues();

		return miningLeaseApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningLeaseApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		typeOfApplicant = objectInput.readUTF();
		prospectingRightNumber = objectInput.readUTF();
		typeOfProspectingLicence = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		areaDelinationTotalApprox = objectInput.readUTF();
		licenceExclusiveSpecial = objectInput.readUTF();
		miningMineralsTypeVal = objectInput.readUTF();
		otherMineralBox = objectInput.readUTF();
		areaDelination = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		prospRightsNum = objectInput.readUTF();
		prospLicenseNum = objectInput.readUTF();
		expiredLicenseAppNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningLeaseApplicationId);

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

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (prospectingRightNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prospectingRightNumber);
		}

		if (typeOfProspectingLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfProspectingLicence);
		}

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (areaDelinationTotalApprox == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areaDelinationTotalApprox);
		}

		if (licenceExclusiveSpecial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenceExclusiveSpecial);
		}

		if (miningMineralsTypeVal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(miningMineralsTypeVal);
		}

		if (otherMineralBox == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherMineralBox);
		}

		if (areaDelination == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areaDelination);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (prospRightsNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prospRightsNum);
		}

		if (prospLicenseNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prospLicenseNum);
		}

		if (expiredLicenseAppNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expiredLicenseAppNumber);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (icmDocumentsPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentsPath);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long miningLeaseApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String typeOfApplicant;
	public String prospectingRightNumber;
	public String typeOfProspectingLicence;
	public String typeOfTransaction;
	public String areaDelinationTotalApprox;
	public String licenceExclusiveSpecial;
	public String miningMineralsTypeVal;
	public String otherMineralBox;
	public String areaDelination;
	public int status;
	public String applicationNumber;
	public String prospRightsNum;
	public String prospLicenseNum;
	public String expiredLicenseAppNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}