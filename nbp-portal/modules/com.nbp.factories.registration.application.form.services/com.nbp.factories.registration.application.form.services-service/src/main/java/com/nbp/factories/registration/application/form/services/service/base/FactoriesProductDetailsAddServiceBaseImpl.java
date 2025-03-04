/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.base;

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

import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;
import com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddService;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesAppPaymentPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesApplicationRegistrationPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProcessedFoodActPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProductDetailsAddPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesRegstCurrentStagePersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesStandardActInfoPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the factories product details add remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.factories.registration.application.form.services.service.impl.FactoriesProductDetailsAddServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.factories.registration.application.form.services.service.impl.FactoriesProductDetailsAddServiceImpl
 * @generated
 */
public abstract class FactoriesProductDetailsAddServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FactoriesProductDetailsAddService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FactoriesProductDetailsAddService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FactoriesProductDetailsAddService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		factoriesProductDetailsAddService =
			(FactoriesProductDetailsAddService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FactoriesProductDetailsAddService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FactoriesProductDetailsAdd.class;
	}

	protected String getModelClassName() {
		return FactoriesProductDetailsAdd.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				factoriesProductDetailsAddPersistence.getDataSource();

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
	protected FactoriesApplicationRegistrationPersistence
		factoriesApplicationRegistrationPersistence;

	@Reference
	protected FactoriesAppPaymentPersistence factoriesAppPaymentPersistence;

	@Reference
	protected FactoriesProcessedFoodActPersistence
		factoriesProcessedFoodActPersistence;

	@Reference
	protected com.nbp.factories.registration.application.form.services.service.
		FactoriesProductDetailsAddLocalService
			factoriesProductDetailsAddLocalService;

	protected FactoriesProductDetailsAddService
		factoriesProductDetailsAddService;

	@Reference
	protected FactoriesProductDetailsAddPersistence
		factoriesProductDetailsAddPersistence;

	@Reference
	protected FactoriesRegstCurrentStagePersistence
		factoriesRegstCurrentStagePersistence;

	@Reference
	protected FactoriesStandardActInfoPersistence
		factoriesStandardActInfoPersistence;

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
		FactoriesProductDetailsAddServiceBaseImpl.class);

}