/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ProductiveInputsForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProductiveInputsForm in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProductiveInputsFormCacheModel
	implements CacheModel<ProductiveInputsForm>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductiveInputsFormCacheModel)) {
			return false;
		}

		ProductiveInputsFormCacheModel productiveInputsFormCacheModel =
			(ProductiveInputsFormCacheModel)object;

		if (productiveInputsFormId ==
				productiveInputsFormCacheModel.productiveInputsFormId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productiveInputsFormId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{productiveInputsFormId=");
		sb.append(productiveInputsFormId);
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
		sb.append(", categoryOfGoods=");
		sb.append(categoryOfGoods);
		sb.append(", manufactureProducts=");
		sb.append(manufactureProducts);
		sb.append(", proposedProducts=");
		sb.append(proposedProducts);
		sb.append(", processType=");
		sb.append(processType);
		sb.append(", tariffCode=");
		sb.append(tariffCode);
		sb.append(", manufactureItem=");
		sb.append(manufactureItem);
		sb.append(", importedCaricom=");
		sb.append(importedCaricom);
		sb.append(", rawMaterialPurchased=");
		sb.append(rawMaterialPurchased);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProductiveInputsForm toEntityModel() {
		ProductiveInputsFormImpl productiveInputsFormImpl =
			new ProductiveInputsFormImpl();

		productiveInputsFormImpl.setProductiveInputsFormId(
			productiveInputsFormId);
		productiveInputsFormImpl.setGroupId(groupId);
		productiveInputsFormImpl.setCompanyId(companyId);
		productiveInputsFormImpl.setUserId(userId);

		if (userName == null) {
			productiveInputsFormImpl.setUserName("");
		}
		else {
			productiveInputsFormImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productiveInputsFormImpl.setCreateDate(null);
		}
		else {
			productiveInputsFormImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productiveInputsFormImpl.setModifiedDate(null);
		}
		else {
			productiveInputsFormImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (categoryOfGoods == null) {
			productiveInputsFormImpl.setCategoryOfGoods("");
		}
		else {
			productiveInputsFormImpl.setCategoryOfGoods(categoryOfGoods);
		}

		if (manufactureProducts == null) {
			productiveInputsFormImpl.setManufactureProducts("");
		}
		else {
			productiveInputsFormImpl.setManufactureProducts(
				manufactureProducts);
		}

		if (proposedProducts == null) {
			productiveInputsFormImpl.setProposedProducts("");
		}
		else {
			productiveInputsFormImpl.setProposedProducts(proposedProducts);
		}

		if (processType == null) {
			productiveInputsFormImpl.setProcessType("");
		}
		else {
			productiveInputsFormImpl.setProcessType(processType);
		}

		if (tariffCode == null) {
			productiveInputsFormImpl.setTariffCode("");
		}
		else {
			productiveInputsFormImpl.setTariffCode(tariffCode);
		}

		if (manufactureItem == null) {
			productiveInputsFormImpl.setManufactureItem("");
		}
		else {
			productiveInputsFormImpl.setManufactureItem(manufactureItem);
		}

		if (importedCaricom == null) {
			productiveInputsFormImpl.setImportedCaricom("");
		}
		else {
			productiveInputsFormImpl.setImportedCaricom(importedCaricom);
		}

		if (rawMaterialPurchased == null) {
			productiveInputsFormImpl.setRawMaterialPurchased("");
		}
		else {
			productiveInputsFormImpl.setRawMaterialPurchased(
				rawMaterialPurchased);
		}

		productiveInputsFormImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		productiveInputsFormImpl.resetOriginalValues();

		return productiveInputsFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		productiveInputsFormId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		categoryOfGoods = objectInput.readUTF();
		manufactureProducts = objectInput.readUTF();
		proposedProducts = objectInput.readUTF();
		processType = objectInput.readUTF();
		tariffCode = objectInput.readUTF();
		manufactureItem = objectInput.readUTF();
		importedCaricom = objectInput.readUTF();
		rawMaterialPurchased = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(productiveInputsFormId);

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

		if (categoryOfGoods == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoryOfGoods);
		}

		if (manufactureProducts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(manufactureProducts);
		}

		if (proposedProducts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proposedProducts);
		}

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

		if (rawMaterialPurchased == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rawMaterialPurchased);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long productiveInputsFormId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String categoryOfGoods;
	public String manufactureProducts;
	public String proposedProducts;
	public String processType;
	public String tariffCode;
	public String manufactureItem;
	public String importedCaricom;
	public String rawMaterialPurchased;
	public long manufacturingApplicationId;

}