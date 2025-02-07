/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model.impl;

import com.nbp.osi.services.stages.service.model.OSIServicesRecommendations;
import com.nbp.osi.services.stages.service.service.OSIServicesRecommendationsLocalServiceUtil;

/**
 * The extended model base implementation for the OSIServicesRecommendations service. Represents a row in the &quot;nbp_osi_services_recommen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OSIServicesRecommendationsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesRecommendationsImpl
 * @see OSIServicesRecommendations
 * @generated
 */
public abstract class OSIServicesRecommendationsBaseImpl
	extends OSIServicesRecommendationsModelImpl
	implements OSIServicesRecommendations {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi services recommendations model instance should use the <code>OSIServicesRecommendations</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OSIServicesRecommendationsLocalServiceUtil.
				addOSIServicesRecommendations(this);
		}
		else {
			OSIServicesRecommendationsLocalServiceUtil.
				updateOSIServicesRecommendations(this);
		}
	}

}