/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddCerPersonnelThird;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddCerPersonnelThird in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddCerPersonnelThirdCacheModel
	implements CacheModel<AddCerPersonnelThird>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddCerPersonnelThirdCacheModel)) {
			return false;
		}

		AddCerPersonnelThirdCacheModel addCerPersonnelThirdCacheModel =
			(AddCerPersonnelThirdCacheModel)object;

		if (addCerPersonnelThirdId ==
				addCerPersonnelThirdCacheModel.addCerPersonnelThirdId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addCerPersonnelThirdId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addCerPersonnelThirdId=");
		sb.append(addCerPersonnelThirdId);
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
		sb.append(", certificationActivities=");
		sb.append(certificationActivities);
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
	public AddCerPersonnelThird toEntityModel() {
		AddCerPersonnelThirdImpl addCerPersonnelThirdImpl =
			new AddCerPersonnelThirdImpl();

		addCerPersonnelThirdImpl.setAddCerPersonnelThirdId(
			addCerPersonnelThirdId);
		addCerPersonnelThirdImpl.setGroupId(groupId);
		addCerPersonnelThirdImpl.setCompanyId(companyId);
		addCerPersonnelThirdImpl.setUserId(userId);

		if (userName == null) {
			addCerPersonnelThirdImpl.setUserName("");
		}
		else {
			addCerPersonnelThirdImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addCerPersonnelThirdImpl.setCreateDate(null);
		}
		else {
			addCerPersonnelThirdImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addCerPersonnelThirdImpl.setModifiedDate(null);
		}
		else {
			addCerPersonnelThirdImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (number == null) {
			addCerPersonnelThirdImpl.setNumber("");
		}
		else {
			addCerPersonnelThirdImpl.setNumber(number);
		}

		if (location == null) {
			addCerPersonnelThirdImpl.setLocation("");
		}
		else {
			addCerPersonnelThirdImpl.setLocation(location);
		}

		if (certificationActivities == null) {
			addCerPersonnelThirdImpl.setCertificationActivities("");
		}
		else {
			addCerPersonnelThirdImpl.setCertificationActivities(
				certificationActivities);
		}

		if (contactDetails == null) {
			addCerPersonnelThirdImpl.setContactDetails("");
		}
		else {
			addCerPersonnelThirdImpl.setContactDetails(contactDetails);
		}

		addCerPersonnelThirdImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addCerPersonnelThirdImpl.setCounter("");
		}
		else {
			addCerPersonnelThirdImpl.setCounter(counter);
		}

		addCerPersonnelThirdImpl.resetOriginalValues();

		return addCerPersonnelThirdImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addCerPersonnelThirdId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		number = objectInput.readUTF();
		location = objectInput.readUTF();
		certificationActivities = objectInput.readUTF();
		contactDetails = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addCerPersonnelThirdId);

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

		if (certificationActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationActivities);
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

	public long addCerPersonnelThirdId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String number;
	public String location;
	public String certificationActivities;
	public String contactDetails;
	public long janaacApplicationId;
	public String counter;

}