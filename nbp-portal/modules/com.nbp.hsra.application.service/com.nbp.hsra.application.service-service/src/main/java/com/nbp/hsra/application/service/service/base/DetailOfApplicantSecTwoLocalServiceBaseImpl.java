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

import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalService;
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
 * Provides the base implementation for the detail of applicant sec two local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.hsra.application.service.service.impl.DetailOfApplicantSecTwoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.hsra.application.service.service.impl.DetailOfApplicantSecTwoLocalServiceImpl
 * @generated
 */
public abstract class DetailOfApplicantSecTwoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, DetailOfApplicantSecTwoLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>DetailOfApplicantSecTwoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the detail of applicant sec two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 * @return the detail of applicant sec two that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DetailOfApplicantSecTwo addDetailOfApplicantSecTwo(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		detailOfApplicantSecTwo.setNew(true);

		return detailOfApplicantSecTwoPersistence.update(
			detailOfApplicantSecTwo);
	}

	/**
	 * Creates a new detail of applicant sec two with the primary key. Does not add the detail of applicant sec two to the database.
	 *
	 * @param detailOfAppliSecTwoId the primary key for the new detail of applicant sec two
	 * @return the new detail of applicant sec two
	 */
	@Override
	@Transactional(enabled = false)
	public DetailOfApplicantSecTwo createDetailOfApplicantSecTwo(
		long detailOfAppliSecTwoId) {

		return detailOfApplicantSecTwoPersistence.create(detailOfAppliSecTwoId);
	}

	/**
	 * Deletes the detail of applicant sec two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 * @throws PortalException if a detail of applicant sec two with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DetailOfApplicantSecTwo deleteDetailOfApplicantSecTwo(
			long detailOfAppliSecTwoId)
		throws PortalException {

		return detailOfApplicantSecTwoPersistence.remove(detailOfAppliSecTwoId);
	}

	/**
	 * Deletes the detail of applicant sec two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 * @return the detail of applicant sec two that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DetailOfApplicantSecTwo deleteDetailOfApplicantSecTwo(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return detailOfApplicantSecTwoPersistence.remove(
			detailOfApplicantSecTwo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return detailOfApplicantSecTwoPersistence.dslQuery(dslQuery);
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
			DetailOfApplicantSecTwo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return detailOfApplicantSecTwoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl</code>.
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

		return detailOfApplicantSecTwoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl</code>.
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

		return detailOfApplicantSecTwoPersistence.findWithDynamicQuery(
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
		return detailOfApplicantSecTwoPersistence.countWithDynamicQuery(
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

		return detailOfApplicantSecTwoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public DetailOfApplicantSecTwo fetchDetailOfApplicantSecTwo(
		long detailOfAppliSecTwoId) {

		return detailOfApplicantSecTwoPersistence.fetchByPrimaryKey(
			detailOfAppliSecTwoId);
	}

	/**
	 * Returns the detail of applicant sec two with the primary key.
	 *
	 * @param detailOfAppliSecTwoId the primary key of the detail of applicant sec two
	 * @return the detail of applicant sec two
	 * @throws PortalException if a detail of applicant sec two with the primary key could not be found
	 */
	@Override
	public DetailOfApplicantSecTwo getDetailOfApplicantSecTwo(
			long detailOfAppliSecTwoId)
		throws PortalException {

		return detailOfApplicantSecTwoPersistence.findByPrimaryKey(
			detailOfAppliSecTwoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			detailOfApplicantSecTwoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DetailOfApplicantSecTwo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"detailOfAppliSecTwoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			detailOfApplicantSecTwoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			DetailOfApplicantSecTwo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"detailOfAppliSecTwoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			detailOfApplicantSecTwoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DetailOfApplicantSecTwo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"detailOfAppliSecTwoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return detailOfApplicantSecTwoPersistence.create(
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
				"Implement DetailOfApplicantSecTwoLocalServiceImpl#deleteDetailOfApplicantSecTwo(DetailOfApplicantSecTwo) to avoid orphaned data");
		}

		return detailOfApplicantSecTwoLocalService.
			deleteDetailOfApplicantSecTwo(
				(DetailOfApplicantSecTwo)persistedModel);
	}

	@Override
	public BasePersistence<DetailOfApplicantSecTwo> getBasePersistence() {
		return detailOfApplicantSecTwoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return detailOfApplicantSecTwoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the detail of applicant sec twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.DetailOfApplicantSecTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicant sec twos
	 * @param end the upper bound of the range of detail of applicant sec twos (not inclusive)
	 * @return the range of detail of applicant sec twos
	 */
	@Override
	public List<DetailOfApplicantSecTwo> getDetailOfApplicantSecTwos(
		int start, int end) {

		return detailOfApplicantSecTwoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of detail of applicant sec twos.
	 *
	 * @return the number of detail of applicant sec twos
	 */
	@Override
	public int getDetailOfApplicantSecTwosCount() {
		return detailOfApplicantSecTwoPersistence.countAll();
	}

	/**
	 * Updates the detail of applicant sec two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantSecTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantSecTwo the detail of applicant sec two
	 * @return the detail of applicant sec two that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DetailOfApplicantSecTwo updateDetailOfApplicantSecTwo(
		DetailOfApplicantSecTwo detailOfApplicantSecTwo) {

		return detailOfApplicantSecTwoPersistence.update(
			detailOfApplicantSecTwo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			DetailOfApplicantSecTwoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		detailOfApplicantSecTwoLocalService =
			(DetailOfApplicantSecTwoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DetailOfApplicantSecTwoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DetailOfApplicantSecTwo.class;
	}

	protected String getModelClassName() {
		return DetailOfApplicantSecTwo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				detailOfApplicantSecTwoPersistence.getDataSource();

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

	protected DetailOfApplicantSecTwoLocalService
		detailOfApplicantSecTwoLocalService;

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
		DetailOfApplicantSecTwoLocalServiceBaseImpl.class);

}