/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QueryLicenceCertificateService}.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificateService
 * @generated
 */
public class QueryLicenceCertificateServiceWrapper
	implements QueryLicenceCertificateService,
			   ServiceWrapper<QueryLicenceCertificateService> {

	public QueryLicenceCertificateServiceWrapper() {
		this(null);
	}

	public QueryLicenceCertificateServiceWrapper(
		QueryLicenceCertificateService queryLicenceCertificateService) {

		_queryLicenceCertificateService = queryLicenceCertificateService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _queryLicenceCertificateService.getOSGiServiceIdentifier();
	}

	@Override
	public QueryLicenceCertificateService getWrappedService() {
		return _queryLicenceCertificateService;
	}

	@Override
	public void setWrappedService(
		QueryLicenceCertificateService queryLicenceCertificateService) {

		_queryLicenceCertificateService = queryLicenceCertificateService;
	}

	private QueryLicenceCertificateService _queryLicenceCertificateService;

}