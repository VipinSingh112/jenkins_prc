/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaOperatorInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaOperatorInfoCacheModel
	implements CacheModel<TourismBonaOperatorInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaOperatorInfoCacheModel)) {
			return false;
		}

		TourismBonaOperatorInfoCacheModel tourismBonaOperatorInfoCacheModel =
			(TourismBonaOperatorInfoCacheModel)object;

		if (tourismBonaOperatorInfoId ==
				tourismBonaOperatorInfoCacheModel.tourismBonaOperatorInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaOperatorInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{tourismBonaOperatorInfoId=");
		sb.append(tourismBonaOperatorInfoId);
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
		sb.append(", operatorName=");
		sb.append(operatorName);
		sb.append(", operatorNumber=");
		sb.append(operatorNumber);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", expirationDate=");
		sb.append(expirationDate);
		sb.append(", categories=");
		sb.append(categories);
		sb.append(", subCategories=");
		sb.append(subCategories);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaOperatorInfo toEntityModel() {
		TourismBonaOperatorInfoImpl tourismBonaOperatorInfoImpl =
			new TourismBonaOperatorInfoImpl();

		tourismBonaOperatorInfoImpl.setTourismBonaOperatorInfoId(
			tourismBonaOperatorInfoId);
		tourismBonaOperatorInfoImpl.setGroupId(groupId);
		tourismBonaOperatorInfoImpl.setCompanyId(companyId);
		tourismBonaOperatorInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaOperatorInfoImpl.setUserName("");
		}
		else {
			tourismBonaOperatorInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaOperatorInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaOperatorInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaOperatorInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaOperatorInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (operatorName == null) {
			tourismBonaOperatorInfoImpl.setOperatorName("");
		}
		else {
			tourismBonaOperatorInfoImpl.setOperatorName(operatorName);
		}

		if (operatorNumber == null) {
			tourismBonaOperatorInfoImpl.setOperatorNumber("");
		}
		else {
			tourismBonaOperatorInfoImpl.setOperatorNumber(operatorNumber);
		}

		if (issueDate == Long.MIN_VALUE) {
			tourismBonaOperatorInfoImpl.setIssueDate(null);
		}
		else {
			tourismBonaOperatorInfoImpl.setIssueDate(new Date(issueDate));
		}

		if (expirationDate == Long.MIN_VALUE) {
			tourismBonaOperatorInfoImpl.setExpirationDate(null);
		}
		else {
			tourismBonaOperatorInfoImpl.setExpirationDate(
				new Date(expirationDate));
		}

		if (categories == null) {
			tourismBonaOperatorInfoImpl.setCategories("");
		}
		else {
			tourismBonaOperatorInfoImpl.setCategories(categories);
		}

		if (subCategories == null) {
			tourismBonaOperatorInfoImpl.setSubCategories("");
		}
		else {
			tourismBonaOperatorInfoImpl.setSubCategories(subCategories);
		}

		tourismBonaOperatorInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaOperatorInfoImpl.resetOriginalValues();

		return tourismBonaOperatorInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaOperatorInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		operatorName = objectInput.readUTF();
		operatorNumber = objectInput.readUTF();
		issueDate = objectInput.readLong();
		expirationDate = objectInput.readLong();
		categories = objectInput.readUTF();
		subCategories = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaOperatorInfoId);

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

		if (operatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorName);
		}

		if (operatorNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(operatorNumber);
		}

		objectOutput.writeLong(issueDate);
		objectOutput.writeLong(expirationDate);

		if (categories == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categories);
		}

		if (subCategories == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategories);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaOperatorInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String operatorName;
	public String operatorNumber;
	public long issueDate;
	public long expirationDate;
	public String categories;
	public String subCategories;
	public long tourismApplicationId;

}