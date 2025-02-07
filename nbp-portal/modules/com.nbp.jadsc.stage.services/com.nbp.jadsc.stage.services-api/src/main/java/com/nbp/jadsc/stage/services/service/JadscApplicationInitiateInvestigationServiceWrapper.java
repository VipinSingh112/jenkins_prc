/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscApplicationInitiateInvestigationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationInitiateInvestigationService
 * @generated
 */
public class JadscApplicationInitiateInvestigationServiceWrapper
	implements JadscApplicationInitiateInvestigationService,
			   ServiceWrapper<JadscApplicationInitiateInvestigationService> {

	public JadscApplicationInitiateInvestigationServiceWrapper() {
		this(null);
	}

	public JadscApplicationInitiateInvestigationServiceWrapper(
		JadscApplicationInitiateInvestigationService
			jadscApplicationInitiateInvestigationService) {

		_jadscApplicationInitiateInvestigationService =
			jadscApplicationInitiateInvestigationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscApplicationInitiateInvestigationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public JadscApplicationInitiateInvestigationService getWrappedService() {
		return _jadscApplicationInitiateInvestigationService;
	}

	@Override
	public void setWrappedService(
		JadscApplicationInitiateInvestigationService
			jadscApplicationInitiateInvestigationService) {

		_jadscApplicationInitiateInvestigationService =
			jadscApplicationInitiateInvestigationService;
	}

	private JadscApplicationInitiateInvestigationService
		_jadscApplicationInitiateInvestigationService;

}