/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.DetailOfSources;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DetailOfSources in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DetailOfSourcesCacheModel
	implements CacheModel<DetailOfSources>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DetailOfSourcesCacheModel)) {
			return false;
		}

		DetailOfSourcesCacheModel detailOfSourcesCacheModel =
			(DetailOfSourcesCacheModel)object;

		if (detailOfSourcesId == detailOfSourcesCacheModel.detailOfSourcesId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, detailOfSourcesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{detailOfSourcesId=");
		sb.append(detailOfSourcesId);
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
		sb.append(", sourceLocation=");
		sb.append(sourceLocation);
		sb.append(", stateActivity=");
		sb.append(stateActivity);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DetailOfSources toEntityModel() {
		DetailOfSourcesImpl detailOfSourcesImpl = new DetailOfSourcesImpl();

		detailOfSourcesImpl.setDetailOfSourcesId(detailOfSourcesId);
		detailOfSourcesImpl.setGroupId(groupId);
		detailOfSourcesImpl.setCompanyId(companyId);
		detailOfSourcesImpl.setUserId(userId);

		if (userName == null) {
			detailOfSourcesImpl.setUserName("");
		}
		else {
			detailOfSourcesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			detailOfSourcesImpl.setCreateDate(null);
		}
		else {
			detailOfSourcesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			detailOfSourcesImpl.setModifiedDate(null);
		}
		else {
			detailOfSourcesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (sourceIdentification == null) {
			detailOfSourcesImpl.setSourceIdentification("");
		}
		else {
			detailOfSourcesImpl.setSourceIdentification(sourceIdentification);
		}

		if (sourceLocation == null) {
			detailOfSourcesImpl.setSourceLocation("");
		}
		else {
			detailOfSourcesImpl.setSourceLocation(sourceLocation);
		}

		if (stateActivity == null) {
			detailOfSourcesImpl.setStateActivity("");
		}
		else {
			detailOfSourcesImpl.setStateActivity(stateActivity);
		}

		detailOfSourcesImpl.setHsraApplicationId(hsraApplicationId);

		detailOfSourcesImpl.resetOriginalValues();

		return detailOfSourcesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		detailOfSourcesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		sourceIdentification = objectInput.readUTF();
		sourceLocation = objectInput.readUTF();
		stateActivity = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(detailOfSourcesId);

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

		if (sourceLocation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceLocation);
		}

		if (stateActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(stateActivity);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long detailOfSourcesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String sourceIdentification;
	public String sourceLocation;
	public String stateActivity;
	public long hsraApplicationId;

}