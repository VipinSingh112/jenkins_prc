/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicRecommendationsDecisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecisionService
 * @generated
 */
public class MiicRecommendationsDecisionServiceWrapper
	implements MiicRecommendationsDecisionService,
			   ServiceWrapper<MiicRecommendationsDecisionService> {

	public MiicRecommendationsDecisionServiceWrapper() {
		this(null);
	}

	public MiicRecommendationsDecisionServiceWrapper(
		MiicRecommendationsDecisionService miicRecommendationsDecisionService) {

		_miicRecommendationsDecisionService =
			miicRecommendationsDecisionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicRecommendationsDecisionService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicRecommendationsDecisionService getWrappedService() {
		return _miicRecommendationsDecisionService;
	}

	@Override
	public void setWrappedService(
		MiicRecommendationsDecisionService miicRecommendationsDecisionService) {

		_miicRecommendationsDecisionService =
			miicRecommendationsDecisionService;
	}

	private MiicRecommendationsDecisionService
		_miicRecommendationsDecisionService;

}