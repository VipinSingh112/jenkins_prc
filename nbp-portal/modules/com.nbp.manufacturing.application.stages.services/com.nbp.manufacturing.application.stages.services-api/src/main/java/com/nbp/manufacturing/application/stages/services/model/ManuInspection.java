/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ManuInspection service. Represents a row in the &quot;nbp_manufacturing_inspec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionImpl"
)
@ProviderType
public interface ManuInspection extends ManuInspectionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManuInspection, Long>
		MANU_INSPECTION_ID_ACCESSOR = new Accessor<ManuInspection, Long>() {

			@Override
			public Long get(ManuInspection manuInspection) {
				return manuInspection.getManuInspectionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ManuInspection> getTypeClass() {
				return ManuInspection.class;
			}

		};

}