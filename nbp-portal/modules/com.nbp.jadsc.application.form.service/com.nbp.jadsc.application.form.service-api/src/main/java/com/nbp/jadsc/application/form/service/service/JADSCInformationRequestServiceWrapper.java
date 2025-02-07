/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCInformationRequestService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCInformationRequestService
 * @generated
 */
public class JADSCInformationRequestServiceWrapper
	implements JADSCInformationRequestService,
			   ServiceWrapper<JADSCInformationRequestService> {

	public JADSCInformationRequestServiceWrapper() {
		this(null);
	}

	public JADSCInformationRequestServiceWrapper(
		JADSCInformationRequestService jadscInformationRequestService) {

		_jadscInformationRequestService = jadscInformationRequestService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscInformationRequestService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCInformationRequestService getWrappedService() {
		return _jadscInformationRequestService;
	}

	@Override
	public void setWrappedService(
		JADSCInformationRequestService jadscInformationRequestService) {

		_jadscInformationRequestService = jadscInformationRequestService;
	}

	private JADSCInformationRequestService _jadscInformationRequestService;

}