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
 * The extended model interface for the TourismNewAttractionFormFirst service. Represents a row in the &quot;nbp_tourism_new_attraction_ff&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstImpl"
)
@ProviderType
public interface TourismNewAttractionFormFirst
	extends PersistedModel, TourismNewAttractionFormFirstModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismNewAttractionFormFirst, Long>
		TOURISM_NEW_ATTRACT_FORM_FIRST_ID_ACCESSOR =
			new Accessor<TourismNewAttractionFormFirst, Long>() {

				@Override
				public Long get(
					TourismNewAttractionFormFirst
						tourismNewAttractionFormFirst) {

					return tourismNewAttractionFormFirst.
						getTourismNewAttractFormFirstId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismNewAttractionFormFirst> getTypeClass() {
					return TourismNewAttractionFormFirst.class;
				}

			};

}