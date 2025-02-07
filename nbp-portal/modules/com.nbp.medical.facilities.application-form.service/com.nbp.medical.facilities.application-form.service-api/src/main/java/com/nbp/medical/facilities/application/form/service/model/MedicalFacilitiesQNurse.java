/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MedicalFacilitiesQNurse service. Represents a row in the &quot;nbp_medical_nurse_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesQNurseModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesQNurseImpl"
)
@ProviderType
public interface MedicalFacilitiesQNurse
	extends MedicalFacilitiesQNurseModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesQNurseImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MedicalFacilitiesQNurse, Long>
		MEDICAL_FACILITIES_Q_NURSE_ID_ACCESSOR =
			new Accessor<MedicalFacilitiesQNurse, Long>() {

				@Override
				public Long get(
					MedicalFacilitiesQNurse medicalFacilitiesQNurse) {

					return medicalFacilitiesQNurse.
						getMedicalFacilitiesQNurseId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MedicalFacilitiesQNurse> getTypeClass() {
					return MedicalFacilitiesQNurse.class;
				}

			};

}