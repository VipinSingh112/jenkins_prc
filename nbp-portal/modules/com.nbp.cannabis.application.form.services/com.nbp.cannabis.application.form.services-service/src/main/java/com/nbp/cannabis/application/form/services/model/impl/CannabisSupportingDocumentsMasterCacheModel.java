/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.cannabis.application.form.services.model.CannabisSupportingDocumentsMaster;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CannabisSupportingDocumentsMaster in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CannabisSupportingDocumentsMasterCacheModel
	implements CacheModel<CannabisSupportingDocumentsMaster>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CannabisSupportingDocumentsMasterCacheModel)) {
			return false;
		}

		CannabisSupportingDocumentsMasterCacheModel
			cannabisSupportingDocumentsMasterCacheModel =
				(CannabisSupportingDocumentsMasterCacheModel)object;

		if (cannabisSupportingDocMasterId ==
				cannabisSupportingDocumentsMasterCacheModel.
					cannabisSupportingDocMasterId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cannabisSupportingDocMasterId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{cannabisSupportingDocMasterId=");
		sb.append(cannabisSupportingDocMasterId);
		sb.append(", applicationType=");
		sb.append(applicationType);
		sb.append(", documentTye=");
		sb.append(documentTye);
		sb.append(", landType=");
		sb.append(landType);
		sb.append(", userType=");
		sb.append(userType);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CannabisSupportingDocumentsMaster toEntityModel() {
		CannabisSupportingDocumentsMasterImpl
			cannabisSupportingDocumentsMasterImpl =
				new CannabisSupportingDocumentsMasterImpl();

		cannabisSupportingDocumentsMasterImpl.setCannabisSupportingDocMasterId(
			cannabisSupportingDocMasterId);

		if (applicationType == null) {
			cannabisSupportingDocumentsMasterImpl.setApplicationType("");
		}
		else {
			cannabisSupportingDocumentsMasterImpl.setApplicationType(
				applicationType);
		}

		if (documentTye == null) {
			cannabisSupportingDocumentsMasterImpl.setDocumentTye("");
		}
		else {
			cannabisSupportingDocumentsMasterImpl.setDocumentTye(documentTye);
		}

		if (landType == null) {
			cannabisSupportingDocumentsMasterImpl.setLandType("");
		}
		else {
			cannabisSupportingDocumentsMasterImpl.setLandType(landType);
		}

		if (userType == null) {
			cannabisSupportingDocumentsMasterImpl.setUserType("");
		}
		else {
			cannabisSupportingDocumentsMasterImpl.setUserType(userType);
		}

		if (documentName == null) {
			cannabisSupportingDocumentsMasterImpl.setDocumentName("");
		}
		else {
			cannabisSupportingDocumentsMasterImpl.setDocumentName(documentName);
		}

		if (remarks == null) {
			cannabisSupportingDocumentsMasterImpl.setRemarks("");
		}
		else {
			cannabisSupportingDocumentsMasterImpl.setRemarks(remarks);
		}

		if (status == null) {
			cannabisSupportingDocumentsMasterImpl.setStatus("");
		}
		else {
			cannabisSupportingDocumentsMasterImpl.setStatus(status);
		}

		cannabisSupportingDocumentsMasterImpl.resetOriginalValues();

		return cannabisSupportingDocumentsMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cannabisSupportingDocMasterId = objectInput.readLong();
		applicationType = objectInput.readUTF();
		documentTye = objectInput.readUTF();
		landType = objectInput.readUTF();
		userType = objectInput.readUTF();
		documentName = objectInput.readUTF();
		remarks = objectInput.readUTF();
		status = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(cannabisSupportingDocMasterId);

		if (applicationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicationType);
		}

		if (documentTye == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentTye);
		}

		if (landType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landType);
		}

		if (userType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userType);
		}

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public long cannabisSupportingDocMasterId;
	public String applicationType;
	public String documentTye;
	public String landType;
	public String userType;
	public String documentName;
	public String remarks;
	public String status;

}