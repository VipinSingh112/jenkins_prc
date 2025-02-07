/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncra.application.form.service.model.NcraFeeSubmission;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcraFeeSubmission in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcraFeeSubmissionCacheModel
	implements CacheModel<NcraFeeSubmission>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcraFeeSubmissionCacheModel)) {
			return false;
		}

		NcraFeeSubmissionCacheModel ncraFeeSubmissionCacheModel =
			(NcraFeeSubmissionCacheModel)object;

		if (ncraFeeSubmissionId ==
				ncraFeeSubmissionCacheModel.ncraFeeSubmissionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncraFeeSubmissionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{ncraFeeSubmissionId=");
		sb.append(ncraFeeSubmissionId);
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
		sb.append(", creditStatus=");
		sb.append(creditStatus);
		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcraFeeSubmission toEntityModel() {
		NcraFeeSubmissionImpl ncraFeeSubmissionImpl =
			new NcraFeeSubmissionImpl();

		ncraFeeSubmissionImpl.setNcraFeeSubmissionId(ncraFeeSubmissionId);
		ncraFeeSubmissionImpl.setGroupId(groupId);
		ncraFeeSubmissionImpl.setCompanyId(companyId);
		ncraFeeSubmissionImpl.setUserId(userId);

		if (userName == null) {
			ncraFeeSubmissionImpl.setUserName("");
		}
		else {
			ncraFeeSubmissionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncraFeeSubmissionImpl.setCreateDate(null);
		}
		else {
			ncraFeeSubmissionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncraFeeSubmissionImpl.setModifiedDate(null);
		}
		else {
			ncraFeeSubmissionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (creditStatus == null) {
			ncraFeeSubmissionImpl.setCreditStatus("");
		}
		else {
			ncraFeeSubmissionImpl.setCreditStatus(creditStatus);
		}

		ncraFeeSubmissionImpl.setNcraApplicationId(ncraApplicationId);

		ncraFeeSubmissionImpl.resetOriginalValues();

		return ncraFeeSubmissionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncraFeeSubmissionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		creditStatus = objectInput.readUTF();

		ncraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncraFeeSubmissionId);

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

		if (creditStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(creditStatus);
		}

		objectOutput.writeLong(ncraApplicationId);
	}

	public long ncraFeeSubmissionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String creditStatus;
	public long ncraApplicationId;

}