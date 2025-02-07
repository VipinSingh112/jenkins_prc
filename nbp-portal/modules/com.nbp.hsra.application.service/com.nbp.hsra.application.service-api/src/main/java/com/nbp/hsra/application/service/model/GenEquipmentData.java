/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the GenEquipmentData service. Represents a row in the &quot;nbp_hsra_equipment_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see GenEquipmentDataModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.GenEquipmentDataImpl"
)
@ProviderType
public interface GenEquipmentData
	extends GenEquipmentDataModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.GenEquipmentDataImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<GenEquipmentData, Long>
		GEN_EQUIPMENT_DATA_ID_ACCESSOR =
			new Accessor<GenEquipmentData, Long>() {

				@Override
				public Long get(GenEquipmentData genEquipmentData) {
					return genEquipmentData.getGenEquipmentDataId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<GenEquipmentData> getTypeClass() {
					return GenEquipmentData.class;
				}

			};

}