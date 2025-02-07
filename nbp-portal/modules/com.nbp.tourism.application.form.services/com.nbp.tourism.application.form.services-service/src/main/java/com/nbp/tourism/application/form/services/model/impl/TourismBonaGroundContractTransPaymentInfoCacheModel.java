/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundContractTransPaymentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundContractTransPaymentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundContractTransPaymentInfoCacheModel
	implements CacheModel<TourismBonaGroundContractTransPaymentInfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				TourismBonaGroundContractTransPaymentInfoCacheModel)) {

			return false;
		}

		TourismBonaGroundContractTransPaymentInfoCacheModel
			tourismBonaGroundContractTransPaymentInfoCacheModel =
				(TourismBonaGroundContractTransPaymentInfoCacheModel)object;

		if (tourismBonaGroTransPayId ==
				tourismBonaGroundContractTransPaymentInfoCacheModel.
					tourismBonaGroTransPayId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaGroTransPayId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{tourismBonaGroTransPayId=");
		sb.append(tourismBonaGroTransPayId);
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
		sb.append(", contractType=");
		sb.append(contractType);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaGroundContractTransPaymentInfo toEntityModel() {
		TourismBonaGroundContractTransPaymentInfoImpl
			tourismBonaGroundContractTransPaymentInfoImpl =
				new TourismBonaGroundContractTransPaymentInfoImpl();

		tourismBonaGroundContractTransPaymentInfoImpl.
			setTourismBonaGroTransPayId(tourismBonaGroTransPayId);
		tourismBonaGroundContractTransPaymentInfoImpl.setGroupId(groupId);
		tourismBonaGroundContractTransPaymentInfoImpl.setCompanyId(companyId);
		tourismBonaGroundContractTransPaymentInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundContractTransPaymentInfoImpl.setUserName("");
		}
		else {
			tourismBonaGroundContractTransPaymentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundContractTransPaymentInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundContractTransPaymentInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundContractTransPaymentInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundContractTransPaymentInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (contractType == null) {
			tourismBonaGroundContractTransPaymentInfoImpl.setContractType("");
		}
		else {
			tourismBonaGroundContractTransPaymentInfoImpl.setContractType(
				contractType);
		}

		tourismBonaGroundContractTransPaymentInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaGroundContractTransPaymentInfoImpl.resetOriginalValues();

		return tourismBonaGroundContractTransPaymentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaGroTransPayId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		contractType = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaGroTransPayId);

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

		if (contractType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contractType);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaGroTransPayId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String contractType;
	public long tourismApplicationId;

}