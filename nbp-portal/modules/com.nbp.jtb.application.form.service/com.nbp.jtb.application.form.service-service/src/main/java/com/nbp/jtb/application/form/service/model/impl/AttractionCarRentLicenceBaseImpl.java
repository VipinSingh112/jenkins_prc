/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.form.service.model.impl;

import com.nbp.jtb.application.form.service.model.AttractionCarRentLicence;
import com.nbp.jtb.application.form.service.service.AttractionCarRentLicenceLocalServiceUtil;

/**
 * The extended model base implementation for the AttractionCarRentLicence service. Represents a row in the &quot;nbp_jtb_car_rent_licence&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttractionCarRentLicenceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentLicenceImpl
 * @see AttractionCarRentLicence
 * @generated
 */
public abstract class AttractionCarRentLicenceBaseImpl
	extends AttractionCarRentLicenceModelImpl
	implements AttractionCarRentLicence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attraction car rent licence model instance should use the <code>AttractionCarRentLicence</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AttractionCarRentLicenceLocalServiceUtil.
				addAttractionCarRentLicence(this);
		}
		else {
			AttractionCarRentLicenceLocalServiceUtil.
				updateAttractionCarRentLicence(this);
		}
	}

}