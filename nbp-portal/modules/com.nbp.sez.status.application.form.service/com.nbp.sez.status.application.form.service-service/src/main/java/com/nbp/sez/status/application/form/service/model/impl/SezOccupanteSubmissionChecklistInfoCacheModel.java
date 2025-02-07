/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezOccupanteSubmissionChecklistInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezOccupanteSubmissionChecklistInfoCacheModel
	implements CacheModel<SezOccupanteSubmissionChecklistInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof
				SezOccupanteSubmissionChecklistInfoCacheModel)) {

			return false;
		}

		SezOccupanteSubmissionChecklistInfoCacheModel
			sezOccupanteSubmissionChecklistInfoCacheModel =
				(SezOccupanteSubmissionChecklistInfoCacheModel)object;

		if (sezOccCheckSubmitId ==
				sezOccupanteSubmissionChecklistInfoCacheModel.
					sezOccCheckSubmitId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezOccCheckSubmitId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{sezOccCheckSubmitId=");
		sb.append(sezOccCheckSubmitId);
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
		sb.append(", occNameReq=");
		sb.append(occNameReq);
		sb.append(", occDateReq=");
		sb.append(occDateReq);
		sb.append(", occGeneral=");
		sb.append(occGeneral);
		sb.append(", occComInfoRequest=");
		sb.append(occComInfoRequest);
		sb.append(", occSwanStateRequest=");
		sb.append(occSwanStateRequest);
		sb.append(", occSelectedRequest=");
		sb.append(occSelectedRequest);
		sb.append(", occSelectedFacilityRequest=");
		sb.append(occSelectedFacilityRequest);
		sb.append(", occSelectedApprovals=");
		sb.append(occSelectedApprovals);
		sb.append(", occSelectedSecurityRequest=");
		sb.append(occSelectedSecurityRequest);
		sb.append(", occSelectedSDetailedBussiness=");
		sb.append(occSelectedSDetailedBussiness);
		sb.append(", occPaidShareCapProof=");
		sb.append(occPaidShareCapProof);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezOccupanteSubmissionChecklistInfo toEntityModel() {
		SezOccupanteSubmissionChecklistInfoImpl
			sezOccupanteSubmissionChecklistInfoImpl =
				new SezOccupanteSubmissionChecklistInfoImpl();

		sezOccupanteSubmissionChecklistInfoImpl.setSezOccCheckSubmitId(
			sezOccCheckSubmitId);
		sezOccupanteSubmissionChecklistInfoImpl.setGroupId(groupId);
		sezOccupanteSubmissionChecklistInfoImpl.setCompanyId(companyId);
		sezOccupanteSubmissionChecklistInfoImpl.setUserId(userId);

		if (userName == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setUserName("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezOccupanteSubmissionChecklistInfoImpl.setCreateDate(null);
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezOccupanteSubmissionChecklistInfoImpl.setModifiedDate(null);
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (occNameReq == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccNameReq("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccNameReq(occNameReq);
		}

		if (occDateReq == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccDateReq("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccDateReq(occDateReq);
		}

		if (occGeneral == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccGeneral("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccGeneral(occGeneral);
		}

		if (occComInfoRequest == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccComInfoRequest("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccComInfoRequest(
				occComInfoRequest);
		}

		if (occSwanStateRequest == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccSwanStateRequest("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccSwanStateRequest(
				occSwanStateRequest);
		}

		if (occSelectedRequest == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccSelectedRequest("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccSelectedRequest(
				occSelectedRequest);
		}

		if (occSelectedFacilityRequest == null) {
			sezOccupanteSubmissionChecklistInfoImpl.
				setOccSelectedFacilityRequest("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.
				setOccSelectedFacilityRequest(occSelectedFacilityRequest);
		}

		if (occSelectedApprovals == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccSelectedApprovals("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccSelectedApprovals(
				occSelectedApprovals);
		}

		if (occSelectedSecurityRequest == null) {
			sezOccupanteSubmissionChecklistInfoImpl.
				setOccSelectedSecurityRequest("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.
				setOccSelectedSecurityRequest(occSelectedSecurityRequest);
		}

		if (occSelectedSDetailedBussiness == null) {
			sezOccupanteSubmissionChecklistInfoImpl.
				setOccSelectedSDetailedBussiness("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.
				setOccSelectedSDetailedBussiness(occSelectedSDetailedBussiness);
		}

		if (occPaidShareCapProof == null) {
			sezOccupanteSubmissionChecklistInfoImpl.setOccPaidShareCapProof("");
		}
		else {
			sezOccupanteSubmissionChecklistInfoImpl.setOccPaidShareCapProof(
				occPaidShareCapProof);
		}

		sezOccupanteSubmissionChecklistInfoImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezOccupanteSubmissionChecklistInfoImpl.resetOriginalValues();

		return sezOccupanteSubmissionChecklistInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezOccCheckSubmitId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		occNameReq = objectInput.readUTF();
		occDateReq = objectInput.readUTF();
		occGeneral = objectInput.readUTF();
		occComInfoRequest = objectInput.readUTF();
		occSwanStateRequest = objectInput.readUTF();
		occSelectedRequest = objectInput.readUTF();
		occSelectedFacilityRequest = objectInput.readUTF();
		occSelectedApprovals = objectInput.readUTF();
		occSelectedSecurityRequest = objectInput.readUTF();
		occSelectedSDetailedBussiness = objectInput.readUTF();
		occPaidShareCapProof = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezOccCheckSubmitId);

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

		if (occNameReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occNameReq);
		}

		if (occDateReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occDateReq);
		}

		if (occGeneral == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occGeneral);
		}

		if (occComInfoRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occComInfoRequest);
		}

		if (occSwanStateRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSwanStateRequest);
		}

		if (occSelectedRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSelectedRequest);
		}

		if (occSelectedFacilityRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSelectedFacilityRequest);
		}

		if (occSelectedApprovals == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSelectedApprovals);
		}

		if (occSelectedSecurityRequest == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSelectedSecurityRequest);
		}

		if (occSelectedSDetailedBussiness == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occSelectedSDetailedBussiness);
		}

		if (occPaidShareCapProof == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occPaidShareCapProof);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezOccCheckSubmitId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String occNameReq;
	public String occDateReq;
	public String occGeneral;
	public String occComInfoRequest;
	public String occSwanStateRequest;
	public String occSelectedRequest;
	public String occSelectedFacilityRequest;
	public String occSelectedApprovals;
	public String occSelectedSecurityRequest;
	public String occSelectedSDetailedBussiness;
	public String occPaidShareCapProof;
	public long sezStatusApplicationId;

}