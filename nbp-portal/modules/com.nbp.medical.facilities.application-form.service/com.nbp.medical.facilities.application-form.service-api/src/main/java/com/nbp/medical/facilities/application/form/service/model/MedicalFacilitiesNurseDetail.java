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
 * The extended model interface for the MedicalFacilitiesNurseDetail service. Represents a row in the &quot;nbp_medical_nurse_detail&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetailModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailImpl"
)
@ProviderType
public interface MedicalFacilitiesNurseDetail
	extends MedicalFacilitiesNurseDetailModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MedicalFacilitiesNurseDetail, Long>
		MEDICAL_FACILITIES_NURSE_DETAIL_ID_ACCESSOR =
			new Accessor<MedicalFacilitiesNurseDetail, Long>() {

				@Override
				public Long get(
					MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

					return medicalFacilitiesNurseDetail.
						getMedicalFacilitiesNurseDetailId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MedicalFacilitiesNurseDetail> getTypeClass() {
					return MedicalFacilitiesNurseDetail.class;
				}

			};

}