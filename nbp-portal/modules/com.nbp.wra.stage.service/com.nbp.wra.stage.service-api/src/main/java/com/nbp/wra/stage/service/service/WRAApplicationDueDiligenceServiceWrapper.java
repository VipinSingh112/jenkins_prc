/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WRAApplicationDueDiligenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationDueDiligenceService
 * @generated
 */
public class WRAApplicationDueDiligenceServiceWrapper
	implements ServiceWrapper<WRAApplicationDueDiligenceService>,
			   WRAApplicationDueDiligenceService {

	public WRAApplicationDueDiligenceServiceWrapper() {
		this(null);
	}

	public WRAApplicationDueDiligenceServiceWrapper(
		WRAApplicationDueDiligenceService wraApplicationDueDiligenceService) {

		_wraApplicationDueDiligenceService = wraApplicationDueDiligenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationDueDiligenceService.getOSGiServiceIdentifier();
	}

	@Override
	public WRAApplicationDueDiligenceService getWrappedService() {
		return _wraApplicationDueDiligenceService;
	}

	@Override
	public void setWrappedService(
		WRAApplicationDueDiligenceService wraApplicationDueDiligenceService) {

		_wraApplicationDueDiligenceService = wraApplicationDueDiligenceService;
	}

	private WRAApplicationDueDiligenceService
		_wraApplicationDueDiligenceService;

}