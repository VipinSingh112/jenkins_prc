/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.stages.services.model.FilmApplicationRegister;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmApplicationRegister in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmApplicationRegisterCacheModel
	implements CacheModel<FilmApplicationRegister>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmApplicationRegisterCacheModel)) {
			return false;
		}

		FilmApplicationRegisterCacheModel filmApplicationRegisterCacheModel =
			(FilmApplicationRegisterCacheModel)object;

		if (filmApplicationRegisterId ==
				filmApplicationRegisterCacheModel.filmApplicationRegisterId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmApplicationRegisterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(61);

		sb.append("{filmApplicationRegisterId=");
		sb.append(filmApplicationRegisterId);
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
		sb.append(", registrationDate=");
		sb.append(registrationDate);
		sb.append(", filmRegistrationNum=");
		sb.append(filmRegistrationNum);
		sb.append(", titleOfProduction=");
		sb.append(titleOfProduction);
		sb.append(", dateOfIssued=");
		sb.append(dateOfIssued);
		sb.append(", productionCompany=");
		sb.append(productionCompany);
		sb.append(", technicalFormOfProd=");
		sb.append(technicalFormOfProd);
		sb.append(", OriginOfProdCom=");
		sb.append(OriginOfProdCom);
		sb.append(", permitsRequired=");
		sb.append(permitsRequired);
		sb.append(", shootLocationInJamaica=");
		sb.append(shootLocationInJamaica);
		sb.append(", preProductionDate=");
		sb.append(preProductionDate);
		sb.append(", productionStartDate=");
		sb.append(productionStartDate);
		sb.append(", proposedDateOfArrival=");
		sb.append(proposedDateOfArrival);
		sb.append(", portOfEntry=");
		sb.append(portOfEntry);
		sb.append(", proposedDateOfDeparture=");
		sb.append(proposedDateOfDeparture);
		sb.append(", fullProductionBudget=");
		sb.append(fullProductionBudget);
		sb.append(", expectedBudgetSpendInJA=");
		sb.append(expectedBudgetSpendInJA);
		sb.append(", numberOFForeignCrewHired=");
		sb.append(numberOFForeignCrewHired);
		sb.append(", numberJamaicaCrewHired=");
		sb.append(numberJamaicaCrewHired);
		sb.append(", valueOfBondWaiver=");
		sb.append(valueOfBondWaiver);
		sb.append(", customsBroker=");
		sb.append(customsBroker);
		sb.append(", localProductionManagerOrFixer=");
		sb.append(localProductionManagerOrFixer);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmApplicationRegister toEntityModel() {
		FilmApplicationRegisterImpl filmApplicationRegisterImpl =
			new FilmApplicationRegisterImpl();

		filmApplicationRegisterImpl.setFilmApplicationRegisterId(
			filmApplicationRegisterId);
		filmApplicationRegisterImpl.setGroupId(groupId);
		filmApplicationRegisterImpl.setCompanyId(companyId);
		filmApplicationRegisterImpl.setUserId(userId);

		if (userName == null) {
			filmApplicationRegisterImpl.setUserName("");
		}
		else {
			filmApplicationRegisterImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmApplicationRegisterImpl.setCreateDate(null);
		}
		else {
			filmApplicationRegisterImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmApplicationRegisterImpl.setModifiedDate(null);
		}
		else {
			filmApplicationRegisterImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			filmApplicationRegisterImpl.setCaseId("");
		}
		else {
			filmApplicationRegisterImpl.setCaseId(caseId);
		}

		if (nameOfApplicant == null) {
			filmApplicationRegisterImpl.setNameOfApplicant("");
		}
		else {
			filmApplicationRegisterImpl.setNameOfApplicant(nameOfApplicant);
		}

		if (registrationDate == Long.MIN_VALUE) {
			filmApplicationRegisterImpl.setRegistrationDate(null);
		}
		else {
			filmApplicationRegisterImpl.setRegistrationDate(
				new Date(registrationDate));
		}

		if (filmRegistrationNum == null) {
			filmApplicationRegisterImpl.setFilmRegistrationNum("");
		}
		else {
			filmApplicationRegisterImpl.setFilmRegistrationNum(
				filmRegistrationNum);
		}

		if (titleOfProduction == null) {
			filmApplicationRegisterImpl.setTitleOfProduction("");
		}
		else {
			filmApplicationRegisterImpl.setTitleOfProduction(titleOfProduction);
		}

		if (dateOfIssued == Long.MIN_VALUE) {
			filmApplicationRegisterImpl.setDateOfIssued(null);
		}
		else {
			filmApplicationRegisterImpl.setDateOfIssued(new Date(dateOfIssued));
		}

		if (productionCompany == null) {
			filmApplicationRegisterImpl.setProductionCompany("");
		}
		else {
			filmApplicationRegisterImpl.setProductionCompany(productionCompany);
		}

		if (technicalFormOfProd == null) {
			filmApplicationRegisterImpl.setTechnicalFormOfProd("");
		}
		else {
			filmApplicationRegisterImpl.setTechnicalFormOfProd(
				technicalFormOfProd);
		}

		if (OriginOfProdCom == null) {
			filmApplicationRegisterImpl.setOriginOfProdCom("");
		}
		else {
			filmApplicationRegisterImpl.setOriginOfProdCom(OriginOfProdCom);
		}

		if (permitsRequired == null) {
			filmApplicationRegisterImpl.setPermitsRequired("");
		}
		else {
			filmApplicationRegisterImpl.setPermitsRequired(permitsRequired);
		}

		if (shootLocationInJamaica == null) {
			filmApplicationRegisterImpl.setShootLocationInJamaica("");
		}
		else {
			filmApplicationRegisterImpl.setShootLocationInJamaica(
				shootLocationInJamaica);
		}

		if (preProductionDate == Long.MIN_VALUE) {
			filmApplicationRegisterImpl.setPreProductionDate(null);
		}
		else {
			filmApplicationRegisterImpl.setPreProductionDate(
				new Date(preProductionDate));
		}

		if (productionStartDate == Long.MIN_VALUE) {
			filmApplicationRegisterImpl.setProductionStartDate(null);
		}
		else {
			filmApplicationRegisterImpl.setProductionStartDate(
				new Date(productionStartDate));
		}

		if (proposedDateOfArrival == null) {
			filmApplicationRegisterImpl.setProposedDateOfArrival("");
		}
		else {
			filmApplicationRegisterImpl.setProposedDateOfArrival(
				proposedDateOfArrival);
		}

		if (portOfEntry == null) {
			filmApplicationRegisterImpl.setPortOfEntry("");
		}
		else {
			filmApplicationRegisterImpl.setPortOfEntry(portOfEntry);
		}

		if (proposedDateOfDeparture == Long.MIN_VALUE) {
			filmApplicationRegisterImpl.setProposedDateOfDeparture(null);
		}
		else {
			filmApplicationRegisterImpl.setProposedDateOfDeparture(
				new Date(proposedDateOfDeparture));
		}

		if (fullProductionBudget == null) {
			filmApplicationRegisterImpl.setFullProductionBudget("");
		}
		else {
			filmApplicationRegisterImpl.setFullProductionBudget(
				fullProductionBudget);
		}

		if (expectedBudgetSpendInJA == null) {
			filmApplicationRegisterImpl.setExpectedBudgetSpendInJA("");
		}
		else {
			filmApplicationRegisterImpl.setExpectedBudgetSpendInJA(
				expectedBudgetSpendInJA);
		}

		if (numberOFForeignCrewHired == null) {
			filmApplicationRegisterImpl.setNumberOFForeignCrewHired("");
		}
		else {
			filmApplicationRegisterImpl.setNumberOFForeignCrewHired(
				numberOFForeignCrewHired);
		}

		if (numberJamaicaCrewHired == null) {
			filmApplicationRegisterImpl.setNumberJamaicaCrewHired("");
		}
		else {
			filmApplicationRegisterImpl.setNumberJamaicaCrewHired(
				numberJamaicaCrewHired);
		}

		if (valueOfBondWaiver == null) {
			filmApplicationRegisterImpl.setValueOfBondWaiver("");
		}
		else {
			filmApplicationRegisterImpl.setValueOfBondWaiver(valueOfBondWaiver);
		}

		if (customsBroker == null) {
			filmApplicationRegisterImpl.setCustomsBroker("");
		}
		else {
			filmApplicationRegisterImpl.setCustomsBroker(customsBroker);
		}

		if (localProductionManagerOrFixer == null) {
			filmApplicationRegisterImpl.setLocalProductionManagerOrFixer("");
		}
		else {
			filmApplicationRegisterImpl.setLocalProductionManagerOrFixer(
				localProductionManagerOrFixer);
		}

		filmApplicationRegisterImpl.resetOriginalValues();

		return filmApplicationRegisterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmApplicationRegisterId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		nameOfApplicant = objectInput.readUTF();
		registrationDate = objectInput.readLong();
		filmRegistrationNum = objectInput.readUTF();
		titleOfProduction = objectInput.readUTF();
		dateOfIssued = objectInput.readLong();
		productionCompany = objectInput.readUTF();
		technicalFormOfProd = objectInput.readUTF();
		OriginOfProdCom = objectInput.readUTF();
		permitsRequired = objectInput.readUTF();
		shootLocationInJamaica = objectInput.readUTF();
		preProductionDate = objectInput.readLong();
		productionStartDate = objectInput.readLong();
		proposedDateOfArrival = objectInput.readUTF();
		portOfEntry = objectInput.readUTF();
		proposedDateOfDeparture = objectInput.readLong();
		fullProductionBudget = objectInput.readUTF();
		expectedBudgetSpendInJA = objectInput.readUTF();
		numberOFForeignCrewHired = objectInput.readUTF();
		numberJamaicaCrewHired = objectInput.readUTF();
		valueOfBondWaiver = objectInput.readUTF();
		customsBroker = objectInput.readUTF();
		localProductionManagerOrFixer = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmApplicationRegisterId);

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

		objectOutput.writeLong(registrationDate);

		if (filmRegistrationNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(filmRegistrationNum);
		}

		if (titleOfProduction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titleOfProduction);
		}

		objectOutput.writeLong(dateOfIssued);

		if (productionCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionCompany);
		}

		if (technicalFormOfProd == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(technicalFormOfProd);
		}

		if (OriginOfProdCom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(OriginOfProdCom);
		}

		if (permitsRequired == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(permitsRequired);
		}

		if (shootLocationInJamaica == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shootLocationInJamaica);
		}

		objectOutput.writeLong(preProductionDate);
		objectOutput.writeLong(productionStartDate);

		if (proposedDateOfArrival == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proposedDateOfArrival);
		}

		if (portOfEntry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(portOfEntry);
		}

		objectOutput.writeLong(proposedDateOfDeparture);

		if (fullProductionBudget == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fullProductionBudget);
		}

		if (expectedBudgetSpendInJA == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expectedBudgetSpendInJA);
		}

		if (numberOFForeignCrewHired == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOFForeignCrewHired);
		}

		if (numberJamaicaCrewHired == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberJamaicaCrewHired);
		}

		if (valueOfBondWaiver == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfBondWaiver);
		}

		if (customsBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customsBroker);
		}

		if (localProductionManagerOrFixer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localProductionManagerOrFixer);
		}
	}

	public long filmApplicationRegisterId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String nameOfApplicant;
	public long registrationDate;
	public String filmRegistrationNum;
	public String titleOfProduction;
	public long dateOfIssued;
	public String productionCompany;
	public String technicalFormOfProd;
	public String OriginOfProdCom;
	public String permitsRequired;
	public String shootLocationInJamaica;
	public long preProductionDate;
	public long productionStartDate;
	public String proposedDateOfArrival;
	public String portOfEntry;
	public long proposedDateOfDeparture;
	public String fullProductionBudget;
	public String expectedBudgetSpendInJA;
	public String numberOFForeignCrewHired;
	public String numberJamaicaCrewHired;
	public String valueOfBondWaiver;
	public String customsBroker;
	public String localProductionManagerOrFixer;

}