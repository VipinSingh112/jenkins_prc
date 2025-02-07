/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.manufacturing.application.form.service.model.ProductionProcess;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ProductionProcess in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProductionProcessCacheModel
	implements CacheModel<ProductionProcess>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProductionProcessCacheModel)) {
			return false;
		}

		ProductionProcessCacheModel productionProcessCacheModel =
			(ProductionProcessCacheModel)object;

		if (productionProcessId ==
				productionProcessCacheModel.productionProcessId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, productionProcessId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{productionProcessId=");
		sb.append(productionProcessId);
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
		sb.append(", productionProcess=");
		sb.append(productionProcess);
		sb.append(", manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ProductionProcess toEntityModel() {
		ProductionProcessImpl productionProcessImpl =
			new ProductionProcessImpl();

		productionProcessImpl.setProductionProcessId(productionProcessId);
		productionProcessImpl.setGroupId(groupId);
		productionProcessImpl.setCompanyId(companyId);
		productionProcessImpl.setUserId(userId);

		if (userName == null) {
			productionProcessImpl.setUserName("");
		}
		else {
			productionProcessImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			productionProcessImpl.setCreateDate(null);
		}
		else {
			productionProcessImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			productionProcessImpl.setModifiedDate(null);
		}
		else {
			productionProcessImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (productionProcess == null) {
			productionProcessImpl.setProductionProcess("");
		}
		else {
			productionProcessImpl.setProductionProcess(productionProcess);
		}

		productionProcessImpl.setManufacturingApplicationId(
			manufacturingApplicationId);

		productionProcessImpl.resetOriginalValues();

		return productionProcessImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		productionProcessId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		productionProcess = objectInput.readUTF();

		manufacturingApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(productionProcessId);

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

		if (productionProcess == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionProcess);
		}

		objectOutput.writeLong(manufacturingApplicationId);
	}

	public long productionProcessId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String productionProcess;
	public long manufacturingApplicationId;

}