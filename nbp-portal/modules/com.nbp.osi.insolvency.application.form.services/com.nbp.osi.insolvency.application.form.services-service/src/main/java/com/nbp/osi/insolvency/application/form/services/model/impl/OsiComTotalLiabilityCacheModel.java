/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.insolvency.application.form.services.model.OsiComTotalLiability;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiComTotalLiability in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiComTotalLiabilityCacheModel
	implements CacheModel<OsiComTotalLiability>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiComTotalLiabilityCacheModel)) {
			return false;
		}

		OsiComTotalLiabilityCacheModel osiComTotalLiabilityCacheModel =
			(OsiComTotalLiabilityCacheModel)object;

		if (osiComTotalLiabilityId ==
				osiComTotalLiabilityCacheModel.osiComTotalLiabilityId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiComTotalLiabilityId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{osiComTotalLiabilityId=");
		sb.append(osiComTotalLiabilityId);
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
		sb.append(", totalLiability=");
		sb.append(totalLiability);
		sb.append(", osiInsolvencyId=");
		sb.append(osiInsolvencyId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiComTotalLiability toEntityModel() {
		OsiComTotalLiabilityImpl osiComTotalLiabilityImpl =
			new OsiComTotalLiabilityImpl();

		osiComTotalLiabilityImpl.setOsiComTotalLiabilityId(
			osiComTotalLiabilityId);
		osiComTotalLiabilityImpl.setGroupId(groupId);
		osiComTotalLiabilityImpl.setCompanyId(companyId);
		osiComTotalLiabilityImpl.setUserId(userId);

		if (userName == null) {
			osiComTotalLiabilityImpl.setUserName("");
		}
		else {
			osiComTotalLiabilityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiComTotalLiabilityImpl.setCreateDate(null);
		}
		else {
			osiComTotalLiabilityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiComTotalLiabilityImpl.setModifiedDate(null);
		}
		else {
			osiComTotalLiabilityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (totalLiability == null) {
			osiComTotalLiabilityImpl.setTotalLiability("");
		}
		else {
			osiComTotalLiabilityImpl.setTotalLiability(totalLiability);
		}

		osiComTotalLiabilityImpl.setOsiInsolvencyId(osiInsolvencyId);

		osiComTotalLiabilityImpl.resetOriginalValues();

		return osiComTotalLiabilityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiComTotalLiabilityId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		totalLiability = objectInput.readUTF();

		osiInsolvencyId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiComTotalLiabilityId);

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

		if (totalLiability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalLiability);
		}

		objectOutput.writeLong(osiInsolvencyId);
	}

	public long osiComTotalLiabilityId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String totalLiability;
	public long osiInsolvencyId;

}