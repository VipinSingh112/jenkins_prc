/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeLicenseBreakdowninfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesTrusteeLicenseBreakdowninfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesTrusteeLicenseBreakdowninfoCacheModel
	implements CacheModel<OsiServicesTrusteeLicenseBreakdowninfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				OsiServicesTrusteeLicenseBreakdowninfoCacheModel)) {

			return false;
		}

		OsiServicesTrusteeLicenseBreakdowninfoCacheModel
			osiServicesTrusteeLicenseBreakdowninfoCacheModel =
				(OsiServicesTrusteeLicenseBreakdowninfoCacheModel)object;

		if (osiLicBreakId ==
				osiServicesTrusteeLicenseBreakdowninfoCacheModel.
					osiLicBreakId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiLicBreakId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiLicBreakId=");
		sb.append(osiLicBreakId);
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
		sb.append(", indiBreakdownApplicantName=");
		sb.append(indiBreakdownApplicantName);
		sb.append(", indiBreakdownFirm=");
		sb.append(indiBreakdownFirm);
		sb.append(", indiBreakdownDated=");
		sb.append(indiBreakdownDated);
		sb.append(", indiBreakdownTrusteeName=");
		sb.append(indiBreakdownTrusteeName);
		sb.append(", indiBreakdownTrusteeDate=");
		sb.append(indiBreakdownTrusteeDate);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesTrusteeLicenseBreakdowninfo toEntityModel() {
		OsiServicesTrusteeLicenseBreakdowninfoImpl
			osiServicesTrusteeLicenseBreakdowninfoImpl =
				new OsiServicesTrusteeLicenseBreakdowninfoImpl();

		if (uuid == null) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setUuid("");
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setUuid(uuid);
		}

		osiServicesTrusteeLicenseBreakdowninfoImpl.setOsiLicBreakId(
			osiLicBreakId);
		osiServicesTrusteeLicenseBreakdowninfoImpl.setGroupId(groupId);
		osiServicesTrusteeLicenseBreakdowninfoImpl.setCompanyId(companyId);
		osiServicesTrusteeLicenseBreakdowninfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setUserName("");
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setCreateDate(null);
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (indiBreakdownApplicantName == null) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.
				setIndiBreakdownApplicantName("");
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.
				setIndiBreakdownApplicantName(indiBreakdownApplicantName);
		}

		if (indiBreakdownFirm == null) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setIndiBreakdownFirm("");
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setIndiBreakdownFirm(
				indiBreakdownFirm);
		}

		if (indiBreakdownDated == Long.MIN_VALUE) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setIndiBreakdownDated(
				null);
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.setIndiBreakdownDated(
				new Date(indiBreakdownDated));
		}

		if (indiBreakdownTrusteeName == null) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.
				setIndiBreakdownTrusteeName("");
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.
				setIndiBreakdownTrusteeName(indiBreakdownTrusteeName);
		}

		if (indiBreakdownTrusteeDate == Long.MIN_VALUE) {
			osiServicesTrusteeLicenseBreakdowninfoImpl.
				setIndiBreakdownTrusteeDate(null);
		}
		else {
			osiServicesTrusteeLicenseBreakdowninfoImpl.
				setIndiBreakdownTrusteeDate(new Date(indiBreakdownTrusteeDate));
		}

		osiServicesTrusteeLicenseBreakdowninfoImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesTrusteeLicenseBreakdowninfoImpl.resetOriginalValues();

		return osiServicesTrusteeLicenseBreakdowninfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiLicBreakId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		indiBreakdownApplicantName = objectInput.readUTF();
		indiBreakdownFirm = objectInput.readUTF();
		indiBreakdownDated = objectInput.readLong();
		indiBreakdownTrusteeName = objectInput.readUTF();
		indiBreakdownTrusteeDate = objectInput.readLong();

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

		objectOutput.writeLong(osiLicBreakId);

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

		if (indiBreakdownApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiBreakdownApplicantName);
		}

		if (indiBreakdownFirm == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiBreakdownFirm);
		}

		objectOutput.writeLong(indiBreakdownDated);

		if (indiBreakdownTrusteeName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiBreakdownTrusteeName);
		}

		objectOutput.writeLong(indiBreakdownTrusteeDate);

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiLicBreakId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String indiBreakdownApplicantName;
	public String indiBreakdownFirm;
	public long indiBreakdownDated;
	public String indiBreakdownTrusteeName;
	public long indiBreakdownTrusteeDate;
	public long osiServicesApplicationId;

}