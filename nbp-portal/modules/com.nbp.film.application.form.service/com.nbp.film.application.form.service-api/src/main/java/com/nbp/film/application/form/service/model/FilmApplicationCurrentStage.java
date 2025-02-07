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
 * The extended model interface for the FilmApplicationCurrentStage service. Represents a row in the &quot;nbp_film_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationCurrentStageModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageImpl"
)
@ProviderType
public interface FilmApplicationCurrentStage
	extends FilmApplicationCurrentStageModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FilmApplicationCurrentStage, Long>
		FILM_APPLICATION_CURRENT_STAGE_ID_ACCESSOR =
			new Accessor<FilmApplicationCurrentStage, Long>() {

				@Override
				public Long get(
					FilmApplicationCurrentStage filmApplicationCurrentStage) {

					return filmApplicationCurrentStage.
						getFilmApplicationCurrentStageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FilmApplicationCurrentStage> getTypeClass() {
					return FilmApplicationCurrentStage.class;
				}

			};

}