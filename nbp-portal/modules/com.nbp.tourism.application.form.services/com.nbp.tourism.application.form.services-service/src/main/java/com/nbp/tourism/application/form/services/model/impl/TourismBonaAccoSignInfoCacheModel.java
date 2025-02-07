/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAccoSignInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAccoSignInfoCacheModel
	implements CacheModel<TourismBonaAccoSignInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAccoSignInfoCacheModel)) {
			return false;
		}

		TourismBonaAccoSignInfoCacheModel tourismBonaAccoSignInfoCacheModel =
			(TourismBonaAccoSignInfoCacheModel)object;

		if (tourismBonaAccoSignId ==
				tourismBonaAccoSignInfoCacheModel.tourismBonaAccoSignId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAccoSignId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismBonaAccoSignId=");
		sb.append(tourismBonaAccoSignId);
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
		sb.append(", newSignApplicantName=");
		sb.append(newSignApplicantName);
		sb.append(", newSignApplicantStatus=");
		sb.append(newSignApplicantStatus);
		sb.append(", newSignDate=");
		sb.append(newSignDate);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAccoSignInfo toEntityModel() {
		TourismBonaAccoSignInfoImpl tourismBonaAccoSignInfoImpl =
			new TourismBonaAccoSignInfoImpl();

		tourismBonaAccoSignInfoImpl.setTourismBonaAccoSignId(
			tourismBonaAccoSignId);
		tourismBonaAccoSignInfoImpl.setGroupId(groupId);
		tourismBonaAccoSignInfoImpl.setCompanyId(companyId);
		tourismBonaAccoSignInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAccoSignInfoImpl.setUserName("");
		}
		else {
			tourismBonaAccoSignInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAccoSignInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaAccoSignInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAccoSignInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAccoSignInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (newSignApplicantName == null) {
			tourismBonaAccoSignInfoImpl.setNewSignApplicantName("");
		}
		else {
			tourismBonaAccoSignInfoImpl.setNewSignApplicantName(
				newSignApplicantName);
		}

		if (newSignApplicantStatus == null) {
			tourismBonaAccoSignInfoImpl.setNewSignApplicantStatus("");
		}
		else {
			tourismBonaAccoSignInfoImpl.setNewSignApplicantStatus(
				newSignApplicantStatus);
		}

		if (newSignDate == Long.MIN_VALUE) {
			tourismBonaAccoSignInfoImpl.setNewSignDate(null);
		}
		else {
			tourismBonaAccoSignInfoImpl.setNewSignDate(new Date(newSignDate));
		}

		tourismBonaAccoSignInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAccoSignInfoImpl.resetOriginalValues();

		return tourismBonaAccoSignInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAccoSignId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		newSignApplicantName = objectInput.readUTF();
		newSignApplicantStatus = objectInput.readUTF();
		newSignDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAccoSignId);

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

		if (newSignApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newSignApplicantName);
		}

		if (newSignApplicantStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(newSignApplicantStatus);
		}

		objectOutput.writeLong(newSignDate);

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaAccoSignId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String newSignApplicantName;
	public String newSignApplicantStatus;
	public long newSignDate;
	public long tourismApplicationId;

}