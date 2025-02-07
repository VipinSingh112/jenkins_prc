/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisFeeMaster;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CannabisFeeMaster in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisFeeMasterCacheModel
	implements CacheModel<CannabisFeeMaster>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisFeeMasterCacheModel)) {
			return false;
		}

		CannabisFeeMasterCacheModel cannabisFeeMasterCacheModel =
			(CannabisFeeMasterCacheModel)object;

		if (cannabisFeeMasterId ==
				cannabisFeeMasterCacheModel.cannabisFeeMasterId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisFeeMasterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{cannabisFeeMasterId=");
		sb.append(cannabisFeeMasterId);
		sb.append(", category=");
		sb.append(category);
		sb.append(", subCategory=");
		sb.append(subCategory);
		sb.append(", securityBond=");
		sb.append(securityBond);
		sb.append(", licenseFee=");
		sb.append(licenseFee);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisFeeMaster toEntityModel() {
		CannabisFeeMasterImpl cannabisFeeMasterImpl =
			new CannabisFeeMasterImpl();

		cannabisFeeMasterImpl.setCannabisFeeMasterId(cannabisFeeMasterId);

		if (category == null) {
			cannabisFeeMasterImpl.setCategory("");
		}
		else {
			cannabisFeeMasterImpl.setCategory(category);
		}

		if (subCategory == null) {
			cannabisFeeMasterImpl.setSubCategory("");
		}
		else {
			cannabisFeeMasterImpl.setSubCategory(subCategory);
		}

		cannabisFeeMasterImpl.setSecurityBond(securityBond);
		cannabisFeeMasterImpl.setLicenseFee(licenseFee);

		if (remarks == null) {
			cannabisFeeMasterImpl.setRemarks("");
		}
		else {
			cannabisFeeMasterImpl.setRemarks(remarks);
		}

		cannabisFeeMasterImpl.resetOriginalValues();

		return cannabisFeeMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisFeeMasterId = objectInput.readLong();
		category = objectInput.readUTF();
		subCategory = objectInput.readUTF();

		securityBond = objectInput.readDouble();

		licenseFee = objectInput.readDouble();
		remarks = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisFeeMasterId);

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (subCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subCategory);
		}

		objectOutput.writeDouble(securityBond);

		objectOutput.writeDouble(licenseFee);

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}
	}

	public long cannabisFeeMasterId;
	public String category;
	public String subCategory;
	public double securityBond;
	public double licenseFee;
	public String remarks;

}