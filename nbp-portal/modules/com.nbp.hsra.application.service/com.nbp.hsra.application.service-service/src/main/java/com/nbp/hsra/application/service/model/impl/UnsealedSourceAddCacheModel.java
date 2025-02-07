/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.UnsealedSourceAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UnsealedSourceAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UnsealedSourceAddCacheModel
	implements CacheModel<UnsealedSourceAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UnsealedSourceAddCacheModel)) {
			return false;
		}

		UnsealedSourceAddCacheModel unsealedSourceAddCacheModel =
			(UnsealedSourceAddCacheModel)object;

		if (unsealedSourceAddId ==
				unsealedSourceAddCacheModel.unsealedSourceAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, unsealedSourceAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{unsealedSourceAddId=");
		sb.append(unsealedSourceAddId);
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
		sb.append(", unsealedSourcesRadionu=");
		sb.append(unsealedSourcesRadionu);
		sb.append(", unsealedSourcesActivity=");
		sb.append(unsealedSourcesActivity);
		sb.append(", unsealedSourcesTotalYear=");
		sb.append(unsealedSourcesTotalYear);
		sb.append(", unsealedSourcesUse=");
		sb.append(unsealedSourcesUse);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UnsealedSourceAdd toEntityModel() {
		UnsealedSourceAddImpl unsealedSourceAddImpl =
			new UnsealedSourceAddImpl();

		unsealedSourceAddImpl.setUnsealedSourceAddId(unsealedSourceAddId);
		unsealedSourceAddImpl.setGroupId(groupId);
		unsealedSourceAddImpl.setCompanyId(companyId);
		unsealedSourceAddImpl.setUserId(userId);

		if (userName == null) {
			unsealedSourceAddImpl.setUserName("");
		}
		else {
			unsealedSourceAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			unsealedSourceAddImpl.setCreateDate(null);
		}
		else {
			unsealedSourceAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			unsealedSourceAddImpl.setModifiedDate(null);
		}
		else {
			unsealedSourceAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (unsealedSourcesRadionu == null) {
			unsealedSourceAddImpl.setUnsealedSourcesRadionu("");
		}
		else {
			unsealedSourceAddImpl.setUnsealedSourcesRadionu(
				unsealedSourcesRadionu);
		}

		if (unsealedSourcesActivity == null) {
			unsealedSourceAddImpl.setUnsealedSourcesActivity("");
		}
		else {
			unsealedSourceAddImpl.setUnsealedSourcesActivity(
				unsealedSourcesActivity);
		}

		if (unsealedSourcesTotalYear == null) {
			unsealedSourceAddImpl.setUnsealedSourcesTotalYear("");
		}
		else {
			unsealedSourceAddImpl.setUnsealedSourcesTotalYear(
				unsealedSourcesTotalYear);
		}

		if (unsealedSourcesUse == null) {
			unsealedSourceAddImpl.setUnsealedSourcesUse("");
		}
		else {
			unsealedSourceAddImpl.setUnsealedSourcesUse(unsealedSourcesUse);
		}

		if (counter == null) {
			unsealedSourceAddImpl.setCounter("");
		}
		else {
			unsealedSourceAddImpl.setCounter(counter);
		}

		unsealedSourceAddImpl.setHsraApplicationId(hsraApplicationId);

		unsealedSourceAddImpl.resetOriginalValues();

		return unsealedSourceAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		unsealedSourceAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		unsealedSourcesRadionu = objectInput.readUTF();
		unsealedSourcesActivity = objectInput.readUTF();
		unsealedSourcesTotalYear = objectInput.readUTF();
		unsealedSourcesUse = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(unsealedSourceAddId);

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

		if (unsealedSourcesRadionu == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsealedSourcesRadionu);
		}

		if (unsealedSourcesActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsealedSourcesActivity);
		}

		if (unsealedSourcesTotalYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsealedSourcesTotalYear);
		}

		if (unsealedSourcesUse == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(unsealedSourcesUse);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long unsealedSourceAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String unsealedSourcesRadionu;
	public String unsealedSourcesActivity;
	public String unsealedSourcesTotalYear;
	public String unsealedSourcesUse;
	public String counter;
	public long hsraApplicationId;

}