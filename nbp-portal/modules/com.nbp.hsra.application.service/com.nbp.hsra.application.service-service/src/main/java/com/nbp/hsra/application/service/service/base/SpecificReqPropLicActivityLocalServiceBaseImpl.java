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

import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;
import com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalService;
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
 * Provides the base implementation for the specific req prop lic activity local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.hsra.application.service.service.impl.SpecificReqPropLicActivityLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.hsra.application.service.service.impl.SpecificReqPropLicActivityLocalServiceImpl
 * @generated
 */
public abstract class SpecificReqPropLicActivityLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   SpecificReqPropLicActivityLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>SpecificReqPropLicActivityLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalServiceUtil</code>.
	 */

	/**
	 * Adds the specific req prop lic activity to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SpecificReqPropLicActivity addSpecificReqPropLicActivity(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		specificReqPropLicActivity.setNew(true);

		return specificReqPropLicActivityPersistence.update(
			specificReqPropLicActivity);
	}

	/**
	 * Creates a new specific req prop lic activity with the primary key. Does not add the specific req prop lic activity to the database.
	 *
	 * @param specificReqPropLicActivityId the primary key for the new specific req prop lic activity
	 * @return the new specific req prop lic activity
	 */
	@Override
	@Transactional(enabled = false)
	public SpecificReqPropLicActivity createSpecificReqPropLicActivity(
		long specificReqPropLicActivityId) {

		return specificReqPropLicActivityPersistence.create(
			specificReqPropLicActivityId);
	}

	/**
	 * Deletes the specific req prop lic activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 * @throws PortalException if a specific req prop lic activity with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SpecificReqPropLicActivity deleteSpecificReqPropLicActivity(
			long specificReqPropLicActivityId)
		throws PortalException {

		return specificReqPropLicActivityPersistence.remove(
			specificReqPropLicActivityId);
	}

	/**
	 * Deletes the specific req prop lic activity from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public SpecificReqPropLicActivity deleteSpecificReqPropLicActivity(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return specificReqPropLicActivityPersistence.remove(
			specificReqPropLicActivity);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return specificReqPropLicActivityPersistence.dslQuery(dslQuery);
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
			SpecificReqPropLicActivity.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return specificReqPropLicActivityPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
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

		return specificReqPropLicActivityPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
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

		return specificReqPropLicActivityPersistence.findWithDynamicQuery(
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
		return specificReqPropLicActivityPersistence.countWithDynamicQuery(
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

		return specificReqPropLicActivityPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public SpecificReqPropLicActivity fetchSpecificReqPropLicActivity(
		long specificReqPropLicActivityId) {

		return specificReqPropLicActivityPersistence.fetchByPrimaryKey(
			specificReqPropLicActivityId);
	}

	/**
	 * Returns the specific req prop lic activity with the primary key.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity
	 * @throws PortalException if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public SpecificReqPropLicActivity getSpecificReqPropLicActivity(
			long specificReqPropLicActivityId)
		throws PortalException {

		return specificReqPropLicActivityPersistence.findByPrimaryKey(
			specificReqPropLicActivityId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			specificReqPropLicActivityLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SpecificReqPropLicActivity.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"specificReqPropLicActivityId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			specificReqPropLicActivityLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			SpecificReqPropLicActivity.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"specificReqPropLicActivityId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			specificReqPropLicActivityLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(SpecificReqPropLicActivity.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"specificReqPropLicActivityId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return specificReqPropLicActivityPersistence.create(
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
				"Implement SpecificReqPropLicActivityLocalServiceImpl#deleteSpecificReqPropLicActivity(SpecificReqPropLicActivity) to avoid orphaned data");
		}

		return specificReqPropLicActivityLocalService.
			deleteSpecificReqPropLicActivity(
				(SpecificReqPropLicActivity)persistedModel);
	}

	@Override
	public BasePersistence<SpecificReqPropLicActivity> getBasePersistence() {
		return specificReqPropLicActivityPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return specificReqPropLicActivityPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @return the range of specific req prop lic activities
	 */
	@Override
	public List<SpecificReqPropLicActivity> getSpecificReqPropLicActivities(
		int start, int end) {

		return specificReqPropLicActivityPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of specific req prop lic activities.
	 *
	 * @return the number of specific req prop lic activities
	 */
	@Override
	public int getSpecificReqPropLicActivitiesCount() {
		return specificReqPropLicActivityPersistence.countAll();
	}

	/**
	 * Updates the specific req prop lic activity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public SpecificReqPropLicActivity updateSpecificReqPropLicActivity(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return specificReqPropLicActivityPersistence.update(
			specificReqPropLicActivity);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			SpecificReqPropLicActivityLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		specificReqPropLicActivityLocalService =
			(SpecificReqPropLicActivityLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return SpecificReqPropLicActivityLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return SpecificReqPropLicActivity.class;
	}

	protected String getModelClassName() {
		return SpecificReqPropLicActivity.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				specificReqPropLicActivityPersistence.getDataSource();

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

	protected SpecificReqPropLicActivityLocalService
		specificReqPropLicActivityLocalService;

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
		SpecificReqPropLicActivityLocalServiceBaseImpl.class);

}