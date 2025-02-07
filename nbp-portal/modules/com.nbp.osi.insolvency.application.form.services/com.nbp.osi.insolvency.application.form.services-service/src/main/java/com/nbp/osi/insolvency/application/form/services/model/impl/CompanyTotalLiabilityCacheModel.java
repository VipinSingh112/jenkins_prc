/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiability;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CompanyTotalLiability in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanyTotalLiabilityCacheModel
	implements CacheModel<CompanyTotalLiability>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CompanyTotalLiabilityCacheModel)) {
			return false;
		}

		CompanyTotalLiabilityCacheModel companyTotalLiabilityCacheModel =
			(CompanyTotalLiabilityCacheModel)object;

		if (companyTotalLiabilityId ==
				companyTotalLiabilityCacheModel.companyTotalLiabilityId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyTotalLiabilityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{companyTotalLiabilityId=");
		sb.append(companyTotalLiabilityId);
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
		sb.append(", comTotalLiability=");
		sb.append(comTotalLiability);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CompanyTotalLiability toEntityModel() {
		CompanyTotalLiabilityImpl companyTotalLiabilityImpl =
			new CompanyTotalLiabilityImpl();

		companyTotalLiabilityImpl.setCompanyTotalLiabilityId(
			companyTotalLiabilityId);
		companyTotalLiabilityImpl.setGroupId(groupId);
		companyTotalLiabilityImpl.setCompanyId(companyId);
		companyTotalLiabilityImpl.setUserId(userId);

		if (userName == null) {
			companyTotalLiabilityImpl.setUserName("");
		}
		else {
			companyTotalLiabilityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			companyTotalLiabilityImpl.setCreateDate(null);
		}
		else {
			companyTotalLiabilityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			companyTotalLiabilityImpl.setModifiedDate(null);
		}
		else {
			companyTotalLiabilityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (comTotalLiability == null) {
			companyTotalLiabilityImpl.setComTotalLiability("");
		}
		else {
			companyTotalLiabilityImpl.setComTotalLiability(comTotalLiability);
		}

		companyTotalLiabilityImpl.setOsiInsolvencyId(osiInsolvencyId);

		companyTotalLiabilityImpl.resetOriginalValues();

		return companyTotalLiabilityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companyTotalLiabilityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		comTotalLiability = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(companyTotalLiabilityId);

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

		if (comTotalLiability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comTotalLiability);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long companyTotalLiabilityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String comTotalLiability;
	public long osiInsolvencyId;

}