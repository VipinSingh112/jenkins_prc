/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JadscAppliPreInitiation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JadscAppliPreInitiationCacheModel
	implements CacheModel<JadscAppliPreInitiation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JadscAppliPreInitiationCacheModel)) {
			return false;
		}

		JadscAppliPreInitiationCacheModel jadscAppliPreInitiationCacheModel =
			(JadscAppliPreInitiationCacheModel)object;

		if (jadscAppliPreInitiationId ==
				jadscAppliPreInitiationCacheModel.jadscAppliPreInitiationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscAppliPreInitiationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jadscAppliPreInitiationId=");
		sb.append(jadscAppliPreInitiationId);
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
		sb.append(", dateOfPreInitiation=");
		sb.append(dateOfPreInitiation);
		sb.append(", outcome=");
		sb.append(outcome);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JadscAppliPreInitiation toEntityModel() {
		JadscAppliPreInitiationImpl jadscAppliPreInitiationImpl =
			new JadscAppliPreInitiationImpl();

		jadscAppliPreInitiationImpl.setJadscAppliPreInitiationId(
			jadscAppliPreInitiationId);
		jadscAppliPreInitiationImpl.setGroupId(groupId);
		jadscAppliPreInitiationImpl.setCompanyId(companyId);
		jadscAppliPreInitiationImpl.setUserId(userId);

		if (userName == null) {
			jadscAppliPreInitiationImpl.setUserName("");
		}
		else {
			jadscAppliPreInitiationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscAppliPreInitiationImpl.setCreateDate(null);
		}
		else {
			jadscAppliPreInitiationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscAppliPreInitiationImpl.setModifiedDate(null);
		}
		else {
			jadscAppliPreInitiationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dateOfPreInitiation == Long.MIN_VALUE) {
			jadscAppliPreInitiationImpl.setDateOfPreInitiation(null);
		}
		else {
			jadscAppliPreInitiationImpl.setDateOfPreInitiation(
				new Date(dateOfPreInitiation));
		}

		if (outcome == null) {
			jadscAppliPreInitiationImpl.setOutcome("");
		}
		else {
			jadscAppliPreInitiationImpl.setOutcome(outcome);
		}

		if (caseId == null) {
			jadscAppliPreInitiationImpl.setCaseId("");
		}
		else {
			jadscAppliPreInitiationImpl.setCaseId(caseId);
		}

		jadscAppliPreInitiationImpl.resetOriginalValues();

		return jadscAppliPreInitiationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jadscAppliPreInitiationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfPreInitiation = objectInput.readLong();
		outcome = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jadscAppliPreInitiationId);

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
		objectOutput.writeLong(dateOfPreInitiation);

		if (outcome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(outcome);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long jadscAppliPreInitiationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfPreInitiation;
	public String outcome;
	public String caseId;

}