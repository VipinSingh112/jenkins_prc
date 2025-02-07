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
 * The extended model interface for the FilmApplicationRegister service. Represents a row in the &quot;nbp_film_register&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegisterModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.film.stages.services.model.impl.FilmApplicationRegisterImpl"
)
@ProviderType
public interface FilmApplicationRegister
	extends FilmApplicationRegisterModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.film.stages.services.model.impl.FilmApplicationRegisterImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FilmApplicationRegister, Long>
		FILM_APPLICATION_REGISTER_ID_ACCESSOR =
			new Accessor<FilmApplicationRegister, Long>() {

				@Override
				public Long get(
					FilmApplicationRegister filmApplicationRegister) {

					return filmApplicationRegister.
						getFilmApplicationRegisterId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FilmApplicationRegister> getTypeClass() {
					return FilmApplicationRegister.class;
				}

			};

}