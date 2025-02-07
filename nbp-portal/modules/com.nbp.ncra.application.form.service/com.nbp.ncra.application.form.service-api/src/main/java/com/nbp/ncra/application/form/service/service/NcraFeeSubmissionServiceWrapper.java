/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcraFeeSubmissionService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraFeeSubmissionService
 * @generated
 */
public class NcraFeeSubmissionServiceWrapper
	implements NcraFeeSubmissionService,
			   ServiceWrapper<NcraFeeSubmissionService> {

	public NcraFeeSubmissionServiceWrapper() {
		this(null);
	}

	public NcraFeeSubmissionServiceWrapper(
		NcraFeeSubmissionService ncraFeeSubmissionService) {

		_ncraFeeSubmissionService = ncraFeeSubmissionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraFeeSubmissionService.getOSGiServiceIdentifier();
	}

	@Override
	public NcraFeeSubmissionService getWrappedService() {
		return _ncraFeeSubmissionService;
	}

	@Override
	public void setWrappedService(
		NcraFeeSubmissionService ncraFeeSubmissionService) {

		_ncraFeeSubmissionService = ncraFeeSubmissionService;
	}

	private NcraFeeSubmissionService _ncraFeeSubmissionService;

}