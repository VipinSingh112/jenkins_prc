/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.model.impl;

import com.npm.cannabis.application.stages.services.model.CannabisLicensePreCondtions;
import com.npm.cannabis.application.stages.services.service.CannabisLicensePreCondtionsLocalServiceUtil;

/**
 * The extended model base implementation for the CannabisLicensePreCondtions service. Represents a row in the &quot;nbp_cannabis_pre_conditions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CannabisLicensePreCondtionsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePreCondtionsImpl
 * @see CannabisLicensePreCondtions
 * @generated
 */
public abstract class CannabisLicensePreCondtionsBaseImpl
	extends CannabisLicensePreCondtionsModelImpl
	implements CannabisLicensePreCondtions {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cannabis license pre condtions model instance should use the <code>CannabisLicensePreCondtions</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			CannabisLicensePreCondtionsLocalServiceUtil.
				addCannabisLicensePreCondtions(this);
		}
		else {
			CannabisLicensePreCondtionsLocalServiceUtil.
				updateCannabisLicensePreCondtions(this);
		}
	}

}