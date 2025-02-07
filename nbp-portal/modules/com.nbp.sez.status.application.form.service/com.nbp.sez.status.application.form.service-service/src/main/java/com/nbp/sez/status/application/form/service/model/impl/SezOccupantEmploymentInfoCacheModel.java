/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantEmploymentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantEmploymentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantEmploymentInfoCacheModel
	implements CacheModel<SezOccupantEmploymentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezOccupantEmploymentInfoCacheModel)) {
			return false;
		}

		SezOccupantEmploymentInfoCacheModel
			sezOccupantEmploymentInfoCacheModel =
				(SezOccupantEmploymentInfoCacheModel)object;

		if (sezOccEmpId == sezOccupantEmploymentInfoCacheModel.sezOccEmpId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccEmpId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezOccEmpId=");
		sb.append(sezOccEmpId);
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
		sb.append(", occLabourYear=");
		sb.append(occLabourYear);
		sb.append(", occLabourDirect=");
		sb.append(occLabourDirect);
		sb.append(", occLabourMale=");
		sb.append(occLabourMale);
		sb.append(", occLabourFemale=");
		sb.append(occLabourFemale);
		sb.append(", occLabourLocal=");
		sb.append(occLabourLocal);
		sb.append(", occLabourForeign=");
		sb.append(occLabourForeign);
		sb.append(", occEmpCounter=");
		sb.append(occEmpCounter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantEmploymentInfo toEntityModel() {
		SezOccupantEmploymentInfoImpl sezOccupantEmploymentInfoImpl =
			new SezOccupantEmploymentInfoImpl();

		sezOccupantEmploymentInfoImpl.setSezOccEmpId(sezOccEmpId);
		sezOccupantEmploymentInfoImpl.setGroupId(groupId);
		sezOccupantEmploymentInfoImpl.setCompanyId(companyId);
		sezOccupantEmploymentInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantEmploymentInfoImpl.setUserName("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantEmploymentInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantEmploymentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantEmploymentInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupantEmploymentInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occLabourYear == null) {
			sezOccupantEmploymentInfoImpl.setOccLabourYear("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setOccLabourYear(occLabourYear);
		}

		if (occLabourDirect == null) {
			sezOccupantEmploymentInfoImpl.setOccLabourDirect("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setOccLabourDirect(occLabourDirect);
		}

		if (occLabourMale == null) {
			sezOccupantEmploymentInfoImpl.setOccLabourMale("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setOccLabourMale(occLabourMale);
		}

		if (occLabourFemale == null) {
			sezOccupantEmploymentInfoImpl.setOccLabourFemale("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setOccLabourFemale(occLabourFemale);
		}

		if (occLabourLocal == null) {
			sezOccupantEmploymentInfoImpl.setOccLabourLocal("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setOccLabourLocal(occLabourLocal);
		}

		if (occLabourForeign == null) {
			sezOccupantEmploymentInfoImpl.setOccLabourForeign("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setOccLabourForeign(occLabourForeign);
		}

		if (occEmpCounter == null) {
			sezOccupantEmploymentInfoImpl.setOccEmpCounter("");
		}
		else {
			sezOccupantEmploymentInfoImpl.setOccEmpCounter(occEmpCounter);
		}

		sezOccupantEmploymentInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupantEmploymentInfoImpl.resetOriginalValues();

		return sezOccupantEmploymentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccEmpId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occLabourYear = objectInput.readUTF();
		occLabourDirect = objectInput.readUTF();
		occLabourMale = objectInput.readUTF();
		occLabourFemale = objectInput.readUTF();
		occLabourLocal = objectInput.readUTF();
		occLabourForeign = objectInput.readUTF();
		occEmpCounter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccEmpId);

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

		if (occLabourYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occLabourYear);
		}

		if (occLabourDirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occLabourDirect);
		}

		if (occLabourMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occLabourMale);
		}

		if (occLabourFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occLabourFemale);
		}

		if (occLabourLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occLabourLocal);
		}

		if (occLabourForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occLabourForeign);
		}

		if (occEmpCounter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occEmpCounter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccEmpId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occLabourYear;
	public String occLabourDirect;
	public String occLabourMale;
	public String occLabourFemale;
	public String occLabourLocal;
	public String occLabourForeign;
	public String occEmpCounter;
	public long sezStatusApplicationId;

}