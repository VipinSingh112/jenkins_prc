/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.base;

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

import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;
import com.nbp.ogt.application.form.services.service.OgtInsolventPersonDetailService;
import com.nbp.ogt.application.form.services.service.persistence.OGTAppCurrentStagePersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtApplicationPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimToPropertyPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimToSpousePersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimantDetailPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtInsolventPersonDetailPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtProofOfClaimPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtSectionBPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ogt insolvent person detail remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ogt.application.form.services.service.impl.OgtInsolventPersonDetailServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ogt.application.form.services.service.impl.OgtInsolventPersonDetailServiceImpl
 * @generated
 */
public abstract class OgtInsolventPersonDetailServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OgtInsolventPersonDetailService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OgtInsolventPersonDetailService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ogt.application.form.services.service.OgtInsolventPersonDetailServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OgtInsolventPersonDetailService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ogtInsolventPersonDetailService =
			(OgtInsolventPersonDetailService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OgtInsolventPersonDetailService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OgtInsolventPersonDetail.class;
	}

	protected String getModelClassName() {
		return OgtInsolventPersonDetail.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ogtInsolventPersonDetailPersistence.getDataSource();

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
	protected OGTAppCurrentStagePersistence ogtAppCurrentStagePersistence;

	@Reference
	protected OgtApplicationPersistence ogtApplicationPersistence;

	@Reference
	protected OgtClaimantDetailPersistence ogtClaimantDetailPersistence;

	@Reference
	protected OgtClaimToPropertyPersistence ogtClaimToPropertyPersistence;

	@Reference
	protected OgtClaimToSpousePersistence ogtClaimToSpousePersistence;

	@Reference
	protected com.nbp.ogt.application.form.services.service.
		OgtInsolventPersonDetailLocalService
			ogtInsolventPersonDetailLocalService;

	protected OgtInsolventPersonDetailService ogtInsolventPersonDetailService;

	@Reference
	protected OgtInsolventPersonDetailPersistence
		ogtInsolventPersonDetailPersistence;

	@Reference
	protected OgtProofOfClaimPersistence ogtProofOfClaimPersistence;

	@Reference
	protected OgtSectionBPersistence ogtSectionBPersistence;

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
		OgtInsolventPersonDetailServiceBaseImpl.class);

}