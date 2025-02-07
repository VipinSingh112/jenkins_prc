/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjAddLocMultiSite in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjAddLocMultiSiteCacheModel
	implements CacheModel<NcbjAddLocMultiSite>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjAddLocMultiSiteCacheModel)) {
			return false;
		}

		NcbjAddLocMultiSiteCacheModel ncbjAddLocMultiSiteCacheModel =
			(NcbjAddLocMultiSiteCacheModel)object;

		if (ncbjAddLocMultiSiteId ==
				ncbjAddLocMultiSiteCacheModel.ncbjAddLocMultiSiteId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjAddLocMultiSiteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{ncbjAddLocMultiSiteId=");
		sb.append(ncbjAddLocMultiSiteId);
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
		sb.append(", signatureName=");
		sb.append(signatureName);
		sb.append(", centralOfficeLink=");
		sb.append(centralOfficeLink);
		sb.append(", commonManagementSystem=");
		sb.append(commonManagementSystem);
		sb.append(", substantiallySameProcess=");
		sb.append(substantiallySameProcess);
		sb.append(", siteSimilarMethod=");
		sb.append(siteSimilarMethod);
		sb.append(", siteUnderAudit=");
		sb.append(siteUnderAudit);
		sb.append(", siteCorrectiveRight=");
		sb.append(siteCorrectiveRight);
		sb.append(", changesAuthority=");
		sb.append(changesAuthority);
		sb.append(", position=");
		sb.append(position);
		sb.append(", date=");
		sb.append(date);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjAddLocMultiSite toEntityModel() {
		NcbjAddLocMultiSiteImpl ncbjAddLocMultiSiteImpl =
			new NcbjAddLocMultiSiteImpl();

		ncbjAddLocMultiSiteImpl.setNcbjAddLocMultiSiteId(ncbjAddLocMultiSiteId);
		ncbjAddLocMultiSiteImpl.setGroupId(groupId);
		ncbjAddLocMultiSiteImpl.setCompanyId(companyId);
		ncbjAddLocMultiSiteImpl.setUserId(userId);

		if (userName == null) {
			ncbjAddLocMultiSiteImpl.setUserName("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjAddLocMultiSiteImpl.setCreateDate(null);
		}
		else {
			ncbjAddLocMultiSiteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjAddLocMultiSiteImpl.setModifiedDate(null);
		}
		else {
			ncbjAddLocMultiSiteImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (signatureName == null) {
			ncbjAddLocMultiSiteImpl.setSignatureName("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setSignatureName(signatureName);
		}

		if (centralOfficeLink == null) {
			ncbjAddLocMultiSiteImpl.setCentralOfficeLink("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setCentralOfficeLink(centralOfficeLink);
		}

		if (commonManagementSystem == null) {
			ncbjAddLocMultiSiteImpl.setCommonManagementSystem("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setCommonManagementSystem(
				commonManagementSystem);
		}

		if (substantiallySameProcess == null) {
			ncbjAddLocMultiSiteImpl.setSubstantiallySameProcess("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setSubstantiallySameProcess(
				substantiallySameProcess);
		}

		if (siteSimilarMethod == null) {
			ncbjAddLocMultiSiteImpl.setSiteSimilarMethod("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setSiteSimilarMethod(siteSimilarMethod);
		}

		if (siteUnderAudit == null) {
			ncbjAddLocMultiSiteImpl.setSiteUnderAudit("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setSiteUnderAudit(siteUnderAudit);
		}

		if (siteCorrectiveRight == null) {
			ncbjAddLocMultiSiteImpl.setSiteCorrectiveRight("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setSiteCorrectiveRight(siteCorrectiveRight);
		}

		if (changesAuthority == null) {
			ncbjAddLocMultiSiteImpl.setChangesAuthority("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setChangesAuthority(changesAuthority);
		}

		if (position == null) {
			ncbjAddLocMultiSiteImpl.setPosition("");
		}
		else {
			ncbjAddLocMultiSiteImpl.setPosition(position);
		}

		if (date == Long.MIN_VALUE) {
			ncbjAddLocMultiSiteImpl.setDate(null);
		}
		else {
			ncbjAddLocMultiSiteImpl.setDate(new Date(date));
		}

		ncbjAddLocMultiSiteImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjAddLocMultiSiteImpl.resetOriginalValues();

		return ncbjAddLocMultiSiteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjAddLocMultiSiteId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		signatureName = objectInput.readUTF();
		centralOfficeLink = objectInput.readUTF();
		commonManagementSystem = objectInput.readUTF();
		substantiallySameProcess = objectInput.readUTF();
		siteSimilarMethod = objectInput.readUTF();
		siteUnderAudit = objectInput.readUTF();
		siteCorrectiveRight = objectInput.readUTF();
		changesAuthority = objectInput.readUTF();
		position = objectInput.readUTF();
		date = objectInput.readLong();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjAddLocMultiSiteId);

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

		if (signatureName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatureName);
		}

		if (centralOfficeLink == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(centralOfficeLink);
		}

		if (commonManagementSystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(commonManagementSystem);
		}

		if (substantiallySameProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(substantiallySameProcess);
		}

		if (siteSimilarMethod == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(siteSimilarMethod);
		}

		if (siteUnderAudit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(siteUnderAudit);
		}

		if (siteCorrectiveRight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(siteCorrectiveRight);
		}

		if (changesAuthority == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(changesAuthority);
		}

		if (position == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(position);
		}

		objectOutput.writeLong(date);

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjAddLocMultiSiteId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String signatureName;
	public String centralOfficeLink;
	public String commonManagementSystem;
	public String substantiallySameProcess;
	public String siteSimilarMethod;
	public String siteUnderAudit;
	public String siteCorrectiveRight;
	public String changesAuthority;
	public String position;
	public long date;
	public long ncbjApplicationId;

}