/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantDirectorPartnerSponsorInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantDirectorPartnerSponsorInfoService
 * @generated
 */
public class SezOccupantDirectorPartnerSponsorInfoServiceWrapper
	implements ServiceWrapper<SezOccupantDirectorPartnerSponsorInfoService>,
			   SezOccupantDirectorPartnerSponsorInfoService {

	public SezOccupantDirectorPartnerSponsorInfoServiceWrapper() {
		this(null);
	}

	public SezOccupantDirectorPartnerSponsorInfoServiceWrapper(
		SezOccupantDirectorPartnerSponsorInfoService
			sezOccupantDirectorPartnerSponsorInfoService) {

		_sezOccupantDirectorPartnerSponsorInfoService =
			sezOccupantDirectorPartnerSponsorInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantDirectorPartnerSponsorInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantDirectorPartnerSponsorInfoService getWrappedService() {
		return _sezOccupantDirectorPartnerSponsorInfoService;
	}

	@Override
	public void setWrappedService(
		SezOccupantDirectorPartnerSponsorInfoService
			sezOccupantDirectorPartnerSponsorInfoService) {

		_sezOccupantDirectorPartnerSponsorInfoService =
			sezOccupantDirectorPartnerSponsorInfoService;
	}

	private SezOccupantDirectorPartnerSponsorInfoService
		_sezOccupantDirectorPartnerSponsorInfoService;

}