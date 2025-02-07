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

import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;
import com.nbp.farm.application.form.service.service.FarmerStakeholderInfoService;
import com.nbp.farm.application.form.service.service.FarmerStakeholderInfoServiceUtil;
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
 * Provides the base implementation for the farmer stakeholder info remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.farm.application.form.service.service.impl.FarmerStakeholderInfoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.farm.application.form.service.service.impl.FarmerStakeholderInfoServiceImpl
 * @generated
 */
public abstract class FarmerStakeholderInfoServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, FarmerStakeholderInfoService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FarmerStakeholderInfoService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>FarmerStakeholderInfoServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FarmerStakeholderInfoService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		farmerStakeholderInfoService = (FarmerStakeholderInfoService)aopProxy;

		_setServiceUtilService(farmerStakeholderInfoService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FarmerStakeholderInfoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FarmerStakeholderInfo.class;
	}

	protected String getModelClassName() {
		return FarmerStakeholderInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				farmerStakeholderInfoPersistence.getDataSource();

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
		FarmerStakeholderInfoService farmerStakeholderInfoService) {

		try {
			Field field =
				FarmerStakeholderInfoServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, farmerStakeholderInfoService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected FarmerApplicationPersistence farmerApplicationPersistence;

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
	protected com.nbp.farm.application.form.service.service.
		FarmerStakeholderInfoLocalService farmerStakeholderInfoLocalService;

	protected FarmerStakeholderInfoService farmerStakeholderInfoService;

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