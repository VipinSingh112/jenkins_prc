/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the TourismBonaGroundTransBox service. Represents a row in the &quot;nbp_tourism_bona_ground_box&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBoxModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransBoxImpl"
)
@ProviderType
public interface TourismBonaGroundTransBox
	extends PersistedModel, TourismBonaGroundTransBoxModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransBoxImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismBonaGroundTransBox, Long>
		TOURISM_VEHICLE_BOX_BONA_ID_ACCESSOR =
			new Accessor<TourismBonaGroundTransBox, Long>() {

				@Override
				public Long get(
					TourismBonaGroundTransBox tourismBonaGroundTransBox) {

					return tourismBonaGroundTransBox.
						getTourismVehicleBoxBonaId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismBonaGroundTransBox> getTypeClass() {
					return TourismBonaGroundTransBox.class;
				}

			};

}