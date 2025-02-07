/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.base;

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

import com.nbp.manufacturing.application.stages.services.model.ManuInspection;
import com.nbp.manufacturing.application.stages.services.service.ManuInspectionService;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManuDeskVerificationPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManuInspectionPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingApplicationStagesPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingPermitPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingRecommendationToJCAPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the manu inspection remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.manufacturing.application.stages.services.service.impl.ManuInspectionServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.manufacturing.application.stages.services.service.impl.ManuInspectionServiceImpl
 * @generated
 */
public abstract class ManuInspectionServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, ManuInspectionService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ManuInspectionService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.manufacturing.application.stages.services.service.ManuInspectionServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ManuInspectionService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		manuInspectionService = (ManuInspectionService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ManuInspectionService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ManuInspection.class;
	}

	protected String getModelClassName() {
		return ManuInspection.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = manuInspectionPersistence.getDataSource();

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
	protected ManuDeskVerificationPersistence manuDeskVerificationPersistence;

	@Reference
	protected ManufacturingApplicationStagesPersistence
		manufacturingApplicationStagesPersistence;

	@Reference
	protected ManufacturingPermitPersistence manufacturingPermitPersistence;

	@Reference
	protected ManufacturingRecommendationToJCAPersistence
		manufacturingRecommendationToJCAPersistence;

	@Reference
	protected com.nbp.manufacturing.application.stages.services.service.
		ManuInspectionLocalService manuInspectionLocalService;

	protected ManuInspectionService manuInspectionService;

	@Reference
	protected ManuInspectionPersistence manuInspectionPersistence;

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
		ManuInspectionServiceBaseImpl.class);

}