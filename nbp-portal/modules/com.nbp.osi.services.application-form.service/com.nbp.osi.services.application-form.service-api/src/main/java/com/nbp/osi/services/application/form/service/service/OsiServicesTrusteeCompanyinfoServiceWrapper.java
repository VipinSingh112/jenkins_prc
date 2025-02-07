/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeCompanyinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfoService
 * @generated
 */
public class OsiServicesTrusteeCompanyinfoServiceWrapper
	implements OsiServicesTrusteeCompanyinfoService,
			   ServiceWrapper<OsiServicesTrusteeCompanyinfoService> {

	public OsiServicesTrusteeCompanyinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeCompanyinfoServiceWrapper(
		OsiServicesTrusteeCompanyinfoService
			osiServicesTrusteeCompanyinfoService) {

		_osiServicesTrusteeCompanyinfoService =
			osiServicesTrusteeCompanyinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeCompanyinfoService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo getOsiServicesTrusteeCompanyinfoById(
				long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesTrusteeCompanyinfoException {

		return _osiServicesTrusteeCompanyinfoService.
			getOsiServicesTrusteeCompanyinfoById(applicationId);
	}

	@Override
	public OsiServicesTrusteeCompanyinfoService getWrappedService() {
		return _osiServicesTrusteeCompanyinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeCompanyinfoService
			osiServicesTrusteeCompanyinfoService) {

		_osiServicesTrusteeCompanyinfoService =
			osiServicesTrusteeCompanyinfoService;
	}

	private OsiServicesTrusteeCompanyinfoService
		_osiServicesTrusteeCompanyinfoService;

}