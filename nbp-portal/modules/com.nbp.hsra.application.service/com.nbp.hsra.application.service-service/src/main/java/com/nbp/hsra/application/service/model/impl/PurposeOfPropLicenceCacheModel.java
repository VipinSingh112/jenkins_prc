/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.PurposeOfPropLicence;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PurposeOfPropLicence in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PurposeOfPropLicenceCacheModel
	implements CacheModel<PurposeOfPropLicence>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PurposeOfPropLicenceCacheModel)) {
			return false;
		}

		PurposeOfPropLicenceCacheModel purposeOfPropLicenceCacheModel =
			(PurposeOfPropLicenceCacheModel)object;

		if (purposeOfPropLicenceId ==
				purposeOfPropLicenceCacheModel.purposeOfPropLicenceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, purposeOfPropLicenceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{purposeOfPropLicenceId=");
		sb.append(purposeOfPropLicenceId);
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
		sb.append(", nuclearRegstLic=");
		sb.append(nuclearRegstLic);
		sb.append(", nuclearBusinessPlace=");
		sb.append(nuclearBusinessPlace);
		sb.append(", nuclearActivityMainAdd=");
		sb.append(nuclearActivityMainAdd);
		sb.append(", applicationType=");
		sb.append(applicationType);
		sb.append(", nuclearAdditionalLoc=");
		sb.append(nuclearAdditionalLoc);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PurposeOfPropLicence toEntityModel() {
		PurposeOfPropLicenceImpl purposeOfPropLicenceImpl =
			new PurposeOfPropLicenceImpl();

		purposeOfPropLicenceImpl.setPurposeOfPropLicenceId(
			purposeOfPropLicenceId);
		purposeOfPropLicenceImpl.setGroupId(groupId);
		purposeOfPropLicenceImpl.setCompanyId(companyId);
		purposeOfPropLicenceImpl.setUserId(userId);

		if (userName == null) {
			purposeOfPropLicenceImpl.setUserName("");
		}
		else {
			purposeOfPropLicenceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			purposeOfPropLicenceImpl.setCreateDate(null);
		}
		else {
			purposeOfPropLicenceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			purposeOfPropLicenceImpl.setModifiedDate(null);
		}
		else {
			purposeOfPropLicenceImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nuclearRegstLic == null) {
			purposeOfPropLicenceImpl.setNuclearRegstLic("");
		}
		else {
			purposeOfPropLicenceImpl.setNuclearRegstLic(nuclearRegstLic);
		}

		if (nuclearBusinessPlace == null) {
			purposeOfPropLicenceImpl.setNuclearBusinessPlace("");
		}
		else {
			purposeOfPropLicenceImpl.setNuclearBusinessPlace(
				nuclearBusinessPlace);
		}

		if (nuclearActivityMainAdd == null) {
			purposeOfPropLicenceImpl.setNuclearActivityMainAdd("");
		}
		else {
			purposeOfPropLicenceImpl.setNuclearActivityMainAdd(
				nuclearActivityMainAdd);
		}

		if (applicationType == null) {
			purposeOfPropLicenceImpl.setApplicationType("");
		}
		else {
			purposeOfPropLicenceImpl.setApplicationType(applicationType);
		}

		if (nuclearAdditionalLoc == null) {
			purposeOfPropLicenceImpl.setNuclearAdditionalLoc("");
		}
		else {
			purposeOfPropLicenceImpl.setNuclearAdditionalLoc(
				nuclearAdditionalLoc);
		}

		purposeOfPropLicenceImpl.setHsraApplicationId(hsraApplicationId);

		purposeOfPropLicenceImpl.resetOriginalValues();

		return purposeOfPropLicenceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		purposeOfPropLicenceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nuclearRegstLic = objectInput.readUTF();
		nuclearBusinessPlace = objectInput.readUTF();
		nuclearActivityMainAdd = objectInput.readUTF();
		applicationType = objectInput.readUTF();
		nuclearAdditionalLoc = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(purposeOfPropLicenceId);

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

		if (nuclearRegstLic == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearRegstLic);
		}

		if (nuclearBusinessPlace == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearBusinessPlace);
		}

		if (nuclearActivityMainAdd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearActivityMainAdd);
		}

		if (applicationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationType);
		}

		if (nuclearAdditionalLoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nuclearAdditionalLoc);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long purposeOfPropLicenceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nuclearRegstLic;
	public String nuclearBusinessPlace;
	public String nuclearActivityMainAdd;
	public String applicationType;
	public String nuclearAdditionalLoc;
	public long hsraApplicationId;

}