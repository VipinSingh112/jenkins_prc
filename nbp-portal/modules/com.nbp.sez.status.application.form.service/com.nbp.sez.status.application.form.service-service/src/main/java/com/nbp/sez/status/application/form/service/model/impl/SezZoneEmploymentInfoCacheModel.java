/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneEmploymentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneEmploymentInfoCacheModel
	implements CacheModel<SezZoneEmploymentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneEmploymentInfoCacheModel)) {
			return false;
		}

		SezZoneEmploymentInfoCacheModel sezZoneEmploymentInfoCacheModel =
			(SezZoneEmploymentInfoCacheModel)object;

		if (sezZoneEmploymentInfoId ==
				sezZoneEmploymentInfoCacheModel.sezZoneEmploymentInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneEmploymentInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezZoneEmploymentInfoId=");
		sb.append(sezZoneEmploymentInfoId);
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
		sb.append(", labourRequirementYear=");
		sb.append(labourRequirementYear);
		sb.append(", labourRequirementDirect=");
		sb.append(labourRequirementDirect);
		sb.append(", labourRequirementMale=");
		sb.append(labourRequirementMale);
		sb.append(", labourRequirementFemale=");
		sb.append(labourRequirementFemale);
		sb.append(", labourRequirementLocal=");
		sb.append(labourRequirementLocal);
		sb.append(", labourRequirementForeign=");
		sb.append(labourRequirementForeign);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezZoneEmploymentInfo toEntityModel() {
		SezZoneEmploymentInfoImpl sezZoneEmploymentInfoImpl =
			new SezZoneEmploymentInfoImpl();

		sezZoneEmploymentInfoImpl.setSezZoneEmploymentInfoId(
			sezZoneEmploymentInfoId);
		sezZoneEmploymentInfoImpl.setGroupId(groupId);
		sezZoneEmploymentInfoImpl.setCompanyId(companyId);
		sezZoneEmploymentInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneEmploymentInfoImpl.setUserName("");
		}
		else {
			sezZoneEmploymentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneEmploymentInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneEmploymentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneEmploymentInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneEmploymentInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (labourRequirementYear == null) {
			sezZoneEmploymentInfoImpl.setLabourRequirementYear("");
		}
		else {
			sezZoneEmploymentInfoImpl.setLabourRequirementYear(
				labourRequirementYear);
		}

		if (labourRequirementDirect == null) {
			sezZoneEmploymentInfoImpl.setLabourRequirementDirect("");
		}
		else {
			sezZoneEmploymentInfoImpl.setLabourRequirementDirect(
				labourRequirementDirect);
		}

		if (labourRequirementMale == null) {
			sezZoneEmploymentInfoImpl.setLabourRequirementMale("");
		}
		else {
			sezZoneEmploymentInfoImpl.setLabourRequirementMale(
				labourRequirementMale);
		}

		if (labourRequirementFemale == null) {
			sezZoneEmploymentInfoImpl.setLabourRequirementFemale("");
		}
		else {
			sezZoneEmploymentInfoImpl.setLabourRequirementFemale(
				labourRequirementFemale);
		}

		if (labourRequirementLocal == null) {
			sezZoneEmploymentInfoImpl.setLabourRequirementLocal("");
		}
		else {
			sezZoneEmploymentInfoImpl.setLabourRequirementLocal(
				labourRequirementLocal);
		}

		if (labourRequirementForeign == null) {
			sezZoneEmploymentInfoImpl.setLabourRequirementForeign("");
		}
		else {
			sezZoneEmploymentInfoImpl.setLabourRequirementForeign(
				labourRequirementForeign);
		}

		if (counter == null) {
			sezZoneEmploymentInfoImpl.setCounter("");
		}
		else {
			sezZoneEmploymentInfoImpl.setCounter(counter);
		}

		if (sezStatusApplicationId == null) {
			sezZoneEmploymentInfoImpl.setSezStatusApplicationId("");
		}
		else {
			sezZoneEmploymentInfoImpl.setSezStatusApplicationId(
				sezStatusApplicationId);
		}

		sezZoneEmploymentInfoImpl.resetOriginalValues();

		return sezZoneEmploymentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneEmploymentInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		labourRequirementYear = objectInput.readUTF();
		labourRequirementDirect = objectInput.readUTF();
		labourRequirementMale = objectInput.readUTF();
		labourRequirementFemale = objectInput.readUTF();
		labourRequirementLocal = objectInput.readUTF();
		labourRequirementForeign = objectInput.readUTF();
		counter = objectInput.readUTF();
		sezStatusApplicationId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneEmploymentInfoId);

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

		if (labourRequirementYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourRequirementYear);
		}

		if (labourRequirementDirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourRequirementDirect);
		}

		if (labourRequirementMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourRequirementMale);
		}

		if (labourRequirementFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourRequirementFemale);
		}

		if (labourRequirementLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourRequirementLocal);
		}

		if (labourRequirementForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourRequirementForeign);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		if (sezStatusApplicationId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sezStatusApplicationId);
		}
	}

	public long sezZoneEmploymentInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String labourRequirementYear;
	public String labourRequirementDirect;
	public String labourRequirementMale;
	public String labourRequirementFemale;
	public String labourRequirementLocal;
	public String labourRequirementForeign;
	public String counter;
	public String sezStatusApplicationId;

}