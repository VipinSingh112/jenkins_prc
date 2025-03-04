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

package com.nbp.farm.application.stages.service.model.impl;

import com.nbp.farm.application.stages.service.model.FarmInspection;
import com.nbp.farm.application.stages.service.service.FarmInspectionLocalServiceUtil;

/**
 * The extended model base implementation for the FarmInspection service. Represents a row in the &quot;nbp_farm_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FarmInspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmInspectionImpl
 * @see FarmInspection
 * @generated
 */
public abstract class FarmInspectionBaseImpl
	extends FarmInspectionModelImpl implements FarmInspection {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a farm inspection model instance should use the <code>FarmInspection</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			FarmInspectionLocalServiceUtil.addFarmInspection(this);
		}
		else {
			FarmInspectionLocalServiceUtil.updateFarmInspection(this);
		}
	}

}