/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningExclusiveLicFormFive;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningExclusiveLicFormFive in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningExclusiveLicFormFiveCacheModel
	implements CacheModel<MiningExclusiveLicFormFive>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningExclusiveLicFormFiveCacheModel)) {
			return false;
		}

		MiningExclusiveLicFormFiveCacheModel
			miningExclusiveLicFormFiveCacheModel =
				(MiningExclusiveLicFormFiveCacheModel)object;

		if (miningExclusiveLicFormFiveId ==
				miningExclusiveLicFormFiveCacheModel.
					miningExclusiveLicFormFiveId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningExclusiveLicFormFiveId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{miningExclusiveLicFormFiveId=");
		sb.append(miningExclusiveLicFormFiveId);
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
		sb.append(", applicantNameLicence=");
		sb.append(applicantNameLicence);
		sb.append(", trnNumberLicence=");
		sb.append(trnNumberLicence);
		sb.append(", applicantNationalityLicence=");
		sb.append(applicantNationalityLicence);
		sb.append(", applicantAddressLicence=");
		sb.append(applicantAddressLicence);
		sb.append(", applicantTelephoneLicence=");
		sb.append(applicantTelephoneLicence);
		sb.append(", applicantEmailLicence=");
		sb.append(applicantEmailLicence);
		sb.append(", applicantNumberLicence=");
		sb.append(applicantNumberLicence);
		sb.append(", agentNameLicence=");
		sb.append(agentNameLicence);
		sb.append(", numProspectingLicence=");
		sb.append(numProspectingLicence);
		sb.append(", agentNameLicenceGrant=");
		sb.append(agentNameLicenceGrant);
		sb.append(", applicantLicence=");
		sb.append(applicantLicence);
		sb.append(", justicePeaceParish=");
		sb.append(justicePeaceParish);
		sb.append(", applicantLandmarkLicence=");
		sb.append(applicantLandmarkLicence);
		sb.append(", applicantAreaLicence=");
		sb.append(applicantAreaLicence);
		sb.append(", applicantDesires=");
		sb.append(applicantDesires);
		sb.append(", dateLocationLic=");
		sb.append(dateLocationLic);
		sb.append(", incorporationLodged=");
		sb.append(incorporationLodged);
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningExclusiveLicFormFive toEntityModel() {
		MiningExclusiveLicFormFiveImpl miningExclusiveLicFormFiveImpl =
			new MiningExclusiveLicFormFiveImpl();

		miningExclusiveLicFormFiveImpl.setMiningExclusiveLicFormFiveId(
			miningExclusiveLicFormFiveId);
		miningExclusiveLicFormFiveImpl.setGroupId(groupId);
		miningExclusiveLicFormFiveImpl.setCompanyId(companyId);
		miningExclusiveLicFormFiveImpl.setUserId(userId);

		if (userName == null) {
			miningExclusiveLicFormFiveImpl.setUserName("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningExclusiveLicFormFiveImpl.setCreateDate(null);
		}
		else {
			miningExclusiveLicFormFiveImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningExclusiveLicFormFiveImpl.setModifiedDate(null);
		}
		else {
			miningExclusiveLicFormFiveImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantNameLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantNameLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantNameLicence(
				applicantNameLicence);
		}

		if (trnNumberLicence == null) {
			miningExclusiveLicFormFiveImpl.setTrnNumberLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setTrnNumberLicence(
				trnNumberLicence);
		}

		if (applicantNationalityLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantNationalityLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantNationalityLicence(
				applicantNationalityLicence);
		}

		if (applicantAddressLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantAddressLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantAddressLicence(
				applicantAddressLicence);
		}

		if (applicantTelephoneLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantTelephoneLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantTelephoneLicence(
				applicantTelephoneLicence);
		}

		if (applicantEmailLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantEmailLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantEmailLicence(
				applicantEmailLicence);
		}

		if (applicantNumberLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantNumberLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantNumberLicence(
				applicantNumberLicence);
		}

		if (agentNameLicence == null) {
			miningExclusiveLicFormFiveImpl.setAgentNameLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setAgentNameLicence(
				agentNameLicence);
		}

		if (numProspectingLicence == null) {
			miningExclusiveLicFormFiveImpl.setNumProspectingLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setNumProspectingLicence(
				numProspectingLicence);
		}

		if (agentNameLicenceGrant == null) {
			miningExclusiveLicFormFiveImpl.setAgentNameLicenceGrant("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setAgentNameLicenceGrant(
				agentNameLicenceGrant);
		}

		if (applicantLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantLicence(
				applicantLicence);
		}

		if (justicePeaceParish == null) {
			miningExclusiveLicFormFiveImpl.setJusticePeaceParish("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setJusticePeaceParish(
				justicePeaceParish);
		}

		if (applicantLandmarkLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantLandmarkLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantLandmarkLicence(
				applicantLandmarkLicence);
		}

		if (applicantAreaLicence == null) {
			miningExclusiveLicFormFiveImpl.setApplicantAreaLicence("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantAreaLicence(
				applicantAreaLicence);
		}

		if (applicantDesires == null) {
			miningExclusiveLicFormFiveImpl.setApplicantDesires("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setApplicantDesires(
				applicantDesires);
		}

		if (dateLocationLic == Long.MIN_VALUE) {
			miningExclusiveLicFormFiveImpl.setDateLocationLic(null);
		}
		else {
			miningExclusiveLicFormFiveImpl.setDateLocationLic(
				new Date(dateLocationLic));
		}

		if (incorporationLodged == null) {
			miningExclusiveLicFormFiveImpl.setIncorporationLodged("");
		}
		else {
			miningExclusiveLicFormFiveImpl.setIncorporationLodged(
				incorporationLodged);
		}

		miningExclusiveLicFormFiveImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningExclusiveLicFormFiveImpl.resetOriginalValues();

		return miningExclusiveLicFormFiveImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningExclusiveLicFormFiveId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantNameLicence = objectInput.readUTF();
		trnNumberLicence = objectInput.readUTF();
		applicantNationalityLicence = objectInput.readUTF();
		applicantAddressLicence = objectInput.readUTF();
		applicantTelephoneLicence = objectInput.readUTF();
		applicantEmailLicence = objectInput.readUTF();
		applicantNumberLicence = objectInput.readUTF();
		agentNameLicence = objectInput.readUTF();
		numProspectingLicence = objectInput.readUTF();
		agentNameLicenceGrant = objectInput.readUTF();
		applicantLicence = objectInput.readUTF();
		justicePeaceParish = objectInput.readUTF();
		applicantLandmarkLicence = objectInput.readUTF();
		applicantAreaLicence = objectInput.readUTF();
		applicantDesires = objectInput.readUTF();
		dateLocationLic = objectInput.readLong();
		incorporationLodged = objectInput.readUTF();

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningExclusiveLicFormFiveId);

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

		if (applicantNameLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNameLicence);
		}

		if (trnNumberLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNumberLicence);
		}

		if (applicantNationalityLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNationalityLicence);
		}

		if (applicantAddressLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAddressLicence);
		}

		if (applicantTelephoneLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantTelephoneLicence);
		}

		if (applicantEmailLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantEmailLicence);
		}

		if (applicantNumberLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantNumberLicence);
		}

		if (agentNameLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agentNameLicence);
		}

		if (numProspectingLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numProspectingLicence);
		}

		if (agentNameLicenceGrant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agentNameLicenceGrant);
		}

		if (applicantLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantLicence);
		}

		if (justicePeaceParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(justicePeaceParish);
		}

		if (applicantLandmarkLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantLandmarkLicence);
		}

		if (applicantAreaLicence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantAreaLicence);
		}

		if (applicantDesires == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantDesires);
		}

		objectOutput.writeLong(dateLocationLic);

		if (incorporationLodged == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(incorporationLodged);
		}

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public long miningExclusiveLicFormFiveId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantNameLicence;
	public String trnNumberLicence;
	public String applicantNationalityLicence;
	public String applicantAddressLicence;
	public String applicantTelephoneLicence;
	public String applicantEmailLicence;
	public String applicantNumberLicence;
	public String agentNameLicence;
	public String numProspectingLicence;
	public String agentNameLicenceGrant;
	public String applicantLicence;
	public String justicePeaceParish;
	public String applicantLandmarkLicence;
	public String applicantAreaLicence;
	public String applicantDesires;
	public long dateLocationLic;
	public String incorporationLodged;
	public long miningLeaseApplicationId;

}