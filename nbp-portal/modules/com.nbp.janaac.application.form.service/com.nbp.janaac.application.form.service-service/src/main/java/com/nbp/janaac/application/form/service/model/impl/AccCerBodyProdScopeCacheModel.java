/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AccCerBodyProdScope;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AccCerBodyProdScope in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AccCerBodyProdScopeCacheModel
	implements CacheModel<AccCerBodyProdScope>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AccCerBodyProdScopeCacheModel)) {
			return false;
		}

		AccCerBodyProdScopeCacheModel accCerBodyProdScopeCacheModel =
			(AccCerBodyProdScopeCacheModel)object;

		if (accCerBodyProdScopeId ==
				accCerBodyProdScopeCacheModel.accCerBodyProdScopeId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, accCerBodyProdScopeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", accCerBodyProdScopeId=");
		sb.append(accCerBodyProdScopeId);
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
	public AccCerBodyProdScope toEntityModel() {
		AccCerBodyProdScopeImpl accCerBodyProdScopeImpl =
			new AccCerBodyProdScopeImpl();

		if (uuid == null) {
			accCerBodyProdScopeImpl.setUuid("");
		}
		else {
			accCerBodyProdScopeImpl.setUuid(uuid);
		}

		accCerBodyProdScopeImpl.setAccCerBodyProdScopeId(accCerBodyProdScopeId);
		accCerBodyProdScopeImpl.setGroupId(groupId);
		accCerBodyProdScopeImpl.setCompanyId(companyId);
		accCerBodyProdScopeImpl.setUserId(userId);

		if (userName == null) {
			accCerBodyProdScopeImpl.setUserName("");
		}
		else {
			accCerBodyProdScopeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			accCerBodyProdScopeImpl.setCreateDate(null);
		}
		else {
			accCerBodyProdScopeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			accCerBodyProdScopeImpl.setModifiedDate(null);
		}
		else {
			accCerBodyProdScopeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (cerIntrestedParties == null) {
			accCerBodyProdScopeImpl.setCerIntrestedParties("");
		}
		else {
			accCerBodyProdScopeImpl.setCerIntrestedParties(cerIntrestedParties);
		}

		if (otherServices == null) {
			accCerBodyProdScopeImpl.setOtherServices("");
		}
		else {
			accCerBodyProdScopeImpl.setOtherServices(otherServices);
		}

		if (otherServicesDescribe == null) {
			accCerBodyProdScopeImpl.setOtherServicesDescribe("");
		}
		else {
			accCerBodyProdScopeImpl.setOtherServicesDescribe(
				otherServicesDescribe);
		}

		if (establishedRelation == null) {
			accCerBodyProdScopeImpl.setEstablishedRelation("");
		}
		else {
			accCerBodyProdScopeImpl.setEstablishedRelation(establishedRelation);
		}

		if (establishedRelDesc == null) {
			accCerBodyProdScopeImpl.setEstablishedRelDesc("");
		}
		else {
			accCerBodyProdScopeImpl.setEstablishedRelDesc(establishedRelDesc);
		}

		if (clientService == null) {
			accCerBodyProdScopeImpl.setClientService("");
		}
		else {
			accCerBodyProdScopeImpl.setClientService(clientService);
		}

		if (orgAccredited == null) {
			accCerBodyProdScopeImpl.setOrgAccredited("");
		}
		else {
			accCerBodyProdScopeImpl.setOrgAccredited(orgAccredited);
		}

		if (responsibleBody == null) {
			accCerBodyProdScopeImpl.setResponsibleBody("");
		}
		else {
			accCerBodyProdScopeImpl.setResponsibleBody(responsibleBody);
		}

		if (accExpDate == Long.MIN_VALUE) {
			accCerBodyProdScopeImpl.setAccExpDate(null);
		}
		else {
			accCerBodyProdScopeImpl.setAccExpDate(new Date(accExpDate));
		}

		if (certBodyScope == null) {
			accCerBodyProdScopeImpl.setCertBodyScope("");
		}
		else {
			accCerBodyProdScopeImpl.setCertBodyScope(certBodyScope);
		}

		accCerBodyProdScopeImpl.setJanaacApplicationId(janaacApplicationId);

		accCerBodyProdScopeImpl.resetOriginalValues();

		return accCerBodyProdScopeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		accCerBodyProdScopeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		cerIntrestedParties = objectInput.readUTF();
		otherServices = objectInput.readUTF();
		otherServicesDescribe = objectInput.readUTF();
		establishedRelation = objectInput.readUTF();
		establishedRelDesc = objectInput.readUTF();
		clientService = objectInput.readUTF();
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

		objectOutput.writeLong(accCerBodyProdScopeId);

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
	public long accCerBodyProdScopeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String cerIntrestedParties;
	public String otherServices;
	public String otherServicesDescribe;
	public String establishedRelation;
	public String establishedRelDesc;
	public String clientService;
	public String orgAccredited;
	public String responsibleBody;
	public long accExpDate;
	public String certBodyScope;
	public long janaacApplicationId;

}