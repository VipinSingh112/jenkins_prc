/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddFdaPersonnelFour in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddFdaPersonnelFourCacheModel
	implements CacheModel<AddFdaPersonnelFour>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddFdaPersonnelFourCacheModel)) {
			return false;
		}

		AddFdaPersonnelFourCacheModel addFdaPersonnelFourCacheModel =
			(AddFdaPersonnelFourCacheModel)object;

		if (addFdaPersonnelFourId ==
				addFdaPersonnelFourCacheModel.addFdaPersonnelFourId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addFdaPersonnelFourId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addFdaPersonnelFourId=");
		sb.append(addFdaPersonnelFourId);
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
		sb.append(", locationAddress=");
		sb.append(locationAddress);
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
	public AddFdaPersonnelFour toEntityModel() {
		AddFdaPersonnelFourImpl addFdaPersonnelFourImpl =
			new AddFdaPersonnelFourImpl();

		addFdaPersonnelFourImpl.setAddFdaPersonnelFourId(addFdaPersonnelFourId);
		addFdaPersonnelFourImpl.setGroupId(groupId);
		addFdaPersonnelFourImpl.setCompanyId(companyId);
		addFdaPersonnelFourImpl.setUserId(userId);

		if (userName == null) {
			addFdaPersonnelFourImpl.setUserName("");
		}
		else {
			addFdaPersonnelFourImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addFdaPersonnelFourImpl.setCreateDate(null);
		}
		else {
			addFdaPersonnelFourImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addFdaPersonnelFourImpl.setModifiedDate(null);
		}
		else {
			addFdaPersonnelFourImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (number == null) {
			addFdaPersonnelFourImpl.setNumber("");
		}
		else {
			addFdaPersonnelFourImpl.setNumber(number);
		}

		if (locationAddress == null) {
			addFdaPersonnelFourImpl.setLocationAddress("");
		}
		else {
			addFdaPersonnelFourImpl.setLocationAddress(locationAddress);
		}

		if (certificationActivities == null) {
			addFdaPersonnelFourImpl.setCertificationActivities("");
		}
		else {
			addFdaPersonnelFourImpl.setCertificationActivities(
				certificationActivities);
		}

		if (contactDetails == null) {
			addFdaPersonnelFourImpl.setContactDetails("");
		}
		else {
			addFdaPersonnelFourImpl.setContactDetails(contactDetails);
		}

		addFdaPersonnelFourImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addFdaPersonnelFourImpl.setCounter("");
		}
		else {
			addFdaPersonnelFourImpl.setCounter(counter);
		}

		addFdaPersonnelFourImpl.resetOriginalValues();

		return addFdaPersonnelFourImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addFdaPersonnelFourId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		number = objectInput.readUTF();
		locationAddress = objectInput.readUTF();
		certificationActivities = objectInput.readUTF();
		contactDetails = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addFdaPersonnelFourId);

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

		if (locationAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locationAddress);
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

	public long addFdaPersonnelFourId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String number;
	public String locationAddress;
	public String certificationActivities;
	public String contactDetails;
	public long janaacApplicationId;
	public String counter;

}