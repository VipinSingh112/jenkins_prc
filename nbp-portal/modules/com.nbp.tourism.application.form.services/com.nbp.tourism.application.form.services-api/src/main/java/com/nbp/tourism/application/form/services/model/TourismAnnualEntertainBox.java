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
 * The extended model interface for the TourismAnnualEntertainBox service. Represents a row in the &quot;nbp_tourism_enter_box_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBoxModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismAnnualEntertainBoxImpl"
)
@ProviderType
public interface TourismAnnualEntertainBox
	extends PersistedModel, TourismAnnualEntertainBoxModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismAnnualEntertainBoxImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismAnnualEntertainBox, Long>
		TOURISM_ANNUAL_ENTERTAIN_BOX_ID_ACCESSOR =
			new Accessor<TourismAnnualEntertainBox, Long>() {

				@Override
				public Long get(
					TourismAnnualEntertainBox tourismAnnualEntertainBox) {

					return tourismAnnualEntertainBox.
						getTourismAnnualEntertainBoxId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismAnnualEntertainBox> getTypeClass() {
					return TourismAnnualEntertainBox.class;
				}

			};

}