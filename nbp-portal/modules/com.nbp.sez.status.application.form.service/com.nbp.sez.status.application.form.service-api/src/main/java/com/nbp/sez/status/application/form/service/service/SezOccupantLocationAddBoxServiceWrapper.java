/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantLocationAddBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantLocationAddBoxService
 * @generated
 */
public class SezOccupantLocationAddBoxServiceWrapper
	implements ServiceWrapper<SezOccupantLocationAddBoxService>,
			   SezOccupantLocationAddBoxService {

	public SezOccupantLocationAddBoxServiceWrapper() {
		this(null);
	}

	public SezOccupantLocationAddBoxServiceWrapper(
		SezOccupantLocationAddBoxService sezOccupantLocationAddBoxService) {

		_sezOccupantLocationAddBoxService = sezOccupantLocationAddBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantLocationAddBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantLocationAddBoxService getWrappedService() {
		return _sezOccupantLocationAddBoxService;
	}

	@Override
	public void setWrappedService(
		SezOccupantLocationAddBoxService sezOccupantLocationAddBoxService) {

		_sezOccupantLocationAddBoxService = sezOccupantLocationAddBoxService;
	}

	private SezOccupantLocationAddBoxService _sezOccupantLocationAddBoxService;

}