/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the SezConsultancyInspection service. Represents a row in the &quot;nbp_sez_consultancy_service&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.sez.status.application.form.service.model.impl.SezConsultancyInspectionImpl"
)
@ProviderType
public interface SezConsultancyInspection
	extends PersistedModel, SezConsultancyInspectionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.sez.status.application.form.service.model.impl.SezConsultancyInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<SezConsultancyInspection, Long>
		SEZ_CONSULTANCY_INSPECTION_ID_ACCESSOR =
			new Accessor<SezConsultancyInspection, Long>() {

				@Override
				public Long get(
					SezConsultancyInspection sezConsultancyInspection) {

					return sezConsultancyInspection.
						getSezConsultancyInspectionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<SezConsultancyInspection> getTypeClass() {
					return SezConsultancyInspection.class;
				}

			};

}