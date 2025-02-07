/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddPhyResourceSec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddPhyResourceSec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddPhyResourceSecCacheModel
	implements CacheModel<AddPhyResourceSec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddPhyResourceSecCacheModel)) {
			return false;
		}

		AddPhyResourceSecCacheModel addPhyResourceSecCacheModel =
			(AddPhyResourceSecCacheModel)object;

		if (addPhyResourceSecId ==
				addPhyResourceSecCacheModel.addPhyResourceSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addPhyResourceSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addPhyResourceSecId=");
		sb.append(addPhyResourceSecId);
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
		sb.append(", number=");
		sb.append(number);
		sb.append(", location=");
		sb.append(location);
		sb.append(", activitiesPerformed=");
		sb.append(activitiesPerformed);
		sb.append(", contactDetails=");
		sb.append(contactDetails);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddPhyResourceSec toEntityModel() {
		AddPhyResourceSecImpl addPhyResourceSecImpl =
			new AddPhyResourceSecImpl();

		addPhyResourceSecImpl.setAddPhyResourceSecId(addPhyResourceSecId);
		addPhyResourceSecImpl.setGroupId(groupId);
		addPhyResourceSecImpl.setCompanyId(companyId);
		addPhyResourceSecImpl.setUserId(userId);

		if (userName == null) {
			addPhyResourceSecImpl.setUserName("");
		}
		else {
			addPhyResourceSecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addPhyResourceSecImpl.setCreateDate(null);
		}
		else {
			addPhyResourceSecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addPhyResourceSecImpl.setModifiedDate(null);
		}
		else {
			addPhyResourceSecImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (number == null) {
			addPhyResourceSecImpl.setNumber("");
		}
		else {
			addPhyResourceSecImpl.setNumber(number);
		}

		if (location == null) {
			addPhyResourceSecImpl.setLocation("");
		}
		else {
			addPhyResourceSecImpl.setLocation(location);
		}

		if (activitiesPerformed == null) {
			addPhyResourceSecImpl.setActivitiesPerformed("");
		}
		else {
			addPhyResourceSecImpl.setActivitiesPerformed(activitiesPerformed);
		}

		if (contactDetails == null) {
			addPhyResourceSecImpl.setContactDetails("");
		}
		else {
			addPhyResourceSecImpl.setContactDetails(contactDetails);
		}

		addPhyResourceSecImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addPhyResourceSecImpl.setCounter("");
		}
		else {
			addPhyResourceSecImpl.setCounter(counter);
		}

		addPhyResourceSecImpl.resetOriginalValues();

		return addPhyResourceSecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addPhyResourceSecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		number = objectInput.readUTF();
		location = objectInput.readUTF();
		activitiesPerformed = objectInput.readUTF();
		contactDetails = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addPhyResourceSecId);

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

		if (number == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(number);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (activitiesPerformed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(activitiesPerformed);
		}

		if (contactDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactDetails);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addPhyResourceSecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String number;
	public String location;
	public String activitiesPerformed;
	public String contactDetails;
	public long janaacApplicationId;
	public String counter;

}