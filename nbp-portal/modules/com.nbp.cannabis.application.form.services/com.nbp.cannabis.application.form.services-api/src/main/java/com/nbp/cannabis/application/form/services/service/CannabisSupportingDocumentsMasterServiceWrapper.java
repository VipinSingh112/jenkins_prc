/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisSupportingDocumentsMasterService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupportingDocumentsMasterService
 * @generated
 */
public class CannabisSupportingDocumentsMasterServiceWrapper
	implements CannabisSupportingDocumentsMasterService,
			   ServiceWrapper<CannabisSupportingDocumentsMasterService> {

	public CannabisSupportingDocumentsMasterServiceWrapper() {
		this(null);
	}

	public CannabisSupportingDocumentsMasterServiceWrapper(
		CannabisSupportingDocumentsMasterService
			cannabisSupportingDocumentsMasterService) {

		_cannabisSupportingDocumentsMasterService =
			cannabisSupportingDocumentsMasterService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisSupportingDocumentsMasterService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisSupportingDocumentsMasterService getWrappedService() {
		return _cannabisSupportingDocumentsMasterService;
	}

	@Override
	public void setWrappedService(
		CannabisSupportingDocumentsMasterService
			cannabisSupportingDocumentsMasterService) {

		_cannabisSupportingDocumentsMasterService =
			cannabisSupportingDocumentsMasterService;
	}

	private CannabisSupportingDocumentsMasterService
		_cannabisSupportingDocumentsMasterService;

}