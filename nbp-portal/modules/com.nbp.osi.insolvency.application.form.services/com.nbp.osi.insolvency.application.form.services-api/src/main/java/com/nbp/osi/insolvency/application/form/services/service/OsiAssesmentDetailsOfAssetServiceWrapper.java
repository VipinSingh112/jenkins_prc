/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiAssesmentDetailsOfAssetService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssesmentDetailsOfAssetService
 * @generated
 */
public class OsiAssesmentDetailsOfAssetServiceWrapper
	implements OsiAssesmentDetailsOfAssetService,
			   ServiceWrapper<OsiAssesmentDetailsOfAssetService> {

	public OsiAssesmentDetailsOfAssetServiceWrapper() {
		this(null);
	}

	public OsiAssesmentDetailsOfAssetServiceWrapper(
		OsiAssesmentDetailsOfAssetService osiAssesmentDetailsOfAssetService) {

		_osiAssesmentDetailsOfAssetService = osiAssesmentDetailsOfAssetService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiAssesmentDetailsOfAssetService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiAssesmentDetailsOfAssetService getWrappedService() {
		return _osiAssesmentDetailsOfAssetService;
	}

	@Override
	public void setWrappedService(
		OsiAssesmentDetailsOfAssetService osiAssesmentDetailsOfAssetService) {

		_osiAssesmentDetailsOfAssetService = osiAssesmentDetailsOfAssetService;
	}

	private OsiAssesmentDetailsOfAssetService
		_osiAssesmentDetailsOfAssetService;

}