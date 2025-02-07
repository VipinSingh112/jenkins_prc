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

import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;
import com.nbp.fire.brigade.stage.service.service.FireBrigadeCertificateService;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeApplicationStagePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeCertificatePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeInspectionPersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadePaymentConfirmationPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the fire brigade certificate remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeCertificateServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeCertificateServiceImpl
 * @generated
 */
public abstract class FireBrigadeCertificateServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FireBrigadeCertificateService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FireBrigadeCertificateService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.fire.brigade.stage.service.service.FireBrigadeCertificateServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FireBrigadeCertificateService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		fireBrigadeCertificateService = (FireBrigadeCertificateService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FireBrigadeCertificateService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FireBrigadeCertificate.class;
	}

	protected String getModelClassName() {
		return FireBrigadeCertificate.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				fireBrigadeCertificatePersistence.getDataSource();

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
	protected com.nbp.fire.brigade.stage.service.service.
		FireBrigadeCertificateLocalService fireBrigadeCertificateLocalService;

	protected FireBrigadeCertificateService fireBrigadeCertificateService;

	@Reference
	protected FireBrigadeCertificatePersistence
		fireBrigadeCertificatePersistence;

	@Reference
	protected FireBrigadeInspectionPersistence fireBrigadeInspectionPersistence;

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
		FireBrigadeCertificateServiceBaseImpl.class);

}