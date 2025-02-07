/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ManuCompanyInfoAddressPK
	implements Comparable<ManuCompanyInfoAddressPK>, Serializable {

	public long manuCompanyInfoAddressId;
	public long manuCompanyInfoId;

	public ManuCompanyInfoAddressPK() {
	}

	public ManuCompanyInfoAddressPK(
		long manuCompanyInfoAddressId, long manuCompanyInfoId) {

		this.manuCompanyInfoAddressId = manuCompanyInfoAddressId;
		this.manuCompanyInfoId = manuCompanyInfoId;
	}

	public long getManuCompanyInfoAddressId() {
		return manuCompanyInfoAddressId;
	}

	public void setManuCompanyInfoAddressId(long manuCompanyInfoAddressId) {
		this.manuCompanyInfoAddressId = manuCompanyInfoAddressId;
	}

	public long getManuCompanyInfoId() {
		return manuCompanyInfoId;
	}

	public void setManuCompanyInfoId(long manuCompanyInfoId) {
		this.manuCompanyInfoId = manuCompanyInfoId;
	}

	@Override
	public int compareTo(ManuCompanyInfoAddressPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (manuCompanyInfoAddressId < pk.manuCompanyInfoAddressId) {
			value = -1;
		}
		else if (manuCompanyInfoAddressId > pk.manuCompanyInfoAddressId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (manuCompanyInfoId < pk.manuCompanyInfoId) {
			value = -1;
		}
		else if (manuCompanyInfoId > pk.manuCompanyInfoId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ManuCompanyInfoAddressPK)) {
			return false;
		}

		ManuCompanyInfoAddressPK pk = (ManuCompanyInfoAddressPK)object;

		if ((manuCompanyInfoAddressId == pk.manuCompanyInfoAddressId) &&
			(manuCompanyInfoId == pk.manuCompanyInfoId)) {

			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, manuCompanyInfoAddressId);
		hashCode = HashUtil.hash(hashCode, manuCompanyInfoId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("manuCompanyInfoAddressId=");

		sb.append(manuCompanyInfoAddressId);
		sb.append(", manuCompanyInfoId=");

		sb.append(manuCompanyInfoId);

		sb.append("}");

		return sb.toString();
	}

}