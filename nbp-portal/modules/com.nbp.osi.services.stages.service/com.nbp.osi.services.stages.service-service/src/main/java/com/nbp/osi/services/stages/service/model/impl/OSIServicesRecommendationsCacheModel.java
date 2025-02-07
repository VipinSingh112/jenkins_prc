/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.stages.service.model.OSIServicesRecommendations;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OSIServicesRecommendations in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OSIServicesRecommendationsCacheModel
	implements CacheModel<OSIServicesRecommendations>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OSIServicesRecommendationsCacheModel)) {
			return false;
		}

		OSIServicesRecommendationsCacheModel
			osiServicesRecommendationsCacheModel =
				(OSIServicesRecommendationsCacheModel)object;

		if (oSIServicesRecommendationsId ==
				osiServicesRecommendationsCacheModel.
					oSIServicesRecommendationsId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, oSIServicesRecommendationsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{oSIServicesRecommendationsId=");
		sb.append(oSIServicesRecommendationsId);
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
		sb.append(", dateOfRecommendationsDecision=");
		sb.append(dateOfRecommendationsDecision);
		sb.append(", recommendationsDecision=");
		sb.append(recommendationsDecision);
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OSIServicesRecommendations toEntityModel() {
		OSIServicesRecommendationsImpl osiServicesRecommendationsImpl =
			new OSIServicesRecommendationsImpl();

		osiServicesRecommendationsImpl.setOSIServicesRecommendationsId(
			oSIServicesRecommendationsId);
		osiServicesRecommendationsImpl.setGroupId(groupId);
		osiServicesRecommendationsImpl.setCompanyId(companyId);
		osiServicesRecommendationsImpl.setUserId(userId);

		if (userName == null) {
			osiServicesRecommendationsImpl.setUserName("");
		}
		else {
			osiServicesRecommendationsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesRecommendationsImpl.setCreateDate(null);
		}
		else {
			osiServicesRecommendationsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesRecommendationsImpl.setModifiedDate(null);
		}
		else {
			osiServicesRecommendationsImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (dateOfRecommendationsDecision == Long.MIN_VALUE) {
			osiServicesRecommendationsImpl.setDateOfRecommendationsDecision(
				null);
		}
		else {
			osiServicesRecommendationsImpl.setDateOfRecommendationsDecision(
				new Date(dateOfRecommendationsDecision));
		}

		if (recommendationsDecision == null) {
			osiServicesRecommendationsImpl.setRecommendationsDecision("");
		}
		else {
			osiServicesRecommendationsImpl.setRecommendationsDecision(
				recommendationsDecision);
		}

		if (caseId == null) {
			osiServicesRecommendationsImpl.setCaseId("");
		}
		else {
			osiServicesRecommendationsImpl.setCaseId(caseId);
		}

		osiServicesRecommendationsImpl.resetOriginalValues();

		return osiServicesRecommendationsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		oSIServicesRecommendationsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dateOfRecommendationsDecision = objectInput.readLong();
		recommendationsDecision = objectInput.readUTF();
		caseId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(oSIServicesRecommendationsId);

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
		objectOutput.writeLong(dateOfRecommendationsDecision);

		if (recommendationsDecision == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recommendationsDecision);
		}

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}
	}

	public long oSIServicesRecommendationsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dateOfRecommendationsDecision;
	public String recommendationsDecision;
	public String caseId;

}