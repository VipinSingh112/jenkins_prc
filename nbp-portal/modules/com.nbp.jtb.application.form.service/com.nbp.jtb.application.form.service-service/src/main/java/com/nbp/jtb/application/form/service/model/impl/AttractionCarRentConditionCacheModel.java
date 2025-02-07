/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionCarRentCondition;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionCarRentCondition in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionCarRentConditionCacheModel
	implements CacheModel<AttractionCarRentCondition>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionCarRentConditionCacheModel)) {
			return false;
		}

		AttractionCarRentConditionCacheModel
			attractionCarRentConditionCacheModel =
				(AttractionCarRentConditionCacheModel)object;

		if (attractionCarRenConditId ==
				attractionCarRentConditionCacheModel.attractionCarRenConditId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionCarRenConditId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{attractionCarRenConditId=");
		sb.append(attractionCarRenConditId);
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
		sb.append(", ncrConditionProp=");
		sb.append(ncrConditionProp);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionCarRentCondition toEntityModel() {
		AttractionCarRentConditionImpl attractionCarRentConditionImpl =
			new AttractionCarRentConditionImpl();

		attractionCarRentConditionImpl.setAttractionCarRenConditId(
			attractionCarRenConditId);
		attractionCarRentConditionImpl.setGroupId(groupId);
		attractionCarRentConditionImpl.setCompanyId(companyId);
		attractionCarRentConditionImpl.setUserId(userId);

		if (userName == null) {
			attractionCarRentConditionImpl.setUserName("");
		}
		else {
			attractionCarRentConditionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionCarRentConditionImpl.setCreateDate(null);
		}
		else {
			attractionCarRentConditionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionCarRentConditionImpl.setModifiedDate(null);
		}
		else {
			attractionCarRentConditionImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (ncrConditionProp == null) {
			attractionCarRentConditionImpl.setNcrConditionProp("");
		}
		else {
			attractionCarRentConditionImpl.setNcrConditionProp(
				ncrConditionProp);
		}

		attractionCarRentConditionImpl.setJtbApplicationId(jtbApplicationId);

		attractionCarRentConditionImpl.resetOriginalValues();

		return attractionCarRentConditionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionCarRenConditId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ncrConditionProp = objectInput.readUTF();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionCarRenConditId);

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

		if (ncrConditionProp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ncrConditionProp);
		}

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionCarRenConditId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ncrConditionProp;
	public long jtbApplicationId;

}