/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjNumberEffectiveAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumberEffectiveAddService
 * @generated
 */
public class NcbjNumberEffectiveAddServiceWrapper
	implements NcbjNumberEffectiveAddService,
			   ServiceWrapper<NcbjNumberEffectiveAddService> {

	public NcbjNumberEffectiveAddServiceWrapper() {
		this(null);
	}

	public NcbjNumberEffectiveAddServiceWrapper(
		NcbjNumberEffectiveAddService ncbjNumberEffectiveAddService) {

		_ncbjNumberEffectiveAddService = ncbjNumberEffectiveAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjNumberEffectiveAddService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjNumberEffectiveAddService getWrappedService() {
		return _ncbjNumberEffectiveAddService;
	}

	@Override
	public void setWrappedService(
		NcbjNumberEffectiveAddService ncbjNumberEffectiveAddService) {

		_ncbjNumberEffectiveAddService = ncbjNumberEffectiveAddService;
	}

	private NcbjNumberEffectiveAddService _ncbjNumberEffectiveAddService;

}