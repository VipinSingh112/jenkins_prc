/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AddMedicalPractitioner service. Represents a row in the &quot;nbp_hsra_medical_practitioner&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddMedicalPractitionerModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerImpl"
)
@ProviderType
public interface AddMedicalPractitioner
	extends AddMedicalPractitionerModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddMedicalPractitioner, Long>
		ADD_MEDICAL_PRACTITIONER_ID_ACCESSOR =
			new Accessor<AddMedicalPractitioner, Long>() {

				@Override
				public Long get(AddMedicalPractitioner addMedicalPractitioner) {
					return addMedicalPractitioner.getAddMedicalPractitionerId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddMedicalPractitioner> getTypeClass() {
					return AddMedicalPractitioner.class;
				}

			};

}