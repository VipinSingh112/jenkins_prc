/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.hsra.application.service.model.BrokerDeclarationInfo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BrokerDeclarationInfo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BrokerDeclarationInfoCacheModel
	implements CacheModel<BrokerDeclarationInfo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BrokerDeclarationInfoCacheModel)) {
			return false;
		}

		BrokerDeclarationInfoCacheModel brokerDeclarationInfoCacheModel =
			(BrokerDeclarationInfoCacheModel)object;

		if (brokerDeclareInfoId ==
				brokerDeclarationInfoCacheModel.brokerDeclareInfoId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, brokerDeclareInfoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{brokerDeclareInfoId=");
		sb.append(brokerDeclareInfoId);
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
		sb.append(", brokerOperatorName=");
		sb.append(brokerOperatorName);
		sb.append(", brokerTitle=");
		sb.append(brokerTitle);
		sb.append(", signDate=");
		sb.append(signDate);
		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BrokerDeclarationInfo toEntityModel() {
		BrokerDeclarationInfoImpl brokerDeclarationInfoImpl =
			new BrokerDeclarationInfoImpl();

		brokerDeclarationInfoImpl.setBrokerDeclareInfoId(brokerDeclareInfoId);
		brokerDeclarationInfoImpl.setGroupId(groupId);
		brokerDeclarationInfoImpl.setCompanyId(companyId);
		brokerDeclarationInfoImpl.setUserId(userId);

		if (userName == null) {
			brokerDeclarationInfoImpl.setUserName("");
		}
		else {
			brokerDeclarationInfoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			brokerDeclarationInfoImpl.setCreateDate(null);
		}
		else {
			brokerDeclarationInfoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			brokerDeclarationInfoImpl.setModifiedDate(null);
		}
		else {
			brokerDeclarationInfoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (brokerOperatorName == null) {
			brokerDeclarationInfoImpl.setBrokerOperatorName("");
		}
		else {
			brokerDeclarationInfoImpl.setBrokerOperatorName(brokerOperatorName);
		}

		if (brokerTitle == null) {
			brokerDeclarationInfoImpl.setBrokerTitle("");
		}
		else {
			brokerDeclarationInfoImpl.setBrokerTitle(brokerTitle);
		}

		if (signDate == Long.MIN_VALUE) {
			brokerDeclarationInfoImpl.setSignDate(null);
		}
		else {
			brokerDeclarationInfoImpl.setSignDate(new Date(signDate));
		}

		brokerDeclarationInfoImpl.setHsraApplicationId(hsraApplicationId);

		brokerDeclarationInfoImpl.resetOriginalValues();

		return brokerDeclarationInfoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		brokerDeclareInfoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		brokerOperatorName = objectInput.readUTF();
		brokerTitle = objectInput.readUTF();
		signDate = objectInput.readLong();

		hsraApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(brokerDeclareInfoId);

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

		if (brokerOperatorName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brokerOperatorName);
		}

		if (brokerTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brokerTitle);
		}

		objectOutput.writeLong(signDate);

		objectOutput.writeLong(hsraApplicationId);
	}

	public long brokerDeclareInfoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String brokerOperatorName;
	public String brokerTitle;
	public long signDate;
	public long hsraApplicationId;

}