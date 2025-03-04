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

package com.nbp.quary.application.form.service.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.quary.application.form.service.model.MaterialInformationMachinesAndEquipent;
import com.nbp.quary.application.form.service.service.MaterialInformationMachinesAndEquipentService;
import com.nbp.quary.application.form.service.service.MaterialInformationMachinesAndEquipentServiceUtil;
import com.nbp.quary.application.form.service.service.persistence.MaterialInformationMachinesAndEquipentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationMachinesAndEquipmentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPaymentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicatntInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryCurrentStagePersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryGeneralInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryInformaationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationEquipmentListPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryMaterialInformationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryTransferApplicantInfoPersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the material information machines and equipent remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.quary.application.form.service.service.impl.MaterialInformationMachinesAndEquipentServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.quary.application.form.service.service.impl.MaterialInformationMachinesAndEquipentServiceImpl
 * @generated
 */
public abstract class MaterialInformationMachinesAndEquipentServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MaterialInformationMachinesAndEquipentService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MaterialInformationMachinesAndEquipentService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>MaterialInformationMachinesAndEquipentServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MaterialInformationMachinesAndEquipentService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		materialInformationMachinesAndEquipentService =
			(MaterialInformationMachinesAndEquipentService)aopProxy;

		_setServiceUtilService(materialInformationMachinesAndEquipentService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MaterialInformationMachinesAndEquipentService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MaterialInformationMachinesAndEquipent.class;
	}

	protected String getModelClassName() {
		return MaterialInformationMachinesAndEquipent.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				materialInformationMachinesAndEquipentPersistence.
					getDataSource();

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
		MaterialInformationMachinesAndEquipentService
			materialInformationMachinesAndEquipentService) {

		try {
			Field field =
				MaterialInformationMachinesAndEquipentServiceUtil.class.
					getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, materialInformationMachinesAndEquipentService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected com.nbp.quary.application.form.service.service.
		MaterialInformationMachinesAndEquipentLocalService
			materialInformationMachinesAndEquipentLocalService;

	protected MaterialInformationMachinesAndEquipentService
		materialInformationMachinesAndEquipentService;

	@Reference
	protected MaterialInformationMachinesAndEquipentPersistence
		materialInformationMachinesAndEquipentPersistence;

	@Reference
	protected QuarryApplicationPersistence quarryApplicationPersistence;

	@Reference
	protected QuarryApplicationMachinesAndEquipmentPersistence
		quarryApplicationMachinesAndEquipmentPersistence;

	@Reference
	protected QuarryApplicationPaymentPersistence
		quarryApplicationPaymentPersistence;

	@Reference
	protected QuarryApplicatntInformationPersistence
		quarryApplicatntInformationPersistence;

	@Reference
	protected QuarryCurrentStagePersistence quarryCurrentStagePersistence;

	@Reference
	protected QuarryGeneralInformationPersistence
		quarryGeneralInformationPersistence;

	@Reference
	protected QuarryInformaationPersistence quarryInformaationPersistence;

	@Reference
	protected QuarryMaterialInformationPersistence
		quarryMaterialInformationPersistence;

	@Reference
	protected QuarryMaterialInformationEquipmentListPersistence
		quarryMaterialInformationEquipmentListPersistence;

	@Reference
	protected QuarryTransferApplicantInfoPersistence
		quarryTransferApplicantInfoPersistence;

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