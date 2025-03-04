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

package com.nbp.farm.application.form.service.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.farm.application.form.service.model.FarmerApplicationCurrentStage;
import com.nbp.farm.application.form.service.service.FarmerApplicationCurrentStageService;
import com.nbp.farm.application.form.service.service.FarmerApplicationCurrentStageServiceUtil;
import com.nbp.farm.application.form.service.service.persistence.FarmerApplicationCurrentStagePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerApplicationPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropPracticePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerLivestockPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerProfilePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerPropertyPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerStakeholderAddressPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerStakeholderInfoPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerlivestockPracticePersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the farmer application current stage remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.farm.application.form.service.service.impl.FarmerApplicationCurrentStageServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.farm.application.form.service.service.impl.FarmerApplicationCurrentStageServiceImpl
 * @generated
 */
public abstract class FarmerApplicationCurrentStageServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FarmerApplicationCurrentStageService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FarmerApplicationCurrentStageService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>FarmerApplicationCurrentStageServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FarmerApplicationCurrentStageService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		farmerApplicationCurrentStageService =
			(FarmerApplicationCurrentStageService)aopProxy;

		_setServiceUtilService(farmerApplicationCurrentStageService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FarmerApplicationCurrentStageService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FarmerApplicationCurrentStage.class;
	}

	protected String getModelClassName() {
		return FarmerApplicationCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				farmerApplicationCurrentStagePersistence.getDataSource();

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
		FarmerApplicationCurrentStageService
			farmerApplicationCurrentStageService) {

		try {
			Field field =
				FarmerApplicationCurrentStageServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, farmerApplicationCurrentStageService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected FarmerApplicationPersistence farmerApplicationPersistence;

	@Reference
	protected com.nbp.farm.application.form.service.service.
		FarmerApplicationCurrentStageLocalService
			farmerApplicationCurrentStageLocalService;

	protected FarmerApplicationCurrentStageService
		farmerApplicationCurrentStageService;

	@Reference
	protected FarmerApplicationCurrentStagePersistence
		farmerApplicationCurrentStagePersistence;

	@Reference
	protected FarmerCropPersistence farmerCropPersistence;

	@Reference
	protected FarmerCropPracticePersistence farmerCropPracticePersistence;

	@Reference
	protected FarmerLivestockPersistence farmerLivestockPersistence;

	@Reference
	protected FarmerlivestockPracticePersistence
		farmerlivestockPracticePersistence;

	@Reference
	protected FarmerProfilePersistence farmerProfilePersistence;

	@Reference
	protected FarmerPropertyPersistence farmerPropertyPersistence;

	@Reference
	protected FarmerStakeholderAddressPersistence
		farmerStakeholderAddressPersistence;

	@Reference
	protected FarmerStakeholderInfoPersistence farmerStakeholderInfoPersistence;

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