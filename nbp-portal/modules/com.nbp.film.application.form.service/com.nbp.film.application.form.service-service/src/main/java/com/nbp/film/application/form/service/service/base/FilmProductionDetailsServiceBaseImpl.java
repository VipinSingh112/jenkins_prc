/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.base;

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

import com.nbp.film.application.form.service.model.FilmProductionDetails;
import com.nbp.film.application.form.service.service.FilmProductionDetailsService;
import com.nbp.film.application.form.service.service.persistence.FilmAdditionalEquipmentListPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationCurrentStagePersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationPaymentPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmCompanyDetailsPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmEquipmentListPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmOtherDetailsPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmProductionDetailsPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the film production details remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.film.application.form.service.service.impl.FilmProductionDetailsServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.film.application.form.service.service.impl.FilmProductionDetailsServiceImpl
 * @generated
 */
public abstract class FilmProductionDetailsServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FilmProductionDetailsService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FilmProductionDetailsService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.film.application.form.service.service.FilmProductionDetailsServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FilmProductionDetailsService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		filmProductionDetailsService = (FilmProductionDetailsService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FilmProductionDetailsService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FilmProductionDetails.class;
	}

	protected String getModelClassName() {
		return FilmProductionDetails.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				filmProductionDetailsPersistence.getDataSource();

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
	protected FilmAdditionalEquipmentListPersistence
		filmAdditionalEquipmentListPersistence;

	@Reference
	protected FilmApplicationPersistence filmApplicationPersistence;

	@Reference
	protected FilmApplicationCurrentStagePersistence
		filmApplicationCurrentStagePersistence;

	@Reference
	protected FilmApplicationPaymentPersistence
		filmApplicationPaymentPersistence;

	@Reference
	protected FilmCompanyDetailsPersistence filmCompanyDetailsPersistence;

	@Reference
	protected FilmEquipmentListPersistence filmEquipmentListPersistence;

	@Reference
	protected FilmOtherDetailsPersistence filmOtherDetailsPersistence;

	@Reference
	protected com.nbp.film.application.form.service.service.
		FilmProductionDetailsLocalService filmProductionDetailsLocalService;

	protected FilmProductionDetailsService filmProductionDetailsService;

	@Reference
	protected FilmProductionDetailsPersistence filmProductionDetailsPersistence;

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
		FilmProductionDetailsServiceBaseImpl.class);

}