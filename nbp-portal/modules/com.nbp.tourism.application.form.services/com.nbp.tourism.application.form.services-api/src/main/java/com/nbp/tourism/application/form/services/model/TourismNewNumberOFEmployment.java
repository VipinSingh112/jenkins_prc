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
 * The extended model interface for the TourismNewNumberOFEmployment service. Represents a row in the &quot;nbp_tourism_new_acco_employe&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmploymentModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentImpl"
)
@ProviderType
public interface TourismNewNumberOFEmployment
	extends PersistedModel, TourismNewNumberOFEmploymentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismNewNumberOFEmployment, Long>
		TOURISM_NEW_NUMBER_OF_EMPLOYMENT_ID_ACCESSOR =
			new Accessor<TourismNewNumberOFEmployment, Long>() {

				@Override
				public Long get(
					TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

					return tourismNewNumberOFEmployment.
						getTourismNewNumberOFEmploymentId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismNewNumberOFEmployment> getTypeClass() {
					return TourismNewNumberOFEmployment.class;
				}

			};

}