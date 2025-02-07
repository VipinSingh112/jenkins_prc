/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MedicalNurseStaffPremises in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MedicalNurseStaffPremisesCacheModel
	implements CacheModel<MedicalNurseStaffPremises>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MedicalNurseStaffPremisesCacheModel)) {
			return false;
		}

		MedicalNurseStaffPremisesCacheModel
			medicalNurseStaffPremisesCacheModel =
				(MedicalNurseStaffPremisesCacheModel)object;

		if (medicalNurseStaffPremisesId ==
				medicalNurseStaffPremisesCacheModel.
					medicalNurseStaffPremisesId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, medicalNurseStaffPremisesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{medicalNurseStaffPremisesId=");
		sb.append(medicalNurseStaffPremisesId);
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
		sb.append(", nursingStaffCategory=");
		sb.append(nursingStaffCategory);
		sb.append(", medicalFacilitiesAppId=");
		sb.append(medicalFacilitiesAppId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MedicalNurseStaffPremises toEntityModel() {
		MedicalNurseStaffPremisesImpl medicalNurseStaffPremisesImpl =
			new MedicalNurseStaffPremisesImpl();

		medicalNurseStaffPremisesImpl.setMedicalNurseStaffPremisesId(
			medicalNurseStaffPremisesId);
		medicalNurseStaffPremisesImpl.setGroupId(groupId);
		medicalNurseStaffPremisesImpl.setCompanyId(companyId);
		medicalNurseStaffPremisesImpl.setUserId(userId);

		if (userName == null) {
			medicalNurseStaffPremisesImpl.setUserName("");
		}
		else {
			medicalNurseStaffPremisesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			medicalNurseStaffPremisesImpl.setCreateDate(null);
		}
		else {
			medicalNurseStaffPremisesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			medicalNurseStaffPremisesImpl.setModifiedDate(null);
		}
		else {
			medicalNurseStaffPremisesImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (nursingStaffCategory == null) {
			medicalNurseStaffPremisesImpl.setNursingStaffCategory("");
		}
		else {
			medicalNurseStaffPremisesImpl.setNursingStaffCategory(
				nursingStaffCategory);
		}

		medicalNurseStaffPremisesImpl.setMedicalFacilitiesAppId(
			medicalFacilitiesAppId);

		medicalNurseStaffPremisesImpl.resetOriginalValues();

		return medicalNurseStaffPremisesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		medicalNurseStaffPremisesId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nursingStaffCategory = objectInput.readUTF();

		medicalFacilitiesAppId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(medicalNurseStaffPremisesId);

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

		if (nursingStaffCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nursingStaffCategory);
		}

		objectOutput.writeLong(medicalFacilitiesAppId);
	}

	public long medicalNurseStaffPremisesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nursingStaffCategory;
	public long medicalFacilitiesAppId;

}