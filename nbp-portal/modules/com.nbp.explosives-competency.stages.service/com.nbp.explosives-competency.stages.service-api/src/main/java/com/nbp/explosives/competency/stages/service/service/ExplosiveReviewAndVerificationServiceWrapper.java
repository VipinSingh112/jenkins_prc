/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExplosiveReviewAndVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerificationService
 * @generated
 */
public class ExplosiveReviewAndVerificationServiceWrapper
	implements ExplosiveReviewAndVerificationService,
			   ServiceWrapper<ExplosiveReviewAndVerificationService> {

	public ExplosiveReviewAndVerificationServiceWrapper() {
		this(null);
	}

	public ExplosiveReviewAndVerificationServiceWrapper(
		ExplosiveReviewAndVerificationService
			explosiveReviewAndVerificationService) {

		_explosiveReviewAndVerificationService =
			explosiveReviewAndVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveReviewAndVerificationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public ExplosiveReviewAndVerificationService getWrappedService() {
		return _explosiveReviewAndVerificationService;
	}

	@Override
	public void setWrappedService(
		ExplosiveReviewAndVerificationService
			explosiveReviewAndVerificationService) {

		_explosiveReviewAndVerificationService =
			explosiveReviewAndVerificationService;
	}

	private ExplosiveReviewAndVerificationService
		_explosiveReviewAndVerificationService;

}