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
 * The extended model interface for the MedicalNurseStaffPremises service. Represents a row in the &quot;nbp_medical_staff_premises&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremisesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesImpl"
)
@ProviderType
public interface MedicalNurseStaffPremises
	extends MedicalNurseStaffPremisesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MedicalNurseStaffPremises, Long>
		MEDICAL_NURSE_STAFF_PREMISES_ID_ACCESSOR =
			new Accessor<MedicalNurseStaffPremises, Long>() {

				@Override
				public Long get(
					MedicalNurseStaffPremises medicalNurseStaffPremises) {

					return medicalNurseStaffPremises.
						getMedicalNurseStaffPremisesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MedicalNurseStaffPremises> getTypeClass() {
					return MedicalNurseStaffPremises.class;
				}

			};

}