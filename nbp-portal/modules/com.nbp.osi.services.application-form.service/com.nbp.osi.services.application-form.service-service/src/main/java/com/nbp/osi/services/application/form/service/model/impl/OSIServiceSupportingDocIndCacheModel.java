/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OSIServiceSupportingDocInd in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OSIServiceSupportingDocIndCacheModel
	implements CacheModel<OSIServiceSupportingDocInd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OSIServiceSupportingDocIndCacheModel)) {
			return false;
		}

		OSIServiceSupportingDocIndCacheModel
			osiServiceSupportingDocIndCacheModel =
				(OSIServiceSupportingDocIndCacheModel)object;

		if (oSIServiceSupportingDocIndId ==
				osiServiceSupportingDocIndCacheModel.
					oSIServiceSupportingDocIndId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, oSIServiceSupportingDocIndId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{oSIServiceSupportingDocIndId=");
		sb.append(oSIServiceSupportingDocIndId);
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
		sb.append(", supportingDocCheckboxes=");
		sb.append(supportingDocCheckboxes);
		sb.append(", nonProvisionReasonReq1=");
		sb.append(nonProvisionReasonReq1);
		sb.append(", expectedDateReq1=");
		sb.append(expectedDateReq1);
		sb.append(", nonProvisionReasonReq2=");
		sb.append(nonProvisionReasonReq2);
		sb.append(", expectedDateReq2=");
		sb.append(expectedDateReq2);
		sb.append(", nonProvisionReasonReq3=");
		sb.append(nonProvisionReasonReq3);
		sb.append(", expectedDateReq3=");
		sb.append(expectedDateReq3);
		sb.append(", nonProvisionReasonReq4=");
		sb.append(nonProvisionReasonReq4);
		sb.append(", expectedDateReq4=");
		sb.append(expectedDateReq4);
		sb.append(", nonProvisionReasonReq5=");
		sb.append(nonProvisionReasonReq5);
		sb.append(", expectedDateReq5=");
		sb.append(expectedDateReq5);
		sb.append(", nonProvisionReasonReq6=");
		sb.append(nonProvisionReasonReq6);
		sb.append(", expectedDateReq6=");
		sb.append(expectedDateReq6);
		sb.append(", nonProvisionReasonReq7=");
		sb.append(nonProvisionReasonReq7);
		sb.append(", expectedDateReq7=");
		sb.append(expectedDateReq7);
		sb.append(", nonProvisionReasonReq8=");
		sb.append(nonProvisionReasonReq8);
		sb.append(", expectedDateReq8=");
		sb.append(expectedDateReq8);
		sb.append(", nonProvisionReasonReq9=");
		sb.append(nonProvisionReasonReq9);
		sb.append(", expectedDateReq9=");
		sb.append(expectedDateReq9);
		sb.append(", nonProvisionReasonReq10=");
		sb.append(nonProvisionReasonReq10);
		sb.append(", expectedDateReq10=");
		sb.append(expectedDateReq10);
		sb.append(", nonProvisionReasonReq11=");
		sb.append(nonProvisionReasonReq11);
		sb.append(", expectedDateReq11=");
		sb.append(expectedDateReq11);
		sb.append(", nonProvisionReasonReq12=");
		sb.append(nonProvisionReasonReq12);
		sb.append(", expectedDateReq12=");
		sb.append(expectedDateReq12);
		sb.append(", category=");
		sb.append(category);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OSIServiceSupportingDocInd toEntityModel() {
		OSIServiceSupportingDocIndImpl osiServiceSupportingDocIndImpl =
			new OSIServiceSupportingDocIndImpl();

		osiServiceSupportingDocIndImpl.setOSIServiceSupportingDocIndId(
			oSIServiceSupportingDocIndId);
		osiServiceSupportingDocIndImpl.setGroupId(groupId);
		osiServiceSupportingDocIndImpl.setCompanyId(companyId);
		osiServiceSupportingDocIndImpl.setUserId(userId);

		if (userName == null) {
			osiServiceSupportingDocIndImpl.setUserName("");
		}
		else {
			osiServiceSupportingDocIndImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setCreateDate(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setModifiedDate(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (supportingDocCheckboxes == null) {
			osiServiceSupportingDocIndImpl.setSupportingDocCheckboxes("");
		}
		else {
			osiServiceSupportingDocIndImpl.setSupportingDocCheckboxes(
				supportingDocCheckboxes);
		}

		if (nonProvisionReasonReq1 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq1("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq1(
				nonProvisionReasonReq1);
		}

		if (expectedDateReq1 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq1(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq1(
				new Date(expectedDateReq1));
		}

		if (nonProvisionReasonReq2 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq2("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq2(
				nonProvisionReasonReq2);
		}

		if (expectedDateReq2 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq2(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq2(
				new Date(expectedDateReq2));
		}

		if (nonProvisionReasonReq3 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq3("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq3(
				nonProvisionReasonReq3);
		}

		if (expectedDateReq3 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq3(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq3(
				new Date(expectedDateReq3));
		}

		if (nonProvisionReasonReq4 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq4("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq4(
				nonProvisionReasonReq4);
		}

		if (expectedDateReq4 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq4(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq4(
				new Date(expectedDateReq4));
		}

		if (nonProvisionReasonReq5 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq5("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq5(
				nonProvisionReasonReq5);
		}

		if (expectedDateReq5 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq5(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq5(
				new Date(expectedDateReq5));
		}

		if (nonProvisionReasonReq6 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq6("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq6(
				nonProvisionReasonReq6);
		}

		if (expectedDateReq6 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq6(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq6(
				new Date(expectedDateReq6));
		}

		if (nonProvisionReasonReq7 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq7("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq7(
				nonProvisionReasonReq7);
		}

		if (expectedDateReq7 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq7(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq7(
				new Date(expectedDateReq7));
		}

		if (nonProvisionReasonReq8 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq8("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq8(
				nonProvisionReasonReq8);
		}

		if (expectedDateReq8 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq8(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq8(
				new Date(expectedDateReq8));
		}

		if (nonProvisionReasonReq9 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq9("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq9(
				nonProvisionReasonReq9);
		}

		if (expectedDateReq9 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq9(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq9(
				new Date(expectedDateReq9));
		}

		if (nonProvisionReasonReq10 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq10("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq10(
				nonProvisionReasonReq10);
		}

		if (expectedDateReq10 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq10(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq10(
				new Date(expectedDateReq10));
		}

		if (nonProvisionReasonReq11 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq11("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq11(
				nonProvisionReasonReq11);
		}

		if (expectedDateReq11 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq11(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq11(
				new Date(expectedDateReq11));
		}

		if (nonProvisionReasonReq12 == null) {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq12("");
		}
		else {
			osiServiceSupportingDocIndImpl.setNonProvisionReasonReq12(
				nonProvisionReasonReq12);
		}

		if (expectedDateReq12 == Long.MIN_VALUE) {
			osiServiceSupportingDocIndImpl.setExpectedDateReq12(null);
		}
		else {
			osiServiceSupportingDocIndImpl.setExpectedDateReq12(
				new Date(expectedDateReq12));
		}

		if (category == null) {
			osiServiceSupportingDocIndImpl.setCategory("");
		}
		else {
			osiServiceSupportingDocIndImpl.setCategory(category);
		}

		osiServiceSupportingDocIndImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServiceSupportingDocIndImpl.resetOriginalValues();

		return osiServiceSupportingDocIndImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		oSIServiceSupportingDocIndId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		supportingDocCheckboxes = objectInput.readUTF();
		nonProvisionReasonReq1 = objectInput.readUTF();
		expectedDateReq1 = objectInput.readLong();
		nonProvisionReasonReq2 = objectInput.readUTF();
		expectedDateReq2 = objectInput.readLong();
		nonProvisionReasonReq3 = objectInput.readUTF();
		expectedDateReq3 = objectInput.readLong();
		nonProvisionReasonReq4 = objectInput.readUTF();
		expectedDateReq4 = objectInput.readLong();
		nonProvisionReasonReq5 = objectInput.readUTF();
		expectedDateReq5 = objectInput.readLong();
		nonProvisionReasonReq6 = objectInput.readUTF();
		expectedDateReq6 = objectInput.readLong();
		nonProvisionReasonReq7 = objectInput.readUTF();
		expectedDateReq7 = objectInput.readLong();
		nonProvisionReasonReq8 = objectInput.readUTF();
		expectedDateReq8 = objectInput.readLong();
		nonProvisionReasonReq9 = objectInput.readUTF();
		expectedDateReq9 = objectInput.readLong();
		nonProvisionReasonReq10 = objectInput.readUTF();
		expectedDateReq10 = objectInput.readLong();
		nonProvisionReasonReq11 = objectInput.readUTF();
		expectedDateReq11 = objectInput.readLong();
		nonProvisionReasonReq12 = objectInput.readUTF();
		expectedDateReq12 = objectInput.readLong();
		category = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(oSIServiceSupportingDocIndId);

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

		if (supportingDocCheckboxes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(supportingDocCheckboxes);
		}

		if (nonProvisionReasonReq1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq1);
		}

		objectOutput.writeLong(expectedDateReq1);

		if (nonProvisionReasonReq2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq2);
		}

		objectOutput.writeLong(expectedDateReq2);

		if (nonProvisionReasonReq3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq3);
		}

		objectOutput.writeLong(expectedDateReq3);

		if (nonProvisionReasonReq4 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq4);
		}

		objectOutput.writeLong(expectedDateReq4);

		if (nonProvisionReasonReq5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq5);
		}

		objectOutput.writeLong(expectedDateReq5);

		if (nonProvisionReasonReq6 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq6);
		}

		objectOutput.writeLong(expectedDateReq6);

		if (nonProvisionReasonReq7 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq7);
		}

		objectOutput.writeLong(expectedDateReq7);

		if (nonProvisionReasonReq8 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq8);
		}

		objectOutput.writeLong(expectedDateReq8);

		if (nonProvisionReasonReq9 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq9);
		}

		objectOutput.writeLong(expectedDateReq9);

		if (nonProvisionReasonReq10 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq10);
		}

		objectOutput.writeLong(expectedDateReq10);

		if (nonProvisionReasonReq11 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq11);
		}

		objectOutput.writeLong(expectedDateReq11);

		if (nonProvisionReasonReq12 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nonProvisionReasonReq12);
		}

		objectOutput.writeLong(expectedDateReq12);

		if (category == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(category);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public long oSIServiceSupportingDocIndId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String supportingDocCheckboxes;
	public String nonProvisionReasonReq1;
	public long expectedDateReq1;
	public String nonProvisionReasonReq2;
	public long expectedDateReq2;
	public String nonProvisionReasonReq3;
	public long expectedDateReq3;
	public String nonProvisionReasonReq4;
	public long expectedDateReq4;
	public String nonProvisionReasonReq5;
	public long expectedDateReq5;
	public String nonProvisionReasonReq6;
	public long expectedDateReq6;
	public String nonProvisionReasonReq7;
	public long expectedDateReq7;
	public String nonProvisionReasonReq8;
	public long expectedDateReq8;
	public String nonProvisionReasonReq9;
	public long expectedDateReq9;
	public String nonProvisionReasonReq10;
	public long expectedDateReq10;
	public String nonProvisionReasonReq11;
	public long expectedDateReq11;
	public String nonProvisionReasonReq12;
	public long expectedDateReq12;
	public String category;
	public long osiServicesApplicationId;

}