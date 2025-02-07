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
 * The extended model interface for the ManufacturingApplicationStages service. Represents a row in the &quot;nbp_manufacturing_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesImpl"
)
@ProviderType
public interface ManufacturingApplicationStages
	extends ManufacturingApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManufacturingApplicationStages, Long>
		MANUFACTURING_APP_STAGES_ID_ACCESSOR =
			new Accessor<ManufacturingApplicationStages, Long>() {

				@Override
				public Long get(
					ManufacturingApplicationStages
						manufacturingApplicationStages) {

					return manufacturingApplicationStages.
						getManufacturingAppStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ManufacturingApplicationStages> getTypeClass() {
					return ManufacturingApplicationStages.class;
				}

			};

}