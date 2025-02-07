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
 * The extended model interface for the MedicalFacilitiesApp service. Represents a row in the &quot;nbp_medical_facilities_app&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppImpl"
)
@ProviderType
public interface MedicalFacilitiesApp
	extends MedicalFacilitiesAppModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MedicalFacilitiesApp, Long>
		MEDICAL_FACILITIES_APP_ID_ACCESSOR =
			new Accessor<MedicalFacilitiesApp, Long>() {

				@Override
				public Long get(MedicalFacilitiesApp medicalFacilitiesApp) {
					return medicalFacilitiesApp.getMedicalFacilitiesAppId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MedicalFacilitiesApp> getTypeClass() {
					return MedicalFacilitiesApp.class;
				}

			};

}