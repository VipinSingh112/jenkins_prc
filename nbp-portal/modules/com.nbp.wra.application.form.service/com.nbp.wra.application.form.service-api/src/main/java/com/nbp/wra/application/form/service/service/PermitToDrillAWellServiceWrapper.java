/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PermitToDrillAWellService}.
 *
 * @author Brian Wing Shun Chan
 * @see PermitToDrillAWellService
 * @generated
 */
public class PermitToDrillAWellServiceWrapper
	implements PermitToDrillAWellService,
			   ServiceWrapper<PermitToDrillAWellService> {

	public PermitToDrillAWellServiceWrapper() {
		this(null);
	}

	public PermitToDrillAWellServiceWrapper(
		PermitToDrillAWellService permitToDrillAWellService) {

		_permitToDrillAWellService = permitToDrillAWellService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _permitToDrillAWellService.getOSGiServiceIdentifier();
	}

	@Override
	public PermitToDrillAWellService getWrappedService() {
		return _permitToDrillAWellService;
	}

	@Override
	public void setWrappedService(
		PermitToDrillAWellService permitToDrillAWellService) {

		_permitToDrillAWellService = permitToDrillAWellService;
	}

	private PermitToDrillAWellService _permitToDrillAWellService;

}