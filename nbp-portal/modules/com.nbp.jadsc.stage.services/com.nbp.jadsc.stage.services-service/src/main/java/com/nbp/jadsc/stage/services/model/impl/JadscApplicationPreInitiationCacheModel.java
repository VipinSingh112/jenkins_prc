/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JadscApplicationPreInitiation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JadscApplicationPreInitiationCacheModel
	implements CacheModel<JadscApplicationPreInitiation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JadscApplicationPreInitiationCacheModel)) {
			return false;
		}

		JadscApplicationPreInitiationCacheModel
			jadscApplicationPreInitiationCacheModel =
				(JadscApplicationPreInitiationCacheModel)object;

		if (jadscAppliPreInitiationId ==
				jadscApplicationPreInitiationCacheModel.
					jadscAppliPreInitiationId) {

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
	public JadscApplicationPreInitiation toEntityModel() {
		JadscApplicationPreInitiationImpl jadscApplicationPreInitiationImpl =
			new JadscApplicationPreInitiationImpl();

		jadscApplicationPreInitiationImpl.setJadscAppliPreInitiationId(
			jadscAppliPreInitiationId);
		jadscApplicationPreInitiationImpl.setGroupId(groupId);
		jadscApplicationPreInitiationImpl.setCompanyId(companyId);
		jadscApplicationPreInitiationImpl.setUserId(userId);

		if (userName == null) {
			jadscApplicationPreInitiationImpl.setUserName("");
		}
		else {
			jadscApplicationPreInitiationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscApplicationPreInitiationImpl.setCreateDate(null);
		}
		else {
			jadscApplicationPreInitiationImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscApplicationPreInitiationImpl.setModifiedDate(null);
		}
		else {
			jadscApplicationPreInitiationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfPreInitiation == Long.MIN_VALUE) {
			jadscApplicationPreInitiationImpl.setDateOfPreInitiation(null);
		}
		else {
			jadscApplicationPreInitiationImpl.setDateOfPreInitiation(
				new Date(dateOfPreInitiation));
		}

		if (outcome == null) {
			jadscApplicationPreInitiationImpl.setOutcome("");
		}
		else {
			jadscApplicationPreInitiationImpl.setOutcome(outcome);
		}

		if (caseId == null) {
			jadscApplicationPreInitiationImpl.setCaseId("");
		}
		else {
			jadscApplicationPreInitiationImpl.setCaseId(caseId);
		}

		jadscApplicationPreInitiationImpl.resetOriginalValues();

		return jadscApplicationPreInitiationImpl;
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