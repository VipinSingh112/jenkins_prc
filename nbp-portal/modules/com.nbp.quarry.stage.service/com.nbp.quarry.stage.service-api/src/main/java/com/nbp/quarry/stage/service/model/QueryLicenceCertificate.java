/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the QueryLicenceCertificate service. Represents a row in the &quot;nbp_quarry_licence_certificate&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificateModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateImpl"
)
@ProviderType
public interface QueryLicenceCertificate
	extends PersistedModel, QueryLicenceCertificateModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<QueryLicenceCertificate, Long>
		QUERY_LICENCE_CERTIFICATE_ID_ACCESSOR =
			new Accessor<QueryLicenceCertificate, Long>() {

				@Override
				public Long get(
					QueryLicenceCertificate queryLicenceCertificate) {

					return queryLicenceCertificate.
						getQueryLicenceCertificateId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<QueryLicenceCertificate> getTypeClass() {
					return QueryLicenceCertificate.class;
				}

			};

}