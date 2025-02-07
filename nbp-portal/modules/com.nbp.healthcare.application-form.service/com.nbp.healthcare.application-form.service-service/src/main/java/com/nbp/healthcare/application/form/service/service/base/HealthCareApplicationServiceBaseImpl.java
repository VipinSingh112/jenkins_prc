/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.base;

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

import com.nbp.healthcare.application.form.service.model.HealthCareApplication;
import com.nbp.healthcare.application.form.service.service.HealthCareApplicationService;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantAddressPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationPaymentPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBusinessAddressPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBussinessInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareCurrentStagePersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareDescriptionOfServicePersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareEquipmentInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthcareEquipHeadingListPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the health care application remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.healthcare.application.form.service.service.impl.HealthCareApplicationServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.healthcare.application.form.service.service.impl.HealthCareApplicationServiceImpl
 * @generated
 */
public abstract class HealthCareApplicationServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, HealthCareApplicationService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>HealthCareApplicationService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.healthcare.application.form.service.service.HealthCareApplicationServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			HealthCareApplicationService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		healthCareApplicationService = (HealthCareApplicationService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HealthCareApplicationService.class.getName();
	}

	protected Class<?> getModelClass() {
		return HealthCareApplication.class;
	}

	protected String getModelClassName() {
		return HealthCareApplication.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				healthCareApplicationPersistence.getDataSource();

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
	protected HealthCareApplicantAddressPersistence
		healthCareApplicantAddressPersistence;

	@Reference
	protected HealthCareApplicantInfoPersistence
		healthCareApplicantInfoPersistence;

	@Reference
	protected com.nbp.healthcare.application.form.service.service.
		HealthCareApplicationLocalService healthCareApplicationLocalService;

	protected HealthCareApplicationService healthCareApplicationService;

	@Reference
	protected HealthCareApplicationPersistence healthCareApplicationPersistence;

	@Reference
	protected HealthCareApplicationPaymentPersistence
		healthCareApplicationPaymentPersistence;

	@Reference
	protected HealthCareBusinessAddressPersistence
		healthCareBusinessAddressPersistence;

	@Reference
	protected HealthCareBussinessInfoPersistence
		healthCareBussinessInfoPersistence;

	@Reference
	protected HealthCareCurrentStagePersistence
		healthCareCurrentStagePersistence;

	@Reference
	protected HealthCareDescriptionOfServicePersistence
		healthCareDescriptionOfServicePersistence;

	@Reference
	protected HealthcareEquipHeadingListPersistence
		healthcareEquipHeadingListPersistence;

	@Reference
	protected HealthCareEquipmentInfoPersistence
		healthCareEquipmentInfoPersistence;

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

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryService
		assetEntryService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagService assetTagService;

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareApplicationServiceBaseImpl.class);

}