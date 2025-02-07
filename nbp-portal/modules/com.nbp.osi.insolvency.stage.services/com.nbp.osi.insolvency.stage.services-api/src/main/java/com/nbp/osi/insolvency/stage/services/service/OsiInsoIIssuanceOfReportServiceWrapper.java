/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsoIIssuanceOfReportService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsoIIssuanceOfReportService
 * @generated
 */
public class OsiInsoIIssuanceOfReportServiceWrapper
	implements OsiInsoIIssuanceOfReportService,
			   ServiceWrapper<OsiInsoIIssuanceOfReportService> {

	public OsiInsoIIssuanceOfReportServiceWrapper() {
		this(null);
	}

	public OsiInsoIIssuanceOfReportServiceWrapper(
		OsiInsoIIssuanceOfReportService osiInsoIIssuanceOfReportService) {

		_osiInsoIIssuanceOfReportService = osiInsoIIssuanceOfReportService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsoIIssuanceOfReportService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsoIIssuanceOfReportService getWrappedService() {
		return _osiInsoIIssuanceOfReportService;
	}

	@Override
	public void setWrappedService(
		OsiInsoIIssuanceOfReportService osiInsoIIssuanceOfReportService) {

		_osiInsoIIssuanceOfReportService = osiInsoIIssuanceOfReportService;
	}

	private OsiInsoIIssuanceOfReportService _osiInsoIIssuanceOfReportService;

}