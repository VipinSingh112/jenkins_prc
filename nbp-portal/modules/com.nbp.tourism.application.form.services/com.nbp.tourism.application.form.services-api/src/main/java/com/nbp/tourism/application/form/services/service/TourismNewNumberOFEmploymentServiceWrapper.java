/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewNumberOFEmploymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmploymentService
 * @generated
 */
public class TourismNewNumberOFEmploymentServiceWrapper
	implements ServiceWrapper<TourismNewNumberOFEmploymentService>,
			   TourismNewNumberOFEmploymentService {

	public TourismNewNumberOFEmploymentServiceWrapper() {
		this(null);
	}

	public TourismNewNumberOFEmploymentServiceWrapper(
		TourismNewNumberOFEmploymentService
			tourismNewNumberOFEmploymentService) {

		_tourismNewNumberOFEmploymentService =
			tourismNewNumberOFEmploymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewNumberOFEmploymentService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewNumberOFEmploymentService getWrappedService() {
		return _tourismNewNumberOFEmploymentService;
	}

	@Override
	public void setWrappedService(
		TourismNewNumberOFEmploymentService
			tourismNewNumberOFEmploymentService) {

		_tourismNewNumberOFEmploymentService =
			tourismNewNumberOFEmploymentService;
	}

	private TourismNewNumberOFEmploymentService
		_tourismNewNumberOFEmploymentService;

}