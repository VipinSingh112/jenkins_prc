/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.base;

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

import com.nbp.tourism.application.form.services.model.TourismNewAttractionSignInfo;
import com.nbp.tourism.application.form.services.service.TourismNewAttractionSignInfoService;
import com.nbp.tourism.application.form.services.service.persistence.TourismAnnualEntertainBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationCurrentStagePersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationPaymentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoAssesmentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoGenralInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionEmployeeInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundContractTransPaymentInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundPaymentInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransContractSignPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportatioCarRentalPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaOperatorInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportEmployeeInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismGroundTransBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoAssesmentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoGeneralFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAnnualEarningsPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionEmployeeInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewGroundSignaturePersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewGroundTransportationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewNumberOFEmploymentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismSummaryAddBoxPersistence;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the tourism new attraction sign info remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.tourism.application.form.services.service.impl.TourismNewAttractionSignInfoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.tourism.application.form.services.service.impl.TourismNewAttractionSignInfoServiceImpl
 * @generated
 */
public abstract class TourismNewAttractionSignInfoServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService,
			   TourismNewAttractionSignInfoService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>TourismNewAttractionSignInfoService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.tourism.application.form.services.service.TourismNewAttractionSignInfoServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			TourismNewAttractionSignInfoService.class,
			IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		tourismNewAttractionSignInfoService =
			(TourismNewAttractionSignInfoService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return TourismNewAttractionSignInfoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return TourismNewAttractionSignInfo.class;
	}

	protected String getModelClassName() {
		return TourismNewAttractionSignInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				tourismNewAttractionSignInfoPersistence.getDataSource();

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
	protected TourismAnnualEntertainBoxPersistence
		tourismAnnualEntertainBoxPersistence;

	@Reference
	protected TourismApplicationPersistence tourismApplicationPersistence;

	@Reference
	protected TourismApplicationCurrentStagePersistence
		tourismApplicationCurrentStagePersistence;

	@Reference
	protected TourismApplicationPaymentPersistence
		tourismApplicationPaymentPersistence;

	@Reference
	protected TourismBonaAccoAssesmentPersistence
		tourismBonaAccoAssesmentPersistence;

	@Reference
	protected TourismBonaAccoGenralInfoPersistence
		tourismBonaAccoGenralInfoPersistence;

	@Reference
	protected TourismBonaAccommodationFormPersistence
		tourismBonaAccommodationFormPersistence;

	@Reference
	protected TourismBonaAccommodationFormAddressPersistence
		tourismBonaAccommodationFormAddressPersistence;

	@Reference
	protected TourismBonaAccoSignInfoPersistence
		tourismBonaAccoSignInfoPersistence;

	@Reference
	protected TourismBonaAttractionEmployeeInfoPersistence
		tourismBonaAttractionEmployeeInfoPersistence;

	@Reference
	protected TourismBonaAttractionFormFirstPersistence
		tourismBonaAttractionFormFirstPersistence;

	@Reference
	protected TourismBonaAttractionFormFirstAddressPersistence
		tourismBonaAttractionFormFirstAddressPersistence;

	@Reference
	protected TourismBonaAttractionFormSecondPersistence
		tourismBonaAttractionFormSecondPersistence;

	@Reference
	protected TourismBonaAttractionSignInfoPersistence
		tourismBonaAttractionSignInfoPersistence;

	@Reference
	protected TourismBonaGroundContractTransPaymentInfoPersistence
		tourismBonaGroundContractTransPaymentInfoPersistence;

	@Reference
	protected TourismBonaGroundPaymentInfoPersistence
		tourismBonaGroundPaymentInfoPersistence;

	@Reference
	protected TourismBonaGroundSignInfoPersistence
		tourismBonaGroundSignInfoPersistence;

	@Reference
	protected TourismBonaGroundTransBoxPersistence
		tourismBonaGroundTransBoxPersistence;

	@Reference
	protected TourismBonaGroundTransContractSignPersistence
		tourismBonaGroundTransContractSignPersistence;

	@Reference
	protected TourismBonaGroundTransportatioCarRentalPersistence
		tourismBonaGroundTransportatioCarRentalPersistence;

	@Reference
	protected TourismBonaGroundTransportationPersistence
		tourismBonaGroundTransportationPersistence;

	@Reference
	protected TourismBonaGroundTransportationAddressPersistence
		tourismBonaGroundTransportationAddressPersistence;

	@Reference
	protected TourismBonaOperatorInfoPersistence
		tourismBonaOperatorInfoPersistence;

	@Reference
	protected TourismBonaWaterSportEmployeeInfoPersistence
		tourismBonaWaterSportEmployeeInfoPersistence;

	@Reference
	protected TourismBonaWaterSportsFormFirstPersistence
		tourismBonaWaterSportsFormFirstPersistence;

	@Reference
	protected TourismBonaWaterSportsFormFirstAddressPersistence
		tourismBonaWaterSportsFormFirstAddressPersistence;

	@Reference
	protected TourismBonaWaterSportsFormSecondPersistence
		tourismBonaWaterSportsFormSecondPersistence;

	@Reference
	protected TourismBonaWaterSportSignInfoPersistence
		tourismBonaWaterSportSignInfoPersistence;

	@Reference
	protected TourismGroundTransBoxPersistence tourismGroundTransBoxPersistence;

	@Reference
	protected TourismNewAccoAssesmentPersistence
		tourismNewAccoAssesmentPersistence;

	@Reference
	protected TourismNewAccoGeneralFormPersistence
		tourismNewAccoGeneralFormPersistence;

	@Reference
	protected TourismNewAccommodationAddressPersistence
		tourismNewAccommodationAddressPersistence;

	@Reference
	protected TourismNewAccommodationFormPersistence
		tourismNewAccommodationFormPersistence;

	@Reference
	protected TourismNewAccoSignInfoPersistence
		tourismNewAccoSignInfoPersistence;

	@Reference
	protected TourismNewAnnualEarningsPersistence
		tourismNewAnnualEarningsPersistence;

	@Reference
	protected TourismNewAttractionEmployeeInfoPersistence
		tourismNewAttractionEmployeeInfoPersistence;

	@Reference
	protected TourismNewAttractionFormFirstPersistence
		tourismNewAttractionFormFirstPersistence;

	@Reference
	protected TourismNewAttractionFormFirstAddressPersistence
		tourismNewAttractionFormFirstAddressPersistence;

	@Reference
	protected TourismNewAttractionFormSecondPersistence
		tourismNewAttractionFormSecondPersistence;

	@Reference
	protected com.nbp.tourism.application.form.services.service.
		TourismNewAttractionSignInfoLocalService
			tourismNewAttractionSignInfoLocalService;

	protected TourismNewAttractionSignInfoService
		tourismNewAttractionSignInfoService;

	@Reference
	protected TourismNewAttractionSignInfoPersistence
		tourismNewAttractionSignInfoPersistence;

	@Reference
	protected TourismNewGroundSignaturePersistence
		tourismNewGroundSignaturePersistence;

	@Reference
	protected TourismNewGroundTransportationPersistence
		tourismNewGroundTransportationPersistence;

	@Reference
	protected TourismNewNumberOFEmploymentPersistence
		tourismNewNumberOFEmploymentPersistence;

	@Reference
	protected TourismSummaryAddBoxPersistence tourismSummaryAddBoxPersistence;

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
		TourismNewAttractionSignInfoServiceBaseImpl.class);

}