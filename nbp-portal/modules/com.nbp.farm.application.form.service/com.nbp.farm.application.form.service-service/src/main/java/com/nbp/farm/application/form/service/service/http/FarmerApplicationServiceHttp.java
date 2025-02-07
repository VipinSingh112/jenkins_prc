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

package com.nbp.farm.application.form.service.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.nbp.farm.application.form.service.service.FarmerApplicationServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>FarmerApplicationServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FarmerApplicationServiceHttp {

	public static java.util.List
		<com.nbp.farm.application.form.service.model.FarmerApplication>
			getFarmerByStatus_UserId(
				HttpPrincipal httpPrincipal, int status, long userId) {

		try {
			MethodKey methodKey = new MethodKey(
				FarmerApplicationServiceUtil.class, "getFarmerByStatus_UserId",
				_getFarmerByStatus_UserIdParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, status, userId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.nbp.farm.application.form.service.model.FarmerApplication>)
					returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.nbp.farm.application.form.service.model.FarmerApplication
			getFarmerByAppNum(
				HttpPrincipal httpPrincipal, String applicationNumber)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		try {
			MethodKey methodKey = new MethodKey(
				FarmerApplicationServiceUtil.class, "getFarmerByAppNum",
				_getFarmerByAppNumParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, applicationNumber);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.nbp.farm.application.form.service.exception.
							NoSuchFarmerApplicationException) {

					throw (com.nbp.farm.application.form.service.exception.
						NoSuchFarmerApplicationException)exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.nbp.farm.application.form.service.model.
				FarmerApplication)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		FarmerApplicationServiceHttp.class);

	private static final Class<?>[] _getFarmerByStatus_UserIdParameterTypes0 =
		new Class[] {int.class, long.class};
	private static final Class<?>[] _getFarmerByAppNumParameterTypes1 =
		new Class[] {String.class};

}