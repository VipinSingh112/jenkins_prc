/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjApplicantDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjApplicantDetailCacheModel
	implements CacheModel<NcbjApplicantDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjApplicantDetailCacheModel)) {
			return false;
		}

		NcbjApplicantDetailCacheModel ncbjApplicantDetailCacheModel =
			(NcbjApplicantDetailCacheModel)object;

		if (ncbjApplicantDetailId ==
				ncbjApplicantDetailCacheModel.ncbjApplicantDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjApplicantDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{ncbjApplicantDetailId=");
		sb.append(ncbjApplicantDetailId);
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
		sb.append(", stageOne=");
		sb.append(stageOne);
		sb.append(", stageTwo=");
		sb.append(stageTwo);
		sb.append(", surveillanceAudit=");
		sb.append(surveillanceAudit);
		sb.append(", recertificationAudit=");
		sb.append(recertificationAudit);
		sb.append(", preAassessmentAudit=");
		sb.append(preAassessmentAudit);
		sb.append(", anyOtherService =");
		sb.append(anyOtherService);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjApplicantDetail toEntityModel() {
		NcbjApplicantDetailImpl ncbjApplicantDetailImpl =
			new NcbjApplicantDetailImpl();

		ncbjApplicantDetailImpl.setNcbjApplicantDetailId(ncbjApplicantDetailId);
		ncbjApplicantDetailImpl.setGroupId(groupId);
		ncbjApplicantDetailImpl.setCompanyId(companyId);
		ncbjApplicantDetailImpl.setUserId(userId);

		if (userName == null) {
			ncbjApplicantDetailImpl.setUserName("");
		}
		else {
			ncbjApplicantDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setCreateDate(null);
		}
		else {
			ncbjApplicantDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setModifiedDate(null);
		}
		else {
			ncbjApplicantDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (stageOne == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setStageOne(null);
		}
		else {
			ncbjApplicantDetailImpl.setStageOne(new Date(stageOne));
		}

		if (stageTwo == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setStageTwo(null);
		}
		else {
			ncbjApplicantDetailImpl.setStageTwo(new Date(stageTwo));
		}

		if (surveillanceAudit == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setSurveillanceAudit(null);
		}
		else {
			ncbjApplicantDetailImpl.setSurveillanceAudit(
				new Date(surveillanceAudit));
		}

		if (recertificationAudit == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setRecertificationAudit(null);
		}
		else {
			ncbjApplicantDetailImpl.setRecertificationAudit(
				new Date(recertificationAudit));
		}

		if (preAassessmentAudit == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setPreAassessmentAudit(null);
		}
		else {
			ncbjApplicantDetailImpl.setPreAassessmentAudit(
				new Date(preAassessmentAudit));
		}

		if (anyOtherService == Long.MIN_VALUE) {
			ncbjApplicantDetailImpl.setAnyOtherService(null);
		}
		else {
			ncbjApplicantDetailImpl.setAnyOtherService(
				new Date(anyOtherService));
		}

		ncbjApplicantDetailImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjApplicantDetailImpl.resetOriginalValues();

		return ncbjApplicantDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjApplicantDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		stageOne = objectInput.readLong();
		stageTwo = objectInput.readLong();
		surveillanceAudit = objectInput.readLong();
		recertificationAudit = objectInput.readLong();
		preAassessmentAudit = objectInput.readLong();
		anyOtherService = objectInput.readLong();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjApplicantDetailId);

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
		objectOutput.writeLong(stageOne);
		objectOutput.writeLong(stageTwo);
		objectOutput.writeLong(surveillanceAudit);
		objectOutput.writeLong(recertificationAudit);
		objectOutput.writeLong(preAassessmentAudit);
		objectOutput.writeLong(anyOtherService);

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjApplicantDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long stageOne;
	public long stageTwo;
	public long surveillanceAudit;
	public long recertificationAudit;
	public long preAassessmentAudit;
	public long anyOtherService;
	public long ncbjApplicationId;

}