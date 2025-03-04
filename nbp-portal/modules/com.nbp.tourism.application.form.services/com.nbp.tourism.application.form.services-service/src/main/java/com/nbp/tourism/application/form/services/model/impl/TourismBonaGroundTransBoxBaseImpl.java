/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBox;
import com.nbp.tourism.application.form.services.service.TourismBonaGroundTransBoxLocalServiceUtil;

/**
 * The extended model base implementation for the TourismBonaGroundTransBox service. Represents a row in the &quot;nbp_tourism_bona_ground_box&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaGroundTransBoxImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBoxImpl
 * @see TourismBonaGroundTransBox
 * @generated
 */
public abstract class TourismBonaGroundTransBoxBaseImpl
	extends TourismBonaGroundTransBoxModelImpl
	implements TourismBonaGroundTransBox {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona ground trans box model instance should use the <code>TourismBonaGroundTransBox</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TourismBonaGroundTransBoxLocalServiceUtil.
				addTourismBonaGroundTransBox(this);
		}
		else {
			TourismBonaGroundTransBoxLocalServiceUtil.
				updateTourismBonaGroundTransBox(this);
		}
	}

}