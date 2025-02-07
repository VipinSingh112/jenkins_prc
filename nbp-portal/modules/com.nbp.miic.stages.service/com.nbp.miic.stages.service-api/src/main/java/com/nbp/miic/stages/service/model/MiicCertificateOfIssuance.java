/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the MiicCertificateOfIssuance service. Represents a row in the &quot;nbp_miic_certificate_of_issuan&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuanceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceImpl"
)
@ProviderType
public interface MiicCertificateOfIssuance
	extends MiicCertificateOfIssuanceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MiicCertificateOfIssuance, Long>
		MIIC_CERTIFICATE_OF_ISSUANCE_ID_ACCESSOR =
			new Accessor<MiicCertificateOfIssuance, Long>() {

				@Override
				public Long get(
					MiicCertificateOfIssuance miicCertificateOfIssuance) {

					return miicCertificateOfIssuance.
						getMiicCertificateOfIssuanceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<MiicCertificateOfIssuance> getTypeClass() {
					return MiicCertificateOfIssuance.class;
				}

			};

}