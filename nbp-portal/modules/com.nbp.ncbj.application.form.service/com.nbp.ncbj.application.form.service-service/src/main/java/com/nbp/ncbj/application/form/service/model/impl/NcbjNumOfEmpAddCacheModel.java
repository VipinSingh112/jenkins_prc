/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NcbjNumOfEmpAdd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NcbjNumOfEmpAddCacheModel
	implements CacheModel<NcbjNumOfEmpAdd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NcbjNumOfEmpAddCacheModel)) {
			return false;
		}

		NcbjNumOfEmpAddCacheModel ncbjNumOfEmpAddCacheModel =
			(NcbjNumOfEmpAddCacheModel)object;

		if (ncbjNumOfEmpAddId == ncbjNumOfEmpAddCacheModel.ncbjNumOfEmpAddId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ncbjNumOfEmpAddId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{ncbjNumOfEmpAddId=");
		sb.append(ncbjNumOfEmpAddId);
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
		sb.append(", headOffice=");
		sb.append(headOffice);
		sb.append(", administrationOffice=");
		sb.append(administrationOffice);
		sb.append(", productionProcessing=");
		sb.append(productionProcessing);
		sb.append(", maintenanceService=");
		sb.append(maintenanceService);
		sb.append(", logistics=");
		sb.append(logistics);
		sb.append(", total=");
		sb.append(total);
		sb.append(", seasonal=");
		sb.append(seasonal);
		sb.append(", temporary=");
		sb.append(temporary);
		sb.append(", subcontracted=");
		sb.append(subcontracted);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NcbjNumOfEmpAdd toEntityModel() {
		NcbjNumOfEmpAddImpl ncbjNumOfEmpAddImpl = new NcbjNumOfEmpAddImpl();

		ncbjNumOfEmpAddImpl.setNcbjNumOfEmpAddId(ncbjNumOfEmpAddId);
		ncbjNumOfEmpAddImpl.setGroupId(groupId);
		ncbjNumOfEmpAddImpl.setCompanyId(companyId);
		ncbjNumOfEmpAddImpl.setUserId(userId);

		if (userName == null) {
			ncbjNumOfEmpAddImpl.setUserName("");
		}
		else {
			ncbjNumOfEmpAddImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			ncbjNumOfEmpAddImpl.setCreateDate(null);
		}
		else {
			ncbjNumOfEmpAddImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			ncbjNumOfEmpAddImpl.setModifiedDate(null);
		}
		else {
			ncbjNumOfEmpAddImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (headOffice == null) {
			ncbjNumOfEmpAddImpl.setHeadOffice("");
		}
		else {
			ncbjNumOfEmpAddImpl.setHeadOffice(headOffice);
		}

		if (administrationOffice == null) {
			ncbjNumOfEmpAddImpl.setAdministrationOffice("");
		}
		else {
			ncbjNumOfEmpAddImpl.setAdministrationOffice(administrationOffice);
		}

		if (productionProcessing == null) {
			ncbjNumOfEmpAddImpl.setProductionProcessing("");
		}
		else {
			ncbjNumOfEmpAddImpl.setProductionProcessing(productionProcessing);
		}

		if (maintenanceService == null) {
			ncbjNumOfEmpAddImpl.setMaintenanceService("");
		}
		else {
			ncbjNumOfEmpAddImpl.setMaintenanceService(maintenanceService);
		}

		if (logistics == null) {
			ncbjNumOfEmpAddImpl.setLogistics("");
		}
		else {
			ncbjNumOfEmpAddImpl.setLogistics(logistics);
		}

		if (total == null) {
			ncbjNumOfEmpAddImpl.setTotal("");
		}
		else {
			ncbjNumOfEmpAddImpl.setTotal(total);
		}

		if (seasonal == null) {
			ncbjNumOfEmpAddImpl.setSeasonal("");
		}
		else {
			ncbjNumOfEmpAddImpl.setSeasonal(seasonal);
		}

		if (temporary == null) {
			ncbjNumOfEmpAddImpl.setTemporary("");
		}
		else {
			ncbjNumOfEmpAddImpl.setTemporary(temporary);
		}

		if (subcontracted == null) {
			ncbjNumOfEmpAddImpl.setSubcontracted("");
		}
		else {
			ncbjNumOfEmpAddImpl.setSubcontracted(subcontracted);
		}

		if (counter == null) {
			ncbjNumOfEmpAddImpl.setCounter("");
		}
		else {
			ncbjNumOfEmpAddImpl.setCounter(counter);
		}

		ncbjNumOfEmpAddImpl.setNcbjApplicationId(ncbjApplicationId);

		ncbjNumOfEmpAddImpl.resetOriginalValues();

		return ncbjNumOfEmpAddImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ncbjNumOfEmpAddId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		headOffice = objectInput.readUTF();
		administrationOffice = objectInput.readUTF();
		productionProcessing = objectInput.readUTF();
		maintenanceService = objectInput.readUTF();
		logistics = objectInput.readUTF();
		total = objectInput.readUTF();
		seasonal = objectInput.readUTF();
		temporary = objectInput.readUTF();
		subcontracted = objectInput.readUTF();
		counter = objectInput.readUTF();

		ncbjApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(ncbjNumOfEmpAddId);

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

		if (headOffice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(headOffice);
		}

		if (administrationOffice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(administrationOffice);
		}

		if (productionProcessing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productionProcessing);
		}

		if (maintenanceService == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maintenanceService);
		}

		if (logistics == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(logistics);
		}

		if (total == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(total);
		}

		if (seasonal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seasonal);
		}

		if (temporary == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(temporary);
		}

		if (subcontracted == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subcontracted);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(ncbjApplicationId);
	}

	public long ncbjNumOfEmpAddId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String headOffice;
	public String administrationOffice;
	public String productionProcessing;
	public String maintenanceService;
	public String logistics;
	public String total;
	public String seasonal;
	public String temporary;
	public String subcontracted;
	public String counter;
	public long ncbjApplicationId;

}