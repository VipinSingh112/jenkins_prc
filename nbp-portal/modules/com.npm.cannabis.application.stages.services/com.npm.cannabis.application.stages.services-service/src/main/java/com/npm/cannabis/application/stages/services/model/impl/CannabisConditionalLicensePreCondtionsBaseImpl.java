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

package com.npm.cannabis.application.stages.services.model.impl;

import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtions;
import com.npm.cannabis.application.stages.services.service.CannabisConditionalLicensePreCondtionsLocalServiceUtil;

/**
 * The extended model base implementation for the CannabisConditionalLicensePreCondtions service. Represents a row in the &quot;nbp_cannabis_pre_conditions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CannabisConditionalLicensePreCondtionsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePreCondtionsImpl
 * @see CannabisConditionalLicensePreCondtions
 * @generated
 */
public abstract class CannabisConditionalLicensePreCondtionsBaseImpl
	extends CannabisConditionalLicensePreCondtionsModelImpl
	implements CannabisConditionalLicensePreCondtions {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cannabis conditional license pre condtions model instance should use the <code>CannabisConditionalLicensePreCondtions</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CannabisConditionalLicensePreCondtionsLocalServiceUtil.
				addCannabisConditionalLicensePreCondtions(this);
		}
		else {
			CannabisConditionalLicensePreCondtionsLocalServiceUtil.
				updateCannabisConditionalLicensePreCondtions(this);
		}
	}

}