/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupantProposedAreaDevelopmentPlanInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupantProposedAreaDevelopmentPlanInfoCacheModel
	implements CacheModel<SezOccupantProposedAreaDevelopmentPlanInfo>,
			   Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				SezOccupantProposedAreaDevelopmentPlanInfoCacheModel)) {

			return false;
		}

		SezOccupantProposedAreaDevelopmentPlanInfoCacheModel
			sezOccupantProposedAreaDevelopmentPlanInfoCacheModel =
				(SezOccupantProposedAreaDevelopmentPlanInfoCacheModel)object;

		if (sezOccPropAreaId ==
				sezOccupantProposedAreaDevelopmentPlanInfoCacheModel.
					sezOccPropAreaId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccPropAreaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{sezOccPropAreaId=");
		sb.append(sezOccPropAreaId);
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
		sb.append(", occProcessingArea=");
		sb.append(occProcessingArea);
		sb.append(", occNonProcessingArea=");
		sb.append(occNonProcessingArea);
		sb.append(", occOfficeRequirement=");
		sb.append(occOfficeRequirement);
		sb.append(", occFactoryRequirement=");
		sb.append(occFactoryRequirement);
		sb.append(", otherBuildUpRequirement=");
		sb.append(otherBuildUpRequirement);
		sb.append(", occOtherAreaReqName=");
		sb.append(occOtherAreaReqName);
		sb.append(", occOtherAreaRequirement=");
		sb.append(occOtherAreaRequirement);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo toEntityModel() {
		SezOccupantProposedAreaDevelopmentPlanInfoImpl
			sezOccupantProposedAreaDevelopmentPlanInfoImpl =
				new SezOccupantProposedAreaDevelopmentPlanInfoImpl();

		sezOccupantProposedAreaDevelopmentPlanInfoImpl.setSezOccPropAreaId(
			sezOccPropAreaId);
		sezOccupantProposedAreaDevelopmentPlanInfoImpl.setGroupId(groupId);
		sezOccupantProposedAreaDevelopmentPlanInfoImpl.setCompanyId(companyId);
		sezOccupantProposedAreaDevelopmentPlanInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setUserName("");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setUserName(
				userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setModifiedDate(
				null);
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occProcessingArea == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setOccProcessingArea(
				"");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.setOccProcessingArea(
				occProcessingArea);
		}

		if (occNonProcessingArea == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccNonProcessingArea("");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccNonProcessingArea(occNonProcessingArea);
		}

		if (occOfficeRequirement == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccOfficeRequirement("");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccOfficeRequirement(occOfficeRequirement);
		}

		if (occFactoryRequirement == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccFactoryRequirement("");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccFactoryRequirement(occFactoryRequirement);
		}

		if (otherBuildUpRequirement == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOtherBuildUpRequirement("");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOtherBuildUpRequirement(otherBuildUpRequirement);
		}

		if (occOtherAreaReqName == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccOtherAreaReqName("");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccOtherAreaReqName(occOtherAreaReqName);
		}

		if (occOtherAreaRequirement == null) {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccOtherAreaRequirement("");
		}
		else {
			sezOccupantProposedAreaDevelopmentPlanInfoImpl.
				setOccOtherAreaRequirement(occOtherAreaRequirement);
		}

		sezOccupantProposedAreaDevelopmentPlanInfoImpl.
			setSezStatusApplicationId(sezStatusApplicationId);

		sezOccupantProposedAreaDevelopmentPlanInfoImpl.resetOriginalValues();

		return sezOccupantProposedAreaDevelopmentPlanInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccPropAreaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occProcessingArea = objectInput.readUTF();
		occNonProcessingArea = objectInput.readUTF();
		occOfficeRequirement = objectInput.readUTF();
		occFactoryRequirement = objectInput.readUTF();
		otherBuildUpRequirement = objectInput.readUTF();
		occOtherAreaReqName = objectInput.readUTF();
		occOtherAreaRequirement = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccPropAreaId);

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

		if (occProcessingArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occProcessingArea);
		}

		if (occNonProcessingArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occNonProcessingArea);
		}

		if (occOfficeRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occOfficeRequirement);
		}

		if (occFactoryRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occFactoryRequirement);
		}

		if (otherBuildUpRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherBuildUpRequirement);
		}

		if (occOtherAreaReqName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occOtherAreaReqName);
		}

		if (occOtherAreaRequirement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occOtherAreaRequirement);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccPropAreaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occProcessingArea;
	public String occNonProcessingArea;
	public String occOfficeRequirement;
	public String occFactoryRequirement;
	public String otherBuildUpRequirement;
	public String occOtherAreaReqName;
	public String occOtherAreaRequirement;
	public long sezStatusApplicationId;

}