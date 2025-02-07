/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.base;

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

import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages;
import com.nbp.sez.status.application.stage.services.service.SezStatusWFHApplicationStagesService;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusARCDecisionPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusApplicationStagesPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusBoardDecisionPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusDeskVerificationPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusLicenseIssuancePersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusPaymentConfirmationPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusPreApprovalConditionsPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusWFHApplicationStagesPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusWelcomePackagePersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the sez status wfh application stages remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.sez.status.application.stage.services.service.impl.SezStatusWFHApplicationStagesServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.sez.status.application.stage.services.service.impl.SezStatusWFHApplicationStagesServiceImpl
 * @generated
 */
public abstract class SezStatusWFHApplicationStagesServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   SezStatusWFHApplicationStagesService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SezStatusWFHApplicationStagesService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.sez.status.application.stage.services.service.SezStatusWFHApplicationStagesServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			SezStatusWFHApplicationStagesService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		sezStatusWFHApplicationStagesService =
			(SezStatusWFHApplicationStagesService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SezStatusWFHApplicationStagesService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SezStatusWFHApplicationStages.class;
	}

	protected String getModelClassName() {
		return SezStatusWFHApplicationStages.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				sezStatusWFHApplicationStagesPersistence.getDataSource();

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
	protected SezStatusApplicationStagesPersistence
		sezStatusApplicationStagesPersistence;

	@Reference
	protected SezStatusARCDecisionPersistence sezStatusARCDecisionPersistence;

	@Reference
	protected SezStatusBoardDecisionPersistence
		sezStatusBoardDecisionPersistence;

	@Reference
	protected SezStatusDeskVerificationPersistence
		sezStatusDeskVerificationPersistence;

	@Reference
	protected SezStatusLicenseIssuancePersistence
		sezStatusLicenseIssuancePersistence;

	@Reference
	protected SezStatusPaymentConfirmationPersistence
		sezStatusPaymentConfirmationPersistence;

	@Reference
	protected SezStatusPreApprovalConditionsPersistence
		sezStatusPreApprovalConditionsPersistence;

	@Reference
	protected SezStatusWelcomePackagePersistence
		sezStatusWelcomePackagePersistence;

	@Reference
	protected com.nbp.sez.status.application.stage.services.service.
		SezStatusWFHApplicationStagesLocalService
			sezStatusWFHApplicationStagesLocalService;

	protected SezStatusWFHApplicationStagesService
		sezStatusWFHApplicationStagesService;

	@Reference
	protected SezStatusWFHApplicationStagesPersistence
		sezStatusWFHApplicationStagesPersistence;

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
		SezStatusWFHApplicationStagesServiceBaseImpl.class);

}