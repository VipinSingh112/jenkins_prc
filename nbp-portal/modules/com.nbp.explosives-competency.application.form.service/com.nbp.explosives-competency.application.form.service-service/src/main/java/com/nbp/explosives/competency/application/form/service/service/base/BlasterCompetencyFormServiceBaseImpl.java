/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.base;

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

import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;
import com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormService;
import com.nbp.explosives.competency.application.form.service.service.persistence.BlasterCompetencyFormPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosiveAppPaymentPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesApplicationPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesCurrentStagePersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.PyrotechnicCompetencyFormPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the blaster competency form remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.explosives.competency.application.form.service.service.impl.BlasterCompetencyFormServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.explosives.competency.application.form.service.service.impl.BlasterCompetencyFormServiceImpl
 * @generated
 */
public abstract class BlasterCompetencyFormServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, BlasterCompetencyFormService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>BlasterCompetencyFormService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			BlasterCompetencyFormService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		blasterCompetencyFormService = (BlasterCompetencyFormService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return BlasterCompetencyFormService.class.getName();
	}

	protected Class<?> getModelClass() {
		return BlasterCompetencyForm.class;
	}

	protected String getModelClassName() {
		return BlasterCompetencyForm.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				blasterCompetencyFormPersistence.getDataSource();

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
	protected com.nbp.explosives.competency.application.form.service.service.
		BlasterCompetencyFormLocalService blasterCompetencyFormLocalService;

	protected BlasterCompetencyFormService blasterCompetencyFormService;

	@Reference
	protected BlasterCompetencyFormPersistence blasterCompetencyFormPersistence;

	@Reference
	protected ExplosiveAppPaymentPersistence explosiveAppPaymentPersistence;

	@Reference
	protected ExplosivesApplicationPersistence explosivesApplicationPersistence;

	@Reference
	protected ExplosivesCurrentStagePersistence
		explosivesCurrentStagePersistence;

	@Reference
	protected PyrotechnicCompetencyFormPersistence
		pyrotechnicCompetencyFormPersistence;

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
		BlasterCompetencyFormServiceBaseImpl.class);

}