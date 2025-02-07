/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesAppCommitteeDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppCommitteeDecisionService
 * @generated
 */
public class FactoriesAppCommitteeDecisionServiceWrapper
	implements FactoriesAppCommitteeDecisionService,
			   ServiceWrapper<FactoriesAppCommitteeDecisionService> {

	public FactoriesAppCommitteeDecisionServiceWrapper() {
		this(null);
	}

	public FactoriesAppCommitteeDecisionServiceWrapper(
		FactoriesAppCommitteeDecisionService
			factoriesAppCommitteeDecisionService) {

		_factoriesAppCommitteeDecisionService =
			factoriesAppCommitteeDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesAppCommitteeDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesAppCommitteeDecisionService getWrappedService() {
		return _factoriesAppCommitteeDecisionService;
	}

	@Override
	public void setWrappedService(
		FactoriesAppCommitteeDecisionService
			factoriesAppCommitteeDecisionService) {

		_factoriesAppCommitteeDecisionService =
			factoriesAppCommitteeDecisionService;
	}

	private FactoriesAppCommitteeDecisionService
		_factoriesAppCommitteeDecisionService;

}