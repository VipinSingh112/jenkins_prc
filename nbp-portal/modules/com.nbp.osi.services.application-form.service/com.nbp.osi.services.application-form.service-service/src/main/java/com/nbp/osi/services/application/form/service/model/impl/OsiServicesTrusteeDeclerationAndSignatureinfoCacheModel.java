/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeDeclerationAndSignatureinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesTrusteeDeclerationAndSignatureinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesTrusteeDeclerationAndSignatureinfoCacheModel
	implements CacheModel<OsiServicesTrusteeDeclerationAndSignatureinfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				OsiServicesTrusteeDeclerationAndSignatureinfoCacheModel)) {

			return false;
		}

		OsiServicesTrusteeDeclerationAndSignatureinfoCacheModel
			osiServicesTrusteeDeclerationAndSignatureinfoCacheModel =
				(OsiServicesTrusteeDeclerationAndSignatureinfoCacheModel)object;

		if (osiDeclerationId ==
				osiServicesTrusteeDeclerationAndSignatureinfoCacheModel.
					osiDeclerationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiDeclerationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiDeclerationId=");
		sb.append(osiDeclerationId);
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
		sb.append(", indiUndersignedApplicantName=");
		sb.append(indiUndersignedApplicantName);
		sb.append(", indiUndersignedDated=");
		sb.append(indiUndersignedDated);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesTrusteeDeclerationAndSignatureinfo toEntityModel() {
		OsiServicesTrusteeDeclerationAndSignatureinfoImpl
			osiServicesTrusteeDeclerationAndSignatureinfoImpl =
				new OsiServicesTrusteeDeclerationAndSignatureinfoImpl();

		if (uuid == null) {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setUuid("");
		}
		else {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setUuid(uuid);
		}

		osiServicesTrusteeDeclerationAndSignatureinfoImpl.setOsiDeclerationId(
			osiDeclerationId);
		osiServicesTrusteeDeclerationAndSignatureinfoImpl.setGroupId(groupId);
		osiServicesTrusteeDeclerationAndSignatureinfoImpl.setCompanyId(
			companyId);
		osiServicesTrusteeDeclerationAndSignatureinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setUserName("");
		}
		else {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setUserName(
				userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setCreateDate(
				null);
		}
		else {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setModifiedDate(
				null);
		}
		else {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (indiUndersignedApplicantName == null) {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.
				setIndiUndersignedApplicantName("");
		}
		else {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.
				setIndiUndersignedApplicantName(indiUndersignedApplicantName);
		}

		if (indiUndersignedDated == Long.MIN_VALUE) {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.
				setIndiUndersignedDated(null);
		}
		else {
			osiServicesTrusteeDeclerationAndSignatureinfoImpl.
				setIndiUndersignedDated(new Date(indiUndersignedDated));
		}

		osiServicesTrusteeDeclerationAndSignatureinfoImpl.
			setOsiServicesApplicationId(osiServicesApplicationId);

		osiServicesTrusteeDeclerationAndSignatureinfoImpl.resetOriginalValues();

		return osiServicesTrusteeDeclerationAndSignatureinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiDeclerationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		indiUndersignedApplicantName = objectInput.readUTF();
		indiUndersignedDated = objectInput.readLong();

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

		objectOutput.writeLong(osiDeclerationId);

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

		if (indiUndersignedApplicantName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indiUndersignedApplicantName);
		}

		objectOutput.writeLong(indiUndersignedDated);

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiDeclerationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String indiUndersignedApplicantName;
	public long indiUndersignedDated;
	public long osiServicesApplicationId;

}