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
 * The extended model interface for the HealthCareDescriptionOfService service. Represents a row in the &quot;nbp_healthcare_description&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfServiceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceImpl"
)
@ProviderType
public interface HealthCareDescriptionOfService
	extends HealthCareDescriptionOfServiceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCareDescriptionOfService, Long>
		HEALTH_CARE_DESCRIPTION_ID_ACCESSOR =
			new Accessor<HealthCareDescriptionOfService, Long>() {

				@Override
				public Long get(
					HealthCareDescriptionOfService
						healthCareDescriptionOfService) {

					return healthCareDescriptionOfService.
						getHealthCareDescriptionId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthCareDescriptionOfService> getTypeClass() {
					return HealthCareDescriptionOfService.class;
				}

			};

}