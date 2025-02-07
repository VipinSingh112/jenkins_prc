/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.stages.service.model.AcquireValuation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AcquireValuation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireValuationCacheModel
	implements CacheModel<AcquireValuation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireValuationCacheModel)) {
			return false;
		}

		AcquireValuationCacheModel acquireValuationCacheModel =
			(AcquireValuationCacheModel)object;

		if (acquireValuationId ==
				acquireValuationCacheModel.acquireValuationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireValuationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{acquireValuationId=");
		sb.append(acquireValuationId);
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
		sb.append(", valuationNumber=");
		sb.append(valuationNumber);
		sb.append(", valuationVolume=");
		sb.append(valuationVolume);
		sb.append(", valuationFolio=");
		sb.append(valuationFolio);
		sb.append(", valuationStatus=");
		sb.append(valuationStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireValuation toEntityModel() {
		AcquireValuationImpl acquireValuationImpl = new AcquireValuationImpl();

		acquireValuationImpl.setAcquireValuationId(acquireValuationId);
		acquireValuationImpl.setGroupId(groupId);
		acquireValuationImpl.setCompanyId(companyId);
		acquireValuationImpl.setUserId(userId);

		if (userName == null) {
			acquireValuationImpl.setUserName("");
		}
		else {
			acquireValuationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			acquireValuationImpl.setCreateDate(null);
		}
		else {
			acquireValuationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			acquireValuationImpl.setModifiedDate(null);
		}
		else {
			acquireValuationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (caseId == null) {
			acquireValuationImpl.setCaseId("");
		}
		else {
			acquireValuationImpl.setCaseId(caseId);
		}

		if (valuationNumber == null) {
			acquireValuationImpl.setValuationNumber("");
		}
		else {
			acquireValuationImpl.setValuationNumber(valuationNumber);
		}

		if (valuationVolume == null) {
			acquireValuationImpl.setValuationVolume("");
		}
		else {
			acquireValuationImpl.setValuationVolume(valuationVolume);
		}

		if (valuationFolio == null) {
			acquireValuationImpl.setValuationFolio("");
		}
		else {
			acquireValuationImpl.setValuationFolio(valuationFolio);
		}

		if (valuationStatus == null) {
			acquireValuationImpl.setValuationStatus("");
		}
		else {
			acquireValuationImpl.setValuationStatus(valuationStatus);
		}

		acquireValuationImpl.resetOriginalValues();

		return acquireValuationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireValuationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		caseId = objectInput.readUTF();
		valuationNumber = objectInput.readUTF();
		valuationVolume = objectInput.readUTF();
		valuationFolio = objectInput.readUTF();
		valuationStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireValuationId);

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

		if (valuationNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valuationNumber);
		}

		if (valuationVolume == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valuationVolume);
		}

		if (valuationFolio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valuationFolio);
		}

		if (valuationStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valuationStatus);
		}
	}

	public long acquireValuationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String caseId;
	public String valuationNumber;
	public String valuationVolume;
	public String valuationFolio;
	public String valuationStatus;

}