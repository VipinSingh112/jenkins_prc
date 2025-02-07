/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscAppliPreliminationDeteService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDeteService
 * @generated
 */
public class JadscAppliPreliminationDeteServiceWrapper
	implements JadscAppliPreliminationDeteService,
			   ServiceWrapper<JadscAppliPreliminationDeteService> {

	public JadscAppliPreliminationDeteServiceWrapper() {
		this(null);
	}

	public JadscAppliPreliminationDeteServiceWrapper(
		JadscAppliPreliminationDeteService jadscAppliPreliminationDeteService) {

		_jadscAppliPreliminationDeteService =
			jadscAppliPreliminationDeteService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliPreliminationDeteService.getOSGiServiceIdentifier();
	}

	@Override
	public JadscAppliPreliminationDeteService getWrappedService() {
		return _jadscAppliPreliminationDeteService;
	}

	@Override
	public void setWrappedService(
		JadscAppliPreliminationDeteService jadscAppliPreliminationDeteService) {

		_jadscAppliPreliminationDeteService =
			jadscAppliPreliminationDeteService;
	}

	private JadscAppliPreliminationDeteService
		_jadscAppliPreliminationDeteService;

}