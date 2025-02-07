/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FilmApplicationStages service. Represents a row in the &quot;nbp_film_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.film.stages.services.model.impl.FilmApplicationStagesImpl"
)
@ProviderType
public interface FilmApplicationStages
	extends FilmApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.film.stages.services.model.impl.FilmApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FilmApplicationStages, Long>
		FILM_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<FilmApplicationStages, Long>() {

				@Override
				public Long get(FilmApplicationStages filmApplicationStages) {
					return filmApplicationStages.getFilmApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FilmApplicationStages> getTypeClass() {
					return FilmApplicationStages.class;
				}

			};

}