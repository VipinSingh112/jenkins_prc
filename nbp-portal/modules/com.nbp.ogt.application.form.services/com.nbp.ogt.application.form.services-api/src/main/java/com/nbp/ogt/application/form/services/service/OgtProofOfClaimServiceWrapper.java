/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OgtProofOfClaimService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtProofOfClaimService
 * @generated
 */
public class OgtProofOfClaimServiceWrapper
	implements OgtProofOfClaimService, ServiceWrapper<OgtProofOfClaimService> {

	public OgtProofOfClaimServiceWrapper() {
		this(null);
	}

	public OgtProofOfClaimServiceWrapper(
		OgtProofOfClaimService ogtProofOfClaimService) {

		_ogtProofOfClaimService = ogtProofOfClaimService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtProofOfClaimService.getOSGiServiceIdentifier();
	}

	@Override
	public OgtProofOfClaimService getWrappedService() {
		return _ogtProofOfClaimService;
	}

	@Override
	public void setWrappedService(
		OgtProofOfClaimService ogtProofOfClaimService) {

		_ogtProofOfClaimService = ogtProofOfClaimService;
	}

	private OgtProofOfClaimService _ogtProofOfClaimService;

}