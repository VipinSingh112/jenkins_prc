/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JadscAppliFinalDeterService}.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliFinalDeterService
 * @generated
 */
public class JadscAppliFinalDeterServiceWrapper
	implements JadscAppliFinalDeterService,
			   ServiceWrapper<JadscAppliFinalDeterService> {

	public JadscAppliFinalDeterServiceWrapper() {
		this(null);
	}

	public JadscAppliFinalDeterServiceWrapper(
		JadscAppliFinalDeterService jadscAppliFinalDeterService) {

		_jadscAppliFinalDeterService = jadscAppliFinalDeterService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscAppliFinalDeterService.getOSGiServiceIdentifier();
	}

	@Override
	public JadscAppliFinalDeterService getWrappedService() {
		return _jadscAppliFinalDeterService;
	}

	@Override
	public void setWrappedService(
		JadscAppliFinalDeterService jadscAppliFinalDeterService) {

		_jadscAppliFinalDeterService = jadscAppliFinalDeterService;
	}

	private JadscAppliFinalDeterService _jadscAppliFinalDeterService;

}