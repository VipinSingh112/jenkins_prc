/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RadiationSafetyLowRisk in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RadiationSafetyLowRiskCacheModel
	implements CacheModel<RadiationSafetyLowRisk>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RadiationSafetyLowRiskCacheModel)) {
			return false;
		}

		RadiationSafetyLowRiskCacheModel radiationSafetyLowRiskCacheModel =
			(RadiationSafetyLowRiskCacheModel)object;

		if (radiationSafetyLowRiskId ==
				radiationSafetyLowRiskCacheModel.radiationSafetyLowRiskId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, radiationSafetyLowRiskId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{radiationSafetyLowRiskId=");
		sb.append(radiationSafetyLowRiskId);
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
		sb.append(", appendixRsoName=");
		sb.append(appendixRsoName);
		sb.append(", appendixRsoTitle=");
		sb.append(appendixRsoTitle);
		sb.append(", appendixRsoTeleNo=");
		sb.append(appendixRsoTeleNo);
		sb.append(", appendixRsoExt=");
		sb.append(appendixRsoExt);
		sb.append(", appendixRsoFax=");
		sb.append(appendixRsoFax);
		sb.append(", appendixRsoEmail=");
		sb.append(appendixRsoEmail);
		sb.append(", appendixRsoDetails=");
		sb.append(appendixRsoDetails);
		sb.append(", qualifiedAppendixName=");
		sb.append(qualifiedAppendixName);
		sb.append(", qualifiedAppendixTitle=");
		sb.append(qualifiedAppendixTitle);
		sb.append(", qualifiedAppendixTele=");
		sb.append(qualifiedAppendixTele);
		sb.append(", qualifiedAppendixExt=");
		sb.append(qualifiedAppendixExt);
		sb.append(", qualifiedAppendixFax=");
		sb.append(qualifiedAppendixFax);
		sb.append(", qualifiedAppendixEmail=");
		sb.append(qualifiedAppendixEmail);
		sb.append(", qualifiedAppendixRegstNo=");
		sb.append(qualifiedAppendixRegstNo);
		sb.append(", qualifiedAppendixDate=");
		sb.append(qualifiedAppendixDate);
		sb.append(", qualifiedAppendixDetails=");
		sb.append(qualifiedAppendixDetails);
		sb.append(", monitoringExposure=");
		sb.append(monitoringExposure);
		sb.append(", recordSystem=");
		sb.append(recordSystem);
		sb.append(", securityAccess=");
		sb.append(securityAccess);
		sb.append(", trainingInformation=");
		sb.append(trainingInformation);
		sb.append(", leakTesting=");
		sb.append(leakTesting);
		sb.append(", emergencyProcedures=");
		sb.append(emergencyProcedures);
		sb.append(", managementSourcesDis=");
		sb.append(managementSourcesDis);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RadiationSafetyLowRisk toEntityModel() {
		RadiationSafetyLowRiskImpl radiationSafetyLowRiskImpl =
			new RadiationSafetyLowRiskImpl();

		radiationSafetyLowRiskImpl.setRadiationSafetyLowRiskId(
			radiationSafetyLowRiskId);
		radiationSafetyLowRiskImpl.setGroupId(groupId);
		radiationSafetyLowRiskImpl.setCompanyId(companyId);
		radiationSafetyLowRiskImpl.setUserId(userId);

		if (userName == null) {
			radiationSafetyLowRiskImpl.setUserName("");
		}
		else {
			radiationSafetyLowRiskImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			radiationSafetyLowRiskImpl.setCreateDate(null);
		}
		else {
			radiationSafetyLowRiskImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			radiationSafetyLowRiskImpl.setModifiedDate(null);
		}
		else {
			radiationSafetyLowRiskImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (appendixRsoName == null) {
			radiationSafetyLowRiskImpl.setAppendixRsoName("");
		}
		else {
			radiationSafetyLowRiskImpl.setAppendixRsoName(appendixRsoName);
		}

		if (appendixRsoTitle == null) {
			radiationSafetyLowRiskImpl.setAppendixRsoTitle("");
		}
		else {
			radiationSafetyLowRiskImpl.setAppendixRsoTitle(appendixRsoTitle);
		}

		if (appendixRsoTeleNo == null) {
			radiationSafetyLowRiskImpl.setAppendixRsoTeleNo("");
		}
		else {
			radiationSafetyLowRiskImpl.setAppendixRsoTeleNo(appendixRsoTeleNo);
		}

		if (appendixRsoExt == null) {
			radiationSafetyLowRiskImpl.setAppendixRsoExt("");
		}
		else {
			radiationSafetyLowRiskImpl.setAppendixRsoExt(appendixRsoExt);
		}

		if (appendixRsoFax == null) {
			radiationSafetyLowRiskImpl.setAppendixRsoFax("");
		}
		else {
			radiationSafetyLowRiskImpl.setAppendixRsoFax(appendixRsoFax);
		}

		if (appendixRsoEmail == null) {
			radiationSafetyLowRiskImpl.setAppendixRsoEmail("");
		}
		else {
			radiationSafetyLowRiskImpl.setAppendixRsoEmail(appendixRsoEmail);
		}

		if (appendixRsoDetails == null) {
			radiationSafetyLowRiskImpl.setAppendixRsoDetails("");
		}
		else {
			radiationSafetyLowRiskImpl.setAppendixRsoDetails(
				appendixRsoDetails);
		}

		if (qualifiedAppendixName == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixName("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixName(
				qualifiedAppendixName);
		}

		if (qualifiedAppendixTitle == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixTitle("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixTitle(
				qualifiedAppendixTitle);
		}

		if (qualifiedAppendixTele == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixTele("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixTele(
				qualifiedAppendixTele);
		}

		if (qualifiedAppendixExt == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixExt("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixExt(
				qualifiedAppendixExt);
		}

		if (qualifiedAppendixFax == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixFax("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixFax(
				qualifiedAppendixFax);
		}

		if (qualifiedAppendixEmail == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixEmail("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixEmail(
				qualifiedAppendixEmail);
		}

		if (qualifiedAppendixRegstNo == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixRegstNo("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixRegstNo(
				qualifiedAppendixRegstNo);
		}

		if (qualifiedAppendixDate == Long.MIN_VALUE) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixDate(null);
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixDate(
				new Date(qualifiedAppendixDate));
		}

		if (qualifiedAppendixDetails == null) {
			radiationSafetyLowRiskImpl.setQualifiedAppendixDetails("");
		}
		else {
			radiationSafetyLowRiskImpl.setQualifiedAppendixDetails(
				qualifiedAppendixDetails);
		}

		if (monitoringExposure == null) {
			radiationSafetyLowRiskImpl.setMonitoringExposure("");
		}
		else {
			radiationSafetyLowRiskImpl.setMonitoringExposure(
				monitoringExposure);
		}

		if (recordSystem == null) {
			radiationSafetyLowRiskImpl.setRecordSystem("");
		}
		else {
			radiationSafetyLowRiskImpl.setRecordSystem(recordSystem);
		}

		if (securityAccess == null) {
			radiationSafetyLowRiskImpl.setSecurityAccess("");
		}
		else {
			radiationSafetyLowRiskImpl.setSecurityAccess(securityAccess);
		}

		if (trainingInformation == null) {
			radiationSafetyLowRiskImpl.setTrainingInformation("");
		}
		else {
			radiationSafetyLowRiskImpl.setTrainingInformation(
				trainingInformation);
		}

		if (leakTesting == null) {
			radiationSafetyLowRiskImpl.setLeakTesting("");
		}
		else {
			radiationSafetyLowRiskImpl.setLeakTesting(leakTesting);
		}

		if (emergencyProcedures == null) {
			radiationSafetyLowRiskImpl.setEmergencyProcedures("");
		}
		else {
			radiationSafetyLowRiskImpl.setEmergencyProcedures(
				emergencyProcedures);
		}

		if (managementSourcesDis == null) {
			radiationSafetyLowRiskImpl.setManagementSourcesDis("");
		}
		else {
			radiationSafetyLowRiskImpl.setManagementSourcesDis(
				managementSourcesDis);
		}

		radiationSafetyLowRiskImpl.setHsraApplicationId(hsraApplicationId);

		radiationSafetyLowRiskImpl.resetOriginalValues();

		return radiationSafetyLowRiskImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		radiationSafetyLowRiskId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		appendixRsoName = objectInput.readUTF();
		appendixRsoTitle = objectInput.readUTF();
		appendixRsoTeleNo = objectInput.readUTF();
		appendixRsoExt = objectInput.readUTF();
		appendixRsoFax = objectInput.readUTF();
		appendixRsoEmail = objectInput.readUTF();
		appendixRsoDetails = objectInput.readUTF();
		qualifiedAppendixName = objectInput.readUTF();
		qualifiedAppendixTitle = objectInput.readUTF();
		qualifiedAppendixTele = objectInput.readUTF();
		qualifiedAppendixExt = objectInput.readUTF();
		qualifiedAppendixFax = objectInput.readUTF();
		qualifiedAppendixEmail = objectInput.readUTF();
		qualifiedAppendixRegstNo = objectInput.readUTF();
		qualifiedAppendixDate = objectInput.readLong();
		qualifiedAppendixDetails = objectInput.readUTF();
		monitoringExposure = objectInput.readUTF();
		recordSystem = objectInput.readUTF();
		securityAccess = objectInput.readUTF();
		trainingInformation = objectInput.readUTF();
		leakTesting = objectInput.readUTF();
		emergencyProcedures = objectInput.readUTF();
		managementSourcesDis = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(radiationSafetyLowRiskId);

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

		if (appendixRsoName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appendixRsoName);
		}

		if (appendixRsoTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appendixRsoTitle);
		}

		if (appendixRsoTeleNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appendixRsoTeleNo);
		}

		if (appendixRsoExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appendixRsoExt);
		}

		if (appendixRsoFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appendixRsoFax);
		}

		if (appendixRsoEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appendixRsoEmail);
		}

		if (appendixRsoDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appendixRsoDetails);
		}

		if (qualifiedAppendixName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixName);
		}

		if (qualifiedAppendixTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixTitle);
		}

		if (qualifiedAppendixTele == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixTele);
		}

		if (qualifiedAppendixExt == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixExt);
		}

		if (qualifiedAppendixFax == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixFax);
		}

		if (qualifiedAppendixEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixEmail);
		}

		if (qualifiedAppendixRegstNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixRegstNo);
		}

		objectOutput.writeLong(qualifiedAppendixDate);

		if (qualifiedAppendixDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(qualifiedAppendixDetails);
		}

		if (monitoringExposure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monitoringExposure);
		}

		if (recordSystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recordSystem);
		}

		if (securityAccess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(securityAccess);
		}

		if (trainingInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(trainingInformation);
		}

		if (leakTesting == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(leakTesting);
		}

		if (emergencyProcedures == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emergencyProcedures);
		}

		if (managementSourcesDis == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(managementSourcesDis);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long radiationSafetyLowRiskId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String appendixRsoName;
	public String appendixRsoTitle;
	public String appendixRsoTeleNo;
	public String appendixRsoExt;
	public String appendixRsoFax;
	public String appendixRsoEmail;
	public String appendixRsoDetails;
	public String qualifiedAppendixName;
	public String qualifiedAppendixTitle;
	public String qualifiedAppendixTele;
	public String qualifiedAppendixExt;
	public String qualifiedAppendixFax;
	public String qualifiedAppendixEmail;
	public String qualifiedAppendixRegstNo;
	public long qualifiedAppendixDate;
	public String qualifiedAppendixDetails;
	public String monitoringExposure;
	public String recordSystem;
	public String securityAccess;
	public String trainingInformation;
	public String leakTesting;
	public String emergencyProcedures;
	public String managementSourcesDis;
	public long hsraApplicationId;

}