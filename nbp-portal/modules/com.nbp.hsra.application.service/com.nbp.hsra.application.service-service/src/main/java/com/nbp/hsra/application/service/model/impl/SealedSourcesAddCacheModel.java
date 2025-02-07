/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.SealedSourcesAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SealedSourcesAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SealedSourcesAddCacheModel
	implements CacheModel<SealedSourcesAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SealedSourcesAddCacheModel)) {
			return false;
		}

		SealedSourcesAddCacheModel sealedSourcesAddCacheModel =
			(SealedSourcesAddCacheModel)object;

		if (sealedSourcesAddId ==
				sealedSourcesAddCacheModel.sealedSourcesAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sealedSourcesAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{sealedSourcesAddId=");
		sb.append(sealedSourcesAddId);
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
		sb.append(", sealedSourcesRadionu=");
		sb.append(sealedSourcesRadionu);
		sb.append(", sealedSourcesMaxActivity=");
		sb.append(sealedSourcesMaxActivity);
		sb.append(", sealedSourcesActivityDate=");
		sb.append(sealedSourcesActivityDate);
		sb.append(", sealedSourcesCategories=");
		sb.append(sealedSourcesCategories);
		sb.append(", sealedSourcesUse=");
		sb.append(sealedSourcesUse);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SealedSourcesAdd toEntityModel() {
		SealedSourcesAddImpl sealedSourcesAddImpl = new SealedSourcesAddImpl();

		sealedSourcesAddImpl.setSealedSourcesAddId(sealedSourcesAddId);
		sealedSourcesAddImpl.setGroupId(groupId);
		sealedSourcesAddImpl.setCompanyId(companyId);
		sealedSourcesAddImpl.setUserId(userId);

		if (userName == null) {
			sealedSourcesAddImpl.setUserName("");
		}
		else {
			sealedSourcesAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sealedSourcesAddImpl.setCreateDate(null);
		}
		else {
			sealedSourcesAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sealedSourcesAddImpl.setModifiedDate(null);
		}
		else {
			sealedSourcesAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sealedSourcesRadionu == null) {
			sealedSourcesAddImpl.setSealedSourcesRadionu("");
		}
		else {
			sealedSourcesAddImpl.setSealedSourcesRadionu(sealedSourcesRadionu);
		}

		if (sealedSourcesMaxActivity == null) {
			sealedSourcesAddImpl.setSealedSourcesMaxActivity("");
		}
		else {
			sealedSourcesAddImpl.setSealedSourcesMaxActivity(
				sealedSourcesMaxActivity);
		}

		if (sealedSourcesActivityDate == Long.MIN_VALUE) {
			sealedSourcesAddImpl.setSealedSourcesActivityDate(null);
		}
		else {
			sealedSourcesAddImpl.setSealedSourcesActivityDate(
				new Date(sealedSourcesActivityDate));
		}

		if (sealedSourcesCategories == null) {
			sealedSourcesAddImpl.setSealedSourcesCategories("");
		}
		else {
			sealedSourcesAddImpl.setSealedSourcesCategories(
				sealedSourcesCategories);
		}

		if (sealedSourcesUse == null) {
			sealedSourcesAddImpl.setSealedSourcesUse("");
		}
		else {
			sealedSourcesAddImpl.setSealedSourcesUse(sealedSourcesUse);
		}

		if (counter == null) {
			sealedSourcesAddImpl.setCounter("");
		}
		else {
			sealedSourcesAddImpl.setCounter(counter);
		}

		sealedSourcesAddImpl.setHsraApplicationId(hsraApplicationId);

		sealedSourcesAddImpl.resetOriginalValues();

		return sealedSourcesAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sealedSourcesAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sealedSourcesRadionu = objectInput.readUTF();
		sealedSourcesMaxActivity = objectInput.readUTF();
		sealedSourcesActivityDate = objectInput.readLong();
		sealedSourcesCategories = objectInput.readUTF();
		sealedSourcesUse = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sealedSourcesAddId);

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

		if (sealedSourcesRadionu == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sealedSourcesRadionu);
		}

		if (sealedSourcesMaxActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sealedSourcesMaxActivity);
		}

		objectOutput.writeLong(sealedSourcesActivityDate);

		if (sealedSourcesCategories == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sealedSourcesCategories);
		}

		if (sealedSourcesUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sealedSourcesUse);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long sealedSourcesAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String sealedSourcesRadionu;
	public String sealedSourcesMaxActivity;
	public long sealedSourcesActivityDate;
	public String sealedSourcesCategories;
	public String sealedSourcesUse;
	public String counter;
	public long hsraApplicationId;

}