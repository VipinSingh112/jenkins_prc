/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.base;

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

import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;
import com.nbp.ncbj.application.form.service.service.NcbjCurrentStageLocalService;
import com.nbp.ncbj.application.form.service.service.persistence.NCBJCompanyNewPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAddLocMultiSitePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAppPaymentPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicantDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailGenPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCurrentStagePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumOfEmpAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumberEffectiveAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrgDetailInfoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrganizationDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjPremisesLocationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjProductServiceDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionFourPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOneAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOnePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionThreePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionTwoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSpecificActivitiesPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ncbj current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncbj.application.form.service.service.impl.NcbjCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncbj.application.form.service.service.impl.NcbjCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class NcbjCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NcbjCurrentStageLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcbjCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncbj.application.form.service.service.NcbjCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ncbj current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjCurrentStage addNcbjCurrentStage(
		NcbjCurrentStage ncbjCurrentStage) {

		ncbjCurrentStage.setNew(true);

		return ncbjCurrentStagePersistence.update(ncbjCurrentStage);
	}

	/**
	 * Creates a new ncbj current stage with the primary key. Does not add the ncbj current stage to the database.
	 *
	 * @param ncbjCurrentStageId the primary key for the new ncbj current stage
	 * @return the new ncbj current stage
	 */
	@Override
	@Transactional(enabled = false)
	public NcbjCurrentStage createNcbjCurrentStage(long ncbjCurrentStageId) {
		return ncbjCurrentStagePersistence.create(ncbjCurrentStageId);
	}

	/**
	 * Deletes the ncbj current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage that was removed
	 * @throws PortalException if a ncbj current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjCurrentStage deleteNcbjCurrentStage(long ncbjCurrentStageId)
		throws PortalException {

		return ncbjCurrentStagePersistence.remove(ncbjCurrentStageId);
	}

	/**
	 * Deletes the ncbj current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjCurrentStage deleteNcbjCurrentStage(
		NcbjCurrentStage ncbjCurrentStage) {

		return ncbjCurrentStagePersistence.remove(ncbjCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ncbjCurrentStagePersistence.dslQuery(dslQuery);
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
			NcbjCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ncbjCurrentStagePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
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

		return ncbjCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
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

		return ncbjCurrentStagePersistence.findWithDynamicQuery(
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
		return ncbjCurrentStagePersistence.countWithDynamicQuery(dynamicQuery);
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

		return ncbjCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public NcbjCurrentStage fetchNcbjCurrentStage(long ncbjCurrentStageId) {
		return ncbjCurrentStagePersistence.fetchByPrimaryKey(
			ncbjCurrentStageId);
	}

	/**
	 * Returns the ncbj current stage matching the UUID and group.
	 *
	 * @param uuid the ncbj current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage fetchNcbjCurrentStageByUuidAndGroupId(
		String uuid, long groupId) {

		return ncbjCurrentStagePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj current stage with the primary key.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage
	 * @throws PortalException if a ncbj current stage with the primary key could not be found
	 */
	@Override
	public NcbjCurrentStage getNcbjCurrentStage(long ncbjCurrentStageId)
		throws PortalException {

		return ncbjCurrentStagePersistence.findByPrimaryKey(ncbjCurrentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			ncbjCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ncbjCurrentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ncbjCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(NcbjCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjCurrentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			ncbjCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ncbjCurrentStageId");
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
			new ActionableDynamicQuery.PerformActionMethod<NcbjCurrentStage>() {

				@Override
				public void performAction(NcbjCurrentStage ncbjCurrentStage)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, ncbjCurrentStage);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(NcbjCurrentStage.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjCurrentStagePersistence.create(
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
				"Implement NcbjCurrentStageLocalServiceImpl#deleteNcbjCurrentStage(NcbjCurrentStage) to avoid orphaned data");
		}

		return ncbjCurrentStageLocalService.deleteNcbjCurrentStage(
			(NcbjCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<NcbjCurrentStage> getBasePersistence() {
		return ncbjCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjCurrentStagePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the ncbj current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj current stages
	 * @param companyId the primary key of the company
	 * @return the matching ncbj current stages, or an empty list if no matches were found
	 */
	@Override
	public List<NcbjCurrentStage> getNcbjCurrentStagesByUuidAndCompanyId(
		String uuid, long companyId) {

		return ncbjCurrentStagePersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of ncbj current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj current stages, or an empty list if no matches were found
	 */
	@Override
	public List<NcbjCurrentStage> getNcbjCurrentStagesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return ncbjCurrentStagePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the ncbj current stage matching the UUID and group.
	 *
	 * @param uuid the ncbj current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj current stage
	 * @throws PortalException if a matching ncbj current stage could not be found
	 */
	@Override
	public NcbjCurrentStage getNcbjCurrentStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return ncbjCurrentStagePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of ncbj current stages
	 */
	@Override
	public List<NcbjCurrentStage> getNcbjCurrentStages(int start, int end) {
		return ncbjCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ncbj current stages.
	 *
	 * @return the number of ncbj current stages
	 */
	@Override
	public int getNcbjCurrentStagesCount() {
		return ncbjCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the ncbj current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 * @return the ncbj current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjCurrentStage updateNcbjCurrentStage(
		NcbjCurrentStage ncbjCurrentStage) {

		return ncbjCurrentStagePersistence.update(ncbjCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcbjCurrentStageLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncbjCurrentStageLocalService = (NcbjCurrentStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcbjCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcbjCurrentStage.class;
	}

	protected String getModelClassName() {
		return NcbjCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ncbjCurrentStagePersistence.getDataSource();

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
	protected NcbjAddLocMultiSitePersistence ncbjAddLocMultiSitePersistence;

	@Reference
	protected NcbjApplicantDetailPersistence ncbjApplicantDetailPersistence;

	@Reference
	protected NcbjApplicationPersistence ncbjApplicationPersistence;

	@Reference
	protected NcbjAppPaymentPersistence ncbjAppPaymentPersistence;

	@Reference
	protected NcbjBusinessDetailPersistence ncbjBusinessDetailPersistence;

	@Reference
	protected NcbjBusinessDetailAddPersistence ncbjBusinessDetailAddPersistence;

	@Reference
	protected NcbjCompanyDetailPersistence ncbjCompanyDetailPersistence;

	@Reference
	protected NcbjCompanyDetailAddPersistence ncbjCompanyDetailAddPersistence;

	@Reference
	protected NcbjCompanyDetailGenPersistence ncbjCompanyDetailGenPersistence;

	@Reference
	protected NCBJCompanyNewPersistence ncbjCompanyNewPersistence;

	protected NcbjCurrentStageLocalService ncbjCurrentStageLocalService;

	@Reference
	protected NcbjCurrentStagePersistence ncbjCurrentStagePersistence;

	@Reference
	protected NcbjNumberEffectiveAddPersistence
		ncbjNumberEffectiveAddPersistence;

	@Reference
	protected NcbjNumOfEmpAddPersistence ncbjNumOfEmpAddPersistence;

	@Reference
	protected NcbjOrganizationDetailPersistence
		ncbjOrganizationDetailPersistence;

	@Reference
	protected NcbjOrgDetailInfoPersistence ncbjOrgDetailInfoPersistence;

	@Reference
	protected NcbjPremisesLocationPersistence ncbjPremisesLocationPersistence;

	@Reference
	protected NcbjProductServiceDetailPersistence
		ncbjProductServiceDetailPersistence;

	@Reference
	protected NcbjSectionDetailAddPersistence ncbjSectionDetailAddPersistence;

	@Reference
	protected NcbjSectionFourPersistence ncbjSectionFourPersistence;

	@Reference
	protected NcbjSectionOnePersistence ncbjSectionOnePersistence;

	@Reference
	protected NcbjSectionOneAddPersistence ncbjSectionOneAddPersistence;

	@Reference
	protected NcbjSectionThreePersistence ncbjSectionThreePersistence;

	@Reference
	protected NcbjSectionTwoPersistence ncbjSectionTwoPersistence;

	@Reference
	protected NcbjSpecificActivitiesPersistence
		ncbjSpecificActivitiesPersistence;

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
		NcbjCurrentStageLocalServiceBaseImpl.class);

}