/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service;

import com.nbp.farm.application.form.service.model.FarmerApplication;

import java.util.List;

/**
 * Provides the remote service utility for FarmerApplication. This utility wraps
 * <code>com.nbp.farm.application.form.service.service.impl.FarmerApplicationServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationService
 * @generated
 */
public class FarmerApplicationServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.form.service.service.impl.FarmerApplicationServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static FarmerApplication getFarmerByAppNum(String applicationNumber)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getService().getFarmerByAppNum(applicationNumber);
	}

	public static List<FarmerApplication> getFarmerByStatus_UserId(
		int status, long userId) {

		return getService().getFarmerByStatus_UserId(status, userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static FarmerApplicationService getService() {
		return _service;
	}

	private static volatile FarmerApplicationService _service;

}