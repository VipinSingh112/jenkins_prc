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
 * The extended model interface for the RadiationProtectionSecOne service. Represents a row in the &quot;nbp_hsra_rad_section_one&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationProtectionSecOneModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneImpl"
)
@ProviderType
public interface RadiationProtectionSecOne
	extends PersistedModel, RadiationProtectionSecOneModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RadiationProtectionSecOne, Long>
		RADIATION_PROTECT_SEC_ONE_ID_ACCESSOR =
			new Accessor<RadiationProtectionSecOne, Long>() {

				@Override
				public Long get(
					RadiationProtectionSecOne radiationProtectionSecOne) {

					return radiationProtectionSecOne.
						getRadiationProtectSecOneId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<RadiationProtectionSecOne> getTypeClass() {
					return RadiationProtectionSecOne.class;
				}

			};

}