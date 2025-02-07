/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>OsiServicesTrusteeCompanyinfoServiceUtil</code> service
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
public class OsiServicesTrusteeCompanyinfoServiceHttp {

	public static com.nbp.osi.services.application.form.service.model.
		OsiServicesTrusteeCompanyinfo getOsiServicesTrusteeCompanyinfoById(
				HttpPrincipal httpPrincipal, long applicationId)
			throws com.nbp.osi.services.application.form.service.exception.
				NoSuchOsiServicesTrusteeCompanyinfoException {

		try {
			MethodKey methodKey = new MethodKey(
				OsiServicesTrusteeCompanyinfoServiceUtil.class,
				"getOsiServicesTrusteeCompanyinfoById",
				_getOsiServicesTrusteeCompanyinfoByIdParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, applicationId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.nbp.osi.services.application.form.service.exception.
							NoSuchOsiServicesTrusteeCompanyinfoException) {

					throw (com.nbp.osi.services.application.form.service.
						exception.NoSuchOsiServicesTrusteeCompanyinfoException)
							exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.nbp.osi.services.application.form.service.model.
				OsiServicesTrusteeCompanyinfo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		OsiServicesTrusteeCompanyinfoServiceHttp.class);

	private static final Class<?>[]
		_getOsiServicesTrusteeCompanyinfoByIdParameterTypes0 = new Class[] {
			long.class
		};

}