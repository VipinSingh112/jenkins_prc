/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormAddress;
import com.nbp.tourism.application.form.services.service.TourismBonaAccommodationFormAddressLocalServiceUtil;

/**
 * The extended model base implementation for the TourismBonaAccommodationFormAddress service. Represents a row in the &quot;nbp_tourism_boma_acco_faoo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaAccommodationFormAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddressImpl
 * @see TourismBonaAccommodationFormAddress
 * @generated
 */
public abstract class TourismBonaAccommodationFormAddressBaseImpl
	extends TourismBonaAccommodationFormAddressModelImpl
	implements TourismBonaAccommodationFormAddress {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona accommodation form address model instance should use the <code>TourismBonaAccommodationFormAddress</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TourismBonaAccommodationFormAddressLocalServiceUtil.
				addTourismBonaAccommodationFormAddress(this);
		}
		else {
			TourismBonaAccommodationFormAddressLocalServiceUtil.
				updateTourismBonaAccommodationFormAddress(this);
		}
	}

}