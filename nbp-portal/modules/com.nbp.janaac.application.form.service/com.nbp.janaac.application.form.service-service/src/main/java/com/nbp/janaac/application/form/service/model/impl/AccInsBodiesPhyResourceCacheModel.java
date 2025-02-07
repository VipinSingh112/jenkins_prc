/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccInsBodiesPhyResource in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccInsBodiesPhyResourceCacheModel
	implements CacheModel<AccInsBodiesPhyResource>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccInsBodiesPhyResourceCacheModel)) {
			return false;
		}

		AccInsBodiesPhyResourceCacheModel accInsBodiesPhyResourceCacheModel =
			(AccInsBodiesPhyResourceCacheModel)object;

		if (accInsBodiesPhyResourceId ==
				accInsBodiesPhyResourceCacheModel.accInsBodiesPhyResourceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accInsBodiesPhyResourceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accInsBodiesPhyResourceId=");
		sb.append(accInsBodiesPhyResourceId);
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
		sb.append(", insBodiesfacilities=");
		sb.append(insBodiesfacilities);
		sb.append(", insSafetyFeatures=");
		sb.append(insSafetyFeatures);
		sb.append(", insSecurityArrangements=");
		sb.append(insSecurityArrangements);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccInsBodiesPhyResource toEntityModel() {
		AccInsBodiesPhyResourceImpl accInsBodiesPhyResourceImpl =
			new AccInsBodiesPhyResourceImpl();

		if (uuid == null) {
			accInsBodiesPhyResourceImpl.setUuid("");
		}
		else {
			accInsBodiesPhyResourceImpl.setUuid(uuid);
		}

		accInsBodiesPhyResourceImpl.setAccInsBodiesPhyResourceId(
			accInsBodiesPhyResourceId);
		accInsBodiesPhyResourceImpl.setGroupId(groupId);
		accInsBodiesPhyResourceImpl.setCompanyId(companyId);
		accInsBodiesPhyResourceImpl.setUserId(userId);

		if (userName == null) {
			accInsBodiesPhyResourceImpl.setUserName("");
		}
		else {
			accInsBodiesPhyResourceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accInsBodiesPhyResourceImpl.setCreateDate(null);
		}
		else {
			accInsBodiesPhyResourceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accInsBodiesPhyResourceImpl.setModifiedDate(null);
		}
		else {
			accInsBodiesPhyResourceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (insBodiesfacilities == null) {
			accInsBodiesPhyResourceImpl.setInsBodiesfacilities("");
		}
		else {
			accInsBodiesPhyResourceImpl.setInsBodiesfacilities(
				insBodiesfacilities);
		}

		if (insSafetyFeatures == null) {
			accInsBodiesPhyResourceImpl.setInsSafetyFeatures("");
		}
		else {
			accInsBodiesPhyResourceImpl.setInsSafetyFeatures(insSafetyFeatures);
		}

		if (insSecurityArrangements == null) {
			accInsBodiesPhyResourceImpl.setInsSecurityArrangements("");
		}
		else {
			accInsBodiesPhyResourceImpl.setInsSecurityArrangements(
				insSecurityArrangements);
		}

		accInsBodiesPhyResourceImpl.setJanaacApplicationId(janaacApplicationId);

		accInsBodiesPhyResourceImpl.resetOriginalValues();

		return accInsBodiesPhyResourceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accInsBodiesPhyResourceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		insBodiesfacilities = objectInput.readUTF();
		insSafetyFeatures = objectInput.readUTF();
		insSecurityArrangements = objectInput.readUTF();

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

		objectOutput.writeLong(accInsBodiesPhyResourceId);

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

		if (insBodiesfacilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insBodiesfacilities);
		}

		if (insSafetyFeatures == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insSafetyFeatures);
		}

		if (insSecurityArrangements == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insSecurityArrangements);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accInsBodiesPhyResourceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String insBodiesfacilities;
	public String insSafetyFeatures;
	public String insSecurityArrangements;
	public long janaacApplicationId;

}