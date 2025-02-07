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

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquirePropertyDetailsPK
	implements Comparable<AcquirePropertyDetailsPK>, Serializable {

	public long acquirePropertyDetailsId;
	

	public AcquirePropertyDetailsPK() {
	}

	public AcquirePropertyDetailsPK(
		long acquirePropertyDetailsId) {

		this.acquirePropertyDetailsId = acquirePropertyDetailsId;
		
	}




	public long getAcquirePropertyDetailsId() {
		return acquirePropertyDetailsId;
	}

	public void setAcquirePropertyDetailsId(long acquirePropertyDetailsId) {
		this.acquirePropertyDetailsId = acquirePropertyDetailsId;
	}

	@Override
	public int compareTo(AcquirePropertyDetailsPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (acquirePropertyDetailsId < pk.acquirePropertyDetailsId) {
			value = -1;
		}
		else if (acquirePropertyDetailsId > pk.acquirePropertyDetailsId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (acquirePropertyDetailsId < pk.acquirePropertyDetailsId) {
			value = -1;
		}
		else if (acquirePropertyDetailsId > pk.acquirePropertyDetailsId) {
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

		if (!(object instanceof AcquirePropertyDetailsPK)) {
			return false;
		}

		AcquirePropertyDetailsPK pk = (AcquirePropertyDetailsPK)object;

		if ((acquirePropertyDetailsId == pk.acquirePropertyDetailsId) &&
			(acquirePropertyDetailsId == pk.acquirePropertyDetailsId)) {

			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, acquirePropertyDetailsId);
		hashCode = HashUtil.hash(hashCode, acquirePropertyDetailsId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("acquirePropertyDetailsId=");

		sb.append(acquirePropertyDetailsId);
		sb.append(", acquirePropertyDetailsId=");

		sb.append(acquirePropertyDetailsId);

		sb.append("}");

		return sb.toString();
	}

}