/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicSuspensionOfCetAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetAddService
 * @generated
 */
public class MiicSuspensionOfCetAddServiceWrapper
	implements MiicSuspensionOfCetAddService,
			   ServiceWrapper<MiicSuspensionOfCetAddService> {

	public MiicSuspensionOfCetAddServiceWrapper() {
		this(null);
	}

	public MiicSuspensionOfCetAddServiceWrapper(
		MiicSuspensionOfCetAddService miicSuspensionOfCetAddService) {

		_miicSuspensionOfCetAddService = miicSuspensionOfCetAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSuspensionOfCetAddService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicSuspensionOfCetAddService getWrappedService() {
		return _miicSuspensionOfCetAddService;
	}

	@Override
	public void setWrappedService(
		MiicSuspensionOfCetAddService miicSuspensionOfCetAddService) {

		_miicSuspensionOfCetAddService = miicSuspensionOfCetAddService;
	}

	private MiicSuspensionOfCetAddService _miicSuspensionOfCetAddService;

}