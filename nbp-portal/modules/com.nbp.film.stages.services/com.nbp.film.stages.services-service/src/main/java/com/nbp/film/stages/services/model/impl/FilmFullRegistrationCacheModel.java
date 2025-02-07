/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.stages.services.model.FilmFullRegistration;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmFullRegistration in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmFullRegistrationCacheModel
	implements CacheModel<FilmFullRegistration>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmFullRegistrationCacheModel)) {
			return false;
		}

		FilmFullRegistrationCacheModel filmFullRegistrationCacheModel =
			(FilmFullRegistrationCacheModel)object;

		if (filmFullRegistrationId ==
				filmFullRegistrationCacheModel.filmFullRegistrationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmFullRegistrationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{filmFullRegistrationId=");
		sb.append(filmFullRegistrationId);
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
		sb.append(", nameOfApplicant=");
		sb.append(nameOfApplicant);
		sb.append(", productionType=");
		sb.append(productionType);
		sb.append(", registrationNumber=");
		sb.append(registrationNumber);
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", dateOfIssued=");
		sb.append(dateOfIssued);
		sb.append(", productionTitle=");
		sb.append(productionTitle);
		sb.append(", productionDateFrom=");
		sb.append(productionDateFrom);
		sb.append(", productionDateTo=");
		sb.append(productionDateTo);
		sb.append(", termsAndConditions=");
		sb.append(termsAndConditions);
		sb.append(", docFileEntrys=");
		sb.append(docFileEntrys);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmFullRegistration toEntityModel() {
		FilmFullRegistrationImpl filmFullRegistrationImpl =
			new FilmFullRegistrationImpl();

		filmFullRegistrationImpl.setFilmFullRegistrationId(
			filmFullRegistrationId);
		filmFullRegistrationImpl.setGroupId(groupId);
		filmFullRegistrationImpl.setCompanyId(companyId);
		filmFullRegistrationImpl.setUserId(userId);

		if (userName == null) {
			filmFullRegistrationImpl.setUserName("");
		}
		else {
			filmFullRegistrationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmFullRegistrationImpl.setCreateDate(null);
		}
		else {
			filmFullRegistrationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmFullRegistrationImpl.setModifiedDate(null);
		}
		else {
			filmFullRegistrationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			filmFullRegistrationImpl.setCaseId("");
		}
		else {
			filmFullRegistrationImpl.setCaseId(caseId);
		}

		if (nameOfApplicant == null) {
			filmFullRegistrationImpl.setNameOfApplicant("");
		}
		else {
			filmFullRegistrationImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (productionType == null) {
			filmFullRegistrationImpl.setProductionType("");
		}
		else {
			filmFullRegistrationImpl.setProductionType(productionType);
		}

		if (registrationNumber == null) {
			filmFullRegistrationImpl.setRegistrationNumber("");
		}
		else {
			filmFullRegistrationImpl.setRegistrationNumber(registrationNumber);
		}

		if (duration == null) {
			filmFullRegistrationImpl.setDuration("");
		}
		else {
			filmFullRegistrationImpl.setDuration(duration);
		}

		if (dateOfIssued == Long.MIN_VALUE) {
			filmFullRegistrationImpl.setDateOfIssued(null);
		}
		else {
			filmFullRegistrationImpl.setDateOfIssued(new Date(dateOfIssued));
		}

		if (productionTitle == null) {
			filmFullRegistrationImpl.setProductionTitle("");
		}
		else {
			filmFullRegistrationImpl.setProductionTitle(productionTitle);
		}

		if (productionDateFrom == Long.MIN_VALUE) {
			filmFullRegistrationImpl.setProductionDateFrom(null);
		}
		else {
			filmFullRegistrationImpl.setProductionDateFrom(
				new Date(productionDateFrom));
		}

		if (productionDateTo == Long.MIN_VALUE) {
			filmFullRegistrationImpl.setProductionDateTo(null);
		}
		else {
			filmFullRegistrationImpl.setProductionDateTo(
				new Date(productionDateTo));
		}

		if (termsAndConditions == null) {
			filmFullRegistrationImpl.setTermsAndConditions("");
		}
		else {
			filmFullRegistrationImpl.setTermsAndConditions(termsAndConditions);
		}

		filmFullRegistrationImpl.setDocFileEntrys(docFileEntrys);

		filmFullRegistrationImpl.resetOriginalValues();

		return filmFullRegistrationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmFullRegistrationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		nameOfApplicant = objectInput.readUTF();
		productionType = objectInput.readUTF();
		registrationNumber = objectInput.readUTF();
		duration = objectInput.readUTF();
		dateOfIssued = objectInput.readLong();
		productionTitle = objectInput.readUTF();
		productionDateFrom = objectInput.readLong();
		productionDateTo = objectInput.readLong();
		termsAndConditions = objectInput.readUTF();

		docFileEntrys = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmFullRegistrationId);

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

		if (nameOfApplicant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfApplicant);
		}

		if (productionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionType);
		}

		if (registrationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(registrationNumber);
		}

		if (duration == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(duration);
		}

		objectOutput.writeLong(dateOfIssued);

		if (productionTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionTitle);
		}

		objectOutput.writeLong(productionDateFrom);
		objectOutput.writeLong(productionDateTo);

		if (termsAndConditions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(termsAndConditions);
		}

		objectOutput.writeLong(docFileEntrys);
	}

	public long filmFullRegistrationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String nameOfApplicant;
	public String productionType;
	public String registrationNumber;
	public String duration;
	public long dateOfIssued;
	public String productionTitle;
	public long productionDateFrom;
	public long productionDateTo;
	public String termsAndConditions;
	public long docFileEntrys;

}