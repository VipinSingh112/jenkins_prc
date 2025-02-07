/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.base;

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

import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicense;
import com.nbp.cannabis.application.form.services.service.CannabisOccupationaLicenseService;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyAddressPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyAuthorizedAgentPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCompanyInfoPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationCurrentStagePersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationIndividualAddressPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationIndividualInfoPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationPaymentPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationsPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentByPropertyOwnerPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentBySoleOwnerPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisDeclarationOfOwnershipPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisFeeMasterPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisOccupationaLicensePersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupplementalInformationPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisSupportingDocumentsMasterPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.GeneralDelarationsPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.StatementOfFinancialHistoryPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the cannabis occupationa license remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.cannabis.application.form.services.service.impl.CannabisOccupationaLicenseServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.cannabis.application.form.services.service.impl.CannabisOccupationaLicenseServiceImpl
 * @generated
 */
public abstract class CannabisOccupationaLicenseServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, CannabisOccupationaLicenseService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CannabisOccupationaLicenseService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.cannabis.application.form.services.service.CannabisOccupationaLicenseServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CannabisOccupationaLicenseService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		cannabisOccupationaLicenseService =
			(CannabisOccupationaLicenseService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CannabisOccupationaLicenseService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CannabisOccupationaLicense.class;
	}

	protected String getModelClassName() {
		return CannabisOccupationaLicense.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				cannabisOccupationaLicensePersistence.getDataSource();

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
	protected CannabisApplicationCompanyAddressPersistence
		cannabisApplicationCompanyAddressPersistence;

	@Reference
	protected CannabisApplicationCompanyAuthorizedAgentPersistence
		cannabisApplicationCompanyAuthorizedAgentPersistence;

	@Reference
	protected CannabisApplicationCompanyInfoPersistence
		cannabisApplicationCompanyInfoPersistence;

	@Reference
	protected CannabisApplicationCurrentStagePersistence
		cannabisApplicationCurrentStagePersistence;

	@Reference
	protected CannabisApplicationIndividualAddressPersistence
		cannabisApplicationIndividualAddressPersistence;

	@Reference
	protected CannabisApplicationIndividualInfoPersistence
		cannabisApplicationIndividualInfoPersistence;

	@Reference
	protected CannabisApplicationPaymentPersistence
		cannabisApplicationPaymentPersistence;

	@Reference
	protected CannabisApplicationsPersistence cannabisApplicationsPersistence;

	@Reference
	protected CannabisConsentByPropertyOwnerPersistence
		cannabisConsentByPropertyOwnerPersistence;

	@Reference
	protected CannabisConsentBySoleOwnerPersistence
		cannabisConsentBySoleOwnerPersistence;

	@Reference
	protected CannabisDeclarationOfOwnershipPersistence
		cannabisDeclarationOfOwnershipPersistence;

	@Reference
	protected CannabisFeeMasterPersistence cannabisFeeMasterPersistence;

	@Reference
	protected com.nbp.cannabis.application.form.services.service.
		CannabisOccupationaLicenseLocalService
			cannabisOccupationaLicenseLocalService;

	protected CannabisOccupationaLicenseService
		cannabisOccupationaLicenseService;

	@Reference
	protected CannabisOccupationaLicensePersistence
		cannabisOccupationaLicensePersistence;

	@Reference
	protected CannabisSupplementalInformationPersistence
		cannabisSupplementalInformationPersistence;

	@Reference
	protected CannabisSupportingDocumentsMasterPersistence
		cannabisSupportingDocumentsMasterPersistence;

	@Reference
	protected GeneralDelarationsPersistence generalDelarationsPersistence;

	@Reference
	protected StatementOfFinancialHistoryPersistence
		statementOfFinancialHistoryPersistence;

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
		CannabisOccupationaLicenseServiceBaseImpl.class);

}