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
 * The extended model interface for the TourismNewAttractionFormSecond service. Represents a row in the &quot;nbp_tourism_new_attraction_fs&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecondModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondImpl"
)
@ProviderType
public interface TourismNewAttractionFormSecond
	extends PersistedModel, TourismNewAttractionFormSecondModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismNewAttractionFormSecond, Long>
		TOURISM_NEW_ATTRACTION_FORM_SEC_ID_ACCESSOR =
			new Accessor<TourismNewAttractionFormSecond, Long>() {

				@Override
				public Long get(
					TourismNewAttractionFormSecond
						tourismNewAttractionFormSecond) {

					return tourismNewAttractionFormSecond.
						getTourismNewAttractionFormSecId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismNewAttractionFormSecond> getTypeClass() {
					return TourismNewAttractionFormSecond.class;
				}

			};

}