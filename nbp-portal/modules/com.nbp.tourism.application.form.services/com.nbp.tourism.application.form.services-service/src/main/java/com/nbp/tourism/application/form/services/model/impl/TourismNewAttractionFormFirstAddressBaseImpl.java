/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstAddress;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionFormFirstAddressLocalServiceUtil;

/**
 * The extended model base implementation for the TourismNewAttractionFormFirstAddress service. Represents a row in the &quot;nbp_tourism_new_attract_ffaoo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismNewAttractionFormFirstAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstAddressImpl
 * @see TourismNewAttractionFormFirstAddress
 * @generated
 */
public abstract class TourismNewAttractionFormFirstAddressBaseImpl
	extends TourismNewAttractionFormFirstAddressModelImpl
	implements TourismNewAttractionFormFirstAddress {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism new attraction form first address model instance should use the <code>TourismNewAttractionFormFirstAddress</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			TourismNewAttractionFormFirstAddressLocalServiceUtil.
				addTourismNewAttractionFormFirstAddress(this);
		}
		else {
			TourismNewAttractionFormFirstAddressLocalServiceUtil.
				updateTourismNewAttractionFormFirstAddress(this);
		}
	}

}