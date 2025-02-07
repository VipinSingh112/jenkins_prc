/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacReportService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReportService
 * @generated
 */
public class JanaacReportServiceWrapper
	implements JanaacReportService, ServiceWrapper<JanaacReportService> {

	public JanaacReportServiceWrapper() {
		this(null);
	}

	public JanaacReportServiceWrapper(JanaacReportService janaacReportService) {
		_janaacReportService = janaacReportService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacReportService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacReportService getWrappedService() {
		return _janaacReportService;
	}

	@Override
	public void setWrappedService(JanaacReportService janaacReportService) {
		_janaacReportService = janaacReportService;
	}

	private JanaacReportService _janaacReportService;

}