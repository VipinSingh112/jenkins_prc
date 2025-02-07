/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquireLandEmployment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireLandEmployment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireLandEmploymentCacheModel
	implements CacheModel<AcquireLandEmployment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireLandEmploymentCacheModel)) {
			return false;
		}

		AcquireLandEmploymentCacheModel acquireLandEmploymentCacheModel =
			(AcquireLandEmploymentCacheModel)object;

		if (acquireLandEmploymentId ==
				acquireLandEmploymentCacheModel.acquireLandEmploymentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireLandEmploymentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{acquireLandEmploymentId=");
		sb.append(acquireLandEmploymentId);
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
		sb.append(", landEmploymentStatus=");
		sb.append(landEmploymentStatus);
		sb.append(", landEmpJamaicaGovEmplyee=");
		sb.append(landEmpJamaicaGovEmplyee);
		sb.append(", landEmpCompanyName=");
		sb.append(landEmpCompanyName);
		sb.append(", landEmploymentJobTitle=");
		sb.append(landEmploymentJobTitle);
		sb.append(", landEmpCompanyAddr=");
		sb.append(landEmpCompanyAddr);
		sb.append(", landEmpTeleNum=");
		sb.append(landEmpTeleNum);
		sb.append(", landEmpGrossSalaryType=");
		sb.append(landEmpGrossSalaryType);
		sb.append(", landEmpGrossSalary=");
		sb.append(landEmpGrossSalary);
		sb.append(", landEmpOtherIncomeSource=");
		sb.append(landEmpOtherIncomeSource);
		sb.append(", landEmpOtherSalaryType=");
		sb.append(landEmpOtherSalaryType);
		sb.append(", landEmpOtherIncomeAmount=");
		sb.append(landEmpOtherIncomeAmount);
		sb.append(", landEmpFinancialSupportPerson=");
		sb.append(landEmpFinancialSupportPerson);
		sb.append(", acquireApplicationId=");
		sb.append(acquireApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireLandEmployment toEntityModel() {
		AcquireLandEmploymentImpl acquireLandEmploymentImpl =
			new AcquireLandEmploymentImpl();

		acquireLandEmploymentImpl.setAcquireLandEmploymentId(
			acquireLandEmploymentId);
		acquireLandEmploymentImpl.setGroupId(groupId);
		acquireLandEmploymentImpl.setCompanyId(companyId);
		acquireLandEmploymentImpl.setUserId(userId);

		if (userName == null) {
			acquireLandEmploymentImpl.setUserName("");
		}
		else {
			acquireLandEmploymentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireLandEmploymentImpl.setCreateDate(null);
		}
		else {
			acquireLandEmploymentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireLandEmploymentImpl.setModifiedDate(null);
		}
		else {
			acquireLandEmploymentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (landEmploymentStatus == null) {
			acquireLandEmploymentImpl.setLandEmploymentStatus("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmploymentStatus(
				landEmploymentStatus);
		}

		if (landEmpJamaicaGovEmplyee == null) {
			acquireLandEmploymentImpl.setLandEmpJamaicaGovEmplyee("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpJamaicaGovEmplyee(
				landEmpJamaicaGovEmplyee);
		}

		if (landEmpCompanyName == null) {
			acquireLandEmploymentImpl.setLandEmpCompanyName("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpCompanyName(landEmpCompanyName);
		}

		if (landEmploymentJobTitle == null) {
			acquireLandEmploymentImpl.setLandEmploymentJobTitle("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmploymentJobTitle(
				landEmploymentJobTitle);
		}

		if (landEmpCompanyAddr == null) {
			acquireLandEmploymentImpl.setLandEmpCompanyAddr("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpCompanyAddr(landEmpCompanyAddr);
		}

		if (landEmpTeleNum == null) {
			acquireLandEmploymentImpl.setLandEmpTeleNum("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpTeleNum(landEmpTeleNum);
		}

		if (landEmpGrossSalaryType == null) {
			acquireLandEmploymentImpl.setLandEmpGrossSalaryType("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpGrossSalaryType(
				landEmpGrossSalaryType);
		}

		if (landEmpGrossSalary == null) {
			acquireLandEmploymentImpl.setLandEmpGrossSalary("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpGrossSalary(landEmpGrossSalary);
		}

		if (landEmpOtherIncomeSource == null) {
			acquireLandEmploymentImpl.setLandEmpOtherIncomeSource("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpOtherIncomeSource(
				landEmpOtherIncomeSource);
		}

		if (landEmpOtherSalaryType == null) {
			acquireLandEmploymentImpl.setLandEmpOtherSalaryType("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpOtherSalaryType(
				landEmpOtherSalaryType);
		}

		if (landEmpOtherIncomeAmount == null) {
			acquireLandEmploymentImpl.setLandEmpOtherIncomeAmount("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpOtherIncomeAmount(
				landEmpOtherIncomeAmount);
		}

		if (landEmpFinancialSupportPerson == null) {
			acquireLandEmploymentImpl.setLandEmpFinancialSupportPerson("");
		}
		else {
			acquireLandEmploymentImpl.setLandEmpFinancialSupportPerson(
				landEmpFinancialSupportPerson);
		}

		acquireLandEmploymentImpl.setAcquireApplicationId(acquireApplicationId);

		acquireLandEmploymentImpl.resetOriginalValues();

		return acquireLandEmploymentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireLandEmploymentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		landEmploymentStatus = objectInput.readUTF();
		landEmpJamaicaGovEmplyee = objectInput.readUTF();
		landEmpCompanyName = objectInput.readUTF();
		landEmploymentJobTitle = objectInput.readUTF();
		landEmpCompanyAddr = objectInput.readUTF();
		landEmpTeleNum = objectInput.readUTF();
		landEmpGrossSalaryType = objectInput.readUTF();
		landEmpGrossSalary = objectInput.readUTF();
		landEmpOtherIncomeSource = objectInput.readUTF();
		landEmpOtherSalaryType = objectInput.readUTF();
		landEmpOtherIncomeAmount = objectInput.readUTF();
		landEmpFinancialSupportPerson = objectInput.readUTF();

		acquireApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireLandEmploymentId);

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

		if (landEmploymentStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmploymentStatus);
		}

		if (landEmpJamaicaGovEmplyee == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpJamaicaGovEmplyee);
		}

		if (landEmpCompanyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpCompanyName);
		}

		if (landEmploymentJobTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmploymentJobTitle);
		}

		if (landEmpCompanyAddr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpCompanyAddr);
		}

		if (landEmpTeleNum == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpTeleNum);
		}

		if (landEmpGrossSalaryType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpGrossSalaryType);
		}

		if (landEmpGrossSalary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpGrossSalary);
		}

		if (landEmpOtherIncomeSource == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpOtherIncomeSource);
		}

		if (landEmpOtherSalaryType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpOtherSalaryType);
		}

		if (landEmpOtherIncomeAmount == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpOtherIncomeAmount);
		}

		if (landEmpFinancialSupportPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landEmpFinancialSupportPerson);
		}

		objectOutput.writeLong(acquireApplicationId);
	}

	public long acquireLandEmploymentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String landEmploymentStatus;
	public String landEmpJamaicaGovEmplyee;
	public String landEmpCompanyName;
	public String landEmploymentJobTitle;
	public String landEmpCompanyAddr;
	public String landEmpTeleNum;
	public String landEmpGrossSalaryType;
	public String landEmpGrossSalary;
	public String landEmpOtherIncomeSource;
	public String landEmpOtherSalaryType;
	public String landEmpOtherIncomeAmount;
	public String landEmpFinancialSupportPerson;
	public long acquireApplicationId;

}