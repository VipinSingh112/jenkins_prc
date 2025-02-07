/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OsiServicesTrusteeBreadDownAddinfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OsiServicesTrusteeBreadDownAddinfoCacheModel
	implements CacheModel<OsiServicesTrusteeBreadDownAddinfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OsiServicesTrusteeBreadDownAddinfoCacheModel)) {
			return false;
		}

		OsiServicesTrusteeBreadDownAddinfoCacheModel
			osiServicesTrusteeBreadDownAddinfoCacheModel =
				(OsiServicesTrusteeBreadDownAddinfoCacheModel)object;

		if (osiTrusId ==
				osiServicesTrusteeBreadDownAddinfoCacheModel.osiTrusId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiTrusId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", osiTrusId=");
		sb.append(osiTrusId);
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
		sb.append(", breakdownWorkingYear=");
		sb.append(breakdownWorkingYear);
		sb.append(", workingBankrupties=");
		sb.append(workingBankrupties);
		sb.append(", workingProposal=");
		sb.append(workingProposal);
		sb.append(", workingComBankrupts=");
		sb.append(workingComBankrupts);
		sb.append(", workingComProposal=");
		sb.append(workingComProposal);
		sb.append(", workingInterimReceive=");
		sb.append(workingInterimReceive);
		sb.append(", breakdownWorkingCreditors=");
		sb.append(breakdownWorkingCreditors);
		sb.append(", breakdownWorkingOther=");
		sb.append(breakdownWorkingOther);
		sb.append(", counter=");
		sb.append(counter);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OsiServicesTrusteeBreadDownAddinfo toEntityModel() {
		OsiServicesTrusteeBreadDownAddinfoImpl
			osiServicesTrusteeBreadDownAddinfoImpl =
				new OsiServicesTrusteeBreadDownAddinfoImpl();

		if (uuid == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setUuid("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setUuid(uuid);
		}

		osiServicesTrusteeBreadDownAddinfoImpl.setOsiTrusId(osiTrusId);
		osiServicesTrusteeBreadDownAddinfoImpl.setGroupId(groupId);
		osiServicesTrusteeBreadDownAddinfoImpl.setCompanyId(companyId);
		osiServicesTrusteeBreadDownAddinfoImpl.setUserId(userId);

		if (userName == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setUserName("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServicesTrusteeBreadDownAddinfoImpl.setCreateDate(null);
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServicesTrusteeBreadDownAddinfoImpl.setModifiedDate(null);
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (breakdownWorkingYear == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setBreakdownWorkingYear("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setBreakdownWorkingYear(
				breakdownWorkingYear);
		}

		if (workingBankrupties == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingBankrupties("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingBankrupties(
				workingBankrupties);
		}

		if (workingProposal == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingProposal("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingProposal(
				workingProposal);
		}

		if (workingComBankrupts == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingComBankrupts("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingComBankrupts(
				workingComBankrupts);
		}

		if (workingComProposal == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingComProposal("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingComProposal(
				workingComProposal);
		}

		if (workingInterimReceive == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingInterimReceive("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setWorkingInterimReceive(
				workingInterimReceive);
		}

		if (breakdownWorkingCreditors == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setBreakdownWorkingCreditors(
				"");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setBreakdownWorkingCreditors(
				breakdownWorkingCreditors);
		}

		if (breakdownWorkingOther == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setBreakdownWorkingOther("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setBreakdownWorkingOther(
				breakdownWorkingOther);
		}

		if (counter == null) {
			osiServicesTrusteeBreadDownAddinfoImpl.setCounter("");
		}
		else {
			osiServicesTrusteeBreadDownAddinfoImpl.setCounter(counter);
		}

		osiServicesTrusteeBreadDownAddinfoImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServicesTrusteeBreadDownAddinfoImpl.resetOriginalValues();

		return osiServicesTrusteeBreadDownAddinfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		osiTrusId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		breakdownWorkingYear = objectInput.readUTF();
		workingBankrupties = objectInput.readUTF();
		workingProposal = objectInput.readUTF();
		workingComBankrupts = objectInput.readUTF();
		workingComProposal = objectInput.readUTF();
		workingInterimReceive = objectInput.readUTF();
		breakdownWorkingCreditors = objectInput.readUTF();
		breakdownWorkingOther = objectInput.readUTF();
		counter = objectInput.readUTF();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(osiTrusId);

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

		if (breakdownWorkingYear == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(breakdownWorkingYear);
		}

		if (workingBankrupties == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workingBankrupties);
		}

		if (workingProposal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workingProposal);
		}

		if (workingComBankrupts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workingComBankrupts);
		}

		if (workingComProposal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workingComProposal);
		}

		if (workingInterimReceive == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workingInterimReceive);
		}

		if (breakdownWorkingCreditors == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(breakdownWorkingCreditors);
		}

		if (breakdownWorkingOther == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(breakdownWorkingOther);
		}

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public String uuid;
	public long osiTrusId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String breakdownWorkingYear;
	public String workingBankrupties;
	public String workingProposal;
	public String workingComBankrupts;
	public String workingComProposal;
	public String workingInterimReceive;
	public String breakdownWorkingCreditors;
	public String breakdownWorkingOther;
	public String counter;
	public long osiServicesApplicationId;

}