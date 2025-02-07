/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmProductionDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmProductionDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmProductionDetailsCacheModel
	implements CacheModel<FilmProductionDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmProductionDetailsCacheModel)) {
			return false;
		}

		FilmProductionDetailsCacheModel filmProductionDetailsCacheModel =
			(FilmProductionDetailsCacheModel)object;

		if (filmProductionDetailsId ==
				filmProductionDetailsCacheModel.filmProductionDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmProductionDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{filmProductionDetailsId=");
		sb.append(filmProductionDetailsId);
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
		sb.append(", productionTitle=");
		sb.append(productionTitle);
		sb.append(", totalProductionBudget=");
		sb.append(totalProductionBudget);
		sb.append(", expenditureInJamaica=");
		sb.append(expenditureInJamaica);
		sb.append(", foreignPersonnel=");
		sb.append(foreignPersonnel);
		sb.append(", jamaicanPersonnel=");
		sb.append(jamaicanPersonnel);
		sb.append(", productionType=");
		sb.append(productionType);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", fixerName=");
		sb.append(fixerName);
		sb.append(", fixerMobile=");
		sb.append(fixerMobile);
		sb.append(", fixerEmail=");
		sb.append(fixerEmail);
		sb.append(", preProductionDates=");
		sb.append(preProductionDates);
		sb.append(", productionDates=");
		sb.append(productionDates);
		sb.append(", productionStartDate=");
		sb.append(productionStartDate);
		sb.append(", productionEndDate=");
		sb.append(productionEndDate);
		sb.append(", proposedProductionLocations=");
		sb.append(proposedProductionLocations);
		sb.append(", productionInternationalCrew=");
		sb.append(productionInternationalCrew);
		sb.append(", productionjamaicanCrew=");
		sb.append(productionjamaicanCrew);
		sb.append(", productionExternalPermit=");
		sb.append(productionExternalPermit);
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmProductionDetails toEntityModel() {
		FilmProductionDetailsImpl filmProductionDetailsImpl =
			new FilmProductionDetailsImpl();

		filmProductionDetailsImpl.setFilmProductionDetailsId(
			filmProductionDetailsId);
		filmProductionDetailsImpl.setGroupId(groupId);
		filmProductionDetailsImpl.setCompanyId(companyId);
		filmProductionDetailsImpl.setUserId(userId);

		if (userName == null) {
			filmProductionDetailsImpl.setUserName("");
		}
		else {
			filmProductionDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmProductionDetailsImpl.setCreateDate(null);
		}
		else {
			filmProductionDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmProductionDetailsImpl.setModifiedDate(null);
		}
		else {
			filmProductionDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (productionTitle == null) {
			filmProductionDetailsImpl.setProductionTitle("");
		}
		else {
			filmProductionDetailsImpl.setProductionTitle(productionTitle);
		}

		if (totalProductionBudget == null) {
			filmProductionDetailsImpl.setTotalProductionBudget("");
		}
		else {
			filmProductionDetailsImpl.setTotalProductionBudget(
				totalProductionBudget);
		}

		if (expenditureInJamaica == null) {
			filmProductionDetailsImpl.setExpenditureInJamaica("");
		}
		else {
			filmProductionDetailsImpl.setExpenditureInJamaica(
				expenditureInJamaica);
		}

		if (foreignPersonnel == null) {
			filmProductionDetailsImpl.setForeignPersonnel("");
		}
		else {
			filmProductionDetailsImpl.setForeignPersonnel(foreignPersonnel);
		}

		if (jamaicanPersonnel == null) {
			filmProductionDetailsImpl.setJamaicanPersonnel("");
		}
		else {
			filmProductionDetailsImpl.setJamaicanPersonnel(jamaicanPersonnel);
		}

		if (productionType == null) {
			filmProductionDetailsImpl.setProductionType("");
		}
		else {
			filmProductionDetailsImpl.setProductionType(productionType);
		}

		if (companyName == null) {
			filmProductionDetailsImpl.setCompanyName("");
		}
		else {
			filmProductionDetailsImpl.setCompanyName(companyName);
		}

		if (fixerName == null) {
			filmProductionDetailsImpl.setFixerName("");
		}
		else {
			filmProductionDetailsImpl.setFixerName(fixerName);
		}

		if (fixerMobile == null) {
			filmProductionDetailsImpl.setFixerMobile("");
		}
		else {
			filmProductionDetailsImpl.setFixerMobile(fixerMobile);
		}

		if (fixerEmail == null) {
			filmProductionDetailsImpl.setFixerEmail("");
		}
		else {
			filmProductionDetailsImpl.setFixerEmail(fixerEmail);
		}

		if (preProductionDates == Long.MIN_VALUE) {
			filmProductionDetailsImpl.setPreProductionDates(null);
		}
		else {
			filmProductionDetailsImpl.setPreProductionDates(
				new Date(preProductionDates));
		}

		if (productionDates == Long.MIN_VALUE) {
			filmProductionDetailsImpl.setProductionDates(null);
		}
		else {
			filmProductionDetailsImpl.setProductionDates(
				new Date(productionDates));
		}

		if (productionStartDate == Long.MIN_VALUE) {
			filmProductionDetailsImpl.setProductionStartDate(null);
		}
		else {
			filmProductionDetailsImpl.setProductionStartDate(
				new Date(productionStartDate));
		}

		if (productionEndDate == Long.MIN_VALUE) {
			filmProductionDetailsImpl.setProductionEndDate(null);
		}
		else {
			filmProductionDetailsImpl.setProductionEndDate(
				new Date(productionEndDate));
		}

		if (proposedProductionLocations == null) {
			filmProductionDetailsImpl.setProposedProductionLocations("");
		}
		else {
			filmProductionDetailsImpl.setProposedProductionLocations(
				proposedProductionLocations);
		}

		if (productionInternationalCrew == null) {
			filmProductionDetailsImpl.setProductionInternationalCrew("");
		}
		else {
			filmProductionDetailsImpl.setProductionInternationalCrew(
				productionInternationalCrew);
		}

		if (productionjamaicanCrew == null) {
			filmProductionDetailsImpl.setProductionjamaicanCrew("");
		}
		else {
			filmProductionDetailsImpl.setProductionjamaicanCrew(
				productionjamaicanCrew);
		}

		if (productionExternalPermit == null) {
			filmProductionDetailsImpl.setProductionExternalPermit("");
		}
		else {
			filmProductionDetailsImpl.setProductionExternalPermit(
				productionExternalPermit);
		}

		filmProductionDetailsImpl.setFilmApplicationId(filmApplicationId);

		filmProductionDetailsImpl.resetOriginalValues();

		return filmProductionDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmProductionDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		productionTitle = objectInput.readUTF();
		totalProductionBudget = objectInput.readUTF();
		expenditureInJamaica = objectInput.readUTF();
		foreignPersonnel = objectInput.readUTF();
		jamaicanPersonnel = objectInput.readUTF();
		productionType = objectInput.readUTF();
		companyName = objectInput.readUTF();
		fixerName = objectInput.readUTF();
		fixerMobile = objectInput.readUTF();
		fixerEmail = objectInput.readUTF();
		preProductionDates = objectInput.readLong();
		productionDates = objectInput.readLong();
		productionStartDate = objectInput.readLong();
		productionEndDate = objectInput.readLong();
		proposedProductionLocations = objectInput.readUTF();
		productionInternationalCrew = objectInput.readUTF();
		productionjamaicanCrew = objectInput.readUTF();
		productionExternalPermit = objectInput.readUTF();

		filmApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmProductionDetailsId);

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

		if (productionTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionTitle);
		}

		if (totalProductionBudget == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalProductionBudget);
		}

		if (expenditureInJamaica == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expenditureInJamaica);
		}

		if (foreignPersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foreignPersonnel);
		}

		if (jamaicanPersonnel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jamaicanPersonnel);
		}

		if (productionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionType);
		}

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (fixerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fixerName);
		}

		if (fixerMobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fixerMobile);
		}

		if (fixerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fixerEmail);
		}

		objectOutput.writeLong(preProductionDates);
		objectOutput.writeLong(productionDates);
		objectOutput.writeLong(productionStartDate);
		objectOutput.writeLong(productionEndDate);

		if (proposedProductionLocations == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proposedProductionLocations);
		}

		if (productionInternationalCrew == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionInternationalCrew);
		}

		if (productionjamaicanCrew == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionjamaicanCrew);
		}

		if (productionExternalPermit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionExternalPermit);
		}

		objectOutput.writeLong(filmApplicationId);
	}

	public long filmProductionDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String productionTitle;
	public String totalProductionBudget;
	public String expenditureInJamaica;
	public String foreignPersonnel;
	public String jamaicanPersonnel;
	public String productionType;
	public String companyName;
	public String fixerName;
	public String fixerMobile;
	public String fixerEmail;
	public long preProductionDates;
	public long productionDates;
	public long productionStartDate;
	public long productionEndDate;
	public String proposedProductionLocations;
	public String productionInternationalCrew;
	public String productionjamaicanCrew;
	public String productionExternalPermit;
	public long filmApplicationId;

}