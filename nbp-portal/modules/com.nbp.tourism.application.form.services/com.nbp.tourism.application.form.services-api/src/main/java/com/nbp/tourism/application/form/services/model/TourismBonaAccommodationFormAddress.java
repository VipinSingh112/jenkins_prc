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
 * The extended model interface for the TourismBonaAccommodationFormAddress service. Represents a row in the &quot;nbp_tourism_boma_acco_faoo&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddressModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressImpl"
)
@ProviderType
public interface TourismBonaAccommodationFormAddress
	extends PersistedModel, TourismBonaAccommodationFormAddressModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismBonaAccommodationFormAddress, Long>
		TOURISM_BONA_ACCOMMODATION_FAOO_ID_ACCESSOR =
			new Accessor<TourismBonaAccommodationFormAddress, Long>() {

				@Override
				public Long get(
					TourismBonaAccommodationFormAddress
						tourismBonaAccommodationFormAddress) {

					return tourismBonaAccommodationFormAddress.
						getTourismBonaAccommodationFAOOId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismBonaAccommodationFormAddress>
					getTypeClass() {

					return TourismBonaAccommodationFormAddress.class;
				}

			};

}