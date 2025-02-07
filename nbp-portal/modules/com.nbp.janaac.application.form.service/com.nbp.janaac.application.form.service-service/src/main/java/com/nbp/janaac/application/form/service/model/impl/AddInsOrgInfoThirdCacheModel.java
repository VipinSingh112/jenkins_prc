/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddInsOrgInfoThird in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddInsOrgInfoThirdCacheModel
	implements CacheModel<AddInsOrgInfoThird>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddInsOrgInfoThirdCacheModel)) {
			return false;
		}

		AddInsOrgInfoThirdCacheModel addInsOrgInfoThirdCacheModel =
			(AddInsOrgInfoThirdCacheModel)object;

		if (AddInsOrgInfoThirdId ==
				addInsOrgInfoThirdCacheModel.AddInsOrgInfoThirdId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, AddInsOrgInfoThirdId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{AddInsOrgInfoThirdId=");
		sb.append(AddInsOrgInfoThirdId);
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
		sb.append(", inspectionActivity=");
		sb.append(inspectionActivity);
		sb.append(", fieldOfInspection=");
		sb.append(fieldOfInspection);
		sb.append(", typeOfInspection=");
		sb.append(typeOfInspection);
		sb.append(", method=");
		sb.append(method);
		sb.append(", eqipment=");
		sb.append(eqipment);
		sb.append(", limitsOfCapabilities=");
		sb.append(limitsOfCapabilities);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddInsOrgInfoThird toEntityModel() {
		AddInsOrgInfoThirdImpl addInsOrgInfoThirdImpl =
			new AddInsOrgInfoThirdImpl();

		addInsOrgInfoThirdImpl.setAddInsOrgInfoThirdId(AddInsOrgInfoThirdId);
		addInsOrgInfoThirdImpl.setGroupId(groupId);
		addInsOrgInfoThirdImpl.setCompanyId(companyId);
		addInsOrgInfoThirdImpl.setUserId(userId);

		if (userName == null) {
			addInsOrgInfoThirdImpl.setUserName("");
		}
		else {
			addInsOrgInfoThirdImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addInsOrgInfoThirdImpl.setCreateDate(null);
		}
		else {
			addInsOrgInfoThirdImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addInsOrgInfoThirdImpl.setModifiedDate(null);
		}
		else {
			addInsOrgInfoThirdImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (inspectionActivity == null) {
			addInsOrgInfoThirdImpl.setInspectionActivity("");
		}
		else {
			addInsOrgInfoThirdImpl.setInspectionActivity(inspectionActivity);
		}

		if (fieldOfInspection == null) {
			addInsOrgInfoThirdImpl.setFieldOfInspection("");
		}
		else {
			addInsOrgInfoThirdImpl.setFieldOfInspection(fieldOfInspection);
		}

		if (typeOfInspection == null) {
			addInsOrgInfoThirdImpl.setTypeOfInspection("");
		}
		else {
			addInsOrgInfoThirdImpl.setTypeOfInspection(typeOfInspection);
		}

		if (method == null) {
			addInsOrgInfoThirdImpl.setMethod("");
		}
		else {
			addInsOrgInfoThirdImpl.setMethod(method);
		}

		if (eqipment == null) {
			addInsOrgInfoThirdImpl.setEqipment("");
		}
		else {
			addInsOrgInfoThirdImpl.setEqipment(eqipment);
		}

		if (limitsOfCapabilities == null) {
			addInsOrgInfoThirdImpl.setLimitsOfCapabilities("");
		}
		else {
			addInsOrgInfoThirdImpl.setLimitsOfCapabilities(
				limitsOfCapabilities);
		}

		addInsOrgInfoThirdImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addInsOrgInfoThirdImpl.setCounter("");
		}
		else {
			addInsOrgInfoThirdImpl.setCounter(counter);
		}

		addInsOrgInfoThirdImpl.resetOriginalValues();

		return addInsOrgInfoThirdImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		AddInsOrgInfoThirdId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		inspectionActivity = objectInput.readUTF();
		fieldOfInspection = objectInput.readUTF();
		typeOfInspection = objectInput.readUTF();
		method = objectInput.readUTF();
		eqipment = objectInput.readUTF();
		limitsOfCapabilities = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(AddInsOrgInfoThirdId);

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

		if (inspectionActivity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(inspectionActivity);
		}

		if (fieldOfInspection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fieldOfInspection);
		}

		if (typeOfInspection == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfInspection);
		}

		if (method == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(method);
		}

		if (eqipment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eqipment);
		}

		if (limitsOfCapabilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(limitsOfCapabilities);
		}

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long AddInsOrgInfoThirdId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String inspectionActivity;
	public String fieldOfInspection;
	public String typeOfInspection;
	public String method;
	public String eqipment;
	public String limitsOfCapabilities;
	public long janaacApplicationId;
	public String counter;

}