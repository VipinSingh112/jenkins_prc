/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthCareApplication service. Represents a row in the &quot;nbp_healthcare_application&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationImpl"
)
@ProviderType
public interface HealthCareApplication
	extends HealthCareApplicationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCareApplication, Long>
		HEALTH_CARE_APPLICATION_ID_ACCESSOR =
			new Accessor<HealthCareApplication, Long>() {

				@Override
				public Long get(HealthCareApplication healthCareApplication) {
					return healthCareApplication.getHealthCareApplicationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthCareApplication> getTypeClass() {
					return HealthCareApplication.class;
				}

			};

}