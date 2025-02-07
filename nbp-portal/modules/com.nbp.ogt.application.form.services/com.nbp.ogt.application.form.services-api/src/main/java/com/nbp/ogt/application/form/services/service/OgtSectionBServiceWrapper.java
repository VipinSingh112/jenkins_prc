/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtSectionBService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtSectionBService
 * @generated
 */
public class OgtSectionBServiceWrapper
	implements OgtSectionBService, ServiceWrapper<OgtSectionBService> {

	public OgtSectionBServiceWrapper() {
		this(null);
	}

	public OgtSectionBServiceWrapper(OgtSectionBService ogtSectionBService) {
		_ogtSectionBService = ogtSectionBService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtSectionBService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtSectionBService getWrappedService() {
		return _ogtSectionBService;
	}

	@Override
	public void setWrappedService(OgtSectionBService ogtSectionBService) {
		_ogtSectionBService = ogtSectionBService;
	}

	private OgtSectionBService _ogtSectionBService;

}