/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.base;

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

import com.nbp.miic.application.form.services.model.MiicApplicationCurrentStage;
import com.nbp.miic.application.form.services.service.MiicApplicationCurrentStageService;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicantDetailsPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationCurrentStagePersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicPaymentPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardGoodAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSafeguardMaterialAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetAddPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicSuspensionOfCetPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the miic application current stage remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.miic.application.form.services.service.impl.MiicApplicationCurrentStageServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.miic.application.form.services.service.impl.MiicApplicationCurrentStageServiceImpl
 * @generated
 */
public abstract class MiicApplicationCurrentStageServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MiicApplicationCurrentStageService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MiicApplicationCurrentStageService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.miic.application.form.services.service.MiicApplicationCurrentStageServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MiicApplicationCurrentStageService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		miicApplicationCurrentStageService =
			(MiicApplicationCurrentStageService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MiicApplicationCurrentStageService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MiicApplicationCurrentStage.class;
	}

	protected String getModelClassName() {
		return MiicApplicationCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				miicApplicationCurrentStagePersistence.getDataSource();

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
	protected MiicApplicantDetailsPersistence miicApplicantDetailsPersistence;

	@Reference
	protected MiicApplicationPersistence miicApplicationPersistence;

	@Reference
	protected com.nbp.miic.application.form.services.service.
		MiicApplicationCurrentStageLocalService
			miicApplicationCurrentStageLocalService;

	protected MiicApplicationCurrentStageService
		miicApplicationCurrentStageService;

	@Reference
	protected MiicApplicationCurrentStagePersistence
		miicApplicationCurrentStagePersistence;

	@Reference
	protected MiicPaymentPersistence miicPaymentPersistence;

	@Reference
	protected MiicSafeguardGoodAddPersistence miicSafeguardGoodAddPersistence;

	@Reference
	protected MiicSafeguardMaterialAddPersistence
		miicSafeguardMaterialAddPersistence;

	@Reference
	protected MiicSuspensionOfCetPersistence miicSuspensionOfCetPersistence;

	@Reference
	protected MiicSuspensionOfCetAddPersistence
		miicSuspensionOfCetAddPersistence;

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
		MiicApplicationCurrentStageServiceBaseImpl.class);

}