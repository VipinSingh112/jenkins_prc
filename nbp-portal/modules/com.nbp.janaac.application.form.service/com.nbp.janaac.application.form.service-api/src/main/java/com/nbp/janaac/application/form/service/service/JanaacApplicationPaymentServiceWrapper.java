/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JanaacApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationPaymentService
 * @generated
 */
public class JanaacApplicationPaymentServiceWrapper
	implements JanaacApplicationPaymentService,
			   ServiceWrapper<JanaacApplicationPaymentService> {

	public JanaacApplicationPaymentServiceWrapper() {
		this(null);
	}

	public JanaacApplicationPaymentServiceWrapper(
		JanaacApplicationPaymentService janaacApplicationPaymentService) {

		_janaacApplicationPaymentService = janaacApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacApplicationPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public JanaacApplicationPaymentService getWrappedService() {
		return _janaacApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		JanaacApplicationPaymentService janaacApplicationPaymentService) {

		_janaacApplicationPaymentService = janaacApplicationPaymentService;
	}

	private JanaacApplicationPaymentService _janaacApplicationPaymentService;

}