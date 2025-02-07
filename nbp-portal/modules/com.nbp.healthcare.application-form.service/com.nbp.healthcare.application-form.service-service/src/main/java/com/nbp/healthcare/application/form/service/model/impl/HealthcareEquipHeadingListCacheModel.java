/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingList;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing HealthcareEquipHeadingList in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HealthcareEquipHeadingListCacheModel
	implements CacheModel<HealthcareEquipHeadingList>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthcareEquipHeadingListCacheModel)) {
			return false;
		}

		HealthcareEquipHeadingListCacheModel
			healthcareEquipHeadingListCacheModel =
				(HealthcareEquipHeadingListCacheModel)object;

		if (healthcareEquipHeadingListId ==
				healthcareEquipHeadingListCacheModel.
					healthcareEquipHeadingListId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, healthcareEquipHeadingListId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{healthcareEquipHeadingListId=");
		sb.append(healthcareEquipHeadingListId);
		sb.append(", healthcareDescription=");
		sb.append(healthcareDescription);
		sb.append(", healthcareHsHeading=");
		sb.append(healthcareHsHeading);
		sb.append(", healthcareSubHeading=");
		sb.append(healthcareSubHeading);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public HealthcareEquipHeadingList toEntityModel() {
		HealthcareEquipHeadingListImpl healthcareEquipHeadingListImpl =
			new HealthcareEquipHeadingListImpl();

		healthcareEquipHeadingListImpl.setHealthcareEquipHeadingListId(
			healthcareEquipHeadingListId);

		if (healthcareDescription == null) {
			healthcareEquipHeadingListImpl.setHealthcareDescription("");
		}
		else {
			healthcareEquipHeadingListImpl.setHealthcareDescription(
				healthcareDescription);
		}

		if (healthcareHsHeading == null) {
			healthcareEquipHeadingListImpl.setHealthcareHsHeading("");
		}
		else {
			healthcareEquipHeadingListImpl.setHealthcareHsHeading(
				healthcareHsHeading);
		}

		if (healthcareSubHeading == null) {
			healthcareEquipHeadingListImpl.setHealthcareSubHeading("");
		}
		else {
			healthcareEquipHeadingListImpl.setHealthcareSubHeading(
				healthcareSubHeading);
		}

		healthcareEquipHeadingListImpl.resetOriginalValues();

		return healthcareEquipHeadingListImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		healthcareEquipHeadingListId = objectInput.readLong();
		healthcareDescription = objectInput.readUTF();
		healthcareHsHeading = objectInput.readUTF();
		healthcareSubHeading = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(healthcareEquipHeadingListId);

		if (healthcareDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(healthcareDescription);
		}

		if (healthcareHsHeading == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(healthcareHsHeading);
		}

		if (healthcareSubHeading == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(healthcareSubHeading);
		}
	}

	public long healthcareEquipHeadingListId;
	public String healthcareDescription;
	public String healthcareHsHeading;
	public String healthcareSubHeading;

}