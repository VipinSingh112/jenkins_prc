/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabTestStructural;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabTestStructural in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabTestStructuralCacheModel
	implements CacheModel<AccMediLabTestStructural>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabTestStructuralCacheModel)) {
			return false;
		}

		AccMediLabTestStructuralCacheModel accMediLabTestStructuralCacheModel =
			(AccMediLabTestStructuralCacheModel)object;

		if (accMediLabTestStructuralId ==
				accMediLabTestStructuralCacheModel.accMediLabTestStructuralId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabTestStructuralId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabTestStructuralId=");
		sb.append(accMediLabTestStructuralId);
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
		sb.append(", testLabLegalEntity=");
		sb.append(testLabLegalEntity);
		sb.append(", testlegalStatus=");
		sb.append(testlegalStatus);
		sb.append(", testlabPartOfOrg=");
		sb.append(testlabPartOfOrg);
		sb.append(", testlabPartOfOrgName=");
		sb.append(testlabPartOfOrgName);
		sb.append(", testLabPartOfOrgPos=");
		sb.append(testLabPartOfOrgPos);
		sb.append(", testMangerialStaff=");
		sb.append(testMangerialStaff);
		sb.append(", testTechnicalStaff=");
		sb.append(testTechnicalStaff);
		sb.append(", testingRelevantDoc=");
		sb.append(testingRelevantDoc);
		sb.append(", testMajorIncome=");
		sb.append(testMajorIncome);
		sb.append(", testLabClients=");
		sb.append(testLabClients);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabTestStructural toEntityModel() {
		AccMediLabTestStructuralImpl accMediLabTestStructuralImpl =
			new AccMediLabTestStructuralImpl();

		if (uuid == null) {
			accMediLabTestStructuralImpl.setUuid("");
		}
		else {
			accMediLabTestStructuralImpl.setUuid(uuid);
		}

		accMediLabTestStructuralImpl.setAccMediLabTestStructuralId(
			accMediLabTestStructuralId);
		accMediLabTestStructuralImpl.setGroupId(groupId);
		accMediLabTestStructuralImpl.setCompanyId(companyId);
		accMediLabTestStructuralImpl.setUserId(userId);

		if (userName == null) {
			accMediLabTestStructuralImpl.setUserName("");
		}
		else {
			accMediLabTestStructuralImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabTestStructuralImpl.setCreateDate(null);
		}
		else {
			accMediLabTestStructuralImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabTestStructuralImpl.setModifiedDate(null);
		}
		else {
			accMediLabTestStructuralImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (testLabLegalEntity == null) {
			accMediLabTestStructuralImpl.setTestLabLegalEntity("");
		}
		else {
			accMediLabTestStructuralImpl.setTestLabLegalEntity(
				testLabLegalEntity);
		}

		if (testlegalStatus == null) {
			accMediLabTestStructuralImpl.setTestlegalStatus("");
		}
		else {
			accMediLabTestStructuralImpl.setTestlegalStatus(testlegalStatus);
		}

		if (testlabPartOfOrg == null) {
			accMediLabTestStructuralImpl.setTestlabPartOfOrg("");
		}
		else {
			accMediLabTestStructuralImpl.setTestlabPartOfOrg(testlabPartOfOrg);
		}

		if (testlabPartOfOrgName == null) {
			accMediLabTestStructuralImpl.setTestlabPartOfOrgName("");
		}
		else {
			accMediLabTestStructuralImpl.setTestlabPartOfOrgName(
				testlabPartOfOrgName);
		}

		if (testLabPartOfOrgPos == null) {
			accMediLabTestStructuralImpl.setTestLabPartOfOrgPos("");
		}
		else {
			accMediLabTestStructuralImpl.setTestLabPartOfOrgPos(
				testLabPartOfOrgPos);
		}

		if (testMangerialStaff == null) {
			accMediLabTestStructuralImpl.setTestMangerialStaff("");
		}
		else {
			accMediLabTestStructuralImpl.setTestMangerialStaff(
				testMangerialStaff);
		}

		if (testTechnicalStaff == null) {
			accMediLabTestStructuralImpl.setTestTechnicalStaff("");
		}
		else {
			accMediLabTestStructuralImpl.setTestTechnicalStaff(
				testTechnicalStaff);
		}

		if (testingRelevantDoc == null) {
			accMediLabTestStructuralImpl.setTestingRelevantDoc("");
		}
		else {
			accMediLabTestStructuralImpl.setTestingRelevantDoc(
				testingRelevantDoc);
		}

		if (testMajorIncome == null) {
			accMediLabTestStructuralImpl.setTestMajorIncome("");
		}
		else {
			accMediLabTestStructuralImpl.setTestMajorIncome(testMajorIncome);
		}

		if (testLabClients == null) {
			accMediLabTestStructuralImpl.setTestLabClients("");
		}
		else {
			accMediLabTestStructuralImpl.setTestLabClients(testLabClients);
		}

		accMediLabTestStructuralImpl.setJanaacApplicationId(
			janaacApplicationId);

		accMediLabTestStructuralImpl.resetOriginalValues();

		return accMediLabTestStructuralImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabTestStructuralId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		testLabLegalEntity = objectInput.readUTF();
		testlegalStatus = objectInput.readUTF();
		testlabPartOfOrg = objectInput.readUTF();
		testlabPartOfOrgName = objectInput.readUTF();
		testLabPartOfOrgPos = objectInput.readUTF();
		testMangerialStaff = objectInput.readUTF();
		testTechnicalStaff = objectInput.readUTF();
		testingRelevantDoc = objectInput.readUTF();
		testMajorIncome = objectInput.readUTF();
		testLabClients = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accMediLabTestStructuralId);

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

		if (testLabLegalEntity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabLegalEntity);
		}

		if (testlegalStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testlegalStatus);
		}

		if (testlabPartOfOrg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testlabPartOfOrg);
		}

		if (testlabPartOfOrgName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testlabPartOfOrgName);
		}

		if (testLabPartOfOrgPos == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabPartOfOrgPos);
		}

		if (testMangerialStaff == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testMangerialStaff);
		}

		if (testTechnicalStaff == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testTechnicalStaff);
		}

		if (testingRelevantDoc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testingRelevantDoc);
		}

		if (testMajorIncome == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testMajorIncome);
		}

		if (testLabClients == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabClients);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabTestStructuralId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String testLabLegalEntity;
	public String testlegalStatus;
	public String testlabPartOfOrg;
	public String testlabPartOfOrgName;
	public String testLabPartOfOrgPos;
	public String testMangerialStaff;
	public String testTechnicalStaff;
	public String testingRelevantDoc;
	public String testMajorIncome;
	public String testLabClients;
	public long janaacApplicationId;

}