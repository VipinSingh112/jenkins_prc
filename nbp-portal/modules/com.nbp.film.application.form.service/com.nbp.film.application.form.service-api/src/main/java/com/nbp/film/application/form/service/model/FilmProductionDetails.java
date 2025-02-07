/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FilmProductionDetails service. Represents a row in the &quot;nbp_film_production_details&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FilmProductionDetailsModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.film.application.form.service.model.impl.FilmProductionDetailsImpl"
)
@ProviderType
public interface FilmProductionDetails
	extends FilmProductionDetailsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.film.application.form.service.model.impl.FilmProductionDetailsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FilmProductionDetails, Long>
		FILM_PRODUCTION_DETAILS_ID_ACCESSOR =
			new Accessor<FilmProductionDetails, Long>() {

				@Override
				public Long get(FilmProductionDetails filmProductionDetails) {
					return filmProductionDetails.getFilmProductionDetailsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FilmProductionDetails> getTypeClass() {
					return FilmProductionDetails.class;
				}

			};

}