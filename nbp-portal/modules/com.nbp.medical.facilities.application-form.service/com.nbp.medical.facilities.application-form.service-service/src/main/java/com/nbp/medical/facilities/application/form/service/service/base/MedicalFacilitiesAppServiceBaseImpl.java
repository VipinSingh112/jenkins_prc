/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.base;

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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppService;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalCurrentStagePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppliInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesComDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeTwoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesMaterHomePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseStaffPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesQNursePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesSignInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFaciltiesPaymentPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalNurseStaffPremisesPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the medical facilities app remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesAppServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesAppServiceImpl
 * @generated
 */
public abstract class MedicalFacilitiesAppServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MedicalFacilitiesAppService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MedicalFacilitiesAppService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MedicalFacilitiesAppService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		medicalFacilitiesAppService = (MedicalFacilitiesAppService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MedicalFacilitiesAppService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MedicalFacilitiesApp.class;
	}

	protected String getModelClassName() {
		return MedicalFacilitiesApp.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				medicalFacilitiesAppPersistence.getDataSource();

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
	protected MedicalCurrentStagePersistence medicalCurrentStagePersistence;

	@Reference
	protected com.nbp.medical.facilities.application.form.service.service.
		MedicalFacilitiesAppLocalService medicalFacilitiesAppLocalService;

	protected MedicalFacilitiesAppService medicalFacilitiesAppService;

	@Reference
	protected MedicalFacilitiesAppPersistence medicalFacilitiesAppPersistence;

	@Reference
	protected MedicalFacilitiesAppliInfoPersistence
		medicalFacilitiesAppliInfoPersistence;

	@Reference
	protected MedicalFacilitiesComDetailPersistence
		medicalFacilitiesComDetailPersistence;

	@Reference
	protected MedicalFacilitiesHomeInfoPersistence
		medicalFacilitiesHomeInfoPersistence;

	@Reference
	protected MedicalFacilitiesHomeTwoPersistence
		medicalFacilitiesHomeTwoPersistence;

	@Reference
	protected MedicalFacilitiesMaterHomePersistence
		medicalFacilitiesMaterHomePersistence;

	@Reference
	protected MedicalFacilitiesNurseDetailPersistence
		medicalFacilitiesNurseDetailPersistence;

	@Reference
	protected MedicalFacilitiesNurseStaffPersistence
		medicalFacilitiesNurseStaffPersistence;

	@Reference
	protected MedicalFacilitiesQNursePersistence
		medicalFacilitiesQNursePersistence;

	@Reference
	protected MedicalFacilitiesSignInfoPersistence
		medicalFacilitiesSignInfoPersistence;

	@Reference
	protected MedicalFaciltiesPaymentPersistence
		medicalFaciltiesPaymentPersistence;

	@Reference
	protected MedicalNurseStaffPremisesPersistence
		medicalNurseStaffPremisesPersistence;

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
		MedicalFacilitiesAppServiceBaseImpl.class);

}