/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionSignInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAttractionSignInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAttractionSignInfoCacheModel
	implements CacheModel<TourismBonaAttractionSignInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAttractionSignInfoCacheModel)) {
			return false;
		}

		TourismBonaAttractionSignInfoCacheModel
			tourismBonaAttractionSignInfoCacheModel =
				(TourismBonaAttractionSignInfoCacheModel)object;

		if (tourismBonAttrSignId ==
				tourismBonaAttractionSignInfoCacheModel.tourismBonAttrSignId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonAttrSignId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismBonAttrSignId=");
		sb.append(tourismBonAttrSignId);
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
		sb.append(", applicantStatus=");
		sb.append(applicantStatus);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAttractionSignInfo toEntityModel() {
		TourismBonaAttractionSignInfoImpl tourismBonaAttractionSignInfoImpl =
			new TourismBonaAttractionSignInfoImpl();

		tourismBonaAttractionSignInfoImpl.setTourismBonAttrSignId(
			tourismBonAttrSignId);
		tourismBonaAttractionSignInfoImpl.setGroupId(groupId);
		tourismBonaAttractionSignInfoImpl.setCompanyId(companyId);
		tourismBonaAttractionSignInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAttractionSignInfoImpl.setUserName("");
		}
		else {
			tourismBonaAttractionSignInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAttractionSignInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaAttractionSignInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAttractionSignInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAttractionSignInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (applicantName == null) {
			tourismBonaAttractionSignInfoImpl.setApplicantName("");
		}
		else {
			tourismBonaAttractionSignInfoImpl.setApplicantName(applicantName);
		}

		if (applicantStatus == null) {
			tourismBonaAttractionSignInfoImpl.setApplicantStatus("");
		}
		else {
			tourismBonaAttractionSignInfoImpl.setApplicantStatus(
				applicantStatus);
		}

		if (signDate == Long.MIN_VALUE) {
			tourismBonaAttractionSignInfoImpl.setSignDate(null);
		}
		else {
			tourismBonaAttractionSignInfoImpl.setSignDate(new Date(signDate));
		}

		tourismBonaAttractionSignInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAttractionSignInfoImpl.resetOriginalValues();

		return tourismBonaAttractionSignInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonAttrSignId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		applicantName = objectInput.readUTF();
		applicantStatus = objectInput.readUTF();
		signDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonAttrSignId);

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

		if (applicantStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantStatus);
		}

		objectOutput.writeLong(signDate);

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonAttrSignId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String applicantName;
	public String applicantStatus;
	public long signDate;
	public long tourismApplicationId;

}