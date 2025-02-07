/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeBreadDownAddinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeBreadDownAddinfoService
 * @generated
 */
public class OsiServicesTrusteeBreadDownAddinfoServiceWrapper
	implements OsiServicesTrusteeBreadDownAddinfoService,
			   ServiceWrapper<OsiServicesTrusteeBreadDownAddinfoService> {

	public OsiServicesTrusteeBreadDownAddinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeBreadDownAddinfoServiceWrapper(
		OsiServicesTrusteeBreadDownAddinfoService
			osiServicesTrusteeBreadDownAddinfoService) {

		_osiServicesTrusteeBreadDownAddinfoService =
			osiServicesTrusteeBreadDownAddinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeBreadDownAddinfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesTrusteeBreadDownAddinfoService getWrappedService() {
		return _osiServicesTrusteeBreadDownAddinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeBreadDownAddinfoService
			osiServicesTrusteeBreadDownAddinfoService) {

		_osiServicesTrusteeBreadDownAddinfoService =
			osiServicesTrusteeBreadDownAddinfoService;
	}

	private OsiServicesTrusteeBreadDownAddinfoService
		_osiServicesTrusteeBreadDownAddinfoService;

}