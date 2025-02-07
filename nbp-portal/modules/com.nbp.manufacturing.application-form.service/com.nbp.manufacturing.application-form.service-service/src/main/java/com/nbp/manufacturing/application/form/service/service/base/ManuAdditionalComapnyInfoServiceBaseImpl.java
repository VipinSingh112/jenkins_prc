/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.manufacturing.application.form.service.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.manufacturing.application.form.service.model.ManuAdditionalComapnyInfo;
import com.nbp.manufacturing.application.form.service.service.ManuAdditionalComapnyInfoService;
import com.nbp.manufacturing.application.form.service.service.ManuAdditionalComapnyInfoServiceUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalComapnyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuExportDataPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuInternationalCertificatePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManufacturingApplicationPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.PackagingProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductionProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormPersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the manu additional comapny info remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.manufacturing.application.form.service.service.impl.ManuAdditionalComapnyInfoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.manufacturing.application.form.service.service.impl.ManuAdditionalComapnyInfoServiceImpl
 * @generated
 */
public abstract class ManuAdditionalComapnyInfoServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   ManuAdditionalComapnyInfoService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ManuAdditionalComapnyInfoService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ManuAdditionalComapnyInfoServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ManuAdditionalComapnyInfoService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		manuAdditionalComapnyInfoService =
			(ManuAdditionalComapnyInfoService)aopProxy;

		_setServiceUtilService(manuAdditionalComapnyInfoService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ManuAdditionalComapnyInfoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ManuAdditionalComapnyInfo.class;
	}

	protected String getModelClassName() {
		return ManuAdditionalComapnyInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				manuAdditionalComapnyInfoPersistence.getDataSource();

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

	private void _setServiceUtilService(
		ManuAdditionalComapnyInfoService manuAdditionalComapnyInfoService) {

		try {
			Field field =
				ManuAdditionalComapnyInfoServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, manuAdditionalComapnyInfoService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected com.nbp.manufacturing.application.form.service.service.
		ManuAdditionalComapnyInfoLocalService
			manuAdditionalComapnyInfoLocalService;

	protected ManuAdditionalComapnyInfoService manuAdditionalComapnyInfoService;

	@Reference
	protected ManuAdditionalComapnyInfoPersistence
		manuAdditionalComapnyInfoPersistence;

	@Reference
	protected ManuCompanyInfoPersistence manuCompanyInfoPersistence;

	@Reference
	protected ManuEquipmentPersistence manuEquipmentPersistence;

	@Reference
	protected ManuExportDataPersistence manuExportDataPersistence;

	@Reference
	protected ManufacturingApplicationPersistence
		manufacturingApplicationPersistence;

	@Reference
	protected ManuInternationalCertificatePersistence
		manuInternationalCertificatePersistence;

	@Reference
	protected PackagingProcessPersistence packagingProcessPersistence;

	@Reference
	protected ProductionProcessPersistence productionProcessPersistence;

	@Reference
	protected ProductiveInputsFormPersistence productiveInputsFormPersistence;

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

}