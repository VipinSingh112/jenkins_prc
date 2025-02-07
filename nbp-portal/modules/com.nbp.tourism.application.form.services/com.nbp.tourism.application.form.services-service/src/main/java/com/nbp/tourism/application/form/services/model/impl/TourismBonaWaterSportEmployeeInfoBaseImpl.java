/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportEmployeeInfo;
import com.nbp.tourism.application.form.services.service.TourismBonaWaterSportEmployeeInfoLocalServiceUtil;

/**
 * The extended model base implementation for the TourismBonaWaterSportEmployeeInfo service. Represents a row in the &quot;nbp_tourism_bona_water_emp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaWaterSportEmployeeInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportEmployeeInfoImpl
 * @see TourismBonaWaterSportEmployeeInfo
 * @generated
 */
public abstract class TourismBonaWaterSportEmployeeInfoBaseImpl
	extends TourismBonaWaterSportEmployeeInfoModelImpl
	implements TourismBonaWaterSportEmployeeInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona water sport employee info model instance should use the <code>TourismBonaWaterSportEmployeeInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TourismBonaWaterSportEmployeeInfoLocalServiceUtil.
				addTourismBonaWaterSportEmployeeInfo(this);
		}
		else {
			TourismBonaWaterSportEmployeeInfoLocalServiceUtil.
				updateTourismBonaWaterSportEmployeeInfo(this);
		}
	}

}