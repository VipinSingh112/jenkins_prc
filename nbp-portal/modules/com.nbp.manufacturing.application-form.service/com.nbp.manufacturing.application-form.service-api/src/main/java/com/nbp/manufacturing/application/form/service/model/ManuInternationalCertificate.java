/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ManuInternationalCertificate service. Represents a row in the &quot;nbp_manu_inter_certificate&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificateModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateImpl"
)
@ProviderType
public interface ManuInternationalCertificate
	extends ManuInternationalCertificateModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManuInternationalCertificate, Long>
		MANU_INTERNATIONAL_CERTIFICATE_ID_ACCESSOR =
			new Accessor<ManuInternationalCertificate, Long>() {

				@Override
				public Long get(
					ManuInternationalCertificate manuInternationalCertificate) {

					return manuInternationalCertificate.
						getManuInternationalCertificateId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ManuInternationalCertificate> getTypeClass() {
					return ManuInternationalCertificate.class;
				}

			};

}