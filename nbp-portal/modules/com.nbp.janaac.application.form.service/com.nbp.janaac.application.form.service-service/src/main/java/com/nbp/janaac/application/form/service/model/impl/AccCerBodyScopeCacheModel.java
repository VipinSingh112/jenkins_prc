/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyScope;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyScope in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyScopeCacheModel
	implements CacheModel<AccCerBodyScope>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyScopeCacheModel)) {
			return false;
		}

		AccCerBodyScopeCacheModel accCerBodyScopeCacheModel =
			(AccCerBodyScopeCacheModel)object;

		if (accCerBodyScopeId == accCerBodyScopeCacheModel.accCerBodyScopeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyScopeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyScopeId=");
		sb.append(accCerBodyScopeId);
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
		sb.append(", certificationStandard=");
		sb.append(certificationStandard);
		sb.append(", expertiseField1=");
		sb.append(expertiseField1);
		sb.append(", expertiseField2=");
		sb.append(expertiseField2);
		sb.append(", expertiseField3=");
		sb.append(expertiseField3);
		sb.append(", expertiseField4=");
		sb.append(expertiseField4);
		sb.append(", expertiseField5=");
		sb.append(expertiseField5);
		sb.append(", expertiseField6=");
		sb.append(expertiseField6);
		sb.append(", expertiseField7=");
		sb.append(expertiseField7);
		sb.append(", expertiseField8=");
		sb.append(expertiseField8);
		sb.append(", expertiseField9=");
		sb.append(expertiseField9);
		sb.append(", expertiseField10=");
		sb.append(expertiseField10);
		sb.append(", expertiseField11=");
		sb.append(expertiseField11);
		sb.append(", expertiseField12=");
		sb.append(expertiseField12);
		sb.append(", expertiseField13=");
		sb.append(expertiseField13);
		sb.append(", expertiseField14=");
		sb.append(expertiseField14);
		sb.append(", cerIntrestedParties=");
		sb.append(cerIntrestedParties);
		sb.append(", otherServices=");
		sb.append(otherServices);
		sb.append(", otherServicesDescribe=");
		sb.append(otherServicesDescribe);
		sb.append(", establishedRelation=");
		sb.append(establishedRelation);
		sb.append(", establishedRelDesc=");
		sb.append(establishedRelDesc);
		sb.append(", clientService=");
		sb.append(clientService);
		sb.append(", certificationCerBody=");
		sb.append(certificationCerBody);
		sb.append(", orgAccredited=");
		sb.append(orgAccredited);
		sb.append(", responsibleBody=");
		sb.append(responsibleBody);
		sb.append(", accExpDate=");
		sb.append(accExpDate);
		sb.append(", certBodyScope=");
		sb.append(certBodyScope);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AccCerBodyScope toEntityModel() {
		AccCerBodyScopeImpl accCerBodyScopeImpl = new AccCerBodyScopeImpl();

		if (uuid == null) {
			accCerBodyScopeImpl.setUuid("");
		}
		else {
			accCerBodyScopeImpl.setUuid(uuid);
		}

		accCerBodyScopeImpl.setAccCerBodyScopeId(accCerBodyScopeId);
		accCerBodyScopeImpl.setGroupId(groupId);
		accCerBodyScopeImpl.setCompanyId(companyId);
		accCerBodyScopeImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyScopeImpl.setUserName("");
		}
		else {
			accCerBodyScopeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyScopeImpl.setCreateDate(null);
		}
		else {
			accCerBodyScopeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyScopeImpl.setModifiedDate(null);
		}
		else {
			accCerBodyScopeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (certificationStandard == null) {
			accCerBodyScopeImpl.setCertificationStandard("");
		}
		else {
			accCerBodyScopeImpl.setCertificationStandard(certificationStandard);
		}

		if (expertiseField1 == null) {
			accCerBodyScopeImpl.setExpertiseField1("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField1(expertiseField1);
		}

		if (expertiseField2 == null) {
			accCerBodyScopeImpl.setExpertiseField2("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField2(expertiseField2);
		}

		if (expertiseField3 == null) {
			accCerBodyScopeImpl.setExpertiseField3("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField3(expertiseField3);
		}

		if (expertiseField4 == null) {
			accCerBodyScopeImpl.setExpertiseField4("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField4(expertiseField4);
		}

		if (expertiseField5 == null) {
			accCerBodyScopeImpl.setExpertiseField5("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField5(expertiseField5);
		}

		if (expertiseField6 == null) {
			accCerBodyScopeImpl.setExpertiseField6("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField6(expertiseField6);
		}

		if (expertiseField7 == null) {
			accCerBodyScopeImpl.setExpertiseField7("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField7(expertiseField7);
		}

		if (expertiseField8 == null) {
			accCerBodyScopeImpl.setExpertiseField8("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField8(expertiseField8);
		}

		if (expertiseField9 == null) {
			accCerBodyScopeImpl.setExpertiseField9("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField9(expertiseField9);
		}

		if (expertiseField10 == null) {
			accCerBodyScopeImpl.setExpertiseField10("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField10(expertiseField10);
		}

		if (expertiseField11 == null) {
			accCerBodyScopeImpl.setExpertiseField11("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField11(expertiseField11);
		}

		if (expertiseField12 == null) {
			accCerBodyScopeImpl.setExpertiseField12("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField12(expertiseField12);
		}

		if (expertiseField13 == null) {
			accCerBodyScopeImpl.setExpertiseField13("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField13(expertiseField13);
		}

		if (expertiseField14 == null) {
			accCerBodyScopeImpl.setExpertiseField14("");
		}
		else {
			accCerBodyScopeImpl.setExpertiseField14(expertiseField14);
		}

		if (cerIntrestedParties == null) {
			accCerBodyScopeImpl.setCerIntrestedParties("");
		}
		else {
			accCerBodyScopeImpl.setCerIntrestedParties(cerIntrestedParties);
		}

		if (otherServices == null) {
			accCerBodyScopeImpl.setOtherServices("");
		}
		else {
			accCerBodyScopeImpl.setOtherServices(otherServices);
		}

		if (otherServicesDescribe == null) {
			accCerBodyScopeImpl.setOtherServicesDescribe("");
		}
		else {
			accCerBodyScopeImpl.setOtherServicesDescribe(otherServicesDescribe);
		}

		if (establishedRelation == null) {
			accCerBodyScopeImpl.setEstablishedRelation("");
		}
		else {
			accCerBodyScopeImpl.setEstablishedRelation(establishedRelation);
		}

		if (establishedRelDesc == null) {
			accCerBodyScopeImpl.setEstablishedRelDesc("");
		}
		else {
			accCerBodyScopeImpl.setEstablishedRelDesc(establishedRelDesc);
		}

		if (clientService == null) {
			accCerBodyScopeImpl.setClientService("");
		}
		else {
			accCerBodyScopeImpl.setClientService(clientService);
		}

		if (certificationCerBody == null) {
			accCerBodyScopeImpl.setCertificationCerBody("");
		}
		else {
			accCerBodyScopeImpl.setCertificationCerBody(certificationCerBody);
		}

		if (orgAccredited == null) {
			accCerBodyScopeImpl.setOrgAccredited("");
		}
		else {
			accCerBodyScopeImpl.setOrgAccredited(orgAccredited);
		}

		if (responsibleBody == null) {
			accCerBodyScopeImpl.setResponsibleBody("");
		}
		else {
			accCerBodyScopeImpl.setResponsibleBody(responsibleBody);
		}

		if (accExpDate == Long.MIN_VALUE) {
			accCerBodyScopeImpl.setAccExpDate(null);
		}
		else {
			accCerBodyScopeImpl.setAccExpDate(new Date(accExpDate));
		}

		if (certBodyScope == null) {
			accCerBodyScopeImpl.setCertBodyScope("");
		}
		else {
			accCerBodyScopeImpl.setCertBodyScope(certBodyScope);
		}

		accCerBodyScopeImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyScopeImpl.resetOriginalValues();

		return accCerBodyScopeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyScopeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		certificationStandard = objectInput.readUTF();
		expertiseField1 = objectInput.readUTF();
		expertiseField2 = objectInput.readUTF();
		expertiseField3 = objectInput.readUTF();
		expertiseField4 = objectInput.readUTF();
		expertiseField5 = objectInput.readUTF();
		expertiseField6 = objectInput.readUTF();
		expertiseField7 = objectInput.readUTF();
		expertiseField8 = objectInput.readUTF();
		expertiseField9 = objectInput.readUTF();
		expertiseField10 = objectInput.readUTF();
		expertiseField11 = objectInput.readUTF();
		expertiseField12 = objectInput.readUTF();
		expertiseField13 = objectInput.readUTF();
		expertiseField14 = objectInput.readUTF();
		cerIntrestedParties = objectInput.readUTF();
		otherServices = objectInput.readUTF();
		otherServicesDescribe = objectInput.readUTF();
		establishedRelation = objectInput.readUTF();
		establishedRelDesc = objectInput.readUTF();
		clientService = objectInput.readUTF();
		certificationCerBody = objectInput.readUTF();
		orgAccredited = objectInput.readUTF();
		responsibleBody = objectInput.readUTF();
		accExpDate = objectInput.readLong();
		certBodyScope = objectInput.readUTF();

		janaacApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(accCerBodyScopeId);

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

		if (certificationStandard == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationStandard);
		}

		if (expertiseField1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField1);
		}

		if (expertiseField2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField2);
		}

		if (expertiseField3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField3);
		}

		if (expertiseField4 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField4);
		}

		if (expertiseField5 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField5);
		}

		if (expertiseField6 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField6);
		}

		if (expertiseField7 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField7);
		}

		if (expertiseField8 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField8);
		}

		if (expertiseField9 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField9);
		}

		if (expertiseField10 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField10);
		}

		if (expertiseField11 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField11);
		}

		if (expertiseField12 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField12);
		}

		if (expertiseField13 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField13);
		}

		if (expertiseField14 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(expertiseField14);
		}

		if (cerIntrestedParties == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cerIntrestedParties);
		}

		if (otherServices == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherServices);
		}

		if (otherServicesDescribe == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherServicesDescribe);
		}

		if (establishedRelation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishedRelation);
		}

		if (establishedRelDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(establishedRelDesc);
		}

		if (clientService == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(clientService);
		}

		if (certificationCerBody == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certificationCerBody);
		}

		if (orgAccredited == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgAccredited);
		}

		if (responsibleBody == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responsibleBody);
		}

		objectOutput.writeLong(accExpDate);

		if (certBodyScope == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(certBodyScope);
		}

		objectOutput.writeLong(janaacApplicationId);
	}

	public String uuid;
	public long accCerBodyScopeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String certificationStandard;
	public String expertiseField1;
	public String expertiseField2;
	public String expertiseField3;
	public String expertiseField4;
	public String expertiseField5;
	public String expertiseField6;
	public String expertiseField7;
	public String expertiseField8;
	public String expertiseField9;
	public String expertiseField10;
	public String expertiseField11;
	public String expertiseField12;
	public String expertiseField13;
	public String expertiseField14;
	public String cerIntrestedParties;
	public String otherServices;
	public String otherServicesDescribe;
	public String establishedRelation;
	public String establishedRelDesc;
	public String clientService;
	public String certificationCerBody;
	public String orgAccredited;
	public String responsibleBody;
	public long accExpDate;
	public String certBodyScope;
	public long janaacApplicationId;

}