/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExplosivesCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesCurrentStageService
 * @generated
 */
public class ExplosivesCurrentStageServiceWrapper
	implements ExplosivesCurrentStageService,
			   ServiceWrapper<ExplosivesCurrentStageService> {

	public ExplosivesCurrentStageServiceWrapper() {
		this(null);
	}

	public ExplosivesCurrentStageServiceWrapper(
		ExplosivesCurrentStageService explosivesCurrentStageService) {

		_explosivesCurrentStageService = explosivesCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosivesCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public ExplosivesCurrentStageService getWrappedService() {
		return _explosivesCurrentStageService;
	}

	@Override
	public void setWrappedService(
		ExplosivesCurrentStageService explosivesCurrentStageService) {

		_explosivesCurrentStageService = explosivesCurrentStageService;
	}

	private ExplosivesCurrentStageService _explosivesCurrentStageService;

}