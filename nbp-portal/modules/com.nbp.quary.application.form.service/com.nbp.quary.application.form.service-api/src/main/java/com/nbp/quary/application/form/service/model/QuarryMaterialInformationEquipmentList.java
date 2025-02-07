/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QuarryMaterialInformationEquipmentList service. Represents a row in the &quot;nbp_quarry_material_List_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryMaterialInformationEquipmentListModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListImpl"
)
@ProviderType
public interface QuarryMaterialInformationEquipmentList
	extends PersistedModel, QuarryMaterialInformationEquipmentListModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.quary.application.form.service.model.impl.QuarryMaterialInformationEquipmentListImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QuarryMaterialInformationEquipmentList, Long>
		MATERIAL_INFO_ID_ACCESSOR =
			new Accessor<QuarryMaterialInformationEquipmentList, Long>() {

				@Override
				public Long get(
					QuarryMaterialInformationEquipmentList
						quarryMaterialInformationEquipmentList) {

					return quarryMaterialInformationEquipmentList.
						getMaterialInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QuarryMaterialInformationEquipmentList>
					getTypeClass() {

					return QuarryMaterialInformationEquipmentList.class;
				}

			};

}