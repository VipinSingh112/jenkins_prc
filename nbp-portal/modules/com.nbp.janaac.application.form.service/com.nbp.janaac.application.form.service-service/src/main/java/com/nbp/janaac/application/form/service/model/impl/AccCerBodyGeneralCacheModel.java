/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyGeneral;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyGeneral in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyGeneralCacheModel
	implements CacheModel<AccCerBodyGeneral>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyGeneralCacheModel)) {
			return false;
		}

		AccCerBodyGeneralCacheModel accCerBodyGeneralCacheModel =
			(AccCerBodyGeneralCacheModel)object;

		if (accCerBodyGeneralId ==
				accCerBodyGeneralCacheModel.accCerBodyGeneralId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyGeneralId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyGeneralId=");
		sb.append(accCerBodyGeneralId);
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
		sb.append(", cerLegalEntity=");
		sb.append(cerLegalEntity);
		sb.append(", cerLegalStatusEntity=");
		sb.append(cerLegalStatusEntity);
		sb.append(", cerMajorIncomeSources=");
		sb.append(cerMajorIncomeSources);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccCerBodyGeneral toEntityModel() {
		AccCerBodyGeneralImpl accCerBodyGeneralImpl =
			new AccCerBodyGeneralImpl();

		if (uuid == null) {
			accCerBodyGeneralImpl.setUuid("");
		}
		else {
			accCerBodyGeneralImpl.setUuid(uuid);
		}

		accCerBodyGeneralImpl.setAccCerBodyGeneralId(accCerBodyGeneralId);
		accCerBodyGeneralImpl.setGroupId(groupId);
		accCerBodyGeneralImpl.setCompanyId(companyId);
		accCerBodyGeneralImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyGeneralImpl.setUserName("");
		}
		else {
			accCerBodyGeneralImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyGeneralImpl.setCreateDate(null);
		}
		else {
			accCerBodyGeneralImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyGeneralImpl.setModifiedDate(null);
		}
		else {
			accCerBodyGeneralImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (cerLegalEntity == null) {
			accCerBodyGeneralImpl.setCerLegalEntity("");
		}
		else {
			accCerBodyGeneralImpl.setCerLegalEntity(cerLegalEntity);
		}

		if (cerLegalStatusEntity == null) {
			accCerBodyGeneralImpl.setCerLegalStatusEntity("");
		}
		else {
			accCerBodyGeneralImpl.setCerLegalStatusEntity(cerLegalStatusEntity);
		}

		if (cerMajorIncomeSources == null) {
			accCerBodyGeneralImpl.setCerMajorIncomeSources("");
		}
		else {
			accCerBodyGeneralImpl.setCerMajorIncomeSources(
				cerMajorIncomeSources);
		}

		accCerBodyGeneralImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyGeneralImpl.resetOriginalValues();

		return accCerBodyGeneralImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyGeneralId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		cerLegalEntity = objectInput.readUTF();
		cerLegalStatusEntity = objectInput.readUTF();
		cerMajorIncomeSources = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accCerBodyGeneralId);

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

		if (cerLegalEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cerLegalEntity);
		}

		if (cerLegalStatusEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cerLegalStatusEntity);
		}

		if (cerMajorIncomeSources == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cerMajorIncomeSources);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accCerBodyGeneralId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String cerLegalEntity;
	public String cerLegalStatusEntity;
	public String cerMajorIncomeSources;
	public long janaacApplicationId;

}