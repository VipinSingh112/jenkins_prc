/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.base;

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

import com.nbp.osi.stages.services.model.OsiApplicationStages;
import com.nbp.osi.stages.services.service.OsiApplicationStagesService;
import com.nbp.osi.stages.services.service.persistence.OsiApplicationPermitPersistence;
import com.nbp.osi.stages.services.service.persistence.OsiApplicationStagesPersistence;
import com.nbp.osi.stages.services.service.persistence.OsiDeskVerificationPersistence;
import com.nbp.osi.stages.services.service.persistence.OsiInspectionPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the osi application stages remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.osi.stages.services.service.impl.OsiApplicationStagesServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.osi.stages.services.service.impl.OsiApplicationStagesServiceImpl
 * @generated
 */
public abstract class OsiApplicationStagesServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OsiApplicationStagesService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OsiApplicationStagesService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.osi.stages.services.service.OsiApplicationStagesServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OsiApplicationStagesService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		osiApplicationStagesService = (OsiApplicationStagesService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OsiApplicationStagesService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OsiApplicationStages.class;
	}

	protected String getModelClassName() {
		return OsiApplicationStages.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				osiApplicationStagesPersistence.getDataSource();

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
	protected OsiApplicationPermitPersistence osiApplicationPermitPersistence;

	@Reference
	protected
		com.nbp.osi.stages.services.service.OsiApplicationStagesLocalService
			osiApplicationStagesLocalService;

	protected OsiApplicationStagesService osiApplicationStagesService;

	@Reference
	protected OsiApplicationStagesPersistence osiApplicationStagesPersistence;

	@Reference
	protected OsiDeskVerificationPersistence osiDeskVerificationPersistence;

	@Reference
	protected OsiInspectionPersistence osiInspectionPersistence;

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
		OsiApplicationStagesServiceBaseImpl.class);

}