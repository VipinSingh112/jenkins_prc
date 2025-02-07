/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.base;

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

import com.nbp.creative.stages.services.model.CreativeDeskVerification;
import com.nbp.creative.stages.services.service.CreativeDeskVerificationService;
import com.nbp.creative.stages.services.service.persistence.CreativeApplicationStagesPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativeDeskVerificationPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativeInspectionPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativePermitPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the creative desk verification remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.creative.stages.services.service.impl.CreativeDeskVerificationServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.creative.stages.services.service.impl.CreativeDeskVerificationServiceImpl
 * @generated
 */
public abstract class CreativeDeskVerificationServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, CreativeDeskVerificationService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CreativeDeskVerificationService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.creative.stages.services.service.CreativeDeskVerificationServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CreativeDeskVerificationService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		creativeDeskVerificationService =
			(CreativeDeskVerificationService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CreativeDeskVerificationService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CreativeDeskVerification.class;
	}

	protected String getModelClassName() {
		return CreativeDeskVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				creativeDeskVerificationPersistence.getDataSource();

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
	protected CreativeApplicationStagesPersistence
		creativeApplicationStagesPersistence;

	@Reference
	protected com.nbp.creative.stages.services.service.
		CreativeDeskVerificationLocalService
			creativeDeskVerificationLocalService;

	protected CreativeDeskVerificationService creativeDeskVerificationService;

	@Reference
	protected CreativeDeskVerificationPersistence
		creativeDeskVerificationPersistence;

	@Reference
	protected CreativeInspectionPersistence creativeInspectionPersistence;

	@Reference
	protected CreativePermitPersistence creativePermitPersistence;

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
		CreativeDeskVerificationServiceBaseImpl.class);

}