/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeCompanyDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeCompanyDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeCompanyDetailsCacheModel
	implements CacheModel<CreativeCompanyDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeCompanyDetailsCacheModel)) {
			return false;
		}

		CreativeCompanyDetailsCacheModel creativeCompanyDetailsCacheModel =
			(CreativeCompanyDetailsCacheModel)object;

		if (creativeCompanyDetailsId ==
				creativeCompanyDetailsCacheModel.creativeCompanyDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeCompanyDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{creativeCompanyDetailsId=");
		sb.append(creativeCompanyDetailsId);
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
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", companyBusinessRegistrationNo=");
		sb.append(companyBusinessRegistrationNo);
		sb.append(", dateOfCompanyRegistration=");
		sb.append(dateOfCompanyRegistration);
		sb.append(", companyTrn=");
		sb.append(companyTrn);
		sb.append(", companyTcc=");
		sb.append(companyTcc);
		sb.append(", companyProfile=");
		sb.append(companyProfile);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeCompanyDetails toEntityModel() {
		CreativeCompanyDetailsImpl creativeCompanyDetailsImpl =
			new CreativeCompanyDetailsImpl();

		creativeCompanyDetailsImpl.setCreativeCompanyDetailsId(
			creativeCompanyDetailsId);
		creativeCompanyDetailsImpl.setGroupId(groupId);
		creativeCompanyDetailsImpl.setCompanyId(companyId);
		creativeCompanyDetailsImpl.setUserId(userId);

		if (userName == null) {
			creativeCompanyDetailsImpl.setUserName("");
		}
		else {
			creativeCompanyDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeCompanyDetailsImpl.setCreateDate(null);
		}
		else {
			creativeCompanyDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeCompanyDetailsImpl.setModifiedDate(null);
		}
		else {
			creativeCompanyDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyName == null) {
			creativeCompanyDetailsImpl.setCompanyName("");
		}
		else {
			creativeCompanyDetailsImpl.setCompanyName(companyName);
		}

		if (companyBusinessRegistrationNo == null) {
			creativeCompanyDetailsImpl.setCompanyBusinessRegistrationNo("");
		}
		else {
			creativeCompanyDetailsImpl.setCompanyBusinessRegistrationNo(
				companyBusinessRegistrationNo);
		}

		if (dateOfCompanyRegistration == Long.MIN_VALUE) {
			creativeCompanyDetailsImpl.setDateOfCompanyRegistration(null);
		}
		else {
			creativeCompanyDetailsImpl.setDateOfCompanyRegistration(
				new Date(dateOfCompanyRegistration));
		}

		if (companyTrn == null) {
			creativeCompanyDetailsImpl.setCompanyTrn("");
		}
		else {
			creativeCompanyDetailsImpl.setCompanyTrn(companyTrn);
		}

		if (companyTcc == null) {
			creativeCompanyDetailsImpl.setCompanyTcc("");
		}
		else {
			creativeCompanyDetailsImpl.setCompanyTcc(companyTcc);
		}

		if (companyProfile == null) {
			creativeCompanyDetailsImpl.setCompanyProfile("");
		}
		else {
			creativeCompanyDetailsImpl.setCompanyProfile(companyProfile);
		}

		creativeCompanyDetailsImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeCompanyDetailsImpl.resetOriginalValues();

		return creativeCompanyDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeCompanyDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyName = objectInput.readUTF();
		companyBusinessRegistrationNo = objectInput.readUTF();
		dateOfCompanyRegistration = objectInput.readLong();
		companyTrn = objectInput.readUTF();
		companyTcc = objectInput.readUTF();
		companyProfile = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeCompanyDetailsId);

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

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (companyBusinessRegistrationNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyBusinessRegistrationNo);
		}

		objectOutput.writeLong(dateOfCompanyRegistration);

		if (companyTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTrn);
		}

		if (companyTcc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyTcc);
		}

		if (companyProfile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyProfile);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeCompanyDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyName;
	public String companyBusinessRegistrationNo;
	public long dateOfCompanyRegistration;
	public String companyTrn;
	public String companyTcc;
	public String companyProfile;
	public long CreativeApplicationId;

}