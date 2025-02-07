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
 * The extended model interface for the TourismBonaAccommodationForm service. Represents a row in the &quot;nbp_tourism_bona_af&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormImpl"
)
@ProviderType
public interface TourismBonaAccommodationForm
	extends PersistedModel, TourismBonaAccommodationFormModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismBonaAccommodationForm, Long>
		TOURISM_BONA_AF_ID_ACCESSOR =
			new Accessor<TourismBonaAccommodationForm, Long>() {

				@Override
				public Long get(
					TourismBonaAccommodationForm tourismBonaAccommodationForm) {

					return tourismBonaAccommodationForm.getTourismBonaAFId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismBonaAccommodationForm> getTypeClass() {
					return TourismBonaAccommodationForm.class;
				}

			};

}