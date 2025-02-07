/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FireBrigadeProEquipmentInfo service. Represents a row in the &quot;nbp_fire_pro_equipment_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeProEquipmentInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoImpl"
)
@ProviderType
public interface FireBrigadeProEquipmentInfo
	extends FireBrigadeProEquipmentInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FireBrigadeProEquipmentInfo, Long>
		FIRE_BRIGADE_PRO_EQUIPMENT_INFO_ID_ACCESSOR =
			new Accessor<FireBrigadeProEquipmentInfo, Long>() {

				@Override
				public Long get(
					FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

					return fireBrigadeProEquipmentInfo.
						getFireBrigadeProEquipmentInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FireBrigadeProEquipmentInfo> getTypeClass() {
					return FireBrigadeProEquipmentInfo.class;
				}

			};

}