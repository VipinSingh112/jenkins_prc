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
 * The extended model interface for the MedicalCertificateIssuance service. Represents a row in the &quot;nbp_medical_licence_issu&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuanceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceImpl"
)
@ProviderType
public interface MedicalCertificateIssuance
	extends MedicalCertificateIssuanceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.medical.stages.service.model.impl.MedicalCertificateIssuanceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MedicalCertificateIssuance, Long>
		MEDICAL_CERTIFICATE_ISSUANCE_ID_ACCESSOR =
			new Accessor<MedicalCertificateIssuance, Long>() {

				@Override
				public Long get(
					MedicalCertificateIssuance medicalCertificateIssuance) {

					return medicalCertificateIssuance.
						getMedicalCertificateIssuanceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MedicalCertificateIssuance> getTypeClass() {
					return MedicalCertificateIssuance.class;
				}

			};

}