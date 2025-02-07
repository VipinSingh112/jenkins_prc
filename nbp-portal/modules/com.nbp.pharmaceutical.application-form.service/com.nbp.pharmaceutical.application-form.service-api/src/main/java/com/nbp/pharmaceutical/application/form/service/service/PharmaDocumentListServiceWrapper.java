/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaDocumentListService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDocumentListService
 * @generated
 */
public class PharmaDocumentListServiceWrapper
	implements PharmaDocumentListService,
			   ServiceWrapper<PharmaDocumentListService> {

	public PharmaDocumentListServiceWrapper() {
		this(null);
	}

	public PharmaDocumentListServiceWrapper(
		PharmaDocumentListService pharmaDocumentListService) {

		_pharmaDocumentListService = pharmaDocumentListService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaDocumentListService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaDocumentListService getWrappedService() {
		return _pharmaDocumentListService;
	}

	@Override
	public void setWrappedService(
		PharmaDocumentListService pharmaDocumentListService) {

		_pharmaDocumentListService = pharmaDocumentListService;
	}

	private PharmaDocumentListService _pharmaDocumentListService;

}