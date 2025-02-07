/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JADSCChecklistAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAddService
 * @generated
 */
public class JADSCChecklistAddServiceWrapper
	implements JADSCChecklistAddService,
			   ServiceWrapper<JADSCChecklistAddService> {

	public JADSCChecklistAddServiceWrapper() {
		this(null);
	}

	public JADSCChecklistAddServiceWrapper(
		JADSCChecklistAddService jadscChecklistAddService) {

		_jadscChecklistAddService = jadscChecklistAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jadscChecklistAddService.getOSGiServiceIdentifier();
	}

	@Override
	public JADSCChecklistAddService getWrappedService() {
		return _jadscChecklistAddService;
	}

	@Override
	public void setWrappedService(
		JADSCChecklistAddService jadscChecklistAddService) {

		_jadscChecklistAddService = jadscChecklistAddService;
	}

	private JADSCChecklistAddService _jadscChecklistAddService;

}