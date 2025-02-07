/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiInsolvencyApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiInsolvencyApplicationCacheModel
	implements CacheModel<OsiInsolvencyApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiInsolvencyApplicationCacheModel)) {
			return false;
		}

		OsiInsolvencyApplicationCacheModel osiInsolvencyApplicationCacheModel =
			(OsiInsolvencyApplicationCacheModel)object;

		if (osiInsolvencyId ==
				osiInsolvencyApplicationCacheModel.osiInsolvencyId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiInsolvencyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{osiInsolvencyId=");
		sb.append(osiInsolvencyId);
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
		sb.append(", entityId=");
		sb.append(entityId);
		sb.append(", applicantStatus=");
		sb.append(applicantStatus);
		sb.append(", typeOfApplicant=");
		sb.append(typeOfApplicant);
		sb.append(", subjectData=");
		sb.append(subjectData);
		sb.append(", applicantIndividual=");
		sb.append(applicantIndividual);
		sb.append(", applicantCompany=");
		sb.append(applicantCompany);
		sb.append(", realEstateBoard=");
		sb.append(realEstateBoard);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", icmDocumentPath=");
		sb.append(icmDocumentPath);
		sb.append(", applicationNumber=");
		sb.append(applicationNumber);
		sb.append(", pdfFileEntryId=");
		sb.append(pdfFileEntryId);
		sb.append(", appCurrentStageName=");
		sb.append(appCurrentStageName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiInsolvencyApplication toEntityModel() {
		OsiInsolvencyApplicationImpl osiInsolvencyApplicationImpl =
			new OsiInsolvencyApplicationImpl();

		osiInsolvencyApplicationImpl.setOsiInsolvencyId(osiInsolvencyId);
		osiInsolvencyApplicationImpl.setGroupId(groupId);
		osiInsolvencyApplicationImpl.setCompanyId(companyId);
		osiInsolvencyApplicationImpl.setUserId(userId);

		if (userName == null) {
			osiInsolvencyApplicationImpl.setUserName("");
		}
		else {
			osiInsolvencyApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationImpl.setCreateDate(null);
		}
		else {
			osiInsolvencyApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiInsolvencyApplicationImpl.setModifiedDate(null);
		}
		else {
			osiInsolvencyApplicationImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (entityId == null) {
			osiInsolvencyApplicationImpl.setEntityId("");
		}
		else {
			osiInsolvencyApplicationImpl.setEntityId(entityId);
		}

		if (applicantStatus == null) {
			osiInsolvencyApplicationImpl.setApplicantStatus("");
		}
		else {
			osiInsolvencyApplicationImpl.setApplicantStatus(applicantStatus);
		}

		if (typeOfApplicant == null) {
			osiInsolvencyApplicationImpl.setTypeOfApplicant("");
		}
		else {
			osiInsolvencyApplicationImpl.setTypeOfApplicant(typeOfApplicant);
		}

		if (subjectData == null) {
			osiInsolvencyApplicationImpl.setSubjectData("");
		}
		else {
			osiInsolvencyApplicationImpl.setSubjectData(subjectData);
		}

		if (applicantIndividual == null) {
			osiInsolvencyApplicationImpl.setApplicantIndividual("");
		}
		else {
			osiInsolvencyApplicationImpl.setApplicantIndividual(
				applicantIndividual);
		}

		if (applicantCompany == null) {
			osiInsolvencyApplicationImpl.setApplicantCompany("");
		}
		else {
			osiInsolvencyApplicationImpl.setApplicantCompany(applicantCompany);
		}

		if (realEstateBoard == null) {
			osiInsolvencyApplicationImpl.setRealEstateBoard("");
		}
		else {
			osiInsolvencyApplicationImpl.setRealEstateBoard(realEstateBoard);
		}

		if (caseId == null) {
			osiInsolvencyApplicationImpl.setCaseId("");
		}
		else {
			osiInsolvencyApplicationImpl.setCaseId(caseId);
		}

		osiInsolvencyApplicationImpl.setStatus(status);

		if (icmDocumentPath == null) {
			osiInsolvencyApplicationImpl.setIcmDocumentPath("");
		}
		else {
			osiInsolvencyApplicationImpl.setIcmDocumentPath(icmDocumentPath);
		}

		if (applicationNumber == null) {
			osiInsolvencyApplicationImpl.setApplicationNumber("");
		}
		else {
			osiInsolvencyApplicationImpl.setApplicationNumber(
				applicationNumber);
		}

		osiInsolvencyApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			osiInsolvencyApplicationImpl.setAppCurrentStageName("");
		}
		else {
			osiInsolvencyApplicationImpl.setAppCurrentStageName(
				appCurrentStageName);
		}

		osiInsolvencyApplicationImpl.resetOriginalValues();

		return osiInsolvencyApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiInsolvencyId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		applicantStatus = objectInput.readUTF();
		typeOfApplicant = objectInput.readUTF();
		subjectData = objectInput.readUTF();
		applicantIndividual = objectInput.readUTF();
		applicantCompany = objectInput.readUTF();
		realEstateBoard = objectInput.readUTF();
		caseId = objectInput.readUTF();

		status = objectInput.readInt();
		icmDocumentPath = objectInput.readUTF();
		applicationNumber = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiInsolvencyId);

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

		if (entityId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entityId);
		}

		if (applicantStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantStatus);
		}

		if (typeOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfApplicant);
		}

		if (subjectData == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subjectData);
		}

		if (applicantIndividual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantIndividual);
		}

		if (applicantCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantCompany);
		}

		if (realEstateBoard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(realEstateBoard);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeInt(status);

		if (icmDocumentPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(icmDocumentPath);
		}

		if (applicationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationNumber);
		}

		objectOutput.writeLong(pdfFileEntryId);

		if (appCurrentStageName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appCurrentStageName);
		}
	}

	public long osiInsolvencyId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String applicantStatus;
	public String typeOfApplicant;
	public String subjectData;
	public String applicantIndividual;
	public String applicantCompany;
	public String realEstateBoard;
	public String caseId;
	public int status;
	public String icmDocumentPath;
	public String applicationNumber;
	public long pdfFileEntryId;
	public String appCurrentStageName;

}