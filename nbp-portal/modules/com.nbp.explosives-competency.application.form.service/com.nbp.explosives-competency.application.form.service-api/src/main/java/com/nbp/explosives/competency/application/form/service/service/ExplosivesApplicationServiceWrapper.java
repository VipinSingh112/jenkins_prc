/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExplosivesApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationService
 * @generated
 */
public class ExplosivesApplicationServiceWrapper
	implements ExplosivesApplicationService,
			   ServiceWrapper<ExplosivesApplicationService> {

	public ExplosivesApplicationServiceWrapper() {
		this(null);
	}

	public ExplosivesApplicationServiceWrapper(
		ExplosivesApplicationService explosivesApplicationService) {

		_explosivesApplicationService = explosivesApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosivesApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public ExplosivesApplicationService getWrappedService() {
		return _explosivesApplicationService;
	}

	@Override
	public void setWrappedService(
		ExplosivesApplicationService explosivesApplicationService) {

		_explosivesApplicationService = explosivesApplicationService;
	}

	private ExplosivesApplicationService _explosivesApplicationService;

}