/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BrokerDeclarationInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerDeclarationInfoService
 * @generated
 */
public class BrokerDeclarationInfoServiceWrapper
	implements BrokerDeclarationInfoService,
			   ServiceWrapper<BrokerDeclarationInfoService> {

	public BrokerDeclarationInfoServiceWrapper() {
		this(null);
	}

	public BrokerDeclarationInfoServiceWrapper(
		BrokerDeclarationInfoService brokerDeclarationInfoService) {

		_brokerDeclarationInfoService = brokerDeclarationInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _brokerDeclarationInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public BrokerDeclarationInfoService getWrappedService() {
		return _brokerDeclarationInfoService;
	}

	@Override
	public void setWrappedService(
		BrokerDeclarationInfoService brokerDeclarationInfoService) {

		_brokerDeclarationInfoService = brokerDeclarationInfoService;
	}

	private BrokerDeclarationInfoService _brokerDeclarationInfoService;

}