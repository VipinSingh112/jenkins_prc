/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.base;

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

import com.nbp.acquire.stages.service.model.AcquireValuation;
import com.nbp.acquire.stages.service.service.AcquireValuationService;
import com.nbp.acquire.stages.service.service.persistence.AcquireAdvertisingPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireApplicationStagesPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDeskVerificationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDraftAgreementPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDueDiligencePersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireEvaluationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireExecutionPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireFinalExecutedAgreementPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquirePaymentConfirmationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireTenderingPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireValuationPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the acquire valuation remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.acquire.stages.service.service.impl.AcquireValuationServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.acquire.stages.service.service.impl.AcquireValuationServiceImpl
 * @generated
 */
public abstract class AcquireValuationServiceBaseImpl
	extends BaseServiceImpl
	implements AcquireValuationService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AcquireValuationService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.acquire.stages.service.service.AcquireValuationServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AcquireValuationService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		acquireValuationService = (AcquireValuationService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AcquireValuationService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AcquireValuation.class;
	}

	protected String getModelClassName() {
		return AcquireValuation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = acquireValuationPersistence.getDataSource();

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
	protected AcquireAdvertisingPersistence acquireAdvertisingPersistence;

	@Reference
	protected AcquireApplicationStagesPersistence
		acquireApplicationStagesPersistence;

	@Reference
	protected AcquireDeskVerificationPersistence
		acquireDeskVerificationPersistence;

	@Reference
	protected AcquireDraftAgreementPersistence acquireDraftAgreementPersistence;

	@Reference
	protected AcquireDueDiligencePersistence acquireDueDiligencePersistence;

	@Reference
	protected AcquireEvaluationPersistence acquireEvaluationPersistence;

	@Reference
	protected AcquireExecutionPersistence acquireExecutionPersistence;

	@Reference
	protected AcquireFinalExecutedAgreementPersistence
		acquireFinalExecutedAgreementPersistence;

	@Reference
	protected AcquirePaymentConfirmationPersistence
		acquirePaymentConfirmationPersistence;

	@Reference
	protected AcquireTenderingPersistence acquireTenderingPersistence;

	@Reference
	protected
		com.nbp.acquire.stages.service.service.AcquireValuationLocalService
			acquireValuationLocalService;

	protected AcquireValuationService acquireValuationService;

	@Reference
	protected AcquireValuationPersistence acquireValuationPersistence;

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
		AcquireValuationServiceBaseImpl.class);

}