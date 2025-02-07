/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationStagesService
 * @generated
 */
public class MiicApplicationStagesServiceWrapper
	implements MiicApplicationStagesService,
			   ServiceWrapper<MiicApplicationStagesService> {

	public MiicApplicationStagesServiceWrapper() {
		this(null);
	}

	public MiicApplicationStagesServiceWrapper(
		MiicApplicationStagesService miicApplicationStagesService) {

		_miicApplicationStagesService = miicApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicApplicationStagesService getWrappedService() {
		return _miicApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		MiicApplicationStagesService miicApplicationStagesService) {

		_miicApplicationStagesService = miicApplicationStagesService;
	}

	private MiicApplicationStagesService _miicApplicationStagesService;

}