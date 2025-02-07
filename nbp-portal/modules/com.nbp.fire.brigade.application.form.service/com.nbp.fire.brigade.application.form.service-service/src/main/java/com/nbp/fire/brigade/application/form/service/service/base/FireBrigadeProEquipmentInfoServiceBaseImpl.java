/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.base;

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

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoService;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppPaymentPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppliCurrentStagePersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeApplicationPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeCerPurposeInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeHazardousSubInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeMultFloorInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeOperatorDetailPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadePremisesInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeProEquipmentInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeSignatureInfoPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the fire brigade pro equipment info remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeProEquipmentInfoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeProEquipmentInfoServiceImpl
 * @generated
 */
public abstract class FireBrigadeProEquipmentInfoServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FireBrigadeProEquipmentInfoService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FireBrigadeProEquipmentInfoService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FireBrigadeProEquipmentInfoService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		fireBrigadeProEquipmentInfoService =
			(FireBrigadeProEquipmentInfoService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FireBrigadeProEquipmentInfoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FireBrigadeProEquipmentInfo.class;
	}

	protected String getModelClassName() {
		return FireBrigadeProEquipmentInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				fireBrigadeProEquipmentInfoPersistence.getDataSource();

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
	protected FireBrigadeApplicationPersistence
		fireBrigadeApplicationPersistence;

	@Reference
	protected FireBrigadeAppliCurrentStagePersistence
		fireBrigadeAppliCurrentStagePersistence;

	@Reference
	protected FireBrigadeAppPaymentPersistence fireBrigadeAppPaymentPersistence;

	@Reference
	protected FireBrigadeCerPurposeInfoPersistence
		fireBrigadeCerPurposeInfoPersistence;

	@Reference
	protected FireBrigadeHazardousSubInfoPersistence
		fireBrigadeHazardousSubInfoPersistence;

	@Reference
	protected FireBrigadeMultFloorInfoPersistence
		fireBrigadeMultFloorInfoPersistence;

	@Reference
	protected FireBrigadeOperatorDetailPersistence
		fireBrigadeOperatorDetailPersistence;

	@Reference
	protected FireBrigadePremisesInfoPersistence
		fireBrigadePremisesInfoPersistence;

	@Reference
	protected com.nbp.fire.brigade.application.form.service.service.
		FireBrigadeProEquipmentInfoLocalService
			fireBrigadeProEquipmentInfoLocalService;

	protected FireBrigadeProEquipmentInfoService
		fireBrigadeProEquipmentInfoService;

	@Reference
	protected FireBrigadeProEquipmentInfoPersistence
		fireBrigadeProEquipmentInfoPersistence;

	@Reference
	protected FireBrigadeSignatureInfoPersistence
		fireBrigadeSignatureInfoPersistence;

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
		FireBrigadeProEquipmentInfoServiceBaseImpl.class);

}