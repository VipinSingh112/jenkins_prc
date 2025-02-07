/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.creative.application.form.service.model.CreativeContactInfoAddBox;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CreativeContactInfoAddBox in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CreativeContactInfoAddBoxCacheModel
	implements CacheModel<CreativeContactInfoAddBox>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CreativeContactInfoAddBoxCacheModel)) {
			return false;
		}

		CreativeContactInfoAddBoxCacheModel
			creativeContactInfoAddBoxCacheModel =
				(CreativeContactInfoAddBoxCacheModel)object;

		if (creativeContactBoxId ==
				creativeContactInfoAddBoxCacheModel.creativeContactBoxId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, creativeContactBoxId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{creativeContactBoxId=");
		sb.append(creativeContactBoxId);
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
		sb.append(", contactTelephone=");
		sb.append(contactTelephone);
		sb.append(", contactFax=");
		sb.append(contactFax);
		sb.append(", contactEmailAddress=");
		sb.append(contactEmailAddress);
		sb.append(", counterContact=");
		sb.append(counterContact);
		sb.append(", CreativeApplicationId=");
		sb.append(CreativeApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CreativeContactInfoAddBox toEntityModel() {
		CreativeContactInfoAddBoxImpl creativeContactInfoAddBoxImpl =
			new CreativeContactInfoAddBoxImpl();

		creativeContactInfoAddBoxImpl.setCreativeContactBoxId(
			creativeContactBoxId);
		creativeContactInfoAddBoxImpl.setGroupId(groupId);
		creativeContactInfoAddBoxImpl.setCompanyId(companyId);
		creativeContactInfoAddBoxImpl.setUserId(userId);

		if (userName == null) {
			creativeContactInfoAddBoxImpl.setUserName("");
		}
		else {
			creativeContactInfoAddBoxImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			creativeContactInfoAddBoxImpl.setCreateDate(null);
		}
		else {
			creativeContactInfoAddBoxImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			creativeContactInfoAddBoxImpl.setModifiedDate(null);
		}
		else {
			creativeContactInfoAddBoxImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (contactTelephone == null) {
			creativeContactInfoAddBoxImpl.setContactTelephone("");
		}
		else {
			creativeContactInfoAddBoxImpl.setContactTelephone(contactTelephone);
		}

		if (contactFax == null) {
			creativeContactInfoAddBoxImpl.setContactFax("");
		}
		else {
			creativeContactInfoAddBoxImpl.setContactFax(contactFax);
		}

		if (contactEmailAddress == null) {
			creativeContactInfoAddBoxImpl.setContactEmailAddress("");
		}
		else {
			creativeContactInfoAddBoxImpl.setContactEmailAddress(
				contactEmailAddress);
		}

		if (counterContact == null) {
			creativeContactInfoAddBoxImpl.setCounterContact("");
		}
		else {
			creativeContactInfoAddBoxImpl.setCounterContact(counterContact);
		}

		creativeContactInfoAddBoxImpl.setCreativeApplicationId(
			CreativeApplicationId);

		creativeContactInfoAddBoxImpl.resetOriginalValues();

		return creativeContactInfoAddBoxImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		creativeContactBoxId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		contactTelephone = objectInput.readUTF();
		contactFax = objectInput.readUTF();
		contactEmailAddress = objectInput.readUTF();
		counterContact = objectInput.readUTF();

		CreativeApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(creativeContactBoxId);

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

		if (contactTelephone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactTelephone);
		}

		if (contactFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactFax);
		}

		if (contactEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactEmailAddress);
		}

		if (counterContact == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counterContact);
		}

		objectOutput.writeLong(CreativeApplicationId);
	}

	public long creativeContactBoxId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String contactTelephone;
	public String contactFax;
	public String contactEmailAddress;
	public String counterContact;
	public long CreativeApplicationId;

}