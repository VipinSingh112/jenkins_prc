/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.film.application.form.service.model.FilmOtherDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilmOtherDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FilmOtherDetailsCacheModel
	implements CacheModel<FilmOtherDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FilmOtherDetailsCacheModel)) {
			return false;
		}

		FilmOtherDetailsCacheModel filmOtherDetailsCacheModel =
			(FilmOtherDetailsCacheModel)object;

		if (filmOtherDetailsId ==
				filmOtherDetailsCacheModel.filmOtherDetailsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, filmOtherDetailsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{filmOtherDetailsId=");
		sb.append(filmOtherDetailsId);
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
		sb.append(", additionalPermits=");
		sb.append(additionalPermits);
		sb.append(", additionalOtherPermits=");
		sb.append(additionalOtherPermits);
		sb.append(", insurance=");
		sb.append(insurance);
		sb.append(", copyOfInsurance=");
		sb.append(copyOfInsurance);
		sb.append(", temporaryImportEquipment=");
		sb.append(temporaryImportEquipment);
		sb.append(", personnelTravellingEquipment=");
		sb.append(personnelTravellingEquipment);
		sb.append(", portOfEntry=");
		sb.append(portOfEntry);
		sb.append(", arrivalDate=");
		sb.append(arrivalDate);
		sb.append(", departureDate=");
		sb.append(departureDate);
		sb.append(", flightDetails=");
		sb.append(flightDetails);
		sb.append(", shippingCompany=");
		sb.append(shippingCompany);
		sb.append(", shippingVesselNo=");
		sb.append(shippingVesselNo);
		sb.append(", customsBroker=");
		sb.append(customsBroker);
		sb.append(", brokerEmail=");
		sb.append(brokerEmail);
		sb.append(", brokerMobile=");
		sb.append(brokerMobile);
		sb.append(", typeOfEquipmentJamaica=");
		sb.append(typeOfEquipmentJamaica);
		sb.append(", rentalArrangedThrough=");
		sb.append(rentalArrangedThrough);
		sb.append(", filmApplicationId=");
		sb.append(filmApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilmOtherDetails toEntityModel() {
		FilmOtherDetailsImpl filmOtherDetailsImpl = new FilmOtherDetailsImpl();

		filmOtherDetailsImpl.setFilmOtherDetailsId(filmOtherDetailsId);
		filmOtherDetailsImpl.setGroupId(groupId);
		filmOtherDetailsImpl.setCompanyId(companyId);
		filmOtherDetailsImpl.setUserId(userId);

		if (userName == null) {
			filmOtherDetailsImpl.setUserName("");
		}
		else {
			filmOtherDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filmOtherDetailsImpl.setCreateDate(null);
		}
		else {
			filmOtherDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filmOtherDetailsImpl.setModifiedDate(null);
		}
		else {
			filmOtherDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (additionalPermits == null) {
			filmOtherDetailsImpl.setAdditionalPermits("");
		}
		else {
			filmOtherDetailsImpl.setAdditionalPermits(additionalPermits);
		}

		if (additionalOtherPermits == null) {
			filmOtherDetailsImpl.setAdditionalOtherPermits("");
		}
		else {
			filmOtherDetailsImpl.setAdditionalOtherPermits(
				additionalOtherPermits);
		}

		if (insurance == null) {
			filmOtherDetailsImpl.setInsurance("");
		}
		else {
			filmOtherDetailsImpl.setInsurance(insurance);
		}

		if (copyOfInsurance == null) {
			filmOtherDetailsImpl.setCopyOfInsurance("");
		}
		else {
			filmOtherDetailsImpl.setCopyOfInsurance(copyOfInsurance);
		}

		if (temporaryImportEquipment == null) {
			filmOtherDetailsImpl.setTemporaryImportEquipment("");
		}
		else {
			filmOtherDetailsImpl.setTemporaryImportEquipment(
				temporaryImportEquipment);
		}

		if (personnelTravellingEquipment == null) {
			filmOtherDetailsImpl.setPersonnelTravellingEquipment("");
		}
		else {
			filmOtherDetailsImpl.setPersonnelTravellingEquipment(
				personnelTravellingEquipment);
		}

		if (portOfEntry == null) {
			filmOtherDetailsImpl.setPortOfEntry("");
		}
		else {
			filmOtherDetailsImpl.setPortOfEntry(portOfEntry);
		}

		if (arrivalDate == Long.MIN_VALUE) {
			filmOtherDetailsImpl.setArrivalDate(null);
		}
		else {
			filmOtherDetailsImpl.setArrivalDate(new Date(arrivalDate));
		}

		if (departureDate == Long.MIN_VALUE) {
			filmOtherDetailsImpl.setDepartureDate(null);
		}
		else {
			filmOtherDetailsImpl.setDepartureDate(new Date(departureDate));
		}

		if (flightDetails == null) {
			filmOtherDetailsImpl.setFlightDetails("");
		}
		else {
			filmOtherDetailsImpl.setFlightDetails(flightDetails);
		}

		if (shippingCompany == null) {
			filmOtherDetailsImpl.setShippingCompany("");
		}
		else {
			filmOtherDetailsImpl.setShippingCompany(shippingCompany);
		}

		if (shippingVesselNo == null) {
			filmOtherDetailsImpl.setShippingVesselNo("");
		}
		else {
			filmOtherDetailsImpl.setShippingVesselNo(shippingVesselNo);
		}

		if (customsBroker == null) {
			filmOtherDetailsImpl.setCustomsBroker("");
		}
		else {
			filmOtherDetailsImpl.setCustomsBroker(customsBroker);
		}

		if (brokerEmail == null) {
			filmOtherDetailsImpl.setBrokerEmail("");
		}
		else {
			filmOtherDetailsImpl.setBrokerEmail(brokerEmail);
		}

		if (brokerMobile == null) {
			filmOtherDetailsImpl.setBrokerMobile("");
		}
		else {
			filmOtherDetailsImpl.setBrokerMobile(brokerMobile);
		}

		if (typeOfEquipmentJamaica == null) {
			filmOtherDetailsImpl.setTypeOfEquipmentJamaica("");
		}
		else {
			filmOtherDetailsImpl.setTypeOfEquipmentJamaica(
				typeOfEquipmentJamaica);
		}

		if (rentalArrangedThrough == null) {
			filmOtherDetailsImpl.setRentalArrangedThrough("");
		}
		else {
			filmOtherDetailsImpl.setRentalArrangedThrough(
				rentalArrangedThrough);
		}

		filmOtherDetailsImpl.setFilmApplicationId(filmApplicationId);

		filmOtherDetailsImpl.resetOriginalValues();

		return filmOtherDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filmOtherDetailsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		additionalPermits = objectInput.readUTF();
		additionalOtherPermits = objectInput.readUTF();
		insurance = objectInput.readUTF();
		copyOfInsurance = objectInput.readUTF();
		temporaryImportEquipment = objectInput.readUTF();
		personnelTravellingEquipment = objectInput.readUTF();
		portOfEntry = objectInput.readUTF();
		arrivalDate = objectInput.readLong();
		departureDate = objectInput.readLong();
		flightDetails = objectInput.readUTF();
		shippingCompany = objectInput.readUTF();
		shippingVesselNo = objectInput.readUTF();
		customsBroker = objectInput.readUTF();
		brokerEmail = objectInput.readUTF();
		brokerMobile = objectInput.readUTF();
		typeOfEquipmentJamaica = objectInput.readUTF();
		rentalArrangedThrough = objectInput.readUTF();

		filmApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(filmOtherDetailsId);

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

		if (additionalPermits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalPermits);
		}

		if (additionalOtherPermits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalOtherPermits);
		}

		if (insurance == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insurance);
		}

		if (copyOfInsurance == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(copyOfInsurance);
		}

		if (temporaryImportEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporaryImportEquipment);
		}

		if (personnelTravellingEquipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(personnelTravellingEquipment);
		}

		if (portOfEntry == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(portOfEntry);
		}

		objectOutput.writeLong(arrivalDate);
		objectOutput.writeLong(departureDate);

		if (flightDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(flightDetails);
		}

		if (shippingCompany == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shippingCompany);
		}

		if (shippingVesselNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(shippingVesselNo);
		}

		if (customsBroker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customsBroker);
		}

		if (brokerEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brokerEmail);
		}

		if (brokerMobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brokerMobile);
		}

		if (typeOfEquipmentJamaica == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfEquipmentJamaica);
		}

		if (rentalArrangedThrough == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rentalArrangedThrough);
		}

		objectOutput.writeLong(filmApplicationId);
	}

	public long filmOtherDetailsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String additionalPermits;
	public String additionalOtherPermits;
	public String insurance;
	public String copyOfInsurance;
	public String temporaryImportEquipment;
	public String personnelTravellingEquipment;
	public String portOfEntry;
	public long arrivalDate;
	public long departureDate;
	public String flightDetails;
	public String shippingCompany;
	public String shippingVesselNo;
	public String customsBroker;
	public String brokerEmail;
	public String brokerMobile;
	public String typeOfEquipmentJamaica;
	public String rentalArrangedThrough;
	public long filmApplicationId;

}