/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.base;

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

import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;
import com.npm.cannabis.application.stages.services.service.CannabisApplicationStagesService;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationDeskVeriPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationDueDiligencePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationPaymentConfirmationPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationStagesPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisConditionalLicensePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisInspectionPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePaymentPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePreCondtionsPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.FullLicenseCommitteeDecisionPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the cannabis application stages remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationStagesServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationStagesServiceImpl
 * @generated
 */
public abstract class CannabisApplicationStagesServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, CannabisApplicationStagesService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CannabisApplicationStagesService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.npm.cannabis.application.stages.services.service.CannabisApplicationStagesServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CannabisApplicationStagesService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		cannabisApplicationStagesService =
			(CannabisApplicationStagesService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CannabisApplicationStagesService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CannabisApplicationStages.class;
	}

	protected String getModelClassName() {
		return CannabisApplicationStages.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				cannabisApplicationStagesPersistence.getDataSource();

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
	protected CannabisApplicationDeskVeriPersistence
		cannabisApplicationDeskVeriPersistence;

	@Reference
	protected CannabisApplicationDueDiligencePersistence
		cannabisApplicationDueDiligencePersistence;

	@Reference
	protected CannabisApplicationPaymentConfirmationPersistence
		cannabisApplicationPaymentConfirmationPersistence;

	@Reference
	protected com.npm.cannabis.application.stages.services.service.
		CannabisApplicationStagesLocalService
			cannabisApplicationStagesLocalService;

	protected CannabisApplicationStagesService cannabisApplicationStagesService;

	@Reference
	protected CannabisApplicationStagesPersistence
		cannabisApplicationStagesPersistence;

	@Reference
	protected CannabisConditionalLicensePersistence
		cannabisConditionalLicensePersistence;

	@Reference
	protected CannabisInspectionPersistence cannabisInspectionPersistence;

	@Reference
	protected CannabisLicensePersistence cannabisLicensePersistence;

	@Reference
	protected CannabisLicensePaymentPersistence
		cannabisLicensePaymentPersistence;

	@Reference
	protected CannabisLicensePreCondtionsPersistence
		cannabisLicensePreCondtionsPersistence;

	@Reference
	protected FullLicenseCommitteeDecisionPersistence
		fullLicenseCommitteeDecisionPersistence;

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
		CannabisApplicationStagesServiceBaseImpl.class);

}