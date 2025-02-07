/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicSafeguardMaterialAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardMaterialAddService
 * @generated
 */
public class MiicSafeguardMaterialAddServiceWrapper
	implements MiicSafeguardMaterialAddService,
			   ServiceWrapper<MiicSafeguardMaterialAddService> {

	public MiicSafeguardMaterialAddServiceWrapper() {
		this(null);
	}

	public MiicSafeguardMaterialAddServiceWrapper(
		MiicSafeguardMaterialAddService miicSafeguardMaterialAddService) {

		_miicSafeguardMaterialAddService = miicSafeguardMaterialAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSafeguardMaterialAddService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicSafeguardMaterialAddService getWrappedService() {
		return _miicSafeguardMaterialAddService;
	}

	@Override
	public void setWrappedService(
		MiicSafeguardMaterialAddService miicSafeguardMaterialAddService) {

		_miicSafeguardMaterialAddService = miicSafeguardMaterialAddService;
	}

	private MiicSafeguardMaterialAddService _miicSafeguardMaterialAddService;

}