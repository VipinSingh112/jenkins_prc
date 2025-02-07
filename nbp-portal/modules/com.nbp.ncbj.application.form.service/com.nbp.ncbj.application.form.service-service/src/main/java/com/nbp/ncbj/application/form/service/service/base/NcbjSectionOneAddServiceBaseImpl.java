/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.base;

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

import com.nbp.ncbj.application.form.service.model.NcbjSectionOneAdd;
import com.nbp.ncbj.application.form.service.service.NcbjSectionOneAddService;
import com.nbp.ncbj.application.form.service.service.persistence.NCBJCompanyNewPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAddLocMultiSitePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAppPaymentPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicantDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailGenPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCurrentStagePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumOfEmpAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumberEffectiveAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrgDetailInfoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrganizationDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjPremisesLocationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjProductServiceDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionFourPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOneAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOnePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionThreePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionTwoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSpecificActivitiesPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ncbj section one add remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncbj.application.form.service.service.impl.NcbjSectionOneAddServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncbj.application.form.service.service.impl.NcbjSectionOneAddServiceImpl
 * @generated
 */
public abstract class NcbjSectionOneAddServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, NcbjSectionOneAddService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcbjSectionOneAddService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncbj.application.form.service.service.NcbjSectionOneAddServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcbjSectionOneAddService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncbjSectionOneAddService = (NcbjSectionOneAddService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcbjSectionOneAddService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcbjSectionOneAdd.class;
	}

	protected String getModelClassName() {
		return NcbjSectionOneAdd.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ncbjSectionOneAddPersistence.getDataSource();

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
	protected NcbjAddLocMultiSitePersistence ncbjAddLocMultiSitePersistence;

	@Reference
	protected NcbjApplicantDetailPersistence ncbjApplicantDetailPersistence;

	@Reference
	protected NcbjApplicationPersistence ncbjApplicationPersistence;

	@Reference
	protected NcbjAppPaymentPersistence ncbjAppPaymentPersistence;

	@Reference
	protected NcbjBusinessDetailPersistence ncbjBusinessDetailPersistence;

	@Reference
	protected NcbjBusinessDetailAddPersistence ncbjBusinessDetailAddPersistence;

	@Reference
	protected NcbjCompanyDetailPersistence ncbjCompanyDetailPersistence;

	@Reference
	protected NcbjCompanyDetailAddPersistence ncbjCompanyDetailAddPersistence;

	@Reference
	protected NcbjCompanyDetailGenPersistence ncbjCompanyDetailGenPersistence;

	@Reference
	protected NCBJCompanyNewPersistence ncbjCompanyNewPersistence;

	@Reference
	protected NcbjCurrentStagePersistence ncbjCurrentStagePersistence;

	@Reference
	protected NcbjNumberEffectiveAddPersistence
		ncbjNumberEffectiveAddPersistence;

	@Reference
	protected NcbjNumOfEmpAddPersistence ncbjNumOfEmpAddPersistence;

	@Reference
	protected NcbjOrganizationDetailPersistence
		ncbjOrganizationDetailPersistence;

	@Reference
	protected NcbjOrgDetailInfoPersistence ncbjOrgDetailInfoPersistence;

	@Reference
	protected NcbjPremisesLocationPersistence ncbjPremisesLocationPersistence;

	@Reference
	protected NcbjProductServiceDetailPersistence
		ncbjProductServiceDetailPersistence;

	@Reference
	protected NcbjSectionDetailAddPersistence ncbjSectionDetailAddPersistence;

	@Reference
	protected NcbjSectionFourPersistence ncbjSectionFourPersistence;

	@Reference
	protected NcbjSectionOnePersistence ncbjSectionOnePersistence;

	@Reference
	protected
		com.nbp.ncbj.application.form.service.service.
			NcbjSectionOneAddLocalService ncbjSectionOneAddLocalService;

	protected NcbjSectionOneAddService ncbjSectionOneAddService;

	@Reference
	protected NcbjSectionOneAddPersistence ncbjSectionOneAddPersistence;

	@Reference
	protected NcbjSectionThreePersistence ncbjSectionThreePersistence;

	@Reference
	protected NcbjSectionTwoPersistence ncbjSectionTwoPersistence;

	@Reference
	protected NcbjSpecificActivitiesPersistence
		ncbjSpecificActivitiesPersistence;

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
		NcbjSectionOneAddServiceBaseImpl.class);

}