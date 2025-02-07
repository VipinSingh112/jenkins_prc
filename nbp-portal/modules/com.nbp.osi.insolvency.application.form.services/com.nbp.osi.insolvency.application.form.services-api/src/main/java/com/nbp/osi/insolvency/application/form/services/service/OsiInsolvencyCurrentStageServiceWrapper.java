/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsolvencyCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyCurrentStageService
 * @generated
 */
public class OsiInsolvencyCurrentStageServiceWrapper
	implements OsiInsolvencyCurrentStageService,
			   ServiceWrapper<OsiInsolvencyCurrentStageService> {

	public OsiInsolvencyCurrentStageServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyCurrentStageServiceWrapper(
		OsiInsolvencyCurrentStageService osiInsolvencyCurrentStageService) {

		_osiInsolvencyCurrentStageService = osiInsolvencyCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsolvencyCurrentStageService getWrappedService() {
		return _osiInsolvencyCurrentStageService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyCurrentStageService osiInsolvencyCurrentStageService) {

		_osiInsolvencyCurrentStageService = osiInsolvencyCurrentStageService;
	}

	private OsiInsolvencyCurrentStageService _osiInsolvencyCurrentStageService;

}