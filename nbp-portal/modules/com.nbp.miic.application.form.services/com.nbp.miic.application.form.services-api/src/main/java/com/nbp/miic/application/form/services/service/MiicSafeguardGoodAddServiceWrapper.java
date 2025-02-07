/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicSafeguardGoodAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAddService
 * @generated
 */
public class MiicSafeguardGoodAddServiceWrapper
	implements MiicSafeguardGoodAddService,
			   ServiceWrapper<MiicSafeguardGoodAddService> {

	public MiicSafeguardGoodAddServiceWrapper() {
		this(null);
	}

	public MiicSafeguardGoodAddServiceWrapper(
		MiicSafeguardGoodAddService miicSafeguardGoodAddService) {

		_miicSafeguardGoodAddService = miicSafeguardGoodAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSafeguardGoodAddService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicSafeguardGoodAddService getWrappedService() {
		return _miicSafeguardGoodAddService;
	}

	@Override
	public void setWrappedService(
		MiicSafeguardGoodAddService miicSafeguardGoodAddService) {

		_miicSafeguardGoodAddService = miicSafeguardGoodAddService;
	}

	private MiicSafeguardGoodAddService _miicSafeguardGoodAddService;

}