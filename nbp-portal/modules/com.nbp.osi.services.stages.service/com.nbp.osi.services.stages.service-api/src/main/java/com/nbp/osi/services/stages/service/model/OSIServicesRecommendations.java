/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OSIServicesRecommendations service. Represents a row in the &quot;nbp_osi_services_recommen&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendationsModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.stages.service.model.impl.OSIServicesRecommendationsImpl"
)
@ProviderType
public interface OSIServicesRecommendations
	extends OSIServicesRecommendationsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesRecommendationsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OSIServicesRecommendations, Long>
		O_SI_SERVICES_RECOMMENDATIONS_ID_ACCESSOR =
			new Accessor<OSIServicesRecommendations, Long>() {

				@Override
				public Long get(
					OSIServicesRecommendations osiServicesRecommendations) {

					return osiServicesRecommendations.
						getOSIServicesRecommendationsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OSIServicesRecommendations> getTypeClass() {
					return OSIServicesRecommendations.class;
				}

			};

}