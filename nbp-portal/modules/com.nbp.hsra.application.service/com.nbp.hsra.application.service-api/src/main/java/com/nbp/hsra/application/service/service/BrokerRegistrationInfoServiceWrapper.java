/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BrokerRegistrationInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerRegistrationInfoService
 * @generated
 */
public class BrokerRegistrationInfoServiceWrapper
	implements BrokerRegistrationInfoService,
			   ServiceWrapper<BrokerRegistrationInfoService> {

	public BrokerRegistrationInfoServiceWrapper() {
		this(null);
	}

	public BrokerRegistrationInfoServiceWrapper(
		BrokerRegistrationInfoService brokerRegistrationInfoService) {

		_brokerRegistrationInfoService = brokerRegistrationInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _brokerRegistrationInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public BrokerRegistrationInfoService getWrappedService() {
		return _brokerRegistrationInfoService;
	}

	@Override
	public void setWrappedService(
		BrokerRegistrationInfoService brokerRegistrationInfoService) {

		_brokerRegistrationInfoService = brokerRegistrationInfoService;
	}

	private BrokerRegistrationInfoService _brokerRegistrationInfoService;

}