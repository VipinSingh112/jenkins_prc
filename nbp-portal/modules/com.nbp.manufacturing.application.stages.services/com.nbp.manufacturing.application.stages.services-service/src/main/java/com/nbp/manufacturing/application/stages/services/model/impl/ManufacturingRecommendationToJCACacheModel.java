/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingRecommendationToJCA;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ManufacturingRecommendationToJCA in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManufacturingRecommendationToJCACacheModel
	implements CacheModel<ManufacturingRecommendationToJCA>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManufacturingRecommendationToJCACacheModel)) {
			return false;
		}

		ManufacturingRecommendationToJCACacheModel
			manufacturingRecommendationToJCACacheModel =
				(ManufacturingRecommendationToJCACacheModel)object;

		if (manufacturingJCAId ==
				manufacturingRecommendationToJCACacheModel.manufacturingJCAId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, manufacturingJCAId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{manufacturingJCAId=");
		sb.append(manufacturingJCAId);
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
		sb.append(", caseId=");
		sb.append(caseId);
		sb.append(", date=");
		sb.append(date);
		sb.append(", recommendationToJCA=");
		sb.append(recommendationToJCA);
		sb.append(", recommendation=");
		sb.append(recommendation);
		sb.append(", numberOfMIICInspectors=");
		sb.append(numberOfMIICInspectors);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ManufacturingRecommendationToJCA toEntityModel() {
		ManufacturingRecommendationToJCAImpl
			manufacturingRecommendationToJCAImpl =
				new ManufacturingRecommendationToJCAImpl();

		manufacturingRecommendationToJCAImpl.setManufacturingJCAId(
			manufacturingJCAId);
		manufacturingRecommendationToJCAImpl.setGroupId(groupId);
		manufacturingRecommendationToJCAImpl.setCompanyId(companyId);
		manufacturingRecommendationToJCAImpl.setUserId(userId);

		if (userName == null) {
			manufacturingRecommendationToJCAImpl.setUserName("");
		}
		else {
			manufacturingRecommendationToJCAImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			manufacturingRecommendationToJCAImpl.setCreateDate(null);
		}
		else {
			manufacturingRecommendationToJCAImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			manufacturingRecommendationToJCAImpl.setModifiedDate(null);
		}
		else {
			manufacturingRecommendationToJCAImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (caseId == null) {
			manufacturingRecommendationToJCAImpl.setCaseId("");
		}
		else {
			manufacturingRecommendationToJCAImpl.setCaseId(caseId);
		}

		if (date == Long.MIN_VALUE) {
			manufacturingRecommendationToJCAImpl.setDate(null);
		}
		else {
			manufacturingRecommendationToJCAImpl.setDate(new Date(date));
		}

		if (recommendationToJCA == null) {
			manufacturingRecommendationToJCAImpl.setRecommendationToJCA("");
		}
		else {
			manufacturingRecommendationToJCAImpl.setRecommendationToJCA(
				recommendationToJCA);
		}

		if (recommendation == null) {
			manufacturingRecommendationToJCAImpl.setRecommendation("");
		}
		else {
			manufacturingRecommendationToJCAImpl.setRecommendation(
				recommendation);
		}

		if (numberOfMIICInspectors == null) {
			manufacturingRecommendationToJCAImpl.setNumberOfMIICInspectors("");
		}
		else {
			manufacturingRecommendationToJCAImpl.setNumberOfMIICInspectors(
				numberOfMIICInspectors);
		}

		manufacturingRecommendationToJCAImpl.resetOriginalValues();

		return manufacturingRecommendationToJCAImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		manufacturingJCAId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		date = objectInput.readLong();
		recommendationToJCA = objectInput.readUTF();
		recommendation = objectInput.readUTF();
		numberOfMIICInspectors = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(manufacturingJCAId);

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

		if (caseId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caseId);
		}

		objectOutput.writeLong(date);

		if (recommendationToJCA == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recommendationToJCA);
		}

		if (recommendation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(recommendation);
		}

		if (numberOfMIICInspectors == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(numberOfMIICInspectors);
		}
	}

	public long manufacturingJCAId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public long date;
	public String recommendationToJCA;
	public String recommendation;
	public String numberOfMIICInspectors;

}