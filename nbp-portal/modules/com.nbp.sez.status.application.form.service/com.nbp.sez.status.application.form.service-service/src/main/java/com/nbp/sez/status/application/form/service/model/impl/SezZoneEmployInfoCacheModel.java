/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezZoneEmployInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezZoneEmployInfoCacheModel
	implements CacheModel<SezZoneEmployInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezZoneEmployInfoCacheModel)) {
			return false;
		}

		SezZoneEmployInfoCacheModel sezZoneEmployInfoCacheModel =
			(SezZoneEmployInfoCacheModel)object;

		if (sezZoneEmpInfoId == sezZoneEmployInfoCacheModel.sezZoneEmpInfoId) {
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
	public SezZoneEmployInfo toEntityModel() {
		SezZoneEmployInfoImpl sezZoneEmployInfoImpl =
			new SezZoneEmployInfoImpl();

		sezZoneEmployInfoImpl.setSezZoneEmpInfoId(sezZoneEmpInfoId);
		sezZoneEmployInfoImpl.setGroupId(groupId);
		sezZoneEmployInfoImpl.setCompanyId(companyId);
		sezZoneEmployInfoImpl.setUserId(userId);

		if (userName == null) {
			sezZoneEmployInfoImpl.setUserName("");
		}
		else {
			sezZoneEmployInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezZoneEmployInfoImpl.setCreateDate(null);
		}
		else {
			sezZoneEmployInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezZoneEmployInfoImpl.setModifiedDate(null);
		}
		else {
			sezZoneEmployInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (labourRequirementYear == null) {
			sezZoneEmployInfoImpl.setLabourRequirementYear("");
		}
		else {
			sezZoneEmployInfoImpl.setLabourRequirementYear(
				labourRequirementYear);
		}

		if (labourRequirementDirect == null) {
			sezZoneEmployInfoImpl.setLabourRequirementDirect("");
		}
		else {
			sezZoneEmployInfoImpl.setLabourRequirementDirect(
				labourRequirementDirect);
		}

		if (labourRequirementMale == null) {
			sezZoneEmployInfoImpl.setLabourRequirementMale("");
		}
		else {
			sezZoneEmployInfoImpl.setLabourRequirementMale(
				labourRequirementMale);
		}

		if (labourRequirementFemale == null) {
			sezZoneEmployInfoImpl.setLabourRequirementFemale("");
		}
		else {
			sezZoneEmployInfoImpl.setLabourRequirementFemale(
				labourRequirementFemale);
		}

		if (labourRequirementLocal == null) {
			sezZoneEmployInfoImpl.setLabourRequirementLocal("");
		}
		else {
			sezZoneEmployInfoImpl.setLabourRequirementLocal(
				labourRequirementLocal);
		}

		if (labourRequirementForeign == null) {
			sezZoneEmployInfoImpl.setLabourRequirementForeign("");
		}
		else {
			sezZoneEmployInfoImpl.setLabourRequirementForeign(
				labourRequirementForeign);
		}

		if (counter == null) {
			sezZoneEmployInfoImpl.setCounter("");
		}
		else {
			sezZoneEmployInfoImpl.setCounter(counter);
		}

		sezZoneEmployInfoImpl.setSezStatusApplicationId(sezStatusApplicationId);

		sezZoneEmployInfoImpl.resetOriginalValues();

		return sezZoneEmployInfoImpl;
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