/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.quary.application.form.service.model.QuarryApplicatntInformation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing QuarryApplicatntInformation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class QuarryApplicatntInformationCacheModel
	implements CacheModel<QuarryApplicatntInformation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryApplicatntInformationCacheModel)) {
			return false;
		}

		QuarryApplicatntInformationCacheModel
			quarryApplicatntInformationCacheModel =
				(QuarryApplicatntInformationCacheModel)object;

		if (auarryApplicantId ==
				quarryApplicatntInformationCacheModel.auarryApplicantId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, auarryApplicantId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{auarryApplicantId=");
		sb.append(auarryApplicantId);
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
		sb.append(", addressOfApplicant=");
		sb.append(addressOfApplicant);
		sb.append(", telephoneOfApplicant=");
		sb.append(telephoneOfApplicant);
		sb.append(", emailOfApplicant=");
		sb.append(emailOfApplicant);
		sb.append(", trnAndTcc=");
		sb.append(trnAndTcc);
		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public QuarryApplicatntInformation toEntityModel() {
		QuarryApplicatntInformationImpl quarryApplicatntInformationImpl =
			new QuarryApplicatntInformationImpl();

		quarryApplicatntInformationImpl.setAuarryApplicantId(auarryApplicantId);
		quarryApplicatntInformationImpl.setGroupId(groupId);
		quarryApplicatntInformationImpl.setCompanyId(companyId);
		quarryApplicatntInformationImpl.setUserId(userId);

		if (userName == null) {
			quarryApplicatntInformationImpl.setUserName("");
		}
		else {
			quarryApplicatntInformationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			quarryApplicatntInformationImpl.setCreateDate(null);
		}
		else {
			quarryApplicatntInformationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			quarryApplicatntInformationImpl.setModifiedDate(null);
		}
		else {
			quarryApplicatntInformationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nameOfApplicant == null) {
			quarryApplicatntInformationImpl.setNameOfApplicant("");
		}
		else {
			quarryApplicatntInformationImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (addressOfApplicant == null) {
			quarryApplicatntInformationImpl.setAddressOfApplicant("");
		}
		else {
			quarryApplicatntInformationImpl.setAddressOfApplicant(
				addressOfApplicant);
		}

		if (telephoneOfApplicant == null) {
			quarryApplicatntInformationImpl.setTelephoneOfApplicant("");
		}
		else {
			quarryApplicatntInformationImpl.setTelephoneOfApplicant(
				telephoneOfApplicant);
		}

		if (emailOfApplicant == null) {
			quarryApplicatntInformationImpl.setEmailOfApplicant("");
		}
		else {
			quarryApplicatntInformationImpl.setEmailOfApplicant(
				emailOfApplicant);
		}

		if (trnAndTcc == null) {
			quarryApplicatntInformationImpl.setTrnAndTcc("");
		}
		else {
			quarryApplicatntInformationImpl.setTrnAndTcc(trnAndTcc);
		}

		quarryApplicatntInformationImpl.setQuarryApplicationId(
			quarryApplicationId);

		quarryApplicatntInformationImpl.resetOriginalValues();

		return quarryApplicatntInformationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		auarryApplicantId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nameOfApplicant = objectInput.readUTF();
		addressOfApplicant = objectInput.readUTF();
		telephoneOfApplicant = objectInput.readUTF();
		emailOfApplicant = objectInput.readUTF();
		trnAndTcc = objectInput.readUTF();

		quarryApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(auarryApplicantId);

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

		if (addressOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressOfApplicant);
		}

		if (telephoneOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneOfApplicant);
		}

		if (emailOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailOfApplicant);
		}

		if (trnAndTcc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnAndTcc);
		}

		objectOutput.writeLong(quarryApplicationId);
	}

	public long auarryApplicantId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nameOfApplicant;
	public String addressOfApplicant;
	public String telephoneOfApplicant;
	public String emailOfApplicant;
	public String trnAndTcc;
	public long quarryApplicationId;

}