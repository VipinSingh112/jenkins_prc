/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccInsBodiesPhyResourceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResourceService
 * @generated
 */
public class AccInsBodiesPhyResourceServiceWrapper
	implements AccInsBodiesPhyResourceService,
			   ServiceWrapper<AccInsBodiesPhyResourceService> {

	public AccInsBodiesPhyResourceServiceWrapper() {
		this(null);
	}

	public AccInsBodiesPhyResourceServiceWrapper(
		AccInsBodiesPhyResourceService accInsBodiesPhyResourceService) {

		_accInsBodiesPhyResourceService = accInsBodiesPhyResourceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesPhyResourceService.getOSGiServiceIdentifier();
	}

	@Override
	public AccInsBodiesPhyResourceService getWrappedService() {
		return _accInsBodiesPhyResourceService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesPhyResourceService accInsBodiesPhyResourceService) {

		_accInsBodiesPhyResourceService = accInsBodiesPhyResourceService;
	}

	private AccInsBodiesPhyResourceService _accInsBodiesPhyResourceService;

}