/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancial;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SezDevInvestmentAndFinancial in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SezDevInvestmentAndFinancialCacheModel
	implements CacheModel<SezDevInvestmentAndFinancial>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SezDevInvestmentAndFinancialCacheModel)) {
			return false;
		}

		SezDevInvestmentAndFinancialCacheModel
			sezDevInvestmentAndFinancialCacheModel =
				(SezDevInvestmentAndFinancialCacheModel)object;

		if (sezDevInvestmentAndFinancialId ==
				sezDevInvestmentAndFinancialCacheModel.
					sezDevInvestmentAndFinancialId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sezDevInvestmentAndFinancialId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{sezDevInvestmentAndFinancialId=");
		sb.append(sezDevInvestmentAndFinancialId);
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
		sb.append(", valueOfLand=");
		sb.append(valueOfLand);
		sb.append(", buildingFactoryDevelop=");
		sb.append(buildingFactoryDevelop);
		sb.append(", onSiteInfrastructure=");
		sb.append(onSiteInfrastructure);
		sb.append(", port=");
		sb.append(port);
		sb.append(", airPort=");
		sb.append(airPort);
		sb.append(", other=");
		sb.append(other);
		sb.append(", total=");
		sb.append(total);
		sb.append(", totalLocalDirector=");
		sb.append(totalLocalDirector);
		sb.append(", totalForeignDirector=");
		sb.append(totalForeignDirector);
		sb.append(", companyName=");
		sb.append(companyName);
		sb.append(", resisdentAddress=");
		sb.append(resisdentAddress);
		sb.append(", sourceOfFunds=");
		sb.append(sourceOfFunds);
		sb.append(", sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SezDevInvestmentAndFinancial toEntityModel() {
		SezDevInvestmentAndFinancialImpl sezDevInvestmentAndFinancialImpl =
			new SezDevInvestmentAndFinancialImpl();

		sezDevInvestmentAndFinancialImpl.setSezDevInvestmentAndFinancialId(
			sezDevInvestmentAndFinancialId);
		sezDevInvestmentAndFinancialImpl.setGroupId(groupId);
		sezDevInvestmentAndFinancialImpl.setCompanyId(companyId);
		sezDevInvestmentAndFinancialImpl.setUserId(userId);

		if (userName == null) {
			sezDevInvestmentAndFinancialImpl.setUserName("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sezDevInvestmentAndFinancialImpl.setCreateDate(null);
		}
		else {
			sezDevInvestmentAndFinancialImpl.setCreateDate(
				new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sezDevInvestmentAndFinancialImpl.setModifiedDate(null);
		}
		else {
			sezDevInvestmentAndFinancialImpl.setModifiedDate(
				new Date(modifiedDate));
		}

		if (valueOfLand == null) {
			sezDevInvestmentAndFinancialImpl.setValueOfLand("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setValueOfLand(valueOfLand);
		}

		if (buildingFactoryDevelop == null) {
			sezDevInvestmentAndFinancialImpl.setBuildingFactoryDevelop("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setBuildingFactoryDevelop(
				buildingFactoryDevelop);
		}

		if (onSiteInfrastructure == null) {
			sezDevInvestmentAndFinancialImpl.setOnSiteInfrastructure("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setOnSiteInfrastructure(
				onSiteInfrastructure);
		}

		if (port == null) {
			sezDevInvestmentAndFinancialImpl.setPort("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setPort(port);
		}

		if (airPort == null) {
			sezDevInvestmentAndFinancialImpl.setAirPort("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setAirPort(airPort);
		}

		if (other == null) {
			sezDevInvestmentAndFinancialImpl.setOther("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setOther(other);
		}

		if (total == null) {
			sezDevInvestmentAndFinancialImpl.setTotal("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setTotal(total);
		}

		if (totalLocalDirector == null) {
			sezDevInvestmentAndFinancialImpl.setTotalLocalDirector("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setTotalLocalDirector(
				totalLocalDirector);
		}

		if (totalForeignDirector == null) {
			sezDevInvestmentAndFinancialImpl.setTotalForeignDirector("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setTotalForeignDirector(
				totalForeignDirector);
		}

		if (companyName == null) {
			sezDevInvestmentAndFinancialImpl.setCompanyName("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setCompanyName(companyName);
		}

		if (resisdentAddress == null) {
			sezDevInvestmentAndFinancialImpl.setResisdentAddress("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setResisdentAddress(
				resisdentAddress);
		}

		if (sourceOfFunds == null) {
			sezDevInvestmentAndFinancialImpl.setSourceOfFunds("");
		}
		else {
			sezDevInvestmentAndFinancialImpl.setSourceOfFunds(sourceOfFunds);
		}

		sezDevInvestmentAndFinancialImpl.setSezStatusApplicationId(
			sezStatusApplicationId);

		sezDevInvestmentAndFinancialImpl.resetOriginalValues();

		return sezDevInvestmentAndFinancialImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sezDevInvestmentAndFinancialId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		valueOfLand = objectInput.readUTF();
		buildingFactoryDevelop = objectInput.readUTF();
		onSiteInfrastructure = objectInput.readUTF();
		port = objectInput.readUTF();
		airPort = objectInput.readUTF();
		other = objectInput.readUTF();
		total = objectInput.readUTF();
		totalLocalDirector = objectInput.readUTF();
		totalForeignDirector = objectInput.readUTF();
		companyName = objectInput.readUTF();
		resisdentAddress = objectInput.readUTF();
		sourceOfFunds = objectInput.readUTF();

		sezStatusApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(sezDevInvestmentAndFinancialId);

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

		if (valueOfLand == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(valueOfLand);
		}

		if (buildingFactoryDevelop == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingFactoryDevelop);
		}

		if (onSiteInfrastructure == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(onSiteInfrastructure);
		}

		if (port == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(port);
		}

		if (airPort == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(airPort);
		}

		if (other == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(other);
		}

		if (total == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(total);
		}

		if (totalLocalDirector == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalLocalDirector);
		}

		if (totalForeignDirector == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(totalForeignDirector);
		}

		if (companyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(companyName);
		}

		if (resisdentAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(resisdentAddress);
		}

		if (sourceOfFunds == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sourceOfFunds);
		}

		objectOutput.writeLong(sezStatusApplicationId);
	}

	public long sezDevInvestmentAndFinancialId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String valueOfLand;
	public String buildingFactoryDevelop;
	public String onSiteInfrastructure;
	public String port;
	public String airPort;
	public String other;
	public String total;
	public String totalLocalDirector;
	public String totalForeignDirector;
	public String companyName;
	public String resisdentAddress;
	public String sourceOfFunds;
	public long sezStatusApplicationId;

}