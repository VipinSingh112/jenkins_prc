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

import com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneEmpInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneEmpInfoCacheModel
	implements CacheModel<SezZoneEmpInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneEmpInfoCacheModel)) {
			return false;
		}

		SezZoneEmpInfoCacheModel sezZoneEmpInfoCacheModel =
			(SezZoneEmpInfoCacheModel)object;

		if (sezZoneEmpInfoId == sezZoneEmpInfoCacheModel.sezZoneEmpInfoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezZoneEmpInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezZoneEmpInfoId=");
		sb.append(sezZoneEmpInfoId);
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
	public SezZoneEmpInfo toEntityModel() {
		SezZoneEmpInfoImpl sezZoneEmpInfoImpl = new SezZoneEmpInfoImpl();

		sezZoneEmpInfoImpl.setSezZoneEmpInfoId(sezZoneEmpInfoId);
		sezZoneEmpInfoImpl.setGroupId(groupId);
		sezZoneEmpInfoImpl.setCompanyId(companyId);
		sezZoneEmpInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneEmpInfoImpl.setUserName("");
		}
		else {
			sezZoneEmpInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneEmpInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneEmpInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneEmpInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneEmpInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (labourRequirementYear == null) {
			sezZoneEmpInfoImpl.setLabourRequirementYear("");
		}
		else {
			sezZoneEmpInfoImpl.setLabourRequirementYear(labourRequirementYear);
		}

		if (labourRequirementDirect == null) {
			sezZoneEmpInfoImpl.setLabourRequirementDirect("");
		}
		else {
			sezZoneEmpInfoImpl.setLabourRequirementDirect(
				labourRequirementDirect);
		}

		if (labourRequirementMale == null) {
			sezZoneEmpInfoImpl.setLabourRequirementMale("");
		}
		else {
			sezZoneEmpInfoImpl.setLabourRequirementMale(labourRequirementMale);
		}

		if (labourRequirementFemale == null) {
			sezZoneEmpInfoImpl.setLabourRequirementFemale("");
		}
		else {
			sezZoneEmpInfoImpl.setLabourRequirementFemale(
				labourRequirementFemale);
		}

		if (labourRequirementLocal == null) {
			sezZoneEmpInfoImpl.setLabourRequirementLocal("");
		}
		else {
			sezZoneEmpInfoImpl.setLabourRequirementLocal(
				labourRequirementLocal);
		}

		if (labourRequirementForeign == null) {
			sezZoneEmpInfoImpl.setLabourRequirementForeign("");
		}
		else {
			sezZoneEmpInfoImpl.setLabourRequirementForeign(
				labourRequirementForeign);
		}

		if (counter == null) {
			sezZoneEmpInfoImpl.setCounter("");
		}
		else {
			sezZoneEmpInfoImpl.setCounter(counter);
		}

		sezZoneEmpInfoImpl.setSezStatusApplicationId(sezStatusApplicationId);

		sezZoneEmpInfoImpl.resetOriginalValues();

		return sezZoneEmpInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezZoneEmpInfoId = objectInput.readLong();

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

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezZoneEmpInfoId);

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

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezZoneEmpInfoId;
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
	public long sezStatusApplicationId;

}