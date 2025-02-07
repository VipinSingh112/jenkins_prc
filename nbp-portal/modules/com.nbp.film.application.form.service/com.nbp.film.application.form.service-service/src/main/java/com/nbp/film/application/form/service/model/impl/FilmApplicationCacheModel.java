/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmApplication;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmApplication in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmApplicationCacheModel
	implements CacheModel<FilmApplication>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmApplicationCacheModel)) {
			return false;
		}

		FilmApplicationCacheModel filmApplicationCacheModel =
			(FilmApplicationCacheModel)object;

		if (filmApplicationId == filmApplicationCacheModel.filmApplicationId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmApplicationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
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
		sb.append(", typeOfTransaction=");
		sb.append(typeOfTransaction);
		sb.append(", projectType=");
		sb.append(projectType);
		sb.append(", productionType=");
		sb.append(productionType);
		sb.append(", importEquipment=");
		sb.append(importEquipment);
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
		sb.append(", isUpdateEquipmentList=");
		sb.append(isUpdateEquipmentList);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmApplication toEntityModel() {
		FilmApplicationImpl filmApplicationImpl = new FilmApplicationImpl();

		if (uuid == null) {
			filmApplicationImpl.setUuid("");
		}
		else {
			filmApplicationImpl.setUuid(uuid);
		}

		filmApplicationImpl.setFilmApplicationId(filmApplicationId);
		filmApplicationImpl.setGroupId(groupId);
		filmApplicationImpl.setCompanyId(companyId);
		filmApplicationImpl.setUserId(userId);

		if (userName == null) {
			filmApplicationImpl.setUserName("");
		}
		else {
			filmApplicationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmApplicationImpl.setCreateDate(null);
		}
		else {
			filmApplicationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmApplicationImpl.setModifiedDate(null);
		}
		else {
			filmApplicationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (entityId == null) {
			filmApplicationImpl.setEntityId("");
		}
		else {
			filmApplicationImpl.setEntityId(entityId);
		}

		if (typeOfTransaction == null) {
			filmApplicationImpl.setTypeOfTransaction("");
		}
		else {
			filmApplicationImpl.setTypeOfTransaction(typeOfTransaction);
		}

		if (projectType == null) {
			filmApplicationImpl.setProjectType("");
		}
		else {
			filmApplicationImpl.setProjectType(projectType);
		}

		if (productionType == null) {
			filmApplicationImpl.setProductionType("");
		}
		else {
			filmApplicationImpl.setProductionType(productionType);
		}

		if (importEquipment == null) {
			filmApplicationImpl.setImportEquipment("");
		}
		else {
			filmApplicationImpl.setImportEquipment(importEquipment);
		}

		filmApplicationImpl.setStatus(status);

		if (applicationNumber == null) {
			filmApplicationImpl.setApplicationNumber("");
		}
		else {
			filmApplicationImpl.setApplicationNumber(applicationNumber);
		}

		if (caseId == null) {
			filmApplicationImpl.setCaseId("");
		}
		else {
			filmApplicationImpl.setCaseId(caseId);
		}

		if (icmDocumentsPath == null) {
			filmApplicationImpl.setIcmDocumentsPath("");
		}
		else {
			filmApplicationImpl.setIcmDocumentsPath(icmDocumentsPath);
		}

		filmApplicationImpl.setPdfFileEntryId(pdfFileEntryId);

		if (appCurrentStageName == null) {
			filmApplicationImpl.setAppCurrentStageName("");
		}
		else {
			filmApplicationImpl.setAppCurrentStageName(appCurrentStageName);
		}

		if (isUpdateEquipmentList == null) {
			filmApplicationImpl.setIsUpdateEquipmentList("");
		}
		else {
			filmApplicationImpl.setIsUpdateEquipmentList(isUpdateEquipmentList);
		}

		filmApplicationImpl.resetOriginalValues();

		return filmApplicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		filmApplicationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		entityId = objectInput.readUTF();
		typeOfTransaction = objectInput.readUTF();
		projectType = objectInput.readUTF();
		productionType = objectInput.readUTF();
		importEquipment = objectInput.readUTF();

		status = objectInput.readInt();
		applicationNumber = objectInput.readUTF();
		caseId = objectInput.readUTF();
		icmDocumentsPath = objectInput.readUTF();

		pdfFileEntryId = objectInput.readLong();
		appCurrentStageName = objectInput.readUTF();
		isUpdateEquipmentList = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(filmApplicationId);

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

		if (typeOfTransaction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfTransaction);
		}

		if (projectType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(projectType);
		}

		if (productionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionType);
		}

		if (importEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(importEquipment);
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

		if (isUpdateEquipmentList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(isUpdateEquipmentList);
		}
	}

	public String uuid;
	public long filmApplicationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String entityId;
	public String typeOfTransaction;
	public String projectType;
	public String productionType;
	public String importEquipment;
	public int status;
	public String applicationNumber;
	public String caseId;
	public String icmDocumentsPath;
	public long pdfFileEntryId;
	public String appCurrentStageName;
	public String isUpdateEquipmentList;

}