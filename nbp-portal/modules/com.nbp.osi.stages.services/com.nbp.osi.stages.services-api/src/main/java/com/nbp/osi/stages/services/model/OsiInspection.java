/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OsiInspection service. Represents a row in the &quot;osi_application_inspec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.stages.services.model.impl.OsiInspectionImpl"
)
@ProviderType
public interface OsiInspection extends OsiInspectionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.stages.services.model.impl.OsiInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiInspection, Long>
		OSI_INSPECTION_ID_ACCESSOR = new Accessor<OsiInspection, Long>() {

			@Override
			public Long get(OsiInspection osiInspection) {
				return osiInspection.getOsiInspectionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OsiInspection> getTypeClass() {
				return OsiInspection.class;
			}

		};

}