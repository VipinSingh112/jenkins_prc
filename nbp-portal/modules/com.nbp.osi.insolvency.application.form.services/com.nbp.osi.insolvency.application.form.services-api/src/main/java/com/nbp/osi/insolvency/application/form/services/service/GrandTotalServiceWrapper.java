/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GrandTotalService}.
 *
 * @author Brian Wing Shun Chan
 * @see GrandTotalService
 * @generated
 */
public class GrandTotalServiceWrapper
	implements GrandTotalService, ServiceWrapper<GrandTotalService> {

	public GrandTotalServiceWrapper() {
		this(null);
	}

	public GrandTotalServiceWrapper(GrandTotalService grandTotalService) {
		_grandTotalService = grandTotalService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _grandTotalService.getOSGiServiceIdentifier();
	}

	@Override
	public GrandTotalService getWrappedService() {
		return _grandTotalService;
	}

	@Override
	public void setWrappedService(GrandTotalService grandTotalService) {
		_grandTotalService = grandTotalService;
	}

	private GrandTotalService _grandTotalService;

}