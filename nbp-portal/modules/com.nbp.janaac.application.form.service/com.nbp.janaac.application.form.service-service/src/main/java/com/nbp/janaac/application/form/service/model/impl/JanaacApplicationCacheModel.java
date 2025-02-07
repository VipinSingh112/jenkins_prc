/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.JanaacApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing JanaacApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class JanaacApplicationCacheModel
	implements CacheModel<JanaacApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof JanaacApplicationCacheModel)) {
			return false;
		}

		JanaacApplicationCacheModel janaacApplicationCacheModel =
			(JanaacApplicationCacheModel)object;

		if (janaacApplicationId ==
				janaacApplicationCacheModel.janaacApplicationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, janaacApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
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
		sb.append(", accreditationType=");
		sb.append(accreditationType);
		sb.append(", accServiceType=");
		sb.append(accServiceType);
		sb.append(", transactionType=");
		sb.append(transactionType);
		sb.append(", status=");
		sb.append(status);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", icmDocumentsPath=");
		sb.append(icmDocumentsPath);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JanaacApplication toEntityModel() {
		JanaacApplicationImpl janaacApplicationImpl =
			new JanaacApplicationImpl();

		if (uuid == null) {
			janaacApplicationImpl.setUuid("");
		}
		else {
			janaacApplicationImpl.setUuid(uuid);
		}

		janaacApplicationImpl.setJanaacApplicationId(janaacApplicationId);
		janaacApplicationImpl.setGroupId(groupId);
		janaacApplicationImpl.setCompanyId(companyId);
		janaacApplicationImpl.setUserId(userId);

		if (userName == null) {
			janaacApplicationImpl.setUserName("");
		}
		else {
			janaacApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			janaacApplicationImpl.setCreateDate(null);
		}
		else {
			janaacApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			janaacApplicationImpl.setModifiedDate(null);
		}
		else {
			janaacApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (accreditationType == null) {
			janaacApplicationImpl.setAccreditationType("");
		}
		else {
			janaacApplicationImpl.setAccreditationType(accreditationType);
		}

		if (accServiceType == null) {
			janaacApplicationImpl.setAccServiceType("");
		}
		else {
			janaacApplicationImpl.setAccServiceType(accServiceType);
		}

		if (transactionType == null) {
			janaacApplicationImpl.setTransactionType("");
		}
		else {
			janaacApplicationImpl.setTransactionType(transactionType);
		}

		janaacApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			janaacApplicationImpl.setApplicationNumber("");
		}
		else {
			janaacApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			janaacApplicationImpl.setCaseId("");
		}
		else {
			janaacApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			janaacApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			janaacApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		janaacApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			janaacApplicationImpl.setAppCurrentStageName("");
		}
		else {
			janaacApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		janaacApplicationImpl.resetOriginalValues();

		return janaacApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		accreditationType = objectInput.readUTF();
		accServiceType = objectInput.readUTF();
		transactionType = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(janaacApplicationId);

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

		if (accreditationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accreditationType);
		}

		if (accServiceType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accServiceType);
		}

		if (transactionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transactionType);
		}

		objectOutput.writeInt(status);

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		if (icmDocumentsPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentsPath);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public String uuid;
	public long janaacApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String accreditationType;
	public String accServiceType;
	public String transactionType;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}