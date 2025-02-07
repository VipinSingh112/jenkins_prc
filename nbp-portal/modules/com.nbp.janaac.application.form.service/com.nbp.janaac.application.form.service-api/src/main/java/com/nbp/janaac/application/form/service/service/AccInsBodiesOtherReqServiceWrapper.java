/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccInsBodiesOtherReqService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOtherReqService
 * @generated
 */
public class AccInsBodiesOtherReqServiceWrapper
	implements AccInsBodiesOtherReqService,
			   ServiceWrapper<AccInsBodiesOtherReqService> {

	public AccInsBodiesOtherReqServiceWrapper() {
		this(null);
	}

	public AccInsBodiesOtherReqServiceWrapper(
		AccInsBodiesOtherReqService accInsBodiesOtherReqService) {

		_accInsBodiesOtherReqService = accInsBodiesOtherReqService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accInsBodiesOtherReqService.getOSGiServiceIdentifier();
	}

	@Override
	public AccInsBodiesOtherReqService getWrappedService() {
		return _accInsBodiesOtherReqService;
	}

	@Override
	public void setWrappedService(
		AccInsBodiesOtherReqService accInsBodiesOtherReqService) {

		_accInsBodiesOtherReqService = accInsBodiesOtherReqService;
	}

	private AccInsBodiesOtherReqService _accInsBodiesOtherReqService;

}