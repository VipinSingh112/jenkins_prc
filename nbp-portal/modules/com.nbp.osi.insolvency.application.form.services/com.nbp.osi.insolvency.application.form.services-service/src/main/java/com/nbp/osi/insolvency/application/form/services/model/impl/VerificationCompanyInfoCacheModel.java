/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.VerificationCompanyInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VerificationCompanyInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VerificationCompanyInfoCacheModel
	implements CacheModel<VerificationCompanyInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VerificationCompanyInfoCacheModel)) {
			return false;
		}

		VerificationCompanyInfoCacheModel verificationCompanyInfoCacheModel =
			(VerificationCompanyInfoCacheModel)object;

		if (verificationCompanyInfoId ==
				verificationCompanyInfoCacheModel.verificationCompanyInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, verificationCompanyInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{verificationCompanyInfoId=");
		sb.append(verificationCompanyInfoId);
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
		sb.append(", verComName=");
		sb.append(verComName);
		sb.append(", verComTrn=");
		sb.append(verComTrn);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VerificationCompanyInfo toEntityModel() {
		VerificationCompanyInfoImpl verificationCompanyInfoImpl =
			new VerificationCompanyInfoImpl();

		verificationCompanyInfoImpl.setVerificationCompanyInfoId(
			verificationCompanyInfoId);
		verificationCompanyInfoImpl.setGroupId(groupId);
		verificationCompanyInfoImpl.setCompanyId(companyId);
		verificationCompanyInfoImpl.setUserId(userId);

		if (userName == null) {
			verificationCompanyInfoImpl.setUserName("");
		}
		else {
			verificationCompanyInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			verificationCompanyInfoImpl.setCreateDate(null);
		}
		else {
			verificationCompanyInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			verificationCompanyInfoImpl.setModifiedDate(null);
		}
		else {
			verificationCompanyInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (verComName == null) {
			verificationCompanyInfoImpl.setVerComName("");
		}
		else {
			verificationCompanyInfoImpl.setVerComName(verComName);
		}

		if (verComTrn == null) {
			verificationCompanyInfoImpl.setVerComTrn("");
		}
		else {
			verificationCompanyInfoImpl.setVerComTrn(verComTrn);
		}

		verificationCompanyInfoImpl.setOsiInsolvencyId(osiInsolvencyId);

		verificationCompanyInfoImpl.resetOriginalValues();

		return verificationCompanyInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		verificationCompanyInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		verComName = objectInput.readUTF();
		verComTrn = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(verificationCompanyInfoId);

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

		if (verComName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verComName);
		}

		if (verComTrn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(verComTrn);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long verificationCompanyInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String verComName;
	public String verComTrn;
	public long osiInsolvencyId;

}