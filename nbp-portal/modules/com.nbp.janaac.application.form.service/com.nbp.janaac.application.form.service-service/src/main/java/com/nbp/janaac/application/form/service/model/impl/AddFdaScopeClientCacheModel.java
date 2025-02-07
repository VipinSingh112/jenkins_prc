/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.janaac.application.form.service.model.AddFdaScopeClient;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AddFdaScopeClient in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AddFdaScopeClientCacheModel
	implements CacheModel<AddFdaScopeClient>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AddFdaScopeClientCacheModel)) {
			return false;
		}

		AddFdaScopeClientCacheModel addFdaScopeClientCacheModel =
			(AddFdaScopeClientCacheModel)object;

		if (addFdaScopeClientId ==
				addFdaScopeClientCacheModel.addFdaScopeClientId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addFdaScopeClientId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{addFdaScopeClientId=");
		sb.append(addFdaScopeClientId);
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
		sb.append(", clientOrganization=");
		sb.append(clientOrganization);
		sb.append(", foodProducts=");
		sb.append(foodProducts);
		sb.append(", fdaRegulations=");
		sb.append(fdaRegulations);
		sb.append(", dateGranted=");
		sb.append(dateGranted);
		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);
		sb.append(", counter=");
		sb.append(counter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddFdaScopeClient toEntityModel() {
		AddFdaScopeClientImpl addFdaScopeClientImpl =
			new AddFdaScopeClientImpl();

		addFdaScopeClientImpl.setAddFdaScopeClientId(addFdaScopeClientId);
		addFdaScopeClientImpl.setGroupId(groupId);
		addFdaScopeClientImpl.setCompanyId(companyId);
		addFdaScopeClientImpl.setUserId(userId);

		if (userName == null) {
			addFdaScopeClientImpl.setUserName("");
		}
		else {
			addFdaScopeClientImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addFdaScopeClientImpl.setCreateDate(null);
		}
		else {
			addFdaScopeClientImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addFdaScopeClientImpl.setModifiedDate(null);
		}
		else {
			addFdaScopeClientImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (clientOrganization == null) {
			addFdaScopeClientImpl.setClientOrganization("");
		}
		else {
			addFdaScopeClientImpl.setClientOrganization(clientOrganization);
		}

		if (foodProducts == null) {
			addFdaScopeClientImpl.setFoodProducts("");
		}
		else {
			addFdaScopeClientImpl.setFoodProducts(foodProducts);
		}

		if (fdaRegulations == null) {
			addFdaScopeClientImpl.setFdaRegulations("");
		}
		else {
			addFdaScopeClientImpl.setFdaRegulations(fdaRegulations);
		}

		if (dateGranted == Long.MIN_VALUE) {
			addFdaScopeClientImpl.setDateGranted(null);
		}
		else {
			addFdaScopeClientImpl.setDateGranted(new Date(dateGranted));
		}

		addFdaScopeClientImpl.setJanaacApplicationId(janaacApplicationId);

		if (counter == null) {
			addFdaScopeClientImpl.setCounter("");
		}
		else {
			addFdaScopeClientImpl.setCounter(counter);
		}

		addFdaScopeClientImpl.resetOriginalValues();

		return addFdaScopeClientImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		addFdaScopeClientId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		clientOrganization = objectInput.readUTF();
		foodProducts = objectInput.readUTF();
		fdaRegulations = objectInput.readUTF();
		dateGranted = objectInput.readLong();

		janaacApplicationId = objectInput.readLong();
		counter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(addFdaScopeClientId);

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

		if (clientOrganization == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(clientOrganization);
		}

		if (foodProducts == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(foodProducts);
		}

		if (fdaRegulations == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fdaRegulations);
		}

		objectOutput.writeLong(dateGranted);

		objectOutput.writeLong(janaacApplicationId);

		if (counter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(counter);
		}
	}

	public long addFdaScopeClientId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String clientOrganization;
	public String foodProducts;
	public String fdaRegulations;
	public long dateGranted;
	public long janaacApplicationId;
	public String counter;

}