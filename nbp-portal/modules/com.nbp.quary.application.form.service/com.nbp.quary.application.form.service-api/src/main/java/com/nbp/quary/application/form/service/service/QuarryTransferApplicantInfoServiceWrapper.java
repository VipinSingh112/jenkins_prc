/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryTransferApplicantInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryTransferApplicantInfoService
 * @generated
 */
public class QuarryTransferApplicantInfoServiceWrapper
	implements QuarryTransferApplicantInfoService,
			   ServiceWrapper<QuarryTransferApplicantInfoService> {

	public QuarryTransferApplicantInfoServiceWrapper() {
		this(null);
	}

	public QuarryTransferApplicantInfoServiceWrapper(
		QuarryTransferApplicantInfoService quarryTransferApplicantInfoService) {

		_quarryTransferApplicantInfoService =
			quarryTransferApplicantInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryTransferApplicantInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryTransferApplicantInfoService getWrappedService() {
		return _quarryTransferApplicantInfoService;
	}

	@Override
	public void setWrappedService(
		QuarryTransferApplicantInfoService quarryTransferApplicantInfoService) {

		_quarryTransferApplicantInfoService =
			quarryTransferApplicantInfoService;
	}

	private QuarryTransferApplicantInfoService
		_quarryTransferApplicantInfoService;

}