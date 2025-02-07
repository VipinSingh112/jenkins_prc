/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.base;

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

import com.nbp.creative.application.form.service.model.CreativeApplicationCurrentStage;
import com.nbp.creative.application.form.service.service.CreativeApplicationCurrentStageService;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationCurrentStagePersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyApplicantInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeContactInfoAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeDirectorListinAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeSocialMediaAddBoxPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the creative application current stage remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.creative.application.form.service.service.impl.CreativeApplicationCurrentStageServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.creative.application.form.service.service.impl.CreativeApplicationCurrentStageServiceImpl
 * @generated
 */
public abstract class CreativeApplicationCurrentStageServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, CreativeApplicationCurrentStageService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CreativeApplicationCurrentStageService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.creative.application.form.service.service.CreativeApplicationCurrentStageServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CreativeApplicationCurrentStageService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		creativeApplicationCurrentStageService =
			(CreativeApplicationCurrentStageService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CreativeApplicationCurrentStageService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CreativeApplicationCurrentStage.class;
	}

	protected String getModelClassName() {
		return CreativeApplicationCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				creativeApplicationCurrentStagePersistence.getDataSource();

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
	protected CreativeApplicationPersistence creativeApplicationPersistence;

	@Reference
	protected com.nbp.creative.application.form.service.service.
		CreativeApplicationCurrentStageLocalService
			creativeApplicationCurrentStageLocalService;

	protected CreativeApplicationCurrentStageService
		creativeApplicationCurrentStageService;

	@Reference
	protected CreativeApplicationCurrentStagePersistence
		creativeApplicationCurrentStagePersistence;

	@Reference
	protected CreativeCompanyApplicantInformationPersistence
		creativeCompanyApplicantInformationPersistence;

	@Reference
	protected CreativeCompanyDetailsPersistence
		creativeCompanyDetailsPersistence;

	@Reference
	protected CreativeCompanyDetailsAddressPersistence
		creativeCompanyDetailsAddressPersistence;

	@Reference
	protected CreativeCompanyDirectorInformationPersistence
		creativeCompanyDirectorInformationPersistence;

	@Reference
	protected CreativeCompanyDirectorInformationAddressPersistence
		creativeCompanyDirectorInformationAddressPersistence;

	@Reference
	protected CreativeCompanyEconomicEffectPersistence
		creativeCompanyEconomicEffectPersistence;

	@Reference
	protected CreativeCompanyGeneralInformationPersistence
		creativeCompanyGeneralInformationPersistence;

	@Reference
	protected CreativeContactInfoAddBoxPersistence
		creativeContactInfoAddBoxPersistence;

	@Reference
	protected CreativeDirectorListinAddBoxPersistence
		creativeDirectorListinAddBoxPersistence;

	@Reference
	protected CreativeIndividualDetailsPersistence
		creativeIndividualDetailsPersistence;

	@Reference
	protected CreativeIndividualDetailsAddressPersistence
		creativeIndividualDetailsAddressPersistence;

	@Reference
	protected CreativeIndividualEconomicEffectPersistence
		creativeIndividualEconomicEffectPersistence;

	@Reference
	protected CreativeIndividualGeneralInformationPersistence
		creativeIndividualGeneralInformationPersistence;

	@Reference
	protected CreativeSocialMediaAddBoxPersistence
		creativeSocialMediaAddBoxPersistence;

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
		CreativeApplicationCurrentStageServiceBaseImpl.class);

}