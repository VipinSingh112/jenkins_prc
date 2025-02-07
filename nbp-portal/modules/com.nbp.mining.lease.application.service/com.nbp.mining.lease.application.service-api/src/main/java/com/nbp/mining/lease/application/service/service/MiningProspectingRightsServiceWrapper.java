/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningProspectingRightsService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRightsService
 * @generated
 */
public class MiningProspectingRightsServiceWrapper
	implements MiningProspectingRightsService,
			   ServiceWrapper<MiningProspectingRightsService> {

	public MiningProspectingRightsServiceWrapper() {
		this(null);
	}

	public MiningProspectingRightsServiceWrapper(
		MiningProspectingRightsService miningProspectingRightsService) {

		_miningProspectingRightsService = miningProspectingRightsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningProspectingRightsService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningProspectingRightsService getWrappedService() {
		return _miningProspectingRightsService;
	}

	@Override
	public void setWrappedService(
		MiningProspectingRightsService miningProspectingRightsService) {

		_miningProspectingRightsService = miningProspectingRightsService;
	}

	private MiningProspectingRightsService _miningProspectingRightsService;

}