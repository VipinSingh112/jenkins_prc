/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.application.form.services.model.ProfessionalAffiliation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProfessionalAffiliation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProfessionalAffiliationCacheModel
	implements CacheModel<ProfessionalAffiliation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProfessionalAffiliationCacheModel)) {
			return false;
		}

		ProfessionalAffiliationCacheModel professionalAffiliationCacheModel =
			(ProfessionalAffiliationCacheModel)object;

		if (professionalAffiliationId ==
				professionalAffiliationCacheModel.professionalAffiliationId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, professionalAffiliationId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{professionalAffiliationId=");
		sb.append(professionalAffiliationId);
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
		sb.append(", professionalAffiliationsDate=");
		sb.append(professionalAffiliationsDate);
		sb.append(", affiliationMultivalue=");
		sb.append(affiliationMultivalue);
		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProfessionalAffiliation toEntityModel() {
		ProfessionalAffiliationImpl professionalAffiliationImpl =
			new ProfessionalAffiliationImpl();

		professionalAffiliationImpl.setProfessionalAffiliationId(
			professionalAffiliationId);
		professionalAffiliationImpl.setGroupId(groupId);
		professionalAffiliationImpl.setCompanyId(companyId);
		professionalAffiliationImpl.setUserId(userId);

		if (userName == null) {
			professionalAffiliationImpl.setUserName("");
		}
		else {
			professionalAffiliationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			professionalAffiliationImpl.setCreateDate(null);
		}
		else {
			professionalAffiliationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			professionalAffiliationImpl.setModifiedDate(null);
		}
		else {
			professionalAffiliationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (professionalAffiliationsDate == Long.MIN_VALUE) {
			professionalAffiliationImpl.setProfessionalAffiliationsDate(null);
		}
		else {
			professionalAffiliationImpl.setProfessionalAffiliationsDate(
				new Date(professionalAffiliationsDate));
		}

		if (affiliationMultivalue == null) {
			professionalAffiliationImpl.setAffiliationMultivalue("");
		}
		else {
			professionalAffiliationImpl.setAffiliationMultivalue(
				affiliationMultivalue);
		}

		professionalAffiliationImpl.setOsiApplicationId(osiApplicationId);

		professionalAffiliationImpl.resetOriginalValues();

		return professionalAffiliationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		professionalAffiliationId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		professionalAffiliationsDate = objectInput.readLong();
		affiliationMultivalue = objectInput.readUTF();

		osiApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(professionalAffiliationId);

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
		objectOutput.writeLong(professionalAffiliationsDate);

		if (affiliationMultivalue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(affiliationMultivalue);
		}

		objectOutput.writeLong(osiApplicationId);
	}

	public long professionalAffiliationId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long professionalAffiliationsDate;
	public String affiliationMultivalue;
	public long osiApplicationId;

}