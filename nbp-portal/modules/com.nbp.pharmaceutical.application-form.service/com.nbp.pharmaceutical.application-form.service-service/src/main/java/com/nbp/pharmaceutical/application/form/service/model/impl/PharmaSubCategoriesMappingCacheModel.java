/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaSubCategoriesMapping;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PharmaSubCategoriesMapping in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaSubCategoriesMappingCacheModel
	implements CacheModel<PharmaSubCategoriesMapping>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaSubCategoriesMappingCacheModel)) {
			return false;
		}

		PharmaSubCategoriesMappingCacheModel
			pharmaSubCategoriesMappingCacheModel =
				(PharmaSubCategoriesMappingCacheModel)object;

		if (pharmaSubCategoriesMappingId ==
				pharmaSubCategoriesMappingCacheModel.
					pharmaSubCategoriesMappingId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaSubCategoriesMappingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{pharmaSubCategoriesMappingId=");
		sb.append(pharmaSubCategoriesMappingId);
		sb.append(", pharmaSubCategory=");
		sb.append(pharmaSubCategory);
		sb.append(", pharmaSubCategoryMapValue=");
		sb.append(pharmaSubCategoryMapValue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaSubCategoriesMapping toEntityModel() {
		PharmaSubCategoriesMappingImpl pharmaSubCategoriesMappingImpl =
			new PharmaSubCategoriesMappingImpl();

		pharmaSubCategoriesMappingImpl.setPharmaSubCategoriesMappingId(
			pharmaSubCategoriesMappingId);

		if (pharmaSubCategory == null) {
			pharmaSubCategoriesMappingImpl.setPharmaSubCategory("");
		}
		else {
			pharmaSubCategoriesMappingImpl.setPharmaSubCategory(
				pharmaSubCategory);
		}

		if (pharmaSubCategoryMapValue == null) {
			pharmaSubCategoriesMappingImpl.setPharmaSubCategoryMapValue("");
		}
		else {
			pharmaSubCategoriesMappingImpl.setPharmaSubCategoryMapValue(
				pharmaSubCategoryMapValue);
		}

		pharmaSubCategoriesMappingImpl.resetOriginalValues();

		return pharmaSubCategoriesMappingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaSubCategoriesMappingId = objectInput.readLong();
		pharmaSubCategory = objectInput.readUTF();
		pharmaSubCategoryMapValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaSubCategoriesMappingId);

		if (pharmaSubCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaSubCategory);
		}

		if (pharmaSubCategoryMapValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaSubCategoryMapValue);
		}
	}

	public long pharmaSubCategoriesMappingId;
	public String pharmaSubCategory;
	public String pharmaSubCategoryMapValue;

}