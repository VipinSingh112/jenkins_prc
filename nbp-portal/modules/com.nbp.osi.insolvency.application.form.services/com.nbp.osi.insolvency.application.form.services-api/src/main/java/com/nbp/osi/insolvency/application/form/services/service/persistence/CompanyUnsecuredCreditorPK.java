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

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CompanyUnsecuredCreditorPK
	implements Comparable<CompanyUnsecuredCreditorPK>, Serializable {

	public long companyUnsecuredCreditorId;
	public long osiInsolvencyId;

	public CompanyUnsecuredCreditorPK() {
	}

	public CompanyUnsecuredCreditorPK(
		long companyUnsecuredCreditorId, long osiInsolvencyId) {

		this.companyUnsecuredCreditorId = companyUnsecuredCreditorId;
		this.osiInsolvencyId = osiInsolvencyId;
	}

	public long getCompanyUnsecuredCreditorId() {
		return companyUnsecuredCreditorId;
	}

	public void setCompanyUnsecuredCreditorId(long companyUnsecuredCreditorId) {
		this.companyUnsecuredCreditorId = companyUnsecuredCreditorId;
	}

	public long getOsiInsolvencyId() {
		return osiInsolvencyId;
	}

	public void setOsiInsolvencyId(long osiInsolvencyId) {
		this.osiInsolvencyId = osiInsolvencyId;
	}

	@Override
	public int compareTo(CompanyUnsecuredCreditorPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (companyUnsecuredCreditorId < pk.companyUnsecuredCreditorId) {
			value = -1;
		}
		else if (companyUnsecuredCreditorId > pk.companyUnsecuredCreditorId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (osiInsolvencyId < pk.osiInsolvencyId) {
			value = -1;
		}
		else if (osiInsolvencyId > pk.osiInsolvencyId) {
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

		if (!(object instanceof CompanyUnsecuredCreditorPK)) {
			return false;
		}

		CompanyUnsecuredCreditorPK pk = (CompanyUnsecuredCreditorPK)object;

		if ((companyUnsecuredCreditorId == pk.companyUnsecuredCreditorId) &&
			(osiInsolvencyId == pk.osiInsolvencyId)) {

			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, companyUnsecuredCreditorId);
		hashCode = HashUtil.hash(hashCode, osiInsolvencyId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("companyUnsecuredCreditorId=");

		sb.append(companyUnsecuredCreditorId);
		sb.append(", osiInsolvencyId=");

		sb.append(osiInsolvencyId);

		sb.append("}");

		return sb.toString();
	}

}