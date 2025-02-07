/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ManuInternationalCertificate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManuInternationalCertificate in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuInternationalCertificateCacheModel
	implements CacheModel<ManuInternationalCertificate>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuInternationalCertificateCacheModel)) {
			return false;
		}

		ManuInternationalCertificateCacheModel
			manuInternationalCertificateCacheModel =
				(ManuInternationalCertificateCacheModel)object;

		if (manuInternationalCertificateId ==
				manuInternationalCertificateCacheModel.
					manuInternationalCertificateId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manuInternationalCertificateId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{manuInternationalCertificateId=");
		sb.append(manuInternationalCertificateId);
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
		sb.append(", companyCertified=");
		sb.append(companyCertified);
		sb.append(", other=");
		sb.append(other);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManuInternationalCertificate toEntityModel() {
		ManuInternationalCertificateImpl manuInternationalCertificateImpl =
			new ManuInternationalCertificateImpl();

		manuInternationalCertificateImpl.setManuInternationalCertificateId(
			manuInternationalCertificateId);
		manuInternationalCertificateImpl.setGroupId(groupId);
		manuInternationalCertificateImpl.setCompanyId(companyId);
		manuInternationalCertificateImpl.setUserId(userId);

		if (userName == null) {
			manuInternationalCertificateImpl.setUserName("");
		}
		else {
			manuInternationalCertificateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manuInternationalCertificateImpl.setCreateDate(null);
		}
		else {
			manuInternationalCertificateImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manuInternationalCertificateImpl.setModifiedDate(null);
		}
		else {
			manuInternationalCertificateImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (companyCertified == null) {
			manuInternationalCertificateImpl.setCompanyCertified("");
		}
		else {
			manuInternationalCertificateImpl.setCompanyCertified(
				companyCertified);
		}

		if (other == null) {
			manuInternationalCertificateImpl.setOther("");
		}
		else {
			manuInternationalCertificateImpl.setOther(other);
		}

		manuInternationalCertificateImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		manuInternationalCertificateImpl.resetOriginalValues();

		return manuInternationalCertificateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manuInternationalCertificateId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyCertified = objectInput.readUTF();
		other = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manuInternationalCertificateId);

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

		if (companyCertified == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyCertified);
		}

		if (other == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(other);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long manuInternationalCertificateId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyCertified;
	public String other;
	public long manufacturingApplicationId;

}