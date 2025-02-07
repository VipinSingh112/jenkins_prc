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
 * The extended model interface for the TourismNewAccoGeneralForm service. Represents a row in the &quot;nbp_tourism_new_acco_gerneral&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralFormModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismNewAccoGeneralFormImpl"
)
@ProviderType
public interface TourismNewAccoGeneralForm
	extends PersistedModel, TourismNewAccoGeneralFormModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoGeneralFormImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismNewAccoGeneralForm, Long>
		TOURISM_NEW_ACCO_GEN_FORM_ID_ACCESSOR =
			new Accessor<TourismNewAccoGeneralForm, Long>() {

				@Override
				public Long get(
					TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

					return tourismNewAccoGeneralForm.
						getTourismNewAccoGenFormId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismNewAccoGeneralForm> getTypeClass() {
					return TourismNewAccoGeneralForm.class;
				}

			};

}