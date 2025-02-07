/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.npm.cannabis.application.stages.services.service.CannabisApplicationStagesServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>CannabisApplicationStagesServiceUtil</code> service
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
public class CannabisApplicationStagesServiceHttp {

	public static java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages> getCannabisApplicationStages(
					HttpPrincipal httpPrincipal, String caseId)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		try {
			MethodKey methodKey = new MethodKey(
				CannabisApplicationStagesServiceUtil.class,
				"getCannabisApplicationStages",
				_getCannabisApplicationStagesParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, caseId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.npm.cannabis.application.stages.services.exception.
							NoSuchCannabisApplicationStagesException) {

					throw (com.npm.cannabis.application.stages.services.
						exception.NoSuchCannabisApplicationStagesException)
							exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.npm.cannabis.application.stages.services.model.
					CannabisApplicationStages>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages updateCannabisApplicationStages(
					HttpPrincipal httpPrincipal, String caseId,
					String stageName, java.util.Date stageStartDate,
					java.util.Date stageEndDate, String duration,
					String stageStatus)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		try {
			MethodKey methodKey = new MethodKey(
				CannabisApplicationStagesServiceUtil.class,
				"updateCannabisApplicationStages",
				_updateCannabisApplicationStagesParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, caseId, stageName, stageStartDate, stageEndDate,
				duration, stageStatus);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.npm.cannabis.application.stages.services.exception.
							NoSuchCannabisApplicationStagesException) {

					throw (com.npm.cannabis.application.stages.services.
						exception.NoSuchCannabisApplicationStagesException)
							exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.npm.cannabis.application.stages.services.model.
				CannabisApplicationStages)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CannabisApplicationStagesServiceHttp.class);

	private static final Class<?>[]
		_getCannabisApplicationStagesParameterTypes0 = new Class[] {
			String.class
		};
	private static final Class<?>[]
		_updateCannabisApplicationStagesParameterTypes1 = new Class[] {
			String.class, String.class, java.util.Date.class,
			java.util.Date.class, String.class, String.class
		};

}