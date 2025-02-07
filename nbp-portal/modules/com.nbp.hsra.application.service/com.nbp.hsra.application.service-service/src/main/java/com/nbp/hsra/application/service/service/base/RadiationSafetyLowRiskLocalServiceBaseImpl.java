/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;
import com.nbp.hsra.application.service.service.RadiationSafetyLowRiskLocalService;
import com.nbp.hsra.application.service.service.persistence.AddApplicantPractitionerPersistence;
import com.nbp.hsra.application.service.service.persistence.AddMedicalPractitionerPersistence;
import com.nbp.hsra.application.service.service.persistence.AlternateRsoAddPersistence;
import com.nbp.hsra.application.service.service.persistence.AlternateRsoOneAddPersistence;
import com.nbp.hsra.application.service.service.persistence.BrokerDeclarationInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.BrokerRegistrationInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.DetailOfApplicantSecTwoPersistence;
import com.nbp.hsra.application.service.service.persistence.DetailOfBusinessSecThreePersistence;
import com.nbp.hsra.application.service.service.persistence.DetailOfSourcesPersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropBusinessInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropDeclareApplicantPersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropFinancialProfilePersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropPersonalDetailInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.GenEquipmentDataPersistence;
import com.nbp.hsra.application.service.service.persistence.GenerateEquipmentInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationCurrentStagePersistence;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationPaymentPersistence;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationPersistence;
import com.nbp.hsra.application.service.service.persistence.MedicalPractitionerAddPersistence;
import com.nbp.hsra.application.service.service.persistence.NotifiLegalInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.PurposeOfPropLicencePersistence;
import com.nbp.hsra.application.service.service.persistence.QualifedExpertAddPersistence;
import com.nbp.hsra.application.service.service.persistence.QualifedExpertOneAddPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityApplicantDetailPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityDeclarationInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityEmploymentInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.QualityProficiencyDetailPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationDeclarationPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationDevicesAddPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationDevicesDetailAddPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationProtectionSecOnePersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationSafetyLowRiskPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationSafetyProgramPersistence;
import com.nbp.hsra.application.service.service.persistence.RadionuclideAddPersistence;
import com.nbp.hsra.application.service.service.persistence.RadionuclideInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.SealedSourcesAddPersistence;
import com.nbp.hsra.application.service.service.persistence.SourcesDetailAddPersistence;
import com.nbp.hsra.application.service.service.persistence.SpecificReqPropLicActivityPersistence;
import com.nbp.hsra.application.service.service.persistence.UnsealedSourceAddPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the radiation safety low risk local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.hsra.application.service.service.impl.RadiationSafetyLowRiskLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.hsra.application.service.service.impl.RadiationSafetyLowRiskLocalServiceImpl
 * @generated
 */
public abstract class RadiationSafetyLowRiskLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   RadiationSafetyLowRiskLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>RadiationSafetyLowRiskLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.hsra.application.service.service.RadiationSafetyLowRiskLocalServiceUtil</code>.
	 */

	/**
	 * Adds the radiation safety low risk to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RadiationSafetyLowRisk addRadiationSafetyLowRisk(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		radiationSafetyLowRisk.setNew(true);

		return radiationSafetyLowRiskPersistence.update(radiationSafetyLowRisk);
	}

	/**
	 * Creates a new radiation safety low risk with the primary key. Does not add the radiation safety low risk to the database.
	 *
	 * @param radiationSafetyLowRiskId the primary key for the new radiation safety low risk
	 * @return the new radiation safety low risk
	 */
	@Override
	@Transactional(enabled = false)
	public RadiationSafetyLowRisk createRadiationSafetyLowRisk(
		long radiationSafetyLowRiskId) {

		return radiationSafetyLowRiskPersistence.create(
			radiationSafetyLowRiskId);
	}

	/**
	 * Deletes the radiation safety low risk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 * @throws PortalException if a radiation safety low risk with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RadiationSafetyLowRisk deleteRadiationSafetyLowRisk(
			long radiationSafetyLowRiskId)
		throws PortalException {

		return radiationSafetyLowRiskPersistence.remove(
			radiationSafetyLowRiskId);
	}

	/**
	 * Deletes the radiation safety low risk from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public RadiationSafetyLowRisk deleteRadiationSafetyLowRisk(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return radiationSafetyLowRiskPersistence.remove(radiationSafetyLowRisk);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return radiationSafetyLowRiskPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			RadiationSafetyLowRisk.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return radiationSafetyLowRiskPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return radiationSafetyLowRiskPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return radiationSafetyLowRiskPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return radiationSafetyLowRiskPersistence.countWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return radiationSafetyLowRiskPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public RadiationSafetyLowRisk fetchRadiationSafetyLowRisk(
		long radiationSafetyLowRiskId) {

		return radiationSafetyLowRiskPersistence.fetchByPrimaryKey(
			radiationSafetyLowRiskId);
	}

	/**
	 * Returns the radiation safety low risk with the primary key.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk
	 * @throws PortalException if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public RadiationSafetyLowRisk getRadiationSafetyLowRisk(
			long radiationSafetyLowRiskId)
		throws PortalException {

		return radiationSafetyLowRiskPersistence.findByPrimaryKey(
			radiationSafetyLowRiskId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			radiationSafetyLowRiskLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(RadiationSafetyLowRisk.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"radiationSafetyLowRiskId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			radiationSafetyLowRiskLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			RadiationSafetyLowRisk.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"radiationSafetyLowRiskId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			radiationSafetyLowRiskLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(RadiationSafetyLowRisk.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"radiationSafetyLowRiskId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return radiationSafetyLowRiskPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement RadiationSafetyLowRiskLocalServiceImpl#deleteRadiationSafetyLowRisk(RadiationSafetyLowRisk) to avoid orphaned data");
		}

		return radiationSafetyLowRiskLocalService.deleteRadiationSafetyLowRisk(
			(RadiationSafetyLowRisk)persistedModel);
	}

	@Override
	public BasePersistence<RadiationSafetyLowRisk> getBasePersistence() {
		return radiationSafetyLowRiskPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return radiationSafetyLowRiskPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @return the range of radiation safety low risks
	 */
	@Override
	public List<RadiationSafetyLowRisk> getRadiationSafetyLowRisks(
		int start, int end) {

		return radiationSafetyLowRiskPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of radiation safety low risks.
	 *
	 * @return the number of radiation safety low risks
	 */
	@Override
	public int getRadiationSafetyLowRisksCount() {
		return radiationSafetyLowRiskPersistence.countAll();
	}

	/**
	 * Updates the radiation safety low risk in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RadiationSafetyLowRiskLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 * @return the radiation safety low risk that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public RadiationSafetyLowRisk updateRadiationSafetyLowRisk(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		return radiationSafetyLowRiskPersistence.update(radiationSafetyLowRisk);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			RadiationSafetyLowRiskLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		radiationSafetyLowRiskLocalService =
			(RadiationSafetyLowRiskLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return RadiationSafetyLowRiskLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return RadiationSafetyLowRisk.class;
	}

	protected String getModelClassName() {
		return RadiationSafetyLowRisk.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				radiationSafetyLowRiskPersistence.getDataSource();

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
	protected AddApplicantPractitionerPersistence
		addApplicantPractitionerPersistence;

	@Reference
	protected AddMedicalPractitionerPersistence
		addMedicalPractitionerPersistence;

	@Reference
	protected AlternateRsoAddPersistence alternateRsoAddPersistence;

	@Reference
	protected AlternateRsoOneAddPersistence alternateRsoOneAddPersistence;

	@Reference
	protected BrokerDeclarationInfoPersistence brokerDeclarationInfoPersistence;

	@Reference
	protected BrokerRegistrationInfoPersistence
		brokerRegistrationInfoPersistence;

	@Reference
	protected DetailOfApplicantSecTwoPersistence
		detailOfApplicantSecTwoPersistence;

	@Reference
	protected DetailOfBusinessSecThreePersistence
		detailOfBusinessSecThreePersistence;

	@Reference
	protected DetailOfSourcesPersistence detailOfSourcesPersistence;

	@Reference
	protected FitPropBusinessInfoPersistence fitPropBusinessInfoPersistence;

	@Reference
	protected FitPropDeclareApplicantPersistence
		fitPropDeclareApplicantPersistence;

	@Reference
	protected FitPropFinancialProfilePersistence
		fitPropFinancialProfilePersistence;

	@Reference
	protected FitPropPersonalDetailInfoPersistence
		fitPropPersonalDetailInfoPersistence;

	@Reference
	protected GenEquipmentDataPersistence genEquipmentDataPersistence;

	@Reference
	protected GenerateEquipmentInfoPersistence generateEquipmentInfoPersistence;

	@Reference
	protected HsraApplicationPersistence hsraApplicationPersistence;

	@Reference
	protected HsraApplicationCurrentStagePersistence
		hsraApplicationCurrentStagePersistence;

	@Reference
	protected HsraApplicationPaymentPersistence
		hsraApplicationPaymentPersistence;

	@Reference
	protected MedicalPractitionerAddPersistence
		medicalPractitionerAddPersistence;

	@Reference
	protected NotifiLegalInfoPersistence notifiLegalInfoPersistence;

	@Reference
	protected PurposeOfPropLicencePersistence purposeOfPropLicencePersistence;

	@Reference
	protected QualifedExpertAddPersistence qualifedExpertAddPersistence;

	@Reference
	protected QualifedExpertOneAddPersistence qualifedExpertOneAddPersistence;

	@Reference
	protected QualityApplicantDetailPersistence
		qualityApplicantDetailPersistence;

	@Reference
	protected QualityDeclarationInfoPersistence
		qualityDeclarationInfoPersistence;

	@Reference
	protected QualityEmploymentInfoPersistence qualityEmploymentInfoPersistence;

	@Reference
	protected QualityProficiencyDetailPersistence
		qualityProficiencyDetailPersistence;

	@Reference
	protected RadiationDeclarationPersistence radiationDeclarationPersistence;

	@Reference
	protected RadiationDevicesAddPersistence radiationDevicesAddPersistence;

	@Reference
	protected RadiationDevicesDetailAddPersistence
		radiationDevicesDetailAddPersistence;

	@Reference
	protected RadiationProtectionSecOnePersistence
		radiationProtectionSecOnePersistence;

	protected RadiationSafetyLowRiskLocalService
		radiationSafetyLowRiskLocalService;

	@Reference
	protected RadiationSafetyLowRiskPersistence
		radiationSafetyLowRiskPersistence;

	@Reference
	protected RadiationSafetyProgramPersistence
		radiationSafetyProgramPersistence;

	@Reference
	protected RadionuclideAddPersistence radionuclideAddPersistence;

	@Reference
	protected RadionuclideInfoPersistence radionuclideInfoPersistence;

	@Reference
	protected SealedSourcesAddPersistence sealedSourcesAddPersistence;

	@Reference
	protected SourcesDetailAddPersistence sourcesDetailAddPersistence;

	@Reference
	protected SpecificReqPropLicActivityPersistence
		specificReqPropLicActivityPersistence;

	@Reference
	protected UnsealedSourceAddPersistence unsealedSourceAddPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		RadiationSafetyLowRiskLocalServiceBaseImpl.class);

}