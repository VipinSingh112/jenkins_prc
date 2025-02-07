/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JadscAppliPreliminationDete in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JadscAppliPreliminationDeteCacheModel
	implements CacheModel<JadscAppliPreliminationDete>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JadscAppliPreliminationDeteCacheModel)) {
			return false;
		}

		JadscAppliPreliminationDeteCacheModel
			jadscAppliPreliminationDeteCacheModel =
				(JadscAppliPreliminationDeteCacheModel)object;

		if (jadscAppliPreliminationDeteId ==
				jadscAppliPreliminationDeteCacheModel.
					jadscAppliPreliminationDeteId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jadscAppliPreliminationDeteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{jadscAppliPreliminationDeteId=");
		sb.append(jadscAppliPreliminationDeteId);
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
		sb.append(", dateOfPreDete=");
		sb.append(dateOfPreDete);
		sb.append(", Outcome=");
		sb.append(Outcome);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JadscAppliPreliminationDete toEntityModel() {
		JadscAppliPreliminationDeteImpl jadscAppliPreliminationDeteImpl =
			new JadscAppliPreliminationDeteImpl();

		jadscAppliPreliminationDeteImpl.setJadscAppliPreliminationDeteId(
			jadscAppliPreliminationDeteId);
		jadscAppliPreliminationDeteImpl.setGroupId(groupId);
		jadscAppliPreliminationDeteImpl.setCompanyId(companyId);
		jadscAppliPreliminationDeteImpl.setUserId(userId);

		if (userName == null) {
			jadscAppliPreliminationDeteImpl.setUserName("");
		}
		else {
			jadscAppliPreliminationDeteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			jadscAppliPreliminationDeteImpl.setCreateDate(null);
		}
		else {
			jadscAppliPreliminationDeteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			jadscAppliPreliminationDeteImpl.setModifiedDate(null);
		}
		else {
			jadscAppliPreliminationDeteImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfPreDete == Long.MIN_VALUE) {
			jadscAppliPreliminationDeteImpl.setDateOfPreDete(null);
		}
		else {
			jadscAppliPreliminationDeteImpl.setDateOfPreDete(
				new Date(dateOfPreDete));
		}

		if (Outcome == null) {
			jadscAppliPreliminationDeteImpl.setOutcome("");
		}
		else {
			jadscAppliPreliminationDeteImpl.setOutcome(Outcome);
		}

		if (caseId == null) {
			jadscAppliPreliminationDeteImpl.setCaseId("");
		}
		else {
			jadscAppliPreliminationDeteImpl.setCaseId(caseId);
		}

		jadscAppliPreliminationDeteImpl.resetOriginalValues();

		return jadscAppliPreliminationDeteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		jadscAppliPreliminationDeteId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfPreDete = objectInput.readLong();
		Outcome = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(jadscAppliPreliminationDeteId);

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
		objectOutput.writeLong(dateOfPreDete);

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

	public long jadscAppliPreliminationDeteId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfPreDete;
	public String Outcome;
	public String caseId;

}