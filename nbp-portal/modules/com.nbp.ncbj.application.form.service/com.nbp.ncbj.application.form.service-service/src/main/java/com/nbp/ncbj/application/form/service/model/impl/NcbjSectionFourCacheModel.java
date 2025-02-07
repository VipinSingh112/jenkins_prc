/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjSectionFour in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjSectionFourCacheModel
	implements CacheModel<NcbjSectionFour>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjSectionFourCacheModel)) {
			return false;
		}

		NcbjSectionFourCacheModel ncbjSectionFourCacheModel =
			(NcbjSectionFourCacheModel)object;

		if (ncbjSectionFourId == ncbjSectionFourCacheModel.ncbjSectionFourId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjSectionFourId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{ncbjSectionFourId=");
		sb.append(ncbjSectionFourId);
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
		sb.append(", consultService=");
		sb.append(consultService);
		sb.append(", consultTelephone=");
		sb.append(consultTelephone);
		sb.append(", consultEmail=");
		sb.append(consultEmail);
		sb.append(", consultStageOne=");
		sb.append(consultStageOne);
		sb.append(", consultStageTwo=");
		sb.append(consultStageTwo);
		sb.append(", consultSurveillanceAudit=");
		sb.append(consultSurveillanceAudit);
		sb.append(", consultRecertificationAudit=");
		sb.append(consultRecertificationAudit);
		sb.append(", consultPreassessmentAudit=");
		sb.append(consultPreassessmentAudit);
		sb.append(", consultOtherService=");
		sb.append(consultOtherService);
		sb.append(", consultName=");
		sb.append(consultName);
		sb.append(", consultPosition=");
		sb.append(consultPosition);
		sb.append(", consultDate=");
		sb.append(consultDate);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjSectionFour toEntityModel() {
		NcbjSectionFourImpl ncbjSectionFourImpl = new NcbjSectionFourImpl();

		ncbjSectionFourImpl.setNcbjSectionFourId(ncbjSectionFourId);
		ncbjSectionFourImpl.setGroupId(groupId);
		ncbjSectionFourImpl.setCompanyId(companyId);
		ncbjSectionFourImpl.setUserId(userId);

		if (userName == null) {
			ncbjSectionFourImpl.setUserName("");
		}
		else {
			ncbjSectionFourImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setCreateDate(null);
		}
		else {
			ncbjSectionFourImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setModifiedDate(null);
		}
		else {
			ncbjSectionFourImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (consultService == null) {
			ncbjSectionFourImpl.setConsultService("");
		}
		else {
			ncbjSectionFourImpl.setConsultService(consultService);
		}

		if (consultTelephone == null) {
			ncbjSectionFourImpl.setConsultTelephone("");
		}
		else {
			ncbjSectionFourImpl.setConsultTelephone(consultTelephone);
		}

		if (consultEmail == null) {
			ncbjSectionFourImpl.setConsultEmail("");
		}
		else {
			ncbjSectionFourImpl.setConsultEmail(consultEmail);
		}

		if (consultStageOne == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setConsultStageOne(null);
		}
		else {
			ncbjSectionFourImpl.setConsultStageOne(new Date(consultStageOne));
		}

		if (consultStageTwo == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setConsultStageTwo(null);
		}
		else {
			ncbjSectionFourImpl.setConsultStageTwo(new Date(consultStageTwo));
		}

		if (consultSurveillanceAudit == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setConsultSurveillanceAudit(null);
		}
		else {
			ncbjSectionFourImpl.setConsultSurveillanceAudit(
				new Date(consultSurveillanceAudit));
		}

		if (consultRecertificationAudit == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setConsultRecertificationAudit(null);
		}
		else {
			ncbjSectionFourImpl.setConsultRecertificationAudit(
				new Date(consultRecertificationAudit));
		}

		if (consultPreassessmentAudit == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setConsultPreassessmentAudit(null);
		}
		else {
			ncbjSectionFourImpl.setConsultPreassessmentAudit(
				new Date(consultPreassessmentAudit));
		}

		if (consultOtherService == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setConsultOtherService(null);
		}
		else {
			ncbjSectionFourImpl.setConsultOtherService(
				new Date(consultOtherService));
		}

		if (consultName == null) {
			ncbjSectionFourImpl.setConsultName("");
		}
		else {
			ncbjSectionFourImpl.setConsultName(consultName);
		}

		if (consultPosition == null) {
			ncbjSectionFourImpl.setConsultPosition("");
		}
		else {
			ncbjSectionFourImpl.setConsultPosition(consultPosition);
		}

		if (consultDate == Long.MIN_VALUE) {
			ncbjSectionFourImpl.setConsultDate(null);
		}
		else {
			ncbjSectionFourImpl.setConsultDate(new Date(consultDate));
		}

		ncbjSectionFourImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjSectionFourImpl.resetOriginalValues();

		return ncbjSectionFourImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjSectionFourId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		consultService = objectInput.readUTF();
		consultTelephone = objectInput.readUTF();
		consultEmail = objectInput.readUTF();
		consultStageOne = objectInput.readLong();
		consultStageTwo = objectInput.readLong();
		consultSurveillanceAudit = objectInput.readLong();
		consultRecertificationAudit = objectInput.readLong();
		consultPreassessmentAudit = objectInput.readLong();
		consultOtherService = objectInput.readLong();
		consultName = objectInput.readUTF();
		consultPosition = objectInput.readUTF();
		consultDate = objectInput.readLong();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjSectionFourId);

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

		if (consultService == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultService);
		}

		if (consultTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultTelephone);
		}

		if (consultEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultEmail);
		}

		objectOutput.writeLong(consultStageOne);
		objectOutput.writeLong(consultStageTwo);
		objectOutput.writeLong(consultSurveillanceAudit);
		objectOutput.writeLong(consultRecertificationAudit);
		objectOutput.writeLong(consultPreassessmentAudit);
		objectOutput.writeLong(consultOtherService);

		if (consultName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultName);
		}

		if (consultPosition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consultPosition);
		}

		objectOutput.writeLong(consultDate);

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjSectionFourId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String consultService;
	public String consultTelephone;
	public String consultEmail;
	public long consultStageOne;
	public long consultStageTwo;
	public long consultSurveillanceAudit;
	public long consultRecertificationAudit;
	public long consultPreassessmentAudit;
	public long consultOtherService;
	public String consultName;
	public String consultPosition;
	public long consultDate;
	public long ncbjApplicationId;

}