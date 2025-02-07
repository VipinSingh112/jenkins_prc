/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicSuspensionOfCetService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetService
 * @generated
 */
public class MiicSuspensionOfCetServiceWrapper
	implements MiicSuspensionOfCetService,
			   ServiceWrapper<MiicSuspensionOfCetService> {

	public MiicSuspensionOfCetServiceWrapper() {
		this(null);
	}

	public MiicSuspensionOfCetServiceWrapper(
		MiicSuspensionOfCetService miicSuspensionOfCetService) {

		_miicSuspensionOfCetService = miicSuspensionOfCetService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicSuspensionOfCetService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicSuspensionOfCetService getWrappedService() {
		return _miicSuspensionOfCetService;
	}

	@Override
	public void setWrappedService(
		MiicSuspensionOfCetService miicSuspensionOfCetService) {

		_miicSuspensionOfCetService = miicSuspensionOfCetService;
	}

	private MiicSuspensionOfCetService _miicSuspensionOfCetService;

}