/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjBusinessDetailAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjBusinessDetailAddCacheModel
	implements CacheModel<NcbjBusinessDetailAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjBusinessDetailAddCacheModel)) {
			return false;
		}

		NcbjBusinessDetailAddCacheModel ncbjBusinessDetailAddCacheModel =
			(NcbjBusinessDetailAddCacheModel)object;

		if (ncbjBusinessDetailAddId ==
				ncbjBusinessDetailAddCacheModel.ncbjBusinessDetailAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjBusinessDetailAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{ncbjBusinessDetailAddId=");
		sb.append(ncbjBusinessDetailAddId);
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
		sb.append(", numberAndTimeOfShift=");
		sb.append(numberAndTimeOfShift);
		sb.append(", typeOfProduct=");
		sb.append(typeOfProduct);
		sb.append(", businessAddress=");
		sb.append(businessAddress);
		sb.append(", headOffices=");
		sb.append(headOffices);
		sb.append(", noOfFullTimeEmployees=");
		sb.append(noOfFullTimeEmployees);
		sb.append(", noOfPartTimeEmployees=");
		sb.append(noOfPartTimeEmployees);
		sb.append(", noOfContractors=");
		sb.append(noOfContractors);
		sb.append(", noOfContractedWorkers=");
		sb.append(noOfContractedWorkers);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjBusinessDetailAdd toEntityModel() {
		NcbjBusinessDetailAddImpl ncbjBusinessDetailAddImpl =
			new NcbjBusinessDetailAddImpl();

		ncbjBusinessDetailAddImpl.setNcbjBusinessDetailAddId(
			ncbjBusinessDetailAddId);
		ncbjBusinessDetailAddImpl.setGroupId(groupId);
		ncbjBusinessDetailAddImpl.setCompanyId(companyId);
		ncbjBusinessDetailAddImpl.setUserId(userId);

		if (userName == null) {
			ncbjBusinessDetailAddImpl.setUserName("");
		}
		else {
			ncbjBusinessDetailAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjBusinessDetailAddImpl.setCreateDate(null);
		}
		else {
			ncbjBusinessDetailAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjBusinessDetailAddImpl.setModifiedDate(null);
		}
		else {
			ncbjBusinessDetailAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (numberAndTimeOfShift == null) {
			ncbjBusinessDetailAddImpl.setNumberAndTimeOfShift("");
		}
		else {
			ncbjBusinessDetailAddImpl.setNumberAndTimeOfShift(
				numberAndTimeOfShift);
		}

		if (typeOfProduct == null) {
			ncbjBusinessDetailAddImpl.setTypeOfProduct("");
		}
		else {
			ncbjBusinessDetailAddImpl.setTypeOfProduct(typeOfProduct);
		}

		if (businessAddress == null) {
			ncbjBusinessDetailAddImpl.setBusinessAddress("");
		}
		else {
			ncbjBusinessDetailAddImpl.setBusinessAddress(businessAddress);
		}

		if (headOffices == null) {
			ncbjBusinessDetailAddImpl.setHeadOffices("");
		}
		else {
			ncbjBusinessDetailAddImpl.setHeadOffices(headOffices);
		}

		if (noOfFullTimeEmployees == null) {
			ncbjBusinessDetailAddImpl.setNoOfFullTimeEmployees("");
		}
		else {
			ncbjBusinessDetailAddImpl.setNoOfFullTimeEmployees(
				noOfFullTimeEmployees);
		}

		if (noOfPartTimeEmployees == null) {
			ncbjBusinessDetailAddImpl.setNoOfPartTimeEmployees("");
		}
		else {
			ncbjBusinessDetailAddImpl.setNoOfPartTimeEmployees(
				noOfPartTimeEmployees);
		}

		if (noOfContractors == null) {
			ncbjBusinessDetailAddImpl.setNoOfContractors("");
		}
		else {
			ncbjBusinessDetailAddImpl.setNoOfContractors(noOfContractors);
		}

		if (noOfContractedWorkers == null) {
			ncbjBusinessDetailAddImpl.setNoOfContractedWorkers("");
		}
		else {
			ncbjBusinessDetailAddImpl.setNoOfContractedWorkers(
				noOfContractedWorkers);
		}

		if (counter == null) {
			ncbjBusinessDetailAddImpl.setCounter("");
		}
		else {
			ncbjBusinessDetailAddImpl.setCounter(counter);
		}

		ncbjBusinessDetailAddImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjBusinessDetailAddImpl.resetOriginalValues();

		return ncbjBusinessDetailAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjBusinessDetailAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		numberAndTimeOfShift = objectInput.readUTF();
		typeOfProduct = objectInput.readUTF();
		businessAddress = objectInput.readUTF();
		headOffices = objectInput.readUTF();
		noOfFullTimeEmployees = objectInput.readUTF();
		noOfPartTimeEmployees = objectInput.readUTF();
		noOfContractors = objectInput.readUTF();
		noOfContractedWorkers = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjBusinessDetailAddId);

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

		if (numberAndTimeOfShift == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberAndTimeOfShift);
		}

		if (typeOfProduct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfProduct);
		}

		if (businessAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessAddress);
		}

		if (headOffices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOffices);
		}

		if (noOfFullTimeEmployees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noOfFullTimeEmployees);
		}

		if (noOfPartTimeEmployees == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noOfPartTimeEmployees);
		}

		if (noOfContractors == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noOfContractors);
		}

		if (noOfContractedWorkers == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noOfContractedWorkers);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjBusinessDetailAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String numberAndTimeOfShift;
	public String typeOfProduct;
	public String businessAddress;
	public String headOffices;
	public String noOfFullTimeEmployees;
	public String noOfPartTimeEmployees;
	public String noOfContractors;
	public String noOfContractedWorkers;
	public String counter;
	public long ncbjApplicationId;

}