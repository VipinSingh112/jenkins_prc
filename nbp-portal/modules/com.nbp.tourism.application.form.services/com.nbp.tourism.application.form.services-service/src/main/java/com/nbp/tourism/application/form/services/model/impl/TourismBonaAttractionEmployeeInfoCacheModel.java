/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionEmployeeInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TourismBonaAttractionEmployeeInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TourismBonaAttractionEmployeeInfoCacheModel
	implements CacheModel<TourismBonaAttractionEmployeeInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TourismBonaAttractionEmployeeInfoCacheModel)) {
			return false;
		}

		TourismBonaAttractionEmployeeInfoCacheModel
			tourismBonaAttractionEmployeeInfoCacheModel =
				(TourismBonaAttractionEmployeeInfoCacheModel)object;

		if (tourismBonaAttrEmpId ==
				tourismBonaAttractionEmployeeInfoCacheModel.
					tourismBonaAttrEmpId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tourismBonaAttrEmpId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{tourismBonaAttrEmpId=");
		sb.append(tourismBonaAttrEmpId);
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
		sb.append(", actualPermanent=");
		sb.append(actualPermanent);
		sb.append(", actualTemporary=");
		sb.append(actualTemporary);
		sb.append(", actualForeign=");
		sb.append(actualForeign);
		sb.append(", actualLocal=");
		sb.append(actualLocal);
		sb.append(", actualPayroll=");
		sb.append(actualPayroll);
		sb.append(", projectedPermanent=");
		sb.append(projectedPermanent);
		sb.append(", projectedTemporary=");
		sb.append(projectedTemporary);
		sb.append(", projectedForeign=");
		sb.append(projectedForeign);
		sb.append(", projectedLocal=");
		sb.append(projectedLocal);
		sb.append(", projectedPayroll=");
		sb.append(projectedPayroll);
		sb.append(", tourismApplicationId=");
		sb.append(tourismApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TourismBonaAttractionEmployeeInfo toEntityModel() {
		TourismBonaAttractionEmployeeInfoImpl
			tourismBonaAttractionEmployeeInfoImpl =
				new TourismBonaAttractionEmployeeInfoImpl();

		tourismBonaAttractionEmployeeInfoImpl.setTourismBonaAttrEmpId(
			tourismBonaAttrEmpId);
		tourismBonaAttractionEmployeeInfoImpl.setGroupId(groupId);
		tourismBonaAttractionEmployeeInfoImpl.setCompanyId(companyId);
		tourismBonaAttractionEmployeeInfoImpl.setUserId(userId);

		if (userName == null) {
			tourismBonaAttractionEmployeeInfoImpl.setUserName("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tourismBonaAttractionEmployeeInfoImpl.setCreateDate(null);
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tourismBonaAttractionEmployeeInfoImpl.setModifiedDate(null);
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (actualPermanent == null) {
			tourismBonaAttractionEmployeeInfoImpl.setActualPermanent("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setActualPermanent(
				actualPermanent);
		}

		if (actualTemporary == null) {
			tourismBonaAttractionEmployeeInfoImpl.setActualTemporary("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setActualTemporary(
				actualTemporary);
		}

		if (actualForeign == null) {
			tourismBonaAttractionEmployeeInfoImpl.setActualForeign("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setActualForeign(
				actualForeign);
		}

		if (actualLocal == null) {
			tourismBonaAttractionEmployeeInfoImpl.setActualLocal("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setActualLocal(actualLocal);
		}

		if (actualPayroll == null) {
			tourismBonaAttractionEmployeeInfoImpl.setActualPayroll("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setActualPayroll(
				actualPayroll);
		}

		if (projectedPermanent == null) {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedPermanent("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedPermanent(
				projectedPermanent);
		}

		if (projectedTemporary == null) {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedTemporary("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedTemporary(
				projectedTemporary);
		}

		if (projectedForeign == null) {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedForeign("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedForeign(
				projectedForeign);
		}

		if (projectedLocal == null) {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedLocal("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedLocal(
				projectedLocal);
		}

		if (projectedPayroll == null) {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedPayroll("");
		}
		else {
			tourismBonaAttractionEmployeeInfoImpl.setProjectedPayroll(
				projectedPayroll);
		}

		tourismBonaAttractionEmployeeInfoImpl.setTourismApplicationId(
			tourismApplicationId);

		tourismBonaAttractionEmployeeInfoImpl.resetOriginalValues();

		return tourismBonaAttractionEmployeeInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tourismBonaAttrEmpId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		actualPermanent = objectInput.readUTF();
		actualTemporary = objectInput.readUTF();
		actualForeign = objectInput.readUTF();
		actualLocal = objectInput.readUTF();
		actualPayroll = objectInput.readUTF();
		projectedPermanent = objectInput.readUTF();
		projectedTemporary = objectInput.readUTF();
		projectedForeign = objectInput.readUTF();
		projectedLocal = objectInput.readUTF();
		projectedPayroll = objectInput.readUTF();

		tourismApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(tourismBonaAttrEmpId);

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

		if (actualPermanent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actualPermanent);
		}

		if (actualTemporary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actualTemporary);
		}

		if (actualForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actualForeign);
		}

		if (actualLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actualLocal);
		}

		if (actualPayroll == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(actualPayroll);
		}

		if (projectedPermanent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(projectedPermanent);
		}

		if (projectedTemporary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(projectedTemporary);
		}

		if (projectedForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(projectedForeign);
		}

		if (projectedLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(projectedLocal);
		}

		if (projectedPayroll == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(projectedPayroll);
		}

		objectOutput.writeLong(tourismApplicationId);
	}

	public long tourismBonaAttrEmpId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String actualPermanent;
	public String actualTemporary;
	public String actualForeign;
	public String actualLocal;
	public String actualPayroll;
	public String projectedPermanent;
	public String projectedTemporary;
	public String projectedForeign;
	public String projectedLocal;
	public String projectedPayroll;
	public long tourismApplicationId;

}