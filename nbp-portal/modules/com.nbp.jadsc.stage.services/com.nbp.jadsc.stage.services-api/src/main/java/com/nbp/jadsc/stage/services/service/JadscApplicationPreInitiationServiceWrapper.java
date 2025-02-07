/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscApplicationPreInitiationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationPreInitiationService
 * @generated
 */
public class JadscApplicationPreInitiationServiceWrapper
	implements JadscApplicationPreInitiationService,
			   ServiceWrapper<JadscApplicationPreInitiationService> {

	public JadscApplicationPreInitiationServiceWrapper() {
		this(null);
	}

	public JadscApplicationPreInitiationServiceWrapper(
		JadscApplicationPreInitiationService
			jadscApplicationPreInitiationService) {

		_jadscApplicationPreInitiationService =
			jadscApplicationPreInitiationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationPreInitiationService.getOSGiServiceIdentifier();
	}

	@Override
	public JadscApplicationPreInitiationService getWrappedService() {
		return _jadscApplicationPreInitiationService;
	}

	@Override
	public void setWrappedService(
		JadscApplicationPreInitiationService
			jadscApplicationPreInitiationService) {

		_jadscApplicationPreInitiationService =
			jadscApplicationPreInitiationService;
	}

	private JadscApplicationPreInitiationService
		_jadscApplicationPreInitiationService;

}