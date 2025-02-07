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
 * The extended model interface for the GenerateEquipmentInfo service. Represents a row in the &quot;nbp_hsra_noti_gen_equip&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see GenerateEquipmentInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.GenerateEquipmentInfoImpl"
)
@ProviderType
public interface GenerateEquipmentInfo
	extends GenerateEquipmentInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.GenerateEquipmentInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<GenerateEquipmentInfo, Long>
		GENERATE_EQUIPMENT_INFO_ID_ACCESSOR =
			new Accessor<GenerateEquipmentInfo, Long>() {

				@Override
				public Long get(GenerateEquipmentInfo generateEquipmentInfo) {
					return generateEquipmentInfo.getGenerateEquipmentInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<GenerateEquipmentInfo> getTypeClass() {
					return GenerateEquipmentInfo.class;
				}

			};

}