/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.base;

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

import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;
import com.nbp.acquire.application.form.service.service.AcquirePaymentPlanService;
import com.nbp.acquire.application.form.service.service.persistence.AcquireApplicationDetailsPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireApplicationPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireCurrentStagePersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireDocumentListPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandApplicantDetailsPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandEmploymentPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandPropertyDetailsPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquirePaymentPlanPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquirePropertyDetailsPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the acquire payment plan remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.acquire.application.form.service.service.impl.AcquirePaymentPlanServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.acquire.application.form.service.service.impl.AcquirePaymentPlanServiceImpl
 * @generated
 */
public abstract class AcquirePaymentPlanServiceBaseImpl
	extends BaseServiceImpl
	implements AcquirePaymentPlanService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AcquirePaymentPlanService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.acquire.application.form.service.service.AcquirePaymentPlanServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AcquirePaymentPlanService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		acquirePaymentPlanService = (AcquirePaymentPlanService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AcquirePaymentPlanService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AcquirePaymentPlan.class;
	}

	protected String getModelClassName() {
		return AcquirePaymentPlan.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				acquirePaymentPlanPersistence.getDataSource();

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
	protected AcquireApplicationPersistence acquireApplicationPersistence;

	@Reference
	protected AcquireApplicationDetailsPersistence
		acquireApplicationDetailsPersistence;

	@Reference
	protected AcquireCurrentStagePersistence acquireCurrentStagePersistence;

	@Reference
	protected AcquireDocumentListPersistence acquireDocumentListPersistence;

	@Reference
	protected AcquireLandApplicantDetailsPersistence
		acquireLandApplicantDetailsPersistence;

	@Reference
	protected AcquireLandEmploymentPersistence acquireLandEmploymentPersistence;

	@Reference
	protected AcquireLandPropertyDetailsPersistence
		acquireLandPropertyDetailsPersistence;

	@Reference
	protected com.nbp.acquire.application.form.service.service.
		AcquirePaymentPlanLocalService acquirePaymentPlanLocalService;

	protected AcquirePaymentPlanService acquirePaymentPlanService;

	@Reference
	protected AcquirePaymentPlanPersistence acquirePaymentPlanPersistence;

	@Reference
	protected AcquirePropertyDetailsPersistence
		acquirePropertyDetailsPersistence;

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
		AcquirePaymentPlanServiceBaseImpl.class);

}