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
 * The extended model interface for the TourismBonaAttractionFormFirstAddress service. Represents a row in the &quot;nbp_tourism_bona_attract_ffa&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstAddressModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstAddressImpl"
)
@ProviderType
public interface TourismBonaAttractionFormFirstAddress
	extends PersistedModel, TourismBonaAttractionFormFirstAddressModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstAddressImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismBonaAttractionFormFirstAddress, Long>
		TOURISM_BONA_ATTRACTION_FFAOO_ID_ACCESSOR =
			new Accessor<TourismBonaAttractionFormFirstAddress, Long>() {

				@Override
				public Long get(
					TourismBonaAttractionFormFirstAddress
						tourismBonaAttractionFormFirstAddress) {

					return tourismBonaAttractionFormFirstAddress.
						getTourismBonaAttractionFFAOOId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismBonaAttractionFormFirstAddress>
					getTypeClass() {

					return TourismBonaAttractionFormFirstAddress.class;
				}

			};

}