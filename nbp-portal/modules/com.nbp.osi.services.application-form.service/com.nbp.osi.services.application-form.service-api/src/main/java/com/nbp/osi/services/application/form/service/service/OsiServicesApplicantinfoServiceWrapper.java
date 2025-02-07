/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesApplicantinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfoService
 * @generated
 */
public class OsiServicesApplicantinfoServiceWrapper
	implements OsiServicesApplicantinfoService,
			   ServiceWrapper<OsiServicesApplicantinfoService> {

	public OsiServicesApplicantinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesApplicantinfoServiceWrapper(
		OsiServicesApplicantinfoService osiServicesApplicantinfoService) {

		_osiServicesApplicantinfoService = osiServicesApplicantinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesApplicantinfoService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesApplicantinfoService getWrappedService() {
		return _osiServicesApplicantinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesApplicantinfoService osiServicesApplicantinfoService) {

		_osiServicesApplicantinfoService = osiServicesApplicantinfoService;
	}

	private OsiServicesApplicantinfoService _osiServicesApplicantinfoService;

}