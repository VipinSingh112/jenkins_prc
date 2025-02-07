/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevShareCorporationBusAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevShareCorporationBusAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevShareCorporationBusAddCacheModel
	implements CacheModel<SezDevShareCorporationBusAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevShareCorporationBusAddCacheModel)) {
			return false;
		}

		SezDevShareCorporationBusAddCacheModel
			sezDevShareCorporationBusAddCacheModel =
				(SezDevShareCorporationBusAddCacheModel)object;

		if (sezDevCorporationBusinessAddId ==
				sezDevShareCorporationBusAddCacheModel.
					sezDevCorporationBusinessAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevCorporationBusinessAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{sezDevCorporationBusinessAddId=");
		sb.append(sezDevCorporationBusinessAddId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", company=");
		sb.append(company);
		sb.append(", relationship=");
		sb.append(relationship);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevShareCorporationBusAdd toEntityModel() {
		SezDevShareCorporationBusAddImpl sezDevShareCorporationBusAddImpl =
			new SezDevShareCorporationBusAddImpl();

		sezDevShareCorporationBusAddImpl.setSezDevCorporationBusinessAddId(
			sezDevCorporationBusinessAddId);
		sezDevShareCorporationBusAddImpl.setGroupId(groupId);
		sezDevShareCorporationBusAddImpl.setCompanyId(companyId);
		sezDevShareCorporationBusAddImpl.setUserId(userId);

		if (userName == null) {
			sezDevShareCorporationBusAddImpl.setUserName("");
		}
		else {
			sezDevShareCorporationBusAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevShareCorporationBusAddImpl.setCreateDate(null);
		}
		else {
			sezDevShareCorporationBusAddImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevShareCorporationBusAddImpl.setModifiedDate(null);
		}
		else {
			sezDevShareCorporationBusAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (name == null) {
			sezDevShareCorporationBusAddImpl.setName("");
		}
		else {
			sezDevShareCorporationBusAddImpl.setName(name);
		}

		if (company == null) {
			sezDevShareCorporationBusAddImpl.setCompany("");
		}
		else {
			sezDevShareCorporationBusAddImpl.setCompany(company);
		}

		if (relationship == null) {
			sezDevShareCorporationBusAddImpl.setRelationship("");
		}
		else {
			sezDevShareCorporationBusAddImpl.setRelationship(relationship);
		}

		if (counter == null) {
			sezDevShareCorporationBusAddImpl.setCounter("");
		}
		else {
			sezDevShareCorporationBusAddImpl.setCounter(counter);
		}

		sezDevShareCorporationBusAddImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevShareCorporationBusAddImpl.resetOriginalValues();

		return sezDevShareCorporationBusAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevCorporationBusinessAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		company = objectInput.readUTF();
		relationship = objectInput.readUTF();
		counter = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevCorporationBusinessAddId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (company == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(company);
		}

		if (relationship == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(relationship);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevCorporationBusinessAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String company;
	public String relationship;
	public String counter;
	public long sezStatusApplicationId;

}