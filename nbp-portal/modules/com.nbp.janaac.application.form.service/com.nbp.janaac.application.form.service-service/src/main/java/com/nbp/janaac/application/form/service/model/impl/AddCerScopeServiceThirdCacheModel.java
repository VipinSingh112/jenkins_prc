/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddCerScopeServiceThird in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddCerScopeServiceThirdCacheModel
	implements CacheModel<AddCerScopeServiceThird>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddCerScopeServiceThirdCacheModel)) {
			return false;
		}

		AddCerScopeServiceThirdCacheModel addCerScopeServiceThirdCacheModel =
			(AddCerScopeServiceThirdCacheModel)object;

		if (addCerScopeServiceThirdId ==
				addCerScopeServiceThirdCacheModel.addCerScopeServiceThirdId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addCerScopeServiceThirdId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{addCerScopeServiceThirdId=");
		sb.append(addCerScopeServiceThirdId);
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
		sb.append(", organizationName=");
		sb.append(organizationName);
		sb.append(", organizationAddress=");
		sb.append(organizationAddress);
		sb.append(", certificationScheme=");
		sb.append(certificationScheme);
		sb.append(", currentStatus=");
		sb.append(currentStatus);
		sb.append(", dateFirstGranted=");
		sb.append(dateFirstGranted);
		sb.append(", DateOfNextExamination=");
		sb.append(DateOfNextExamination);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddCerScopeServiceThird toEntityModel() {
		AddCerScopeServiceThirdImpl addCerScopeServiceThirdImpl =
			new AddCerScopeServiceThirdImpl();

		addCerScopeServiceThirdImpl.setAddCerScopeServiceThirdId(
			addCerScopeServiceThirdId);
		addCerScopeServiceThirdImpl.setGroupId(groupId);
		addCerScopeServiceThirdImpl.setCompanyId(companyId);
		addCerScopeServiceThirdImpl.setUserId(userId);

		if (userName == null) {
			addCerScopeServiceThirdImpl.setUserName("");
		}
		else {
			addCerScopeServiceThirdImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addCerScopeServiceThirdImpl.setCreateDate(null);
		}
		else {
			addCerScopeServiceThirdImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addCerScopeServiceThirdImpl.setModifiedDate(null);
		}
		else {
			addCerScopeServiceThirdImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (organizationName == null) {
			addCerScopeServiceThirdImpl.setOrganizationName("");
		}
		else {
			addCerScopeServiceThirdImpl.setOrganizationName(organizationName);
		}

		if (organizationAddress == null) {
			addCerScopeServiceThirdImpl.setOrganizationAddress("");
		}
		else {
			addCerScopeServiceThirdImpl.setOrganizationAddress(
				organizationAddress);
		}

		if (certificationScheme == null) {
			addCerScopeServiceThirdImpl.setCertificationScheme("");
		}
		else {
			addCerScopeServiceThirdImpl.setCertificationScheme(
				certificationScheme);
		}

		if (currentStatus == null) {
			addCerScopeServiceThirdImpl.setCurrentStatus("");
		}
		else {
			addCerScopeServiceThirdImpl.setCurrentStatus(currentStatus);
		}

		if (dateFirstGranted == Long.MIN_VALUE) {
			addCerScopeServiceThirdImpl.setDateFirstGranted(null);
		}
		else {
			addCerScopeServiceThirdImpl.setDateFirstGranted(
				new Date(dateFirstGranted));
		}

		if (DateOfNextExamination == Long.MIN_VALUE) {
			addCerScopeServiceThirdImpl.setDateOfNextExamination(null);
		}
		else {
			addCerScopeServiceThirdImpl.setDateOfNextExamination(
				new Date(DateOfNextExamination));
		}

		addCerScopeServiceThirdImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addCerScopeServiceThirdImpl.setCounter("");
		}
		else {
			addCerScopeServiceThirdImpl.setCounter(counter);
		}

		addCerScopeServiceThirdImpl.resetOriginalValues();

		return addCerScopeServiceThirdImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addCerScopeServiceThirdId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationName = objectInput.readUTF();
		organizationAddress = objectInput.readUTF();
		certificationScheme = objectInput.readUTF();
		currentStatus = objectInput.readUTF();
		dateFirstGranted = objectInput.readLong();
		DateOfNextExamination = objectInput.readLong();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addCerScopeServiceThirdId);

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

		if (organizationName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationName);
		}

		if (organizationAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationAddress);
		}

		if (certificationScheme == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationScheme);
		}

		if (currentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentStatus);
		}

		objectOutput.writeLong(dateFirstGranted);
		objectOutput.writeLong(DateOfNextExamination);

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addCerScopeServiceThirdId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String organizationName;
	public String organizationAddress;
	public String certificationScheme;
	public String currentStatus;
	public long dateFirstGranted;
	public long DateOfNextExamination;
	public long janaacApplicationId;
	public String counter;

}