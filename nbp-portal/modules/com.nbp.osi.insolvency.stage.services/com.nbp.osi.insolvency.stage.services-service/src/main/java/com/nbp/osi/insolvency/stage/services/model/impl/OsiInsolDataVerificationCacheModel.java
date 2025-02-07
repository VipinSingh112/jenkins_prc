/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolDataVerification in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolDataVerificationCacheModel
	implements CacheModel<OsiInsolDataVerification>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolDataVerificationCacheModel)) {
			return false;
		}

		OsiInsolDataVerificationCacheModel osiInsolDataVerificationCacheModel =
			(OsiInsolDataVerificationCacheModel)object;

		if (osiInsolDataVerificationId ==
				osiInsolDataVerificationCacheModel.osiInsolDataVerificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInsolDataVerificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{osiInsolDataVerificationId=");
		sb.append(osiInsolDataVerificationId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsolDataVerification toEntityModel() {
		OsiInsolDataVerificationImpl osiInsolDataVerificationImpl =
			new OsiInsolDataVerificationImpl();

		osiInsolDataVerificationImpl.setOsiInsolDataVerificationId(
			osiInsolDataVerificationId);
		osiInsolDataVerificationImpl.setGroupId(groupId);
		osiInsolDataVerificationImpl.setCompanyId(companyId);
		osiInsolDataVerificationImpl.setUserId(userId);

		if (userName == null) {
			osiInsolDataVerificationImpl.setUserName("");
		}
		else {
			osiInsolDataVerificationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolDataVerificationImpl.setCreateDate(null);
		}
		else {
			osiInsolDataVerificationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolDataVerificationImpl.setModifiedDate(null);
		}
		else {
			osiInsolDataVerificationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			osiInsolDataVerificationImpl.setCaseId("");
		}
		else {
			osiInsolDataVerificationImpl.setCaseId(caseId);
		}

		if (status == null) {
			osiInsolDataVerificationImpl.setStatus("");
		}
		else {
			osiInsolDataVerificationImpl.setStatus(status);
		}

		osiInsolDataVerificationImpl.resetOriginalValues();

		return osiInsolDataVerificationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiInsolDataVerificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiInsolDataVerificationId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long osiInsolDataVerificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String status;

}