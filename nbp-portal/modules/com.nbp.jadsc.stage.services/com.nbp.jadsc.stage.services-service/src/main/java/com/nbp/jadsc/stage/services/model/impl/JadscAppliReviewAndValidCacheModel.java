/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JadscAppliReviewAndValid in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JadscAppliReviewAndValidCacheModel
	implements CacheModel<JadscAppliReviewAndValid>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JadscAppliReviewAndValidCacheModel)) {
			return false;
		}

		JadscAppliReviewAndValidCacheModel jadscAppliReviewAndValidCacheModel =
			(JadscAppliReviewAndValidCacheModel)object;

		if (jadscAppliReviewAndValidId ==
				jadscAppliReviewAndValidCacheModel.jadscAppliReviewAndValidId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscAppliReviewAndValidId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jadscAppliReviewAndValidId=");
		sb.append(jadscAppliReviewAndValidId);
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
		sb.append(", versionOfApplication=");
		sb.append(versionOfApplication);
		sb.append(", status=");
		sb.append(status);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JadscAppliReviewAndValid toEntityModel() {
		JadscAppliReviewAndValidImpl jadscAppliReviewAndValidImpl =
			new JadscAppliReviewAndValidImpl();

		jadscAppliReviewAndValidImpl.setJadscAppliReviewAndValidId(
			jadscAppliReviewAndValidId);
		jadscAppliReviewAndValidImpl.setGroupId(groupId);
		jadscAppliReviewAndValidImpl.setCompanyId(companyId);
		jadscAppliReviewAndValidImpl.setUserId(userId);

		if (userName == null) {
			jadscAppliReviewAndValidImpl.setUserName("");
		}
		else {
			jadscAppliReviewAndValidImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscAppliReviewAndValidImpl.setCreateDate(null);
		}
		else {
			jadscAppliReviewAndValidImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscAppliReviewAndValidImpl.setModifiedDate(null);
		}
		else {
			jadscAppliReviewAndValidImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (versionOfApplication == null) {
			jadscAppliReviewAndValidImpl.setVersionOfApplication("");
		}
		else {
			jadscAppliReviewAndValidImpl.setVersionOfApplication(
				versionOfApplication);
		}

		if (status == null) {
			jadscAppliReviewAndValidImpl.setStatus("");
		}
		else {
			jadscAppliReviewAndValidImpl.setStatus(status);
		}

		if (caseId == null) {
			jadscAppliReviewAndValidImpl.setCaseId("");
		}
		else {
			jadscAppliReviewAndValidImpl.setCaseId(caseId);
		}

		jadscAppliReviewAndValidImpl.resetOriginalValues();

		return jadscAppliReviewAndValidImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jadscAppliReviewAndValidId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		versionOfApplication = objectInput.readUTF();
		status = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jadscAppliReviewAndValidId);

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

		if (versionOfApplication == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(versionOfApplication);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long jadscAppliReviewAndValidId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String versionOfApplication;
	public String status;
	public String caseId;

}