/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryGeneralInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryGeneralInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryGeneralInformationCacheModel
	implements CacheModel<QuarryGeneralInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryGeneralInformationCacheModel)) {
			return false;
		}

		QuarryGeneralInformationCacheModel quarryGeneralInformationCacheModel =
			(QuarryGeneralInformationCacheModel)object;

		if (generalInfoId == quarryGeneralInformationCacheModel.generalInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, generalInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{generalInfoId=");
		sb.append(generalInfoId);
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
		sb.append(", proposedNumberOfEmploy=");
		sb.append(proposedNumberOfEmploy);
		sb.append(", nonRefundableFee=");
		sb.append(nonRefundableFee);
		sb.append(", convictedUnderQuarryLaw=");
		sb.append(convictedUnderQuarryLaw);
		sb.append(", giveDetails=");
		sb.append(giveDetails);
		sb.append(", licenseRefused=");
		sb.append(licenseRefused);
		sb.append(", dateOfSignature=");
		sb.append(dateOfSignature);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryGeneralInformation toEntityModel() {
		QuarryGeneralInformationImpl quarryGeneralInformationImpl =
			new QuarryGeneralInformationImpl();

		quarryGeneralInformationImpl.setGeneralInfoId(generalInfoId);
		quarryGeneralInformationImpl.setGroupId(groupId);
		quarryGeneralInformationImpl.setCompanyId(companyId);
		quarryGeneralInformationImpl.setUserId(userId);

		if (userName == null) {
			quarryGeneralInformationImpl.setUserName("");
		}
		else {
			quarryGeneralInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryGeneralInformationImpl.setCreateDate(null);
		}
		else {
			quarryGeneralInformationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryGeneralInformationImpl.setModifiedDate(null);
		}
		else {
			quarryGeneralInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (proposedNumberOfEmploy == null) {
			quarryGeneralInformationImpl.setProposedNumberOfEmploy("");
		}
		else {
			quarryGeneralInformationImpl.setProposedNumberOfEmploy(
				proposedNumberOfEmploy);
		}

		if (nonRefundableFee == null) {
			quarryGeneralInformationImpl.setNonRefundableFee("");
		}
		else {
			quarryGeneralInformationImpl.setNonRefundableFee(nonRefundableFee);
		}

		if (convictedUnderQuarryLaw == null) {
			quarryGeneralInformationImpl.setConvictedUnderQuarryLaw("");
		}
		else {
			quarryGeneralInformationImpl.setConvictedUnderQuarryLaw(
				convictedUnderQuarryLaw);
		}

		if (giveDetails == null) {
			quarryGeneralInformationImpl.setGiveDetails("");
		}
		else {
			quarryGeneralInformationImpl.setGiveDetails(giveDetails);
		}

		if (licenseRefused == null) {
			quarryGeneralInformationImpl.setLicenseRefused("");
		}
		else {
			quarryGeneralInformationImpl.setLicenseRefused(licenseRefused);
		}

		if (dateOfSignature == Long.MIN_VALUE) {
			quarryGeneralInformationImpl.setDateOfSignature(null);
		}
		else {
			quarryGeneralInformationImpl.setDateOfSignature(
				new Date(dateOfSignature));
		}

		quarryGeneralInformationImpl.setQuarryApplicationId(
			quarryApplicationId);

		quarryGeneralInformationImpl.resetOriginalValues();

		return quarryGeneralInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		generalInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		proposedNumberOfEmploy = objectInput.readUTF();
		nonRefundableFee = objectInput.readUTF();
		convictedUnderQuarryLaw = objectInput.readUTF();
		giveDetails = objectInput.readUTF();
		licenseRefused = objectInput.readUTF();
		dateOfSignature = objectInput.readLong();

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(generalInfoId);

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

		if (proposedNumberOfEmploy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proposedNumberOfEmploy);
		}

		if (nonRefundableFee == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonRefundableFee);
		}

		if (convictedUnderQuarryLaw == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(convictedUnderQuarryLaw);
		}

		if (giveDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(giveDetails);
		}

		if (licenseRefused == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseRefused);
		}

		objectOutput.writeLong(dateOfSignature);

		objectOutput.writeLong(quarryApplicationId);
	}

	public long generalInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String proposedNumberOfEmploy;
	public String nonRefundableFee;
	public String convictedUnderQuarryLaw;
	public String giveDetails;
	public String licenseRefused;
	public long dateOfSignature;
	public long quarryApplicationId;

}