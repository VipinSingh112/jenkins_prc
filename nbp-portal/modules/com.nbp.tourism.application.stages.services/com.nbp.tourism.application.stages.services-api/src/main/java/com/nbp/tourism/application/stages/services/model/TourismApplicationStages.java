/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the TourismApplicationStages service. Represents a row in the &quot;nbp_tourism_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesImpl"
)
@ProviderType
public interface TourismApplicationStages
	extends PersistedModel, TourismApplicationStagesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismApplicationStages, Long>
		TOURISM_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<TourismApplicationStages, Long>() {

				@Override
				public Long get(
					TourismApplicationStages tourismApplicationStages) {

					return tourismApplicationStages.
						getTourismApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismApplicationStages> getTypeClass() {
					return TourismApplicationStages.class;
				}

			};

}