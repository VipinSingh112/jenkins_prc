/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.osi.services.application.form.service.model.OSIServiceComSign;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing OSIServiceComSign in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OSIServiceComSignCacheModel
	implements CacheModel<OSIServiceComSign>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OSIServiceComSignCacheModel)) {
			return false;
		}

		OSIServiceComSignCacheModel osiServiceComSignCacheModel =
			(OSIServiceComSignCacheModel)object;

		if (osiComSignId == osiServiceComSignCacheModel.osiComSignId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, osiComSignId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{osiComSignId=");
		sb.append(osiComSignId);
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
		sb.append(", comSignDate=");
		sb.append(comSignDate);
		sb.append(", osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OSIServiceComSign toEntityModel() {
		OSIServiceComSignImpl osiServiceComSignImpl =
			new OSIServiceComSignImpl();

		osiServiceComSignImpl.setOsiComSignId(osiComSignId);
		osiServiceComSignImpl.setGroupId(groupId);
		osiServiceComSignImpl.setCompanyId(companyId);
		osiServiceComSignImpl.setUserId(userId);

		if (userName == null) {
			osiServiceComSignImpl.setUserName("");
		}
		else {
			osiServiceComSignImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			osiServiceComSignImpl.setCreateDate(null);
		}
		else {
			osiServiceComSignImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			osiServiceComSignImpl.setModifiedDate(null);
		}
		else {
			osiServiceComSignImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (comSignDate == Long.MIN_VALUE) {
			osiServiceComSignImpl.setComSignDate(null);
		}
		else {
			osiServiceComSignImpl.setComSignDate(new Date(comSignDate));
		}

		osiServiceComSignImpl.setOsiServicesApplicationId(
			osiServicesApplicationId);

		osiServiceComSignImpl.resetOriginalValues();

		return osiServiceComSignImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		osiComSignId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		comSignDate = objectInput.readLong();

		osiServicesApplicationId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(osiComSignId);

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
		objectOutput.writeLong(comSignDate);

		objectOutput.writeLong(osiServicesApplicationId);
	}

	public long osiComSignId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long comSignDate;
	public long osiServicesApplicationId;

}