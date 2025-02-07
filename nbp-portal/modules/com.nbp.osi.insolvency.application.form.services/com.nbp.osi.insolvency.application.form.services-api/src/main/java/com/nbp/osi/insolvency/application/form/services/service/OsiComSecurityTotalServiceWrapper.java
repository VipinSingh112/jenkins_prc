/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiComSecurityTotalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiComSecurityTotalService
 * @generated
 */
public class OsiComSecurityTotalServiceWrapper
	implements OsiComSecurityTotalService,
			   ServiceWrapper<OsiComSecurityTotalService> {

	public OsiComSecurityTotalServiceWrapper() {
		this(null);
	}

	public OsiComSecurityTotalServiceWrapper(
		OsiComSecurityTotalService osiComSecurityTotalService) {

		_osiComSecurityTotalService = osiComSecurityTotalService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiComSecurityTotalService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiComSecurityTotalService getWrappedService() {
		return _osiComSecurityTotalService;
	}

	@Override
	public void setWrappedService(
		OsiComSecurityTotalService osiComSecurityTotalService) {

		_osiComSecurityTotalService = osiComSecurityTotalService;
	}

	private OsiComSecurityTotalService _osiComSecurityTotalService;

}