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

import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;
import com.nbp.film.application.form.service.service.FilmAdditionalEquipmentListService;
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
 * Provides the base implementation for the film additional equipment list remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.film.application.form.service.service.impl.FilmAdditionalEquipmentListServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.film.application.form.service.service.impl.FilmAdditionalEquipmentListServiceImpl
 * @generated
 */
public abstract class FilmAdditionalEquipmentListServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FilmAdditionalEquipmentListService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FilmAdditionalEquipmentListService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.film.application.form.service.service.FilmAdditionalEquipmentListServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FilmAdditionalEquipmentListService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		filmAdditionalEquipmentListService =
			(FilmAdditionalEquipmentListService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FilmAdditionalEquipmentListService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FilmAdditionalEquipmentList.class;
	}

	protected String getModelClassName() {
		return FilmAdditionalEquipmentList.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				filmAdditionalEquipmentListPersistence.getDataSource();

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
	protected com.nbp.film.application.form.service.service.
		FilmAdditionalEquipmentListLocalService
			filmAdditionalEquipmentListLocalService;

	protected FilmAdditionalEquipmentListService
		filmAdditionalEquipmentListService;

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
		FilmAdditionalEquipmentListServiceBaseImpl.class);

}