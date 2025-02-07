/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProductiveInputsFormAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProductiveInputsFormAddCacheModel
	implements CacheModel<ProductiveInputsFormAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductiveInputsFormAddCacheModel)) {
			return false;
		}

		ProductiveInputsFormAddCacheModel productiveInputsFormAddCacheModel =
			(ProductiveInputsFormAddCacheModel)object;

		if (productiveInputsFormAddId ==
				productiveInputsFormAddCacheModel.productiveInputsFormAddId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productiveInputsFormAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{productiveInputsFormAddId=");
		sb.append(productiveInputsFormAddId);
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
		sb.append(", processType=");
		sb.append(processType);
		sb.append(", tariffCode=");
		sb.append(tariffCode);
		sb.append(", manufactureItem=");
		sb.append(manufactureItem);
		sb.append(", importedCaricom=");
		sb.append(importedCaricom);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append(", productiveInputsFormId=");
		sb.append(productiveInputsFormId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProductiveInputsFormAdd toEntityModel() {
		ProductiveInputsFormAddImpl productiveInputsFormAddImpl =
			new ProductiveInputsFormAddImpl();

		productiveInputsFormAddImpl.setProductiveInputsFormAddId(
			productiveInputsFormAddId);
		productiveInputsFormAddImpl.setGroupId(groupId);
		productiveInputsFormAddImpl.setCompanyId(companyId);
		productiveInputsFormAddImpl.setUserId(userId);

		if (userName == null) {
			productiveInputsFormAddImpl.setUserName("");
		}
		else {
			productiveInputsFormAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productiveInputsFormAddImpl.setCreateDate(null);
		}
		else {
			productiveInputsFormAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productiveInputsFormAddImpl.setModifiedDate(null);
		}
		else {
			productiveInputsFormAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (processType == null) {
			productiveInputsFormAddImpl.setProcessType("");
		}
		else {
			productiveInputsFormAddImpl.setProcessType(processType);
		}

		if (tariffCode == null) {
			productiveInputsFormAddImpl.setTariffCode("");
		}
		else {
			productiveInputsFormAddImpl.setTariffCode(tariffCode);
		}

		if (manufactureItem == null) {
			productiveInputsFormAddImpl.setManufactureItem("");
		}
		else {
			productiveInputsFormAddImpl.setManufactureItem(manufactureItem);
		}

		if (importedCaricom == null) {
			productiveInputsFormAddImpl.setImportedCaricom("");
		}
		else {
			productiveInputsFormAddImpl.setImportedCaricom(importedCaricom);
		}

		if (counter == null) {
			productiveInputsFormAddImpl.setCounter("");
		}
		else {
			productiveInputsFormAddImpl.setCounter(counter);
		}

		productiveInputsFormAddImpl.setManufacturingApplicationId(
			manufacturingApplicationId);
		productiveInputsFormAddImpl.setProductiveInputsFormId(
			productiveInputsFormId);

		productiveInputsFormAddImpl.resetOriginalValues();

		return productiveInputsFormAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		productiveInputsFormAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		processType = objectInput.readUTF();
		tariffCode = objectInput.readUTF();
		manufactureItem = objectInput.readUTF();
		importedCaricom = objectInput.readUTF();
		counter = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();

		productiveInputsFormId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(productiveInputsFormAddId);

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

		if (processType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(processType);
		}

		if (tariffCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tariffCode);
		}

		if (manufactureItem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufactureItem);
		}

		if (importedCaricom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(importedCaricom);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(manufacturingApplicationId);

		objectOutput.writeLong(productiveInputsFormId);
	}

	public long productiveInputsFormAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String processType;
	public String tariffCode;
	public String manufactureItem;
	public String importedCaricom;
	public String counter;
	public long manufacturingApplicationId;
	public long productiveInputsFormId;

}