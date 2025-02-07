/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.SourcesDetailAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SourcesDetailAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SourcesDetailAddCacheModel
	implements CacheModel<SourcesDetailAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SourcesDetailAddCacheModel)) {
			return false;
		}

		SourcesDetailAddCacheModel sourcesDetailAddCacheModel =
			(SourcesDetailAddCacheModel)object;

		if (sourcesDetailAddId ==
				sourcesDetailAddCacheModel.sourcesDetailAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sourcesDetailAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{sourcesDetailAddId=");
		sb.append(sourcesDetailAddId);
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
		sb.append(", sourceIdentification=");
		sb.append(sourceIdentification);
		sb.append(", stateActivity=");
		sb.append(stateActivity);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SourcesDetailAdd toEntityModel() {
		SourcesDetailAddImpl sourcesDetailAddImpl = new SourcesDetailAddImpl();

		sourcesDetailAddImpl.setSourcesDetailAddId(sourcesDetailAddId);
		sourcesDetailAddImpl.setGroupId(groupId);
		sourcesDetailAddImpl.setCompanyId(companyId);
		sourcesDetailAddImpl.setUserId(userId);

		if (userName == null) {
			sourcesDetailAddImpl.setUserName("");
		}
		else {
			sourcesDetailAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sourcesDetailAddImpl.setCreateDate(null);
		}
		else {
			sourcesDetailAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sourcesDetailAddImpl.setModifiedDate(null);
		}
		else {
			sourcesDetailAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sourceIdentification == null) {
			sourcesDetailAddImpl.setSourceIdentification("");
		}
		else {
			sourcesDetailAddImpl.setSourceIdentification(sourceIdentification);
		}

		if (stateActivity == null) {
			sourcesDetailAddImpl.setStateActivity("");
		}
		else {
			sourcesDetailAddImpl.setStateActivity(stateActivity);
		}

		if (counter == null) {
			sourcesDetailAddImpl.setCounter("");
		}
		else {
			sourcesDetailAddImpl.setCounter(counter);
		}

		sourcesDetailAddImpl.setHsraApplicationId(hsraApplicationId);

		sourcesDetailAddImpl.resetOriginalValues();

		return sourcesDetailAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sourcesDetailAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sourceIdentification = objectInput.readUTF();
		stateActivity = objectInput.readUTF();
		counter = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sourcesDetailAddId);

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

		if (sourceIdentification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceIdentification);
		}

		if (stateActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stateActivity);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long sourcesDetailAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String sourceIdentification;
	public String stateActivity;
	public String counter;
	public long hsraApplicationId;

}