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
 * The extended model interface for the AttractionCarRentalLicence service. Represents a row in the &quot;nbp_jtb_car_rental_licence&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentalLicenceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.AttractionCarRentalLicenceImpl"
)
@ProviderType
public interface AttractionCarRentalLicence
	extends AttractionCarRentalLicenceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.AttractionCarRentalLicenceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AttractionCarRentalLicence, Long>
		ATTRACTION_CAR_RENTAL_LIC_ID_ACCESSOR =
			new Accessor<AttractionCarRentalLicence, Long>() {

				@Override
				public Long get(
					AttractionCarRentalLicence attractionCarRentalLicence) {

					return attractionCarRentalLicence.
						getAttractionCarRentalLicId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AttractionCarRentalLicence> getTypeClass() {
					return AttractionCarRentalLicence.class;
				}

			};

	public String getNcrOfficeLoc1();

	public void setNcrOfficeLoc1(String ncrOfficeLoc);

}