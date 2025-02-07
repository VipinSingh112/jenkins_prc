/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AgricultureInspection service. Represents a row in the &quot;nbp_agriculture_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionImpl"
)
@ProviderType
public interface AgricultureInspection
	extends AgricultureInspectionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgricultureInspection, Long>
		AGRICULTURE_INSPECTION_ID_ACCESSOR =
			new Accessor<AgricultureInspection, Long>() {

				@Override
				public Long get(AgricultureInspection agricultureInspection) {
					return agricultureInspection.getAgricultureInspectionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgricultureInspection> getTypeClass() {
					return AgricultureInspection.class;
				}

			};

}