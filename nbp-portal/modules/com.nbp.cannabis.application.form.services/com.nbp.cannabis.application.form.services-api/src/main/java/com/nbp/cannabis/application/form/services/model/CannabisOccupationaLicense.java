/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CannabisOccupationaLicense service. Represents a row in the &quot;nbp_cannabis_occ_license&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicenseModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseImpl"
)
@ProviderType
public interface CannabisOccupationaLicense
	extends CannabisOccupationaLicenseModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.cannabis.application.form.services.model.impl.CannabisOccupationaLicenseImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisOccupationaLicense, Long>
		CANNABIS_OCCUPATIONA_LICENSE_ID_ACCESSOR =
			new Accessor<CannabisOccupationaLicense, Long>() {

				@Override
				public Long get(
					CannabisOccupationaLicense cannabisOccupationaLicense) {

					return cannabisOccupationaLicense.
						getCannabisOccupationaLicenseId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisOccupationaLicense> getTypeClass() {
					return CannabisOccupationaLicense.class;
				}

			};

}