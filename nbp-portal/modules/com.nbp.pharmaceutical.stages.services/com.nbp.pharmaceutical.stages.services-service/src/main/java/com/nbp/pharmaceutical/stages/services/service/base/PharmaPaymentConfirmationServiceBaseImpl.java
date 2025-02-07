/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.base;

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

import com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmation;
import com.nbp.pharmaceutical.stages.services.service.PharmaPaymentConfirmationService;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationCommitteeDecisionPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationDueDiligencePersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationFullLicensePersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationStagesPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaDeskVerificationPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaPaymentConfirmationPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the pharma payment confirmation remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.pharmaceutical.stages.services.service.impl.PharmaPaymentConfirmationServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.pharmaceutical.stages.services.service.impl.PharmaPaymentConfirmationServiceImpl
 * @generated
 */
public abstract class PharmaPaymentConfirmationServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   PharmaPaymentConfirmationService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PharmaPaymentConfirmationService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.pharmaceutical.stages.services.service.PharmaPaymentConfirmationServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PharmaPaymentConfirmationService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		pharmaPaymentConfirmationService =
			(PharmaPaymentConfirmationService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PharmaPaymentConfirmationService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PharmaPaymentConfirmation.class;
	}

	protected String getModelClassName() {
		return PharmaPaymentConfirmation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				pharmaPaymentConfirmationPersistence.getDataSource();

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
	protected PharmaApplicationCommitteeDecisionPersistence
		pharmaApplicationCommitteeDecisionPersistence;

	@Reference
	protected PharmaApplicationDueDiligencePersistence
		pharmaApplicationDueDiligencePersistence;

	@Reference
	protected PharmaApplicationFullLicensePersistence
		pharmaApplicationFullLicensePersistence;

	@Reference
	protected PharmaApplicationStagesPersistence
		pharmaApplicationStagesPersistence;

	@Reference
	protected PharmaDeskVerificationPersistence
		pharmaDeskVerificationPersistence;

	@Reference
	protected com.nbp.pharmaceutical.stages.services.service.
		PharmaPaymentConfirmationLocalService
			pharmaPaymentConfirmationLocalService;

	protected PharmaPaymentConfirmationService pharmaPaymentConfirmationService;

	@Reference
	protected PharmaPaymentConfirmationPersistence
		pharmaPaymentConfirmationPersistence;

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
		PharmaPaymentConfirmationServiceBaseImpl.class);

}