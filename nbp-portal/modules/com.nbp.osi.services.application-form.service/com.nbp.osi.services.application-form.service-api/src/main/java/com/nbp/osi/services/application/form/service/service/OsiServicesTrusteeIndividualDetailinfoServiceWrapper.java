/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesTrusteeIndividualDetailinfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeIndividualDetailinfoService
 * @generated
 */
public class OsiServicesTrusteeIndividualDetailinfoServiceWrapper
	implements OsiServicesTrusteeIndividualDetailinfoService,
			   ServiceWrapper<OsiServicesTrusteeIndividualDetailinfoService> {

	public OsiServicesTrusteeIndividualDetailinfoServiceWrapper() {
		this(null);
	}

	public OsiServicesTrusteeIndividualDetailinfoServiceWrapper(
		OsiServicesTrusteeIndividualDetailinfoService
			osiServicesTrusteeIndividualDetailinfoService) {

		_osiServicesTrusteeIndividualDetailinfoService =
			osiServicesTrusteeIndividualDetailinfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesTrusteeIndividualDetailinfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesTrusteeIndividualDetailinfoService getWrappedService() {
		return _osiServicesTrusteeIndividualDetailinfoService;
	}

	@Override
	public void setWrappedService(
		OsiServicesTrusteeIndividualDetailinfoService
			osiServicesTrusteeIndividualDetailinfoService) {

		_osiServicesTrusteeIndividualDetailinfoService =
			osiServicesTrusteeIndividualDetailinfoService;
	}

	private OsiServicesTrusteeIndividualDetailinfoService
		_osiServicesTrusteeIndividualDetailinfoService;

}