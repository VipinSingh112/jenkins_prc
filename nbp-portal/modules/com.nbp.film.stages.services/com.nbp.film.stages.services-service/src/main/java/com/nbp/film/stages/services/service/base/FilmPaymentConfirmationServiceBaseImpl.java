/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.film.stages.services.model.FilmPaymentConfirmation;
import com.nbp.film.stages.services.service.FilmPaymentConfirmationService;
import com.nbp.film.stages.services.service.persistence.FilmApplicationRegisterPersistence;
import com.nbp.film.stages.services.service.persistence.FilmApplicationStagesPersistence;
import com.nbp.film.stages.services.service.persistence.FilmDeskVerificationPersistence;
import com.nbp.film.stages.services.service.persistence.FilmFullRegistrationPersistence;
import com.nbp.film.stages.services.service.persistence.FilmPaymentConfirmationPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the film payment confirmation remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.film.stages.services.service.impl.FilmPaymentConfirmationServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.film.stages.services.service.impl.FilmPaymentConfirmationServiceImpl
 * @generated
 */
public abstract class FilmPaymentConfirmationServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FilmPaymentConfirmationService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FilmPaymentConfirmationService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.film.stages.services.service.FilmPaymentConfirmationServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FilmPaymentConfirmationService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		filmPaymentConfirmationService =
			(FilmPaymentConfirmationService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FilmPaymentConfirmationService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FilmPaymentConfirmation.class;
	}

	protected String getModelClassName() {
		return FilmPaymentConfirmation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				filmPaymentConfirmationPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected FilmApplicationRegisterPersistence
		filmApplicationRegisterPersistence;

	@Reference
	protected FilmApplicationStagesPersistence filmApplicationStagesPersistence;

	@Reference
	protected FilmDeskVerificationPersistence filmDeskVerificationPersistence;

	@Reference
	protected FilmFullRegistrationPersistence filmFullRegistrationPersistence;

	@Reference
	protected
		com.nbp.film.stages.services.service.FilmPaymentConfirmationLocalService
			filmPaymentConfirmationLocalService;

	protected FilmPaymentConfirmationService filmPaymentConfirmationService;

	@Reference
	protected FilmPaymentConfirmationPersistence
		filmPaymentConfirmationPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	private static final Log _log = LogFactoryUtil.getLog(
		FilmPaymentConfirmationServiceBaseImpl.class);

}