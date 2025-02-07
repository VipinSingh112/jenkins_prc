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
 * The extended model interface for the TourismBonaAttractionFormFirst service. Represents a row in the &quot;nbp_tourism_bona_attraction_ff&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstImpl"
)
@ProviderType
public interface TourismBonaAttractionFormFirst
	extends PersistedModel, TourismBonaAttractionFormFirstModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismBonaAttractionFormFirst, Long>
		TOURISM_BONA_ATTRACT_FORM_FIRST_ID_ACCESSOR =
			new Accessor<TourismBonaAttractionFormFirst, Long>() {

				@Override
				public Long get(
					TourismBonaAttractionFormFirst
						tourismBonaAttractionFormFirst) {

					return tourismBonaAttractionFormFirst.
						getTourismBonaAttractFormFirstId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismBonaAttractionFormFirst> getTypeClass() {
					return TourismBonaAttractionFormFirst.class;
				}

			};

}