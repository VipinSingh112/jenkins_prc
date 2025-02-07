/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquireDocumentListService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDocumentListService
 * @generated
 */
public class AcquireDocumentListServiceWrapper
	implements AcquireDocumentListService,
			   ServiceWrapper<AcquireDocumentListService> {

	public AcquireDocumentListServiceWrapper() {
		this(null);
	}

	public AcquireDocumentListServiceWrapper(
		AcquireDocumentListService acquireDocumentListService) {

		_acquireDocumentListService = acquireDocumentListService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireDocumentListService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquireDocumentListService getWrappedService() {
		return _acquireDocumentListService;
	}

	@Override
	public void setWrappedService(
		AcquireDocumentListService acquireDocumentListService) {

		_acquireDocumentListService = acquireDocumentListService;
	}

	private AcquireDocumentListService _acquireDocumentListService;

}