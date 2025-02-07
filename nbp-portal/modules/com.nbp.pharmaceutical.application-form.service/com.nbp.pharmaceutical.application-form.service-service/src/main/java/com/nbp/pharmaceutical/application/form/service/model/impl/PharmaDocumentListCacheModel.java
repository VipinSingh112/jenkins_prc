/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing PharmaDocumentList in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PharmaDocumentListCacheModel
	implements CacheModel<PharmaDocumentList>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PharmaDocumentListCacheModel)) {
			return false;
		}

		PharmaDocumentListCacheModel pharmaDocumentListCacheModel =
			(PharmaDocumentListCacheModel)object;

		if (pharmaDocListId == pharmaDocumentListCacheModel.pharmaDocListId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pharmaDocListId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{pharmaDocListId=");
		sb.append(pharmaDocListId);
		sb.append(", pharmaAppType=");
		sb.append(pharmaAppType);
		sb.append(", pharmaDocList=");
		sb.append(pharmaDocList);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PharmaDocumentList toEntityModel() {
		PharmaDocumentListImpl pharmaDocumentListImpl =
			new PharmaDocumentListImpl();

		pharmaDocumentListImpl.setPharmaDocListId(pharmaDocListId);

		if (pharmaAppType == null) {
			pharmaDocumentListImpl.setPharmaAppType("");
		}
		else {
			pharmaDocumentListImpl.setPharmaAppType(pharmaAppType);
		}

		if (pharmaDocList == null) {
			pharmaDocumentListImpl.setPharmaDocList("");
		}
		else {
			pharmaDocumentListImpl.setPharmaDocList(pharmaDocList);
		}

		pharmaDocumentListImpl.resetOriginalValues();

		return pharmaDocumentListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pharmaDocListId = objectInput.readLong();
		pharmaAppType = objectInput.readUTF();
		pharmaDocList = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(pharmaDocListId);

		if (pharmaAppType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaAppType);
		}

		if (pharmaDocList == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pharmaDocList);
		}
	}

	public long pharmaDocListId;
	public String pharmaAppType;
	public String pharmaDocList;

}