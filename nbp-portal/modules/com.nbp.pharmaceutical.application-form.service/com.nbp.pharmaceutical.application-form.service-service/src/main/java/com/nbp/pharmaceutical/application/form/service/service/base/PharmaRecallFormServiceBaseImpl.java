/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.base;

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

import com.nbp.pharmaceutical.application.form.service.model.PharmaRecallForm;
import com.nbp.pharmaceutical.application.form.service.service.PharmaRecallFormService;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationPaymentPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCancellationFormPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCurrentStagePersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDocumentListPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDrugInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaManufacturerInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaMedicalDeviceInfoPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaRecallFormPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaSubCategoriesMappingPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the pharma recall form remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.pharmaceutical.application.form.service.service.impl.PharmaRecallFormServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.pharmaceutical.application.form.service.service.impl.PharmaRecallFormServiceImpl
 * @generated
 */
public abstract class PharmaRecallFormServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, PharmaRecallFormService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PharmaRecallFormService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.pharmaceutical.application.form.service.service.PharmaRecallFormServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PharmaRecallFormService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		pharmaRecallFormService = (PharmaRecallFormService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PharmaRecallFormService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PharmaRecallForm.class;
	}

	protected String getModelClassName() {
		return PharmaRecallForm.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = pharmaRecallFormPersistence.getDataSource();

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
	protected PharmaApplicationPersistence pharmaApplicationPersistence;

	@Reference
	protected PharmaApplicationPaymentPersistence
		pharmaApplicationPaymentPersistence;

	@Reference
	protected PharmaCancellationFormPersistence
		pharmaCancellationFormPersistence;

	@Reference
	protected PharmaCurrentStagePersistence pharmaCurrentStagePersistence;

	@Reference
	protected PharmaDocumentListPersistence pharmaDocumentListPersistence;

	@Reference
	protected PharmaDrugInfoPersistence pharmaDrugInfoPersistence;

	@Reference
	protected PharmaManufacturerInfoPersistence
		pharmaManufacturerInfoPersistence;

	@Reference
	protected PharmaMedicalDeviceInfoPersistence
		pharmaMedicalDeviceInfoPersistence;

	@Reference
	protected com.nbp.pharmaceutical.application.form.service.service.
		PharmaRecallFormLocalService pharmaRecallFormLocalService;

	protected PharmaRecallFormService pharmaRecallFormService;

	@Reference
	protected PharmaRecallFormPersistence pharmaRecallFormPersistence;

	@Reference
	protected PharmaSubCategoriesMappingPersistence
		pharmaSubCategoriesMappingPersistence;

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
		PharmaRecallFormServiceBaseImpl.class);

}