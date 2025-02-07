/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddApplicantPractitionerService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddApplicantPractitionerService
 * @generated
 */
public class AddApplicantPractitionerServiceWrapper
	implements AddApplicantPractitionerService,
			   ServiceWrapper<AddApplicantPractitionerService> {

	public AddApplicantPractitionerServiceWrapper() {
		this(null);
	}

	public AddApplicantPractitionerServiceWrapper(
		AddApplicantPractitionerService addApplicantPractitionerService) {

		_addApplicantPractitionerService = addApplicantPractitionerService;
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AddApplicantPractitioner>
			getHsraById(long hsraApplicationId) {

		return _addApplicantPractitionerService.getHsraById(hsraApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addApplicantPractitionerService.getOSGiServiceIdentifier();
	}

	@Override
	public AddApplicantPractitionerService getWrappedService() {
		return _addApplicantPractitionerService;
	}

	@Override
	public void setWrappedService(
		AddApplicantPractitionerService addApplicantPractitionerService) {

		_addApplicantPractitionerService = addApplicantPractitionerService;
	}

	private AddApplicantPractitionerService _addApplicantPractitionerService;

}