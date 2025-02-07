/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacPaymentVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacPaymentVerificationService
 * @generated
 */
public class JanaacPaymentVerificationServiceWrapper
	implements JanaacPaymentVerificationService,
			   ServiceWrapper<JanaacPaymentVerificationService> {

	public JanaacPaymentVerificationServiceWrapper() {
		this(null);
	}

	public JanaacPaymentVerificationServiceWrapper(
		JanaacPaymentVerificationService janaacPaymentVerificationService) {

		_janaacPaymentVerificationService = janaacPaymentVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacPaymentVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacPaymentVerificationService getWrappedService() {
		return _janaacPaymentVerificationService;
	}

	@Override
	public void setWrappedService(
		JanaacPaymentVerificationService janaacPaymentVerificationService) {

		_janaacPaymentVerificationService = janaacPaymentVerificationService;
	}

	private JanaacPaymentVerificationService _janaacPaymentVerificationService;

}