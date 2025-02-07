/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.wra.application.form.service.model.WRAReqIrrigation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing WRAReqIrrigation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class WRAReqIrrigationCacheModel
	implements CacheModel<WRAReqIrrigation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof WRAReqIrrigationCacheModel)) {
			return false;
		}

		WRAReqIrrigationCacheModel wraReqIrrigationCacheModel =
			(WRAReqIrrigationCacheModel)object;

		if (wraReqIrrigationId ==
				wraReqIrrigationCacheModel.wraReqIrrigationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, wraReqIrrigationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{wraReqIrrigationId=");
		sb.append(wraReqIrrigationId);
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
		sb.append(", abstractAreaIrrigated=");
		sb.append(abstractAreaIrrigated);
		sb.append(", abstractSystemIrrigated=");
		sb.append(abstractSystemIrrigated);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public WRAReqIrrigation toEntityModel() {
		WRAReqIrrigationImpl wraReqIrrigationImpl = new WRAReqIrrigationImpl();

		wraReqIrrigationImpl.setWraReqIrrigationId(wraReqIrrigationId);
		wraReqIrrigationImpl.setGroupId(groupId);
		wraReqIrrigationImpl.setCompanyId(companyId);
		wraReqIrrigationImpl.setUserId(userId);

		if (userName == null) {
			wraReqIrrigationImpl.setUserName("");
		}
		else {
			wraReqIrrigationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			wraReqIrrigationImpl.setCreateDate(null);
		}
		else {
			wraReqIrrigationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			wraReqIrrigationImpl.setModifiedDate(null);
		}
		else {
			wraReqIrrigationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (abstractAreaIrrigated == null) {
			wraReqIrrigationImpl.setAbstractAreaIrrigated("");
		}
		else {
			wraReqIrrigationImpl.setAbstractAreaIrrigated(
				abstractAreaIrrigated);
		}

		if (abstractSystemIrrigated == null) {
			wraReqIrrigationImpl.setAbstractSystemIrrigated("");
		}
		else {
			wraReqIrrigationImpl.setAbstractSystemIrrigated(
				abstractSystemIrrigated);
		}

		if (counter == null) {
			wraReqIrrigationImpl.setCounter("");
		}
		else {
			wraReqIrrigationImpl.setCounter(counter);
		}

		wraReqIrrigationImpl.setWraApplicationId(wraApplicationId);

		wraReqIrrigationImpl.resetOriginalValues();

		return wraReqIrrigationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		wraReqIrrigationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		abstractAreaIrrigated = objectInput.readUTF();
		abstractSystemIrrigated = objectInput.readUTF();
		counter = objectInput.readUTF();

		wraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(wraReqIrrigationId);

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

		if (abstractAreaIrrigated == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(abstractAreaIrrigated);
		}

		if (abstractSystemIrrigated == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(abstractSystemIrrigated);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(wraApplicationId);
	}

	public long wraReqIrrigationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String abstractAreaIrrigated;
	public String abstractSystemIrrigated;
	public String counter;
	public long wraApplicationId;

}