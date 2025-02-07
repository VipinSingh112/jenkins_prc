/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExplosiveCommisionDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveCommisionDecisionService
 * @generated
 */
public class ExplosiveCommisionDecisionServiceWrapper
	implements ExplosiveCommisionDecisionService,
			   ServiceWrapper<ExplosiveCommisionDecisionService> {

	public ExplosiveCommisionDecisionServiceWrapper() {
		this(null);
	}

	public ExplosiveCommisionDecisionServiceWrapper(
		ExplosiveCommisionDecisionService explosiveCommisionDecisionService) {

		_explosiveCommisionDecisionService = explosiveCommisionDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveCommisionDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public ExplosiveCommisionDecisionService getWrappedService() {
		return _explosiveCommisionDecisionService;
	}

	@Override
	public void setWrappedService(
		ExplosiveCommisionDecisionService explosiveCommisionDecisionService) {

		_explosiveCommisionDecisionService = explosiveCommisionDecisionService;
	}

	private ExplosiveCommisionDecisionService
		_explosiveCommisionDecisionService;

}