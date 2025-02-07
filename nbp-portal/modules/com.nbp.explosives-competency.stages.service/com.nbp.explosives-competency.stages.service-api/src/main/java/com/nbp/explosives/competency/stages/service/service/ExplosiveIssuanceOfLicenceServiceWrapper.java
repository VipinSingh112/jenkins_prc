/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExplosiveIssuanceOfLicenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicenceService
 * @generated
 */
public class ExplosiveIssuanceOfLicenceServiceWrapper
	implements ExplosiveIssuanceOfLicenceService,
			   ServiceWrapper<ExplosiveIssuanceOfLicenceService> {

	public ExplosiveIssuanceOfLicenceServiceWrapper() {
		this(null);
	}

	public ExplosiveIssuanceOfLicenceServiceWrapper(
		ExplosiveIssuanceOfLicenceService explosiveIssuanceOfLicenceService) {

		_explosiveIssuanceOfLicenceService = explosiveIssuanceOfLicenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveIssuanceOfLicenceService.getOSGiServiceIdentifier();
	}

	@Override
	public ExplosiveIssuanceOfLicenceService getWrappedService() {
		return _explosiveIssuanceOfLicenceService;
	}

	@Override
	public void setWrappedService(
		ExplosiveIssuanceOfLicenceService explosiveIssuanceOfLicenceService) {

		_explosiveIssuanceOfLicenceService = explosiveIssuanceOfLicenceService;
	}

	private ExplosiveIssuanceOfLicenceService
		_explosiveIssuanceOfLicenceService;

}