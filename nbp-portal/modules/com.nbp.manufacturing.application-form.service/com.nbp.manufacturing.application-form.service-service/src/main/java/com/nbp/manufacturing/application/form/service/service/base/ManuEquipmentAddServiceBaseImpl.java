/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.base;

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

import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd;
import com.nbp.manufacturing.application.form.service.service.ManuEquipmentAddService;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuApplicationCurrentStagePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoAddressPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuCompanyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuEquipmentPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuExportDataPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuInternationalCertificatePersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManufacturingApplicationPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.PackagingProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductionProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the manu equipment add remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.manufacturing.application.form.service.service.impl.ManuEquipmentAddServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.manufacturing.application.form.service.service.impl.ManuEquipmentAddServiceImpl
 * @generated
 */
public abstract class ManuEquipmentAddServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, ManuEquipmentAddService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ManuEquipmentAddService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.manufacturing.application.form.service.service.ManuEquipmentAddServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ManuEquipmentAddService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		manuEquipmentAddService = (ManuEquipmentAddService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ManuEquipmentAddService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ManuEquipmentAdd.class;
	}

	protected String getModelClassName() {
		return ManuEquipmentAdd.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = manuEquipmentAddPersistence.getDataSource();

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
	protected ManuAdditionalCompanyInfoPersistence
		manuAdditionalCompanyInfoPersistence;

	@Reference
	protected ManuApplicationCurrentStagePersistence
		manuApplicationCurrentStagePersistence;

	@Reference
	protected ManuCompanyInfoPersistence manuCompanyInfoPersistence;

	@Reference
	protected ManuCompanyInfoAddressPersistence
		manuCompanyInfoAddressPersistence;

	@Reference
	protected ManuEquipmentPersistence manuEquipmentPersistence;

	@Reference
	protected com.nbp.manufacturing.application.form.service.service.
		ManuEquipmentAddLocalService manuEquipmentAddLocalService;

	protected ManuEquipmentAddService manuEquipmentAddService;

	@Reference
	protected ManuEquipmentAddPersistence manuEquipmentAddPersistence;

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
	protected ProductiveInputsFormAddPersistence
		productiveInputsFormAddPersistence;

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
		ManuEquipmentAddServiceBaseImpl.class);

}