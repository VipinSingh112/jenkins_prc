/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjCompanyDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjCompanyDetailCacheModel
	implements CacheModel<NcbjCompanyDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjCompanyDetailCacheModel)) {
			return false;
		}

		NcbjCompanyDetailCacheModel ncbjCompanyDetailCacheModel =
			(NcbjCompanyDetailCacheModel)object;

		if (ncbjCompanyDetailId ==
				ncbjCompanyDetailCacheModel.ncbjCompanyDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjCompanyDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{ncbjCompanyDetailId=");
		sb.append(ncbjCompanyDetailId);
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
		sb.append(", companyNameOrHeadOffice=");
		sb.append(companyNameOrHeadOffice);
		sb.append(", companyAddress=");
		sb.append(companyAddress);
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
	public NcbjCompanyDetail toEntityModel() {
		NcbjCompanyDetailImpl ncbjCompanyDetailImpl =
			new NcbjCompanyDetailImpl();

		ncbjCompanyDetailImpl.setNcbjCompanyDetailId(ncbjCompanyDetailId);
		ncbjCompanyDetailImpl.setGroupId(groupId);
		ncbjCompanyDetailImpl.setCompanyId(companyId);
		ncbjCompanyDetailImpl.setUserId(userId);

		if (userName == null) {
			ncbjCompanyDetailImpl.setUserName("");
		}
		else {
			ncbjCompanyDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setCreateDate(null);
		}
		else {
			ncbjCompanyDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setModifiedDate(null);
		}
		else {
			ncbjCompanyDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (companyNameOrHeadOffice == null) {
			ncbjCompanyDetailImpl.setCompanyNameOrHeadOffice("");
		}
		else {
			ncbjCompanyDetailImpl.setCompanyNameOrHeadOffice(
				companyNameOrHeadOffice);
		}

		if (companyAddress == null) {
			ncbjCompanyDetailImpl.setCompanyAddress("");
		}
		else {
			ncbjCompanyDetailImpl.setCompanyAddress(companyAddress);
		}

		if (stageOne == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setStageOne(null);
		}
		else {
			ncbjCompanyDetailImpl.setStageOne(new Date(stageOne));
		}

		if (stageTwo == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setStageTwo(null);
		}
		else {
			ncbjCompanyDetailImpl.setStageTwo(new Date(stageTwo));
		}

		if (surveillanceAudit == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setSurveillanceAudit(null);
		}
		else {
			ncbjCompanyDetailImpl.setSurveillanceAudit(
				new Date(surveillanceAudit));
		}

		if (recertificationAudit == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setRecertificationAudit(null);
		}
		else {
			ncbjCompanyDetailImpl.setRecertificationAudit(
				new Date(recertificationAudit));
		}

		if (preAassessmentAudit == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setPreAassessmentAudit(null);
		}
		else {
			ncbjCompanyDetailImpl.setPreAassessmentAudit(
				new Date(preAassessmentAudit));
		}

		if (anyOtherService == Long.MIN_VALUE) {
			ncbjCompanyDetailImpl.setAnyOtherService(null);
		}
		else {
			ncbjCompanyDetailImpl.setAnyOtherService(new Date(anyOtherService));
		}

		ncbjCompanyDetailImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjCompanyDetailImpl.resetOriginalValues();

		return ncbjCompanyDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjCompanyDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyNameOrHeadOffice = objectInput.readUTF();
		companyAddress = objectInput.readUTF();
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
		objectOutput.writeLong(ncbjCompanyDetailId);

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

		if (companyNameOrHeadOffice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyNameOrHeadOffice);
		}

		if (companyAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyAddress);
		}

		objectOutput.writeLong(stageOne);
		objectOutput.writeLong(stageTwo);
		objectOutput.writeLong(surveillanceAudit);
		objectOutput.writeLong(recertificationAudit);
		objectOutput.writeLong(preAassessmentAudit);
		objectOutput.writeLong(anyOtherService);

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjCompanyDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String companyNameOrHeadOffice;
	public String companyAddress;
	public long stageOne;
	public long stageTwo;
	public long surveillanceAudit;
	public long recertificationAudit;
	public long preAassessmentAudit;
	public long anyOtherService;
	public long ncbjApplicationId;

}