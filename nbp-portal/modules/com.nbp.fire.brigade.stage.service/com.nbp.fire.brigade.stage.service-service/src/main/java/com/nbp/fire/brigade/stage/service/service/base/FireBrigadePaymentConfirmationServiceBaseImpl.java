/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.base;

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

import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation;
import com.nbp.fire.brigade.stage.service.service.FireBrigadePaymentConfirmationService;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeApplicationStagePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeCertificatePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeInspectionPersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadePaymentConfirmationPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the fire brigade payment confirmation remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.fire.brigade.stage.service.service.impl.FireBrigadePaymentConfirmationServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.fire.brigade.stage.service.service.impl.FireBrigadePaymentConfirmationServiceImpl
 * @generated
 */
public abstract class FireBrigadePaymentConfirmationServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FireBrigadePaymentConfirmationService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FireBrigadePaymentConfirmationService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.fire.brigade.stage.service.service.FireBrigadePaymentConfirmationServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FireBrigadePaymentConfirmationService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		fireBrigadePaymentConfirmationService =
			(FireBrigadePaymentConfirmationService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FireBrigadePaymentConfirmationService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FireBrigadePaymentConfirmation.class;
	}

	protected String getModelClassName() {
		return FireBrigadePaymentConfirmation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				fireBrigadePaymentConfirmationPersistence.getDataSource();

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
	protected FireBrigadeApplicationStagePersistence
		fireBrigadeApplicationStagePersistence;

	@Reference
	protected FireBrigadeCertificatePersistence
		fireBrigadeCertificatePersistence;

	@Reference
	protected FireBrigadeInspectionPersistence fireBrigadeInspectionPersistence;

	@Reference
	protected com.nbp.fire.brigade.stage.service.service.
		FireBrigadePaymentConfirmationLocalService
			fireBrigadePaymentConfirmationLocalService;

	protected FireBrigadePaymentConfirmationService
		fireBrigadePaymentConfirmationService;

	@Reference
	protected FireBrigadePaymentConfirmationPersistence
		fireBrigadePaymentConfirmationPersistence;

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
		FireBrigadePaymentConfirmationServiceBaseImpl.class);

}