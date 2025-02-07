/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicSuspensionOfCet in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicSuspensionOfCetCacheModel
	implements CacheModel<MiicSuspensionOfCet>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicSuspensionOfCetCacheModel)) {
			return false;
		}

		MiicSuspensionOfCetCacheModel miicSuspensionOfCetCacheModel =
			(MiicSuspensionOfCetCacheModel)object;

		if (miicSuspensionOfCetId ==
				miicSuspensionOfCetCacheModel.miicSuspensionOfCetId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicSuspensionOfCetId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{miicSuspensionOfCetId=");
		sb.append(miicSuspensionOfCetId);
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
		sb.append(", indicationOfUrgency=");
		sb.append(indicationOfUrgency);
		sb.append(", requestForSuspension=");
		sb.append(requestForSuspension);
		sb.append(", evidenceOfInability=");
		sb.append(evidenceOfInability);
		sb.append(", evidenceOfConsultation=");
		sb.append(evidenceOfConsultation);
		sb.append(", evidenceOfConsultationForeign=");
		sb.append(evidenceOfConsultationForeign);
		sb.append(", nameOfAuthorizedPersonnel=");
		sb.append(nameOfAuthorizedPersonnel);
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicSuspensionOfCet toEntityModel() {
		MiicSuspensionOfCetImpl miicSuspensionOfCetImpl =
			new MiicSuspensionOfCetImpl();

		miicSuspensionOfCetImpl.setMiicSuspensionOfCetId(miicSuspensionOfCetId);
		miicSuspensionOfCetImpl.setGroupId(groupId);
		miicSuspensionOfCetImpl.setCompanyId(companyId);
		miicSuspensionOfCetImpl.setUserId(userId);

		if (userName == null) {
			miicSuspensionOfCetImpl.setUserName("");
		}
		else {
			miicSuspensionOfCetImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicSuspensionOfCetImpl.setCreateDate(null);
		}
		else {
			miicSuspensionOfCetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicSuspensionOfCetImpl.setModifiedDate(null);
		}
		else {
			miicSuspensionOfCetImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (indicationOfUrgency == null) {
			miicSuspensionOfCetImpl.setIndicationOfUrgency("");
		}
		else {
			miicSuspensionOfCetImpl.setIndicationOfUrgency(indicationOfUrgency);
		}

		if (requestForSuspension == null) {
			miicSuspensionOfCetImpl.setRequestForSuspension("");
		}
		else {
			miicSuspensionOfCetImpl.setRequestForSuspension(
				requestForSuspension);
		}

		if (evidenceOfInability == null) {
			miicSuspensionOfCetImpl.setEvidenceOfInability("");
		}
		else {
			miicSuspensionOfCetImpl.setEvidenceOfInability(evidenceOfInability);
		}

		if (evidenceOfConsultation == null) {
			miicSuspensionOfCetImpl.setEvidenceOfConsultation("");
		}
		else {
			miicSuspensionOfCetImpl.setEvidenceOfConsultation(
				evidenceOfConsultation);
		}

		if (evidenceOfConsultationForeign == null) {
			miicSuspensionOfCetImpl.setEvidenceOfConsultationForeign("");
		}
		else {
			miicSuspensionOfCetImpl.setEvidenceOfConsultationForeign(
				evidenceOfConsultationForeign);
		}

		if (nameOfAuthorizedPersonnel == null) {
			miicSuspensionOfCetImpl.setNameOfAuthorizedPersonnel("");
		}
		else {
			miicSuspensionOfCetImpl.setNameOfAuthorizedPersonnel(
				nameOfAuthorizedPersonnel);
		}

		miicSuspensionOfCetImpl.setMiicApplicationId(miicApplicationId);

		miicSuspensionOfCetImpl.resetOriginalValues();

		return miicSuspensionOfCetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicSuspensionOfCetId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		indicationOfUrgency = objectInput.readUTF();
		requestForSuspension = objectInput.readUTF();
		evidenceOfInability = objectInput.readUTF();
		evidenceOfConsultation = objectInput.readUTF();
		evidenceOfConsultationForeign = objectInput.readUTF();
		nameOfAuthorizedPersonnel = objectInput.readUTF();

		miicApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicSuspensionOfCetId);

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

		if (indicationOfUrgency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicationOfUrgency);
		}

		if (requestForSuspension == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestForSuspension);
		}

		if (evidenceOfInability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(evidenceOfInability);
		}

		if (evidenceOfConsultation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(evidenceOfConsultation);
		}

		if (evidenceOfConsultationForeign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(evidenceOfConsultationForeign);
		}

		if (nameOfAuthorizedPersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfAuthorizedPersonnel);
		}

		objectOutput.writeLong(miicApplicationId);
	}

	public long miicSuspensionOfCetId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String indicationOfUrgency;
	public String requestForSuspension;
	public String evidenceOfInability;
	public String evidenceOfConsultation;
	public String evidenceOfConsultationForeign;
	public String nameOfAuthorizedPersonnel;
	public long miicApplicationId;

}