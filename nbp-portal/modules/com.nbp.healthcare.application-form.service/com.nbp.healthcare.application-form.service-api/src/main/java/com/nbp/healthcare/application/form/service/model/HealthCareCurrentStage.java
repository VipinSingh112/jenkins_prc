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
 * The extended model interface for the HealthCareCurrentStage service. Represents a row in the &quot;nbp_healthcare_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageImpl"
)
@ProviderType
public interface HealthCareCurrentStage
	extends HealthCareCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCareCurrentStage, Long>
		HEALTH_CARE_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<HealthCareCurrentStage, Long>() {

				@Override
				public Long get(HealthCareCurrentStage healthCareCurrentStage) {
					return healthCareCurrentStage.getHealthCareCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthCareCurrentStage> getTypeClass() {
					return HealthCareCurrentStage.class;
				}

			};

}