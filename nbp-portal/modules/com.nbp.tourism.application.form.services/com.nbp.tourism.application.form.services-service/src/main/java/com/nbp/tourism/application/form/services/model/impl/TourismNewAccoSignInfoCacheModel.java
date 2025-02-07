/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAccoSignInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAccoSignInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAccoSignInfoCacheModel
	implements CacheModel<TourismNewAccoSignInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAccoSignInfoCacheModel)) {
			return false;
		}

		TourismNewAccoSignInfoCacheModel tourismNewAccoSignInfoCacheModel =
			(TourismNewAccoSignInfoCacheModel)object;

		if (tourismNewAccoSignInfoId ==
				tourismNewAccoSignInfoCacheModel.tourismNewAccoSignInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAccoSignInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismNewAccoSignInfoId=");
		sb.append(tourismNewAccoSignInfoId);
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
		sb.append(", signApplicantName=");
		sb.append(signApplicantName);
		sb.append(", signApplicantStatus=");
		sb.append(signApplicantStatus);
		sb.append(", newSignDate=");
		sb.append(newSignDate);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismNewAccoSignInfo toEntityModel() {
		TourismNewAccoSignInfoImpl tourismNewAccoSignInfoImpl =
			new TourismNewAccoSignInfoImpl();

		tourismNewAccoSignInfoImpl.setTourismNewAccoSignInfoId(
			tourismNewAccoSignInfoId);
		tourismNewAccoSignInfoImpl.setGroupId(groupId);
		tourismNewAccoSignInfoImpl.setCompanyId(companyId);
		tourismNewAccoSignInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAccoSignInfoImpl.setUserName("");
		}
		else {
			tourismNewAccoSignInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAccoSignInfoImpl.setCreateDate(null);
		}
		else {
			tourismNewAccoSignInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAccoSignInfoImpl.setModifiedDate(null);
		}
		else {
			tourismNewAccoSignInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (signApplicantName == null) {
			tourismNewAccoSignInfoImpl.setSignApplicantName("");
		}
		else {
			tourismNewAccoSignInfoImpl.setSignApplicantName(signApplicantName);
		}

		if (signApplicantStatus == null) {
			tourismNewAccoSignInfoImpl.setSignApplicantStatus("");
		}
		else {
			tourismNewAccoSignInfoImpl.setSignApplicantStatus(
				signApplicantStatus);
		}

		if (newSignDate == Long.MIN_VALUE) {
			tourismNewAccoSignInfoImpl.setNewSignDate(null);
		}
		else {
			tourismNewAccoSignInfoImpl.setNewSignDate(new Date(newSignDate));
		}

		tourismNewAccoSignInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAccoSignInfoImpl.resetOriginalValues();

		return tourismNewAccoSignInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAccoSignInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		signApplicantName = objectInput.readUTF();
		signApplicantStatus = objectInput.readUTF();
		newSignDate = objectInput.readLong();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismNewAccoSignInfoId);

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

		if (signApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signApplicantName);
		}

		if (signApplicantStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signApplicantStatus);
		}

		objectOutput.writeLong(newSignDate);

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismNewAccoSignInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String signApplicantName;
	public String signApplicantStatus;
	public long newSignDate;
	public long tourismApplicationId;

}