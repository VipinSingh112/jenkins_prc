/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewGroundSignatureService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundSignatureService
 * @generated
 */
public class TourismNewGroundSignatureServiceWrapper
	implements ServiceWrapper<TourismNewGroundSignatureService>,
			   TourismNewGroundSignatureService {

	public TourismNewGroundSignatureServiceWrapper() {
		this(null);
	}

	public TourismNewGroundSignatureServiceWrapper(
		TourismNewGroundSignatureService tourismNewGroundSignatureService) {

		_tourismNewGroundSignatureService = tourismNewGroundSignatureService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewGroundSignatureService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewGroundSignatureService getWrappedService() {
		return _tourismNewGroundSignatureService;
	}

	@Override
	public void setWrappedService(
		TourismNewGroundSignatureService tourismNewGroundSignatureService) {

		_tourismNewGroundSignatureService = tourismNewGroundSignatureService;
	}

	private TourismNewGroundSignatureService _tourismNewGroundSignatureService;

}