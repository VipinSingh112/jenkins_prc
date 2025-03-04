/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.base;

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

import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;
import com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoService;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicantDetailInfoPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicationPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraCurrentStagePersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraFeeSubmissionPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDatePersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDeviceInfoPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ncra applicant detail info remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncra.application.form.service.service.impl.NcraApplicantDetailInfoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncra.application.form.service.service.impl.NcraApplicantDetailInfoServiceImpl
 * @generated
 */
public abstract class NcraApplicantDetailInfoServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NcraApplicantDetailInfoService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcraApplicantDetailInfoService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcraApplicantDetailInfoService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncraApplicantDetailInfoService =
			(NcraApplicantDetailInfoService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcraApplicantDetailInfoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcraApplicantDetailInfo.class;
	}

	protected String getModelClassName() {
		return NcraApplicantDetailInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ncraApplicantDetailInfoPersistence.getDataSource();

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
	protected com.nbp.ncra.application.form.service.service.
		NcraApplicantDetailInfoLocalService ncraApplicantDetailInfoLocalService;

	protected NcraApplicantDetailInfoService ncraApplicantDetailInfoService;

	@Reference
	protected NcraApplicantDetailInfoPersistence
		ncraApplicantDetailInfoPersistence;

	@Reference
	protected NcraApplicationPersistence ncraApplicationPersistence;

	@Reference
	protected NcraCurrentStagePersistence ncraCurrentStagePersistence;

	@Reference
	protected NcraFeeSubmissionPersistence ncraFeeSubmissionPersistence;

	@Reference
	protected NcraVerifyWeighingDatePersistence
		ncraVerifyWeighingDatePersistence;

	@Reference
	protected NcraVerifyWeighingDeviceInfoPersistence
		ncraVerifyWeighingDeviceInfoPersistence;

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
		NcraApplicantDetailInfoServiceBaseImpl.class);

}