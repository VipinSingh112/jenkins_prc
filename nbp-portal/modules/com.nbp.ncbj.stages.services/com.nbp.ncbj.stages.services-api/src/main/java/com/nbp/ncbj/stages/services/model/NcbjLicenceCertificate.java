/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the NcbjLicenceCertificate service. Represents a row in the &quot;nbp_ncbj_licence_certificate&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificateModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateImpl"
)
@ProviderType
public interface NcbjLicenceCertificate
	extends NcbjLicenceCertificateModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NcbjLicenceCertificate, Long>
		NCBJ_LICENCE_CERTIFICATE_ID_ACCESSOR =
			new Accessor<NcbjLicenceCertificate, Long>() {

				@Override
				public Long get(NcbjLicenceCertificate ncbjLicenceCertificate) {
					return ncbjLicenceCertificate.getNcbjLicenceCertificateId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<NcbjLicenceCertificate> getTypeClass() {
					return NcbjLicenceCertificate.class;
				}

			};

}