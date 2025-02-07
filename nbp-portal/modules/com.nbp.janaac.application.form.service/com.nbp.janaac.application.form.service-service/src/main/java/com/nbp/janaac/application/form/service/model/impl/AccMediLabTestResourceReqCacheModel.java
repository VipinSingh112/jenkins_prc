/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabTestResourceReq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabTestResourceReqCacheModel
	implements CacheModel<AccMediLabTestResourceReq>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabTestResourceReqCacheModel)) {
			return false;
		}

		AccMediLabTestResourceReqCacheModel
			accMediLabTestResourceReqCacheModel =
				(AccMediLabTestResourceReqCacheModel)object;

		if (accMediLabTestResourceReqId ==
				accMediLabTestResourceReqCacheModel.
					accMediLabTestResourceReqId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabTestResourceReqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabTestResourceReqId=");
		sb.append(accMediLabTestResourceReqId);
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
		sb.append(", testExternal=");
		sb.append(testExternal);
		sb.append(", testCompetence=");
		sb.append(testCompetence);
		sb.append(", testLabFacilities=");
		sb.append(testLabFacilities);
		sb.append(", testLabContracted=");
		sb.append(testLabContracted);
		sb.append(", testLabFacilityEnv=");
		sb.append(testLabFacilityEnv);
		sb.append(", testSpecialEnv=");
		sb.append(testSpecialEnv);
		sb.append(", testMonitoringAct=");
		sb.append(testMonitoringAct);
		sb.append(", testLabRelatedEquip=");
		sb.append(testLabRelatedEquip);
		sb.append(", testSecurityArrange=");
		sb.append(testSecurityArrange);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabTestResourceReq toEntityModel() {
		AccMediLabTestResourceReqImpl accMediLabTestResourceReqImpl =
			new AccMediLabTestResourceReqImpl();

		if (uuid == null) {
			accMediLabTestResourceReqImpl.setUuid("");
		}
		else {
			accMediLabTestResourceReqImpl.setUuid(uuid);
		}

		accMediLabTestResourceReqImpl.setAccMediLabTestResourceReqId(
			accMediLabTestResourceReqId);
		accMediLabTestResourceReqImpl.setGroupId(groupId);
		accMediLabTestResourceReqImpl.setCompanyId(companyId);
		accMediLabTestResourceReqImpl.setUserId(userId);

		if (userName == null) {
			accMediLabTestResourceReqImpl.setUserName("");
		}
		else {
			accMediLabTestResourceReqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabTestResourceReqImpl.setCreateDate(null);
		}
		else {
			accMediLabTestResourceReqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabTestResourceReqImpl.setModifiedDate(null);
		}
		else {
			accMediLabTestResourceReqImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (testExternal == null) {
			accMediLabTestResourceReqImpl.setTestExternal("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestExternal(testExternal);
		}

		if (testCompetence == null) {
			accMediLabTestResourceReqImpl.setTestCompetence("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestCompetence(testCompetence);
		}

		if (testLabFacilities == null) {
			accMediLabTestResourceReqImpl.setTestLabFacilities("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestLabFacilities(
				testLabFacilities);
		}

		if (testLabContracted == null) {
			accMediLabTestResourceReqImpl.setTestLabContracted("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestLabContracted(
				testLabContracted);
		}

		if (testLabFacilityEnv == null) {
			accMediLabTestResourceReqImpl.setTestLabFacilityEnv("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestLabFacilityEnv(
				testLabFacilityEnv);
		}

		if (testSpecialEnv == null) {
			accMediLabTestResourceReqImpl.setTestSpecialEnv("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestSpecialEnv(testSpecialEnv);
		}

		if (testMonitoringAct == null) {
			accMediLabTestResourceReqImpl.setTestMonitoringAct("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestMonitoringAct(
				testMonitoringAct);
		}

		if (testLabRelatedEquip == null) {
			accMediLabTestResourceReqImpl.setTestLabRelatedEquip("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestLabRelatedEquip(
				testLabRelatedEquip);
		}

		if (testSecurityArrange == null) {
			accMediLabTestResourceReqImpl.setTestSecurityArrange("");
		}
		else {
			accMediLabTestResourceReqImpl.setTestSecurityArrange(
				testSecurityArrange);
		}

		accMediLabTestResourceReqImpl.setJanaacApplicationId(
			janaacApplicationId);

		accMediLabTestResourceReqImpl.resetOriginalValues();

		return accMediLabTestResourceReqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabTestResourceReqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		testExternal = objectInput.readUTF();
		testCompetence = objectInput.readUTF();
		testLabFacilities = objectInput.readUTF();
		testLabContracted = objectInput.readUTF();
		testLabFacilityEnv = objectInput.readUTF();
		testSpecialEnv = objectInput.readUTF();
		testMonitoringAct = objectInput.readUTF();
		testLabRelatedEquip = objectInput.readUTF();
		testSecurityArrange = objectInput.readUTF();

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

		objectOutput.writeLong(accMediLabTestResourceReqId);

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

		if (testExternal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testExternal);
		}

		if (testCompetence == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testCompetence);
		}

		if (testLabFacilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabFacilities);
		}

		if (testLabContracted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabContracted);
		}

		if (testLabFacilityEnv == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabFacilityEnv);
		}

		if (testSpecialEnv == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testSpecialEnv);
		}

		if (testMonitoringAct == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testMonitoringAct);
		}

		if (testLabRelatedEquip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testLabRelatedEquip);
		}

		if (testSecurityArrange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(testSecurityArrange);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabTestResourceReqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String testExternal;
	public String testCompetence;
	public String testLabFacilities;
	public String testLabContracted;
	public String testLabFacilityEnv;
	public String testSpecialEnv;
	public String testMonitoringAct;
	public String testLabRelatedEquip;
	public String testSecurityArrange;
	public long janaacApplicationId;

}