/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionEmployeeInfo;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionEmployeeInfoLocalServiceUtil;

/**
 * The extended model base implementation for the TourismNewAttractionEmployeeInfo service. Represents a row in the &quot;nbp_tourism_new_attrac_emp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismNewAttractionEmployeeInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionEmployeeInfoImpl
 * @see TourismNewAttractionEmployeeInfo
 * @generated
 */
public abstract class TourismNewAttractionEmployeeInfoBaseImpl
	extends TourismNewAttractionEmployeeInfoModelImpl
	implements TourismNewAttractionEmployeeInfo {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism new attraction employee info model instance should use the <code>TourismNewAttractionEmployeeInfo</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TourismNewAttractionEmployeeInfoLocalServiceUtil.
				addTourismNewAttractionEmployeeInfo(this);
		}
		else {
			TourismNewAttractionEmployeeInfoLocalServiceUtil.
				updateTourismNewAttractionEmployeeInfo(this);
		}
	}

}