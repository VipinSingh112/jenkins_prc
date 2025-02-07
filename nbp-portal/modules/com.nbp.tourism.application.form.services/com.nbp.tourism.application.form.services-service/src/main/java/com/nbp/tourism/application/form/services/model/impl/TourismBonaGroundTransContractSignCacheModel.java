/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransContractSign;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaGroundTransContractSign in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaGroundTransContractSignCacheModel
	implements CacheModel<TourismBonaGroundTransContractSign>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaGroundTransContractSignCacheModel)) {
			return false;
		}

		TourismBonaGroundTransContractSignCacheModel
			tourismBonaGroundTransContractSignCacheModel =
				(TourismBonaGroundTransContractSignCacheModel)object;

		if (tourismBonaGroTraCoSignId ==
				tourismBonaGroundTransContractSignCacheModel.
					tourismBonaGroTraCoSignId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaGroTraCoSignId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{tourismBonaGroTraCoSignId=");
		sb.append(tourismBonaGroTraCoSignId);
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
	public TourismBonaGroundTransContractSign toEntityModel() {
		TourismBonaGroundTransContractSignImpl
			tourismBonaGroundTransContractSignImpl =
				new TourismBonaGroundTransContractSignImpl();

		tourismBonaGroundTransContractSignImpl.setTourismBonaGroTraCoSignId(
			tourismBonaGroTraCoSignId);
		tourismBonaGroundTransContractSignImpl.setGroupId(groupId);
		tourismBonaGroundTransContractSignImpl.setCompanyId(companyId);
		tourismBonaGroundTransContractSignImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaGroundTransContractSignImpl.setUserName("");
		}
		else {
			tourismBonaGroundTransContractSignImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaGroundTransContractSignImpl.setCreateDate(null);
		}
		else {
			tourismBonaGroundTransContractSignImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaGroundTransContractSignImpl.setModifiedDate(null);
		}
		else {
			tourismBonaGroundTransContractSignImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (contractType == null) {
			tourismBonaGroundTransContractSignImpl.setContractType("");
		}
		else {
			tourismBonaGroundTransContractSignImpl.setContractType(
				contractType);
		}

		tourismBonaGroundTransContractSignImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaGroundTransContractSignImpl.resetOriginalValues();

		return tourismBonaGroundTransContractSignImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaGroTraCoSignId = objectInput.readLong();

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
		objectOutput.writeLong(tourismBonaGroTraCoSignId);

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

	public long tourismBonaGroTraCoSignId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String contractType;
	public long tourismApplicationId;

}