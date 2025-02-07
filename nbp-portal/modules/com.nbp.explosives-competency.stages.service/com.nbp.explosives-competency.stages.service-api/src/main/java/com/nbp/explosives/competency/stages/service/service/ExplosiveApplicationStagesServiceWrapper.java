/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExplosiveApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStagesService
 * @generated
 */
public class ExplosiveApplicationStagesServiceWrapper
	implements ExplosiveApplicationStagesService,
			   ServiceWrapper<ExplosiveApplicationStagesService> {

	public ExplosiveApplicationStagesServiceWrapper() {
		this(null);
	}

	public ExplosiveApplicationStagesServiceWrapper(
		ExplosiveApplicationStagesService explosiveApplicationStagesService) {

		_explosiveApplicationStagesService = explosiveApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public ExplosiveApplicationStagesService getWrappedService() {
		return _explosiveApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		ExplosiveApplicationStagesService explosiveApplicationStagesService) {

		_explosiveApplicationStagesService = explosiveApplicationStagesService;
	}

	private ExplosiveApplicationStagesService
		_explosiveApplicationStagesService;

}