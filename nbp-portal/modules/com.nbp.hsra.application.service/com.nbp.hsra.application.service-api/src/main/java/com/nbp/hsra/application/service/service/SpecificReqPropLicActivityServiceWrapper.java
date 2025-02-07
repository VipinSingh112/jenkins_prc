/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SpecificReqPropLicActivityService}.
 *
 * @author Brian Wing Shun Chan
 * @see SpecificReqPropLicActivityService
 * @generated
 */
public class SpecificReqPropLicActivityServiceWrapper
	implements ServiceWrapper<SpecificReqPropLicActivityService>,
			   SpecificReqPropLicActivityService {

	public SpecificReqPropLicActivityServiceWrapper() {
		this(null);
	}

	public SpecificReqPropLicActivityServiceWrapper(
		SpecificReqPropLicActivityService specificReqPropLicActivityService) {

		_specificReqPropLicActivityService = specificReqPropLicActivityService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _specificReqPropLicActivityService.getOSGiServiceIdentifier();
	}

	@Override
	public SpecificReqPropLicActivityService getWrappedService() {
		return _specificReqPropLicActivityService;
	}

	@Override
	public void setWrappedService(
		SpecificReqPropLicActivityService specificReqPropLicActivityService) {

		_specificReqPropLicActivityService = specificReqPropLicActivityService;
	}

	private SpecificReqPropLicActivityService
		_specificReqPropLicActivityService;

}