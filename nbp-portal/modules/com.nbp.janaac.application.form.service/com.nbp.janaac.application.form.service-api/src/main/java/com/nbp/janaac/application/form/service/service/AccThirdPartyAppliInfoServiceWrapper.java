/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccThirdPartyAppliInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyAppliInfoService
 * @generated
 */
public class AccThirdPartyAppliInfoServiceWrapper
	implements AccThirdPartyAppliInfoService,
			   ServiceWrapper<AccThirdPartyAppliInfoService> {

	public AccThirdPartyAppliInfoServiceWrapper() {
		this(null);
	}

	public AccThirdPartyAppliInfoServiceWrapper(
		AccThirdPartyAppliInfoService accThirdPartyAppliInfoService) {

		_accThirdPartyAppliInfoService = accThirdPartyAppliInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accThirdPartyAppliInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AccThirdPartyAppliInfoService getWrappedService() {
		return _accThirdPartyAppliInfoService;
	}

	@Override
	public void setWrappedService(
		AccThirdPartyAppliInfoService accThirdPartyAppliInfoService) {

		_accThirdPartyAppliInfoService = accThirdPartyAppliInfoService;
	}

	private AccThirdPartyAppliInfoService _accThirdPartyAppliInfoService;

}