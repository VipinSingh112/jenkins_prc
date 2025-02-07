/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaApplicationCommitteeDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecisionService
 * @generated
 */
public class PharmaApplicationCommitteeDecisionServiceWrapper
	implements PharmaApplicationCommitteeDecisionService,
			   ServiceWrapper<PharmaApplicationCommitteeDecisionService> {

	public PharmaApplicationCommitteeDecisionServiceWrapper() {
		this(null);
	}

	public PharmaApplicationCommitteeDecisionServiceWrapper(
		PharmaApplicationCommitteeDecisionService
			pharmaApplicationCommitteeDecisionService) {

		_pharmaApplicationCommitteeDecisionService =
			pharmaApplicationCommitteeDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationCommitteeDecisionService.
			getOSGiServiceIdentifier();
	}

	@Override
	public PharmaApplicationCommitteeDecisionService getWrappedService() {
		return _pharmaApplicationCommitteeDecisionService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationCommitteeDecisionService
			pharmaApplicationCommitteeDecisionService) {

		_pharmaApplicationCommitteeDecisionService =
			pharmaApplicationCommitteeDecisionService;
	}

	private PharmaApplicationCommitteeDecisionService
		_pharmaApplicationCommitteeDecisionService;

}