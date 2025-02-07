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
public class DirectorsFormPK
	implements Comparable<DirectorsFormPK>, Serializable {

	public long directorsFormId;
	public long osiInsolvencyId;

	public DirectorsFormPK() {
	}

	public DirectorsFormPK(long directorsFormId, long osiInsolvencyId) {
		this.directorsFormId = directorsFormId;
		this.osiInsolvencyId = osiInsolvencyId;
	}

	public long getDirectorsFormId() {
		return directorsFormId;
	}

	public void setDirectorsFormId(long directorsFormId) {
		this.directorsFormId = directorsFormId;
	}

	public long getOsiInsolvencyId() {
		return osiInsolvencyId;
	}

	public void setOsiInsolvencyId(long osiInsolvencyId) {
		this.osiInsolvencyId = osiInsolvencyId;
	}

	@Override
	public int compareTo(DirectorsFormPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (directorsFormId < pk.directorsFormId) {
			value = -1;
		}
		else if (directorsFormId > pk.directorsFormId) {
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

		if (!(object instanceof DirectorsFormPK)) {
			return false;
		}

		DirectorsFormPK pk = (DirectorsFormPK)object;

		if ((directorsFormId == pk.directorsFormId) &&
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

		hashCode = HashUtil.hash(hashCode, directorsFormId);
		hashCode = HashUtil.hash(hashCode, osiInsolvencyId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("directorsFormId=");

		sb.append(directorsFormId);
		sb.append(", osiInsolvencyId=");

		sb.append(osiInsolvencyId);

		sb.append("}");

		return sb.toString();
	}

}