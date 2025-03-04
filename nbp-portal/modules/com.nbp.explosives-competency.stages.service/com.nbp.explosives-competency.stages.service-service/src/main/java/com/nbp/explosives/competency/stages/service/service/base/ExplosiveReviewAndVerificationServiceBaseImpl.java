/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.base;

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

import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification;
import com.nbp.explosives.competency.stages.service.service.ExplosiveReviewAndVerificationService;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveApplicationStagesPersistence;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveCommisionDecisionPersistence;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveIssuanceOfLicencePersistence;
import com.nbp.explosives.competency.stages.service.service.persistence.ExplosiveReviewAndVerificationPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the explosive review and verification remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.explosives.competency.stages.service.service.impl.ExplosiveReviewAndVerificationServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.explosives.competency.stages.service.service.impl.ExplosiveReviewAndVerificationServiceImpl
 * @generated
 */
public abstract class ExplosiveReviewAndVerificationServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, ExplosiveReviewAndVerificationService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ExplosiveReviewAndVerificationService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.explosives.competency.stages.service.service.ExplosiveReviewAndVerificationServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ExplosiveReviewAndVerificationService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		explosiveReviewAndVerificationService =
			(ExplosiveReviewAndVerificationService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ExplosiveReviewAndVerificationService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ExplosiveReviewAndVerification.class;
	}

	protected String getModelClassName() {
		return ExplosiveReviewAndVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				explosiveReviewAndVerificationPersistence.getDataSource();

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
	protected ExplosiveApplicationStagesPersistence
		explosiveApplicationStagesPersistence;

	@Reference
	protected ExplosiveCommisionDecisionPersistence
		explosiveCommisionDecisionPersistence;

	@Reference
	protected ExplosiveIssuanceOfLicencePersistence
		explosiveIssuanceOfLicencePersistence;

	@Reference
	protected com.nbp.explosives.competency.stages.service.service.
		ExplosiveReviewAndVerificationLocalService
			explosiveReviewAndVerificationLocalService;

	protected ExplosiveReviewAndVerificationService
		explosiveReviewAndVerificationService;

	@Reference
	protected ExplosiveReviewAndVerificationPersistence
		explosiveReviewAndVerificationPersistence;

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
		ExplosiveReviewAndVerificationServiceBaseImpl.class);

}