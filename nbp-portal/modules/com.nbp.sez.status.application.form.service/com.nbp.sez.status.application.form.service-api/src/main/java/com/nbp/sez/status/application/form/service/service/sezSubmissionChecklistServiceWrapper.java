/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link sezSubmissionChecklistService}.
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklistService
 * @generated
 */
public class sezSubmissionChecklistServiceWrapper
	implements ServiceWrapper<sezSubmissionChecklistService>,
			   sezSubmissionChecklistService {

	public sezSubmissionChecklistServiceWrapper() {
		this(null);
	}

	public sezSubmissionChecklistServiceWrapper(
		sezSubmissionChecklistService sezSubmissionChecklistService) {

		_sezSubmissionChecklistService = sezSubmissionChecklistService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezSubmissionChecklistService.getOSGiServiceIdentifier();
	}

	@Override
	public sezSubmissionChecklistService getWrappedService() {
		return _sezSubmissionChecklistService;
	}

	@Override
	public void setWrappedService(
		sezSubmissionChecklistService sezSubmissionChecklistService) {

		_sezSubmissionChecklistService = sezSubmissionChecklistService;
	}

	private sezSubmissionChecklistService _sezSubmissionChecklistService;

}