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
 * The extended model interface for the OSIServicesStages service. Represents a row in the &quot;nbp_osi_services_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesImpl"
)
@ProviderType
public interface OSIServicesStages
	extends OSIServicesStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OSIServicesStages, Long>
		OSI_SERVICES_STAGES_ID_ACCESSOR =
			new Accessor<OSIServicesStages, Long>() {

				@Override
				public Long get(OSIServicesStages osiServicesStages) {
					return osiServicesStages.getOsiServicesStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OSIServicesStages> getTypeClass() {
					return OSIServicesStages.class;
				}

			};

}