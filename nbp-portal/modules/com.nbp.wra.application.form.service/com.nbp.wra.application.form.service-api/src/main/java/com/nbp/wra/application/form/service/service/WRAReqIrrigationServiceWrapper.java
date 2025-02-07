/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WRAReqIrrigationService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAReqIrrigationService
 * @generated
 */
public class WRAReqIrrigationServiceWrapper
	implements ServiceWrapper<WRAReqIrrigationService>,
			   WRAReqIrrigationService {

	public WRAReqIrrigationServiceWrapper() {
		this(null);
	}

	public WRAReqIrrigationServiceWrapper(
		WRAReqIrrigationService wraReqIrrigationService) {

		_wraReqIrrigationService = wraReqIrrigationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraReqIrrigationService.getOSGiServiceIdentifier();
	}

	@Override
	public WRAReqIrrigationService getWrappedService() {
		return _wraReqIrrigationService;
	}

	@Override
	public void setWrappedService(
		WRAReqIrrigationService wraReqIrrigationService) {

		_wraReqIrrigationService = wraReqIrrigationService;
	}

	private WRAReqIrrigationService _wraReqIrrigationService;

}