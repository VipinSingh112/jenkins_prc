/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EducationalQualificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualificationService
 * @generated
 */
public class EducationalQualificationServiceWrapper
	implements EducationalQualificationService,
			   ServiceWrapper<EducationalQualificationService> {

	public EducationalQualificationServiceWrapper() {
		this(null);
	}

	public EducationalQualificationServiceWrapper(
		EducationalQualificationService educationalQualificationService) {

		_educationalQualificationService = educationalQualificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _educationalQualificationService.getOSGiServiceIdentifier();
	}

	@Override
	public EducationalQualificationService getWrappedService() {
		return _educationalQualificationService;
	}

	@Override
	public void setWrappedService(
		EducationalQualificationService educationalQualificationService) {

		_educationalQualificationService = educationalQualificationService;
	}

	private EducationalQualificationService _educationalQualificationService;

}