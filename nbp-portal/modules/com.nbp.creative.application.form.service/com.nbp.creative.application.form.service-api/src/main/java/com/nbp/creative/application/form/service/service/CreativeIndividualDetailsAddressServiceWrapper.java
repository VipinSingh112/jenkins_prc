/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeIndividualDetailsAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddressService
 * @generated
 */
public class CreativeIndividualDetailsAddressServiceWrapper
	implements CreativeIndividualDetailsAddressService,
			   ServiceWrapper<CreativeIndividualDetailsAddressService> {

	public CreativeIndividualDetailsAddressServiceWrapper() {
		this(null);
	}

	public CreativeIndividualDetailsAddressServiceWrapper(
		CreativeIndividualDetailsAddressService
			creativeIndividualDetailsAddressService) {

		_creativeIndividualDetailsAddressService =
			creativeIndividualDetailsAddressService;
	}

	@Override
	public com.nbp.creative.application.form.service.model.
		CreativeIndividualDetailsAddress getCreativeCompanyAddressById(
			long creativeApplicationId) {

		return _creativeIndividualDetailsAddressService.
			getCreativeCompanyAddressById(creativeApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeIndividualDetailsAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeIndividualDetailsAddressService getWrappedService() {
		return _creativeIndividualDetailsAddressService;
	}

	@Override
	public void setWrappedService(
		CreativeIndividualDetailsAddressService
			creativeIndividualDetailsAddressService) {

		_creativeIndividualDetailsAddressService =
			creativeIndividualDetailsAddressService;
	}

	private CreativeIndividualDetailsAddressService
		_creativeIndividualDetailsAddressService;

}