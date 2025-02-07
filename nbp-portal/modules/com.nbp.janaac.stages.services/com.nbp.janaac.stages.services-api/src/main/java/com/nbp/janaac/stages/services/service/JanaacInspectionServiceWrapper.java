/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacInspectionService
 * @generated
 */
public class JanaacInspectionServiceWrapper
	implements JanaacInspectionService,
			   ServiceWrapper<JanaacInspectionService> {

	public JanaacInspectionServiceWrapper() {
		this(null);
	}

	public JanaacInspectionServiceWrapper(
		JanaacInspectionService janaacInspectionService) {

		_janaacInspectionService = janaacInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacInspectionService getWrappedService() {
		return _janaacInspectionService;
	}

	@Override
	public void setWrappedService(
		JanaacInspectionService janaacInspectionService) {

		_janaacInspectionService = janaacInspectionService;
	}

	private JanaacInspectionService _janaacInspectionService;

}