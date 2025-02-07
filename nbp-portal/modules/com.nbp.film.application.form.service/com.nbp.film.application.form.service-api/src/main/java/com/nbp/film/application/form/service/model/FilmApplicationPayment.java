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
 * The extended model interface for the FilmApplicationPayment service. Represents a row in the &quot;nbp_film_application_payment&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationPaymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentImpl"
)
@ProviderType
public interface FilmApplicationPayment
	extends FilmApplicationPaymentModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FilmApplicationPayment, Long>
		FILM_APPLICATION_PAYMENT_ID_ACCESSOR =
			new Accessor<FilmApplicationPayment, Long>() {

				@Override
				public Long get(FilmApplicationPayment filmApplicationPayment) {
					return filmApplicationPayment.getFilmApplicationPaymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FilmApplicationPayment> getTypeClass() {
					return FilmApplicationPayment.class;
				}

			};

}