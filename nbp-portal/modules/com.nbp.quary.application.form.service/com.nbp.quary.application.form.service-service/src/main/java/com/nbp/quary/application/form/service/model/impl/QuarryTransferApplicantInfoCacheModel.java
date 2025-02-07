/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryTransferApplicantInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryTransferApplicantInfoCacheModel
	implements CacheModel<QuarryTransferApplicantInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryTransferApplicantInfoCacheModel)) {
			return false;
		}

		QuarryTransferApplicantInfoCacheModel
			quarryTransferApplicantInfoCacheModel =
				(QuarryTransferApplicantInfoCacheModel)object;

		if (quarryTransferInfoId ==
				quarryTransferApplicantInfoCacheModel.quarryTransferInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, quarryTransferInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{quarryTransferInfoId=");
		sb.append(quarryTransferInfoId);
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
		sb.append(", transferCompanyName=");
		sb.append(transferCompanyName);
		sb.append(", transferLicenceNumber=");
		sb.append(transferLicenceNumber);
		sb.append(", transferLicenseLease=");
		sb.append(transferLicenseLease);
		sb.append(", transferLeaseReason=");
		sb.append(transferLeaseReason);
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", email=");
		sb.append(email);
		sb.append(", nationalityOfApplicant=");
		sb.append(nationalityOfApplicant);
		sb.append(", addressInJamaica=");
		sb.append(addressInJamaica);
		sb.append(", nameOfDirector=");
		sb.append(nameOfDirector);
		sb.append(", nationalityOfDirector=");
		sb.append(nationalityOfDirector);
		sb.append(", dateOfTransfer=");
		sb.append(dateOfTransfer);
		sb.append(", trnAndTcc=");
		sb.append(trnAndTcc);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryTransferApplicantInfo toEntityModel() {
		QuarryTransferApplicantInfoImpl quarryTransferApplicantInfoImpl =
			new QuarryTransferApplicantInfoImpl();

		quarryTransferApplicantInfoImpl.setQuarryTransferInfoId(
			quarryTransferInfoId);
		quarryTransferApplicantInfoImpl.setGroupId(groupId);
		quarryTransferApplicantInfoImpl.setCompanyId(companyId);
		quarryTransferApplicantInfoImpl.setUserId(userId);

		if (userName == null) {
			quarryTransferApplicantInfoImpl.setUserName("");
		}
		else {
			quarryTransferApplicantInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryTransferApplicantInfoImpl.setCreateDate(null);
		}
		else {
			quarryTransferApplicantInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryTransferApplicantInfoImpl.setModifiedDate(null);
		}
		else {
			quarryTransferApplicantInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (transferCompanyName == null) {
			quarryTransferApplicantInfoImpl.setTransferCompanyName("");
		}
		else {
			quarryTransferApplicantInfoImpl.setTransferCompanyName(
				transferCompanyName);
		}

		if (transferLicenceNumber == null) {
			quarryTransferApplicantInfoImpl.setTransferLicenceNumber("");
		}
		else {
			quarryTransferApplicantInfoImpl.setTransferLicenceNumber(
				transferLicenceNumber);
		}

		if (transferLicenseLease == null) {
			quarryTransferApplicantInfoImpl.setTransferLicenseLease("");
		}
		else {
			quarryTransferApplicantInfoImpl.setTransferLicenseLease(
				transferLicenseLease);
		}

		if (transferLeaseReason == null) {
			quarryTransferApplicantInfoImpl.setTransferLeaseReason("");
		}
		else {
			quarryTransferApplicantInfoImpl.setTransferLeaseReason(
				transferLeaseReason);
		}

		if (nameOfApplicant == null) {
			quarryTransferApplicantInfoImpl.setNameOfApplicant("");
		}
		else {
			quarryTransferApplicantInfoImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (telephone == null) {
			quarryTransferApplicantInfoImpl.setTelephone("");
		}
		else {
			quarryTransferApplicantInfoImpl.setTelephone(telephone);
		}

		if (email == null) {
			quarryTransferApplicantInfoImpl.setEmail("");
		}
		else {
			quarryTransferApplicantInfoImpl.setEmail(email);
		}

		if (nationalityOfApplicant == null) {
			quarryTransferApplicantInfoImpl.setNationalityOfApplicant("");
		}
		else {
			quarryTransferApplicantInfoImpl.setNationalityOfApplicant(
				nationalityOfApplicant);
		}

		if (addressInJamaica == null) {
			quarryTransferApplicantInfoImpl.setAddressInJamaica("");
		}
		else {
			quarryTransferApplicantInfoImpl.setAddressInJamaica(
				addressInJamaica);
		}

		if (nameOfDirector == null) {
			quarryTransferApplicantInfoImpl.setNameOfDirector("");
		}
		else {
			quarryTransferApplicantInfoImpl.setNameOfDirector(nameOfDirector);
		}

		if (nationalityOfDirector == null) {
			quarryTransferApplicantInfoImpl.setNationalityOfDirector("");
		}
		else {
			quarryTransferApplicantInfoImpl.setNationalityOfDirector(
				nationalityOfDirector);
		}

		if (dateOfTransfer == Long.MIN_VALUE) {
			quarryTransferApplicantInfoImpl.setDateOfTransfer(null);
		}
		else {
			quarryTransferApplicantInfoImpl.setDateOfTransfer(
				new Date(dateOfTransfer));
		}

		if (trnAndTcc == null) {
			quarryTransferApplicantInfoImpl.setTrnAndTcc("");
		}
		else {
			quarryTransferApplicantInfoImpl.setTrnAndTcc(trnAndTcc);
		}

		quarryTransferApplicantInfoImpl.setQuarryApplicationId(
			quarryApplicationId);

		quarryTransferApplicantInfoImpl.resetOriginalValues();

		return quarryTransferApplicantInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		quarryTransferInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		transferCompanyName = objectInput.readUTF();
		transferLicenceNumber = objectInput.readUTF();
		transferLicenseLease = objectInput.readUTF();
		transferLeaseReason = objectInput.readUTF();
		nameOfApplicant = objectInput.readUTF();
		telephone = objectInput.readUTF();
		email = objectInput.readUTF();
		nationalityOfApplicant = objectInput.readUTF();
		addressInJamaica = objectInput.readUTF();
		nameOfDirector = objectInput.readUTF();
		nationalityOfDirector = objectInput.readUTF();
		dateOfTransfer = objectInput.readLong();
		trnAndTcc = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(quarryTransferInfoId);

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

		if (transferCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferCompanyName);
		}

		if (transferLicenceNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferLicenceNumber);
		}

		if (transferLicenseLease == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferLicenseLease);
		}

		if (transferLeaseReason == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transferLeaseReason);
		}

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (telephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (nationalityOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationalityOfApplicant);
		}

		if (addressInJamaica == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressInJamaica);
		}

		if (nameOfDirector == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfDirector);
		}

		if (nationalityOfDirector == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nationalityOfDirector);
		}

		objectOutput.writeLong(dateOfTransfer);

		if (trnAndTcc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnAndTcc);
		}

		objectOutput.writeLong(quarryApplicationId);
	}

	public long quarryTransferInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String transferCompanyName;
	public String transferLicenceNumber;
	public String transferLicenseLease;
	public String transferLeaseReason;
	public String nameOfApplicant;
	public String telephone;
	public String email;
	public String nationalityOfApplicant;
	public String addressInJamaica;
	public String nameOfDirector;
	public String nationalityOfDirector;
	public long dateOfTransfer;
	public String trnAndTcc;
	public long quarryApplicationId;

}