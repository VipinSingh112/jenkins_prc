/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeIndividualEconomicEffectService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualEconomicEffectService
 * @generated
 */
public class CreativeIndividualEconomicEffectServiceWrapper
	implements CreativeIndividualEconomicEffectService,
			   ServiceWrapper<CreativeIndividualEconomicEffectService> {

	public CreativeIndividualEconomicEffectServiceWrapper() {
		this(null);
	}

	public CreativeIndividualEconomicEffectServiceWrapper(
		CreativeIndividualEconomicEffectService
			creativeIndividualEconomicEffectService) {

		_creativeIndividualEconomicEffectService =
			creativeIndividualEconomicEffectService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeIndividualEconomicEffectService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeIndividualEconomicEffectService getWrappedService() {
		return _creativeIndividualEconomicEffectService;
	}

	@Override
	public void setWrappedService(
		CreativeIndividualEconomicEffectService
			creativeIndividualEconomicEffectService) {

		_creativeIndividualEconomicEffectService =
			creativeIndividualEconomicEffectService;
	}

	private CreativeIndividualEconomicEffectService
		_creativeIndividualEconomicEffectService;

}