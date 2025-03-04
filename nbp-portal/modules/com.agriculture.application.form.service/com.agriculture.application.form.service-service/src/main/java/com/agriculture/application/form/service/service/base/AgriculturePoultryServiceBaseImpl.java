/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.base;

import com.agriculture.application.form.service.model.AgriculturePoultry;
import com.agriculture.application.form.service.service.AgriculturePoultryService;
import com.agriculture.application.form.service.service.persistence.AgriApplicationCurrentStagePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultueFarmerPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureApiculturePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureApplicationPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureAquaculturePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureBuildingPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureCropPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureFarmPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureLivestockPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureOrnamentalPersistence;
import com.agriculture.application.form.service.service.persistence.AgriculturePoultryPersistence;
import com.agriculture.application.form.service.service.persistence.AgriultureForestryPersistence;

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

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the agriculture poultry remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.agriculture.application.form.service.service.impl.AgriculturePoultryServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.agriculture.application.form.service.service.impl.AgriculturePoultryServiceImpl
 * @generated
 */
public abstract class AgriculturePoultryServiceBaseImpl
	extends BaseServiceImpl
	implements AgriculturePoultryService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AgriculturePoultryService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.agriculture.application.form.service.service.AgriculturePoultryServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AgriculturePoultryService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		agriculturePoultryService = (AgriculturePoultryService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AgriculturePoultryService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AgriculturePoultry.class;
	}

	protected String getModelClassName() {
		return AgriculturePoultry.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				agriculturePoultryPersistence.getDataSource();

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
	protected AgriApplicationCurrentStagePersistence
		agriApplicationCurrentStagePersistence;

	@Reference
	protected AgricultueFarmerPersistence agricultueFarmerPersistence;

	@Reference
	protected AgricultureApiculturePersistence agricultureApiculturePersistence;

	@Reference
	protected AgricultureApplicationPersistence
		agricultureApplicationPersistence;

	@Reference
	protected AgricultureAquaculturePersistence
		agricultureAquaculturePersistence;

	@Reference
	protected AgricultureBuildingPersistence agricultureBuildingPersistence;

	@Reference
	protected AgricultureCropPersistence agricultureCropPersistence;

	@Reference
	protected AgricultureFarmPersistence agricultureFarmPersistence;

	@Reference
	protected AgricultureLivestockPersistence agricultureLivestockPersistence;

	@Reference
	protected AgricultureOrnamentalPersistence agricultureOrnamentalPersistence;

	@Reference
	protected com.agriculture.application.form.service.service.
		AgriculturePoultryLocalService agriculturePoultryLocalService;

	protected AgriculturePoultryService agriculturePoultryService;

	@Reference
	protected AgriculturePoultryPersistence agriculturePoultryPersistence;

	@Reference
	protected AgriultureForestryPersistence agriultureForestryPersistence;

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
		AgriculturePoultryServiceBaseImpl.class);

}