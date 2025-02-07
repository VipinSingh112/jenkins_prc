/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AccoNonHotelRequiredLic service. Represents a row in the &quot;nbp_jtb_non_hotel_req_lic&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLicModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicImpl"
)
@ProviderType
public interface AccoNonHotelRequiredLic
	extends AccoNonHotelRequiredLicModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AccoNonHotelRequiredLic, Long>
		ACCO_NON_HOTEL_REQUIRED_LIC_ID_ACCESSOR =
			new Accessor<AccoNonHotelRequiredLic, Long>() {

				@Override
				public Long get(
					AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

					return accoNonHotelRequiredLic.
						getAccoNonHotelRequiredLicId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AccoNonHotelRequiredLic> getTypeClass() {
					return AccoNonHotelRequiredLic.class;
				}

			};

}