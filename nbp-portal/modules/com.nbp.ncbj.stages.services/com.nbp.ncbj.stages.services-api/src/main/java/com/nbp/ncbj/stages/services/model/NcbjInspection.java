/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjInspection service. Represents a row in the &quot;nbp_ncbj_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.stages.services.model.impl.NcbjInspectionImpl"
)
@ProviderType
public interface NcbjInspection extends NcbjInspectionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.stages.services.model.impl.NcbjInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjInspection, Long>
		NCBJ_INSPECTION_ID_ACCESSOR = new Accessor<NcbjInspection, Long>() {

			@Override
			public Long get(NcbjInspection ncbjInspection) {
				return ncbjInspection.getNcbjInspectionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<NcbjInspection> getTypeClass() {
				return NcbjInspection.class;
			}

		};

}