/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.base;

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

import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistAddService;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCApplicationPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServiceAddFormPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfServicePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCertificateOfVeracityPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCChecklistAddPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCChecklistPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCCurrentStagePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCInformationRequestPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCNoticeOfAppearancePersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCOathRequestPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the jadsc checklist add remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jadsc.application.form.service.service.impl.JADSCChecklistAddServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jadsc.application.form.service.service.impl.JADSCChecklistAddServiceImpl
 * @generated
 */
public abstract class JADSCChecklistAddServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, JADSCChecklistAddService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JADSCChecklistAddService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jadsc.application.form.service.service.JADSCChecklistAddServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JADSCChecklistAddService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		jadscChecklistAddService = (JADSCChecklistAddService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JADSCChecklistAddService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JADSCChecklistAdd.class;
	}

	protected String getModelClassName() {
		return JADSCChecklistAdd.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				jadscChecklistAddPersistence.getDataSource();

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
	protected JADSCApplicationPersistence jadscApplicationPersistence;

	@Reference
	protected JADSCCertificateOfServicePersistence
		jadscCertificateOfServicePersistence;

	@Reference
	protected JADSCCertificateOfServiceAddFormPersistence
		jadscCertificateOfServiceAddFormPersistence;

	@Reference
	protected JADSCCertificateOfVeracityPersistence
		jadscCertificateOfVeracityPersistence;

	@Reference
	protected JADSCChecklistPersistence jadscChecklistPersistence;

	@Reference
	protected
		com.nbp.jadsc.application.form.service.service.
			JADSCChecklistAddLocalService jadscChecklistAddLocalService;

	protected JADSCChecklistAddService jadscChecklistAddService;

	@Reference
	protected JADSCChecklistAddPersistence jadscChecklistAddPersistence;

	@Reference
	protected JADSCCurrentStagePersistence jadscCurrentStagePersistence;

	@Reference
	protected JADSCInformationRequestPersistence
		jadscInformationRequestPersistence;

	@Reference
	protected JADSCNoticeOfAppearancePersistence
		jadscNoticeOfAppearancePersistence;

	@Reference
	protected JADSCOathRequestPersistence jadscOathRequestPersistence;

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
		JADSCChecklistAddServiceBaseImpl.class);

}