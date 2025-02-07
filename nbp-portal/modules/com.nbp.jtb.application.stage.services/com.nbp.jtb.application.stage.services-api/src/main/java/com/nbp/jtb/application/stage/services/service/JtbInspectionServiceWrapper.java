/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbInspectionService
 * @generated
 */
public class JtbInspectionServiceWrapper
	implements JtbInspectionService, ServiceWrapper<JtbInspectionService> {

	public JtbInspectionServiceWrapper() {
		this(null);
	}

	public JtbInspectionServiceWrapper(
		JtbInspectionService jtbInspectionService) {

		_jtbInspectionService = jtbInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbInspectionService getWrappedService() {
		return _jtbInspectionService;
	}

	@Override
	public void setWrappedService(JtbInspectionService jtbInspectionService) {
		_jtbInspectionService = jtbInspectionService;
	}

	private JtbInspectionService _jtbInspectionService;

}