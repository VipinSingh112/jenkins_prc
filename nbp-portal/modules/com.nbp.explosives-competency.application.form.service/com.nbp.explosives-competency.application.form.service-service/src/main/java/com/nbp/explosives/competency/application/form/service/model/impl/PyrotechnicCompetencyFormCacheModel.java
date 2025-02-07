/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PyrotechnicCompetencyForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PyrotechnicCompetencyFormCacheModel
	implements CacheModel<PyrotechnicCompetencyForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PyrotechnicCompetencyFormCacheModel)) {
			return false;
		}

		PyrotechnicCompetencyFormCacheModel
			pyrotechnicCompetencyFormCacheModel =
				(PyrotechnicCompetencyFormCacheModel)object;

		if (pyrotechnicCompetencyFormId ==
				pyrotechnicCompetencyFormCacheModel.
					pyrotechnicCompetencyFormId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pyrotechnicCompetencyFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{pyrotechnicCompetencyFormId=");
		sb.append(pyrotechnicCompetencyFormId);
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
		sb.append(", firstNamePyro=");
		sb.append(firstNamePyro);
		sb.append(", surNamePyro=");
		sb.append(surNamePyro);
		sb.append(", middleNamePyro=");
		sb.append(middleNamePyro);
		sb.append(", genderPyro=");
		sb.append(genderPyro);
		sb.append(", officeNumberPyro=");
		sb.append(officeNumberPyro);
		sb.append(", cellNumPyro=");
		sb.append(cellNumPyro);
		sb.append(", trnNumPyro=");
		sb.append(trnNumPyro);
		sb.append(", dateOfBirthPyro=");
		sb.append(dateOfBirthPyro);
		sb.append(", addressPyro=");
		sb.append(addressPyro);
		sb.append(", educationalBackPyro=");
		sb.append(educationalBackPyro);
		sb.append(", blastingCoursePyro=");
		sb.append(blastingCoursePyro);
		sb.append(", statePyro=");
		sb.append(statePyro);
		sb.append(", nameOfCoursePyro=");
		sb.append(nameOfCoursePyro);
		sb.append(", courseOrganiserPyro=");
		sb.append(courseOrganiserPyro);
		sb.append(", dateAppliPyro=");
		sb.append(dateAppliPyro);
		sb.append(", explosivesApplicationId=");
		sb.append(explosivesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PyrotechnicCompetencyForm toEntityModel() {
		PyrotechnicCompetencyFormImpl pyrotechnicCompetencyFormImpl =
			new PyrotechnicCompetencyFormImpl();

		pyrotechnicCompetencyFormImpl.setPyrotechnicCompetencyFormId(
			pyrotechnicCompetencyFormId);
		pyrotechnicCompetencyFormImpl.setGroupId(groupId);
		pyrotechnicCompetencyFormImpl.setCompanyId(companyId);
		pyrotechnicCompetencyFormImpl.setUserId(userId);

		if (userName == null) {
			pyrotechnicCompetencyFormImpl.setUserName("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pyrotechnicCompetencyFormImpl.setCreateDate(null);
		}
		else {
			pyrotechnicCompetencyFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pyrotechnicCompetencyFormImpl.setModifiedDate(null);
		}
		else {
			pyrotechnicCompetencyFormImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (firstNamePyro == null) {
			pyrotechnicCompetencyFormImpl.setFirstNamePyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setFirstNamePyro(firstNamePyro);
		}

		if (surNamePyro == null) {
			pyrotechnicCompetencyFormImpl.setSurNamePyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setSurNamePyro(surNamePyro);
		}

		if (middleNamePyro == null) {
			pyrotechnicCompetencyFormImpl.setMiddleNamePyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setMiddleNamePyro(middleNamePyro);
		}

		if (genderPyro == null) {
			pyrotechnicCompetencyFormImpl.setGenderPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setGenderPyro(genderPyro);
		}

		if (officeNumberPyro == null) {
			pyrotechnicCompetencyFormImpl.setOfficeNumberPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setOfficeNumberPyro(officeNumberPyro);
		}

		if (cellNumPyro == null) {
			pyrotechnicCompetencyFormImpl.setCellNumPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setCellNumPyro(cellNumPyro);
		}

		if (trnNumPyro == null) {
			pyrotechnicCompetencyFormImpl.setTrnNumPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setTrnNumPyro(trnNumPyro);
		}

		if (dateOfBirthPyro == Long.MIN_VALUE) {
			pyrotechnicCompetencyFormImpl.setDateOfBirthPyro(null);
		}
		else {
			pyrotechnicCompetencyFormImpl.setDateOfBirthPyro(
				new Date(dateOfBirthPyro));
		}

		if (addressPyro == null) {
			pyrotechnicCompetencyFormImpl.setAddressPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setAddressPyro(addressPyro);
		}

		if (educationalBackPyro == null) {
			pyrotechnicCompetencyFormImpl.setEducationalBackPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setEducationalBackPyro(
				educationalBackPyro);
		}

		if (blastingCoursePyro == null) {
			pyrotechnicCompetencyFormImpl.setBlastingCoursePyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setBlastingCoursePyro(
				blastingCoursePyro);
		}

		if (statePyro == null) {
			pyrotechnicCompetencyFormImpl.setStatePyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setStatePyro(statePyro);
		}

		if (nameOfCoursePyro == null) {
			pyrotechnicCompetencyFormImpl.setNameOfCoursePyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setNameOfCoursePyro(nameOfCoursePyro);
		}

		if (courseOrganiserPyro == null) {
			pyrotechnicCompetencyFormImpl.setCourseOrganiserPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setCourseOrganiserPyro(
				courseOrganiserPyro);
		}

		if (dateAppliPyro == null) {
			pyrotechnicCompetencyFormImpl.setDateAppliPyro("");
		}
		else {
			pyrotechnicCompetencyFormImpl.setDateAppliPyro(dateAppliPyro);
		}

		pyrotechnicCompetencyFormImpl.setExplosivesApplicationId(
			explosivesApplicationId);

		pyrotechnicCompetencyFormImpl.resetOriginalValues();

		return pyrotechnicCompetencyFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pyrotechnicCompetencyFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstNamePyro = objectInput.readUTF();
		surNamePyro = objectInput.readUTF();
		middleNamePyro = objectInput.readUTF();
		genderPyro = objectInput.readUTF();
		officeNumberPyro = objectInput.readUTF();
		cellNumPyro = objectInput.readUTF();
		trnNumPyro = objectInput.readUTF();
		dateOfBirthPyro = objectInput.readLong();
		addressPyro = objectInput.readUTF();
		educationalBackPyro = objectInput.readUTF();
		blastingCoursePyro = objectInput.readUTF();
		statePyro = objectInput.readUTF();
		nameOfCoursePyro = objectInput.readUTF();
		courseOrganiserPyro = objectInput.readUTF();
		dateAppliPyro = objectInput.readUTF();

		explosivesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pyrotechnicCompetencyFormId);

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

		if (firstNamePyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstNamePyro);
		}

		if (surNamePyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surNamePyro);
		}

		if (middleNamePyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleNamePyro);
		}

		if (genderPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(genderPyro);
		}

		if (officeNumberPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(officeNumberPyro);
		}

		if (cellNumPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cellNumPyro);
		}

		if (trnNumPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trnNumPyro);
		}

		objectOutput.writeLong(dateOfBirthPyro);

		if (addressPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(addressPyro);
		}

		if (educationalBackPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(educationalBackPyro);
		}

		if (blastingCoursePyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(blastingCoursePyro);
		}

		if (statePyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statePyro);
		}

		if (nameOfCoursePyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfCoursePyro);
		}

		if (courseOrganiserPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(courseOrganiserPyro);
		}

		if (dateAppliPyro == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dateAppliPyro);
		}

		objectOutput.writeLong(explosivesApplicationId);
	}

	public long pyrotechnicCompetencyFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String firstNamePyro;
	public String surNamePyro;
	public String middleNamePyro;
	public String genderPyro;
	public String officeNumberPyro;
	public String cellNumPyro;
	public String trnNumPyro;
	public long dateOfBirthPyro;
	public String addressPyro;
	public String educationalBackPyro;
	public String blastingCoursePyro;
	public String statePyro;
	public String nameOfCoursePyro;
	public String courseOrganiserPyro;
	public String dateAppliPyro;
	public long explosivesApplicationId;

}