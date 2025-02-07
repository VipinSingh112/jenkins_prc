/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeLicenseBreakdowninfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeLicenseBreakdowninfoService
 * @generated
 */
public class OsiServicesTrusteeLicenseBreakdowninfoServiceWrapper
	implements OsiServicesTrusteeLicenseBreakdowninfoService,
			   ServiceWrapper<OsiServicesTrusteeLicenseBreakdowninfoService> {

	public OsiServicesTrusteeLicenseBreakdowninfoServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeLicenseBreakdowninfoServiceWrapper(
		OsiServicesTrusteeLicenseBreakdowninfoService
			osiServicesTrusteeLicenseBreakdowninfoService) {

		_osiServicesTrusteeLicenseBreakdowninfoService =
			osiServicesTrusteeLicenseBreakdowninfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeLicenseBreakdowninfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesTrusteeLicenseBreakdowninfoService getWrappedService() {
		return _osiServicesTrusteeLicenseBreakdowninfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeLicenseBreakdowninfoService
			osiServicesTrusteeLicenseBreakdowninfoService) {

		_osiServicesTrusteeLicenseBreakdowninfoService =
			osiServicesTrusteeLicenseBreakdowninfoService;
	}

	private OsiServicesTrusteeLicenseBreakdowninfoService
		_osiServicesTrusteeLicenseBreakdowninfoService;

}