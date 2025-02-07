/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JadscAppliFinalDeter in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JadscAppliFinalDeterCacheModel
	implements CacheModel<JadscAppliFinalDeter>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JadscAppliFinalDeterCacheModel)) {
			return false;
		}

		JadscAppliFinalDeterCacheModel jadscAppliFinalDeterCacheModel =
			(JadscAppliFinalDeterCacheModel)object;

		if (jadscAppliFinalDeterId ==
				jadscAppliFinalDeterCacheModel.jadscAppliFinalDeterId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscAppliFinalDeterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jadscAppliFinalDeterId=");
		sb.append(jadscAppliFinalDeterId);
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
		sb.append(", dateOfFinalDeter=");
		sb.append(dateOfFinalDeter);
		sb.append(", Outcome=");
		sb.append(Outcome);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JadscAppliFinalDeter toEntityModel() {
		JadscAppliFinalDeterImpl jadscAppliFinalDeterImpl =
			new JadscAppliFinalDeterImpl();

		jadscAppliFinalDeterImpl.setJadscAppliFinalDeterId(
			jadscAppliFinalDeterId);
		jadscAppliFinalDeterImpl.setGroupId(groupId);
		jadscAppliFinalDeterImpl.setCompanyId(companyId);
		jadscAppliFinalDeterImpl.setUserId(userId);

		if (userName == null) {
			jadscAppliFinalDeterImpl.setUserName("");
		}
		else {
			jadscAppliFinalDeterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscAppliFinalDeterImpl.setCreateDate(null);
		}
		else {
			jadscAppliFinalDeterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscAppliFinalDeterImpl.setModifiedDate(null);
		}
		else {
			jadscAppliFinalDeterImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dateOfFinalDeter == Long.MIN_VALUE) {
			jadscAppliFinalDeterImpl.setDateOfFinalDeter(null);
		}
		else {
			jadscAppliFinalDeterImpl.setDateOfFinalDeter(
				new Date(dateOfFinalDeter));
		}

		if (Outcome == null) {
			jadscAppliFinalDeterImpl.setOutcome("");
		}
		else {
			jadscAppliFinalDeterImpl.setOutcome(Outcome);
		}

		if (caseId == null) {
			jadscAppliFinalDeterImpl.setCaseId("");
		}
		else {
			jadscAppliFinalDeterImpl.setCaseId(caseId);
		}

		jadscAppliFinalDeterImpl.resetOriginalValues();

		return jadscAppliFinalDeterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jadscAppliFinalDeterId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfFinalDeter = objectInput.readLong();
		Outcome = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jadscAppliFinalDeterId);

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
		objectOutput.writeLong(dateOfFinalDeter);

		if (Outcome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Outcome);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long jadscAppliFinalDeterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfFinalDeter;
	public String Outcome;
	public String caseId;

}