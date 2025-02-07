/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesGeneralBenefitOfCreditorsinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesGeneralBenefitOfCreditorsinfoService
 * @generated
 */
public class OsiServicesGeneralBenefitOfCreditorsinfoServiceWrapper
	implements OsiServicesGeneralBenefitOfCreditorsinfoService,
			   ServiceWrapper<OsiServicesGeneralBenefitOfCreditorsinfoService> {

	public OsiServicesGeneralBenefitOfCreditorsinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesGeneralBenefitOfCreditorsinfoServiceWrapper(
		OsiServicesGeneralBenefitOfCreditorsinfoService
			osiServicesGeneralBenefitOfCreditorsinfoService) {

		_osiServicesGeneralBenefitOfCreditorsinfoService =
			osiServicesGeneralBenefitOfCreditorsinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesGeneralBenefitOfCreditorsinfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesGeneralBenefitOfCreditorsinfoService getWrappedService() {
		return _osiServicesGeneralBenefitOfCreditorsinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesGeneralBenefitOfCreditorsinfoService
			osiServicesGeneralBenefitOfCreditorsinfoService) {

		_osiServicesGeneralBenefitOfCreditorsinfoService =
			osiServicesGeneralBenefitOfCreditorsinfoService;
	}

	private OsiServicesGeneralBenefitOfCreditorsinfoService
		_osiServicesGeneralBenefitOfCreditorsinfoService;

}