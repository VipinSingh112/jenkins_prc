/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjBusinessDetail in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjBusinessDetailCacheModel
	implements CacheModel<NcbjBusinessDetail>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjBusinessDetailCacheModel)) {
			return false;
		}

		NcbjBusinessDetailCacheModel ncbjBusinessDetailCacheModel =
			(NcbjBusinessDetailCacheModel)object;

		if (ncbjBusinessDetailId ==
				ncbjBusinessDetailCacheModel.ncbjBusinessDetailId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjBusinessDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{ncbjBusinessDetailId=");
		sb.append(ncbjBusinessDetailId);
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
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", quotationAddressOne=");
		sb.append(quotationAddressOne);
		sb.append(", quotationProductTypes=");
		sb.append(quotationProductTypes);
		sb.append(", quotationApplicantShifts=");
		sb.append(quotationApplicantShifts);
		sb.append(", quotationEmpNum=");
		sb.append(quotationEmpNum);
		sb.append(", quotationHeadOffices=");
		sb.append(quotationHeadOffices);
		sb.append(", quotationFullTimeEmploy=");
		sb.append(quotationFullTimeEmploy);
		sb.append(", quotationPartTimeEmploy=");
		sb.append(quotationPartTimeEmploy);
		sb.append(", quotationContractors=");
		sb.append(quotationContractors);
		sb.append(", quotationContractedWorker=");
		sb.append(quotationContractedWorker);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjBusinessDetail toEntityModel() {
		NcbjBusinessDetailImpl ncbjBusinessDetailImpl =
			new NcbjBusinessDetailImpl();

		ncbjBusinessDetailImpl.setNcbjBusinessDetailId(ncbjBusinessDetailId);
		ncbjBusinessDetailImpl.setGroupId(groupId);
		ncbjBusinessDetailImpl.setCompanyId(companyId);
		ncbjBusinessDetailImpl.setUserId(userId);

		if (userName == null) {
			ncbjBusinessDetailImpl.setUserName("");
		}
		else {
			ncbjBusinessDetailImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjBusinessDetailImpl.setCreateDate(null);
		}
		else {
			ncbjBusinessDetailImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjBusinessDetailImpl.setModifiedDate(null);
		}
		else {
			ncbjBusinessDetailImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (counter == null) {
			ncbjBusinessDetailImpl.setCounter("");
		}
		else {
			ncbjBusinessDetailImpl.setCounter(counter);
		}

		if (quotationAddressOne == null) {
			ncbjBusinessDetailImpl.setQuotationAddressOne("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationAddressOne(quotationAddressOne);
		}

		if (quotationProductTypes == null) {
			ncbjBusinessDetailImpl.setQuotationProductTypes("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationProductTypes(
				quotationProductTypes);
		}

		if (quotationApplicantShifts == null) {
			ncbjBusinessDetailImpl.setQuotationApplicantShifts("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationApplicantShifts(
				quotationApplicantShifts);
		}

		if (quotationEmpNum == null) {
			ncbjBusinessDetailImpl.setQuotationEmpNum("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationEmpNum(quotationEmpNum);
		}

		if (quotationHeadOffices == null) {
			ncbjBusinessDetailImpl.setQuotationHeadOffices("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationHeadOffices(
				quotationHeadOffices);
		}

		if (quotationFullTimeEmploy == null) {
			ncbjBusinessDetailImpl.setQuotationFullTimeEmploy("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationFullTimeEmploy(
				quotationFullTimeEmploy);
		}

		if (quotationPartTimeEmploy == null) {
			ncbjBusinessDetailImpl.setQuotationPartTimeEmploy("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationPartTimeEmploy(
				quotationPartTimeEmploy);
		}

		if (quotationContractors == null) {
			ncbjBusinessDetailImpl.setQuotationContractors("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationContractors(
				quotationContractors);
		}

		if (quotationContractedWorker == null) {
			ncbjBusinessDetailImpl.setQuotationContractedWorker("");
		}
		else {
			ncbjBusinessDetailImpl.setQuotationContractedWorker(
				quotationContractedWorker);
		}

		ncbjBusinessDetailImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjBusinessDetailImpl.resetOriginalValues();

		return ncbjBusinessDetailImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjBusinessDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		counter = objectInput.readUTF();
		quotationAddressOne = objectInput.readUTF();
		quotationProductTypes = objectInput.readUTF();
		quotationApplicantShifts = objectInput.readUTF();
		quotationEmpNum = objectInput.readUTF();
		quotationHeadOffices = objectInput.readUTF();
		quotationFullTimeEmploy = objectInput.readUTF();
		quotationPartTimeEmploy = objectInput.readUTF();
		quotationContractors = objectInput.readUTF();
		quotationContractedWorker = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjBusinessDetailId);

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

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		if (quotationAddressOne == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationAddressOne);
		}

		if (quotationProductTypes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationProductTypes);
		}

		if (quotationApplicantShifts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationApplicantShifts);
		}

		if (quotationEmpNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationEmpNum);
		}

		if (quotationHeadOffices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationHeadOffices);
		}

		if (quotationFullTimeEmploy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationFullTimeEmploy);
		}

		if (quotationPartTimeEmploy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationPartTimeEmploy);
		}

		if (quotationContractors == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationContractors);
		}

		if (quotationContractedWorker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quotationContractedWorker);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjBusinessDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String counter;
	public String quotationAddressOne;
	public String quotationProductTypes;
	public String quotationApplicantShifts;
	public String quotationEmpNum;
	public String quotationHeadOffices;
	public String quotationFullTimeEmploy;
	public String quotationPartTimeEmploy;
	public String quotationContractors;
	public String quotationContractedWorker;
	public long ncbjApplicationId;

}