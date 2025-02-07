/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the PharmaApplicationFullLicense service. Represents a row in the &quot;nbp_pharma_full_license&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicenseModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseImpl"
)
@ProviderType
public interface PharmaApplicationFullLicense
	extends PersistedModel, PharmaApplicationFullLicenseModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationFullLicenseImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PharmaApplicationFullLicense, Long>
		PHARMA_FULL_LICENSE_ID_ACCESSOR =
			new Accessor<PharmaApplicationFullLicense, Long>() {

				@Override
				public Long get(
					PharmaApplicationFullLicense pharmaApplicationFullLicense) {

					return pharmaApplicationFullLicense.
						getPharmaFullLicenseId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<PharmaApplicationFullLicense> getTypeClass() {
					return PharmaApplicationFullLicense.class;
				}

			};

}