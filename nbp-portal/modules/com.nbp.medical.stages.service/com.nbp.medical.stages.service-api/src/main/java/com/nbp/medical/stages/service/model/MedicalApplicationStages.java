/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MedicalApplicationStages service. Represents a row in the &quot;nbp_medical_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesImpl"
)
@ProviderType
public interface MedicalApplicationStages
	extends MedicalApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MedicalApplicationStages, Long>
		MEDICAL_STAGES_ID_ACCESSOR =
			new Accessor<MedicalApplicationStages, Long>() {

				@Override
				public Long get(
					MedicalApplicationStages medicalApplicationStages) {

					return medicalApplicationStages.getMedicalStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MedicalApplicationStages> getTypeClass() {
					return MedicalApplicationStages.class;
				}

			};

}