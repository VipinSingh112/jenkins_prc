/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthcareEquipHeadingList service. Represents a row in the &quot;nbp_health_equip_heading_list&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingListModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListImpl"
)
@ProviderType
public interface HealthcareEquipHeadingList
	extends HealthcareEquipHeadingListModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthcareEquipHeadingList, Long>
		HEALTHCARE_EQUIP_HEADING_LIST_ID_ACCESSOR =
			new Accessor<HealthcareEquipHeadingList, Long>() {

				@Override
				public Long get(
					HealthcareEquipHeadingList healthcareEquipHeadingList) {

					return healthcareEquipHeadingList.
						getHealthcareEquipHeadingListId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthcareEquipHeadingList> getTypeClass() {
					return HealthcareEquipHeadingList.class;
				}

			};

}