/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ManuEquipmentAdd service. Represents a row in the &quot;nbp_manu_equipment_Add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentAddImpl"
)
@ProviderType
public interface ManuEquipmentAdd
	extends ManuEquipmentAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManuEquipmentAdd, Long>
		MANU_EQUIPMENT_ADD_ID_ACCESSOR =
			new Accessor<ManuEquipmentAdd, Long>() {

				@Override
				public Long get(ManuEquipmentAdd manuEquipmentAdd) {
					return manuEquipmentAdd.getManuEquipmentAddId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ManuEquipmentAdd> getTypeClass() {
					return ManuEquipmentAdd.class;
				}

			};

}