/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ogt.application.form.services.model.OgtClaimToSpouse;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OgtClaimToSpouse in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OgtClaimToSpouseCacheModel
	implements CacheModel<OgtClaimToSpouse>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OgtClaimToSpouseCacheModel)) {
			return false;
		}

		OgtClaimToSpouseCacheModel ogtClaimToSpouseCacheModel =
			(OgtClaimToSpouseCacheModel)object;

		if (ogtClaimToSpouseId ==
				ogtClaimToSpouseCacheModel.ogtClaimToSpouseId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ogtClaimToSpouseId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{ogtClaimToSpouseId=");
		sb.append(ogtClaimToSpouseId);
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
		sb.append(", spouseDate=");
		sb.append(spouseDate);
		sb.append(", claimSpouseDesc=");
		sb.append(claimSpouseDesc);
		sb.append(", nameCompletionForm=");
		sb.append(nameCompletionForm);
		sb.append(", nameCompletionDate=");
		sb.append(nameCompletionDate);
		sb.append(", compPersonAddress=");
		sb.append(compPersonAddress);
		sb.append(", justicePeaceParish=");
		sb.append(justicePeaceParish);
		sb.append(", nameJusticeOfPeace=");
		sb.append(nameJusticeOfPeace);
		sb.append(", nameJusticeDate=");
		sb.append(nameJusticeDate);
		sb.append(", officialAmtClaim=");
		sb.append(officialAmtClaim);
		sb.append(", officialSection=");
		sb.append(officialSection);
		sb.append(", officialAmtVoting=");
		sb.append(officialAmtVoting);
		sb.append(", officialAmtVotingDate=");
		sb.append(officialAmtVotingDate);
		sb.append(", officialPayment=");
		sb.append(officialPayment);
		sb.append(", officialPaymentDate=");
		sb.append(officialPaymentDate);
		sb.append(", ogtApplicationId=");
		sb.append(ogtApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OgtClaimToSpouse toEntityModel() {
		OgtClaimToSpouseImpl ogtClaimToSpouseImpl = new OgtClaimToSpouseImpl();

		ogtClaimToSpouseImpl.setOgtClaimToSpouseId(ogtClaimToSpouseId);
		ogtClaimToSpouseImpl.setGroupId(groupId);
		ogtClaimToSpouseImpl.setCompanyId(companyId);
		ogtClaimToSpouseImpl.setUserId(userId);

		if (userName == null) {
			ogtClaimToSpouseImpl.setUserName("");
		}
		else {
			ogtClaimToSpouseImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ogtClaimToSpouseImpl.setCreateDate(null);
		}
		else {
			ogtClaimToSpouseImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ogtClaimToSpouseImpl.setModifiedDate(null);
		}
		else {
			ogtClaimToSpouseImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (spouseDate == Long.MIN_VALUE) {
			ogtClaimToSpouseImpl.setSpouseDate(null);
		}
		else {
			ogtClaimToSpouseImpl.setSpouseDate(new Date(spouseDate));
		}

		if (claimSpouseDesc == null) {
			ogtClaimToSpouseImpl.setClaimSpouseDesc("");
		}
		else {
			ogtClaimToSpouseImpl.setClaimSpouseDesc(claimSpouseDesc);
		}

		if (nameCompletionForm == null) {
			ogtClaimToSpouseImpl.setNameCompletionForm("");
		}
		else {
			ogtClaimToSpouseImpl.setNameCompletionForm(nameCompletionForm);
		}

		if (nameCompletionDate == Long.MIN_VALUE) {
			ogtClaimToSpouseImpl.setNameCompletionDate(null);
		}
		else {
			ogtClaimToSpouseImpl.setNameCompletionDate(
				new Date(nameCompletionDate));
		}

		if (compPersonAddress == null) {
			ogtClaimToSpouseImpl.setCompPersonAddress("");
		}
		else {
			ogtClaimToSpouseImpl.setCompPersonAddress(compPersonAddress);
		}

		if (justicePeaceParish == null) {
			ogtClaimToSpouseImpl.setJusticePeaceParish("");
		}
		else {
			ogtClaimToSpouseImpl.setJusticePeaceParish(justicePeaceParish);
		}

		if (nameJusticeOfPeace == null) {
			ogtClaimToSpouseImpl.setNameJusticeOfPeace("");
		}
		else {
			ogtClaimToSpouseImpl.setNameJusticeOfPeace(nameJusticeOfPeace);
		}

		if (nameJusticeDate == Long.MIN_VALUE) {
			ogtClaimToSpouseImpl.setNameJusticeDate(null);
		}
		else {
			ogtClaimToSpouseImpl.setNameJusticeDate(new Date(nameJusticeDate));
		}

		if (officialAmtClaim == null) {
			ogtClaimToSpouseImpl.setOfficialAmtClaim("");
		}
		else {
			ogtClaimToSpouseImpl.setOfficialAmtClaim(officialAmtClaim);
		}

		if (officialSection == null) {
			ogtClaimToSpouseImpl.setOfficialSection("");
		}
		else {
			ogtClaimToSpouseImpl.setOfficialSection(officialSection);
		}

		if (officialAmtVoting == null) {
			ogtClaimToSpouseImpl.setOfficialAmtVoting("");
		}
		else {
			ogtClaimToSpouseImpl.setOfficialAmtVoting(officialAmtVoting);
		}

		if (officialAmtVotingDate == Long.MIN_VALUE) {
			ogtClaimToSpouseImpl.setOfficialAmtVotingDate(null);
		}
		else {
			ogtClaimToSpouseImpl.setOfficialAmtVotingDate(
				new Date(officialAmtVotingDate));
		}

		if (officialPayment == null) {
			ogtClaimToSpouseImpl.setOfficialPayment("");
		}
		else {
			ogtClaimToSpouseImpl.setOfficialPayment(officialPayment);
		}

		if (officialPaymentDate == Long.MIN_VALUE) {
			ogtClaimToSpouseImpl.setOfficialPaymentDate(null);
		}
		else {
			ogtClaimToSpouseImpl.setOfficialPaymentDate(
				new Date(officialPaymentDate));
		}

		ogtClaimToSpouseImpl.setOgtApplicationId(ogtApplicationId);

		ogtClaimToSpouseImpl.resetOriginalValues();

		return ogtClaimToSpouseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ogtClaimToSpouseId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		spouseDate = objectInput.readLong();
		claimSpouseDesc = objectInput.readUTF();
		nameCompletionForm = objectInput.readUTF();
		nameCompletionDate = objectInput.readLong();
		compPersonAddress = objectInput.readUTF();
		justicePeaceParish = objectInput.readUTF();
		nameJusticeOfPeace = objectInput.readUTF();
		nameJusticeDate = objectInput.readLong();
		officialAmtClaim = objectInput.readUTF();
		officialSection = objectInput.readUTF();
		officialAmtVoting = objectInput.readUTF();
		officialAmtVotingDate = objectInput.readLong();
		officialPayment = objectInput.readUTF();
		officialPaymentDate = objectInput.readLong();

		ogtApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ogtClaimToSpouseId);

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
		objectOutput.writeLong(spouseDate);

		if (claimSpouseDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(claimSpouseDesc);
		}

		if (nameCompletionForm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameCompletionForm);
		}

		objectOutput.writeLong(nameCompletionDate);

		if (compPersonAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(compPersonAddress);
		}

		if (justicePeaceParish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(justicePeaceParish);
		}

		if (nameJusticeOfPeace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameJusticeOfPeace);
		}

		objectOutput.writeLong(nameJusticeDate);

		if (officialAmtClaim == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officialAmtClaim);
		}

		if (officialSection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officialSection);
		}

		if (officialAmtVoting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officialAmtVoting);
		}

		objectOutput.writeLong(officialAmtVotingDate);

		if (officialPayment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officialPayment);
		}

		objectOutput.writeLong(officialPaymentDate);

		objectOutput.writeLong(ogtApplicationId);
	}

	public long ogtClaimToSpouseId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long spouseDate;
	public String claimSpouseDesc;
	public String nameCompletionForm;
	public long nameCompletionDate;
	public String compPersonAddress;
	public String justicePeaceParish;
	public String nameJusticeOfPeace;
	public long nameJusticeDate;
	public String officialAmtClaim;
	public String officialSection;
	public String officialAmtVoting;
	public long officialAmtVotingDate;
	public String officialPayment;
	public long officialPaymentDate;
	public long ogtApplicationId;

}