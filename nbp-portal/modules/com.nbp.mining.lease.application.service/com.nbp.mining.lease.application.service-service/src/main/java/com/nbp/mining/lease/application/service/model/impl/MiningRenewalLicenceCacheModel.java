/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiningRenewalLicence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiningRenewalLicenceCacheModel
	implements CacheModel<MiningRenewalLicence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiningRenewalLicenceCacheModel)) {
			return false;
		}

		MiningRenewalLicenceCacheModel miningRenewalLicenceCacheModel =
			(MiningRenewalLicenceCacheModel)object;

		if (miningRenewalLicenceId ==
				miningRenewalLicenceCacheModel.miningRenewalLicenceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miningRenewalLicenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{miningRenewalLicenceId=");
		sb.append(miningRenewalLicenceId);
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
		sb.append(", renewApplicantName=");
		sb.append(renewApplicantName);
		sb.append(", renewTrnNum=");
		sb.append(renewTrnNum);
		sb.append(", renewApplicantLicNum=");
		sb.append(renewApplicantLicNum);
		sb.append(", stateWhetherRenewIs=");
		sb.append(stateWhetherRenewIs);
		sb.append(", renewTelephone=");
		sb.append(renewTelephone);
		sb.append(", renewEmailAddr=");
		sb.append(renewEmailAddr);
		sb.append(", renewNumOfApplicantLease=");
		sb.append(renewNumOfApplicantLease);
		sb.append(", renApplicantDesireToMine=");
		sb.append(renApplicantDesireToMine);
		sb.append(", renewTermDesired=");
		sb.append(renewTermDesired);
		sb.append(", renewFeeCheck=");
		sb.append(renewFeeCheck);
		sb.append(", renewDate=");
		sb.append(renewDate);
		sb.append(", miningLeaseApplicationId=");
		sb.append(miningLeaseApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiningRenewalLicence toEntityModel() {
		MiningRenewalLicenceImpl miningRenewalLicenceImpl =
			new MiningRenewalLicenceImpl();

		miningRenewalLicenceImpl.setMiningRenewalLicenceId(
			miningRenewalLicenceId);
		miningRenewalLicenceImpl.setGroupId(groupId);
		miningRenewalLicenceImpl.setCompanyId(companyId);
		miningRenewalLicenceImpl.setUserId(userId);

		if (userName == null) {
			miningRenewalLicenceImpl.setUserName("");
		}
		else {
			miningRenewalLicenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miningRenewalLicenceImpl.setCreateDate(null);
		}
		else {
			miningRenewalLicenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miningRenewalLicenceImpl.setModifiedDate(null);
		}
		else {
			miningRenewalLicenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (renewApplicantName == null) {
			miningRenewalLicenceImpl.setRenewApplicantName("");
		}
		else {
			miningRenewalLicenceImpl.setRenewApplicantName(renewApplicantName);
		}

		if (renewTrnNum == null) {
			miningRenewalLicenceImpl.setRenewTrnNum("");
		}
		else {
			miningRenewalLicenceImpl.setRenewTrnNum(renewTrnNum);
		}

		if (renewApplicantLicNum == null) {
			miningRenewalLicenceImpl.setRenewApplicantLicNum("");
		}
		else {
			miningRenewalLicenceImpl.setRenewApplicantLicNum(
				renewApplicantLicNum);
		}

		if (stateWhetherRenewIs == null) {
			miningRenewalLicenceImpl.setStateWhetherRenewIs("");
		}
		else {
			miningRenewalLicenceImpl.setStateWhetherRenewIs(
				stateWhetherRenewIs);
		}

		if (renewTelephone == null) {
			miningRenewalLicenceImpl.setRenewTelephone("");
		}
		else {
			miningRenewalLicenceImpl.setRenewTelephone(renewTelephone);
		}

		if (renewEmailAddr == null) {
			miningRenewalLicenceImpl.setRenewEmailAddr("");
		}
		else {
			miningRenewalLicenceImpl.setRenewEmailAddr(renewEmailAddr);
		}

		if (renewNumOfApplicantLease == null) {
			miningRenewalLicenceImpl.setRenewNumOfApplicantLease("");
		}
		else {
			miningRenewalLicenceImpl.setRenewNumOfApplicantLease(
				renewNumOfApplicantLease);
		}

		if (renApplicantDesireToMine == null) {
			miningRenewalLicenceImpl.setRenApplicantDesireToMine("");
		}
		else {
			miningRenewalLicenceImpl.setRenApplicantDesireToMine(
				renApplicantDesireToMine);
		}

		if (renewTermDesired == null) {
			miningRenewalLicenceImpl.setRenewTermDesired("");
		}
		else {
			miningRenewalLicenceImpl.setRenewTermDesired(renewTermDesired);
		}

		if (renewFeeCheck == null) {
			miningRenewalLicenceImpl.setRenewFeeCheck("");
		}
		else {
			miningRenewalLicenceImpl.setRenewFeeCheck(renewFeeCheck);
		}

		if (renewDate == Long.MIN_VALUE) {
			miningRenewalLicenceImpl.setRenewDate(null);
		}
		else {
			miningRenewalLicenceImpl.setRenewDate(new Date(renewDate));
		}

		miningRenewalLicenceImpl.setMiningLeaseApplicationId(
			miningLeaseApplicationId);

		miningRenewalLicenceImpl.resetOriginalValues();

		return miningRenewalLicenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miningRenewalLicenceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		renewApplicantName = objectInput.readUTF();
		renewTrnNum = objectInput.readUTF();
		renewApplicantLicNum = objectInput.readUTF();
		stateWhetherRenewIs = objectInput.readUTF();
		renewTelephone = objectInput.readUTF();
		renewEmailAddr = objectInput.readUTF();
		renewNumOfApplicantLease = objectInput.readUTF();
		renApplicantDesireToMine = objectInput.readUTF();
		renewTermDesired = objectInput.readUTF();
		renewFeeCheck = objectInput.readUTF();
		renewDate = objectInput.readLong();

		miningLeaseApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miningRenewalLicenceId);

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

		if (renewApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewApplicantName);
		}

		if (renewTrnNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewTrnNum);
		}

		if (renewApplicantLicNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewApplicantLicNum);
		}

		if (stateWhetherRenewIs == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stateWhetherRenewIs);
		}

		if (renewTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewTelephone);
		}

		if (renewEmailAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewEmailAddr);
		}

		if (renewNumOfApplicantLease == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewNumOfApplicantLease);
		}

		if (renApplicantDesireToMine == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renApplicantDesireToMine);
		}

		if (renewTermDesired == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewTermDesired);
		}

		if (renewFeeCheck == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(renewFeeCheck);
		}

		objectOutput.writeLong(renewDate);

		objectOutput.writeLong(miningLeaseApplicationId);
	}

	public long miningRenewalLicenceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String renewApplicantName;
	public String renewTrnNum;
	public String renewApplicantLicNum;
	public String stateWhetherRenewIs;
	public String renewTelephone;
	public String renewEmailAddr;
	public String renewNumOfApplicantLease;
	public String renApplicantDesireToMine;
	public String renewTermDesired;
	public String renewFeeCheck;
	public long renewDate;
	public long miningLeaseApplicationId;

}