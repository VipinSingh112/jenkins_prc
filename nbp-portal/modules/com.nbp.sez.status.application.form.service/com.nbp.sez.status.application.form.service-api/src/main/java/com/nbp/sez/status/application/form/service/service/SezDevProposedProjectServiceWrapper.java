/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevProposedProjectService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectService
 * @generated
 */
public class SezDevProposedProjectServiceWrapper
	implements ServiceWrapper<SezDevProposedProjectService>,
			   SezDevProposedProjectService {

	public SezDevProposedProjectServiceWrapper() {
		this(null);
	}

	public SezDevProposedProjectServiceWrapper(
		SezDevProposedProjectService sezDevProposedProjectService) {

		_sezDevProposedProjectService = sezDevProposedProjectService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevProposedProjectService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevProposedProjectService getWrappedService() {
		return _sezDevProposedProjectService;
	}

	@Override
	public void setWrappedService(
		SezDevProposedProjectService sezDevProposedProjectService) {

		_sezDevProposedProjectService = sezDevProposedProjectService;
	}

	private SezDevProposedProjectService _sezDevProposedProjectService;

}