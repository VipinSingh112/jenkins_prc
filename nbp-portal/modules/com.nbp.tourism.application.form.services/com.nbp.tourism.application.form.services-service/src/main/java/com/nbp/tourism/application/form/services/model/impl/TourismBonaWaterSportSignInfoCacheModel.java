/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportSignInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaWaterSportSignInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaWaterSportSignInfoCacheModel
	implements CacheModel<TourismBonaWaterSportSignInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaWaterSportSignInfoCacheModel)) {
			return false;
		}

		TourismBonaWaterSportSignInfoCacheModel
			tourismBonaWaterSportSignInfoCacheModel =
				(TourismBonaWaterSportSignInfoCacheModel)object;

		if (tourismBonaWSSignId ==
				tourismBonaWaterSportSignInfoCacheModel.tourismBonaWSSignId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaWSSignId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismBonaWSSignId=");
		sb.append(tourismBonaWSSignId);
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
		sb.append(", applicantName=");
		sb.append(applicantName);
		sb.append(", signApplicantStatus=");
		sb.append(signApplicantStatus);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaWaterSportSignInfo toEntityModel() {
		TourismBonaWaterSportSignInfoImpl tourismBonaWaterSportSignInfoImpl =
			new TourismBonaWaterSportSignInfoImpl();

		tourismBonaWaterSportSignInfoImpl.setTourismBonaWSSignId(
			tourismBonaWSSignId);
		tourismBonaWaterSportSignInfoImpl.setGroupId(groupId);
		tourismBonaWaterSportSignInfoImpl.setCompanyId(companyId);
		tourismBonaWaterSportSignInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaWaterSportSignInfoImpl.setUserName("");
		}
		else {
			tourismBonaWaterSportSignInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaWaterSportSignInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaWaterSportSignInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaWaterSportSignInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaWaterSportSignInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantName == null) {
			tourismBonaWaterSportSignInfoImpl.setApplicantName("");
		}
		else {
			tourismBonaWaterSportSignInfoImpl.setApplicantName(applicantName);
		}

		if (signApplicantStatus == null) {
			tourismBonaWaterSportSignInfoImpl.setSignApplicantStatus("");
		}
		else {
			tourismBonaWaterSportSignInfoImpl.setSignApplicantStatus(
				signApplicantStatus);
		}

		if (signDate == Long.MIN_VALUE) {
			tourismBonaWaterSportSignInfoImpl.setSignDate(null);
		}
		else {
			tourismBonaWaterSportSignInfoImpl.setSignDate(new Date(signDate));
		}

		tourismBonaWaterSportSignInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaWaterSportSignInfoImpl.resetOriginalValues();

		return tourismBonaWaterSportSignInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaWSSignId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		signApplicantStatus = objectInput.readUTF();
		signDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaWSSignId);

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

		if (applicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantName);
		}

		if (signApplicantStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signApplicantStatus);
		}

		objectOutput.writeLong(signDate);

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaWSSignId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String signApplicantStatus;
	public long signDate;
	public long tourismApplicationId;

}