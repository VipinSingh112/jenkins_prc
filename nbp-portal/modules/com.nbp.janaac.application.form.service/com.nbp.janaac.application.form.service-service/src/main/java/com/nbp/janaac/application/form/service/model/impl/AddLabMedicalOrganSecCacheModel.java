/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddLabMedicalOrganSec in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddLabMedicalOrganSecCacheModel
	implements CacheModel<AddLabMedicalOrganSec>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddLabMedicalOrganSecCacheModel)) {
			return false;
		}

		AddLabMedicalOrganSecCacheModel addLabMedicalOrganSecCacheModel =
			(AddLabMedicalOrganSecCacheModel)object;

		if (addLabMedicalOrganSecId ==
				addLabMedicalOrganSecCacheModel.addLabMedicalOrganSecId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addLabMedicalOrganSecId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{addLabMedicalOrganSecId=");
		sb.append(addLabMedicalOrganSecId);
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
		sb.append(", product=");
		sb.append(product);
		sb.append(", examination=");
		sb.append(examination);
		sb.append(", methods=");
		sb.append(methods);
		sb.append(", equipment=");
		sb.append(equipment);
		sb.append(", referenceRange=");
		sb.append(referenceRange);
		sb.append(", measurementUncertainty=");
		sb.append(measurementUncertainty);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddLabMedicalOrganSec toEntityModel() {
		AddLabMedicalOrganSecImpl addLabMedicalOrganSecImpl =
			new AddLabMedicalOrganSecImpl();

		addLabMedicalOrganSecImpl.setAddLabMedicalOrganSecId(
			addLabMedicalOrganSecId);
		addLabMedicalOrganSecImpl.setGroupId(groupId);
		addLabMedicalOrganSecImpl.setCompanyId(companyId);
		addLabMedicalOrganSecImpl.setUserId(userId);

		if (userName == null) {
			addLabMedicalOrganSecImpl.setUserName("");
		}
		else {
			addLabMedicalOrganSecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addLabMedicalOrganSecImpl.setCreateDate(null);
		}
		else {
			addLabMedicalOrganSecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addLabMedicalOrganSecImpl.setModifiedDate(null);
		}
		else {
			addLabMedicalOrganSecImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (product == null) {
			addLabMedicalOrganSecImpl.setProduct("");
		}
		else {
			addLabMedicalOrganSecImpl.setProduct(product);
		}

		if (examination == null) {
			addLabMedicalOrganSecImpl.setExamination("");
		}
		else {
			addLabMedicalOrganSecImpl.setExamination(examination);
		}

		if (methods == null) {
			addLabMedicalOrganSecImpl.setMethods("");
		}
		else {
			addLabMedicalOrganSecImpl.setMethods(methods);
		}

		if (equipment == null) {
			addLabMedicalOrganSecImpl.setEquipment("");
		}
		else {
			addLabMedicalOrganSecImpl.setEquipment(equipment);
		}

		if (referenceRange == null) {
			addLabMedicalOrganSecImpl.setReferenceRange("");
		}
		else {
			addLabMedicalOrganSecImpl.setReferenceRange(referenceRange);
		}

		if (measurementUncertainty == null) {
			addLabMedicalOrganSecImpl.setMeasurementUncertainty("");
		}
		else {
			addLabMedicalOrganSecImpl.setMeasurementUncertainty(
				measurementUncertainty);
		}

		addLabMedicalOrganSecImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addLabMedicalOrganSecImpl.setCounter("");
		}
		else {
			addLabMedicalOrganSecImpl.setCounter(counter);
		}

		addLabMedicalOrganSecImpl.resetOriginalValues();

		return addLabMedicalOrganSecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addLabMedicalOrganSecId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		product = objectInput.readUTF();
		examination = objectInput.readUTF();
		methods = objectInput.readUTF();
		equipment = objectInput.readUTF();
		referenceRange = objectInput.readUTF();
		measurementUncertainty = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addLabMedicalOrganSecId);

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

		if (product == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(product);
		}

		if (examination == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(examination);
		}

		if (methods == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(methods);
		}

		if (equipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(equipment);
		}

		if (referenceRange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(referenceRange);
		}

		if (measurementUncertainty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(measurementUncertainty);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addLabMedicalOrganSecId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String product;
	public String examination;
	public String methods;
	public String equipment;
	public String referenceRange;
	public String measurementUncertainty;
	public long janaacApplicationId;
	public String counter;

}