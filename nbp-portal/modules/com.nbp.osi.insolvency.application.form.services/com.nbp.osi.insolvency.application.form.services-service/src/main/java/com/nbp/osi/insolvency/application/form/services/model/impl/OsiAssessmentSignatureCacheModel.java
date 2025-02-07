/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiAssessmentSignature;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiAssessmentSignature in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiAssessmentSignatureCacheModel
	implements CacheModel<OsiAssessmentSignature>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiAssessmentSignatureCacheModel)) {
			return false;
		}

		OsiAssessmentSignatureCacheModel osiAssessmentSignatureCacheModel =
			(OsiAssessmentSignatureCacheModel)object;

		if (osiAssessmentSignatureId ==
				osiAssessmentSignatureCacheModel.osiAssessmentSignatureId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiAssessmentSignatureId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{osiAssessmentSignatureId=");
		sb.append(osiAssessmentSignatureId);
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
		sb.append(", assessSignName=");
		sb.append(assessSignName);
		sb.append(", assessSignDate=");
		sb.append(assessSignDate);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiAssessmentSignature toEntityModel() {
		OsiAssessmentSignatureImpl osiAssessmentSignatureImpl =
			new OsiAssessmentSignatureImpl();

		osiAssessmentSignatureImpl.setOsiAssessmentSignatureId(
			osiAssessmentSignatureId);
		osiAssessmentSignatureImpl.setGroupId(groupId);
		osiAssessmentSignatureImpl.setCompanyId(companyId);
		osiAssessmentSignatureImpl.setUserId(userId);

		if (userName == null) {
			osiAssessmentSignatureImpl.setUserName("");
		}
		else {
			osiAssessmentSignatureImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiAssessmentSignatureImpl.setCreateDate(null);
		}
		else {
			osiAssessmentSignatureImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiAssessmentSignatureImpl.setModifiedDate(null);
		}
		else {
			osiAssessmentSignatureImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (assessSignName == null) {
			osiAssessmentSignatureImpl.setAssessSignName("");
		}
		else {
			osiAssessmentSignatureImpl.setAssessSignName(assessSignName);
		}

		if (assessSignDate == null) {
			osiAssessmentSignatureImpl.setAssessSignDate("");
		}
		else {
			osiAssessmentSignatureImpl.setAssessSignDate(assessSignDate);
		}

		osiAssessmentSignatureImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiAssessmentSignatureImpl.resetOriginalValues();

		return osiAssessmentSignatureImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiAssessmentSignatureId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		assessSignName = objectInput.readUTF();
		assessSignDate = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiAssessmentSignatureId);

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

		if (assessSignName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assessSignName);
		}

		if (assessSignDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(assessSignDate);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiAssessmentSignatureId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String assessSignName;
	public String assessSignDate;
	public long osiInsolvencyId;

}