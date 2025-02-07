/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundSignInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundSignInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundSignInfoCacheModel
	implements CacheModel<TourismBonaGroundSignInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaGroundSignInfoCacheModel)) {
			return false;
		}

		TourismBonaGroundSignInfoCacheModel
			tourismBonaGroundSignInfoCacheModel =
				(TourismBonaGroundSignInfoCacheModel)object;

		if (tourismBonaGroundSignInfoId ==
				tourismBonaGroundSignInfoCacheModel.
					tourismBonaGroundSignInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaGroundSignInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{tourismBonaGroundSignInfoId=");
		sb.append(tourismBonaGroundSignInfoId);
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
		sb.append(", carApplicantName=");
		sb.append(carApplicantName);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaGroundSignInfo toEntityModel() {
		TourismBonaGroundSignInfoImpl tourismBonaGroundSignInfoImpl =
			new TourismBonaGroundSignInfoImpl();

		tourismBonaGroundSignInfoImpl.setTourismBonaGroundSignInfoId(
			tourismBonaGroundSignInfoId);
		tourismBonaGroundSignInfoImpl.setGroupId(groupId);
		tourismBonaGroundSignInfoImpl.setCompanyId(companyId);
		tourismBonaGroundSignInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundSignInfoImpl.setUserName("");
		}
		else {
			tourismBonaGroundSignInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundSignInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundSignInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundSignInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundSignInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (carApplicantName == null) {
			tourismBonaGroundSignInfoImpl.setCarApplicantName("");
		}
		else {
			tourismBonaGroundSignInfoImpl.setCarApplicantName(carApplicantName);
		}

		tourismBonaGroundSignInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaGroundSignInfoImpl.resetOriginalValues();

		return tourismBonaGroundSignInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaGroundSignInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		carApplicantName = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaGroundSignInfoId);

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

		if (carApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(carApplicantName);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaGroundSignInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String carApplicantName;
	public long tourismApplicationId;

}