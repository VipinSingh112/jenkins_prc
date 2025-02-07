/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FactoriesProductDetailsAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FactoriesProductDetailsAddCacheModel
	implements CacheModel<FactoriesProductDetailsAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FactoriesProductDetailsAddCacheModel)) {
			return false;
		}

		FactoriesProductDetailsAddCacheModel
			factoriesProductDetailsAddCacheModel =
				(FactoriesProductDetailsAddCacheModel)object;

		if (factoriesProductDetailsAddId ==
				factoriesProductDetailsAddCacheModel.
					factoriesProductDetailsAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, factoriesProductDetailsAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{factoriesProductDetailsAddId=");
		sb.append(factoriesProductDetailsAddId);
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
		sb.append(", productBrand=");
		sb.append(productBrand);
		sb.append(", product=");
		sb.append(product);
		sb.append(", productSize=");
		sb.append(productSize);
		sb.append(", productMeasurementVal=");
		sb.append(productMeasurementVal);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FactoriesProductDetailsAdd toEntityModel() {
		FactoriesProductDetailsAddImpl factoriesProductDetailsAddImpl =
			new FactoriesProductDetailsAddImpl();

		factoriesProductDetailsAddImpl.setFactoriesProductDetailsAddId(
			factoriesProductDetailsAddId);
		factoriesProductDetailsAddImpl.setGroupId(groupId);
		factoriesProductDetailsAddImpl.setCompanyId(companyId);
		factoriesProductDetailsAddImpl.setUserId(userId);

		if (userName == null) {
			factoriesProductDetailsAddImpl.setUserName("");
		}
		else {
			factoriesProductDetailsAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			factoriesProductDetailsAddImpl.setCreateDate(null);
		}
		else {
			factoriesProductDetailsAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			factoriesProductDetailsAddImpl.setModifiedDate(null);
		}
		else {
			factoriesProductDetailsAddImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (productBrand == null) {
			factoriesProductDetailsAddImpl.setProductBrand("");
		}
		else {
			factoriesProductDetailsAddImpl.setProductBrand(productBrand);
		}

		if (product == null) {
			factoriesProductDetailsAddImpl.setProduct("");
		}
		else {
			factoriesProductDetailsAddImpl.setProduct(product);
		}

		if (productSize == null) {
			factoriesProductDetailsAddImpl.setProductSize("");
		}
		else {
			factoriesProductDetailsAddImpl.setProductSize(productSize);
		}

		if (productMeasurementVal == null) {
			factoriesProductDetailsAddImpl.setProductMeasurementVal("");
		}
		else {
			factoriesProductDetailsAddImpl.setProductMeasurementVal(
				productMeasurementVal);
		}

		if (counter == null) {
			factoriesProductDetailsAddImpl.setCounter("");
		}
		else {
			factoriesProductDetailsAddImpl.setCounter(counter);
		}

		factoriesProductDetailsAddImpl.setFactoriesApplicationId(
			factoriesApplicationId);

		factoriesProductDetailsAddImpl.resetOriginalValues();

		return factoriesProductDetailsAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		factoriesProductDetailsAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		productBrand = objectInput.readUTF();
		product = objectInput.readUTF();
		productSize = objectInput.readUTF();
		productMeasurementVal = objectInput.readUTF();
		counter = objectInput.readUTF();

		factoriesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(factoriesProductDetailsAddId);

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

		if (productBrand == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productBrand);
		}

		if (product == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(product);
		}

		if (productSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productSize);
		}

		if (productMeasurementVal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productMeasurementVal);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(factoriesApplicationId);
	}

	public long factoriesProductDetailsAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String productBrand;
	public String product;
	public String productSize;
	public String productMeasurementVal;
	public String counter;
	public long factoriesApplicationId;

}