/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AssessmentIndividualPersonalDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetailsService
 * @generated
 */
public class AssessmentIndividualPersonalDetailsServiceWrapper
	implements AssessmentIndividualPersonalDetailsService,
			   ServiceWrapper<AssessmentIndividualPersonalDetailsService> {

	public AssessmentIndividualPersonalDetailsServiceWrapper() {
		this(null);
	}

	public AssessmentIndividualPersonalDetailsServiceWrapper(
		AssessmentIndividualPersonalDetailsService
			assessmentIndividualPersonalDetailsService) {

		_assessmentIndividualPersonalDetailsService =
			assessmentIndividualPersonalDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assessmentIndividualPersonalDetailsService.
			getOSGiServiceIdentifier();
	}

	@Override
	public AssessmentIndividualPersonalDetailsService getWrappedService() {
		return _assessmentIndividualPersonalDetailsService;
	}

	@Override
	public void setWrappedService(
		AssessmentIndividualPersonalDetailsService
			assessmentIndividualPersonalDetailsService) {

		_assessmentIndividualPersonalDetailsService =
			assessmentIndividualPersonalDetailsService;
	}

	private AssessmentIndividualPersonalDetailsService
		_assessmentIndividualPersonalDetailsService;

}