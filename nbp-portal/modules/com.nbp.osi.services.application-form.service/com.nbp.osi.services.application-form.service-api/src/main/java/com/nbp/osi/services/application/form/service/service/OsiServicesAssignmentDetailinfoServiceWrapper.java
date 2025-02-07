/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesAssignmentDetailinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAssignmentDetailinfoService
 * @generated
 */
public class OsiServicesAssignmentDetailinfoServiceWrapper
	implements OsiServicesAssignmentDetailinfoService,
			   ServiceWrapper<OsiServicesAssignmentDetailinfoService> {

	public OsiServicesAssignmentDetailinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesAssignmentDetailinfoServiceWrapper(
		OsiServicesAssignmentDetailinfoService
			osiServicesAssignmentDetailinfoService) {

		_osiServicesAssignmentDetailinfoService =
			osiServicesAssignmentDetailinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesAssignmentDetailinfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesAssignmentDetailinfoService getWrappedService() {
		return _osiServicesAssignmentDetailinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesAssignmentDetailinfoService
			osiServicesAssignmentDetailinfoService) {

		_osiServicesAssignmentDetailinfoService =
			osiServicesAssignmentDetailinfoService;
	}

	private OsiServicesAssignmentDetailinfoService
		_osiServicesAssignmentDetailinfoService;

}