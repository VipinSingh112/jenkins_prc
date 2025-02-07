/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevProposedProjectAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectAddService
 * @generated
 */
public class SezDevProposedProjectAddServiceWrapper
	implements ServiceWrapper<SezDevProposedProjectAddService>,
			   SezDevProposedProjectAddService {

	public SezDevProposedProjectAddServiceWrapper() {
		this(null);
	}

	public SezDevProposedProjectAddServiceWrapper(
		SezDevProposedProjectAddService sezDevProposedProjectAddService) {

		_sezDevProposedProjectAddService = sezDevProposedProjectAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevProposedProjectAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevProposedProjectAddService getWrappedService() {
		return _sezDevProposedProjectAddService;
	}

	@Override
	public void setWrappedService(
		SezDevProposedProjectAddService sezDevProposedProjectAddService) {

		_sezDevProposedProjectAddService = sezDevProposedProjectAddService;
	}

	private SezDevProposedProjectAddService _sezDevProposedProjectAddService;

}