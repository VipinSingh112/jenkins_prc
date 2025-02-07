/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabTestStructuralReqSec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabTestStructuralReqSecCacheModel
	implements CacheModel<AddLabTestStructuralReqSec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabTestStructuralReqSecCacheModel)) {
			return false;
		}

		AddLabTestStructuralReqSecCacheModel
			addLabTestStructuralReqSecCacheModel =
				(AddLabTestStructuralReqSecCacheModel)object;

		if (addLabTestStructuralReqSecId ==
				addLabTestStructuralReqSecCacheModel.
					addLabTestStructuralReqSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabTestStructuralReqSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{addLabTestStructuralReqSecId=");
		sb.append(addLabTestStructuralReqSecId);
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
		sb.append(", productMaterial=");
		sb.append(productMaterial);
		sb.append(", tests=");
		sb.append(tests);
		sb.append(", method=");
		sb.append(method);
		sb.append(", equipment=");
		sb.append(equipment);
		sb.append(", listOfCapability=");
		sb.append(listOfCapability);
		sb.append(", estimateOfMeasurement=");
		sb.append(estimateOfMeasurement);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabTestStructuralReqSec toEntityModel() {
		AddLabTestStructuralReqSecImpl addLabTestStructuralReqSecImpl =
			new AddLabTestStructuralReqSecImpl();

		addLabTestStructuralReqSecImpl.setAddLabTestStructuralReqSecId(
			addLabTestStructuralReqSecId);
		addLabTestStructuralReqSecImpl.setGroupId(groupId);
		addLabTestStructuralReqSecImpl.setCompanyId(companyId);
		addLabTestStructuralReqSecImpl.setUserId(userId);

		if (userName == null) {
			addLabTestStructuralReqSecImpl.setUserName("");
		}
		else {
			addLabTestStructuralReqSecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabTestStructuralReqSecImpl.setCreateDate(null);
		}
		else {
			addLabTestStructuralReqSecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabTestStructuralReqSecImpl.setModifiedDate(null);
		}
		else {
			addLabTestStructuralReqSecImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (productMaterial == null) {
			addLabTestStructuralReqSecImpl.setProductMaterial("");
		}
		else {
			addLabTestStructuralReqSecImpl.setProductMaterial(productMaterial);
		}

		if (tests == null) {
			addLabTestStructuralReqSecImpl.setTests("");
		}
		else {
			addLabTestStructuralReqSecImpl.setTests(tests);
		}

		if (method == null) {
			addLabTestStructuralReqSecImpl.setMethod("");
		}
		else {
			addLabTestStructuralReqSecImpl.setMethod(method);
		}

		if (equipment == null) {
			addLabTestStructuralReqSecImpl.setEquipment("");
		}
		else {
			addLabTestStructuralReqSecImpl.setEquipment(equipment);
		}

		if (listOfCapability == null) {
			addLabTestStructuralReqSecImpl.setListOfCapability("");
		}
		else {
			addLabTestStructuralReqSecImpl.setListOfCapability(
				listOfCapability);
		}

		if (estimateOfMeasurement == null) {
			addLabTestStructuralReqSecImpl.setEstimateOfMeasurement("");
		}
		else {
			addLabTestStructuralReqSecImpl.setEstimateOfMeasurement(
				estimateOfMeasurement);
		}

		addLabTestStructuralReqSecImpl.setJanaacApplicationId(
			janaacApplicationId);

		if (counter == null) {
			addLabTestStructuralReqSecImpl.setCounter("");
		}
		else {
			addLabTestStructuralReqSecImpl.setCounter(counter);
		}

		addLabTestStructuralReqSecImpl.resetOriginalValues();

		return addLabTestStructuralReqSecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabTestStructuralReqSecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		productMaterial = objectInput.readUTF();
		tests = objectInput.readUTF();
		method = objectInput.readUTF();
		equipment = objectInput.readUTF();
		listOfCapability = objectInput.readUTF();
		estimateOfMeasurement = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabTestStructuralReqSecId);

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

		if (productMaterial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(productMaterial);
		}

		if (tests == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tests);
		}

		if (method == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(method);
		}

		if (equipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipment);
		}

		if (listOfCapability == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(listOfCapability);
		}

		if (estimateOfMeasurement == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estimateOfMeasurement);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabTestStructuralReqSecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String productMaterial;
	public String tests;
	public String method;
	public String equipment;
	public String listOfCapability;
	public String estimateOfMeasurement;
	public long janaacApplicationId;
	public String counter;

}