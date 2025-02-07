/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccMediLabPhysicalResource in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccMediLabPhysicalResourceCacheModel
	implements CacheModel<AccMediLabPhysicalResource>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccMediLabPhysicalResourceCacheModel)) {
			return false;
		}

		AccMediLabPhysicalResourceCacheModel
			accMediLabPhysicalResourceCacheModel =
				(AccMediLabPhysicalResourceCacheModel)object;

		if (accMediLabPhysicalResourceId ==
				accMediLabPhysicalResourceCacheModel.
					accMediLabPhysicalResourceId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accMediLabPhysicalResourceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accMediLabPhysicalResourceId=");
		sb.append(accMediLabPhysicalResourceId);
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
		sb.append(", laboratoryfacilities=");
		sb.append(laboratoryfacilities);
		sb.append(", safetyFeatures=");
		sb.append(safetyFeatures);
		sb.append(", specialEnvironment=");
		sb.append(specialEnvironment);
		sb.append(", monitoringActivities=");
		sb.append(monitoringActivities);
		sb.append(", securityArrangements=");
		sb.append(securityArrangements);
		sb.append(", laboratoryDocumented=");
		sb.append(laboratoryDocumented);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccMediLabPhysicalResource toEntityModel() {
		AccMediLabPhysicalResourceImpl accMediLabPhysicalResourceImpl =
			new AccMediLabPhysicalResourceImpl();

		if (uuid == null) {
			accMediLabPhysicalResourceImpl.setUuid("");
		}
		else {
			accMediLabPhysicalResourceImpl.setUuid(uuid);
		}

		accMediLabPhysicalResourceImpl.setAccMediLabPhysicalResourceId(
			accMediLabPhysicalResourceId);
		accMediLabPhysicalResourceImpl.setGroupId(groupId);
		accMediLabPhysicalResourceImpl.setCompanyId(companyId);
		accMediLabPhysicalResourceImpl.setUserId(userId);

		if (userName == null) {
			accMediLabPhysicalResourceImpl.setUserName("");
		}
		else {
			accMediLabPhysicalResourceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accMediLabPhysicalResourceImpl.setCreateDate(null);
		}
		else {
			accMediLabPhysicalResourceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accMediLabPhysicalResourceImpl.setModifiedDate(null);
		}
		else {
			accMediLabPhysicalResourceImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (laboratoryfacilities == null) {
			accMediLabPhysicalResourceImpl.setLaboratoryfacilities("");
		}
		else {
			accMediLabPhysicalResourceImpl.setLaboratoryfacilities(
				laboratoryfacilities);
		}

		if (safetyFeatures == null) {
			accMediLabPhysicalResourceImpl.setSafetyFeatures("");
		}
		else {
			accMediLabPhysicalResourceImpl.setSafetyFeatures(safetyFeatures);
		}

		if (specialEnvironment == null) {
			accMediLabPhysicalResourceImpl.setSpecialEnvironment("");
		}
		else {
			accMediLabPhysicalResourceImpl.setSpecialEnvironment(
				specialEnvironment);
		}

		if (monitoringActivities == null) {
			accMediLabPhysicalResourceImpl.setMonitoringActivities("");
		}
		else {
			accMediLabPhysicalResourceImpl.setMonitoringActivities(
				monitoringActivities);
		}

		if (securityArrangements == null) {
			accMediLabPhysicalResourceImpl.setSecurityArrangements("");
		}
		else {
			accMediLabPhysicalResourceImpl.setSecurityArrangements(
				securityArrangements);
		}

		if (laboratoryDocumented == null) {
			accMediLabPhysicalResourceImpl.setLaboratoryDocumented("");
		}
		else {
			accMediLabPhysicalResourceImpl.setLaboratoryDocumented(
				laboratoryDocumented);
		}

		accMediLabPhysicalResourceImpl.setJanaacApplicationId(
			janaacApplicationId);

		accMediLabPhysicalResourceImpl.resetOriginalValues();

		return accMediLabPhysicalResourceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accMediLabPhysicalResourceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		laboratoryfacilities = objectInput.readUTF();
		safetyFeatures = objectInput.readUTF();
		specialEnvironment = objectInput.readUTF();
		monitoringActivities = objectInput.readUTF();
		securityArrangements = objectInput.readUTF();
		laboratoryDocumented = objectInput.readUTF();

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

		objectOutput.writeLong(accMediLabPhysicalResourceId);

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

		if (laboratoryfacilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryfacilities);
		}

		if (safetyFeatures == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(safetyFeatures);
		}

		if (specialEnvironment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specialEnvironment);
		}

		if (monitoringActivities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monitoringActivities);
		}

		if (securityArrangements == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityArrangements);
		}

		if (laboratoryDocumented == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(laboratoryDocumented);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accMediLabPhysicalResourceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String laboratoryfacilities;
	public String safetyFeatures;
	public String specialEnvironment;
	public String monitoringActivities;
	public String securityArrangements;
	public String laboratoryDocumented;
	public long janaacApplicationId;

}