/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningProspectingRights;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningProspectingRights in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningProspectingRightsCacheModel
	implements CacheModel<MiningProspectingRights>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningProspectingRightsCacheModel)) {
			return false;
		}

		MiningProspectingRightsCacheModel miningProspectingRightsCacheModel =
			(MiningProspectingRightsCacheModel)object;

		if (prospectingRightsId ==
				miningProspectingRightsCacheModel.prospectingRightsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, prospectingRightsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{prospectingRightsId=");
		sb.append(prospectingRightsId);
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
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", trnNum=");
		sb.append(trnNum);
		sb.append(", nationalityOfApplicant=");
		sb.append(nationalityOfApplicant);
		sb.append(", ageOfApplicant=");
		sb.append(ageOfApplicant);
		sb.append(", telephoneNum=");
		sb.append(telephoneNum);
		sb.append(", emailAddr=");
		sb.append(emailAddr);
		sb.append(", addressInJamaica=");
		sb.append(addressInJamaica);
		sb.append(", applicantProspectAcc=");
		sb.append(applicantProspectAcc);
		sb.append(", otherPersonName=");
		sb.append(otherPersonName);
		sb.append(", otherPersonAddr=");
		sb.append(otherPersonAddr);
		sb.append(", prevApplication=");
		sb.append(prevApplication);
		sb.append(", offenceMiningAct=");
		sb.append(offenceMiningAct);
		sb.append(", validProspectRight=");
		sb.append(validProspectRight);
		sb.append(", surrenderProspectRight=");
		sb.append(surrenderProspectRight);
		sb.append(", prospectRightsFeeCheck=");
		sb.append(prospectRightsFeeCheck);
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningProspectingRights toEntityModel() {
		MiningProspectingRightsImpl miningProspectingRightsImpl =
			new MiningProspectingRightsImpl();

		miningProspectingRightsImpl.setProspectingRightsId(prospectingRightsId);
		miningProspectingRightsImpl.setGroupId(groupId);
		miningProspectingRightsImpl.setCompanyId(companyId);
		miningProspectingRightsImpl.setUserId(userId);

		if (userName == null) {
			miningProspectingRightsImpl.setUserName("");
		}
		else {
			miningProspectingRightsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningProspectingRightsImpl.setCreateDate(null);
		}
		else {
			miningProspectingRightsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningProspectingRightsImpl.setModifiedDate(null);
		}
		else {
			miningProspectingRightsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nameOfApplicant == null) {
			miningProspectingRightsImpl.setNameOfApplicant("");
		}
		else {
			miningProspectingRightsImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (trnNum == null) {
			miningProspectingRightsImpl.setTrnNum("");
		}
		else {
			miningProspectingRightsImpl.setTrnNum(trnNum);
		}

		if (nationalityOfApplicant == null) {
			miningProspectingRightsImpl.setNationalityOfApplicant("");
		}
		else {
			miningProspectingRightsImpl.setNationalityOfApplicant(
				nationalityOfApplicant);
		}

		if (ageOfApplicant == null) {
			miningProspectingRightsImpl.setAgeOfApplicant("");
		}
		else {
			miningProspectingRightsImpl.setAgeOfApplicant(ageOfApplicant);
		}

		if (telephoneNum == null) {
			miningProspectingRightsImpl.setTelephoneNum("");
		}
		else {
			miningProspectingRightsImpl.setTelephoneNum(telephoneNum);
		}

		if (emailAddr == null) {
			miningProspectingRightsImpl.setEmailAddr("");
		}
		else {
			miningProspectingRightsImpl.setEmailAddr(emailAddr);
		}

		if (addressInJamaica == null) {
			miningProspectingRightsImpl.setAddressInJamaica("");
		}
		else {
			miningProspectingRightsImpl.setAddressInJamaica(addressInJamaica);
		}

		if (applicantProspectAcc == null) {
			miningProspectingRightsImpl.setApplicantProspectAcc("");
		}
		else {
			miningProspectingRightsImpl.setApplicantProspectAcc(
				applicantProspectAcc);
		}

		if (otherPersonName == null) {
			miningProspectingRightsImpl.setOtherPersonName("");
		}
		else {
			miningProspectingRightsImpl.setOtherPersonName(otherPersonName);
		}

		if (otherPersonAddr == null) {
			miningProspectingRightsImpl.setOtherPersonAddr("");
		}
		else {
			miningProspectingRightsImpl.setOtherPersonAddr(otherPersonAddr);
		}

		if (prevApplication == null) {
			miningProspectingRightsImpl.setPrevApplication("");
		}
		else {
			miningProspectingRightsImpl.setPrevApplication(prevApplication);
		}

		if (offenceMiningAct == null) {
			miningProspectingRightsImpl.setOffenceMiningAct("");
		}
		else {
			miningProspectingRightsImpl.setOffenceMiningAct(offenceMiningAct);
		}

		if (validProspectRight == null) {
			miningProspectingRightsImpl.setValidProspectRight("");
		}
		else {
			miningProspectingRightsImpl.setValidProspectRight(
				validProspectRight);
		}

		if (surrenderProspectRight == null) {
			miningProspectingRightsImpl.setSurrenderProspectRight("");
		}
		else {
			miningProspectingRightsImpl.setSurrenderProspectRight(
				surrenderProspectRight);
		}

		if (prospectRightsFeeCheck == null) {
			miningProspectingRightsImpl.setProspectRightsFeeCheck("");
		}
		else {
			miningProspectingRightsImpl.setProspectRightsFeeCheck(
				prospectRightsFeeCheck);
		}

		miningProspectingRightsImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningProspectingRightsImpl.resetOriginalValues();

		return miningProspectingRightsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		prospectingRightsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfApplicant = objectInput.readUTF();
		trnNum = objectInput.readUTF();
		nationalityOfApplicant = objectInput.readUTF();
		ageOfApplicant = objectInput.readUTF();
		telephoneNum = objectInput.readUTF();
		emailAddr = objectInput.readUTF();
		addressInJamaica = objectInput.readUTF();
		applicantProspectAcc = objectInput.readUTF();
		otherPersonName = objectInput.readUTF();
		otherPersonAddr = objectInput.readUTF();
		prevApplication = objectInput.readUTF();
		offenceMiningAct = objectInput.readUTF();
		validProspectRight = objectInput.readUTF();
		surrenderProspectRight = objectInput.readUTF();
		prospectRightsFeeCheck = objectInput.readUTF();

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(prospectingRightsId);

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

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (trnNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNum);
		}

		if (nationalityOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationalityOfApplicant);
		}

		if (ageOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ageOfApplicant);
		}

		if (telephoneNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNum);
		}

		if (emailAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailAddr);
		}

		if (addressInJamaica == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressInJamaica);
		}

		if (applicantProspectAcc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantProspectAcc);
		}

		if (otherPersonName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherPersonName);
		}

		if (otherPersonAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherPersonAddr);
		}

		if (prevApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prevApplication);
		}

		if (offenceMiningAct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(offenceMiningAct);
		}

		if (validProspectRight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(validProspectRight);
		}

		if (surrenderProspectRight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surrenderProspectRight);
		}

		if (prospectRightsFeeCheck == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prospectRightsFeeCheck);
		}

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public long prospectingRightsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfApplicant;
	public String trnNum;
	public String nationalityOfApplicant;
	public String ageOfApplicant;
	public String telephoneNum;
	public String emailAddr;
	public String addressInJamaica;
	public String applicantProspectAcc;
	public String otherPersonName;
	public String otherPersonAddr;
	public String prevApplication;
	public String offenceMiningAct;
	public String validProspectRight;
	public String surrenderProspectRight;
	public String prospectRightsFeeCheck;
	public long miningLeaseApplicationId;

}