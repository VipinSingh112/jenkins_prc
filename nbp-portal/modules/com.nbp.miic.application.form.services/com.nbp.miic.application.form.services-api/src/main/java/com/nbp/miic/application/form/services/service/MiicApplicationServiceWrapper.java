/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationService
 * @generated
 */
public class MiicApplicationServiceWrapper
	implements MiicApplicationService, ServiceWrapper<MiicApplicationService> {

	public MiicApplicationServiceWrapper() {
		this(null);
	}

	public MiicApplicationServiceWrapper(
		MiicApplicationService miicApplicationService) {

		_miicApplicationService = miicApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicApplicationService getWrappedService() {
		return _miicApplicationService;
	}

	@Override
	public void setWrappedService(
		MiicApplicationService miicApplicationService) {

		_miicApplicationService = miicApplicationService;
	}

	private MiicApplicationService _miicApplicationService;

}