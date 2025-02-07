/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MiicSuspensionOfCetAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MiicSuspensionOfCetAddCacheModel
	implements CacheModel<MiicSuspensionOfCetAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MiicSuspensionOfCetAddCacheModel)) {
			return false;
		}

		MiicSuspensionOfCetAddCacheModel miicSuspensionOfCetAddCacheModel =
			(MiicSuspensionOfCetAddCacheModel)object;

		if (miicSuspensionOfCetAddId ==
				miicSuspensionOfCetAddCacheModel.miicSuspensionOfCetAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, miicSuspensionOfCetAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{miicSuspensionOfCetAddId=");
		sb.append(miicSuspensionOfCetAddId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", tariffHeadingNum =");
		sb.append(tariffHeadingNum);
		sb.append(", address=");
		sb.append(address);
		sb.append(", description=");
		sb.append(description);
		sb.append(", amountQuantity=");
		sb.append(amountQuantity);
		sb.append(", amountEstimateInUs=");
		sb.append(amountEstimateInUs);
		sb.append(", technologySpecification=");
		sb.append(technologySpecification);
		sb.append(", cetRate=");
		sb.append(cetRate);
		sb.append(", rateProposed=");
		sb.append(rateProposed);
		sb.append(", periodOfRateChangeFrom=");
		sb.append(periodOfRateChangeFrom);
		sb.append(", periodOfRateChangeTo=");
		sb.append(periodOfRateChangeTo);
		sb.append(", indicationOfUrgency=");
		sb.append(indicationOfUrgency);
		sb.append(", requestForSuspensionOfRate=");
		sb.append(requestForSuspensionOfRate);
		sb.append(", evidenceOfInability=");
		sb.append(evidenceOfInability);
		sb.append(", evidenceOfConsultation=");
		sb.append(evidenceOfConsultation);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", miicApplicationId=");
		sb.append(miicApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MiicSuspensionOfCetAdd toEntityModel() {
		MiicSuspensionOfCetAddImpl miicSuspensionOfCetAddImpl =
			new MiicSuspensionOfCetAddImpl();

		miicSuspensionOfCetAddImpl.setMiicSuspensionOfCetAddId(
			miicSuspensionOfCetAddId);
		miicSuspensionOfCetAddImpl.setGroupId(groupId);
		miicSuspensionOfCetAddImpl.setCompanyId(companyId);
		miicSuspensionOfCetAddImpl.setUserId(userId);

		if (userName == null) {
			miicSuspensionOfCetAddImpl.setUserName("");
		}
		else {
			miicSuspensionOfCetAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			miicSuspensionOfCetAddImpl.setCreateDate(null);
		}
		else {
			miicSuspensionOfCetAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			miicSuspensionOfCetAddImpl.setModifiedDate(null);
		}
		else {
			miicSuspensionOfCetAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			miicSuspensionOfCetAddImpl.setName("");
		}
		else {
			miicSuspensionOfCetAddImpl.setName(name);
		}

		if (tariffHeadingNum == null) {
			miicSuspensionOfCetAddImpl.setTariffHeadingNum("");
		}
		else {
			miicSuspensionOfCetAddImpl.setTariffHeadingNum(tariffHeadingNum);
		}

		if (address == null) {
			miicSuspensionOfCetAddImpl.setAddress("");
		}
		else {
			miicSuspensionOfCetAddImpl.setAddress(address);
		}

		if (description == null) {
			miicSuspensionOfCetAddImpl.setDescription("");
		}
		else {
			miicSuspensionOfCetAddImpl.setDescription(description);
		}

		if (amountQuantity == null) {
			miicSuspensionOfCetAddImpl.setAmountQuantity("");
		}
		else {
			miicSuspensionOfCetAddImpl.setAmountQuantity(amountQuantity);
		}

		if (amountEstimateInUs == null) {
			miicSuspensionOfCetAddImpl.setAmountEstimateInUs("");
		}
		else {
			miicSuspensionOfCetAddImpl.setAmountEstimateInUs(
				amountEstimateInUs);
		}

		if (technologySpecification == null) {
			miicSuspensionOfCetAddImpl.setTechnologySpecification("");
		}
		else {
			miicSuspensionOfCetAddImpl.setTechnologySpecification(
				technologySpecification);
		}

		if (cetRate == null) {
			miicSuspensionOfCetAddImpl.setCetRate("");
		}
		else {
			miicSuspensionOfCetAddImpl.setCetRate(cetRate);
		}

		if (rateProposed == null) {
			miicSuspensionOfCetAddImpl.setRateProposed("");
		}
		else {
			miicSuspensionOfCetAddImpl.setRateProposed(rateProposed);
		}

		if (periodOfRateChangeFrom == Long.MIN_VALUE) {
			miicSuspensionOfCetAddImpl.setPeriodOfRateChangeFrom(null);
		}
		else {
			miicSuspensionOfCetAddImpl.setPeriodOfRateChangeFrom(
				new Date(periodOfRateChangeFrom));
		}

		if (periodOfRateChangeTo == Long.MIN_VALUE) {
			miicSuspensionOfCetAddImpl.setPeriodOfRateChangeTo(null);
		}
		else {
			miicSuspensionOfCetAddImpl.setPeriodOfRateChangeTo(
				new Date(periodOfRateChangeTo));
		}

		if (indicationOfUrgency == null) {
			miicSuspensionOfCetAddImpl.setIndicationOfUrgency("");
		}
		else {
			miicSuspensionOfCetAddImpl.setIndicationOfUrgency(
				indicationOfUrgency);
		}

		if (requestForSuspensionOfRate == null) {
			miicSuspensionOfCetAddImpl.setRequestForSuspensionOfRate("");
		}
		else {
			miicSuspensionOfCetAddImpl.setRequestForSuspensionOfRate(
				requestForSuspensionOfRate);
		}

		if (evidenceOfInability == null) {
			miicSuspensionOfCetAddImpl.setEvidenceOfInability("");
		}
		else {
			miicSuspensionOfCetAddImpl.setEvidenceOfInability(
				evidenceOfInability);
		}

		if (evidenceOfConsultation == null) {
			miicSuspensionOfCetAddImpl.setEvidenceOfConsultation("");
		}
		else {
			miicSuspensionOfCetAddImpl.setEvidenceOfConsultation(
				evidenceOfConsultation);
		}

		if (counter == null) {
			miicSuspensionOfCetAddImpl.setCounter("");
		}
		else {
			miicSuspensionOfCetAddImpl.setCounter(counter);
		}

		miicSuspensionOfCetAddImpl.setMiicApplicationId(miicApplicationId);

		miicSuspensionOfCetAddImpl.resetOriginalValues();

		return miicSuspensionOfCetAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		miicSuspensionOfCetAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		tariffHeadingNum = objectInput.readUTF();
		address = objectInput.readUTF();
		description = objectInput.readUTF();
		amountQuantity = objectInput.readUTF();
		amountEstimateInUs = objectInput.readUTF();
		technologySpecification = objectInput.readUTF();
		cetRate = objectInput.readUTF();
		rateProposed = objectInput.readUTF();
		periodOfRateChangeFrom = objectInput.readLong();
		periodOfRateChangeTo = objectInput.readLong();
		indicationOfUrgency = objectInput.readUTF();
		requestForSuspensionOfRate = objectInput.readUTF();
		evidenceOfInability = objectInput.readUTF();
		evidenceOfConsultation = objectInput.readUTF();
		counter = objectInput.readUTF();

		miicApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(miicSuspensionOfCetAddId);

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

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (tariffHeadingNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tariffHeadingNum);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (amountQuantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountQuantity);
		}

		if (amountEstimateInUs == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amountEstimateInUs);
		}

		if (technologySpecification == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(technologySpecification);
		}

		if (cetRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cetRate);
		}

		if (rateProposed == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rateProposed);
		}

		objectOutput.writeLong(periodOfRateChangeFrom);
		objectOutput.writeLong(periodOfRateChangeTo);

		if (indicationOfUrgency == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicationOfUrgency);
		}

		if (requestForSuspensionOfRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestForSuspensionOfRate);
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

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(miicApplicationId);
	}

	public long miicSuspensionOfCetAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String tariffHeadingNum;
	public String address;
	public String description;
	public String amountQuantity;
	public String amountEstimateInUs;
	public String technologySpecification;
	public String cetRate;
	public String rateProposed;
	public long periodOfRateChangeFrom;
	public long periodOfRateChangeTo;
	public String indicationOfUrgency;
	public String requestForSuspensionOfRate;
	public String evidenceOfInability;
	public String evidenceOfConsultation;
	public String counter;
	public long miicApplicationId;

}