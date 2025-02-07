/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeIndividualGeneralInformationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualGeneralInformationService
 * @generated
 */
public class CreativeIndividualGeneralInformationServiceWrapper
	implements CreativeIndividualGeneralInformationService,
			   ServiceWrapper<CreativeIndividualGeneralInformationService> {

	public CreativeIndividualGeneralInformationServiceWrapper() {
		this(null);
	}

	public CreativeIndividualGeneralInformationServiceWrapper(
		CreativeIndividualGeneralInformationService
			creativeIndividualGeneralInformationService) {

		_creativeIndividualGeneralInformationService =
			creativeIndividualGeneralInformationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeIndividualGeneralInformationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeIndividualGeneralInformationService getWrappedService() {
		return _creativeIndividualGeneralInformationService;
	}

	@Override
	public void setWrappedService(
		CreativeIndividualGeneralInformationService
			creativeIndividualGeneralInformationService) {

		_creativeIndividualGeneralInformationService =
			creativeIndividualGeneralInformationService;
	}

	private CreativeIndividualGeneralInformationService
		_creativeIndividualGeneralInformationService;

}