/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.base;

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

import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;
import com.nbp.mining.lease.application.service.service.MiningAppCurrentStageService;
import com.nbp.mining.lease.application.service.service.persistence.MiningAppCurrentStagePersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningAppPaymentPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningExclusiveLicFormFivePersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningFormFiveDelineationPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningLeaseApplicationPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingLicenseAddPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingLicensePersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingRightsPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningRenewalLicencePersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the mining app current stage remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.mining.lease.application.service.service.impl.MiningAppCurrentStageServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.mining.lease.application.service.service.impl.MiningAppCurrentStageServiceImpl
 * @generated
 */
public abstract class MiningAppCurrentStageServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MiningAppCurrentStageService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MiningAppCurrentStageService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.mining.lease.application.service.service.MiningAppCurrentStageServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MiningAppCurrentStageService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		miningAppCurrentStageService = (MiningAppCurrentStageService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MiningAppCurrentStageService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MiningAppCurrentStage.class;
	}

	protected String getModelClassName() {
		return MiningAppCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				miningAppCurrentStagePersistence.getDataSource();

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
	protected com.nbp.mining.lease.application.service.service.
		MiningAppCurrentStageLocalService miningAppCurrentStageLocalService;

	protected MiningAppCurrentStageService miningAppCurrentStageService;

	@Reference
	protected MiningAppCurrentStagePersistence miningAppCurrentStagePersistence;

	@Reference
	protected MiningAppPaymentPersistence miningAppPaymentPersistence;

	@Reference
	protected MiningExclusiveLicFormFivePersistence
		miningExclusiveLicFormFivePersistence;

	@Reference
	protected MiningFormFiveDelineationPersistence
		miningFormFiveDelineationPersistence;

	@Reference
	protected MiningLeaseApplicationPersistence
		miningLeaseApplicationPersistence;

	@Reference
	protected MiningProspectingLicensePersistence
		miningProspectingLicensePersistence;

	@Reference
	protected MiningProspectingLicenseAddPersistence
		miningProspectingLicenseAddPersistence;

	@Reference
	protected MiningProspectingRightsPersistence
		miningProspectingRightsPersistence;

	@Reference
	protected MiningRenewalLicencePersistence miningRenewalLicencePersistence;

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
		MiningAppCurrentStageServiceBaseImpl.class);

}