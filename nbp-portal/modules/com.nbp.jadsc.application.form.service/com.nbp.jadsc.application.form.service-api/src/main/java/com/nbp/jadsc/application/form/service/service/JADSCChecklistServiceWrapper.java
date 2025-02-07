/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCChecklistService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistService
 * @generated
 */
public class JADSCChecklistServiceWrapper
	implements JADSCChecklistService, ServiceWrapper<JADSCChecklistService> {

	public JADSCChecklistServiceWrapper() {
		this(null);
	}

	public JADSCChecklistServiceWrapper(
		JADSCChecklistService jadscChecklistService) {

		_jadscChecklistService = jadscChecklistService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscChecklistService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCChecklistService getWrappedService() {
		return _jadscChecklistService;
	}

	@Override
	public void setWrappedService(JADSCChecklistService jadscChecklistService) {
		_jadscChecklistService = jadscChecklistService;
	}

	private JADSCChecklistService _jadscChecklistService;

}