/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiApplicationPermitService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPermitService
 * @generated
 */
public class OsiApplicationPermitServiceWrapper
	implements OsiApplicationPermitService,
			   ServiceWrapper<OsiApplicationPermitService> {

	public OsiApplicationPermitServiceWrapper() {
		this(null);
	}

	public OsiApplicationPermitServiceWrapper(
		OsiApplicationPermitService osiApplicationPermitService) {

		_osiApplicationPermitService = osiApplicationPermitService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiApplicationPermitService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiApplicationPermitService getWrappedService() {
		return _osiApplicationPermitService;
	}

	@Override
	public void setWrappedService(
		OsiApplicationPermitService osiApplicationPermitService) {

		_osiApplicationPermitService = osiApplicationPermitService;
	}

	private OsiApplicationPermitService _osiApplicationPermitService;

}