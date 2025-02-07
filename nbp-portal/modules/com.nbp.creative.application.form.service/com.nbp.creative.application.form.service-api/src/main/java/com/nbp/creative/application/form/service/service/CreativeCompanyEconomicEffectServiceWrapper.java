/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeCompanyEconomicEffectService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyEconomicEffectService
 * @generated
 */
public class CreativeCompanyEconomicEffectServiceWrapper
	implements CreativeCompanyEconomicEffectService,
			   ServiceWrapper<CreativeCompanyEconomicEffectService> {

	public CreativeCompanyEconomicEffectServiceWrapper() {
		this(null);
	}

	public CreativeCompanyEconomicEffectServiceWrapper(
		CreativeCompanyEconomicEffectService
			creativeCompanyEconomicEffectService) {

		_creativeCompanyEconomicEffectService =
			creativeCompanyEconomicEffectService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyEconomicEffectService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeCompanyEconomicEffectService getWrappedService() {
		return _creativeCompanyEconomicEffectService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyEconomicEffectService
			creativeCompanyEconomicEffectService) {

		_creativeCompanyEconomicEffectService =
			creativeCompanyEconomicEffectService;
	}

	private CreativeCompanyEconomicEffectService
		_creativeCompanyEconomicEffectService;

}