/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.jtb.application.form.service.model.AttractionDomesticService;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AttractionDomesticService in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttractionDomesticServiceCacheModel
	implements CacheModel<AttractionDomesticService>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AttractionDomesticServiceCacheModel)) {
			return false;
		}

		AttractionDomesticServiceCacheModel
			attractionDomesticServiceCacheModel =
				(AttractionDomesticServiceCacheModel)object;

		if (attractionDomesticServId ==
				attractionDomesticServiceCacheModel.attractionDomesticServId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attractionDomesticServId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{attractionDomesticServId=");
		sb.append(attractionDomesticServId);
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
		sb.append(", individualsApartment=");
		sb.append(individualsApartment);
		sb.append(", airportAssistance=");
		sb.append(airportAssistance);
		sb.append(", entireTour=");
		sb.append(entireTour);
		sb.append(", transfersDeparture=");
		sb.append(transfersDeparture);
		sb.append(", individualGroups=");
		sb.append(individualGroups);
		sb.append(", organizedconJunction=");
		sb.append(organizedconJunction);
		sb.append(", dailyTransportation=");
		sb.append(dailyTransportation);
		sb.append(", entertainment=");
		sb.append(entertainment);
		sb.append(", domesticTourSealDate=");
		sb.append(domesticTourSealDate);
		sb.append(", jtbApplicationId=");
		sb.append(jtbApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttractionDomesticService toEntityModel() {
		AttractionDomesticServiceImpl attractionDomesticServiceImpl =
			new AttractionDomesticServiceImpl();

		attractionDomesticServiceImpl.setAttractionDomesticServId(
			attractionDomesticServId);
		attractionDomesticServiceImpl.setGroupId(groupId);
		attractionDomesticServiceImpl.setCompanyId(companyId);
		attractionDomesticServiceImpl.setUserId(userId);

		if (userName == null) {
			attractionDomesticServiceImpl.setUserName("");
		}
		else {
			attractionDomesticServiceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			attractionDomesticServiceImpl.setCreateDate(null);
		}
		else {
			attractionDomesticServiceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			attractionDomesticServiceImpl.setModifiedDate(null);
		}
		else {
			attractionDomesticServiceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (individualsApartment == null) {
			attractionDomesticServiceImpl.setIndividualsApartment("");
		}
		else {
			attractionDomesticServiceImpl.setIndividualsApartment(
				individualsApartment);
		}

		if (airportAssistance == null) {
			attractionDomesticServiceImpl.setAirportAssistance("");
		}
		else {
			attractionDomesticServiceImpl.setAirportAssistance(
				airportAssistance);
		}

		if (entireTour == null) {
			attractionDomesticServiceImpl.setEntireTour("");
		}
		else {
			attractionDomesticServiceImpl.setEntireTour(entireTour);
		}

		if (transfersDeparture == null) {
			attractionDomesticServiceImpl.setTransfersDeparture("");
		}
		else {
			attractionDomesticServiceImpl.setTransfersDeparture(
				transfersDeparture);
		}

		if (individualGroups == null) {
			attractionDomesticServiceImpl.setIndividualGroups("");
		}
		else {
			attractionDomesticServiceImpl.setIndividualGroups(individualGroups);
		}

		if (organizedconJunction == null) {
			attractionDomesticServiceImpl.setOrganizedconJunction("");
		}
		else {
			attractionDomesticServiceImpl.setOrganizedconJunction(
				organizedconJunction);
		}

		if (dailyTransportation == null) {
			attractionDomesticServiceImpl.setDailyTransportation("");
		}
		else {
			attractionDomesticServiceImpl.setDailyTransportation(
				dailyTransportation);
		}

		if (entertainment == null) {
			attractionDomesticServiceImpl.setEntertainment("");
		}
		else {
			attractionDomesticServiceImpl.setEntertainment(entertainment);
		}

		if (domesticTourSealDate == Long.MIN_VALUE) {
			attractionDomesticServiceImpl.setDomesticTourSealDate(null);
		}
		else {
			attractionDomesticServiceImpl.setDomesticTourSealDate(
				new Date(domesticTourSealDate));
		}

		attractionDomesticServiceImpl.setJtbApplicationId(jtbApplicationId);

		attractionDomesticServiceImpl.resetOriginalValues();

		return attractionDomesticServiceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attractionDomesticServId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		individualsApartment = objectInput.readUTF();
		airportAssistance = objectInput.readUTF();
		entireTour = objectInput.readUTF();
		transfersDeparture = objectInput.readUTF();
		individualGroups = objectInput.readUTF();
		organizedconJunction = objectInput.readUTF();
		dailyTransportation = objectInput.readUTF();
		entertainment = objectInput.readUTF();
		domesticTourSealDate = objectInput.readLong();

		jtbApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(attractionDomesticServId);

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

		if (individualsApartment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(individualsApartment);
		}

		if (airportAssistance == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(airportAssistance);
		}

		if (entireTour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entireTour);
		}

		if (transfersDeparture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transfersDeparture);
		}

		if (individualGroups == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(individualGroups);
		}

		if (organizedconJunction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizedconJunction);
		}

		if (dailyTransportation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dailyTransportation);
		}

		if (entertainment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(entertainment);
		}

		objectOutput.writeLong(domesticTourSealDate);

		objectOutput.writeLong(jtbApplicationId);
	}

	public long attractionDomesticServId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String individualsApartment;
	public String airportAssistance;
	public String entireTour;
	public String transfersDeparture;
	public String individualGroups;
	public String organizedconJunction;
	public String dailyTransportation;
	public String entertainment;
	public long domesticTourSealDate;
	public long jtbApplicationId;

}