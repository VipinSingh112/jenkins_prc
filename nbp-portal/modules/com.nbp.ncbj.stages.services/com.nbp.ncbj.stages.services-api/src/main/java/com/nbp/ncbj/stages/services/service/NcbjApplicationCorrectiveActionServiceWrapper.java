/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjApplicationCorrectiveActionService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveActionService
 * @generated
 */
public class NcbjApplicationCorrectiveActionServiceWrapper
	implements NcbjApplicationCorrectiveActionService,
			   ServiceWrapper<NcbjApplicationCorrectiveActionService> {

	public NcbjApplicationCorrectiveActionServiceWrapper() {
		this(null);
	}

	public NcbjApplicationCorrectiveActionServiceWrapper(
		NcbjApplicationCorrectiveActionService
			ncbjApplicationCorrectiveActionService) {

		_ncbjApplicationCorrectiveActionService =
			ncbjApplicationCorrectiveActionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicationCorrectiveActionService.
			getOSGiServiceIdentifier();
	}

	@Override
	public NcbjApplicationCorrectiveActionService getWrappedService() {
		return _ncbjApplicationCorrectiveActionService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicationCorrectiveActionService
			ncbjApplicationCorrectiveActionService) {

		_ncbjApplicationCorrectiveActionService =
			ncbjApplicationCorrectiveActionService;
	}

	private NcbjApplicationCorrectiveActionService
		_ncbjApplicationCorrectiveActionService;

}