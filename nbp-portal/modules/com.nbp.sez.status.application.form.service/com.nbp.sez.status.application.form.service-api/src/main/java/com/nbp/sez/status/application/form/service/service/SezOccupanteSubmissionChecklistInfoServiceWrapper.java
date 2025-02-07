/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupanteSubmissionChecklistInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteSubmissionChecklistInfoService
 * @generated
 */
public class SezOccupanteSubmissionChecklistInfoServiceWrapper
	implements ServiceWrapper<SezOccupanteSubmissionChecklistInfoService>,
			   SezOccupanteSubmissionChecklistInfoService {

	public SezOccupanteSubmissionChecklistInfoServiceWrapper() {
		this(null);
	}

	public SezOccupanteSubmissionChecklistInfoServiceWrapper(
		SezOccupanteSubmissionChecklistInfoService
			sezOccupanteSubmissionChecklistInfoService) {

		_sezOccupanteSubmissionChecklistInfoService =
			sezOccupanteSubmissionChecklistInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupanteSubmissionChecklistInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupanteSubmissionChecklistInfoService getWrappedService() {
		return _sezOccupanteSubmissionChecklistInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupanteSubmissionChecklistInfoService
			sezOccupanteSubmissionChecklistInfoService) {

		_sezOccupanteSubmissionChecklistInfoService =
			sezOccupanteSubmissionChecklistInfoService;
	}

	private SezOccupanteSubmissionChecklistInfoService
		_sezOccupanteSubmissionChecklistInfoService;

}