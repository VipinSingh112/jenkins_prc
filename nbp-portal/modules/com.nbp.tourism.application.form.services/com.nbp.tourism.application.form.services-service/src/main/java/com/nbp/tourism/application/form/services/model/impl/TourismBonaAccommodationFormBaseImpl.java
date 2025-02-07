/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationForm;
import com.nbp.tourism.application.form.services.service.TourismBonaAccommodationFormLocalServiceUtil;

/**
 * The extended model base implementation for the TourismBonaAccommodationForm service. Represents a row in the &quot;nbp_tourism_bona_af&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaAccommodationFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormImpl
 * @see TourismBonaAccommodationForm
 * @generated
 */
public abstract class TourismBonaAccommodationFormBaseImpl
	extends TourismBonaAccommodationFormModelImpl
	implements TourismBonaAccommodationForm {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona accommodation form model instance should use the <code>TourismBonaAccommodationForm</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TourismBonaAccommodationFormLocalServiceUtil.
				addTourismBonaAccommodationForm(this);
		}
		else {
			TourismBonaAccommodationFormLocalServiceUtil.
				updateTourismBonaAccommodationForm(this);
		}
	}

}