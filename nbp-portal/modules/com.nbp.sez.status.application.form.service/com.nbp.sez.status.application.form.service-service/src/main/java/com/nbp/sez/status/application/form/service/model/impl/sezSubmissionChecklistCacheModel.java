/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing sezSubmissionChecklist in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class sezSubmissionChecklistCacheModel
	implements CacheModel<sezSubmissionChecklist>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof sezSubmissionChecklistCacheModel)) {
			return false;
		}

		sezSubmissionChecklistCacheModel sezSubmissionChecklistCacheModel =
			(sezSubmissionChecklistCacheModel)object;

		if (sezSubmissionChecklistId ==
				sezSubmissionChecklistCacheModel.sezSubmissionChecklistId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezSubmissionChecklistId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{sezSubmissionChecklistId=");
		sb.append(sezSubmissionChecklistId);
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
		sb.append(", selectedGeneral=");
		sb.append(selectedGeneral);
		sb.append(", selectedComInfoReq=");
		sb.append(selectedComInfoReq);
		sb.append(", paidShareCapProof=");
		sb.append(paidShareCapProof);
		sb.append(", selectedSwornStateReq=");
		sb.append(selectedSwornStateReq);
		sb.append(", selectedLandOccuReq=");
		sb.append(selectedLandOccuReq);
		sb.append(", selectedSafetyHealthReq=");
		sb.append(selectedSafetyHealthReq);
		sb.append(", selectedLandDevlopmentReq=");
		sb.append(selectedLandDevlopmentReq);
		sb.append(", selectedTechInfoReq=");
		sb.append(selectedTechInfoReq);
		sb.append(", selectedSezPreliminaryReq=");
		sb.append(selectedSezPreliminaryReq);
		sb.append(", selectedSezDevDetailReq=");
		sb.append(selectedSezDevDetailReq);
		sb.append(", selectedApprovalReq=");
		sb.append(selectedApprovalReq);
		sb.append(", nameReq=");
		sb.append(nameReq);
		sb.append(", dateReq=");
		sb.append(dateReq);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public sezSubmissionChecklist toEntityModel() {
		sezSubmissionChecklistImpl sezSubmissionChecklistImpl =
			new sezSubmissionChecklistImpl();

		sezSubmissionChecklistImpl.setSezSubmissionChecklistId(
			sezSubmissionChecklistId);
		sezSubmissionChecklistImpl.setGroupId(groupId);
		sezSubmissionChecklistImpl.setCompanyId(companyId);
		sezSubmissionChecklistImpl.setUserId(userId);

		if (userName == null) {
			sezSubmissionChecklistImpl.setUserName("");
		}
		else {
			sezSubmissionChecklistImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezSubmissionChecklistImpl.setCreateDate(null);
		}
		else {
			sezSubmissionChecklistImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezSubmissionChecklistImpl.setModifiedDate(null);
		}
		else {
			sezSubmissionChecklistImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (selectedGeneral == null) {
			sezSubmissionChecklistImpl.setSelectedGeneral("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedGeneral(selectedGeneral);
		}

		if (selectedComInfoReq == null) {
			sezSubmissionChecklistImpl.setSelectedComInfoReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedComInfoReq(
				selectedComInfoReq);
		}

		if (paidShareCapProof == null) {
			sezSubmissionChecklistImpl.setPaidShareCapProof("");
		}
		else {
			sezSubmissionChecklistImpl.setPaidShareCapProof(paidShareCapProof);
		}

		if (selectedSwornStateReq == null) {
			sezSubmissionChecklistImpl.setSelectedSwornStateReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedSwornStateReq(
				selectedSwornStateReq);
		}

		if (selectedLandOccuReq == null) {
			sezSubmissionChecklistImpl.setSelectedLandOccuReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedLandOccuReq(
				selectedLandOccuReq);
		}

		if (selectedSafetyHealthReq == null) {
			sezSubmissionChecklistImpl.setSelectedSafetyHealthReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedSafetyHealthReq(
				selectedSafetyHealthReq);
		}

		if (selectedLandDevlopmentReq == null) {
			sezSubmissionChecklistImpl.setSelectedLandDevlopmentReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedLandDevlopmentReq(
				selectedLandDevlopmentReq);
		}

		if (selectedTechInfoReq == null) {
			sezSubmissionChecklistImpl.setSelectedTechInfoReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedTechInfoReq(
				selectedTechInfoReq);
		}

		if (selectedSezPreliminaryReq == null) {
			sezSubmissionChecklistImpl.setSelectedSezPreliminaryReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedSezPreliminaryReq(
				selectedSezPreliminaryReq);
		}

		if (selectedSezDevDetailReq == null) {
			sezSubmissionChecklistImpl.setSelectedSezDevDetailReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedSezDevDetailReq(
				selectedSezDevDetailReq);
		}

		if (selectedApprovalReq == null) {
			sezSubmissionChecklistImpl.setSelectedApprovalReq("");
		}
		else {
			sezSubmissionChecklistImpl.setSelectedApprovalReq(
				selectedApprovalReq);
		}

		if (nameReq == null) {
			sezSubmissionChecklistImpl.setNameReq("");
		}
		else {
			sezSubmissionChecklistImpl.setNameReq(nameReq);
		}

		if (dateReq == Long.MIN_VALUE) {
			sezSubmissionChecklistImpl.setDateReq(null);
		}
		else {
			sezSubmissionChecklistImpl.setDateReq(new Date(dateReq));
		}

		sezSubmissionChecklistImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezSubmissionChecklistImpl.resetOriginalValues();

		return sezSubmissionChecklistImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezSubmissionChecklistId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		selectedGeneral = objectInput.readUTF();
		selectedComInfoReq = objectInput.readUTF();
		paidShareCapProof = objectInput.readUTF();
		selectedSwornStateReq = objectInput.readUTF();
		selectedLandOccuReq = objectInput.readUTF();
		selectedSafetyHealthReq = objectInput.readUTF();
		selectedLandDevlopmentReq = objectInput.readUTF();
		selectedTechInfoReq = objectInput.readUTF();
		selectedSezPreliminaryReq = objectInput.readUTF();
		selectedSezDevDetailReq = objectInput.readUTF();
		selectedApprovalReq = objectInput.readUTF();
		nameReq = objectInput.readUTF();
		dateReq = objectInput.readLong();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezSubmissionChecklistId);

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

		if (selectedGeneral == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedGeneral);
		}

		if (selectedComInfoReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedComInfoReq);
		}

		if (paidShareCapProof == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(paidShareCapProof);
		}

		if (selectedSwornStateReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedSwornStateReq);
		}

		if (selectedLandOccuReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedLandOccuReq);
		}

		if (selectedSafetyHealthReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedSafetyHealthReq);
		}

		if (selectedLandDevlopmentReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedLandDevlopmentReq);
		}

		if (selectedTechInfoReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedTechInfoReq);
		}

		if (selectedSezPreliminaryReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedSezPreliminaryReq);
		}

		if (selectedSezDevDetailReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedSezDevDetailReq);
		}

		if (selectedApprovalReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(selectedApprovalReq);
		}

		if (nameReq == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameReq);
		}

		objectOutput.writeLong(dateReq);

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezSubmissionChecklistId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String selectedGeneral;
	public String selectedComInfoReq;
	public String paidShareCapProof;
	public String selectedSwornStateReq;
	public String selectedLandOccuReq;
	public String selectedSafetyHealthReq;
	public String selectedLandDevlopmentReq;
	public String selectedTechInfoReq;
	public String selectedSezPreliminaryReq;
	public String selectedSezDevDetailReq;
	public String selectedApprovalReq;
	public String nameReq;
	public long dateReq;
	public long sezStatusApplicationId;

}