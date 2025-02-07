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
 * The extended model interface for the AttractionTravelAgency service. Represents a row in the &quot;nbp_jtb_tarvel_agency&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelAgencyModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyImpl"
)
@ProviderType
public interface AttractionTravelAgency
	extends AttractionTravelAgencyModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AttractionTravelAgency, Long>
		ATTRACTION_TRAVEL_AGENCY_ID_ACCESSOR =
			new Accessor<AttractionTravelAgency, Long>() {

				@Override
				public Long get(AttractionTravelAgency attractionTravelAgency) {
					return attractionTravelAgency.getAttractionTravelAgencyId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AttractionTravelAgency> getTypeClass() {
					return AttractionTravelAgency.class;
				}

			};

}