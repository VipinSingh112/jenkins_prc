/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeIndividualQualificationinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualQualificationinfoService
 * @generated
 */
public class OsiServicesTrusteeIndividualQualificationinfoServiceWrapper
	implements OsiServicesTrusteeIndividualQualificationinfoService,
			   ServiceWrapper
				   <OsiServicesTrusteeIndividualQualificationinfoService> {

	public OsiServicesTrusteeIndividualQualificationinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeIndividualQualificationinfoServiceWrapper(
		OsiServicesTrusteeIndividualQualificationinfoService
			osiServicesTrusteeIndividualQualificationinfoService) {

		_osiServicesTrusteeIndividualQualificationinfoService =
			osiServicesTrusteeIndividualQualificationinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeIndividualQualificationinfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesTrusteeIndividualQualificationinfoService
		getWrappedService() {

		return _osiServicesTrusteeIndividualQualificationinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeIndividualQualificationinfoService
			osiServicesTrusteeIndividualQualificationinfoService) {

		_osiServicesTrusteeIndividualQualificationinfoService =
			osiServicesTrusteeIndividualQualificationinfoService;
	}

	private OsiServicesTrusteeIndividualQualificationinfoService
		_osiServicesTrusteeIndividualQualificationinfoService;

}