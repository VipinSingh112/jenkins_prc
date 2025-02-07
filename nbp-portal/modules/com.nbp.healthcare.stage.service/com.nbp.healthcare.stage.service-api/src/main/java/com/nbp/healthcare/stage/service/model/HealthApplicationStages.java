/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthApplicationStages service. Represents a row in the &quot;nbp_healthcare_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesImpl"
)
@ProviderType
public interface HealthApplicationStages
	extends HealthApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthApplicationStages, Long>
		HEALTH_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<HealthApplicationStages, Long>() {

				@Override
				public Long get(
					HealthApplicationStages healthApplicationStages) {

					return healthApplicationStages.
						getHealthApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthApplicationStages> getTypeClass() {
					return HealthApplicationStages.class;
				}

			};

}