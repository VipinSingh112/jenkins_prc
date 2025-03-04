/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
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
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeTwoLocalService;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalCurrentStagePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppliInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesComDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeTwoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesMaterHomePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseStaffPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesQNursePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesSignInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFaciltiesPaymentPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalNurseStaffPremisesPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the medical facilities home two local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeTwoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeTwoLocalServiceImpl
 * @generated
 */
public abstract class MedicalFacilitiesHomeTwoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MedicalFacilitiesHomeTwoLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MedicalFacilitiesHomeTwoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeTwoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the medical facilities home two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFacilitiesHomeTwo addMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		medicalFacilitiesHomeTwo.setNew(true);

		return medicalFacilitiesHomeTwoPersistence.update(
			medicalFacilitiesHomeTwo);
	}

	/**
	 * Creates a new medical facilities home two with the primary key. Does not add the medical facilities home two to the database.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key for the new medical facilities home two
	 * @return the new medical facilities home two
	 */
	@Override
	@Transactional(enabled = false)
	public MedicalFacilitiesHomeTwo createMedicalFacilitiesHomeTwo(
		long medicalFacilitiesHomeTwoId) {

		return medicalFacilitiesHomeTwoPersistence.create(
			medicalFacilitiesHomeTwoId);
	}

	/**
	 * Deletes the medical facilities home two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two that was removed
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId)
		throws PortalException {

		return medicalFacilitiesHomeTwoPersistence.remove(
			medicalFacilitiesHomeTwoId);
	}

	/**
	 * Deletes the medical facilities home two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return medicalFacilitiesHomeTwoPersistence.remove(
			medicalFacilitiesHomeTwo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return medicalFacilitiesHomeTwoPersistence.dslQuery(dslQuery);
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
			MedicalFacilitiesHomeTwo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return medicalFacilitiesHomeTwoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
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

		return medicalFacilitiesHomeTwoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
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

		return medicalFacilitiesHomeTwoPersistence.findWithDynamicQuery(
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
		return medicalFacilitiesHomeTwoPersistence.countWithDynamicQuery(
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

		return medicalFacilitiesHomeTwoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MedicalFacilitiesHomeTwo fetchMedicalFacilitiesHomeTwo(
		long medicalFacilitiesHomeTwoId) {

		return medicalFacilitiesHomeTwoPersistence.fetchByPrimaryKey(
			medicalFacilitiesHomeTwoId);
	}

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	@Override
	public MedicalFacilitiesHomeTwo
		fetchMedicalFacilitiesHomeTwoByUuidAndGroupId(
			String uuid, long groupId) {

		return medicalFacilitiesHomeTwoPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities home two with the primary key.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeTwo getMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId)
		throws PortalException {

		return medicalFacilitiesHomeTwoPersistence.findByPrimaryKey(
			medicalFacilitiesHomeTwoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesHomeTwoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFacilitiesHomeTwo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesHomeTwoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesHomeTwoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			MedicalFacilitiesHomeTwo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesHomeTwoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesHomeTwoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFacilitiesHomeTwo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesHomeTwoId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<MedicalFacilitiesHomeTwo>() {

				@Override
				public void performAction(
						MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, medicalFacilitiesHomeTwo);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					MedicalFacilitiesHomeTwo.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFacilitiesHomeTwoPersistence.create(
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
				"Implement MedicalFacilitiesHomeTwoLocalServiceImpl#deleteMedicalFacilitiesHomeTwo(MedicalFacilitiesHomeTwo) to avoid orphaned data");
		}

		return medicalFacilitiesHomeTwoLocalService.
			deleteMedicalFacilitiesHomeTwo(
				(MedicalFacilitiesHomeTwo)persistedModel);
	}

	@Override
	public BasePersistence<MedicalFacilitiesHomeTwo> getBasePersistence() {
		return medicalFacilitiesHomeTwoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFacilitiesHomeTwoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities home twos, or an empty list if no matches were found
	 */
	@Override
	public List<MedicalFacilitiesHomeTwo>
		getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			String uuid, long companyId) {

		return medicalFacilitiesHomeTwoPersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities home twos, or an empty list if no matches were found
	 */
	@Override
	public List<MedicalFacilitiesHomeTwo>
		getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesHomeTwo> orderByComparator) {

		return medicalFacilitiesHomeTwoPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two
	 * @throws PortalException if a matching medical facilities home two could not be found
	 */
	@Override
	public MedicalFacilitiesHomeTwo getMedicalFacilitiesHomeTwoByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return medicalFacilitiesHomeTwoPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities home twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of medical facilities home twos
	 */
	@Override
	public List<MedicalFacilitiesHomeTwo> getMedicalFacilitiesHomeTwos(
		int start, int end) {

		return medicalFacilitiesHomeTwoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of medical facilities home twos.
	 *
	 * @return the number of medical facilities home twos
	 */
	@Override
	public int getMedicalFacilitiesHomeTwosCount() {
		return medicalFacilitiesHomeTwoPersistence.countAll();
	}

	/**
	 * Updates the medical facilities home two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFacilitiesHomeTwo updateMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return medicalFacilitiesHomeTwoPersistence.update(
			medicalFacilitiesHomeTwo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MedicalFacilitiesHomeTwoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		medicalFacilitiesHomeTwoLocalService =
			(MedicalFacilitiesHomeTwoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MedicalFacilitiesHomeTwoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MedicalFacilitiesHomeTwo.class;
	}

	protected String getModelClassName() {
		return MedicalFacilitiesHomeTwo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				medicalFacilitiesHomeTwoPersistence.getDataSource();

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
	protected MedicalCurrentStagePersistence medicalCurrentStagePersistence;

	@Reference
	protected MedicalFacilitiesAppPersistence medicalFacilitiesAppPersistence;

	@Reference
	protected MedicalFacilitiesAppliInfoPersistence
		medicalFacilitiesAppliInfoPersistence;

	@Reference
	protected MedicalFacilitiesComDetailPersistence
		medicalFacilitiesComDetailPersistence;

	@Reference
	protected MedicalFacilitiesHomeInfoPersistence
		medicalFacilitiesHomeInfoPersistence;

	protected MedicalFacilitiesHomeTwoLocalService
		medicalFacilitiesHomeTwoLocalService;

	@Reference
	protected MedicalFacilitiesHomeTwoPersistence
		medicalFacilitiesHomeTwoPersistence;

	@Reference
	protected MedicalFacilitiesMaterHomePersistence
		medicalFacilitiesMaterHomePersistence;

	@Reference
	protected MedicalFacilitiesNurseDetailPersistence
		medicalFacilitiesNurseDetailPersistence;

	@Reference
	protected MedicalFacilitiesNurseStaffPersistence
		medicalFacilitiesNurseStaffPersistence;

	@Reference
	protected MedicalFacilitiesQNursePersistence
		medicalFacilitiesQNursePersistence;

	@Reference
	protected MedicalFacilitiesSignInfoPersistence
		medicalFacilitiesSignInfoPersistence;

	@Reference
	protected MedicalFaciltiesPaymentPersistence
		medicalFaciltiesPaymentPersistence;

	@Reference
	protected MedicalNurseStaffPremisesPersistence
		medicalNurseStaffPremisesPersistence;

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
		MedicalFacilitiesHomeTwoLocalServiceBaseImpl.class);

}