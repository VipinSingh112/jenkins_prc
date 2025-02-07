/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.FitPropFinancialProfile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FitPropFinancialProfile in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FitPropFinancialProfileCacheModel
	implements CacheModel<FitPropFinancialProfile>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FitPropFinancialProfileCacheModel)) {
			return false;
		}

		FitPropFinancialProfileCacheModel fitPropFinancialProfileCacheModel =
			(FitPropFinancialProfileCacheModel)object;

		if (fitPropFinancialProfileId ==
				fitPropFinancialProfileCacheModel.fitPropFinancialProfileId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fitPropFinancialProfileId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{fitPropFinancialProfileId=");
		sb.append(fitPropFinancialProfileId);
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
		sb.append(", financialInstitution=");
		sb.append(financialInstitution);
		sb.append(", creditfacility=");
		sb.append(creditfacility);
		sb.append(", surroundingAction=");
		sb.append(surroundingAction);
		sb.append(", jamaicaInstitution=");
		sb.append(jamaicaInstitution);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FitPropFinancialProfile toEntityModel() {
		FitPropFinancialProfileImpl fitPropFinancialProfileImpl =
			new FitPropFinancialProfileImpl();

		fitPropFinancialProfileImpl.setFitPropFinancialProfileId(
			fitPropFinancialProfileId);
		fitPropFinancialProfileImpl.setGroupId(groupId);
		fitPropFinancialProfileImpl.setCompanyId(companyId);
		fitPropFinancialProfileImpl.setUserId(userId);

		if (userName == null) {
			fitPropFinancialProfileImpl.setUserName("");
		}
		else {
			fitPropFinancialProfileImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fitPropFinancialProfileImpl.setCreateDate(null);
		}
		else {
			fitPropFinancialProfileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fitPropFinancialProfileImpl.setModifiedDate(null);
		}
		else {
			fitPropFinancialProfileImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (financialInstitution == null) {
			fitPropFinancialProfileImpl.setFinancialInstitution("");
		}
		else {
			fitPropFinancialProfileImpl.setFinancialInstitution(
				financialInstitution);
		}

		if (creditfacility == null) {
			fitPropFinancialProfileImpl.setCreditfacility("");
		}
		else {
			fitPropFinancialProfileImpl.setCreditfacility(creditfacility);
		}

		if (surroundingAction == null) {
			fitPropFinancialProfileImpl.setSurroundingAction("");
		}
		else {
			fitPropFinancialProfileImpl.setSurroundingAction(surroundingAction);
		}

		if (jamaicaInstitution == null) {
			fitPropFinancialProfileImpl.setJamaicaInstitution("");
		}
		else {
			fitPropFinancialProfileImpl.setJamaicaInstitution(
				jamaicaInstitution);
		}

		fitPropFinancialProfileImpl.setHsraApplicationId(hsraApplicationId);

		fitPropFinancialProfileImpl.resetOriginalValues();

		return fitPropFinancialProfileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fitPropFinancialProfileId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		financialInstitution = objectInput.readUTF();
		creditfacility = objectInput.readUTF();
		surroundingAction = objectInput.readUTF();
		jamaicaInstitution = objectInput.readUTF();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fitPropFinancialProfileId);

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

		if (financialInstitution == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(financialInstitution);
		}

		if (creditfacility == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(creditfacility);
		}

		if (surroundingAction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(surroundingAction);
		}

		if (jamaicaInstitution == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jamaicaInstitution);
		}

		objectOutput.writeLong(hsraApplicationId);
	}

	public long fitPropFinancialProfileId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String financialInstitution;
	public String creditfacility;
	public String surroundingAction;
	public String jamaicaInstitution;
	public long hsraApplicationId;

}