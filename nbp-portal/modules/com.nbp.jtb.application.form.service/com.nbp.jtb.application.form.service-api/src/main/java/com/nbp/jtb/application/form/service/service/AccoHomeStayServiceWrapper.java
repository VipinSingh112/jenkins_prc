/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccoHomeStayService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStayService
 * @generated
 */
public class AccoHomeStayServiceWrapper
	implements AccoHomeStayService, ServiceWrapper<AccoHomeStayService> {

	public AccoHomeStayServiceWrapper() {
		this(null);
	}

	public AccoHomeStayServiceWrapper(AccoHomeStayService accoHomeStayService) {
		_accoHomeStayService = accoHomeStayService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoHomeStayService.getOSGiServiceIdentifier();
	}

	@Override
	public AccoHomeStayService getWrappedService() {
		return _accoHomeStayService;
	}

	@Override
	public void setWrappedService(AccoHomeStayService accoHomeStayService) {
		_accoHomeStayService = accoHomeStayService;
	}

	private AccoHomeStayService _accoHomeStayService;

}