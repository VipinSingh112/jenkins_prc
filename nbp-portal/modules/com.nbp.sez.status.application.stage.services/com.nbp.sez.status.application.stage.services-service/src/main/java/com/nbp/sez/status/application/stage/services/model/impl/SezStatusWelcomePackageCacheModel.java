/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezStatusWelcomePackage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezStatusWelcomePackageCacheModel
	implements CacheModel<SezStatusWelcomePackage>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezStatusWelcomePackageCacheModel)) {
			return false;
		}

		SezStatusWelcomePackageCacheModel sezStatusWelcomePackageCacheModel =
			(SezStatusWelcomePackageCacheModel)object;

		if (sezStatusWelcomeId ==
				sezStatusWelcomePackageCacheModel.sezStatusWelcomeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezStatusWelcomeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sezStatusWelcomeId=");
		sb.append(sezStatusWelcomeId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", dateWelcomePackageSigned=");
		sb.append(dateWelcomePackageSigned);
		sb.append(", welcomePackageSubmitToAppli=");
		sb.append(welcomePackageSubmitToAppli);
		sb.append(", docLicFileEntryId=");
		sb.append(docLicFileEntryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezStatusWelcomePackage toEntityModel() {
		SezStatusWelcomePackageImpl sezStatusWelcomePackageImpl =
			new SezStatusWelcomePackageImpl();

		if (uuid == null) {
			sezStatusWelcomePackageImpl.setUuid("");
		}
		else {
			sezStatusWelcomePackageImpl.setUuid(uuid);
		}

		sezStatusWelcomePackageImpl.setSezStatusWelcomeId(sezStatusWelcomeId);
		sezStatusWelcomePackageImpl.setGroupId(groupId);
		sezStatusWelcomePackageImpl.setCompanyId(companyId);
		sezStatusWelcomePackageImpl.setUserId(userId);

		if (userName == null) {
			sezStatusWelcomePackageImpl.setUserName("");
		}
		else {
			sezStatusWelcomePackageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezStatusWelcomePackageImpl.setCreateDate(null);
		}
		else {
			sezStatusWelcomePackageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezStatusWelcomePackageImpl.setModifiedDate(null);
		}
		else {
			sezStatusWelcomePackageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			sezStatusWelcomePackageImpl.setCaseId("");
		}
		else {
			sezStatusWelcomePackageImpl.setCaseId(caseId);
		}

		if (dateWelcomePackageSigned == Long.MIN_VALUE) {
			sezStatusWelcomePackageImpl.setDateWelcomePackageSigned(null);
		}
		else {
			sezStatusWelcomePackageImpl.setDateWelcomePackageSigned(
				new Date(dateWelcomePackageSigned));
		}

		if (welcomePackageSubmitToAppli == Long.MIN_VALUE) {
			sezStatusWelcomePackageImpl.setWelcomePackageSubmitToAppli(null);
		}
		else {
			sezStatusWelcomePackageImpl.setWelcomePackageSubmitToAppli(
				new Date(welcomePackageSubmitToAppli));
		}

		sezStatusWelcomePackageImpl.setDocLicFileEntryId(docLicFileEntryId);

		sezStatusWelcomePackageImpl.resetOriginalValues();

		return sezStatusWelcomePackageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sezStatusWelcomeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		dateWelcomePackageSigned = objectInput.readLong();
		welcomePackageSubmitToAppli = objectInput.readLong();

		docLicFileEntryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sezStatusWelcomeId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(dateWelcomePackageSigned);
		objectOutput.writeLong(welcomePackageSubmitToAppli);

		objectOutput.writeLong(docLicFileEntryId);
	}

	public String uuid;
	public long sezStatusWelcomeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long dateWelcomePackageSigned;
	public long welcomePackageSubmitToAppli;
	public long docLicFileEntryId;

}