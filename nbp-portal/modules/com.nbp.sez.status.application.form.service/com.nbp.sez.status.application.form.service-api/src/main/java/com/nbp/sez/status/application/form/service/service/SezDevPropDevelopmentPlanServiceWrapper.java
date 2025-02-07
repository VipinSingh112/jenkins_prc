/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevPropDevelopmentPlanService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlanService
 * @generated
 */
public class SezDevPropDevelopmentPlanServiceWrapper
	implements ServiceWrapper<SezDevPropDevelopmentPlanService>,
			   SezDevPropDevelopmentPlanService {

	public SezDevPropDevelopmentPlanServiceWrapper() {
		this(null);
	}

	public SezDevPropDevelopmentPlanServiceWrapper(
		SezDevPropDevelopmentPlanService sezDevPropDevelopmentPlanService) {

		_sezDevPropDevelopmentPlanService = sezDevPropDevelopmentPlanService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevPropDevelopmentPlanService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevPropDevelopmentPlanService getWrappedService() {
		return _sezDevPropDevelopmentPlanService;
	}

	@Override
	public void setWrappedService(
		SezDevPropDevelopmentPlanService sezDevPropDevelopmentPlanService) {

		_sezDevPropDevelopmentPlanService = sezDevPropDevelopmentPlanService;
	}

	private SezDevPropDevelopmentPlanService _sezDevPropDevelopmentPlanService;

}