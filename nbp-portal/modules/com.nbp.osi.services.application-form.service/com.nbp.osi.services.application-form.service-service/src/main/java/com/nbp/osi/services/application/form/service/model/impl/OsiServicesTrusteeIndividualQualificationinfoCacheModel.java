/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualQualificationinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesTrusteeIndividualQualificationinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesTrusteeIndividualQualificationinfoCacheModel
	implements CacheModel<OsiServicesTrusteeIndividualQualificationinfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				OsiServicesTrusteeIndividualQualificationinfoCacheModel)) {

			return false;
		}

		OsiServicesTrusteeIndividualQualificationinfoCacheModel
			osiServicesTrusteeIndividualQualificationinfoCacheModel =
				(OsiServicesTrusteeIndividualQualificationinfoCacheModel)object;

		if (osQualificationId ==
				osiServicesTrusteeIndividualQualificationinfoCacheModel.
					osQualificationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osQualificationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osQualificationId=");
		sb.append(osQualificationId);
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
		sb.append(", orgMember=");
		sb.append(orgMember);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesTrusteeIndividualQualificationinfo toEntityModel() {
		OsiServicesTrusteeIndividualQualificationinfoImpl
			osiServicesTrusteeIndividualQualificationinfoImpl =
				new OsiServicesTrusteeIndividualQualificationinfoImpl();

		if (uuid == null) {
			osiServicesTrusteeIndividualQualificationinfoImpl.setUuid("");
		}
		else {
			osiServicesTrusteeIndividualQualificationinfoImpl.setUuid(uuid);
		}

		osiServicesTrusteeIndividualQualificationinfoImpl.setOsQualificationId(
			osQualificationId);
		osiServicesTrusteeIndividualQualificationinfoImpl.setGroupId(groupId);
		osiServicesTrusteeIndividualQualificationinfoImpl.setCompanyId(
			companyId);
		osiServicesTrusteeIndividualQualificationinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesTrusteeIndividualQualificationinfoImpl.setUserName("");
		}
		else {
			osiServicesTrusteeIndividualQualificationinfoImpl.setUserName(
				userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesTrusteeIndividualQualificationinfoImpl.setCreateDate(
				null);
		}
		else {
			osiServicesTrusteeIndividualQualificationinfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesTrusteeIndividualQualificationinfoImpl.setModifiedDate(
				null);
		}
		else {
			osiServicesTrusteeIndividualQualificationinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (orgMember == null) {
			osiServicesTrusteeIndividualQualificationinfoImpl.setOrgMember("");
		}
		else {
			osiServicesTrusteeIndividualQualificationinfoImpl.setOrgMember(
				orgMember);
		}

		osiServicesTrusteeIndividualQualificationinfoImpl.
			setOsiServicesApplicationId(osiServicesApplicationId);

		osiServicesTrusteeIndividualQualificationinfoImpl.resetOriginalValues();

		return osiServicesTrusteeIndividualQualificationinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osQualificationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		orgMember = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osQualificationId);

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

		if (orgMember == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgMember);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osQualificationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String orgMember;
	public long osiServicesApplicationId;

}