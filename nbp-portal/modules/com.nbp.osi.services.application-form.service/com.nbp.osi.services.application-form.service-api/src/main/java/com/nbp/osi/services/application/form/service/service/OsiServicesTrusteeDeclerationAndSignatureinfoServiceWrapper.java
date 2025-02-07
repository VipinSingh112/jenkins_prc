/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeDeclerationAndSignatureinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeDeclerationAndSignatureinfoService
 * @generated
 */
public class OsiServicesTrusteeDeclerationAndSignatureinfoServiceWrapper
	implements OsiServicesTrusteeDeclerationAndSignatureinfoService,
			   ServiceWrapper
				   <OsiServicesTrusteeDeclerationAndSignatureinfoService> {

	public OsiServicesTrusteeDeclerationAndSignatureinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeDeclerationAndSignatureinfoServiceWrapper(
		OsiServicesTrusteeDeclerationAndSignatureinfoService
			osiServicesTrusteeDeclerationAndSignatureinfoService) {

		_osiServicesTrusteeDeclerationAndSignatureinfoService =
			osiServicesTrusteeDeclerationAndSignatureinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeDeclerationAndSignatureinfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesTrusteeDeclerationAndSignatureinfoService
		getWrappedService() {

		return _osiServicesTrusteeDeclerationAndSignatureinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeDeclerationAndSignatureinfoService
			osiServicesTrusteeDeclerationAndSignatureinfoService) {

		_osiServicesTrusteeDeclerationAndSignatureinfoService =
			osiServicesTrusteeDeclerationAndSignatureinfoService;
	}

	private OsiServicesTrusteeDeclerationAndSignatureinfoService
		_osiServicesTrusteeDeclerationAndSignatureinfoService;

}