/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevEmplomentInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevEmplomentInfoCacheModel
	implements CacheModel<SezDevEmplomentInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevEmplomentInfoCacheModel)) {
			return false;
		}

		SezDevEmplomentInfoCacheModel sezDevEmplomentInfoCacheModel =
			(SezDevEmplomentInfoCacheModel)object;

		if (sezDevEmplomentInfoId ==
				sezDevEmplomentInfoCacheModel.sezDevEmplomentInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevEmplomentInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{sezDevEmplomentInfoId=");
		sb.append(sezDevEmplomentInfoId);
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
		sb.append(", firstYearDirect=");
		sb.append(firstYearDirect);
		sb.append(", firstYearInDirect=");
		sb.append(firstYearInDirect);
		sb.append(", firstYearMale=");
		sb.append(firstYearMale);
		sb.append(", firstYearFemale=");
		sb.append(firstYearFemale);
		sb.append(", firstYearLocal=");
		sb.append(firstYearLocal);
		sb.append(", firstYearForeign=");
		sb.append(firstYearForeign);
		sb.append(", secondYearDirect=");
		sb.append(secondYearDirect);
		sb.append(", secondYearIndirect=");
		sb.append(secondYearIndirect);
		sb.append(", secondYearMale=");
		sb.append(secondYearMale);
		sb.append(", secondYearFemale=");
		sb.append(secondYearFemale);
		sb.append(", secondYearLocal=");
		sb.append(secondYearLocal);
		sb.append(", secondYearForeign=");
		sb.append(secondYearForeign);
		sb.append(", thirdYearDirect=");
		sb.append(thirdYearDirect);
		sb.append(", thirdYearIndirect=");
		sb.append(thirdYearIndirect);
		sb.append(", thirdYearMale=");
		sb.append(thirdYearMale);
		sb.append(", thirdYearFemale=");
		sb.append(thirdYearFemale);
		sb.append(", thirdYearLocal=");
		sb.append(thirdYearLocal);
		sb.append(", thirdYearForeign=");
		sb.append(thirdYearForeign);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevEmplomentInfo toEntityModel() {
		SezDevEmplomentInfoImpl sezDevEmplomentInfoImpl =
			new SezDevEmplomentInfoImpl();

		sezDevEmplomentInfoImpl.setSezDevEmplomentInfoId(sezDevEmplomentInfoId);
		sezDevEmplomentInfoImpl.setGroupId(groupId);
		sezDevEmplomentInfoImpl.setCompanyId(companyId);
		sezDevEmplomentInfoImpl.setUserId(userId);

		if (userName == null) {
			sezDevEmplomentInfoImpl.setUserName("");
		}
		else {
			sezDevEmplomentInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevEmplomentInfoImpl.setCreateDate(null);
		}
		else {
			sezDevEmplomentInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevEmplomentInfoImpl.setModifiedDate(null);
		}
		else {
			sezDevEmplomentInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstYearDirect == null) {
			sezDevEmplomentInfoImpl.setFirstYearDirect("");
		}
		else {
			sezDevEmplomentInfoImpl.setFirstYearDirect(firstYearDirect);
		}

		if (firstYearInDirect == null) {
			sezDevEmplomentInfoImpl.setFirstYearInDirect("");
		}
		else {
			sezDevEmplomentInfoImpl.setFirstYearInDirect(firstYearInDirect);
		}

		if (firstYearMale == null) {
			sezDevEmplomentInfoImpl.setFirstYearMale("");
		}
		else {
			sezDevEmplomentInfoImpl.setFirstYearMale(firstYearMale);
		}

		if (firstYearFemale == null) {
			sezDevEmplomentInfoImpl.setFirstYearFemale("");
		}
		else {
			sezDevEmplomentInfoImpl.setFirstYearFemale(firstYearFemale);
		}

		if (firstYearLocal == null) {
			sezDevEmplomentInfoImpl.setFirstYearLocal("");
		}
		else {
			sezDevEmplomentInfoImpl.setFirstYearLocal(firstYearLocal);
		}

		if (firstYearForeign == null) {
			sezDevEmplomentInfoImpl.setFirstYearForeign("");
		}
		else {
			sezDevEmplomentInfoImpl.setFirstYearForeign(firstYearForeign);
		}

		if (secondYearDirect == null) {
			sezDevEmplomentInfoImpl.setSecondYearDirect("");
		}
		else {
			sezDevEmplomentInfoImpl.setSecondYearDirect(secondYearDirect);
		}

		if (secondYearIndirect == null) {
			sezDevEmplomentInfoImpl.setSecondYearIndirect("");
		}
		else {
			sezDevEmplomentInfoImpl.setSecondYearIndirect(secondYearIndirect);
		}

		if (secondYearMale == null) {
			sezDevEmplomentInfoImpl.setSecondYearMale("");
		}
		else {
			sezDevEmplomentInfoImpl.setSecondYearMale(secondYearMale);
		}

		if (secondYearFemale == null) {
			sezDevEmplomentInfoImpl.setSecondYearFemale("");
		}
		else {
			sezDevEmplomentInfoImpl.setSecondYearFemale(secondYearFemale);
		}

		if (secondYearLocal == null) {
			sezDevEmplomentInfoImpl.setSecondYearLocal("");
		}
		else {
			sezDevEmplomentInfoImpl.setSecondYearLocal(secondYearLocal);
		}

		if (secondYearForeign == null) {
			sezDevEmplomentInfoImpl.setSecondYearForeign("");
		}
		else {
			sezDevEmplomentInfoImpl.setSecondYearForeign(secondYearForeign);
		}

		if (thirdYearDirect == null) {
			sezDevEmplomentInfoImpl.setThirdYearDirect("");
		}
		else {
			sezDevEmplomentInfoImpl.setThirdYearDirect(thirdYearDirect);
		}

		if (thirdYearIndirect == null) {
			sezDevEmplomentInfoImpl.setThirdYearIndirect("");
		}
		else {
			sezDevEmplomentInfoImpl.setThirdYearIndirect(thirdYearIndirect);
		}

		if (thirdYearMale == null) {
			sezDevEmplomentInfoImpl.setThirdYearMale("");
		}
		else {
			sezDevEmplomentInfoImpl.setThirdYearMale(thirdYearMale);
		}

		if (thirdYearFemale == null) {
			sezDevEmplomentInfoImpl.setThirdYearFemale("");
		}
		else {
			sezDevEmplomentInfoImpl.setThirdYearFemale(thirdYearFemale);
		}

		if (thirdYearLocal == null) {
			sezDevEmplomentInfoImpl.setThirdYearLocal("");
		}
		else {
			sezDevEmplomentInfoImpl.setThirdYearLocal(thirdYearLocal);
		}

		if (thirdYearForeign == null) {
			sezDevEmplomentInfoImpl.setThirdYearForeign("");
		}
		else {
			sezDevEmplomentInfoImpl.setThirdYearForeign(thirdYearForeign);
		}

		sezDevEmplomentInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevEmplomentInfoImpl.resetOriginalValues();

		return sezDevEmplomentInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevEmplomentInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstYearDirect = objectInput.readUTF();
		firstYearInDirect = objectInput.readUTF();
		firstYearMale = objectInput.readUTF();
		firstYearFemale = objectInput.readUTF();
		firstYearLocal = objectInput.readUTF();
		firstYearForeign = objectInput.readUTF();
		secondYearDirect = objectInput.readUTF();
		secondYearIndirect = objectInput.readUTF();
		secondYearMale = objectInput.readUTF();
		secondYearFemale = objectInput.readUTF();
		secondYearLocal = objectInput.readUTF();
		secondYearForeign = objectInput.readUTF();
		thirdYearDirect = objectInput.readUTF();
		thirdYearIndirect = objectInput.readUTF();
		thirdYearMale = objectInput.readUTF();
		thirdYearFemale = objectInput.readUTF();
		thirdYearLocal = objectInput.readUTF();
		thirdYearForeign = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevEmplomentInfoId);

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

		if (firstYearDirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstYearDirect);
		}

		if (firstYearInDirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstYearInDirect);
		}

		if (firstYearMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstYearMale);
		}

		if (firstYearFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstYearFemale);
		}

		if (firstYearLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstYearLocal);
		}

		if (firstYearForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstYearForeign);
		}

		if (secondYearDirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondYearDirect);
		}

		if (secondYearIndirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondYearIndirect);
		}

		if (secondYearMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondYearMale);
		}

		if (secondYearFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondYearFemale);
		}

		if (secondYearLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondYearLocal);
		}

		if (secondYearForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondYearForeign);
		}

		if (thirdYearDirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdYearDirect);
		}

		if (thirdYearIndirect == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdYearIndirect);
		}

		if (thirdYearMale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdYearMale);
		}

		if (thirdYearFemale == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdYearFemale);
		}

		if (thirdYearLocal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdYearLocal);
		}

		if (thirdYearForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thirdYearForeign);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevEmplomentInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstYearDirect;
	public String firstYearInDirect;
	public String firstYearMale;
	public String firstYearFemale;
	public String firstYearLocal;
	public String firstYearForeign;
	public String secondYearDirect;
	public String secondYearIndirect;
	public String secondYearMale;
	public String secondYearFemale;
	public String secondYearLocal;
	public String secondYearForeign;
	public String thirdYearDirect;
	public String thirdYearIndirect;
	public String thirdYearMale;
	public String thirdYearFemale;
	public String thirdYearLocal;
	public String thirdYearForeign;
	public long sezStatusApplicationId;

}