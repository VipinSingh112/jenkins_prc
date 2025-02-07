/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.acquire.application.form.service.model.AcquireDocumentList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AcquireDocumentList in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AcquireDocumentListCacheModel
	implements CacheModel<AcquireDocumentList>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireDocumentListCacheModel)) {
			return false;
		}

		AcquireDocumentListCacheModel acquireDocumentListCacheModel =
			(AcquireDocumentListCacheModel)object;

		if (acquireDocumentListId ==
				acquireDocumentListCacheModel.acquireDocumentListId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, acquireDocumentListId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{acquireDocumentListId=");
		sb.append(acquireDocumentListId);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AcquireDocumentList toEntityModel() {
		AcquireDocumentListImpl acquireDocumentListImpl =
			new AcquireDocumentListImpl();

		acquireDocumentListImpl.setAcquireDocumentListId(acquireDocumentListId);

		if (documentType == null) {
			acquireDocumentListImpl.setDocumentType("");
		}
		else {
			acquireDocumentListImpl.setDocumentType(documentType);
		}

		if (documentName == null) {
			acquireDocumentListImpl.setDocumentName("");
		}
		else {
			acquireDocumentListImpl.setDocumentName(documentName);
		}

		acquireDocumentListImpl.resetOriginalValues();

		return acquireDocumentListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		acquireDocumentListId = objectInput.readLong();
		documentType = objectInput.readUTF();
		documentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(acquireDocumentListId);

		if (documentType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentType);
		}

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}
	}

	public long acquireDocumentListId;
	public String documentType;
	public String documentName;

}