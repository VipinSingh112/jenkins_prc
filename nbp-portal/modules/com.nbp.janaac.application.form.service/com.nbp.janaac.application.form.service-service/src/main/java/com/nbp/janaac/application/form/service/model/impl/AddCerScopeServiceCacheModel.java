/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddCerScopeService;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddCerScopeService in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddCerScopeServiceCacheModel
	implements CacheModel<AddCerScopeService>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddCerScopeServiceCacheModel)) {
			return false;
		}

		AddCerScopeServiceCacheModel addCerScopeServiceCacheModel =
			(AddCerScopeServiceCacheModel)object;

		if (addCerScopeServiceId ==
				addCerScopeServiceCacheModel.addCerScopeServiceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addCerScopeServiceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addCerScopeServiceId=");
		sb.append(addCerScopeServiceId);
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
		sb.append(", clientOrganization=");
		sb.append(clientOrganization);
		sb.append(", certificationStandards=");
		sb.append(certificationStandards);
		sb.append(", currentCertification=");
		sb.append(currentCertification);
		sb.append(", dateFirstGranted=");
		sb.append(dateFirstGranted);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddCerScopeService toEntityModel() {
		AddCerScopeServiceImpl addCerScopeServiceImpl =
			new AddCerScopeServiceImpl();

		addCerScopeServiceImpl.setAddCerScopeServiceId(addCerScopeServiceId);
		addCerScopeServiceImpl.setGroupId(groupId);
		addCerScopeServiceImpl.setCompanyId(companyId);
		addCerScopeServiceImpl.setUserId(userId);

		if (userName == null) {
			addCerScopeServiceImpl.setUserName("");
		}
		else {
			addCerScopeServiceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addCerScopeServiceImpl.setCreateDate(null);
		}
		else {
			addCerScopeServiceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addCerScopeServiceImpl.setModifiedDate(null);
		}
		else {
			addCerScopeServiceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (clientOrganization == null) {
			addCerScopeServiceImpl.setClientOrganization("");
		}
		else {
			addCerScopeServiceImpl.setClientOrganization(clientOrganization);
		}

		if (certificationStandards == null) {
			addCerScopeServiceImpl.setCertificationStandards("");
		}
		else {
			addCerScopeServiceImpl.setCertificationStandards(
				certificationStandards);
		}

		if (currentCertification == null) {
			addCerScopeServiceImpl.setCurrentCertification("");
		}
		else {
			addCerScopeServiceImpl.setCurrentCertification(
				currentCertification);
		}

		if (dateFirstGranted == Long.MIN_VALUE) {
			addCerScopeServiceImpl.setDateFirstGranted(null);
		}
		else {
			addCerScopeServiceImpl.setDateFirstGranted(
				new Date(dateFirstGranted));
		}

		addCerScopeServiceImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addCerScopeServiceImpl.setCounter("");
		}
		else {
			addCerScopeServiceImpl.setCounter(counter);
		}

		addCerScopeServiceImpl.resetOriginalValues();

		return addCerScopeServiceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addCerScopeServiceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		clientOrganization = objectInput.readUTF();
		certificationStandards = objectInput.readUTF();
		currentCertification = objectInput.readUTF();
		dateFirstGranted = objectInput.readLong();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addCerScopeServiceId);

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

		if (clientOrganization == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(clientOrganization);
		}

		if (certificationStandards == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationStandards);
		}

		if (currentCertification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(currentCertification);
		}

		objectOutput.writeLong(dateFirstGranted);

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addCerScopeServiceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String clientOrganization;
	public String certificationStandards;
	public String currentCertification;
	public long dateFirstGranted;
	public long janaacApplicationId;
	public String counter;

}