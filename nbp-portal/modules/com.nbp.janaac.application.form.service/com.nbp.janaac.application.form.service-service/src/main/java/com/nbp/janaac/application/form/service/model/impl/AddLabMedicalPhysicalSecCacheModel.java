/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabMedicalPhysicalSec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabMedicalPhysicalSecCacheModel
	implements CacheModel<AddLabMedicalPhysicalSec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabMedicalPhysicalSecCacheModel)) {
			return false;
		}

		AddLabMedicalPhysicalSecCacheModel addLabMedicalPhysicalSecCacheModel =
			(AddLabMedicalPhysicalSecCacheModel)object;

		if (addLabMedicalPhysicalSecId ==
				addLabMedicalPhysicalSecCacheModel.addLabMedicalPhysicalSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabMedicalPhysicalSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addLabMedicalPhysicalSecId=");
		sb.append(addLabMedicalPhysicalSecId);
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
	public AddLabMedicalPhysicalSec toEntityModel() {
		AddLabMedicalPhysicalSecImpl addLabMedicalPhysicalSecImpl =
			new AddLabMedicalPhysicalSecImpl();

		addLabMedicalPhysicalSecImpl.setAddLabMedicalPhysicalSecId(
			addLabMedicalPhysicalSecId);
		addLabMedicalPhysicalSecImpl.setGroupId(groupId);
		addLabMedicalPhysicalSecImpl.setCompanyId(companyId);
		addLabMedicalPhysicalSecImpl.setUserId(userId);

		if (userName == null) {
			addLabMedicalPhysicalSecImpl.setUserName("");
		}
		else {
			addLabMedicalPhysicalSecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabMedicalPhysicalSecImpl.setCreateDate(null);
		}
		else {
			addLabMedicalPhysicalSecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabMedicalPhysicalSecImpl.setModifiedDate(null);
		}
		else {
			addLabMedicalPhysicalSecImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (number == null) {
			addLabMedicalPhysicalSecImpl.setNumber("");
		}
		else {
			addLabMedicalPhysicalSecImpl.setNumber(number);
		}

		if (location == null) {
			addLabMedicalPhysicalSecImpl.setLocation("");
		}
		else {
			addLabMedicalPhysicalSecImpl.setLocation(location);
		}

		if (activitiesPerformed == null) {
			addLabMedicalPhysicalSecImpl.setActivitiesPerformed("");
		}
		else {
			addLabMedicalPhysicalSecImpl.setActivitiesPerformed(
				activitiesPerformed);
		}

		if (contactDetails == null) {
			addLabMedicalPhysicalSecImpl.setContactDetails("");
		}
		else {
			addLabMedicalPhysicalSecImpl.setContactDetails(contactDetails);
		}

		addLabMedicalPhysicalSecImpl.setJanaacApplicationId(
			janaacApplicationId);

		if (counter == null) {
			addLabMedicalPhysicalSecImpl.setCounter("");
		}
		else {
			addLabMedicalPhysicalSecImpl.setCounter(counter);
		}

		addLabMedicalPhysicalSecImpl.resetOriginalValues();

		return addLabMedicalPhysicalSecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabMedicalPhysicalSecId = objectInput.readLong();

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
		objectOutput.writeLong(addLabMedicalPhysicalSecId);

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

	public long addLabMedicalPhysicalSecId;
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