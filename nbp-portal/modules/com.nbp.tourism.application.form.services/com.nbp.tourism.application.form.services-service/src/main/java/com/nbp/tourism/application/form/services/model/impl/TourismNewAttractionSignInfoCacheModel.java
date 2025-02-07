/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionSignInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismNewAttractionSignInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismNewAttractionSignInfoCacheModel
	implements CacheModel<TourismNewAttractionSignInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismNewAttractionSignInfoCacheModel)) {
			return false;
		}

		TourismNewAttractionSignInfoCacheModel
			tourismNewAttractionSignInfoCacheModel =
				(TourismNewAttractionSignInfoCacheModel)object;

		if (tourismNewAttraSignInfoId ==
				tourismNewAttractionSignInfoCacheModel.
					tourismNewAttraSignInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismNewAttraSignInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{tourismNewAttraSignInfoId=");
		sb.append(tourismNewAttraSignInfoId);
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
	public TourismNewAttractionSignInfo toEntityModel() {
		TourismNewAttractionSignInfoImpl tourismNewAttractionSignInfoImpl =
			new TourismNewAttractionSignInfoImpl();

		tourismNewAttractionSignInfoImpl.setTourismNewAttraSignInfoId(
			tourismNewAttraSignInfoId);
		tourismNewAttractionSignInfoImpl.setGroupId(groupId);
		tourismNewAttractionSignInfoImpl.setCompanyId(companyId);
		tourismNewAttractionSignInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismNewAttractionSignInfoImpl.setUserName("");
		}
		else {
			tourismNewAttractionSignInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismNewAttractionSignInfoImpl.setCreateDate(null);
		}
		else {
			tourismNewAttractionSignInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismNewAttractionSignInfoImpl.setModifiedDate(null);
		}
		else {
			tourismNewAttractionSignInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (newSignApplicantName == null) {
			tourismNewAttractionSignInfoImpl.setNewSignApplicantName("");
		}
		else {
			tourismNewAttractionSignInfoImpl.setNewSignApplicantName(
				newSignApplicantName);
		}

		if (newSignApplicantStatus == null) {
			tourismNewAttractionSignInfoImpl.setNewSignApplicantStatus("");
		}
		else {
			tourismNewAttractionSignInfoImpl.setNewSignApplicantStatus(
				newSignApplicantStatus);
		}

		if (newSignDate == Long.MIN_VALUE) {
			tourismNewAttractionSignInfoImpl.setNewSignDate(null);
		}
		else {
			tourismNewAttractionSignInfoImpl.setNewSignDate(
				new Date(newSignDate));
		}

		tourismNewAttractionSignInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismNewAttractionSignInfoImpl.resetOriginalValues();

		return tourismNewAttractionSignInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismNewAttraSignInfoId = objectInput.readLong();

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
		objectOutput.writeLong(tourismNewAttraSignInfoId);

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

	public long tourismNewAttraSignInfoId;
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