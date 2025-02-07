/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FactoriesInspection service. Represents a row in the &quot;nbp_factories_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesInspectionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionImpl"
)
@ProviderType
public interface FactoriesInspection
	extends FactoriesInspectionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FactoriesInspection, Long>
		FACTORIES_INSPECTION_ID_ACCESSOR =
			new Accessor<FactoriesInspection, Long>() {

				@Override
				public Long get(FactoriesInspection factoriesInspection) {
					return factoriesInspection.getFactoriesInspectionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FactoriesInspection> getTypeClass() {
					return FactoriesInspection.class;
				}

			};

}